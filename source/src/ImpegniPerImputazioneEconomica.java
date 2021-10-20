// **********************************************
// Impegni Per Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ImpegniPerImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_IMPPERIMPECO_ESPOSIZIONE = 0;
  private static int GRP_IMPPERIMPECO_DATAIMPEGNI = 1;
  private static int GRP_IMPPERIMPECO_NUOVOGRUPPO = 2;

  private static int PFL_IMPPERIMPECO_ESPOSIZIONE = 0;
  private static int PFL_IMPPERIMPECO_FATTORE = 1;
  private static int PFL_IMPPERIMPECO_FATTORDESCRI = 2;
  private static int PFL_IMPPERIMPECO_CENTRO = 3;
  private static int PFL_IMPPERIMPECO_CENTRIDESCRI = 4;
  private static int PFL_IMPPERIMPECO_DAL = 5;
  private static int PFL_IMPPERIMPECO_AL = 6;
  private static int PFL_IMPPERIMPECO_NEWPANELLABE = 7;
  private static int PFL_IMPPERIMPECO_ETICHETTASF1 = 8;
  private static int PFL_IMPPERIMPECO_COMPTENZE = 9;
  private static int PFL_IMPPERIMPECO_ETICHETTASF = 10;
  private static int PFL_IMPPERIMPECO_SOLORILEECON = 11;
  private static int PFL_IMPPERIMPECO_ELABORA = 12;

  private static int PPQRY_PAR61 = 0;

  private static int PPQRY_FATTORE = 1;
  private static int PPQRY_CENTRO = 2;


  IDPanel PAN_IMPPERIMPECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR104(IMDB);
    //
    //
    Init_PQRY_PAR61(IMDB);
    Init_PQRY_PAR61_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR104(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR104, 8);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR104, "TBL_PAR104");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMECOMPT, "ROWNAMECOMPT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMECOMPT,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMGESECO, "ROWNAMGESECO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMGESECO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR104,IMDBDef6.FLD_PAR104_ROWNAMSORIEC,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR104, 0);
  }

  private static void Init_PQRY_PAR61(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR61, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR61, "PQRY_PAR61");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMECOMPT, "ROWNAMECOMPT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMECOMPT,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61,IMDBDef16.PQSL_PAR61_ROWNAMSORIEC,5,1,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR61, 0);
  }

  private static void Init_PQRY_PAR61_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR61_RS, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR61_RS, "PQRY_PAR61_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMECOMPT, "ROWNAMECOMPT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMECOMPT,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR61_RS,IMDBDef16.PQSL_PAR61_ROWNAMSORIEC,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ImpegniPerImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public ImpegniPerImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_IMPPERIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C58B960E-D673-4EF7-95E5-F51C946CA298";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 656;
    DesignHeight = 314;
    set_Caption(new IDVariant("Impegni Per Imputazione Economica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 656;
    Frames[1].Height = 288;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Impegni Per Imputazione Economica";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 288;
    PAN_IMPPERIMPECO = new IDPanel(w, this, 1, "PAN_IMPPERIMPECO");
    Frames[1].Content = PAN_IMPPERIMPECO;
    PAN_IMPPERIMPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPPERIMPECO.VS = MainFrm.VisualStyleList;
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 656-MyGlb.PAN_OFFS_X, 288-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0E6C3BC4-1A75-4547-8DC4-27B3CB31C74A");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1232, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPPERIMPECO.InitStatus = 2;
    PAN_IMPPERIMPECO_Init();
    PAN_IMPPERIMPECO_InitFields();
    PAN_IMPPERIMPECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR104, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        IMPPERIMPECO_PAR61();
      }
      PAN_IMPPERIMPECO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_IMPPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPPERIMPECO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_IMPPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMPPERIMPECO_CENTRO) {
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
    return (obj instanceof ImpegniPerImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ImpegniPerImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(ImpegniPerImputazioneEconomica.class) ? ImpegniPerImputazioneEconomica.class.getName().substring(ImpegniPerImputazioneEconomica.class.getPackage().getName().length() + 1) : ImpegniPerImputazioneEconomica.class.getName()));
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
      MainFrm.ErrObj.ProcError ("ImpegniPerImputazioneEconomica", "ApriFattore", _e);
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
      if (IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEDAL, 0), true)<0)
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
        v_NOMEPAR6 = (new IDVariant("RES_COMP"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("ESPOSIZIONE"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("RIL_ECO"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("GEST_ECON"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Impegni_per_Imputazione"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEFATTO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMECENTR, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMECOMPT, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEESPOS, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMSORIEC, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IMDB.Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMGESECO, 0));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerImputazioneEconomica", "Elabora", _e);
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
      MainFrm.ErrObj.ProcError ("ImpegniPerImputazioneEconomica", "ApriCentro", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEESPOS, 0, (new IDVariant("F")));
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMGESECO, 0, (new IDVariant("N")));
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMGESECO, 0, (new IDVariant("Y")));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_IMPPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMPPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMSORIEC, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMECOMPT, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerImputazioneEconomica", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMECENTR, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerImputazioneEconomica", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEFATTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMECENTR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMGESECO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerImputazioneEconomica", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Impegni Per Imputazione Economica On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_IMPPERIMPECO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegni Per Imputazione Economica On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_IMPPERIMPECO_CENTRO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMECENTR, 0))))
        {
          if (MainFrm.CentriPresente(IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMECENTR, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Centro non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMECENTR, 0, PAN_IMPPERIMPECO.GetOrgValue(PFL_IMPPERIMPECO_CENTRO));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_IMPPERIMPECO_FATTORE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEFATTO, 0))))
        {
          if (MainFrm.FattorePresente(IMDB.Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEFATTO, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME)), (new IDVariant(""))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Fattore non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR61, IMDBDef16.PQSL_PAR61_ROWNAMEFATTO, 0, PAN_IMPPERIMPECO.GetOrgValue(PFL_IMPPERIMPECO_FATTORE));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ImpegniPerImputazioneEconomica", "ImpegniPerImputazioneEconomicaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void IMPPERIMPECO_PAR61() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR61_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR104, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR104, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR61_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR61_RS, 0, IMDBDef6.TBL_PAR104, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR61_RS, 0, 0, IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEESPOS, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR61_RS, 1, 0, IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR61_RS, 2, 0, IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMECENTR, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR61_RS, 3, 0, IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR61_RS, 4, 0, IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR61_RS, 5, 0, IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMECOMPT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR61_RS, 6, 0, IMDBDef6.TBL_PAR104, IMDBDef6.FLD_PAR104_ROWNAMSORIEC, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR104, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR104, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR104, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR61_RS, 0);
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
  private void PAN_IMPPERIMPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMPPERIMPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPPERIMPECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPPERIMPECO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPPERIMPECO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_IMPPERIMPECO);
    // Stub
  }

  private void PAN_IMPPERIMPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMPPERIMPECO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_IMPPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPPERIMPECO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_IMPPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMPPERIMPECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_IMPPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMPPERIMPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_IMPPERIMPECO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_IMPPERIMPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPPERIMPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPPERIMPECO_Init()
  {

    PAN_IMPPERIMPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPPERIMPECO.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, "43E17DDD-2805-4E72-9808-7D83103C7574");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 4, 7, 76, 69, 0, 0);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, 0, 65);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, 1, 13);
    PAN_IMPPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, 0, 4);
    PAN_IMPPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, 1, 4);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, "419B12E6-C86F-4BA8-9AC0-C3D5E2462261");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, "Data Impegni");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, MyGlb.PANEL_LIST, 216, -9999, 208, 16, 0, 0);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, MyGlb.PANEL_FORM, 4, 83, 308, 65, 0, 0);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, 0, 77);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, 1, 13);
    PAN_IMPPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, 0, 4);
    PAN_IMPPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, 1, 4);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_DATAIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, "F7C7A47C-BDB5-4E28-AE07-694311C6E899");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, "Nuovo Gruppo");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, MyGlb.VIS_GROUPSTYLE);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, MyGlb.PANEL_LIST, 0, -9999, 64, 0, 0, 0);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, MyGlb.PANEL_FORM, 320, 84, 236, 64, 0, 0);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, 0, 79);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, 1, 13);
    PAN_IMPPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, 0, 1);
    PAN_IMPPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, 1, 1);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_IMPPERIMPECO_NUOVOGRUPPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_IMPPERIMPECO.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, "0558EDFD-FA88-4F11-9F1C-AD3119A0A732");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, "DA40755F-A8C6-4330-BCA7-9C61F2D5A815");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, "Fattore");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, "45BD47F8-D7DE-4FE8-8125-F8B3ADF102CE");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, "A695343E-6DE6-4BC1-AC47-E300277F6D41");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, "Centro");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, "47AB3EF8-75EC-46DC-B38D-DEE6E36CE59F");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, "B39ECE3C-0F4F-408D-A6B6-083CDA459E4F");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, "Dal");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, "E94DEF19-DF6E-4123-8FBE-46AEC81F5DAB");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, "Al");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, "26EA2E3F-591C-488F-9EB9-9F120AFCA8E7");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, "08043594-29B9-40D1-9964-5BF5961405A6");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, "1AE51776-8B5B-429E-9402-328B3B9665EF");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, "Comptenze");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, "66E68B93-2DD2-4641-B5B1-375005E0911B");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, "B07B937B-D6C8-4FC6-9DE6-853CC11986A2");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, "Solo Rilevanti Economica");
    PAN_IMPPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, "");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.VIS_CHECKSTYLE);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMPPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, "D60035F2-8B67-43FD-A429-BC35EA36BE7E");
    PAN_IMPPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, "Elabora");
    PAN_IMPPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_IMPPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, 0, "button1.gif", false);
    PAN_IMPPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_IMPPERIMPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, "Esposizione");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 8, 32, 68, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, "Esposizione");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_ESPOSIZIONE, -1, GRP_IMPPERIMPECO_ESPOSIZIONE);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_ESPOSIZIONE, PPQRY_PAR61, "A.ROWNAMEESPOS", "ROWNAMEESPOS", 5, 1, 0, -13997);
    PAN_IMPPERIMPECO.SetValueListItem(PFL_IMPPERIMPECO_ESPOSIZIONE, (new IDVariant("F")), "Fattore", "", "", -1);
    PAN_IMPPERIMPECO.SetValueListItem(PFL_IMPPERIMPECO_ESPOSIZIONE, (new IDVariant("C")), "Centro", "", "", -1);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 96, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 44);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 84, 32, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_FATTORE, -1, -1);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_FATTORE, PPQRY_PAR61, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 16, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 276, 32, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_FATTORDESCRI, -1, -1);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_FATTORDESCRI, PPQRY_FATTORE, "A.DESCRIZIONE", "ROWNAMFATDES", 5, 200, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 160, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 44);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 84, 56, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_CENTRO, -1, -1);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_CENTRO, PPQRY_PAR61, "A.ROWNAMECENTR", "ROWNAMECENTR", 5, 16, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 276, 55, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_CENTRIDESCRI, -1, -1);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_CENTRIDESCRI, PPQRY_CENTRO, "A.DESCRIZIONE", "ROWNAMCENDES", 5, 200, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_LIST, 216, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_LIST, 24);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_FORM, 8, 108, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_FORM, 32);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_DAL, -1, GRP_IMPPERIMPECO_DATAIMPEGNI);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_DAL, PPQRY_PAR61, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_LIST, 320, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_LIST, 20);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_LIST, "Al");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_FORM, 196, 108, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_FORM, 24);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_AL, MyGlb.PANEL_FORM, "Al");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_AL, -1, GRP_IMPPERIMPECO_DATAIMPEGNI);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_AL, PPQRY_PAR61, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 132, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 132, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_NEWPANELLABE, -1, GRP_IMPPERIMPECO_DATAIMPEGNI);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, MyGlb.PANEL_LIST, 252, 152, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, MyGlb.PANEL_FORM, 252, 136, 16, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_ETICHETTASF1, -1, GRP_IMPPERIMPECO_DATAIMPEGNI);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, 64);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, "Compt.");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, 412, 88, 140, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, 64);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, 4);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, "Compt.");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_COMPTENZE, -1, GRP_IMPPERIMPECO_NUOVOGRUPPO);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_COMPTENZE, PPQRY_PAR61, "A.ROWNAMECOMPT", "ROWNAMECOMPT", 5, 1, 0, -13997);
    PAN_IMPPERIMPECO.SetValueListItem(PFL_IMPPERIMPECO_COMPTENZE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_IMPPERIMPECO.SetValueListItem(PFL_IMPPERIMPECO_COMPTENZE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_IMPPERIMPECO.SetValueListItem(PFL_IMPPERIMPECO_COMPTENZE, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, MyGlb.PANEL_LIST, 336, 88, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, MyGlb.PANEL_FORM, 324, 104, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_ETICHETTASF, -1, GRP_IMPPERIMPECO_NUOVOGRUPPO);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 128);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, "Solo Rilevanti Economica");
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 4, 204, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 156);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, "Solo Rilevanti Economica");
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_SOLORILEECON, -1, -1);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_SOLORILEECON, PPQRY_PAR61, "A.ROWNAMSORIEC", "ROWNAMSORIEC", 5, 1, 0, -13997);
    PAN_IMPPERIMPECO.SetValueListItem(PFL_IMPPERIMPECO_SOLORILEECON, (new IDVariant("S")), "S", "", "", -1);
    PAN_IMPPERIMPECO.SetValueListItem(PFL_IMPPERIMPECO_SOLORILEECON, (new IDVariant("N")), "N", "", "", -1);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 232, 160, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_IMPPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 364, 216, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_IMPPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_IMPPERIMPECO.SetFieldPage(PFL_IMPPERIMPECO_ELABORA, -1, -1);
    PAN_IMPPERIMPECO.SetFieldPanel(PFL_IMPPERIMPECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_IMPPERIMPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPPERIMPECO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMFATDES ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    PAN_IMPPERIMPECO.SetQuery(PPQRY_FATTORE, 0, SQL, -1, "");
    PAN_IMPPERIMPECO.SetQueryDB(PPQRY_FATTORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPPERIMPECO.SetMasterTable(PPQRY_FATTORE, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMCENDES ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~ROWNAMECENTR~~) ");
    PAN_IMPPERIMPECO.SetQuery(PPQRY_CENTRO, 0, SQL, -1, "");
    PAN_IMPPERIMPECO.SetQueryDB(PPQRY_CENTRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPPERIMPECO.SetMasterTable(PPQRY_CENTRO, "CENTRI");
    PAN_IMPPERIMPECO.SetIMDB(IMDB, "PQRY_PAR61", true);
    PAN_IMPPERIMPECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_IMPPERIMPECO.SetQueryIMDB(PPQRY_PAR61, IMDBDef16.PQRY_PAR61_RS, IMDBDef6.TBL_PAR104);
    JustLoaded = true;
    PAN_IMPPERIMPECO.SetFieldPrimaryIndex(PFL_IMPPERIMPECO_ESPOSIZIONE, IMDBDef6.FLD_PAR104_ROWNAMEESPOS);
    PAN_IMPPERIMPECO.SetFieldPrimaryIndex(PFL_IMPPERIMPECO_FATTORE, IMDBDef6.FLD_PAR104_ROWNAMEFATTO);
    PAN_IMPPERIMPECO.SetFieldPrimaryIndex(PFL_IMPPERIMPECO_CENTRO, IMDBDef6.FLD_PAR104_ROWNAMECENTR);
    PAN_IMPPERIMPECO.SetFieldPrimaryIndex(PFL_IMPPERIMPECO_DAL, IMDBDef6.FLD_PAR104_ROWNAMEDAL);
    PAN_IMPPERIMPECO.SetFieldPrimaryIndex(PFL_IMPPERIMPECO_AL, IMDBDef6.FLD_PAR104_ROWNAMEAL);
    PAN_IMPPERIMPECO.SetFieldPrimaryIndex(PFL_IMPPERIMPECO_COMPTENZE, IMDBDef6.FLD_PAR104_ROWNAMECOMPT);
    PAN_IMPPERIMPECO.SetFieldPrimaryIndex(PFL_IMPPERIMPECO_SOLORILEECON, IMDBDef6.FLD_PAR104_ROWNAMSORIEC);
    PAN_IMPPERIMPECO.SetMasterTable(0, "PAR104");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPPERIMPECO.Status() == 2)
    {
      int oldListQBE = PAN_IMPPERIMPECO.iUseListQBE;
      PAN_IMPPERIMPECO.iUseListQBE = 0;
      PAN_IMPPERIMPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPPERIMPECO.PanelCommand(Glb.PCM_FIND);
      PAN_IMPPERIMPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPPERIMPECO) PAN_IMPPERIMPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPPERIMPECO) PAN_IMPPERIMPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPPERIMPECO) PAN_IMPPERIMPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPPERIMPECO) PAN_IMPPERIMPECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPPERIMPECO) PAN_IMPPERIMPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
