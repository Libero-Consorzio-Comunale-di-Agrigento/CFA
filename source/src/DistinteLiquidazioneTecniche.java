// **********************************************
// Distinte Liquidazione Tecniche
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DistinteLiquidazioneTecniche extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DISTINLIQUID_DISTINTA = 0;
  private static int GRP_DISTINLIQUID_DELIBERA = 1;
  private static int GRP_DISTINLIQUID_PROPOSTA = 2;
  private static int GRP_DISTINLIQUID_LIQUIDAZIONE = 3;
  private static int GRP_DISTINLIQUID_MANDATO = 4;

  private static int PFL_DISTINLIQUID_NUMERODISTIN = 0;
  private static int PFL_DISTINLIQUID_ANNODISTINTA = 1;
  private static int PFL_DISTINLIQUID_TIPODIST = 2;
  private static int PFL_DISTINLIQUID_SEDEDEL = 3;
  private static int PFL_DISTINLIQUID_NUMERODEL = 4;
  private static int PFL_DISTINLIQUID_ANNODEL = 5;
  private static int PFL_DISTINLIQUID_INFODEL = 6;
  private static int PFL_DISTINLIQUID_UNITAPROPONE = 7;
  private static int PFL_DISTINLIQUID_NUMEROPROPOS = 8;
  private static int PFL_DISTINLIQUID_ANNOPROPOSTA = 9;
  private static int PFL_DISTINLIQUID_INFOPROP = 10;
  private static int PFL_DISTINLIQUID_IMPORTO = 11;
  private static int PFL_DISTINLIQUID_NUMEROLIQ = 12;
  private static int PFL_DISTINLIQUID_ANNOLIQ = 13;
  private static int PFL_DISTINLIQUID_DATALIQUIDAZ = 14;
  private static int PFL_DISTINLIQUID_NUMEROMANDAT = 15;
  private static int PFL_DISTINLIQUID_DDATAMAND = 16;
  private static int PFL_DISTINLIQUID_TOTIMPORTO = 17;

  private static int PPQRY_LIQFATTUBUON = 0;

  private static int PPQRY_DISTINLIQUID = 1;


  IDPanel PAN_DISTINLIQUID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI413(IMDB);
    //
    //
    Init_PQRY_LIQFATTUBUON(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI413(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI413, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI413, "TBL_PARAMETRI413");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI413,IMDBDef2.FLD_PARAMETRI413_PARAANNOPROG, "PARAANNOPROG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI413,IMDBDef2.FLD_PARAMETRI413_PARAANNOPROG,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI413,IMDBDef2.FLD_PARAMETRI413_PARANUMEPROG, "PARANUMEPROG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI413,IMDBDef2.FLD_PARAMETRI413_PARANUMEPROG,1,5,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI413, 0);
  }

  private static void Init_PQRY_LIQFATTUBUON(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_LIQFATTUBUON, 18);
    IMDB.set_TblCode(IMDBDef10.PQRY_LIQFATTUBUON, "PQRY_LIQFATTUBUON");
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_DATA_REGISTRAZIONE, "DATA_REGISTRAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_DATA_REGISTRAZIONE,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_DATA_MAND,1,7,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_D_DATA_MAND, "D_DATA_MAND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_D_DATA_MAND,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIUP, "LIFABUDILIUP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIUP,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAP, "LIFABUDILIAP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAP,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILINP, "LIFABUDILINP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILINP,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_INFOPROP, "INFOPROP");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_INFOPROP,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAD, "LIFABUDILIAD");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAD,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIND, "LIFABUDILIND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIND,1,6,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILISD, "LIFABUDILISD");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILISD,5,255,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_INFODEL, "INFODEL");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUON,IMDBDef10.PQSL_LIQFATTUBUON_INFODEL,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_LIQFATTUBUON, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DistinteLiquidazioneTecniche(MyWebEntryPoint w, IMDBObj imdb)
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
  public DistinteLiquidazioneTecniche()
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
    FormIdx = MyGlb.FRM_DISTLIQUTECN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F18596F6-B26C-4FE6-B9F7-9DDF4B6712D6";
    ResModeW = 3;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 880;
    DesignHeight = 390;
    set_Caption(new IDVariant("Distinte Liquidazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 880;
    Frames[1].Height = 364;
    Frames[1].Caption = "Unità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_DISTINLIQUID = new IDPanel(w, this, 1, "PAN_DISTINLIQUID");
    Frames[1].Content = PAN_DISTINLIQUID;
    PAN_DISTINLIQUID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINLIQUID.VS = MainFrm.VisualStyleList;
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 880-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "888A4461-32D3-4E90-9844-0D0D43064E08");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 996, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINLIQUID.InitStatus = 2;
    PAN_DISTINLIQUID_Init();
    PAN_DISTINLIQUID_InitFields();
    PAN_DISTINLIQUID_InitQueries();
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
      PAN_DISTINLIQUID.UpdatePanel(MainFrm);
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
    return (obj instanceof DistinteLiquidazioneTecniche);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DistinteLiquidazioneTecniche.class.getName() : (Glb.ClassWithPackage(DistinteLiquidazioneTecniche.class) ? DistinteLiquidazioneTecniche.class.getName().substring(DistinteLiquidazioneTecniche.class.getPackage().getName().length() + 1) : DistinteLiquidazioneTecniche.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Distinte Liquidazione After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DISTINLIQUID_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinte Liquidazione After Find Body
      // Corpo Procedura
      // 
      PAN_DISTINLIQUID.set_FieldText(PFL_DISTINLIQUID_TOTIMPORTO, IDL.Format(PAN_DISTINLIQUID.GetFieldSum(PFL_DISTINLIQUID_IMPORTO), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteLiquidazioneTecniche", "DistinteLiquidazioneAfterFind", _e);
    }
  }

  // **********************************************************************
  // Distinte Liquidazione On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINLIQUID_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISTINLIQUID);
      // 
      // Distinte Liquidazione On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_DISTINLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_DISTINLIQUID_UNITAPROPONE,(new IDVariant(PAN_DISTINLIQUID.FieldText(PFL_DISTINLIQUID_UNITAPROPONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteLiquidazioneTecniche", "DistinteLiquidazioneOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Info Delibera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAD, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIND, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAD, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILISD, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAD, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIND, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteLiquidazioneTecniche", "InfoDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIUP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILINP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAP, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIUP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILINP, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_LIFABUDILIAP, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistinteLiquidazioneTecniche", "InfoProposta", _e);
      return -1;
    }
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
    // Stub
  }

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
  private void PAN_DISTINLIQUID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTINLIQUID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINLIQUID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINLIQUID, Cancel);
    // Stub
  }

  private void PAN_DISTINLIQUID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DISTINLIQUID_INFODEL)
    {
      this.IdxPanelActived = this.PAN_DISTINLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DISTINLIQUID_INFOPROP)
    {
      this.IdxPanelActived = this.PAN_DISTINLIQUID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DISTINLIQUID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINLIQUID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_D_DATA_MAND, 0)))
      {
        IMDB.set_Value(IMDBDef10.PQRY_LIQFATTUBUON, IMDBDef10.PQSL_LIQFATTUBUON_D_DATA_MAND, 0, (new IDVariant("1999/12/31# 00:00:00", IDVariant.DATETIME)));
      }
      if (Cancel.isFalse())
      {
        PAN_DISTINLIQUID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISTINLIQUID_Init()
  {

    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, "F7F39118-7D6E-4E33-AF86-82B743628477");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, "Distinta");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, MyGlb.VIS_GROUPSTYLE);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, MyGlb.PANEL_LIST, 0, -9999, 180, 16, 0, 0);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, MyGlb.PANEL_FORM, 0, 27, 528, 289, 0, 0);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, 0, 44);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, 1, 13);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, 0, 4);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, 1, 4);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, "2321F055-559D-4C13-9750-C4029745D32D");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, "Delibera");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, MyGlb.PANEL_LIST, 180, -9999, 192, 16, 0, 0);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, MyGlb.PANEL_FORM, 0, 339, 132, 169, 0, 0);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, 0, 47);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, 1, 13);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, 0, 4);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, 1, 4);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, "DAED610B-DD61-460F-A2E2-591EB6451054");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, "Proposta");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, MyGlb.PANEL_LIST, 372, -9999, 200, 16, 0, 0);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, MyGlb.PANEL_FORM, 0, 291, 180, 193, 0, 0);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, 0, 51);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, 1, 13);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, 0, 4);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, 1, 4);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, "4A20BDB4-ADBC-4B3E-9324-CAB37AF116B5");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, "Liquidazione");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, MyGlb.PANEL_LIST, 688, -9999, 184, 16, 0, 0);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0, 99, 184, 169, 0, 0);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, 0, 70);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, 1, 13);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, 0, 4);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, 1, 4);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_LIQUIDAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, "F21C0D92-9424-469E-9EF6-7ACAD62F1947");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, "Mandato");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, MyGlb.PANEL_LIST, 872, -9999, 124, 16, 0, 0);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, MyGlb.PANEL_FORM, 0, 171, 196, 121, 0, 0);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, 0, 50);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, 1, 13);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, 0, 4);
    PAN_DISTINLIQUID.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, 1, 4);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTINLIQUID_MANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, "07175624-878B-4A19-ABB5-C1802830F7D0");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, "Numero");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, "BCF3CD1B-91B4-482E-AF1F-5021275A7161");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, "Anno");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, "D0639F98-E1ED-4E54-BA53-AF0DBAFC95A9");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, "Tipo");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, "9FDD1517-20B4-4322-818C-C5BD9129DB23");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, "Sede");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, "F38FDAAC-9558-48B9-8BFA-2332219F40B7");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, "Numero");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, "335D5763-42CB-406D-9403-819073EEF279");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, "Anno");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, "E81B39CC-589E-4C68-85FD-FE122419FD1D");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, " ");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.VIS_HYPELINKIMMA);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, "D3C347DA-2EA8-490D-AFAC-4D46E4F55F9D");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, "Unità");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, "47C38B73-1FBE-4E31-A3DB-9D09AE6334BF");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, " Numero");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, "5958979D-9D36-4383-9DEA-C2AD249357DB");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, " Anno");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, "2A797F0C-5967-43F5-A225-74706D9A82B5");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, " ");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.VIS_HYPELINKIMMA);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, "0ABFDF9B-DFF6-455F-A0F0-2AADF05F5DD0");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, "Importo");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, "B49D6975-2631-4D61-ACC6-569165DA2F8B");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, "Numero");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, "BE6A2F17-336A-4CFC-ACD6-8B363B23CFAC");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, "Anno");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, "D2966032-611B-4BAB-BB13-F18D2563FA03");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, "Data");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, "C2640E55-026B-4F95-9138-67CE4A4865F7");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, "Numero");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, "3AA43458-E52E-4D6F-8DBA-B16710B22B1C");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, "Data");
    PAN_DISTINLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, "8FBDFBA4-E604-4888-BD61-50410D35AD7E");
    PAN_DISTINLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, "");
    PAN_DISTINLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISTINLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DISTINLIQUID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, 356, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, 120);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMERODISTIN, -1, GRP_DISTINLIQUID_DISTINTA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMERODISTIN, PPQRY_LIQFATTUBUON, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 5, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, 56, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_LIST, "Anno");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, 204, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, 104);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNODISTINTA, -1, GRP_DISTINLIQUID_DISTINTA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNODISTINTA, PPQRY_LIQFATTUBUON, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, 104, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, 204);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_LIST, "Tipo");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, 4, 292, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, 204);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TIPODIST, MyGlb.PANEL_FORM, "Tipo");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_TIPODIST, -1, GRP_DISTINLIQUID_DISTINTA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_TIPODIST, PPQRY_DISTINLIQUID, "A.TIPO_DIST", "DISLIQTIPDIS", 5, 1, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_TIPODIST, (new IDVariant("B")), "Ordini", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_TIPODIST, (new IDVariant("D")), "Disposizioni", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_TIPODIST, (new IDVariant("L")), "Liquidazioni", "", "", -1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 180, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 60);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_LIST, "Sede");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 4, 412, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 60);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_SEDEDEL, MyGlb.PANEL_FORM, "Sede");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_SEDEDEL, -1, GRP_DISTINLIQUID_DELIBERA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_SEDEDEL, PPQRY_LIQFATTUBUON, "B.SEDE_DEL", "LIFABUDILISD", 5, 255, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 244, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_LIST, "Numero");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 4, 388, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMERODEL, MyGlb.PANEL_FORM, "Numero");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMERODEL, -1, GRP_DISTINLIQUID_DELIBERA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMERODEL, PPQRY_LIQFATTUBUON, "B.NUMERO_DEL", "LIFABUDILIND", 1, 6, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, 304, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, 64);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_LIST, "Anno");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, 4, 364, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, 64);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNODEL, MyGlb.PANEL_FORM, "Anno");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNODEL, -1, GRP_DISTINLIQUID_DELIBERA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNODEL, PPQRY_LIQFATTUBUON, "B.ANNO_DEL", "LIFABUDILIAD", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_LIST, 348, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_LIST, 52);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_LIST, " ");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_FORM, 4, 484, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_FORM, 52);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFODEL, MyGlb.PANEL_FORM, " ");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_INFODEL, -1, GRP_DISTINLIQUID_DELIBERA);
    PAN_DISTINLIQUID.SetFieldUnbound(PFL_DISTINLIQUID_INFODEL, true);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_INFODEL, PPQRY_LIQFATTUBUON, "CASE WHEN NOT ((B.SEDE_DEL IS NULL)) AND NOT ((B.NUMERO_DEL IS NULL)) AND NOT ((B.ANNO_DEL IS NULL)) THEN 'I' ELSE NULL END", "INFODEL", 5, 99, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFODEL, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISTINLIQUID.set_ImageResizeMode(PFL_DISTINLIQUID_INFODEL, 2);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, 372, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, 120);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_LIST, "Unità");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, 4, 436, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, 120);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_UNITAPROPONE, MyGlb.PANEL_FORM, "Unità");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_UNITAPROPONE, -1, GRP_DISTINLIQUID_PROPOSTA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_UNITAPROPONE, PPQRY_LIQFATTUBUON, "B.UNITA_PROPONENTE", "LIFABUDILIUP", 5, 255, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, 456, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, 120);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_LIST, " Numero");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, 4, 340, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, 120);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROPROPOS, MyGlb.PANEL_FORM, " Numero");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMEROPROPOS, -1, GRP_DISTINLIQUID_PROPOSTA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMEROPROPOS, PPQRY_LIQFATTUBUON, "B.NUMERO_PROPOSTA", "LIFABUDILINP", 3, 10, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 512, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 104);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_LIST, " Anno");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 4, 316, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOPROPOSTA, MyGlb.PANEL_FORM, " Anno");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNOPROPOSTA, -1, GRP_DISTINLIQUID_PROPOSTA);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNOPROPOSTA, PPQRY_LIQFATTUBUON, "B.ANNO_PROPOSTA", "LIFABUDILIAP", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_LIST, 552, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_LIST, 60);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_LIST, " ");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_FORM, 4, 460, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_FORM, 60);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_INFOPROP, MyGlb.PANEL_FORM, " ");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_INFOPROP, -1, GRP_DISTINLIQUID_PROPOSTA);
    PAN_DISTINLIQUID.SetFieldUnbound(PFL_DISTINLIQUID_INFOPROP, true);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_INFOPROP, PPQRY_LIQFATTUBUON, "CASE WHEN NOT ((B.UNITA_PROPONENTE IS NULL)) AND NOT ((B.ANNO_PROPOSTA IS NULL)) AND NOT ((B.NUMERO_PROPOSTA IS NULL)) THEN 'I' ELSE NULL END", "INFOPROP", 5, 99, 0, -13997);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISTINLIQUID.SetValueListItem(PFL_DISTINLIQUID_INFOPROP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISTINLIQUID.set_ImageResizeMode(PFL_DISTINLIQUID_INFOPROP, 2);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, 572, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, 4, 100, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_IMPORTO, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_IMPORTO, PPQRY_LIQFATTUBUON, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 688, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, "Numero");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 148, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMEROLIQ, -1, GRP_DISTINLIQUID_LIQUIDAZIONE);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMEROLIQ, PPQRY_LIQFATTUBUON, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 744, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_LIST, "Anno");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_ANNOLIQ, MyGlb.PANEL_FORM, "Anno");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_ANNOLIQ, -1, GRP_DISTINLIQUID_LIQUIDAZIONE);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_ANNOLIQ, PPQRY_LIQFATTUBUON, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_LIST, 792, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_LIST, 68);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_LIST, "Data");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_FORM, 4, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_FORM, 68);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DATALIQUIDAZ, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_DATALIQUIDAZ, -1, GRP_DISTINLIQUID_LIQUIDAZIONE);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_DATALIQUIDAZ, PPQRY_LIQFATTUBUON, "C.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_LIST, 872, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_LIST, 84);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_LIST, "Numero");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_FORM, 4, 196, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_FORM, 84);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_NUMEROMANDAT, MyGlb.PANEL_FORM, "Numero");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_NUMEROMANDAT, -1, GRP_DISTINLIQUID_MANDATO);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_NUMEROMANDAT, PPQRY_LIQFATTUBUON, "C.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_LIST, 928, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_LIST, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_LIST, "Data");
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_FORM, 4, 268, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_FORM, 80);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_FORM, 1);
    PAN_DISTINLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_DDATAMAND, MyGlb.PANEL_FORM, "Data");
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_DDATAMAND, -1, GRP_DISTINLIQUID_MANDATO);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_DDATAMAND, PPQRY_LIQFATTUBUON, "D.D_DATA_MAND", "D_DATA_MAND", 6, 19, 0, -13997);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, MyGlb.PANEL_LIST, 572, 244, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, MyGlb.PANEL_LIST, 0);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, MyGlb.PANEL_FORM, 64, 244, 216, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, MyGlb.PANEL_FORM, 0);
    PAN_DISTINLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINLIQUID_TOTIMPORTO, MyGlb.PANEL_FORM, 3);
    PAN_DISTINLIQUID.SetFieldPage(PFL_DISTINLIQUID_TOTIMPORTO, -1, -1);
    PAN_DISTINLIQUID.SetFieldPanel(PFL_DISTINLIQUID_TOTIMPORTO, -1, "", "TOTIMPORTO", 0, 0, 0, -13997);
  }

  private void PAN_DISTINLIQUID_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINLIQUID.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO_DIST as DISLIQTIPDIS ");
    SQL.append("from ");
    SQL.append("  DISTINTE_LIQUIDAZIONE A ");
    SQL.append("where (A.ANNO_DISTINTA = ~~ANNO_DISTINTA~~) ");
    SQL.append("and   (A.NUMERO_DISTINTA = ~~NUMERO_DISTINTA~~) ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_DISTINLIQUID, 0, SQL, -1, "");
    PAN_DISTINLIQUID.SetQueryDB(PPQRY_DISTINLIQUID, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINLIQUID.SetMasterTable(PPQRY_DISTINLIQUID, "DISTINTE_LIQUIDAZIONE");
    PAN_DISTINLIQUID.SetIMDB(IMDB, "PQRY_LIQFATTUBUON", true);
    PAN_DISTINLIQUID.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ FATTURE BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.DATA_REGISTRAZIONE as DATA_REGISTRAZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  C.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  D.DATA_MAND as DATA_MAND, ");
    SQL.append("  C.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  D.D_DATA_MAND as D_DATA_MAND, ");
    SQL.append("  B.UNITA_PROPONENTE as LIFABUDILIUP, ");
    SQL.append("  B.ANNO_PROPOSTA as LIFABUDILIAP, ");
    SQL.append("  B.NUMERO_PROPOSTA as LIFABUDILINP, ");
    SQL.append("  CASE WHEN NOT ((B.UNITA_PROPONENTE IS NULL)) AND NOT ((B.ANNO_PROPOSTA IS NULL)) AND NOT ((B.NUMERO_PROPOSTA IS NULL)) THEN 'I' ELSE NULL END as INFOPROP, ");
    SQL.append("  B.ANNO_DEL as LIFABUDILIAD, ");
    SQL.append("  B.NUMERO_DEL as LIFABUDILIND, ");
    SQL.append("  B.SEDE_DEL as LIFABUDILISD, ");
    SQL.append("  CASE WHEN NOT ((B.SEDE_DEL IS NULL)) AND NOT ((B.NUMERO_DEL IS NULL)) AND NOT ((B.ANNO_DEL IS NULL)) THEN 'I' ELSE NULL END as INFODEL ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_LIQFATTUBUON, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_LIQ_TECNICHE A, ");
    SQL.append("  DISTINTE_LIQUIDAZIONE B, ");
    SQL.append("  LIQ C, ");
    SQL.append("  MAN D ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_LIQFATTUBUON, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DISTINTA = B.ANNO_DISTINTA) ");
    SQL.append("and   (A.NUMERO_DISTINTA = B.NUMERO_DISTINTA) ");
    SQL.append("and   (A.ANNO_PROG = ~~TBL_PARAMETRI413.PARAANNOPROG~~) ");
    SQL.append("and   (A.NUMERO_PROG = ~~TBL_PARAMETRI413.PARANUMEPROG~~) ");
    SQL.append("and   (A.ANNO_LIQ = C.ANNO_LIQ(+)) ");
    SQL.append("and   (A.NUMERO_LIQ = C.NUMERO_LIQ(+)) ");
    SQL.append("and   (C.ANNO_MAND = D.ANNO_MAND(+)) ");
    SQL.append("and   (C.NUMERO_MAND = D.NUMERO_MAND(+)) ");
    PAN_DISTINLIQUID.SetQuery(PPQRY_LIQFATTUBUON, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINLIQUID.SetQuery(PPQRY_LIQFATTUBUON, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINLIQUID.SetQuery(PPQRY_LIQFATTUBUON, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINLIQUID.SetQuery(PPQRY_LIQFATTUBUON, 5, SQL, -1, "");
    PAN_DISTINLIQUID.SetQueryDB(PPQRY_LIQFATTUBUON, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINLIQUID.SetMasterTable(0, "VISTA_LIQ_TECNICHE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINLIQUID.Status() == 2)
    {
      int oldListQBE = PAN_DISTINLIQUID.iUseListQBE;
      PAN_DISTINLIQUID.iUseListQBE = 0;
      PAN_DISTINLIQUID.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINLIQUID.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINLIQUID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DISTINLIQUID) PAN_DISTINLIQUID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
