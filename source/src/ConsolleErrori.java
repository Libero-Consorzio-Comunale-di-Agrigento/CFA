// **********************************************
// Consolle Errori
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ConsolleErrori extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FILTRO_TIPOLOG = 0;

  private static int PFL_FILTRO_ARGOMENTO = 0;
  private static int PFL_FILTRO_TIPOLOG = 1;
  private static int PFL_FILTRO_DATADA = 2;
  private static int PFL_FILTRO_ETICHTIPOLOG = 3;
  private static int PFL_FILTRO_TIPOERROR = 4;
  private static int PFL_FILTRO_TIPOWARNING = 5;
  private static int PFL_FILTRO_TIPOLOG1 = 6;
  private static int PFL_FILTRO_INCSOAREQRES = 7;
  private static int PFL_FILTRO_ETICHATTILOG = 8;

  private static int PPQRY_FILTRO16 = 0;

  private static int PPQRY_WRKLOG1 = 1;


  IDPanel PAN_FILTRO;
  private static int PFL_LOG_DATA = 0;
  private static int PFL_LOG_NOMEISTRUZIO = 1;
  private static int PFL_LOG_TIPO = 2;
  private static int PFL_LOG_PARAMETRI = 3;
  private static int PFL_LOG_TESTOERRORE = 4;
  private static int PFL_LOG_STACKTRACE = 5;
  private static int PFL_LOG_ID = 6;
  private static int PFL_LOG_DOCELABORATO = 7;

  private static int PPQRY_WRKLOG = 0;


  IDPanel PAN_LOG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO(IMDB);
    //
    //
    Init_PQRY_FILTRO16(IMDB);
    Init_PQRY_FILTRO16_RS(IMDB);
    Init_PQRY_WRKLOG(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_FILTRO, 7);
    IMDB.set_TblCode(IMDBDef7.TBL_FILTRO, "TBL_FILTRO");
    IMDB.set_FldCode(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMEOGGETIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMEOGGDATDA, "NOMEOGGDATDA");
    IMDB.SetFldParams(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMEOGGDATDA,8,15,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOOGINSORERE, "NOOGINSORERE");
    IMDB.SetFldParams(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOOGINSORERE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMEOGGEARGO, "NOMEOGGEARGO");
    IMDB.SetFldParams(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMEOGGEARGO,5,50,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMOGGTIPERR, "NOMOGGTIPERR");
    IMDB.SetFldParams(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMOGGTIPERR,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMOGGTIPWAR, "NOMOGGTIPWAR");
    IMDB.SetFldParams(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMOGGTIPWAR,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMOGGTIPLOG, "NOMOGGTIPLOG");
    IMDB.SetFldParams(IMDBDef7.TBL_FILTRO,IMDBDef7.FLD_FILTRO_NOMOGGTIPLOG,5,2,0);
    IMDB.TblAddNew(IMDBDef7.TBL_FILTRO, 0);
  }

  private static void Init_PQRY_FILTRO16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FILTRO16, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_FILTRO16, "PQRY_FILTRO16");
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMEOGGETIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMEOGGDATDA, "NOMEOGGDATDA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMEOGGDATDA,8,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOOGINSORERE, "NOOGINSORERE");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOOGINSORERE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMEOGGEARGO, "NOMEOGGEARGO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMEOGGEARGO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPERR, "NOMOGGTIPERR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPERR,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPWAR, "NOMOGGTIPWAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPWAR,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPLOG, "NOMOGGTIPLOG");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPLOG,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_FILTRO16, 0);
  }

  private static void Init_PQRY_FILTRO16_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_FILTRO16_RS, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_FILTRO16_RS, "PQRY_FILTRO16_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMEOGGETIPO, "NOMEOGGETIPO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMEOGGETIPO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMEOGGDATDA, "NOMEOGGDATDA");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMEOGGDATDA,8,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOOGINSORERE, "NOOGINSORERE");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOOGINSORERE,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMEOGGEARGO, "NOMEOGGEARGO");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMEOGGEARGO,5,50,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPERR, "NOMOGGTIPERR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPERR,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPWAR, "NOMOGGTIPWAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPWAR,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPLOG, "NOMOGGTIPLOG");
    IMDB.SetFldParams(IMDBDef17.PQRY_FILTRO16_RS,IMDBDef17.PQSL_FILTRO16_NOMOGGTIPLOG,5,2,0);
  }

  private static void Init_PQRY_WRKLOG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_WRKLOG, 8);
    IMDB.set_TblCode(IMDBDef17.PQRY_WRKLOG, "PQRY_WRKLOG");
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLONOIS, "RECWRKLONOIS");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLONOIS,5,99,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOGTIP, "RECWRKLOGTIP");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOGTIP,5,100,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOGPAR, "RECWRKLOGPAR");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOGPAR,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOTEER, "RECWRKLOTEER");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOTEER,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOSTTR, "RECWRKLOSTTR");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOSTTR,5,4000,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOGDAT, "RECWRKLOGDAT");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLOGDAT,8,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECOWRKLOGID, "RECOWRKLOGID");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECOWRKLOGID,2,15,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLODOEL, "RECWRKLODOEL");
    IMDB.SetFldParams(IMDBDef17.PQRY_WRKLOG,IMDBDef17.PQSL_WRKLOG_RECWRKLODOEL,5,100,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_WRKLOG, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ConsolleErrori(MyWebEntryPoint w, IMDBObj imdb)
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
  public ConsolleErrori()
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
    FormIdx = MyGlb.FRM_CONSOLERRORI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B4DA4708-7EAC-42F0-9B80-FBC766602C45";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 996;
    DesignHeight = 666;
    set_Caption(new IDVariant("Consolle Log/Errori"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 996;
    Frames[1].Height = 640;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 996;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.Lockable = false;
    PAN_FILTRO.iLocked = false;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "860E07BE-BA74-4C55-A4B3-5756B306FFD8");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 820, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 1;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 996;
    Frames[3].Height = 576;
    Frames[3].Caption = "LOG";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 576;
    PAN_LOG = new IDPanel(w, this, 3, "PAN_LOG");
    Frames[3].Content = PAN_LOG;
    PAN_LOG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LOG.VS = MainFrm.VisualStyleList;
    PAN_LOG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 996-MyGlb.PAN_OFFS_X, 576-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7AD9A7B0-0EEB-4BF7-8A3B-2F87B48CDDCE");
    PAN_LOG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1860, 296, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LOG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LOG.InitStatus = 2;
    PAN_LOG_Init();
    PAN_LOG_InitFields();
    PAN_LOG_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGIUN+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUFUNZAGGI+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGIUN+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_SVUOTALOG+BaseCmdLinIdx)
      {
        SvuotaLog();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ATTIODISALOG+BaseCmdLinIdx)
      {
        AttivaODisattivaLOG();
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
      if (IMDB.TblModified(IMDBDef7.TBL_FILTRO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONSOLERRORI_FILTRO16();
      }
      PAN_FILTRO.UpdatePanel(MainFrm);
      PAN_LOG.UpdatePanel(MainFrm);
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
    return (obj instanceof ConsolleErrori);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ConsolleErrori.class.getName() : (Glb.ClassWithPackage(ConsolleErrori.class) ? ConsolleErrori.class.getName().substring(ConsolleErrori.class.getPackage().getName().length() + 1) : ConsolleErrori.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Filtro On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FILTRO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtro On Updating Row Body
      // Corpo Procedura
      // 
      // if (Column.equals((new IDVariant(PFL_FILTRO_TIPOLOG)), true) && FieldWasModified.booleanValue())
      // {
        // if (IMDB.Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOMEOGGETIPO, 0).compareTo((new IDVariant("LOG")), true)!=0 && IMDB.Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOMEOGGETIPO, 0).compareTo((new IDVariant("TUTTI")), true)!=0)
        // {
          // IMDB.set_Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOOGINSORERE, 0, (new IDVariant("NO")));
        // }
      // }
      if (Column.equals((new IDVariant(PFL_FILTRO_ARGOMENTO)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.Find(IDL.Upper((new IDVariant(PAN_FILTRO.FieldText(PFL_FILTRO_ARGOMENTO)))), IDL.Upper((new IDVariant("Fatturazione")))).compareTo((new IDVariant(0)), true)>0)
        {
          PAN_LOG.SetFlags (Glb.OBJ_FIELD, PFL_LOG_DOCELABORATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_LOG.SetFlags (Glb.OBJ_FIELD, PFL_LOG_DOCELABORATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      if (Column.equals((new IDVariant(PFL_FILTRO_TIPOLOG1)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOMOGGTIPLOG, 0).equals((new IDVariant("NO")), true))
        {
          IMDB.set_Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOOGINSORERE, 0, (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "FiltroOnUpdatingRow", _e);
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
      IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGETIPO, 0, (new IDVariant("ERROR")));
      IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPERR, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPWAR, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPLOG, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGDATDA, 0, IDL.DateTimeEx(IDL.Year(IDL.Today()),IDL.Month(IDL.Today()),IDL.Day(IDL.Today()),(new IDVariant(6)),(new IDVariant(0)),(new IDVariant(0))));
      IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOOGINSORERE, 0, (new IDVariant("NO")));
      IDVariant F = new IDVariant(0,IDVariant.STRING);
      F = (new IDVariant("INDE_FE_PASSIVA"));
      IDVariant v_F1 = new IDVariant(0,IDVariant.STRING);
      v_F1 = (new IDVariant("Fatturazione Elettronica"));
      PAN_FILTRO.SetValueListItem(PFL_FILTRO_ARGOMENTO, F, v_F1.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      // 
      // integr PBM
      // 
      {
        IDVariant v_CPBM = new IDVariant(0,IDVariant.STRING);
        v_CPBM = (new IDVariant("PRODUCTS/INTEGRAZIONE_PBM"));
        IDVariant v_SPBM = new IDVariant(0,IDVariant.STRING);
        v_SPBM = (new IDVariant("Integrazione PBM"));
        IDVariant v_VALORINTEPBM = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.VALORE as REGISTVALORE ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (A.CHIAVE = " + IDL.CSql(v_CPBM, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.STRINGA = " + IDL.CSql(v_SPBM, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VALORINTEPBM = QV.Get("REGISTVALORE", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_VALORINTEPBM,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("INTEGRAZIONE_PBM"));
          IDVariant C = new IDVariant(0,IDVariant.STRING);
          C = (new IDVariant("Integrazione PBM"));
          PAN_FILTRO.SetValueListItem(PFL_FILTRO_ARGOMENTO, S, C.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
      IDVariant v_VALORE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  UPPER(A.VALORE) as UPPEREGIVALO ");
      SQL.append("from ");
      SQL.append("  REGISTRO A ");
      SQL.append("where (UPPER(A.CHIAVE) = 'PRODUCTS/' || 'CFA') ");
      SQL.append("and   (UPPER(A.STRINGA) = 'LOG_ATTIVO') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VALORE = QV.Get("UPPEREGIVALO", IDVariant.STRING) ;
      }
      QV.Close();
      if (IDL.NullValue(v_VALORE,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Disattiva LOG"));
        MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ATTIODISALOG+BaseCmdLinIdx, new IDVariant(S).stringValue());
        PAN_LOG.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        FiltriVisibili((new IDVariant(-1)));
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Attiva LOG"));
        MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ATTIODISALOG+BaseCmdLinIdx, new IDVariant(S).stringValue());
        PAN_LOG.set_Visible((new IDVariant(0)).booleanValue());
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("I log sono attualmente disabilitati. Cliccare qui per abilitarli"));
        MainFrm.ShowTooltip(v_S1.stringValue(),(new IDVariant("")).stringValue(),new IDVariant(PAN_FILTRO.bFields(PFL_FILTRO_ETICHATTILOG).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
        PAN_FILTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_FILTRO_ETICHATTILOG,v_S1.stringValue()); 
        FiltriVisibili((new IDVariant(0)));
      }
      IDVariant T = new IDVariant(0,IDVariant.STRING);
      T = (new IDVariant("include i messaggi di log con istruzione WS_REQUEST o SOAP_REQUEST o SOAP_RESPONSE"));
      PAN_FILTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_FILTRO_INCSOAREQRES,T.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "Load", _e);
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
      UNLOAD_FILTRODELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "Unload", _e);
    }
  }

  // **********************************************************************
  // Filtro: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FILTRODELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGETIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGDATDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOOGINSORERE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGEARGO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPERR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPWAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPLOG, 0, new IDVariant());
  }

  // **********************************************************************
  // LOG On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LOG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LOG);
      // 
      // LOG On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOMOGGTIPLOG, 0).equals((new IDVariant("SI")), true))
      {
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_NOMEISTRUZIO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_PARAMETRI,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
      if (IDL.Find(IDL.Upper((new IDVariant(PAN_LOG.FieldText(PFL_LOG_TIPO)))), (new IDVariant("ERROR"))).compareTo((new IDVariant(0)), true)>0)
      {
        PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TIPO,new IDVariant(MyGlb.VIS_NORFIETESROS).intValue()); 
        PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TESTOERRORE,new IDVariant(MyGlb.VIS_NORFIETESROS).intValue()); 
      }
      else if ((new IDVariant(PAN_LOG.FieldText(PFL_LOG_TIPO))).equals((new IDVariant("WARNING")), true))
      {
        PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TIPO,new IDVariant(MyGlb.VIS_NORFIETESVIO).intValue()); 
        PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TESTOERRORE,new IDVariant(MyGlb.VIS_NORFIETESVIO).intValue()); 
      }
      else
      {
        IDVariant v_OK = new IDVariant(0,IDVariant.STRING);
        v_OK = (new IDVariant("CORRETTAMENTE"));
        if (IDL.Find(IDL.Upper((new IDVariant(PAN_LOG.FieldText(PFL_LOG_TESTOERRORE)))), v_OK).compareTo((new IDVariant(0)), true)>0)
        {
          PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TIPO,new IDVariant(MyGlb.VIS_NORFIETESVER).intValue()); 
          PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TESTOERRORE,new IDVariant(MyGlb.VIS_NORFIETESVER).intValue()); 
          PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_NOMEISTRUZIO,new IDVariant(MyGlb.VIS_NORFIETESVER).intValue()); 
          PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_PARAMETRI,new IDVariant(MyGlb.VIS_NORFIETESVER).intValue()); 
        }
        else
        {
          PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TIPO,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
          PAN_LOG.set_VisualStyle(Glb.OBJ_FIELD,PFL_LOG_TESTOERRORE,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
      }
      PAN_LOG.set_ToolTip(Glb.OBJ_FIELD,PFL_LOG_PARAMETRI,(new IDVariant(PAN_LOG.FieldText(PFL_LOG_PARAMETRI))).stringValue()); 
      PAN_LOG.set_ToolTip(Glb.OBJ_FIELD,PFL_LOG_TESTOERRORE,(new IDVariant(PAN_LOG.FieldText(PFL_LOG_TESTOERRORE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "LOGOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // LOG On Change Layout
  // Evento notificato dal pannello al cambiamento del layout
  // (da dettaglio a lista o viceversa)
  // New Layout - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_LOG_OnChangeLayout(IDVariant NewLayout,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // LOG On Change Layout Body
      // Corpo Procedura
      // 
      if (NewLayout.equals((new IDVariant(0)), true))
      {
        PAN_FILTRO.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_FILTRO.set_Visible((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "LOGOnChangeLayout", _e);
    }
  }

  // **********************************************************************
  // Svuota Log
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SvuotaLog ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Svuota Log Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOMEOGGEARGO, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Selezionare l'argomento"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Verranno cancellati tutti i log fino alla data odierna.<br/>Continuare? "));
      if (MainFrm.MessageConfirm(v_S1))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("delete from WRK_LOG ");
          SQL.append("where (ARGOMENTO = " + IDL.CSql(IMDB.Value(IMDBDef17.PQRY_FILTRO16, IMDBDef17.PQSL_FILTRO16_NOMEOGGEARGO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e6)
        {
          MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
          return 0;
        }
        PAN_LOG.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "SvuotaLog", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Attiva O Disattiva LOG
  // **********************************************************************
  public int AttivaODisattivaLOG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attiva O Disattiva LOG Body
      // Corpo Procedura
      // 
      IDVariant v_DISATTIVA = new IDVariant(0,IDVariant.STRING);
      v_DISATTIVA = (new IDVariant("Disattiva "));
      IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
      if (IDL.Find((new IDVariant(MainFrm.CmdObj.CmdCaption(MyGlb.CMD_ATTIODISALOG+BaseCmdLinIdx))), v_DISATTIVA).compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("I log verranno Disattivati.<br/>Continuare?"));
        v_MSG = new IDVariant(S);
      }
      else
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("I log verranno Attivati.<br/>Continuare?"));
        v_MSG = new IDVariant(S);
      }
      if (MainFrm.MessageConfirm(v_MSG))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("update REGISTRO set ");
          SQL.append("  VALORE = CASE WHEN NVL(REGISTRO.VALORE, 'NO') = 'NO' THEN 'SI' ELSE 'NO' END ");
          SQL.append("where (UPPER(CHIAVE) = 'PRODUCTS/' || 'CFA') ");
          SQL.append("and   (UPPER(STRINGA) = 'LOG_ATTIVO') ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e6)
        {
          MainFrm.set_AlertMessage(new IDVariant(e6.getMessage())); 
          return 0;
        }
        IDVariant v_VALORE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  UPPER(A.VALORE) as UPPEREGIVALO ");
        SQL.append("from ");
        SQL.append("  REGISTRO A ");
        SQL.append("where (UPPER(A.CHIAVE) = 'PRODUCTS/' || 'CFA') ");
        SQL.append("and   (UPPER(A.STRINGA) = 'LOG_ATTIVO') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VALORE = QV.Get("UPPEREGIVALO", IDVariant.STRING) ;
        }
        QV.Close();
        if (IDL.NullValue(v_VALORE,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Disattiva LOG"));
          MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ATTIODISALOG+BaseCmdLinIdx, new IDVariant(S).stringValue());
          PAN_LOG.set_Visible((new IDVariant(-1)).booleanValue());
          PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          FiltriVisibili((new IDVariant(-1)));
        }
        else
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Attiva LOG"));
          MainFrm.CmdObj.set_CmdCaption(MyGlb.CMD_ATTIODISALOG+BaseCmdLinIdx, new IDVariant(S).stringValue());
          PAN_LOG.set_Visible((new IDVariant(0)).booleanValue());
          PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
          v_S1 = (new IDVariant("I log sono attualmente disabilitati. Cliccare qui per abilitarli"));
          MainFrm.ShowTooltip(v_S1.stringValue(),(new IDVariant("")).stringValue(),new IDVariant(PAN_FILTRO.bFields(PFL_FILTRO_ETICHATTILOG).GetRD3Ident((new IDVariant(-1)).intValue(), (new IDVariant(0)).booleanValue())).stringValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant(0)).intValue(),(new IDVariant(750)).intValue(),(new IDVariant(4000)).intValue(),(new IDVariant(0)).booleanValue(),(new IDVariant(-1)).intValue(),(new IDVariant(-1)).intValue(),(new IDVariant("info")).stringValue(),(new IDVariant(-1)).booleanValue()); 
          PAN_FILTRO.set_ToolTip(Glb.OBJ_FIELD,PFL_FILTRO_ETICHATTILOG,v_S1.stringValue()); 
          FiltriVisibili((new IDVariant(0)));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "AttivaODisattivaLOG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri Visibili
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // Visible - Input
  // **********************************************************************
  public int FiltriVisibili (IDVariant Visible)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Visibili Body
      // Corpo Procedura
      // 
      PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, (Visible.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, (Visible.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_DATADA, (Visible.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_FILTRO.SetFlags (Glb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, (Visible.booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, (Visible.booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ConsolleErrori", "FiltriVisibili", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtro
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONSOLERRORI_FILTRO16() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_FILTRO16_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_FILTRO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_FILTRO, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_FILTRO16_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_FILTRO16_RS, 0, IMDBDef7.TBL_FILTRO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FILTRO16_RS, 0, 0, IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGETIPO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FILTRO16_RS, 1, 0, IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGDATDA, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FILTRO16_RS, 2, 0, IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOOGINSORERE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FILTRO16_RS, 3, 0, IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMEOGGEARGO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FILTRO16_RS, 4, 0, IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPERR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FILTRO16_RS, 5, 0, IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPWAR, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_FILTRO16_RS, 6, 0, IMDBDef7.TBL_FILTRO, IMDBDef7.FLD_FILTRO_NOMOGGTIPLOG, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_FILTRO, 0);
      if (IMDB.Eof(IMDBDef7.TBL_FILTRO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_FILTRO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_FILTRO16_RS, 0);
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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRO);
    // Stub
  }

  private void PAN_FILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_FILTRO_ETICHATTILOG)
    {
      this.IdxPanelActived = this.PAN_FILTRO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AttivaODisattivaLOG();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_FILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FILTRO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_LOG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LOG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LOG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LOG, Cancel);
    // Stub
  }

  private void PAN_LOG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_LOG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LOG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_WRKLOG, IMDBDef17.PQSL_WRKLOG_RECWRKLOGDAT, 0)))
      {
        IMDB.set_Value(IMDBDef17.PQRY_WRKLOG, IMDBDef17.PQSL_WRKLOG_RECWRKLOGDAT, 0, (new IDVariant("1999/12/31 02:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_LOG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, "47ADAE64-E9EF-48CF-958C-EF3E15902432");
    PAN_FILTRO.set_Header(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, "Tipo Log");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, MyGlb.VIS_GROUPSTYLE);
    PAN_FILTRO.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, MyGlb.PANEL_LIST, 0, -9999, 192, 0, 0, 0);
    PAN_FILTRO.SetRect(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, MyGlb.PANEL_FORM, 420, 4, 224, 52, 0, 0);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, 0, 47);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, 1, 13);
    PAN_FILTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, 0, 1);
    PAN_FILTRO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, 1, 1);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_GROUP, GRP_FILTRO_TIPOLOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, "2746A6EA-683E-4251-8059-4792C07E9473");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, "Argomento");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, "000CF8BF-271B-44DD-BFCC-779178B302BF");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, "Tipo Log");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, "A2ECA76A-B023-4A3E-B504-F5FF921DAB18");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, "Data Da");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.VIS_NORMFIELPADR);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, "E65615FE-2D92-4E26-B258-BDE16B927823");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, "Tipo Log");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, MyGlb.VIS_VUOTONORMALE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, "7B3F4EAB-0F80-462F-99E2-BDF298B0D62C");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, "Error");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, "25CEA8C4-91C8-4EEF-B221-E55CC9513435");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, "Warning");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, "678972C6-0EE6-4719-BB4F-026160D910C7");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, "Log");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, "4AC4C384-B1D7-45C5-BC96-55084BBFADC5");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, "Includi SOAP REQUEST RESPONSE");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, "DC483A33-9A7B-4EC6-80CC-86A38DFFC979");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, "ATTIVA LOG");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, MyGlb.VIS_STATICBUTTON);
    PAN_FILTRO.SetImage(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, 0, "button1.gif", false);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_LIST, 72);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_LIST, "Argomento");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_FORM, 4, 8, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_FORM, 72);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ARGOMENTO, MyGlb.PANEL_FORM, "Argomento");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ARGOMENTO, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ARGOMENTO, PPQRY_FILTRO16, "A.NOMEOGGEARGO", "NOMEOGGEARGO", 5, 50, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_LIST, 36);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_LIST, "Tipo Log");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_FORM, 344, 4, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_FORM, 60);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG, MyGlb.PANEL_FORM, "Tipo Log");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOLOG, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOLOG, PPQRY_FILTRO16, "A.NOMEOGGETIPO", "NOMEOGGETIPO", 5, 50, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG, (new IDVariant("ERROR")), "ERROR", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG, (new IDVariant("WARNING")), "WARNING", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG, (new IDVariant("ERROR + WARNING")), "ERROR + WARNING", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG, (new IDVariant("LOG")), "LOG", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG, (new IDVariant("DEBUG")), "DEBUG", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG, (new IDVariant("TUTTI")), "TUTTI", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_LIST, 56);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_LIST, "Data Da");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_FORM, 648, 8, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_FORM, 56);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_DATADA, MyGlb.PANEL_FORM, "Data Da");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_DATADA, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_DATADA, PPQRY_FILTRO16, "A.NOMEOGGDATDA", "NOMEOGGDATDA", 8, 15, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, MyGlb.PANEL_LIST, 8, 32, 68, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, MyGlb.PANEL_LIST, 0);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, MyGlb.PANEL_LIST, 2);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, MyGlb.PANEL_FORM, 348, 8, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, MyGlb.PANEL_FORM, 0);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHTIPOLOG, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ETICHTIPOLOG, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ETICHTIPOLOG, -1, "", "ETICHTIPOLOG", 0, 0, 0, -13997);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_LIST, 64);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_LIST, "Error");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_FORM, 424, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_FORM, 40);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOERROR, MyGlb.PANEL_FORM, "Error");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOERROR, -1, GRP_FILTRO_TIPOLOG);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOERROR, PPQRY_FILTRO16, "A.NOMOGGTIPERR", "NOMOGGTIPERR", 5, 2, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOERROR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOERROR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_LIST, 84);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_LIST, "Warning");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_FORM, 496, 8, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_FORM, 56);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOWARNING, MyGlb.PANEL_FORM, "Warning");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOWARNING, -1, GRP_FILTRO_TIPOLOG);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOWARNING, PPQRY_FILTRO16, "A.NOMOGGTIPWAR", "NOMOGGTIPWAR", 5, 2, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOWARNING, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOWARNING, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_LIST, 56);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_LIST, "Log");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_FORM, 584, 8, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_FORM, 32);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPOLOG1, MyGlb.PANEL_FORM, "Log");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPOLOG1, -1, GRP_FILTRO_TIPOLOG);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPOLOG1, PPQRY_FILTRO16, "A.NOMOGGTIPLOG", "NOMOGGTIPLOG", 5, 2, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG1, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPOLOG1, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_LIST, 192);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_LIST, "Includi SOAP REQUEST RESPONSE");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_FORM, 424, 32, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_FORM, 192);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_INCSOAREQRES, MyGlb.PANEL_FORM, "Includi SOAP REQUEST RESPONSE");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_INCSOAREQRES, -1, GRP_FILTRO_TIPOLOG);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_INCSOAREQRES, PPQRY_FILTRO16, "A.NOOGINSORERE", "NOOGINSORERE", 5, 2, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_INCSOAREQRES, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_INCSOAREQRES, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, MyGlb.PANEL_LIST, 24, 36, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, MyGlb.PANEL_LIST, 0);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, MyGlb.PANEL_FORM, 24, 8, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, MyGlb.PANEL_FORM, 0);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ETICHATTILOG, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ETICHATTILOG, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ETICHATTILOG, -1, "", "ETICHATTILOG", 0, 0, 0, -13997);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ARGOMENTO as WRKLOGARGOME, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  A.ARGOMENTO as WRKLOGARGOM1 ");
    SQL.append("from ");
    SQL.append("  WRK_LOG A ");
    SQL.append("where (A.ARGOMENTO = ~~NOMEOGGEARGO~~) ");
    SQL.append("and   (NOT ((A.ARGOMENTO IS NULL))) ");
    SQL.append("group by ");
    SQL.append("  A.ARGOMENTO ");
    PAN_FILTRO.SetQuery(PPQRY_WRKLOG1, 0, SQL, PFL_FILTRO_ARGOMENTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ARGOMENTO as WRKLOGARGOME, ");
    SQL.append("  SUM(1) as NUOVAESPRESS, ");
    SQL.append("  A.ARGOMENTO as WRKLOGARGOM1 ");
    SQL.append("from ");
    SQL.append("  WRK_LOG A ");
    SQL.append("where (NOT ((A.ARGOMENTO IS NULL))) ");
    SQL.append("group by ");
    SQL.append("  A.ARGOMENTO ");
    PAN_FILTRO.SetQuery(PPQRY_WRKLOG1, 1, SQL, PFL_FILTRO_ARGOMENTO, "");
    PAN_FILTRO.SetQueryDB(PPQRY_WRKLOG1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO16", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO16, IMDBDef17.PQRY_FILTRO16_RS, IMDBDef7.TBL_FILTRO);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ARGOMENTO, IMDBDef7.FLD_FILTRO_NOMEOGGEARGO);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOLOG, IMDBDef7.FLD_FILTRO_NOMEOGGETIPO);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_DATADA, IMDBDef7.FLD_FILTRO_NOMEOGGDATDA);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOERROR, IMDBDef7.FLD_FILTRO_NOMOGGTIPERR);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOWARNING, IMDBDef7.FLD_FILTRO_NOMOGGTIPWAR);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPOLOG1, IMDBDef7.FLD_FILTRO_NOMOGGTIPLOG);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_INCSOAREQRES, IMDBDef7.FLD_FILTRO_NOOGINSORERE);
    PAN_FILTRO.SetMasterTable(0, "FILTRO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRO.Status() == 2)
    {
      int oldListQBE = PAN_FILTRO.iUseListQBE;
      PAN_FILTRO.iUseListQBE = 0;
      PAN_FILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LOG_Init()
  {

    PAN_LOG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LOG.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LOG.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_DATA, "242D4A8F-E405-467D-8BCB-402EE9E448D9");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_DATA, "DATA");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_DATA, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, "73549767-B93B-41BD-B0C9-9F216E515C0E");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, "NOME ISTRUZIONE");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, "D486C3E2-4AC5-43C8-BA74-F98FC952F5E0");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, "TIPO");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, "3A03E516-9703-478F-A59A-51CE9D1C4B8C");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, "PARAMETRI");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.VIS_NORMALFIELDS);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, "F5BA6BBC-A74D-4239-88CC-4FC1FA0C4DC2");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, "TESTO ERRORE");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.VIS_NORMALFIELDS);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, "5530B224-CCFE-43FC-A049-51EA8F669A35");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, "STACK TRACE");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.VIS_NORMALFIELDS);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_ID, "9A1F3374-ED8A-4EAF-AA92-72674E2F8BC9");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_ID, "ID");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_ID, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_ID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_LOG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, "EB289CAE-D644-4B2E-B7A4-E83B9EE5CDE3");
    PAN_LOG.set_Header(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, "DOC ELABORATO");
    PAN_LOG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, "");
    PAN_LOG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.VIS_NORMALFIELDS);
    PAN_LOG.SetFlags(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LOG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_LIST, 40);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_LIST, "DATA");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_FORM, 748, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_FORM, 40);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_FORM, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_DATA, MyGlb.PANEL_FORM, "DATA");
    PAN_LOG.SetFieldPage(PFL_LOG_DATA, -1, -1);
    PAN_LOG.SetFieldPanel(PFL_LOG_DATA, PPQRY_WRKLOG, "A.DATA", "RECWRKLOGDAT", 8, 19, 0, -13997);
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_LIST, 112, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_LIST, 112);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_LIST, "NOME ISTRUZIONE");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_FORM, 4, 4, 572, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_FORM, 112);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_FORM, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_NOMEISTRUZIO, MyGlb.PANEL_FORM, "NOME ISTRUZIONE");
    PAN_LOG.SetFieldPage(PFL_LOG_NOMEISTRUZIO, -1, -1);
    PAN_LOG.SetFieldUnbound(PFL_LOG_NOMEISTRUZIO, true);
    PAN_LOG.SetFieldPanel(PFL_LOG_NOMEISTRUZIO, PPQRY_WRKLOG, "SUBSTR(A.NOME_ISTRUZIONE, (INSTR(A.NOME_ISTRUZIONE, '.')) + 1, 8000)", "RECWRKLONOIS", 5, 99, 0, -13997);
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_LIST, 252, 36, 80, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_FORM, 580, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_FORM, 36);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_LOG.SetFieldPage(PFL_LOG_TIPO, -1, -1);
    PAN_LOG.SetFieldPanel(PFL_LOG_TIPO, PPQRY_WRKLOG, "A.TIPO", "RECWRKLOGTIP", 5, 100, 0, -13997);
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_LIST, 332, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_LIST, 76);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_LIST, "PARAMETRI");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_FORM, 40, 28, 868, 132, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_FORM, 76);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_FORM, 9);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_PARAMETRI, MyGlb.PANEL_FORM, "PARAMETRI");
    PAN_LOG.SetFieldPage(PFL_LOG_PARAMETRI, -1, -1);
    PAN_LOG.SetFieldPanel(PFL_LOG_PARAMETRI, PPQRY_WRKLOG, "A.PARAMETRI", "RECWRKLOGPAR", 5, 4000, 0, -13997);
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_LIST, 764, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_LIST, 92);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_LIST, "TESTO ERRORE");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_FORM, 24, 168, 884, 92, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_FORM, 92);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_FORM, 6);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_TESTOERRORE, MyGlb.PANEL_FORM, "TESTO ERRORE");
    PAN_LOG.SetFieldPage(PFL_LOG_TESTOERRORE, -1, -1);
    PAN_LOG.SetFieldPanel(PFL_LOG_TESTOERRORE, PPQRY_WRKLOG, "A.TESTO_ERRORE", "RECWRKLOTEER", 5, 4000, 0, -13997);
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_LIST, 1196, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_LIST, 84);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_LIST, "STACK TRACE");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_FORM, 32, 268, 876, 172, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_FORM, 84);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_FORM, 12);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_STACKTRACE, MyGlb.PANEL_FORM, "STACK TRACE");
    PAN_LOG.SetFieldPage(PFL_LOG_STACKTRACE, -1, -1);
    PAN_LOG.SetFieldPanel(PFL_LOG_STACKTRACE, PPQRY_WRKLOG, "A.STACK_TRACE", "RECWRKLOSTTR", 5, 4000, 0, -13997);
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_LIST, 2412, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_LIST, 24);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_LIST, "ID");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_FORM, 4, 232, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_FORM, 24);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_FORM, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_ID, MyGlb.PANEL_FORM, "ID");
    PAN_LOG.SetFieldPage(PFL_LOG_ID, -1, -1);
    PAN_LOG.SetFieldPanel(PFL_LOG_ID, PPQRY_WRKLOG, "A.ID", "RECOWRKLOGID", 2, 15, 0, -13997);
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_LIST, 1628, 36, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_LIST, 100);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_LIST, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_LIST, "DOC ELABORATO");
    PAN_LOG.SetRect(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_FORM, 16, 456, 892, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LOG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_FORM, 100);
    PAN_LOG.SetNumRow(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_FORM, 1);
    PAN_LOG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LOG_DOCELABORATO, MyGlb.PANEL_FORM, "DOC ELABORATO");
    PAN_LOG.SetFieldPage(PFL_LOG_DOCELABORATO, -1, -1);
    PAN_LOG.SetFieldPanel(PFL_LOG_DOCELABORATO, PPQRY_WRKLOG, "A.DOC_ELABORATO", "RECWRKLODOEL", 5, 100, 0, -13997);
  }

  private void PAN_LOG_InitQueries()
  {
    StringBuffer SQL;

    PAN_LOG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LOG.SetIMDB(IMDB, "PQRY_WRKLOG", true);
    PAN_LOG.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  SUBSTR(A.NOME_ISTRUZIONE, (INSTR(A.NOME_ISTRUZIONE, '.')) + 1, 8000) as RECWRKLONOIS, ");
    SQL.append("  A.TIPO as RECWRKLOGTIP, ");
    SQL.append("  A.PARAMETRI as RECWRKLOGPAR, ");
    SQL.append("  A.TESTO_ERRORE as RECWRKLOTEER, ");
    SQL.append("  A.STACK_TRACE as RECWRKLOSTTR, ");
    SQL.append("  A.DATA as RECWRKLOGDAT, ");
    SQL.append("  A.ID as RECOWRKLOGID, ");
    SQL.append("  A.DOC_ELABORATO as RECWRKLODOEL ");
    PAN_LOG.SetQuery(PPQRY_WRKLOG, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_LOG A ");
    PAN_LOG.SetQuery(PPQRY_WRKLOG, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~PQRY_FILTRO16.NOOGINSORERE~~ = 'SI' OR (~~PQRY_FILTRO16.NOOGINSORERE~~ = 'NO' AND (NOT ((A.NOME_ISTRUZIONE LIKE '%' || 'WS' || '%' || 'REQUEST')) AND INSTR(UPPER(A.ARGOMENTO), UPPER('Fatturazione')) > 0) OR (A.TESTO_ERRORE NOT IN ('SOAP_REQUEST', 'SOAP_RESPONSE')))) ");
    SQL.append("and   ((~~PQRY_FILTRO16.NOMOGGTIPERR~~ = 'SI' AND INSTR(A.TIPO, 'ERROR') > 0) OR (~~PQRY_FILTRO16.NOMOGGTIPWAR~~ = 'SI' AND A.TIPO = 'WARNING') OR (~~PQRY_FILTRO16.NOMOGGTIPLOG~~ = 'SI' AND A.TIPO = 'LOG')) ");
    SQL.append("and   (A.DATA >= NVL(~~PQRY_FILTRO16.NOMEOGGDATDA~~, TO_DATE('1900-01-01','YYYY-MM-DD'))) ");
    SQL.append("and   (A.ARGOMENTO = ~~PQRY_FILTRO16.NOMEOGGEARGO~~) ");
    PAN_LOG.SetQuery(PPQRY_WRKLOG, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOG.SetQuery(PPQRY_WRKLOG, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LOG.SetQuery(PPQRY_WRKLOG, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ID, ");
    SQL.append("  A.DATA ");
    PAN_LOG.SetQuery(PPQRY_WRKLOG, 5, SQL, -1, "");
    PAN_LOG.SetQueryDB(PPQRY_WRKLOG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LOG.SetMasterTable(0, "WRK_LOG");
    PAN_LOG.AddToSortList(PFL_LOG_ID, true);
    PAN_LOG.AddToSortList(PFL_LOG_DATA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LOG.Status() == 2)
    {
      int oldListQBE = PAN_LOG.iUseListQBE;
      PAN_LOG.iUseListQBE = 0;
      PAN_LOG.PanelCommand(Glb.PCM_SEARCH);
      PAN_LOG.PanelCommand(Glb.PCM_FIND);
      PAN_LOG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LOG) PAN_LOG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
    if (SrcObj == PAN_LOG) PAN_LOG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
    if (SrcObj == PAN_LOG) PAN_LOG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LOG) PAN_LOG_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
    if (SrcObj == PAN_LOG) PAN_LOG_OnChangeLayout(NewLayout, Cancel);
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
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_LOG) PAN_LOG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
