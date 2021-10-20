// **********************************************
// Emissione Automatica Mandati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneAutomaticaMandati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DATAEMISSION = 0;
  private static int PFL_PARAMETRI_SOLOCONTANTI = 1;
  private static int PFL_PARAMETRI_SOLCONCODGES = 2;
  private static int PFL_PARAMETRI_SOLOCONTEQUI = 3;
  private static int PFL_PARAMETRI_SOLCONCOTREL = 4;
  private static int PFL_PARAMETRI_SOLOCONTCASS = 5;
  private static int PFL_PARAMETRI_SOLCONQUISCA = 6;
  private static int PFL_PARAMETRI_UFFICIO = 7;
  private static int PFL_PARAMETRI_TIPOSCADENZA = 8;
  private static int PFL_PARAMETRI_ELABORA = 9;
  private static int PFL_PARAMETRI_MANDATACOPER = 10;

  private static int PPQRY_PARAMETRI225 = 0;

  private static int PPQRY_T53 = 1;
  private static int PPQRY_T01 = 2;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI143(IMDB);
    //
    //
    Init_PQRY_PARAMETRI225(IMDB);
    Init_PQRY_PARAMETRI225_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI143(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI143, 10);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI143, "TBL_PARAMETRI143");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCA, "PARAMSCA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCA,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCCG, "PARAMSCCG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCCG,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCE, "PARAMSCE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCE,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARATIPOSCAD, "PARATIPOSCAD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARATIPOSCAD,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCCTE, "PARAMSCCTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMSCCTE,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARSOLCONCAS, "PARSOLCONCAS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARSOLCONCAS,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMANDACOP, "PARAMANDACOP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARAMANDACOP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARSOLCOQUSC, "PARSOLCOQUSC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI143,IMDBDef5.FLD_PARAMETRI143_PARSOLCOQUSC,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI143, 0);
  }

  private static void Init_PQRY_PARAMETRI225(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI225, 10);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI225, "PQRY_PARAMETRI225");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, "PARAMSCA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCA,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, "PARAMSCCG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, "PARAMSCE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCE,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARATIPOSCAD, "PARATIPOSCAD");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARATIPOSCAD,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, "PARAMSCCTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, "PARSOLCONCAS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMANDACOP, "PARAMANDACOP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARAMANDACOP,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, "PARSOLCOQUSC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225,IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI225, 0);
  }

  private static void Init_PQRY_PARAMETRI225_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI225_RS, 10);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI225_RS, "PQRY_PARAMETRI225_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, "PARADATAEMIS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, "PARAMSCA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCA,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, "PARAMSCCG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, "PARAMSCE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCE,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARATIPOSCAD, "PARATIPOSCAD");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARATIPOSCAD,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, "PARAMSCCTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, "PARSOLCONCAS");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMANDACOP, "PARAMANDACOP");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARAMANDACOP,5,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, "PARSOLCOQUSC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI225_RS,IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneAutomaticaMandati(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneAutomaticaMandati()
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
    FormIdx = MyGlb.FRM_EMISAUTOMAND;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8FA13D54-9B85-4426-82F8-2192D6902D32";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 348;
    DesignHeight = 342;
    set_Caption(new IDVariant("Emissione Automatica Mandati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 348;
    Frames[1].Height = 316;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 316;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 348-MyGlb.PAN_OFFS_X, 316-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "AF2440A6-CA8C-42C0-843B-3418045E047C");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 856, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI143, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISAUTOMAND_PARAMETRI225();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneAutomaticaMandati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneAutomaticaMandati.class.getName() : (Glb.ClassWithPackage(EmissioneAutomaticaMandati.class) ? EmissioneAutomaticaMandati.class.getName().substring(EmissioneAutomaticaMandati.class.getPackage().getName().length() + 1) : EmissioneAutomaticaMandati.class.getName()));
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Emissione Automatica Mandati", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARADATAEMIS, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCCG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCCTE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMUFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARATIPOSCAD, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARSOLCONCAS, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARSOLCOQUSC, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMANDACOP, 0, (new IDVariant()));
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.GestioneSiope() && !(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.PROCEDPERSON.equals((new IDVariant(1)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.NullValue(MainFrm.IMPOCONTEQUI,(new IDVariant(0))).compareTo((new IDVariant(0)), true)>0)
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.MANDATCOPERT.equals((new IDVariant("SI")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SOLOCONTANTI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, 0, (new IDVariant("NO")));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SOLCONCODGES)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, 0, (new IDVariant("NO")));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SOLOCONTEQUI)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0, (new IDVariant("NO")));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SOLCONCOTREL)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, 0, (new IDVariant("NO")));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SOLOCONTCASS)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, 0, (new IDVariant("NO")));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_SOLCONQUISCA)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0, (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARAMETRI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0, (new IDVariant("SI")));
      }
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0, (new IDVariant("SI")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "ParametriAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Riempi Elenco Liquidazioni Cgu
  // **********************************************************************
  public int RiempiElencoLiquidazioniCgu ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi Elenco Liquidazioni Cgu Body
      // Procedure Body
      // 
      RIEELELIQCGU_ELELIQCGDERO();
      RIEELELIQCGU_ELELIQCGINRO();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "RiempiElencoLiquidazioniCgu", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco Liquidazioni Cgu: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEELELIQCGU_ELELIQCGDERO() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_ELENCLIQUCGU);
  }

  // **********************************************************************
  // Elenco Liquidazioni Cgu: Insert rows
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEELELIQCGU_ELELIQCGINRO() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.NUMERO_LIQ ) || ' / ' || TO_CHAR ( A.ANNO_LIQ ) as TOSTNULITSAL, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  A.IMPORTO as LIQIMPORTO, ");
    SQL.append("  A.DESCRIZIONE as LIQDESCRIZIO, ");
    SQL.append("  DECODE(A.CODICE_GESTIONALE, to_number(NULL), 'Assente', 'Errato') as IFEQLICOGNAE, ");
    SQL.append("  A.ANNO_LIQ as ANNOLIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMEROLIQ ");
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B ");
    SQL.append("where (B.CODICE = A.BENEFICIARIO) ");
    SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   ((A.CODICE_GESTIONALE IS NULL)) ");
    SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   ((A.CODICE_GESTIONALE IS NULL) OR (NOT ((A.CODICE_GESTIONALE IS NULL)) AND A.CODICE_GESTIONALE NOT IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  C.CODICE_GESTIONALE ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST C, ");
    SQL.append("  RICLASSIFICAZIONI D, ");
    SQL.append("  CODICI_GESTIONALI E, ");
    SQL.append("  CAP F, ");
    SQL.append("  LIQ G ");
    SQL.append("where (E.CODICE = C.CODICE_GESTIONALE) ");
    SQL.append("and   (C.PROGR_RICLASSIFICAZIONI = D.PROGRESSIVO) ");
    SQL.append("and   (E.E_S = D.E_S) ");
    SQL.append("and   (C.E_S = D.E_S) ");
    SQL.append("and   (C.E_S = 'S') ");
    SQL.append("and   (D.VOCE_ECON = G.VOCE_ECON) ");
    SQL.append("and   (D.TITOLO = F.TITOLO) ");
    SQL.append("and   (F.CAPITOLO = G.CAPITOLO) ");
    SQL.append("and   (F.ARTICOLO = G.ARTICOLO) ");
    SQL.append("and   (F.E_S = 'S') ");
    SQL.append("and   (F.ESERCIZIO = G.ANNO_MAND) ");
    SQL.append("and   (NVL(D.COD_INTERVENTO, -1) = NVL(F.COD_INTERVENTO, -1)) ");
    SQL.append("and   (NVL(D.COD_TERZI, -1) = NVL(F.COD_TERZI, -1)) ");
    SQL.append("))) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  TO_CHAR ( H.NUMERO_LIQ ) || ' / ' || TO_CHAR ( H.ANNO_LIQ ), ");
    SQL.append("  I.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  H.IMPORTO, ");
    SQL.append("  H.DESCRIZIONE, ");
    SQL.append("  DECODE(H.CODICE_GESTIONALE, to_number(NULL), 'Assente', 'Scaduto'), ");
    SQL.append("  H.ANNO_LIQ, ");
    SQL.append("  H.NUMERO_LIQ ");
    SQL.append("from ");
    SQL.append("  LIQ H, ");
    SQL.append("  BEN I ");
    SQL.append("where (I.CODICE = H.BENEFICIARIO) ");
    SQL.append("and   (H.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((H.NUMERO_MAND IS NULL)) ");
    SQL.append("and   ((H.CODICE_GESTIONALE IS NULL)) ");
    SQL.append("and   (NVL(H.UFFICIO, -1) = NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", NVL(H.UFFICIO, -1))) ");
    SQL.append("and   ((H.CODICE_GESTIONALE IS NULL) OR (NOT ((H.CODICE_GESTIONALE IS NULL)) AND H.CODICE_GESTIONALE IN ");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  J.CODICE_GESTIONALE ");
    SQL.append("from ");
    SQL.append("  RICLASSIFICAZIONI_GEST J, ");
    SQL.append("  RICLASSIFICAZIONI K, ");
    SQL.append("  CODICI_GESTIONALI L, ");
    SQL.append("  CAP M, ");
    SQL.append("  LIQ N ");
    SQL.append("where (L.CODICE = J.CODICE_GESTIONALE) ");
    SQL.append("and   (J.PROGR_RICLASSIFICAZIONI = K.PROGRESSIVO) ");
    SQL.append("and   (L.E_S = K.E_S) ");
    SQL.append("and   (J.E_S = K.E_S) ");
    SQL.append("and   (J.E_S = 'S') ");
    SQL.append("and   (NOT ((L.SCADENZA IS NULL)) AND L.SCADENZA < " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (K.VOCE_ECON = N.VOCE_ECON) ");
    SQL.append("and   (K.TITOLO = M.TITOLO) ");
    SQL.append("and   (M.CAPITOLO = N.CAPITOLO) ");
    SQL.append("and   (M.ARTICOLO = N.ARTICOLO) ");
    SQL.append("and   (M.E_S = 'S') ");
    SQL.append("and   (M.ESERCIZIO = N.ANNO_MAND) ");
    SQL.append("and   (NVL(K.COD_INTERVENTO, -1) = NVL(M.COD_INTERVENTO, -1)) ");
    SQL.append("and   (NVL(K.COD_TERZI, -1) = NVL(M.COD_TERZI, -1)) ");
    SQL.append("))) ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef5.TBL_ELENCLIQUCGU, 0);
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQULIQU,0,RS.Get(1));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUBENE,0,RS.Get(2));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUIMPO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUDESC,0,RS.Get(4));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQSTACGU,0,RS.Get(5));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQANNLIQ,0,RS.Get(6));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQNUMLIQ,0,RS.Get(7));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Riempi Elenco Equitalia
  // **********************************************************************
  public int RiempiElencoEquitalia ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi Elenco Equitalia Body
      // Procedure Body
      // 
      RIEMELENEQUI_ELENEQUIDELE();
      RIEMELENEQUI_ELEEQUININSE();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "RiempiElencoEquitalia", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco Equitalia: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEMELENEQUI_ELENEQUIDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_ELENCOEQUITA);
  }

  // **********************************************************************
  // Elenco Equitalia: Insert into... select
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEMELENEQUI_ELEEQUININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.NUMERO_LIQ ) || ' / ' || TO_CHAR ( A.ANNO_LIQ ) as TOSTNULITSAL, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  A.IMPORTO as LIQIMPORTO, ");
    SQL.append("  A.DESCRIZIONE as LIQDESCRIZIO, ");
    SQL.append("  A.ANNO_LIQ as ANNOLIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMEROLIQ ");
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B ");
    SQL.append("where (B.CODICE = A.BENEFICIARIO) ");
    SQL.append("and   (A.IMPORTO > " + IDL.CSql(MainFrm.IMPOCONTEQUI, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef5.TBL_ELENCOEQUITA, 0);
      IMDB.set_Value(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQULIQU,0,RS.Get(1));
      IMDB.set_Value(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUBENE,0,RS.Get(2));
      IMDB.set_Value(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUIMPO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUDESC,0,RS.Get(4));
      IMDB.set_Value(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELELIQANNLIQ,0,RS.Get(5));
      IMDB.set_Value(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELELIQNUMLIQ,0,RS.Get(6));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Riempi Elenco Liquidazioni CTE
  // **********************************************************************
  public int RiempiElencoLiquidazioniCTE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riempi Elenco Liquidazioni CTE Body
      // Procedure Body
      // 
      RIEELELIQCTE_ELELIQCTEDEL();
      RIEELELIQCTE_ELLICTININSE();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "RiempiElencoLiquidazioniCTE", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco Liquidazioni CTE: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void RIEELELIQCTE_ELELIQCTEDEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_ELENCLIQUCTE);
  }

  // **********************************************************************
  // Elenco Liquidazioni CTE: Insert into... select
  // Why are you inserting these data?
  // **********************************************************************
  private void RIEELELIQCTE_ELLICTININSE() throws SQLException
  {
    StringBuffer SQL = new StringBuffer();
    IDCachedRowSet RS = new IDCachedRowSet();

    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.NUMERO_LIQ ) || ' / ' || TO_CHAR ( A.ANNO_LIQ ) as TOSTNULITSAL, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES, ");
    SQL.append("  A.IMPORTO as LIQIMPORTO, ");
    SQL.append("  A.DESCRIZIONE as LIQDESCRIZIO, ");
    SQL.append("  A_GET_ERRORE_COD_TRANS_LIQ(A.ANNO_LIQ,A.NUMERO_LIQ) as AGEERCTLALNL, ");
    SQL.append("  A.ANNO_LIQ as ANNOLIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMEROLIQ ");
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B ");
    SQL.append("where (B.CODICE = A.BENEFICIARIO) ");
    SQL.append("and   (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
    SQL.append("and   (NOT ((A_GET_ERRORE_COD_TRANS_LIQ(A.ANNO_LIQ,A.NUMERO_LIQ) IS NULL))) ");
    RS = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
    if (!RS.EOF()) RS.MoveNext();
    while (!RS.EOF())
    {
      IMDB.TblAddNew(IMDBDef5.TBL_ELENCLIQUCTE, 0);
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQULIQU,0,RS.Get(1));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUBENE,0,RS.Get(2));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUIMPO,0,RS.Get(3));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUDESC,0,RS.Get(4));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQSTACTE,0,RS.Get(5));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQANNLIQ,0,RS.Get(6));
      IMDB.set_Value(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQNUMLIQ,0,RS.Get(7));
      RS.MoveNext();
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_TIPOEMISSION = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ORDINE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_TOT = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_PRIMO = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_ULTIMO = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_ANTICIPAZION = new IDVariant(0,IDVariant.FLOAT);
    IDVariant v_MESSAGANTICI = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO1 = (new IDVariant("Procedura terminata ", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("La data di emissione deve appartenere all'esercizio corrente!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCTE, 0)) && (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0).equals((new IDVariant("NO")), true)) && (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, 0).equals((new IDVariant("NO")), true)))
        {
          if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, 0).compareTo(MainFrm.DATAINIZSIOP, true)>=0 && !(MainFrm.SIOPEATTIARM.booleanValue()))
          {
            if (ControlloCodGest(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0),(new IDVariant(-1)))))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Sono presenti Liquidazioni senza codice gestionale o errato o scaduto!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
          }
          if (ControlloCodTransElem(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0),(new IDVariant(-1)))))
          {
            IDVariant v_AVVISOCTE = null;
            v_AVVISOCTE = (new IDVariant("Sono presenti liquidazioni con codici di transazione elementare non corretti"));
            MainFrm.set_AlertMessage(v_AVVISOCTE); 
            return 0;
          }
          if (ControllaQuietanzeScadute())
          {
            MainFrm.set_AlertMessage((new IDVariant("Sono presenti Liquidazioni con quietanza scaduta!"))); 
            return 0;
          }
          if (MainFrm.DatiEmissione(IDL.Year(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, 0)), v_TIPOEMISSION, v_ORDINE).equals((new IDVariant(-1)), true))
          {
            IDVariant v_ERRORE = new IDVariant(0,IDVariant.STRING);
            v_ERRORE = (new IDVariant("Errore in lettura dei dati!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_ERRORE); 
            return 0;
          }
          else
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  SUM(CASE WHEN NVL(CONTROLLO_DISP_CASSA_VPRO_CAP(B.ESERCIZIO,B.CAPITOLO,B.ARTICOLO,'EM'), 0) < 0 THEN 1 ELSE 0 END) as SINVCDCVCBEB ");
            SQL.append("from ");
            SQL.append("  LIQ A, ");
            SQL.append("  BIL B ");
            SQL.append("where (NOT ((A.ANNO_MAND IS NULL))) ");
            SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
            SQL.append("and   (A.ANNO_LIQ = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (B.CAPITOLO = A.CAPITOLO) ");
            SQL.append("and   (B.ARTICOLO = A.ARTICOLO) ");
            SQL.append("and   (B.E_S = 'S') ");
            SQL.append("and   (B.ESERCIZIO = A.ANNO_LIQ) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCOUNT = QV.Get("SINVCDCVCBEB", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
            {
              if (MainFrm.CONCASLIQEMI.equals((new IDVariant(1)), true))
              {
                IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
                v_S1 = (new IDVariant("Sono presenti record con disponibilità di cassa negativa."));
                MainFrm.set_AlertMessage(v_S1); 
                return 0;
              }
              else
              {
                IDVariant S = new IDVariant(0,IDVariant.STRING);
                S = (new IDVariant("Sono presenti record con disponibilità di cassa negativa. Continuare?"));
                IDVariant v_RISP = null;
                v_RISP = (new IDVariant(MainFrm.MessageConfirmEx(S)));
                if (IDL.IsNull(v_RISP) || v_RISP.compareTo((new IDVariant(-1)), true)!=0)
                {
                  return 0;
                }
              }
            }
            if (MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("w_man_generazione_response"))).equals((new IDVariant("w_man_generazione_response_li")), true))
            {
              MainFrm.Cf4armDBObject.MANGENERAZIONELI(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.Add((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_DATAEMISSION))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARATIPOSCAD, 0),(new IDVariant(-1))))), IDL.Year(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0)), v_TIPOEMISSION, v_ORDINE, v_TOT, v_PRIMO, v_ULTIMO, v_ANTICIPAZION, IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMANDACOP, 0));
            }
            else
            {
              MainFrm.Cf4armDBObject.MANGENERAZIONE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.Add((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_DATAEMISSION))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARATIPOSCAD, 0),(new IDVariant(-1))))), IDL.Year(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, 0)), ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0)), v_TIPOEMISSION, v_ORDINE, v_TOT, v_PRIMO, v_ULTIMO, v_ANTICIPAZION, IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMANDACOP, 0));
            }
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
              return 0;
            }
            else
            {
              if (MainFrm.FINANZIAMENT.booleanValue() && v_ANTICIPAZION.equals((new IDVariant(1)), true))
              {
                IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
                v_SMS = (new IDVariant(" - sono stati generati mandati in anticipazione sul finanziamento.", IDVariant.STRING));
                v_MESSAGANTICI = new IDVariant(v_SMS);
              }
              if (v_PRIMO.compareTo(v_ULTIMO, true)>0 || (v_PRIMO.equals((new IDVariant(0)), true) && v_ULTIMO.equals((new IDVariant(0)), true)))
              {
                IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
                v_AVVISO1 = (new IDVariant("Nessun mandato emesso!", IDVariant.STRING));
                MainFrm.set_AlertMessage(IDL.Add(v_MESSAGGIO1, v_AVVISO1)); 
              }
              else
              {
                MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO1, (new IDVariant("Emessi "))), IDL.ToString(v_TOT)), (new IDVariant(" "))), (new IDVariant("Mandati"))), (new IDVariant(" "))), (new IDVariant("dal numero "))), IDL.ToString(v_PRIMO)), (new IDVariant(" al numero "))), IDL.ToString(v_ULTIMO)), v_MESSAGANTICI)); 
              }
            }
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
        }
        else if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCA, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI144, IMDBDef5.FLD_PARAMETRI144_PARAMUFFICIO, 0, ((IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0)));
          MainFrm.Show(MyGlb.FRM_CONTROANTICI, (new IDVariant(-1)).intValue(), this); 
        }
        else if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCCG, 0).equals((new IDVariant("SI")), true))
        {
          RiempiElencoLiquidazioniCgu();
          MainFrm.Show(MyGlb.FRM_CONTCODIGEST, (new IDVariant(-1)).intValue(), this); 
        }
        else if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMSCE, 0).equals((new IDVariant("SI")), true))
        {
          RiempiElencoEquitalia();
          MainFrm.Show(MyGlb.FRM_CONTROEQUITA, (new IDVariant(-1)).intValue(), this); 
        }
        else if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCONCAS, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARS51, IMDBDef5.FLD_PARS51_NOMEOGGEUFFI, 0, IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARAMUFFICIO, 0));
          MainFrm.Show(MyGlb.FRM_CACODINELIIE, (new IDVariant(-1)).intValue(), this); 
        }
        else if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARSOLCOQUSC, 0).equals((new IDVariant("SI")), true))
        {
          MainFrm.Show(MyGlb.FRM_CONTQUIESCAD, (new IDVariant(-1)).intValue(), this); 
        }
        else
        {
          RiempiElencoLiquidazioniCTE();
          MainFrm.Show(MyGlb.FRM_CONCODTRAEL1, (new IDVariant(-1)).intValue(), this); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Cod Gest
  // Esercizio:  - Input
  // Ufficio:  - Input
  // **********************************************************************
  public boolean ControlloCodGest (IDVariant Esercizio, IDVariant Ufficio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NONVALIDI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_SCADUTI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Cod Gest Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
      SQL.append("and   ((A.CODICE_GESTIONALE IS NULL)) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(" + IDL.CSql(Ufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(A.UFFICIO, -1), " + IDL.CSql(Ufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   ((A.CODICE_GESTIONALE IS NULL) OR (NOT ((A.CODICE_GESTIONALE IS NULL)) AND A.CODICE_GESTIONALE NOT IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  B.CODICE_GESTIONALE ");
      SQL.append("from ");
      SQL.append("  RICLASSIFICAZIONI_GEST B, ");
      SQL.append("  RICLASSIFICAZIONI C, ");
      SQL.append("  CODICI_GESTIONALI D, ");
      SQL.append("  CAP E ");
      SQL.append("where (D.CODICE = B.CODICE_GESTIONALE) ");
      SQL.append("and   (B.PROGR_RICLASSIFICAZIONI = C.PROGRESSIVO) ");
      SQL.append("and   (D.E_S = C.E_S) ");
      SQL.append("and   (B.E_S = C.E_S) ");
      SQL.append("and   (B.E_S = 'S') ");
      SQL.append("and   (E.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (E.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (E.E_S = 'S') ");
      SQL.append("and   (E.ESERCIZIO = A.ANNO_MAND) ");
      SQL.append("and   (C.TITOLO = E.TITOLO) ");
      SQL.append("and   (C.VOCE_ECON = A.VOCE_ECON) ");
      SQL.append("and   (NVL(C.COD_INTERVENTO, -1) = NVL(E.COD_INTERVENTO, -1)) ");
      SQL.append("and   (NVL(C.COD_TERZI, -1) = NVL(E.COD_TERZI, -1)) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NONVALIDI = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
      SQL.append("and   ((A.CODICE_GESTIONALE IS NULL)) ");
      SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(" + IDL.CSql(Ufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(A.UFFICIO, -1), " + IDL.CSql(Ufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   ((A.CODICE_GESTIONALE IS NULL) OR (NOT ((A.CODICE_GESTIONALE IS NULL)) AND A.CODICE_GESTIONALE IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  B.CODICE_GESTIONALE ");
      SQL.append("from ");
      SQL.append("  RICLASSIFICAZIONI_GEST B, ");
      SQL.append("  RICLASSIFICAZIONI C, ");
      SQL.append("  CODICI_GESTIONALI D, ");
      SQL.append("  CAP E ");
      SQL.append("where (D.CODICE = B.CODICE_GESTIONALE) ");
      SQL.append("and   (B.PROGR_RICLASSIFICAZIONI = C.PROGRESSIVO) ");
      SQL.append("and   (D.E_S = C.E_S) ");
      SQL.append("and   (B.E_S = C.E_S) ");
      SQL.append("and   (B.E_S = 'S') ");
      SQL.append("and   (NOT ((D.SCADENZA IS NULL)) AND D.SCADENZA < " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (E.CAPITOLO = A.CAPITOLO) ");
      SQL.append("and   (E.ARTICOLO = A.ARTICOLO) ");
      SQL.append("and   (E.E_S = 'S') ");
      SQL.append("and   (E.ESERCIZIO = A.ANNO_MAND) ");
      SQL.append("and   (C.TITOLO = E.TITOLO) ");
      SQL.append("and   (C.VOCE_ECON = A.VOCE_ECON) ");
      SQL.append("and   (NVL(C.COD_INTERVENTO, -1) = NVL(E.COD_INTERVENTO, -1)) ");
      SQL.append("and   (NVL(C.COD_TERZI, -1) = NVL(E.COD_TERZI, -1)) ");
      SQL.append("))) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_SCADUTI = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0 || v_NONVALIDI.compareTo((new IDVariant(0)), true)>0 || v_SCADUTI.compareTo((new IDVariant(0)), true)>0)
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        return (new IDVariant(0)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "ControlloCodGest", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controllo Cod Trans Elem
  // Esercizio:  - Input
  // Ufficio:  - Input
  // **********************************************************************
  public boolean ControlloCodTransElem (IDVariant Esercizio, IDVariant Ufficio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NONVALIDI = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Cod Trans Elem Body
      // Procedure Body
      // 
      IDVariant v_RETVAL = new IDVariant(0,IDVariant.INTEGER);
      try
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  LIQ A ");
        SQL.append("where (A.ANNO_MAND = " + IDL.CSql(Esercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
        SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(" + IDL.CSql(Ufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(A.UFFICIO, -1), " + IDL.CSql(Ufficio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (NOT ((A_GET_ERRORE_COD_TRANS_LIQ(A.ANNO_LIQ,A.NUMERO_LIQ) IS NULL))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NONVALIDI = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      catch (Exception e3)
      {
        MainFrm.set_AlertMessage(new IDVariant(e3.getMessage())); 
        v_RETVAL = (new IDVariant(-1));
      }
      if (v_NONVALIDI.compareTo((new IDVariant(0)), true)>0)
      {
        v_RETVAL = (new IDVariant(-1));
      }
      return v_RETVAL.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "ControlloCodTransElem", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controlla Quietanze Scadute
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public boolean ControllaQuietanzeScadute ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controlla Quietanze Scadute Body
      // Corpo Procedura
      // 
      IDVariant v_NUMQTNSCAD = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_RETVAL = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  LIQ A, ");
      SQL.append("  BEN B, ");
      SQL.append("  QTN C, ");
      SQL.append("  T02 D ");
      SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
      SQL.append("and   (B.CODICE = A.BENEFICIARIO) ");
      SQL.append("and   (C.CODICE = B.CODICE) ");
      SQL.append("and   (C.NUM_QUIETANZA = A.NUM_QUIETANZA) ");
      SQL.append("and   (NVL(C.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) < " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI225, IMDBDef14.PQSL_PARAMETRI225_PARADATAEMIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (D.CODICE = C.TIPO_QUIETANZA) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMQTNSCAD = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_NUMQTNSCAD.compareTo((new IDVariant(0)), true)>0)
      {
        v_RETVAL = (new IDVariant(-1));
      }
      return v_RETVAL.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneAutomaticaMandati", "ControllaQuietanzeScadute", _e);
      return false;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void EMISAUTOMAND_PARAMETRI225() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI225_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI143, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI143, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI225_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI225_RS, 0, IMDBDef5.TBL_PARAMETRI143, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 0, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARADATAEMIS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 1, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 2, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCCG, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 3, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 4, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 5, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARATIPOSCAD, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 6, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMSCCTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 7, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARSOLCONCAS, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 8, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARAMANDACOP, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI225_RS, 9, 0, IMDBDef5.TBL_PARAMETRI143, IMDBDef5.FLD_PARAMETRI143_PARSOLCOQUSC, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI143, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI143, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI143, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI225_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, "18EED017-2762-411F-9BA8-88FED86FCD6F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, "Data Emissione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, "55F06D6D-E890-4290-9077-1FF86122BD4B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, "Solo Controllo Anticipazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, "86E592A9-BC59-4B9A-BA2C-9AD73635F21D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, "Solo Controllo Codici Gestionali");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, "C8A5C023-2411-4444-86B6-87C0DFA0AE10");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, "Solo Controllo Equitalia");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, "71B49C3E-D941-4BF0-A731-0682D380DB14");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, "Solo Controllo Codici Transazione Elementare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, "6B1941A1-8263-429D-9FC8-69E761F839EE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, "Solo Controllo Cassa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, "7022DB57-7359-4F07-B684-5B4DE3C0A82C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, "Solo Controllo Quietanze Scadute");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "649AD004-944E-4EC0-AE9F-6BF02544F9DD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, "783C31AC-D5CF-457C-97CB-7B36142B28E3");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, "Tipo Scadenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "3C1F9123-8969-44D3-9FFD-3F1BE2143A7B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, "A127D7C2-C3DD-4F4D-8C2C-9E960B2D3809");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, "Mandato a Copertura");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_LIST, "Data Emissione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, 92, 8, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAEMISSION, MyGlb.PANEL_FORM, "Data Emissione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAEMISSION, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAEMISSION, PPQRY_PARAMETRI225, "A.PARADATAEMIS", "PARADATAEMIS", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_LIST, "Sl. Cnt. Antic.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_FORM, 108, 32, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_FORM, 172);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTANTI, MyGlb.PANEL_FORM, "Solo Controllo Anticipazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCONTANTI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCONTANTI, PPQRY_PARAMETRI225, "A.PARAMSCA", "PARAMSCA", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTANTI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTANTI, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_LIST, "S. Cnt. Cd. Gst.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_FORM, 92, 56, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_FORM, 188);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCODGES, MyGlb.PANEL_FORM, "Solo Controllo Codici Gestionali");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLCONCODGES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLCONCODGES, PPQRY_PARAMETRI225, "A.PARAMSCCG", "PARAMSCCG", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONCODGES, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONCODGES, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_LIST, "S. Cn. Eq.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_FORM, 128, 80, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTEQUI, MyGlb.PANEL_FORM, "Solo Controllo Equitalia");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCONTEQUI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCONTEQUI, PPQRY_PARAMETRI225, "A.PARAMSCE", "PARAMSCE", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTEQUI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTEQUI, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_LIST, "S. C. C. Tr. El.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_FORM, 12, 104, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_FORM, 268);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONCOTREL, MyGlb.PANEL_FORM, "Solo Controllo Codici Transazione Elementare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLCONCOTREL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLCONCOTREL, PPQRY_PARAMETRI225, "A.PARAMSCCTE", "PARAMSCCTE", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONCOTREL, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONCOTREL, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_LIST, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_LIST, "Solo Controllo Cassa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_FORM, 156, 128, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOCONTCASS, MyGlb.PANEL_FORM, "Solo Controllo Cassa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOCONTCASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOCONTCASS, PPQRY_PARAMETRI225, "A.PARSOLCONCAS", "PARSOLCONCAS", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTCASS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOCONTCASS, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_LIST, 0, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_LIST, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_LIST, "Solo Controllo Quietanze Scadute");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_FORM, 84, 152, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_FORM, 196);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLCONQUISCA, MyGlb.PANEL_FORM, "Solo Controllo Quietanze Scadute");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLCONQUISCA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLCONQUISCA, PPQRY_PARAMETRI225, "A.PARSOLCOQUSC", "PARSOLCOQUSC", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONQUISCA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLCONQUISCA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 44, 176, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI225, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_LIST, "Tp. Scad.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, 4, 200, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOSCADENZA, MyGlb.PANEL_FORM, "Tipo Scadenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOSCADENZA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOSCADENZA, PPQRY_PARAMETRI225, "A.PARATIPOSCAD", "PARATIPOSCAD", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 224, 256, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_LIST, 132);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_LIST, "Mandato a Copertura");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_FORM, 148, 224, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_FORM, 132);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATACOPER, MyGlb.PANEL_FORM, "Mandato a Copertura");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_MANDATACOPER, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_MANDATACOPER, PPQRY_PARAMETRI225, "A.PARAMANDACOP", "PARAMANDACOP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_MANDATACOPER, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_MANDATACOPER, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMUFFICIO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUFFICIO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T01CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T01DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T01 A ");
    SQL.append("where (A.CODICE = ~~PARATIPOSCAD~~) ");
    SQL.append("and   (A.SE_PERSONALE = 'SI') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Nulla' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARATIPOSCAD~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T01, 0, SQL, PFL_PARAMETRI_TIPOSCADENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T01CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T01DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T01 A ");
    SQL.append("where (A.SE_PERSONALE = 'SI') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Nulla' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T01, 1, SQL, PFL_PARAMETRI_TIPOSCADENZA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T01, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI225", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI225, IMDBDef14.PQRY_PARAMETRI225_RS, IMDBDef5.TBL_PARAMETRI143);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAEMISSION, IMDBDef5.FLD_PARAMETRI143_PARADATAEMIS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCONTANTI, IMDBDef5.FLD_PARAMETRI143_PARAMSCA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLCONCODGES, IMDBDef5.FLD_PARAMETRI143_PARAMSCCG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCONTEQUI, IMDBDef5.FLD_PARAMETRI143_PARAMSCE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLCONCOTREL, IMDBDef5.FLD_PARAMETRI143_PARAMSCCTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOCONTCASS, IMDBDef5.FLD_PARAMETRI143_PARSOLCONCAS);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLCONQUISCA, IMDBDef5.FLD_PARAMETRI143_PARSOLCOQUSC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI143_PARAMUFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOSCADENZA, IMDBDef5.FLD_PARAMETRI143_PARATIPOSCAD);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_MANDATACOPER, IMDBDef5.FLD_PARAMETRI143_PARAMANDACOP);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI143");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_AfterFind(CmdFind);
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
