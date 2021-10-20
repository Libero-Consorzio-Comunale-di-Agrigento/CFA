// **********************************************
// Parametri Previsioni P E G
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriPrevisioniPEG extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ANCHEUOSOTTO = 0;
  private static int PFL_PARAMETRI_PARTE = 1;
  private static int PFL_PARAMETRI_BILANCIO = 2;
  private static int PFL_PARAMETRI_VARIAZIONI = 3;
  private static int PFL_PARAMETRI_PREVANNINCOR = 4;
  private static int PFL_PARAMETRI_ORDINAMENTO = 5;
  private static int PFL_PARAMETRI_CMDELABORA = 6;
  private static int PFL_PARAMETRI_VARIAZOLABEL = 7;
  private static int PFL_PARAMETRI_PREANNINCOLA = 8;

  private static int PPQRY_PARAMETRI110 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI688(IMDB);
    //
    //
    Init_PQRY_PARAMETRI110(IMDB);
    Init_PQRY_PARAMETRI110_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI688(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI688, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI688, "TBL_PARAMETRI688");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAANCUOSOT, "PARAANCUOSOT");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAANCUOSOT,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMPARTE,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMBILANCI, "PARAMBILANCI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMBILANCI,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARAMORDINAM,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARATIPOSTRU, "PARATIPOSTRU");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI688,IMDBDef6.FLD_PARAMETRI688_PARATIPOSTRU,5,4,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI688, 0);
  }

  private static void Init_PQRY_PARAMETRI110(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI110, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI110, "PQRY_PARAMETRI110");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAANCUOSOT, "PARAANCUOSOT");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAANCUOSOT,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMPARTE,12,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMBILANCI, "PARAMBILANCI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMBILANCI,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110,IMDBDef17.PQSL_PARAMETRI110_PARAMORDINAM,5,1,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI110, 0);
  }

  private static void Init_PQRY_PARAMETRI110_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI110_RS, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI110_RS, "PQRY_PARAMETRI110_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAANCUOSOT, "PARAANCUOSOT");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAANCUOSOT,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMPARTE,12,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMBILANCI, "PARAMBILANCI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMBILANCI,5,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMVARIAZI, "PARAMVARIAZI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMVARIAZI,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARPREANINCO, "PARPREANINCO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARPREANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMORDINAM, "PARAMORDINAM");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI110_RS,IMDBDef17.PQSL_PARAMETRI110_PARAMORDINAM,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriPrevisioniPEG(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriPrevisioniPEG()
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
    FormIdx = MyGlb.FRM_PARAMPREVPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A24D6D73-14DC-4AEF-8EDC-251ECAC41149";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 432;
    DesignHeight = 250;
    set_Caption(new IDVariant("Parametri Previsioni P E G"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 432;
    Frames[1].Height = 224;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 224;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 432-MyGlb.PAN_OFFS_X, 224-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A3FCA823-D0CC-4C5F-AF8D-A0F22DD37A22");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 424, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI688, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARAMPREVPEG_PARAMETRI110();
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
    return (obj instanceof ParametriPrevisioniPEG);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriPrevisioniPEG.class.getName() : (Glb.ClassWithPackage(ParametriPrevisioniPEG.class) ? ParametriPrevisioniPEG.class.getName().substring(ParametriPrevisioniPEG.class.getPackage().getName().length() + 1) : ParametriPrevisioniPEG.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Parametri Previsioni P.e.g.", IDVariant.STRING));
      v_CAPTION1 = (new IDVariant("Anche U.O. Sottostanti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      PAN_PARAMETRI.set_Header(Glb.OBJ_FIELD,PFL_PARAMETRI_ANCHEUOSOTTO, new IDVariant(v_CAPTION1).stringValue());
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARATIPOSTRU, 0).equals((new IDVariant("G")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriPrevisioniPEG", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // cmdElabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int cmdElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // cmdElabora Body
      // Procedure Body
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.CF4WEBWORKPREVPEG(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARATIPOSTRU, 0), IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOUTI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI110, IMDBDef17.PQSL_PARAMETRI110_PARAANCUOSOT, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI110, IMDBDef17.PQSL_PARAMETRI110_PARAMPARTE, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI110, IMDBDef17.PQSL_PARAMETRI110_PARAMBILANCI, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.UnloadForm(MyGlb.FRM_VISUAPREVPEG,(new IDVariant(-1)).booleanValue()); 
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARATIPOSTRU, 0, IMDB.Value(IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARATIPOSTRU, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAPROUOSTR, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMORDINAM, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI110, IMDBDef17.PQSL_PARAMETRI110_PARAMORDINAM, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARPREANINCO, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI110, IMDBDef17.PQSL_PARAMETRI110_PARPREANINCO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PARAMETRI86, IMDBDef6.FLD_PARAMETRI86_PARAMVARIAZI, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI110, IMDBDef17.PQSL_PARAMETRI110_PARAMVARIAZI, 0));
        MainFrm.Show(MyGlb.FRM_VISUAPREVPEG, (new IDVariant(0)).intValue(), this); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriPrevisioniPEG", "cmdElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void PARAMPREVPEG_PARAMETRI110() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI110_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI688, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI688, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI110_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI110_RS, 0, IMDBDef6.TBL_PARAMETRI688, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI110_RS, 0, 0, IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARAANCUOSOT, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI110_RS, 1, 0, IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARAMPARTE, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI110_RS, 2, 0, IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARAMBILANCI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI110_RS, 3, 0, IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARAMVARIAZI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI110_RS, 4, 0, IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARPREANINCO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI110_RS, 5, 0, IMDBDef6.TBL_PARAMETRI688, IMDBDef6.FLD_PARAMETRI688_PARAMORDINAM, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI688, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI688, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI688, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI110_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_CMDELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      cmdElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, "9D631DF6-560E-4503-A79E-BCEF16E40CDE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, "Anche U.O. Sottostanti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "C79B2102-93A2-4DBC-BDAB-C3B5C5DA78D5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "Parte");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, "6C1F7E8A-732F-42D5-855C-C8BF12A26ABE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, "Bilancio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "6A42B953-5C0E-42F3-9386-9F24B0FAAC99");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "Variazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, "C3F95B23-C0F4-4098-9CBA-8707F2CF0FCF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, "Previsioni Anno In Corso");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "DBAAE3DD-040D-4528-B408-CD2CA8EF41A8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "Ordinamento");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, "D493C554-CCAC-4405-A6D6-CC4F7609B19B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, "6839D813-33F1-459B-A964-15DCFCACBEB4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, "Variazioni");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, "B4A4EDB7-4C96-403C-B367-EB47FBCF536E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, "Previsioni anno in corso");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, "An. U O Stt.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, 24, 4, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, 136);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, "Anche U.O. Sottostanti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANCHEUOSOTTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANCHEUOSOTTO, PPQRY_PARAMETRI110, "A.PARAANCUOSOT", "PARAANCUOSOT", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHEUOSOTTO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHEUOSOTTO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 40, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 112, 28, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PARTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PARTE, PPQRY_PARAMETRI110, "A.PARAMPARTE", "PARAMPARTE", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PARTE, (new IDVariant("T")), "Entrambe", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_LIST, 224, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_LIST, "Bilancio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_FORM, 104, 52, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BILANCIO, MyGlb.PANEL_FORM, "Bilancio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BILANCIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BILANCIO, PPQRY_PARAMETRI110, "A.PARAMBILANCI", "PARAMBILANCI", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_BILANCIO, (new IDVariant("S")), "Simulato", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_BILANCIO, (new IDVariant("E")), "Effettivo", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 296, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 164, 76, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZIONI, MyGlb.PANEL_FORM, "Variaz.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZIONI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZIONI, PPQRY_PARAMETRI110, "A.PARAMVARIAZI", "PARAMVARIAZI", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_LIST, 384, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_FORM, 164, 100, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREVANNINCOR, MyGlb.PANEL_FORM, "Previs. Anno In Corso");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PREVANNINCOR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PREVANNINCOR, PPQRY_PARAMETRI110, "A.PARPREANINCO", "PARPREANINCO", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 4, 184, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 76, 124, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ORDINAMENTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ORDINAMENTO, PPQRY_PARAMETRI110, "A.PARAMORDINAM", "PARAMORDINAM", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("U")), "Unità Organizzativa", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ORDINAMENTO, (new IDVariant("P")), "Voce Bilancio P.e.g.", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_LIST, 368, 236, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_FORM, 316, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CMDELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CMDELABORA, -1, "", "CMDELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, MyGlb.PANEL_LIST, 12, 80, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, MyGlb.PANEL_FORM, 92, 76, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZOLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZOLABEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZOLABEL, -1, "", "VARIAZOLABEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, MyGlb.PANEL_LIST, 20, 88, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, MyGlb.PANEL_FORM, 16, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PREANNINCOLA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PREANNINCOLA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PREANNINCOLA, -1, "", "PREANNINCOLA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI110", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI110, IMDBDef17.PQRY_PARAMETRI110_RS, IMDBDef6.TBL_PARAMETRI688);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANCHEUOSOTTO, IMDBDef6.FLD_PARAMETRI688_PARAANCUOSOT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PARTE, IMDBDef6.FLD_PARAMETRI688_PARAMPARTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BILANCIO, IMDBDef6.FLD_PARAMETRI688_PARAMBILANCI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VARIAZIONI, IMDBDef6.FLD_PARAMETRI688_PARAMVARIAZI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PREVANNINCOR, IMDBDef6.FLD_PARAMETRI688_PARPREANINCO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ORDINAMENTO, IMDBDef6.FLD_PARAMETRI688_PARAMORDINAM);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI688");
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
