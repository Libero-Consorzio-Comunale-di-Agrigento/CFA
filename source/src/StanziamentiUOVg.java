// **********************************************
// Stanziamenti UO Vg
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiUOVg extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_STANZIAMUOVG_PROGUNITORGA = 0;
  private static int PFL_STANZIAMUOVG_CAPITOLO = 1;
  private static int PFL_STANZIAMUOVG_ARTICOLO = 2;
  private static int PFL_STANZIAMUOVG_STANZITOTALE = 3;
  private static int PFL_STANZIAMUOVG_STANZISVILUP = 4;
  private static int PFL_STANZIAMUOVG_STANZICONSOL = 5;
  private static int PFL_STANZIAMUOVG_PREVISTOTAL1 = 6;
  private static int PFL_STANZIAMUOVG_PREVISSVILUP = 7;
  private static int PFL_STANZIAMUOVG_PREVISCONSOL = 8;
  private static int PFL_STANZIAMUOVG_IMPACCULCHTO = 9;
  private static int PFL_STANZIAMUOVG_IMPACCULCHSV = 10;
  private static int PFL_STANZIAMUOVG_IMPACCULCHCO = 11;
  private static int PFL_STANZIAMUOVG_IMPEGNABILE = 12;
  private static int PFL_STANZIAMUOVG_VARIAZIONICO = 13;
  private static int PFL_STANZIAMUOVG_VARIAZCOCONS = 14;
  private static int PFL_STANZIAMUOVG_VARIAZCOSVIL = 15;
  private static int PFL_STANZIAMUOVG_DISPONIBILIT = 16;
  private static int PFL_STANZIAMUOVG_DISPONIBCONS = 17;
  private static int PFL_STANZIAMUOVG_DISPONIBSVIL = 18;
  private static int PFL_STANZIAMUOVG_VARIMPEGNABI = 19;
  private static int PFL_STANZIAMUOVG_ESERCIZIO = 20;
  private static int PFL_STANZIAMUOVG_ES = 21;
  private static int PFL_STANZIAMUOVG_ESTVOCPEGLAB = 22;
  private static int PFL_STANZIAMUOVG_STINICOTOTAL = 23;
  private static int PFL_STANZIAMUOVG_STINICOSVITO = 24;
  private static int PFL_STANZIAMUOVG_STINICOCONTO = 25;
  private static int PFL_STANZIAMUOVG_PREVISTOTALE = 26;
  private static int PFL_STANZIAMUOVG_PREVSVILTOTA = 27;
  private static int PFL_STANZIAMUOVG_PREVCONSTOTA = 28;
  private static int PFL_STANZIAMUOVG_IMPULTCHITOT = 29;
  private static int PFL_STANZIAMUOVG_IMPULTCHSVTO = 30;
  private static int PFL_STANZIAMUOVG_IMPULTCHCOTO = 31;
  private static int PFL_STANZIAMUOVG_IMPETOTALABE = 32;
  private static int PFL_STANZIAMUOVG_STANENTRLABE = 33;
  private static int PFL_STANZIAMUOVG_PREVENTRLABE = 34;
  private static int PFL_STANZIAMUOVG_ACCULTCHENLA = 35;
  private static int PFL_STANZIAMUOVG_STANTOTALABE = 36;
  private static int PFL_STANZIAMUOVG_STANCONSLABE = 37;
  private static int PFL_STANZIAMUOVG_SVILSPESLABE = 38;
  private static int PFL_STANZIAMUOVG_PREVTOTALABE = 39;
  private static int PFL_STANZIAMUOVG_PREVCONSLABE = 40;
  private static int PFL_STANZIAMUOVG_PREVSVILLABE = 41;
  private static int PFL_STANZIAMUOVG_IMACULCHCOLA = 42;
  private static int PFL_STANZIAMUOVG_IMACULCHSVLA = 43;
  private static int PFL_STANZIAMUOVG_IMACULCHTOLA = 44;
  private static int PFL_STANZIAMUOVG_STANZIALABEL = 45;
  private static int PFL_STANZIAMUOVG_PREVISILABEL = 46;
  private static int PFL_STANZIAMUOVG_IMPULTCHILAB = 47;
  private static int PFL_STANZIAMUOVG_STATOTENTLAB = 48;
  private static int PFL_STANZIAMUOVG_PRETOTENTLAB = 49;
  private static int PFL_STANZIAMUOVG_IMACULCHENLA = 50;

  private static int PPQRY_BILUOVG = 0;

  private static int PPQRY_CAPUO = 1;


  IDPanel PAN_STANZIAMUOVG;

  // Definition of Global Variables
  private IDVariant FASE = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRUOVG(IMDB);
    //
    //
    Init_PQRY_BILUOVG(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRUOVG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRUOVG, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRUOVG, "TBL_PARAMETRUOVG");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES,5,49,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEPREVI, "ROWNAMEPREVI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEPREVI,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMESTANZ, "ROWNAMESTANZ");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_ROWNAMESTANZ,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_RONAIMACULCT, "RONAIMACULCT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRUOVG,IMDBDef3.FLD_PARAMETRUOVG_RONAIMACULCT,3,14,2);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRUOVG, 0);
  }

  private static void Init_PQRY_BILUOVG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILUOVG, 26);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILUOVG, "PQRY_BILUOVG");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, "IMP_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS, "IMP_ULT_CHIUSO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, "IMP_ULT_CHIUSO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_CONS, "VARIAZIONI_CO_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_SVIL, "VARIAZIONI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DISPONIBILITA_CONS, "DISPONIBILITA_CONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DISPONIBILITA_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DISPONIBILITA_SVIL, "DISPONIBILITA_SVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DISPONIBILITA_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VAR_IMPEGNABILE, "VAR_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_VAR_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILUOVG,IMDBDef11.PQSL_BILUOVG_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILUOVG, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiUOVg(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiUOVg()
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
    FormIdx = MyGlb.FRM_STANZIAMUOVG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "45CB0589-8F8C-4541-B33D-2CCD250A572F";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 708;
    DesignHeight = 522;
    set_Caption(new IDVariant("Stanziamenti UO Vg"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 708;
    Frames[1].Height = 496;
    Frames[1].Caption = "Stanziamenti U O Vg";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 496;
    PAN_STANZIAMUOVG = new IDPanel(w, this, 1, "PAN_STANZIAMUOVG");
    Frames[1].Content = PAN_STANZIAMUOVG;
    PAN_STANZIAMUOVG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZIAMUOVG.VS = MainFrm.VisualStyleList;
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 708-MyGlb.PAN_OFFS_X, 496-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "81F2D621-87F4-4BFB-A83D-6F0DED1B7421");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 16, 48, 1180, 252, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 48);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STANZIAMUOVG.InitStatus = 1;
    PAN_STANZIAMUOVG_Init();
    PAN_STANZIAMUOVG_InitFields();
    PAN_STANZIAMUOVG_InitQueries();
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
      PAN_STANZIAMUOVG.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentiUOVg);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiUOVg.class.getName() : (Glb.ClassWithPackage(StanziamentiUOVg.class) ? StanziamentiUOVg.class.getName().substring(StanziamentiUOVg.class.getPackage().getName().length() + 1) : StanziamentiUOVg.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Stanziamenti U O Vg After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_STANZIAMUOVG_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Vg After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STATOTENTLAB, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PRETOTENTLAB, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMACULCHENLA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOTOTAL, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOCONTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZICONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOSVITO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZISVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVISTOTALE, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVSVILTOTA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISSVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVCONSTOTA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISCONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHITOT, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHSVTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHSV), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHCOTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHCO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMPEGNABILE, 0))))
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPETOTALABE, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPEGNABILE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "StanziamentiUOVgAfterFindEvent", _e);
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEFORSTAUO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMEPANSTAUO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Capitolo ", IDVariant.STRING));
      v_NOMEFORSTAUO = (new IDVariant("Stanziamenti U.O.", IDVariant.STRING));
      v_NOMEPANSTAUO = (new IDVariant("Stanziamenti U.O.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_NOMEFORSTAUO));
      set_Caption(new IDVariant(v_NOMEPANSTAUO));
      FASE = MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      if (FASE.equals((new IDVariant(0)), true) || FASE.equals((new IDVariant(1)), true))
      {
        PAN_STANZIAMUOVG.set_Locked((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_STANZIAMUOVG.set_Locked((new IDVariant(-1)).booleanValue());
      }
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_ESTVOCPEGLAB, IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMECAPIT, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEARTIC, 0))).stringValue());
      PAN_STANZIAMUOVG.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMUOVG.SetCommandEnabled((new IDVariant(64)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMUOVG.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMUOVG.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMUOVG.SetCommandEnabled((new IDVariant(131072)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIAMUOVG.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
      if (IMDB.Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        // 
        // etichette con con i totali delle rispettive colonne relative a spesa vengono rese invisibili
        // 
        {
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        // 
        // etichette con le intestazione delle colonne relative al filtro spesa vengono rese invisibili
        // 
        {
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        // PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        // PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        // 
        // etichette con intestazioni delle rispettive colonne al filtro entrata vengono rese invisibili
        // 
        {
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        // 
        // etichette con la somme delle rispettive colonne relative al filtro entrata vengono rese invisibili
        // 
        {
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (MainFrm.GESTIOIMPEGN.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STANZIAMUOVG.set_ObjRect(Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, IDPanel.RT_WIDTH, Glb.PANEL_LIST, (new IDVariant(0)).intValue());
        }
      }
      // 
      // campi opzionali
      // 
      {
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, ((new IDVariant(-1)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      }
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "LoadEvent", _e);
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MSG3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTROLLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_MSG1 = (new IDVariant("Stanziamento Unità Organizzative inferiore allo Stanziamento", IDVariant.STRING));
      v_MSG2 = (new IDVariant("Previsione Unità Organizzative inferiore a Previsione", IDVariant.STRING));
      v_MSG3 = (new IDVariant("Imp Ult. Chiuso Unità Organizzative inferiore a Imp. Ult. Chiuso", IDVariant.STRING));
      v_CONTROLLO = (new IDVariant(0, IDVariant.INTEGER));
      // 
      // Unload Event Body
      // Procedure Body
      // 
      if (Confirm.equals((new IDVariant(-1)), true))
      {
        // 
        // controllo se importi sono inferiori rispetto alla riga di partenza
        // 
        {
          if ((IDL.ToFloat((new IDVariant(PAN_STANZIAMUOVG.FieldText(PFL_STANZIAMUOVG_STINICOTOTAL)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMESTANZ, 0),(new IDVariant(0))), true)<0))
          {
            v_CONTROLLO = (new IDVariant(-1));
            v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG1), (new IDVariant("<BR/>")));
          }
          if (IDL.ToFloat((new IDVariant(PAN_STANZIAMUOVG.FieldText(PFL_STANZIAMUOVG_PREVISTOTALE)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEPREVI, 0),(new IDVariant(0))), true)<0)
          {
            v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG2), (new IDVariant("<BR/>")));
            v_CONTROLLO = (new IDVariant(-1));
          }
          if (IDL.ToFloat((new IDVariant(PAN_STANZIAMUOVG.FieldText(PFL_STANZIAMUOVG_IMPULTCHITOT)))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_RONAIMACULCT, 0),(new IDVariant(0))), true)<0)
          {
            v_MSG = IDL.Add(IDL.Add(v_MSG, v_MSG3), (new IDVariant("<BR/>")));
            v_CONTROLLO = (new IDVariant(-1));
          }
          if (v_CONTROLLO.booleanValue())
          {
            MainFrm.set_AlertMessage(v_MSG); 
          }
        }
        // 
        // salvo dati del pannello
        // 
        {
          if (new IDVariant(PAN_STANZIAMUOVG.Status()).equals((new IDVariant(3)), true))
          {
            ValidaRow();
            PAN_STANZIAMUOVG.PanelCommand(Glb.PCM_UPDATE);
          }
          if (!(new IDVariant(PAN_STANZIAMUOVG.Status()).equals((new IDVariant(2)), true)))
          {
            Cancel.set((new IDVariant(-1)));
            return;
          }
        }
        Svuotaparametri();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Vg On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STANZIAMUOVG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STANZIAMUOVG);
      // 
      // Stanziamenti U O Vg On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PROGR_UNITA_ORGANIZZATIVA, 0))) && !(PAN_STANZIAMUOVG.IsNewRow()))
      {
        PAN_STANZIAMUOVG.SetFlags (Glb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "StanziamentiUOVgOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Vg Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_STANZIAMUOVG_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Vg Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_ESERCIZIO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEESERC, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_E_S, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_CAPITOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMECAPIT, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_ARTICOLO, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEARTIC, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_DISPONIBILITA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_DISPONIBILITA_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_DISPONIBILITA_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "StanziamentiUOVgBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Vg On Database Error Event
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
  private void PAN_STANZIAMUOVG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_STANZIAMUOVG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Stanziamenti U O Vg On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      if (ErrorMessage.compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage(ErrorMessage); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "StanziamentiUOVgOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Vg On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STANZIAMUOVG_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Vg On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(32)), true))
      {
        AggiornaEtichetteTotali();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "StanziamentiUOVgOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Vg On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_STANZIAMUOVG_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_STANZIAMUOVG, Cancel);
      // 
      // Stanziamenti U O Vg On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        // 
        // stinicototale
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOTOTAL, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // stinicosvil
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOSVITO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZISVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // stniconstotale
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOCONTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZICONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // previsione totale
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVISTOTALE, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // previsione sviluppo
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVSVILTOTA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISSVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // previsione consolidato c
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVCONSTOTA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISCONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impultchiuso
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHITOT, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impultchiusosviluppo
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHSVTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHSV), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impultchiusoconsolidato
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHCOTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHCO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
        // 
        // impegnabile totale c
        // 
        {
          PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPETOTALABE, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPEGNABILE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "StanziamentiUOVgOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamenti U O Vg After Delete Event
  // Evento notificato dopo la cancellazione della riga
  // dal database.
  // **********************************************************************
  private void PAN_STANZIAMUOVG_AfterDelete()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamenti U O Vg After Delete Event Body
      // Procedure Body
      // 
      AggiornaEtichetteTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "StanziamentiUOVgAfterDeleteEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Stanziamenti Totale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_STANZITOTALE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Stanziamenti Totale Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_FILTREFFETVG, IMDBDef3.FLD_FILTREFFETVG_ROWNAMEENTRA, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STATOTENTLAB, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0)));
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOTOTAL, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZITOTALE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOStanziamentiTotaleValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Stanziamenti Consolidato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_STANZICONSOL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Stanziamenti Consolidato Validate Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0)));
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOCONTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZICONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOStanziamentiConsolidatoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Stanziamenti Sviluppo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_STANZISVILUP_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Stanziamenti Sviluppo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO, 0)));
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOSVITO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZISVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOStanziamentiSviluppoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Imp Acc Ult Chiuso Totale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_IMPACCULCHTO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Imp Acc Ult Chiuso Totale Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0)));
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHITOT, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      else
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMACULCHENLA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOImpAccUltChiusoTotaleValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Imp Acc Ult Chiuso Consolidato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_IMPACCULCHCO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Imp Acc Ult Chiuso Consolidato Validate Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0)));
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHCOTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHCO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOImpAccUltChiusoConsolidatoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Imp Acc Ult Chiuso Sviluppo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_IMPACCULCHSV_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Imp Acc Ult Chiuso Sviluppo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0)));
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHSVTO, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHSV), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOImpAccUltChiusoSviluppoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Previsione Consolidato Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_PREVISCONSOL_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Previsione Consolidato Validate Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0)));
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVCONSTOTA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISCONSOL), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOPrevisioneConsolidatoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Previsione Totale Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_PREVISTOTAL1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Previsione Totale Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0)));
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVISTOTALE, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
      else
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PRETOTENTLAB, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISTOTAL1), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOPrevisioneTotaleValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Previsione Sviluppo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_PREVISSVILUP_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Previsione Sviluppo Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_CONS, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE, 0), IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0)));
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVSVILTOTA, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISSVILUP), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOPrevisioneSviluppoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // BIL UO Impegnabile Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_STANZIAMUOVG_IMPEGNABILE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL UO Impegnabile Validate Event Body
      // Procedure Body
      // 
      PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPETOTALABE, IDL.Format(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPEGNABILE), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "BILUOImpegnabileValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Svuotaparametri
  // **********************************************************************
  public int Svuotaparametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Svuotaparametri Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEESERC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEPREVI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMESTANZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_RONAIMACULCT, 0, (new IDVariant()));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "Svuotaparametri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Valida Row
  // **********************************************************************
  public int ValidaRow ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Valida Row Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        IMDB.set_Value(IMDBDef11.PQRY_BPRUO, IMDBDef11.PQSL_BPRUO_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "ValidaRow", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiorna Etichette Totali
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int AggiornaEtichetteTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Etichette Totali Body
      // Procedure Body
      // 
      // 
      // nota
      // devo fare il refreshquery per accertarmi i campi del
      // pannello siano aggiornati. Nel mio caso specifico se
      // modifico i campi di pannello e cliccolo sul comando
      // Annulla i campi non vengono aggiornati 
      // 
      // 
      {
        PAN_STANZIAMUOVG.PanelCommand(Glb.PCM_REQUERY);
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STATOTENTLAB, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZITOTALE)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PRETOTENTLAB, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISTOTAL1)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMACULCHENLA, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHTO)).stringValue());
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRUOVG, IMDBDef3.FLD_PARAMETRUOVG_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      {
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOTOTAL, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZITOTALE)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOSVITO, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZISVILUP)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_STINICOCONTO, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_STANZICONSOL)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVISTOTALE, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISTOTAL1)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVSVILTOTA, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISSVILUP)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_PREVCONSTOTA, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_PREVISCONSOL)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHITOT, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHTO)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHSVTO, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHSV)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPULTCHCOTO, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPACCULCHCO)).stringValue());
        PAN_STANZIAMUOVG.set_FieldText(PFL_STANZIAMUOVG_IMPETOTALABE, IDL.ToString(PAN_STANZIAMUOVG.GetFieldSum(PFL_STANZIAMUOVG_IMPEGNABILE)).stringValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiUOVg", "AggiornaEtichetteTotali", _e);
      return -1;
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
  private void PAN_STANZIAMUOVG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STANZIAMUOVG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_STANZITOTALE)
      {
        PFL_STANZIAMUOVG_STANZITOTALE_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_STANZISVILUP)
      {
        PFL_STANZIAMUOVG_STANZISVILUP_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_STANZICONSOL)
      {
        PFL_STANZIAMUOVG_STANZICONSOL_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_PREVISTOTAL1)
      {
        PFL_STANZIAMUOVG_PREVISTOTAL1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_PREVISSVILUP)
      {
        PFL_STANZIAMUOVG_PREVISSVILUP_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_PREVISCONSOL)
      {
        PFL_STANZIAMUOVG_PREVISCONSOL_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_IMPACCULCHTO)
      {
        PFL_STANZIAMUOVG_IMPACCULCHTO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_IMPACCULCHSV)
      {
        PFL_STANZIAMUOVG_IMPACCULCHSV_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_IMPACCULCHCO)
      {
        PFL_STANZIAMUOVG_IMPACCULCHCO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_STANZIAMUOVG_IMPEGNABILE)
      {
        PFL_STANZIAMUOVG_IMPEGNABILE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_STANZIAMUOVG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_STN_INI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_PREVISIONE_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_IMP_ULT_CHIUSO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_BILUOVG, IMDBDef11.PQSL_BILUOVG_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_STANZIAMUOVG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STANZIAMUOVG_Init()
  {

    PAN_STANZIAMUOVG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STANZIAMUOVG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_STANZIAMUOVG.SetSize(MyGlb.OBJ_FIELD, 51);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, "6CBD135F-DC4E-4930-BEF7-DB62788C5A94");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, "Prog. Unità Organizzativa");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, "652D51C7-5DF1-4F48-B2A7-01C02B5A080C");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, "CAPITOLO");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, "5C41BC27-6FA0-4D5F-9EF7-B163EC10F163");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, "ARTICOLO");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, "7707F402-2573-47DF-BC4E-DDF0CF1459CC");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, "Stanziamenti Totale");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, "053EC075-0533-4FBF-BE96-E9B4DE97CBF1");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, "Stanziamenti Sviluppo");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, "64CFB8E7-07F8-4AC6-8510-31F745461C0B");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, "Stanziamenti Consolidato");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, "5BE5EBFA-E55B-4EA9-BA88-9DDEA8849A88");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, "Previsione Totale");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, "19E71D75-CC29-4EC9-83FC-1CB7344E98AF");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, "Previsione Sviluppo");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, "D3340987-288B-4CA3-805E-26719EA974D4");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, "Previsione Consolidato");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, "F6F03158-CF47-4AF0-9128-4C466CAF9B6E");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, "Imp Acc Ult Chiuso Totale");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, "A58663BF-6AEB-4A7A-A981-76D561C02092");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, "Imp Acc Ult Chiuso Sviluppo");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, "8EB57861-64ED-478F-8737-053CFB164BAB");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, "Imp Acc Ult Chiuso Consolidato");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, "3912B0F6-6B28-4B26-8114-583C2A81EA88");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, "Impegnabile");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, "8C517663-36F6-4170-8E77-6FBAA08BBCA6");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, "VARIAZIONI CO");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, 0, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, "CD79985B-8B07-4FBB-9DAF-E91EBB2A0DED");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, "BFFFD7E1-C5A3-4921-A008-06145F384E58");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, "26AA3A71-778D-4726-B41E-13F9AFF0744A");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, "DISPONIBILITA");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, 0, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, "BB5EDDAB-02A8-46A3-826A-0DAF260781FC");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, "DISPONIBILITA CONS");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, "A6EEE4F0-7145-4911-A352-371B6EE5283A");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, "DISPONIBILITA SVIL");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, "F626691D-3B48-409C-9F9D-84CE6B8B2765");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, "VAR IMPEGNABILE");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, "7A916D9B-D684-463A-836E-A7F6AF6DC665");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, "ESERCIZIO");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, "D7F52ACC-AC3B-4B07-B4BA-E807A5E1C46F");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, "E S");
    PAN_STANZIAMUOVG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, "9737A97C-A560-4508-A3F8-0CE637016F42");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, MyGlb.VIS_ETICHEGRASSE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, "AAD380C1-1EAF-4E5B-8D4F-4CA4B879FBCD");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, "9D2CD161-7BC8-496B-BC61-DBC23131E3E9");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, "406C3A65-EF62-4075-B117-0CB438D73349");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, "9296835F-8548-44B4-8FD0-0ED399EA5680");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, "97EDE6B3-749B-4A31-B4E9-BA663E551842");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, "51C51DC5-66BB-4E8C-9035-56C4D097F70F");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, "3EF10728-0424-4652-BC61-86E1FC68231A");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, "FC223D81-A675-401F-BD2B-BCF1F774AB18");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, "A7BC018D-A832-4923-A99D-C9687C3A98AA");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, "7977CEC4-87FD-4412-A7FA-301967A5F54D");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, "519AA97A-6AC2-47DE-90E3-1C49614E9E50");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, "Stanziamento");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, "1FB53D98-0784-4710-A64D-A05A8ACE0EBC");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, "Previsione");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, "4D110764-B079-4BFD-A8A9-CBB5EA644F22");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, "Acc. Ult. Chiuso");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, "4FECF7ED-1DF2-429F-AFB4-46C3D57C3532");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, "Totale");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, "3B6CC2F3-2639-4FD2-9C9A-363DB820DBD8");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, "Consolidato");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, "C8107E23-2CB8-40EE-B870-6CBBEB968BB9");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, "Sviluppo");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, "F6123C1F-D765-48A4-801D-601F5686AB15");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, "Totale");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, "D62A26A2-39C2-47AF-9959-9E8E4617F270");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, "Consolidato");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, "EC366858-1593-4A63-B3E4-6B8C49CA5CA1");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, "Sviluppo");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, "DB533647-A1E6-48B9-84C0-3B16ABD22B56");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, "Consolidato");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, "031CE41A-3875-4288-931F-E4CC0DC666A0");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, "Sviluppo");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, "6E52DDCC-594E-4E65-900B-86B741FE8BE5");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, "Totale");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, "57EAE4E5-AF28-4203-A330-21A6DB89E9EE");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, "Stanziamento");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, "42A7DDBE-418F-48EA-ABE7-4D55011E0D48");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, "Previsione");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, "B790516E-D92B-4272-92B8-AF69648AAD7E");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, "Imp. Ult. Chiuso");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, MyGlb.VIS_LABEVISUSTYL);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, "2C4B4F90-2C27-4557-85F1-F646FFEAC8D8");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, "6D5358DA-54FE-42A4-AEE8-B9AA46CC0D69");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STANZIAMUOVG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, "71DEF720-610F-433B-A213-E14E8288EBB3");
    PAN_STANZIAMUOVG.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, "");
    PAN_STANZIAMUOVG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, MyGlb.VIS_CAMPOTOTALE);
    PAN_STANZIAMUOVG.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_STANZIAMUOVG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_LIST, 16, 100, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_LIST, "Prog. Unità Organizzativa");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PROGUNITORGA, MyGlb.PANEL_FORM, "Prog. Unità Organizzativa");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PROGUNITORGA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PROGUNITORGA, PPQRY_BILUOVG, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_LIST, 140, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_LIST, "CAP.");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_FORM, 436, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_FORM, 72);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_CAPITOLO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_CAPITOLO, PPQRY_BILUOVG, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_LIST, 180, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_ARTICOLO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_ARTICOLO, PPQRY_BILUOVG, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_LIST, 196, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_LIST, "Stanziamenti Totale");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZITOTALE, MyGlb.PANEL_FORM, "Stanziamenti Totale");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STANZITOTALE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STANZITOTALE, PPQRY_BILUOVG, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_LIST, 296, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_LIST, 88);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_LIST, "Stanziamenti Sviluppo");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZISVILUP, MyGlb.PANEL_FORM, "Stanziamenti Sviluppo");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STANZISVILUP, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STANZISVILUP, PPQRY_BILUOVG, "A.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_LIST, 396, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_LIST, 96);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_LIST, "Stanziamenti Consolidato");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_FORM, 236, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_FORM, 112);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZICONSOL, MyGlb.PANEL_FORM, "Stanziam. Consol.");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STANZICONSOL, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STANZICONSOL, PPQRY_BILUOVG, "A.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_LIST, 496, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_LIST, 68);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_LIST, "Previsione Totale");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_FORM, 4, 76, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTAL1, MyGlb.PANEL_FORM, "Previsione Totale");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVISTOTAL1, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVISTOTAL1, PPQRY_BILUOVG, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_LIST, 596, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_LIST, 92);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_LIST, "Previsione Sviluppo");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_FORM, 412, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_FORM, 104);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISSVILUP, MyGlb.PANEL_FORM, "Previs. Sviluppo");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVISSVILUP, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVISSVILUP, PPQRY_BILUOVG, "A.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_LIST, 696, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_LIST, 100);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_LIST, "Previsione Consolidato");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_FORM, 220, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_FORM, 112);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISCONSOL, MyGlb.PANEL_FORM, "Previs. Consol.");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVISCONSOL, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVISCONSOL, PPQRY_BILUOVG, "A.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_LIST, 796, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_LIST, 92);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_LIST, "Imp Acc Ult Chiuso Totale");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_FORM, 412, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_FORM, 104);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHTO, MyGlb.PANEL_FORM, "I. Ac. Ul. Ch. Tot.");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPACCULCHTO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPACCULCHTO, PPQRY_BILUOVG, "A.IMP_ULT_CHIUSO", "IMP_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_LIST, 896, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_LIST, 116);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_LIST, "Imp Acc Ult Chiuso Sviluppo");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_FORM, 220, 52, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_FORM, 128);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHSV, MyGlb.PANEL_FORM, "Imp Acc Ult Ch. Svil.");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPACCULCHSV, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPACCULCHSV, PPQRY_BILUOVG, "A.IMP_ULT_CHIUSO_SVIL", "IMP_ULT_CHIUSO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_LIST, 996, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_LIST, 120);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_LIST, "Imp Acc Ult Chiuso Consolidato");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPACCULCHCO, MyGlb.PANEL_FORM, "Imp Acc Ult Ch. Consol.");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPACCULCHCO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPACCULCHCO, PPQRY_BILUOVG, "A.IMP_ULT_CHIUSO_CONS", "IMP_ULT_CHIUSO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_LIST, 1096, 100, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_LIST, 76);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_LIST, "Impegnabile");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_FORM, 220, 196, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_FORM, 88);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPEGNABILE, MyGlb.PANEL_FORM, "Impegnabile");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPEGNABILE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPEGNABILE, PPQRY_BILUOVG, "A.IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_LIST, 736, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_LIST, 88);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_LIST, "VARIAZ. CO");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_FORM, 220, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_FORM, 104);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZIONICO, MyGlb.PANEL_FORM, "VARIAZIONI CO");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_VARIAZIONICO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_VARIAZIONICO, PPQRY_BILUOVG, "A.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 736, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 120);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_LIST, "VARIAZ. CO CONS");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZIONI CO CONS");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_VARIAZCOCONS, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_VARIAZCOCONS, PPQRY_BILUOVG, "A.VARIAZIONI_CO_CONS", "VARIAZIONI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 736, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 112);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VARIAZ. CO SVIL");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 220, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 128);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZIONI CO SVIL");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_VARIAZCOSVIL, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_VARIAZCOSVIL, PPQRY_BILUOVG, "A.VARIAZIONI_CO_SVIL", "VARIAZIONI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_LIST, 1264, 120, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_LIST, 84);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_LIST, "DISPON.");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 172, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBILIT, MyGlb.PANEL_FORM, "DISPONIBILITA");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_DISPONIBILIT, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_DISPONIBILIT, PPQRY_BILUOVG, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_LIST, 1264, 120, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_LIST, 116);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_LIST, "DISPON. CONS");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_FORM, 236, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_FORM, 128);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBCONS, MyGlb.PANEL_FORM, "DISPONIBILITA CONS");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_DISPONIBCONS, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_DISPONIBCONS, PPQRY_BILUOVG, "A.DISPONIBILITA_CONS", "DISPONIBILITA_CONS", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_LIST, 1264, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_LIST, 108);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_LIST, "DISPON. SVIL");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_FORM, 136);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_DISPONIBSVIL, MyGlb.PANEL_FORM, "DISPONIBILITA SVIL");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_DISPONIBSVIL, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_DISPONIBSVIL, PPQRY_BILUOVG, "A.DISPONIBILITA_SVIL", "DISPONIBILITA_SVIL", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_LIST, 1328, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_LIST, 100);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_LIST, "VAR IMP.");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_FORM, 364, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_FORM, 112);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_VARIMPEGNABI, MyGlb.PANEL_FORM, "VAR IMPEGNABILE");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_VARIMPEGNABI, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_VARIMPEGNABI, PPQRY_BILUOVG, "A.VAR_IMPEGNABILE", "VAR_IMPEGNABILE", 3, 14, 2, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_LIST, 0, 120, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_FORM, 4, 244, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_ESERCIZIO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_ESERCIZIO, PPQRY_BILUOVG, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_LIST, 0, 120, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_LIST, 24);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_LIST, "E S");
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_FORM, 4, 244, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_FORM, 24);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ES, MyGlb.PANEL_FORM, "E S");
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_ES, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_ES, PPQRY_BILUOVG, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 16, 8, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 16, 8, 156, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ESTVOCPEGLAB, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_ESTVOCPEGLAB, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_ESTVOCPEGLAB, -1, "", "ESTVOCPEGLAB", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, MyGlb.PANEL_LIST, 196, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, MyGlb.PANEL_FORM, 108, 332, 80, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOTOTAL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STINICOTOTAL, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STINICOTOTAL, -1, "", "STINICOTOTAL", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, MyGlb.PANEL_LIST, 296, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, MyGlb.PANEL_FORM, 400, 320, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOSVITO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STINICOSVITO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STINICOSVITO, -1, "", "STINICOSVITO", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, MyGlb.PANEL_LIST, 396, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, MyGlb.PANEL_FORM, 216, 336, 40, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STINICOCONTO, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STINICOCONTO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STINICOCONTO, -1, "", "STINICOCONTO", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, MyGlb.PANEL_LIST, 496, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, MyGlb.PANEL_FORM, 72, 368, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVISTOTALE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVISTOTALE, -1, "", "PREVISTOTALE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, MyGlb.PANEL_LIST, 596, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, MyGlb.PANEL_FORM, 260, 320, 72, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILTOTA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVSVILTOTA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVSVILTOTA, -1, "", "PREVSVILTOTA", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, MyGlb.PANEL_LIST, 696, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, MyGlb.PANEL_FORM, 252, 352, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSTOTA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVCONSTOTA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVCONSTOTA, -1, "", "PREVCONSTOTA", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, MyGlb.PANEL_LIST, 796, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, MyGlb.PANEL_FORM, 472, 320, 32, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHITOT, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPULTCHITOT, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPULTCHITOT, -1, "", "IMPULTCHITOT", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, MyGlb.PANEL_LIST, 896, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, MyGlb.PANEL_FORM, 524, 324, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHSVTO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPULTCHSVTO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPULTCHSVTO, -1, "", "IMPULTCHSVTO", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, MyGlb.PANEL_LIST, 996, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, MyGlb.PANEL_FORM, 584, 324, 12, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHCOTO, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPULTCHCOTO, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPULTCHCOTO, -1, "", "IMPULTCHCOTO", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, MyGlb.PANEL_LIST, 1096, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, MyGlb.PANEL_FORM, 676, 320, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPETOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPETOTALABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPETOTALABE, -1, "", "IMPETOTALABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, MyGlb.PANEL_LIST, 196, 48, 100, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, MyGlb.PANEL_FORM, 192, 160, 76, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANENTRLABE, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STANENTRLABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STANENTRLABE, -1, "", "STANENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, MyGlb.PANEL_LIST, 296, 48, 100, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, MyGlb.PANEL_FORM, 192, 132, 44, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVENTRLABE, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVENTRLABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVENTRLABE, -1, "", "PREVENTRLABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 396, 48, 100, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, MyGlb.PANEL_LIST, 3);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 300, 140, 36, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_ACCULTCHENLA, MyGlb.PANEL_FORM, 3);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_ACCULTCHENLA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_ACCULTCHENLA, -1, "", "ACCULTCHENLA", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, MyGlb.PANEL_LIST, 196, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, MyGlb.PANEL_FORM, 96, 132, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANTOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STANTOTALABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STANTOTALABE, -1, "", "STANTOTALABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, MyGlb.PANEL_LIST, 396, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, MyGlb.PANEL_FORM, 180, 128, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANCONSLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STANCONSLABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STANCONSLABE, -1, "", "STANCONSLABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, MyGlb.PANEL_LIST, 296, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, MyGlb.PANEL_FORM, 252, 128, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_SVILSPESLABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_SVILSPESLABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_SVILSPESLABE, -1, "", "SVILSPESLABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, MyGlb.PANEL_LIST, 496, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, MyGlb.PANEL_FORM, 96, 128, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVTOTALABE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVTOTALABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVTOTALABE, -1, "", "PREVTOTALABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, MyGlb.PANEL_LIST, 696, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, MyGlb.PANEL_FORM, 168, 132, 44, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVCONSLABE, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVCONSLABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVCONSLABE, -1, "", "PREVCONSLABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, MyGlb.PANEL_LIST, 596, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, MyGlb.PANEL_FORM, 248, 136, 44, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVSVILLABE, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVSVILLABE, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVSVILLABE, -1, "", "PREVSVILLABE", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, MyGlb.PANEL_LIST, 996, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, MyGlb.PANEL_FORM, 484, 128, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHCOLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMACULCHCOLA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMACULCHCOLA, -1, "", "IMACULCHCOLA", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, MyGlb.PANEL_LIST, 896, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, MyGlb.PANEL_FORM, 576, 136, 44, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHSVLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMACULCHSVLA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMACULCHSVLA, -1, "", "IMACULCHSVLA", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, MyGlb.PANEL_LIST, 796, 72, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, MyGlb.PANEL_FORM, 644, 136, 24, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHTOLA, MyGlb.PANEL_FORM, 2);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMACULCHTOLA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMACULCHTOLA, -1, "", "IMACULCHTOLA", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, MyGlb.PANEL_LIST, 196, 48, 300, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, MyGlb.PANEL_FORM, 96, 72, 192, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STANZIALABEL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STANZIALABEL, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STANZIALABEL, -1, "", "STANZIALABEL", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, MyGlb.PANEL_LIST, 496, 48, 300, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, MyGlb.PANEL_FORM, 292, 72, 188, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PREVISILABEL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PREVISILABEL, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PREVISILABEL, -1, "", "PREVISILABEL", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, MyGlb.PANEL_LIST, 796, 48, 300, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, MyGlb.PANEL_FORM, 480, 72, 192, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMPULTCHILAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMPULTCHILAB, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMPULTCHILAB, -1, "", "IMPULTCHILAB", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, MyGlb.PANEL_LIST, 196, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, MyGlb.PANEL_FORM, 96, 348, 64, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_STATOTENTLAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_STATOTENTLAB, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_STATOTENTLAB, -1, "", "STATOTENTLAB", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, MyGlb.PANEL_LIST, 296, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, MyGlb.PANEL_FORM, 164, 348, 20, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_PRETOTENTLAB, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_PRETOTENTLAB, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_PRETOTENTLAB, -1, "", "PRETOTENTLAB", 0, 0, 0, -13997);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, MyGlb.PANEL_LIST, 396, 324, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, MyGlb.PANEL_LIST, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIAMUOVG.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, MyGlb.PANEL_FORM, 196, 348, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIAMUOVG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, MyGlb.PANEL_FORM, 0);
    PAN_STANZIAMUOVG.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIAMUOVG_IMACULCHENLA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIAMUOVG.SetFieldPage(PFL_STANZIAMUOVG_IMACULCHENLA, -1, -1);
    PAN_STANZIAMUOVG.SetFieldPanel(PFL_STANZIAMUOVG_IMACULCHENLA, -1, "", "IMACULCHENLA", 0, 0, 0, -13997);
  }

  private void PAN_STANZIAMUOVG_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZIAMUOVG.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UNITA_ORGANIZZATIVA~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRUOVG.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRUOVG.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRUOVG.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRUOVG.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    SQL.append("order by 2 ");
    PAN_STANZIAMUOVG.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_STANZIAMUOVG_PROGUNITORGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUODESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRUOVG.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRUOVG.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRUOVG.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRUOVG.ROWNAMEARTIC~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G' AND ((A.SCADENZA IS NULL) OR A.SCADENZA > TRUNC( SYSDATE ))) ");
    SQL.append("order by 2 ");
    PAN_STANZIAMUOVG.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_STANZIAMUOVG_PROGUNITORGA, "");
    PAN_STANZIAMUOVG.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIAMUOVG.SetIMDB(IMDB, "PQRY_BILUOVG", true);
    PAN_STANZIAMUOVG.set_SetString(MyGlb.MASTER_ROWNAME, "BIL UO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMP_ULT_CHIUSO as IMP_ULT_CHIUSO, ");
    SQL.append("  A.IMP_ULT_CHIUSO_CONS as IMP_ULT_CHIUSO_CONS, ");
    SQL.append("  A.IMP_ULT_CHIUSO_SVIL as IMP_ULT_CHIUSO_SVIL, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.PREVISIONE_CONS as PREVISIONE_CONS, ");
    SQL.append("  A.PREVISIONE_SVIL as PREVISIONE_SVIL, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.STN_INI_CO_CONS as STN_INI_CO_CONS, ");
    SQL.append("  A.STN_INI_CO_SVIL as STN_INI_CO_SVIL, ");
    SQL.append("  A.VARIAZIONI_CO as VARIAZIONI_CO, ");
    SQL.append("  A.VARIAZIONI_CO_CONS as VARIAZIONI_CO_CONS, ");
    SQL.append("  A.VARIAZIONI_CO_SVIL as VARIAZIONI_CO_SVIL, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.DISPONIBILITA_CONS as DISPONIBILITA_CONS, ");
    SQL.append("  A.DISPONIBILITA_SVIL as DISPONIBILITA_SVIL, ");
    SQL.append("  A.IMPEGNABILE as IMPEGNABILE, ");
    SQL.append("  A.VAR_IMPEGNABILE as VAR_IMPEGNABILE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA ");
    PAN_STANZIAMUOVG.SetQuery(PPQRY_BILUOVG, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_UO A ");
    PAN_STANZIAMUOVG.SetQuery(PPQRY_BILUOVG, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRUOVG.ROWNAMEESERC~~ AND A.E_S = ~~TBL_PARAMETRUOVG.ROWNAMEES~~ AND A.CAPITOLO = ~~TBL_PARAMETRUOVG.ROWNAMECAPIT~~ AND A.ARTICOLO = ~~TBL_PARAMETRUOVG.ROWNAMEARTIC~~) ");
    PAN_STANZIAMUOVG.SetQuery(PPQRY_BILUOVG, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMUOVG.SetQuery(PPQRY_BILUOVG, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMUOVG.SetQuery(PPQRY_BILUOVG, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIAMUOVG.SetQuery(PPQRY_BILUOVG, 5, SQL, -1, "");
    PAN_STANZIAMUOVG.SetQueryDB(PPQRY_BILUOVG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIAMUOVG.SetMasterTable(0, "BIL_UO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STANZIAMUOVG.Status() == 2)
    {
      int oldListQBE = PAN_STANZIAMUOVG.iUseListQBE;
      PAN_STANZIAMUOVG.iUseListQBE = 0;
      PAN_STANZIAMUOVG.PanelCommand(Glb.PCM_SEARCH);
      PAN_STANZIAMUOVG.PanelCommand(Glb.PCM_FIND);
      PAN_STANZIAMUOVG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_AfterDelete();
  }    

  public void AfterFind(IDPanel SrcObj, IDVariant CmdFind)
  {
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_STANZIAMUOVG) PAN_STANZIAMUOVG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
