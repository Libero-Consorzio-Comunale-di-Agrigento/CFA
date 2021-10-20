// **********************************************
// Impegno Automatico Disponibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImpegnoAutomaticoDisponibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRIPANEL_TITOLO = 0;
  private static int PFL_FILTRIPANEL_INTERVENTO = 1;
  private static int PFL_FILTRIPANEL_CAPITOINFORM = 2;

  private static int PPQRY_FILTRI4 = 0;

  private static int PPQRY_TITOLI = 1;
  private static int PPQRY_INTERVENTI = 2;
  private static int PPQRY_CAPTER = 3;


  IDPanel PAN_FILTRIPANEL;
  private static int PFL_IMPEAUTODISP_CAPITOLO = 0;
  private static int PFL_IMPEAUTODISP_ARTICOLO = 1;
  private static int PFL_IMPEAUTODISP_STANZIAMENTO = 2;
  private static int PFL_IMPEAUTODISP_IMPEGNABILE = 3;
  private static int PFL_IMPEAUTODISP_DISPONIBILIT = 4;
  private static int PFL_IMPEAUTODISP_IMPEGNATO = 5;
  private static int PFL_IMPEAUTODISP_CAPITOLOART = 6;

  private static int PPQRY_CAP10 = 0;


  IDPanel PAN_IMPEAUTODISP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRI7(IMDB);
    //
    //
    Init_PQRY_FILTRI4(IMDB);
    Init_PQRY_FILTRI4_RS(IMDB);
    Init_PQRY_CAP10(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRI7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_FILTRI7, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_FILTRI7, "TBL_FILTRI7");
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI7,IMDBDef4.FLD_FILTRI7_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI7,IMDBDef4.FLD_FILTRI7_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI7,IMDBDef4.FLD_FILTRI7_INTERVENTO, "INTERVENTO");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI7,IMDBDef4.FLD_FILTRI7_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_FILTRI7,IMDBDef4.FLD_FILTRI7_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef4.TBL_FILTRI7,IMDBDef4.FLD_FILTRI7_CAPITOLO,1,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_FILTRI7, 0);
  }

  private static void Init_PQRY_FILTRI4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_FILTRI4, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_FILTRI4, "PQRY_FILTRI4");
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI4,IMDBDef13.PQSL_FILTRI4_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI4,IMDBDef13.PQSL_FILTRI4_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI4,IMDBDef13.PQSL_FILTRI4_INTERVENTO, "INTERVENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI4,IMDBDef13.PQSL_FILTRI4_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI4,IMDBDef13.PQSL_FILTRI4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI4,IMDBDef13.PQSL_FILTRI4_CAPITOLO,1,2,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_FILTRI4, 0);
  }

  private static void Init_PQRY_FILTRI4_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_FILTRI4_RS, 3);
    IMDB.set_TblCode(IMDBDef13.PQRY_FILTRI4_RS, "PQRY_FILTRI4_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI4_RS,IMDBDef13.PQSL_FILTRI4_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI4_RS,IMDBDef13.PQSL_FILTRI4_TITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI4_RS,IMDBDef13.PQSL_FILTRI4_INTERVENTO, "INTERVENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI4_RS,IMDBDef13.PQSL_FILTRI4_INTERVENTO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_FILTRI4_RS,IMDBDef13.PQSL_FILTRI4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_FILTRI4_RS,IMDBDef13.PQSL_FILTRI4_CAPITOLO,1,2,0);
  }

  private static void Init_PQRY_CAP10(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_CAP10, 6);
    IMDB.set_TblCode(IMDBDef13.PQRY_CAP10, "PQRY_CAP10");
    IMDB.set_FldCode(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDSTANZI, "RECORDSTANZI");
    IMDB.SetFldParams(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDSTANZI,3,28,6);
    IMDB.set_FldCode(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDIMPEG1, "RECORDIMPEG1");
    IMDB.SetFldParams(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDIMPEG1,2,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDIMPEGN,2,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDDISPON, "RECORDDISPON");
    IMDB.SetFldParams(IMDBDef13.PQRY_CAP10,IMDBDef13.PQSL_CAP10_RECORDDISPON,3,28,6);
    IMDB.TblAddNew(IMDBDef13.PQRY_CAP10, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImpegnoAutomaticoDisponibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImpegnoAutomaticoDisponibilita()
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
    FormIdx = MyGlb.FRM_IMPEAUTODISP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "EDF9B7E1-0102-44EB-807D-3274E49D9851";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 684;
    DesignHeight = 442;
    set_Caption(new IDVariant("Impegno Automatico Disponibilita"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 684;
    Frames[1].Height = 416;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.230769;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 684;
    Frames[2].Height = 96;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri Panel";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 96;
    PAN_FILTRIPANEL = new IDPanel(w, this, 2, "PAN_FILTRIPANEL");
    Frames[2].Content = PAN_FILTRIPANEL;
    PAN_FILTRIPANEL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRIPANEL.VS = MainFrm.VisualStyleList;
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 684-MyGlb.PAN_OFFS_X, 96-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0AA58134-FA25-458B-BB96-92CFB456AED2");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 180, 104, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRIPANEL.InitStatus = 2;
    PAN_FILTRIPANEL_Init();
    PAN_FILTRIPANEL_InitFields();
    PAN_FILTRIPANEL_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 684;
    Frames[3].Height = 320;
    Frames[3].Caption = "Impegno Automatico Disponibilità";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 320;
    PAN_IMPEAUTODISP = new IDPanel(w, this, 3, "PAN_IMPEAUTODISP");
    Frames[3].Content = PAN_IMPEAUTODISP;
    PAN_IMPEAUTODISP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPEAUTODISP.VS = MainFrm.VisualStyleList;
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 684-MyGlb.PAN_OFFS_X, 320-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5899DEB6-3A4F-4C48-8E74-AF38288A22AF");
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 484, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPEAUTODISP.InitStatus = 1;
    PAN_IMPEAUTODISP_Init();
    PAN_IMPEAUTODISP_InitFields();
    PAN_IMPEAUTODISP_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI74+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG119+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI74+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSIIMPEGN+BaseCmdLinIdx)
      {
        ApriEmissioneImpegni();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef4.TBL_FILTRI7, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        IMPEAUTODISP_FILTRI4();
      }
      PAN_FILTRIPANEL.UpdatePanel(MainFrm);
      PAN_IMPEAUTODISP.UpdatePanel(MainFrm);
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
    return (obj instanceof ImpegnoAutomaticoDisponibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImpegnoAutomaticoDisponibilita.class.getName() : (Glb.ClassWithPackage(ImpegnoAutomaticoDisponibilita.class) ? ImpegnoAutomaticoDisponibilita.class.getName().substring(ImpegnoAutomaticoDisponibilita.class.getPackage().getName().length() + 1) : ImpegnoAutomaticoDisponibilita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Filtri Panel On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRIPANEL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRIPANEL);
      // 
      // Filtri Panel On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_FILTRI4, IMDBDef13.PQSL_FILTRI4_TITOLO, 0).equals((new IDVariant(4)), true))
      {
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "FiltriPanelOnDynamicPropertiesEvent", _e);
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
      Settacaption();
      SettoValoriDefault();
      PAN_IMPEAUTODISP.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_IMPEAUTODISP.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_IMPEAUTODISP.Freezed = (new IDVariant(-1)).booleanValue();
      PAN_IMPEAUTODISP.set_ActiveMultipleSel((new IDVariant(-1)).booleanValue());
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      IMDB.set_Value(IMDBDef4.TBL_FILTRI7, IMDBDef4.FLD_FILTRI7_INTERVENTO, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef4.TBL_FILTRI7, IMDBDef4.FLD_FILTRI7_CAPITOLO, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno Automatico Disponibilità On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_IMPEAUTODISP_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegno Automatico Disponibilità On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_IMPEAUTODISP.Freezed = (new IDVariant(0)).booleanValue();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_IMPEAUTODISP.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "ImpegnoAutomaticoDisponibilitàOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Emissione Impegni
  // **********************************************************************
  public int ApriEmissioneImpegni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Emissione Impegni Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_EMISSIIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "ApriEmissioneImpegni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // numeroDel - Input
  // AnnoDel - Input
  // SedeDel - Input
  // Numeroprop:  - Input
  // Annoprop:  - Input
  // unita prop - Input
  // descrizione - Input
  // data reg - Input
  // imp obbl - Input
  // **********************************************************************
  public int Elabora (IDVariant numeroDel, IDVariant AnnoDel, IDVariant SedeDel, IDVariant Numeroprop, IDVariant Annoprop, IDVariant unitaprop, IDVariant descrizione, IDVariant datareg, IDVariant impobbl)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_COUNTER = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_OUTMESSAGE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_OUTMESSAG2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PRIMNUMIMPDA = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ULTIMNUMIMPA = new IDVariant(0,IDVariant.INTEGER);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      v_PRIMNUMIMPDA = (new IDVariant());
      MainFrm.Cf4armDBObject.BeginTrans();
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      C2 = PAN_IMPEAUTODISP.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_IMPEAUTODISP.GotoFirst();
      while (!PAN_IMPEAUTODISP.RSEOF())
      {
        IDVariant v_MYNUMIMPDA = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_MYNUMIMPA = new IDVariant(0,IDVariant.INTEGER);
        v_COUNTER = IDL.Add(v_COUNTER, (new IDVariant(1)));
        if (PAN_IMPEAUTODISP.IsRowSelected(v_COUNTER.intValue()))
        {
          MainFrm.Cf4armDBObject.IMPAUTODISPONIBILITA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), C2.Get("CAPITOLO"), C2.Get("ARTICOLO"), numeroDel, AnnoDel, SedeDel, Numeroprop, Annoprop, unitaprop, descrizione, datareg, impobbl, v_MYNUMIMPDA, v_MYNUMIMPA);
          if (IDL.IsNull(v_PRIMNUMIMPDA))
          {
            v_PRIMNUMIMPDA = new IDVariant(v_MYNUMIMPDA);
          }
          v_ULTIMNUMIMPA = new IDVariant(v_MYNUMIMPA);
        }
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          MainFrm.Cf4armDBObject.RollbackTrans();
          return 0;
        }
        PAN_IMPEAUTODISP.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      // 
      // messaggio di out
      // 
      {
        v_OUTMESSAG2 = IDL.Add(IDL.Add((new IDVariant("a n.")), (new IDVariant(" "))), IDL.ToString(v_ULTIMNUMIMPA));
        v_OUTMESSAGE = IDL.Add(IDL.Add(IDL.Add((new IDVariant("Emessi Impegni da ")), IDL.ToString(v_PRIMNUMIMPDA)), (new IDVariant(" "))), v_OUTMESSAG2);
        MainFrm.set_AlertMessage(v_OUTMESSAGE); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri Panel Titolo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_FILTRIPANEL_TITOLO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri Panel Titolo Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_FILTRI4, IMDBDef13.PQSL_FILTRI4_TITOLO, 0).equals((new IDVariant(4)), true))
      {
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        InizializzoCapitoloInformazioniFilter();
      }
      else
      {
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRIPANEL.SetFlags (Glb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        InizializzoInterventoFilter();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "FiltriPanelTitoloValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Inizializzo Capitolo Informazioni Filter
  // **********************************************************************
  public int InizializzoCapitoloInformazioniFilter ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inizializzo Capitolo Informazioni Filter Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef13.PQRY_FILTRI4, IMDBDef13.PQSL_FILTRI4_INTERVENTO, 0, (new IDVariant(0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "InizializzoCapitoloInformazioniFilter", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Inizializzo Intervento Filter
  // **********************************************************************
  public int InizializzoInterventoFilter ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Inizializzo Intervento Filter Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef13.PQRY_FILTRI4, IMDBDef13.PQSL_FILTRI4_CAPITOLO, 0, (new IDVariant(0)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "InizializzoInterventoFilter", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settacaption
  // **********************************************************************
  public int Settacaption ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Impegno Automatico Disponibilità", IDVariant.STRING));
      // 
      // Settacaption Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "Settacaption", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Inizializzo Titolo Filter
  // **********************************************************************
  public int InizializzoTitoloFilter ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_FIRSTTITOLO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Inizializzo Titolo Filter Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.TITOLO) as MINTITOLTITO ");
      SQL.append("from ");
      SQL.append("  TITOLI A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_FIRSTTITOLO = QV.Get("MINTITOLTITO", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef4.TBL_FILTRI7, IMDBDef4.FLD_FILTRI7_TITOLO, 0, new IDVariant(v_FIRSTTITOLO));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "InizializzoTitoloFilter", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setto Valori Default
  // **********************************************************************
  public int SettoValoriDefault ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setto Valori Default Body
      // Procedure Body
      // 
      InizializzoTitoloFilter();
      InizializzoInterventoFilter();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegnoAutomaticoDisponibilita", "SettoValoriDefault", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri
  // Primary record source for panel data
  // **********************************************************************
  private void IMPEAUTODISP_FILTRI4() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_FILTRI4_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRI7, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_FILTRI7, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_FILTRI4_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_FILTRI4_RS, 0, IMDBDef4.TBL_FILTRI7, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI4_RS, 0, 0, IMDBDef4.TBL_FILTRI7, IMDBDef4.FLD_FILTRI7_TITOLO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI4_RS, 1, 0, IMDBDef4.TBL_FILTRI7, IMDBDef4.FLD_FILTRI7_INTERVENTO, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_FILTRI4_RS, 2, 0, IMDBDef4.TBL_FILTRI7, IMDBDef4.FLD_FILTRI7_CAPITOLO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_FILTRI7, 0);
      if (IMDB.Eof(IMDBDef4.TBL_FILTRI7, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_FILTRI7, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_FILTRI4_RS, 0);
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
  private void PAN_FILTRIPANEL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRIPANEL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRIPANEL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRIPANEL, Cancel);
    // Stub
  }

  private void PAN_FILTRIPANEL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRIPANEL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_FILTRIPANEL_TITOLO)
      {
        PFL_FILTRIPANEL_TITOLO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRIPANEL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRIPANEL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_IMPEAUTODISP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPEAUTODISP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPEAUTODISP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPEAUTODISP, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPEAUTODISP_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPEAUTODISP);
    // Stub
  }

  private void PAN_IMPEAUTODISP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPEAUTODISP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_IMPEAUTODISP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPEAUTODISP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FILTRIPANEL_Init()
  {

    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, "2C23466C-5996-4CAD-9571-85B16F611AE5");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, "Titolo");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, "51042833-7300-47D5-AE1B-0E35DFD570E9");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, "Intervento");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
    PAN_FILTRIPANEL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, "604D77AD-9F10-48DF-BD09-C75DF53B37FC");
    PAN_FILTRIPANEL.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, "Capitoli Informazioni");
    PAN_FILTRIPANEL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, "");
    PAN_FILTRIPANEL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRIPANEL.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_FILTRIPANEL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_LIST, 48);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_FORM, 92, 16, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_FORM, 48);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_TITOLO, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_TITOLO, PPQRY_FILTRI4, "A.TITOLO", "TITOLO", 1, 2, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_LIST, 48, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_LIST, 72);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_LIST, "Intervento");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_FORM, 52, 40, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_FORM, 88);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_INTERVENTO, MyGlb.PANEL_FORM, "Intervento");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_INTERVENTO, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_INTERVENTO, PPQRY_FILTRI4, "A.INTERVENTO", "INTERVENTO", 1, 2, 0, -13997);
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_LIST, 60);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_LIST, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_LIST, "Capit. Inform.");
    PAN_FILTRIPANEL.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_FORM, 4, 40, 468, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRIPANEL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_FORM, 136);
    PAN_FILTRIPANEL.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_FORM, 1);
    PAN_FILTRIPANEL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRIPANEL_CAPITOINFORM, MyGlb.PANEL_FORM, "Capitoli Informazioni");
    PAN_FILTRIPANEL.SetFieldPage(PFL_FILTRIPANEL_CAPITOINFORM, -1, -1);
    PAN_FILTRIPANEL.SetFieldPanel(PFL_FILTRIPANEL_CAPITOINFORM, PPQRY_FILTRI4, "A.CAPITOLO", "CAPITOLO", 1, 2, 0, -13997);
  }

  private void PAN_FILTRIPANEL_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRIPANEL.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.TITOLO = ~~TITOLO~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_FILTRIPANEL.SetQuery(PPQRY_TITOLI, 0, SQL, PFL_FILTRIPANEL_TITOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TITOLO as TITOLITITOLO, ");
    SQL.append("  TO_CHAR ( A.TITOLO ) || ' - ' || A.DESCRIZIONE as TITOLNEWEXPR ");
    SQL.append("from ");
    SQL.append("  TITOLI A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("order by ");
    SQL.append("  A.TITOLO ");
    PAN_FILTRIPANEL.SetQuery(PPQRY_TITOLI, 1, SQL, PFL_FILTRIPANEL_TITOLO, "");
    PAN_FILTRIPANEL.SetQueryDB(PPQRY_TITOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INTERVENTO as INTERVINTERV, ");
    SQL.append("  TO_CHAR ( A.INTERVENTO ) || ' - ' || A.DESCRIZIONE as INTERNEWEXPR ");
    SQL.append("from ");
    SQL.append("  INTERVENTI A ");
    SQL.append("where (A.INTERVENTO = ~~INTERVENTO~~) ");
    SQL.append("and   (A.TITOLO = ~~TITOLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~INTERVENTO~~ = 0) ");
    SQL.append("order by 1 ");
    PAN_FILTRIPANEL.SetQuery(PPQRY_INTERVENTI, 0, SQL, PFL_FILTRIPANEL_INTERVENTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.INTERVENTO as INTERVINTERV, ");
    SQL.append("  TO_CHAR ( A.INTERVENTO ) || ' - ' || A.DESCRIZIONE as INTERNEWEXPR ");
    SQL.append("from ");
    SQL.append("  INTERVENTI A ");
    SQL.append("where (A.TITOLO = ~~TITOLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_FILTRIPANEL.SetQuery(PPQRY_INTERVENTI, 1, SQL, PFL_FILTRIPANEL_INTERVENTO, "");
    PAN_FILTRIPANEL.SetQueryDB(PPQRY_INTERVENTI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPTERCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as CAPTDESCEXPR ");
    SQL.append("from ");
    SQL.append("  CAPTER A ");
    SQL.append("where (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~CAPITOLO~~ = 0) ");
    SQL.append("order by 1 ");
    PAN_FILTRIPANEL.SetQuery(PPQRY_CAPTER, 0, SQL, PFL_FILTRIPANEL_CAPITOINFORM, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPTERCAPITO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' - ' || A.DESCRIZIONE as CAPTDESCEXPR ");
    SQL.append("from ");
    SQL.append("  CAPTER A ");
    SQL.append("where (A.E_S = 'S') ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  0, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_FILTRIPANEL.SetQuery(PPQRY_CAPTER, 1, SQL, PFL_FILTRIPANEL_CAPITOINFORM, "");
    PAN_FILTRIPANEL.SetQueryDB(PPQRY_CAPTER, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRIPANEL.SetIMDB(IMDB, "PQRY_FILTRI4", true);
    PAN_FILTRIPANEL.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTRIPANEL.SetQueryIMDB(PPQRY_FILTRI4, IMDBDef13.PQRY_FILTRI4_RS, IMDBDef4.TBL_FILTRI7);
    JustLoaded = true;
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_TITOLO, IMDBDef4.FLD_FILTRI7_TITOLO);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_INTERVENTO, IMDBDef4.FLD_FILTRI7_INTERVENTO);
    PAN_FILTRIPANEL.SetFieldPrimaryIndex(PFL_FILTRIPANEL_CAPITOINFORM, IMDBDef4.FLD_FILTRI7_CAPITOLO);
    PAN_FILTRIPANEL.SetMasterTable(0, "FILTRI7");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRIPANEL.Status() == 2)
    {
      int oldListQBE = PAN_FILTRIPANEL.iUseListQBE;
      PAN_FILTRIPANEL.iUseListQBE = 0;
      PAN_FILTRIPANEL.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRIPANEL.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRIPANEL.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_IMPEAUTODISP_Init()
  {

    PAN_IMPEAUTODISP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPEAUTODISP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPEAUTODISP.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, "75BAAA23-3195-460E-9163-36B551848114");
    PAN_IMPEAUTODISP.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, "CAPITOLO");
    PAN_IMPEAUTODISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, "");
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, "0791E02B-C5E8-4AB9-B93A-97DB7C9E6597");
    PAN_IMPEAUTODISP.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, "ARTICOLO");
    PAN_IMPEAUTODISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, "");
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, "3CD1F4E7-0CFD-46E4-BF64-73D7590A8015");
    PAN_IMPEAUTODISP.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, "Stanziamento");
    PAN_IMPEAUTODISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, "BIL STN INI CO + BIL VARIAZIONI CO");
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, "92F8D31A-1F24-4115-97F0-A311C2C3C995");
    PAN_IMPEAUTODISP.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, "Impegnabile");
    PAN_IMPEAUTODISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, "If (Cfid Gestione Delibere, Null Value (BIL IMPEGNABILE, To Float (ZERO)) + Null Value (BIL VAR IMPEGNABILE, To Float (ZERO)), ZERO)");
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, "43E5F278-1C5E-4B1E-BD0C-BD7249E02FC6");
    PAN_IMPEAUTODISP.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, "Disponibilità");
    PAN_IMPEAUTODISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, "Null Value (BIL DISPONIBILITA, ZERO)");
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, "3B161DBD-D429-4107-ABDE-CCBF3CF1AEEA");
    PAN_IMPEAUTODISP.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, "Impegnato");
    PAN_IMPEAUTODISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, "If (Cfid Gestione Delibere, (Null Value (BIL IMPEGNABILE, To Float (ZERO)) + Null Value (BIL VAR IMPEGNABILE, To Float (ZERO)) - BIL DISPONIBILITA), (BIL STN INI CO + BIL VARIAZIONI CO - BIL DISPONIBILITA))");
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEAUTODISP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, "1D927C56-AAF1-4421-87F7-8F804C64E457");
    PAN_IMPEAUTODISP.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, "Capitolo/Art.");
    PAN_IMPEAUTODISP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, "Capitolo/Art.");
    PAN_IMPEAUTODISP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, MyGlb.VIS_LABEVISUSTYL);
    PAN_IMPEAUTODISP.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_IMPEAUTODISP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_FORM, 4, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_IMPEAUTODISP.SetFieldPage(PFL_IMPEAUTODISP_CAPITOLO, -1, -1);
    PAN_IMPEAUTODISP.SetFieldPanel(PFL_IMPEAUTODISP_CAPITOLO, PPQRY_CAP10, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_FORM, 4, 52, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_IMPEAUTODISP.SetFieldPage(PFL_IMPEAUTODISP_ARTICOLO, -1, -1);
    PAN_IMPEAUTODISP.SetFieldPanel(PFL_IMPEAUTODISP_ARTICOLO, PPQRY_CAP10, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_LIST, 124, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_LIST, 76);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_LIST, "Stanziamento");
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_FORM, 4, 76, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_FORM, 2);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_STANZIAMENTO, MyGlb.PANEL_FORM, "Stanziam.");
    PAN_IMPEAUTODISP.SetFieldPage(PFL_IMPEAUTODISP_STANZIAMENTO, -1, -1);
    PAN_IMPEAUTODISP.SetFieldUnbound(PFL_IMPEAUTODISP_STANZIAMENTO, true);
    PAN_IMPEAUTODISP.SetFieldPanel(PFL_IMPEAUTODISP_STANZIAMENTO, PPQRY_CAP10, "B.STN_INI_CO + B.VARIAZIONI_CO", "RECORDSTANZI", 3, 28, 6, -13997);
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_LIST, 244, 36, 120, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_LIST, 68);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_LIST, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_LIST, "Impegnabile");
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_FORM, 4, 124, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_FORM, 68);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_FORM, 2);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNABILE, MyGlb.PANEL_FORM, "Impegn.");
    PAN_IMPEAUTODISP.SetFieldPage(PFL_IMPEAUTODISP_IMPEGNABILE, -1, -1);
    PAN_IMPEAUTODISP.SetFieldUnbound(PFL_IMPEAUTODISP_IMPEGNABILE, true);
    PAN_IMPEAUTODISP.SetFieldPanel(PFL_IMPEAUTODISP_IMPEGNABILE, PPQRY_CAP10, "CASE WHEN " + IDL.CSql(MainFrm.GESTIODELIBE, IDL.FMT_BOOL, MainFrm.Cf4armDBObject.DBO()) + " THEN NVL(B.IMPEGNABILE, TO_NUMBER(0)) + NVL(B.VAR_IMPEGNABILE, TO_NUMBER(0)) ELSE 0 END", "RECORDIMPEG1", 2, 19, 0, -13997);
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_LIST, 364, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_LIST, 64);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 196, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_FORM, 64);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_DISPONIBILIT, MyGlb.PANEL_FORM, "Dispon.");
    PAN_IMPEAUTODISP.SetFieldPage(PFL_IMPEAUTODISP_DISPONIBILIT, -1, -1);
    PAN_IMPEAUTODISP.SetFieldUnbound(PFL_IMPEAUTODISP_DISPONIBILIT, true);
    PAN_IMPEAUTODISP.SetFieldPanel(PFL_IMPEAUTODISP_DISPONIBILIT, PPQRY_CAP10, "NVL(B.DISPONIBILITA, 0)", "RECORDDISPON", 3, 28, 6, -13997);
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_LIST, 60);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_LIST, "Impegnato");
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_FORM, 4, 220, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_FORM, 60);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEAUTODISP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_IMPEGNATO, MyGlb.PANEL_FORM, "Impeg.");
    PAN_IMPEAUTODISP.SetFieldPage(PFL_IMPEAUTODISP_IMPEGNATO, -1, -1);
    PAN_IMPEAUTODISP.SetFieldUnbound(PFL_IMPEAUTODISP_IMPEGNATO, true);
    PAN_IMPEAUTODISP.SetFieldPanel(PFL_IMPEAUTODISP_IMPEGNATO, PPQRY_CAP10, "CASE WHEN " + IDL.CSql(MainFrm.GESTIODELIBE, IDL.FMT_BOOL, MainFrm.Cf4armDBObject.DBO()) + " THEN (NVL(B.IMPEGNABILE, TO_NUMBER(0)) + NVL(B.VAR_IMPEGNABILE, TO_NUMBER(0)) - B.DISPONIBILITA) ELSE (B.STN_INI_CO + B.VARIAZIONI_CO - B.DISPONIBILITA) END", "RECORDIMPEGN", 2, 19, 0, -13997);
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, MyGlb.PANEL_LIST, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, MyGlb.PANEL_LIST, 0);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, MyGlb.PANEL_LIST, 2);
    PAN_IMPEAUTODISP.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, MyGlb.PANEL_FORM, 12, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEAUTODISP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, MyGlb.PANEL_FORM, 0);
    PAN_IMPEAUTODISP.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEAUTODISP_CAPITOLOART, MyGlb.PANEL_FORM, 1);
    PAN_IMPEAUTODISP.SetFieldPage(PFL_IMPEAUTODISP_CAPITOLOART, -1, -1);
    PAN_IMPEAUTODISP.SetFieldPanel(PFL_IMPEAUTODISP_CAPITOLOART, -1, "", "CAPITOLOART", 0, 0, 0, -13997);
  }

  private void PAN_IMPEAUTODISP_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPEAUTODISP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPEAUTODISP.SetIMDB(IMDB, "PQRY_CAP10", true);
    PAN_IMPEAUTODISP.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.STN_INI_CO + B.VARIAZIONI_CO as RECORDSTANZI, ");
    SQL.append("  CASE WHEN " + IDL.CSql(MainFrm.GESTIODELIBE, IDL.FMT_BOOL, MainFrm.Cf4armDBObject.DBO()) + " THEN NVL(B.IMPEGNABILE, TO_NUMBER(0)) + NVL(B.VAR_IMPEGNABILE, TO_NUMBER(0)) ELSE 0 END as RECORDIMPEG1, ");
    SQL.append("  CASE WHEN " + IDL.CSql(MainFrm.GESTIODELIBE, IDL.FMT_BOOL, MainFrm.Cf4armDBObject.DBO()) + " THEN (NVL(B.IMPEGNABILE, TO_NUMBER(0)) + NVL(B.VAR_IMPEGNABILE, TO_NUMBER(0)) - B.DISPONIBILITA) ELSE (B.STN_INI_CO + B.VARIAZIONI_CO - B.DISPONIBILITA) END as RECORDIMPEGN, ");
    SQL.append("  NVL(B.DISPONIBILITA, 0) as RECORDDISPON ");
    PAN_IMPEAUTODISP.SetQuery(PPQRY_CAP10, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  BIL B ");
    PAN_IMPEAUTODISP.SetQuery(PPQRY_CAP10, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = B.ESERCIZIO) ");
    SQL.append("and   (A.E_S = B.E_S) ");
    SQL.append("and   (A.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (A.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (B.DISPONIBILITA > 0) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_IMPEAUTODISP.SetQuery(PPQRY_CAP10, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEAUTODISP.SetQuery(PPQRY_CAP10, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEAUTODISP.SetQuery(PPQRY_CAP10, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_IMPEAUTODISP.SetQuery(PPQRY_CAP10, 5, SQL, -1, "");
    PAN_IMPEAUTODISP.SetQueryDB(PPQRY_CAP10, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEAUTODISP.SetMasterTable(0, "CAP");
    PAN_IMPEAUTODISP.AddToSortList(PFL_IMPEAUTODISP_CAPITOLO, true);
    PAN_IMPEAUTODISP.AddToSortList(PFL_IMPEAUTODISP_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPEAUTODISP.Status() == 2)
    {
      int oldListQBE = PAN_IMPEAUTODISP.iUseListQBE;
      PAN_IMPEAUTODISP.iUseListQBE = 0;
      PAN_IMPEAUTODISP.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPEAUTODISP.PanelCommand(Glb.PCM_FIND);
      PAN_IMPEAUTODISP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_IMPEAUTODISP) PAN_IMPEAUTODISP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_ValidateRow(Cancel);
    if (SrcObj == PAN_IMPEAUTODISP) PAN_IMPEAUTODISP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_DynamicProperties();
    if (SrcObj == PAN_IMPEAUTODISP) PAN_IMPEAUTODISP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_IMPEAUTODISP) PAN_IMPEAUTODISP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPEAUTODISP) PAN_IMPEAUTODISP_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_FILTRIPANEL) PAN_FILTRIPANEL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_IMPEAUTODISP) PAN_IMPEAUTODISP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
