// **********************************************
// Subimpegni Per Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SubimpegniPerImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SUBPERIMPECO_ESPOSIZIONE = 0;
  private static int GRP_SUBPERIMPECO_DATAORDINATI = 1;
  private static int GRP_SUBPERIMPECO_ORDINAMENPER = 2;

  private static int PFL_SUBPERIMPECO_ESPOSIZIONE = 0;
  private static int PFL_SUBPERIMPECO_FATTORE = 1;
  private static int PFL_SUBPERIMPECO_FATTORDESCRI = 2;
  private static int PFL_SUBPERIMPECO_CENTRO = 3;
  private static int PFL_SUBPERIMPECO_CENTRIDESCRI = 4;
  private static int PFL_SUBPERIMPECO_DAL = 5;
  private static int PFL_SUBPERIMPECO_AL = 6;
  private static int PFL_SUBPERIMPECO_NEWPANELLABE = 7;
  private static int PFL_SUBPERIMPECO_COMPTENZE = 8;
  private static int PFL_SUBPERIMPECO_SOLORILEECON = 9;
  private static int PFL_SUBPERIMPECO_ELABORA = 10;

  private static int PPQRY_PAR41 = 0;

  private static int PPQRY_FATTORE = 1;
  private static int PPQRY_CENTRO = 2;


  IDPanel PAN_SUBPERIMPECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR46(IMDB);
    //
    //
    Init_PQRY_PAR41(IMDB);
    Init_PQRY_PAR41_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR46(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR46, 8);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR46, "TBL_PAR46");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEFATTO,5,18,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMECOMPT, "ROWNAMECOMPT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMECOMPT,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMGESECO, "ROWNAMGESECO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMGESECO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR46,IMDBDef6.FLD_PAR46_ROWNAMSORIEC,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR46, 0);
  }

  private static void Init_PQRY_PAR41(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR41, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR41, "PQRY_PAR41");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEFATTO,5,18,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMECOMPT, "ROWNAMECOMPT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMECOMPT,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41,IMDBDef16.PQSL_PAR41_ROWNAMSORIEC,5,1,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR41, 0);
  }

  private static void Init_PQRY_PAR41_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR41_RS, 7);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR41_RS, "PQRY_PAR41_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEFATTO,5,18,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMECOMPT, "ROWNAMECOMPT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMECOMPT,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR41_RS,IMDBDef16.PQSL_PAR41_ROWNAMSORIEC,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SubimpegniPerImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public SubimpegniPerImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_SUBPERIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B22E3D4D-CA2B-4213-9AAA-F5AFB65AA24A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 226;
    set_Caption(new IDVariant("Subimpegni Per Imputazione Economica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 200;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Subimpegni Per Imputazione Economica";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 200;
    PAN_SUBPERIMPECO = new IDPanel(w, this, 1, "PAN_SUBPERIMPECO");
    Frames[1].Content = PAN_SUBPERIMPECO;
    PAN_SUBPERIMPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SUBPERIMPECO.VS = MainFrm.VisualStyleList;
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 200-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "18B83294-514A-48B9-A7DB-7B413A4E9733");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1232, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SUBPERIMPECO.InitStatus = 2;
    PAN_SUBPERIMPECO_Init();
    PAN_SUBPERIMPECO_InitFields();
    PAN_SUBPERIMPECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR46, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SUBPERIMPECO_PAR41();
      }
      PAN_SUBPERIMPECO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_SUBPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBPERIMPECO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_SUBPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBPERIMPECO_CENTRO) {
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
    return (obj instanceof SubimpegniPerImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SubimpegniPerImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(SubimpegniPerImputazioneEconomica.class) ? SubimpegniPerImputazioneEconomica.class.getName().substring(SubimpegniPerImputazioneEconomica.class.getPackage().getName().length() + 1) : SubimpegniPerImputazioneEconomica.class.getName()));
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
      MainFrm.ErrObj.ProcError ("SubimpegniPerImputazioneEconomica", "ApriFattore", _e);
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
      if (IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEDAL, 0), true)<0)
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
        v_NOMESTAMPA = (new IDVariant("SubImpegni_per_Imputazione"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEFATTO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMECENTR, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMECOMPT, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEESPOS, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMSORIEC, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IMDB.Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMGESECO, 0));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerImputazioneEconomica", "Elabora", _e);
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
      MainFrm.ErrObj.ProcError ("SubimpegniPerImputazioneEconomica", "ApriCentro", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEESPOS, 0, (new IDVariant("F")));
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMGESECO, 0, (new IDVariant("N")));
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMGESECO, 0, (new IDVariant("Y")));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_SUBPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_SUBPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMSORIEC, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMECOMPT, 0, (new IDVariant("E")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerImputazioneEconomica", "LoadEvent", _e);
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
        IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMECENTR, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerImputazioneEconomica", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEFATTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMECENTR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMGESECO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerImputazioneEconomica", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Imputazione Economica On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_SUBPERIMPECO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Subimpegni Per Imputazione Economica On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_SUBPERIMPECO_CENTRO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMECENTR, 0))))
        {
          if (MainFrm.CentriPresente(IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMECENTR, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Centro non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMECENTR, 0, PAN_SUBPERIMPECO.GetOrgValue(PFL_SUBPERIMPECO_CENTRO));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_SUBPERIMPECO_FATTORE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEFATTO, 0))))
        {
          if (MainFrm.FattorePresente(IMDB.Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEFATTO, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME)), (new IDVariant(""))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Fattore non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR41, IMDBDef16.PQSL_PAR41_ROWNAMEFATTO, 0, PAN_SUBPERIMPECO.GetOrgValue(PFL_SUBPERIMPECO_FATTORE));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerImputazioneEconomica", "SubimpegniPerImputazioneEconomicaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void SUBPERIMPECO_PAR41() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR41_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR46, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR46, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR41_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR41_RS, 0, IMDBDef6.TBL_PAR46, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR41_RS, 0, 0, IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEESPOS, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR41_RS, 1, 0, IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR41_RS, 2, 0, IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMECENTR, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR41_RS, 3, 0, IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR41_RS, 4, 0, IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR41_RS, 5, 0, IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMECOMPT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR41_RS, 6, 0, IMDBDef6.TBL_PAR46, IMDBDef6.FLD_PAR46_ROWNAMSORIEC, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR46, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR46, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR46, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR41_RS, 0);
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
  private void PAN_SUBPERIMPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SUBPERIMPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SUBPERIMPECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SUBPERIMPECO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SUBPERIMPECO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SUBPERIMPECO);
    // Stub
  }

  private void PAN_SUBPERIMPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SUBPERIMPECO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_SUBPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBPERIMPECO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_SUBPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBPERIMPECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SUBPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SUBPERIMPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SUBPERIMPECO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SUBPERIMPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SUBPERIMPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SUBPERIMPECO_Init()
  {

    PAN_SUBPERIMPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SUBPERIMPECO.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, "24A028F2-8633-4B91-9B65-77A4F5C3CBEF");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 4, 7, 76, 69, 0, 0);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, 0, 65);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, 1, 13);
    PAN_SUBPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, 0, 4);
    PAN_SUBPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, 1, 4);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, "5F78F1CC-EB3E-4C3A-B5CB-4C2ECB652432");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, "Data Ordinativi");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, MyGlb.PANEL_LIST, 216, -9999, 208, 16, 0, 0);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, MyGlb.PANEL_FORM, 4, 83, 344, 61, 0, 0);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, 0, 85);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, 1, 13);
    PAN_SUBPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, 0, 4);
    PAN_SUBPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, 1, 4);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_DATAORDINATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, "5B3115FC-7C2D-415F-92D6-D810066818B6");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, "Ordinamento Per");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, MyGlb.VIS_GROUPSTYLE);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, 0, 96);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, 1, 13);
    PAN_SUBPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, 0, 4);
    PAN_SUBPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, 1, 4);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_SUBPERIMPECO_ORDINAMENPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SUBPERIMPECO.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, "3BD28401-70F2-437D-8B5C-1C620C622701");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, "4875DF09-FA18-4AA2-888F-2AA4A12DCE4C");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, "Fattore");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, "DD906B9F-5D12-400B-A301-0357D3141C31");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, "876E25B2-CAA3-49E8-9C02-47B71C0934A7");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, "Centro");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, "2211D589-FE4B-4878-B2F2-EB3825F9F1FA");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, "18596232-221F-46AF-AE76-6107C47A8A16");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, "Dal");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, "B22EB033-15AA-470B-A459-CE400ED7CB0A");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, "Al");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, "88BFDDB7-3EBC-4E6D-AA57-77598837D9EC");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, "1DB140E7-06B8-45C7-8640-12437055C17A");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, "Comptenze");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.VIS_OPTIONBUTTON);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, "476C63BA-6FEC-4170-B212-558B1F3C3971");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, "Solo Rilevanti Economica");
    PAN_SUBPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, "");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.VIS_CHECKSTYLE);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, "E4D57C12-1252-4CF7-86EB-618894E382B3");
    PAN_SUBPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, "Elabora");
    PAN_SUBPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SUBPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, 0, "button1.gif", false);
    PAN_SUBPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SUBPERIMPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, "Esposizione");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 8, 32, 68, 40, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, "Esposizione");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_ESPOSIZIONE, -1, GRP_SUBPERIMPECO_ESPOSIZIONE);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_ESPOSIZIONE, PPQRY_PAR41, "A.ROWNAMEESPOS", "ROWNAMEESPOS", 5, 1, 0, -13997);
    PAN_SUBPERIMPECO.SetValueListItem(PFL_SUBPERIMPECO_ESPOSIZIONE, (new IDVariant("F")), "Fattore", "", "", -1);
    PAN_SUBPERIMPECO.SetValueListItem(PFL_SUBPERIMPECO_ESPOSIZIONE, (new IDVariant("C")), "Centro", "", "", -1);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 96, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 44);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 84, 32, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_FATTORE, -1, -1);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_FATTORE, PPQRY_PAR41, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 18, 0, -13997);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 284, 32, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_FATTORDESCRI, -1, -1);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_FATTORDESCRI, PPQRY_FATTORE, "A.DESCRIZIONE", "ROWNAMFATDES", 5, 200, 0, -13997);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 160, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 44);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 84, 56, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_CENTRO, -1, -1);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_CENTRO, PPQRY_PAR41, "A.ROWNAMECENTR", "ROWNAMECENTR", 5, 16, 0, -13997);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 284, 55, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_CENTRIDESCRI, -1, -1);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_CENTRIDESCRI, PPQRY_CENTRO, "A.DESCRIZIONE", "ROWNAMCENDES", 5, 200, 0, -13997);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_LIST, 216, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_LIST, 24);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_FORM, 92, 108, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_FORM, 32);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_DAL, -1, GRP_SUBPERIMPECO_DATAORDINATI);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_DAL, PPQRY_PAR41, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_LIST, 320, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_LIST, 20);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_LIST, "Al");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_FORM, 232, 108, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_FORM, 24);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_AL, MyGlb.PANEL_FORM, "Al");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_AL, -1, GRP_SUBPERIMPECO_DATAORDINATI);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_AL, PPQRY_PAR41, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 132, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 8, 128, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_NEWPANELLABE, -1, GRP_SUBPERIMPECO_DATAORDINATI);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, 64);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_LIST, "Compt.");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, 360, 80, 148, 64, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, 64);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, 4);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_COMPTENZE, MyGlb.PANEL_FORM, "Compt.");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_COMPTENZE, -1, -1);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_COMPTENZE, PPQRY_PAR41, "A.ROWNAMECOMPT", "ROWNAMECOMPT", 5, 1, 0, -13997);
    PAN_SUBPERIMPECO.SetValueListItem(PFL_SUBPERIMPECO_COMPTENZE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_SUBPERIMPECO.SetValueListItem(PFL_SUBPERIMPECO_COMPTENZE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_SUBPERIMPECO.SetValueListItem(PFL_SUBPERIMPECO_COMPTENZE, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 128);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, "Solo Rilevanti Economica");
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 4, 152, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 152);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, "Solo Rilevanti Economica");
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_SOLORILEECON, -1, -1);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_SOLORILEECON, PPQRY_PAR41, "A.ROWNAMSORIEC", "ROWNAMSORIEC", 5, 1, 0, -13997);
    PAN_SUBPERIMPECO.SetValueListItem(PFL_SUBPERIMPECO_SOLORILEECON, (new IDVariant("S")), "S", "", "", -1);
    PAN_SUBPERIMPECO.SetValueListItem(PFL_SUBPERIMPECO_SOLORILEECON, (new IDVariant("N")), "N", "", "", -1);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 232, 160, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SUBPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 368, 152, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SUBPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SUBPERIMPECO.SetFieldPage(PFL_SUBPERIMPECO_ELABORA, -1, -1);
    PAN_SUBPERIMPECO.SetFieldPanel(PFL_SUBPERIMPECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_SUBPERIMPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_SUBPERIMPECO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMFATDES ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    PAN_SUBPERIMPECO.SetQuery(PPQRY_FATTORE, 0, SQL, -1, "");
    PAN_SUBPERIMPECO.SetQueryDB(PPQRY_FATTORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBPERIMPECO.SetMasterTable(PPQRY_FATTORE, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMCENDES ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~ROWNAMECENTR~~) ");
    PAN_SUBPERIMPECO.SetQuery(PPQRY_CENTRO, 0, SQL, -1, "");
    PAN_SUBPERIMPECO.SetQueryDB(PPQRY_CENTRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBPERIMPECO.SetMasterTable(PPQRY_CENTRO, "CENTRI");
    PAN_SUBPERIMPECO.SetIMDB(IMDB, "PQRY_PAR41", true);
    PAN_SUBPERIMPECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SUBPERIMPECO.SetQueryIMDB(PPQRY_PAR41, IMDBDef16.PQRY_PAR41_RS, IMDBDef6.TBL_PAR46);
    JustLoaded = true;
    PAN_SUBPERIMPECO.SetFieldPrimaryIndex(PFL_SUBPERIMPECO_ESPOSIZIONE, IMDBDef6.FLD_PAR46_ROWNAMEESPOS);
    PAN_SUBPERIMPECO.SetFieldPrimaryIndex(PFL_SUBPERIMPECO_FATTORE, IMDBDef6.FLD_PAR46_ROWNAMEFATTO);
    PAN_SUBPERIMPECO.SetFieldPrimaryIndex(PFL_SUBPERIMPECO_CENTRO, IMDBDef6.FLD_PAR46_ROWNAMECENTR);
    PAN_SUBPERIMPECO.SetFieldPrimaryIndex(PFL_SUBPERIMPECO_DAL, IMDBDef6.FLD_PAR46_ROWNAMEDAL);
    PAN_SUBPERIMPECO.SetFieldPrimaryIndex(PFL_SUBPERIMPECO_AL, IMDBDef6.FLD_PAR46_ROWNAMEAL);
    PAN_SUBPERIMPECO.SetFieldPrimaryIndex(PFL_SUBPERIMPECO_COMPTENZE, IMDBDef6.FLD_PAR46_ROWNAMECOMPT);
    PAN_SUBPERIMPECO.SetFieldPrimaryIndex(PFL_SUBPERIMPECO_SOLORILEECON, IMDBDef6.FLD_PAR46_ROWNAMSORIEC);
    PAN_SUBPERIMPECO.SetMasterTable(0, "PAR46");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SUBPERIMPECO.Status() == 2)
    {
      int oldListQBE = PAN_SUBPERIMPECO.iUseListQBE;
      PAN_SUBPERIMPECO.iUseListQBE = 0;
      PAN_SUBPERIMPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_SUBPERIMPECO.PanelCommand(Glb.PCM_FIND);
      PAN_SUBPERIMPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SUBPERIMPECO) PAN_SUBPERIMPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBPERIMPECO) PAN_SUBPERIMPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SUBPERIMPECO) PAN_SUBPERIMPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBPERIMPECO) PAN_SUBPERIMPECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SUBPERIMPECO) PAN_SUBPERIMPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
