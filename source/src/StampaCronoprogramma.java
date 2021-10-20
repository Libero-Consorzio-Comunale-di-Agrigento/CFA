// **********************************************
// Stampa Cronoprogramma
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampaCronoprogramma extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_OPERA = 0;
  private static int PFL_PARS_ESERCIINSERI = 1;
  private static int PFL_PARS_CAPITOLO = 2;
  private static int PFL_PARS_ARTICOLO = 3;
  private static int PFL_PARS_FINANZIAMENT = 4;
  private static int PFL_PARS_CONFERMATO = 5;
  private static int PFL_PARS_PROGRUO = 6;
  private static int PFL_PARS_ETICHEELABOR = 7;
  private static int PFL_PARS_OPEREDESCRIZ = 8;
  private static int PFL_PARS_DESCRICAPITO = 9;
  private static int PFL_PARS_ETICHSCELCAP = 10;
  private static int PFL_PARS_FINANZDESCRI = 11;
  private static int PFL_PARS_TOTALIZZAZIO = 12;

  private static int PPQRY_PARS56 = 0;

  private static int PPQRY_OPERE = 1;
  private static int PPQRY_DUAL = 2;
  private static int PPQRY_FINANZIAMENT = 3;

  private static int PPQRY_CAPUO = 4;


  IDPanel PAN_PARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS58(IMDB);
    //
    //
    Init_PQRY_PARS56(IMDB);
    Init_PQRY_PARS56_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS58(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS58, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS58, "TBL_PARS58");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOOGSTELOELV, "NOOGSTELOELV");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOOGSTELOELV,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGEOPER, "NOMEOGGEOPER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGEOPER,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMOGGESEINS, "NOMOGGESEINS");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMOGGESEINS,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGECONF, "NOMEOGGECONF");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGECONF,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGETOTA, "NOMEOGGETOTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS58,IMDBDef3.FLD_PARS58_NOMEOGGETOTA,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS58, 0);
  }

  private static void Init_PQRY_PARS56(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS56, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS56, "PQRY_PARS56");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGEOPER, "NOMEOGGEOPER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGEOPER,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMOGGESEINS, "NOMOGGESEINS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMOGGESEINS,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGECONF, "NOMEOGGECONF");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGECONF,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGETOTA, "NOMEOGGETOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56,IMDBDef11.PQSL_PARS56_NOMEOGGETOTA,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARS56, 0);
  }

  private static void Init_PQRY_PARS56_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS56_RS, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS56_RS, "PQRY_PARS56_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGEOPER, "NOMEOGGEOPER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGEOPER,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMOGGESEINS, "NOMOGGESEINS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMOGGESEINS,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGECAPI,1,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGECONF, "NOMEOGGECONF");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGECONF,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGPROUO, "NOMEOGGPROUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGPROUO,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGETOTA, "NOMEOGGETOTA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS56_RS,IMDBDef11.PQSL_PARS56_NOMEOGGETOTA,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampaCronoprogramma(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampaCronoprogramma()
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
    FormIdx = MyGlb.FRM_STAMPACRONOP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3ECC95FC-998B-44C6-B82C-8A181FCCED65";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 744;
    DesignHeight = 202;
    set_Caption(new IDVariant("Stampa Cronoprogramma"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 744;
    Frames[1].Height = 176;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 176;
    PAN_PARS = new IDPanel(w, this, 1, "PAN_PARS");
    Frames[1].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 744-MyGlb.PAN_OFFS_X, 176-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DC5C69F7-51EA-4E9F-A20A-0DBC18B6B032");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2108, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS58, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMPACRONOP_PARS56();
      }
      PAN_PARS.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELOPERCRON && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_OPERA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_ELENCOFINANZ && flRis && IdxPanelActived == PAN_PARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARS_FINANZIAMENT) {
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
    return (obj instanceof StampaCronoprogramma);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampaCronoprogramma.class.getName() : (Glb.ClassWithPackage(StampaCronoprogramma.class) ? StampaCronoprogramma.class.getName().substring(StampaCronoprogramma.class.getPackage().getName().length() + 1) : StampaCronoprogramma.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTION1 = (new IDVariant("Stampa Cronoprogramma"));
      IDVariant v_CAPTION2 = new IDVariant(0,IDVariant.STRING);
      v_CAPTION2 = (new IDVariant("Stampa Elenco Variazioni"));
      set_Caption(((IMDB.Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOOGSTELOELV, 0).equals((new IDVariant(1)), true))?v_CAPTION1:v_CAPTION2));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEOPER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMOGGESEINS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGECAPI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEARTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEFINA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGECONF, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGPROUO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGETOTA, 0, (new IDVariant("A")));
      if (IMDB.Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOOGSTELOELV, 0).compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "Load", _e);
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOOGSTELOELV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEOPER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMOGGESEINS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGECONF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGPROUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGETOTA, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELOPERCRON)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEOPER, 0, IMDB.Value(IMDBDef8.PQRY_OPERE3, IMDBDef8.PQSL_OPERE3_CODICE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELENCOFINANZ)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEFINA, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME24, IMDBDef7.PQSL_FINANZIAME24_FINANZCODICE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCCADACAECUJ)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_CAPITOLO, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, 0, new IDVariant(IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0),IDVariant.INTEGER));
          IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Pars On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARS);
      // 
      // Pars On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_PARS.set_ToolTip(Glb.OBJ_FIELD,PFL_PARS_OPEREDESCRIZ,(new IDVariant(PAN_PARS.FieldText(PFL_PARS_OPEREDESCRIZ))).stringValue()); 
      PAN_PARS.set_ToolTip(Glb.OBJ_FIELD,PFL_PARS_DESCRICAPITO,(new IDVariant(PAN_PARS.FieldText(PFL_PARS_DESCRICAPITO))).stringValue()); 
      PAN_PARS.set_ToolTip(Glb.OBJ_FIELD,PFL_PARS_FINANZDESCRI,(new IDVariant(PAN_PARS.FieldText(PFL_PARS_FINANZDESCRI))).stringValue()); 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, 0)))
      {
      }
      else
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "ParsOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARS_OPERA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEOPER, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  OPERE A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEOPER, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CODICE <> 0) ");
          SQL.append("and   (NVL(A.SCADENZA, 9999) >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Opera/Progetto inesistente o scaduto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEOPER, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARS_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_PARS_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Capitolo inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PARS_FINANZIAMENT)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEFINA, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  FINANZIAMENTI A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NVL(A.SCADENZA, 9999) >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Finanziamento inesistente o scaduto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEFINA, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "ParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Stampa Cronoprogrammas
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int StampaCronoprogrammas ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Cronoprogrammas Body
      // Corpo Procedura
      // 
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Stampa_Crono"));
      IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
      v_S2 = (new IDVariant("Stampa_var_Crono"));
      IDVariant v_NOMESTAMPA = null;
      v_NOMESTAMPA = ((IMDB.Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOOGSTELOELV, 0).equals((new IDVariant(1)), true))?v_S1:v_S2);
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_OPERA")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEOPER, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO_INS")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMOGGESEINS, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CAPITOLO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECAPI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ARTICOLO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEARTI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_FINANZIAMENTO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGEFINA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CONFERMATO")), IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGECONF, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_UO")), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGPROUO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_GESTIONE_FIN")), ((MainFrm.FINANZIAMENT.equals((new IDVariant(-1))))?(new IDVariant("SI")):(new IDVariant("NO"))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      if (IMDB.Value(IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOOGSTELOELV, 0).equals((new IDVariant(2)), true))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_GRP")), IMDB.Value(IMDBDef11.PQRY_PARS56, IMDBDef11.PQSL_PARS56_NOMEOGGETOTA, 0));
      }
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "StampaCronoprogrammas", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Opera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Opera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Opera Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELOPERCRON, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "Opera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Finanziamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Finanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_ELENCOFINANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "Finanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltacap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta cap Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGPROUO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGETTES, 0, (new IDVariant("S")));
        MainFrm.Show(MyGlb.FRM_SCCADACAECUJ, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "EtichettaSceltacap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta info cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Etichettainfocap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta info cap Body
      // Corpo Procedura
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaCronoprogramma", "Etichettainfocap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void STAMPACRONOP_PARS56() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARS56_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS58, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS58, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARS56_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARS56_RS, 0, IMDBDef3.TBL_PARS58, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 0, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEOPER, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 1, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMOGGESEINS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 2, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 3, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 4, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGEFINA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 5, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGECONF, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 6, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGPROUO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS56_RS, 7, 0, IMDBDef3.TBL_PARS58, IMDBDef3.FLD_PARS58_NOMEOGGETOTA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS58, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS58, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS58, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARS56_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARS_OPERA)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Opera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Finanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      StampaCronoprogrammas();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARS_ETICHSCELCAP)
    {
      this.IdxPanelActived = this.PAN_PARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltacap();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, "948AC119-57FE-4F47-94CE-A1F606B5A547");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, "Opera/Progetto");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, "583304AF-8310-445E-AEF7-ABE903CA9A9E");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, "Esercizio Inserimento");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, "137EDE57-84AD-4C55-851C-7E4C09D9A3B5");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, "Capitolo/Art.");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, "37CCACB9-E9D0-4C48-8A85-F90B0156FB3A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, "/");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, "450C0C63-D56A-4885-8D61-FC2303552628");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, "Finanziamento");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, "C39DA466-AF26-4E87-8741-53193FB6EF52");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, "Confermato");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "9E1CB185-5A57-4C75-B253-F4246815361A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "Unità Organizzativa");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "B7123197-7000-4C29-855B-A04B57E8229A");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, "Elabora");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, "15F791EC-080A-42E4-A38C-0A50849A6F22");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, "OPERE DESCRIZIONE");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, "1CFDEE49-561B-4073-A86F-49B5B955E264");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, "Descrizione Capitolo");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, "A51CC8CC-31C5-4402-A7D2-2EDA503F0B61");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARS.SetImage(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, 0, "wsearch1.gif", false);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, "67A9082C-2FF6-45CE-A062-548E6A41950F");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, "Descrizione Finanziamento");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, "5DEAA7F0-96D6-4888-A5E2-DF11B460FED0");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, "Totalizzazione");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_LIST, "Op. Prog.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_FORM, 4, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_FORM, 144);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_OPERA, MyGlb.PANEL_FORM, "Opera/Progetto");
    PAN_PARS.SetFieldPage(PFL_PARS_OPERA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_OPERA, PPQRY_PARS56, "A.NOMEOGGEOPER", "NOMEOGGEOPER", 1, 5, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_LIST, 132);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_LIST, "Eserc. Inser.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_FORM, 4, 28, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_FORM, 144);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ESERCIINSERI, MyGlb.PANEL_FORM, "Esercizio Inserimento");
    PAN_PARS.SetFieldPage(PFL_PARS_ESERCIINSERI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ESERCIINSERI, PPQRY_PARS56, "A.NOMOGGESEINS", "NOMOGGESEINS", 1, 4, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo Art");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, 184, 28, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARS.SetFieldPage(PFL_PARS_CAPITOLO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CAPITOLO, PPQRY_PARS56, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 1, 16, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_LIST, "/");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, 416, 28, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, 16);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ARTICOLO, MyGlb.PANEL_FORM, "/");
    PAN_PARS.SetFieldPage(PFL_PARS_ARTICOLO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ARTICOLO, PPQRY_PARS56, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_LIST, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_FORM, 16, 52, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_FORM, 132);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PARS.SetFieldPage(PFL_PARS_FINANZIAMENT, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_FINANZIAMENT, PPQRY_PARS56, "A.NOMEOGGEFINA", "NOMEOGGEFINA", 1, 5, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_LIST, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_LIST, "Confermato");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_FORM, 572, 52, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_FORM, 76);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_CONFERMATO, MyGlb.PANEL_FORM, "Confermato");
    PAN_PARS.SetFieldPage(PFL_PARS_CONFERMATO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_CONFERMATO, PPQRY_PARS56, "A.NOMEOGGECONF", "NOMEOGGECONF", 5, 2, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_CONFERMATO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_CONFERMATO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 60);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 4, 76, 668, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 144);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_PROGRUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARS.SetFieldPage(PFL_PARS_PROGRUO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_PROGRUO, PPQRY_PARS56, "A.NOMEOGGPROUO", "NOMEOGGPROUO", 1, 8, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 424, 160, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 592, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHEELABOR, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_LIST, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_LIST, "OPERE DESCRIZIONE");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_FORM, 212, 4, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_FORM, 120);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_OPEREDESCRIZ, MyGlb.PANEL_FORM, "OPERE DESCRIZIONE");
    PAN_PARS.SetFieldPage(PFL_PARS_OPEREDESCRIZ, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_OPEREDESCRIZ, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_LIST, 0, 36, 504, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_LIST, 148);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_FORM, 464, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_FORM, 148);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DESCRICAPITO, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_PARS.SetFieldPage(PFL_PARS_DESCRICAPITO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_DESCRICAPITO, PPQRY_DUAL, "A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~NOMEOGGECAPI~~,~~NOMEOGGEARTI~~)", "NUOVAESPRESS", 5, 99, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, MyGlb.PANEL_LIST, 680, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, MyGlb.PANEL_FORM, 676, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHSCELCAP, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHSCELCAP, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHSCELCAP, -1, "", "ETICHSCELCAP", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_LIST, 176);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_FORM, 212, 52, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_FORM, 176);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_FINANZDESCRI, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_PARS.SetFieldPage(PFL_PARS_FINANZDESCRI, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_LIST, "Totalizzazione");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, 56, 100, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, 92);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_TOTALIZZAZIO, MyGlb.PANEL_FORM, "Totalizzazione");
    PAN_PARS.SetFieldPage(PFL_PARS_TOTALIZZAZIO, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_TOTALIZZAZIO, PPQRY_PARS56, "A.NOMEOGGETOTA", "NOMEOGGETOTA", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_TOTALIZZAZIO, (new IDVariant("A")), "Anno Variazione", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_TOTALIZZAZIO, (new IDVariant("E")), "Esercizio Pluriennale", "", "", -1);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE <> 0) ");
    SQL.append("and   (NVL(A.SCADENZA, 9999) >= ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.CODICE = ~~NOMEOGGEOPER~~) ");
    PAN_PARS.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_PARS.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetMasterTable(PPQRY_OPERE, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A_GET_DESCRIZIONE_CAP(~~TBL_DATISESSIONE.SESSIOESERCI~~,'S',~~NOMEOGGECAPI~~,~~NOMEOGGEARTI~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_PARS.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_PARS.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEFINA~~) ");
    PAN_PARS.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_PARS.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESC1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGPROUO~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_PARS.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_PARS_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as CAPUOPROUNOR, ");
    SQL.append("  SO4_UTIL.UNITA_GET_DESCR_VALIDA(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESC1 ");
    SQL.append("from ");
    SQL.append("  CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = 'G') ");
    SQL.append("and   (NVL(A.SCADENZA, TO_DATE('2999-12-31','YYYY-MM-DD')) > TRUNC( SYSDATE )) ");
    SQL.append("order by 2 ");
    PAN_PARS.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_PARS_PROGRUO, "");
    PAN_PARS.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS56", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS56, IMDBDef11.PQRY_PARS56_RS, IMDBDef3.TBL_PARS58);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_OPERA, IMDBDef3.FLD_PARS58_NOMEOGGEOPER);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ESERCIINSERI, IMDBDef3.FLD_PARS58_NOMOGGESEINS);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CAPITOLO, IMDBDef3.FLD_PARS58_NOMEOGGECAPI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ARTICOLO, IMDBDef3.FLD_PARS58_NOMEOGGEARTI);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_FINANZIAMENT, IMDBDef3.FLD_PARS58_NOMEOGGEFINA);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_CONFERMATO, IMDBDef3.FLD_PARS58_NOMEOGGECONF);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_PROGRUO, IMDBDef3.FLD_PARS58_NOMEOGGPROUO);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_TOTALIZZAZIO, IMDBDef3.FLD_PARS58_NOMEOGGETOTA);
    PAN_PARS.SetMasterTable(0, "PARS58");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
