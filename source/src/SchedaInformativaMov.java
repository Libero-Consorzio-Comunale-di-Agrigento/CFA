// **********************************************
// Scheda Informativa Mov
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchedaInformativaMov extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SCHEDAINFORM_IMPINIZIALE = 0;
  private static int PFL_SCHEDAINFORM_IMPVARIAZION = 1;
  private static int PFL_SCHEDAINFORM_IMPATTUALE = 2;
  private static int PFL_SCHEDAINFORM_IMPOATTUNETT = 3;
  private static int PFL_SCHEDAINFORM_ORDSUBIMP = 4;
  private static int PFL_SCHEDAINFORM_LIQUIDAZIONI = 5;
  private static int PFL_SCHEDAINFORM_DISPONIBILIT = 6;
  private static int PFL_SCHEDAINFORM_MANDATI = 7;
  private static int PFL_SCHEDAINFORM_DISPEFFETTIV = 8;
  private static int PFL_SCHEDAINFORM_MANDASOLOIMP = 9;

  private static int PPQRY_DUAL = 0;

  private static int PPQRY_IMPORTIPERS = 1;


  IDPanel PAN_SCHEDAINFORM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI425(IMDB);
    Init_TBL_PARAMEPOSIZ5(IMDB);
    //
    //
    Init_PQRY_DUAL(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI425(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMETRI425, 4);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMETRI425, "TBL_PARAMETRI425");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARATIPOESPL, "PARATIPOESPL");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARATIPOESPL,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARAMPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARAMTITOLO, "PARAMTITOLO");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMETRI425,IMDBDef7.FLD_PARAMETRI425_PARAMTITOLO,5,100,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMETRI425, 0);
  }

  private static void Init_TBL_PARAMEPOSIZ5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.TBL_PARAMEPOSIZ5, 2);
    IMDB.set_TblCode(IMDBDef7.TBL_PARAMEPOSIZ5, "TBL_PARAMEPOSIZ5");
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMEPOSIZ5,IMDBDef7.FLD_PARAMEPOSIZ5_POSTOP, "POSTOP");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMEPOSIZ5,IMDBDef7.FLD_PARAMEPOSIZ5_POSTOP,1,5,0);
    IMDB.set_FldCode(IMDBDef7.TBL_PARAMEPOSIZ5,IMDBDef7.FLD_PARAMEPOSIZ5_POSLEFT, "POSLEFT");
    IMDB.SetFldParams(IMDBDef7.TBL_PARAMEPOSIZ5,IMDBDef7.FLD_PARAMEPOSIZ5_POSLEFT,1,5,0);
    IMDB.TblAddNew(IMDBDef7.TBL_PARAMEPOSIZ5, 0);
  }

  private static void Init_PQRY_DUAL(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_DUAL, 8);
    IMDB.set_TblCode(IMDBDef17.PQRY_DUAL, "PQRY_DUAL");
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_IMPINIZIALE, "IMPINIZIALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_IMPINIZIALE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_IMPVARIAZION, "IMPVARIAZION");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_IMPVARIAZION,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_IMPATTUALE, "IMPATTUALE");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_IMPATTUALE,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_ORDSUBIMP, "ORDSUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_ORDSUBIMP,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_DISPONIBILIT, "DISPONIBILIT");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_DISPONIBILIT,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_DISPEFFETTIV, "DISPEFFETTIV");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_DISPEFFETTIV,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_LIQUIDAZIONI, "LIQUIDAZIONI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_LIQUIDAZIONI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_MANDATI, "MANDATI");
    IMDB.SetFldParams(IMDBDef17.PQRY_DUAL,IMDBDef17.PQSL_DUAL_MANDATI,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_DUAL, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchedaInformativaMov(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchedaInformativaMov()
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
    FormIdx = MyGlb.FRM_SCHEDINFOMOV;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D1E9ED36-AA7C-4198-84B8-664738044888";
    ResModeW = 1;
    ResModeH = 1;
    iBorderType = 2;
    iVisualFlags = -4091;
    DesignWidth = 536;
    DesignHeight = 170;
    set_Caption(new IDVariant("Scheda Informativa"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 536;
    Frames[1].Height = 144;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Scheda Informativa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 144;
    PAN_SCHEDAINFORM = new IDPanel(w, this, 1, "PAN_SCHEDAINFORM");
    Frames[1].Content = PAN_SCHEDAINFORM;
    PAN_SCHEDAINFORM.ShowRowSelector = false;
    PAN_SCHEDAINFORM.ShowToolbar = false;
    PAN_SCHEDAINFORM.ShowStatusbar = false;
    PAN_SCHEDAINFORM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHEDAINFORM.VS = MainFrm.VisualStyleList;
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 536-MyGlb.PAN_OFFS_X, 144-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B5B1A8BD-11D5-42F1-909C-CCBB39CE63DD");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 764, 100, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 0);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHEDAINFORM.InitStatus = 2;
    PAN_SCHEDAINFORM_Init();
    PAN_SCHEDAINFORM_InitFields();
    PAN_SCHEDAINFORM_InitQueries();
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
      PAN_SCHEDAINFORM.UpdatePanel(MainFrm);
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
    return (obj instanceof SchedaInformativaMov);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchedaInformativaMov.class.getName() : (Glb.ClassWithPackage(SchedaInformativaMov.class) ? SchedaInformativaMov.class.getName().substring(SchedaInformativaMov.class.getPackage().getName().length() + 1) : SchedaInformativaMov.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Scheda Informativa After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_SCHEDAINFORM_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scheda Informativa After Find Body
      // Corpo Procedura
      // 
      SettaCaption();
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODOCORRENES, 0).equals((new IDVariant("E")), true))
      {
        IDVariant v_ORDINATIVI = new IDVariant(0,IDVariant.STRING);
        v_ORDINATIVI = (new IDVariant("Ordinativi"));
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEDAINFORM.set_Header(Glb.OBJ_FIELD,PFL_SCHEDAINFORM_ORDSUBIMP, new IDVariant(v_ORDINATIVI).stringValue());
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP")), true))
        {
          PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          IDVariant v_SUBIMPEGNI = new IDVariant(0,IDVariant.STRING);
          v_SUBIMPEGNI = (new IDVariant("Sub-Impegni"));
          PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_SCHEDAINFORM.set_Header(Glb.OBJ_FIELD,PFL_SCHEDAINFORM_ORDSUBIMP, new IDVariant(v_SUBIMPEGNI).stringValue());
        }
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("IMP")), true) && MainFrm.DETTIMPENETT.equals((new IDVariant("SI")), true))
      {
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SCHEDAINFORM.SetFlags (Glb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaMov", "SchedaInformativaAfterFind", _e);
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
      set_FormTopPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ5, IMDBDef7.FLD_PARAMEPOSIZ5_POSTOP, 0),IDL.Sub((new IDVariant(MainFrm.ScreenHeight())), (new IDVariant(FormHeightSize())))).intValue());
      set_FormLeftPosition(IDL.NullValue(IMDB.Value(IMDBDef7.TBL_PARAMEPOSIZ5, IMDBDef7.FLD_PARAMEPOSIZ5_POSLEFT, 0),IDL.Sub((new IDVariant(MainFrm.ScreenWidth())), (IDL.Add((new IDVariant(FormWidthSize())), (new IDVariant(30)))))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaMov", "Load", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaMov", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARATIPOESPL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARAMPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef7.TBL_PARAMETRI425, IMDBDef7.FLD_PARAMETRI425_PARAMTITOLO, 0, new IDVariant());
  }

  // **********************************************************************
  // Setta Caption
  // **********************************************************************
  public int SettaCaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Caption Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Scheda Informativa - "));
      IDVariant v_ACCERTAMENTO = new IDVariant(0,IDVariant.STRING);
      v_ACCERTAMENTO = (new IDVariant("Accertamento "));
      IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
      v_IMPEGNO = (new IDVariant("Impegno "));
      IDVariant v_SUBIMPEGNO = new IDVariant(0,IDVariant.STRING);
      v_SUBIMPEGNO = (new IDVariant("Sub-Impegno "));
      IDVariant v_RESIDUO = new IDVariant(0,IDVariant.STRING);
      v_RESIDUO = (new IDVariant("Residuo "));
      IDVariant v_SUBRESIDUO = new IDVariant(0,IDVariant.STRING);
      v_SUBRESIDUO = (new IDVariant("Sub-Residuo "));
      IDVariant v_DATAREG = null;
      v_DATAREG = (new IDVariant());
      IDVariant v_SEDEDEL = null;
      v_SEDEDEL = (new IDVariant());
      IDVariant v_NUMERODEL = null;
      v_NUMERODEL = (new IDVariant());
      IDVariant v_ANNODEL = null;
      v_ANNODEL = (new IDVariant());
      IDVariant v_ATTO = new IDVariant(0,IDVariant.STRING);
      v_ATTO = (new IDVariant(" - Atto "));
      IDVariant v_MOVIMENTO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_ANNO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_NUMERO = new IDVariant(0,IDVariant.INTEGER);
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("ACC")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.D_DATA_REG as ACCDDATAREG, ");
        SQL.append("  A.SEDE_DEL as ACCSEDEDEL, ");
        SQL.append("  A.NUMERO_DEL as ACCNUMERODEL, ");
        SQL.append("  A.ANNO_DEL as ACCANNODEL ");
        SQL.append("from ");
        SQL.append("  ACC A ");
        SQL.append("where (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DATAREG = QV.Get("ACCDDATAREG", IDVariant.DATETIME) ;
          v_SEDEDEL = QV.Get("ACCSEDEDEL", IDVariant.STRING) ;
          v_NUMERODEL = QV.Get("ACCNUMERODEL", IDVariant.INTEGER) ;
          v_ANNODEL = QV.Get("ACCANNODEL", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          v_MOVIMENTO = new IDVariant(v_ACCERTAMENTO);
        }
        else
        {
          v_MOVIMENTO = new IDVariant(v_RESIDUO);
        }
        v_NUMERO = IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0);
        v_ANNO = IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0);
      }
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("IMP")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.D_DATA_REG as IMPDDATAREG, ");
        SQL.append("  A.SEDE_DEL as IMPSEDEDEL, ");
        SQL.append("  A.NUMERO_DEL as IMPNUMERODEL, ");
        SQL.append("  A.ANNO_DEL as IMPANNODEL ");
        SQL.append("from ");
        SQL.append("  IMP A ");
        SQL.append("where (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DATAREG = QV.Get("IMPDDATAREG", IDVariant.DATETIME) ;
          v_SEDEDEL = QV.Get("IMPSEDEDEL", IDVariant.STRING) ;
          v_NUMERODEL = QV.Get("IMPNUMERODEL", IDVariant.INTEGER) ;
          v_ANNODEL = QV.Get("IMPANNODEL", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          v_MOVIMENTO = new IDVariant(v_IMPEGNO);
        }
        else
        {
          v_MOVIMENTO = new IDVariant(v_RESIDUO);
        }
        v_NUMERO = IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUIMAC, 0);
        v_ANNO = IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANIMAC, 0);
      }
      if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORTIPRAM, 0).equals((new IDVariant("SUBIMP")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.D_DATA_REG as SUBIDDATAREG, ");
        SQL.append("  A.SEDE_DEL as SUBIMSEDEDEL, ");
        SQL.append("  A.NUMERO_DEL as SUBIMNUMEDEL, ");
        SQL.append("  A.ANNO_DEL as SUBIMANNODEL ");
        SQL.append("from ");
        SQL.append("  SUBIMP A ");
        SQL.append("where (A.NUMERO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DATAREG = QV.Get("SUBIDDATAREG", IDVariant.DATETIME) ;
          v_SEDEDEL = QV.Get("SUBIMSEDEDEL", IDVariant.STRING) ;
          v_NUMERODEL = QV.Get("SUBIMNUMEDEL", IDVariant.INTEGER) ;
          v_ANNODEL = QV.Get("SUBIMANNODEL", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0).equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true))
        {
          v_MOVIMENTO = new IDVariant(v_SUBIMPEGNO);
        }
        else
        {
          v_MOVIMENTO = new IDVariant(v_SUBRESIDUO);
        }
        v_NUMERO = IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORNUSUIM, 0);
        v_ANNO = IMDB.Value(IMDBDef7.TBL_VALONODOCORR, IMDBDef7.FLD_VALONODOCORR_NODCORANSUIM, 0);
      }
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTION, v_MOVIMENTO), IDL.ToString(v_NUMERO)), (new IDVariant("/"))), IDL.ToString(v_ANNO)), (new IDVariant(" - "))), IDL.ToString(v_DATAREG)), ((v_SEDEDEL.equals((new IDVariant())))?(new IDVariant()):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ATTO, v_SEDEDEL), (new IDVariant("-"))), IDL.ToString(v_NUMERODEL)), (new IDVariant("/"))), IDL.ToString(v_ANNODEL)))));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchedaInformativaMov", "SettaCaption", _e);
      return -1;
    }
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
  private void PAN_SCHEDAINFORM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SCHEDAINFORM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SCHEDAINFORM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHEDAINFORM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHEDAINFORM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SCHEDAINFORM);
    // Stub
  }

  private void PAN_SCHEDAINFORM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCHEDAINFORM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SCHEDAINFORM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHEDAINFORM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCHEDAINFORM_Init()
  {

    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, "644E3F25-370D-4AF7-91AD-9C8A88AC5566");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, "Iniziale");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, "F3D87CD4-A499-4533-B49A-B4BC7F652457");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, "Variazioni");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, "48DD6E0F-9490-4198-90C3-EBE35013CF4F");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, "Attuale");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, "BB7A36D3-2C0A-4319-A235-26D35F632196");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, "Importo Attuale Netto");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, "3AC8A86C-4BBD-4C45-9D56-B561334893DE");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, "Ord Subimp");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, "21612AA8-1DD1-4E1B-8877-CCB750CC6423");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, "Liquidazioni");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, "D5B8429A-F3FE-4884-8A2E-EF1C6EA11764");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, "Disponibilità");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, "BA58856F-DE47-4DF8-815D-EC5A17B8F8A0");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, "Mandati");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, "A44C796D-D5F6-4C6B-AD1E-44312039B6F5");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, "Disp. Effettiva");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHEDAINFORM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, "F9E92CAD-FF6B-4C88-B559-BD5B9A2A3662");
    PAN_SCHEDAINFORM.set_Header(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, "Mandati Solo Imp.");
    PAN_SCHEDAINFORM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, "");
    PAN_SCHEDAINFORM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.VIS_NORFIECF4IMP);
    PAN_SCHEDAINFORM.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SCHEDAINFORM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, 0, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, 80);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_LIST, "Iniziale");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, 8, 12, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPINIZIALE, MyGlb.PANEL_FORM, "Iniziale");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_IMPINIZIALE, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_IMPINIZIALE, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_IMPINIZIALE, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'IMP_INIZIALE',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPINIZIALE", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, 56, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, 64);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_LIST, "Variaz.");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, 292, 12, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPVARIAZION, MyGlb.PANEL_FORM, "Variazioni");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_IMPVARIAZION, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_IMPVARIAZION, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_IMPVARIAZION, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'IMP_VARIAZ',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPVARIAZION", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_LIST, 112, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_LIST, 64);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_LIST, "Attuale");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_FORM, 8, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPATTUALE, MyGlb.PANEL_FORM, "Attuale");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_IMPATTUALE, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_IMPATTUALE, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_IMPATTUALE, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'IMP_ATTUALE',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "IMPATTUALE", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_LIST, 0, 0, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_LIST, 168);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_LIST, "Importo Attuale Netto");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_FORM, 252, 36, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_FORM, 136);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_IMPOATTUNETT, MyGlb.PANEL_FORM, "Importo Attuale Netto");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_IMPOATTUNETT, -1, -1);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_IMPOATTUNETT, PPQRY_IMPORTIPERS, "NVL(~~IMPATTUALE~~, 0) - NVL(~~ORDSUBIMP~~, 0)", "IMPOATTUNETT", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_LIST, 168, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_LIST, "Ord Sub.");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_FORM, 8, 60, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_ORDSUBIMP, MyGlb.PANEL_FORM, "Ord Subimp");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_ORDSUBIMP, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_ORDSUBIMP, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_ORDSUBIMP, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),DECODE(~~TBL_VALONODOCORR.NODOCORRENES~~, 'E', 'MANORD_IMPACC', 'SUBIMP'),~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "ORDSUBIMP", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_LIST, 336, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_LIST, 52);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_LIST, "Liquid.");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_FORM, 292, 60, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_LIQUIDAZIONI, MyGlb.PANEL_FORM, "Liquidazioni");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_LIQUIDAZIONI, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_LIQUIDAZIONI, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_LIQUIDAZIONI, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'LIQ',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "LIQUIDAZIONI", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_LIST, 224, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_LIST, 56);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_LIST, "Dispon.");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_FORM, 8, 84, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_DISPONIBILIT, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_DISPONIBILIT, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_DISPONIBILIT, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'DISP_IMPACC',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPONIBILIT", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_LIST, 392, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_LIST, 56);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_FORM, 292, 84, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDATI, MyGlb.PANEL_FORM, "Mandati");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_MANDATI, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_MANDATI, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_MANDATI, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'MANORD_IMPACC',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "MANDATI", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_LIST, 280, 0, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_LIST, 80);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_LIST, "Dsp. Eff.");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_FORM, 8, 108, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_FORM, 96);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_DISPEFFETTIV, MyGlb.PANEL_FORM, "Disp. Effettiva");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_DISPEFFETTIV, -1, -1);
    PAN_SCHEDAINFORM.SetFieldUnbound(PFL_SCHEDAINFORM_DISPEFFETTIV, true);
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_DISPEFFETTIV, PPQRY_DUAL, "GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~)", "DISPEFFETTIV", 3, 28, 6, -13997);
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_LIST, 0, 0, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_LIST, 140);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_LIST, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_LIST, "Mandati Solo Imp.");
    PAN_SCHEDAINFORM.SetRect(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_FORM, 280, 108, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHEDAINFORM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_FORM, 108);
    PAN_SCHEDAINFORM.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_FORM, 1);
    PAN_SCHEDAINFORM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHEDAINFORM_MANDASOLOIMP, MyGlb.PANEL_FORM, "Mandati Solo Imp.");
    PAN_SCHEDAINFORM.SetFieldPage(PFL_SCHEDAINFORM_MANDASOLOIMP, -1, -1);
    SQL = new StringBuffer();
    SQL.append("NVL(~~MANDATI~~, 0) - ( ");
  SQL.append("select ");
  SQL.append("  NVL(SUM(B.MANDATI), 0) ");
  SQL.append("from ");
  SQL.append("  ESESUB B ");
  SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
  SQL.append("and   (B.ANNO_IMP = ~~TBL_VALONODOCORR.NODCORANIMAC~~) ");
  SQL.append("and   (B.NUMERO_IMP = ~~TBL_VALONODOCORR.NODCORNUIMAC~~) ");
  SQL.append(")");
    PAN_SCHEDAINFORM.SetFieldPanel(PFL_SCHEDAINFORM_MANDASOLOIMP, PPQRY_IMPORTIPERS, SQL.toString(), "MANDASOLOIMP", 3, 28, 6, -13997);
  }

  private void PAN_SCHEDAINFORM_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHEDAINFORM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(~~IMPATTUALE~~, 0) - NVL(~~ORDSUBIMP~~, 0) as IMPOATTUNETT, ");
    SQL.append("  NVL(~~MANDATI~~, 0) - ( ");
    SQL.append("select ");
    SQL.append("  NVL(SUM(B.MANDATI), 0) ");
    SQL.append("from ");
    SQL.append("  ESESUB B ");
    SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.ANNO_IMP = ~~TBL_VALONODOCORR.NODCORANIMAC~~) ");
    SQL.append("and   (B.NUMERO_IMP = ~~TBL_VALONODOCORR.NODCORNUIMAC~~) ");
    SQL.append(") as MANDASOLOIMP ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEDAINFORM.SetQuery(PPQRY_IMPORTIPERS, 0, SQL, -1, "");
    PAN_SCHEDAINFORM.SetQueryDB(PPQRY_IMPORTIPERS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEDAINFORM.SetMasterTable(PPQRY_IMPORTIPERS, "DUAL");
    PAN_SCHEDAINFORM.SetIMDB(IMDB, "PQRY_DUAL", true);
    PAN_SCHEDAINFORM.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'IMP_INIZIALE',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPINIZIALE, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'IMP_VARIAZ',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPVARIAZION, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'IMP_ATTUALE',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as IMPATTUALE, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),DECODE(~~TBL_VALONODOCORR.NODOCORRENES~~, 'E', 'MANORD_IMPACC', 'SUBIMP'),~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as ORDSUBIMP, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'DISP_IMPACC',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPONIBILIT, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'DISP_EFF',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as DISPEFFETTIV, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'LIQ',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as LIQUIDAZIONI, ");
    SQL.append("  GET_IMPORTI_SCHEDA_INFO_MOV(~~TBL_PARAMETRI425.PARAMESERCIZ~~,DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', 'SS', ~~TBL_VALONODOCORR.NODOCORRENES~~),~~TBL_VALONODOCORR.NODOCORRTITO~~,~~TBL_VALONODOCORR.NODCORCATINT~~,~~TBL_VALONODOCORR.NODCORCODTER~~,DECODE(~~TBL_VALONODOCORR.NODOCORRCAPI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRCAPI~~),DECODE(~~TBL_VALONODOCORR.NODOCORRARTI~~, 0, -1, ~~TBL_VALONODOCORR.NODOCORRARTI~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORANSUIM~~, ~~TBL_VALONODOCORR.NODCORANIMAC~~),DECODE(~~TBL_VALONODOCORR.NODCORTIPRAM~~, 'SUBIMP', ~~TBL_VALONODOCORR.NODCORNUSUIM~~, ~~TBL_VALONODOCORR.NODCORNUIMAC~~),NULL,NULL,NULL,to_number(NULL),'MANORD_IMPACC',~~TBL_VALONODOCORR.NODOCORRFINA~~,~~TBL_VALONODOCORR.NODOCORROPER~~,~~TBL_VALONODOCORR.NODCORCODLI5~~) as MANDATI ");
    PAN_SCHEDAINFORM.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHEDAINFORM.SetQuery(PPQRY_DUAL, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetQuery(PPQRY_DUAL, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetQuery(PPQRY_DUAL, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetQuery(PPQRY_DUAL, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHEDAINFORM.SetQuery(PPQRY_DUAL, 5, SQL, -1, "");
    PAN_SCHEDAINFORM.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHEDAINFORM.SetMasterTable(0, "DUAL");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHEDAINFORM.Status() == 2)
    {
      int oldListQBE = PAN_SCHEDAINFORM.iUseListQBE;
      PAN_SCHEDAINFORM.iUseListQBE = 0;
      PAN_SCHEDAINFORM.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHEDAINFORM.PanelCommand(Glb.PCM_FIND);
      PAN_SCHEDAINFORM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SCHEDAINFORM) PAN_SCHEDAINFORM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
