// **********************************************
// Parametri Situazione Sub Impegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ParametriSituazioneSubImpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ANCHEUOSOTTO = 0;
  private static int PFL_PARAMETRI_RESICOMPENTR = 1;
  private static int PFL_PARAMETRI_SOLOPROVVISO = 2;
  private static int PFL_PARAMETRI_SOLODISPONIB = 3;
  private static int PFL_PARAMETRI_UOUTILIZZO = 4;
  private static int PFL_PARAMETRI_DATAELABORAZ = 5;
  private static int PFL_PARAMETRI_CMDELABORA = 6;

  private static int PPQRY_PARAMETRI450 = 0;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI117(IMDB);
    //
    //
    Init_PQRY_PARAMETRI450(IMDB);
    Init_PQRY_PARAMETRI450_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI117(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI117, 7);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI117, "TBL_PARAMETRI117");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARAANCUOSOT, "PARAANCUOSOT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARAANCUOSOT,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARRESCOMENT, "PARRESCOMENT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARRESCOMENT,12,1,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARASOLOPROV, "PARASOLOPROV");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARASOLOPROV,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARASOLODISP, "PARASOLODISP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARASOLODISP,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARAMUOUTILI,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARADATAELAB,6,19,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARATIPOSTRU, "PARATIPOSTRU");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI117,IMDBDef7.FLD_PARAMETRI117_PARATIPOSTRU,5,4,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI117, 0);
  }

  private static void Init_PQRY_PARAMETRI450(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI450, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI450, "PQRY_PARAMETRI450");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARAANCUOSOT, "PARAANCUOSOT");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARAANCUOSOT,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARRESCOMENT, "PARRESCOMENT");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARRESCOMENT,12,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARAMUOUTILI,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARADATAELAB,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARASOLOPROV, "PARASOLOPROV");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARASOLOPROV,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARASOLODISP, "PARASOLODISP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450,IMDBDef17.PQSL_PARAMETRI450_PARASOLODISP,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI450, 0);
  }

  private static void Init_PQRY_PARAMETRI450_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI450_RS, 6);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI450_RS, "PQRY_PARAMETRI450_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARAANCUOSOT, "PARAANCUOSOT");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARAANCUOSOT,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARRESCOMENT, "PARRESCOMENT");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARRESCOMENT,12,1,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARAMUOUTILI,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARADATAELAB,6,19,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARASOLOPROV, "PARASOLOPROV");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARASOLOPROV,5,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARASOLODISP, "PARASOLODISP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI450_RS,IMDBDef17.PQSL_PARAMETRI450_PARASOLODISP,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ParametriSituazioneSubImpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ParametriSituazioneSubImpegni()
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
    FormIdx = MyGlb.FRM_PARSITSUBIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "36EA9B53-A74B-4C11-87D8-245E7758AA08";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 432;
    DesignHeight = 242;
    set_Caption(new IDVariant("Parametri Situazione Sub Impegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 432;
    Frames[1].Height = 216;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 216;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 432-MyGlb.PAN_OFFS_X, 216-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "93487075-2A14-49AB-8400-378BC71D71A2");
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
      if (IMDB.TblModified(IMDBDef7.TBL_PARAMETRI117, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PARSITSUBIMP_PARAMETRI450();
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
    return (obj instanceof ParametriSituazioneSubImpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ParametriSituazioneSubImpegni.class.getName() : (Glb.ClassWithPackage(ParametriSituazioneSubImpegni.class) ? ParametriSituazioneSubImpegni.class.getName().substring(ParametriSituazioneSubImpegni.class.getPackage().getName().length() + 1) : ParametriSituazioneSubImpegni.class.getName()));
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

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Parametri Situazione Sub-Impegni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef7.TBL_PARAMETRI117, IMDBDef7.FLD_PARAMETRI117_PARATIPOSTRU, 0).equals((new IDVariant("G")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriSituazioneSubImpegni", "LoadEvent", _e);
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
      MainFrm.Cf4armDBObject.CF4WEBWORKSITSUBIMP(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("G")), IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARAANCUOSOT, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARASOLOPROV, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARASOLODISP, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARRESCOMENT, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARAMUOUTILI, 0), IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARADATAELAB, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.UnloadForm(MyGlb.FRM_VISSITSUBIMP,(new IDVariant(-1)).booleanValue()); 
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARATIPOSTRU, 0, (new IDVariant("G")));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARAPROUOSTR, 0, IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORUOGES, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARRESCOMENT, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARRESCOMENT, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARAMUOUTILI, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARAMUOUTILI, 0));
        IMDB.set_Value(IMDBDef7.TBL_PARAMETRI118, IMDBDef7.FLD_PARAMETRI118_PARADATAELAB, 0, IMDB.Value(IMDBDef17.PQRY_PARAMETRI450, IMDBDef17.PQSL_PARAMETRI450_PARADATAELAB, 0));
        MainFrm.Show(MyGlb.FRM_VISSITSUBIMP, (new IDVariant(0)).intValue(), this); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ParametriSituazioneSubImpegni", "cmdElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void PARSITSUBIMP_PARAMETRI450() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI450_RS);
    IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI117, 0);
    Loop1: while (!IMDB.Eof(IMDBDef7.TBL_PARAMETRI117, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI450_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI450_RS, 0, IMDBDef7.TBL_PARAMETRI117, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI450_RS, 0, 0, IMDBDef7.TBL_PARAMETRI117, IMDBDef7.FLD_PARAMETRI117_PARAANCUOSOT, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI450_RS, 1, 0, IMDBDef7.TBL_PARAMETRI117, IMDBDef7.FLD_PARAMETRI117_PARRESCOMENT, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI450_RS, 2, 0, IMDBDef7.TBL_PARAMETRI117, IMDBDef7.FLD_PARAMETRI117_PARAMUOUTILI, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI450_RS, 3, 0, IMDBDef7.TBL_PARAMETRI117, IMDBDef7.FLD_PARAMETRI117_PARADATAELAB, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI450_RS, 4, 0, IMDBDef7.TBL_PARAMETRI117, IMDBDef7.FLD_PARAMETRI117_PARASOLOPROV, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI450_RS, 5, 0, IMDBDef7.TBL_PARAMETRI117, IMDBDef7.FLD_PARAMETRI117_PARASOLODISP, 0);
      IMDB.TblMoveNext(IMDBDef7.TBL_PARAMETRI117, 0);
      if (IMDB.Eof(IMDBDef7.TBL_PARAMETRI117, 0))
      {
        IMDB.TblMoveFirst(IMDBDef7.TBL_PARAMETRI117, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI450_RS, 0);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, "54A97FD4-5463-42A9-8D23-2C24F3DC71A0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, "Anche U.O. Sottostanti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, "6D35D01A-76D3-43F4-BBA8-21F22B50545A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, "Residui Competenza Entrambi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, "F9202CE1-1C11-4312-96E2-F2EA801BEB38");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, "Solo Provvisori");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, "5BF7A3CB-37B0-47BE-B491-647CE07AE4B4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, "Solo Disponibili");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, "7227E7CB-3FB8-4E68-8119-6107DA6665F0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, "U.O. Utilizzo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "11B8DE25-DA2D-472D-8E25-6A3963772986");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, "DEAF1F5D-1E3B-4B74-97E0-32357F72B840");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_LIST, "An. U O Stt.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, 28, 8, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, 140);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANCHEUOSOTTO, MyGlb.PANEL_FORM, "Anche U.O. Sottostanti");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANCHEUOSOTTO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANCHEUOSOTTO, PPQRY_PARAMETRI450, "A.PARAANCUOSOT", "PARAANCUOSOT", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHEUOSOTTO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ANCHEUOSOTTO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_LIST, 40, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_LIST, "Residui Competenza Entrambi");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_FORM, 172, 32, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_RESICOMPENTR, MyGlb.PANEL_FORM, "Rs. Cmp. Ent.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_RESICOMPENTR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_RESICOMPENTR, PPQRY_PARAMETRI450, "A.PARRESCOMENT", "PARRESCOMENT", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESICOMPENTR, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESICOMPENTR, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_RESICOMPENTR, (new IDVariant("T")), "Entrambi", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_LIST, "Solo Provvisori");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_FORM, 68, 56, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOPROVVISO, MyGlb.PANEL_FORM, "Solo Provvisori");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOPROVVISO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOPROVVISO, PPQRY_PARAMETRI450, "A.PARASOLOPROV", "PARASOLOPROV", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOPROVVISO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOPROVVISO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_LIST, "Solo Disponibili");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_FORM, 68, 80, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLODISPONIB, MyGlb.PANEL_FORM, "Solo Disponibili");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLODISPONIB, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLODISPONIB, PPQRY_PARAMETRI450, "A.PARASOLODISP", "PARASOLODISP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLODISPONIB, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLODISPONIB, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_LIST, 384, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_LIST, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_LIST, "U O Util.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_FORM, 80, 104, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILIZZO, MyGlb.PANEL_FORM, "U.O. Utilizzo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UOUTILIZZO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UOUTILIZZO, PPQRY_PARAMETRI450, "A.PARAMUOUTILI", "PARAMUOUTILI", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UOUTILIZZO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UOUTILIZZO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 4, 184, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 160);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 52, 128, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI450, "A.PARADATAELAB", "PARADATAELAB", 6, 19, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_LIST, 368, 236, 68, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_FORM, 316, 156, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CMDELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CMDELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CMDELABORA, -1, "", "CMDELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI450", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI450, IMDBDef17.PQRY_PARAMETRI450_RS, IMDBDef7.TBL_PARAMETRI117);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANCHEUOSOTTO, IMDBDef7.FLD_PARAMETRI117_PARAANCUOSOT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_RESICOMPENTR, IMDBDef7.FLD_PARAMETRI117_PARRESCOMENT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOPROVVISO, IMDBDef7.FLD_PARAMETRI117_PARASOLOPROV);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLODISPONIB, IMDBDef7.FLD_PARAMETRI117_PARASOLODISP);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UOUTILIZZO, IMDBDef7.FLD_PARAMETRI117_PARAMUOUTILI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef7.FLD_PARAMETRI117_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI117");
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
