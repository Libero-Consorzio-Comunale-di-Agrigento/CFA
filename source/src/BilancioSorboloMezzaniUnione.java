// **********************************************
// Bilancio Sorbolo Mezzani Unione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class BilancioSorboloMezzaniUnione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ELAB_ETICESTRBILA = 0;
  private static int PFL_ELAB_ETICHEELABOR = 1;

  private static int PPQRY_MASTERQUERY3 = 0;


  IDPanel PAN_ELAB;
  private static int GRP_BILSMU_CODICAPISORB = 0;
  private static int GRP_BILSMU_CODIIVLIVSOR = 1;
  private static int GRP_BILSMU_CODIVLIVESOR = 2;
  private static int GRP_BILSMU_CODICAPIMEZZ = 3;
  private static int GRP_BILSMU_CODIIVLIVMEZ = 4;
  private static int GRP_BILSMU_CODIVLIVEMEZ = 5;
  private static int GRP_BILSMU_CODICAPIUNIO = 6;
  private static int GRP_BILSMU_CODIIVLIVUNI = 7;
  private static int GRP_BILSMU_CODIVLIVEUNI = 8;

  private static int PFL_BILSMU_PARTE = 0;
  private static int PFL_BILSMU_CAPITOLO = 1;
  private static int PFL_BILSMU_ARTICOLO = 2;
  private static int PFL_BILSMU_DESCCAPISOR1 = 3;
  private static int PFL_BILSMU_CODICAPISORB = 4;
  private static int PFL_BILSMU_DESCCAPISORB = 5;
  private static int PFL_BILSMU_CODIIVLIVSOR = 6;
  private static int PFL_BILSMU_DESCODIVLISO = 7;
  private static int PFL_BILSMU_CODIVLIVSORB = 8;
  private static int PFL_BILSMU_DESCODVLIVSO = 9;
  private static int PFL_BILSMU_STNINIEFPRSO = 10;
  private static int PFL_BILSMU_STNINISIMSOR = 11;
  private static int PFL_BILSMU_IMPACCCOMSOR = 12;
  private static int PFL_BILSMU_IMACCOESPRSO = 13;
  private static int PFL_BILSMU_LIQORDESPRSO = 14;
  private static int PFL_BILSMU_DESCCAPIMEZ1 = 15;
  private static int PFL_BILSMU_CODICAPIMEZZ = 16;
  private static int PFL_BILSMU_DESCCAPIMEZZ = 17;
  private static int PFL_BILSMU_CODIIVLIVMEZ = 18;
  private static int PFL_BILSMU_DESCODIVLIME = 19;
  private static int PFL_BILSMU_CODIVLIVMEZZ = 20;
  private static int PFL_BILSMU_DESCODVLIVME = 21;
  private static int PFL_BILSMU_STNINIEFPRME = 22;
  private static int PFL_BILSMU_STNINISIMMEZ = 23;
  private static int PFL_BILSMU_IMPACCCOMMEZ = 24;
  private static int PFL_BILSMU_IMACCOESPRME = 25;
  private static int PFL_BILSMU_LIQORDESPRME = 26;
  private static int PFL_BILSMU_DESCCAPIUNI1 = 27;
  private static int PFL_BILSMU_CODICAPIUNIO = 28;
  private static int PFL_BILSMU_DESCCAPIUNIO = 29;
  private static int PFL_BILSMU_CODIIVLIVUNI = 30;
  private static int PFL_BILSMU_DESCODIVLIUN = 31;
  private static int PFL_BILSMU_CODIVLIVUNIO = 32;
  private static int PFL_BILSMU_DESCODVLIVUN = 33;
  private static int PFL_BILSMU_STNINIEFPRUN = 34;
  private static int PFL_BILSMU_STNINISIMUNI = 35;
  private static int PFL_BILSMU_IMPACCCOMUNI = 36;
  private static int PFL_BILSMU_IMACCOESPRUN = 37;
  private static int PFL_BILSMU_LIQORDESPRUN = 38;

  private static int PPQRY_BILSMU = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_BILSMU;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS90(IMDB);
    //
    //
    Init_PQRY_MASTERQUERY3(IMDB);
    Init_PQRY_BILSMU(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS90(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARS90, 0);
    IMDB.set_TblCode(IMDBDef6.TBL_PARS90, "TBL_PARS90");
    IMDB.TblAddNew(IMDBDef6.TBL_PARS90, 0);
  }

  private static void Init_PQRY_MASTERQUERY3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MASTERQUERY3, 0);
    IMDB.set_TblCode(IMDBDef15.PQRY_MASTERQUERY3, "PQRY_MASTERQUERY3");
    IMDB.TblAddNew(IMDBDef15.PQRY_MASTERQUERY3, 0);
  }

  private static void Init_PQRY_BILSMU(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_BILSMU, 36);
    IMDB.set_TblCode(IMDBDef15.PQRY_BILSMU, "PQRY_BILSMU");
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUPARTE, "BILSMUPARTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCAPITO, "BILSMUCAPITO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUARTICO, "BILSMUARTICO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUDECASO, "BILSMUDECASO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUDECASO,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCOCASO, "BILSMUCOCASO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCOCASO,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMCOIVLISO, "BISMCOIVLISO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMCOIVLISO,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOIVLS, "BISMDECOIVLS");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOIVLS,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMCOVLISO, "BILSMCOVLISO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMCOVLISO,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOVLIS, "BISMDECOVLIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOVLIS,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINEFPS, "BISMSTINEFPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINEFPS,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINSISO, "BISMSTINSISO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINSISO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCEPS, "BISMIMACCEPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCEPS,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCOSO, "BISMIMACCOSO");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCOSO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMLIORESPS, "BISMLIORESPS");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMLIORESPS,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUDECAME, "BILSMUDECAME");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUDECAME,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCOCAME, "BILSMUCOCAME");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCOCAME,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMCOIVLIME, "BISMCOIVLIME");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMCOIVLIME,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOIVLM, "BISMDECOIVLM");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOIVLM,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMCOVLIME, "BILSMCOVLIME");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMCOVLIME,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOVLIM, "BISMDECOVLIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOVLIM,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINEFPM, "BISMSTINEFPM");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINEFPM,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINSIME, "BISMSTINSIME");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINSIME,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCEPM, "BISMIMACCEPM");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCEPM,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCOME, "BISMIMACCOME");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCOME,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMLIORESPM, "BISMLIORESPM");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMLIORESPM,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUDECAUN, "BILSMUDECAUN");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUDECAUN,5,140,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCOCAUN, "BILSMUCOCAUN");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMUCOCAUN,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMCOIVLIUN, "BISMCOIVLIUN");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMCOIVLIUN,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOIVLU, "BISMDECOIVLU");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOIVLU,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMCOVLIUN, "BILSMCOVLIUN");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BILSMCOVLIUN,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOVLIU, "BISMDECOVLIU");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMDECOVLIU,5,300,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINEFPU, "BISMSTINEFPU");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINEFPU,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINSIUN, "BISMSTINSIUN");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMSTINSIUN,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCEPU, "BISMIMACCEPU");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCEPU,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCOUN, "BISMIMACCOUN");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMIMACCOUN,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMLIORESPU, "BISMLIORESPU");
    IMDB.SetFldParams(IMDBDef15.PQRY_BILSMU,IMDBDef15.PQSL_BILSMU_BISMLIORESPU,3,14,2);
    IMDB.TblAddNew(IMDBDef15.PQRY_BILSMU, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public BilancioSorboloMezzaniUnione(MyWebEntryPoint w, IMDBObj imdb)
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
  public BilancioSorboloMezzaniUnione()
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
    FormIdx = MyGlb.FRM_BILSORMEZUNI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "25314604-7A41-4B20-9BDE-733B5BA07488";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 736;
    DesignHeight = 422;
    set_Caption(new IDVariant("Bilancio Sorbolo, Mezzani, Unione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 736;
    Frames[1].Height = 396;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.138889;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 736;
    Frames[2].Height = 55;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Elab";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 55;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_ELAB = new IDPanel(w, this, 2, "PAN_ELAB");
    Frames[2].Content = PAN_ELAB;
    PAN_ELAB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELAB.VS = MainFrm.VisualStyleList;
    PAN_ELAB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 736-MyGlb.PAN_OFFS_X, 55-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELAB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0B196688-00E9-4BB0-8155-9C60E3AB19AE");
    PAN_ELAB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 56, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELAB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELAB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELAB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELAB.InitStatus = 2;
    PAN_ELAB_Init();
    PAN_ELAB_InitFields();
    PAN_ELAB_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 736;
    Frames[3].Height = 341;
    Frames[3].Caption = "Bilancio Sorbolo, Mezzani, Unione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 341;
    PAN_BILSMU = new IDPanel(w, this, 3, "PAN_BILSMU");
    Frames[3].Content = PAN_BILSMU;
    PAN_BILSMU.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BILSMU.VS = MainFrm.VisualStyleList;
    PAN_BILSMU.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 736-MyGlb.PAN_OFFS_X, 341-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CF7C38A0-1862-4BCD-9218-566EB2280F7F");
    PAN_BILSMU.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 7852, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BILSMU.InitStatus = 2;
    PAN_BILSMU_Init();
    PAN_BILSMU_InitFields();
    PAN_BILSMU_InitQueries();
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
      PAN_ELAB.UpdatePanel(MainFrm);
      PAN_BILSMU.UpdatePanel(MainFrm);
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
    return (obj instanceof BilancioSorboloMezzaniUnione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? BilancioSorboloMezzaniUnione.class.getName() : (Glb.ClassWithPackage(BilancioSorboloMezzaniUnione.class) ? BilancioSorboloMezzaniUnione.class.getName().substring(BilancioSorboloMezzaniUnione.class.getPackage().getName().length() + 1) : BilancioSorboloMezzaniUnione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioSorboloMezzaniUnione", "Unload", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ESTRAZBILSMU(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        PAN_BILSMU.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioSorboloMezzaniUnione", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // BIL SMU On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BILSMU_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BILSMU);
      // 
      // BIL SMU On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCCAPISOR1,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCCAPISOR1))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCCAPISORB,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCCAPISORB))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCODIVLISO,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCODIVLISO))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCODVLIVSO,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCODVLIVSO))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCCAPIMEZ1,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCCAPIMEZ1))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCCAPIMEZZ,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCCAPIMEZZ))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCODIVLIME,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCODIVLIME))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCODVLIVME,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCODVLIVME))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCCAPIUNI1,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCCAPIUNI1))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCCAPIUNIO,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCCAPIUNIO))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCODIVLIUN,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCODIVLIUN))).stringValue()); 
      PAN_BILSMU.set_ToolTip(Glb.OBJ_FIELD,PFL_BILSMU_DESCODVLIVUN,(new IDVariant(PAN_BILSMU.FieldText(PFL_BILSMU_DESCODVLIVUN))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("BilancioSorboloMezzaniUnione", "BILSMUOnDynamicProperties", _e);
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
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
  private void PAN_ELAB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELAB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELAB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELAB, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELAB_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ELAB);
    // Stub
  }

  private void PAN_ELAB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELAB_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_ELAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELAB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELAB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELAB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_BILSMU_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BILSMU, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BILSMU_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BILSMU, Cancel);
    // Stub
  }

  private void PAN_BILSMU_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BILSMU_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_BILSMU_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BILSMU_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELAB_Init()
  {

    PAN_ELAB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELAB.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELAB.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_ELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, "BBCE6A85-DE57-4185-A16B-29F5301ADD02");
    PAN_ELAB.set_Header(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, "Estrazione Bilancio capitoli di Sorbolo, Mezzani e Unione. Premendo elabora si ricalcolano i dati estratti");
    PAN_ELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, MyGlb.VIS_ETICGRASLEFT);
    PAN_ELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, "8E77581B-F082-43DE-B791-1DEC5B7A316B");
    PAN_ELAB.set_Header(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, "Elabora");
    PAN_ELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_ELAB.SetImage(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, 0, "button1.gif", false);
    PAN_ELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ELAB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELAB.SetRect(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, MyGlb.PANEL_LIST, 32, 32, 476, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, MyGlb.PANEL_LIST, 0);
    PAN_ELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, MyGlb.PANEL_LIST, 1);
    PAN_ELAB.SetRect(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, MyGlb.PANEL_FORM, 20, 8, 476, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, MyGlb.PANEL_FORM, 0);
    PAN_ELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELAB_ETICESTRBILA, MyGlb.PANEL_FORM, 2);
    PAN_ELAB.SetFieldPage(PFL_ELAB_ETICESTRBILA, -1, -1);
    PAN_ELAB.SetFieldPanel(PFL_ELAB_ETICESTRBILA, -1, "", "ETICESTRBILA", 0, 0, 0, -13997);
    PAN_ELAB.SetRect(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 508, 8, 164, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_ELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_ELAB.SetRect(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 512, 8, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_ELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_ELAB.SetFieldPage(PFL_ELAB_ETICHEELABOR, -1, -1);
    PAN_ELAB.SetFieldPanel(PFL_ELAB_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_ELAB_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELAB.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ELAB.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELAB.Status() == 2)
    {
      int oldListQBE = PAN_ELAB.iUseListQBE;
      PAN_ELAB.iUseListQBE = 0;
      PAN_ELAB.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELAB.PanelCommand(Glb.PCM_FIND);
      PAN_ELAB.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_BILSMU_Init()
  {

    PAN_BILSMU.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BILSMU.SetSize(MyGlb.OBJ_GROUP, 9);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, "CDAE9B0F-2ED6-412A-AF9E-A3F080B779A7");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, "Codice Capitolo Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, MyGlb.PANEL_LIST, 640, -9999, 524, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, MyGlb.PANEL_FORM, 0, 27, 700, 481, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, 0, 132);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPISORB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, "15231CD4-14A2-4425-A77C-87A38F4727A2");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, "Codice IV Livello Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_LIST, 1164, -9999, 468, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_FORM, 0, 27, 536, 97, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, 0, 137);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVSOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, "5CED265A-BAE2-49E7-AD1C-34DEFC7BF655");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, "Codice V Livello Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, MyGlb.PANEL_LIST, 1632, -9999, 468, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, MyGlb.PANEL_FORM, 0, 75, 536, 97, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, 0, 132);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVESOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, "D810AC5B-2EED-4049-AE3F-0EDFDF8B720B");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, "Codice Capitolo Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_LIST, 3176, -9999, 524, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_FORM, 0, 195, 592, 337, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, 0, 135);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIMEZZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, "65480596-C399-4D7A-AB9B-01550E2A97B3");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, "Codice IV Livello Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_LIST, 3700, -9999, 468, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_FORM, 0, 195, 536, 97, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, 0, 140);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVMEZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, "C9CA120F-B868-489D-9DEC-F698761323AF");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, "Codice V Livello Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, MyGlb.PANEL_LIST, 4168, -9999, 468, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, MyGlb.PANEL_FORM, 0, 243, 552, 97, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, 0, 135);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEMEZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, "F8AC43F8-7F41-42C2-AE4D-50C4364FB6FD");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, "Codice Capitolo Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, MyGlb.PANEL_LIST, 5712, -9999, 524, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, MyGlb.PANEL_FORM, 0, 291, 588, 265, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, 0, 128);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODICAPIUNIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, "1F692B87-2D05-44CA-B283-83843234A7BA");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, "Codice IV Livello Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_LIST, 6236, -9999, 468, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_FORM, 0, 339, 544, 97, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, 0, 133);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIIVLIVUNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, "06D56288-D9F6-490B-BDAE-F776FF7B8F64");
    PAN_BILSMU.set_Header(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, "Codice V Livello Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, MyGlb.VIS_DEFAPANESTYL);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, MyGlb.PANEL_LIST, 6704, -9999, 468, 16, 0, 0);
    PAN_BILSMU.SetRect(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, MyGlb.PANEL_FORM, 0, 339, 544, 121, 0, 0);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, 0, 128);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, 1, 13);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, 0, 4);
    PAN_BILSMU.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, 1, 4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_GROUP, GRP_BILSMU_CODIVLIVEUNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_BILSMU.SetSize(MyGlb.OBJ_FIELD, 39);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, "ACD6D668-C6B2-4035-944D-98F6319C50CB");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, "Parte");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, "E/S");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, "EC5B9485-3914-4282-98EE-E1CDFF42791A");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, "Capitolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, "EE34F6AA-8075-431A-83ED-9DEE1B11C8DA");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, "Art.");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, "4F95DD5C-41F6-4A0C-8A51-989E9313A466");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, "Descrizione Capitolo Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, "Descrizione Capitolo Sorbolo");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, "DD645C39-7645-4601-8B21-A7FA9FCAD352");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, "38BA31ED-6D0B-49AA-BF89-99B10D0D3F38");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.VIS_VISULOOUPCF4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, "7798304E-C919-41F7-B9D8-0DD071392BD4");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, "Codice IV Liv. Sorbolo");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, "47E7CA95-E0AF-4B16-B64F-9405C2E6979D");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, "14BBCBFE-8FBC-4EB1-A4C2-AA4EA06E3D2F");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, "6986D650-0A21-4F86-A4E5-825760F2EE00");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, "470CC5D7-5517-438D-8094-6EC202D9A09D");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, "Stn. Ini. Eff. Prec. Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, "Stanziamento iniziale effettivo esercizio precedente ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, "DE5EC0DB-9D86-4D04-9E4C-CCCAAC0B430B");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, "Stn. Ini. Sim. Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, "Stanziamento iniziale simulato anno di elaborazione ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, "4887D432-FE58-4C23-BFB2-3C137949F312");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, "Imp./Acc. Comp. Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, "impegni/accertamenti di competenza esercizio ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, "79DBF55D-581B-418A-A034-04FE7B524023");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, "Imp./Acc. Comp. Eserc. Prec. Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, "Impegni/accertamenti di competenza esercizio precedente");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, "5112C579-BD9F-47EA-A153-208A21DE7431");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, "Liq./Ord. Eserc. Prec. Sorbolo");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, "liquidazioni/ordinativi esercizio precedente");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, "4CFC8DD9-5807-48E6-8C2A-D81706D3699C");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, "Descrizione Capitolo Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, "EAD20C0C-725E-4CAA-8412-8EA1AB0BABC9");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, "EBC73E03-B7F7-4AC7-B010-7111FE89B8EF");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, "5FF767A7-1EB2-4B33-8AB2-1808B24FE878");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, "923FACD6-925E-4BE4-A118-B81201418393");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, "5631D65D-C359-4A92-B025-0228BDAD7EA4");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, "24B2C53D-0758-49A1-8CA4-A6DFA636D538");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, "811E9FA5-9502-4CAC-B874-3D43592B3BB9");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, "Stn. Ini. Eff. Prec. Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, "Stanziamento iniziale effettivo esercizio precedente ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, "116F3740-DF7A-49E6-A268-1E763BBF90BC");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, "Stn. Ini. Sim. Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, "Stanziamento iniziale simulato anno di elaborazione ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, "6E82F82D-21D0-4429-8E14-740496E315FD");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, "Imp./Acc. Comp. Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, "impegni/accertamenti di competenza esercizio ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, "E71AD5D1-9806-4DEE-ABF1-FF75AAE5DB39");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, "Imp./Acc. Comp. Eserc. Prec. Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, "Impegni/accertamenti di competenza esercizio precedente");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, "5077758A-CFE6-46EC-8C23-D95D4D613E7F");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, "Liq./Ord. Eserc. Prec. Mezzani");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, "liquidazioni/ordinativi esercizio precedente");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, "175CE168-1CE0-4C8D-A6AD-ED4BE39AA1D3");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, "Descrizione Capitolo Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, "Descrizione Capitolo Unione");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, "27FFDE65-D613-4B2C-94B5-AEB81462B78F");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, "3313D50B-91DD-4C6F-A5E3-5A89D6FE7C9D");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, "26A011C5-B40B-46C5-BDFA-6898226E5D23");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, "096CEE30-8C14-4719-8A33-6C2E5F3BF300");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, "1F770C9E-5E26-47A6-983A-02A20688A624");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, "Codice");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, "D3484042-0924-4935-B2E0-3E52CCC2188B");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, "Descrizione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, "");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.VIS_NORMALFIELDS);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, "6507634C-6F86-47A1-B46F-785CE45EEFB8");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, "Stn. Ini. Eff. Prec. Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, "Stanziamento iniziale effettivo esercizio precedente ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, "35AF9D17-F01E-47E1-91D1-2C8981526930");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, "Stn. Ini. Sim. Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, "Stanziamento iniziale simulato anno di elaborazione ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, "719AA986-F8D7-4179-ADC4-09FAD652E76F");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, "Imp./Acc. Comp. Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, "impegni/accertamenti di competenza esercizio ");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, "4B68B1D2-871A-427F-BC75-EAF6F0B7B9DE");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, "Imp./Acc. Comp. Eserc. Prec. Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, "Impegni/accertamenti di competenza esercizio precedente");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BILSMU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, "E3C58780-C56C-4510-BF75-0398F1B0AEC1");
    PAN_BILSMU.set_Header(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, "Liq./Ord. Eserc. Prec. Unione");
    PAN_BILSMU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, "liquidazioni/ordinativi esercizio precedente");
    PAN_BILSMU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.VIS_NORFIECF4IMP);
    PAN_BILSMU.SetFlags(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_BILSMU_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_PARTE, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_PARTE, PPQRY_BILSMU, "A.E_S", "BILSMUPARTE", 5, 1, 0, -13997);
    PAN_BILSMU.SetValueListItem(PFL_BILSMU_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_BILSMU.SetValueListItem(PFL_BILSMU_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_LIST, 64, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_FORM, 212, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CAPITOLO, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CAPITOLO, PPQRY_BILSMU, "A.CAPITOLO", "BILSMUCAPITO", 3, 16, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_LIST, 216, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_FORM, 348, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_ARTICOLO, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_ARTICOLO, PPQRY_BILSMU, "A.ARTICOLO", "BILSMUARTICO", 1, 2, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_LIST, 256, 36, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_LIST, "Descrizione Capitolo Sorbolo");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_FORM, 4, 28, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISOR1, MyGlb.PANEL_FORM, "Descrizione Capitolo Sorbolo");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCCAPISOR1, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCCAPISOR1, PPQRY_BILSMU, "A.SOR_DES_CAPITOLO", "BILSMUDECASO", 5, 140, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_LIST, 640, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_LIST, 116);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_FORM, 4, 52, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPISORB, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODICAPISORB, -1, GRP_BILSMU_CODICAPISORB);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODICAPISORB, PPQRY_BILSMU, "A.SOR_CODICE_STRUT", "BILSMUCOCASO", 5, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_LIST, 780, 36, 384, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_LIST, 184);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_FORM, 4, 484, 692, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_FORM, 184);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPISORB, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCCAPISORB, -1, GRP_BILSMU_CODICAPISORB);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCCAPISORB, PPQRY_DUAL, "A_GET_DES_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~BILSMUPARTE~~,~~BILSMUCOCASO~~,'SI')", "DESCODCAPSOR", 5, 99, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_LIST, 1164, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_LIST, 88);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_FORM, 228, 52, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVSOR, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODIIVLIVSOR, -1, GRP_BILSMU_CODIIVLIVSOR);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODIIVLIVSOR, PPQRY_BILSMU, "A.SOR_COD_4_LIV", "BISMCOIVLISO", 1, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_LIST, 1236, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_FORM, 4, 76, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLISO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCODIVLISO, -1, GRP_BILSMU_CODIIVLIVSOR);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCODIVLISO, PPQRY_BILSMU, "A.SOR_COD_4_LIV_DESCR", "BISMDECOIVLS", 5, 300, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_LIST, 1632, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_LIST, 88);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVSORB, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODIVLIVSORB, -1, GRP_BILSMU_CODIVLIVESOR);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODIVLIVSORB, PPQRY_BILSMU, "A.SOR_COD_5_LIV", "BILSMCOVLISO", 1, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_LIST, 1704, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_FORM, 4, 124, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVSO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCODVLIVSO, -1, GRP_BILSMU_CODIVLIVESOR);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCODVLIVSO, PPQRY_BILSMU, "A.SOR_COD_5_LIV_DESCR", "BISMDECOVLIS", 5, 300, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_LIST, 2100, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_LIST, 132);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_LIST, "Stn. Ini. Eff. Prec. Sorbolo");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRSO, MyGlb.PANEL_FORM, "Stn Ini Eff Prc. Sorb.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_STNINIEFPRSO, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_STNINIEFPRSO, PPQRY_BILSMU, "A.SOR_STANZIAMENTO_1", "BISMSTINEFPS", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_LIST, 2236, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_LIST, 124);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_LIST, "Stn. Ini. Sim. Sorbolo");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_FORM, 188, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_FORM, 136);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMSOR, MyGlb.PANEL_FORM, "Stn. Ini. Sim. Sorbolo");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_STNINISIMSOR, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_STNINISIMSOR, PPQRY_BILSMU, "A.SOR_STANZIAMENTO", "BISMSTINSISO", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_LIST, 2372, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_LIST, 92);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_LIST, "Imp./Acc. Comp. Sorbolo");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_FORM, 188, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMSOR, MyGlb.PANEL_FORM, "Im. Acc Cmp. Srb.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_IMPACCCOMSOR, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_IMPACCCOMSOR, PPQRY_BILSMU, "A.SOR_IMP_ACC_1", "BISMIMACCOSO", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_LIST, 2508, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_LIST, 92);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_LIST, "Imp./Acc. Comp. Eserc. Prec. Sorbolo");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRSO, MyGlb.PANEL_FORM, "I. Ac. Cm. Es. Pr. Srb.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_IMACCOESPRSO, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_IMACCOESPRSO, PPQRY_BILSMU, "A.SOR_IMP_ACC_2", "BISMIMACCEPS", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_LIST, 2644, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_LIST, 92);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_LIST, "Liq./Ord. Eserc. Prec. Sorbolo");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_FORM, 348, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRSO, MyGlb.PANEL_FORM, "Lq. Or. Es. Pr. Srb.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_LIQORDESPRSO, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_LIQORDESPRSO, PPQRY_BILSMU, "A.SOR_LIQ_ORD_1", "BISMLIORESPS", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_LIST, 2780, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_LIST, "Descrizione Capitolo Mezzani");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_FORM, 4, 196, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZ1, MyGlb.PANEL_FORM, "Descrizione Capitolo Mezzani");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCCAPIMEZ1, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCCAPIMEZ1, PPQRY_BILSMU, "A.MEZ_DES_CAPITOLO", "BILSMUDECAME", 5, 140, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_LIST, 3176, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_LIST, 116);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIMEZZ, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODICAPIMEZZ, -1, GRP_BILSMU_CODICAPIMEZZ);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODICAPIMEZZ, PPQRY_BILSMU, "A.MEZ_CODICE_STRUT", "BILSMUCOCAME", 5, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_LIST, 3316, 36, 384, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_LIST, 76);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_FORM, 4, 508, 584, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_FORM, 76);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIMEZZ, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCCAPIMEZZ, -1, GRP_BILSMU_CODICAPIMEZZ);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCCAPIMEZZ, PPQRY_DUAL, "A_GET_DES_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~BILSMUPARTE~~,~~BILSMUCOCAME~~,'SI')", "PMEZ", 5, 99, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_LIST, 3700, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_LIST, 88);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_FORM, 228, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVMEZ, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODIIVLIVMEZ, -1, GRP_BILSMU_CODIIVLIVMEZ);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODIIVLIVMEZ, PPQRY_BILSMU, "A.MEZ_COD_4_LIV", "BISMCOIVLIME", 1, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_LIST, 3772, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_FORM, 4, 244, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIME, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCODIVLIME, -1, GRP_BILSMU_CODIIVLIVMEZ);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCODIVLIME, PPQRY_BILSMU, "A.MEZ_COD_4_LIV_DESCR", "BISMDECOIVLM", 5, 300, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_LIST, 4168, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_LIST, 88);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_FORM, 4, 268, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVMEZZ, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODIVLIVMEZZ, -1, GRP_BILSMU_CODIVLIVEMEZ);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODIVLIVMEZZ, PPQRY_BILSMU, "A.MEZ_COD_5_LIV", "BILSMCOVLIME", 1, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_LIST, 4240, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_FORM, 4, 292, 544, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_FORM, 144);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVME, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCODVLIVME, -1, GRP_BILSMU_CODIVLIVEMEZ);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCODVLIVME, PPQRY_BILSMU, "A.MEZ_COD_5_LIV_DESCR", "BISMDECOVLIM", 5, 300, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_LIST, 4636, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_LIST, 132);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_LIST, "Stn. Ini. Eff. Prec. Mezzani");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_FORM, 188, 268, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_FORM, 144);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRME, MyGlb.PANEL_FORM, "Stn Ini Eff Prec Mezzani");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_STNINIEFPRME, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_STNINIEFPRME, PPQRY_BILSMU, "A.MEZ_STANZIAMENTO_1", "BISMSTINEFPM", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_LIST, 4772, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_LIST, 124);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_LIST, "Stn. Ini. Sim. Mezzani");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_FORM, 188, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_FORM, 136);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMMEZ, MyGlb.PANEL_FORM, "Stn. Ini. Sim. Mezzani");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_STNINISIMMEZ, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_STNINISIMMEZ, PPQRY_BILSMU, "A.MEZ_STANZIAMENTO", "BISMSTINSIME", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_LIST, 4908, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_LIST, 92);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_LIST, "Imp./Acc. Comp. Mezzani");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_FORM, 388, 268, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMMEZ, MyGlb.PANEL_FORM, "Im. Ac. Cmp. Mzz.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_IMPACCCOMMEZ, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_IMPACCCOMMEZ, PPQRY_BILSMU, "A.MEZ_IMP_ACC_1", "BISMIMACCOME", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_LIST, 5044, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_LIST, 92);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_LIST, "Imp./Acc. Comp. Eserc. Prec. Mezzani");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_FORM, 380, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRME, MyGlb.PANEL_FORM, "I. A. C. Es. P. Mzz.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_IMACCOESPRME, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_IMACCOESPRME, PPQRY_BILSMU, "A.MEZ_IMP_ACC_2", "BISMIMACCEPM", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_LIST, 5180, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_LIST, 92);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_LIST, "Liq./Ord. Eserc. Prec. Mezzani");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_FORM, 4, 316, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRME, MyGlb.PANEL_FORM, "L. Or. Es. Pr. Mzz.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_LIQORDESPRME, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_LIQORDESPRME, PPQRY_BILSMU, "A.MEZ_LIQ_ORD_1", "BISMLIORESPM", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_LIST, 5316, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_LIST, "Descrizione Capitolo Unione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_FORM, 4, 340, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNI1, MyGlb.PANEL_FORM, "Descrizione Capitolo Unione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCCAPIUNI1, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCCAPIUNI1, PPQRY_BILSMU, "A.UNI_DES_CAPITOLO", "BILSMUDECAUN", 5, 140, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_LIST, 5712, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_LIST, 112);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_FORM, 164, 316, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_FORM, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODICAPIUNIO, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODICAPIUNIO, -1, GRP_BILSMU_CODICAPIUNIO);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODICAPIUNIO, PPQRY_BILSMU, "A.UNI_CODICE_STRUT", "BILSMUCOCAUN", 5, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_LIST, 5852, 36, 384, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_LIST, 72);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_FORM, 4, 532, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_FORM, 72);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCCAPIUNIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCCAPIUNIO, -1, GRP_BILSMU_CODICAPIUNIO);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCCAPIUNIO, PPQRY_DUAL, "A_GET_DES_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~BILSMUPARTE~~,~~BILSMUCOCAUN~~,'SI')", "PUNI", 5, 99, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_LIST, 6236, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_FORM, 4, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIIVLIVUNI, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODIIVLIVUNI, -1, GRP_BILSMU_CODIIVLIVUNI);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODIIVLIVUNI, PPQRY_BILSMU, "A.UNI_COD_4_LIV", "BISMCOIVLIUN", 1, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_LIST, 6308, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_FORM, 4, 388, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_FORM, 136);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODIVLIUN, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCODIVLIUN, -1, GRP_BILSMU_CODIIVLIVUNI);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCODIVLIUN, PPQRY_BILSMU, "A.UNI_COD_4_LIV_DESCR", "BISMDECOIVLU", 5, 300, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_LIST, 6704, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_LIST, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_LIST, "Codice");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_FORM, 164, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_CODIVLIVUNIO, MyGlb.PANEL_FORM, "Codice");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_CODIVLIVUNIO, -1, GRP_BILSMU_CODIVLIVEUNI);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_CODIVLIVUNIO, PPQRY_BILSMU, "A.UNI_COD_5_LIV", "BILSMCOVLIUN", 1, 10, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_LIST, 6776, 36, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_LIST, "Descrizione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_FORM, 4, 412, 536, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_FORM, 136);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_FORM, 2);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_DESCODVLIVUN, MyGlb.PANEL_FORM, "Descrizione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_DESCODVLIVUN, -1, GRP_BILSMU_CODIVLIVEUNI);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_DESCODVLIVUN, PPQRY_BILSMU, "A.UNI_COD_5_LIV_DESCR", "BISMDECOVLIU", 5, 300, 0, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_LIST, 7172, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_LIST, 144);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_LIST, "Stn. Ini. Eff. Prec. Unione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_FORM, 324, 364, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_FORM, 144);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINIEFPRUN, MyGlb.PANEL_FORM, "Stn. Ini. Eff. Prec. Unione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_STNINIEFPRUN, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_STNINIEFPRUN, PPQRY_BILSMU, "A.UNI_STANZIAMENTO_1", "BISMSTINEFPU", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_LIST, 7308, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_LIST, "Stn. Ini. Sim. Unione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_FORM, 4, 436, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_FORM, 136);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_STNINISIMUNI, MyGlb.PANEL_FORM, "Stn. Ini. Sim. Unione");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_STNINISIMUNI, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_STNINISIMUNI, PPQRY_BILSMU, "A.UNI_STANZIAMENTO", "BISMSTINSIUN", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_LIST, 7444, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_LIST, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_LIST, "Imp./Acc. Comp. Unione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_FORM, 356, 436, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMPACCCOMUNI, MyGlb.PANEL_FORM, "Imp Acc Cmp. Un.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_IMPACCCOMUNI, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_IMPACCCOMUNI, PPQRY_BILSMU, "A.UNI_IMP_ACC_1", "BISMIMACCOUN", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_LIST, 7580, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_LIST, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_LIST, "Imp./Acc. Comp. Eserc. Prec. Unione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_FORM, 196, 436, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_IMACCOESPRUN, MyGlb.PANEL_FORM, "I. A. C. Es. Pr. Un.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_IMACCOESPRUN, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_IMACCOESPRUN, PPQRY_BILSMU, "A.UNI_IMP_ACC_2", "BISMIMACCEPU", 3, 14, 2, -13997);
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_LIST, 7716, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_LIST, 128);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_LIST, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_LIST, "Liq./Ord. Eserc. Prec. Unione");
    PAN_BILSMU.SetRect(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_FORM, 4, 460, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BILSMU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_FORM, 104);
    PAN_BILSMU.SetNumRow(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_FORM, 1);
    PAN_BILSMU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BILSMU_LIQORDESPRUN, MyGlb.PANEL_FORM, "Lq. Or. Es. Prc. Un.");
    PAN_BILSMU.SetFieldPage(PFL_BILSMU_LIQORDESPRUN, -1, -1);
    PAN_BILSMU.SetFieldPanel(PFL_BILSMU_LIQORDESPRUN, PPQRY_BILSMU, "A.UNI_LIQ_ORD_1", "BISMLIORESPU", 3, 14, 2, -13997);
  }

  private void PAN_BILSMU_InitQueries()
  {
    StringBuffer SQL;

    PAN_BILSMU.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DES_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~BILSMUPARTE~~,~~BILSMUCOCASO~~,'SI') as DESCODCAPSOR, ");
    SQL.append("  A_GET_DES_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~BILSMUPARTE~~,~~BILSMUCOCAME~~,'SI') as PMEZ, ");
    SQL.append("  A_GET_DES_CODICE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~BILSMUPARTE~~,~~BILSMUCOCAUN~~,'SI') as PUNI ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_BILSMU.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_BILSMU.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BILSMU.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_BILSMU.SetIMDB(IMDB, "PQRY_BILSMU", true);
    PAN_BILSMU.set_SetString(MyGlb.MASTER_ROWNAME, "BIL SMU");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as BILSMUPARTE, ");
    SQL.append("  A.CAPITOLO as BILSMUCAPITO, ");
    SQL.append("  A.ARTICOLO as BILSMUARTICO, ");
    SQL.append("  A.SOR_DES_CAPITOLO as BILSMUDECASO, ");
    SQL.append("  A.SOR_CODICE_STRUT as BILSMUCOCASO, ");
    SQL.append("  A.SOR_COD_4_LIV as BISMCOIVLISO, ");
    SQL.append("  A.SOR_COD_4_LIV_DESCR as BISMDECOIVLS, ");
    SQL.append("  A.SOR_COD_5_LIV as BILSMCOVLISO, ");
    SQL.append("  A.SOR_COD_5_LIV_DESCR as BISMDECOVLIS, ");
    SQL.append("  A.SOR_STANZIAMENTO_1 as BISMSTINEFPS, ");
    SQL.append("  A.SOR_STANZIAMENTO as BISMSTINSISO, ");
    SQL.append("  A.SOR_IMP_ACC_2 as BISMIMACCEPS, ");
    SQL.append("  A.SOR_IMP_ACC_1 as BISMIMACCOSO, ");
    SQL.append("  A.SOR_LIQ_ORD_1 as BISMLIORESPS, ");
    SQL.append("  A.MEZ_DES_CAPITOLO as BILSMUDECAME, ");
    SQL.append("  A.MEZ_CODICE_STRUT as BILSMUCOCAME, ");
    SQL.append("  A.MEZ_COD_4_LIV as BISMCOIVLIME, ");
    SQL.append("  A.MEZ_COD_4_LIV_DESCR as BISMDECOIVLM, ");
    SQL.append("  A.MEZ_COD_5_LIV as BILSMCOVLIME, ");
    SQL.append("  A.MEZ_COD_5_LIV_DESCR as BISMDECOVLIM, ");
    SQL.append("  A.MEZ_STANZIAMENTO_1 as BISMSTINEFPM, ");
    SQL.append("  A.MEZ_STANZIAMENTO as BISMSTINSIME, ");
    SQL.append("  A.MEZ_IMP_ACC_2 as BISMIMACCEPM, ");
    SQL.append("  A.MEZ_IMP_ACC_1 as BISMIMACCOME, ");
    SQL.append("  A.MEZ_LIQ_ORD_1 as BISMLIORESPM, ");
    SQL.append("  A.UNI_DES_CAPITOLO as BILSMUDECAUN, ");
    SQL.append("  A.UNI_CODICE_STRUT as BILSMUCOCAUN, ");
    SQL.append("  A.UNI_COD_4_LIV as BISMCOIVLIUN, ");
    SQL.append("  A.UNI_COD_4_LIV_DESCR as BISMDECOIVLU, ");
    SQL.append("  A.UNI_COD_5_LIV as BILSMCOVLIUN, ");
    SQL.append("  A.UNI_COD_5_LIV_DESCR as BISMDECOVLIU, ");
    SQL.append("  A.UNI_STANZIAMENTO_1 as BISMSTINEFPU, ");
    SQL.append("  A.UNI_STANZIAMENTO as BISMSTINSIUN, ");
    SQL.append("  A.UNI_IMP_ACC_2 as BISMIMACCEPU, ");
    SQL.append("  A.UNI_IMP_ACC_1 as BISMIMACCOUN, ");
    SQL.append("  A.UNI_LIQ_ORD_1 as BISMLIORESPU ");
    PAN_BILSMU.SetQuery(PPQRY_BILSMU, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_SMU A ");
    PAN_BILSMU.SetQuery(PPQRY_BILSMU, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILSMU.SetQuery(PPQRY_BILSMU, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILSMU.SetQuery(PPQRY_BILSMU, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_BILSMU.SetQuery(PPQRY_BILSMU, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_BILSMU.SetQuery(PPQRY_BILSMU, 5, SQL, -1, "");
    PAN_BILSMU.SetQueryDB(PPQRY_BILSMU, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BILSMU.SetMasterTable(0, "BIL_SMU");
    PAN_BILSMU.AddToSortList(PFL_BILSMU_PARTE, true);
    PAN_BILSMU.AddToSortList(PFL_BILSMU_CAPITOLO, true);
    PAN_BILSMU.AddToSortList(PFL_BILSMU_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BILSMU.Status() == 2)
    {
      int oldListQBE = PAN_BILSMU.iUseListQBE;
      PAN_BILSMU.iUseListQBE = 0;
      PAN_BILSMU.PanelCommand(Glb.PCM_SEARCH);
      PAN_BILSMU.PanelCommand(Glb.PCM_FIND);
      PAN_BILSMU.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELAB) PAN_ELAB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_BILSMU) PAN_BILSMU_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELAB) PAN_ELAB_ValidateRow(Cancel);
    if (SrcObj == PAN_BILSMU) PAN_BILSMU_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELAB) PAN_ELAB_DynamicProperties();
    if (SrcObj == PAN_BILSMU) PAN_BILSMU_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELAB) PAN_ELAB_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_BILSMU) PAN_BILSMU_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELAB) PAN_ELAB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_BILSMU) PAN_BILSMU_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
