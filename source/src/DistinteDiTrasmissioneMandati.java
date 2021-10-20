// **********************************************
// Distinte Di Trasmissione Mandati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DistinteDiTrasmissioneMandati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_MANDATI = 0;

  private static int PFL_PARAMETRI_DISTIGIAEMES = 0;
  private static int PFL_PARAMETRI_DISTINTAN = 1;
  private static int PFL_PARAMETRI_MANDATAEXPRE = 2;
  private static int PFL_PARAMETRI_NUOVADISTINT = 3;
  private static int PFL_PARAMETRI_LABEVUOTMAND = 4;
  private static int PFL_PARAMETRI_DAL = 5;
  private static int PFL_PARAMETRI_AL = 6;
  private static int PFL_PARAMETRI_DATADISTINTA = 7;
  private static int PFL_PARAMETRI_DANUMERARE = 8;
  private static int PFL_PARAMETRI_UFFICIO = 9;
  private static int PFL_PARAMETRI_ELABORA = 10;
  private static int PFL_PARAMETRI_ETIDISGIAEME = 11;
  private static int PFL_PARAMETRI_NUOVADISTIN1 = 12;

  private static int PPQRY_PARAMETRI220 = 0;

  private static int PPQRY_MAN = 1;

  private static int PPQRY_T53 = 2;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables
  private IDVariant INIT = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI141(IMDB);
    //
    //
    Init_PQRY_PARAMETRI220(IMDB);
    Init_PQRY_PARAMETRI220_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI141(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI141, 9);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI141, "TBL_PARAMETRI141");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARADISGAEME, "PARADISGAEME");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARADISGAEME,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST, "PARANUOVDIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARADISTNUME, "PARADISTNUME");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARADISTNUME,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARDATDISNUM, "PARDATDISNUM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARDATDISNUM,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARADATADIST, "PARADATADIST");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARADATADIST,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARAMDANUMER, "PARAMDANUMER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARAMDANUMER,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI141,IMDBDef5.FLD_PARAMETRI141_PARAMUFFICIO,1,49,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI141, 0);
  }

  private static void Init_PQRY_PARAMETRI220(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI220, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI220, "PQRY_PARAMETRI220");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARADISGAEME, "PARADISGAEME");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARADISGAEME,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARADATADIST, "PARADATADIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARADATADIST,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARAMDANUMER, "PARAMDANUMER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARAMDANUMER,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARANUOVDIST, "PARANUOVDIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARANUOVDIST,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARADISTNUME, "PARADISTNUME");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARADISTNUME,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARDATDISNUM, "PARDATDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220,IMDBDef15.PQSL_PARAMETRI220_PARDATDISNUM,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI220, 0);
  }

  private static void Init_PQRY_PARAMETRI220_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI220_RS, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI220_RS, "PQRY_PARAMETRI220_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, "PARNUMMANDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, "PARANUMMANAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARADISGAEME, "PARADISGAEME");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARADISGAEME,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARADATADIST, "PARADATADIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARADATADIST,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARAMDANUMER, "PARAMDANUMER");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARAMDANUMER,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARANUOVDIST, "PARANUOVDIST");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARANUOVDIST,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARADISTNUME, "PARADISTNUME");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARADISTNUME,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARDATDISNUM, "PARDATDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI220_RS,IMDBDef15.PQSL_PARAMETRI220_PARDATDISNUM,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DistinteDiTrasmissioneMandati(MyWebEntryPoint w, IMDBObj imdb)
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
  public DistinteDiTrasmissioneMandati()
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
    FormIdx = MyGlb.FRM_DISTDITRAMAN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "29462F2C-B3FE-4D42-A7A2-34F0F6C6A592";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 348;
    DesignHeight = 286;
    set_Caption(new IDVariant("Distinte Di Trasmissione Mandati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 348;
    Frames[1].Height = 260;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 260;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 348-MyGlb.PAN_OFFS_X, 260-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "15B1C306-8032-4EEF-ACDF-3B53E5CDE8EF");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1724, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI141, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DISTDITRAMAN_PARAMETRI220();
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
    return (obj instanceof DistinteDiTrasmissioneMandati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DistinteDiTrasmissioneMandati.class.getName() : (Glb.ClassWithPackage(DistinteDiTrasmissioneMandati.class) ? DistinteDiTrasmissioneMandati.class.getName().substring(DistinteDiTrasmissioneMandati.class.getPackage().getName().length() + 1) : DistinteDiTrasmissioneMandati.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADISGAEME, 0).equals((new IDVariant("E")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiTrasmissioneMandati", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DISTINTAN)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISTNUME, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADISTNUME, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DAL)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_AL)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DATADISTINTA)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADATADIST, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADATADIST, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DANUMERARE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMDANUMER, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMDANUMER, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_UFFICIO)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMUFFICIO, 0, IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_DISTIGIAEMES)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISGAEME, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST, 0, (new IDVariant()));
      }
      if ((Column.equals((new IDVariant(PFL_PARAMETRI_NUOVADISTINT)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISGAEME, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST, 0, (new IDVariant("N")));
      }
      PAN_PARAMETRI.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiTrasmissioneMandati", "ParametriOnUpdatingRow", _e);
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
    IDVariant v_ULTIMOMANDAT1 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ULTIMOMANDAT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODICE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CODICE = (new IDVariant("man", IDVariant.STRING));
      v_NOMECAPTION = (new IDVariant("Distinta di Trasmissione Mandati ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      LOADEVENT_PARADELEROWS();
      INIT = (new IDVariant(-1));
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISGAEME, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMDANUMER, 0, (new IDVariant("NO")));
      // 
      // calcolo ultimo mandato emesso e ultimo mandato stampato
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.MANDATI_STAMPATI as N04MANDASTAM ");
        SQL.append("from ");
        SQL.append("  N04 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ULTIMOMANDAT1 = QV.Get("N04MANDASTAM", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.NUMERO as N03NUMERO ");
        SQL.append("from ");
        SQL.append("  N03 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE = " + IDL.CSql(v_CODICE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ULTIMOMANDAT = QV.Get("N03NUMERO", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if ((IDL.Add(IDL.NullValue(v_ULTIMOMANDAT1,(new IDVariant(-1))), (new IDVariant(1)))).compareTo(v_ULTIMOMANDAT, true)>0)
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL, 0, IDL.Add(IDL.NullValue(v_ULTIMOMANDAT1,(new IDVariant(-1))), (new IDVariant(1))));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL, 0, new IDVariant(v_ULTIMOMANDAT));
      }
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADATADIST, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMUFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiTrasmissioneMandati", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISGAEME, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISTNUME, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARDATDISNUM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADATADIST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMDANUMER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMUFFICIO, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NUMERODISTIN = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // valido i campi
      // 
      {
        // 
        // controllo che la data corrisponde all'esercizio corrente
        // 
        {
          if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADISGAEME, 0).equals((new IDVariant("E")), true))
          {
            IDVariant v_MSG1 = new IDVariant(0,IDVariant.STRING);
            v_MSG1 = (new IDVariant("Distinta non esistente", IDVariant.STRING));
            if (IDL.IsNull((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_MANDATAEXPRE)))) || (new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_MANDATAEXPRE))).equals((new IDVariant("")), true))
            {
              MainFrm.set_AlertMessage(v_MSG1); 
              return 0;
            }
          }
          if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUOVDIST, 0).equals((new IDVariant("N")), true))
          {
            IDVariant v_MSG2 = new IDVariant(0,IDVariant.STRING);
            v_MSG2 = (new IDVariant("La data deve appartenere all'esercizio corrente!", IDVariant.STRING));
            // 
            // controllo che la data corrisponde all'esercizio corrente
            // 
            if (IDL.Year(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADATADIST, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
            {
              MainFrm.set_AlertMessage(v_MSG2); 
              return 0;
            }
            // 
            // controllo che l'intervallo mandati sia significativo
            // 
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Scelta dei mandati non corretta", IDVariant.STRING));
              if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0), true)>0)
              {
                MainFrm.set_AlertMessage(v_MSG); 
                return 0;
              }
            }
            IDVariant v_MANDATMAGGIO = new IDVariant(0,IDVariant.INTEGER);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  MAN A ");
            SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   ((A.NUMERO_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   (A.D_DATA_MAND > " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADATADIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_MANDATMAGGIO = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_MANDATMAGGIO.compareTo((new IDVariant(0)), true)>0)
            {
              MainFrm.set_AlertMessage((new IDVariant("Nell'intervallo indicato sono presenti mandati con data di registrazione superiore alla data della distinta"))); 
              return 0;
            }
            if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMDANUMER, 0).equals((new IDVariant("SI")), true))
            {
              IDVariant v_VCOUNTMAN = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  MAN A ");
              SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   ((A.NUMERO_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VCOUNTMAN = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_VCOUNTMAN.compareTo((new IDVariant(0)), true)>0)
              {
                IDVariant v_DAINSERIRE = new IDVariant(0,IDVariant.INTEGER);
                SQL = new StringBuffer();
                SQL.append("select ");
                SQL.append("  COUNT(*) as COUNT1 ");
                SQL.append("from ");
                SQL.append("  MAN A ");
                SQL.append("where (A.ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                SQL.append("and   ((A.NUMERO_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
                SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1), -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
                SQL.append("and   ((A.NUMERO_ELENCO IS NULL)) ");
                QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
                if (!QV.EOF()) QV.MoveNext();
                if (!QV.EOF())
                {
                  v_DAINSERIRE = QV.Get("COUNT1", IDVariant.INTEGER) ;
                }
                QV.Close();
                if (v_DAINSERIRE.equals((new IDVariant(0)), true))
                {
                  IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                  v_AVVISO = (new IDVariant("Nell'intervallo indicato non sono presenti mandati da inserire in distinta"));
                  MainFrm.set_AlertMessage(v_AVVISO); 
                  return 0;
                }
              }
              else
              {
                IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                v_AVVISO = (new IDVariant("Mandati inesistenti"));
                MainFrm.set_AlertMessage(v_AVVISO); 
                return 0;
              }
              // 
              // provvedo alla rinumerazione delle distinte
              // 
              {
                IDVariant v_ELENCO = new IDVariant(0,IDVariant.INTEGER);
                IDVariant v_PARAMEPROVEN = new IDVariant(0,IDVariant.STRING);
                v_PARAMEPROVEN = (new IDVariant("mandati", IDVariant.STRING));
                IDVariant v_NDISTINTA = new IDVariant(0,IDVariant.INTEGER);
                MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
                MainFrm.Cf4armDBObject.N04NUMERAZIONE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_PARAMEPROVEN, IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0), v_ELENCO);
                if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
                {
                  MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                  return 0;
                }
                v_NDISTINTA = new IDVariant(v_ELENCO);
                // 
                // inserisco i valori anno, numero data, distinta sui mandati
                // 
                {
                  try
                  {
                    IDVariant v_MESSAGE = new IDVariant(0,IDVariant.STRING);
                    v_MESSAGE = (new IDVariant("Elaborata Distinta n. ", IDVariant.STRING));
                    SQL = new StringBuffer();
                    SQL.append("update MAN set ");
                    SQL.append("  ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  NUMERO_ELENCO = " + IDL.CSql(v_NDISTINTA, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                    SQL.append("  D_DATA_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADATADIST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
                    SQL.append("where (ANNO_MAND = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   ((NUMERO_MAND BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
                    SQL.append("and   (NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1) = -1 OR UFFICIO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
                    SQL.append("and   ((NUMERO_ELENCO IS NULL)) ");
                    MainFrm.Cf4armDBObject.DBO().Execute(SQL);
                    MainFrm.set_AlertMessage(IDL.Add(v_MESSAGE, IDL.ToString(v_NDISTINTA))); 
                    v_NUMERODISTIN = new IDVariant(v_NDISTINTA);
                  }
                  catch (Exception e26)
                  {
                    IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
                    v_ERRORMESSAGE = (new IDVariant("Aggiornamento non eseguito", IDVariant.STRING));
                    MainFrm.set_AlertMessage(v_ERRORMESSAGE); 
                    return 0;
                  }
                }
              }
            }
          }
        }
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARNUMMANDAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("A")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUMMANAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("UFFICIO")), IDL.ToString(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARAMUFFICIO, 0))));
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARANUOVDIST, 0).equals((new IDVariant("N")), true))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("NUM_DISTINTA")), IDL.ToString(v_NUMERODISTIN));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DISTINTA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADATADIST, 0)));
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("NUM_DISTINTA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI220, IMDBDef15.PQSL_PARAMETRI220_PARADISTNUME, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DISTINTA")), (new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_MANDATAEXPRE))));
      }
      MainFrm.LanciaStampaJasper((new IDVariant("Distinta_Tras_Man")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteDiTrasmissioneMandati", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void DISTDITRAMAN_PARAMETRI220() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI220_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI141, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI141, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI220_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI220_RS, 0, IMDBDef5.TBL_PARAMETRI141, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 0, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 1, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 2, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISGAEME, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 3, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 4, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADATADIST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 5, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARAMDANUMER, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 6, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 7, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARADISTNUME, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI220_RS, 8, 0, IMDBDef5.TBL_PARAMETRI141, IMDBDef5.FLD_PARAMETRI141_PARDATDISNUM, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI141, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI141, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI141, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI220_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "58802954-4CF8-4A40-9262-E7E0FF54049B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 16, 87, 300, 97, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 46);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, "492470B5-902E-4874-965E-B32EAF0EFF67");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, "Distinta già emessa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, "4AD84155-CB39-415D-B303-8DEE95AE7838");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, "Distinta n.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, "3D056CD0-3548-44BB-A041-D1ACFE72EC2F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, "MAN Dataexpression");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, "67B89160-55BF-44B8-8BDB-97919D9A5AEC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, "Nuova Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, "D1A24D1E-8C7F-48BF-8853-DEEE2D16444B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "6D3DB56D-1A34-425C-9001-6688A092DBD7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "20AB6FF0-4B77-4B71-9B20-15E54D791716");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, "C0446B0E-D6B9-4CD5-BC6D-E91FD13EC17E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, "Data Distinta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, "2528880F-1B11-4C68-9327-69B641F11F65");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, "Da Numerare");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "EB5299C3-21FA-4373-96DC-A765397AE381");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "8D28676F-EEDD-4828-812F-B2C9A52C6D77");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, "D4815082-22CA-40F5-9E6D-7A6E810D91A0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, "Distinta già emessa");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, "D2035DF2-A0A2-42BB-B041-34F171C499F0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, "Nuova Distinta");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_LIST, "Distinta già emessa");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_FORM, 16, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTIGIAEMES, MyGlb.PANEL_FORM, "Distinta già emessa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTIGIAEMES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTIGIAEMES, PPQRY_PARAMETRI220, "A.PARADISGAEME", "PARADISGAEME", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DISTIGIAEMES, (new IDVariant("E")), "Distinta già emessa", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DISTIGIAEMES, (new IDVariant()), "Fake", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_LIST, "Distinta n.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, 24, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DISTINTAN, MyGlb.PANEL_FORM, "Distinta n.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DISTINTAN, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DISTINTAN, PPQRY_PARAMETRI220, "A.PARADISTNUME", "PARADISTNUME", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_LIST, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_LIST, "MAN Dataexpression");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_FORM, 184, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_FORM, 108);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_MANDATAEXPRE, MyGlb.PANEL_FORM, "MAN Dataexpr.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_MANDATAEXPRE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_MANDATAEXPRE, PPQRY_MAN, "MIN(A.D_DATA_ELENCO)", "MANDATAEXPRE", 6, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_LIST, "Nuova Distinta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_FORM, 16, 64, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTINT, MyGlb.PANEL_FORM, "Nuova Distinta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUOVADISTINT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUOVADISTINT, PPQRY_PARAMETRI220, "A.PARANUOVDIST", "PARANUOVDIST", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NUOVADISTINT, (new IDVariant("N")), "Nuova Distinta", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NUOVADISTINT, (new IDVariant()), "Fake", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, MyGlb.PANEL_LIST, 296, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, MyGlb.PANEL_FORM, 260, 112, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_LABEVUOTMAND, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_LABEVUOTMAND, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_LABEVUOTMAND, -1, "", "LABEVUOTMAND", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 76, 112, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI220, "A.PARNUMMANDAL", "PARNUMMANDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 188, 112, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI220, "A.PARANUMMANAL", "PARANUMMANAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_LIST, "Data Distinta");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, 20, 136, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADISTINTA, MyGlb.PANEL_FORM, "Data Distinta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATADISTINTA, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATADISTINTA, PPQRY_PARAMETRI220, "A.PARADATADIST", "PARADATADIST", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_LIST, "Da Numerare");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_FORM, 204, 136, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DANUMERARE, MyGlb.PANEL_FORM, "Da Numerare");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DANUMERARE, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DANUMERARE, PPQRY_PARAMETRI220, "A.PARAMDANUMER", "PARAMDANUMER", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DANUMERARE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DANUMERARE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 52, 160, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI220, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 216, 204, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, MyGlb.PANEL_LIST, 44, 16, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, MyGlb.PANEL_FORM, 40, 12, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETIDISGIAEME, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETIDISGIAEME, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETIDISGIAEME, -1, "", "ETIDISGIAEME", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, MyGlb.PANEL_LIST, 52, 24, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, MyGlb.PANEL_FORM, 40, 64, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUOVADISTIN1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUOVADISTIN1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUOVADISTIN1, -1, "", "NUOVADISTIN1", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  MIN(A.D_DATA_ELENCO) as MANDATAEXPRE ");
    SQL.append("from ");
    SQL.append("  MAN A ");
    SQL.append("where (A.NUMERO_ELENCO = ~~PARADISTNUME~~) ");
    SQL.append("and   (A.ANNO_ELENCO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_MAN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_MAN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_MAN, "MAN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMUFFICIO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUFFICIO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI220", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI220, IMDBDef15.PQRY_PARAMETRI220_RS, IMDBDef5.TBL_PARAMETRI141);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DISTIGIAEMES, IMDBDef5.FLD_PARAMETRI141_PARADISGAEME);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DISTINTAN, IMDBDef5.FLD_PARAMETRI141_PARADISTNUME);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUOVADISTINT, IMDBDef5.FLD_PARAMETRI141_PARANUOVDIST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI141_PARNUMMANDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI141_PARANUMMANAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATADISTINTA, IMDBDef5.FLD_PARAMETRI141_PARADATADIST);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DANUMERARE, IMDBDef5.FLD_PARAMETRI141_PARAMDANUMER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI141_PARAMUFFICIO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI141");
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
