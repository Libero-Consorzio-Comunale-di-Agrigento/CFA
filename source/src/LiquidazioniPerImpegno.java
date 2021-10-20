// **********************************************
// Liquidazioni Per Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniPerImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_LIQUIPERIMPE_CAPITOLO = 0;
  private static int PFL_LIQUIPERIMPE_ARTICOLO = 1;
  private static int PFL_LIQUIPERIMPE_IMPEGNO = 2;
  private static int PFL_LIQUIPERIMPE_ANNOIMP = 3;
  private static int PFL_LIQUIPERIMPE_COMPETENZE = 4;
  private static int PFL_LIQUIPERIMPE_SOLOEMESSE = 5;
  private static int PFL_LIQUIPERIMPE_DATAELABORAZ = 6;
  private static int PFL_LIQUIPERIMPE_ELABORA = 7;
  private static int PFL_LIQUIPERIMPE_APRI = 8;
  private static int PFL_LIQUIPERIMPE_INFO = 9;
  private static int PFL_LIQUIPERIMPE_NEWPANELABE1 = 10;
  private static int PFL_LIQUIPERIMPE_NEWPANELABE2 = 11;
  private static int PFL_LIQUIPERIMPE_APRIIMP = 12;
  private static int PFL_LIQUIPERIMPE_INFOIMP = 13;

  private static int PPQRY_SUBPERVOCPE2 = 0;


  IDPanel PAN_LIQUIPERIMPE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMPPERVOCPEG(IMDB);
    Init_TBL_PARAMETRIO24(IMDB);
    //
    //
    Init_PQRY_SUBPERVOCPE2(IMDB);
    Init_PQRY_SUBPERVOCPE2_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMPPERVOCPEG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_IMPPERVOCPEG, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_IMPPERVOCPEG, "TBL_IMPPERVOCPEG");
    IMDB.set_FldCode(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMSOLEME,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECOMPE,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_IMPPERVOCPEG,IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMANNIMP,1,4,0);
    IMDB.TblAddNew(IMDBDef6.TBL_IMPPERVOCPEG, 0);
  }

  private static void Init_TBL_PARAMETRIO24(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRIO24, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRIO24, "TBL_PARAMETRIO24");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIO24,IMDBDef6.FLD_PARAMETRIO24_OLDCAPITOLO, "OLDCAPITOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIO24,IMDBDef6.FLD_PARAMETRIO24_OLDCAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIO24,IMDBDef6.FLD_PARAMETRIO24_OLDARTICOLO, "OLDARTICOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIO24,IMDBDef6.FLD_PARAMETRIO24_OLDARTICOLO,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRIO24, 0);
  }

  private static void Init_PQRY_SUBPERVOCPE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBPERVOCPE2, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBPERVOCPE2, "PQRY_SUBPERVOCPE2");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMSOLEME,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECOMPE,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP,1,4,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_SUBPERVOCPE2, 0);
  }

  private static void Init_PQRY_SUBPERVOCPE2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS, "PQRY_SUBPERVOCPE2_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMSOLEME,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECOMPE,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE2_RS,IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniPerImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniPerImpegno()
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
    FormIdx = MyGlb.FRM_LIQUIPERIMPE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3D7D0587-3DDB-4492-B031-DA33994C4CAB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 440;
    DesignHeight = 266;
    set_Caption(new IDVariant("Liquidazioni Per Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 440;
    Frames[1].Height = 240;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Liquidazioni Per Impegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 240;
    PAN_LIQUIPERIMPE = new IDPanel(w, this, 1, "PAN_LIQUIPERIMPE");
    Frames[1].Content = PAN_LIQUIPERIMPE;
    PAN_LIQUIPERIMPE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIPERIMPE.VS = MainFrm.VisualStyleList;
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 440-MyGlb.PAN_OFFS_X, 240-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1A14FCD0-0744-440C-A336-6AE1B9ACCB5C");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 520, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIPERIMPE.InitStatus = 2;
    PAN_LIQUIPERIMPE_Init();
    PAN_LIQUIPERIMPE_InitFields();
    PAN_LIQUIPERIMPE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_IMPPERVOCPEG, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQUIPERIMPE_SUBPERVOCPE2();
      }
      PAN_LIQUIPERIMPE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_LIQUIPERIMPE.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQUIPERIMPE_APRI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_LIQUIPERIMPE.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQUIPERIMPE_APRIIMP) {
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
    return (obj instanceof LiquidazioniPerImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniPerImpegno.class.getName() : (Glb.ClassWithPackage(LiquidazioniPerImpegno.class) ? LiquidazioniPerImpegno.class.getName().substring(LiquidazioniPerImpegno.class.getPackage().getName().length() + 1) : LiquidazioniPerImpegno.class.getName()));
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
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "ApriPeg", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "InfoPeg", _e);
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
      if (((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0))))) && ((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0)) || (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0)))))))
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("NUMERO_IMP"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("ANNO_IMP"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("COMP_RES"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("DATA_ELAB"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("SOLO_EMESS"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("INTERVENTO"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("CAPITOLO"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("ARTICOLO"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Liquidazioni_per_Impegno"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0),(new IDVariant(0)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0),(new IDVariant(0)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECOMPE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMDATELA, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMSOLEME, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Capitolo o Impegno incompleti", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Imp
  // **********************************************************************
  public int ApriImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Imp Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "ApriImp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Imp
  // **********************************************************************
  public int InfoImp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Imp Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR3, IMDBDef4.FLD_PARAMETRVAR3_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0));
        MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "InfoImp", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMSOLEME, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECOMPE, 0, (new IDVariant("C")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMANNIMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMNUMIMP, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "UnloadEvent", _e);
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
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Per Impegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIPERIMPE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIPERIMPE);
      // 
      // Liquidazioni Per Impegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0))))
      {
        PAN_LIQUIPERIMPE.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIPERIMPE.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0))))
      {
        PAN_LIQUIPERIMPE.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIPERIMPE.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "LiquidazioniPerImpegnoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Per Impegno On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUIPERIMPE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Per Impegno On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_LIQUIPERIMPE_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_LIQUIPERIMPE_ARTICOLO)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIO24, IMDBDef6.FLD_PARAMETRIO24_OLDCAPITOLO, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIO24, IMDBDef6.FLD_PARAMETRIO24_OLDARTICOLO, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0))))
          {
            if (!(MainFrm.EsistenzaCapitolo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0), (new IDVariant("SI")))))
            {
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0, (new IDVariant()));
            }
            else
            {
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0, (new IDVariant()));
            }
          }
          IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO24, IMDBDef6.FLD_PARAMETRIO24_OLDCAPITOLO, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0));
          IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO24, IMDBDef6.FLD_PARAMETRIO24_OLDARTICOLO, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQUIPERIMPE_IMPEGNO)), true) || Column.equals((new IDVariant(PFL_LIQUIPERIMPE_ANNOIMP)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0))))
        {
          if (MainFrm.ImpPresente(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0)).equals((new IDVariant(1)), true))
          {
            IDVariant v_CAPITOLOIMP = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_ARTICOLOIMP = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.CAPITOLO as IMPCAPITOLO, ");
            SQL.append("  A.ARTICOLO as IMPARTICOLO ");
            SQL.append("from ");
            SQL.append("  IMP A ");
            SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CAPITOLOIMP = QV.Get("IMPCAPITOLO", IDVariant.DECIMAL) ;
              v_ARTICOLOIMP = QV.Get("IMPARTICOLO", IDVariant.INTEGER) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMECAPIT, 0, new IDVariant(v_CAPITOLOIMP));
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMEARTIC, 0, new IDVariant(v_ARTICOLOIMP));
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO24, IMDBDef6.FLD_PARAMETRIO24_OLDCAPITOLO, 0, new IDVariant(v_CAPITOLOIMP));
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO24, IMDBDef6.FLD_PARAMETRIO24_OLDARTICOLO, 0, new IDVariant(v_ARTICOLOIMP));
          }
          else
          {
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMNUMIMP, 0, ((PAN_LIQUIPERIMPE.GetOrgValue(PFL_LIQUIPERIMPE_IMPEGNO).equals((new IDVariant())))?(new IDVariant()):IDL.ToInteger(PAN_LIQUIPERIMPE.GetOrgValue(PFL_LIQUIPERIMPE_IMPEGNO))));
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE2, IMDBDef16.PQSL_SUBPERVOCPE2_ROWNAMANNIMP, 0, ((PAN_LIQUIPERIMPE.GetOrgValue(PFL_LIQUIPERIMPE_ANNOIMP).equals((new IDVariant())))?(new IDVariant()):IDL.ToInteger(PAN_LIQUIPERIMPE.GetOrgValue(PFL_LIQUIPERIMPE_ANNOIMP))));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImpegno", "LiquidazioniPerImpegnoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Voce P E G
  // Primary record source for panel data
  // **********************************************************************
  private void LIQUIPERIMPE_SUBPERVOCPE2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_SUBPERVOCPE2_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_IMPPERVOCPEG, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_IMPPERVOCPEG, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 0, IMDBDef6.TBL_IMPPERVOCPEG, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 0, 0, IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 1, 0, IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 2, 0, IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 3, 0, IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMSOLEME, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 4, 0, IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECOMPE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 5, 0, IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMNUMIMP, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 6, 0, IMDBDef6.TBL_IMPPERVOCPEG, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMANNIMP, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_IMPPERVOCPEG, 0);
      if (IMDB.Eof(IMDBDef6.TBL_IMPPERVOCPEG, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_IMPPERVOCPEG, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_SUBPERVOCPE2_RS, 0);
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
  private void PAN_LIQUIPERIMPE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIPERIMPE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIPERIMPE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIPERIMPE, Cancel);
    // Stub
  }

  private void PAN_LIQUIPERIMPE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIPERIMPE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERIMPE_APRI)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERIMPE_INFO)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERIMPE_APRIIMP)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERIMPE_INFOIMP)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERIMPE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImp();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIPERIMPE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUIPERIMPE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIPERIMPE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIPERIMPE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIPERIMPE_Init()
  {

    PAN_LIQUIPERIMPE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIPERIMPE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIPERIMPE.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, "29E6A65F-9ECC-4576-95CB-5F8B40F29918");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, "Capitolo/Art.");
    PAN_LIQUIPERIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, "372F0C67-9702-4F11-A5E8-D99DAD3050FD");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, "Articolo");
    PAN_LIQUIPERIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, "0EEAA4B0-3C01-428A-8EBE-98D9A8BD3B22");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, "Impegno");
    PAN_LIQUIPERIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, "209F928E-A62F-45E0-9870-ACFEF9A2DD3C");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, "Anno Imp");
    PAN_LIQUIPERIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, "A10D0CD3-8509-46AA-B369-2060D0F11CC7");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, "Competenze");
    PAN_LIQUIPERIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.VIS_OPTIONBUTTON);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, "AC6AFB64-7078-4D4B-9ACB-F6A904D471EA");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, "Solo Emesse");
    PAN_LIQUIPERIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, "7F42B84E-B108-401E-9454-DB7FA1B32534");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, "Data Elaborazione");
    PAN_LIQUIPERIMPE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, "69A15941-AB45-495C-9885-95F21B563833");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, "Elabora");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIPERIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, 0, "button1.gif", false);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, "9A2A1A0E-06B2-4415-ADBB-9427291618B0");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, 0, "wsearch.gif", false);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, "7E64D33C-92BB-46A2-BE71-DF8A61E609BA");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, 0, "info.gif", false);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, "635B99DA-C45C-43E2-9B09-68C9B6A25590");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, "/");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, "E3A662CE-63BB-4F85-B247-4C9D7B5E0482");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, "/");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, "2E1563B5-5FA9-43CA-BB40-33393E664F9A");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, 0, "wsearch.gif", false);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERIMPE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, "AEE150A1-359C-492C-8000-AF522745627B");
    PAN_LIQUIPERIMPE.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, "");
    PAN_LIQUIPERIMPE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERIMPE.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, 0, "info.gif", false);
    PAN_LIQUIPERIMPE.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_LIQUIPERIMPE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_LIST, 88, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo Art");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_FORM, 20, 4, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_CAPITOLO, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_CAPITOLO, PPQRY_SUBPERVOCPE2, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_LIST, 160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_FORM, 264, 4, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_ARTICOLO, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_ARTICOLO, PPQRY_SUBPERVOCPE2, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_FORM, 44, 32, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_IMPEGNO, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_IMPEGNO, PPQRY_SUBPERVOCPE2, "A.ROWNAMNUMIMP", "ROWNAMNUMIMP", 1, 5, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_LIST, "Anno Imp");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_FORM, 172, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ANNOIMP, MyGlb.PANEL_FORM, "Ann. Im.");
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_ANNOIMP, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_ANNOIMP, PPQRY_SUBPERVOCPE2, "A.ROWNAMANNIMP", "ROWNAMANNIMP", 1, 4, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_LIST, "Compet.");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_FORM, 52, 60, 88, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_FORM, 4);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_COMPETENZE, MyGlb.PANEL_FORM, "Compet.");
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_COMPETENZE, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_COMPETENZE, PPQRY_SUBPERVOCPE2, "A.ROWNAMECOMPE", "ROWNAMECOMPE", 12, 1, 0, -13997);
    PAN_LIQUIPERIMPE.SetValueListItem(PFL_LIQUIPERIMPE_COMPETENZE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_LIQUIPERIMPE.SetValueListItem(PFL_LIQUIPERIMPE_COMPETENZE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_LIQUIPERIMPE.SetValueListItem(PFL_LIQUIPERIMPE_COMPETENZE, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_LIST, 416, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_LIST, "Sl. Emes.");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_FORM, 152, 76, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_SOLOEMESSE, MyGlb.PANEL_FORM, "Solo Emesse");
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_SOLOEMESSE, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_SOLOEMESSE, PPQRY_SUBPERVOCPE2, "A.ROWNAMSOLEME", "ROWNAMSOLEME", 5, 1, 0, -13997);
    PAN_LIQUIPERIMPE.SetValueListItem(PFL_LIQUIPERIMPE_SOLOEMESSE, (new IDVariant("S")), "S", "", "", -1);
    PAN_LIQUIPERIMPE.SetValueListItem(PFL_LIQUIPERIMPE_SOLOEMESSE, (new IDVariant("N")), "N", "", "", -1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_LIST, 272, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_FORM, 88, 140, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_DATAELABORAZ, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_DATAELABORAZ, PPQRY_SUBPERVOCPE2, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, MyGlb.PANEL_LIST, 268, 132, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, MyGlb.PANEL_FORM, 208, 180, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_ELABORA, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, MyGlb.PANEL_LIST, 236, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, MyGlb.PANEL_FORM, 292, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_APRI, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, MyGlb.PANEL_LIST, 244, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, MyGlb.PANEL_FORM, 308, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_INFO, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_INFO, -1, "", "INFO", 0, 0, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, MyGlb.PANEL_LIST, 120, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, MyGlb.PANEL_FORM, 248, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_NEWPANELABE1, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, MyGlb.PANEL_LIST, 120, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, MyGlb.PANEL_FORM, 156, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_NEWPANELABE2, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, MyGlb.PANEL_LIST, 244, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, MyGlb.PANEL_FORM, 220, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_APRIIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_APRIIMP, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_APRIIMP, -1, "", "APRIIMP", 0, 0, 0, -13997);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, MyGlb.PANEL_LIST, 252, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERIMPE.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, MyGlb.PANEL_FORM, 236, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERIMPE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERIMPE.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERIMPE_INFOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERIMPE.SetFieldPage(PFL_LIQUIPERIMPE_INFOIMP, -1, -1);
    PAN_LIQUIPERIMPE.SetFieldPanel(PFL_LIQUIPERIMPE_INFOIMP, -1, "", "INFOIMP", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIPERIMPE_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIPERIMPE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIPERIMPE.SetIMDB(IMDB, "PQRY_SUBPERVOCPE2", true);
    PAN_LIQUIPERIMPE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_LIQUIPERIMPE.SetQueryIMDB(PPQRY_SUBPERVOCPE2, IMDBDef16.PQRY_SUBPERVOCPE2_RS, IMDBDef6.TBL_IMPPERVOCPEG);
    JustLoaded = true;
    PAN_LIQUIPERIMPE.SetFieldPrimaryIndex(PFL_LIQUIPERIMPE_CAPITOLO, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECAPIT);
    PAN_LIQUIPERIMPE.SetFieldPrimaryIndex(PFL_LIQUIPERIMPE_ARTICOLO, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMEARTIC);
    PAN_LIQUIPERIMPE.SetFieldPrimaryIndex(PFL_LIQUIPERIMPE_IMPEGNO, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMNUMIMP);
    PAN_LIQUIPERIMPE.SetFieldPrimaryIndex(PFL_LIQUIPERIMPE_ANNOIMP, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMANNIMP);
    PAN_LIQUIPERIMPE.SetFieldPrimaryIndex(PFL_LIQUIPERIMPE_COMPETENZE, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMECOMPE);
    PAN_LIQUIPERIMPE.SetFieldPrimaryIndex(PFL_LIQUIPERIMPE_SOLOEMESSE, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMSOLEME);
    PAN_LIQUIPERIMPE.SetFieldPrimaryIndex(PFL_LIQUIPERIMPE_DATAELABORAZ, IMDBDef6.FLD_IMPPERVOCPEG_ROWNAMDATELA);
    PAN_LIQUIPERIMPE.SetMasterTable(0, "IMPPERVOCPEG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIPERIMPE.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIPERIMPE.iUseListQBE;
      PAN_LIQUIPERIMPE.iUseListQBE = 0;
      PAN_LIQUIPERIMPE.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIPERIMPE.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIPERIMPE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIPERIMPE) PAN_LIQUIPERIMPE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIPERIMPE) PAN_LIQUIPERIMPE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIPERIMPE) PAN_LIQUIPERIMPE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIPERIMPE) PAN_LIQUIPERIMPE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIPERIMPE) PAN_LIQUIPERIMPE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
