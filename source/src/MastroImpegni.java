// **********************************************
// Mastro Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MastroImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAR_CAPITOLO = 0;
  private static int PFL_PAR_ARTICOLO = 1;
  private static int PFL_PAR_CAPITOLO1 = 2;
  private static int PFL_PAR_ARTICOLO1 = 3;
  private static int PFL_PAR_DATAELABORAZ = 4;
  private static int PFL_PAR_RESICOMPENTR = 5;
  private static int PFL_PAR_UNITAORGANIZ = 6;
  private static int PFL_PAR_SUBIMPEGNI = 7;
  private static int PFL_PAR_ANCHENONMOVI = 8;
  private static int PFL_PAR_SERVIZOPERAT = 9;
  private static int PFL_PAR_TRATTINO2 = 10;
  private static int PFL_PAR_TRATTINO3 = 11;
  private static int PFL_PAR_APRIPEG1 = 12;
  private static int PFL_PAR_APRIPEG2 = 13;
  private static int PFL_PAR_INFOPEG1 = 14;
  private static int PFL_PAR_INFOPEG2 = 15;
  private static int PFL_PAR_ELABORA = 16;

  private static int PPQRY_PAR86 = 0;


  IDPanel PAN_PAR;

  // Definition of Global Variables
  private IDVariant INIZIOWEB = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR85(IMDB);
    //
    //
    Init_PQRY_PAR86(IMDB);
    Init_PQRY_PAR86_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR85(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR85, 11);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR85, "TBL_PAR85");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMRECOEN,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMSEROPE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMECAPI1, "ROWNAMECAPI1");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMECAPI1,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMEARTI1, "ROWNAMEARTI1");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMEARTI1,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMEPEG, "ROWNAMEPEG");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMEPEG,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMSUBIMP,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMANNOMO, "ROWNAMANNOMO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMANNOMO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR85,IMDBDef6.FLD_PAR85_ROWNAMUNIORG,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR85, 0);
  }

  private static void Init_PQRY_PAR86(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR86, 10);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR86, "PQRY_PAR86");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMRECOEN,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMSEROPE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, "ROWNAMECAPI1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMECAPI1,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, "ROWNAMEARTI1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMEARTI1,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMSUBIMP,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMANNOMO, "ROWNAMANNOMO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMANNOMO,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86,IMDBDef16.PQSL_PAR86_ROWNAMUNIORG,5,1,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR86, 0);
  }

  private static void Init_PQRY_PAR86_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR86_RS, 10);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR86_RS, "PQRY_PAR86_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMRECOEN,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMSEROPE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, "ROWNAMECAPI1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMECAPI1,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, "ROWNAMEARTI1");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMEARTI1,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMSUBIMP, "ROWNAMSUBIMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMSUBIMP,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMANNOMO, "ROWNAMANNOMO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMANNOMO,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR86_RS,IMDBDef16.PQSL_PAR86_ROWNAMUNIORG,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MastroImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public MastroImpegni()
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
    FormIdx = MyGlb.FRM_MASTROIMPEGN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "AC97866E-B139-4702-A80F-4F7074314C18";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 408;
    DesignHeight = 238;
    set_Caption(new IDVariant("Mastro Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 408;
    Frames[1].Height = 212;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Par";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 212;
    PAN_PAR = new IDPanel(w, this, 1, "PAN_PAR");
    Frames[1].Content = PAN_PAR;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 212-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "072CCA30-A859-4B54-B5CF-29F6C5F1F8E2");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 856, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 2;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR85, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MASTROIMPEGN_PAR86();
      }
      PAN_PAR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PAR.FrIndex)
    {
      if (IdxFieldActived ==PFL_PAR_APRIPEG1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PAR.FrIndex)
    {
      if (IdxFieldActived ==PFL_PAR_APRIPEG2) {
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
    return (obj instanceof MastroImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MastroImpegni.class.getName() : (Glb.ClassWithPackage(MastroImpegni.class) ? MastroImpegni.class.getName().substring(MastroImpegni.class.getPackage().getName().length() + 1) : MastroImpegni.class.getName()));
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
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMSEROPE, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMRECOEN, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMSUBIMP, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMANNOMO, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMUNIORG, 0, (new IDVariant("U")));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo(IDL.NullValue(MainFrm.ESERCIZIO_INIZIO_WEB,(new IDVariant(2999))), true)<0)
      {
        INIZIOWEB = (new IDVariant(0));
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        INIZIOWEB = (new IDVariant(-1));
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMECAPI1, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEARTI1, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "UnloadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEPEG, 0).equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEPEG, 0).equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMECAPI1, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEARTI1, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "EndModalEvent", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Capitolo dal inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = 'S') ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Capitolo al inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("CAP_DA")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("ART_DA")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("CAP_A")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, 0),(new IDVariant(1.000000000000000e+016)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("ART_A")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, 0),(new IDVariant(99)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("COMP")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMRECOEN, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMDATELA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SERV_OP")), ((INIZIOWEB.booleanValue())?IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMUNIORG, 0):IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMSEROPE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("NO_MOV")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMANNOMO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("INT")), IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0), (new IDVariant(" Esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" elaborato in data "))), MainFrm.Datetostring(IDL.Today())), (new IDVariant(" ore "))), IDL.ToString(IDL.Time())));
      MainFrm.LanciaStampaJasper(((IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMSUBIMP, 0).equals((new IDVariant("S")), true))?(new IDVariant("Mastro_Subimpegni")):(new IDVariant("Mastro_Impegni"))), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce PEG
  // **********************************************************************
  public int ApriVocePEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce PEG Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEPEG, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "ApriVocePEG", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, 0));
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce PEG 1
  // **********************************************************************
  public int ApriVocePEG1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce PEG 1 Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEPEG, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "ApriVocePEG1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg 1
  // **********************************************************************
  public int InfoVocePeg1 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg 1 Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, 0));
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "InfoVocePeg1", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Par On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PAR);
      // 
      // Par On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTIC, 0))))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMECAPI1, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR86, IMDBDef16.PQSL_PAR86_ROWNAMEARTI1, 0))))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroImpegni", "ParOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void MASTROIMPEGN_PAR86() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR86_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR85, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR85, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR86_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR86_RS, 0, IMDBDef6.TBL_PAR85, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 0, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 1, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 2, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 3, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMRECOEN, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 4, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMSEROPE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 5, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMECAPI1, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 6, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMEARTI1, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 7, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMSUBIMP, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 8, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMANNOMO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR86_RS, 9, 0, IMDBDef6.TBL_PAR85, IMDBDef6.FLD_PAR85_ROWNAMUNIORG, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR85, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR85, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR85, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR86_RS, 0);
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
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PAR_APRIPEG1)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_APRIPEG2)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePEG1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_INFOPEG1)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_INFOPEG2)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg1();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, "FF33E865-9371-434C-8F12-07819639CEC1");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, "Capitolo/Art. dal");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, "A89907F9-2DE5-4B15-88C4-013851D1D21E");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, "Articolo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, "9A34C4A2-2969-4011-80CA-B97BD4251311");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, "Capitolo/Art. al");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, "6FC15D67-A0E0-4F66-BA5D-89C43C8047AA");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, "Articolo 1");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, "2519C55D-F031-4963-A475-5D1033C6FBDC");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, "Data Elaborazione");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, "916204F2-FEAC-4C8F-94BC-E3082E6EBDDA");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, "Residui Competenze Entrambi");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.VIS_OPTIONBUTTON);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, "14BD0329-B903-4CB9-AFD8-4650BEB411E9");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, "34CC8904-D5FC-414F-8468-BFB6C9D3F7BA");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, "Sub-Impegni");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, "587E8297-5642-46ED-B6E4-D75F7BD2C91E");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, "Anche non Movimentati");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, "6407A3E2-7602-402D-8C42-6A010C0426D0");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, "Servizio Operativo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, "F1360B8E-ABE0-46AE-A973-51B651151F6C");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, "/");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, "ABAF4859-85B6-4D2E-AF92-D1830778CF0D");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, "/");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, "AEB8A7F6-F506-40D1-9E2C-691578DDBF53");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, 0, "wsearch.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, "9481DCC7-14B4-4C3F-84CF-BE188224ABAE");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, 0, "wsearch.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, "0573AA61-4368-45EC-85BE-0B98D446798B");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, 0, "info.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, "0A1021C4-4646-48FA-815B-FA075B1966A9");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, 0, "info.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "D6DAAAFB-1133-42B7-BCCA-49E6220D946E");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "Elabora");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0, "button1.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_LIST, 88, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo Art dal");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_FORM, 8, 4, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_FORM, 108);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art. dal");
    PAN_PAR.SetFieldPage(PFL_PAR_CAPITOLO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_CAPITOLO, PPQRY_PAR86, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_LIST, 160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_FORM, 276, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_FORM, 160);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_PAR.SetFieldPage(PFL_PAR_ARTICOLO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ARTICOLO, PPQRY_PAR86, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo Art al");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, 12, 28, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, 104);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo/Art. al");
    PAN_PAR.SetFieldPage(PFL_PAR_CAPITOLO1, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_CAPITOLO1, PPQRY_PAR86, "A.ROWNAMECAPI1", "ROWNAMECAPI1", 3, 16, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_LIST, "Articolo 1");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, 276, 28, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLO1, MyGlb.PANEL_FORM, "Artic. 1");
    PAN_PAR.SetFieldPage(PFL_PAR_ARTICOLO1, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ARTICOLO1, PPQRY_PAR86, "A.ROWNAMEARTI1", "ROWNAMEARTI1", 1, 2, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_LIST, 232, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_FORM, 4, 64, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PAR.SetFieldPage(PFL_PAR_DATAELABORAZ, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_DATAELABORAZ, PPQRY_PAR86, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, 376, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, 152);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, "Res. Compet. Entrambi");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, 212, 64, 92, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, 160);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, 4);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, "Residui Competenze Entrambi");
    PAN_PAR.SetFieldPage(PFL_PAR_RESICOMPENTR, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_RESICOMPENTR, PPQRY_PAR86, "A.ROWNAMRECOEN", "ROWNAMRECOEN", 12, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_RESICOMPENTR, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_RESICOMPENTR, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_RESICOMPENTR, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_LIST, 104);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_FORM, 44, 92, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_FORM, 128);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PAR.SetFieldPage(PFL_PAR_UNITAORGANIZ, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_UNITAORGANIZ, PPQRY_PAR86, "A.ROWNAMUNIORG", "ROWNAMUNIORG", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_UNITAORGANIZ, (new IDVariant("U")), "U", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_UNITAORGANIZ, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_LIST, 68);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_LIST, "Sub Impegni");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_FORM, 72, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_FORM, 100);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SUBIMPEGNI, MyGlb.PANEL_FORM, "Sub-Impegni");
    PAN_PAR.SetFieldPage(PFL_PAR_SUBIMPEGNI, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SUBIMPEGNI, PPQRY_PAR86, "A.ROWNAMSUBIMP", "ROWNAMSUBIMP", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_SUBIMPEGNI, (new IDVariant("S")), "S", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_SUBIMPEGNI, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_LIST, 124);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_LIST, "Anche non Movimentati");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_FORM, 28, 140, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_FORM, 144);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ANCHENONMOVI, MyGlb.PANEL_FORM, "Anche non Movimentati");
    PAN_PAR.SetFieldPage(PFL_PAR_ANCHENONMOVI, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ANCHENONMOVI, PPQRY_PAR86, "A.ROWNAMANNOMO", "ROWNAMANNOMO", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_ANCHENONMOVI, (new IDVariant("S")), "S", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_ANCHENONMOVI, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, 464, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, "Servizio Operativo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, 52, 92, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, 120);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, "Servizio Operativo");
    PAN_PAR.SetFieldPage(PFL_PAR_SERVIZOPERAT, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SERVIZOPERAT, PPQRY_PAR86, "A.ROWNAMSEROPE", "ROWNAMSEROPE", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_SERVIZOPERAT, (new IDVariant("S")), "S", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_SERVIZOPERAT, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_LIST, 92, 172, 16, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_LIST, 2);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_FORM, 260, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_TRATTINO2, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_TRATTINO2, -1, "", "TRATTINO2", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_LIST, 100, 180, 16, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_LIST, 2);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_FORM, 260, 28, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_TRATTINO3, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_TRATTINO3, -1, "", "TRATTINO3", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_LIST, 256, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_FORM, 300, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_APRIPEG1, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_APRIPEG1, -1, "", "APRIPEG1", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_LIST, 264, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_FORM, 300, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_APRIPEG2, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_APRIPEG2, -1, "", "APRIPEG2", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_LIST, 264, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_FORM, 316, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_INFOPEG1, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_INFOPEG1, -1, "", "INFOPEG1", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_LIST, 272, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_FORM, 316, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_INFOPEG2, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_INFOPEG2, -1, "", "INFOPEG2", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 204, 136, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 228, 164, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_ELABORA, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR86", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR86, IMDBDef16.PQRY_PAR86_RS, IMDBDef6.TBL_PAR85);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CAPITOLO, IMDBDef6.FLD_PAR85_ROWNAMECAPIT);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ARTICOLO, IMDBDef6.FLD_PAR85_ROWNAMEARTIC);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CAPITOLO1, IMDBDef6.FLD_PAR85_ROWNAMECAPI1);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ARTICOLO1, IMDBDef6.FLD_PAR85_ROWNAMEARTI1);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DATAELABORAZ, IMDBDef6.FLD_PAR85_ROWNAMDATELA);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_RESICOMPENTR, IMDBDef6.FLD_PAR85_ROWNAMRECOEN);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_UNITAORGANIZ, IMDBDef6.FLD_PAR85_ROWNAMUNIORG);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_SUBIMPEGNI, IMDBDef6.FLD_PAR85_ROWNAMSUBIMP);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ANCHENONMOVI, IMDBDef6.FLD_PAR85_ROWNAMANNOMO);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_SERVIZOPERAT, IMDBDef6.FLD_PAR85_ROWNAMSEROPE);
    PAN_PAR.SetMasterTable(0, "PAR85");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
