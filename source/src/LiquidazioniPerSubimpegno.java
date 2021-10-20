// **********************************************
// Liquidazioni Per Subimpegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniPerSubimpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_LIQUIPERSUBI_CAPITOLO = 0;
  private static int PFL_LIQUIPERSUBI_ARTICOLO = 1;
  private static int PFL_LIQUIPERSUBI_SUBIMPEGNO = 2;
  private static int PFL_LIQUIPERSUBI_ANNOSUBIMP = 3;
  private static int PFL_LIQUIPERSUBI_COMPETENZE = 4;
  private static int PFL_LIQUIPERSUBI_SOLOEMESSE = 5;
  private static int PFL_LIQUIPERSUBI_DATAELABORAZ = 6;
  private static int PFL_LIQUIPERSUBI_ELABORA = 7;
  private static int PFL_LIQUIPERSUBI_APRI = 8;
  private static int PFL_LIQUIPERSUBI_INFO = 9;
  private static int PFL_LIQUIPERSUBI_NEWPANELABE1 = 10;
  private static int PFL_LIQUIPERSUBI_NEWPANELABE2 = 11;
  private static int PFL_LIQUIPERSUBI_APRIIMP = 12;
  private static int PFL_LIQUIPERSUBI_INFOIMP = 13;

  private static int PPQRY_SUBPERVOCPE4 = 0;


  IDPanel PAN_LIQUIPERSUBI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_SUBPERVOCPEG(IMDB);
    Init_TBL_PARAMETRIO25(IMDB);
    //
    //
    Init_PQRY_SUBPERVOCPE4(IMDB);
    Init_PQRY_SUBPERVOCPE4_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_SUBPERVOCPEG(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_SUBPERVOCPEG, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_SUBPERVOCPEG, "TBL_SUBPERVOCPEG");
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMSOLEME,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECOMPE,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBPERVOCPEG,IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMANNSUB,1,4,0);
    IMDB.TblAddNew(IMDBDef6.TBL_SUBPERVOCPEG, 0);
  }

  private static void Init_TBL_PARAMETRIO25(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRIO25, 2);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRIO25, "TBL_PARAMETRIO25");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIO25,IMDBDef6.FLD_PARAMETRIO25_CAPITOLOOLD, "CAPITOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIO25,IMDBDef6.FLD_PARAMETRIO25_CAPITOLOOLD,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRIO25,IMDBDef6.FLD_PARAMETRIO25_ARTICOLOOLD, "ARTICOLOOLD");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRIO25,IMDBDef6.FLD_PARAMETRIO25_ARTICOLOOLD,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRIO25, 0);
  }

  private static void Init_PQRY_SUBPERVOCPE4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBPERVOCPE4, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBPERVOCPE4, "PQRY_SUBPERVOCPE4");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMSOLEME,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECOMPE,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB,1,4,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_SUBPERVOCPE4, 0);
  }

  private static void Init_PQRY_SUBPERVOCPE4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS, "PQRY_SUBPERVOCPE4_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMSOLEME, "ROWNAMSOLEME");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMSOLEME,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECOMPE,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBPERVOCPE4_RS,IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniPerSubimpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniPerSubimpegno()
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
    FormIdx = MyGlb.FRM_LIQUIPERSUBI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "78FD70A0-19D9-442B-9020-95F3F84F8234";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 448;
    DesignHeight = 254;
    set_Caption(new IDVariant("Liquidazioni Per Subimpegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 448;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Liquidazioni Per Subimpegno";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_LIQUIPERSUBI = new IDPanel(w, this, 1, "PAN_LIQUIPERSUBI");
    Frames[1].Content = PAN_LIQUIPERSUBI;
    PAN_LIQUIPERSUBI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIPERSUBI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 448-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7ADC8920-A2C2-443B-9E5D-BD39BC017FD5");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 520, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIPERSUBI.InitStatus = 2;
    PAN_LIQUIPERSUBI_Init();
    PAN_LIQUIPERSUBI_InitFields();
    PAN_LIQUIPERSUBI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_SUBPERVOCPEG, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQUIPERSUBI_SUBPERVOCPE4();
      }
      PAN_LIQUIPERSUBI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_LIQUIPERSUBI.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQUIPERSUBI_APRI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELSUBIMPUO && flRis && IdxPanelActived == PAN_LIQUIPERSUBI.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQUIPERSUBI_APRIIMP) {
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
    return (obj instanceof LiquidazioniPerSubimpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniPerSubimpegno.class.getName() : (Glb.ClassWithPackage(LiquidazioniPerSubimpegno.class) ? LiquidazioniPerSubimpegno.class.getName().substring(LiquidazioniPerSubimpegno.class.getPackage().getName().length() + 1) : LiquidazioniPerSubimpegno.class.getName()));
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
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "ApriPeg", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "InfoPeg", _e);
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
      if (((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0))))) && ((IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0)) || (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0)))))))
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("NUMERO_SUBIMP"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("ANNO_SUBIMP"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("COMP_RES"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("DATA_ELAB"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("SOLO_EMESS"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("CAPITOLO"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("ARTICOLO"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Liquidazioni_per_SubImpegno"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0),(new IDVariant(0)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0),(new IDVariant(0)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECOMPE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMDATELA, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMSOLEME, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
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
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI95, IMDBDef1.FLD_PARAMETRI95_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELSUBIMPUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "ApriImp", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRVAR4, IMDBDef4.FLD_PARAMETRVAR4_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMANSUIM, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0));
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMNUSUIM, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0));
        if (IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("I")));
        }
        else
        {
          IMDB.set_Value(IMDBDef4.TBL_PARAMETRI74, IMDBDef4.FLD_PARAMETRI74_ROWNAMIMPRES, 0, (new IDVariant("R")));
        }
        MainFrm.Show(MyGlb.FRM_INFORSUBIMPE, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "InfoImp", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMSOLEME, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECOMPE, 0, (new IDVariant("C")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMANNSUB, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMNUMSUB, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "UnloadEvent", _e);
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
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (Result.equals((new IDVariant(-1)), true) && LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSUBIMPUO)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_NUMERO_SUBIMP, 0));
        IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP, IMDBDef7.PQSL_ESEIMP_ANNO_SUBIMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Per Subimpegno On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIPERSUBI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIPERSUBI);
      // 
      // Liquidazioni Per Subimpegno On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0))))
      {
        PAN_LIQUIPERSUBI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIPERSUBI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0))))
      {
        PAN_LIQUIPERSUBI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQUIPERSUBI.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "LiquidazioniPerSubimpegnoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Per Subimpegno On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUIPERSUBI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Per Subimpegno On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_LIQUIPERSUBI_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_LIQUIPERSUBI_ARTICOLO)), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIO25, IMDBDef6.FLD_PARAMETRIO25_CAPITOLOOLD, 0),(new IDVariant(-1))), true)!=0 || IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0),(new IDVariant(-1))).compareTo(IDL.NullValue(IMDB.Value(IMDBDef6.TBL_PARAMETRIO25, IMDBDef6.FLD_PARAMETRIO25_ARTICOLOOLD, 0),(new IDVariant(-1))), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0))))
          {
            if (!(MainFrm.EsistenzaCapitolo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0), (new IDVariant("SI")))))
            {
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0, (new IDVariant()));
            }
            else
            {
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0, (new IDVariant()));
              IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0, (new IDVariant()));
            }
          }
          IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO25, IMDBDef6.FLD_PARAMETRIO25_CAPITOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0));
          IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO25, IMDBDef6.FLD_PARAMETRIO25_ARTICOLOOLD, 0, IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0));
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQUIPERSUBI_SUBIMPEGNO)), true) || Column.equals((new IDVariant(PFL_LIQUIPERSUBI_ANNOSUBIMP)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0))))
        {
          if (MainFrm.SubImpPresente(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0), IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0)).equals((new IDVariant(1)), true))
          {
            IDVariant v_CAPITOLOIMP = new IDVariant(0,IDVariant.DECIMAL);
            IDVariant v_ARTICOLOIMP = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.CAPITOLO as SUBIMPCAPITO, ");
            SQL.append("  A.ARTICOLO as SUBIMPARTICO ");
            SQL.append("from ");
            SQL.append("  SUBIMP A ");
            SQL.append("where (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CAPITOLOIMP = QV.Get("SUBIMPCAPITO", IDVariant.DECIMAL) ;
              v_ARTICOLOIMP = QV.Get("SUBIMPARTICO", IDVariant.INTEGER) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMECAPIT, 0, new IDVariant(v_CAPITOLOIMP));
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMEARTIC, 0, new IDVariant(v_ARTICOLOIMP));
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO25, IMDBDef6.FLD_PARAMETRIO25_CAPITOLOOLD, 0, new IDVariant(v_CAPITOLOIMP));
            IMDB.set_Value(IMDBDef6.TBL_PARAMETRIO25, IMDBDef6.FLD_PARAMETRIO25_ARTICOLOOLD, 0, new IDVariant(v_ARTICOLOIMP));
          }
          else
          {
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0, ((PAN_LIQUIPERSUBI.GetOrgValue(PFL_LIQUIPERSUBI_ANNOSUBIMP).equals((new IDVariant())))?(new IDVariant()):IDL.ToInteger(PAN_LIQUIPERSUBI.GetOrgValue(PFL_LIQUIPERSUBI_ANNOSUBIMP))));
            IMDB.set_Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMNUMSUB, 0, ((PAN_LIQUIPERSUBI.GetOrgValue(PFL_LIQUIPERSUBI_SUBIMPEGNO).equals((new IDVariant())))?(new IDVariant()):IDL.ToInteger(PAN_LIQUIPERSUBI.GetOrgValue(PFL_LIQUIPERSUBI_SUBIMPEGNO))));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerSubimpegno", "LiquidazioniPerSubimpegnoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Voce P E G
  // Primary record source for panel data
  // **********************************************************************
  private void LIQUIPERSUBI_SUBPERVOCPE4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_SUBPERVOCPE4_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_SUBPERVOCPEG, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_SUBPERVOCPEG, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 0, IMDBDef6.TBL_SUBPERVOCPEG, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 0, 0, IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 1, 0, IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 2, 0, IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 3, 0, IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMSOLEME, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 4, 0, IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECOMPE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 5, 0, IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMNUMSUB, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 6, 0, IMDBDef6.TBL_SUBPERVOCPEG, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMANNSUB, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_SUBPERVOCPEG, 0);
      if (IMDB.Eof(IMDBDef6.TBL_SUBPERVOCPEG, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_SUBPERVOCPEG, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_SUBPERVOCPE4_RS, 0);
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
  private void PAN_LIQUIPERSUBI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIPERSUBI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIPERSUBI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIPERSUBI, Cancel);
    // Stub
  }

  private void PAN_LIQUIPERSUBI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIPERSUBI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERSUBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERSUBI_APRI)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERSUBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERSUBI_INFO)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERSUBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERSUBI_APRIIMP)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERSUBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQUIPERSUBI_INFOIMP)
    {
      this.IdxPanelActived = this.PAN_LIQUIPERSUBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImp();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIPERSUBI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUIPERSUBI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIPERSUBI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIPERSUBI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIPERSUBI_Init()
  {

    PAN_LIQUIPERSUBI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIPERSUBI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIPERSUBI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, "0BA9B5AB-B593-4414-97CF-41934AFED3D9");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, "Capitolo/Art.");
    PAN_LIQUIPERSUBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, "C02D23E5-FD53-4043-BB38-6B102C718015");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, "Articolo");
    PAN_LIQUIPERSUBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, "8A718896-AA9F-4A4B-9A8A-54AF1815C9D5");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, "Sub-Impegno");
    PAN_LIQUIPERSUBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, "BE6F340E-5CF0-420B-8F87-6813D44B5747");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, "Anno Subimp");
    PAN_LIQUIPERSUBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, "42F6DC86-6F6D-4463-9443-8E08FB098476");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, "Competenze");
    PAN_LIQUIPERSUBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.VIS_OPTIONBUTTON);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, "93A8EF77-B7E4-4EAB-B16B-B553B8EFE174");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, "Solo Emesse");
    PAN_LIQUIPERSUBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, "457DB08B-AEF8-475A-A0BF-40B32130CD0F");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, "Data Elaborazione");
    PAN_LIQUIPERSUBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, "6A74310B-716A-436A-8B28-5AE08DA4FEFB");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, "Elabora");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIPERSUBI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, 0, "button1.gif", false);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, "3A276CF0-1923-4C98-896D-34C5ACD8BBFD");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERSUBI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, 0, "wsearch.gif", false);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, "6ECDDA55-2732-4133-A147-C0857005BC56");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERSUBI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, 0, "info.gif", false);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, "06482C07-7D61-4641-A154-581AC079A02C");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, "/");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, "C02316E9-FA6A-4DF3-AA64-7871395EA9D6");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, "/");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, "0D7FA97E-D3B3-4B18-83F4-E8DBAC494256");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERSUBI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, 0, "wsearch.gif", false);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIPERSUBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, "58976813-A3EF-41EB-8746-A46FE9068276");
    PAN_LIQUIPERSUBI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, "");
    PAN_LIQUIPERSUBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQUIPERSUBI.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, 0, "info.gif", false);
    PAN_LIQUIPERSUBI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_LIQUIPERSUBI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_LIST, 88, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo Art");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_FORM, 8, 4, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_CAPITOLO, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_CAPITOLO, PPQRY_SUBPERVOCPE4, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_LIST, 160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_FORM, 260, 4, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_ARTICOLO, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_ARTICOLO, PPQRY_SUBPERVOCPE4, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub Impegno");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_FORM, 24, 32, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub Imp.");
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_SUBIMPEGNO, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_SUBIMPEGNO, PPQRY_SUBPERVOCPE4, "A.ROWNAMNUMSUB", "ROWNAMNUMSUB", 1, 5, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno Subimp");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_FORM, 168, 32, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ANNOSUBIMP, MyGlb.PANEL_FORM, "An. Sub.");
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_ANNOSUBIMP, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_ANNOSUBIMP, PPQRY_SUBPERVOCPE4, "A.ROWNAMANNSUB", "ROWNAMANNSUB", 1, 4, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_LIST, "Compet.");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_FORM, 32, 60, 88, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_FORM, 4);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_COMPETENZE, MyGlb.PANEL_FORM, "Compet.");
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_COMPETENZE, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_COMPETENZE, PPQRY_SUBPERVOCPE4, "A.ROWNAMECOMPE", "ROWNAMECOMPE", 12, 1, 0, -13997);
    PAN_LIQUIPERSUBI.SetValueListItem(PFL_LIQUIPERSUBI_COMPETENZE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_LIQUIPERSUBI.SetValueListItem(PFL_LIQUIPERSUBI_COMPETENZE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_LIQUIPERSUBI.SetValueListItem(PFL_LIQUIPERSUBI_COMPETENZE, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_LIST, 416, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_LIST, 80);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_LIST, "Sl. Emes.");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_FORM, 128, 76, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_SOLOEMESSE, MyGlb.PANEL_FORM, "Solo Emesse");
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_SOLOEMESSE, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_SOLOEMESSE, PPQRY_SUBPERVOCPE4, "A.ROWNAMSOLEME", "ROWNAMSOLEME", 5, 1, 0, -13997);
    PAN_LIQUIPERSUBI.SetValueListItem(PFL_LIQUIPERSUBI_SOLOEMESSE, (new IDVariant("S")), "S", "", "", -1);
    PAN_LIQUIPERSUBI.SetValueListItem(PFL_LIQUIPERSUBI_SOLOEMESSE, (new IDVariant("N")), "N", "", "", -1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_LIST, 272, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_FORM, 40, 136, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_DATAELABORAZ, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_DATAELABORAZ, PPQRY_SUBPERVOCPE4, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, MyGlb.PANEL_LIST, 268, 132, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, MyGlb.PANEL_FORM, 204, 164, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_ELABORA, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, MyGlb.PANEL_LIST, 236, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, MyGlb.PANEL_FORM, 288, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_APRI, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, MyGlb.PANEL_LIST, 244, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, MyGlb.PANEL_FORM, 304, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_INFO, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_INFO, -1, "", "INFO", 0, 0, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, MyGlb.PANEL_LIST, 120, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, MyGlb.PANEL_FORM, 244, 4, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_NEWPANELABE1, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, MyGlb.PANEL_LIST, 120, 12, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, MyGlb.PANEL_FORM, 148, 32, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_NEWPANELABE2, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, MyGlb.PANEL_LIST, 244, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, MyGlb.PANEL_FORM, 216, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_APRIIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_APRIIMP, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_APRIIMP, -1, "", "APRIIMP", 0, 0, 0, -13997);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, MyGlb.PANEL_LIST, 252, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIPERSUBI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, MyGlb.PANEL_FORM, 232, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIPERSUBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIPERSUBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIPERSUBI_INFOIMP, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIPERSUBI.SetFieldPage(PFL_LIQUIPERSUBI_INFOIMP, -1, -1);
    PAN_LIQUIPERSUBI.SetFieldPanel(PFL_LIQUIPERSUBI_INFOIMP, -1, "", "INFOIMP", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIPERSUBI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIPERSUBI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIPERSUBI.SetIMDB(IMDB, "PQRY_SUBPERVOCPE4", true);
    PAN_LIQUIPERSUBI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_LIQUIPERSUBI.SetQueryIMDB(PPQRY_SUBPERVOCPE4, IMDBDef16.PQRY_SUBPERVOCPE4_RS, IMDBDef6.TBL_SUBPERVOCPEG);
    JustLoaded = true;
    PAN_LIQUIPERSUBI.SetFieldPrimaryIndex(PFL_LIQUIPERSUBI_CAPITOLO, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECAPIT);
    PAN_LIQUIPERSUBI.SetFieldPrimaryIndex(PFL_LIQUIPERSUBI_ARTICOLO, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMEARTIC);
    PAN_LIQUIPERSUBI.SetFieldPrimaryIndex(PFL_LIQUIPERSUBI_SUBIMPEGNO, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMNUMSUB);
    PAN_LIQUIPERSUBI.SetFieldPrimaryIndex(PFL_LIQUIPERSUBI_ANNOSUBIMP, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMANNSUB);
    PAN_LIQUIPERSUBI.SetFieldPrimaryIndex(PFL_LIQUIPERSUBI_COMPETENZE, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMECOMPE);
    PAN_LIQUIPERSUBI.SetFieldPrimaryIndex(PFL_LIQUIPERSUBI_SOLOEMESSE, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMSOLEME);
    PAN_LIQUIPERSUBI.SetFieldPrimaryIndex(PFL_LIQUIPERSUBI_DATAELABORAZ, IMDBDef6.FLD_SUBPERVOCPEG_ROWNAMDATELA);
    PAN_LIQUIPERSUBI.SetMasterTable(0, "SUBPERVOCPEG");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIPERSUBI.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIPERSUBI.iUseListQBE;
      PAN_LIQUIPERSUBI.iUseListQBE = 0;
      PAN_LIQUIPERSUBI.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIPERSUBI.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIPERSUBI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIPERSUBI) PAN_LIQUIPERSUBI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIPERSUBI) PAN_LIQUIPERSUBI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIPERSUBI) PAN_LIQUIPERSUBI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIPERSUBI) PAN_LIQUIPERSUBI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIPERSUBI) PAN_LIQUIPERSUBI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
