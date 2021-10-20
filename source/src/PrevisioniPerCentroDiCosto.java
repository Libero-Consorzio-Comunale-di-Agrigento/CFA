// **********************************************
// Previsioni Per Centro Di Costo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerCentroDiCosto extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVIPERSERV_PARTE = 0;

  private static int PFL_PREVIPERSERV_PARTE = 0;
  private static int PFL_PREVIPERSERV_PARTELABELDX = 1;
  private static int PFL_PREVIPERSERV_TITOLO = 2;
  private static int PFL_PREVIPERSERV_CENTRDICOSTO = 3;
  private static int PFL_PREVIPERSERV_DABILANSIMUL = 4;
  private static int PFL_PREVIPERSERV_DETTAGCAPITO = 5;
  private static int PFL_PREVIPERSERV_DESCRIINTERV = 6;
  private static int PFL_PREVIPERSERV_TOTALPERTITO = 7;
  private static int PFL_PREVIPERSERV_VARIAZIONI = 8;
  private static int PFL_PREVIPERSERV_PREVANNINCOR = 9;
  private static int PFL_PREVIPERSERV_ELABORA = 10;

  private static int PPQRY_PARAMETRI357 = 0;

  private static int PPQRY_TITOLI = 1;
  private static int PPQRY_CENCOS = 2;


  IDPanel PAN_PREVIPERSERV;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI358(IMDB);
    //
    //
    Init_PQRY_PARAMETRI357(IMDB);
    Init_PQRY_PARAMETRI357_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI358(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI358, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI358, "TBL_PARAMETRI358");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAMTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARACENDICOS, "PARACENDICOS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARACENDICOS,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAPREVEURO, "PARAPREVEURO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI358,IMDBDef3.FLD_PARAMETRI358_PARAPREVEURO,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI358, 0);
  }

  private static void Init_PQRY_PARAMETRI357(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI357, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI357, "PQRY_PARAMETRI357");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARAMTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARACENDICOS, "PARACENDICOS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARACENDICOS,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357,IMDBDef12.PQSL_PARAMETRI357_PARPREANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI357, 0);
  }

  private static void Init_PQRY_PARAMETRI357_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI357_RS, 9);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI357_RS, "PQRY_PARAMETRI357_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARAMTITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARACENDICOS, "PARACENDICOS");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARACENDICOS,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARADABILSIM, "PARADABILSIM");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARADABILSIM,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARADETTCAPI, "PARADETTCAPI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARADETTCAPI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARADESCINTE, "PARADESCINTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARADESCINTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARTOTPERTIT, "PARTOTPERTIT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARTOTPERTIT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI357_RS,IMDBDef12.PQSL_PARAMETRI357_PARPREANINCO,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerCentroDiCosto(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerCentroDiCosto()
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
    FormIdx = MyGlb.FRM_PREPERCEDICO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "86544E7F-1C87-48E8-AAD4-644E7AA83796";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 468;
    DesignHeight = 310;
    set_Caption(new IDVariant("Previsioni Per Centro Di Costo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 468;
    Frames[1].Height = 284;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per Servizio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 284;
    PAN_PREVIPERSERV = new IDPanel(w, this, 1, "PAN_PREVIPERSERV");
    Frames[1].Content = PAN_PREVIPERSERV;
    PAN_PREVIPERSERV.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVIPERSERV.VS = MainFrm.VisualStyleList;
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 468-MyGlb.PAN_OFFS_X, 284-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "610440B0-4AAB-45EE-ACE3-93B9C62C6E92");
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI358, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREPERCEDICO_PARAMETRI357();
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
    return (obj instanceof PrevisioniPerCentroDiCosto);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerCentroDiCosto.class.getName() : (Glb.ClassWithPackage(PrevisioniPerCentroDiCosto.class) ? PrevisioniPerCentroDiCosto.class.getName().substring(PrevisioniPerCentroDiCosto.class.getPackage().getName().length() + 1) : PrevisioniPerCentroDiCosto.class.getName()));
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
    IDVariant v_DBILPREVICDC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DBILPREVICDC = (new IDVariant("d_bil_previsioni_cdc", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARADABILSIM, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARAMVARIAZI, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARPREANINCO, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARADETTCAPI, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARAMTITOLO, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARACENDICOS, 0),(new IDVariant(" "))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARADESCINTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARTOTPERTIT, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAPREVEURO, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DBILPREVICDC);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerCentroDiCosto", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAMPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARADABILSIM, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARADETTCAPI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARADESCINTE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARTOTPERTIT, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAMVARIAZI, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARPREANINCO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAPREVEURO, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAMTITOLO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARACENDICOS, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerCentroDiCosto", "LoadEvent", _e);
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
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE, 0).equals((new IDVariant("ES")), true))
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERSERV.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARADETTCAPI, 0).equals((new IDVariant("SI")), true) && IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
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
      MainFrm.ErrObj.ProcError ("PrevisioniPerCentroDiCosto", "PrevisioniPerServizioOnDynamicPropertiesEvent", _e);
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
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARAMPARTE, 0).equals((new IDVariant("ES")), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI357, IMDBDef12.PQSL_PARAMETRI357_PARAMTITOLO, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerCentroDiCosto", "PrevisioniPerServizioOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void PREPERCEDICO_PARAMETRI357() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI357_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI358, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI358, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI357_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI357_RS, 0, IMDBDef3.TBL_PARAMETRI358, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 0, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAMPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 1, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAMTITOLO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 2, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARACENDICOS, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 3, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARADABILSIM, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 4, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARADETTCAPI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 5, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARADESCINTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 6, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARTOTPERTIT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 7, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARAMVARIAZI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI357_RS, 8, 0, IMDBDef3.TBL_PARAMETRI358, IMDBDef3.FLD_PARAMETRI358_PARPREANINCO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI358, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI358, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI358, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI357_RS, 0);
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
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "CBFE28EC-DF04-4CE5-B6A3-A14A442EA668");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "Parte");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 8, 7, 424, 49, 0, 0);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0, 31);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 1, 13);
    PAN_PREVIPERSERV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0, 4);
    PAN_PREVIPERSERV.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 1, 4);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVIPERSERV_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVIPERSERV.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "5A8478A8-3E0E-4B5E-8E0C-3F615D81741E");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "Parte");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, "0E48DB9F-A451-4C75-8F63-25EEDE38356B");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, "B09451EA-97F2-465E-BDFD-91E5502DD87C");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, "Titolo");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, "22ADC56A-127B-460E-9B15-6C8239FAE382");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, "Centro di Costo");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "167B9DF2-11C3-4A6D-A68F-A09C45E3FCFB");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "DD1315F6-A605-4CDD-AA36-0475DF94BBB4");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "4F4515D9-9508-4BDD-B3B2-5FE89A5EFD6F");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "Descrizioni Intervernto");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "D8ABB845-E0BF-416E-8273-15A329A7B099");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "258A212A-7A88-4A8E-8F92-F9A28A7878DF");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "Variazioni");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "70821996-EBC9-4D03-8B17-1D595DCCE0F3");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREVIPERSERV.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, "");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERSERV.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, "D4D19231-7B2F-4D8C-8FF4-57AEA63B4F6A");
    PAN_PREVIPERSERV.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, "Elabora");
    PAN_PREVIPERSERV.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVIPERSERV.SetImage(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, 0, "button1.gif", false);
    PAN_PREVIPERSERV.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PREVIPERSERV_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 136, 32, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PARTE, -1, GRP_PREVIPERSERV_PARTE);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PARTE, PPQRY_PARAMETRI357, "A.PARAMPARTE", "PARAMPARTE", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_LIST, 40, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_FORM, 12, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PARTELABELDX, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PARTELABELDX, -1, GRP_PREVIPERSERV_PARTE);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PARTELABELDX, -1, "", "PARTELABELDX", 0, 0, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, 72, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, 16, 64, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, 84);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_TITOLO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_TITOLO, PPQRY_PARAMETRI357, "A.PARAMTITOLO", "PARAMTITOLO", 1, 2, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_LIST, 128, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_LIST, 48);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_LIST, "Centro di Costo");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_FORM, 4, 88, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_FORM, 96);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_CENTRDICOSTO, MyGlb.PANEL_FORM, "Centro di Costo");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_CENTRDICOSTO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_CENTRDICOSTO, PPQRY_PARAMETRI357, "A.PARACENDICOS", "PARACENDICOS", 5, 8, 0, -13997);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 4, 120, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DABILANSIMUL, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DABILANSIMUL, PPQRY_PARAMETRI357, "A.PARADABILSIM", "PARADABILSIM", 5, 1, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DABILANSIMUL, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DABILANSIMUL, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 312, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 4, 144, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DETTAGCAPITO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DETTAGCAPITO, PPQRY_PARAMETRI357, "A.PARADETTCAPI", "PARADETTCAPI", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Inter.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 244, 144, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 152);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizioni Intervernto");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_DESCRIINTERV, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_DESCRIINTERV, PPQRY_PARAMETRI357, "A.PARADESCINTE", "PARADESCINTE", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 4, 168, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_TOTALPERTITO, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_TOTALPERTITO, PPQRY_PARAMETRI357, "A.PARTOTPERTIT", "PARTOTPERTIT", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 432, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 4, 192, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_VARIAZIONI, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_VARIAZIONI, PPQRY_PARAMETRI357, "A.PARAMVARIAZI", "PARAMVARIAZI", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 244, 192, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 152);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERSERV.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREVIPERSERV.SetFieldPage(PFL_PREVIPERSERV_PREVANNINCOR, -1, -1);
    PAN_PREVIPERSERV.SetFieldPanel(PFL_PREVIPERSERV_PREVANNINCOR, PPQRY_PARAMETRI357, "A.PARPREANINCO", "PARPREANINCO", 5, 2, 0, -13997);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERSERV.SetValueListItem(PFL_PREVIPERSERV_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 248, 244, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERSERV.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERSERV.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERSERV.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERSERV_ELABORA, MyGlb.PANEL_FORM, 344, 228, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~PARAMTITOLO~~) ");
    SQL.append("and   (A.E_S = ~~PARAMPARTE~~ OR ~~PARAMPARTE~~ = 'ES') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_TITOLI, 0, SQL, PFL_PREVIPERSERV_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = ~~PARAMPARTE~~ OR ~~PARAMPARTE~~ = 'ES') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_TITOLI, 1, SQL, PFL_PREVIPERSERV_TITOLO, "");
    PAN_PREVIPERSERV.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CENTRO_COSTO as CENCCENTCOST, ");
    SQL.append("  TO_CHAR ( A.CENTRO_COSTO ) || ' - ' || A.DESCRIZIONE as CENCOSDESCRI ");
    SQL.append("from ");
    SQL.append("  CENCOS A ");
    SQL.append("where (A.CENTRO_COSTO = ~~PARACENDICOS~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARACENDICOS~~ = NULL) ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_CENCOS, 0, SQL, PFL_PREVIPERSERV_CENTRDICOSTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CENTRO_COSTO as CENCCENTCOST, ");
    SQL.append("  TO_CHAR ( A.CENTRO_COSTO ) || ' - ' || A.DESCRIZIONE as CENCOSDESCRI ");
    SQL.append("from ");
    SQL.append("  CENCOS A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERSERV.SetQuery(PPQRY_CENCOS, 1, SQL, PFL_PREVIPERSERV_CENTRDICOSTO, "");
    PAN_PREVIPERSERV.SetQueryDB(PPQRY_CENCOS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVIPERSERV.SetIMDB(IMDB, "PQRY_PARAMETRI357", true);
    PAN_PREVIPERSERV.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PREVIPERSERV.SetQueryIMDB(PPQRY_PARAMETRI357, IMDBDef12.PQRY_PARAMETRI357_RS, IMDBDef3.TBL_PARAMETRI358);
    JustLoaded = true;
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_PARTE, IMDBDef3.FLD_PARAMETRI358_PARAMPARTE);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_TITOLO, IMDBDef3.FLD_PARAMETRI358_PARAMTITOLO);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_CENTRDICOSTO, IMDBDef3.FLD_PARAMETRI358_PARACENDICOS);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DABILANSIMUL, IMDBDef3.FLD_PARAMETRI358_PARADABILSIM);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DETTAGCAPITO, IMDBDef3.FLD_PARAMETRI358_PARADETTCAPI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_DESCRIINTERV, IMDBDef3.FLD_PARAMETRI358_PARADESCINTE);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_TOTALPERTITO, IMDBDef3.FLD_PARAMETRI358_PARTOTPERTIT);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_VARIAZIONI, IMDBDef3.FLD_PARAMETRI358_PARAMVARIAZI);
    PAN_PREVIPERSERV.SetFieldPrimaryIndex(PFL_PREVIPERSERV_PREVANNINCOR, IMDBDef3.FLD_PARAMETRI358_PARPREANINCO);
    PAN_PREVIPERSERV.SetMasterTable(0, "PARAMETRI358");
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
