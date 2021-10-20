// **********************************************
// Stanziamenti Pluriennali Effettivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StanziamentiPluriennaliEffettivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_BIL_ESERCIZIO = 0;
  private static int PFL_BIL_ES = 1;
  private static int PFL_BIL_CAPITOLO = 2;
  private static int PFL_BIL_ARTICOLO = 3;
  private static int PFL_BIL_IMPACCULTCHI = 4;
  private static int PFL_BIL_IMPACCULTCON = 5;
  private static int PFL_BIL_IMPACCULTSVI = 6;
  private static int PFL_BIL_COMPETENPURA = 7;
  private static int PFL_BIL_REISCRIDAIMP = 8;
  private static int PFL_BIL_PREVISIOCONS = 9;
  private static int PFL_BIL_PREVISIOSVIL = 10;
  private static int PFL_BIL_REISCRIDASTN = 11;
  private static int PFL_BIL_STNINICO = 12;
  private static int PFL_BIL_VARIMPEGNABI = 13;
  private static int PFL_BIL_GIAIMPEGNATO = 14;
  private static int PFL_BIL_IMPEGNABILE = 15;
  private static int PFL_BIL_PREVISIONE = 16;
  private static int PFL_BIL_STNINICOCONS = 17;
  private static int PFL_BIL_STNINICOSVIL = 18;
  private static int PFL_BIL_VARIAZIONICO = 19;
  private static int PFL_BIL_VARIAZCOCONS = 20;
  private static int PFL_BIL_VARIAZCOSVIL = 21;
  private static int PFL_BIL_DISPONIBILIT = 22;
  private static int PFL_BIL_DISPONIBCONS = 23;
  private static int PFL_BIL_DISPONIBSVIL = 24;
  private static int PFL_BIL_DISPONIBIBDG = 25;
  private static int PFL_BIL_UTENTEINSERI = 26;
  private static int PFL_BIL_DATAINSERIME = 27;
  private static int PFL_BIL_UTENTULTIAGG = 28;
  private static int PFL_BIL_DATAULTIMAGG = 29;
  private static int PFL_BIL_STNINICA = 30;
  private static int PFL_BIL_VARIAZIONICA = 31;
  private static int PFL_BIL_DISPONIBILCA = 32;
  private static int PFL_BIL_RESIDUPRESUN = 33;
  private static int PFL_BIL_VARIREIDAIMP = 34;
  private static int PFL_BIL_VARIREIDASTN = 35;
  private static int PFL_BIL_NUOVO = 36;
  private static int PFL_BIL_FASEESEFIN = 37;

  private static int PPQRY_BIL7 = 0;

  private static int PPQRY_ESEFIN = 1;


  IDPanel PAN_BIL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDBSTANZ1(IMDB);
    //
    //
    Init_PQRY_BIL7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDBSTANZ1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IMDBSTANZ1, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_IMDBSTANZ1, "TBL_IMDBSTANZ1");
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGELOCK, "NOMEOGGELOCK");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBSTANZ1,IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGELOCK,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_IMDBSTANZ1, 0);
  }

  private static void Init_PQRY_BIL7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BIL7, 38);
    IMDB.set_TblCode(IMDBDef11.PQRY_BIL7, "PQRY_BIL7");
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_ESERCIZIO,3,12,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_ES, "ES");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_ES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPACCULTCHI, "IMPACCULTCHI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPACCULTCHI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPACCULTCON, "IMPACCULTCON");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPACCULTCON,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPACCULTSVI, "IMPACCULTSVI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPACCULTSVI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_PREVISIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_PREVISIOCONS, "PREVISIOCONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_PREVISIOCONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_PREVISIOSVIL, "PREVISIOSVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_PREVISIOSVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICO, "STNINICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICOCONS, "STNINICOCONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICOCONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICOSVIL, "STNINICOSVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICOSVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZIONICO, "VARIAZIONICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZIONICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZCOCONS, "VARIAZCOCONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZCOCONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZCOSVIL, "VARIAZCOSVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZCOSVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBILIT, "DISPONIBILIT");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBILIT,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBCONS, "DISPONIBCONS");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBCONS,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBSVIL, "DISPONIBSVIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBSVIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBIBDG, "DISPONIBIBDG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBIBDG,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPEGNABILE, "IMPEGNABILE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_IMPEGNABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIMPEGNABI, "VARIMPEGNABI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIMPEGNABI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_UTENTEINSERI, "UTENTEINSERI");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_UTENTEINSERI,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DATAINSERIME, "DATAINSERIME");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DATAINSERIME,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_UTENTULTIAGG, "UTENTULTIAGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_UTENTULTIAGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DATAULTIMAGG, "DATAULTIMAGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DATAULTIMAGG,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICA, "STNINICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_STNINICA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZIONICA, "VARIAZIONICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIAZIONICA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBILCA, "DISPONIBILCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_DISPONIBILCA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_RESIDUPRESUN, "RESIDUPRESUN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_RESIDUPRESUN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_REISCRIDAIMP, "REISCRIDAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_REISCRIDAIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_REISCRIDASTN, "REISCRIDASTN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_REISCRIDASTN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_GIAIMPEGNATO, "GIAIMPEGNATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_GIAIMPEGNATO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIREIDAIMP, "VARIREIDAIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIREIDAIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIREIDASTN, "VARIREIDASTN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_VARIREIDASTN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_COMPETENPURA, "COMPETENPURA");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_COMPETENPURA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_NUOVO, "NUOVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_NUOVO,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_FASEESEFIN, "FASEESEFIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_BIL7,IMDBDef11.PQSL_BIL7_FASEESEFIN,1,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_BIL7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StanziamentiPluriennaliEffettivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public StanziamentiPluriennaliEffettivo()
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
    FormIdx = MyGlb.FRM_STANPLUREFFE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "539A4161-1F00-4892-B2B2-9368BF89B644";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 784;
    DesignHeight = 362;
    set_Caption(new IDVariant("Stanziamenti Pluriennali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 784;
    Frames[1].Height = 336;
    Frames[1].Caption = "Stanziamenti Pluriennali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_BIL = new IDPanel(w, this, 1, "PAN_BIL");
    Frames[1].Content = PAN_BIL;
    PAN_BIL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_BIL.VS = MainFrm.VisualStyleList;
    PAN_BIL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BA29D449-5A51-461F-978A-CA0A292A8E19");
    PAN_BIL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 744, 216, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_BIL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_BIL.InitStatus = 2;
    PAN_BIL_Init();
    PAN_BIL_InitFields();
    PAN_BIL_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_CANCELLA6+BaseCmdLinIdx)
      {
        Cancella();
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
      PAN_BIL.UpdatePanel(MainFrm);
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
    return (obj instanceof StanziamentiPluriennaliEffettivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StanziamentiPluriennaliEffettivo.class.getName() : (Glb.ClassWithPackage(StanziamentiPluriennaliEffettivo.class) ? StanziamentiPluriennaliEffettivo.class.getName().substring(StanziamentiPluriennaliEffettivo.class.getPackage().getName().length() + 1) : StanziamentiPluriennaliEffettivo.class.getName()));
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
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(Caption(), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGECAPI, 0))), (new IDVariant("/"))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGEARTI, 0))));
      PAN_BIL.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_BIL.SetCommandEnabled((new IDVariant(16)).intValue(), (new IDVariant(0)).booleanValue()); 
      if (IMDB.Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Competenza"));
        PAN_BIL.set_Header(Glb.OBJ_FIELD,PFL_BIL_STNINICO, new IDVariant(S).stringValue());
        PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_COMPETENPURA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_STNINICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      // if (IMDB.Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGELOCK, 0).equals((new IDVariant("SI")), true))
      // {
        // PAN_BIL.set_Locked((new IDVariant(-1)).booleanValue());
        // MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CANCELLA4+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "Load", _e);
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
      UNLOAD_IMDBSTANDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB Stanz: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBSTANDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGELOCK, 0, new IDVariant());
  }

  // **********************************************************************
  // BIL Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BIL_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL Before Insert Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ES, 0, IMDB.Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGETTES, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_CAPITOLO, 0, IMDB.Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ARTICOLO, 0, IMDB.Value(IMDBDef3.TBL_IMDBSTANZ1, IMDBDef3.FLD_IMDBSTANZ1_NOMEOGGEARTI, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_UTENTEINSERI, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_DATAINSERIME, 0, IDL.Today());
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_STNINICA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_RESIDUPRESUN, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_VARIAZIONICO, 0, (new IDVariant(0, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_VARIAZIONICA, 0, (new IDVariant(0, IDVariant.DECIMAL)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "BILBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // BIL On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_BIL_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL On Updating Row Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_NUOVO, 0),(new IDVariant(0))).equals((new IDVariant(1)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_UTENTULTIAGG, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_UTENTULTIAGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_DATAULTIMAGG, 0, IDL.Today());
        }
      }
      if ((Column.equals((new IDVariant(PFL_BIL_COMPETENPURA)), true) || Column.equals((new IDVariant(PFL_BIL_REISCRIDAIMP)), true) || Column.equals((new IDVariant(PFL_BIL_REISCRIDASTN)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_STNINICO, 0, IDL.Add(IDL.Add(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_COMPETENPURA, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_REISCRIDAIMP, 0),(new IDVariant(0)))), IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_REISCRIDASTN, 0),(new IDVariant(0)))));
      }
      if (Column.equals((new IDVariant(PFL_BIL_ESERCIZIO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ESERCIZIO, 0))))
        {
          if (IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ESERCIZIO, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'esercizio indicato deve essere maggiore di quello del contesto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ESERCIZIO, 0, new IDVariant(((IDL.NullValue(PAN_BIL.GetOrgValue(PFL_BIL_ESERCIZIO),(new IDVariant("0"))).compareTo((new IDVariant("0")), true)!=0)?IDL.ToInteger(PAN_BIL.GetOrgValue(PFL_BIL_ESERCIZIO)):(new IDVariant())),IDVariant.DECIMAL));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "BILOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // BIL On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_BIL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_BIL);
      // 
      // BIL On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_NUOVO, 0),(new IDVariant(0))).equals((new IDVariant(0)), true))
      {
        PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_ESERCIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_ESERCIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_FASEESEFIN, 0),(new IDVariant(0))).compareTo((new IDVariant(1)), true)>0)
      {
        DISABILITAABILITA((new IDVariant(0)));
      }
      else
      {
        DISABILITAABILITA((new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "BILOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // BIL On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_BIL_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // BIL On Change Row Body
      // Corpo Procedura
      // 
      // IDVariant v_VESEFFASEBIL = new IDVariant(0,IDVariant.INTEGER);
      // SQL = new StringBuffer();
      // SQL.append("select ");
      // SQL.append("  A.FASE_BILANCIO as ESEFFASEBILA ");
      // SQL.append("from ");
      // SQL.append("  ESEFIN A ");
      // QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      // if (!QV.EOF()) QV.MoveNext();
      // if (!QV.EOF())
      // {
      //   v_VESEFFASEBIL = QV.Get("ESEFFASEBILA", IDVariant.INTEGER) ;
      // }
      // QV.Close();
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_FASEESEFIN, 0),(new IDVariant(0))).compareTo((new IDVariant(1)), true)>0)
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CANCELLA4+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CANCELLA4+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "BILOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Cancella
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Cancella ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cancella Body
      // Corpo Procedura
      // 
      IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
      v_MSG = (new IDVariant("Cancellare la riga selezionata?"));
      IDVariant v_EXITCODE = new IDVariant(0,IDVariant.INTEGER);
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ESERCIZIO, 0)))
      {
        IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
        v_MSG2 = (new IDVariant("Impossibile cancellare la riga selezionata, é una riga vuota!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG2); 
        return 0;
      }
      v_EXITCODE = (new IDVariant(MainFrm.MessageConfirm(v_MSG)));
      if (v_EXITCODE.booleanValue())
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILPD(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ESERCIZIO, 0), IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ES, 0), IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_CAPITOLO, 0), IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ARTICOLO, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        else
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("delete from BIL ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ESERCIZIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (E_S = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BIL7, IMDBDef11.PQSL_BIL7_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e9)
          {
            MainFrm.set_AlertMessage(new IDVariant(e9.getMessage())); 
            return 0;
          }
          PAN_BIL.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "Cancella", _e);
      return -1;
    }
  }

  // **********************************************************************
  // DISABILITA ABILITA
  // Abilit - Input
  // **********************************************************************
  public int DISABILITAABILITA (IDVariant Abilit)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // DISABILITA ABILITA Body
      // Corpo Procedura
      // 
      PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_COMPETENPURA, (Abilit.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, (Abilit.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, (Abilit.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_BIL.SetFlags (Glb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, (Abilit.booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StanziamentiPluriennaliEffettivo", "DISABILITAABILITA", _e);
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
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_BIL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_BIL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_BIL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_BIL, Cancel);
    // Stub
  }

  private void PAN_BIL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_BIL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_BIL_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_BIL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_BIL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_BIL_Init()
  {

    PAN_BIL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_BIL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_BIL.SetSize(MyGlb.OBJ_FIELD, 38);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, "1D313D2A-FBA7-4BA9-A239-014C6D17EF74");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, "Esercizio");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.VIS_NORFIEINTLUN);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_ES, "5CCCB3D6-32BE-42DD-8903-99E72458A277");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_ES, "E S");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_ES, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, "4C99D6DB-4749-448C-96EB-8B3BF2267590");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, "CAPITOLO");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, "780C1E27-D685-4E76-87CA-6FB7B082FA59");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, "ARTICOLO");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, "26EEB536-8E09-4BDA-B3C6-70368931495F");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, "IMP ACC ULT CHIUSO");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, "AD72253F-98B2-4E92-BD70-32F71EAEBADB");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, "IMP ACC ULT CONS");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, "CA4021EE-EF0D-4A65-80BE-82CFE4EA35AF");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, "IMP ACC ULT SVIL");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, "F819DE47-0B7F-4345-AEBE-9DFB596DFC41");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, "Competenza Pura");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.VIS_NORFIECF4IMP);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, "82C9E441-D84C-41D2-AE39-1762BA8D926B");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, "Reiscrizioni da Esigibilità");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, "57A67205-A077-45D0-BB6C-DAC5FD7A27D6");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, "PREVISIONE CONS");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, "8D45D47F-FFEC-495F-BEE2-41DC60895370");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, "PREVISIONE SVIL");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, "7EBAED62-E19A-4F68-8C39-CB289073AF96");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, "Reiscrizioni Stanziamento");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.VIS_NORFIECF4IMP);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, "4D6A0E6A-9897-4A10-B0DE-906D3D4ACC69");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, "Competenza Totale");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, "F6A8690E-7414-431D-9279-3E562D0B27EF");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, "VAR IMPEGNABILE");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, "50395D50-D3F9-43F6-A147-1C2EEAAB1FFF");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, "Già Impegnato");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, "0C49E5A9-9F2A-4274-9727-6EEBE3BB46FB");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, "IMPEGNABILE");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, "F2BCFADC-3F3E-461F-9ADC-94FC59FA0ED8");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, "Previsione");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.VIS_NORFIECF4IMP);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, "008E5391-8FF4-4523-81D1-91FE24ABE6EE");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, "STN INI CO CONS");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, "3BBF295A-84BD-4837-AD1F-362495DF7354");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, "STN INI CO SVIL");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, "4E4C211B-5B3C-4D84-8DF8-BEE9D944FFDF");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, "VARIAZIONI CO");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, "33C96D88-BC02-4C25-A982-7691AFDFB469");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, "VARIAZIONI CO CONS");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, "9EB1F03C-6B39-4BB4-B413-138F15AA6A6A");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, "VARIAZIONI CO SVIL");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, "EBB7DF5A-A5A0-4C01-9802-938DB6930948");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, "DISPONIBILITA");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, "28621F0E-AE2F-4969-AEE2-DEF4867DE6AB");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, "DISPONIBILITA CONS");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, "11ADC6C9-FF2F-4912-A7A8-E0480F63C945");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, "DISPONIBILITA SVIL");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, "3F4428A3-5D92-47D4-B109-DE3F1540CE1E");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, "DISPONIBILITA BDG");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, "077CBCEE-B72F-4351-9643-7CDDB19ED2DD");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, "20194CF5-531E-4B47-B2E7-1EDFED65D63D");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, "DATA INSERIMENTO");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, "6A3FB667-EFAF-408F-9ABE-D258E3B4CBFD");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, "329F0BC4-A91F-4260-9ADF-6E6F8504E1FE");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, "BABC2F57-CC09-4C39-A099-679E5A939239");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, "STN INI CA");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, "8C86FA7E-BD77-4983-915F-D459B8E7F09A");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, "VARIAZIONI CA");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.VIS_NONNULLAFIEL);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, "AEE6BA32-2F3C-4B8D-AC78-50750E50867A");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, "DISPONIBILITA CA");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, "F66F389B-7BF8-4B27-844B-3A6A4F545DE6");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, "RESIDUI PRESUNTI");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, "2857AC96-A582-4D02-9213-EBA73D5E5F8D");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, "VARIAZIONI REISCR DA IMP");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, "B35728FD-47FE-4B6D-B656-B3AF60FF6EC7");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, "VARIAZIONI REISCR DA STN");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, "04308C75-4BCF-4A63-B4F2-5A924B537BB9");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, "Nuovo");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_BIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, "2F1EEEAC-BC18-4BC4-A01C-A069CE5E6336");
    PAN_BIL.set_Header(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, "Fase Esefin");
    PAN_BIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, "");
    PAN_BIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.VIS_NORMFIELPADR);
    PAN_BIL.SetFlags(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_BIL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_BIL.SetFieldPage(PFL_BIL_ESERCIZIO, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_ESERCIZIO, PPQRY_BIL7, "ESERCIZIO", "ESERCIZIO", 3, 12, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_LIST, 24);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_LIST, "E S");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_FORM, 180, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_FORM, 40);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_ES, MyGlb.PANEL_FORM, "E S");
    PAN_BIL.SetFieldPage(PFL_BIL_ES, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_ES, PPQRY_BIL7, "E_S", "ES", 5, 1, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_LIST, 56, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_FORM, 276, 4, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_CAPITOLO, MyGlb.PANEL_FORM, "CAPITOLO");
    PAN_BIL.SetFieldPage(PFL_BIL_CAPITOLO, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_CAPITOLO, PPQRY_BIL7, "CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_ARTICOLO, MyGlb.PANEL_FORM, "ARTICOLO");
    PAN_BIL.SetFieldPage(PFL_BIL_ARTICOLO, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_ARTICOLO, PPQRY_BIL7, "ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_LIST, 56, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_LIST, 128);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_LIST, "IMP ACC ULT CH.");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_FORM, 164, 28, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_FORM, 144);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCHI, MyGlb.PANEL_FORM, "IMP ACC ULT CHIUSO");
    PAN_BIL.SetFieldPage(PFL_BIL_IMPACCULTCHI, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_IMPACCULTCHI, PPQRY_BIL7, "IMP_ACC_ULT_CHIUSO", "IMPACCULTCHI", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_LIST, 120, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_LIST, 112);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_LIST, "IMP ACC ULT CONS");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTCON, MyGlb.PANEL_FORM, "IMP ACC ULT CNS.");
    PAN_BIL.SetFieldPage(PFL_BIL_IMPACCULTCON, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_IMPACCULTCON, PPQRY_BIL7, "IMP_ACC_ULT_CONS", "IMPACCULTCON", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_LIST, 184, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_LIST, 108);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_LIST, "IMP ACC ULT SVIL");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_FORM, 188, 52, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_FORM, 120);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPACCULTSVI, MyGlb.PANEL_FORM, "IMP ACC ULT SVIL");
    PAN_BIL.SetFieldPage(PFL_BIL_IMPACCULTSVI, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_IMPACCULTSVI, PPQRY_BIL7, "IMP_ACC_ULT_SVIL", "IMPACCULTSVI", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_LIST, 60, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_LIST, 108);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_LIST, "Competenza Pura");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_FORM, 4, 388, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_FORM, 108);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_COMPETENPURA, MyGlb.PANEL_FORM, "Competenza Pura");
    PAN_BIL.SetFieldPage(PFL_BIL_COMPETENPURA, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_COMPETENPURA, PPQRY_BIL7, "COMPETENPURA", "COMPETENPURA", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_LIST, 164, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_LIST, "Reiscrizioni da Esigibilità");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_FORM, 4, 316, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_FORM, 144);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDAIMP, MyGlb.PANEL_FORM, "Reiscrizioni da Esigibilità");
    PAN_BIL.SetFieldPage(PFL_BIL_REISCRIDAIMP, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_REISCRIDAIMP, PPQRY_BIL7, "REISCRIZIONI_DA_IMP", "REISCRIDAIMP", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_LIST, 312, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_LIST, 108);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_LIST, "PREVIS. CONS");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_FORM, 188, 76, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_FORM, 120);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOCONS, MyGlb.PANEL_FORM, "PREVISIONE CONS");
    PAN_BIL.SetFieldPage(PFL_BIL_PREVISIOCONS, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_PREVISIOCONS, PPQRY_BIL7, "PREVISIONE_CONS", "PREVISIOCONS", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_LIST, 120, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_LIST, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_LIST, "PREVIS. SVIL");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIOSVIL, MyGlb.PANEL_FORM, "PREVISIONE SVIL");
    PAN_BIL.SetFieldPage(PFL_BIL_PREVISIOSVIL, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_PREVISIOSVIL, PPQRY_BIL7, "PREVISIONE_SVIL", "PREVISIOSVIL", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_LIST, 280, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_LIST, "Reiscrizioni Stanziamento");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_FORM, 236, 316, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_FORM, 144);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_REISCRIDASTN, MyGlb.PANEL_FORM, "Reiscr. Stanziamento");
    PAN_BIL.SetFieldPage(PFL_BIL_REISCRIDASTN, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_REISCRIDASTN, PPQRY_BIL7, "REISCRIZIONI_DA_STN", "REISCRIDASTN", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_LIST, 396, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_LIST, 68);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_LIST, "Competenza Totale");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_FORM, 188, 100, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_FORM, 80);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICO, MyGlb.PANEL_FORM, "Compet. Tot.");
    PAN_BIL.SetFieldPage(PFL_BIL_STNINICO, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_STNINICO, PPQRY_BIL7, "STN_INI_CO", "STNINICO", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_LIST, 372, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_LIST, 120);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_LIST, "VAR IMPEGN.");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_FORM, 4, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIMPEGNABI, MyGlb.PANEL_FORM, "VAR IMPEGN.");
    PAN_BIL.SetFieldPage(PFL_BIL_VARIMPEGNABI, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_VARIMPEGNABI, PPQRY_BIL7, "VAR_IMPEGNABILE", "VARIMPEGNABI", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_LIST, 512, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_LIST, 128);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_LIST, "Già Impegnato");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_FORM, 4, 340, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_FORM, 112);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_GIAIMPEGNATO, MyGlb.PANEL_FORM, "Già Impegnato");
    PAN_BIL.SetFieldPage(PFL_BIL_GIAIMPEGNATO, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_GIAIMPEGNATO, PPQRY_BIL7, "GIA_IMPEGNATO", "GIAIMPEGNATO", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_LIST, 516, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_LIST, "IMP.");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_FORM, 212, 220, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_FORM, 96);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_IMPEGNABILE, MyGlb.PANEL_FORM, "IMPEGNABILE");
    PAN_BIL.SetFieldPage(PFL_BIL_IMPEGNABILE, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_IMPEGNABILE, PPQRY_BIL7, "IMPEGNABILE", "IMPEGNABILE", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_LIST, 628, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_LIST, 76);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_LIST, "Previsione");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_PREVISIONE, MyGlb.PANEL_FORM, "Previsione");
    PAN_BIL.SetFieldPage(PFL_BIL_PREVISIONE, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_PREVISIONE, PPQRY_BIL7, "PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_LIST, 304, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_LIST, 100);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_LIST, "STN INI CO CONS");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOCONS, MyGlb.PANEL_FORM, "STN INI CO CONS");
    PAN_BIL.SetFieldPage(PFL_BIL_STNINICOCONS, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_STNINICOCONS, PPQRY_BIL7, "STN_INI_CO_CONS", "STNINICOCONS", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_LIST, 368, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_LIST, 96);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_LIST, "STN INI CO SVIL");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_FORM, 188, 124, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_FORM, 112);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICOSVIL, MyGlb.PANEL_FORM, "STN INI CO SVIL");
    PAN_BIL.SetFieldPage(PFL_BIL_STNINICOSVIL, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_STNINICOSVIL, PPQRY_BIL7, "STN_INI_CO_SVIL", "STNINICOSVIL", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_LIST, 432, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_LIST, 96);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_LIST, "VARIAZ. CO");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_FORM, 4, 148, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICO, MyGlb.PANEL_FORM, "VARIAZIONI CO");
    PAN_BIL.SetFieldPage(PFL_BIL_VARIAZIONICO, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_VARIAZIONICO, PPQRY_BIL7, "VARIAZIONI_CO", "VARIAZIONICO", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_LIST, 504, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_LIST, 128);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_LIST, "VARIAZ. CO CONS");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_FORM, 196, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_FORM, 144);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOCONS, MyGlb.PANEL_FORM, "VARIAZIONI CO CONS");
    PAN_BIL.SetFieldPage(PFL_BIL_VARIAZCOCONS, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_VARIAZCOCONS, PPQRY_BIL7, "VARIAZIONI_CO_CONS", "VARIAZCOCONS", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_LIST, 568, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_LIST, 124);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_LIST, "VARIAZ. CO SVIL");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZCOSVIL, MyGlb.PANEL_FORM, "VARIAZ. CO SVIL");
    PAN_BIL.SetFieldPage(PFL_BIL_VARIAZCOSVIL, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_VARIAZCOSVIL, PPQRY_BIL7, "VARIAZIONI_CO_SVIL", "VARIAZCOSVIL", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_LIST, 632, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_LIST, 96);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_LIST, "DISPONIBILITA");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_FORM, 188, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_FORM, 112);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILIT, MyGlb.PANEL_FORM, "DISPONIBILITA");
    PAN_BIL.SetFieldPage(PFL_BIL_DISPONIBILIT, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_DISPONIBILIT, PPQRY_BIL7, "DISPONIBILITA", "DISPONIBILIT", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_LIST, 304, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_LIST, 128);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_LIST, "DISPONIBILITA CONS");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBCONS, MyGlb.PANEL_FORM, "DISPON. CONS");
    PAN_BIL.SetFieldPage(PFL_BIL_DISPONIBCONS, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_DISPONIBCONS, PPQRY_BIL7, "DISPONIBILITA_CONS", "DISPONIBCONS", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_LIST, 304, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_LIST, 124);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_LIST, "DISPON. SVIL");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_FORM, 220, 196, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_FORM, 136);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBSVIL, MyGlb.PANEL_FORM, "DISPONIBILITA SVIL");
    PAN_BIL.SetFieldPage(PFL_BIL_DISPONIBSVIL, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_DISPONIBSVIL, PPQRY_BIL7, "DISPONIBILITA_SVIL", "DISPONIBSVIL", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_LIST, 480, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_LIST, 120);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_LIST, "DISPON. BDG");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBIBDG, MyGlb.PANEL_FORM, "DISPON. BDG");
    PAN_BIL.SetFieldPage(PFL_BIL_DISPONIBIBDG, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_DISPONIBIBDG, PPQRY_BIL7, "DISPONIBILITA_BDG", "DISPONIBIBDG", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_LIST, 4, 248, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_FORM, 188, 244, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_FORM, 144);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_BIL.SetFieldPage(PFL_BIL_UTENTEINSERI, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_UTENTEINSERI, PPQRY_BIL7, "UTENTE_INSERIMENTO", "UTENTEINSERI", 5, 8, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_LIST, 252, 248, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_FORM, 4, 268, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_FORM, 104);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_BIL.SetFieldPage(PFL_BIL_DATAINSERIME, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_DATAINSERIME, PPQRY_BIL7, "DATA_INSERIMENTO", "DATAINSERIME", 6, 10, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_LIST, 4, 272, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_FORM, 212, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_FORM, 136);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_BIL.SetFieldPage(PFL_BIL_UTENTULTIAGG, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_UTENTULTIAGG, PPQRY_BIL7, "UTENTE_ULTIMO_AGG", "UTENTULTIAGG", 5, 8, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_LIST, 252, 272, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_LIST, 32);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_LIST, "D. U. A.");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_FORM, 436, 28, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_FORM, 20);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULT. AGG");
    PAN_BIL.SetFieldPage(PFL_BIL_DATAULTIMAGG, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_DATAULTIMAGG, PPQRY_BIL7, "DATA_ULTIMO_AGG", "DATAULTIMAGG", 6, 10, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_LIST, 4, 296, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_LIST, "STN INI CA");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_FORM, 388, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_FORM, 80);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_STNINICA, MyGlb.PANEL_FORM, "STN INI CA");
    PAN_BIL.SetFieldPage(PFL_BIL_STNINICA, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_STNINICA, PPQRY_BIL7, "STN_INI_CA", "STNINICA", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_LIST, 252, 296, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_LIST, 32);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_LIST, "V. C.");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_FORM, 404, 100, 80, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_FORM, 20);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIAZIONICA, MyGlb.PANEL_FORM, "VARIAZ. CA");
    PAN_BIL.SetFieldPage(PFL_BIL_VARIAZIONICA, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_VARIAZIONICA, PPQRY_BIL7, "VARIAZIONI_CA", "VARIAZIONICA", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_LIST, 372, 296, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_LIST, 144);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_LIST, "DISPONIBILITA CA");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_FORM, 4, 292, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_FORM, 128);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_DISPONIBILCA, MyGlb.PANEL_FORM, "DISPONIBILITA CA");
    PAN_BIL.SetFieldPage(PFL_BIL_DISPONIBILCA, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_DISPONIBILCA, PPQRY_BIL7, "DISPONIBILITA_CA", "DISPONIBILCA", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_LIST, 4, 320, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_LIST, "RESIDUI PRESUNTI");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_FORM, 220, 292, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_FORM, 128);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_RESIDUPRESUN, MyGlb.PANEL_FORM, "RESIDUI PRESUNTI");
    PAN_BIL.SetFieldPage(PFL_BIL_RESIDUPRESUN, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_RESIDUPRESUN, PPQRY_BIL7, "RESIDUI_PRESUNTI", "RESIDUPRESUN", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_LIST, 4, 368, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_LIST, "VARIAZ. REISCR DA IMP");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_FORM, 204, 340, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_FORM, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDAIMP, MyGlb.PANEL_FORM, "VARIAZ. REISCR DA IMP");
    PAN_BIL.SetFieldPage(PFL_BIL_VARIREIDAIMP, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_VARIREIDAIMP, PPQRY_BIL7, "VARIAZIONI_REISCR_DA_IMP", "VARIREIDAIMP", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_LIST, 252, 368, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_LIST, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_LIST, "VARIAZ. REISCR DA STN");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_FORM, 4, 364, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_FORM, 160);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_VARIREIDASTN, MyGlb.PANEL_FORM, "VARIAZ. REISCR DA STN");
    PAN_BIL.SetFieldPage(PFL_BIL_VARIREIDASTN, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_VARIREIDASTN, PPQRY_BIL7, "VARIAZIONI_REISCR_DA_STN", "VARIREIDASTN", 3, 14, 2, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_LIST, 764, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_LIST, 44);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_LIST, "Nuovo");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_FORM, 4, 412, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_FORM, 44);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_NUOVO, MyGlb.PANEL_FORM, "Nuovo");
    PAN_BIL.SetFieldPage(PFL_BIL_NUOVO, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_NUOVO, PPQRY_BIL7, "NUOVO", "NUOVO", 1, 1, 0, -13997);
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_LIST, 744, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_LIST, 72);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_LIST, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_LIST, "Fase Esefin");
    PAN_BIL.SetRect(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_FORM, 4, 412, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_BIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_FORM, 72);
    PAN_BIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_FORM, 1);
    PAN_BIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_BIL_FASEESEFIN, MyGlb.PANEL_FORM, "Fase Esefin");
    PAN_BIL.SetFieldPage(PFL_BIL_FASEESEFIN, -1, -1);
    PAN_BIL.SetFieldPanel(PFL_BIL_FASEESEFIN, PPQRY_BIL7, "FASEESEFIN", "FASEESEFIN", 1, 1, 0, -13997);
  }

  private void PAN_BIL_InitQueries()
  {
    StringBuffer SQL;

    PAN_BIL.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1 ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~ESERCIZIO~~) ");
    SQL.append("and   (A.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_BIL.SetQuery(PPQRY_ESEFIN, 0, SQL, PFL_BIL_ESERCIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESEFINESERCI, ");
    SQL.append("  A.ESERCIZIO as ESEFINESERC1 ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_BIL.SetQuery(PPQRY_ESEFIN, 1, SQL, PFL_BIL_ESERCIZIO, "");
    PAN_BIL.SetQueryDB(PPQRY_ESEFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_BIL.SetIMDB(IMDB, "PQRY_BIL7", true);
    PAN_BIL.set_SetString(MyGlb.MASTER_ROWNAME, "BIL");
    PAN_BIL.SetDocumentClass(0, "BIL");
    PAN_BIL.AddDOSortCriteria(BIL.BIL_ESERCIZIO);
    PAN_BIL.SetDOWhereClause("(ESERCIZIO > ~~TBL_DATISESSIONE.SESSIOESERCI~~) and (E_S = ~~TBL_IMDBSTANZ1.NOMEOGGETTES~~) and (CAPITOLO = ~~TBL_IMDBSTANZ1.NOMEOGGECAPI~~) and (ARTICOLO = ~~TBL_IMDBSTANZ1.NOMEOGGEARTI~~)");
    PAN_BIL.AddToSortList(PFL_BIL_ESERCIZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_BIL.Status() == 2)
    {
      int oldListQBE = PAN_BIL.iUseListQBE;
      PAN_BIL.iUseListQBE = 0;
      PAN_BIL.PanelCommand(Glb.PCM_SEARCH);
      PAN_BIL.PanelCommand(Glb.PCM_FIND);
      PAN_BIL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_BIL) PAN_BIL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_BIL) PAN_BIL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BIL) PAN_BIL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_BIL) PAN_BIL_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_BIL) PAN_BIL_OnChangeRow();
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
    if (SrcObj == PAN_BIL) PAN_BIL_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_BIL) PAN_BIL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
