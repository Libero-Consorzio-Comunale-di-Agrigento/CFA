// **********************************************
// Liquidazione I V A
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioneIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_LIQUIDAZIIVA_PERIODPRECED = 0;
  private static int GRP_LIQUIDAZIIVA_SALVRISUSTAM = 1;

  private static int PFL_LIQUIDAZIIVA_DEBITO = 0;
  private static int PFL_LIQUIDAZIIVA_CREDITO = 1;
  private static int PFL_LIQUIDAZIIVA_ETICSTAMPREC = 2;
  private static int PFL_LIQUIDAZIIVA_STAMPAPRECED = 3;
  private static int PFL_LIQUIDAZIIVA_SOLOATTITRIM = 4;
  private static int PFL_LIQUIDAZIIVA_IMPMASDANOVE = 5;
  private static int PFL_LIQUIDAZIIVA_INTESTREGIST = 6;
  private static int PFL_LIQUIDAZIIVA_NUMEPRIMPAGI = 7;
  private static int PFL_LIQUIDAZIIVA_ELABORA = 8;
  private static int PFL_LIQUIDAZIIVA_ACCONTDOVUTO = 9;
  private static int PFL_LIQUIDAZIIVA_SALVATRISULT = 10;
  private static int PFL_LIQUIDAZIIVA_DESCRISTAMPA = 11;

  private static int PPQRY_PARAMETRI587 = 0;

  private static int PPQRY_STAMPALIQIVA = 1;


  IDPanel PAN_LIQUIDAZIIVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI241(IMDB);
    //
    //
    Init_PQRY_PARAMETRI587(IMDB);
    Init_PQRY_PARAMETRI587_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI241(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI241, 15);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI241, "TBL_PARAMETRI241");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEDEBIT,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMECREDI,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMINTREG,5,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, "ROWNAMEANNO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMACCDOV, "ROWNAMACCDOV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMACCDOV,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMSALRIS, "ROWNAMSALRIS");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMSALRIS,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMDESSTA, "ROWNAMDESSTA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMDESSTA,5,200,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMSTAPRE, "ROWNAMSTAPRE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMSTAPRE,3,8,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMMESTPR, "ROWNAMMESTPR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMMESTPR,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMANSTPR, "ROWNAMANSTPR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI241,IMDBDef2.FLD_PARAMETRI241_ROWNAMANSTPR,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI241, 0);
  }

  private static void Init_PQRY_PARAMETRI587(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI587, 10);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI587, "PQRY_PARAMETRI587");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSOATTR,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMINTREG,5,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMACCDOV, "ROWNAMACCDOV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMACCDOV,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSALRIS, "ROWNAMSALRIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSALRIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMDESSTA, "ROWNAMDESSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMDESSTA,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSTAPRE, "ROWNAMSTAPRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSTAPRE,3,8,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI587, 0);
  }

  private static void Init_PQRY_PARAMETRI587_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI587_RS, 10);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI587_RS, "PQRY_PARAMETRI587_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSOATTR,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMINTREG,5,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMACCDOV, "ROWNAMACCDOV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMACCDOV,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSALRIS, "ROWNAMSALRIS");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSALRIS,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMDESSTA, "ROWNAMDESSTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMDESSTA,5,200,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSTAPRE, "ROWNAMSTAPRE");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI587_RS,IMDBDef10.PQSL_PARAMETRI587_ROWNAMSTAPRE,3,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioneIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioneIVA()
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
    FormIdx = MyGlb.FRM_LIQUIDAZIIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F3472E0A-3F91-45A0-967A-27874008D213";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 408;
    DesignHeight = 414;
    set_Caption(new IDVariant("Liquidazione I V A"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 408;
    Frames[1].Height = 388;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Liquidazione I V A";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 388;
    PAN_LIQUIDAZIIVA = new IDPanel(w, this, 1, "PAN_LIQUIDAZIIVA");
    Frames[1].Content = PAN_LIQUIDAZIIVA;
    PAN_LIQUIDAZIIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIIVA.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 408-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1A1B1FAC-C5E4-4626-B492-6F898F431E6E");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1184, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIIVA.InitStatus = 2;
    PAN_LIQUIDAZIIVA_Init();
    PAN_LIQUIDAZIIVA_InitFields();
    PAN_LIQUIDAZIIVA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI241, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQUIDAZIIVA_PARAMETRI587();
      }
      PAN_LIQUIDAZIIVA.UpdatePanel(MainFrm);
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
    return (obj instanceof LiquidazioneIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioneIVA.class.getName() : (Glb.ClassWithPackage(LiquidazioneIVA.class) ? LiquidazioneIVA.class.getName().substring(LiquidazioneIVA.class.getPackage().getName().length() + 1) : LiquidazioneIVA.class.getName()));
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);
    IDVariant D = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_INTESTAZIONE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Liquidazione I.V.A.", IDVariant.STRING));
      D = (new IDVariant(25.82, IDVariant.DECIMAL));
      v_INTESTAZIONE = (new IDVariant("LIQUIDAZIONE I.V.A.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAP));
      if (IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)).equals(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0)), true))
      {
        PAN_LIQUIDAZIIVA.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR, 0, (new IDVariant("M")));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR, 0, (new IDVariant("T")));
      }
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_RONAIMMADANV, 0, new IDVariant(D));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMINTREG, 0, new IDVariant(v_INTESTAZIONE));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMNUPRPA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDEBIT, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMECREDI, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMACCDOV, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMMESTPR, 0, IDL.Sub(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)), (new IDVariant(1))));
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMMESTPR, 0).compareTo((new IDVariant(1)), true)<0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMMESTPR, 0, (new IDVariant(12)));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMANSTPR, 0, IDL.Sub(IDL.Year(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)), (new IDVariant(1))));
      }
      else
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMANSTPR, 0, IDL.Year(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVA", "LoadEvent", _e);
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
      UNLOADEVENT_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVA", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDEBIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMECREDI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_RONAIMMADANV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMINTREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMNUPRPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMACCDOV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSALRIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMDESSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSTAPRE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMMESTPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMANSTPR, 0, new IDVariant());
  }

  // **********************************************************************
  // Liquidazione I V A On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUIDAZIIVA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione I V A On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_LIQUIDAZIIVA_DEBITO)), true) && FieldModified.equals((new IDVariant(-1)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_RONAIMMADANV, 0), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Il debito del periodo precedente non puo' superare l'importo massimo da non versare", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQUIDAZIIVA_STAMPAPRECED)), true) && FieldModified.equals((new IDVariant(-1)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMSTAPRE, 0).compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_VSTALIQIVADE = new IDVariant(0,IDVariant.DECIMAL);
          IDVariant v_VSTALIQIVACR = new IDVariant(0,IDVariant.DECIMAL);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.DEBITO as STALIQIVADEB, ");
          SQL.append("  A.CREDITO as STALIQIVACRE ");
          SQL.append("from ");
          SQL.append("  STAMPA_LIQ_IVA A ");
          SQL.append("where (A.ID_STAMPA_LIQ_IVA = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMSTAPRE, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VSTALIQIVADE = QV.Get("STALIQIVADEB", IDVariant.DECIMAL) ;
            v_VSTALIQIVACR = QV.Get("STALIQIVACRE", IDVariant.DECIMAL) ;
          }
          QV.Close();
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, 0, new IDVariant(v_VSTALIQIVADE));
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI, 0, new IDVariant(v_VSTALIQIVACR));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVA", "LiquidazioneIVAOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione I V A On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIIVA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDAZIIVA);
      // 
      // Liquidazione I V A On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMSALRIS, 0).equals((new IDVariant("SI")), true))
      {
        PAN_LIQUIDAZIIVA.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_LIQUIDAZIIVA.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVA", "LiquidazioneIVAOnDynamicProperties", _e);
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
    IDVariant v_NOME = new IDVariant(0,IDVariant.STRING);
    IDVariant v_INDIRIZZO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CITTA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PARTITAIVA = new IDVariant(0,IDVariant.STRING);
    IDVariant v_PAR = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_PAR = (new IDVariant("Partita I.V.A.: ", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_PERIODO = new IDVariant(0,IDVariant.STRING);
      IDVariant v_SPERIODO = new IDVariant(0,IDVariant.STRING);
      if (IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)).compareTo(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0)), true)!=0)
      {
        v_PERIODO = IDL.Add(IDL.Add(IDL.Add(v_PERIODO, MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)))), (new IDVariant(" - "))), MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0))));
      }
      else
      {
        v_PERIODO = IDL.Add(v_PERIODO, MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0))));
      }
      v_PERIODO = IDL.Add(IDL.Add(v_PERIODO, (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, 0)));
      v_SPERIODO = new IDVariant(v_PERIODO);
      v_PERIODO = IDL.Add(IDL.Add((new IDVariant("Periodo")), (new IDVariant(" "))), v_PERIODO);
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMINTREG, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Valore obbligatorio sul campo:Intestazione Registro", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      else
      {
        IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
        v_DW = (new IDVariant("d_liquidazione_euro_stampa", IDVariant.STRING));
        IDVariant v_ENTE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_BOLLATO = new IDVariant(0,IDVariant.STRING);
        IDVariant v_INTERESSI = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_INTESTREGIVA = new IDVariant(0,IDVariant.STRING);
        IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);
        v_CHECK = (new IDVariant(0));
        if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Inserire solo credito o solo debito", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_RONAIMMADANV, 0), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Il debito del periodo precedente non puo' superare l'importo massimo da non versare", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        SQL = new StringBuffer();
        SQL.append("select distinct ");
        SQL.append("  1 as UNO ");
        SQL.append("from ");
        SQL.append("  T04 A, ");
        SQL.append("  FATPRI B ");
        SQL.append("where (A.TIPO_REGISTRO = B.TIPO_REGISTRO) ");
        SQL.append("and   (A.TIPO_BOLLATO = B.TIPO_BOLLATO) ");
        SQL.append("and   ((A.RIMBORSI IS NULL)) ");
        SQL.append("and   ((B.DATA_DOC BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   ((B.ANNO_PROG IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CHECK = QV.Get("UNO", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CHECK.equals((new IDVariant(1)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Per il periodo di elaborazione sono presenti documenti nel Registro Debitori non Codificati che non sono ancora stati Contabilizzati: il Registro Riepilogativo non può essere stampato.", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        // 
        // Salvataggio Risultato Stampa
        // 
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMSALRIS, 0).equals((new IDVariant("SI")), true))
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMDESSTA, 0),(new IDVariant(""))).equals((new IDVariant("")), true))
          {
            IDVariant v_SMESSAGGIO = null;
            v_SMESSAGGIO = (new IDVariant("Inserire la descrizione della Stampa"));
            MainFrm.set_AlertMessage(v_SMESSAGGIO); 
            return 0;
          }
          MainFrm.Cf4armDBObject.COMUNICAZIONELIQIVAPKGSALVATOTSTAMPALIQIVA(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, 0), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0)), IDL.ToString(IDL.ToDate(IDL.Year(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)), IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)), (new IDVariant(1)))), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMACCDOV, 0),(new IDVariant(0))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMSOATTR, 0), IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMDESSTA, 0), v_SPERIODO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            return 0;
          }
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.INTESTAZIONE_ENTE_IVA as T99INTENTIVA, ");
        SQL.append("  A.INTESTAZIONE_BOLLATO_IVA as T99INTBOLIVA, ");
        SQL.append("  A.INTERESSI_LT as T99INTERESLT, ");
        SQL.append("  A.INTESTAZIONE_REGISTRO_IVA as T99INTREGIVA ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ENTE = QV.Get("T99INTENTIVA", IDVariant.STRING) ;
          v_BOLLATO = QV.Get("T99INTBOLIVA", IDVariant.STRING) ;
          v_INTERESSI = QV.Get("T99INTERESLT", IDVariant.DECIMAL) ;
          v_INTESTREGIVA = QV.Get("T99INTREGIVA", IDVariant.STRING) ;
        }
        QV.Close();
        v_NOME = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0);
        v_INDIRIZZO = IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_INDIRIZZO, 0);
        v_CITTA = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_CAP, 0)), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0))), (new IDVariant(" "))), IDL.ToString(((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)))?(new IDVariant(" ")):IDL.Add(IDL.Add((new IDVariant("(")), IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PROVINCIA, 0)), (new IDVariant(")"))))));
        v_PARTITAIVA = ((IDL.IsNull(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)))?(new IDVariant("")):IDL.Add(v_PAR, IDL.FillLR(IDL.ToString(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_PARTITA_IVA, 0)), (new IDVariant(11)), IDL.ToString((new IDVariant(0))), true)));
        // 
        // jasper
        // 
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_DATA_DA_T")), IDL.ToString(IDL.ToDate(IDL.Year(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)), IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)), (new IDVariant(1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_DA")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_A")), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_DEBITO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMEDEBIT, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_CREDITO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMECREDI, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_INTERESSI")), IDL.ToString(IDL.NullValue(v_INTERESSI,(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("A_TIPO_LIQ")), IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMSOATTR, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("a_imp_max_vers")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_RONAIMMADANV, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_TESTO")), IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMINTREG, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("NUM_PAGINA")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMNUPRPA, 0),(new IDVariant(0)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("P_PERIODO")), v_PERIODO);
          MainFrm.SetParametroStampaJasper((new IDVariant("P_ACCONTO_DOVUTO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI587, IMDBDef10.PQSL_PARAMETRI587_ROWNAMACCDOV, 0),(new IDVariant(0)))));
          MainFrm.LanciaStampaJasper((new IDVariant("Liquidazione_IVA_cf")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioneIVA", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void LIQUIDAZIIVA_PARAMETRI587() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI587_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI241, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI241, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI587_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI587_RS, 0, IMDBDef2.TBL_PARAMETRI241, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 0, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDEBIT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 1, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMECREDI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 2, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 3, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_RONAIMMADANV, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 4, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMINTREG, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 5, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMNUPRPA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 6, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMACCDOV, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 7, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSALRIS, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 8, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMDESSTA, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI587_RS, 9, 0, IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSTAPRE, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI241, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI241, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI241, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI587_RS, 0);
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
  private void PAN_LIQUIDAZIIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAZIIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAZIIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAZIIVA, Cancel);
    // Stub
  }

  private void PAN_LIQUIDAZIIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQUIDAZIIVA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_LIQUIDAZIIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQUIDAZIIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUIDAZIIVA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAZIIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAZIIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQUIDAZIIVA_Init()
  {

    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, "E300CA7B-E4E2-4598-9659-28E6E7B868BE");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, "Periodo Precedente");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, MyGlb.PANEL_FORM, 16, 15, 376, 93, 0, 0);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 0, 111);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 1, 13);
    PAN_LIQUIDAZIIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 0, 4);
    PAN_LIQUIDAZIIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 1, 4);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_PERIODPRECED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, "645C8EBB-222D-4639-A24A-2AF848015F09");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, "Salvataggio Risultato Stampa");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, MyGlb.PANEL_LIST, 0, -9999, 504, 16, 0, 0);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, MyGlb.PANEL_FORM, 20, 271, 376, 49, 0, 0);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, 0, 168);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, 1, 13);
    PAN_LIQUIDAZIIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, 0, 4);
    PAN_LIQUIDAZIIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, 1, 4);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQUIDAZIIVA_SALVRISUSTAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, "49FF4A1A-DE2D-4983-9AB2-74054EA454E6");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, "Debito");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, "F5DF4608-5F58-45D2-B001-84B7EA13D525");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, "Credito");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, "540B02EB-5901-4ABC-A1BE-08AD51B1F544");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, "Stampa Precedente");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, MyGlb.VIS_VUOTOGRASSET);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, "E4CE704F-3228-4678-98B7-A4E0D5654A72");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, "Stampa Precedente");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, "1A039D2D-47AF-4789-9D7A-D283529308DB");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, "Solo Attività Trimestrali");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, "1D32659F-4450-4D03-BE1D-4CF74B5CC826");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, "Importo Massimo Da Non Versare");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, "8B54F74D-4972-4A28-B3C2-FA2FCED219A8");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, "Intestazione Registro");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, "8AD66B34-3CC2-4C92-B726-95EEB42F96C5");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, "Numero Prima Pagina");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, "41E06528-7AFB-45B6-8ACF-2E77DA7B077A");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, "Elabora");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_LIQUIDAZIIVA.SetImage(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, 0, "button1.gif", false);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, "FAF98F71-1FCE-4E90-BDCC-E54E5184A907");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, "Acconto Dovuto");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, "3AA903EB-655A-4746-B8E0-944994A341EB");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, "Attivo");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.VIS_CHECKSTYLE);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, "B0D90637-1146-4C2D-877F-488EC95D2044");
    PAN_LIQUIDAZIIVA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, "Descrizione");
    PAN_LIQUIDAZIIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, "");
    PAN_LIQUIDAZIIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUIDAZIIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, 40);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_LIST, "Debito");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, 32, 40, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DEBITO, MyGlb.PANEL_FORM, "Debito");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_DEBITO, -1, GRP_LIQUIDAZIIVA_PERIODPRECED);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_DEBITO, PPQRY_PARAMETRI587, "A.ROWNAMEDEBIT", "ROWNAMEDEBIT", 3, 14, 2, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, 56, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, 44);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_LIST, "Credito");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, 220, 40, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, 64);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_CREDITO, MyGlb.PANEL_FORM, "Credito");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_CREDITO, -1, GRP_LIQUIDAZIIVA_PERIODPRECED);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_CREDITO, PPQRY_PARAMETRI587, "A.ROWNAMECREDI", "ROWNAMECREDI", 3, 14, 2, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, MyGlb.PANEL_LIST, 24, 120, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, MyGlb.PANEL_FORM, 20, 68, 80, 36, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ETICSTAMPREC, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_ETICSTAMPREC, -1, GRP_LIQUIDAZIIVA_PERIODPRECED);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_ETICSTAMPREC, -1, "", "ETICSTAMPREC", 0, 0, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_LIST, "Stampa Precedente");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_FORM, 100, 76, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_STAMPAPRECED, MyGlb.PANEL_FORM, "Stm. Prec.");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_STAMPAPRECED, -1, GRP_LIQUIDAZIIVA_PERIODPRECED);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_STAMPAPRECED, PPQRY_PARAMETRI587, "A.ROWNAMSTAPRE", "ROWNAMSTAPRE", 3, 8, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, "S. Att. Trm.");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 140, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 148);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, "Solo Attività Trimestrali");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_SOLOATTITRIM, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_SOLOATTITRIM, PPQRY_PARAMETRI587, "A.ROWNAMSOATTR", "ROWNAMSOATTR", 5, 1, 0, -13997);
    PAN_LIQUIDAZIIVA.SetValueListItem(PFL_LIQUIDAZIIVA_SOLOATTITRIM, (new IDVariant("T")), "T", "", "", -1);
    PAN_LIQUIDAZIIVA.SetValueListItem(PFL_LIQUIDAZIIVA_SOLOATTITRIM, (new IDVariant("E")), "E", "", "", -1);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 160, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 168);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, "Imp. Mass. Da Non Versare");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 88, 176, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 200);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, "Importo Massimo Da Non Versare");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_IMPMASDANOVE, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_IMPMASDANOVE, PPQRY_PARAMETRI587, "A.RONAIMMADANV", "RONAIMMADANV", 3, 16, 2, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, 248, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_LIST, "Intestazione Registro");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, 12, 236, 380, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, 132);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_INTESTREGIST, MyGlb.PANEL_FORM, "Intestazione Registro");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_INTESTREGIST, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_INTESTREGIST, PPQRY_PARAMETRI587, "A.ROWNAMINTREG", "ROWNAMINTREG", 5, 19, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 408, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_LIST, "Nm. P. Pg.");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 136, 204, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 152);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, MyGlb.PANEL_FORM, "Numero Prima Pagina");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, PPQRY_PARAMETRI587, "A.ROWNAMNUPRPA", "ROWNAMNUPRPA", 1, 5, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_LIST, 284, 160, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_FORM, 312, 340, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_ELABORA, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_LIST, "Acconto Dovuto");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_FORM, 184, 120, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_ACCONTDOVUTO, MyGlb.PANEL_FORM, "Acconto Dovuto");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_ACCONTDOVUTO, -1, -1);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_ACCONTDOVUTO, PPQRY_PARAMETRI587, "A.ROWNAMACCDOV", "ROWNAMACCDOV", 3, 14, 2, -13997);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_LIST, 132);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_LIST, "Attivo");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_FORM, 24, 296, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_FORM, 48);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_SALVATRISULT, MyGlb.PANEL_FORM, "Attivo");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_SALVATRISULT, -1, GRP_LIQUIDAZIIVA_SALVRISUSTAM);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_SALVATRISULT, PPQRY_PARAMETRI587, "A.ROWNAMSALRIS", "ROWNAMSALRIS", 5, 2, 0, -13997);
    PAN_LIQUIDAZIIVA.SetValueListItem(PFL_LIQUIDAZIIVA_SALVATRISULT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_LIQUIDAZIIVA.SetValueListItem(PFL_LIQUIDAZIIVA_SALVATRISULT, (new IDVariant()), "Null", "", "", -1);
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDAZIIVA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_FORM, 104, 296, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_FORM, 80);
    PAN_LIQUIDAZIIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIIVA_DESCRISTAMPA, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDAZIIVA.SetFieldPage(PFL_LIQUIDAZIIVA_DESCRISTAMPA, -1, GRP_LIQUIDAZIIVA_SALVRISUSTAM);
    PAN_LIQUIDAZIIVA.SetFieldPanel(PFL_LIQUIDAZIIVA_DESCRISTAMPA, PPQRY_PARAMETRI587, "A.ROWNAMDESSTA", "ROWNAMDESSTA", 5, 200, 0, -13997);
  }

  private void PAN_LIQUIDAZIIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIIVA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_STAMPA_LIQ_IVA as IDSTAMLIQIVA, ");
    SQL.append("  A.DATA_INSERIMENTO as STALIQIVDAIN, ");
    SQL.append("  A.DESCRIZIONE || ' (' || A.PERIODO || ') ' || TO_CHAR ( A.DATA_INSERIMENTO,'dd/mm/yyyy') as STALIQIVADES ");
    SQL.append("from ");
    SQL.append("  STAMPA_LIQ_IVA A ");
    SQL.append("where (A.ID_STAMPA_LIQ_IVA = ~~ROWNAMSTAPRE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI241.ROWNAMANSTPR~~) ");
    SQL.append("and   (A.MESE_FINALE = ~~TBL_PARAMETRI241.ROWNAMMESTPR~~) ");
    SQL.append("order by 2 desc, 3 ");
    PAN_LIQUIDAZIIVA.SetQuery(PPQRY_STAMPALIQIVA, 0, SQL, PFL_LIQUIDAZIIVA_STAMPAPRECED, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_STAMPA_LIQ_IVA as IDSTAMLIQIVA, ");
    SQL.append("  A.DATA_INSERIMENTO as STALIQIVDAIN, ");
    SQL.append("  A.DESCRIZIONE || ' (' || A.PERIODO || ') ' || TO_CHAR ( A.DATA_INSERIMENTO,'dd/mm/yyyy') as STALIQIVADES ");
    SQL.append("from ");
    SQL.append("  STAMPA_LIQ_IVA A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI241.ROWNAMANSTPR~~) ");
    SQL.append("and   (A.MESE_FINALE = ~~TBL_PARAMETRI241.ROWNAMMESTPR~~) ");
    SQL.append("order by 2 desc, 3 ");
    PAN_LIQUIDAZIIVA.SetQuery(PPQRY_STAMPALIQIVA, 1, SQL, PFL_LIQUIDAZIIVA_STAMPAPRECED, "");
    PAN_LIQUIDAZIIVA.SetQueryDB(PPQRY_STAMPALIQIVA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIIVA.SetIMDB(IMDB, "PQRY_PARAMETRI587", true);
    PAN_LIQUIDAZIIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_LIQUIDAZIIVA.SetQueryIMDB(PPQRY_PARAMETRI587, IMDBDef10.PQRY_PARAMETRI587_RS, IMDBDef2.TBL_PARAMETRI241);
    JustLoaded = true;
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_DEBITO, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDEBIT);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_CREDITO, IMDBDef2.FLD_PARAMETRI241_ROWNAMECREDI);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_STAMPAPRECED, IMDBDef2.FLD_PARAMETRI241_ROWNAMSTAPRE);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_SOLOATTITRIM, IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_IMPMASDANOVE, IMDBDef2.FLD_PARAMETRI241_RONAIMMADANV);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_INTESTREGIST, IMDBDef2.FLD_PARAMETRI241_ROWNAMINTREG);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_NUMEPRIMPAGI, IMDBDef2.FLD_PARAMETRI241_ROWNAMNUPRPA);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_ACCONTDOVUTO, IMDBDef2.FLD_PARAMETRI241_ROWNAMACCDOV);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_SALVATRISULT, IMDBDef2.FLD_PARAMETRI241_ROWNAMSALRIS);
    PAN_LIQUIDAZIIVA.SetFieldPrimaryIndex(PFL_LIQUIDAZIIVA_DESCRISTAMPA, IMDBDef2.FLD_PARAMETRI241_ROWNAMDESSTA);
    PAN_LIQUIDAZIIVA.SetMasterTable(0, "PARAMETRI241");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAZIIVA.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAZIIVA.iUseListQBE;
      PAN_LIQUIDAZIIVA.iUseListQBE = 0;
      PAN_LIQUIDAZIIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAZIIVA.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAZIIVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQUIDAZIIVA) PAN_LIQUIDAZIIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
