// **********************************************
// Invio Mandato E Ordinativo Informatico
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InvioMandatoEOrdinativoInformatico extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETINVIO_NEWGROUP = 0;

  private static int PFL_PARAMETINVIO_TIPO = 0;
  private static int PFL_PARAMETINVIO_NUMERODAL = 1;
  private static int PFL_PARAMETINVIO_NUMEROAL = 2;
  private static int PFL_PARAMETINVIO_DATADAL = 3;
  private static int PFL_PARAMETINVIO_DATAAL = 4;
  private static int PFL_PARAMETINVIO_DISTINTAN = 5;
  private static int PFL_PARAMETINVIO_DATARISTAMPA = 6;
  private static int PFL_PARAMETINVIO_NEWPANELLABE = 7;
  private static int PFL_PARAMETINVIO_NEWPANELABE1 = 8;
  private static int PFL_PARAMETINVIO_GROUPLLABEL = 9;
  private static int PFL_PARAMETINVIO_ANOMALBUTTON = 10;
  private static int PFL_PARAMETINVIO_OKBUTTON = 11;
  private static int PFL_PARAMETINVIO_OLDTIPO = 12;

  private static int PPQRY_NEWTABLE51 = 0;

  private static int PPQRY_PARAMETRMINF = 1;


  IDPanel PAN_PARAMETINVIO;

  // Definition of Global Variables
  private IDVariant INIT = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant TIPO = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant IDFLUSSO = new IDVariant(0,IDVariant.STRING);
  private IDVariant VALIDAXML = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETINVIO(IMDB);
    Init_TBL_PARAMEFLUSSO(IMDB);
    //
    //
    Init_PQRY_NEWTABLE51(IMDB);
    Init_PQRY_NEWTABLE51_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETINVIO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETINVIO, 9);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETINVIO, "TBL_PARAMETINVIO");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMDISNUM,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMDATRIS, "ROWNAMDATRIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMDATRIS,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDALD, "ROWNAMEDALD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDALD,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEALD, "ROWNAMEALD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEALD,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMEMANDA,1,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMOLDTIP, "ROWNAMOLDTIP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETINVIO,IMDBDef6.FLD_PARAMETINVIO_ROWNAMOLDTIP,1,49,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETINVIO, 0);
  }

  private static void Init_TBL_PARAMEFLUSSO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMEFLUSSO, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMEFLUSSO, "TBL_PARAMEFLUSSO");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMEFLUSSO,IMDBDef6.FLD_PARAMEFLUSSO_IDFLUSSO, "IDFLUSSO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMEFLUSSO,IMDBDef6.FLD_PARAMEFLUSSO_IDFLUSSO,5,20,0);
  }

  private static void Init_PQRY_NEWTABLE51(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE51, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE51, "PQRY_NEWTABLE51");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS, "ROWNAMDATRIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, "ROWNAMEDALD");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, "ROWNAMEALD");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMOLDTIP, "ROWNAMOLDTIP");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51,IMDBDef15.PQSL_NEWTABLE51_ROWNAMOLDTIP,1,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE51, 0);
  }

  private static void Init_PQRY_NEWTABLE51_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE51_RS, 8);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE51_RS, "PQRY_NEWTABLE51_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS, "ROWNAMDATRIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, "ROWNAMEDALD");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, "ROWNAMEALD");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMOLDTIP, "ROWNAMOLDTIP");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE51_RS,IMDBDef15.PQSL_NEWTABLE51_ROWNAMOLDTIP,1,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InvioMandatoEOrdinativoInformatico(MyWebEntryPoint w, IMDBObj imdb)
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
  public InvioMandatoEOrdinativoInformatico()
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
    FormIdx = MyGlb.FRM_INVMANEORDIN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "07D193DF-EE15-47DB-8C8B-86A3C6CFC229";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 340;
    DesignHeight = 274;
    set_Caption(new IDVariant("Invio Mandato E Ordinativo Informatico"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 340;
    Frames[1].Height = 248;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Invio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 248;
    PAN_PARAMETINVIO = new IDPanel(w, this, 1, "PAN_PARAMETINVIO");
    Frames[1].Content = PAN_PARAMETINVIO;
    PAN_PARAMETINVIO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETINVIO.VS = MainFrm.VisualStyleList;
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 340-MyGlb.PAN_OFFS_X, 248-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1309817B-EDA1-44AE-8022-0A017FC785DB");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1200, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETINVIO.InitStatus = 1;
    PAN_PARAMETINVIO_Init();
    PAN_PARAMETINVIO_InitFields();
    PAN_PARAMETINVIO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETINVIO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INVMANEORDIN_NEWTABLE51();
      }
      PAN_PARAMETINVIO.UpdatePanel(MainFrm);
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
    return (obj instanceof InvioMandatoEOrdinativoInformatico);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InvioMandatoEOrdinativoInformatico.class.getName() : (Glb.ClassWithPackage(InvioMandatoEOrdinativoInformatico.class) ? InvioMandatoEOrdinativoInformatico.class.getName().substring(InvioMandatoEOrdinativoInformatico.class.getPackage().getName().length() + 1) : InvioMandatoEOrdinativoInformatico.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Invio On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETINVIO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETINVIO);
      // 
      // Parametri Invio On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // condizioni di visibilità
      // 
      {
        // 
        // se nuovi mandati o nuovi ordinativi
        // 
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
        {
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      // 
      // nome del gruppo
      // 
      {
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Mandati", IDVariant.STRING));
          PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Ordinativi", IDVariant.STRING));
          PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(2)), true) || IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(6)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Annullamenti", IDVariant.STRING));
          PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(7)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Variazioni", IDVariant.STRING));
          PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(4)), true) || IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(8)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Sostituzioni", IDVariant.STRING));
          PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "ParametriInvioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Invio After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARAMETINVIO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_HEADERCAPTIO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_HEADERCAPTIO = (new IDVariant("Trasmissione a Tesoriere - ", IDVariant.STRING));
      // 
      // Parametri Invio After Find Event Body
      // Procedure Body
      // 
      if (INIT.booleanValue())
      {
        INIT = (new IDVariant(0));
        // 
        // sistemo nome dell Caption, nome delle Label 
        // 
        // 
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
        {
          if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
          {
            IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
            v_NOMECAPTION = (new IDVariant("Mandati", IDVariant.STRING));
            IDVariant v_NOMEGROUPLAB = new IDVariant(0,IDVariant.STRING);
            v_NOMEGROUPLAB = (new IDVariant("Nuovi Mandati", IDVariant.STRING));
            Frames[PAN_PARAMETINVIO.FrIndex].set_Caption(IDL.Add(v_HEADERCAPTIO, v_NOMECAPTION).stringValue());
            PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGROUPLAB).stringValue());
          }
          if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
          {
            IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
            v_NOMECAPTION = (new IDVariant("Ordinativi", IDVariant.STRING));
            IDVariant v_NOMEGROUPLAB = new IDVariant(0,IDVariant.STRING);
            v_NOMEGROUPLAB = (new IDVariant("Ordinativi", IDVariant.STRING));
            Frames[PAN_PARAMETINVIO.FrIndex].set_Caption(IDL.Add(v_HEADERCAPTIO, v_NOMECAPTION).stringValue());
            PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGROUPLAB).stringValue());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "ParametriInvioAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Invio On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETINVIO_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETINVIO, Cancel);
      // 
      // Parametri Invio On Validate Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMOLDTIP, 0), true)!=0)
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEMANDA, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_TMPDAL = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_TMPAL = new IDVariant(0,IDVariant.INTEGER);
          IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0, (new IDVariant(1)));
          v_TMPAL = UltimoMandatoEmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          v_TMPDAL = IDL.Add(UltimoMandatoTrasmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), (new IDVariant(1)));
          if ((IDL.Sub(IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0), (new IDVariant(1)))).equals(IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0), true))
          {
            v_TMPDAL = (new IDVariant());
            v_TMPAL = (new IDVariant());
          }
          IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDAL, 0, IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0));
          IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEAL, 0, IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0));
        }
      }
      // 
      // gestisco oldvalue
      // 
      {
        IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMOLDTIP, 0, IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMETIPO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "ParametriInvioOnValidateRowEvent", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Invio", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEMANDA, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
        v_NOMEGRUPPO = (new IDVariant("Mandati", IDVariant.STRING));
        TIPO = (new IDVariant(1));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0, (new IDVariant(1)));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0, UltimoMandatoEmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0, IDL.Add(UltimoMandatoTrasmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), (new IDVariant(1))));
        if ((IDL.Sub(IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0), (new IDVariant(1)))).equals(IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0), true))
        {
          IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0, (new IDVariant()));
        }
        PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
      }
      else
      {
        IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
        v_NOMEGRUPPO = (new IDVariant("Ordinativi", IDVariant.STRING));
        TIPO = (new IDVariant(5));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0, (new IDVariant(5)));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0, IDL.Add(UltimoOrdinativoTrasmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), (new IDVariant(1))));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0, UltimoOrdinativoEmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        if ((IDL.Sub(IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0), (new IDVariant(1)))).equals(IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0), true))
        {
          IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0, (new IDVariant()));
        }
        PAN_PARAMETINVIO.set_FieldText(PFL_PARAMETINVIO_GROUPLLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
      }
      INIT = (new IDVariant(-1));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMOLDTIP, 0, IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0));
      if (MainFrm.TIPO_MINF.equals((new IDVariant("OPI")), true))
      {
        PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETINVIO.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // Pulisco la tabella per inserire i nuovi flussi elaborati
      // da inviare al documentale
      // 
      LOADEVENT_PARAFLUSDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Flusso: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOADEVENT_PARAFLUSDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef6.TBL_PARAMEFLUSSO);
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
      UNLOADEVENT_PARAINVIDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Invio: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARAINVIDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMDISNUM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMDATRIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDALD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEALD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEMANDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMOLDTIP, 0, new IDVariant());
  }

  // **********************************************************************
  // Ultimo Mandato Trasmesso
  // Explain which processing is carried out by this procedure
  // My Esercizio:  - Input
  // **********************************************************************
  public IDVariant UltimoMandatoTrasmesso (IDVariant MyEsercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ULTIMOMANDAT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Ultimo Mandato Trasmesso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.ULT_MAN_TESO, 0) as NUVAN0ULMAT0 ");
      SQL.append("from ");
      SQL.append("  N04 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(MyEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ULTIMOMANDAT = QV.Get("NUVAN0ULMAT0", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_ULTIMOMANDAT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "UltimoMandatoTrasmesso", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Ultimo Mandato Emesso
  // Explain which processing is carried out by this procedure
  // My Esercizio:  - Input
  // **********************************************************************
  public IDVariant UltimoMandatoEmesso (IDVariant MyEsercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ULTIMOMANDAT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYCODICE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MYCODICE = (new IDVariant("man", IDVariant.STRING));
      // 
      // Ultimo Mandato Emesso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.NUMERO, 0) as NULVALN03NU0 ");
      SQL.append("from ");
      SQL.append("  N03 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(MyEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE = " + IDL.CSql(v_MYCODICE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ULTIMOMANDAT = QV.Get("NULVALN03NU0", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_ULTIMOMANDAT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "UltimoMandatoEmesso", _e);
      return new IDVariant();
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
    IDVariant v_INDIST = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_INDAL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_INAL = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_OUTFILE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IFASE = new IDVariant(0,IDVariant.STRING);
    IDCachedRowSet C25;
    IDCachedRowSet C35;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_CONFERMA1 = new IDVariant(0,IDVariant.STRING);
      v_CONFERMA1 = (new IDVariant("Elaborazione eseguita"));
      IDVariant v_PROGR = new IDVariant(0,IDVariant.INTEGER);
      // 
      // validazione dei parametri
      // 
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).compareTo((new IDVariant(1)), true)!=0 && IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).compareTo((new IDVariant(5)), true)!=0)
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0)))
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Inserire entrambe le date!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            // 
            // 1
            // 
            return 0;
          }
          // 
          // 1
          // 
          if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0), true)>0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Date Incongruenti. La data AL deve essere maggiore alla data DAL!", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            // 
            // 1
            // 
            return 0;
          }
        }
        else
        {
          // 
          // 1
          // 
          v_INDAL = IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDAL, 0);
          v_INAL = IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEAL, 0);
          v_INDIST = IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0);
          if (v_INDAL.equals((new IDVariant(0)), true))
          {
            v_INDAL = (new IDVariant());
          }
          if (v_INAL.equals((new IDVariant(0)), true))
          {
            v_INAL = (new IDVariant());
          }
          if (v_INDIST.equals((new IDVariant(0)), true))
          {
            v_INDIST = (new IDVariant());
          }
        }
      }
      if (!(VALIDAXML.booleanValue()))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        IDFLUSSO = (new IDVariant());
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("MAN_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("MANDATI_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAMANINF(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_INDAL, v_INAL, v_INDIST, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(2)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("ANN_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("ANNULLI_MAN_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAMANINFANN(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(3)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("VAR_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("VARIAZIONI_MAN_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAMANINFVAR(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(4)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("SOS_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("SOSTITUZIONI_MAN_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAMANINFSOS(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("ORD_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("ORDINATIVI_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAORDINF(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDAL, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEAL, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(6)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("ANN_O_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("ANNULLI_ORD_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAORDINFANN(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(7)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("VAR_O_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("VARIAZIONI_ORD_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAORDINFVAR(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(8)), true))
        {
          IDVariant v_TMPFASE = new IDVariant(0,IDVariant.STRING);
          v_TMPFASE = (new IDVariant("SOS_O_INF", IDVariant.STRING));
          IDVariant v_TMPOUTFILE = new IDVariant(0,IDVariant.STRING);
          v_TMPOUTFILE = (new IDVariant("SOSTITUZIONI_ORD_", IDVariant.STRING));
          v_IFASE = new IDVariant(v_TMPFASE);
          v_OUTFILE = new IDVariant(v_TMPOUTFILE);
          MainFrm.Cf4armDBObject.GENERAORDINFSOS(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEDALD, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMEALD, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIONOMINA, 0), IDFLUSSO);
        }
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        ELABORA_PARFLUINSINT();
      }
      if (IDL.IsNull(MainFrm.GENERA_XML))
      {
        IDVariant v_NUMBERROWS = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
        // 
        // scrivo il file
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  WORK_EXPORT_TESO A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NUMBERROWS = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIF_NUM_SQ.nextval as MIFNUMSQ ");
          SQL.append("from ");
          SQL.append("  DUAL A ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_PROGR = QV.Get("MIFNUMSQ", IDVariant.INTEGER) ;
          }
          QV.Close();
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForOutput(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))), (new IDVariant("/"))), v_OUTFILE), IDL.ToString(v_PROGR)), (new IDVariant(".txt"))), v_FD, false); 
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DATI as WOREXPTESDA1, ");
          SQL.append("  A.DATI2 as WOREXPTESDAT, ");
          SQL.append("  A.ORDINAMENTO as WOREXPTESORD ");
          SQL.append("from ");
          SQL.append("  WORK_EXPORT_TESO A ");
          SQL.append("where (A.FASE = " + IDL.CSql(v_IFASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          SQL.append("order by ");
          SQL.append("  A.ORDINAMENTO ");
          C25 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C25.EOF()) C25.MoveNext();
          while (!C25.EOF())
          {
            IDVariant v_TMP = new IDVariant(0,IDVariant.STRING);
            v_TMP = IDL.Add(C25.Get("WOREXPTESDA1"), C25.Get("WOREXPTESDAT"));
            MainFrm.VBFile.WriteLine(v_FD, v_TMP); 
            C25.MoveNext();
          }
          C25.Close();
          MainFrm.VBFile.Close(v_FD); 
          MainFrm.set_RedirectTo(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("temp")), (new IDVariant("/"))), v_OUTFILE), IDL.ToString(v_PROGR)), (new IDVariant(".txt"))));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        }
      }
      else
      {
        if (MainFrm.MODALCREAXML.equals((new IDVariant("servlet")), true))
        {
          IDVariant v_FUNZIOMANINF = new IDVariant(0,IDVariant.STRING);
          v_FUNZIOMANINF = (new IDVariant("MANDATOINFORMATICO?"));
          IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
          v_AVVISO1 = (new IDVariant("Avvio della validazione del File XML generato"));
          IDVariant v_RISPOSTA = null;
          v_RISPOSTA = (new IDVariant());
          if (!(VALIDAXML.booleanValue()))
          {
            if (IDL.NullValue(IDFLUSSO,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
              MainFrm.Cf4armDBObject.MANORDINFSPLITFLUSSO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDFLUSSO);
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                EliminaRecordInvio(IDFLUSSO);
                return 0;
              }
            }
            MainFrm.set_RedirectTo(IDL.Add(MainFrm.SERVLETURL, v_FUNZIOMANINF));
            MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
            MainFrm.set_RedirectFeatures((new IDVariant(""))); 
          }
          if (MainFrm.TIPO_MINF.equals((new IDVariant("OPI")), true))
          {
            v_RISPOSTA = (new IDVariant(MainFrm.MessageConfirmEx(v_AVVISO1, (new IDVariant("OK")))));
            if (!(IDL.IsNull(v_RISPOSTA)))
            {
              VALIDAXML = (new IDVariant(0));
              if (IDL.NullValue(IDFLUSSO,(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && v_RISPOSTA.booleanValue())
              {
                IDVariant v_VVALIDATORE = new IDVariant(0,IDVariant.STRING);
                IDVariant v_PERCORSO = new IDVariant(0,IDVariant.STRING);
                IDVariant v_IDELAB = new IDVariant(0,IDVariant.INTEGER);
                IDVariant v_VPATHASSOLUT = new IDVariant(0,IDVariant.STRING);
                IDVariant v_FILESIZE = new IDVariant(0,IDVariant.INTEGER);
                IDVariant v_MESSAGERRORE = null;
                v_MESSAGERRORE = (new IDVariant());
                IDVariant v_MESSERROFINA = null;
                v_MESSERROFINA = (new IDVariant());
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.VALIDATORE as VALIFILEVALI, ");
                SQL.append("  A.PATH_ASSOLUTO as VALFILPATASS ");
                SQL.append("from ");
                SQL.append("  VALIDAZIONI_FILE A ");
                SQL.append("where (A.ID = 1) ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_VVALIDATORE = QV.Get("VALIFILEVALI", IDVariant.STRING) ;
                  v_VPATHASSOLUT = QV.Get("VALFILPATASS", IDVariant.STRING) ;
                }
                QV.Close();
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  A.ID_IDENTIFICATIVO_FLUSSO as IDIDENTFLUSS, ");
                SQL.append("  A.NOME_FILE as NOMEFILE ");
                SQL.append("from ");
                SQL.append("  ELABORAZIONI_MANORD_INF A ");
                SQL.append("where (INSTR(" + IDL.CSql(IDFLUSSO, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", A.ID_IDENTIFICATIVO_FLUSSO) > 0) ");
                SQL.append("order by ");
                SQL.append("  A.ID_IDENTIFICATIVO_FLUSSO ");
                C35 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!C35.EOF()) C35.MoveNext();
                while (!C35.EOF())
                {
                  v_PERCORSO = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.NullValue(v_VPATHASSOLUT,(new IDVariant(MainFrm.RealPath))), (new IDVariant("/"))), (new IDVariant("mandati"))), (new IDVariant("/"))), (new IDVariant("XML"))), (new IDVariant("/"))), C35.Get("NOMEFILE"));
                  v_FILESIZE = VBFiles.FileLen(v_PERCORSO);
                  if (v_FILESIZE.compareTo((new IDVariant(0)), true)<=0 || IDL.NullValue(C35.Get("NOMEFILE"),(new IDVariant(""))).equals((new IDVariant("")), true))
                  {
                    IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                    v_AVVISO = (new IDVariant("Il file XML non è stato creato"));
                    MainFrm.set_AlertMessage(v_AVVISO); 
                    EliminaRecordInvio(IDFLUSSO);
                    return 0;
                  }
                  else if (v_FILESIZE.compareTo(MainFrm.DIMMAXFILE, true)>0)
                  {
                    IDVariant v_AVVISOSIZE = new IDVariant(0,IDVariant.STRING);
                    v_AVVISOSIZE = (new IDVariant("Il file creato supera la dimensione massima consentita dal Siope +. Diminuire il numero massimo di dettagli da inserire in un flusso."));
                    IDVariant v_DIMENSIOFILE = new IDVariant(0,IDVariant.STRING);
                    v_DIMENSIOFILE = (new IDVariant("Dimensione File: "));
                    IDVariant v_LIMITE = new IDVariant(0,IDVariant.STRING);
                    v_LIMITE = (new IDVariant("Limite: "));
                    MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_AVVISOSIZE, (new IDVariant("<BR/>"))), v_DIMENSIOFILE), IDL.ToString(v_FILESIZE)), (new IDVariant("<BR/>"))), v_LIMITE), IDL.ToString(MainFrm.DIMMAXFILE))); 
                    EliminaRecordInvio(IDFLUSSO);
                    return 0;
                  }
                  if (MainFrm.VALIDAZIFILE.equals((new IDVariant("SI")), true))
                  {
                    try
                    {
                      XMLDoc v_XML = null;
                      v_XML = (XMLDoc)new XMLDoc();
                      v_XML.Load(v_PERCORSO.stringValue(), (new IDVariant(0)).intValue()); 
                      v_XML.Validate(IDL.Add(IDL.Add(IDL.NullValue(v_VPATHASSOLUT,(new IDVariant(MainFrm.RealPath))), (new IDVariant("/"))), v_VVALIDATORE).stringValue()); 
                    }
                    catch (Exception e42)
                    {
                      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                      v_AVVISO = (new IDVariant("Attenzione! Errore nella validazione del file XML generato "));
                      MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(v_AVVISO, C35.Get("NOMEFILE")), (new IDVariant("<BR/>"))), new IDVariant(e42.getMessage()))); 
                      EliminaRecordInvio(IDFLUSSO);
                      return 0;
                    }
                  }
                  if (IDL.NullValue(MainFrm.SIOPELINK,(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
                  {
                    if (IDL.NullValue(C35.Get("IDIDENTFLUSS"),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
                    {
                      v_IDELAB = IDL.ToInteger(IDL.SubStr(C35.Get("IDIDENTFLUSS"), IDL.Sub(IDL.Length(C35.Get("IDIDENTFLUSS")), (new IDVariant(10)))));
                    }
                    v_MESSAGERRORE = MainFrm.InvioFileSiopeLink(new IDVariant(v_IDELAB,IDVariant.DECIMAL));
                  }
                  if (!(IDL.IsNull(v_MESSAGERRORE)))
                  {
                    v_MESSERROFINA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSERROFINA, (new IDVariant("<BR/>"))), C35.Get("NOMEFILE")), (new IDVariant("<BR/>"))), v_MESSAGERRORE), (new IDVariant("<BR/>")));
                  }
                  C35.MoveNext();
                }
                C35.Close();
                if (!(IDL.IsNull(v_MESSERROFINA)))
                {
                  MainFrm.set_AlertMessage(v_MESSERROFINA); 
                  return 0;
                }
              }
            }
            else
            {
              VALIDAXML = (new IDVariant(-1));
              return 0;
            }
          }
        }
      }
      MainFrm.set_AlertMessage(v_CONFERMA1); 
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_TESO ");
      SQL.append("where (FASE = " + IDL.CSql(v_IFASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Flusso: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void ELABORA_PARFLUINSINT() throws SQLException
  {
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMEFLUSSO, 0);
    IMDB.set_Value(IMDBDef6.TBL_PARAMEFLUSSO, IMDBDef6.FLD_PARAMEFLUSSO_IDFLUSSO, 0, IDFLUSSO);
  }

  // **********************************************************************
  // Anomalie
  // **********************************************************************
  public int Anomalie ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Anomalie Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEMANDA, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI599, IMDBDef6.FLD_PARAMETRI599_PARAMTIPO, 0, (new IDVariant("M")));
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI599, IMDBDef6.FLD_PARAMETRI599_PARAMTIPO, 0, (new IDVariant("R")));
      }
      MainFrm.Show(MyGlb.FRM_ANOMALIINVIO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "Anomalie", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Ultimo Ordinativo Trasmesso
  // Explain which processing is carried out by this procedure
  // My Esercizio:  - Input
  // **********************************************************************
  public IDVariant UltimoOrdinativoTrasmesso (IDVariant MyEsercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ULTIMOORDINA = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Ultimo Ordinativo Trasmesso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.ULT_ORD_TESO, 0) as NUVAN0ULORT0 ");
      SQL.append("from ");
      SQL.append("  N04 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(MyEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ULTIMOORDINA = QV.Get("NUVAN0ULORT0", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_ULTIMOORDINA;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "UltimoOrdinativoTrasmesso", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Ultimo Ordinativo Emesso
  // Explain which processing is carried out by this procedure
  // My Esercizio:  - Input
  // **********************************************************************
  public IDVariant UltimoOrdinativoEmesso (IDVariant MyEsercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ULTIMOMANDAT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MYCODICE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MYCODICE = (new IDVariant("ord", IDVariant.STRING));
      // 
      // Ultimo Ordinativo Emesso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.NUMERO, 0) as NULVALN03NU0 ");
      SQL.append("from ");
      SQL.append("  N03 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(MyEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE = " + IDL.CSql(v_MYCODICE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ULTIMOMANDAT = QV.Get("NULVALN03NU0", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_ULTIMOMANDAT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "UltimoOrdinativoEmesso", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // If
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETINVIO_DISTINTAN_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DATA = new IDVariant(0,IDVariant.DATETIME);

    try
    {
      TransCount = 0;
      // 
      // If Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0)))
      {
        IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS, 0, (new IDVariant()));
      }
      else
      {
        if (IMDB.Value(IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0).equals((new IDVariant(5)), true))
        {
          if (OrdRistampaDist(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0)).equals((new IDVariant(1)), true))
          {
            if (DataRistampaOrd(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0), v_DATA).equals((new IDVariant(0)), true))
            {
              IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS, 0, new IDVariant(v_DATA));
            }
          }
          else
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Distinta non esistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS, 0, (new IDVariant()));
            // 
            // 1
            // 
            return;
          }
        }
        else
        {
          if (ManRistampaDist(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0)).equals((new IDVariant(1)), true))
          {
            if (DataRistampaMan(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0), v_DATA).equals((new IDVariant(0)), true))
            {
              IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS, 0, new IDVariant(v_DATA));
            }
          }
          else
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Distinta non esistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDISNUM, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE51, IMDBDef15.PQSL_NEWTABLE51_ROWNAMDATRIS, 0, (new IDVariant()));
            // 
            // 1
            // 
            return;
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "If", _e);
    }
  }

  // **********************************************************************
  // Ord Ristampa Dist
  // Explain which processing is carried out by this procedure
  // anno - Input
  // numeroElenco - Input
  // **********************************************************************
  public IDVariant OrdRistampaDist (IDVariant anno, IDVariant numeroElenco)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Ord Ristampa Dist Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ORD A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(anno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(numeroElenco, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "OrdRistampaDist", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Data Ristampa Ord
  // controllare se gestire errore
  // esercizio 1 - Input
  // numero 1 - Input
  // Data - Input/Output
  // **********************************************************************
  public IDVariant DataRistampaOrd (IDVariant esercizio1, IDVariant numero1, IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Data Ristampa Ord Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.D_DATA_ELENCO) as MINORDDDATEL ");
      SQL.append("from ");
      SQL.append("  ORD A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(esercizio1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(numero1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        Data.set(QV.Get("MINORDDDATEL", IDVariant.DATETIME));
      }
      QV.Close();
      return (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "DataRistampaOrd", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Man Ristampa Dist
  // Explain which processing is carried out by this procedure
  // anno - Input
  // numeroElenco - Input
  // **********************************************************************
  public IDVariant ManRistampaDist (IDVariant anno, IDVariant numeroElenco)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Man Ristampa Dist Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(anno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(numeroElenco, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "ManRistampaDist", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Data Ristampa Man
  // controllare se gestire errore
  // esercizio 1 - Input
  // numero 1 - Input
  // Data - Input/Output
  // **********************************************************************
  public IDVariant DataRistampaMan (IDVariant esercizio1, IDVariant numero1, IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Data Ristampa Man Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.D_DATA_ELENCO) as MINMANDDATEL ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(esercizio1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(numero1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        Data.set(QV.Get("MINMANDDATEL", IDVariant.DATETIME));
      }
      QV.Close();
      return (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "DataRistampaMan", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Elimina Record Invio
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // ID Flusso:  - Input
  // **********************************************************************
  public int EliminaRecordInvio (IDVariant IDFlusso)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C2;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Elimina Record Invio Body
      // Corpo Procedura
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ID_IDENTIFICATIVO_FLUSSO as IDIDENTFLUSS ");
      SQL.append("from ");
      SQL.append("  ELABORAZIONI_MANORD_INF A ");
      SQL.append("where (INSTR(" + IDL.CSql(IDFlusso, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", A.ID_IDENTIFICATIVO_FLUSSO) > 0) ");
      SQL.append("order by ");
      SQL.append("  A.ID_IDENTIFICATIVO_FLUSSO ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  A.IDENTIFICATIVO_TESTATA as MANINFSUIDTE, ");
        SQL.append("  A.PROGRESSIVO_TESO as MANINFSUPRTE ");
        SQL.append("from ");
        SQL.append("  MAN_INF_SUB A ");
        SQL.append("where (A.ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        C3 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C3.EOF()) C3.MoveNext();
        while (!C3.EOF())
        {
          SQL = new StringBuffer();
          SQL.append("update RETFAT set ");
          SQL.append("  ID_MAN_INF = to_number(NULL), ");
          SQL.append("  PROGRESSIVO_TESO = to_number(NULL), ");
          SQL.append("  ANNO_MAND = to_number(NULL), ");
          SQL.append("  NUMERO_MAND = to_number(NULL), ");
          SQL.append("  IMPORTO_MANINF = to_number(NULL) ");
          SQL.append("where (ID_MAN_INF = " + IDL.CSql(C3.Get("MANINFSUIDTE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (PROGRESSIVO_TESO = " + IDL.CSql(C3.Get("MANINFSUPRTE"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          C3.MoveNext();
        }
        C3.Close();
        SQL = new StringBuffer();
        SQL.append("delete from MAN_ORD_INF_SEP ");
        SQL.append("where (IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from ELABORAZIONI_MANORD_INF ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from MAN_INF_STATO ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from MAN_INF_TESTATA ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from MAN_INF_SUB ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from MAN_INF_SUB_ORD_ASS ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from MAN_INF_SUB_SIOPE ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from MAN_INF_SUB_SOSP ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from ORD_INF_STATO ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from ORD_INF_TESTATA ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from ORD_INF_SUB ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from ORD_INF_SUB_MAN_ASS ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from ORD_INF_SUB_SIOPE ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from ORD_INF_SUB_SOSP ");
        SQL.append("where (ID_IDENTIFICATIVO_FLUSSO = " + IDL.CSql(C2.Get("IDIDENTFLUSS"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        ELIMRECOINVI_PARAFLUSDELE(IDFlusso);
        C2.MoveNext();
      }
      C2.Close();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InvioMandatoEOrdinativoInformatico", "EliminaRecordInvio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Flusso: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ELIMRECOINVI_PARAFLUSDELE(IDVariant IDFlusso) throws SQLException
  {
    boolean bDeleted = false;

    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMEFLUSSO, 0);
    while (!IMDB.Eof(IMDBDef6.TBL_PARAMEFLUSSO, 0))
    {
      bDeleted = false;
      if (IDL.Find(IDFlusso, IMDB.Value(IMDBDef6.TBL_PARAMEFLUSSO, IMDBDef6.FLD_PARAMEFLUSSO_IDFLUSSO, 0)).compareTo((new IDVariant(0)), true)>0)
      {
        IMDB.TblDelete(IMDBDef6.TBL_PARAMEFLUSSO, 0);
        bDeleted = true;
      }
      if (!bDeleted) IMDB.TblMoveNext(IMDBDef6.TBL_PARAMEFLUSSO, 0);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void INVMANEORDIN_NEWTABLE51() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE51_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETINVIO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETINVIO, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE51_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE51_RS, 0, IMDBDef6.TBL_PARAMETINVIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 0, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 1, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 2, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMDISNUM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 3, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMDATRIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 4, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDALD, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 5, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEALD, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 6, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE51_RS, 7, 0, IMDBDef6.TBL_PARAMETINVIO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMOLDTIP, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETINVIO, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETINVIO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETINVIO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE51_RS, 0);
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
  private void PAN_PARAMETINVIO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETINVIO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAMETINVIO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETINVIO_ANOMALBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETINVIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Anomalie();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETINVIO_OKBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETINVIO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETINVIO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETINVIO_DISTINTAN)
      {
        PFL_PARAMETINVIO_DISTINTAN_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETINVIO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETINVIO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETINVIO_Init()
  {

    PAN_PARAMETINVIO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETINVIO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, "3C6BE51E-9C0D-41DF-9F07-00AB6446820E");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, "New Group");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, MyGlb.PANEL_LIST, 0, -9999, 256, 0, 0, 0);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, MyGlb.PANEL_FORM, 12, 48, 280, 112, 0, 0);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, 0, 60);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, 1, 13);
    PAN_PARAMETINVIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, 0, 1);
    PAN_PARAMETINVIO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, 1, 1);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETINVIO_NEWGROUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETINVIO.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, "179FC384-CD67-4ED5-AD19-A4E14E68B5E8");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, "Tipo");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, "ECE8025C-918E-4B0F-8C1E-FCA73A391815");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, "Dal");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, "04786DED-F796-4AB9-B8C4-16E65788F7DF");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, "Al");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, "0DDB03D1-A1E5-48CD-9139-E24189F71302");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, "Dal");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, "9F9FCB5A-A238-45E9-90A4-85D14F1DF32F");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, "Al");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, "695C8590-F961-4422-B03A-A036124106AA");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, "Distinta n.");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, "1E8DB801-652D-435B-9F80-4254DBB897A1");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, "DATA RISTAMPA");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, "4C5D9A26-754B-41D5-9CDD-B9775F3302E0");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, "46E3F3FD-D739-483E-A74A-6282021AFD97");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, "44648FC7-EF2F-48C7-ABD7-397F9559B51D");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, "Group Label");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, "CC4F07FD-4999-4D8F-994B-C36FC0A64D5E");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, "Anomalie");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETINVIO.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, 0, "button1.gif", false);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, "4D511327-3781-4776-833B-14FF8B0B7028");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, "OK");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETINVIO.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, 0, "button1.gif", false);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETINVIO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, "15651A22-2600-402C-BA2B-283AE8564E13");
    PAN_PARAMETINVIO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, "OLD TIPO");
    PAN_PARAMETINVIO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, "");
    PAN_PARAMETINVIO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETINVIO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETINVIO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_FORM, 16, 12, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_FORM, 32);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_TIPO, -1, -1);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_TIPO, PPQRY_NEWTABLE51, "A.ROWNAMETIPO", "ROWNAMETIPO", 1, 49, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_FORM, 60, 96, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMERODAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_NUMERODAL, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_NUMERODAL, PPQRY_NEWTABLE51, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 5, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_LIST, 72, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_FORM, 184, 96, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NUMEROAL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_NUMEROAL, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_NUMEROAL, PPQRY_NEWTABLE51, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_FORM, 60, 96, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATADAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_DATADAL, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_DATADAL, PPQRY_NEWTABLE51, "A.ROWNAMEDALD", "ROWNAMEDALD", 6, 49, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_FORM, 184, 96, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATAAL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_DATAAL, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_DATAAL, PPQRY_NEWTABLE51, "A.ROWNAMEALD", "ROWNAMEALD", 6, 49, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_LIST, 136, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_LIST, "Dist. n");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_FORM, 20, 124, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_FORM, 68);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DISTINTAN, MyGlb.PANEL_FORM, "Distinta n.");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_DISTINTAN, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_DISTINTAN, PPQRY_NEWTABLE51, "A.ROWNAMDISNUM", "ROWNAMDISNUM", 1, 5, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_LIST, "DATA RISTAMPA");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_FORM, 148, 124, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_DATARISTAMPA, MyGlb.PANEL_FORM, "DT. RISTAMPA");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_DATARISTAMPA, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_DATARISTAMPA, PPQRY_NEWTABLE51, "A.ROWNAMDATRIS", "ROWNAMDATRIS", 6, 49, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, MyGlb.PANEL_LIST, 28, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, MyGlb.PANEL_FORM, 16, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_NEWPANELLABE, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, MyGlb.PANEL_LIST, 36, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, MyGlb.PANEL_FORM, 276, 144, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_NEWPANELABE1, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, MyGlb.PANEL_LIST, 32, 12, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, MyGlb.PANEL_FORM, 32, 52, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_GROUPLLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_GROUPLLABEL, -1, GRP_PARAMETINVIO_NEWGROUP);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_GROUPLLABEL, -1, "", "GROUPLLABEL", 0, 0, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, MyGlb.PANEL_LIST, 24, 136, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, MyGlb.PANEL_FORM, 124, 172, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_ANOMALBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_ANOMALBUTTON, -1, -1);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_ANOMALBUTTON, -1, "", "ANOMALBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, MyGlb.PANEL_LIST, 16, 128, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, MyGlb.PANEL_FORM, 212, 172, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OKBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_OKBUTTON, -1, -1);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_OKBUTTON, -1, "", "OKBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_LIST, "OLD TIPO");
    PAN_PARAMETINVIO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_FORM, 4, 192, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETINVIO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETINVIO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETINVIO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETINVIO_OLDTIPO, MyGlb.PANEL_FORM, "OLD TP.");
    PAN_PARAMETINVIO.SetFieldPage(PFL_PARAMETINVIO_OLDTIPO, -1, -1);
    PAN_PARAMETINVIO.SetFieldPanel(PFL_PARAMETINVIO_OLDTIPO, PPQRY_NEWTABLE51, "A.ROWNAMOLDTIP", "ROWNAMOLDTIP", 1, 49, 0, -13997);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(1)), "Nuovi Mandati ", "Nuovi Mandati ", "", -1);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(2)), "Annullamenti Mandati", "Annullamenti", "", -1);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(3)), "Variazioni Mandati", "Variazioni", "", -1);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(4)), "Sostituzioni Mandati", "Sostituzioni", "", -1);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(5)), "Nuovi Ordinativi", "Nuovi Ordinativi", "", -1);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(6)), "Annullamenti Ordinativi", "Annullamenti", "", -1);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(7)), "Variazioni Ordinativi", "Variazioni", "", -1);
    PAN_PARAMETINVIO.SetValueListItem(PFL_PARAMETINVIO_OLDTIPO, (new IDVariant(8)), "Sostituzioni Ordinativi", "Sostituzioni", "", -1);
  }

  private void PAN_PARAMETINVIO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETINVIO.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  2 as PARMINNEWEXP, ");
    SQL.append("  'Annullamenti' as PARMINNEWEX1 ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF A ");
    SQL.append("where (~~ROWNAMETIPO~~ = 2) ");
    SQL.append("and   (A.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  3, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF B ");
    SQL.append("where (~~ROWNAMETIPO~~ = 3) ");
    SQL.append("and   (B.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  4, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF C ");
    SQL.append("where (~~ROWNAMETIPO~~ = 4) ");
    SQL.append("and   (C.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  1, ");
    SQL.append("  'Nuovi Mandati' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF D ");
    SQL.append("where (~~ROWNAMETIPO~~ = 1) ");
    SQL.append("and   (~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  6, ");
    SQL.append("  'Annullamenti' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF E ");
    SQL.append("where (~~ROWNAMETIPO~~ = 6) ");
    SQL.append("and   (E.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  7, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF F ");
    SQL.append("where (~~ROWNAMETIPO~~ = 6) ");
    SQL.append("and   (F.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  8, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF G ");
    SQL.append("where (~~ROWNAMETIPO~~ = 8) ");
    SQL.append("and   (G.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  5, ");
    SQL.append("  'Nuovi Ordinativi' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF H ");
    SQL.append("where (~~ROWNAMETIPO~~ = 5) ");
    SQL.append("and   (~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    PAN_PARAMETINVIO.SetQuery(PPQRY_PARAMETRMINF, 0, SQL, PFL_PARAMETINVIO_TIPO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  2 as PARMINNEWEXP, ");
    SQL.append("  'Annullamenti' as PARMINNEWEX1 ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF A ");
    SQL.append("where (A.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  3, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF B ");
    SQL.append("where (B.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  4, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF C ");
    SQL.append("where (C.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  1, ");
    SQL.append("  'Nuovi Mandati' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF D ");
    SQL.append("where (~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  6, ");
    SQL.append("  'Annullamenti' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF E ");
    SQL.append("where (E.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  7, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF F ");
    SQL.append("where (F.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  8, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF G ");
    SQL.append("where (G.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  5, ");
    SQL.append("  'Nuovi Ordinativi' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF H ");
    SQL.append("where (~~TBL_PARAMETINVIO.ROWNAMEMANDA~~ = 2) ");
    PAN_PARAMETINVIO.SetQuery(PPQRY_PARAMETRMINF, 1, SQL, PFL_PARAMETINVIO_TIPO, "");
    PAN_PARAMETINVIO.SetQueryDB(PPQRY_PARAMETRMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETINVIO.SetIMDB(IMDB, "PQRY_NEWTABLE51", true);
    PAN_PARAMETINVIO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETINVIO.SetQueryIMDB(PPQRY_NEWTABLE51, IMDBDef15.PQRY_NEWTABLE51_RS, IMDBDef6.TBL_PARAMETINVIO);
    JustLoaded = true;
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_TIPO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMETIPO);
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_NUMERODAL, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDAL);
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_NUMEROAL, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEAL);
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_DATADAL, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEDALD);
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_DATAAL, IMDBDef6.FLD_PARAMETINVIO_ROWNAMEALD);
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_DISTINTAN, IMDBDef6.FLD_PARAMETINVIO_ROWNAMDISNUM);
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_DATARISTAMPA, IMDBDef6.FLD_PARAMETINVIO_ROWNAMDATRIS);
    PAN_PARAMETINVIO.SetFieldPrimaryIndex(PFL_PARAMETINVIO_OLDTIPO, IMDBDef6.FLD_PARAMETINVIO_ROWNAMOLDTIP);
    PAN_PARAMETINVIO.SetMasterTable(0, "PARAMETINVIO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETINVIO.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETINVIO.iUseListQBE;
      PAN_PARAMETINVIO.iUseListQBE = 0;
      PAN_PARAMETINVIO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETINVIO.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETINVIO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETINVIO) PAN_PARAMETINVIO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETINVIO) PAN_PARAMETINVIO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETINVIO) PAN_PARAMETINVIO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETINVIO) PAN_PARAMETINVIO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETINVIO) PAN_PARAMETINVIO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETINVIO) PAN_PARAMETINVIO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
