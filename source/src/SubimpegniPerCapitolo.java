// **********************************************
// Subimpegni Per Capitolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SubimpegniPerCapitolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SUBPERVOCPEG_UNO = 0;
  private static int GRP_SUBPERVOCPEG_DUE = 1;

  private static int PFL_SUBPERVOCPEG_CAPITOLO = 0;
  private static int PFL_SUBPERVOCPEG_ARTICOLO = 1;
  private static int PFL_SUBPERVOCPEG_COMPETENZE = 2;
  private static int PFL_SUBPERVOCPEG_ANNORESIDUO = 3;
  private static int PFL_SUBPERVOCPEG_SOLOPROVVISO = 4;
  private static int PFL_SUBPERVOCPEG_SOLODISPONIB = 5;
  private static int PFL_SUBPERVOCPEG_NEWPANELLAB1 = 6;
  private static int PFL_SUBPERVOCPEG_DATAELABORAZ = 7;
  private static int PFL_SUBPERVOCPEG_ELABORA = 8;
  private static int PFL_SUBPERVOCPEG_APRI = 9;
  private static int PFL_SUBPERVOCPEG_INFO = 10;
  private static int PFL_SUBPERVOCPEG_NEWPANELABE1 = 11;

  private static int PPQRY_SUBPERVOCPE1 = 0;


  IDPanel PAN_SUBPERVOCPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_SUBPERVOCPE3(IMDB);
    //
    //
    Init_PQRY_SUBPERVOCPE1(IMDB);
    Init_PQRY_SUBPERVOCPE1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_SUBPERVOCPE3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_SUBPERVOCPE3, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_SUBPERVOCPE3, "TBL_SUBPERVOCPE3");
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLPRO, "ROWNAMSOLPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPE3,IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECOMPE,12,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_SUBPERVOCPE3, 0);
  }

  private static void Init_PQRY_SUBPERVOCPE1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBPERVOCPE1, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBPERVOCPE1, "PQRY_SUBPERVOCPE1");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLPRO, "ROWNAMSOLPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECOMPE,12,1,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_SUBPERVOCPE1, 0);
  }

  private static void Init_PQRY_SUBPERVOCPE1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS, "PQRY_SUBPERVOCPE1_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLPRO, "ROWNAMSOLPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE1_RS,IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECOMPE,12,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SubimpegniPerCapitolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public SubimpegniPerCapitolo()
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
    FormIdx = MyGlb.FRM_SUBIMPERCAPI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "167D8B64-6EBD-47F9-8093-CDCF5E4C3184";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 488;
    DesignHeight = 306;
    set_Caption(new IDVariant("Subimpegni Per Capitolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 488;
    Frames[1].Height = 280;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Subimpegni Per Voce P E G";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 280;
    PAN_SUBPERVOCPEG = new IDPanel(w, this, 1, "PAN_SUBPERVOCPEG");
    Frames[1].Content = PAN_SUBPERVOCPEG;
    PAN_SUBPERVOCPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SUBPERVOCPEG.VS = MainFrm.VisualStyleList;
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 488-MyGlb.PAN_OFFS_X, 280-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ABA6C42F-3496-411C-8B5F-F0C985558075");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 476, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SUBPERVOCPEG.InitStatus = 2;
    PAN_SUBPERVOCPEG_Init();
    PAN_SUBPERVOCPEG_InitFields();
    PAN_SUBPERVOCPEG_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_SUBPERVOCPE3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SUBIMPERCAPI_SUBPERVOCPE1();
      }
      PAN_SUBPERVOCPEG.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_SUBPERVOCPEG.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBPERVOCPEG_APRI) {
      }
    }
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
    return (obj instanceof SubimpegniPerCapitolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SubimpegniPerCapitolo.class.getName() : (Glb.ClassWithPackage(SubimpegniPerCapitolo.class) ? SubimpegniPerCapitolo.class.getName().substring(SubimpegniPerCapitolo.class.getPackage().getName().length() + 1) : SubimpegniPerCapitolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Peg
  // **********************************************************************
  public int ApriPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "ApriPeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Peg
  // **********************************************************************
  public int InfoPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "InfoPeg", _e);
      return -1;
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
      if ((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0)))))
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("RES_COMP"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("DATA_ELAB"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("SOLO_DISP"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("SOLO_PROV"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("DETT_RIEP"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("CAPITOLO"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("ARTICOLO"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("ANNO_RES"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("SubImpegni_per_VocePeg"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECOMPE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMDATELA, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLDIS, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMSOLPRO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, (new IDVariant("M")));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMANNRES, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper((new IDVariant("DISP_EFFETTIVA")), ((MainFrm.DispEffImpDaGE4())?(new IDVariant("SI")):(new IDVariant("NO"))));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Capitolo incompleto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "Elabora", _e);
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
    IDVariant v_ST = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ST = (new IDVariant("SubImpegni per ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(v_ST, (new IDVariant("Capitolo "))), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLPRO, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLDIS, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECOMPE, 0, (new IDVariant("C")));
      PAN_SUBPERVOCPEG.set_Header(Glb.OBJ_GROUP,GRP_SUBPERVOCPEG_UNO,(new IDVariant("")).stringValue()); 
      PAN_SUBPERVOCPEG.set_Header(Glb.OBJ_GROUP,GRP_SUBPERVOCPEG_DUE,(new IDVariant("")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMANNRES, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Voce P E G On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SUBPERVOCPEG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SUBPERVOCPEG);
      // 
      // Subimpegni Per Voce P E G On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECOMPE, 0).equals((new IDVariant("C")), true))
      {
        PAN_SUBPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SUBPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0))))
      {
        PAN_SUBPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SUBPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "SubimpegniPerVocePEGOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Voce P E G On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_SUBPERVOCPEG_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Subimpegni Per Voce P E G On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_SUBPERVOCPEG_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_SUBPERVOCPEG_ARTICOLO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0))))
        {
          if (!(MainFrm.EsistenzaCapitolo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0), (new IDVariant("SI")))))
          {
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECAPIT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMEARTIC, 0, (new IDVariant()));
          }
        }
      }
      if (IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE1, IMDBDef16.PQSL_SUBPERVOCPE1_ROWNAMECOMPE, 0).equals((new IDVariant("C")), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMANNRES, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerCapitolo", "SubimpegniPerVocePEGOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Voce P E G
  // Primary record source for panel data
  // **********************************************************************
  private void SUBIMPERCAPI_SUBPERVOCPE1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_SUBPERVOCPE1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_SUBPERVOCPE3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_SUBPERVOCPE3, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 0, IMDBDef6.TBL_SUBPERVOCPE3, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 0, 0, IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 1, 0, IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 2, 0, IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMANNRES, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 3, 0, IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 4, 0, IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 5, 0, IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLDIS, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 6, 0, IMDBDef6.TBL_SUBPERVOCPE3, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECOMPE, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_SUBPERVOCPE3, 0);
      if (IMDB.Eof(IMDBDef6.TBL_SUBPERVOCPE3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_SUBPERVOCPE3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_SUBPERVOCPE1_RS, 0);
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
  private void PAN_SUBPERVOCPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SUBPERVOCPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SUBPERVOCPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SUBPERVOCPEG, Cancel);
    // Stub
  }

  private void PAN_SUBPERVOCPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SUBPERVOCPEG_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SUBPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBPERVOCPEG_APRI)
    {
      this.IdxPanelActived = this.PAN_SUBPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBPERVOCPEG_INFO)
    {
      this.IdxPanelActived = this.PAN_SUBPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SUBPERVOCPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SUBPERVOCPEG_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SUBPERVOCPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SUBPERVOCPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SUBPERVOCPEG_Init()
  {

    PAN_SUBPERVOCPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SUBPERVOCPEG.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, "D5B5D1C9-0D26-4554-A0F7-BFBC0638DEC6");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, "uno");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, MyGlb.PANEL_LIST, 0, -9999, 272, 16, 0, 0);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, MyGlb.PANEL_FORM, 8, 31, 232, 97, 0, 0);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, 0, 21);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, 1, 13);
    PAN_SUBPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, 0, 4);
    PAN_SUBPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, 1, 4);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_UNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, "4C3F0153-3E92-4C37-85D0-601EF966F1F0");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, "due");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, MyGlb.PANEL_LIST, 416, -9999, 80, 16, 0, 0);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, MyGlb.PANEL_FORM, 248, 31, 128, 97, 0, 0);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, 0, 21);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, 1, 13);
    PAN_SUBPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, 0, 4);
    PAN_SUBPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, 1, 4);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBPERVOCPEG_DUE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBPERVOCPEG.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, "768FFB6D-5E24-4D96-A639-E51C95505E02");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, "Capitolo/Art.");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, "0404B072-8E7B-48AC-907E-633F1C775F55");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, "Articolo");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, "91F97454-1360-4F0E-8AD8-FDACB5F47540");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, "Competenze");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, "A9A64682-23C4-4280-90C9-0D9622657FF6");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, "Anno Residuo");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, "F722CD2B-9224-4572-8B68-77CC1B141038");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, "Solo Provvisori");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.VIS_CHECKSTYLE);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, "AB87E679-DF2E-4B55-88FF-B5CF36152BEF");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, "Solo Disponibili");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.VIS_CHECKSTYLE);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, "B5B1A087-C917-40DE-8247-E311735B228C");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, "D93C12B7-8037-42FE-854E-3390F68F7466");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, "Data Elaborazione");
    PAN_SUBPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, "C1871FA2-3413-4652-96BA-FBCCF8A86525");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, "Elabora");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SUBPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, 0, "button1.gif", false);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, "58433E8F-3C71-4DE8-8B28-9FE799ECA385");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SUBPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, 0, "wsearch.gif", false);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, "58F16BBC-4E7E-480D-9A57-72B9A5322185");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, "");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SUBPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, 0, "info.gif", false);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, "98E4ED56-ECD5-4C7D-A404-D5D4BE1DC275");
    PAN_SUBPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, "/");
    PAN_SUBPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, MyGlb.VIS_VUOTONORMALE);
    PAN_SUBPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_SUBPERVOCPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 88, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo Art");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 4, 4, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 92);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_CAPITOLO, -1, -1);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_CAPITOLO, PPQRY_SUBPERVOCPE1, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 256, 4, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 112);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_ARTICOLO, -1, -1);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_ARTICOLO, PPQRY_SUBPERVOCPE1, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_LIST, 68);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_LIST, "Compet.");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_FORM, 12, 56, 88, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_FORM, 68);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_FORM, 5);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_COMPETENZE, MyGlb.PANEL_FORM, "Compet.");
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_COMPETENZE, -1, GRP_SUBPERVOCPEG_UNO);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_COMPETENZE, PPQRY_SUBPERVOCPE1, "A.ROWNAMECOMPE", "ROWNAMECOMPE", 12, 1, 0, -13997);
    PAN_SUBPERVOCPEG.SetValueListItem(PFL_SUBPERVOCPEG_COMPETENZE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_SUBPERVOCPEG.SetValueListItem(PFL_SUBPERVOCPEG_COMPETENZE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_SUBPERVOCPEG.SetValueListItem(PFL_SUBPERVOCPEG_COMPETENZE, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 232, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 76);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, "A. Rs.");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 92, 60, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 96);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, "Anno Residuo");
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_ANNORESIDUO, -1, GRP_SUBPERVOCPEG_UNO);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_ANNORESIDUO, PPQRY_SUBPERVOCPE1, "A.ROWNAMANNRES", "ROWNAMANNRES", 1, 4, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, 416, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, 80);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, "S. Pr.");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, 252, 56, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, 96);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, "Solo Provvisori");
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_SOLOPROVVISO, -1, GRP_SUBPERVOCPEG_DUE);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_SOLOPROVVISO, PPQRY_SUBPERVOCPE1, "A.ROWNAMSOLPRO", "ROWNAMSOLPRO", 5, 1, 0, -13997);
    PAN_SUBPERVOCPEG.SetValueListItem(PFL_SUBPERVOCPEG_SOLOPROVVISO, (new IDVariant("S")), "S", "", "", -1);
    PAN_SUBPERVOCPEG.SetValueListItem(PFL_SUBPERVOCPEG_SOLOPROVVISO, (new IDVariant("N")), "N", "", "", -1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 456, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 80);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, "S. Ds.");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 252, 80, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 96);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, "Solo Disponibili");
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_SOLODISPONIB, -1, GRP_SUBPERVOCPEG_DUE);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_SOLODISPONIB, PPQRY_SUBPERVOCPE1, "A.ROWNAMSOLDIS", "ROWNAMSOLDIS", 5, 1, 0, -13997);
    PAN_SUBPERVOCPEG.SetValueListItem(PFL_SUBPERVOCPEG_SOLODISPONIB, (new IDVariant("S")), "S", "", "", -1);
    PAN_SUBPERVOCPEG.SetValueListItem(PFL_SUBPERVOCPEG_SOLODISPONIB, (new IDVariant("N")), "N", "", "", -1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, MyGlb.PANEL_LIST, 264, 80, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, MyGlb.PANEL_FORM, 264, 112, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_NEWPANELLAB1, -1, GRP_SUBPERVOCPEG_DUE);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 272, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 44, 136, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_DATAELABORAZ, -1, -1);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_DATAELABORAZ, PPQRY_SUBPERVOCPE1, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 268, 132, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 296, 132, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_ELABORA, -1, -1);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, MyGlb.PANEL_LIST, 236, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, MyGlb.PANEL_LIST, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, MyGlb.PANEL_FORM, 284, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, MyGlb.PANEL_FORM, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_APRI, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_APRI, -1, -1);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, MyGlb.PANEL_LIST, 244, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, MyGlb.PANEL_LIST, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, MyGlb.PANEL_FORM, 300, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, MyGlb.PANEL_FORM, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_INFO, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_INFO, -1, -1);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_INFO, -1, "", "INFO", 0, 0, 0, -13997);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, MyGlb.PANEL_LIST, 124, 12, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, MyGlb.PANEL_FORM, 240, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_SUBPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERVOCPEG_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERVOCPEG.SetFieldPage(PFL_SUBPERVOCPEG_NEWPANELABE1, -1, -1);
    PAN_SUBPERVOCPEG.SetFieldPanel(PFL_SUBPERVOCPEG_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
  }

  private void PAN_SUBPERVOCPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_SUBPERVOCPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SUBPERVOCPEG.SetIMDB(IMDB, "PQRY_SUBPERVOCPE1", true);
    PAN_SUBPERVOCPEG.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SUBPERVOCPEG.SetQueryIMDB(PPQRY_SUBPERVOCPE1, IMDBDef16.PQRY_SUBPERVOCPE1_RS, IMDBDef6.TBL_SUBPERVOCPE3);
    JustLoaded = true;
    PAN_SUBPERVOCPEG.SetFieldPrimaryIndex(PFL_SUBPERVOCPEG_CAPITOLO, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECAPIT);
    PAN_SUBPERVOCPEG.SetFieldPrimaryIndex(PFL_SUBPERVOCPEG_ARTICOLO, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMEARTIC);
    PAN_SUBPERVOCPEG.SetFieldPrimaryIndex(PFL_SUBPERVOCPEG_COMPETENZE, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMECOMPE);
    PAN_SUBPERVOCPEG.SetFieldPrimaryIndex(PFL_SUBPERVOCPEG_ANNORESIDUO, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMANNRES);
    PAN_SUBPERVOCPEG.SetFieldPrimaryIndex(PFL_SUBPERVOCPEG_SOLOPROVVISO, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLPRO);
    PAN_SUBPERVOCPEG.SetFieldPrimaryIndex(PFL_SUBPERVOCPEG_SOLODISPONIB, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMSOLDIS);
    PAN_SUBPERVOCPEG.SetFieldPrimaryIndex(PFL_SUBPERVOCPEG_DATAELABORAZ, IMDBDef6.FLD_SUBPERVOCPE3_ROWNAMDATELA);
    PAN_SUBPERVOCPEG.SetMasterTable(0, "SUBPERVOCPE3");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SUBPERVOCPEG.Status() == 2)
    {
      int oldListQBE = PAN_SUBPERVOCPEG.iUseListQBE;
      PAN_SUBPERVOCPEG.iUseListQBE = 0;
      PAN_SUBPERVOCPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_SUBPERVOCPEG.PanelCommand(Glb.PCM_FIND);
      PAN_SUBPERVOCPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SUBPERVOCPEG) PAN_SUBPERVOCPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBPERVOCPEG) PAN_SUBPERVOCPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SUBPERVOCPEG) PAN_SUBPERVOCPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBPERVOCPEG) PAN_SUBPERVOCPEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SUBPERVOCPEG) PAN_SUBPERVOCPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
