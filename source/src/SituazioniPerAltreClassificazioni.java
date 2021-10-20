// **********************************************
// Situazioni Per Altre Classificazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioniPerAltreClassificazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PERSIT_ES = 0;
  private static int PFL_PERSIT_SITPERQUALUO = 1;
  private static int PFL_PERSIT_UOSUP2 = 2;
  private static int PFL_PERSIT_UOPRIMOLIVEL = 3;
  private static int PFL_PERSIT_UOGESTIONE = 4;
  private static int PFL_PERSIT_FLESSIBILITA = 5;
  private static int PFL_PERSIT_TIPOVINCOLO = 6;
  private static int PFL_PERSIT_DETTAGCAPITO = 7;
  private static int PFL_PERSIT_DESCRIABBREV = 8;
  private static int PFL_PERSIT_SOLOCOMPETEN = 9;
  private static int PFL_PERSIT_TOTALPERTITO = 10;
  private static int PFL_PERSIT_DATAELABORAZ = 11;
  private static int PFL_PERSIT_ETICHEELABOR = 12;

  private static int PPQRY_PERSIT1 = 0;

  private static int PPQRY_ANAGUNITORG1 = 1;
  private static int PPQRY_ANAGUNITORGA = 2;
  private static int PPQRY_SO4ANAUNIORG = 3;
  private static int PPQRY_FLESSIBILITA = 4;
  private static int PPQRY_VINCOLI = 5;


  IDPanel PAN_PERSIT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PERSIT(IMDB);
    //
    //
    Init_PQRY_PERSIT1(IMDB);
    Init_PQRY_PERSIT1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PERSIT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PERSIT, 15);
    IMDB.set_TblCode(IMDBDef4.TBL_PERSIT, "TBL_PERSIT");
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDETCAP, "NOMOGGDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGTOPETI, "NOMOGGTOPETI");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDESABB, "NOMOGGDESABB");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDESABB,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, "NOMOGGTIPCLA");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA,5,20,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMEOGGEFLES, "NOMEOGGEFLES");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMEOGGEFLES,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGTIPVIN, "NOMOGGTIPVIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGTIPVIN,1,7,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO, "NOOGSIPEQUUO");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO,1,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGUOSUOUT, "NOMOGUOSUOUT");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGUOSUOUT,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, "NOMOGGDEUOSU");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU,5,250,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMEOGGUOGES, "NOMEOGGUOGES");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMEOGGUOGES,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, "NOMOGDEUOSU2");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2,5,250,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGUOSUP2, "NOMOGGUOSUP2");
    IMDB.SetFldParams(IMDBDef4.TBL_PERSIT,IMDBDef4.FLD_PERSIT_NOMOGGUOSUP2,1,8,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PERSIT, 0);
  }

  private static void Init_PQRY_PERSIT1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PERSIT1, 12);
    IMDB.set_TblCode(IMDBDef13.PQRY_PERSIT1, "PQRY_PERSIT1");
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, "NOMOGGDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGTOPETI, "NOMOGGTOPETI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, "NOMOGGDESABB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMEOGGEFLES, "NOMEOGGEFLES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMEOGGEFLES,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGTIPVIN, "NOMOGGTIPVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGTIPVIN,1,7,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, "NOMOGUOSUOUT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, "NOOGSIPEQUUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, "NOMEOGGUOGES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, "NOMOGGUOSUP2");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1,IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2,1,8,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PERSIT1, 0);
  }

  private static void Init_PQRY_PERSIT1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PERSIT1_RS, 12);
    IMDB.set_TblCode(IMDBDef13.PQRY_PERSIT1_RS, "PQRY_PERSIT1_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, "NOMOGGDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, "NOMOGGSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGTOPETI, "NOMOGGTOPETI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, "NOMOGGDESABB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, "NOMOGGDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMEOGGEFLES, "NOMEOGGEFLES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMEOGGEFLES,5,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGTIPVIN, "NOMOGGTIPVIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGTIPVIN,1,7,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, "NOMOGUOSUOUT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, "NOOGSIPEQUUO");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO,1,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, "NOMEOGGUOGES");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, "NOMOGGUOSUP2");
    IMDB.SetFldParams(IMDBDef13.PQRY_PERSIT1_RS,IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2,1,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioniPerAltreClassificazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioniPerAltreClassificazioni()
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
    FormIdx = MyGlb.FRM_SITPERALTCLA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4493135F-2CAF-453F-9821-C22C6A0E94C2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 632;
    DesignHeight = 326;
    set_Caption(new IDVariant("Situazioni Per Altre Classificazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 632;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Per Sit";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_PERSIT = new IDPanel(w, this, 1, "PAN_PERSIT");
    Frames[1].Content = PAN_PERSIT;
    PAN_PERSIT.Lockable = false;
    PAN_PERSIT.iLocked = false;
    PAN_PERSIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PERSIT.VS = MainFrm.VisualStyleList;
    PAN_PERSIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 632-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "613B0D9C-77CF-46C9-A360-D8983D93C6A8");
    PAN_PERSIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1072, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PERSIT.InitStatus = 1;
    PAN_PERSIT_Init();
    PAN_PERSIT_InitFields();
    PAN_PERSIT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PERSIT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITPERALTCLA_PERSIT1();
      }
      PAN_PERSIT.UpdatePanel(MainFrm);
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
    return (obj instanceof SituazioniPerAltreClassificazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioniPerAltreClassificazioni.class.getName() : (Glb.ClassWithPackage(SituazioniPerAltreClassificazioni.class) ? SituazioniPerAltreClassificazioni.class.getName().substring(SituazioniPerAltreClassificazioni.class.getPackage().getName().length() + 1) : SituazioniPerAltreClassificazioni.class.getName()));
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
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGSOLCOM, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTOPETI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDESABB, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPVIN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGEFLES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGUOSUOUT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGUOSUP2, 0, (new IDVariant()));
      IDVariant v_UOGESTIONE = new IDVariant(0,IDVariant.STRING);
      v_UOGESTIONE = (new IDVariant("U.O. Gestione"));
      IDVariant v_UOUTILIZZO = new IDVariant(0,IDVariant.STRING);
      v_UOUTILIZZO = (new IDVariant("U.O. Utilizzo"));
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Situazioni per "));
      set_Caption(IDL.Add(S, IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0)));
      IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGETTES, 0, (new IDVariant("S")));
      TuttoInvis();
      if (IDL.IsNull(MainFrm.SUDDUNITSUP2))
      {
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
      }
      if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Flessibilità")), true))
      {
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
      }
      else if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Tipo Vincolo")), true))
      {
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
      }
      else if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Unità Organizzativa")), true))
      {
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant v_VDESCRSUP1 = new IDVariant(0,IDVariant.STRING);
        IDVariant v_VDESCRSUP2 = new IDVariant(0,IDVariant.STRING);
        if (!(IDL.IsNull(MainFrm.SUDDUNITSUP2)) || !(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP)))
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
          SQL.append("from ");
          SQL.append("  SO4_SUST_ENTI A ");
          SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VDESCRSUP2 = QV.Get("SUSTENTIDESC", IDVariant.STRING) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DESCRIZIONE as SUSTENTIDESC ");
          SQL.append("from ");
          SQL.append("  SO4_SUST_ENTI A ");
          SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VDESCRSUP1 = QV.Get("SUSTENTIDESC", IDVariant.STRING) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("delete from CF4WEB_STRUTTURA ");
          SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (TIPO_STRUTTURA = 'SICL') ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          if (IDL.NullValue(v_VDESCRSUP2,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0, new IDVariant(v_VDESCRSUP2));
          }
          if (IDL.NullValue(v_VDESCRSUP1,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
          {
            IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, 0, new IDVariant(v_VDESCRSUP1));
            PAN_PERSIT.SetValueListItem(PFL_PERSIT_SITPERQUALUO, (new IDVariant(1)), IDL.Add(IDL.Add(v_VDESCRSUP2, ((IDL.NullValue(v_VDESCRSUP2,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?(new IDVariant(" - ")):(new IDVariant("")))), v_VDESCRSUP1).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          }
        }
        else
        {
          PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        }
        if (IDL.IsNull(MainFrm.SUDDUNITSUP2))
        {
          PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        PAN_PERSIT.SetValueListItem(PFL_PERSIT_SITPERQUALUO, (new IDVariant(2)), ((IDL.NullValue(v_VDESCRSUP1,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.Add(IDL.Add(IDL.Add(((IDL.NullValue(v_VDESCRSUP2,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.Add(v_VDESCRSUP2, (new IDVariant(" - "))):(new IDVariant(""))), v_VDESCRSUP1), (new IDVariant(" - "))), v_UOGESTIONE):v_UOGESTIONE).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PERSIT.SetValueListItem(PFL_PERSIT_SITPERQUALUO, (new IDVariant(3)), v_UOUTILIZZO.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        // PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
        // PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerAltreClassificazioni", "Load", _e);
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
      UNLOAD_PERSITDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerAltreClassificazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Per Sit: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PERSITDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDETCAP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGSOLCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTOPETI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDESABB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGEFLES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPVIN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGUOSUOUT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGUOGES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGUOSUP2, 0, new IDVariant());
  }

  // **********************************************************************
  // Per Sit On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PERSIT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Per Sit On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PERSIT_DETTAGCAPITO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0, (new IDVariant()));
        }
      }
      if (Column.equals((new IDVariant(PFL_PERSIT_SITPERQUALUO)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0, (new IDVariant()));
        if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).compareTo((new IDVariant(3)), true)!=0)
        {
          if (!(IDL.IsNull(MainFrm.IDSUDUNISUPD)))
          {
            PAN_PERSIT.set_Header(Glb.OBJ_FIELD,PFL_PERSIT_UOSUP2, IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0).stringValue());
          }
          PAN_PERSIT.set_Header(Glb.OBJ_FIELD,PFL_PERSIT_UOPRIMOLIVEL, IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, 0).stringValue());
        }
        else
        {
          IDVariant v_UOUTILIZZO = new IDVariant(0,IDVariant.STRING);
          v_UOUTILIZZO = (new IDVariant("U.O. Utilizzo"));
          PAN_PERSIT.set_Header(Glb.OBJ_FIELD,PFL_PERSIT_UOPRIMOLIVEL, new IDVariant(v_UOUTILIZZO).stringValue());
        }
      }
      if (Column.equals((new IDVariant(PFL_PERSIT_UOSUP2)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0))) && !(IDL.IsNull(MainFrm.SUDDUNITSUP2)))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0, (new IDVariant()));
          MainFrm.RiempiCF4WEBSTRUTTURA(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0));
        }
        else
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0)))
          {
            IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PERSIT_UOPRIMOLIVEL)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(2)), true))
        {
          IMDB.set_Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0, (new IDVariant()));
          if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0))) && !(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP)))
          {
            MainFrm.RiempiCF4WEBSTRUTTURA(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerAltreClassificazioni", "PerSitOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Per Sit On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PERSIT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PERSIT);
      // 
      // Per Sit On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0),(new IDVariant("NO"))).equals((new IDVariant("NO")), true))
      {
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Unità Organizzativa")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0)))
        {
          PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(3)), true))
          {
            PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(3)), true))
            {
              // PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
              PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            else
            {
              // PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
              if (!(IDL.IsNull(MainFrm.SUDDUNITSUP2)))
              {
                PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
              }
            }
          }
          else
          {
            // PAN_PERSIT.set_ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, IDPanel.RT_TOP, Glb.PANEL_FORM, IDL.Sub(IDL.Add((new IDVariant(PAN_PERSIT.ObjRect(Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, IDPanel.RT_TOP, Glb.PANEL_FORM))), (new IDVariant(25))), (new IDVariant(1))).intValue());
            if (IDL.IsNull(MainFrm.SUDDUNITSUP2))
            {
              PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            else
            {
              PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            if (IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP))
            {
              PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            else
            {
              PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            }
            PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
      else
      {
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOSUP2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerAltreClassificazioni", "PerSitOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Tutto Invis
  // **********************************************************************
  public int TuttoInvis ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tutto Invis Body
      // Corpo Procedura
      // 
      PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_PERSIT.SetFlags (Glb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerAltreClassificazioni", "TuttoInvis", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0)) && IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Unità Organizzativa")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare un Tipo di Unità Organizzativa"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant v_STAMPA = new IDVariant(0,IDVariant.STRING);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Sit_Class_Altre_S"));
      IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
      v_S2 = (new IDVariant("Sit_Class_Altre_E"));
      if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
      {
        v_STAMPA = new IDVariant(v_S1);
      }
      else
      {
        v_STAMPA = new IDVariant(v_S2);
      }
      if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Flessibilità")), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.Cf4armDBObject.WORKSITCLASFLESSE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGEFLES, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
        }
        else
        {
          MainFrm.Cf4armDBObject.WORKSITCLASFLESSS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGEFLES, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
        }
      }
      else if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Tipo Vincolo")), true))
      {
        if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.Cf4armDBObject.WORKSITCLASVINCE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGTIPVIN, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))), IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGTOPETI, 0),(new IDVariant("NO"))));
        }
        else
        {
          MainFrm.Cf4armDBObject.WORKSITCLASVINCS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGTIPVIN, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))), IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGTOPETI, 0),(new IDVariant("NO"))));
        }
      }
      else if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Unità Organizzativa")), true))
      {
        if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO, 0).equals((new IDVariant(1)), true) || (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO, 0).equals((new IDVariant(2)), true) && !(IDL.IsNull(MainFrm.SUDDIVISIONE_UNITA_SUP))))
        {
          if (!(IDL.IsNull(MainFrm.SUDDUNITSUP2)))
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0)))
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant(" obbligatoria."));
              MainFrm.set_AlertMessage(IDL.Add(IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0), S)); 
              return 0;
            }
          }
          if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
          {
            MainFrm.Cf4armDBObject.WORKSITCLASUOSUPE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(1))))?(new IDVariant("GU")):(new IDVariant("G"))), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))), ((!(IDL.IsNull(MainFrm.SUDDUNITSUP2)) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0))))?IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0):(new IDVariant())));
          }
          else
          {
            MainFrm.Cf4armDBObject.WORKSITCLASUOSUPS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(1))))?(new IDVariant("GU")):(new IDVariant("G"))), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))), ((!(IDL.IsNull(MainFrm.SUDDUNITSUP2)) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0))))?IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGUOSUP2, 0):(new IDVariant())));
          }
        }
        else
        {
          // 
          // Per UO GEstione 
          // Utilizzo
          // 
          // 
          if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGETTES, 0).equals((new IDVariant("E")), true))
          {
            MainFrm.Cf4armDBObject.WORKSITCLASUOGUE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(2)), true))?IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0):IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0)), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(2)), true))?(new IDVariant("G")):(new IDVariant("U"))), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
          }
          else
          {
            MainFrm.Cf4armDBObject.WORKSITCLASUOGUS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(2)), true))?IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMEOGGUOGES, 0):IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGUOSUOUT, 0)), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(2)), true))?(new IDVariant("G")):(new IDVariant("U"))), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("SI"))));
          }
        }
      }
      else
      {
        return 0;
      }
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGR_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DETT_CAPITOLI")), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDETCAP, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DESC_ABB")), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDESABB, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_SOLO_COMP")), IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGSOLCOM, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGDATELA, 0)));
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Unità Organizzativa")), true))
        {
          if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(1)), true))
          {
            S = IDL.Add(((IDL.NullValue(IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.Add(IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0), (new IDVariant(" - "))):(new IDVariant(""))), IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, 0));
          }
          else if (IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOOGSIPEQUUO, 0).equals((new IDVariant(2)), true))
          {
            IDVariant v_UOGESTIONE = new IDVariant(0,IDVariant.STRING);
            v_UOGESTIONE = (new IDVariant("U.O. Gestione"));
            S = IDL.Add(IDL.Add(((IDL.NullValue(IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.Add(IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGDEUOSU2, 0), (new IDVariant(" - "))):(new IDVariant(""))), ((IDL.NullValue(IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)?IDL.Add(IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDEUOSU, 0), (new IDVariant(" - "))):(new IDVariant("")))), v_UOGESTIONE);
          }
          else
          {
            IDVariant v_UOUTILIZZO = new IDVariant(0,IDVariant.STRING);
            v_UOUTILIZZO = (new IDVariant("U.O. Utilizzo"));
            S = new IDVariant(v_UOUTILIZZO);
          }
        }
        MainFrm.SetParametroStampaJasper((new IDVariant("P_MACAGG")), ((IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Unità Organizzativa")), true))?S:IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0)));
        if (IMDB.Value(IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPCLA, 0).equals((new IDVariant("Tipo Vincolo")), true))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_TOT_TITOLO")), ((IMDB.Value(IMDBDef13.PQRY_PERSIT1, IMDBDef13.PQSL_PERSIT1_NOMOGGTOPETI, 0).equals((new IDVariant("SI"))))?(new IDVariant("SI")):(new IDVariant("NO"))));
        }
        else
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_TOT_TITOLO")), (new IDVariant("NO")));
        }
        MainFrm.LanciaStampaJasper(v_STAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioniPerAltreClassificazioni", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Per Sit
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void SITPERALTCLA_PERSIT1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PERSIT1_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PERSIT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PERSIT, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PERSIT1_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PERSIT1_RS, 0, IMDBDef4.TBL_PERSIT, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 0, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDETCAP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 1, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGSOLCOM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 2, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTOPETI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 3, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDESABB, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 4, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGDATELA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 5, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 6, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGEFLES, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 7, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGTIPVIN, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 8, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGUOSUOUT, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 9, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 10, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMEOGGUOGES, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PERSIT1_RS, 11, 0, IMDBDef4.TBL_PERSIT, IMDBDef4.FLD_PERSIT_NOMOGGUOSUP2, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PERSIT, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PERSIT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PERSIT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PERSIT1_RS, 0);
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
  private void PAN_PERSIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PERSIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PERSIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PERSIT, Cancel);
    // Stub
  }

  private void PAN_PERSIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PERSIT_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PERSIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PERSIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PERSIT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PERSIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PERSIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PERSIT_Init()
  {

    PAN_PERSIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PERSIT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PERSIT.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, "F0A04696-75F0-4F24-898B-74C1DF13BB3E");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, "Parte");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, "3E0ECAAA-10CF-4E9D-961D-B89AFE2E458F");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, "Situazione per");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, "D52D736E-2ACF-4742-AB60-B499978F14E9");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, "UO Sup 2");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, "6EAD153B-79BA-4D4F-B50F-BEA9FB1CCDC4");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, "UO Primo Livello");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, "0E607AB5-3579-4F11-8FC7-C6F0EA2DE19E");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, "U.O. Gestione");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, "386877DA-968E-4EA5-94E2-0C867765D3EA");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, "Flessibilità");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, "3C86F6BE-78A3-4693-9DF6-EBA961EAFF68");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, "F5BE622B-8C71-4071-A814-20FDFB3549D9");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, "A7B10AC4-51B0-4DCF-90C7-CF279520D35B");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, "Descrizione Abbreviata");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "68F447A2-7855-4497-8FB0-E88B5595A375");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "Solo Competenza");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, "8A5C1C97-BC71-406B-8ECA-92544C31CBFB");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, "Totali per Titolo");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "3AE70E88-F8F4-46C4-BE55-5F7628FD3D59");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "Data Elaborazione");
    PAN_PERSIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, "");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PERSIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, "C616B1A0-BAF3-429E-8DB0-6E014962510D");
    PAN_PERSIT.set_Header(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, "Elabora");
    PAN_PERSIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PERSIT.SetImage(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PERSIT.SetFlags(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PERSIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, 24);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, 160, 12, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, 44);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_ES, MyGlb.PANEL_FORM, "Parte");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_ES, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_ES, PPQRY_PERSIT1, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_LIST, 0, 36, 268, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_LIST, 100);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_LIST, "Situazione per");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_FORM, 104, 36, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_FORM, 100);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SITPERQUALUO, MyGlb.PANEL_FORM, "Situazione per");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_SITPERQUALUO, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_SITPERQUALUO, PPQRY_PERSIT1, "A.NOOGSIPEQUUO", "NOOGSIPEQUUO", 1, 1, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_LIST, 60);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_LIST, "UO Sup 2");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_FORM, 8, 60, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_FORM, 196);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_UOSUP2, MyGlb.PANEL_FORM, "UO Sup 2");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_UOSUP2, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_UOSUP2, PPQRY_PERSIT1, "A.NOMOGGUOSUP2", "NOMOGGUOSUP2", 1, 8, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_LIST, 116);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_LIST, "UO Primo Livello");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_FORM, 8, 84, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_FORM, 196);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_UOPRIMOLIVEL, MyGlb.PANEL_FORM, "UO Primo Livello");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_UOPRIMOLIVEL, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_UOPRIMOLIVEL, PPQRY_PERSIT1, "A.NOMOGUOSUOUT", "NOMOGUOSUOUT", 1, 8, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_LIST, 80);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_LIST, "U.O. Gestione");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_FORM, 8, 108, 556, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_FORM, 196);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_UOGESTIONE, MyGlb.PANEL_FORM, "U.O. Gestione");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_UOGESTIONE, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_UOGESTIONE, PPQRY_PERSIT1, "A.NOMEOGGUOGES", "NOMEOGGUOGES", 1, 8, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_LIST, 68);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_LIST, "Flessibilità");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_FORM, 136, 204, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_FORM, 68);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_FLESSIBILITA, MyGlb.PANEL_FORM, "Flessibilità");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_FLESSIBILITA, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_FLESSIBILITA, PPQRY_PERSIT1, "A.NOMEOGGEFLES", "NOMEOGGEFLES", 5, 4, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_LIST, 76);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_FORM, 128, 180, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_TIPOVINCOLO, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_TIPOVINCOLO, PPQRY_PERSIT1, "A.NOMOGGTIPVIN", "NOMOGGTIPVIN", 1, 7, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, 108);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, 92, 132, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_DETTAGCAPITO, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_DETTAGCAPITO, PPQRY_PERSIT1, "A.NOMOGGDETCAP", "NOMOGGDETCAP", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DETTAGCAPITO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DETTAGCAPITO, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, 140);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_LIST, "Desc. Abbr.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, 236, 132, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, 152);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DESCRIABBREV, MyGlb.PANEL_FORM, "Descrizione Abbreviata");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_DESCRIABBREV, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_DESCRIABBREV, PPQRY_PERSIT1, "A.NOMOGGDESABB", "NOMOGGDESABB", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DESCRIABBREV, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_DESCRIABBREV, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 108);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Sl. Cmp.");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 428, 132, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_SOLOCOMPETEN, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_SOLOCOMPETEN, PPQRY_PERSIT1, "A.NOMOGGSOLCOM", "NOMOGGSOLCOM", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCOMPETEN, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_SOLOCOMPETEN, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_LIST, 100);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_LIST, "Totali per Titolo");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_FORM, 432, 156, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_FORM, 108);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali per Titolo");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_TOTALPERTITO, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_TOTALPERTITO, PPQRY_PERSIT1, "A.NOMOGGTOPETI", "NOMOGGTOPETI", 5, 2, 0, -13997);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_TOTALPERTITO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PERSIT.SetValueListItem(PFL_PERSIT_TOTALPERTITO, (new IDVariant()), "Null", "", "", -1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 88, 156, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PERSIT_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_DATAELABORAZ, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_DATAELABORAZ, PPQRY_PERSIT1, "A.NOMOGGDATELA", "NOMOGGDATELA", 6, 14, 0, -13997);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 376, 128, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PERSIT.SetRect(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 484, 180, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PERSIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PERSIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PERSIT_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PERSIT.SetFieldPage(PFL_PERSIT_ETICHEELABOR, -1, -1);
    PAN_PERSIT.SetFieldPanel(PFL_PERSIT_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PERSIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PERSIT.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as ANAUNIORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGGUOSUP2~~) ");
    SQL.append("and   (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(A.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   (NOT ((" + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("order by 2 ");
    PAN_PERSIT.SetQuery(PPQRY_ANAGUNITORG1, 0, SQL, PFL_PERSIT_UOSUP2, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as ANAUNIORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(A.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   (NOT ((" + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("order by 2 ");
    PAN_PERSIT.SetQuery(PPQRY_ANAGUNITORG1, 1, SQL, PFL_PERSIT_UOSUP2, "");
    PAN_PERSIT.SetQueryDB(PPQRY_ANAGUNITORG1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as ANAUNIORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGUOSUOUT~~) ");
    SQL.append("and   (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(A.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   ((" + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("and   (~~NOOGSIPEQUUO~~ <> 3 AND NOT ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(B.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DES_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGUOSUOUT~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(B.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(B.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   (B.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (~~NOOGSIPEQUUO~~ = 3 OR (" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = B.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (C.TIPO_UNITA_ORGANIZZATIVA = DECODE(~~NOOGSIPEQUUO~~, 3, 'U', 'G')) ");
    SQL.append("))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  D.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(D.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  D.CODICE_UO || ' - ' || D.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA D ");
    SQL.append("where (D.PROGR_UNITA_ORGANIZZATIVA = ~~NOMOGUOSUOUT~~) ");
    SQL.append("and   (D.PROGR_UNITA_PADRE = ~~NOMOGGUOSUP2~~) ");
    SQL.append("and   (D.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.TIPO_STRUTTURA = 'SICL') ");
    SQL.append("and   (NOT ((" + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("order by 2 ");
    PAN_PERSIT.SetQuery(PPQRY_ANAGUNITORGA, 0, SQL, PFL_PERSIT_UOPRIMOLIVEL, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as ANAUNIORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.ID_SUDDIVISIONE = " + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(A.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   ((" + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("and   (~~NOOGSIPEQUUO~~ <> 3 AND NOT ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(B.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DES_UNITA_ORGANIZZATIVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE B ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(B.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(B.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   (B.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (~~NOOGSIPEQUUO~~ = 3 OR (" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = B.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (C.TIPO_UNITA_ORGANIZZATIVA = DECODE(~~NOOGSIPEQUUO~~, 3, 'U', 'G')) ");
    SQL.append("))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  D.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(D.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  D.CODICE_UO || ' - ' || D.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA D ");
    SQL.append("where (D.PROGR_UNITA_PADRE = ~~NOMOGGUOSUP2~~) ");
    SQL.append("and   (D.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (D.TIPO_STRUTTURA = 'SICL') ");
    SQL.append("and   (NOT ((" + IDL.CSql(MainFrm.SUDDUNITSUP2, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("order by 2 ");
    PAN_PERSIT.SetQuery(PPQRY_ANAGUNITORGA, 1, SQL, PFL_PERSIT_UOPRIMOLIVEL, "");
    PAN_PERSIT.SetQueryDB(PPQRY_ANAGUNITORGA, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGUOGES~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(A.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO D ");
    SQL.append("where (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.PROGR_UNITA_ORGANIZZATIVA = A.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (D.TIPO_UNITA_ORGANIZZATIVA = DECODE(~~NOOGSIPEQUUO~~, 3, 'U', 'G')) ");
    SQL.append("))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(B.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA B ");
    SQL.append("where (B.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGUOGES~~) ");
    SQL.append("and   (B.PROGR_UNITA_PADRE = ~~NOMOGUOSUOUT~~) ");
    SQL.append("and   (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.TIPO_STRUTTURA = 'SICL') ");
    SQL.append("and   (NOT ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = B.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (C.TIPO_UNITA_ORGANIZZATIVA = DECODE(~~NOOGSIPEQUUO~~, 3, 'U', 'G')) ");
    SQL.append("))) ");
    SQL.append("order by 2 ");
    PAN_PERSIT.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_PERSIT_UOGESTIONE, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  LPAD(A.CODICE_UO, 16, SUBSTR('0', 1, 1)) as SOANUNORCOUO, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE((1)||'/'||(1)||'/'||(1900),'dd/mm/yyyy')) AND NVL(A.AL, TO_DATE((31)||'/'||(12)||'/'||(2999),'dd/mm/yyyy')))) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL)) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO D ");
    SQL.append("where (D.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (D.PROGR_UNITA_ORGANIZZATIVA = A.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (D.TIPO_UNITA_ORGANIZZATIVA = DECODE(~~NOOGSIPEQUUO~~, 3, 'U', 'G')) ");
    SQL.append("))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  LPAD(B.CODICE_UO, 16, SUBSTR('0', 1, 1)), ");
    SQL.append("  B.CODICE_UO || ' - ' || B.DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  CF4WEB_STRUTTURA B ");
    SQL.append("where (B.PROGR_UNITA_PADRE = ~~NOMOGUOSUOUT~~) ");
    SQL.append("and   (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (B.TIPO_STRUTTURA = 'SICL') ");
    SQL.append("and   (NOT ((" + IDL.CSql(MainFrm.SUDDIVISIONE_UNITA_SUP, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " IS NULL))) ");
    SQL.append("and   (EXISTS(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO C ");
    SQL.append("where (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = B.PROGR_UNITA_ORGANIZZATIVA) ");
    SQL.append("and   (C.TIPO_UNITA_ORGANIZZATIVA = DECODE(~~NOOGSIPEQUUO~~, 3, 'U', 'G')) ");
    SQL.append("))) ");
    SQL.append("order by 2 ");
    PAN_PERSIT.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_PERSIT_UOGESTIONE, "");
    PAN_PERSIT.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FLESSICODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as FLESSICODIC1 ");
    SQL.append("from ");
    SQL.append("  FLESSIBILITA A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEFLES~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PERSIT.SetQuery(PPQRY_FLESSIBILITA, 0, SQL, PFL_PERSIT_FLESSIBILITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FLESSICODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as FLESSICODIC1 ");
    SQL.append("from ");
    SQL.append("  FLESSIBILITA A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PERSIT.SetQuery(PPQRY_FLESSIBILITA, 1, SQL, PFL_PERSIT_FLESSIBILITA, "");
    PAN_PERSIT.SetQueryDB(PPQRY_FLESSIBILITA, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLCODIC1 ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPVIN~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PERSIT.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_PERSIT_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLCODIC1 ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PERSIT.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_PERSIT_TIPOVINCOLO, "");
    PAN_PERSIT.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PERSIT.SetIMDB(IMDB, "PQRY_PERSIT1", true);
    PAN_PERSIT.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PERSIT.SetQueryIMDB(PPQRY_PERSIT1, IMDBDef13.PQRY_PERSIT1_RS, IMDBDef4.TBL_PERSIT);
    JustLoaded = true;
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_ES, IMDBDef4.FLD_PERSIT_NOMEOGGETTES);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_SITPERQUALUO, IMDBDef4.FLD_PERSIT_NOOGSIPEQUUO);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_UOSUP2, IMDBDef4.FLD_PERSIT_NOMOGGUOSUP2);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_UOPRIMOLIVEL, IMDBDef4.FLD_PERSIT_NOMOGUOSUOUT);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_UOGESTIONE, IMDBDef4.FLD_PERSIT_NOMEOGGUOGES);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_FLESSIBILITA, IMDBDef4.FLD_PERSIT_NOMEOGGEFLES);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_TIPOVINCOLO, IMDBDef4.FLD_PERSIT_NOMOGGTIPVIN);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_DETTAGCAPITO, IMDBDef4.FLD_PERSIT_NOMOGGDETCAP);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_DESCRIABBREV, IMDBDef4.FLD_PERSIT_NOMOGGDESABB);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_SOLOCOMPETEN, IMDBDef4.FLD_PERSIT_NOMOGGSOLCOM);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_TOTALPERTITO, IMDBDef4.FLD_PERSIT_NOMOGGTOPETI);
    PAN_PERSIT.SetFieldPrimaryIndex(PFL_PERSIT_DATAELABORAZ, IMDBDef4.FLD_PERSIT_NOMOGGDATELA);
    PAN_PERSIT.SetMasterTable(0, "PERSIT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PERSIT.Status() == 2)
    {
      int oldListQBE = PAN_PERSIT.iUseListQBE;
      PAN_PERSIT.iUseListQBE = 0;
      PAN_PERSIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PERSIT.PanelCommand(Glb.PCM_FIND);
      PAN_PERSIT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PERSIT) PAN_PERSIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
