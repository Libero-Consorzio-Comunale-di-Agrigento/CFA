// **********************************************
// Risultato Amm Ne Presunto
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RisultatoAmmNePresunto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_DATA = 0;
  private static int PFL_PARAM_ENPRPEIRPDE2 = 1;
  private static int PFL_PARAM_UPPIRPDE2ANF = 2;
  private static int PFL_PARAM_VDRAPPIRPDE2 = 3;
  private static int PFL_PARAM_VDRPPPIRPDE2 = 4;
  private static int PFL_PARAM_FOPLVIDEES20 = 5;
  private static int PFL_PARAM_DICUAVPRDAFS = 6;
  private static int PFL_PARAM_PARVINASPECO = 7;
  private static int PFL_PARAM_PARVIASPDIIN = 8;
  private static int PFL_PARAM_PARDISASPECO = 9;
  private static int PFL_PARAM_PARDIASPDIIN = 10;
  private static int PFL_PARAM_PADICUNOSPLU = 11;
  private static int PFL_PARAM_ETICUTILAVAN = 12;
  private static int PFL_PARAM_ETICHEELABOR = 13;

  private static int PPQRY_PARAM21 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM46(IMDB);
    //
    //
    Init_PQRY_PARAM21(IMDB);
    Init_PQRY_PARAM21_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM46(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM46, 13);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM46, "TBL_PARAM46");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGEDATA,6,18,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGDATOLD, "NOMOGGDATOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGDATOLD,6,18,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGEENTR, "NOMEOGGEENTR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGEENTR,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGEUSCI, "NOMEOGGEUSCI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGEUSCI,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGVAREAT, "NOMOGGVAREAT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGVAREAT,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGVAREPA, "NOMOGGVAREPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGVAREPA,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGETFPV, "NOMEOGGETFPV");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMEOGGETFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGAVAFSC, "NOMOGGAVAFSC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGAVAFSC,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPAVICO, "NOMOGGPAVICO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPAVICO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPAVIIN, "NOMOGGPAVIIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPAVIIN,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPADICO, "NOMOGGPADICO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPADICO,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPADIIN, "NOMOGGPADIIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPADIIN,3,14,2);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPANOUT, "NOMOGGPANOUT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM46,IMDBDef3.FLD_PARAM46_NOMOGGPANOUT,3,14,2);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM46, 0);
  }

  private static void Init_PQRY_PARAM21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM21, 12);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM21, "PQRY_PARAM21");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGEDATA,6,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGEENTR, "NOMEOGGEENTR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGEENTR,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGEUSCI, "NOMEOGGEUSCI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGEUSCI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGVAREAT, "NOMOGGVAREAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGVAREAT,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGVAREPA, "NOMOGGVAREPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGVAREPA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGETFPV, "NOMEOGGETFPV");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMEOGGETFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGAVAFSC, "NOMOGGAVAFSC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGAVAFSC,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPAVICO, "NOMOGGPAVICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPAVICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPAVIIN, "NOMOGGPAVIIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPAVIIN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPADICO, "NOMOGGPADICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPADICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPADIIN, "NOMOGGPADIIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPADIIN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPANOUT, "NOMOGGPANOUT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21,IMDBDef11.PQSL_PARAM21_NOMOGGPANOUT,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAM21, 0);
  }

  private static void Init_PQRY_PARAM21_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM21_RS, 12);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM21_RS, "PQRY_PARAM21_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGEDATA, "NOMEOGGEDATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGEDATA,6,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGEENTR, "NOMEOGGEENTR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGEENTR,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGEUSCI, "NOMEOGGEUSCI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGEUSCI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGVAREAT, "NOMOGGVAREAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGVAREAT,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGVAREPA, "NOMOGGVAREPA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGVAREPA,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGETFPV, "NOMEOGGETFPV");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMEOGGETFPV,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGAVAFSC, "NOMOGGAVAFSC");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGAVAFSC,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPAVICO, "NOMOGGPAVICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPAVICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPAVIIN, "NOMOGGPAVIIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPAVIIN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPADICO, "NOMOGGPADICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPADICO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPADIIN, "NOMOGGPADIIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPADIIN,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPANOUT, "NOMOGGPANOUT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM21_RS,IMDBDef11.PQSL_PARAM21_NOMOGGPANOUT,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RisultatoAmmNePresunto(MyWebEntryPoint w, IMDBObj imdb)
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
  public RisultatoAmmNePresunto()
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
    FormIdx = MyGlb.FRM_RISUAMMNEPRE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A2660737-008D-4AE6-9B53-8C1336BD3D90";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 732;
    DesignHeight = 526;
    set_Caption(new IDVariant("Risultato Amm Ne Presunto"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
    Frames[1].Height = 500;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 500;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 500-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D6E14737-E465-4240-A27F-4B88D749C4F6");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 912, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM46, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RISUAMMNEPRE_PARAM21();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof RisultatoAmmNePresunto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RisultatoAmmNePresunto.class.getName() : (Glb.ClassWithPackage(RisultatoAmmNePresunto.class) ? RisultatoAmmNePresunto.class.getName().substring(RisultatoAmmNePresunto.class.getPackage().getName().length() + 1) : RisultatoAmmNePresunto.class.getName()));
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
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DATA_RIS_AMM_PRESUNTO as ESEDATRIAMP1, ");
      SQL.append("  A.DATA_RIS_AMM_PRESUNTO as ESEDATRIAMPR ");
      SQL.append("from ");
      SQL.append("  ESEFIN A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGEDATA, 0, QV.Get("ESEDATRIAMP1", IDVariant.DATETIME));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGDATOLD, 0, QV.Get("ESEDATRIAMPR", IDVariant.DATETIME));
      }
      QV.Close();
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  BIL_PREV_RIS_PRES A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNT.equals((new IDVariant(0)), true))
      {
        SQL = new StringBuffer();
        SQL.append("insert into BIL_PREV_RIS_PRES ");
        SQL.append("( ");
        SQL.append("  ESERCIZIO, ");
        SQL.append("  ENTRATE, ");
        SQL.append("  USCITE, ");
        SQL.append("  VARIAZIONI_RES_ATTIVI, ");
        SQL.append("  VARIAZIONI_RES_PASSIVI, ");
        SQL.append("  FPV, ");
        SQL.append("  AVANZO_FSC, ");
        SQL.append("  PARTE_VINC_CORRENTE, ");
        SQL.append("  PARTE_VINC_INVESTIMENTI, ");
        SQL.append("  PARTE_DISP_CORRENTE, ");
        SQL.append("  PARTE_DISP_INVESTIMENTI, ");
        SQL.append("  PARTE_NON_UTILIZZATA ");
        SQL.append(") ");
        SQL.append("values ");
        SQL.append("( ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0 ");
        SQL.append(") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ENTRATE as BILPRERIPREN, ");
      SQL.append("  A.USCITE as BILPRERIPRUS, ");
      SQL.append("  A.VARIAZIONI_RES_ATTIVI as BIPRRIPRVARA, ");
      SQL.append("  A.VARIAZIONI_RES_PASSIVI as BIPRRIPRVARP, ");
      SQL.append("  A.FPV as BILPRERIPRFP, ");
      SQL.append("  A.AVANZO_FSC as BIPRRIPRAVFS, ");
      SQL.append("  A.PARTE_VINC_CORRENTE as BIPRRIPRPAVC, ");
      SQL.append("  A.PARTE_VINC_INVESTIMENTI as BIPRRIPRPAVI, ");
      SQL.append("  A.PARTE_DISP_CORRENTE as BIPRRIPRPADC, ");
      SQL.append("  A.PARTE_DISP_INVESTIMENTI as BIPRRIPRPADI, ");
      SQL.append("  A.PARTE_NON_UTILIZZATA as BIPRRIPRPANU ");
      SQL.append("from ");
      SQL.append("  BIL_PREV_RIS_PRES A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGEENTR, 0, QV.Get("BILPRERIPREN", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGEUSCI, 0, QV.Get("BILPRERIPRUS", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGVAREAT, 0, QV.Get("BIPRRIPRVARA", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGVAREPA, 0, QV.Get("BIPRRIPRVARP", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGETFPV, 0, QV.Get("BILPRERIPRFP", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGAVAFSC, 0, QV.Get("BIPRRIPRAVFS", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPAVICO, 0, QV.Get("BIPRRIPRPAVC", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPAVIIN, 0, QV.Get("BIPRRIPRPAVI", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPADICO, 0, QV.Get("BIPRRIPRPADC", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPADIIN, 0, QV.Get("BIPRRIPRPADI", IDVariant.DECIMAL));
        IMDB.set_Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPANOUT, 0, QV.Get("BIPRRIPRPANU", IDVariant.DECIMAL));
      }
      QV.Close();
      PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_ENPRPEIRPDE2, IDL.Add((new IDVariant("Entrate presunte per il restante periodo dell'esercizio ")), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_UPPIRPDE2ANF, IDL.Add(IDL.Add((new IDVariant("Uscite presunte per il restante periodo dell'esercizio ")), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))), (new IDVariant(" (al netto FSC)"))).stringValue());
      PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_VDRAPPIRPDE2, IDL.Add((new IDVariant("Variazioni dei residui attivi, presunte per il restante periodo dell'esercizio ")), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_VDRPPPIRPDE2, IDL.Add((new IDVariant("Variazioni dei residui passivi, presunte per il restante periodo dell'esercizio ")), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      PAN_PARAM.set_Header(Glb.OBJ_FIELD,PFL_PARAM_FOPLVIDEES20, IDL.Add((new IDVariant("Fondo pluriennale vincolato dell'esercizio ")), IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
      set_Caption((new IDVariant("Risultato Amm.ne Presunto")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoAmmNePresunto", "Load", _e);
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
      try
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMEOGGEDATA, 0).compareTo(IMDB.Value(IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGDATOLD, 0), true)!=0)
        {
          SQL = new StringBuffer();
          SQL.append("update ESEFIN set ");
          SQL.append("  DATA_RIS_AMM_PRESUNTO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMEOGGEDATA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        SQL = new StringBuffer();
        SQL.append("update BIL_PREV_RIS_PRES set ");
        SQL.append("  ENTRATE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMEOGGEENTR, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  USCITE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMEOGGEUSCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  VARIAZIONI_RES_ATTIVI = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGVAREAT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  VARIAZIONI_RES_PASSIVI = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGVAREPA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  FPV = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMEOGGETFPV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  AVANZO_FSC = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGAVAFSC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  PARTE_VINC_CORRENTE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGPAVICO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  PARTE_VINC_INVESTIMENTI = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGPAVIIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  PARTE_DISP_CORRENTE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGPADICO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  PARTE_DISP_INVESTIMENTI = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGPADIIN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  PARTE_NON_UTILIZZATA = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMOGGPANOUT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
        SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      }
      catch (Exception e4)
      {
        MainFrm.set_AlertMessage(new IDVariant(e4.getMessage())); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKBILPREVRISPRES(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, (new IDVariant()), (new IDVariant()), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), MainFrm.Datetostring(IMDB.Value(IMDBDef11.PQRY_PARAM21, IMDBDef11.PQSL_PARAM21_NOMEOGGEDATA, 0)));
      MainFrm.LanciaStampaJasper((new IDVariant("Ris_Amm_Presunto")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RisultatoAmmNePresunto", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void RISUAMMNEPRE_PARAM21() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAM21_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM46, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM46, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAM21_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAM21_RS, 0, IMDBDef3.TBL_PARAM46, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 0, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGEDATA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 1, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGEENTR, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 2, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGEUSCI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 3, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGVAREAT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 4, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGVAREPA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 5, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMEOGGETFPV, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 6, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGAVAFSC, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 7, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPAVICO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 8, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPAVIIN, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 9, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPADICO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 10, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPADIIN, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM21_RS, 11, 0, IMDBDef3.TBL_PARAM46, IMDBDef3.FLD_PARAM46_NOMOGGPANOUT, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM46, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM46, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM46, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAM21_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // **********************************************************************
  public void IntFormUnload (IDVariant Cancel, IDVariant Confirm)
  {
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, "C4E3E191-C832-40FF-95FF-3ECEC74E75F3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, "Data");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, "DF611920-CF04-45D2-B871-0BCED90121E9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, "Entrate presunte per il restante periodo dell'esercizio 2012");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.VIS_NORFIECFHELE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, "1B4205E6-2617-43B2-9169-B142D55D3AB1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, "Uscite presunte per il restante periodo dell'esercizio 2012 (al netto FSC)");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, "A9E7715C-B26C-4571-97FE-B4E448D42DCC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, "Variazioni dei residui attivi, presunte per il restante periodo dell'esercizio 2012");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, "4A0CB773-9925-479B-9245-386CEB3A0A1B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, "Variazioni dei residui passivi, presunte per il restante periodo dell'esercizio 2012");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, "EC19C440-261E-4CE4-9536-5DD94F413A5E");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, "Fondo pluriennale vincolato dell'esercizio 2012");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, "F8D8D7F8-2B9F-42DD-82B5-3E82AE9BBEFF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, "di cui avanzo presunto da FSC");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, "026E4D0E-9495-4DCB-8AD6-08DBCF890246");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, "Parte vincolata a spesa corrente");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, "4E2AC8BE-4433-4D28-97C4-418E9C0033BF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, "Parte vincolata a spesa di investimenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, "66AC44BD-2829-4B81-AD9F-E4152E0C68AD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, "Parte disponibile a spesa corrente");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, "51044AB5-FF5A-44D7-B13F-ED0DE20072EE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, "Parte disponibile a spesa di investimenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, "814DB82E-490C-4D59-BD7E-AE7423434FAB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, "Parte di cui non si prevede l'utilizzazione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.VIS_NORFIEHEALLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, "1F484A29-019E-40E3-9B98-D685EE95590A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, "Utilizzazione avanzo di amministrazione presunto");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "E50DC5CE-5882-4B4F-B8A5-D5742E476D3C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, 20, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATA, PPQRY_PARAM21, "A.NOMEOGGEDATA", "NOMEOGGEDATA", 6, 18, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_LIST, "E. pr. p. i. rs. pr. d. es. 2.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_FORM, 20, 44, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ENPRPEIRPDE2, MyGlb.PANEL_FORM, "Entrate presunte per il restante periodo dell'esercizio 2012");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ENPRPEIRPDE2, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ENPRPEIRPDE2, PPQRY_PARAM21, "A.NOMEOGGEENTR", "NOMEOGGEENTR", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_LIST, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_LIST, "U. p. p. i. r. p. d. e. 2. a. n. F.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_FORM, 20, 68, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UPPIRPDE2ANF, MyGlb.PANEL_FORM, "Uscite presunte per il restante periodo dell'esercizio 2012 (al netto FSC)");
    PAN_PARAM.SetFieldPage(PFL_PARAM_UPPIRPDE2ANF, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_UPPIRPDE2ANF, PPQRY_PARAM21, "A.NOMEOGGEUSCI", "NOMEOGGEUSCI", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_LIST, 124);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_LIST, "V. d. r. a. p. p. i. r. p. d. e. 2.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_FORM, 20, 108, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VDRAPPIRPDE2, MyGlb.PANEL_FORM, "Variazioni dei residui attivi, presunte per il restante periodo dell'esercizio 2012");
    PAN_PARAM.SetFieldPage(PFL_PARAM_VDRAPPIRPDE2, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_VDRAPPIRPDE2, PPQRY_PARAM21, "A.NOMOGGVAREAT", "NOMOGGVAREAT", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_LIST, 132);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_LIST, "V. d. r. p. p. p. i. r. p. d. e. 2.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_FORM, 20, 132, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VDRPPPIRPDE2, MyGlb.PANEL_FORM, "Variazioni dei residui passivi, presunte per il restante periodo dell'esercizio 2012");
    PAN_PARAM.SetFieldPage(PFL_PARAM_VDRPPPIRPDE2, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_VDRPPPIRPDE2, PPQRY_PARAM21, "A.NOMOGGVAREPA", "NOMOGGVAREPA", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_LIST, 28);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_LIST, "Fn. plr. vnc. dl. esr. 20.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_FORM, 20, 168, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_FOPLVIDEES20, MyGlb.PANEL_FORM, "Fondo pluriennale vincolato dell'esercizio 2012");
    PAN_PARAM.SetFieldPage(PFL_PARAM_FOPLVIDEES20, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_FOPLVIDEES20, PPQRY_PARAM21, "A.NOMEOGGETFPV", "NOMEOGGETFPV", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_LIST, "di cui avn. prs. da FSC");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_FORM, 20, 200, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DICUAVPRDAFS, MyGlb.PANEL_FORM, "di cui avanzo presunto da FSC");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DICUAVPRDAFS, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DICUAVPRDAFS, PPQRY_PARAM21, "A.NOMOGGAVAFSC", "NOMOGGAVAFSC", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_LIST, "Par. vinc. a sp. corr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_FORM, 20, 256, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARVINASPECO, MyGlb.PANEL_FORM, "Parte vincolata a spesa corrente");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARVINASPECO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARVINASPECO, PPQRY_PARAM21, "A.NOMOGGPAVICO", "NOMOGGPAVICO", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_LIST, 144);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_LIST, "Par. vinc. a sp. di inves.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_FORM, 20, 280, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARVIASPDIIN, MyGlb.PANEL_FORM, "Parte vincolata a spesa di investimenti");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARVIASPDIIN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARVIASPDIIN, PPQRY_PARAM21, "A.NOMOGGPAVIIN", "NOMOGGPAVIIN", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_LIST, "Par. dispon. a sp. corr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_FORM, 20, 304, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARDISASPECO, MyGlb.PANEL_FORM, "Parte disponibile a spesa corrente");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARDISASPECO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARDISASPECO, PPQRY_PARAM21, "A.NOMOGGPADICO", "NOMOGGPADICO", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_LIST, 144);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_LIST, "Par. disp. a sp. di inves.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_FORM, 20, 328, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARDIASPDIIN, MyGlb.PANEL_FORM, "Parte disponibile a spesa di investimenti");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARDIASPDIIN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARDIASPDIIN, PPQRY_PARAM21, "A.NOMOGGPADIIN", "NOMOGGPADIIN", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_LIST, "Par. d. c. n. s. prv. l utl.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_FORM, 20, 352, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_FORM, 464);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PADICUNOSPLU, MyGlb.PANEL_FORM, "Parte di cui non si prevede l'utilizzazione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PADICUNOSPLU, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PADICUNOSPLU, PPQRY_PARAM21, "A.NOMOGGPANOUT", "NOMOGGPANOUT", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, MyGlb.PANEL_LIST, 40, 180, 248, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, MyGlb.PANEL_FORM, 20, 236, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICUTILAVAN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICUTILAVAN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICUTILAVAN, -1, "", "ETICUTILAVAN", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 484, 392, 140, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 536, 396, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHEELABOR, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM21", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM21, IMDBDef11.PQRY_PARAM21_RS, IMDBDef3.TBL_PARAM46);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATA, IMDBDef3.FLD_PARAM46_NOMEOGGEDATA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ENPRPEIRPDE2, IMDBDef3.FLD_PARAM46_NOMEOGGEENTR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_UPPIRPDE2ANF, IMDBDef3.FLD_PARAM46_NOMEOGGEUSCI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_VDRAPPIRPDE2, IMDBDef3.FLD_PARAM46_NOMOGGVAREAT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_VDRPPPIRPDE2, IMDBDef3.FLD_PARAM46_NOMOGGVAREPA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_FOPLVIDEES20, IMDBDef3.FLD_PARAM46_NOMEOGGETFPV);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DICUAVPRDAFS, IMDBDef3.FLD_PARAM46_NOMOGGAVAFSC);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARVINASPECO, IMDBDef3.FLD_PARAM46_NOMOGGPAVICO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARVIASPDIIN, IMDBDef3.FLD_PARAM46_NOMOGGPAVIIN);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARDISASPECO, IMDBDef3.FLD_PARAM46_NOMOGGPADICO);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARDIASPDIIN, IMDBDef3.FLD_PARAM46_NOMOGGPADIIN);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PADICUNOSPLU, IMDBDef3.FLD_PARAM46_NOMOGGPANOUT);
    PAN_PARAM.SetMasterTable(0, "PARAM46");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
