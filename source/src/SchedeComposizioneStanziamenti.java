// **********************************************
// Schede Composizione Stanziamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedeComposizioneStanziamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_ESERCIPLURIE = 0;
  private static int PFL_PARS_TIPOSCHEDA = 1;
  private static int PFL_PARS_MISSIONI = 2;
  private static int PFL_PARS_PROGRAMMI = 3;
  private static int PFL_PARS_TITOLOSPESA = 4;
  private static int PFL_PARS_MACROAGGREGA = 5;
  private static int PFL_PARS_SOLOBILPREVI = 6;
  private static int PFL_PARS_TIPOBILANCIO = 7;
  private static int PFL_PARS_UNITAORGANIZ = 8;
  private static int PFL_PARS_TITOLOENTRAT = 9;
  private static int PFL_PARS_TIPOLOGIA = 10;
  private static int PFL_PARS_CAPITOLO = 11;
  private static int PFL_PARS_ARTICOLO = 12;
  private static int PFL_PARS_ETICSCELCAPI = 13;
  private static int PFL_PARS_ETICINFOCAPI = 14;
  private static int PFL_PARS_ETICHEELABOR = 15;

  private static int PPQRY_PARS40 = 0;

  private static int PPQRY_VISTMISSPRO1 = 1;
  private static int PPQRY_VISTMISSPROG = 2;
  private static int PPQRY_VISTSTRURICL = 3;
  private static int PPQRY_CF4ESPPIACON = 4;
  private static int PPQRY_CAPUO = 5;
  private static int PPQRY_VISTTITOTIP1 = 6;
  private static int PPQRY_VISTTITOTIPO = 7;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS41(IMDB);
    //
    //
    Init_PQRY_PARS40(IMDB);
    Init_PQRY_PARS40_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS41(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS41, 13);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS41, "TBL_PARS41");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTIPSCH, "NOMOGGTIPSCH");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTIPSCH,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEMACR, "NOMEOGGEMACR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGEMACR,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTITENT, "NOMOGGTITENT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTITENT,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMEOGGETIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTITSPE, "NOMOGGTITSPE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTITSPE,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGSOBIPR, "NOMOGGSOBIPR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGSOBIPR,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTIPBIL, "NOMOGGTIPBIL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS41,IMDBDef3.FLD_PARS41_NOMOGGTIPBIL,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS41, 0);
  }

  private static void Init_PQRY_PARS40(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS40, 13);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS40, "PQRY_PARS40");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, "NOMOGGTIPSCH");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEMACR, "NOMEOGGEMACR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGEMACR,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTITENT, "NOMOGGTITENT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTITENT,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMEOGGETIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTITSPE, "NOMOGGTITSPE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTITSPE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGSOBIPR, "NOMOGGSOBIPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGSOBIPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTIPBIL, "NOMOGGTIPBIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40,IMDBDef11.PQSL_PARS40_NOMOGGTIPBIL,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARS40, 0);
  }

  private static void Init_PQRY_PARS40_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS40_RS, 13);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS40_RS, "PQRY_PARS40_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGESEPLU, "NOMOGGESEPLU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGESEPLU,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, "NOMOGGTIPSCH");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, "NOMOGGUNIORG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEMISS, "NOMEOGGEMISS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEMISS,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEMACR, "NOMEOGGEMACR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGEMACR,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTITENT, "NOMOGGTITENT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTITENT,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMEOGGETIPO,5,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTITSPE, "NOMOGGTITSPE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTITSPE,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGSOBIPR, "NOMOGGSOBIPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGSOBIPR,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTIPBIL, "NOMOGGTIPBIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS40_RS,IMDBDef11.PQSL_PARS40_NOMOGGTIPBIL,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedeComposizioneStanziamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedeComposizioneStanziamenti()
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
    FormIdx = MyGlb.FRM_SCHECOMPSTAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "73D0B4D6-053B-4DE9-AC26-5C5068F42192";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 464;
    DesignHeight = 326;
    set_Caption(new IDVariant("Schede Composizione Stanziamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 464;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 464-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6619C89E-84F9-4816-AEF0-CC44F6AE4F61");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1072, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS41, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCHECOMPSTAN_PARS40();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    return (obj instanceof SchedeComposizioneStanziamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedeComposizioneStanziamenti.class.getName() : (Glb.ClassWithPackage(SchedeComposizioneStanziamenti.class) ? SchedeComposizioneStanziamenti.class.getName().substring(SchedeComposizioneStanziamenti.class.getPackage().getName().length() + 1) : SchedeComposizioneStanziamenti.class.getName()));
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
      LOAD_PARSDELETE();
      IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPSCH, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGUNIORG, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGSOBIPR, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPBIL, 0, (new IDVariant("A")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedeComposizioneStanziamenti", "Load", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGESEPLU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPSCH, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGUNIORG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEPROG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEMACR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTITENT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGETIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTITSPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGSOBIPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPBIL, 0, new IDVariant());
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedeComposizioneStanziamenti", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGESEPLU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPSCH, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGUNIORG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEMISS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEPROG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEMACR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTITENT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGETIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTITSPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGSOBIPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPBIL, 0, new IDVariant());
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedeComposizioneStanziamenti", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARS_ESERCIPLURIE)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGESEPLU, 0))))
        {
          if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGESEPLU, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("L'esercizio pluriennale non può essere inferiore all'esercizio del contesto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGESEPLU, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARS_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_PARS_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, 0))))
        {
          IDVariant v_ES = null;
          v_ES = (new IDVariant());
          v_ES = ((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(3)), true))?(new IDVariant("S")):((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(2)), true))?(new IDVariant("E")):(new IDVariant("ES"))));
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, 0),(new IDVariant(-1))).equals((new IDVariant(-1)), true))
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(v_ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ES', A.E_S, " + IDL.CSql(v_ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          else
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  VISTA_BILANCIO_UO A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = DECODE(" + IDL.CSql(v_ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'ES', A.E_S, " + IDL.CSql(v_ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.TIPO = 'O') ");
            SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1), " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
          }
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Capitolo non previsto in Bilancio"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_TIPOSCHEDA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0))))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Esercizio calcolo FPV"));
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("Esercizio Pluriennale"));
          if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(4)), true))
          {
            PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ESERCIPLURIE, new IDVariant(S).stringValue());
          }
          else
          {
            PAN_PARS.set_Header(Glb.OBJ_FIELD,PFL_PARS_ESERCIPLURIE, new IDVariant(v_S1).stringValue());
          }
          IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEMISS, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEPROG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEMACR, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_MISSIONI)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEPROG, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PARS_TITOLOENTRAT)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGETIPO, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PARS_TITOLOSPESA)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEMACR, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedeComposizioneStanziamenti", "ParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pars On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARS);
      // 
      // Pars On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(4)), true))
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_MISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_PROGRAMMI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(160)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_CAPITOLO, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(184)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_ARTICOLO, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(184)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(188)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(188)).intValue());
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(2)), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_MISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_PROGRAMMI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(136)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_CAPITOLO, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(160)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_ARTICOLO, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(160)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(164)).intValue());
        PAN_PARS.set_ObjRect(Glb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(164)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedeComposizioneStanziamenti", "ParsOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Scelta Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Capitolo Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, 0),(new IDVariant(-1))).equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, ((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(3)), true))?(new IDVariant("S")):((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(2)), true))?(new IDVariant("E")):(new IDVariant("ES")))));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, ((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(3)), true))?(new IDVariant("S")):((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(2)), true))?(new IDVariant("E")):(new IDVariant("ES")))));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("O")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, 0));
        MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedeComposizioneStanziamenti", "EtichettaSceltaCapitolo", _e);
      return -1;
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGESEPLU, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Esercizio Pluriennale obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0)))
      {
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Tipo Scheda obbligatoria"));
        MainFrm.set_AlertMessage(v_S1); 
        return 0;
      }
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(1)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Scheda_Comp_Stanz_da_Esig_Impegni"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(2)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Scheda_Comp_Stanz_da_Esig_Acc"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(3)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Scheda_Comp_Stanz_da_Crono"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("schedaCompFPV"));
        v_NOMESTAMPA = new IDVariant(S);
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO_RIF")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGESEPLU, 0)));
      if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(4)), true))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_MACRO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEMACR, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_BIL")), ((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGSOBIPR, 0).equals((new IDVariant("SI")), true))?(new IDVariant("I")):(new IDVariant("X"))));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_BIL_APP")), IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPBIL, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CAPITOLO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGECAPI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ARTICOLO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEARTI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGR_UO")), IDL.ToString(((IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).equals((new IDVariant(4)), true) && IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, 0).equals((new IDVariant(-1)), true))?(new IDVariant()):IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGUNIORG, 0))));
      if (IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTIPSCH, 0).compareTo((new IDVariant(2)), true)!=0)
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_MISSIONE")), IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEMISS, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGRAMMA")), IDL.SubStr(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGEPROG, 0), (new IDVariant(3))));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TITOLO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTITSPE, 0)));
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TITOLO")), IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMOGGTITENT, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPOLOGIA")), IDL.SubStr(IMDB.Value(IMDBDef11.PQRY_PARS40, IMDBDef11.PQSL_PARS40_NOMEOGGETIPO, 0), (new IDVariant(3))));
      }
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedeComposizioneStanziamenti", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SCHECOMPSTAN_PARS40() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARS40_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS41, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS41, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARS40_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARS40_RS, 0, IMDBDef3.TBL_PARS41, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 0, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGESEPLU, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 1, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPSCH, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 2, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGUNIORG, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 3, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 4, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 5, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEMISS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 6, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEPROG, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 7, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGEMACR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 8, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTITENT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 9, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMEOGGETIPO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 10, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTITSPE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 11, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGSOBIPR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS40_RS, 12, 0, IMDBDef3.TBL_PARS41, IMDBDef3.FLD_PARS41_NOMOGGTIPBIL, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS41, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS41, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS41, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARS40_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_ETICSCELCAPI)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, "804680F0-E678-497B-8488-8E60F9404226");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, "Esercizio Pluriennale");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.VIS_NORMFIELPADR);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, "DDC2CDFC-F0CA-4C07-A04D-AE38C7672E12");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, "Tipo Scheda");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, "9C44A2D8-68DB-44B3-971E-2A3A7FD9F423");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, "Missioni");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, "3B80D1A1-D09C-4387-9827-0D20DAAECCFD");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, "Programmi");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, "E7F21B9D-1D12-4A45-B3F4-2FF09841BE1C");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, "Titolo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, "6DE1907F-B4A4-4E59-A400-56E3FCB61F0C");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, "Macroaggregato");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, "4007F334-BC96-4A7B-9C1C-8A0470AFB92F");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, "Solo Bil. Previsione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, "CCC8EBB8-E111-4FE1-87B4-7243F52AC495");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, "Bilancio Approvato o in Previsione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, "B37239EA-1AE7-4E8A-9607-854D06F3724A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, "1A54C0AB-A0E0-4D2D-9561-4DD166565982");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, "Titolo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, "16D09F0F-0E33-47AB-800C-61AB91F52916");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, "Tipologia");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, "123354B7-3A26-4846-B66C-D12175576D39");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, "Capitolo/Art.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, "2B66F687-5863-47C9-B264-EEA6F828AA8A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, "4B21228C-08D3-4300-9233-EEA20CF7DF7D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, "535D37D3-F37D-47AB-80CB-27F67C39C5EB");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, 0, "info.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "C74F3AC5-3177-4883-BE0D-354ABFE16B52");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Elabora");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_LIST, 124);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_LIST, "Eserc. Plur.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_FORM, 4, 16, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_FORM, 184);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIPLURIE, MyGlb.PANEL_FORM, "Esercizio Pluriennale");
    PAN_PARS.SetFieldPage(PFL_PARS_ESERCIPLURIE, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ESERCIPLURIE, PPQRY_PARS40, "A.NOMOGGESEPLU", "NOMOGGESEPLU", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_LIST, 0, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_LIST, "Tipo Scheda");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_FORM, 52, 40, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_FORM, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOSCHEDA, MyGlb.PANEL_FORM, "Tipo Scheda");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPOSCHEDA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPOSCHEDA, PPQRY_PARS40, "A.NOMOGGTIPSCH", "NOMOGGTIPSCH", 1, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOSCHEDA, (new IDVariant(1)), "Esigibilità da Impegni", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOSCHEDA, (new IDVariant(2)), "Esigibilità da Accertamenti", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOSCHEDA, (new IDVariant(3)), "Stanziamenti da Cronoprogrammi", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOSCHEDA, (new IDVariant(4)), "Fondo Pluriennale Vincolato", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_LIST, "Missioni");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_FORM, 132, 64, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_FORM, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MISSIONI, MyGlb.PANEL_FORM, "Missioni");
    PAN_PARS.SetFieldPage(PFL_PARS_MISSIONI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_MISSIONI, PPQRY_PARS40, "A.NOMEOGGEMISS", "NOMEOGGEMISS", 5, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_LIST, 72);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_LIST, "Programmi");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_FORM, 116, 88, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_FORM, 72);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRAMMI, MyGlb.PANEL_FORM, "Programmi");
    PAN_PARS.SetFieldPage(PFL_PARS_PROGRAMMI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PROGRAMMI, PPQRY_PARS40, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 5, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_LIST, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_LIST, "Titolo");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_FORM, 108, 112, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOSPESA, MyGlb.PANEL_FORM, "Titolo");
    PAN_PARS.SetFieldPage(PFL_PARS_TITOLOSPESA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TITOLOSPESA, PPQRY_PARS40, "A.NOMOGGTITSPE", "NOMOGGTITSPE", 1, 1, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_LIST, 104);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_LIST, "Macroaggregato");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_FORM, 84, 112, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_FORM, 104);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_MACROAGGREGA, MyGlb.PANEL_FORM, "Macroaggregato");
    PAN_PARS.SetFieldPage(PFL_PARS_MACROAGGREGA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_MACROAGGREGA, PPQRY_PARS40, "A.NOMEOGGEMACR", "NOMEOGGEMACR", 1, 10, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_LIST, 112);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_LIST, "Solo Bil. Previsione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_FORM, 72, 136, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_FORM, 116);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_SOLOBILPREVI, MyGlb.PANEL_FORM, "Solo Bil. Previsione");
    PAN_PARS.SetFieldPage(PFL_PARS_SOLOBILPREVI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_SOLOBILPREVI, PPQRY_PARS40, "A.NOMOGGSOBIPR", "NOMOGGSOBIPR", 5, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_SOLOBILPREVI, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_SOLOBILPREVI, (new IDVariant()), "Null", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_LIST, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_LIST, "Bilan. Appr. o in Previsione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_FORM, 220, 136, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_FORM, 80);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOBILANCIO, MyGlb.PANEL_FORM, "Bl. Ap. o i. Pr.");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPOBILANCIO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPOBILANCIO, PPQRY_PARS40, "A.NOMOGGTIPBIL", "NOMOGGTIPBIL", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOBILANCIO, (new IDVariant("A")), "Bil. Approvato", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TIPOBILANCIO, (new IDVariant("P")), "Bil. in Preparazione", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_LIST, "Un. Org.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, 52, 160, 376, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_UNITAORGANIZ, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_UNITAORGANIZ, PPQRY_PARS40, "A.NOMOGGUNIORG", "NOMOGGUNIORG", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_LIST, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_LIST, "Titolo");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_FORM, 100, 64, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_FORM, 88);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TITOLOENTRAT, MyGlb.PANEL_FORM, "Titolo");
    PAN_PARS.SetFieldPage(PFL_PARS_TITOLOENTRAT, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TITOLOENTRAT, PPQRY_PARS40, "A.NOMOGGTITENT", "NOMOGGTITENT", 5, 1, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_LIST, "Tipologia");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_FORM, 128, 88, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_FORM, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TIPOLOGIA, MyGlb.PANEL_FORM, "Tipologia");
    PAN_PARS.SetFieldPage(PFL_PARS_TIPOLOGIA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TIPOLOGIA, PPQRY_PARS40, "A.NOMEOGGETIPO", "NOMEOGGETIPO", 5, 5, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, 52, 184, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, 136);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARS.SetFieldPage(PFL_PARS_CAPITOLO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CAPITOLO, PPQRY_PARS40, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, 340, 184, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ARTICOLO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ARTICOLO, PPQRY_PARS40, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_LIST, 324, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_FORM, 392, 188, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICSCELCAPI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICSCELCAPI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICSCELCAPI, -1, "", "ETICSCELCAPI", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, MyGlb.PANEL_LIST, 332, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, MyGlb.PANEL_FORM, 412, 188, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICINFOCAPI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICINFOCAPI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICINFOCAPI, -1, "", "ETICINFOCAPI", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 288, 120, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 348, 224, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 8);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPRODES ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~NOMEOGGEMISS~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.MISSIONE ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPRO1, 0, SQL, PFL_PARS_MISSIONI, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as VISMISPROMIS, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as VISMISPRODES ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.MISSIONE ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPRO1, 1, SQL, PFL_PARS_MISSIONI, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTMISSPRO1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.PROGRAMMA = ~~NOMEOGGEPROG~~) ");
    SQL.append("and   (A.MISSIONE = NVL(~~NOMEOGGEMISS~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.PROGRAMMA ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPROG, 0, SQL, PFL_PARS_PROGRAMMI, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGRAMMA as VISMISPROPRO, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as VISMISPROPR1 ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = NVL(~~NOMEOGGEMISS~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.PROGRAMMA ");
    PAN_PARS.SetQuery(PPQRY_VISTMISSPROG, 1, SQL, PFL_PARS_PROGRAMMI, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTMISSPROG, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISSTRRICCO1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTITSPE~~) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_VISTSTRURICL, 0, SQL, PFL_PARS_TITOLOSPESA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VISSTRRICCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VISSTRRICCO1 ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_VISTSTRURICL, 1, SQL, PFL_PARS_TITOLOSPESA, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTSTRURICL, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CFESPICOVSRC, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEMACR~~) ");
    SQL.append("and   (A.CODICE_PADRE = NVL(~~NOMOGGTITSPE~~, A.CODICE_PADRE)) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_CF4ESPPIACON, 0, SQL, PFL_PARS_MACROAGGREGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CFESPICOVSRC, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  VISTA_STRUTTURA_RICL A ");
    SQL.append("where (A.CODICE_PADRE = NVL(~~NOMOGGTITSPE~~, A.CODICE_PADRE)) ");
    SQL.append("and   (A.CODICE_TIPO_RICL = 'MACRO') ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   ((~~TBL_DATISESSIONE.SESSIOESERCI~~ BETWEEN A.ESERCIZIO_INIZIO AND A.ESERCIZIO_SCADENZA)) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARS.SetQuery(PPQRY_CF4ESPPIACON, 1, SQL, PFL_PARS_MACROAGGREGA, "");
    PAN_PARS.SetQueryDB(PPQRY_CF4ESPPIACON, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUOPRUNOR1, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESC1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGGUNIORG~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("group by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  SUM(1), ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (NVL(~~NOMOGGUNIORG~~, -1) = -1) ");
    SQL.append("order by 3 ");
    PAN_PARS.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_PARS_UNITAORGANIZ, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CAPUOPRUNOR1, ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESC1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("group by ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )), ");
    SQL.append("  SO4_UTIL.UNITA_GET_CODICE_VALIDO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  SUM(1), ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 3 ");
    PAN_PARS.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_PARS_UNITAORGANIZ, "");
    PAN_PARS.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TITOLO as VISTITTIPTIT, ");
    SQL.append("  A.TITOLO || ' - ' || A.DES_TITOLO as VISTITTIPTI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE A ");
    SQL.append("where (A.TITOLO = ~~NOMOGGTITENT~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_PARS.SetQuery(PPQRY_VISTTITOTIP1, 0, SQL, PFL_PARS_TITOLOENTRAT, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.TITOLO as VISTITTIPTIT, ");
    SQL.append("  A.TITOLO || ' - ' || A.DES_TITOLO as VISTITTIPTI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_PARS.SetQuery(PPQRY_VISTTITOTIP1, 1, SQL, PFL_PARS_TITOLOENTRAT, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTTITOTIP1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPOLOGIA as VISTITTIPTIP, ");
    SQL.append("  A.TIPOLOGIA || ' - ' || A.DES_TIPOLOGIA as VISTITTIPTI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE A ");
    SQL.append("where (A.TIPOLOGIA = ~~NOMEOGGETIPO~~) ");
    SQL.append("and   (A.TITOLO = NVL(~~NOMOGGTITENT~~, A.TITOLO)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("order by ");
    SQL.append("  A.TIPOLOGIA ");
    PAN_PARS.SetQuery(PPQRY_VISTTITOTIPO, 0, SQL, PFL_PARS_TIPOLOGIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPOLOGIA as VISTITTIPTIP, ");
    SQL.append("  A.TIPOLOGIA || ' - ' || A.DES_TIPOLOGIA as VISTITTIPTI1 ");
    SQL.append("from ");
    SQL.append("  VISTA_TITOLI_TIPOLOGIE A ");
    SQL.append("where (A.TITOLO = NVL(~~NOMOGGTITENT~~, A.TITOLO)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("order by ");
    SQL.append("  A.TIPOLOGIA ");
    PAN_PARS.SetQuery(PPQRY_VISTTITOTIPO, 1, SQL, PFL_PARS_TIPOLOGIA, "");
    PAN_PARS.SetQueryDB(PPQRY_VISTTITOTIPO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS40", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS40, IMDBDef11.PQRY_PARS40_RS, IMDBDef3.TBL_PARS41);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ESERCIPLURIE, IMDBDef3.FLD_PARS41_NOMOGGESEPLU);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPOSCHEDA, IMDBDef3.FLD_PARS41_NOMOGGTIPSCH);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_MISSIONI, IMDBDef3.FLD_PARS41_NOMEOGGEMISS);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PROGRAMMI, IMDBDef3.FLD_PARS41_NOMEOGGEPROG);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TITOLOSPESA, IMDBDef3.FLD_PARS41_NOMOGGTITSPE);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_MACROAGGREGA, IMDBDef3.FLD_PARS41_NOMEOGGEMACR);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_SOLOBILPREVI, IMDBDef3.FLD_PARS41_NOMOGGSOBIPR);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPOBILANCIO, IMDBDef3.FLD_PARS41_NOMOGGTIPBIL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_UNITAORGANIZ, IMDBDef3.FLD_PARS41_NOMOGGUNIORG);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TITOLOENTRAT, IMDBDef3.FLD_PARS41_NOMOGGTITENT);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TIPOLOGIA, IMDBDef3.FLD_PARS41_NOMEOGGETIPO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CAPITOLO, IMDBDef3.FLD_PARS41_NOMEOGGECAPI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ARTICOLO, IMDBDef3.FLD_PARS41_NOMEOGGEARTI);
    PAN_PARS.SetMasterTable(0, "PARS41");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
