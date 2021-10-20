// **********************************************
// Ordinativi Per Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiPerImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ORDPERIMPECO_ESPOSIZIONE = 0;
  private static int GRP_ORDPERIMPECO_DATAORDINATI = 1;
  private static int GRP_ORDPERIMPECO_ORDINAMENPER = 2;

  private static int PFL_ORDPERIMPECO_ESPOSIZIONE = 0;
  private static int PFL_ORDPERIMPECO_FATTORE = 1;
  private static int PFL_ORDPERIMPECO_FATTORDESCRI = 2;
  private static int PFL_ORDPERIMPECO_CENTRO = 3;
  private static int PFL_ORDPERIMPECO_CENTRIDESCRI = 4;
  private static int PFL_ORDPERIMPECO_DAL = 5;
  private static int PFL_ORDPERIMPECO_AL = 6;
  private static int PFL_ORDPERIMPECO_ORDINAMENTO = 7;
  private static int PFL_ORDPERIMPECO_ELABORA = 8;

  private static int PPQRY_PAR45 = 0;

  private static int PPQRY_FATTORE = 1;
  private static int PPQRY_CENTRO = 2;


  IDPanel PAN_ORDPERIMPECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR42(IMDB);
    //
    //
    Init_PQRY_PAR45(IMDB);
    Init_PQRY_PAR45_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR42(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR42, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR42, "TBL_PAR42");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMECENTR,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMEORDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMGESECO, "ROWNAMGESECO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR42,IMDBDef6.FLD_PAR42_ROWNAMGESECO,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR42, 0);
  }

  private static void Init_PQRY_PAR45(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR45, 6);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR45, "PQRY_PAR45");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMECENTR,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45,IMDBDef16.PQSL_PAR45_ROWNAMEORDIN,1,1,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR45, 0);
  }

  private static void Init_PQRY_PAR45_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR45_RS, 6);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR45_RS, "PQRY_PAR45_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEFATTO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMECENTR,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR45_RS,IMDBDef16.PQSL_PAR45_ROWNAMEORDIN,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiPerImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiPerImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_ORDPERIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CA0722BD-7C10-4A85-9966-FF2403015D44";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 484;
    DesignHeight = 234;
    set_Caption(new IDVariant("Ordinativi Per Imputazione Economica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 484;
    Frames[1].Height = 208;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Ordinativi Per Imputazione Economica";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 208;
    PAN_ORDPERIMPECO = new IDPanel(w, this, 1, "PAN_ORDPERIMPECO");
    Frames[1].Content = PAN_ORDPERIMPECO;
    PAN_ORDPERIMPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDPERIMPECO.VS = MainFrm.VisualStyleList;
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 484-MyGlb.PAN_OFFS_X, 208-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D29B3892-CDFF-42B9-9747-82775009BA39");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1144, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDPERIMPECO.InitStatus = 2;
    PAN_ORDPERIMPECO_Init();
    PAN_ORDPERIMPECO_InitFields();
    PAN_ORDPERIMPECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR42, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDPERIMPECO_PAR45();
      }
      PAN_ORDPERIMPECO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_ORDPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDPERIMPECO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_ORDPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ORDPERIMPECO_CENTRO) {
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
    return (obj instanceof OrdinativiPerImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiPerImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(OrdinativiPerImputazioneEconomica.class) ? OrdinativiPerImputazioneEconomica.class.getName().substring(OrdinativiPerImputazioneEconomica.class.getPackage().getName().length() + 1) : OrdinativiPerImputazioneEconomica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Fattore
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerImputazioneEconomica", "ApriFattore", _e);
      return -1;
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
      if (IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEDAL, 0), true)<0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Al inferiore a Data Dal", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("DATA_DAL"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("DATA_AL"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("FATTORE"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("CENTRO"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("ESPOSIZIONE"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("ORDINAMENTO"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("GEST_ECON"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Ordinativi_per_Imputazione"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEFATTO, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMECENTR, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEESPOS, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(((IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEORDIN, 0).equals((new IDVariant()), true))?(new IDVariant(1)):IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEORDIN, 0))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IMDB.Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMGESECO, 0));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerImputazioneEconomica", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Centro
  // **********************************************************************
  public int ApriCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerImputazioneEconomica", "ApriCentro", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEESPOS, 0, (new IDVariant("F")));
      IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMGESECO, 0, (new IDVariant("N")));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_ORDPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ORDPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEORDIN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerImputazioneEconomica", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMECENTR, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerImputazioneEconomica", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEFATTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMECENTR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMGESECO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerImputazioneEconomica", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Per Imputazione Economica On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ORDPERIMPECO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Per Imputazione Economica On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ORDPERIMPECO_CENTRO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMECENTR, 0))))
        {
          if (MainFrm.CentriPresente(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMECENTR, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Centro non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMECENTR, 0, PAN_ORDPERIMPECO.GetOrgValue(PFL_ORDPERIMPECO_CENTRO));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_ORDPERIMPECO_FATTORE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEFATTO, 0))))
        {
          if (MainFrm.FattorePresente(IMDB.Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEFATTO, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME)), (new IDVariant(""))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Fattore non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR45, IMDBDef16.PQSL_PAR45_ROWNAMEFATTO, 0, PAN_ORDPERIMPECO.GetOrgValue(PFL_ORDPERIMPECO_FATTORE));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiPerImputazioneEconomica", "OrdinativiPerImputazioneEconomicaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ORDPERIMPECO_PAR45() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR45_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR42, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR42, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR45_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR45_RS, 0, IMDBDef6.TBL_PAR42, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR45_RS, 0, 0, IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEESPOS, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR45_RS, 1, 0, IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR45_RS, 2, 0, IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMECENTR, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR45_RS, 3, 0, IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR45_RS, 4, 0, IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR45_RS, 5, 0, IMDBDef6.TBL_PAR42, IMDBDef6.FLD_PAR42_ROWNAMEORDIN, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR42, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR42, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR42, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR45_RS, 0);
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
  private void PAN_ORDPERIMPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDPERIMPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDPERIMPECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDPERIMPECO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDPERIMPECO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ORDPERIMPECO);
    // Stub
  }

  private void PAN_ORDPERIMPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDPERIMPECO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_ORDPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDPERIMPECO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_ORDPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDPERIMPECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ORDPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDPERIMPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ORDPERIMPECO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ORDPERIMPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDPERIMPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDPERIMPECO_Init()
  {

    PAN_ORDPERIMPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDPERIMPECO.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, "BAC4BA8D-594F-4711-90E6-A85897175DE5");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 4, 7, 76, 81, 0, 0);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, 0, 65);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, 1, 13);
    PAN_ORDPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, 0, 4);
    PAN_ORDPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, 1, 4);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, "9BA9F07B-4D1F-48A1-99E4-018D2D4CA3DB");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, "Data Ordinativi");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, MyGlb.PANEL_LIST, 216, -9999, 208, 16, 0, 0);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, MyGlb.PANEL_FORM, 4, 95, 320, 49, 0, 0);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, 0, 85);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, 1, 13);
    PAN_ORDPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, 0, 4);
    PAN_ORDPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, 1, 4);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_DATAORDINATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, "FE486810-E4BC-4699-AAEC-55FC815D65FF");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, "Ordinamento Per");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, MyGlb.VIS_GROUPSTYLE);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, MyGlb.PANEL_LIST, 424, -9999, 104, 16, 0, 0);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, MyGlb.PANEL_FORM, 332, 95, 116, 49, 0, 0);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, 0, 96);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, 1, 13);
    PAN_ORDPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, 0, 4);
    PAN_ORDPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, 1, 4);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_ORDPERIMPECO_ORDINAMENPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ORDPERIMPECO.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, "811174EA-FD62-4BF4-B0E1-76604DBCD5ED");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, "EB494D2E-6AC1-4B4A-9444-10488451EEB1");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, "Fattore");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, "1053E330-1D3C-4EDE-9736-328461C3F57F");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, "7E06E5FA-BDFA-445A-AF28-E2B672DD1FF3");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, "Centro");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, "E227B1A7-CFA6-4BCE-821C-B43EF2BF8038");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, "A17F518B-5DAA-4944-B6DD-52A1A00A4A0D");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, "Dal");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, "8D1B3302-8063-48F5-A612-5A6EB5F96053");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, "Al");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, "75BB708C-4C55-47D9-AE04-2BFE4B7F8B97");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, "Ordinamento");
    PAN_ORDPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, "");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, "704E75E7-C4B1-4E40-B3AF-80D704345686");
    PAN_ORDPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, "Elabora");
    PAN_ORDPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ORDPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, 0, "button1.gif", false);
    PAN_ORDPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ORDPERIMPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, "Esposizione");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 8, 32, 68, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 4);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, "Esposizione");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_ESPOSIZIONE, -1, GRP_ORDPERIMPECO_ESPOSIZIONE);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_ESPOSIZIONE, PPQRY_PAR45, "A.ROWNAMEESPOS", "ROWNAMEESPOS", 5, 1, 0, -13997);
    PAN_ORDPERIMPECO.SetValueListItem(PFL_ORDPERIMPECO_ESPOSIZIONE, (new IDVariant("F")), "Fattore", "", "", -1);
    PAN_ORDPERIMPECO.SetValueListItem(PFL_ORDPERIMPECO_ESPOSIZIONE, (new IDVariant("C")), "Centro", "", "", -1);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 96, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 44);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 84, 32, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_FATTORE, -1, -1);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_FATTORE, PPQRY_PAR45, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 8, 0, -13997);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 228, 33, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_FATTORDESCRI, -1, -1);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_FATTORDESCRI, PPQRY_FATTORE, "A.DESCRIZIONE", "ROWNAMFATDES", 5, 200, 0, -13997);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 160, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 44);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 84, 56, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_CENTRO, -1, -1);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_CENTRO, PPQRY_PAR45, "A.ROWNAMECENTR", "ROWNAMECENTR", 5, 8, 0, -13997);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 228, 56, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_CENTRIDESCRI, -1, -1);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_CENTRIDESCRI, PPQRY_CENTRO, "A.DESCRIZIONE", "ROWNAMCENDES", 5, 200, 0, -13997);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_LIST, 216, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_FORM, 8, 120, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_FORM, 28);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_DAL, -1, GRP_ORDPERIMPECO_DATAORDINATI);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_DAL, PPQRY_PAR45, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_LIST, 320, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_LIST, 20);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_FORM, 208, 120, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_FORM, 24);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_AL, -1, GRP_ORDPERIMPECO_DATAORDINATI);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_AL, PPQRY_PAR45, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, 424, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, 336, 120, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_ORDINAMENTO, -1, GRP_ORDPERIMPECO_ORDINAMENPER);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_ORDINAMENTO, PPQRY_PAR45, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 1, 1, 0, -13997);
    PAN_ORDPERIMPECO.SetValueListItem(PFL_ORDPERIMPECO_ORDINAMENTO, (new IDVariant()), "Data Ordinativo", "", "", -1);
    PAN_ORDPERIMPECO.SetValueListItem(PFL_ORDPERIMPECO_ORDINAMENTO, (new IDVariant(3)), "Debitore", "", "", -1);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 232, 160, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ORDPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 364, 160, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ORDPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ORDPERIMPECO.SetFieldPage(PFL_ORDPERIMPECO_ELABORA, -1, -1);
    PAN_ORDPERIMPECO.SetFieldPanel(PFL_ORDPERIMPECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ORDPERIMPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDPERIMPECO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMFATDES ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    PAN_ORDPERIMPECO.SetQuery(PPQRY_FATTORE, 0, SQL, -1, "");
    PAN_ORDPERIMPECO.SetQueryDB(PPQRY_FATTORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDPERIMPECO.SetMasterTable(PPQRY_FATTORE, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMCENDES ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~ROWNAMECENTR~~) ");
    PAN_ORDPERIMPECO.SetQuery(PPQRY_CENTRO, 0, SQL, -1, "");
    PAN_ORDPERIMPECO.SetQueryDB(PPQRY_CENTRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDPERIMPECO.SetMasterTable(PPQRY_CENTRO, "CENTRI");
    PAN_ORDPERIMPECO.SetIMDB(IMDB, "PQRY_PAR45", true);
    PAN_ORDPERIMPECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ORDPERIMPECO.SetQueryIMDB(PPQRY_PAR45, IMDBDef16.PQRY_PAR45_RS, IMDBDef6.TBL_PAR42);
    JustLoaded = true;
    PAN_ORDPERIMPECO.SetFieldPrimaryIndex(PFL_ORDPERIMPECO_ESPOSIZIONE, IMDBDef6.FLD_PAR42_ROWNAMEESPOS);
    PAN_ORDPERIMPECO.SetFieldPrimaryIndex(PFL_ORDPERIMPECO_FATTORE, IMDBDef6.FLD_PAR42_ROWNAMEFATTO);
    PAN_ORDPERIMPECO.SetFieldPrimaryIndex(PFL_ORDPERIMPECO_CENTRO, IMDBDef6.FLD_PAR42_ROWNAMECENTR);
    PAN_ORDPERIMPECO.SetFieldPrimaryIndex(PFL_ORDPERIMPECO_DAL, IMDBDef6.FLD_PAR42_ROWNAMEDAL);
    PAN_ORDPERIMPECO.SetFieldPrimaryIndex(PFL_ORDPERIMPECO_AL, IMDBDef6.FLD_PAR42_ROWNAMEAL);
    PAN_ORDPERIMPECO.SetFieldPrimaryIndex(PFL_ORDPERIMPECO_ORDINAMENTO, IMDBDef6.FLD_PAR42_ROWNAMEORDIN);
    PAN_ORDPERIMPECO.SetMasterTable(0, "PAR42");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDPERIMPECO.Status() == 2)
    {
      int oldListQBE = PAN_ORDPERIMPECO.iUseListQBE;
      PAN_ORDPERIMPECO.iUseListQBE = 0;
      PAN_ORDPERIMPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDPERIMPECO.PanelCommand(Glb.PCM_FIND);
      PAN_ORDPERIMPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDPERIMPECO) PAN_ORDPERIMPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDPERIMPECO) PAN_ORDPERIMPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDPERIMPECO) PAN_ORDPERIMPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDPERIMPECO) PAN_ORDPERIMPECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDPERIMPECO) PAN_ORDPERIMPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
