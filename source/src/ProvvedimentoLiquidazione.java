// **********************************************
// Provvedimento Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProvvedimentoLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMESTAMPA_DATAPROTOCOL = 0;
  private static int GRP_PARAMESTAMPA_PROVVEDIMENT = 1;

  private static int PFL_PARAMESTAMPA_ESERCIZIO = 0;
  private static int PFL_PARAMESTAMPA_TIPOUTENZA = 1;
  private static int PFL_PARAMESTAMPA_ELABORBUTTON = 2;
  private static int PFL_PARAMESTAMPA_TIPIUTENDESC = 3;
  private static int PFL_PARAMESTAMPA_DATAELABORAZ = 4;
  private static int PFL_PARAMESTAMPA_DELIBERA = 5;
  private static int PFL_PARAMESTAMPA_NUMERODELIBE = 6;
  private static int PFL_PARAMESTAMPA_ANNODELIBERA = 7;
  private static int PFL_PARAMESTAMPA_NEWPANELLABE = 8;
  private static int PFL_PARAMESTAMPA_TRATTINO = 9;
  private static int PFL_PARAMESTAMPA_SLASH = 10;
  private static int PFL_PARAMESTAMPA_INFOBUTTO = 11;
  private static int PFL_PARAMESTAMPA_APRIBUTTON = 12;

  private static int PPQRY_PARAMESTAMP6 = 0;

  private static int PPQRY_TIPIUTENZA = 1;

  private static int PPQRY_TIPIUTENZA1 = 2;


  IDPanel PAN_PARAMESTAMPA;

  // Definition of Global Variables
  private IDVariant TIPOUTENDEFA = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAMP9(IMDB);
    //
    //
    Init_PQRY_PARAMESTAMP6(IMDB);
    Init_PQRY_PARAMESTAMP6_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAMP9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMESTAMP9, 10);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMESTAMP9, "TBL_PARAMESTAMP9");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMENUMER,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMANNDE1, "ROWNAMANNDE1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMANNDE1,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMSEDDEL,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAMP9,IMDBDef2.FLD_PARAMESTAMP9_ROWNAMANNDEL,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMESTAMP9, 0);
  }

  private static void Init_PQRY_PARAMESTAMP6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAMP6, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAMP6, "PQRY_PARAMESTAMP6");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL,1,4,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAMP6, 0);
  }

  private static void Init_PQRY_PARAMESTAMP6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 7);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAMP6_RS, "PQRY_PARAMESTAMP6_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB,5,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAMP6_RS,IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProvvedimentoLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProvvedimentoLiquidazione()
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
    FormIdx = MyGlb.FRM_PROVVELIQUID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6678C57D-52F5-49DC-9819-8FC714F46D51";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 324;
    DesignHeight = 206;
    set_Caption(new IDVariant("Provvedimento Liquidazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 324;
    Frames[1].Height = 180;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Stampa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 180;
    PAN_PARAMESTAMPA = new IDPanel(w, this, 1, "PAN_PARAMESTAMPA");
    Frames[1].Content = PAN_PARAMESTAMPA;
    PAN_PARAMESTAMPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESTAMPA.VS = MainFrm.VisualStyleList;
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 324-MyGlb.PAN_OFFS_X, 180-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "440F96EF-ACEE-4672-A1C8-AD0E45ED89BF");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1144, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESTAMPA.InitStatus = 1;
    PAN_PARAMESTAMPA_Init();
    PAN_PARAMESTAMPA_InitFields();
    PAN_PARAMESTAMPA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMESTAMP9, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PROVVELIQUID_PARAMESTAMP6();
      }
      PAN_PARAMESTAMPA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMESTAMPA.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMESTAMPA_APRIBUTTON) {
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
    return (obj instanceof ProvvedimentoLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProvvedimentoLiquidazione.class.getName() : (Glb.ClassWithPackage(ProvvedimentoLiquidazione.class) ? ProvvedimentoLiquidazione.class.getName().substring(ProvvedimentoLiquidazione.class.getPackage().getName().length() + 1) : ProvvedimentoLiquidazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Stampa On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMESTAMPA_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMESTAMPA, Cancel);
      // 
      // Parametri Stampa On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0))))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0, new IDVariant(v_ANNODEL));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "ParametriStampaOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESTAMPA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMESTAMPA);
      // 
      // Parametri Stampa On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0))))
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "ParametriStampaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMESTAMPA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Stampa On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMESTAMPA_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0))))
        {
          IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "ParametriStampaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Rendiconto Fatture
  // **********************************************************************
  public int ApriRendicontoFatture ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Rendiconto Fatture Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "ApriRendicontoFatture", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Provvedimento Liquidazione", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMDATELA, 0, IDL.Today());
      // 
      // setto valori di default
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.CODICE) as MINTIPUTECOD ");
        SQL.append("from ");
        SQL.append("  TIPI_UTENZA A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          TIPOUTENDEFA = QV.Get("MINTIPUTECOD", IDVariant.STRING) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMTIPUTE, 0, new IDVariant(TIPOUTENDEFA));
      }
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "EndModalEvent", _e);
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
      if (IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0),(new IDVariant("N"))).equals((new IDVariant("N")), true) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0)))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Delibera obbligatoria!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Provvedimento_Liquidazione"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_NUMERO_DEL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO_DEL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SEDE_DEL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0),(new IDVariant("N")))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMDATELA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPOUTE")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMTIPUTE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DESCTIPOUTE")), (new IDVariant(PAN_PARAMESTAMPA.FieldText(PFL_PARAMESTAMPA_TIPIUTENDESC))));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
      }
      else
      {
      }
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "SelezioneCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMEDELIB, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAMP6, IMDBDef9.PQSL_PARAMESTAMP6_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Provvedimento Delibera Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMESTAMPA_DELIBERA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Provvedimento Delibera Validate Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "ProvvedimentoDeliberaValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa Elabora Button Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMESTAMPA_ELABORBUTTON_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Stampa Elabora Button Validate Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProvvedimentoLiquidazione", "ParametriStampaElaboraButtonValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void PROVVELIQUID_PARAMESTAMP6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMESTAMP6_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAMP9, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMESTAMP9, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAMP6_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMESTAMP6_RS, 0, IMDBDef2.TBL_PARAMESTAMP9, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 0, 0, IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 1, 0, IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMTIPUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 2, 0, IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEDESCT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 3, 0, IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 4, 0, IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEDELIB, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 5, 0, IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAMP6_RS, 6, 0, IMDBDef2.TBL_PARAMESTAMP9, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMANNDEL, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMESTAMP9, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMESTAMP9, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAMP9, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMESTAMP6_RS, 0);
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
  private void PAN_PARAMESTAMPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESTAMPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAMESTAMPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_INFOBUTTO)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_APRIBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESTAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMESTAMPA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMESTAMPA_DELIBERA)
      {
        PFL_PARAMESTAMPA_DELIBERA_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESTAMPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMESTAMPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMESTAMPA_Init()
  {

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, "BFDCD946-8650-42E2-A34E-D28D307C99D9");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, "Data Protocollo");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 0, 87);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 1, 13);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 0, 4);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 1, 4);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_DATAPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, "26381715-16A2-4F7D-9FEC-65BB74ADF9F6");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, "Provvedimento");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 88, 16, 0, 0);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, MyGlb.PANEL_FORM, 8, 3, 284, 53, 0, 0);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, 0, 87);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, 1, 13);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, 0, 4);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, 1, 4);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "9E8A00D4-5A15-4550-9C73-F63A27E65B07");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "Esercizio");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "422617AE-F8A0-4081-8BBC-92F08D89156E");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "Tipo Utenza");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "0A632058-2393-4464-9985-90C19261E8B8");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "Elabora");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, "E26702F0-4C0B-4479-B9B0-0CBD6197CC2E");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, "TIPI UTENZA DESCRIZIONE");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.VIS_LOOKUPFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "58A812D0-805F-4B20-9AD0-452D6C921184");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, "BC104419-5681-4628-80BB-8A99BBD174EB");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, "Delibera");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, "013C975E-913F-4D00-9C36-5935EBB5E6EC");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, "2D8966E9-9796-444E-91BF-E4AD1ACFB8DA");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, "3619559B-7081-4ECD-A1CE-FD5C9CB716B8");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, "3AF908F5-511B-4A75-811B-8225DE855795");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, "-");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, "11A90D8D-BBC5-4120-A3B4-BBF282C7AF68");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, "/");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, "9129FB58-4368-4CA2-9AA4-CAD40BD107B1");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, 0, "info.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, "3FFF83A5-C8D1-4CFB-B2B7-28E61F7D3FAC");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, 0, "wsearch1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMESTAMPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ESERCIZIO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ESERCIZIO, PPQRY_PARAMESTAMP6, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 64);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 24, 60, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TIPOUTENZA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TIPOUTENZA, PPQRY_PARAMESTAMP6, "A.ROWNAMTIPUTE", "ROWNAMTIPUTE", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 208, 124, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ELABORBUTTON, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_LIST, "TIPI UTENZA DESCRIZIONE");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPIUTENDESC, MyGlb.PANEL_FORM, "TP. UTEN. DESCRIZIONE");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TIPIUTENDESC, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TIPIUTENDESC, PPQRY_TIPIUTENZA, "A.DESCRIZIONE", "TIPIUTENDESC", 5, 50, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 48, 84, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_DATAELABORAZ, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_DATAELABORAZ, PPQRY_PARAMESTAMP6, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_FORM, 12, 28, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_DELIBERA, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_DELIBERA, PPQRY_PARAMESTAMP6, "A.ROWNAMEDELIB", "ROWNAMEDELIB", 5, 4, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delibera");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_FORM, 136, 28, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_FORM, 88);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_NUMERODELIBE, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_NUMERODELIBE, PPQRY_PARAMESTAMP6, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_FORM, 204, 28, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ANNODELIBERA, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ANNODELIBERA, PPQRY_PARAMESTAMP6, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 180, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 232, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_NEWPANELLABE, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, MyGlb.PANEL_LIST, 108, 28, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, MyGlb.PANEL_FORM, 116, 28, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TRATTINO, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, MyGlb.PANEL_FORM, 188, 28, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_SLASH, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, MyGlb.PANEL_LIST, 224, 16, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, MyGlb.PANEL_FORM, 272, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOBUTTO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_INFOBUTTO, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_INFOBUTTO, -1, "", "INFOBUTTO", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, MyGlb.PANEL_FORM, 252, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRIBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_APRIBUTTON, -1, GRP_PARAMESTAMPA_PROVVEDIMENT);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_APRIBUTTON, -1, "", "APRIBUTTON", 0, 0, 0, -13997);
  }

  private void PAN_PARAMESTAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPUTE~~) ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA, 0, SQL, -1, "");
    PAN_PARAMESTAMPA.SetQueryDB(PPQRY_TIPIUTENZA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMESTAMPA.SetMasterTable(PPQRY_TIPIUTENZA, "TIPI_UTENZA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPUTE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA1, 0, SQL, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA1, 1, SQL, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    PAN_PARAMESTAMPA.SetQueryDB(PPQRY_TIPIUTENZA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAMP6", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAMP6, IMDBDef9.PQRY_PARAMESTAMP6_RS, IMDBDef2.TBL_PARAMESTAMP9);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_ESERCIZIO, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEESERC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_TIPOUTENZA, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMTIPUTE);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_DATAELABORAZ, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMDATELA);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_DELIBERA, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMEDELIB);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_NUMERODELIBE, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMNUMDEL);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_ANNODELIBERA, IMDBDef2.FLD_PARAMESTAMP9_ROWNAMANNDEL);
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAMP9");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESTAMPA.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESTAMPA.iUseListQBE;
      PAN_PARAMESTAMPA.iUseListQBE = 0;
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESTAMPA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
