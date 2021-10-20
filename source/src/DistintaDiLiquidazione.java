// **********************************************
// Distinta Di Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DistintaDiLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_GRUPPOSCADEN = 0;

  private static int PFL_PARAM_GRUPPO = 0;
  private static int PFL_PARAM_NUOVADISTINT = 1;
  private static int PFL_PARAM_SCADENZADAL = 2;
  private static int PFL_PARAM_AL = 3;
  private static int PFL_PARAM_DATADISTINTA = 4;
  private static int PFL_PARAM_DANUMERARE = 5;
  private static int PFL_PARAM_DISTIGIAEMES = 6;
  private static int PFL_PARAM_DISTINTAN = 7;
  private static int PFL_PARAM_DEL = 8;
  private static int PFL_PARAM_OK = 9;
  private static int PFL_PARAM_ETICHETITOLO = 10;
  private static int PFL_PARAM_ETICNUOVDIST = 11;
  private static int PFL_PARAM_ETICNUOVDIS1 = 12;

  private static int PPQRY_PARAM94 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM95(IMDB);
    //
    //
    Init_PQRY_PARAM94(IMDB);
    Init_PQRY_PARAM94_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM95(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM95, 10);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM95, "TBL_PARAM95");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGNUODIS, "NOMOGGNUODIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGNUODIS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGDIGIEM, "NOMOGGDIGIEM");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGDIGIEM,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGSCADAL, "NOMOGGSCADAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGSCADAL,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGSCAAL, "NOMEOGGSCAAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGSCAAL,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGDATDIS, "NOMOGGDATDIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMOGGDATDIS,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGDANUM, "NOMEOGGDANUM");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGDANUM,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGEDISN, "NOMEOGGEDISN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGEDISN,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGETDEL, "NOMEOGGETDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGETDEL,6,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, "NOMEOGGEUTEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN,5,52,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM95,IMDBDef2.FLD_PARAM95_NOMEOGGEDESC,5,255,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM95, 0);
  }

  private static void Init_PQRY_PARAM94(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM94, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM94, "PQRY_PARAM94");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS, "NOMOGGNUODIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM, "NOMOGGDIGIEM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, "NOMOGGSCADAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, "NOMEOGGSCAAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, "NOMOGGDATDIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGDANUM, "NOMEOGGDANUM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGDANUM,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, "NOMEOGGEDISN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, "NOMEOGGETDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94,IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL,6,16,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM94, 0);
  }

  private static void Init_PQRY_PARAM94_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM94_RS, 8);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM94_RS, "PQRY_PARAM94_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS, "NOMOGGNUODIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM, "NOMOGGDIGIEM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, "NOMOGGSCADAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, "NOMEOGGSCAAL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, "NOMOGGDATDIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS,6,16,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGDANUM, "NOMEOGGDANUM");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGDANUM,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, "NOMEOGGEDISN");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, "NOMEOGGETDEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM94_RS,IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL,6,16,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DistintaDiLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public DistintaDiLiquidazione()
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
    FormIdx = MyGlb.FRM_DISTIDILIQU1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9E00F9FB-DD22-41E9-98B3-E4CA4D331321";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 464;
    DesignHeight = 330;
    set_Caption(new IDVariant("Distinta Di Liquidazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 464;
    Frames[1].Height = 304;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 304;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 464-MyGlb.PAN_OFFS_X, 304-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3B195472-7624-4404-A9D3-7EA6CED84EC0");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 584, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM95, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DISTIDILIQU1_PARAM94();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof DistintaDiLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DistintaDiLiquidazione.class.getName() : (Glb.ClassWithPackage(DistintaDiLiquidazione.class) ? DistintaDiLiquidazione.class.getName().substring(DistintaDiLiquidazione.class.getPackage().getName().length() + 1) : DistintaDiLiquidazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS, 0).equals((new IDVariant("N")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DANUMERARE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DANUMERARE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM, 0).equals((new IDVariant("D")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DISTINTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DISTINTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiLiquidazione", "ParamOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_SCADENZADAL)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGSCADAL, 0, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAM_AL)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGSCAAL, 0, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAM_DATADISTINTA)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGDATDIS, 0, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAM_DANUMERARE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGDANUM, 0, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGDANUM, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAM_DISTINTAN)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEDISN, 0, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, 0));
      }
      if (Column.equals((new IDVariant(PFL_PARAM_DEL)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGETDEL, 0, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, 0));
      }
      if ((Column.equals((new IDVariant(PFL_PARAM_NUOVADISTINT)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGNUODIS, 0, (new IDVariant("N")));
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGDIGIEM, 0, (new IDVariant("N")));
      }
      if ((Column.equals((new IDVariant(PFL_PARAM_DISTIGIAEMES)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGNUODIS, 0, (new IDVariant("D")));
        IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGDIGIEM, 0, (new IDVariant("D")));
      }
      PAN_PARAM.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiLiquidazione", "ParamOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Cmd Ok
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CmdOk ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cmd Ok Body
      // Corpo Procedura
      // 
      IDVariant C = new IDVariant(0,IDVariant.STRING);
      IDVariant v_STANDARD = new IDVariant(0,IDVariant.STRING);
      v_STANDARD = (new IDVariant("Distinta_Utenza"));
      IDVariant v_PERSGALL = new IDVariant(0,IDVariant.STRING);
      v_PERSGALL = (new IDVariant("Distinta_Utenza_GAL"));
      C = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), v_STANDARD);
      IDVariant v_LANCIASTAMPA = null;
      v_LANCIASTAMPA = (new IDVariant("SI"));
      IDVariant v_PERSGALLARAT = new IDVariant(0,IDVariant.INTEGER);
      if (C.equals(v_PERSGALL, true))
      {
        v_PERSGALLARAT = (new IDVariant(-1));
      }
      else
      {
        v_PERSGALLARAT = (new IDVariant(0));
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS, 0).equals((new IDVariant("N")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0)))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Indicare entrambe le date di scadenza e la data della nuova distinta"));
          MainFrm.set_AlertMessage(v_SMS); 
          return 0;
        }
        if (IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("La data distinta deve appartenere all'esercizio corrente"));
          MainFrm.set_AlertMessage(v_SMS); 
          return 0;
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0), true)>0)
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Le date di scadenza sono incongruenti"));
          MainFrm.set_AlertMessage(v_SMS); 
          return 0;
        }
        MainFrm.Cf4armDBObject.BeginTrans();
        if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGDANUM, 0).equals((new IDVariant("SI")), true))
        {
          IDVariant v_NDIST = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  NVL(A.ULT_DISTINTA_UTENZE, 0) as NUVAN0ULDIU0 ");
          SQL.append("from ");
          SQL.append("  N04 A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NDIST = QV.Get("NUVAN0ULDIU0", IDVariant.INTEGER) ;
          }
          QV.Close();
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  N04 A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTA.equals((new IDVariant(0)), true))
          {
            try
            {
              SQL = new StringBuffer();
              SQL.append("insert into N04 ");
              SQL.append("( ");
              SQL.append("  ESERCIZIO, ");
              SQL.append("  ULT_DISTINTA_UTENZE, ");
              SQL.append("  MANDATI_STAMPATI, ");
              SQL.append("  ORDINATIVI_STAMPATI, ");
              SQL.append("  ELENCO_ORDINATIVI, ");
              SQL.append("  ELENCO_MANDATI ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(v_NDIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0, ");
              SQL.append("  0 ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            catch (Exception e14)
            {
              MainFrm.set_AlertMessage(new IDVariant(e14.getMessage())); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
          SQL = new StringBuffer();
          SQL.append("update N04 set ");
          SQL.append("  ULT_DISTINTA_UTENZE = " + IDL.CSql(v_NDIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " + 1 ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          v_NDIST = IDL.Add(v_NDIST, (new IDVariant(1)));
          // 
          // aggiorna fat
          // 
          {
            SQL = new StringBuffer();
            SQL.append("update FAT set ");
            SQL.append("  NUMERO_DISTINTA_UT = " + IDL.CSql(v_NDIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  DATA_DISTINTA_UT = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  ANNO_DISTINTA_UT = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy')) ");
            SQL.append("where (TIPO_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CODICE_DOC = 1) ");
            SQL.append("and   (IMPORTO + NVL(VARIAZIONI, 0) - NVL(IMPUTATO, 0) > 0) ");
            SQL.append("and   ((D_SCADENZA BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
            SQL.append("and   ((NUMERO_DISTINTA_UT IS NULL)) ");
            SQL.append("and   ((DATA_DISTINTA_UT IS NULL)) ");
            SQL.append("and   (EXISTS(");
            SQL.append("( ");
            SQL.append("select ");
            SQL.append("  'X' ");
            SQL.append("from ");
            SQL.append("  IMPUTAZIONI_UTENZE A ");
            SQL.append("where (A.TIPO_UTENZA = FAT.TIPO_UTENZA) ");
            SQL.append("and   (A.CODICE_UTENZA = FAT.CODICE_UTENZA) ");
            SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("))) ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  FAT A ");
          SQL.append("where (A.DATA_DISTINTA_UT = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DISTINTA_UT = TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy'))) ");
          SQL.append("and   (A.NUMERO_DISTINTA_UT = " + IDL.CSql(v_NDIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
          {
            if (IDL.NullValue(MainFrm.VISUCHECDIST,(new IDVariant("N"))).equals((new IDVariant("S")), true))
            {
              SQL = new StringBuffer();
              SQL.append("insert into DISTINTE_LIQUIDAZIONE_UT ");
              SQL.append("( ");
              SQL.append("  DATA, ");
              SQL.append("  UTENZA, ");
              SQL.append("  UTENTE_INSERIMENTO, ");
              SQL.append("  DATA_INSERIMENTO, ");
              SQL.append("  NUMERO, ");
              SQL.append("  ANNO ");
              SQL.append(") ");
              SQL.append("values ");
              SQL.append("( ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TRUNC( SYSDATE ), ");
              SQL.append("  " + IDL.CSql(v_NDIST, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  TO_NUMBER(TO_CHAR(" + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", 'yyyy')) ");
              SQL.append(") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
          }
          else
          {
            if (IDL.NullValue(MainFrm.VISUCHECDIST,(new IDVariant("N"))).equals((new IDVariant("S")), true))
            {
              MainFrm.set_AlertMessage((new IDVariant("La distinta non può essere creata perché non ci sono fatture corrispondenti ai filtri impostati. Modificare i filtri sulla scadenza o verificare che le fatture siano in archivio"))); 
              v_LANCIASTAMPA = (new IDVariant("NO"));
            }
          }
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          if (!(v_PERSGALLARAT.booleanValue()))
          {
            MainFrm.Cf4armDBObject.WORKDISTINTAUT(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0)), v_NDIST, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0));
          }
          else
          {
            MainFrm.Cf4armDBObject.WORKDISTINTAUTGAL(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0)), v_NDIST, IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0));
          }
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        else
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          if (!(v_PERSGALLARAT.booleanValue()))
          {
            MainFrm.Cf4armDBObject.WORKDISTINTAUT(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0)), (new IDVariant()), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0));
          }
          else
          {
            MainFrm.Cf4armDBObject.WORKDISTINTAUTGAL(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0)), (new IDVariant()), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDATDIS, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0));
          }
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        MainFrm.Cf4armDBObject.CommitTrans();
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM, 0).equals((new IDVariant("D")), true))
      {
        MainFrm.Cf4armDBObject.BeginTrans();
        if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, 0)))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Indicare il numero della distinta"));
          MainFrm.set_AlertMessage(v_SMS); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        if (!(v_PERSGALLARAT.booleanValue()))
        {
          MainFrm.Cf4armDBObject.WORKDISTINTAUT(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, 0)), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, 0), (new IDVariant()), (new IDVariant()));
        }
        else
        {
          MainFrm.Cf4armDBObject.WORKDISTINTAUTGAL(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.Year(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, 0)), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, 0), IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, 0), (new IDVariant()), (new IDVariant()));
        }
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        MainFrm.Cf4armDBObject.CommitTrans();
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Distinta_Utenza"));
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Distinta_Utenza_GAL"));
      IDVariant v_STAMPAJASPER = new IDVariant(0,IDVariant.STRING);
      if (!(v_PERSGALLARAT.booleanValue()))
      {
        v_STAMPAJASPER = new IDVariant(S);
      }
      else
      {
        v_STAMPAJASPER = new IDVariant(v_S1);
      }
      if (v_LANCIASTAMPA.equals((new IDVariant("SI")), true))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DAL")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGSCADAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_AL")), IDL.ToString(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGSCAAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGR_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.LanciaStampaJasper(v_STAMPAJASPER, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiLiquidazione", "CmdOk", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param Nuova Distinta Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAM_NUOVADISTINT_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Nuova Distinta Validate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS, 0).equals((new IDVariant("N")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DANUMERARE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        IMDB.set_Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM, 0, (new IDVariant("N")));
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_AL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DANUMERARE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiLiquidazione", "ParamNuovaDistintaValidate", _e);
    }
  }

  // **********************************************************************
  // Param Distinta già Emessa Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAM_DISTIGIAEMES_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Distinta già Emessa Validate Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGDIGIEM, 0).equals((new IDVariant("D")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DISTINTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        IMDB.set_Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMOGGNUODIS, 0, (new IDVariant("D")));
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DISTINTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiLiquidazione", "ParamDistintagiàEmessaValidate", _e);
    }
  }

  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Distinta di Liquidazione"));
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGNUODIS, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGDIGIEM, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGSCADAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGSCAAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGDATDIS, 0, IDL.Today());
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGDANUM, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEDISN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGETDEL, 0, (new IDVariant()));
      set_Caption(new IDVariant(v_CAPTION));
      PAN_PARAM.set_FieldText(PFL_PARAM_ETICHETITOLO, IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEDESC, 0).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiLiquidazione", "Load", _e);
    }
  }

  // **********************************************************************
  // Param Distinta n Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAM_DISTINTAN_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Distinta n Validate Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, 0))))
      {
        IDVariant v_DATADISTINTA = null;
        v_DATADISTINTA = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.DATA_DISTINTA_UT) as MINFATDADIUT ");
        SQL.append("from ");
        SQL.append("  FAT A ");
        SQL.append("where (A.ANNO_DISTINTA_UT = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_DISTINTA_UT = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TIPO_UTENZA = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEUTEN, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DATADISTINTA = QV.Get("MINFATDADIUT", IDVariant.DATETIME) ;
        }
        QV.Close();
        if (IDL.IsNull(v_DATADISTINTA))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Distinta non presente"));
          MainFrm.set_AlertMessage(v_SMS); 
          IMDB.set_Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGEDISN, 0, (new IDVariant()));
          return;
        }
        IMDB.set_Value(IMDBDef10.PQRY_PARAM94, IMDBDef10.PQSL_PARAM94_NOMEOGGETDEL, 0, new IDVariant(v_DATADISTINTA));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiLiquidazione", "ParamDistintanValidate", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DISTIDILIQU1_PARAM94() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM94_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM95, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM95, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM94_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM94_RS, 0, IMDBDef2.TBL_PARAM95, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 0, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGNUODIS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 1, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGDIGIEM, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 2, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGSCADAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 3, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGSCAAL, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 4, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMOGGDATDIS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 5, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGDANUM, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 6, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGEDISN, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM94_RS, 7, 0, IMDBDef2.TBL_PARAM95, IMDBDef2.FLD_PARAM95_NOMEOGGETDEL, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM95, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM95, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM95, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM94_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_OK)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CmdOk();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_NUOVADISTINT)
      {
        PFL_PARAM_NUOVADISTINT_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_DISTIGIAEMES)
      {
        PFL_PARAM_DISTIGIAEMES_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_DISTINTAN)
      {
        PFL_PARAM_DISTINTAN_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, "6B73D725-E866-4C3B-A894-546AEB2DF2FD");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, "Gruppo Scadenza");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, MyGlb.PANEL_LIST, 80, -9999, 360, 0, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, MyGlb.PANEL_FORM, 88, 72, 288, 52, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, 0, 98);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, 0, 1);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, 1, 1);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_GRUPPOSCADEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, "09DD33CA-6246-4ED9-9AC7-75C7421B2343");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, MyGlb.VIS_GROSTYPERLAB);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, "220F51C5-D749-4D3E-8474-17A1762919A9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, "Nuova Distinta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, "F525F9BF-D071-4BDF-B968-E804A15D299B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, "Scadenza dal");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "AD578E5C-9740-4444-A79A-B89915C54786");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "Al");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_AL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, "3028D602-A722-4C85-9C2A-CDAB2AC25639");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, "Data Distinta");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, "6247FF8C-7203-4AFC-86B7-9F80CBF59134");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, "Da numerare");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, "1F4AF124-4A94-491B-AF5B-63796AB9E42C");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, "Distinta già Emessa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, "5D460E51-1059-4EED-BDD4-F357913ADF06");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, "Distinta n");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, "D1744C16-7209-4C93-AFDA-475C6A62B03F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, "Del");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "0129F1CB-9C01-44D5-B211-6E13C7BF2AA8");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_OK, "OK");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, "47046D4B-1721-4F05-B63F-A7C96162AFA5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, "Titolo");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, MyGlb.VIS_ETICGRASLEFT);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, "FCD4FDC3-84E9-4FA4-B800-02BAD59B9CFD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, "Nuova Distinta");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, "E4FF3AE3-5C3E-4745-BB23-590EB6890DE1");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, "Distinta già emessa");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, MyGlb.PANEL_LIST, 8, 12, 408, 152, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, MyGlb.PANEL_LIST, 11);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, MyGlb.PANEL_FORM, 8, 40, 392, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_GRUPPO, MyGlb.PANEL_FORM, 11);
    PAN_PARAM.SetFieldPage(PFL_PARAM_GRUPPO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_GRUPPO, -1, "", "GRUPPO", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_LIST, "Nuov. Dist.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_FORM, 12, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_FORM, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_NUOVADISTINT, MyGlb.PANEL_FORM, "Nuova Distinta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_NUOVADISTINT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_NUOVADISTINT, PPQRY_PARAM94, "A.NOMOGGNUODIS", "NOMOGGNUODIS", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUOVADISTINT, (new IDVariant("N")), "Nuova Distinta", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_NUOVADISTINT, (new IDVariant("D")), "Distinta già Emessa", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_LIST, 80, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_LIST, 56);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_LIST, "Scadenza dal");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_FORM, 92, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SCADENZADAL, MyGlb.PANEL_FORM, "Scadenza dal");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCADENZADAL, -1, GRP_PARAM_GRUPPOSCADEN);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCADENZADAL, PPQRY_PARAM94, "A.NOMOGGSCADAL", "NOMOGGSCADAL", 6, 16, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 184, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 52);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 264, 76, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 24);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAM.SetFieldPage(PFL_PARAM_AL, -1, GRP_PARAM_GRUPPOSCADEN);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_AL, PPQRY_PARAM94, "A.NOMEOGGSCAAL", "NOMEOGGSCAAL", 6, 16, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_LIST, 288, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_LIST, "Data Distinta");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_FORM, 92, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATADISTINTA, MyGlb.PANEL_FORM, "Data Distinta");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATADISTINTA, -1, GRP_PARAM_GRUPPOSCADEN);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATADISTINTA, PPQRY_PARAM94, "A.NOMOGGDATDIS", "NOMOGGDATDIS", 6, 16, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_LIST, 400, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_LIST, "Da num.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_FORM, 264, 100, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DANUMERARE, MyGlb.PANEL_FORM, "Da numerare");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DANUMERARE, -1, GRP_PARAM_GRUPPOSCADEN);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DANUMERARE, PPQRY_PARAM94, "A.NOMEOGGDANUM", "NOMEOGGDANUM", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DANUMERARE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DANUMERARE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_LIST, "Dst. g. Em.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_FORM, 12, 132, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_FORM, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DISTIGIAEMES, MyGlb.PANEL_FORM, "Distinta già Emessa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DISTIGIAEMES, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DISTIGIAEMES, PPQRY_PARAM94, "A.NOMOGGDIGIEM", "NOMOGGDIGIEM", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DISTIGIAEMES, (new IDVariant("D")), "Distinta già Emessa", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DISTIGIAEMES, (new IDVariant("N")), "Nuova Distinta", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_LIST, 440, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_LIST, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_LIST, "Dist. n");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_FORM, 112, 164, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_FORM, 64);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DISTINTAN, MyGlb.PANEL_FORM, "Distinta n");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DISTINTAN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DISTINTAN, PPQRY_PARAM94, "A.NOMEOGGEDISN", "NOMEOGGEDISN", 1, 5, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_LIST, 480, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_LIST, 28);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_LIST, "Del");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_FORM, 236, 164, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_FORM, 136);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DEL, MyGlb.PANEL_FORM, "Del");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DEL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DEL, PPQRY_PARAM94, "A.NOMEOGGETDEL", "NOMEOGGETDEL", 6, 16, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 164, 176, 112, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 324, 224, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_OK, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_OK, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, MyGlb.PANEL_LIST, 16, 12, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, MyGlb.PANEL_FORM, 8, 12, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICHETITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICHETITOLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICHETITOLO, -1, "", "ETICHETITOLO", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, MyGlb.PANEL_LIST, 80, 232, 120, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, MyGlb.PANEL_FORM, 36, 44, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIST, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICNUOVDIST, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICNUOVDIST, -1, "", "ETICNUOVDIST", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, MyGlb.PANEL_LIST, 88, 240, 120, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, MyGlb.PANEL_LIST, 2);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, MyGlb.PANEL_FORM, 36, 132, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICNUOVDIS1, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICNUOVDIS1, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICNUOVDIS1, -1, "", "ETICNUOVDIS1", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM94", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM94, IMDBDef10.PQRY_PARAM94_RS, IMDBDef2.TBL_PARAM95);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_NUOVADISTINT, IMDBDef2.FLD_PARAM95_NOMOGGNUODIS);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SCADENZADAL, IMDBDef2.FLD_PARAM95_NOMOGGSCADAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_AL, IMDBDef2.FLD_PARAM95_NOMEOGGSCAAL);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATADISTINTA, IMDBDef2.FLD_PARAM95_NOMOGGDATDIS);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DANUMERARE, IMDBDef2.FLD_PARAM95_NOMEOGGDANUM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DISTIGIAEMES, IMDBDef2.FLD_PARAM95_NOMOGGDIGIEM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DISTINTAN, IMDBDef2.FLD_PARAM95_NOMEOGGEDISN);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DEL, IMDBDef2.FLD_PARAM95_NOMEOGGETDEL);
    PAN_PARAM.SetMasterTable(0, "PARAM95");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
