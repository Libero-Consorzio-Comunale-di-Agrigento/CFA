// **********************************************
// Definizione Cronoprogramma
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DefinizioneCronoprogramma extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARSOPRA_CRONOPNONDEF = 0;
  private static int PFL_PARSOPRA_ETICHECRONOP = 1;
  private static int PFL_PARSOPRA_ETICSCELCRON = 2;
  private static int PFL_PARSOPRA_TESCROESEISC = 3;
  private static int PFL_PARSOPRA_TESTCRONOPER = 4;
  private static int PFL_PARSOPRA_TESCROIMPATT = 5;

  private static int PPQRY_PARSOPRA1 = 0;

  private static int PPQRY_TESTATCRONOP = 1;


  IDPanel PAN_PARSOPRA;
  private static int PFL_CRONOPROGRAM_OPERA = 0;
  private static int PFL_CRONOPROGRAM_PROGCRONDESC = 1;
  private static int PFL_CRONOPROGRAM_IMPORTO = 2;
  private static int PFL_CRONOPROGRAM_DATAINSERIME = 3;
  private static int PFL_CRONOPROGRAM_PROGRSESSION = 4;
  private static int PFL_CRONOPROGRAM_ETICHEELABOR = 5;
  private static int PFL_CRONOPROGRAM_ETICHETTATOT = 6;

  private static int PPQRY_WRKCRONOPDEF = 0;

  private static int PPQRY_PROGETCRONOP = 1;


  IDPanel PAN_CRONOPROGRAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARSOPRA(IMDB);
    //
    //
    Init_PQRY_PARSOPRA1(IMDB);
    Init_PQRY_PARSOPRA1_RS(IMDB);
    Init_PQRY_WRKCRONOPDEF(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARSOPRA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARSOPRA, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARSOPRA, "TBL_PARSOPRA");
    IMDB.set_FldCode(IMDBDef3.TBL_PARSOPRA,IMDBDef3.FLD_PARSOPRA_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef3.TBL_PARSOPRA,IMDBDef3.FLD_PARSOPRA_CRONOPROGRAMMA_ID,3,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARSOPRA, 0);
  }

  private static void Init_PQRY_PARSOPRA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARSOPRA1, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARSOPRA1, "PQRY_PARSOPRA1");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARSOPRA1,IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARSOPRA1,IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID,3,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARSOPRA1, 0);
  }

  private static void Init_PQRY_PARSOPRA1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARSOPRA1_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARSOPRA1_RS, "PQRY_PARSOPRA1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARSOPRA1_RS,IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARSOPRA1_RS,IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID,3,10,0);
  }

  private static void Init_PQRY_WRKCRONOPDEF(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_WRKCRONOPDEF, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_WRKCRONOPDEF, "PQRY_WRKCRONOPDEF");
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_PROGR_SESSIONE, "PROGR_SESSIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_WRKCRONOPDEF,IMDBDef11.PQSL_WRKCRONOPDEF_PROGR_SESSIONE,3,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_WRKCRONOPDEF, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DefinizioneCronoprogramma(MyWebEntryPoint w, IMDBObj imdb)
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
  public DefinizioneCronoprogramma()
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
    FormIdx = MyGlb.FRM_DEFINICRONOP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8C6994AD-9F90-4BDD-A0A2-C3FC85C1C4F2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 684;
    DesignHeight = 502;
    set_Caption(new IDVariant("Definizione Cronoprogramma"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 684;
    Frames[1].Height = 476;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0840336;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 684;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Par Sopra";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 40;
    PAN_PARSOPRA = new IDPanel(w, this, 2, "PAN_PARSOPRA");
    Frames[2].Content = PAN_PARSOPRA;
    PAN_PARSOPRA.Lockable = false;
    PAN_PARSOPRA.iLocked = false;
    PAN_PARSOPRA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARSOPRA.VS = MainFrm.VisualStyleList;
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 684-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARSOPRA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "229FDD55-AAC9-4B24-94B1-56F759463005");
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 812, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARSOPRA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARSOPRA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARSOPRA.InitStatus = 1;
    PAN_PARSOPRA_Init();
    PAN_PARSOPRA_InitFields();
    PAN_PARSOPRA_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 684;
    Frames[3].Height = 436;
    Frames[3].Caption = "Cronoprogrammi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 436;
    PAN_CRONOPROGRAM = new IDPanel(w, this, 3, "PAN_CRONOPROGRAM");
    Frames[3].Content = PAN_CRONOPROGRAM;
    PAN_CRONOPROGRAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CRONOPROGRAM.VS = MainFrm.VisualStyleList;
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 684-MyGlb.PAN_OFFS_X, 436-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3EDFA67E-84FA-4BBA-A76C-7CEE40DF6F38");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 640, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CRONOPROGRAM.InitStatus = 2;
    PAN_CRONOPROGRAM_Init();
    PAN_CRONOPROGRAM_InitFields();
    PAN_CRONOPROGRAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARSOPRA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DEFINICRONOP_PARSOPRA1();
      }
      PAN_PARSOPRA.UpdatePanel(MainFrm);
      PAN_CRONOPROGRAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECRONONDEF && flRis && IdxPanelActived == PAN_PARSOPRA.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARSOPRA_ETICSCELCRON) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELOPERCRON && flRis && IdxPanelActived == PAN_CRONOPROGRAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_CRONOPROGRAM_OPERA) {
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
    return (obj instanceof DefinizioneCronoprogramma);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DefinizioneCronoprogramma.class.getName() : (Glb.ClassWithPackage(DefinizioneCronoprogramma.class) ? DefinizioneCronoprogramma.class.getName().substring(DefinizioneCronoprogramma.class.getPackage().getName().length() + 1) : DefinizioneCronoprogramma.class.getName()));
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
      LOAD_PARSOPRADELE();
      PAN_CRONOPROGRAM.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      PAN_CRONOPROGRAM.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "Load", _e);
    }
  }

  // **********************************************************************
  // Par Sopra: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PARSOPRADELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARSOPRA, IMDBDef3.FLD_PARSOPRA_CRONOPROGRAMMA_ID, 0, new IDVariant());
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
      UNLOAD_PARSOPRADELE();
      SQL = new StringBuffer();
      SQL.append("delete from WRK_CRONOPROGRAMMI_DEF ");
      SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      ((Cronoprogrammi)MainFrm.GetForm(MyGlb.FRM_CRONOPROGRAM,0)).PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "Unload", _e);
    }
  }

  // **********************************************************************
  // Par Sopra: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSOPRADELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARSOPRA, IMDBDef3.FLD_PARSOPRA_CRONOPROGRAMMA_ID, 0, new IDVariant());
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECRONONDEF)), true))
        {
          PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_CANCEL);
          SQL = new StringBuffer();
          SQL.append("delete from WRK_CRONOPROGRAMMI_DEF ");
          SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_REQUERY);
          IMDB.set_Value(IMDBDef11.PQRY_PARSOPRA1, IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID, 0, IMDB.Value(IMDBDef7.PQRY_TESTATCRONO2, IMDBDef7.PQSL_TESTATCRONO2_TESTCROCROID, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELOPERCRON)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_OPERA, 0, IMDB.Value(IMDBDef8.PQRY_OPERE3, IMDBDef8.PQSL_OPERE3_CODICE, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Par Sopra On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARSOPRA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARSOPRA);
      // 
      // Par Sopra On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARSOPRA1, IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID, 0)))
      {
        PAN_CRONOPROGRAM.set_Locked((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_CRONOPROGRAM.set_Locked((new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "ParSopraOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Etichetta Scelta Crono
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaCrono ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Crono Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCECRONONDEF, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "EtichettaSceltaCrono", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Cronoprogrammi On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_CRONOPROGRAM_IMPORTO)), true) && FieldWasModified.booleanValue())
      {
        Settatot();
      }
      if (Column.equals((new IDVariant(PFL_CRONOPROGRAM_OPERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_OPERA, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  OPERE A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_OPERA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            S = (new IDVariant("Opera/Progetto inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_OPERA, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "CronoprogrammiOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_CRONOPROGRAM_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi After Find Body
      // Corpo Procedura
      // 
      Settatot();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "CronoprogrammiAfterFind", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        Settatot();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "CronoprogrammiOnCommand", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi Before Insert
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CRONOPROGRAM_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi Before Insert Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_PROGR_SESSIONE, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_PROGR_SESSIONE, 0, new IDVariant(MainFrm.PROGRESESSIO));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_DATA_INSERIMENTO, 0)))
      {
        IMDB.set_Value(IMDBDef11.PQRY_WRKCRONOPDEF, IMDBDef11.PQSL_WRKCRONOPDEF_DATA_INSERIMENTO, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "CronoprogrammiBeforeInsert", _e);
    }
  }

  // **********************************************************************
  // Settatot
  // **********************************************************************
  public int Settatot ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settatot Body
      // Corpo Procedura
      // 
      PAN_CRONOPROGRAM.set_FieldText(PFL_CRONOPROGRAM_ETICHETTATOT, IDL.Format(PAN_CRONOPROGRAM.GetFieldSum(PFL_CRONOPROGRAM_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "Settatot", _e);
      return -1;
    }
  }

  // **********************************************************************
  // PROGETTO
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int PROGETTO ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // PROGETTO Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI487, IMDBDef1.FLD_PARAMETRI487_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELOPERCRON, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "PROGETTO", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CRONOPROGRAM.Status()).equals((new IDVariant(3)), true))
      {
        PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_UPDATE);
      }
      if (new IDVariant(PAN_CRONOPROGRAM.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Confermare prima le modifiche"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARSOPRA1, IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Nessun Cronoprogramma selezionato"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (PAN_CRONOPROGRAM.GetFieldSum(PFL_CRONOPROGRAM_IMPORTO).compareTo(IDL.ToFloat((new IDVariant(PAN_PARSOPRA.FieldText(PFL_PARSOPRA_TESCROIMPATT)))), true)!=0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("L'importo totale non coincide con l'importo del cronoprogramma"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.POADEFINIZIONEPROGETTI(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_PARSOPRA1, IMDBDef11.PQSL_PARSOPRA1_CRONOPROGRAMMA_ID, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IDL.Today());
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DefinizioneCronoprogramma", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Par Sopra
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DEFINICRONOP_PARSOPRA1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARSOPRA1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARSOPRA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARSOPRA, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARSOPRA1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARSOPRA1_RS, 0, IMDBDef3.TBL_PARSOPRA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARSOPRA1_RS, 0, 0, IMDBDef3.TBL_PARSOPRA, IMDBDef3.FLD_PARSOPRA_CRONOPROGRAMMA_ID, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARSOPRA, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARSOPRA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARSOPRA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARSOPRA1_RS, 0);
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
  private void PAN_PARSOPRA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARSOPRA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARSOPRA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARSOPRA, Cancel);
    // Stub
  }

  private void PAN_PARSOPRA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARSOPRA_ETICSCELCRON)
    {
      this.IdxPanelActived = this.PAN_PARSOPRA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaCrono();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARSOPRA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARSOPRA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARSOPRA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CRONOPROGRAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CRONOPROGRAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CRONOPROGRAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CRONOPROGRAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CRONOPROGRAM);
    // Stub
  }

  private void PAN_CRONOPROGRAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CRONOPROGRAM_OPERA)
    {
      this.IdxPanelActived = this.PAN_CRONOPROGRAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      PROGETTO();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CRONOPROGRAM_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_CRONOPROGRAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CRONOPROGRAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CRONOPROGRAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CRONOPROGRAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CRONOPROGRAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARSOPRA_Init()
  {

    PAN_PARSOPRA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARSOPRA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARSOPRA.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARSOPRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, "6475760C-F1C2-4025-AE12-3E91163DB000");
    PAN_PARSOPRA.set_Header(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, "Cronoprogramma Non Def");
    PAN_PARSOPRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, "");
    PAN_PARSOPRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PARSOPRA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_PARSOPRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, "BDC426C8-D629-4C76-9EE0-11CA4F437344");
    PAN_PARSOPRA.set_Header(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, "Cronoprogramma");
    PAN_PARSOPRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, MyGlb.VIS_VUOTONORMALE);
    PAN_PARSOPRA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARSOPRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, "ED426305-9A74-4E71-A8E0-1EFAAD428B82");
    PAN_PARSOPRA.set_Header(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, "");
    PAN_PARSOPRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARSOPRA.SetImage(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, 0, "wsearch.gif", false);
    PAN_PARSOPRA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARSOPRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, "D32F83EE-A8B0-430D-B8BC-D296A982A865");
    PAN_PARSOPRA.set_Header(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, "Esercizio Iscrizione");
    PAN_PARSOPRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, "");
    PAN_PARSOPRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARSOPRA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARSOPRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, "825811A5-036C-4E1F-8054-952FBBF1CFD0");
    PAN_PARSOPRA.set_Header(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, "Progetto");
    PAN_PARSOPRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, "");
    PAN_PARSOPRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARSOPRA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARSOPRA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, "353CAF06-0B1C-49FF-80DC-940705D3C0AE");
    PAN_PARSOPRA.set_Header(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, "Importo");
    PAN_PARSOPRA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, "");
    PAN_PARSOPRA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARSOPRA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARSOPRA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_LIST, 108);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_LIST, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_LIST, "Cronoprogramma Non Def");
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_FORM, 120);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_FORM, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_CRONOPNONDEF, MyGlb.PANEL_FORM, "Cronopr. Non Def");
    PAN_PARSOPRA.SetFieldPage(PFL_PARSOPRA_CRONOPNONDEF, -1, -1);
    PAN_PARSOPRA.SetFieldPanel(PFL_PARSOPRA_CRONOPNONDEF, PPQRY_PARSOPRA1, "A.CRONOPROGRAMMA_ID", "CRONOPROGRAMMA_ID", 3, 10, 0, -13997);
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, MyGlb.PANEL_LIST, 8, 12, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, MyGlb.PANEL_LIST, 0);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, MyGlb.PANEL_LIST, 1);
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, MyGlb.PANEL_FORM, 8, 8, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, MyGlb.PANEL_FORM, 0);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICHECRONOP, MyGlb.PANEL_FORM, 1);
    PAN_PARSOPRA.SetFieldPage(PFL_PARSOPRA_ETICHECRONOP, -1, -1);
    PAN_PARSOPRA.SetFieldPanel(PFL_PARSOPRA_ETICHECRONOP, -1, "", "ETICHECRONOP", 0, 0, 0, -13997);
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, MyGlb.PANEL_LIST, 132, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, MyGlb.PANEL_LIST, 0);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, MyGlb.PANEL_LIST, 1);
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, MyGlb.PANEL_FORM, 132, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, MyGlb.PANEL_FORM, 0);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_ETICSCELCRON, MyGlb.PANEL_FORM, 1);
    PAN_PARSOPRA.SetFieldPage(PFL_PARSOPRA_ETICSCELCRON, -1, -1);
    PAN_PARSOPRA.SetFieldPanel(PFL_PARSOPRA_ETICSCELCRON, -1, "", "ETICSCELCRON", 0, 0, 0, -13997);
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_LIST, 0, 36, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_LIST, 300);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_LIST, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_LIST, "Esercizio Iscrizione");
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_FORM, 156, 8, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_FORM, 120);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_FORM, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROESEISC, MyGlb.PANEL_FORM, "Esercizio Iscrizione");
    PAN_PARSOPRA.SetFieldPage(PFL_PARSOPRA_TESCROESEISC, -1, -1);
    PAN_PARSOPRA.SetFieldPanel(PFL_PARSOPRA_TESCROESEISC, PPQRY_TESTATCRONOP, "A.ESERCIZIO_ISCRIZIONE", "TESCROESEISC", 1, 4, 0, -13997);
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_LIST, 0, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_LIST, 232);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_LIST, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_LIST, "Progetto");
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_FORM, 320, 8, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_FORM, 64);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_FORM, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESTCRONOPER, MyGlb.PANEL_FORM, "Progetto");
    PAN_PARSOPRA.SetFieldPage(PFL_PARSOPRA_TESTCRONOPER, -1, -1);
    PAN_PARSOPRA.SetFieldPanel(PFL_PARSOPRA_TESTCRONOPER, PPQRY_TESTATCRONOP, "A.OPERA", "TESTCRONOPER", 1, 5, 0, -13997);
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_LIST, 0, 36, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_LIST, 280);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_LIST, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_LIST, "Importo");
    PAN_PARSOPRA.SetRect(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_FORM, 464, 8, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARSOPRA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_FORM, 60);
    PAN_PARSOPRA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_FORM, 1);
    PAN_PARSOPRA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARSOPRA_TESCROIMPATT, MyGlb.PANEL_FORM, "Importo");
    PAN_PARSOPRA.SetFieldPage(PFL_PARSOPRA_TESCROIMPATT, -1, -1);
    PAN_PARSOPRA.SetFieldPanel(PFL_PARSOPRA_TESCROIMPATT, PPQRY_TESTATCRONOP, "A.IMPORTO_ATTUALE", "TESCROIMPATT", 3, 14, 2, -13997);
  }

  private void PAN_PARSOPRA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARSOPRA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO_ISCRIZIONE as TESCROESEISC, ");
    SQL.append("  A.OPERA as TESTCRONOPER, ");
    SQL.append("  A.IMPORTO_ATTUALE as TESCROIMPATT ");
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A ");
    SQL.append("where (A.CRONOPROGRAMMA_ID = ~~CRONOPROGRAMMA_ID~~) ");
    PAN_PARSOPRA.SetQuery(PPQRY_TESTATCRONOP, 0, SQL, -1, "");
    PAN_PARSOPRA.SetQueryDB(PPQRY_TESTATCRONOP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARSOPRA.SetMasterTable(PPQRY_TESTATCRONOP, "TESTATE_CRONOPROGRAMMI");
    PAN_PARSOPRA.SetIMDB(IMDB, "PQRY_PARSOPRA1", true);
    PAN_PARSOPRA.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARSOPRA.SetQueryIMDB(PPQRY_PARSOPRA1, IMDBDef11.PQRY_PARSOPRA1_RS, IMDBDef3.TBL_PARSOPRA);
    JustLoaded = true;
    PAN_PARSOPRA.SetFieldPrimaryIndex(PFL_PARSOPRA_CRONOPNONDEF, IMDBDef3.FLD_PARSOPRA_CRONOPROGRAMMA_ID);
    PAN_PARSOPRA.SetMasterTable(0, "PARSOPRA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARSOPRA.Status() == 2)
    {
      int oldListQBE = PAN_PARSOPRA.iUseListQBE;
      PAN_PARSOPRA.iUseListQBE = 0;
      PAN_PARSOPRA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARSOPRA.PanelCommand(Glb.PCM_FIND);
      PAN_PARSOPRA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CRONOPROGRAM_Init()
  {

    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "F2F7E2F7-6825-42C5-9E5D-45FA0CFA0F24");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "Opera/Progetto");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, "19B52394-62A0-4C5F-A260-531F4350B18C");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, "Descrizione");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.VIS_VISULOOUPCF4);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, "CD07B68F-6EDF-4C38-A136-93E4770D2E1A");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, "Importo");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, "2DC6C634-1FD1-4312-863B-7F38729CC09A");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, "Data ins");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, 0, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, "86E971A9-50C0-44EC-9022-B7653A5C3141");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, "PROGR SESSIONE");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.VIS_NONNULLAFIEL);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, 0, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, "C673814A-F4E6-45A1-BD18-1DEF05F69AE3");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, "Elabora");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_CRONOPROGRAM.SetImage(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, 0, "button1.gif", false);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, "5064CF83-9E99-4211-A258-3F4712A15755");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, MyGlb.VIS_DISABIIMPORT);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CRONOPROGRAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, "Opera/Progetto");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, "Op. Prog.");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_OPERA, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_OPERA, PPQRY_WRKCRONOPDEF, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_LIST, 100, 36, 412, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_LIST, 260);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_FORM, 4, 52, 696, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_FORM, 260);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_FORM, 2);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGCRONDESC, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_PROGCRONDESC, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_PROGCRONDESC, PPQRY_PROGETCRONOP, "A.DESCRIZIONE", "PROCROOPEDES", 5, 200, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, 512, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, 4, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_IMPORTO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_IMPORTO, PPQRY_WRKCRONOPDEF, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, 168, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_LIST, "Data ins");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, 4, 52, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, 120);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DATAINSERIME, MyGlb.PANEL_FORM, "Data ins");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DATAINSERIME, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DATAINSERIME, PPQRY_WRKCRONOPDEF, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_LIST, 268, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_LIST, 104);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_LIST, "PROGR SESSIONE");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_FORM, 104);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGRSESSION, MyGlb.PANEL_FORM, "PROGR SESSIONE");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_PROGRSESSION, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_PROGRSESSION, PPQRY_WRKCRONOPDEF, "A.PROGR_SESSIONE", "PROGR_SESSIONE", 3, 10, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, MyGlb.PANEL_LIST, 548, 284, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, MyGlb.PANEL_FORM, 400, 292, 120, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ETICHEELABOR, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, MyGlb.PANEL_LIST, 512, 240, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, MyGlb.PANEL_LIST, 0);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, MyGlb.PANEL_FORM, 480, 244, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, MyGlb.PANEL_FORM, 0);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ETICHETTATOT, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ETICHETTATOT, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ETICHETTATOT, -1, "", "ETICHETTATOT", 0, 0, 0, -13997);
    PAN_CRONOPROGRAM.set_Alignment(PFL_CRONOPROGRAM_ETICHETTATOT, 4);
  }

  private void PAN_CRONOPROGRAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PROCROOPEDES ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_PROGETCRONOP, 0, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_PROGETCRONOP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(PPQRY_PROGETCRONOP, "OPERE");
    PAN_CRONOPROGRAM.SetIMDB(IMDB, "PQRY_WRKCRONOPDEF", true);
    PAN_CRONOPROGRAM.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.PROGR_SESSIONE as PROGR_SESSIONE ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_WRKCRONOPDEF, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_CRONOPROGRAMMI_DEF A ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_WRKCRONOPDEF, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_WRKCRONOPDEF, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetQuery(PPQRY_WRKCRONOPDEF, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetQuery(PPQRY_WRKCRONOPDEF, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetQuery(PPQRY_WRKCRONOPDEF, 5, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_WRKCRONOPDEF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(0, "WRK_CRONOPROGRAMMI_DEF");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CRONOPROGRAM.Status() == 2)
    {
      int oldListQBE = PAN_CRONOPROGRAM.iUseListQBE;
      PAN_CRONOPROGRAM.iUseListQBE = 0;
      PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_FIND);
      PAN_CRONOPROGRAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARSOPRA) PAN_PARSOPRA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARSOPRA) PAN_PARSOPRA_ValidateRow(Cancel);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARSOPRA) PAN_PARSOPRA_DynamicProperties();
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARSOPRA) PAN_PARSOPRA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_BeforeInsert(Cancel);
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
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARSOPRA) PAN_PARSOPRA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
