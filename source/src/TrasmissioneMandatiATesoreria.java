// **********************************************
// Trasmissione Mandati A Tesoreria
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class TrasmissioneMandatiATesoreria extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARTRAMANATE_MANDATI = 0;

  private static int PFL_PARTRAMANATE_DAL = 0;
  private static int PFL_PARTRAMANATE_AL = 1;
  private static int PFL_PARTRAMANATE_NEWPANELLABE = 2;
  private static int PFL_PARTRAMANATE_NEWPANELABE1 = 3;
  private static int PFL_PARTRAMANATE_OKBUTTON = 4;
  private static int PFL_PARTRAMANATE_OLDTIPO = 5;
  private static int PFL_PARTRAMANATE_UFFICIO = 6;
  private static int PFL_PARTRAMANATE_DISTINNUMERO = 7;

  private static int PPQRY_NEWTABLE47 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_PARTRAMANATE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARTRAMANATE(IMDB);
    //
    //
    Init_PQRY_NEWTABLE47(IMDB);
    Init_PQRY_NEWTABLE47_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARTRAMANATE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARTRAMANATE, 10);
    IMDB.set_TblCode(IMDBDef5.TBL_PARTRAMANATE, "TBL_PARTRAMANATE");
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDAL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEAL,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEMANDA, "ROWNAMEMANDA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEMANDA,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMOLDTIP, "ROWNAMOLDTIP");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMOLDTIP,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMDISNUM,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMDATRIS, "ROWNAMDATRIS");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMDATRIS,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDALD, "ROWNAMEDALD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDALD,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEALD, "ROWNAMEALD");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEALD,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARTRAMANATE,IMDBDef5.FLD_PARTRAMANATE_ROWNAMEUFFIC,1,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARTRAMANATE, 0);
  }

  private static void Init_PQRY_NEWTABLE47(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE47, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE47, "PQRY_NEWTABLE47");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEDAL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEAL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMOLDTIP, "ROWNAMOLDTIP");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMOLDTIP,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47,IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM,1,5,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE47, 0);
  }

  private static void Init_PQRY_NEWTABLE47_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE47_RS, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE47_RS, "PQRY_NEWTABLE47_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEDAL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEAL,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMOLDTIP, "ROWNAMOLDTIP");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMOLDTIP,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMEUFFIC,1,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE47_RS,IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public TrasmissioneMandatiATesoreria(MyWebEntryPoint w, IMDBObj imdb)
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
  public TrasmissioneMandatiATesoreria()
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
    FormIdx = MyGlb.FRM_TRASMANDATES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "746CF5A5-46EB-41CB-9278-1ADACF82E207";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 388;
    DesignHeight = 222;
    set_Caption(new IDVariant("Trasmissione Mandati A Tesoreria"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 388;
    Frames[1].Height = 196;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Trasmissione Mandati A Tesoreria";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 196;
    PAN_PARTRAMANATE = new IDPanel(w, this, 1, "PAN_PARTRAMANATE");
    Frames[1].Content = PAN_PARTRAMANATE;
    PAN_PARTRAMANATE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARTRAMANATE.VS = MainFrm.VisualStyleList;
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 388-MyGlb.PAN_OFFS_X, 196-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2817A5D4-A626-4B23-B937-A69D1AC2EE3E");
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 308, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARTRAMANATE.InitStatus = 1;
    PAN_PARTRAMANATE_Init();
    PAN_PARTRAMANATE_InitFields();
    PAN_PARTRAMANATE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARTRAMANATE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        TRASMANDATES_NEWTABLE47();
      }
      PAN_PARTRAMANATE.UpdatePanel(MainFrm);
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
    return (obj instanceof TrasmissioneMandatiATesoreria);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? TrasmissioneMandatiATesoreria.class.getName() : (Glb.ClassWithPackage(TrasmissioneMandatiATesoreria.class) ? TrasmissioneMandatiATesoreria.class.getName().substring(TrasmissioneMandatiATesoreria.class.getPackage().getName().length() + 1) : TrasmissioneMandatiATesoreria.class.getName()));
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Trasmissione Mandati a Tesoreria", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      // 
      // setto al e dal
      // 
      {
        IDVariant v_AL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_DAL = new IDVariant(0,IDVariant.INTEGER);
        v_DAL = IDL.Add(UltimoMandatoTrasmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)), (new IDVariant(1)));
        v_AL = UltimoMandatoEmesso(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        if (v_DAL.compareTo(v_AL, true)>0)
        {
          IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDAL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEAL, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDAL, 0, new IDVariant(v_DAL));
          IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEAL, 0, new IDVariant(v_AL));
        }
      }
      if (IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_TIPO_MO, 0).compareTo((new IDVariant("RAC")), true)!=0)
      {
        PAN_PARTRAMANATE.SetFlags (Glb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARTRAMANATE.SetFlags (Glb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_TIPO_MO, 0).compareTo((new IDVariant("BPT")), true)!=0)
      {
        PAN_PARTRAMANATE.SetFlags (Glb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARTRAMANATE.SetFlags (Glb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "LoadEvent", _e);
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
      UNLOADEVENT_PATRMAATEDER();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Trasmissione Mandati A Tesoreria: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PATRMAATEDER() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEMANDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMOLDTIP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMDISNUM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMDATRIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDALD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEALD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMETIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEUFFIC, 0, new IDVariant());
  }

  // **********************************************************************
  // Ultimo Mandato Trasmesso
  // Explain which processing is carried out by this procedure
  // My Esercizio:  - Input
  // **********************************************************************
  public IDVariant UltimoMandatoTrasmesso (IDVariant MyEsercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ULTIMOMANDAT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Ultimo Mandato Trasmesso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.ULT_MAN_TESO, 0) as NUVAN0ULMAT0 ");
      SQL.append("from ");
      SQL.append("  N04 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(MyEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ULTIMOMANDAT = QV.Get("NUVAN0ULMAT0", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_ULTIMOMANDAT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "UltimoMandatoTrasmesso", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Ultimo Mandato Emesso
  // Explain which processing is carried out by this procedure
  // My Esercizio:  - Input
  // **********************************************************************
  public IDVariant UltimoMandatoEmesso (IDVariant MyEsercizio)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ULTIMOMANDAT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Ultimo Mandato Emesso Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  NVL(A.NUMERO, 0) as NULVALN03NU0 ");
      SQL.append("from ");
      SQL.append("  N03 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(MyEsercizio, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE = 'man') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ULTIMOMANDAT = QV.Get("NULVALN03NU0", IDVariant.INTEGER) ;
      }
      QV.Close();
      return v_ULTIMOMANDAT;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "UltimoMandatoEmesso", _e);
      return new IDVariant();
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
    IDVariant v_OUTFILE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_FASE = new IDVariant(0,IDVariant.STRING);
    IDCachedRowSet C16;

    try
    {
      TransCount = 0;
      v_OUTFILE = (new IDVariant("MAN.txt", IDVariant.STRING));
      v_FASE = (new IDVariant("MAN", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      // 
      // validazione dei parametri
      // 
      {
        if ((IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMEDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMEAL, 0))))
        {
          if (IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_TIPO_MO, 0).compareTo((new IDVariant("BPT")), true)!=0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Valori Obbligatori su numeri mandati"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
          else
          {
            if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM, 0)))
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Indicare Numeri Mandati o il numero Distinta"));
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
            else
            {
              IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1 ");
              SQL.append("from ");
              SQL.append("  MAN A ");
              SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
              }
              QV.Close();
              if (v_VCOUNT.equals((new IDVariant(0)), true))
              {
                IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
                v_AVVISO = (new IDVariant("Distinta non esistente"));
                MainFrm.set_AlertMessage(v_AVVISO); 
                IMDB.set_Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM, 0, (new IDVariant()));
                return 0;
              }
            }
          }
        }
      }
      SQL = new StringBuffer();
      SQL.append("delete from WORK_EXPORT_TESO ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      SQL.append("and   (FASE = " + IDL.CSql(v_FASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GENERATESOMAN(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMEDAL, 0), IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMEAL, 0), ((IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMEUFFIC, 0)), IMDB.Value(IMDBDef15.PQRY_NEWTABLE47, IMDBDef15.PQSL_NEWTABLE47_ROWNAMDISNUM, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      if ((new IDVariant(-1)).equals((new IDVariant(-1)), true))
      {
        IDVariant v_FD = new IDVariant(0,IDVariant.INTEGER);
        // 
        // scrivo il file
        // 
        {
          v_FD = MainFrm.VBFile.FreeFile();
          MainFrm.VBFile.OpenForOutput(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/temp/"))), v_OUTFILE), v_FD, false); 
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DATI as WOREXPTESDA1, ");
          SQL.append("  A.ORDINAMENTO as WOREXPTESORD ");
          SQL.append("from ");
          SQL.append("  WORK_EXPORT_TESO A ");
          SQL.append("where (A.FASE = " + IDL.CSql(v_FASE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
          SQL.append("order by ");
          SQL.append("  A.ORDINAMENTO ");
          C16 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!C16.EOF()) C16.MoveNext();
          while (!C16.EOF())
          {
            IDVariant v_TMP = new IDVariant(0,IDVariant.STRING);
            v_TMP = new IDVariant(C16.Get("WOREXPTESDA1"));
            MainFrm.VBFile.WriteLine(v_FD, v_TMP); 
            MainFrm.DTTObj.Add(IDL.Replace(v_TMP, (new IDVariant(" ")), (new IDVariant("_"))).stringValue(), (new IDVariant(999)).intValue(), (new IDVariant(2)).intValue()); 
            C16.MoveNext();
          }
          C16.Close();
          MainFrm.VBFile.Close(v_FD); 
          MainFrm.set_RedirectTo(IDL.Add((new IDVariant("temp/")), v_OUTFILE));
          MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
          MainFrm.set_RedirectFeatures((new IDVariant(""))); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Data Ristampa Ord
  // controllare se gestire errore
  // esercizio 1 - Input
  // numero 1 - Input
  // Data - Input/Output
  // **********************************************************************
  public IDVariant DataRistampaOrd (IDVariant esercizio1, IDVariant numero1, IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Data Ristampa Ord Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.D_DATA_ELENCO) as MINORDDDATEL ");
      SQL.append("from ");
      SQL.append("  ORD A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(esercizio1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(numero1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        Data.set(QV.Get("MINORDDDATEL", IDVariant.DATETIME));
      }
      QV.Close();
      return (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "DataRistampaOrd", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Man Ristampa Dist
  // Explain which processing is carried out by this procedure
  // anno - Input
  // numeroElenco - Input
  // **********************************************************************
  public IDVariant ManRistampaDist (IDVariant anno, IDVariant numeroElenco)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Man Ristampa Dist Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(anno, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(numeroElenco, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_COUNT.equals((new IDVariant(0)), true))
      {
        return (new IDVariant(-1));
      }
      else
      {
        return (new IDVariant(1));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "ManRistampaDist", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Data Ristampa Man
  // controllare se gestire errore
  // esercizio 1 - Input
  // numero 1 - Input
  // Data - Input/Output
  // **********************************************************************
  public IDVariant DataRistampaMan (IDVariant esercizio1, IDVariant numero1, IDVariant Data)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Data Ristampa Man Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.D_DATA_ELENCO) as MINMANDDATEL ");
      SQL.append("from ");
      SQL.append("  MAN A ");
      SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(esercizio1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(numero1, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        Data.set(QV.Get("MINMANDDATEL", IDVariant.DATETIME));
      }
      QV.Close();
      return (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("TrasmissioneMandatiATesoreria", "DataRistampaMan", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void TRASMANDATES_NEWTABLE47() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE47_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARTRAMANATE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARTRAMANATE, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE47_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE47_RS, 0, IMDBDef5.TBL_PARTRAMANATE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE47_RS, 0, 0, IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE47_RS, 1, 0, IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE47_RS, 2, 0, IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMOLDTIP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE47_RS, 3, 0, IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE47_RS, 4, 0, IMDBDef5.TBL_PARTRAMANATE, IMDBDef5.FLD_PARTRAMANATE_ROWNAMDISNUM, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARTRAMANATE, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARTRAMANATE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARTRAMANATE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE47_RS, 0);
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
  private void PAN_PARTRAMANATE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARTRAMANATE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARTRAMANATE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARTRAMANATE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARTRAMANATE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARTRAMANATE);
    // Stub
  }

  private void PAN_PARTRAMANATE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARTRAMANATE_OKBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARTRAMANATE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARTRAMANATE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARTRAMANATE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARTRAMANATE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARTRAMANATE_Init()
  {

    PAN_PARTRAMANATE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARTRAMANATE.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, "3BA48D64-4035-47BF-97E1-0A735974356D");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, "Mandati");
    PAN_PARTRAMANATE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 136, 10, 0, 0);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, MyGlb.PANEL_FORM, 16, 10, 332, 114, 0, 0);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, 0, 46);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, 1, 13);
    PAN_PARTRAMANATE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, 0, 2);
    PAN_PARTRAMANATE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, 1, 2);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_GROUP, GRP_PARTRAMANATE_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARTRAMANATE.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, "A9CAE7F3-F212-4D00-B222-6CAC793EB7B3");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, "Dal");
    PAN_PARTRAMANATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, "EDC79D94-97CF-44A1-AB5B-02F679D2CAD1");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, "Al");
    PAN_PARTRAMANATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, "211BDB2D-4965-4141-B8DD-A5CDAF696DDA");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, "FC6D90F0-503E-4CDA-889D-9A0B590E24DB");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, "4B32E9A8-9D1A-4F20-A1D3-E3B8E3EB1360");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, "OK");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARTRAMANATE.SetImage(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, 0, "button1.gif", false);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, "333F47AD-E26D-4490-AB31-22CB0102B870");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, "OLD TIPO");
    PAN_PARTRAMANATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, "33559936-9B7D-453C-A859-4B36B420C51D");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, "Ufficio");
    PAN_PARTRAMANATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARTRAMANATE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, "76936F87-C986-4517-9535-56CAE8B85B8F");
    PAN_PARTRAMANATE.set_Header(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, "Distinta n.");
    PAN_PARTRAMANATE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, "");
    PAN_PARTRAMANATE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARTRAMANATE.SetFlags(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_PARTRAMANATE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_LIST, 60);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_FORM, 56, 48, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_DAL, -1, GRP_PARTRAMANATE_MANDATI);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_DAL, PPQRY_NEWTABLE47, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 4, 0, -13997);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_LIST, 72, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_LIST, 52);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_FORM, 240, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_AL, -1, GRP_PARTRAMANATE_MANDATI);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_AL, PPQRY_NEWTABLE47, "A.ROWNAMEAL", "ROWNAMEAL", 1, 4, 0, -13997);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, MyGlb.PANEL_LIST, 28, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, MyGlb.PANEL_FORM, 20, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_NEWPANELLABE, -1, GRP_PARTRAMANATE_MANDATI);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, MyGlb.PANEL_LIST, 36, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, MyGlb.PANEL_FORM, 332, 108, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_NEWPANELABE1, -1, GRP_PARTRAMANATE_MANDATI);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, MyGlb.PANEL_LIST, 16, 128, 48, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, MyGlb.PANEL_FORM, 240, 144, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OKBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_OKBUTTON, -1, -1);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_OKBUTTON, -1, "", "OKBUTTON", 0, 0, 0, -13997);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_LIST, 56);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_LIST, "OLD TIPO");
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_FORM, 4, 192, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_FORM, 56);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_OLDTIPO, MyGlb.PANEL_FORM, "OLD TP.");
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_OLDTIPO, -1, -1);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_OLDTIPO, PPQRY_NEWTABLE47, "A.ROWNAMOLDTIP", "ROWNAMOLDTIP", 1, 49, 0, -13997);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(1)), "Nuovi Mandati ", "Nuovi Mandati ", "", -1);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(2)), "Annullamenti Mandati", "Annullamenti", "", -1);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(3)), "Variazioni Mandati", "Variazioni", "", -1);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(4)), "Sostituzioni Mandati", "Sostituzioni", "", -1);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(5)), "Nuovi Ordinativi", "Nuovi Ordinativi", "", -1);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(6)), "Annullamenti Ordinativi", "Annullamenti", "", -1);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(7)), "Variazioni Ordinativi", "Variazioni", "", -1);
    PAN_PARTRAMANATE.SetValueListItem(PFL_PARTRAMANATE_OLDTIPO, (new IDVariant(8)), "Sostituzioni Ordinativi", "Sostituzioni", "", -1);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_LIST, 44);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_FORM, 40, 72, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_UFFICIO, -1, -1);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_UFFICIO, PPQRY_NEWTABLE47, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 10, 0, -13997);
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_LIST, 112);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_LIST, "Distinta n.");
    PAN_PARTRAMANATE.SetRect(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_FORM, 16, 96, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARTRAMANATE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_FORM, 68);
    PAN_PARTRAMANATE.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PARTRAMANATE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARTRAMANATE_DISTINNUMERO, MyGlb.PANEL_FORM, "Distinta n.");
    PAN_PARTRAMANATE.SetFieldPage(PFL_PARTRAMANATE_DISTINNUMERO, -1, -1);
    PAN_PARTRAMANATE.SetFieldPanel(PFL_PARTRAMANATE_DISTINNUMERO, PPQRY_NEWTABLE47, "A.ROWNAMDISNUM", "ROWNAMDISNUM", 1, 5, 0, -13997);
  }

  private void PAN_PARTRAMANATE_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARTRAMANATE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARTRAMANATE.SetQuery(PPQRY_T53, 0, SQL, PFL_PARTRAMANATE_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARTRAMANATE.SetQuery(PPQRY_T53, 1, SQL, PFL_PARTRAMANATE_UFFICIO, "");
    PAN_PARTRAMANATE.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARTRAMANATE.SetIMDB(IMDB, "PQRY_NEWTABLE47", true);
    PAN_PARTRAMANATE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARTRAMANATE.SetQueryIMDB(PPQRY_NEWTABLE47, IMDBDef15.PQRY_NEWTABLE47_RS, IMDBDef5.TBL_PARTRAMANATE);
    JustLoaded = true;
    PAN_PARTRAMANATE.SetFieldPrimaryIndex(PFL_PARTRAMANATE_DAL, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEDAL);
    PAN_PARTRAMANATE.SetFieldPrimaryIndex(PFL_PARTRAMANATE_AL, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEAL);
    PAN_PARTRAMANATE.SetFieldPrimaryIndex(PFL_PARTRAMANATE_OLDTIPO, IMDBDef5.FLD_PARTRAMANATE_ROWNAMOLDTIP);
    PAN_PARTRAMANATE.SetFieldPrimaryIndex(PFL_PARTRAMANATE_UFFICIO, IMDBDef5.FLD_PARTRAMANATE_ROWNAMEUFFIC);
    PAN_PARTRAMANATE.SetFieldPrimaryIndex(PFL_PARTRAMANATE_DISTINNUMERO, IMDBDef5.FLD_PARTRAMANATE_ROWNAMDISNUM);
    PAN_PARTRAMANATE.SetMasterTable(0, "PARTRAMANATE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARTRAMANATE.Status() == 2)
    {
      int oldListQBE = PAN_PARTRAMANATE.iUseListQBE;
      PAN_PARTRAMANATE.iUseListQBE = 0;
      PAN_PARTRAMANATE.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARTRAMANATE.PanelCommand(Glb.PCM_FIND);
      PAN_PARTRAMANATE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARTRAMANATE) PAN_PARTRAMANATE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARTRAMANATE) PAN_PARTRAMANATE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARTRAMANATE) PAN_PARTRAMANATE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARTRAMANATE) PAN_PARTRAMANATE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARTRAMANATE) PAN_PARTRAMANATE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
