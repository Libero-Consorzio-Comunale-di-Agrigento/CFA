// **********************************************
// Stanziamento Bilancio Effettivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentoBilancioEffettivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_STANZIBILANC_STANZDICOMPE = 0;
  private static int GRP_STANZIBILANC_INSERIMENTO = 1;
  private static int GRP_STANZIBILANC_AGGIORNAMENT = 2;

  private static int PFL_STANZIBILANC_INTESTALABEL = 0;
  private static int PFL_STANZIBILANC_PURA = 1;
  private static int PFL_STANZIBILANC_REISCDAESIGI = 2;
  private static int PFL_STANZIBILANC_REISCDASTANZ = 3;
  private static int PFL_STANZIBILANC_TOTALE = 4;
  private static int PFL_STANZIBILANC_STNINICO = 5;
  private static int PFL_STANZIBILANC_STANZDICASSA = 6;
  private static int PFL_STANZIBILANC_PREVISIONE = 7;
  private static int PFL_STANZIBILANC_PREVISICASSA = 8;
  private static int PFL_STANZIBILANC_GIAIMPEGNATO = 9;
  private static int PFL_STANZIBILANC_RESIDUPRESUN = 10;
  private static int PFL_STANZIBILANC_ESERCIZIO = 11;
  private static int PFL_STANZIBILANC_ES = 12;
  private static int PFL_STANZIBILANC_CAPITOLO = 13;
  private static int PFL_STANZIBILANC_ARTICOLO = 14;
  private static int PFL_STANZIBILANC_VARIAZIONICO = 15;
  private static int PFL_STANZIBILANC_VARIAZCOCONS = 16;
  private static int PFL_STANZIBILANC_VARIAZCOSVIL = 17;
  private static int PFL_STANZIBILANC_DISPONIBILIT = 18;
  private static int PFL_STANZIBILANC_DISPONIBCONS = 19;
  private static int PFL_STANZIBILANC_DISPONIBSVIL = 20;
  private static int PFL_STANZIBILANC_DISPONIBIBDG = 21;
  private static int PFL_STANZIBILANC_VARIMPEGNABI = 22;
  private static int PFL_STANZIBILANC_UTENTE1 = 23;
  private static int PFL_STANZIBILANC_DATA1 = 24;
  private static int PFL_STANZIBILANC_UTENTE = 25;
  private static int PFL_STANZIBILANC_DATA = 26;
  private static int PFL_STANZIBILANC_IMPACCULTSVI = 27;
  private static int PFL_STANZIBILANC_IMPACCULTCON = 28;
  private static int PFL_STANZIBILANC_PREVISIOSVIL = 29;
  private static int PFL_STANZIBILANC_PREVISIOCONS = 30;
  private static int PFL_STANZIBILANC_STNINICOCONS = 31;
  private static int PFL_STANZIBILANC_STNINICOSVIL = 32;
  private static int PFL_STANZIBILANC_IMPEGNABILE = 33;
  private static int PFL_STANZIBILANC_IMPACCULTCHI = 34;
  private static int PFL_STANZIBILANC_VARIAZIONICA = 35;

  private static int PPQRY_BIL4 = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_DUAL = 2;


  IDPanel PAN_STANZIBILANC;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI2(IMDB);
    //
    //
    Init_PQRY_BIL4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI2, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI2, "TBL_PARAMETRI2");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI2,IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, "PARAENTRSPES");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI2,IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI2,IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI2,IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI2,IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI2,IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI2, 0);
  }

  private static void Init_PQRY_BIL4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_BIL4, 35);
    IMDB.set_TblCode(IMDBDef16.PQRY_BIL4, "PQRY_BIL4");
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CHIUSO, "IMP_ACC_ULT_CHIUSO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CHIUSO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CONS, "IMP_ACC_ULT_CONS");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_SVIL, "IMP_ACC_ULT_SVIL");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE_CONS, "PREVISIONE_CONS");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE_SVIL, "PREVISIONE_SVIL");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CO, "STN_INI_CO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CO_CONS, "STN_INI_CO_CONS");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CO_SVIL, "STN_INI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CO, "VARIAZIONI_CO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_CONS, "VARIAZIONI_CO_CONS");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_SVIL, "VARIAZIONI_CO_SVIL");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA_CONS, "DISPONIBILITA_CONS");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA_CONS,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA_SVIL, "DISPONIBILITA_SVIL");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA_SVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA_BDG, "DISPONIBILITA_BDG");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_DISPONIBILITA_BDG,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VAR_IMPEGNABILE, "VAR_IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VAR_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_IMP, "REISCRIZIONI_DA_IMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_IMP,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_STN, "REISCRIZIONI_DA_STN");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_STN,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CA, "STN_INI_CA");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_STN_INI_CA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_RESIDUI_PRESUNTI, "RESIDUI_PRESUNTI");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_RESIDUI_PRESUNTI,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_GIA_IMPEGNATO, "GIA_IMPEGNATO");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_GIA_IMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_BILPURA, "BILPURA");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_BILPURA,3,28,6);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_BILTOTALE, "BILTOTALE");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_BILTOTALE,3,28,6);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CA, "VARIAZIONI_CA");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_VARIAZIONI_CA,3,14,2);
    IMDB.set_FldCode(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE_CASSA, "PREVISIONE_CASSA");
    IMDB.SetFldParams(IMDBDef16.PQRY_BIL4,IMDBDef16.PQSL_BIL4_PREVISIONE_CASSA,3,14,2);
    IMDB.TblAddNew(IMDBDef16.PQRY_BIL4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentoBilancioEffettivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentoBilancioEffettivo()
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
    FormIdx = MyGlb.FRM_STANBILAEFFE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C2BAFFF7-F09F-4EF1-A30A-CE6AC7FCC1C0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 676;
    DesignHeight = 506;
    set_Caption(new IDVariant("Stanziamento Bilancio Effettivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 676;
    Frames[1].Height = 480;
    Frames[1].Caption = "Stanziamento Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 480;
    PAN_STANZIBILANC = new IDPanel(w, this, 1, "PAN_STANZIBILANC");
    Frames[1].Content = PAN_STANZIBILANC;
    PAN_STANZIBILANC.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STANZIBILANC.VS = MainFrm.VisualStyleList;
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 676-MyGlb.PAN_OFFS_X, 480-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CECA14A6-2293-4AB5-BF7D-BFA5C45BB1CC");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 452, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STANZIBILANC.InitStatus = 2;
    PAN_STANZIBILANC_Init();
    PAN_STANZIBILANC_InitFields();
    PAN_STANZIBILANC_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA54+BaseCmdLinIdx)
      {
        Salva();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG104+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI78+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG104+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_STANZIAMENU2+BaseCmdLinIdx)
      {
        ApriStanziamentiUO();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FINANZIAMEN6+BaseCmdLinIdx)
      {
        ApriFinanziamento();
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
      PAN_STANZIBILANC.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentoBilancioEffettivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentoBilancioEffettivo.class.getName() : (Glb.ClassWithPackage(StanziamentoBilancioEffettivo.class) ? StanziamentoBilancioEffettivo.class.getName().substring(StanziamentoBilancioEffettivo.class.getPackage().getName().length() + 1) : StanziamentoBilancioEffettivo.class.getName()));
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
    IDVariant v_CAPTIONFORM = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTIONFORM = (new IDVariant("Stanziamento Bilancio", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_CAPITOLOART = new IDVariant(0,IDVariant.STRING);
      v_CAPITOLOART = (new IDVariant("Capitolo/Art. "));
      set_Caption(IDL.Add(v_CAPTIONFORM, MainFrm.ESERCIZIO));
      PAN_STANZIBILANC.set_FieldText(PFL_STANZIBILANC_INTESTALABEL, IDL.Add(IDL.Add(IDL.Add(v_CAPITOLOART, IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL, 0))).stringValue());
      VisibilitàStanziamentiUO();
      if (MainFrm.FASEBILANCIO.compareTo((new IDVariant(2)), true)<=0)
      {
        PAN_STANZIBILANC.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(-1)).booleanValue()); 
        PAN_STANZIBILANC.set_Locked((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_STANZIBILANC.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
        PAN_STANZIBILANC.set_Locked((new IDVariant(-1)).booleanValue());
      }
      PAN_STANZIBILANC.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIBILANC.SetCommandEnabled((new IDVariant(8)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIBILANC.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_STANZIBILANC.SetCommandEnabled((new IDVariant(2)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0).equals((new IDVariant("E")), true))
      {
        PAN_STANZIBILANC.bGroups(GRP_STANZIBILANC_STANZDICOMPE).set_Collapsed((new IDVariant(0)).booleanValue());
        PAN_STANZIBILANC.SetFlags (Glb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_STANZIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_STANZIBILANC.bGroups(GRP_STANZIBILANC_STANZDICOMPE).set_Collapsed((new IDVariant(0)).booleanValue());
        PAN_STANZIBILANC.SetFlags (Glb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        PAN_STANZIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_STANZIBILANC.SetFlags (Glb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_STANZIBILANC.SetFieldValidation(PFL_STANZIBILANC_PURA, (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "LoadEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamento Bilancio After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_STANZIBILANC_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamento Bilancio After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_STANZIBILANC.GetNumRows())).equals((new IDVariant(0)), true))
      {
        if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.equals((new IDVariant(1)), true))
        {
          // if (IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, 0).equals((new IDVariant(0)), true))
          // {
            // if (MainFrm.BLOCCSTNTEST.equals((new IDVariant("SI")), true))
            // {
              // MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, ((IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0).equals((new IDVariant("E"))))?(new IDVariant("Risorsa")):(new IDVariant("Intervento"))))); 
              // MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
              // return;
            // }
            // else
            // {
              // MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, ((IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0).equals((new IDVariant("E"))))?(new IDVariant("Risorsa")):(new IDVariant("Intervento"))))); 
            // }
          // }
          if (IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0).equals((new IDVariant("S")), true))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into BIL ");
              SQL.append("( ");
              SQL.append("  ESERCIZIO, ");
              SQL.append("  E_S, ");
              SQL.append("  CAPITOLO, ");
              SQL.append("  ARTICOLO, ");
              SQL.append("  STN_INI_CO, ");
              SQL.append("  VARIAZIONI_CO, ");
              SQL.append("  STN_INI_CA, ");
              SQL.append("  VARIAZIONI_CA ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0 ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e10)
            {
              MainFrm.set_AlertMessage(new IDVariant(e10.getMessage())); 
              return;
            }
            PAN_STANZIBILANC.PanelCommand(Glb.PCM_REQUERY);
          }
        }
      }
      VisibilitàStanziamentiUO();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "StanziamentoBilancioAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamento Bilancio On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_STANZIBILANC_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamento Bilancio On Updating Row Event Body
      // Procedure Body
      // 
      SettaValoriAZero();
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ESERCIZIO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ESERCIZIO, 0, new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL, 0));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
      if ((Column.equals((new IDVariant(PFL_STANZIBILANC_PURA)), true) || Column.equals((new IDVariant(PFL_STANZIBILANC_REISCDAESIGI)), true) || Column.equals((new IDVariant(PFL_STANZIBILANC_REISCDASTANZ)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO, 0, IDL.Add(IDL.Add(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_BILPURA, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_IMP, 0),(new IDVariant(0)))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_STN, 0),(new IDVariant(0)))));
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_BILTOTALE, 0, IDL.Add(IDL.Add(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_BILPURA, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_IMP, 0),(new IDVariant(0)))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_REISCRIZIONI_DA_STN, 0),(new IDVariant(0)))));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "StanziamentoBilancioOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamento Bilancio On Database Error Event
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
  private void PAN_STANZIBILANC_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_STANZIBILANC, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Stanziamento Bilancio On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "StanziamentoBilancioOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamento Bilancio On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STANZIBILANC_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamento Bilancio On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILPD(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ESERCIZIO, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "StanziamentoBilancioOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Stanziamento Bilancio Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_STANZIBILANC_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stanziamento Bilancio Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "StanziamentoBilancioBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Salva
  // **********************************************************************
  public int Salva ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_AVVISONONBLO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Salva Body
      // Procedure Body
      // 
      v_AVVISO = (new IDVariant());
      v_AVVISONONBLO = (new IDVariant());
      if (new IDVariant(PAN_STANZIBILANC.Status()).equals((new IDVariant(3)), true))
      {
        v_AVVISONONBLO = ControlliNonBloccanti();
        if (!(IDL.IsNull(v_AVVISONONBLO)))
        {
          v_AVVISO = IDL.Add(v_AVVISO, ControlliNonBloccanti());
        }
        if (!(IDL.IsNull(v_AVVISO)))
        {
          if (!(MainFrm.MessageConfirm(v_AVVISO)))
          {
            return 0;
          }
        }
        PAN_STANZIBILANC.PanelCommand(Glb.PCM_UPDATE);
        if (new IDVariant(PAN_STANZIBILANC.Status()).equals((new IDVariant(2)), true))
        {
          PAN_STANZIBILANC.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "Salva", _e);
      return -1;
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
    IDVariant v_AVVISONONBLO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controlli Non Bloccanti Body
      // Procedure Body
      // 
      v_AVVISONONBLO = (new IDVariant());
      if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0), (new IDVariant(0))).equals((new IDVariant(1)), true))
          {
            IDVariant v_AVVISOCAP = new IDVariant(0,IDVariant.STRING);
            v_AVVISOCAP = (new IDVariant("Attenzione: esiste Stanziamento su Capitolo", IDVariant.STRING));
            v_AVVISONONBLO = IDL.Add(IDL.Add(v_AVVISONONBLO, v_AVVISOCAP), (new IDVariant("<BR/>")));
          }
        }
        else
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
          {
            if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), (new IDVariant(0, IDVariant.DECIMAL)), (new IDVariant(0))).equals((new IDVariant(1)), true))
            {
              IDVariant v_AVVISORISINT = new IDVariant(0,IDVariant.STRING);
              v_AVVISORISINT = (new IDVariant("Attenzione: esiste Stanziamento su ", IDVariant.STRING));
              IDVariant v_RISINT = new IDVariant(0,IDVariant.STRING);
              if (IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0).equals((new IDVariant("E")), true))
              {
                v_RISINT = (new IDVariant("Risorsa"));
              }
              else
              {
                v_RISINT = (new IDVariant("Intervento"));
              }
              v_AVVISONONBLO = IDL.Add(IDL.Add(IDL.Add(v_AVVISONONBLO, v_AVVISORISINT), v_RISINT), (new IDVariant("<BR/>")));
            }
            if (MainFrm.ControlloDettagliBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0)).equals((new IDVariant(1)), true))
            {
              IDVariant v_AVVISODETTAR = new IDVariant(0,IDVariant.STRING);
              v_AVVISODETTAR = (new IDVariant("Attenzione: esiste Stanziamento sugli Articoli", IDVariant.STRING));
              v_AVVISONONBLO = IDL.Add(IDL.Add(v_AVVISONONBLO, v_AVVISODETTAR), (new IDVariant("<BR/>")));
            }
          }
          else
          {
            if (MainFrm.ControlloDettagliBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), (new IDVariant(0, IDVariant.DECIMAL))).equals((new IDVariant(1)), true))
            {
              IDVariant v_AVVISODETTCA = new IDVariant(0,IDVariant.STRING);
              v_AVVISODETTCA = (new IDVariant("Attenzione: esiste Stanziamento sui Capitoli", IDVariant.STRING));
              v_AVVISONONBLO = IDL.Add(IDL.Add(v_AVVISONONBLO, v_AVVISODETTCA), (new IDVariant("<BR/>")));
            }
          }
        }
      }
      if (MainFrm.RecordCapUO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), new IDVariant(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0),IDVariant.INTEGER), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0)).compareTo((new IDVariant(1)), true)>0)
      {
        if (MainFrm.RecordBilUO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), new IDVariant(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0),IDVariant.INTEGER), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0)).equals((new IDVariant(0)), true))
        {
          IDVariant v_AVVISOSTNUO = new IDVariant(0,IDVariant.STRING);
          v_AVVISOSTNUO = (new IDVariant("Non sono stati indicati gli Stanziamenti sulle Unità Organizzative", IDVariant.STRING));
          v_AVVISONONBLO = IDL.Add(IDL.Add(v_AVVISONONBLO, v_AVVISOSTNUO), (new IDVariant("<BR/>")));
        }
      }
      return v_AVVISONONBLO;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "ControlliNonBloccanti", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Setta Valori A Zero
  // **********************************************************************
  public int SettaValoriAZero ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Valori A Zero Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CHIUSO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CASSA, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CASSA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_CONS, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "SettaValoriAZero", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Funzioni Aggiuntive On Open Popup Event
  // Evento notificato dal CommandSet quando viene aperto
  // come popup.
  // Direction: E' un parametro di output che può essere impostato ad uno dei valori della lista PopupDirections per scegliere la posizione del menu popup rispetto all'oggetto che lo ha attivato. - Input/Output
  // Cancel: Se impostato a True annulla la visualizzazione del popup. - Input/Output
  // **********************************************************************
  public void CMDS_FUNZIOAGGI78_OnOpenPopup(IDVariant Direction, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Funzioni Aggiuntive On Open Popup Event Body
      // Procedure Body
      // 
      // VisibilitàStanziamentiUO();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "FunzioniAggiuntiveOnOpenPopupEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Stanziamenti UO
  // **********************************************************************
  public int ApriStanziamentiUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Stanziamenti UO Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEESERC, 0, new IDVariant(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ESERCIZIO, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEES, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMEPREVI, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_ROWNAMESTANZ, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI339, IMDBDef3.FLD_PARAMETRI339_RONAIMACULCT, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CHIUSO, 0));
      MainFrm.Show(MyGlb.FRM_STANZIAMENUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "ApriStanziamentiUO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Finanziamento
  // **********************************************************************
  public int ApriFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Finanziamento Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0).equals((new IDVariant("E")), true) && IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0).equals((new IDVariant(1.000000000000000e+016)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI10, IMDBDef6.FLD_PARAMETRI10_PARAENTRSPES, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI10, IMDBDef6.FLD_PARAMETRI10_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI10, IMDBDef6.FLD_PARAMETRI10_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI10, IMDBDef6.FLD_PARAMETRI10_PARASTANATTU, 0, MainFrm.StanziamentoVocePeg(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0)));
        MainFrm.Show(MyGlb.FRM_FINAVADIAMEF, (new IDVariant(0)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAENTRSPES, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI11, IMDBDef6.FLD_PARAMETRI11_PARASTANATTU, 0, MainFrm.StanziamentoVocePeg(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_E_S, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_CAPITOLO, 0), IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ARTICOLO, 0)));
        MainFrm.Show(MyGlb.FRM_FINALTVOPEEF, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "ApriFinanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Stanziamenti UO
  // **********************************************************************
  public int VisibilitàStanziamentiUO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Stanziamenti UO Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_STANZIBILANC.Status()).equals((new IDVariant(1)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET1+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        if (new IDVariant(PAN_STANZIBILANC.Status()).equals((new IDVariant(2)), true))
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_ESERCIZIO, 0))))
          {
            if (MainFrm.RecordCapUO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0), new IDVariant(IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, 0),IDVariant.INTEGER), IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL, 0)).compareTo((new IDVariant(1)), true)>0 || MainFrm.RecordBilUO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAENTRSPES, 0), new IDVariant(IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMCAPITOL, 0),IDVariant.INTEGER), IMDB.Value(IMDBDef6.TBL_PARAMETRI2, IMDBDef6.FLD_PARAMETRI2_PARAMARTICOL, 0)).compareTo((new IDVariant(0)), true)>0)
            {
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG104+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STANZIAMENU2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              if (MainFrm.FINANZIAMENT.booleanValue())
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANZIAMEN6+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
              else
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANZIAMEN6+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              }
            }
            else
            {
              if (MainFrm.FINANZIAMENT.booleanValue())
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANZIAMEN6+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG104+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
              }
              else
              {
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FINANZIAMEN6+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
                MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG104+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
              }
              MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_STANZIAMENU2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
            }
          }
          else
          {
            MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG104+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          }
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG104+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        if (MainFrm.FASEBILANCIO.equals((new IDVariant(0)), true) || MainFrm.FASEBILANCIO.equals((new IDVariant(1)), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA54+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_SALVA54+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET1+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentoBilancioEffettivo", "VisibilitàStanziamentiUO", _e);
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
  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STANZIBILANC_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STANZIBILANC, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STANZIBILANC_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_STANZIBILANC);
    // Stub
  }

  private void PAN_STANZIBILANC_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STANZIBILANC_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_STANZIBILANC_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_STANZIBILANC_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CASSA, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CASSA, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_VARIAZIONI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_PREVISIONE_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_CONS, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_CONS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_SVIL, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_STN_INI_CO_SVIL, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CHIUSO, 0)))
      {
        IMDB.set_Value(IMDBDef16.PQRY_BIL4, IMDBDef16.PQSL_BIL4_IMP_ACC_ULT_CHIUSO, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_STANZIBILANC_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STANZIBILANC_Init()
  {

    PAN_STANZIBILANC.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STANZIBILANC.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, "6C83CDFA-233A-4A3E-8F62-2D4F2D42B080");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, "Stanziamento di Competenza");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, MyGlb.VIS_GROUPSTYLE);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, MyGlb.PANEL_FORM, 68, 31, 308, 133, 0, 0);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, 0, 166);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, 1, 13);
    PAN_STANZIBILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, 0, 4);
    PAN_STANZIBILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, 1, 4);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_STANZDICOMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, "EE8AF384-FEF1-49CC-B58F-FC7CEBCAFFAC");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, "Inserimento");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, MyGlb.PANEL_LIST, 1760, -9999, 168, 16, 0, 0);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, MyGlb.PANEL_FORM, 32, 347, 244, 49, 0, 0);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, 0, 70);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, 1, 13);
    PAN_STANZIBILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, 0, 4);
    PAN_STANZIBILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, 1, 4);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, "8B116338-E29C-4A1F-9859-429277C8E9CC");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, "Aggiornamento");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, MyGlb.PANEL_LIST, 1928, -9999, 168, 16, 0, 0);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, MyGlb.PANEL_FORM, 364, 347, 244, 49, 0, 0);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, 0, 88);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, 1, 13);
    PAN_STANZIBILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, 0, 4);
    PAN_STANZIBILANC.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, 1, 4);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_GROUP, GRP_STANZIBILANC_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STANZIBILANC.SetSize(MyGlb.OBJ_FIELD, 36);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, "4563173C-DA89-4D1E-A73E-7B5F7C826920");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, "3F6089F1-F44A-4114-87EE-301D8DE4E935");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, "Pura");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, "13F7E803-25AB-4218-9054-113CC6D8BB15");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, "Reiscrizioni da Esigibilità");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, "91213685-7B0A-4B59-9EFE-3B29A24B4C57");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, "Reiscrizioni da Stanziamento");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, "20EF1488-6B1D-4BAE-B58F-78C136451D7D");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, "Totale");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, "C8D12C80-54A0-451E-9E8C-91652BE75865");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, "Stanziamento di Competenza");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, "FEA0EEE6-2F55-4D2E-9BAC-7B2796AC2164");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, "Stanziamento di Cassa");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, "D955A2B5-FD97-4BFA-A9CA-A393A5E1ECEE");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, "Previsione");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, "028F33FF-787F-4B7B-9A41-09B1B6B6F4E9");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, "Previsione di Cassa");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, "89D79C39-B515-4F5E-A0DC-0A60ECAE5896");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, "Già Impegnato");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, "3D1ADA30-8DA7-4C07-80EE-1FAF7D100E0A");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, "Residui Presunti");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.VIS_NORFIECF4IMP);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, "1BFDED82-F22A-4561-B206-BF8A01207054");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, "ESERCIZIO");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.VIS_NORFIEINTLUN);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, "E3C331BB-5C57-418C-8C41-60579A5C48BC");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, "E S");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, "1692DBAD-EF57-4BA4-B478-308030BF15ED");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, "CAPITOLO");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, "4355AB42-A7DA-4740-804C-E86DA36585D4");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, "ARTICOLO");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, "3902D9E9-1ED8-4248-B596-ABF38B4A4B03");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, "VARIAZIONI CO");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, 0, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, "4E18374C-953A-4F74-9BF5-DF002D90AF0C");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, "0D6B790D-7A95-4A35-9432-024E23B3F6D0");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, "4377EBF1-199C-44C5-B645-CA87D2F3EEB6");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, "DISPONIBILITA");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, "AF8F47D4-A655-4A15-9BE9-44A332744BC1");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, "DISPONIBILITA CONS");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, "693C5C6B-1405-4FBE-82BB-C2DC43B7721B");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, "DISPONIBILITA SVIL");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, "1559B9EC-AD34-40DD-9A93-B326C5EB6E2B");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, "DISPONIBILITA BDG");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, "9CEFF9EB-013E-43A3-95CB-1B682DA77E83");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, "VAR IMPEGNABILE");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, "075E7C39-0C16-455B-9943-A16E86519D45");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, "Utente");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, "CA0B5619-DA50-4461-899D-C61EF7D09E9A");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, "Data");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, "1A92F045-BB24-48B9-8830-45EEC3138CFF");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, "Utente");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, "F47C1ABC-5BF5-4197-B131-4DD8C8C6ED1B");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, "Data");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, "5A526BF8-1B0B-4618-B0CA-51DBE5736F85");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, "IMP ACC ULT SVIL");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, "45A3C650-2165-43EE-9A46-5012E078BAC1");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, "IMP ACC ULT CONS");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, "2BEA4B8A-C5D0-4A28-82CA-2371D3CAA749");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, "PREVISIONE SVIL");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, "45E191CC-1E23-4CBE-A895-DA3258ED79AD");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, "PREVISIONE CONS");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, "87CEEF81-2F87-439B-ACDF-ED452F428394");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, "STN INI CO CONS");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, "3C4D050C-62DD-45FA-8E2E-461D3CDFAC9E");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, "STN INI CO SVIL");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, "2DF618D9-D9E7-4D7D-A7F6-2F4F74E7AE51");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, "IMPEGNABILE");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.VIS_NORMFIELPADR);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, "A4EA6F94-57AC-4ABC-AE93-45EBEB909EB9");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, "IMP ACC ULT CHIUSO");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STANZIBILANC.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, "18D3C67E-54E2-4F34-8F43-E323EAE1BD98");
    PAN_STANZIBILANC.set_Header(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, "VARIAZIONI CA");
    PAN_STANZIBILANC.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, "");
    PAN_STANZIBILANC.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.VIS_NONNULLAFIEL);
    PAN_STANZIBILANC.SetFlags(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, 0, -1);
  }

  private void PAN_STANZIBILANC_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, MyGlb.PANEL_LIST, 28, 8, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, MyGlb.PANEL_FORM, 68, 8, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_INTESTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_INTESTALABEL, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_LIST, 36);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_LIST, "Pura");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_FORM, 72, 56, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PURA, MyGlb.PANEL_FORM, "Pura");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_PURA, -1, GRP_STANZIBILANC_STANZDICOMPE);
    PAN_STANZIBILANC.SetFieldUnbound(PFL_STANZIBILANC_PURA, true);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_PURA, PPQRY_BIL4, "NVL(A.STN_INI_CO, 0) - NVL(A.REISCRIZIONI_DA_IMP, 0) - NVL(A.REISCRIZIONI_DA_STN, 0)", "BILPURA", 3, 28, 6, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_LIST, 132);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_LIST, "Reiscrizioni da Esigibilità");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_FORM, 72, 84, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDAESIGI, MyGlb.PANEL_FORM, "Reiscrizioni da Esigibilità");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_REISCDAESIGI, -1, GRP_STANZIBILANC_STANZDICOMPE);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_REISCDAESIGI, PPQRY_BIL4, "A.REISCRIZIONI_DA_IMP", "REISCRIZIONI_DA_IMP", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_LIST, 132);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_LIST, "Reiscrizioni da Stanziamento");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_FORM, 72, 112, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_REISCDASTANZ, MyGlb.PANEL_FORM, "Reiscrizioni da Stanziamento");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_REISCDASTANZ, -1, GRP_STANZIBILANC_STANZDICOMPE);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_REISCDASTANZ, PPQRY_BIL4, "A.REISCRIZIONI_DA_STN", "REISCRIZIONI_DA_STN", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_LIST, 52);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_LIST, "Totale");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_FORM, 72, 140, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_TOTALE, MyGlb.PANEL_FORM, "Totale");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_TOTALE, -1, GRP_STANZIBILANC_STANZDICOMPE);
    PAN_STANZIBILANC.SetFieldUnbound(PFL_STANZIBILANC_TOTALE, true);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_TOTALE, PPQRY_BIL4, "A.STN_INI_CO", "BILTOTALE", 3, 28, 6, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_LIST, 68);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_LIST, "Stanziam. di Competenza");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_FORM, 72, 172, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICO, MyGlb.PANEL_FORM, "Stanziamento di Competenza");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_STNINICO, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_STNINICO, PPQRY_BIL4, "A.STN_INI_CO", "STN_INI_CO", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_LIST, 68);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_LIST, "Stanziam. di Cassa");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_FORM, 72, 200, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STANZDICASSA, MyGlb.PANEL_FORM, "Stanziamento di Cassa");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_STANZDICASSA, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_STANZDICASSA, PPQRY_BIL4, "A.STN_INI_CA", "STN_INI_CA", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_LIST, 76);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_LIST, "Previsione");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_FORM, 72, 228, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIONE, MyGlb.PANEL_FORM, "Previsione");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_PREVISIONE, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_PREVISIONE, PPQRY_BIL4, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_LIST, 116);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_LIST, "Previsione di Cassa");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_FORM, 140, 256, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_FORM, 116);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISICASSA, MyGlb.PANEL_FORM, "Previsione di Cassa");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_PREVISICASSA, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_PREVISICASSA, PPQRY_BIL4, "A.PREVISIONE_CASSA", "PREVISIONE_CASSA", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_LIST, 100);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Già Impegnato");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_FORM, 72, 312, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Già Impegnato");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_GIAIMPEGNATO, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_GIAIMPEGNATO, PPQRY_BIL4, "A.GIA_IMPEGNATO", "GIA_IMPEGNATO", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_LIST, 116);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_LIST, "Residui Presunti");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_FORM, 72, 284, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_FORM, 184);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_RESIDUPRESUN, MyGlb.PANEL_FORM, "Residui Presunti");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_RESIDUPRESUN, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_RESIDUPRESUN, PPQRY_BIL4, "A.RESIDUI_PRESUNTI", "RESIDUI_PRESUNTI", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_FORM, 88);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_ESERCIZIO, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_ESERCIZIO, PPQRY_BIL4, "A.ESERCIZIO", "ESERCIZIO", 3, 12, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_LIST, 24);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_LIST, "E S");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_FORM, 164, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_FORM, 40);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ES, MyGlb.PANEL_FORM, "E S");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_ES, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_ES, PPQRY_BIL4, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_LIST, 144, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_LIST, "CAPIT.");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_FORM, 88);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_CAPITOLO, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_CAPITOLO, PPQRY_BIL4, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_LIST, 200, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_FORM, 164, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_FORM, 72);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_ARTICOLO, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_ARTICOLO, PPQRY_BIL4, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_LIST, 88);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_LIST, "VARIAZIONI CO");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_FORM, 4, 264, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_FORM, 88);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICO, MyGlb.PANEL_FORM, "VARIAZ. CO");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_VARIAZIONICO, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_VARIAZIONICO, PPQRY_BIL4, "A.VARIAZIONI_CO", "VARIAZIONI_CO", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_LIST, 120);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_LIST, "VARIAZIONI CO CONS");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_FORM, 4, 288, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_FORM, 120);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZ. CO CONS");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_VARIAZCOCONS, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_VARIAZCOCONS, PPQRY_BIL4, "A.VARIAZIONI_CO_CONS", "VARIAZIONI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_LIST, 112);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VARIAZIONI CO SVIL");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_FORM, 4, 312, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_FORM, 112);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZ. CO SVIL");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_VARIAZCOSVIL, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_VARIAZCOSVIL, PPQRY_BIL4, "A.VARIAZIONI_CO_SVIL", "VARIAZIONI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_LIST, 84);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_LIST, "DISPON.");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 336, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBILIT, MyGlb.PANEL_FORM, "DISPON.");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_DISPONIBILIT, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_DISPONIBILIT, PPQRY_BIL4, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_LIST, 116);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_LIST, "DISPONIBILITA CONS");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_FORM, 260, 272, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_FORM, 116);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBCONS, MyGlb.PANEL_FORM, "DISPON. CONS");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_DISPONIBCONS, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_DISPONIBCONS, PPQRY_BIL4, "A.DISPONIBILITA_CONS", "DISPONIBILITA_CONS", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_LIST, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_LIST, "DISPONIBILITA SVIL");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_FORM, 260, 296, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_FORM, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBSVIL, MyGlb.PANEL_FORM, "DISPON. SVIL");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_DISPONIBSVIL, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_DISPONIBSVIL, PPQRY_BIL4, "A.DISPONIBILITA_SVIL", "DISPONIBILITA_SVIL", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_LIST, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_LIST, "DISPONIBILITA BDG");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_FORM, 260, 320, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_FORM, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DISPONIBIBDG, MyGlb.PANEL_FORM, "DISPON. BDG");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_DISPONIBIBDG, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_DISPONIBIBDG, PPQRY_BIL4, "A.DISPONIBILITA_BDG", "DISPONIBILITA_BDG", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_LIST, 100);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_LIST, "VAR IMPEGNABILE");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_FORM, 260, 344, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_FORM, 100);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIMPEGNABI, MyGlb.PANEL_FORM, "VAR IMPEGN.");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_VARIMPEGNABI, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_VARIMPEGNABI, PPQRY_BIL4, "A.VAR_IMPEGNABILE", "VAR_IMPEGNABILE", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_LIST, 1760, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_LIST, 120);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_FORM, 36, 372, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_FORM, 48);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_UTENTE1, -1, GRP_STANZIBILANC_INSERIMENTO);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_UTENTE1, PPQRY_BIL4, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_LIST, 1832, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_LIST, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_FORM, 168, 372, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_FORM, 36);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_DATA1, -1, GRP_STANZIBILANC_INSERIMENTO);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_DATA1, PPQRY_BIL4, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_LIST, 1928, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_LIST, 112);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_LIST, "Utente");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_FORM, 368, 372, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_FORM, 48);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_UTENTE, MyGlb.PANEL_FORM, "Utente");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_UTENTE, -1, GRP_STANZIBILANC_AGGIORNAMENT);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_UTENTE, PPQRY_BIL4, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_LIST, 2000, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_LIST, 100);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_FORM, 500, 372, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_FORM, 36);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_DATA, -1, GRP_STANZIBILANC_AGGIORNAMENT);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_DATA, PPQRY_BIL4, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_LIST, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_LIST, "IMP ACC ULT SVIL");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_FORM, 4, 336, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_FORM, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTSVI, MyGlb.PANEL_FORM, "IMP ACC ULT SVIL");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_IMPACCULTSVI, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_IMPACCULTSVI, PPQRY_BIL4, "A.IMP_ACC_ULT_SVIL", "IMP_ACC_ULT_SVIL", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_LIST, 112);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_LIST, "IMP ACC ULT CONS");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_FORM, 4, 336, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_FORM, 112);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCON, MyGlb.PANEL_FORM, "IMP ACC ULT CONS");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_IMPACCULTCON, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_IMPACCULTCON, PPQRY_BIL4, "A.IMP_ACC_ULT_CONS", "IMP_ACC_ULT_CONS", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_LIST, 104);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_LIST, "PREVISIONE SVIL");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_FORM, 4, 336, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_FORM, 104);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOSVIL, MyGlb.PANEL_FORM, "PREVISIONE SVIL");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_PREVISIOSVIL, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_PREVISIOSVIL, PPQRY_BIL4, "A.PREVISIONE_SVIL", "PREVISIONE_SVIL", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_LIST, 8, 44, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_LIST, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_LIST, "PREVISIONE CONS");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_FORM, 12, 344, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_FORM, 108);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_PREVISIOCONS, MyGlb.PANEL_FORM, "PREVISIONE CONS");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_PREVISIOCONS, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_PREVISIOCONS, PPQRY_BIL4, "A.PREVISIONE_CONS", "PREVISIONE_CONS", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_LIST, 100);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_FORM, 4, 336, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_FORM, 100);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CONS");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_STNINICOCONS, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_STNINICOCONS, PPQRY_BIL4, "A.STN_INI_CO_CONS", "STN_INI_CO_CONS", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_LIST, 96);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_FORM, 4, 336, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_FORM, 96);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_STNINICOSVIL, MyGlb.PANEL_FORM, "STN INI CO SVIL");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_STNINICOSVIL, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_STNINICOSVIL, PPQRY_BIL4, "A.STN_INI_CO_SVIL", "STN_INI_CO_SVIL", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_LIST, 8, 44, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_LIST, 84);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_LIST, "IMPEGNABILE");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_FORM, 12, 344, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_FORM, 84);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPEGNABILE, MyGlb.PANEL_FORM, "IMPEGNABILE");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_IMPEGNABILE, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_IMPEGNABILE, PPQRY_BIL4, "A.IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_LIST, 128);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_LIST, "IMP ACC ULT CHIUSO");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_FORM, 4, 336, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_FORM, 128);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_IMPACCULTCHI, MyGlb.PANEL_FORM, "IMP ACC ULT CHIUSO");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_IMPACCULTCHI, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_IMPACCULTCHI, PPQRY_BIL4, "A.IMP_ACC_ULT_CHIUSO", "IMP_ACC_ULT_CHIUSO", 3, 14, 2, -13997);
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_LIST, 96);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_LIST, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_LIST, "VARIAZIONI CA");
    PAN_STANZIBILANC.SetRect(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_FORM, 4, 368, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STANZIBILANC.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_FORM, 96);
    PAN_STANZIBILANC.SetNumRow(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_FORM, 1);
    PAN_STANZIBILANC.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STANZIBILANC_VARIAZIONICA, MyGlb.PANEL_FORM, "VARIAZIONI CA");
    PAN_STANZIBILANC.SetFieldPage(PFL_STANZIBILANC_VARIAZIONICA, -1, -1);
    PAN_STANZIBILANC.SetFieldPanel(PFL_STANZIBILANC_VARIAZIONICA, PPQRY_BIL4, "A.VARIAZIONI_CA", "VARIAZIONI_CA", 3, 14, 2, -13997);
  }

  private void PAN_STANZIBILANC_InitQueries()
  {
    StringBuffer SQL;

    PAN_STANZIBILANC.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as BIUTINSTBES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as BIUTINSTBESB ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_STANZIBILANC.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_STANZIBILANC_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as BIUTINSTBES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as BIUTINSTBESB ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_STANZIBILANC.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_STANZIBILANC_UTENTE1, "");
    PAN_STANZIBILANC.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as BIUTAGSTBES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as BIUTAGSTBESB ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_STANZIBILANC.SetQuery(PPQRY_DUAL, 0, SQL, PFL_STANZIBILANC_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as BIUTAGSTBES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as BIUTAGSTBESB ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_STANZIBILANC.SetQuery(PPQRY_DUAL, 1, SQL, PFL_STANZIBILANC_UTENTE, "");
    PAN_STANZIBILANC.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIBILANC.SetIMDB(IMDB, "PQRY_BIL4", true);
    PAN_STANZIBILANC.set_SetString(MyGlb.MASTER_ROWNAME, "BIL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMP_ACC_ULT_CHIUSO as IMP_ACC_ULT_CHIUSO, ");
    SQL.append("  A.IMP_ACC_ULT_CONS as IMP_ACC_ULT_CONS, ");
    SQL.append("  A.IMP_ACC_ULT_SVIL as IMP_ACC_ULT_SVIL, ");
    SQL.append("  A.PREVISIONE as PREVISIONE, ");
    SQL.append("  A.PREVISIONE_CONS as PREVISIONE_CONS, ");
    SQL.append("  A.PREVISIONE_SVIL as PREVISIONE_SVIL, ");
    SQL.append("  A.STN_INI_CO as STN_INI_CO, ");
    SQL.append("  A.STN_INI_CO_CONS as STN_INI_CO_CONS, ");
    SQL.append("  A.STN_INI_CO_SVIL as STN_INI_CO_SVIL, ");
    SQL.append("  A.IMPEGNABILE as IMPEGNABILE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.VARIAZIONI_CO as VARIAZIONI_CO, ");
    SQL.append("  A.VARIAZIONI_CO_CONS as VARIAZIONI_CO_CONS, ");
    SQL.append("  A.VARIAZIONI_CO_SVIL as VARIAZIONI_CO_SVIL, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.DISPONIBILITA_CONS as DISPONIBILITA_CONS, ");
    SQL.append("  A.DISPONIBILITA_SVIL as DISPONIBILITA_SVIL, ");
    SQL.append("  A.DISPONIBILITA_BDG as DISPONIBILITA_BDG, ");
    SQL.append("  A.VAR_IMPEGNABILE as VAR_IMPEGNABILE, ");
    SQL.append("  A.REISCRIZIONI_DA_IMP as REISCRIZIONI_DA_IMP, ");
    SQL.append("  A.REISCRIZIONI_DA_STN as REISCRIZIONI_DA_STN, ");
    SQL.append("  A.STN_INI_CA as STN_INI_CA, ");
    SQL.append("  A.RESIDUI_PRESUNTI as RESIDUI_PRESUNTI, ");
    SQL.append("  A.GIA_IMPEGNATO as GIA_IMPEGNATO, ");
    SQL.append("  NVL(A.STN_INI_CO, 0) - NVL(A.REISCRIZIONI_DA_IMP, 0) - NVL(A.REISCRIZIONI_DA_STN, 0) as BILPURA, ");
    SQL.append("  A.STN_INI_CO as BILTOTALE, ");
    SQL.append("  A.VARIAZIONI_CA as VARIAZIONI_CA, ");
    SQL.append("  A.PREVISIONE_CASSA as PREVISIONE_CASSA ");
    PAN_STANZIBILANC.SetQuery(PPQRY_BIL4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL A ");
    PAN_STANZIBILANC.SetQuery(PPQRY_BIL4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI2.PARAENTRSPES~~) ");
    SQL.append("and   (A.CAPITOLO = ~~TBL_PARAMETRI2.PARAMCAPITOL~~) ");
    SQL.append("and   (A.ARTICOLO = ~~TBL_PARAMETRI2.PARAMARTICOL~~) ");
    PAN_STANZIBILANC.SetQuery(PPQRY_BIL4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIBILANC.SetQuery(PPQRY_BIL4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIBILANC.SetQuery(PPQRY_BIL4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STANZIBILANC.SetQuery(PPQRY_BIL4, 5, SQL, -1, "");
    PAN_STANZIBILANC.SetQueryDB(PPQRY_BIL4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STANZIBILANC.SetMasterTable(0, "BIL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STANZIBILANC.Status() == 2)
    {
      int oldListQBE = PAN_STANZIBILANC.iUseListQBE;
      PAN_STANZIBILANC.iUseListQBE = 0;
      PAN_STANZIBILANC.PanelCommand(Glb.PCM_SEARCH);
      PAN_STANZIBILANC.PanelCommand(Glb.PCM_FIND);
      PAN_STANZIBILANC.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_STANZIBILANC) PAN_STANZIBILANC_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj.Code.equals("FUNZIOAGGI78")) CMDS_FUNZIOAGGI78_OnOpenPopup(Direction, Cancel);
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
