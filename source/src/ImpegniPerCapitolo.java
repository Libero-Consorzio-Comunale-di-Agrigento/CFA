// **********************************************
// Impegni Per Capitolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImpegniPerCapitolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_IMPPERVOCPEG_DETTAGRIEPIL = 0;
  private static int GRP_IMPPERVOCPEG_RESIDUCOMPET = 1;
  private static int GRP_IMPPERVOCPEG_PRENPROVDISP = 2;

  private static int PFL_IMPPERVOCPEG_CAPITOLO = 0;
  private static int PFL_IMPPERVOCPEG_BARRAVOCEPEG = 1;
  private static int PFL_IMPPERVOCPEG_ARTICOLO = 2;
  private static int PFL_IMPPERVOCPEG_DETTAGRIEPIL = 3;
  private static int PFL_IMPPERVOCPEG_RESIDUCOMPET = 4;
  private static int PFL_IMPPERVOCPEG_ANNORESIDUO = 5;
  private static int PFL_IMPPERVOCPEG_SOLOPRENOTAZ = 6;
  private static int PFL_IMPPERVOCPEG_SOLOPROVVISO = 7;
  private static int PFL_IMPPERVOCPEG_SOLODISPONIB = 8;
  private static int PFL_IMPPERVOCPEG_NEWPANELABE2 = 9;
  private static int PFL_IMPPERVOCPEG_DATAELABORAZ = 10;
  private static int PFL_IMPPERVOCPEG_ELABORA = 11;
  private static int PFL_IMPPERVOCPEG_VOCEPEG = 12;
  private static int PFL_IMPPERVOCPEG_INFOVOCEPEG = 13;

  private static int PPQRY_PAR43 = 0;


  IDPanel PAN_IMPPERVOCPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR(IMDB);
    Init_TBL_PAROLD(IMDB);
    //
    //
    Init_PQRY_PAR43(IMDB);
    Init_PQRY_PAR43_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR, 9);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR, "TBL_PAR");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMDETRIE, "ROWNAMDETRIE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMDETRIE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMSOLPRE, "ROWNAMSOLPRE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMSOLPRE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMSOLPRO, "ROWNAMSOLPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMSOLPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR,IMDBDef6.FLD_PAR_ROWNAMRESCOM,12,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR, 0);
  }

  private static void Init_TBL_PAROLD(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAROLD, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_PAROLD, "TBL_PAROLD");
    IMDB.set_FldCode(IMDBDef6.TBL_PAROLD,IMDBDef6.FLD_PAROLD_DETTARIEPOLD, "DETTARIEPOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PAROLD,IMDBDef6.FLD_PAROLD_DETTARIEPOLD,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAROLD, 0);
  }

  private static void Init_PQRY_PAR43(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR43, 9);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR43, "PQRY_PAR43");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMDETRIE, "ROWNAMDETRIE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMDETRIE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRE, "ROWNAMSOLPRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRO, "ROWNAMSOLPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43,IMDBDef16.PQSL_PAR43_ROWNAMRESCOM,12,1,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR43, 0);
  }

  private static void Init_PQRY_PAR43_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR43_RS, 9);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR43_RS, "PQRY_PAR43_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMDETRIE, "ROWNAMDETRIE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMDETRIE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRE, "ROWNAMSOLPRE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRO, "ROWNAMSOLPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMSOLPRO,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR43_RS,IMDBDef16.PQSL_PAR43_ROWNAMRESCOM,12,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImpegniPerCapitolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImpegniPerCapitolo()
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
    FormIdx = MyGlb.FRM_IMPEGPERCAPI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DC4390A7-6F69-431F-B10B-5ADCB60ACE83";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 448;
    DesignHeight = 278;
    set_Caption(new IDVariant("Impegni per Capitolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 448;
    Frames[1].Height = 252;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Impegni Per Voce P E G";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 252;
    PAN_IMPPERVOCPEG = new IDPanel(w, this, 1, "PAN_IMPPERVOCPEG");
    Frames[1].Content = PAN_IMPPERVOCPEG;
    PAN_IMPPERVOCPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPPERVOCPEG.VS = MainFrm.VisualStyleList;
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 448-MyGlb.PAN_OFFS_X, 252-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DA89235B-FD29-4ADD-8E37-63D7462EDD38");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 588, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPPERVOCPEG.InitStatus = 2;
    PAN_IMPPERVOCPEG_Init();
    PAN_IMPPERVOCPEG_InitFields();
    PAN_IMPPERVOCPEG_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        IMPEGPERCAPI_PAR43();
      }
      PAN_IMPPERVOCPEG.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_IMPPERVOCPEG.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPPERVOCPEG_VOCEPEG) {
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
    return (obj instanceof ImpegniPerCapitolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImpegniPerCapitolo.class.getName() : (Glb.ClassWithPackage(ImpegniPerCapitolo.class) ? ImpegniPerCapitolo.class.getName().substring(ImpegniPerCapitolo.class.getPackage().getName().length() + 1) : ImpegniPerCapitolo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Voce Peg
  // **********************************************************************
  public int ApriVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "ApriVocePeg", _e);
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
      if ((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0)))))
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
        v_NOMEPAR5 = (new IDVariant("SOLO_PREN"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("SOLO_PROV"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("DETT_RIEP"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("CAPITOLO"));
        IDVariant v_NOMEPAR10 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR10 = (new IDVariant("ARTICOLO"));
        IDVariant v_NOMEPAR11 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR11 = (new IDVariant("ANNO_RES"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Impegni_per_VocePeg"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMRESCOM, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMDATELA, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMSOLDIS, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMSOLPRE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMSOLPRO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMDETRIE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR10, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR11, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMANNRES, 0),(new IDVariant(-1)))));
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
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "Info", _e);
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
    IDVariant v_IMP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMP = (new IDVariant("Impegni Per", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(v_IMP, (new IDVariant(" "))), (new IDVariant("Capitolo "))), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMDETRIE, 0, (new IDVariant("M")));
      IMDB.set_Value(IMDBDef6.TBL_PAROLD, IMDBDef6.FLD_PAROLD_DETTARIEPOLD, 0, (new IDVariant("M")));
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMRESCOM, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMSOLPRE, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMSOLPRO, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMSOLDIS, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMDATELA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMEARTIC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "UnloadEvent", _e);
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
        IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Impegni Per Voce P E G On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPPERVOCPEG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPPERVOCPEG);
      // 
      // Impegni Per Voce P E G On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMRESCOM, 0).equals((new IDVariant("C")), true))
      {
        PAN_IMPPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_IMPPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0))))
      {
        PAN_IMPPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_IMPPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "ImpegniPerVocePEGOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Impegni Per Voce P E G On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_IMPPERVOCPEG_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegni Per Voce P E G On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_IMPPERVOCPEG_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_IMPPERVOCPEG_ARTICOLO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0))))
        {
          if (!(MainFrm.EsistenzaCapitolo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0), (new IDVariant("SI")))))
          {
            IMDB.set_Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMECAPIT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMEARTIC, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_IMPPERVOCPEG_DETTAGRIEPIL)), true))
      {
        if (IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMDETRIE, 0).compareTo(IMDB.Value(IMDBDef6.TBL_PAROLD, IMDBDef6.FLD_PAROLD_DETTARIEPOLD, 0), true)!=0)
        {
          if (IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMDETRIE, 0).equals((new IDVariant("C")), true))
          {
            PAN_IMPPERVOCPEG.ClearValueList(PFL_IMPPERVOCPEG_RESIDUCOMPET);
            PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("C")), ((new IDVariant("C")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("C")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("C")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("E")), ((new IDVariant("E")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("E")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("E")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            if (IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMRESCOM, 0).equals((new IDVariant("R")), true))
            {
              IMDB.set_Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMRESCOM, 0, (new IDVariant("C")));
            }
          }
          else
          {
            PAN_IMPPERVOCPEG.ClearValueList(PFL_IMPPERVOCPEG_RESIDUCOMPET);
            PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("R")), ((new IDVariant("R")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("R")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("R")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("C")), ((new IDVariant("C")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("C")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("C")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("E")), ((new IDVariant("E")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("E")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("E")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          }
          IMDB.set_Value(IMDBDef6.TBL_PAROLD, IMDBDef6.FLD_PAROLD_DETTARIEPOLD, 0, IMDB.Value(IMDBDef16.PQRY_PAR43, IMDBDef16.PQSL_PAR43_ROWNAMDETRIE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerCapitolo", "ImpegniPerVocePEGOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void IMPEGPERCAPI_PAR43() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR43_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR43_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR43_RS, 0, IMDBDef6.TBL_PAR, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 0, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 1, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 2, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMDETRIE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 3, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMSOLPRE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 4, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMSOLPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 5, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMSOLDIS, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 6, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMANNRES, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 7, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR43_RS, 8, 0, IMDBDef6.TBL_PAR, IMDBDef6.FLD_PAR_ROWNAMRESCOM, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR43_RS, 0);
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
  private void PAN_IMPPERVOCPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPPERVOCPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPPERVOCPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPPERVOCPEG, Cancel);
    // Stub
  }

  private void PAN_IMPPERVOCPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPPERVOCPEG_ELABORA)
    {
      this.IdxPanelActived = this.PAN_IMPPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPPERVOCPEG_VOCEPEG)
    {
      this.IdxPanelActived = this.PAN_IMPPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPPERVOCPEG_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_IMPPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPPERVOCPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_IMPPERVOCPEG_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_IMPPERVOCPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPPERVOCPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPPERVOCPEG_Init()
  {

    PAN_IMPPERVOCPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPPERVOCPEG.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, "F78F533D-7848-4EA7-B20E-9F0C976D583B");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, "Dettaglio Riepilogo");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 144, -9999, 120, 0, 0, 0);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 4, 52, 132, 96, 0, 0);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, 0, 107);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, 1, 13);
    PAN_IMPPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, 0, 1);
    PAN_IMPPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, 1, 1);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_DETTAGRIEPIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, "4663C97D-B2FE-4552-89B6-0632DB77B75C");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, "Residui Competenza");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 0, -9999, 512, 0, 0, 0);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 144, 52, 140, 96, 0, 0);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, 0, 115);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, 1, 13);
    PAN_IMPPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, 0, 1);
    PAN_IMPPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, 1, 1);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_RESIDUCOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, "3D6A2D5C-C966-4ED1-A450-04458CE3A735");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, "Pren Prov Disp");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, MyGlb.PANEL_LIST, 352, -9999, 120, 0, 0, 0);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, MyGlb.PANEL_FORM, 288, 52, 140, 96, 0, 0);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, 0, 82);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, 1, 13);
    PAN_IMPPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, 0, 1);
    PAN_IMPPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, 1, 1);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPPERVOCPEG_PRENPROVDISP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPPERVOCPEG.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, "F6D25828-ECB7-4B22-A44A-660A3BA99E5B");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, "Capitolo/Art.");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, "9F0818A2-B54E-43EC-9915-1C6297BB9779");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, "/");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, MyGlb.VIS_VUOTONORMALE);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, "D46A5CA5-6AD7-40EF-BC58-719114E9E2C4");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, "Articolo");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, "408477AF-E6D4-495A-B08D-035D24ADB3A3");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, "Dettaglio Riepilogo");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.VIS_OPTBUTSENBOR);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, "E01B2265-7DD9-4F62-8229-658192E4B7E3");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, "Residui Competenza");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.VIS_OPTBUTSENBOR);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, "7E81BA7D-2C07-4AA1-82DB-FD0358841052");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, "Anno Residuo");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, "1F9BCF44-6170-4928-886B-72E867564E75");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, "Solo Prenotazioni");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.VIS_CHECKSTYLE);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, "F04AC9B8-64BD-4164-9715-700F66E272C3");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, "Solo Provvisori");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.VIS_CHECKSTYLE);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, "6415D1CF-7C09-45A4-ADAE-228D66F3F882");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, "Solo Disponibili");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.VIS_CHECKSTYLE);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, "A2C0746B-4018-482C-BB44-D580847A75B9");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, "E04EEDBF-F56C-41D5-B999-73552A23B311");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, "Data Elaborazione");
    PAN_IMPPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, "96BE130E-4EE1-49D4-A1A9-F390F7F6037F");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, "Elabora");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_IMPPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, 0, "button1.gif", false);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, "50D25D05-D5CF-48DD-98DD-971D602D4715");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_IMPPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, 0, "wsearch.gif", false);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMPPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, "3DCD927C-F2A7-4B5C-A8F8-968866BF1F2E");
    PAN_IMPPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, "");
    PAN_IMPPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_IMPPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, 0, "info.gif", false);
    PAN_IMPPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_IMPPERVOCPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 48, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, "Capit. Art");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 20, 12, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 88);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_CAPITOLO, -1, -1);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_CAPITOLO, PPQRY_PAR43, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, MyGlb.PANEL_LIST, 124, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, MyGlb.PANEL_FORM, 252, 12, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_BARRAVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_BARRAVOCEPEG, -1, -1);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_BARRAVOCEPEG, -1, "", "BARRAVOCEPEG", 0, 0, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 96, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, "Artic.");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 272, 12, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 112);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_ARTICOLO, -1, -1);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_ARTICOLO, PPQRY_PAR43, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 144, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 100);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, "Dettaglio Riepilogo");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 8, 56, 124, 88, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 112);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 6);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, "Dettaglio Riepilogo");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_DETTAGRIEPIL, -1, GRP_IMPPERVOCPEG_DETTAGRIEPIL);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_DETTAGRIEPIL, PPQRY_PAR43, "A.ROWNAMDETRIE", "ROWNAMDETRIE", 5, 1, 0, -13997);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_DETTAGRIEPIL, (new IDVariant("M")), "Dettaglio Movimenti", "", "", -1);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_DETTAGRIEPIL, (new IDVariant("C")), "Riepilogo Capitoli", "", "", -1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 108);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, "Residui Competenza");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 168, 56, 92, 64, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 108);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 4);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, "Residui Competenza");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_RESIDUCOMPET, -1, GRP_IMPPERVOCPEG_RESIDUCOMPET);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_RESIDUCOMPET, PPQRY_PAR43, "A.ROWNAMRESCOM", "ROWNAMRESCOM", 12, 1, 0, -13997);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("R")), "Residuo", "", "", -1);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_RESIDUCOMPET, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 472, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 76);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, "Ann. Res.");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 148, 124, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 84);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, "Anno Residuo");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_ANNORESIDUO, -1, GRP_IMPPERVOCPEG_RESIDUCOMPET);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_ANNORESIDUO, PPQRY_PAR43, "A.ROWNAMANNRES", "ROWNAMANNRES", 1, 4, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_LIST, 92);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_LIST, "Sl. Pren.");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_FORM, 292, 56, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_FORM, 108);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPRENOTAZ, MyGlb.PANEL_FORM, "Solo Prenotazioni");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_SOLOPRENOTAZ, -1, GRP_IMPPERVOCPEG_PRENPROVDISP);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_SOLOPRENOTAZ, PPQRY_PAR43, "A.ROWNAMSOLPRE", "ROWNAMSOLPRE", 5, 1, 0, -13997);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_SOLOPRENOTAZ, (new IDVariant("S")), "S", "", "", -1);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_SOLOPRENOTAZ, (new IDVariant("N")), "N", "", "", -1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, 80);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_LIST, "Sl. Prov.");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, 304, 76, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, 96);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLOPROVVISO, MyGlb.PANEL_FORM, "Solo Provvisori");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_SOLOPROVVISO, -1, GRP_IMPPERVOCPEG_PRENPROVDISP);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_SOLOPROVVISO, PPQRY_PAR43, "A.ROWNAMSOLPRO", "ROWNAMSOLPRO", 5, 1, 0, -13997);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_SOLOPROVVISO, (new IDVariant("S")), "S", "", "", -1);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_SOLOPROVVISO, (new IDVariant("N")), "N", "", "", -1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 80);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, "Sl. Disp.");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 304, 96, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 96);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, "Solo Disponibili");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_SOLODISPONIB, -1, GRP_IMPPERVOCPEG_PRENPROVDISP);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_SOLODISPONIB, PPQRY_PAR43, "A.ROWNAMSOLDIS", "ROWNAMSOLDIS", 5, 1, 0, -13997);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_SOLODISPONIB, (new IDVariant("S")), "S", "", "", -1);
    PAN_IMPPERVOCPEG.SetValueListItem(PFL_IMPPERVOCPEG_SOLODISPONIB, (new IDVariant("N")), "N", "", "", -1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_LIST, 36, 140, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_FORM, 392, 136, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_NEWPANELABE2, -1, GRP_IMPPERVOCPEG_PRENPROVDISP);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 512, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 80, 156, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_DATAELABORAZ, -1, -1);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_DATAELABORAZ, PPQRY_PAR43, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 352, 200, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 344, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_ELABORA, -1, -1);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, MyGlb.PANEL_LIST, 236, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, MyGlb.PANEL_FORM, 300, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_VOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_VOCEPEG, -1, -1);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_VOCEPEG, -1, "", "VOCEPEG", 0, 0, 0, -13997);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, MyGlb.PANEL_LIST, 260, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, MyGlb.PANEL_FORM, 316, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERVOCPEG_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERVOCPEG.SetFieldPage(PFL_IMPPERVOCPEG_INFOVOCEPEG, -1, -1);
    PAN_IMPPERVOCPEG.SetFieldPanel(PFL_IMPPERVOCPEG_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
  }

  private void PAN_IMPPERVOCPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPPERVOCPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPPERVOCPEG.SetIMDB(IMDB, "PQRY_PAR43", true);
    PAN_IMPPERVOCPEG.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_IMPPERVOCPEG.SetQueryIMDB(PPQRY_PAR43, IMDBDef16.PQRY_PAR43_RS, IMDBDef6.TBL_PAR);
    JustLoaded = true;
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_CAPITOLO, IMDBDef6.FLD_PAR_ROWNAMECAPIT);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_ARTICOLO, IMDBDef6.FLD_PAR_ROWNAMEARTIC);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_DETTAGRIEPIL, IMDBDef6.FLD_PAR_ROWNAMDETRIE);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_RESIDUCOMPET, IMDBDef6.FLD_PAR_ROWNAMRESCOM);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_ANNORESIDUO, IMDBDef6.FLD_PAR_ROWNAMANNRES);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_SOLOPRENOTAZ, IMDBDef6.FLD_PAR_ROWNAMSOLPRE);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_SOLOPROVVISO, IMDBDef6.FLD_PAR_ROWNAMSOLPRO);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_SOLODISPONIB, IMDBDef6.FLD_PAR_ROWNAMSOLDIS);
    PAN_IMPPERVOCPEG.SetFieldPrimaryIndex(PFL_IMPPERVOCPEG_DATAELABORAZ, IMDBDef6.FLD_PAR_ROWNAMDATELA);
    PAN_IMPPERVOCPEG.SetMasterTable(0, "PAR");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPPERVOCPEG.Status() == 2)
    {
      int oldListQBE = PAN_IMPPERVOCPEG.iUseListQBE;
      PAN_IMPPERVOCPEG.iUseListQBE = 0;
      PAN_IMPPERVOCPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPPERVOCPEG.PanelCommand(Glb.PCM_FIND);
      PAN_IMPPERVOCPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPPERVOCPEG) PAN_IMPPERVOCPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPPERVOCPEG) PAN_IMPPERVOCPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPPERVOCPEG) PAN_IMPPERVOCPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPPERVOCPEG) PAN_IMPPERVOCPEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPPERVOCPEG) PAN_IMPPERVOCPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
