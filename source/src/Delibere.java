// **********************************************
// Delibere
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Delibere extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_NUMERO = 0;
  private static int GRP_PARAMETRI_DATA = 1;
  private static int GRP_PARAMETRI_GRUPSEDEANNO = 2;

  private static int PFL_PARAMETRI_DAL1 = 0;
  private static int PFL_PARAMETRI_AL1 = 1;
  private static int PFL_PARAMETRI_DAL = 2;
  private static int PFL_PARAMETRI_AL = 3;
  private static int PFL_PARAMETRI_SEDE = 4;
  private static int PFL_PARAMETRI_ANNO = 5;
  private static int PFL_PARAMETRI_LABEL = 6;

  private static int PPQRY_PARAMETRI445 = 0;

  private static int PPQRY_T11 = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_DELIBERE_SEDEDEL = 0;
  private static int PFL_DELIBERE_NUMERODEL = 1;
  private static int PFL_DELIBERE_ANNODEL = 2;
  private static int PFL_DELIBERE_PROVVEDLABEL = 3;
  private static int PFL_DELIBERE_DATA = 4;
  private static int PFL_DELIBERE_DESCRIZIONE = 5;
  private static int PFL_DELIBERE_NUMEROAPP = 6;
  private static int PFL_DELIBERE_DDATAAPP = 7;
  private static int PFL_DELIBERE_APPROVALABEL = 8;
  private static int PFL_DELIBERE_ESECUTIVITA = 9;

  private static int PPQRY_DEL6 = 0;

  private static int PPQRY_T10 = 1;


  IDPanel PAN_DELIBERE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI262(IMDB);
    //
    //
    Init_PQRY_PARAMETRI445(IMDB);
    Init_PQRY_PARAMETRI445_RS(IMDB);
    Init_PQRY_DEL6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI262(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI262, 6);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI262, "TBL_PARAMETRI262");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARNUMDELDAL, "PARNUMDELDAL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARNUMDELDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARANUMDELAL, "PARANUMDELAL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARANUMDELAL,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARDATDELDAL, "PARDATDELDAL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARDATDELDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARADATDELAL, "PARADATDELAL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARADATDELAL,6,19,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARAMSEDE, "PARAMSEDE");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARAMSEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARAMANNO, "PARAMANNO");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI262,IMDBDef1.FLD_PARAMETRI262_PARAMANNO,1,4,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI262, 0);
  }

  private static void Init_PQRY_PARAMETRI445(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI445, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI445, "PQRY_PARAMETRI445");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARNUMDELDAL, "PARNUMDELDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARNUMDELDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARANUMDELAL, "PARANUMDELAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARANUMDELAL,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARDATDELDAL, "PARDATDELDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARDATDELDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARADATDELAL, "PARADATDELAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARADATDELAL,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARAMSEDE, "PARAMSEDE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARAMSEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARAMANNO, "PARAMANNO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445,IMDBDef9.PQSL_PARAMETRI445_PARAMANNO,1,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI445, 0);
  }

  private static void Init_PQRY_PARAMETRI445_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI445_RS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI445_RS, "PQRY_PARAMETRI445_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARNUMDELDAL, "PARNUMDELDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARNUMDELDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARANUMDELAL, "PARANUMDELAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARANUMDELAL,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARDATDELDAL, "PARDATDELDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARDATDELDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARADATDELAL, "PARADATDELAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARADATDELAL,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARAMSEDE, "PARAMSEDE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARAMSEDE,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARAMANNO, "PARAMANNO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI445_RS,IMDBDef9.PQSL_PARAMETRI445_PARAMANNO,1,4,0);
  }

  private static void Init_PQRY_DEL6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_DEL6, 8);
    IMDB.set_TblCode(IMDBDef9.PQRY_DEL6, "PQRY_DEL6");
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_ANNO_DEL, "ANNO_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_ANNO_DEL,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_NUMERO_DEL, "NUMERO_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_NUMERO_DEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_SEDE_DEL, "SEDE_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_SEDE_DEL,5,255,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_D_DATA_DEL, "D_DATA_DEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_D_DATA_DEL,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_DELDESCRIZIO, "DELDESCRIZIO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_DELDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_TIPO_ESEC, "TIPO_ESEC");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_TIPO_ESEC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_NUMERO_APP, "NUMERO_APP");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_NUMERO_APP,5,10,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_D_DATA_APP, "D_DATA_APP");
    IMDB.SetFldParams(IMDBDef9.PQRY_DEL6,IMDBDef9.PQSL_DEL6_D_DATA_APP,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_DEL6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Delibere(MyWebEntryPoint w, IMDBObj imdb)
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
  public Delibere()
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
    FormIdx = MyGlb.FRM_DELIBERE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6DEC165B-2223-48B0-95F8-2A4AB4BCFC1C";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 804;
    DesignHeight = 470;
    set_Caption(new IDVariant("Delibere"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 804;
    Frames[1].Height = 444;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.18018;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 804;
    Frames[2].Height = 80;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 804;
    Frames[2].FixedHeight = 80;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 80-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "51E909BD-67D1-439A-AAFF-65EE79842CF7");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 456, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 804;
    Frames[3].Height = 364;
    Frames[3].Caption = "Delibere";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 364;
    PAN_DELIBERE = new IDPanel(w, this, 3, "PAN_DELIBERE");
    Frames[3].Content = PAN_DELIBERE;
    PAN_DELIBERE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DELIBERE.VS = MainFrm.VisualStyleList;
    PAN_DELIBERE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6F7F9EA6-908E-45FF-B3F7-15EDB0CC2F2E");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 756, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DELIBERE.InitStatus = 1;
    PAN_DELIBERE_Init();
    PAN_DELIBERE_InitFields();
    PAN_DELIBERE_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_NUOVO1+BaseCmdLinIdx)
      {
        Nuovo();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FORMLIST1+BaseCmdLinIdx)
      {
        FormList();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG120+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGIU2+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG120+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MOVIMEDELIB5+BaseCmdLinIdx)
      {
        ApriMovimentiDelibera();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI262, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DELIBERE_PARAMETRI445();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DELIBERE.UpdatePanel(MainFrm);
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
    return (obj instanceof Delibere);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Delibere.class.getName() : (Glb.ClassWithPackage(Delibere.class) ? Delibere.class.getName().substring(Delibere.class.getPackage().getName().length() + 1) : Delibere.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_DELIBERE.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARNUMDELDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARANUMDELAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARDATDELDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARADATDELAL, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Delibere On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DELIBERE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DELIBERE);
      // 
      // Delibere On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DELIBERE.set_ToolTip(Glb.OBJ_FIELD,PFL_DELIBERE_DESCRIZIONE,(new IDVariant(PAN_DELIBERE.FieldText(PFL_DELIBERE_DESCRIZIONE))).stringValue()); 
      PAN_DELIBERE.set_ToolTip(Glb.OBJ_FIELD,PFL_DELIBERE_NUMEROAPP,(new IDVariant(PAN_DELIBERE.FieldText(PFL_DELIBERE_NUMEROAPP))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "DelibereOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Delibere On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DELIBERE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delibere On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_DELIBERE.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_DELIBERE.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "DelibereOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Nuovo
  // **********************************************************************
  public int Nuovo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Body
      // Procedure Body
      // 
      IDVariant v_CODICE = null;
      v_CODICE = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as T10CODICE ");
      SQL.append("from ");
      SQL.append("  T10 A ");
      SQL.append("where (A.PREVALENTE = 'SI') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CODICE = QV.Get("T10CODICE", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0, (new IDVariant("Ins")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMECLOSE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEESECU, 0, new IDVariant(v_CODICE));
      MainFrm.Show(MyGlb.FRM_DELIBERA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "Nuovo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Form List
  // **********************************************************************
  public int FormList ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Form List Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMESEDE, 0, IMDB.Value(IMDBDef9.PQRY_DEL6, IMDBDef9.PQSL_DEL6_SEDE_DEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMENUMER, 0, IMDB.Value(IMDBDef9.PQRY_DEL6, IMDBDef9.PQSL_DEL6_NUMERO_DEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMEANNO, 0, IMDB.Value(IMDBDef9.PQRY_DEL6, IMDBDef9.PQSL_DEL6_ANNO_DEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMUPININ, 0, (new IDVariant("Upd")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI25, IMDBDef1.FLD_PARAMETRI25_ROWNAMECLOSE, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_DELIBERA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "FormList", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Movimenti Delibera
  // **********************************************************************
  public int ApriMovimentiDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Movimenti Delibera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMSEDEDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL6, IMDBDef9.PQSL_DEL6_SEDE_DEL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMNUMEDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL6, IMDBDef9.PQSL_DEL6_NUMERO_DEL, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI245, IMDBDef2.FLD_PARAMETRI245_PARAMANNODEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL6, IMDBDef9.PQSL_DEL6_ANNO_DEL, 0));
      MainFrm.Show(MyGlb.FRM_MOVIMEDELIBE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "ApriMovimentiDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Delibere On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_DELIBERE_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Delibere On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_DELIBERE.Status()).equals((new IDVariant(1)), true))
      {
        if (!(MainFrm.GESTIODELIBE.booleanValue()))
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETDEL1+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETDEL1+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG120+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMASETDEL1+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
        if (!(MainFrm.GESTIODELIBE.booleanValue()))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST1+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_NUOVO1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FORMLIST1+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_FUNZIOAGG120+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Delibere", "DelibereOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void DELIBERE_PARAMETRI445() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI445_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI262, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI262, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI445_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI445_RS, 0, IMDBDef1.TBL_PARAMETRI262, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI445_RS, 0, 0, IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARNUMDELDAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI445_RS, 1, 0, IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARANUMDELAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI445_RS, 2, 0, IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARDATDELDAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI445_RS, 3, 0, IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARADATDELAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI445_RS, 4, 0, IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARAMSEDE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI445_RS, 5, 0, IMDBDef1.TBL_PARAMETRI262, IMDBDef1.FLD_PARAMETRI262_PARAMANNO, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI262, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI262, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI262, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI445_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DELIBERE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DELIBERE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DELIBERE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DELIBERE, Cancel);
    // Stub
  }

  private void PAN_DELIBERE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DELIBERE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DELIBERE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DELIBERE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "272EC286-C50D-4E7C-A9AA-2D621BAB5540");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "Numero");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_LIST, 0, -9999, 136, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, MyGlb.PANEL_FORM, 304, 3, 212, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 44);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "2643214D-DDCD-4D4A-8C94-5B3FE8BF9367");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "Data");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_LIST, 136, -9999, 240, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, MyGlb.PANEL_FORM, 524, 3, 252, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 27);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, "26EC3414-A6B9-442D-84F6-40CA6B6665B7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, "Gruppo Sede Anno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, MyGlb.PANEL_FORM, 8, 4, 284, 48, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, 0, 104);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, 1, 1);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_GRUPSEDEANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "DD037FD6-495A-470C-841E-F1C88A0868FF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "5039457D-2FF2-4D82-B0B2-80200AFF86BF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "54661B3B-C623-4B66-9123-755FF710CF83");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "686CA913-3128-462C-ABF6-9407172F01BB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, "783F047D-5698-4DB4-9F9F-CB98A4E234D7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, "Sede");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, "A2B58A75-9A7E-4E71-AEBD-053E8EFB60EE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, "Anno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, "80E2C471-1BB4-4192-B3BB-E0A0F77652C8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 308, 28, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_PARAMETRI445, "A.PARNUMDELDAL", "PARNUMDELDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 48, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 436, 28, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, GRP_PARAMETRI_NUMERO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_PARAMETRI445, "A.PARANUMDELAL", "PARANUMDELAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 136, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 528, 28, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI445, "A.PARDATDELDAL", "PARDATDELDAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 256, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 668, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_DATA);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI445, "A.PARADATDELAL", "PARADATDELAL", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_LIST, "Sede");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_FORM, 12, 28, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_FORM, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SEDE, MyGlb.PANEL_FORM, "Sede");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SEDE, -1, GRP_PARAMETRI_GRUPSEDEANNO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SEDE, PPQRY_PARAMETRI445, "A.PARAMSEDE", "PARAMSEDE", 5, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, 208, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNO, -1, GRP_PARAMETRI_GRUPSEDEANNO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNO, PPQRY_PARAMETRI445, "A.PARAMANNO", "PARAMANNO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_LIST, 16, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_FORM, 276, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEL, -1, GRP_PARAMETRI_GRUPSEDEANNO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEL, -1, "", "LABEL", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T11CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T11DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T11 A ");
    SQL.append("where (A.CODICE = ~~PARAMSEDE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T11, 0, SQL, PFL_PARAMETRI_SEDE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T11CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T11DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T11 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_T11, 1, SQL, PFL_PARAMETRI_SEDE, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T11, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI445", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI445, IMDBDef9.PQRY_PARAMETRI445_RS, IMDBDef1.TBL_PARAMETRI262);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef1.FLD_PARAMETRI262_PARNUMDELDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef1.FLD_PARAMETRI262_PARANUMDELAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef1.FLD_PARAMETRI262_PARDATDELDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef1.FLD_PARAMETRI262_PARADATDELAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SEDE, IMDBDef1.FLD_PARAMETRI262_PARAMSEDE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNO, IMDBDef1.FLD_PARAMETRI262_PARAMANNO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI262");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DELIBERE_Init()
  {

    PAN_DELIBERE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DELIBERE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DELIBERE.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, "82982316-8923-4706-8B5A-224C5B4D5CD3");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, "SEDE DEL");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, "03716895-E7D5-4C37-B979-3E9B12708C5D");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, "NUMERO DEL");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, "6B16DE88-5C49-4F06-A6D7-1BAABA064A4E");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, "ANNO DEL");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, "7ACDB77F-3C9E-4550-A0EC-3C74D9964254");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, "Provvedimento");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, "D3CFC6F0-F629-4375-8FCB-5C0F9B31B186");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, "Data");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, "4F4CC6BF-6AA9-4BDA-AC95-9FDD494E22C6");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, "Descrizione");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, "D66E97AA-7B38-405D-A0D4-965518450BC4");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, "NUMERO APP");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, "14E31240-830C-48DA-9BCF-8A7D5A77106B");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, "D DATA APP");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, "6048FA70-5404-498A-A214-706172FFAAF9");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, "Approvazione");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DELIBERE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, "E4B610D9-4550-416E-80F7-28250C309B81");
    PAN_DELIBERE.set_Header(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, "Esecutività");
    PAN_DELIBERE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, "");
    PAN_DELIBERE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.VIS_NORMALFIELDS);
    PAN_DELIBERE.SetFlags(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP, -1);
  }

  private void PAN_DELIBERE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, 56);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_LIST, "SEDE DEL");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, 332, 4, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, 72);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_SEDEDEL, MyGlb.PANEL_FORM, "SEDE DEL");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_SEDEDEL, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_SEDEDEL, PPQRY_DEL6, "A.SEDE_DEL", "SEDE_DEL", 5, 255, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, 40, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, 72);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_LIST, "NUM. DEL");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, 188, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMERODEL, MyGlb.PANEL_FORM, "NUMERO DEL");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_NUMERODEL, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_NUMERODEL, PPQRY_DEL6, "A.NUMERO_DEL", "NUMERO_DEL", 1, 6, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, 84, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_LIST, "ANNO DEL");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, 128);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ANNODEL, MyGlb.PANEL_FORM, "ANNO DEL");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_ANNODEL, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_ANNODEL, PPQRY_DEL6, "A.ANNO_DEL", "ANNO_DEL", 1, 4, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, MyGlb.PANEL_LIST, 0, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, MyGlb.PANEL_LIST, 0);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, MyGlb.PANEL_LIST, 2);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, MyGlb.PANEL_FORM, 0, 4, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, MyGlb.PANEL_FORM, 0);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_PROVVEDLABEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_PROVVEDLABEL, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_PROVVEDLABEL, -1, "", "PROVVEDLABEL", 0, 0, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_LIST, 120, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_LIST, 68);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_FORM, 4, 100, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_FORM, 128);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_DATA, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_DATA, PPQRY_DEL6, "A.D_DATA_DEL", "D_DATA_DEL", 6, 19, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_LIST, 196, 36, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_DESCRIZIONE, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_DESCRIZIONE, PPQRY_DEL6, "A.DESCRIZIONE", "DELDESCRIZIO", 5, 140, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_LIST, 440, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_LIST, 76);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_LIST, "NUMERO APP");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_FORM, 188, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_FORM, 88);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_NUMEROAPP, MyGlb.PANEL_FORM, "NUMERO APP");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_NUMEROAPP, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_NUMEROAPP, PPQRY_DEL6, "A.NUMERO_APP", "NUMERO_APP", 5, 10, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_LIST, 516, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_LIST, 68);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_LIST, "D DATA APP");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_FORM, 4, 124, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_FORM, 128);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_DDATAAPP, MyGlb.PANEL_FORM, "D DATA APP");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_DDATAAPP, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_DDATAAPP, PPQRY_DEL6, "A.D_DATA_APP", "D_DATA_APP", 6, 19, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, MyGlb.PANEL_LIST, 440, 0, 152, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, MyGlb.PANEL_LIST, 0);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, MyGlb.PANEL_LIST, 2);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, MyGlb.PANEL_FORM, 8, 12, 116, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, MyGlb.PANEL_FORM, 0);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_APPROVALABEL, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_APPROVALABEL, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_APPROVALABEL, -1, "", "APPROVALABEL", 0, 0, 0, -13997);
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, 592, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, 60);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_LIST, "Esecutività");
    PAN_DELIBERE.SetRect(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, 4, 172, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DELIBERE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, 60);
    PAN_DELIBERE.SetNumRow(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, 1);
    PAN_DELIBERE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DELIBERE_ESECUTIVITA, MyGlb.PANEL_FORM, "Esecut.");
    PAN_DELIBERE.SetFieldPage(PFL_DELIBERE_ESECUTIVITA, -1, -1);
    PAN_DELIBERE.SetFieldPanel(PFL_DELIBERE_ESECUTIVITA, PPQRY_DEL6, "A.TIPO_ESEC", "TIPO_ESEC", 1, 2, 0, -13997);
  }

  private void PAN_DELIBERE_InitQueries()
  {
    StringBuffer SQL;

    PAN_DELIBERE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T10CODICE, ");
    SQL.append("  A.DESCRIZIONE as T10DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    SQL.append("where (A.CODICE = ~~TIPO_ESEC~~) ");
    PAN_DELIBERE.SetQuery(PPQRY_T10, 0, SQL, PFL_DELIBERE_ESECUTIVITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T10CODICE, ");
    SQL.append("  A.DESCRIZIONE as T10DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T10 A ");
    PAN_DELIBERE.SetQuery(PPQRY_T10, 1, SQL, PFL_DELIBERE_ESECUTIVITA, "");
    PAN_DELIBERE.SetQueryDB(PPQRY_T10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DELIBERE.SetIMDB(IMDB, "PQRY_DEL6", true);
    PAN_DELIBERE.set_SetString(MyGlb.MASTER_ROWNAME, "DEL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DEL as ANNO_DEL, ");
    SQL.append("  A.NUMERO_DEL as NUMERO_DEL, ");
    SQL.append("  A.SEDE_DEL as SEDE_DEL, ");
    SQL.append("  A.D_DATA_DEL as D_DATA_DEL, ");
    SQL.append("  A.DESCRIZIONE as DELDESCRIZIO, ");
    SQL.append("  A.TIPO_ESEC as TIPO_ESEC, ");
    SQL.append("  A.NUMERO_APP as NUMERO_APP, ");
    SQL.append("  A.D_DATA_APP as D_DATA_APP ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DEL A ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((A.NUMERO_DEL BETWEEN NVL(~~PQRY_PARAMETRI445.PARNUMDELDAL~~, 0) AND NVL(~~PQRY_PARAMETRI445.PARANUMDELAL~~, 99999))) ");
    SQL.append("and   ((A.D_DATA_DEL BETWEEN DECODE(~~PQRY_PARAMETRI445.PARDATDELDAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMETRI445.PARDATDELDAL~~) AND DECODE(~~PQRY_PARAMETRI445.PARADATDELAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~PQRY_PARAMETRI445.PARADATDELAL~~))) ");
    SQL.append("and   (A.SEDE_DEL = NVL(~~PQRY_PARAMETRI445.PARAMSEDE~~, A.SEDE_DEL)) ");
    SQL.append("and   (A.ANNO_DEL = NVL(~~PQRY_PARAMETRI445.PARAMANNO~~, A.ANNO_DEL)) ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERE.SetQuery(PPQRY_DEL6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DELIBERE.SetQuery(PPQRY_DEL6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_DEL, ");
    SQL.append("  A.SEDE_DEL, ");
    SQL.append("  A.NUMERO_DEL, ");
    SQL.append("  A.D_DATA_DEL ");
    PAN_DELIBERE.SetQuery(PPQRY_DEL6, 5, SQL, -1, "");
    PAN_DELIBERE.SetQueryDB(PPQRY_DEL6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DELIBERE.SetMasterTable(0, "DEL");
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_ANNODEL, true);
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_SEDEDEL, true);
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_NUMERODEL, true);
    PAN_DELIBERE.AddToSortList(PFL_DELIBERE_DATA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DELIBERE.Status() == 2)
    {
      int oldListQBE = PAN_DELIBERE.iUseListQBE;
      PAN_DELIBERE.iUseListQBE = 0;
      PAN_DELIBERE.PanelCommand(Glb.PCM_SEARCH);
      PAN_DELIBERE.PanelCommand(Glb.PCM_FIND);
      PAN_DELIBERE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DELIBERE) PAN_DELIBERE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
