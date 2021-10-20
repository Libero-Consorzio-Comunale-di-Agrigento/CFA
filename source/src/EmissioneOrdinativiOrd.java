// **********************************************
// Emissione Ordinativi Ord
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneOrdinativiOrd extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EMISSIORDINA_UNORDINATPER = 0;
  private static int GRP_EMISSIORDINA_ORDINATIVI = 1;
  private static int GRP_EMISSIORDINA_ACCERTAMENTI = 2;
  private static int GRP_EMISSIORDINA_CONTADITESOR = 3;

  private static int PFL_EMISSIORDINA_UNIMPELABESX = 0;
  private static int PFL_EMISSIORDINA_UNIMPELABEDX = 1;
  private static int PFL_EMISSIORDINA_UNORDINATPER = 2;
  private static int PFL_EMISSIORDINA_LIQUILABELSX = 3;
  private static int PFL_EMISSIORDINA_LIQUILABELDX = 4;
  private static int PFL_EMISSIORDINA_DESCRIGENERI = 5;
  private static int PFL_EMISSIORDINA_CAUSALE = 6;
  private static int PFL_EMISSIORDINA_UFFICIO = 7;
  private static int PFL_EMISSIORDINA_DATAEMISSION = 8;
  private static int PFL_EMISSIORDINA_ALLEGATI1 = 9;
  private static int PFL_EMISSIORDINA_INFOTESORIER = 10;
  private static int PFL_EMISSIORDINA_EMISSIAUTOMA = 11;
  private static int PFL_EMISSIORDINA_IMPUTAECONOM = 12;
  private static int PFL_EMISSIORDINA_EMISAUTOLABE = 13;
  private static int PFL_EMISSIORDINA_DEBITORE = 14;
  private static int PFL_EMISSIORDINA_CODICEDEBITO = 15;
  private static int PFL_EMISSIORDINA_APRSCEDEBLAB = 16;
  private static int PFL_EMISSIORDINA_CONTROPAPATR = 17;
  private static int PFL_EMISSIORDINA_FATTORDESCRI = 18;
  private static int PFL_EMISSIORDINA_DATULTELALAB = 19;
  private static int PFL_EMISSIORDINA_ELABORALABEL = 20;
  private static int PFL_EMISSIORDINA_DATAULTIELAB = 21;
  private static int PFL_EMISSIORDINA_GRUPPOLABEL = 22;
  private static int PFL_EMISSIORDINA_ALLEGATI = 23;
  private static int PFL_EMISSIORDINA_NOTETESORIER = 24;
  private static int PFL_EMISSIORDINA_NUMEROCONTAB = 25;
  private static int PFL_EMISSIORDINA_DATACONTABIL = 26;
  private static int PFL_EMISSIORDINA_CONTABILABEL = 27;
  private static int PFL_EMISSIORDINA_ETICHEAVVISO = 28;

  private static int PPQRY_PARAMETRI283 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_BEN = 2;

  private static int PPQRY_T58 = 3;
  private static int PPQRY_T53 = 4;


  IDPanel PAN_EMISSIORDINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI276(IMDB);
    //
    //
    Init_PQRY_PARAMETRI283(IMDB);
    Init_PQRY_PARAMETRI283_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI276(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI276, 19);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI276, "TBL_PARAMETRI276");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, "PARACODIGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARADESCGRUP, "PARADESCGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARADESCGRUP,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAUNORDPER, "PARAUNORDPER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAUNORDPER,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARADESCGENE, "PARADESCGENE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARADESCGENE,5,250,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAEMISAUTO, "PARAEMISAUTO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAEMISAUTO,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAIMPUECON, "PARAIMPUECON");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAIMPUECON,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARACODIDEBI, "PARACODIDEBI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARACODIDEBI,2,15,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARACONTPATR, "PARACONTPATR");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARACONTPATR,5,8,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARATIPOGRUP, "PARATIPOGRUP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARATIPOGRUP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAMALLEGAT,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAINFOTESO,5,255,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAQUALNOTE, "PARAQUALNOTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAQUALNOTE,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAIMPDAFIL, "PARAIMPDAFIL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI276,IMDBDef5.FLD_PARAMETRI276_PARAIMPDAFIL,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI276, 0);
  }

  private static void Init_PQRY_PARAMETRI283(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI283, 14);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI283, "PQRY_PARAMETRI283");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAUNORDPER, "PARAUNORDPER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAUNORDPER,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARADESCGENE, "PARADESCGENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARADESCGENE,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAEMISAUTO, "PARAEMISAUTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAEMISAUTO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAIMPUECON, "PARAIMPUECON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAIMPUECON,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI, "PARACODIDEBI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARACONTPATR, "PARACONTPATR");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARACONTPATR,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAMALLEGAT,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_PARAINFOTESO,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283,IMDBDef15.PQSL_PARAMETRI283_DATA_CONTABILE,6,19,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI283, 0);
  }

  private static void Init_PQRY_PARAMETRI283_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI283_RS, 14);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI283_RS, "PQRY_PARAMETRI283_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARDATULTELA, "PARDATULTELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARDATULTELA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAUNORDPER, "PARAUNORDPER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAUNORDPER,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARADESCGENE, "PARADESCGENE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARADESCGENE,5,250,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAEMISAUTO, "PARAEMISAUTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAEMISAUTO,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAIMPUECON, "PARAIMPUECON");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAIMPUECON,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI, "PARACODIDEBI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI,2,15,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARACONTPATR, "PARACONTPATR");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARACONTPATR,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAMALLEGAT, "PARAMALLEGAT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAMALLEGAT,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAINFOTESO, "PARAINFOTESO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_PARAINFOTESO,5,255,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI283_RS,IMDBDef15.PQSL_PARAMETRI283_DATA_CONTABILE,6,19,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneOrdinativiOrd(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneOrdinativiOrd()
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
    FormIdx = MyGlb.FRM_EMISSORDIORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CB2205D2-4A1F-4F7C-A5E0-BD2188ED83E3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 572;
    DesignHeight = 566;
    set_Caption(new IDVariant("Emissione Ordinativi Ord"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 572;
    Frames[1].Height = 540;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Emissioni Ordinativi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 540;
    PAN_EMISSIORDINA = new IDPanel(w, this, 1, "PAN_EMISSIORDINA");
    Frames[1].Content = PAN_EMISSIORDINA;
    PAN_EMISSIORDINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISSIORDINA.VS = MainFrm.VisualStyleList;
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 572-MyGlb.PAN_OFFS_X, 540-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "01241C6F-A032-49CB-A539-4D6F46B86C44");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2440, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISSIORDINA.InitStatus = 2;
    PAN_EMISSIORDINA_Init();
    PAN_EMISSIORDINA_InitFields();
    PAN_EMISSIORDINA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI276, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISSORDIORD_PARAMETRI283();
      }
      PAN_EMISSIORDINA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_APRSCEDEBLAB) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELFATTCONT && flRis && IdxPanelActived == PAN_EMISSIORDINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_EMISSIORDINA_CONTROPAPATR) {
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
    return (obj instanceof EmissioneOrdinativiOrd);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneOrdinativiOrd.class.getName() : (Glb.ClassWithPackage(EmissioneOrdinativiOrd.class) ? EmissioneOrdinativiOrd.class.getName().substring(EmissioneOrdinativiOrd.class.getPackage().getName().length() + 1) : EmissioneOrdinativiOrd.class.getName()));
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
      v_CAPTION = (new IDVariant("Emissione Ordinativi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      PAN_EMISSIORDINA.set_FieldText(PFL_EMISSIORDINA_GRUPPOLABEL, IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Gruppo")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADESCGRUP, 0)).stringValue());
      if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARDATULTELA, 0))))
      {
        PAN_EMISSIORDINA.set_FieldText(PFL_EMISSIORDINA_DATULTELALAB, IDL.Add(v_DATAULTIMAEL, MainFrm.Datetostring(IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARDATULTELA, 0))).stringValue());
      }
      else
      {
        PAN_EMISSIORDINA.set_FieldText(PFL_EMISSIORDINA_DATULTELALAB, new IDVariant(v_DATAULTIMAEL).stringValue());
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPUECON, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIDEBI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACONTPATR, 0, (new IDVariant()));
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.MODAIMPUENTR.equals((new IDVariant("AC")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPUECON, 0, (new IDVariant("SI")));
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARATIPOGRUP, 0).equals((new IDVariant("EP")), true))
      {
        if (MainFrm.LIQMO.equals((new IDVariant("SI")), true) || (MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))) && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true)))
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.LIQMO.equals((new IDVariant("SI")), true) || (MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF"))) && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true)))
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0))))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_UFFICIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      }
      if (IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPDAFIL, 0).equals((new IDVariant("SI")), true))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SOGGETTO)), true))
      {
        if (Result.booleanValue())
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI, 0, IMDB.Value(IMDBDef9.PQRY_BEN1, IMDBDef9.PQSL_BEN1_CODICE, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI, 0, (new IDVariant()));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELFATTCONT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARACONTPATR, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI2, IMDBDef7.PQSL_FATTORI2_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DIGITATESTO)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAQUALNOTE, 0).equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAMALLEGAT, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
        if (IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAQUALNOTE, 0).equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAINFOTESO, 0, IMDB.Value(IMDBDef7.PQRY_PARAM61, IMDBDef7.PQSL_PARAM61_ROWNAMENOTE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "EndModalEvent", _e);
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
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_UPDATE);
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADESCGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARDATULTELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAUNORDPER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADESCGENE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_CAUSALE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_UFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADATAEMIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAEMISAUTO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPUECON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIDEBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACONTPATR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARATIPOGRUP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAMALLEGAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAINFOTESO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAQUALNOTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_NUMERO_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_DATA_CONTABILE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPDAFIL, 0, new IDVariant());
  }

  // **********************************************************************
  // Emissioni Ordinativi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISSIORDINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_EMISSIORDINA);
      // 
      // Emissioni Ordinativi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAIMPUECON, 0).equals((new IDVariant("SI")), true))
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_EMISSIORDINA.SetFlags (Glb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "EmissioniOrdinativiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Emissioni Ordinativi On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_EMISSIORDINA_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissioni Ordinativi On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_EMISSIORDINA_DEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_EMISSIORDINA.FieldText(PFL_EMISSIORDINA_DEBITORE))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "EmissioniOrdinativiOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Scelta Debitore
  // **********************************************************************
  public int SceltaDebitore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Debitore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "SceltaDebitore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Contropartita
  // **********************************************************************
  public int SceltaContropartita ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Contropartita Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMDATREG, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI474, IMDBDef1.FLD_PARAMETRI474_ROWNAMETIPO, 0, (new IDVariant("P")));
      MainFrm.Show(MyGlb.FRM_SCELFATTCONT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "SceltaContropartita", _e);
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
    IDVariant v_ORDDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ORDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ACCDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ACCA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_STATOSIOPE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONFERMA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_TERMINANATA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDINATIVI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ACCERTAMENTI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VARIAZIONIAC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ORDDAA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ACCDAA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_VARACC = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DALNUMERO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_AL = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NESSUNO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_TERMINANATA = (new IDVariant("Procedura terminata.", IDVariant.STRING));
      v_ORDINATIVI = (new IDVariant("Ordinativi emessi: ", IDVariant.STRING));
      v_ACCERTAMENTI = (new IDVariant("Accertamenti emessi: ", IDVariant.STRING));
      v_VARIAZIONIAC = (new IDVariant("Variazioni su Accertamenti: ", IDVariant.STRING));
      v_DALNUMERO = (new IDVariant("dal numero ", IDVariant.STRING));
      v_AL = (new IDVariant(" al ", IDVariant.STRING));
      v_NESSUNO = (new IDVariant("Nessuno", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_NSUPDISPPURO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_STATCENTCOMO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_MESSUPDISPUR = new IDVariant(0,IDVariant.STRING);
      v_MESSUPDISPUR = (new IDVariant("Sono stati emessi accertamenti che superano la disponibilità dello stanziamento puro"));
      // 
      // Controlli Bloccanti
      // 
      {
        if (IDL.Year(IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARADATAEMIS, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Data Ordinativi non compatibile con Esercizio Finanziario!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARADESCGENE, 0)) && IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAUNORDPER, 0).equals((new IDVariant("R")), true))
        {
          IDVariant v_NUMREC = new IDVariant(0,IDVariant.INTEGER);
          v_NUMREC = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  GRO A ");
          SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((A.ANNO_ACC IS NULL)) ");
          SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPDAFIL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " IS NULL) OR (A.ANNO_PRE IS NULL)) ");
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
            v_AVVISO = (new IDVariant("Specificare la Descrizione Generica che verrà utilizzata per la generazione dei nuovi Accertamenti", IDVariant.STRING));
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
      MainFrm.Cf4armDBObject.GROEMISSIONEAUTO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARADATAEMIS, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_CAUSALE, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_UFFICIO, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAUNORDPER, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARADESCGENE, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAEMISAUTO, 0), v_ORDDA, v_ORDA, v_ACCDA, v_ACCA, v_VARACC, IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAIMPUECON, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARACODIDEBI, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARACONTPATR, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAMALLEGAT, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAINFOTESO, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_NUMERO_CONTABILE, 0), IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_DATA_CONTABILE, 0), v_STATOSIOPE, v_NSUPDISPPURO, v_STATCENTCOMO);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      if (v_STATOSIOPE.equals((new IDVariant(1)), true))
      {
        IDVariant v_AVVISOCGU = new IDVariant(0,IDVariant.STRING);
        v_AVVISOCGU = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Gestionale!", IDVariant.STRING));
        IDVariant v_AVVISOLIV5 = new IDVariant(0,IDVariant.STRING);
        v_AVVISOLIV5 = (new IDVariant("Attenzione: sono stati emessi ordinativi senza Codice Livello 5!"));
        if (MainFrm.SIOPEATTIARM.booleanValue())
        {
          v_CONFERMA = IDL.Add(IDL.Add(v_CONFERMA, v_AVVISOLIV5), (new IDVariant("<BR/>")));
        }
        else
        {
          v_CONFERMA = IDL.Add(IDL.Add(v_CONFERMA, v_AVVISOCGU), (new IDVariant("<BR/>")));
        }
      }
      if (v_STATCENTCOMO.equals((new IDVariant(1)), true))
      {
        IDVariant v_AVVISTOSTATI = new IDVariant(0,IDVariant.STRING);
        v_AVVISTOSTATI = (new IDVariant("Attenzione: E' stato utilizzato il centro di comodo per uno o più movimenti creati", IDVariant.STRING));
        v_CONFERMA = IDL.Add(IDL.Add(v_CONFERMA, v_AVVISTOSTATI), (new IDVariant("<BR/>")));
      }
      if (v_ORDDA.compareTo(v_ORDA, true)>0)
      {
        v_ORDDAA = new IDVariant(v_NESSUNO);
      }
      else
      {
        v_ORDDAA = IDL.Add(IDL.Add(IDL.Add(v_DALNUMERO, IDL.ToString(v_ORDDA)), v_AL), IDL.ToString(v_ORDA));
      }
      if (v_ACCDA.compareTo(v_ACCA, true)>0)
      {
        v_ACCDAA = new IDVariant(v_NESSUNO);
      }
      else
      {
        v_ACCDAA = IDL.Add(IDL.Add(IDL.Add(v_DALNUMERO, IDL.ToString(v_ACCDA)), v_AL), IDL.ToString(v_ACCA));
      }
      if (IDL.IsNull(v_VARACC) || v_VARACC.equals((new IDVariant("")), true))
      {
        v_VARACC = new IDVariant(v_NESSUNO);
      }
      v_CONFERMA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CONFERMA, v_TERMINANATA), (new IDVariant("<BR/>"))), v_ORDINATIVI), v_ORDDAA), (new IDVariant("<BR/>"))), v_ACCERTAMENTI), v_ACCDAA), (new IDVariant("<BR/>"))), v_VARIAZIONIAC), v_VARACC), (new IDVariant("<BR/>")));
      if (v_NSUPDISPPURO.equals((new IDVariant(1)), true))
      {
        v_CONFERMA = IDL.Add(IDL.Add(v_CONFERMA, v_MESSUPDISPUR), (new IDVariant("<BR/>")));
      }
      MainFrm.set_AlertMessage(v_CONFERMA); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "Elabora", _e);
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
      SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
        SQL.append("where (A.GRUPPO = " + IDL.CSql(IMDB.Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIGRUP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "ControlloLiquidazioneEseguita", _e);
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
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARADATAEMIS, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARDATULTELA, 0), true)<0)
      {
        IDVariant v_AVVISODATA = new IDVariant(0,IDVariant.STRING);
        v_AVVISODATA = (new IDVariant("La data emissione è precedente a quella dell'ultima elaborazione!", IDVariant.STRING));
        v_AVVISO = IDL.Add(IDL.Add(v_AVVISO, v_AVVISODATA), (new IDVariant("<BR/>")));
      }
      return v_AVVISO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "ControlliNonBloccanti", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAQUALNOTE, 0, (new IDVariant(1)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAMALLEGAT, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "CmdAllegati", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAQUALNOTE, 0, (new IDVariant(2)));
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef15.PQRY_PARAMETRI283, IMDBDef15.PQSL_PARAMETRI283_PARAINFOTESO, 0), v_CAPTION, (new IDVariant(-1)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiOrd", "NoteTesoriere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISSORDIORD_PARAMETRI283() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI283_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI276, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI276, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI283_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI283_RS, 0, IMDBDef5.TBL_PARAMETRI276, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 0, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARDATULTELA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 1, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAUNORDPER, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 2, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADESCGENE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 3, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 4, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 5, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARADATAEMIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 6, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAEMISAUTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 7, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAIMPUECON, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 8, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACODIDEBI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 9, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARACONTPATR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 10, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAMALLEGAT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 11, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_PARAINFOTESO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 12, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_NUMERO_CONTABILE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI283_RS, 13, 0, IMDBDef5.TBL_PARAMETRI276, IMDBDef5.FLD_PARAMETRI276_DATA_CONTABILE, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI276, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI276, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI276, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI283_RS, 0);
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
  private void PAN_EMISSIORDINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISSIORDINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISSIORDINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISSIORDINA, Cancel);
    // Stub
  }

  private void PAN_EMISSIORDINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISSIORDINA_APRSCEDEBLAB)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDebitore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_CONTROPAPATR)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaContropartita();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_ELABORALABEL)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_ALLEGATI)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdAllegati();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_EMISSIORDINA_NOTETESORIER)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      NoteTesoriere();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISSIORDINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISSIORDINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISSIORDINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISSIORDINA_Init()
  {

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, "5128F854-7AF5-4A31-9793-11FB434E6DDE");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, "Un Ordinativo per");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_FORM, 8, 43, 524, 41, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, 0, 99);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, 1, 4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_UNORDINATPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, "2AA56BC1-6535-4A08-B83E-04CA971A4645");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, "Ordinativi");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 704, 16, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, MyGlb.PANEL_FORM, 8, 91, 528, 173, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 0, 55);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 1, 4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, "2506A467-545C-492E-83EC-F4D5708AF67E");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, "Accertamenti");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, -9999, 752, 16, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, MyGlb.PANEL_FORM, 8, 267, 528, 145, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 0, 77);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 1, 4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, "C1F4FDDF-4734-45D7-BA84-E912489B1726");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, "Contabile di Tesoreria");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, MyGlb.PANEL_LIST, 0, -9999, 108, 16, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, MyGlb.PANEL_FORM, 8, 415, 528, 53, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, 0, 123);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, 0, 4);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, 1, 4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_CONTADITESOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, "76DF32F5-CB85-4FA0-A2AC-4013BD92C956");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, "90899D4E-FD4C-426E-87AE-A5799442588D");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, "A4DC86A2-DE22-4950-9277-5EAE7EE5C698");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, "Un Ordinativo Per");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.VIS_OPTBUTSENBOR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, "ED520703-16BA-4F0C-AD66-07C7C9F0D6FA");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, "665827B0-8269-46E2-9F9F-7EF5F13A6807");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, "2F7A7A9D-588F-482D-994F-4A82927D2668");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, "Descrizione Generica");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "35AF912A-EABB-4E40-9B87-84C6716B2626");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "Causale");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "4A976F24-1AFC-41CC-B666-54BE33CDF3BF");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "Ufficio");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, "55F12DDA-5AB9-43A8-947C-DDF6192CFF57");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, "Data Emissione");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, "FC5E76CF-C107-411B-BB85-B867B2633DE1");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, "Allegati");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, "53FEE6FF-6FD1-448D-950C-726347044ED5");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, "Info Tesoriere");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, "710F010B-3424-48E0-AD3D-2FDDAF07E068");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, "Emissione Automatica");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, "1CC21555-DA81-46D9-B58F-FE0662BF3EA6");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, "Imputazione Economica");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, "6EA81C9D-0EC7-4C87-8D90-9A0D169B8149");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, "Emissione Automatica Variazione per Mancanza Disponibilità su Accertamento(solo di Competenza)");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, "C174C5B9-1B3A-4F8E-8905-EFAF11647457");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, "Debitore");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, "4E7D885D-ABF2-4EEA-B274-F7B6F0E7A2AE");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, "Codice Debitore");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, "487239F2-2156-400C-967A-CFF61327B574");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, 0, "wsearch1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, "7CA0FE70-2866-40F4-B735-B405DFFA5205");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, "Contropartita Patr.");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, "FC3848C3-6C74-41DE-9B4B-E4B16E4C2C3E");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, "DB215225-3A21-4299-BAF5-14861CA074B2");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, MyGlb.VIS_ETICHEGRASSE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, "67A53A74-E99D-4BE5-AB22-3B55DAF08C7A");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, "Elabora");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, 0, "button1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, "6A11E525-890D-42F5-ABF6-B304017E1B2B");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, "Data Ultima Elaborazione");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, "7A3CF75D-1181-42E6-918A-9EACD024A232");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, "674AEF3C-AB9B-46EE-91D0-B39E7F9D0B8E");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, 0, "testo1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, "A0B15711-A90D-4386-8CA4-2A093096FA57");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, MyGlb.VIS_IMAGEBUTTONS);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, 0, "testo1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, "4BFB58DE-0B60-4B57-B42B-FB0DD71E0ABF");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, "Numero");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, "F4ABE3A2-FC1D-4A45-AD46-8D856E5D8821");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, "Data");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, "166C6661-FB61-46FF-8D4F-CA72A77221E5");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, "A8C69309-2037-4450-B3FB-E9C2433B0D83");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, "L'emissione Ordinativi trattera' solo le righe di dettaglio per le quali non sono ancora stati emessi ordinativi.");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, MyGlb.VIS_VUOGRAALILEF);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_EMISSIORDINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, MyGlb.PANEL_LIST, 12, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, MyGlb.PANEL_FORM, 12, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABESX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_UNIMPELABESX, -1, GRP_EMISSIORDINA_UNORDINATPER);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_UNIMPELABESX, -1, "", "UNIMPELABESX", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, MyGlb.PANEL_LIST, 556, 60, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, MyGlb.PANEL_FORM, 516, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNIMPELABEDX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_UNIMPELABEDX, -1, GRP_EMISSIORDINA_UNORDINATPER);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_UNIMPELABEDX, -1, "", "UNIMPELABEDX", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_LIST, 120, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_LIST, 88);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_LIST, "Un Ordinativo Per");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_FORM, 136, 60, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_FORM, 104);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UNORDINATPER, MyGlb.PANEL_FORM, "Un Ordin. Per");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_UNORDINATPER, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_UNORDINATPER, PPQRY_PARAMETRI283, "A.PARAUNORDPER", "PARAUNORDPER", 5, 1, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_UNORDINATPER, (new IDVariant("R")), "Capitolo/Accertamento", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_UNORDINATPER, (new IDVariant("D")), "Dettaglio", "", "", -1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, MyGlb.PANEL_LIST, 8, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, MyGlb.PANEL_FORM, 12, 116, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELSX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_LIQUILABELSX, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_LIQUILABELSX, -1, "", "LIQUILABELSX", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, MyGlb.PANEL_LIST, 572, 396, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, MyGlb.PANEL_FORM, 520, 200, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_LIQUILABELDX, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_LIQUILABELDX, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_LIQUILABELDX, -1, "", "LIQUILABELDX", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_LIST, 4, 276, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_LIST, 128);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_LIST, "Descrizione Generica");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_FORM, 12, 120, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_FORM, 128);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIGENERI, MyGlb.PANEL_FORM, "Descrizione Generica");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DESCRIGENERI, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DESCRIGENERI, PPQRY_PARAMETRI283, "A.PARADESCGENE", "PARADESCGENE", 5, 250, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 464, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 24, 144, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CAUSALE, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CAUSALE, PPQRY_PARAMETRI283, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 504, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 24, 168, 488, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_UFFICIO, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_UFFICIO, PPQRY_PARAMETRI283, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_LIST, 584, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_LIST, 80);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_LIST, "Data Emissione");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_FORM, 24, 192, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAEMISSION, MyGlb.PANEL_FORM, "Data Emissione");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATAEMISSION, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATAEMISSION, PPQRY_PARAMETRI283, "A.PARADATAEMIS", "PARADATAEMIS", 6, 19, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_LIST, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_LIST, "Allegati");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_FORM, 88, 216, 424, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_FORM, 52);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI1, MyGlb.PANEL_FORM, "Allegati");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ALLEGATI1, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ALLEGATI1, PPQRY_PARAMETRI283, "A.PARAMALLEGAT", "PARAMALLEGAT", 5, 255, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, 48, 240, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, 92);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_INFOTESORIER, -1, GRP_EMISSIORDINA_ORDINATIVI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_INFOTESORIER, PPQRY_PARAMETRI283, "A.PARAINFOTESO", "PARAINFOTESO", 5, 255, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_LIST, 704, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_LIST, 68);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_LIST, "Em. At.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_FORM, 320, 300, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_FORM, 68);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISSIAUTOMA, MyGlb.PANEL_FORM, "Emis. Aut.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_EMISSIAUTOMA, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_EMISSIAUTOMA, PPQRY_PARAMETRI283, "A.PARAEMISAUTO", "PARAEMISAUTO", 5, 2, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_EMISSIAUTOMA, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_EMISSIAUTOMA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, 120);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_LIST, "Imput. Economica");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, 188, 328, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, 128);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_IMPUTAECONOM, MyGlb.PANEL_FORM, "Imput. Economica");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_IMPUTAECONOM, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_IMPUTAECONOM, PPQRY_PARAMETRI283, "A.PARAIMPUECON", "PARAIMPUECON", 5, 2, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_IMPUTAECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_IMPUTAECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, MyGlb.PANEL_LIST, 16, 280, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, MyGlb.PANEL_FORM, 12, 292, 300, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMISAUTOLABE, MyGlb.PANEL_FORM, 2);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_EMISAUTOLABE, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_EMISAUTOLABE, -1, "", "EMISAUTOLABE", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 412, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_LIST, 136);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_FORM, 64, 360, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_FORM, 80);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DEBITORE, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "NUOVAESPRESS", 5, 162, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_LIST, "Cod. Deb.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_FORM, 4, 444, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CODICEDEBITO, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CODICEDEBITO, PPQRY_PARAMETRI283, "A.PARACODIDEBI", "PARACODIDEBI", 2, 15, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, MyGlb.PANEL_LIST, 468, 328, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, MyGlb.PANEL_FORM, 516, 364, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_APRSCEDEBLAB, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_APRSCEDEBLAB, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_APRSCEDEBLAB, -1, "", "APRSCEDEBLAB", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, 96);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_LIST, "Controp. Patr");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, 28, 388, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, 116);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTROPAPATR, MyGlb.PANEL_FORM, "Contropartita Patr.");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CONTROPAPATR, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CONTROPAPATR, PPQRY_PARAMETRI283, "A.PARACONTPATR", "PARACONTPATR", 5, 8, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, 220, 388, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_FATTORDESCRI, -1, GRP_EMISSIORDINA_ACCERTAMENTI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, MyGlb.PANEL_LIST, 112, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, MyGlb.PANEL_FORM, 372, 8, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATULTELALAB, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATULTELALAB, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATULTELALAB, -1, "", "DATULTELALAB", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, MyGlb.PANEL_LIST, 424, 416, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, MyGlb.PANEL_FORM, 456, 488, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORALABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ELABORALABEL, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ELABORALABEL, -1, "", "ELABORALABEL", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_LIST, 128);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_LIST, "Data Ultima Elaborazione");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_FORM, 4, 444, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_FORM, 128);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATAULTIELAB, MyGlb.PANEL_FORM, "Dt. Ult. Elaborazione");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATAULTIELAB, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATAULTIELAB, PPQRY_PARAMETRI283, "A.PARDATULTELA", "PARDATULTELA", 6, 19, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, MyGlb.PANEL_LIST, 120, 12, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, MyGlb.PANEL_FORM, 8, 8, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_GRUPPOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_GRUPPOLABEL, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_GRUPPOLABEL, -1, "", "GRUPPOLABEL", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_LIST, 512, 216, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_FORM, 516, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ALLEGATI, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ALLEGATI, -1, "", "ALLEGATI", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, MyGlb.PANEL_LIST, 520, 224, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, MyGlb.PANEL_FORM, 516, 244, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NOTETESORIER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_NOTETESORIER, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_NOTETESORIER, -1, "", "NOTETESORIER", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 108);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_LIST, "Numero");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 12, 440, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 132);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_NUMEROCONTAB, MyGlb.PANEL_FORM, "Numero");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_NUMEROCONTAB, -1, GRP_EMISSIORDINA_CONTADITESOR);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_NUMEROCONTAB, PPQRY_PARAMETRI283, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 92);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_LIST, "Data");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 272, 440, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 36);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATACONTABIL, MyGlb.PANEL_FORM, "Data");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATACONTABIL, -1, GRP_EMISSIORDINA_CONTADITESOR);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATACONTABIL, PPQRY_PARAMETRI283, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, MyGlb.PANEL_LIST, 564, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, MyGlb.PANEL_FORM, 520, 452, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CONTABILABEL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CONTABILABEL, -1, GRP_EMISSIORDINA_CONTADITESOR);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CONTABILABEL, -1, "", "CONTABILABEL", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, MyGlb.PANEL_LIST, 44, 488, 388, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, MyGlb.PANEL_FORM, 12, 488, 420, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ETICHEAVVISO, MyGlb.PANEL_FORM, 2);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ETICHEAVVISO, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ETICHEAVVISO, -1, "", "ETICHEAVVISO", 0, 0, 0, -13997);
  }

  private void PAN_EMISSIORDINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~PARACONTPATR~~) ");
    SQL.append("and   ((A.TIPO = 'A' OR A.TIPO = 'P')) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= TRUNC( SYSDATE )) ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as NUOVAESPRESS, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~PARACODIDEBI~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_BEN, PFL_EMISSIORDINA_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as NUOVAESPRESS, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN, "NUOVAESPRESS", "Nuova Espressione");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_EMISSIORDINA.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_EMISSIORDINA.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T58, 0, SQL, PFL_EMISSIORDINA_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T58, 1, SQL, PFL_EMISSIORDINA_CAUSALE, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T53, 0, SQL, PFL_EMISSIORDINA_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T53, 1, SQL, PFL_EMISSIORDINA_UFFICIO, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetIMDB(IMDB, "PQRY_PARAMETRI283", true);
    PAN_EMISSIORDINA.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_EMISSIORDINA.SetQueryIMDB(PPQRY_PARAMETRI283, IMDBDef15.PQRY_PARAMETRI283_RS, IMDBDef5.TBL_PARAMETRI276);
    JustLoaded = true;
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_UNORDINATPER, IMDBDef5.FLD_PARAMETRI276_PARAUNORDPER);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DESCRIGENERI, IMDBDef5.FLD_PARAMETRI276_PARADESCGENE);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CAUSALE, IMDBDef5.FLD_PARAMETRI276_CAUSALE);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_UFFICIO, IMDBDef5.FLD_PARAMETRI276_UFFICIO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATAEMISSION, IMDBDef5.FLD_PARAMETRI276_PARADATAEMIS);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_ALLEGATI1, IMDBDef5.FLD_PARAMETRI276_PARAMALLEGAT);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_INFOTESORIER, IMDBDef5.FLD_PARAMETRI276_PARAINFOTESO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_EMISSIAUTOMA, IMDBDef5.FLD_PARAMETRI276_PARAEMISAUTO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_IMPUTAECONOM, IMDBDef5.FLD_PARAMETRI276_PARAIMPUECON);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CODICEDEBITO, IMDBDef5.FLD_PARAMETRI276_PARACODIDEBI);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CONTROPAPATR, IMDBDef5.FLD_PARAMETRI276_PARACONTPATR);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATAULTIELAB, IMDBDef5.FLD_PARAMETRI276_PARDATULTELA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_NUMEROCONTAB, IMDBDef5.FLD_PARAMETRI276_NUMERO_CONTABILE);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATACONTABIL, IMDBDef5.FLD_PARAMETRI276_DATA_CONTABILE);
    PAN_EMISSIORDINA.SetMasterTable(0, "PARAMETRI276");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISSIORDINA.Status() == 2)
    {
      int oldListQBE = PAN_EMISSIORDINA.iUseListQBE;
      PAN_EMISSIORDINA.iUseListQBE = 0;
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_FIND);
      PAN_EMISSIORDINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
