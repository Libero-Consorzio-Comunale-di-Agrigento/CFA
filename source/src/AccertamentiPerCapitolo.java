// **********************************************
// Accertamenti Per Capitolo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccertamentiPerCapitolo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ACCPERVOCPEG_DETTAGRIEPIL = 0;
  private static int GRP_ACCPERVOCPEG_RESIDUCOMPET = 1;

  private static int PFL_ACCPERVOCPEG_CAPITOLO = 0;
  private static int PFL_ACCPERVOCPEG_ARTICOLO = 1;
  private static int PFL_ACCPERVOCPEG_DETTAGRIEPIL = 2;
  private static int PFL_ACCPERVOCPEG_RESIDUCOMPET = 3;
  private static int PFL_ACCPERVOCPEG_ANNORESIDUO = 4;
  private static int PFL_ACCPERVOCPEG_SOLODISPONIB = 5;
  private static int PFL_ACCPERVOCPEG_DATAELABORAZ = 6;
  private static int PFL_ACCPERVOCPEG_ELABORA = 7;
  private static int PFL_ACCPERVOCPEG_NEWPANELLABE = 8;
  private static int PFL_ACCPERVOCPEG_NEWPANELABE2 = 9;
  private static int PFL_ACCPERVOCPEG_INFOLABEL = 10;

  private static int PPQRY_PAR33 = 0;


  IDPanel PAN_ACCPERVOCPEG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR44(IMDB);
    Init_TBL_PAROLD1(IMDB);
    //
    //
    Init_PQRY_PAR33(IMDB);
    Init_PQRY_PAR33_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR44(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR44, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR44, "TBL_PAR44");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMDETRIE, "ROWNAMDETRIE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMDETRIE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMRESCOM,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR44,IMDBDef6.FLD_PAR44_ROWNAMDATELA,6,14,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR44, 0);
  }

  private static void Init_TBL_PAROLD1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAROLD1, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_PAROLD1, "TBL_PAROLD1");
    IMDB.set_FldCode(IMDBDef6.TBL_PAROLD1,IMDBDef6.FLD_PAROLD1_DETTARIEPOLD, "DETTARIEPOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PAROLD1,IMDBDef6.FLD_PAROLD1_DETTARIEPOLD,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAROLD1, 0);
  }

  private static void Init_PQRY_PAR33(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR33, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR33, "PQRY_PAR33");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMDETRIE, "ROWNAMDETRIE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMDETRIE,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMRESCOM,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33,IMDBDef15.PQSL_PAR33_ROWNAMDATELA,6,14,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR33, 0);
  }

  private static void Init_PQRY_PAR33_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR33_RS, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR33_RS, "PQRY_PAR33_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMDETRIE, "ROWNAMDETRIE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMDETRIE,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMRESCOM,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMSOLDIS, "ROWNAMSOLDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMSOLDIS,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR33_RS,IMDBDef15.PQSL_PAR33_ROWNAMDATELA,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccertamentiPerCapitolo(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccertamentiPerCapitolo()
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
    FormIdx = MyGlb.FRM_ACCERPERCAPI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "452D7B35-6BDE-4539-BA2C-EDAEBD80B604";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 500;
    DesignHeight = 270;
    set_Caption(new IDVariant("Accertamenti Per Capitolo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 500;
    Frames[1].Height = 244;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Accertamenti Per Voce P E G";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 244;
    PAN_ACCPERVOCPEG = new IDPanel(w, this, 1, "PAN_ACCPERVOCPEG");
    Frames[1].Content = PAN_ACCPERVOCPEG;
    PAN_ACCPERVOCPEG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCPERVOCPEG.VS = MainFrm.VisualStyleList;
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 500-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DE325121-FBE0-4ABA-BF0D-BED4F05225B9");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 548, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCPERVOCPEG.InitStatus = 2;
    PAN_ACCPERVOCPEG_Init();
    PAN_ACCPERVOCPEG_InitFields();
    PAN_ACCPERVOCPEG_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR44, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ACCERPERCAPI_PAR33();
      }
      PAN_ACCPERVOCPEG.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_ACCPERVOCPEG.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCPERVOCPEG_NEWPANELLABE) {
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
    return (obj instanceof AccertamentiPerCapitolo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccertamentiPerCapitolo.class.getName() : (Glb.ClassWithPackage(AccertamentiPerCapitolo.class) ? AccertamentiPerCapitolo.class.getName().substring(AccertamentiPerCapitolo.class.getPackage().getName().length() + 1) : AccertamentiPerCapitolo.class.getName()));
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "ApriVocePeg", _e);
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
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW = (new IDVariant("d_acc_rif_stampa", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if ((IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0)))))
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
        v_NOMEPAR5 = (new IDVariant("DETT_RIEP"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("CAPITOLO"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("ARTICOLO"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("ANNO_RES"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Accertamenti_per_VocePeg"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMRESCOM, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMDATELA, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMSOLDIS, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMDETRIE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMANNRES, 0),(new IDVariant(-1)))));
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
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "InfoVocePeg", _e);
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
    IDVariant v_CA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CA = (new IDVariant("Accertamenti per Voce P.e.g.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CA, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMDETRIE, 0, (new IDVariant("M")));
      IMDB.set_Value(IMDBDef6.TBL_PAROLD1, IMDBDef6.FLD_PAROLD1_DETTARIEPOLD, 0, (new IDVariant("M")));
      IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMRESCOM, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMSOLDIS, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMDATELA, 0, IDL.Today());
      PAN_ACCPERVOCPEG.set_Header(Glb.OBJ_GROUP,GRP_ACCPERVOCPEG_RESIDUCOMPET,(new IDVariant("")).stringValue()); 
      PAN_ACCPERVOCPEG.set_Header(Glb.OBJ_GROUP,GRP_ACCPERVOCPEG_DETTAGRIEPIL,(new IDVariant("")).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMANNRES, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "UnloadEvent", _e);
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
        IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Per Voce P E G On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ACCPERVOCPEG_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamenti Per Voce P E G On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ACCPERVOCPEG_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_ACCPERVOCPEG_ARTICOLO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0))))
        {
          if (!(MainFrm.EsistenzaCapitolo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("E")), IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0), (new IDVariant("SI")))))
          {
            IMDB.set_Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_ACCPERVOCPEG_DETTAGRIEPIL)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMDETRIE, 0).compareTo(IMDB.Value(IMDBDef6.TBL_PAROLD1, IMDBDef6.FLD_PAROLD1_DETTARIEPOLD, 0), true)!=0)
        {
          if (IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMDETRIE, 0).equals((new IDVariant("C")), true))
          {
            PAN_ACCPERVOCPEG.ClearValueList(PFL_ACCPERVOCPEG_RESIDUCOMPET);
            PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("C")), ((new IDVariant("C")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("C")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("C")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("E")), ((new IDVariant("E")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("E")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("E")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            if (IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMRESCOM, 0).equals((new IDVariant("R")), true))
            {
              IMDB.set_Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMRESCOM, 0, (new IDVariant("C")));
            }
          }
          else
          {
            PAN_ACCPERVOCPEG.ClearValueList(PFL_ACCPERVOCPEG_RESIDUCOMPET);
            PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("R")), ((new IDVariant("R")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("R")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("R")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("C")), ((new IDVariant("C")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("C")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("C")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
            PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("E")), ((new IDVariant("E")).equals((new IDVariant("R")))? new IDVariant("Residuo") : (new IDVariant("E")).equals((new IDVariant("C")))? new IDVariant("Competenza") : (new IDVariant("E")).equals((new IDVariant("E")))? new IDVariant("Entrambi") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          }
          IMDB.set_Value(IMDBDef6.TBL_PAROLD1, IMDBDef6.FLD_PAROLD1_DETTARIEPOLD, 0, IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMDETRIE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "AccertamentiPerVocePEGOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Per Voce P E G On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCPERVOCPEG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCPERVOCPEG);
      // 
      // Accertamenti Per Voce P E G On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMRESCOM, 0).equals((new IDVariant("C")), true))
      {
        PAN_ACCPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ACCPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR33, IMDBDef15.PQSL_PAR33_ROWNAMEARTIC, 0))))
      {
        PAN_ACCPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ACCPERVOCPEG.SetFlags (Glb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerCapitolo", "AccertamentiPerVocePEGOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ACCERPERCAPI_PAR33() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR33_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR44, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR44, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR33_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR33_RS, 0, IMDBDef6.TBL_PAR44, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR33_RS, 0, 0, IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR33_RS, 1, 0, IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR33_RS, 2, 0, IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMDETRIE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR33_RS, 3, 0, IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMRESCOM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR33_RS, 4, 0, IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMANNRES, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR33_RS, 5, 0, IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMSOLDIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR33_RS, 6, 0, IMDBDef6.TBL_PAR44, IMDBDef6.FLD_PAR44_ROWNAMDATELA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR44, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR44, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR44, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR33_RS, 0);
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
  private void PAN_ACCPERVOCPEG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCPERVOCPEG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCPERVOCPEG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCPERVOCPEG, Cancel);
    // Stub
  }

  private void PAN_ACCPERVOCPEG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ACCPERVOCPEG_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ACCPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCPERVOCPEG_NEWPANELLABE)
    {
      this.IdxPanelActived = this.PAN_ACCPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCPERVOCPEG_INFOLABEL)
    {
      this.IdxPanelActived = this.PAN_ACCPERVOCPEG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ACCPERVOCPEG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ACCPERVOCPEG_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ACCPERVOCPEG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ACCPERVOCPEG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCPERVOCPEG_Init()
  {

    PAN_ACCPERVOCPEG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCPERVOCPEG.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, "50FBE438-C62B-40D6-AD01-1ABB6916F7D6");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, "Dettaglio Riepilogo");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 168, -9999, 136, 0, 0, 0);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 4, 44, 140, 88, 0, 0);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, 0, 107);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, 1, 13);
    PAN_ACCPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, 0, 1);
    PAN_ACCPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, 1, 1);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_DETTAGRIEPIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, "EA9A5C3D-A2F3-4BC5-9B38-09EBA2DB33D9");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, "Residuo Competenza");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 0, -9999, 448, 0, 0, 0);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 152, 44, 144, 88, 0, 0);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, 0, 119);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, 1, 13);
    PAN_ACCPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, 0, 1);
    PAN_ACCPERVOCPEG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, 1, 1);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCPERVOCPEG_RESIDUCOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCPERVOCPEG.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, "695A3DFE-6C28-4FC6-902B-2D8D6A9CDE54");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, "Capitolo");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, "29BA491E-9C8A-4E60-A5A4-A90366A68388");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, "Articolo");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, "DEAA91EB-516D-41C2-AE86-8096FD49DB7E");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, "Dettaglio Riepilogo");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, "63CBB77B-B2EB-4476-83B9-6FE81C4604C8");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, "Residui Competenza");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, "F61C11DB-D549-44C0-87A8-6FEFE41C74AD");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, "Anno Residuo");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, "787CE36C-40D2-47F9-BCBC-D2BB9E392788");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, "Solo Disponibili");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.VIS_CHECKSTYLE);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, "922853F2-7B3D-47AE-918F-ABC6BC05F183");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, "Data Elaborazione");
    PAN_ACCPERVOCPEG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, "BAACE492-9F52-4C76-8EDF-D2A18BBF6AFA");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, "Elabora");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ACCPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, 0, "button1.gif", false);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, "0A1B669B-76AB-4F50-B843-0A408E6C497D");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ACCPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, 0, "wsearch.gif", false);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, "EE72E8D1-BE6C-4667-8C6C-D99656897A82");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, "/");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCPERVOCPEG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, "F07FAB26-AC4C-49D1-AB62-17900C5F865F");
    PAN_ACCPERVOCPEG.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, "");
    PAN_ACCPERVOCPEG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ACCPERVOCPEG.SetImage(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, 0, "info.gif", false);
    PAN_ACCPERVOCPEG.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ACCPERVOCPEG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 56, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, -56, 8, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 128);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_CAPITOLO, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_CAPITOLO, PPQRY_PAR33, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 112, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 236, 8, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 128);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_ARTICOLO, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_ARTICOLO, PPQRY_PAR33, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 168, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 100);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_LIST, "Dettaglio Riepilogo");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 8, 48, 132, 80, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 128);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, 6);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DETTAGRIEPIL, MyGlb.PANEL_FORM, "Dettaglio Riepilogo");
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_DETTAGRIEPIL, -1, GRP_ACCPERVOCPEG_DETTAGRIEPIL);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_DETTAGRIEPIL, PPQRY_PAR33, "A.ROWNAMDETRIE", "ROWNAMDETRIE", 5, 1, 0, -13997);
    PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_DETTAGRIEPIL, (new IDVariant("M")), "Dettaglio Movimenti", "", "", -1);
    PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_DETTAGRIEPIL, (new IDVariant("C")), "Riepilogo Capitoli", "", "", -1);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 108);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_LIST, "Residui Competenza");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 176, 48, 108, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 108);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, 4);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_RESIDUCOMPET, MyGlb.PANEL_FORM, "Residui Competenza");
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_RESIDUCOMPET, -1, GRP_ACCPERVOCPEG_RESIDUCOMPET);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_RESIDUCOMPET, PPQRY_PAR33, "A.ROWNAMRESCOM", "ROWNAMRESCOM", 12, 1, 0, -13997);
    PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("R")), "Residuo", "", "", -1);
    PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_RESIDUCOMPET, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 408, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 76);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_LIST, "Ann. Res.");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 156, 108, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 88);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ANNORESIDUO, MyGlb.PANEL_FORM, "Anno Residuo");
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_ANNORESIDUO, -1, GRP_ACCPERVOCPEG_RESIDUCOMPET);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_ANNORESIDUO, PPQRY_PAR33, "A.ROWNAMANNRES", "ROWNAMANNRES", 1, 4, 0, -13997);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 448, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 80);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_LIST, "Sl. Disp.");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 308, 68, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 92);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_SOLODISPONIB, MyGlb.PANEL_FORM, "Solo Disponibili");
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_SOLODISPONIB, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_SOLODISPONIB, PPQRY_PAR33, "A.ROWNAMSOLDIS", "ROWNAMSOLDIS", 5, 1, 0, -13997);
    PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_SOLODISPONIB, (new IDVariant("S")), "S", "", "", -1);
    PAN_ACCPERVOCPEG.SetValueListItem(PFL_ACCPERVOCPEG_SOLODISPONIB, (new IDVariant("N")), "N", "", "", -1);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 488, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 36, 140, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_DATAELABORAZ, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_DATAELABORAZ, PPQRY_PAR33, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 320, 188, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 340, 184, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_ELABORA, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, MyGlb.PANEL_LIST, 228, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, MyGlb.PANEL_FORM, 264, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_NEWPANELLABE, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_LIST, 144, 48, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_FORM, 220, 8, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_NEWPANELABE2, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, MyGlb.PANEL_LIST, 256, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERVOCPEG.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, MyGlb.PANEL_FORM, 280, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERVOCPEG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ACCPERVOCPEG.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERVOCPEG_INFOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERVOCPEG.SetFieldPage(PFL_ACCPERVOCPEG_INFOLABEL, -1, -1);
    PAN_ACCPERVOCPEG.SetFieldPanel(PFL_ACCPERVOCPEG_INFOLABEL, -1, "", "INFOLABEL", 0, 0, 0, -13997);
  }

  private void PAN_ACCPERVOCPEG_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCPERVOCPEG.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ACCPERVOCPEG.SetIMDB(IMDB, "PQRY_PAR33", true);
    PAN_ACCPERVOCPEG.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ACCPERVOCPEG.SetQueryIMDB(PPQRY_PAR33, IMDBDef15.PQRY_PAR33_RS, IMDBDef6.TBL_PAR44);
    JustLoaded = true;
    PAN_ACCPERVOCPEG.SetFieldPrimaryIndex(PFL_ACCPERVOCPEG_CAPITOLO, IMDBDef6.FLD_PAR44_ROWNAMECAPIT);
    PAN_ACCPERVOCPEG.SetFieldPrimaryIndex(PFL_ACCPERVOCPEG_ARTICOLO, IMDBDef6.FLD_PAR44_ROWNAMEARTIC);
    PAN_ACCPERVOCPEG.SetFieldPrimaryIndex(PFL_ACCPERVOCPEG_DETTAGRIEPIL, IMDBDef6.FLD_PAR44_ROWNAMDETRIE);
    PAN_ACCPERVOCPEG.SetFieldPrimaryIndex(PFL_ACCPERVOCPEG_RESIDUCOMPET, IMDBDef6.FLD_PAR44_ROWNAMRESCOM);
    PAN_ACCPERVOCPEG.SetFieldPrimaryIndex(PFL_ACCPERVOCPEG_ANNORESIDUO, IMDBDef6.FLD_PAR44_ROWNAMANNRES);
    PAN_ACCPERVOCPEG.SetFieldPrimaryIndex(PFL_ACCPERVOCPEG_SOLODISPONIB, IMDBDef6.FLD_PAR44_ROWNAMSOLDIS);
    PAN_ACCPERVOCPEG.SetFieldPrimaryIndex(PFL_ACCPERVOCPEG_DATAELABORAZ, IMDBDef6.FLD_PAR44_ROWNAMDATELA);
    PAN_ACCPERVOCPEG.SetMasterTable(0, "PAR44");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCPERVOCPEG.Status() == 2)
    {
      int oldListQBE = PAN_ACCPERVOCPEG.iUseListQBE;
      PAN_ACCPERVOCPEG.iUseListQBE = 0;
      PAN_ACCPERVOCPEG.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCPERVOCPEG.PanelCommand(Glb.PCM_FIND);
      PAN_ACCPERVOCPEG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCPERVOCPEG) PAN_ACCPERVOCPEG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCPERVOCPEG) PAN_ACCPERVOCPEG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCPERVOCPEG) PAN_ACCPERVOCPEG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCPERVOCPEG) PAN_ACCPERVOCPEG_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCPERVOCPEG) PAN_ACCPERVOCPEG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
