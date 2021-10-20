// **********************************************
// Controllo I V A In Attesa Di Esigibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloIVAInAttesaDiEsigibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_COIVAINATDIE_ORDINAMENTO = 0;
  private static int GRP_COIVAINATDIE_FATTURE = 1;

  private static int PFL_COIVAINATDIE_TIPOREGISTRO = 0;
  private static int PFL_COIVAINATDIE_BOLLATDEFINI = 1;
  private static int PFL_COIVAINATDIE_ORDINAFATTUR = 2;
  private static int PFL_COIVAINATDIE_ORDINAFATTU1 = 3;
  private static int PFL_COIVAINATDIE_FAPANOPADIES = 4;
  private static int PFL_COIVAINATDIE_FAINNOINDIES = 5;
  private static int PFL_COIVAINATDIE_ELABORA = 6;

  private static int PPQRY_NEWTABLE43 = 0;

  private static int PPQRY_T04 = 1;


  IDPanel PAN_COIVAINATDIE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE45(IMDB);
    //
    //
    Init_PQRY_NEWTABLE43(IMDB);
    Init_PQRY_NEWTABLE43_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE45(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_NEWTABLE45, 10);
    IMDB.set_TblCode(IMDBDef2.TBL_NEWTABLE45, "TBL_NEWTABLE45");
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_RONAFAPANPDE, "RONAFAPANPDE");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_RONAFAPANPDE,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_RONAFAINNIDE, "RONAFAINNIDE");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_RONAFAINNIDE,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMBOLDEF, "ROWNAMBOLDEF");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMBOLDEF,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFAT, "ROWNAMORDFAT");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFAT,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFA1, "ROWNAMORDFA1");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFA1,5,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMETB, "ROWNAMETB");
    IMDB.SetFldParams(IMDBDef2.TBL_NEWTABLE45,IMDBDef2.FLD_NEWTABLE45_ROWNAMETB,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_NEWTABLE45, 0);
  }

  private static void Init_PQRY_NEWTABLE43(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE43, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE43, "PQRY_NEWTABLE43");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_RONAFAPANPDE, "RONAFAPANPDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_RONAFAPANPDE,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_RONAFAINNIDE, "RONAFAINNIDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_RONAFAINNIDE,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF, "ROWNAMBOLDEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFAT, "ROWNAMORDFAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFAT,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFA1, "ROWNAMORDFA1");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFA1,5,10,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE43, 0);
  }

  private static void Init_PQRY_NEWTABLE43_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_NEWTABLE43_RS, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_NEWTABLE43_RS, "PQRY_NEWTABLE43_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_RONAFAPANPDE, "RONAFAPANPDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_RONAFAPANPDE,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_RONAFAINNIDE, "RONAFAINNIDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_RONAFAINNIDE,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMTIPREG, "ROWNAMTIPREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMTIPREG,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF, "ROWNAMBOLDEF");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFAT, "ROWNAMORDFAT");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFAT,5,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFA1, "ROWNAMORDFA1");
    IMDB.SetFldParams(IMDBDef10.PQRY_NEWTABLE43_RS,IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFA1,5,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloIVAInAttesaDiEsigibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloIVAInAttesaDiEsigibilita()
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
    FormIdx = MyGlb.FRM_COIVAINATDIE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E0B50C2D-3203-4093-BDCB-8A55ECA9CBE3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 416;
    DesignHeight = 218;
    set_Caption(new IDVariant("Controllo I.V.A. in Attesa Di Esigibilita'"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 416;
    Frames[1].Height = 192;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Controllo I V A In Attesa Di Esigibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 192;
    PAN_COIVAINATDIE = new IDPanel(w, this, 1, "PAN_COIVAINATDIE");
    Frames[1].Content = PAN_COIVAINATDIE;
    PAN_COIVAINATDIE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_COIVAINATDIE.VS = MainFrm.VisualStyleList;
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 416-MyGlb.PAN_OFFS_X, 192-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D4BF31E9-6EC6-4550-B739-B0D05AA32DFF");
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 608, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_COIVAINATDIE.InitStatus = 2;
    PAN_COIVAINATDIE_Init();
    PAN_COIVAINATDIE_InitFields();
    PAN_COIVAINATDIE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_NEWTABLE45, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        COIVAINATDIE_NEWTABLE43();
      }
      PAN_COIVAINATDIE.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloIVAInAttesaDiEsigibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloIVAInAttesaDiEsigibilita.class.getName() : (Glb.ClassWithPackage(ControlloIVAInAttesaDiEsigibilita.class) ? ControlloIVAInAttesaDiEsigibilita.class.getName().substring(ControlloIVAInAttesaDiEsigibilita.class.getPackage().getName().length() + 1) : ControlloIVAInAttesaDiEsigibilita.class.getName()));
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
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_RONAFAPANPDE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_RONAFAINNIDE, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMBOLDEF, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFAT, 0, (new IDVariant("sospese")));
      IMDB.set_Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFA1, 0, (new IDVariant("sospese")));
      if (IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0).equals((new IDVariant(2)), true))
      {
        PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0).equals((new IDVariant(5)), true))
      {
        PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloIVAInAttesaDiEsigibilita", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Controllo I V A In Attesa Di Esigibilità On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_COIVAINATDIE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_COIVAINATDIE);
      // 
      // Controllo I V A In Attesa Di Esigibilità On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // 2----------------------
      // 
      if (IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0).equals((new IDVariant(2)), true) && IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_RONAFAPANPDE, 0).equals((new IDVariant(1)), true))
      {
        PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        if (IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_RONAFAPANPDE, 0).equals((new IDVariant(3)), true))
        {
          PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        // 
        // 5-----------------
        // 
        if (IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_RONAFAINNIDE, 0).equals((new IDVariant(3)), true))
        {
          PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_COIVAINATDIE.SetFlags (Glb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloIVAInAttesaDiEsigibilita", "ControlloIVAInAttesaDiEsigibilitàOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0).equals((new IDVariant(2)), true))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_REGISTRO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_BOLLATO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMETB, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEANNO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DA")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATDA, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_A")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATAA, 0)));
        IDVariant v_PERIODO = new IDVariant(0,IDVariant.STRING);
        v_PERIODO = MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATDA, 0)));
        if (IDL.Month(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATDA, 0)).compareTo(IDL.Month(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATAA, 0)), true)!=0)
        {
          v_PERIODO = IDL.Add(IDL.Add(v_PERIODO, (new IDVariant(" - "))), MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATAA, 0))));
        }
        MainFrm.SetParametroStampaJasper((new IDVariant("P_PERIODO")), v_PERIODO);
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ORDINAMENTO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFAT, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_SELECT")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_RONAFAPANPDE, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NBDEF")), ((IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF, 0).equals((new IDVariant(-1))))?IDL.ToString((new IDVariant(0))):IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF, 0))));
        IDVariant v_SSTAMAP = new IDVariant(0,IDVariant.STRING);
        v_SSTAMAP = (new IDVariant("Controllo_iva_attese"));
        MainFrm.LanciaStampaJasper(v_SSTAMAP, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      if (IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0).equals((new IDVariant(5)), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Controllo_iva_attese_gruppo"));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_REGISTRO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_BOLLATO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMETB, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEANNO, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DA")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATDA, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_A")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMEDATAA, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_ORDINAMENTO")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_ROWNAMORDFA1, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_SELECT")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_RONAFAINNIDE, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NBDEF")), ((IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF, 0).equals((new IDVariant(-1))))?IDL.ToString((new IDVariant(0))):IDL.ToString(IMDB.Value(IMDBDef10.PQRY_NEWTABLE43, IMDBDef10.PQSL_NEWTABLE43_ROWNAMBOLDEF, 0))));
        MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloIVAInAttesaDiEsigibilita", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void COIVAINATDIE_NEWTABLE43() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_NEWTABLE43_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE45, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_NEWTABLE45, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_NEWTABLE43_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_NEWTABLE43_RS, 0, IMDBDef2.TBL_NEWTABLE45, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE43_RS, 0, 0, IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_RONAFAPANPDE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE43_RS, 1, 0, IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_RONAFAINNIDE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE43_RS, 2, 0, IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE43_RS, 3, 0, IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMBOLDEF, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE43_RS, 4, 0, IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFAT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_NEWTABLE43_RS, 5, 0, IMDBDef2.TBL_NEWTABLE45, IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFA1, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_NEWTABLE45, 0);
      if (IMDB.Eof(IMDBDef2.TBL_NEWTABLE45, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_NEWTABLE45, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_NEWTABLE43_RS, 0);
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
  private void PAN_COIVAINATDIE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_COIVAINATDIE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_COIVAINATDIE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_COIVAINATDIE, Cancel);
    // Stub
  }

  private void PAN_COIVAINATDIE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_COIVAINATDIE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_COIVAINATDIE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_COIVAINATDIE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_COIVAINATDIE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_COIVAINATDIE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_COIVAINATDIE_Init()
  {

    PAN_COIVAINATDIE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_COIVAINATDIE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, "6B818283-849F-4AD8-9418-689CB51F7B1A");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, "Ordinamento");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, MyGlb.PANEL_LIST, 0, -9999, 160, 16, 0, 0);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, MyGlb.PANEL_FORM, 220, 3, 172, 77, 0, 0);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, 0, 74);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, 1, 13);
    PAN_COIVAINATDIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, 0, 4);
    PAN_COIVAINATDIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, 1, 4);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, "2153DD17-8AA8-4B86-8435-35E1F532D89E");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, "fatture");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, MyGlb.VIS_GROUPSTYLE);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, MyGlb.PANEL_LIST, 0, -9999, 144, 0, 0, 0);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, MyGlb.PANEL_FORM, 4, 4, 196, 76, 0, 0);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, 0, 40);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, 1, 13);
    PAN_COIVAINATDIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, 0, 1);
    PAN_COIVAINATDIE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, 1, 1);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_GROUP, GRP_COIVAINATDIE_FATTURE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_COIVAINATDIE.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, "18820807-5277-4AE8-A4F6-778CC3168DD7");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, "Tipo Registro");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, "6D36EECC-7E8B-4749-A306-C132B5EA9DA1");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, "Bollato Definitivo");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.VIS_NORMALFIELDS);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, "771AE84A-14DB-4716-A6F5-E8A4F7156F17");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, "Ordinamento Fatture");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.VIS_OPTBUTSENBOR);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, "58574288-F3EE-4367-B1FD-68B6E9662854");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, "Ordinamento Fatture 1");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.VIS_OPTBUTSENBOR);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, "5F91A180-3EEC-4BB9-BDDD-EFC9C5A3C43D");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, "Fatture Pagate Non Pagate Divenute Ese");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, "4AFF1DCD-037E-44E4-9768-A8DF8249C36D");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, "Fatture Incassate Non Incassate Divenute Ese");
    PAN_COIVAINATDIE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, "");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_COIVAINATDIE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, "B61CCDC8-396B-43CD-9471-FE1F2A358D98");
    PAN_COIVAINATDIE.set_Header(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, "Elabora");
    PAN_COIVAINATDIE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_COIVAINATDIE.SetImage(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, 0, "button1.gif", false);
    PAN_COIVAINATDIE.SetFlags(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_COIVAINATDIE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_LIST, 72);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tp. Regis.");
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_FORM, 160);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_COIVAINATDIE.SetFieldPage(PFL_COIVAINATDIE_TIPOREGISTRO, -1, -1);
    PAN_COIVAINATDIE.SetFieldPanel(PFL_COIVAINATDIE_TIPOREGISTRO, PPQRY_NEWTABLE43, "A.ROWNAMTIPREG", "ROWNAMTIPREG", 1, 1, 0, -13997);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_LIST, 88);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_LIST, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_LIST, "Boll. Defin.");
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_FORM, 8, 88, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_FORM, 104);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_FORM, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_BOLLATDEFINI, MyGlb.PANEL_FORM, "Bollato Definitivo");
    PAN_COIVAINATDIE.SetFieldPage(PFL_COIVAINATDIE_BOLLATDEFINI, -1, -1);
    PAN_COIVAINATDIE.SetFieldPanel(PFL_COIVAINATDIE_BOLLATDEFINI, PPQRY_NEWTABLE43, "A.ROWNAMBOLDEF", "ROWNAMBOLDEF", 1, 2, 0, -13997);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_LIST, 0, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_LIST, 112);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_LIST, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_LIST, "Ordinamento Fatture");
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_FORM, 224, 32, 164, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_FORM, 160);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_FORM, 3);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTUR, MyGlb.PANEL_FORM, "Ordinamento Fatture");
    PAN_COIVAINATDIE.SetFieldPage(PFL_COIVAINATDIE_ORDINAFATTUR, -1, GRP_COIVAINATDIE_ORDINAMENTO);
    PAN_COIVAINATDIE.SetFieldPanel(PFL_COIVAINATDIE_ORDINAFATTUR, PPQRY_NEWTABLE43, "A.ROWNAMORDFAT", "ROWNAMORDFAT", 5, 10, 0, -13997);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_ORDINAFATTUR, (new IDVariant("sospese")), "Per Registrazione Sospesa", "", "", -1);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_ORDINAFATTUR, (new IDVariant("definitive")), "Per Registrazione Definitiva", "", "", -1);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_LIST, 120);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_LIST, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_LIST, "Ordin. Fatture 1");
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_FORM, 224, 28, 164, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_FORM, 120);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_FORM, 3);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ORDINAFATTU1, MyGlb.PANEL_FORM, "Ordinamento Fatture 1");
    PAN_COIVAINATDIE.SetFieldPage(PFL_COIVAINATDIE_ORDINAFATTU1, -1, GRP_COIVAINATDIE_ORDINAMENTO);
    PAN_COIVAINATDIE.SetFieldPanel(PFL_COIVAINATDIE_ORDINAFATTU1, PPQRY_NEWTABLE43, "A.ROWNAMORDFA1", "ROWNAMORDFA1", 5, 10, 0, -13997);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_ORDINAFATTU1, (new IDVariant("sospese")), "Per Data Registrazione", "", "", -1);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_ORDINAFATTU1, (new IDVariant("liq")), "Per Data Liquidazione", "", "", -1);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_LIST, 208);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_LIST, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_LIST, "Fatture Pagate Non Pagate Divenute Ese");
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_FORM, 8, 8, 188, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_FORM, 160);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_FORM, 5);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAPANOPADIES, MyGlb.PANEL_FORM, "Fatture Pagate Non Pagate Divenute Ese");
    PAN_COIVAINATDIE.SetFieldPage(PFL_COIVAINATDIE_FAPANOPADIES, -1, GRP_COIVAINATDIE_FATTURE);
    PAN_COIVAINATDIE.SetFieldPanel(PFL_COIVAINATDIE_FAPANOPADIES, PPQRY_NEWTABLE43, "A.RONAFAPANPDE", "RONAFAPANPDE", 1, 1, 0, -13997);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_FAPANOPADIES, (new IDVariant(1)), "Fatture Pagate", "", "", -1);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_FAPANOPADIES, (new IDVariant(2)), "Fatture Non Pagate", "", "", -1);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_FAPANOPADIES, (new IDVariant(3)), "Fatture Divenute Esigibili", "", "", -1);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_LIST, 232);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_LIST, 1);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_LIST, "Fatture Incassate Non Incassate Divenute Ese");
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_FORM, 8, 8, 188, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_FORM, 160);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_FORM, 5);
    PAN_COIVAINATDIE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_FAINNOINDIES, MyGlb.PANEL_FORM, "Fatture Incassate Non Incassate Divenute Ese");
    PAN_COIVAINATDIE.SetFieldPage(PFL_COIVAINATDIE_FAINNOINDIES, -1, GRP_COIVAINATDIE_FATTURE);
    PAN_COIVAINATDIE.SetFieldPanel(PFL_COIVAINATDIE_FAINNOINDIES, PPQRY_NEWTABLE43, "A.RONAFAINNIDE", "RONAFAINNIDE", 1, 1, 0, -13997);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_FAINNOINDIES, (new IDVariant(1)), "Fatture Incassate", "", "", -1);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_FAINNOINDIES, (new IDVariant(2)), "Fatture Non Incassate", "", "", -1);
    PAN_COIVAINATDIE.SetValueListItem(PFL_COIVAINATDIE_FAINNOINDIES, (new IDVariant(3)), "Fatture Divenute Esigibili", "", "", -1);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, MyGlb.PANEL_LIST, 284, 124, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_COIVAINATDIE.SetRect(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, MyGlb.PANEL_FORM, 312, 136, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COIVAINATDIE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_COIVAINATDIE.SetNumRow(MyGlb.OBJ_FIELD, PFL_COIVAINATDIE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_COIVAINATDIE.SetFieldPage(PFL_COIVAINATDIE_ELABORA, -1, -1);
    PAN_COIVAINATDIE.SetFieldPanel(PFL_COIVAINATDIE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_COIVAINATDIE_InitQueries()
  {
    StringBuffer SQL;

    PAN_COIVAINATDIE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~ROWNAMBOLDEF~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMBOLDEF~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_COIVAINATDIE.SetQuery(PPQRY_T04, 0, SQL, PFL_COIVAINATDIE_BOLLATDEFINI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as T04DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_REGISTRO = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_COIVAINATDIE.SetQuery(PPQRY_T04, 1, SQL, PFL_COIVAINATDIE_BOLLATDEFINI, "");
    PAN_COIVAINATDIE.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_COIVAINATDIE.SetIMDB(IMDB, "PQRY_NEWTABLE43", true);
    PAN_COIVAINATDIE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_COIVAINATDIE.SetQueryIMDB(PPQRY_NEWTABLE43, IMDBDef10.PQRY_NEWTABLE43_RS, IMDBDef2.TBL_NEWTABLE45);
    JustLoaded = true;
    PAN_COIVAINATDIE.SetFieldPrimaryIndex(PFL_COIVAINATDIE_TIPOREGISTRO, IMDBDef2.FLD_NEWTABLE45_ROWNAMTIPREG);
    PAN_COIVAINATDIE.SetFieldPrimaryIndex(PFL_COIVAINATDIE_BOLLATDEFINI, IMDBDef2.FLD_NEWTABLE45_ROWNAMBOLDEF);
    PAN_COIVAINATDIE.SetFieldPrimaryIndex(PFL_COIVAINATDIE_ORDINAFATTUR, IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFAT);
    PAN_COIVAINATDIE.SetFieldPrimaryIndex(PFL_COIVAINATDIE_ORDINAFATTU1, IMDBDef2.FLD_NEWTABLE45_ROWNAMORDFA1);
    PAN_COIVAINATDIE.SetFieldPrimaryIndex(PFL_COIVAINATDIE_FAPANOPADIES, IMDBDef2.FLD_NEWTABLE45_RONAFAPANPDE);
    PAN_COIVAINATDIE.SetFieldPrimaryIndex(PFL_COIVAINATDIE_FAINNOINDIES, IMDBDef2.FLD_NEWTABLE45_RONAFAINNIDE);
    PAN_COIVAINATDIE.SetMasterTable(0, "NEWTABLE45");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_COIVAINATDIE.Status() == 2)
    {
      int oldListQBE = PAN_COIVAINATDIE.iUseListQBE;
      PAN_COIVAINATDIE.iUseListQBE = 0;
      PAN_COIVAINATDIE.PanelCommand(Glb.PCM_SEARCH);
      PAN_COIVAINATDIE.PanelCommand(Glb.PCM_FIND);
      PAN_COIVAINATDIE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_COIVAINATDIE) PAN_COIVAINATDIE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_COIVAINATDIE) PAN_COIVAINATDIE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_COIVAINATDIE) PAN_COIVAINATDIE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_COIVAINATDIE) PAN_COIVAINATDIE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_COIVAINATDIE) PAN_COIVAINATDIE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
