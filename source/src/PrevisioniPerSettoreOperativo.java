// **********************************************
// Previsioni Per Settore Operativo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerSettoreOperativo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVIPERSERV_PARTE = 0;

  private static int PFL_PREVIPERSERV_SETTORE = 0;
  private static int PFL_PREVIPERSERV_SERVIZIO = 1;
  private static int PFL_PREVIPERSERV_DABILANSIMUL = 2;
  private static int PFL_PREVIPERSERV_DETTAGCAPITO = 3;
  private static int PFL_PREVIPERSERV_DESCRIINTERV = 4;
  private static int PFL_PREVIPERSERV_TOTALPERTITO = 5;
  private static int PFL_PREVIPERSERV_VARIAZIONI = 6;
  private static int PFL_PREVIPERSERV_PREVANNINCOR = 7;
  private static int PFL_PREVIPERSERV_PARTE = 8;
  private static int PFL_PREVIPERSERV_PARTELABELDX = 9;
  private static int PFL_PREVIPERSERV_ELABORA = 10;

  private static int PPQRY_PAR7 = 0;

  private static int PPQRY_SETTOROPERAT = 1;
  private static int PPQRY_SERVIZOPERAT = 2;


  IDPanel PAN_PREVIPERSERV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI356(IMDB);
    Init_TBL_PARAMETRIO17(IMDB);
    //
    //
    Init_PQRY_PAR7(IMDB);
    Init_PQRY_PAR7_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI356(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI356, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI356, "TBL_PARAMETRI356");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMSETTORE, "PARAMSETTORE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMSETTORE,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMSERVIZI, "PARAMSERVIZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMSERVIZI,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAPREVEURO, "PARAPREVEURO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI356,IMDBDef3.FLD_PARAMETRI356_PARAPREVEURO,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI356, 0);
  }

  private static void Init_TBL_PARAMETRIO17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRIO17, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRIO17, "TBL_PARAMETRIO17");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRIO17,IMDBDef3.FLD_PARAMETRIO17_PARAMSETTOLD, "PARAMSETTOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRIO17,IMDBDef3.FLD_PARAMETRIO17_PARAMSETTOLD,1,6,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRIO17, 0);
  }

  private static void Init_PQRY_PAR7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR7, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR7, "PQRY_PAR7");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMSETTORE, "PARAMSETTORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMSETTORE,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMSERVIZI, "PARAMSERVIZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMSERVIZI,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7,IMDBDef12.PQSL_PAR7_PARPREANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR7, 0);
  }

  private static void Init_PQRY_PAR7_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR7_RS, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR7_RS, "PQRY_PAR7_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMSETTORE, "PARAMSETTORE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMSETTORE,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMSERVIZI, "PARAMSERVIZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMSERVIZI,1,6,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR7_RS,IMDBDef12.PQSL_PAR7_PARPREANINCO,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerSettoreOperativo(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerSettoreOperativo()
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
    FormIdx = MyGlb.FRM_PREPERSETOPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DB0840AA-FB87-4FDD-8090-BFB26CF1FB7A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 472;
    DesignHeight = 326;
    set_Caption(new IDVariant("Previsioni Per Settore Operativo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 472;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per Servizio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_PREVIPERSERV = new IDPanel(w, this, 1, "PAN_PREVIPERSERV");
    Frames[1].Content = PAN_PREVIPERSERV;
    PAN_PREVIPERSERV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVIPERSERV.VS = MainFrm.VisualStyleList;
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 472-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "27CF62F2-9814-4B5F-B33B-991484E17D06");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 488, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVIPERSERV.InitStatus = 2;
    PAN_PREVIPERSERV_Init();
    PAN_PREVIPERSERV_InitFields();
    PAN_PREVIPERSERV_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI356, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREPERSETOPE_PAR7();
      }
      PAN_PREVIPERSERV.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniPerSettoreOperativo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerSettoreOperativo.class.getName() : (Glb.ClassWithPackage(PrevisioniPerSettoreOperativo.class) ? PrevisioniPerSettoreOperativo.class.getName().substring(PrevisioniPerSettoreOperativo.class.getPackage().getName().length() + 1) : PrevisioniPerSettoreOperativo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DBILPREVSETT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DBILPREVSETT = (new IDVariant("d_bil_previsioni_sett", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARADABILSIM, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMVARIAZI, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARPREANINCO, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARADETTCAPI, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMSETTORE, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMSERVIZI, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARADESCINTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARTOTPERTIT, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAPREVEURO, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DBILPREVSETT);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerSettoreOperativo", "Elabora", _e);
      return -1;
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARADABILSIM, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARADETTCAPI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARADESCINTE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARTOTPERTIT, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMVARIAZI, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARPREANINCO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMSETTORE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO17, IMDBDef3.FLD_PARAMETRIO17_PARAMSETTOLD, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMSERVIZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAPREVEURO, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerSettoreOperativo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Servizio On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVIPERSERV_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVIPERSERV);
      // 
      // Previsioni Per Servizio On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMSETTORE, 0)))
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARADETTCAPI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerSettoreOperativo", "PrevisioniPerServizioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Servizio On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PREVIPERSERV_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Servizio On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PREVIPERSERV_SETTORE)), true))
      {
        if (IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMSETTORE, 0).compareTo(IMDB.Value(IMDBDef3.TBL_PARAMETRIO17, IMDBDef3.FLD_PARAMETRIO17_PARAMSETTOLD, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMSERVIZI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETRIO17, IMDBDef3.FLD_PARAMETRIO17_PARAMSETTOLD, 0, IMDB.Value(IMDBDef12.PQRY_PAR7, IMDBDef12.PQSL_PAR7_PARAMSETTORE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerSettoreOperativo", "PrevisioniPerServizioOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREPERSETOPE_PAR7() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR7_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI356, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI356, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR7_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR7_RS, 0, IMDBDef3.TBL_PARAMETRI356, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 0, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 1, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMSETTORE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 2, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMSERVIZI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 3, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARADABILSIM, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 4, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARADETTCAPI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 5, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARADESCINTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 6, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARTOTPERTIT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 7, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARAMVARIAZI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR7_RS, 8, 0, IMDBDef3.TBL_PARAMETRI356, IMDBDef3.FLD_PARAMETRI356_PARPREANINCO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI356, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI356, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI356, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR7_RS, 0);
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
  private void PAN_PREVIPERSERV_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVIPERSERV, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVIPERSERV_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVIPERSERV, Cancel);
    // Stub
  }

  private void PAN_PREVIPERSERV_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVIPERSERV_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVIPERSERV.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVIPERSERV_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREVIPERSERV_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREVIPERSERV_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVIPERSERV_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVIPERSERV_Init()
  {

    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "4E3C4281-FACF-40DF-B093-54F1712C5D10");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "Parte");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 8, 7, 412, 49, 0, 0);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0, 31);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 1, 13);
    PAN_PREVIPERSERV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0, 4);
    PAN_PREVIPERSERV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 1, 4);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, "0A97DBAF-E708-4AB1-90F0-9C7F8B4329B7");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, "Settore");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, "0DEA5B9C-4B4C-49B8-A7CF-C4ECE59FC144");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, "Servizio");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "A8AF5302-F17E-4D8E-8D08-3D8157D04746");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "50FE30B2-C8FC-4593-9B1A-A9085C32A547");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "2D65E634-17FF-46F3-869A-F670260FCE08");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "Descrizioni Intervernto");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "998241A5-9FFD-4FE3-9B66-70F4828B89A6");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "18E6E277-ECEB-42AC-A14D-DD0D373D7D47");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "Variazioni");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "70002312-A679-4905-A106-63D27F21BC78");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "7AA52F53-1B8B-4124-9622-42666C49A051");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "Parte");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, "A8F3F535-AC5C-4DAB-966E-D7FD5720CD19");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, "4F07C8E5-5046-4BC6-B6B1-9F4CFA6D6DFF");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, "Elabora");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVIPERSERV.SetImage(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, 0, "button1.gif", false);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PREVIPERSERV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_LIST, 72, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_LIST, "Settore");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_FORM, 4, 64, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_FORM, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SETTORE, MyGlb.PANEL_FORM, "Settore");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_SETTORE, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_SETTORE, PPQRY_PAR7, "A.PARAMSETTORE", "PARAMSETTORE", 1, 6, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, 200, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, 48);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, 4, 88, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_SERVIZIO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_SERVIZIO, PPQRY_PAR7, "A.PARAMSERVIZI", "PARAMSERVIZI", 1, 6, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 4, 116, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DABILANSIMUL, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DABILANSIMUL, PPQRY_PAR7, "A.PARADABILSIM", "PARADABILSIM", 5, 1, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DABILANSIMUL, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DABILANSIMUL, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 312, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 4, 140, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DETTAGCAPITO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DETTAGCAPITO, PPQRY_PAR7, "A.PARADETTCAPI", "PARADETTCAPI", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Inter.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 244, 140, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 152);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizioni Intervernto");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DESCRIINTERV, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DESCRIINTERV, PPQRY_PAR7, "A.PARADESCINTE", "PARADESCINTE", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 4, 164, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_TOTALPERTITO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_TOTALPERTITO, PPQRY_PAR7, "A.PARTOTPERTIT", "PARTOTPERTIT", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 432, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 4, 188, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_VARIAZIONI, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_VARIAZIONI, PPQRY_PAR7, "A.PARAMVARIAZI", "PARAMVARIAZI", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 244, 188, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 152);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PREVANNINCOR, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PREVANNINCOR, PPQRY_PAR7, "A.PARPREANINCO", "PARPREANINCO", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 136, 32, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PARTE, -1, GRP_PREVIPERSERV_PARTE);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PARTE, PPQRY_PAR7, "A.PARAMPARTE", "PARAMPARTE", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_LIST, 8, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_FORM, 12, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PARTELABELDX, -1, GRP_PREVIPERSERV_PARTE);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PARTELABELDX, -1, "", "PARTELABELDX", 0, 0, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 248, 244, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_FORM, 336, 232, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_ELABORA, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PREVIPERSERV_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SETTORE as OPESETSETTOR, ");
    SQL.append("  TO_CHAR ( A.SETTORE ) || ' - ' || A.DESCRIZIONE as OPESETDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESET A ");
    SQL.append("where (A.SETTORE = ~~PARAMSETTORE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMSETTORE~~ = to_number(NULL)) ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_SETTOROPERAT, 0, SQL, PFL_PREVIPERSERV_SETTORE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SETTORE as OPESETSETTOR, ");
    SQL.append("  TO_CHAR ( A.SETTORE ) || ' - ' || A.DESCRIZIONE as OPESETDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESET A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_SETTOROPERAT, 1, SQL, PFL_PREVIPERSERV_SETTORE, "");
    PAN_PREVIPERSERV.SetQueryDB(PPQRY_SETTOROPERAT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as OPESERSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as OPESERDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESER A ");
    SQL.append("where (A.SERVIZIO = ~~PARAMSERVIZI~~) ");
    SQL.append("and   (A.SETTORE = ~~PARAMSETTORE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMSERVIZI~~ = to_number(NULL)) ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_SERVIZOPERAT, 0, SQL, PFL_PREVIPERSERV_SERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as OPESERSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as OPESERDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESER A ");
    SQL.append("where (A.SETTORE = ~~PARAMSETTORE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_SERVIZOPERAT, 1, SQL, PFL_PREVIPERSERV_SERVIZIO, "");
    PAN_PREVIPERSERV.SetQueryDB(PPQRY_SERVIZOPERAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVIPERSERV.SetIMDB(IMDB, "PQRY_PAR7", true);
    PAN_PREVIPERSERV.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PREVIPERSERV.SetQueryIMDB(PPQRY_PAR7, IMDBDef12.PQRY_PAR7_RS, IMDBDef3.TBL_PARAMETRI356);
    JustLoaded = true;
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_SETTORE, IMDBDef3.FLD_PARAMETRI356_PARAMSETTORE);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_SERVIZIO, IMDBDef3.FLD_PARAMETRI356_PARAMSERVIZI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DABILANSIMUL, IMDBDef3.FLD_PARAMETRI356_PARADABILSIM);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DETTAGCAPITO, IMDBDef3.FLD_PARAMETRI356_PARADETTCAPI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DESCRIINTERV, IMDBDef3.FLD_PARAMETRI356_PARADESCINTE);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_TOTALPERTITO, IMDBDef3.FLD_PARAMETRI356_PARTOTPERTIT);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_VARIAZIONI, IMDBDef3.FLD_PARAMETRI356_PARAMVARIAZI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_PREVANNINCOR, IMDBDef3.FLD_PARAMETRI356_PARPREANINCO);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_PARTE, IMDBDef3.FLD_PARAMETRI356_PARAMPARTE);
    PAN_PREVIPERSERV.SetMasterTable(0, "PARAMETRI356");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVIPERSERV.Status() == 2)
    {
      int oldListQBE = PAN_PREVIPERSERV.iUseListQBE;
      PAN_PREVIPERSERV.iUseListQBE = 0;
      PAN_PREVIPERSERV.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVIPERSERV.PanelCommand(Glb.PCM_FIND);
      PAN_PREVIPERSERV.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVIPERSERV) PAN_PREVIPERSERV_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
