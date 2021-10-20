// **********************************************
// Accertamenti Per Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccertamentiPerImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ACCPERIMPECO_ESPOSIZIONE = 0;
  private static int GRP_ACCPERIMPECO_DATAACCERTAM = 1;
  private static int GRP_ACCPERIMPECO_NEWGROUP = 2;

  private static int PFL_ACCPERIMPECO_ESPOSIZIONE = 0;
  private static int PFL_ACCPERIMPECO_FATTORE = 1;
  private static int PFL_ACCPERIMPECO_FATTORDESCRI = 2;
  private static int PFL_ACCPERIMPECO_CENTRO = 3;
  private static int PFL_ACCPERIMPECO_CENTRIDESCRI = 4;
  private static int PFL_ACCPERIMPECO_DAL = 5;
  private static int PFL_ACCPERIMPECO_AL = 6;
  private static int PFL_ACCPERIMPECO_RESIDUICOMPE = 7;
  private static int PFL_ACCPERIMPECO_NEWPANELLABE = 8;
  private static int PFL_ACCPERIMPECO_SOLORILEECON = 9;
  private static int PFL_ACCPERIMPECO_ELABORA = 10;

  private static int PPQRY_PAR31 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_CENTRI = 2;


  IDPanel PAN_ACCPERIMPECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR32(IMDB);
    //
    //
    Init_PQRY_PAR31(IMDB);
    Init_PQRY_PAR31_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR32, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR32, "TBL_PAR32");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMERESID,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR32,IMDBDef6.FLD_PAR32_ROWNAMSORIEC,5,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR32, 0);
  }

  private static void Init_PQRY_PAR31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR31, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR31, "PQRY_PAR31");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMERESID,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31,IMDBDef15.PQSL_PAR31_ROWNAMSORIEC,5,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR31, 0);
  }

  private static void Init_PQRY_PAR31_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR31_RS, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR31_RS, "PQRY_PAR31_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMERESID,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMSORIEC, "ROWNAMSORIEC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR31_RS,IMDBDef15.PQSL_PAR31_ROWNAMSORIEC,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccertamentiPerImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccertamentiPerImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_ACCPERIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7D83A6AC-B15A-4633-BB35-979671F65B6D";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 608;
    DesignHeight = 322;
    set_Caption(new IDVariant("Accertamenti Per Imputazione Economica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 608;
    Frames[1].Height = 296;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Accertamenti Per Imputazione Economica";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 296;
    PAN_ACCPERIMPECO = new IDPanel(w, this, 1, "PAN_ACCPERIMPECO");
    Frames[1].Content = PAN_ACCPERIMPECO;
    PAN_ACCPERIMPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCPERIMPECO.VS = MainFrm.VisualStyleList;
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5CF4AF5B-13C2-4694-A94E-4C0DB4FEF880");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1208, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCPERIMPECO.InitStatus = 2;
    PAN_ACCPERIMPECO_Init();
    PAN_ACCPERIMPECO_InitFields();
    PAN_ACCPERIMPECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR32, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ACCPERIMPECO_PAR31();
      }
      PAN_ACCPERIMPECO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_ACCPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCPERIMPECO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_ACCPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCPERIMPECO_CENTRO) {
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
    return (obj instanceof AccertamentiPerImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccertamentiPerImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(AccertamentiPerImputazioneEconomica.class) ? AccertamentiPerImputazioneEconomica.class.getName().substring(AccertamentiPerImputazioneEconomica.class.getPackage().getName().length() + 1) : AccertamentiPerImputazioneEconomica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEAL, 0), true)>0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Dal maggiore di Data Al", IDVariant.STRING));
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
        v_NOMESTAMPA = (new IDVariant("Accertamenti_per_Imputazione"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEFATTO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMECENTR, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMERESID, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEESPOS, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMSORIEC, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, ((MainFrm.GESTIOECONOM.equals((new IDVariant(1))))?(new IDVariant("N")):(new IDVariant("Y"))));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerImputazioneEconomica", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Fattori
  // **********************************************************************
  public int ApriFattori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattori Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerImputazioneEconomica", "ApriFattori", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Centri
  // **********************************************************************
  public int ApriCentri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Centri Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerImputazioneEconomica", "ApriCentri", _e);
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
    IDVariant v_GETECO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEESPOS, 0, (new IDVariant("F")));
      IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMSORIEC, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMERESID, 0, (new IDVariant("E")));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.GESTIONE_ECONOMICA as T99GESTIECON ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_GETECO = QV.Get("T99GESTIECON", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_GETECO.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_ACCPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_ACCPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_ACCPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerImputazioneEconomica", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEFATTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMECENTR, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerImputazioneEconomica", "UnloadEvent", _e);
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
        IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMECENTR, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerImputazioneEconomica", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Per Imputazione Economica On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ACCPERIMPECO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamenti Per Imputazione Economica On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ACCPERIMPECO_CENTRO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMECENTR, 0))))
        {
          if (MainFrm.CentriPresente(IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMECENTR, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Centro non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMECENTR, 0, PAN_ACCPERIMPECO.GetOrgValue(PFL_ACCPERIMPECO_CENTRO));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_ACCPERIMPECO_FATTORE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEFATTO, 0))))
        {
          if (MainFrm.FattorePresente(IMDB.Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEFATTO, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME)), (new IDVariant(""))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Fattore non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef15.PQRY_PAR31, IMDBDef15.PQSL_PAR31_ROWNAMEFATTO, 0, PAN_ACCPERIMPECO.GetOrgValue(PFL_ACCPERIMPECO_FATTORE));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerImputazioneEconomica", "AccertamentiPerImputazioneEconomicaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ACCPERIMPECO_PAR31() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR31_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR32, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR32, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR31_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR31_RS, 0, IMDBDef6.TBL_PAR32, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR31_RS, 0, 0, IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEESPOS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR31_RS, 1, 0, IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR31_RS, 2, 0, IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMECENTR, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR31_RS, 3, 0, IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR31_RS, 4, 0, IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR31_RS, 5, 0, IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMERESID, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR31_RS, 6, 0, IMDBDef6.TBL_PAR32, IMDBDef6.FLD_PAR32_ROWNAMSORIEC, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR32, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR32, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR32, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR31_RS, 0);
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
  private void PAN_ACCPERIMPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCPERIMPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCPERIMPECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCPERIMPECO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCPERIMPECO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ACCPERIMPECO);
    // Stub
  }

  private void PAN_ACCPERIMPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ACCPERIMPECO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_ACCPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattori();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCPERIMPECO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_ACCPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentri();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCPERIMPECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ACCPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ACCPERIMPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ACCPERIMPECO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ACCPERIMPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ACCPERIMPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCPERIMPECO_Init()
  {

    PAN_ACCPERIMPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCPERIMPECO.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, "E7BDA0BF-5893-4AC2-842F-9EF7EE1E1B1C");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 4, 3, 92, 77, 0, 0);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, 0, 65);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, 1, 13);
    PAN_ACCPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, 0, 4);
    PAN_ACCPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, 1, 4);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, "2C811BEB-DBA6-426A-99B3-7380BAC2EBA2");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, "Data Accertamenti");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, MyGlb.PANEL_LIST, 224, -9999, 208, 16, 0, 0);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, MyGlb.PANEL_FORM, 4, 87, 284, 49, 0, 0);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, 0, 107);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, 1, 13);
    PAN_ACCPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, 0, 4);
    PAN_ACCPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, 1, 4);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_DATAACCERTAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, "F0A95795-8B4F-45A1-86FB-64A6F7E46940");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, "New Group");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, MyGlb.VIS_GROUPSTYLE);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, MyGlb.PANEL_LIST, 432, -9999, 120, 0, 0, 0);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, MyGlb.PANEL_FORM, 292, 84, 284, 52, 0, 0);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, 0, 60);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, 1, 13);
    PAN_ACCPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, 0, 1);
    PAN_ACCPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, 1, 1);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_ACCPERIMPECO_NEWGROUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ACCPERIMPECO.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, "509811E5-5074-44DF-AFBE-B4CE6A563980");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, "71B3CCFC-C968-4B3A-BA10-AA03CB117B41");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, "Fattore");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, "3606E39B-C591-452F-9731-7EB62AF3C06D");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, "B8772DEE-60EB-4B40-9655-61BDF5934FD7");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, "Centro");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, "DFE54395-AD6D-4875-A176-B749A786FB39");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, "BF3FC5F2-CC14-43AB-A014-D138A6922DD5");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, "Dal");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, "40333AD0-DF7E-4698-B3BA-90B5628F0F96");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, "Al");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, "6B31BE71-43D2-4817-AE40-868CD5ABF4AC");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, "Residuicompetenze");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, "692FD152-F400-4487-8325-809C4AD62218");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, "DE0363B0-FDCC-49CF-8B8A-66A90981DBB8");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, "Solo Rilevanti Economica");
    PAN_ACCPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, "");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.VIS_CHECKSTYLE);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, "F66E32D7-D371-4DDD-A71B-FE45F76F1A86");
    PAN_ACCPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, "Elabora");
    PAN_ACCPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ACCPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, 0, "button1.gif", false);
    PAN_ACCPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ACCPERIMPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, "Esposizione");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 8, 28, 84, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 144);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 3);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, "Esposizione");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_ESPOSIZIONE, -1, GRP_ACCPERIMPECO_ESPOSIZIONE);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_ESPOSIZIONE, PPQRY_PAR31, "A.ROWNAMEESPOS", "ROWNAMEESPOS", 5, 1, 0, -13997);
    PAN_ACCPERIMPECO.SetValueListItem(PFL_ACCPERIMPECO_ESPOSIZIONE, (new IDVariant("F")), "Fattore", "", "", -1);
    PAN_ACCPERIMPECO.SetValueListItem(PFL_ACCPERIMPECO_ESPOSIZIONE, (new IDVariant("C")), "Centro", "", "", -1);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 96, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 44);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 100, 24, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_FATTORE, -1, -1);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_FATTORE, PPQRY_PAR31, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 16, 0, -13997);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 292, 24, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_FATTORDESCRI, -1, -1);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 160, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 44);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 100, 48, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_CENTRO, -1, -1);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_CENTRO, PPQRY_PAR31, "A.ROWNAMECENTR", "ROWNAMECENTR", 5, 16, 0, -13997);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 292, 48, 284, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_CENTRIDESCRI, -1, -1);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_LIST, 224, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_FORM, 8, 112, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_FORM, 56);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_DAL, -1, GRP_ACCPERIMPECO_DATAACCERTAM);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_DAL, PPQRY_PAR31, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_LIST, 328, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_LIST, 20);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_FORM, 172, 112, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_FORM, 20);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_AL, -1, GRP_ACCPERIMPECO_DATAACCERTAM);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_AL, PPQRY_PAR31, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_LIST, 432, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_LIST, 100);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_LIST, "Residuicompetenze");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_FORM, 336, 112, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_FORM, 144);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_RESIDUICOMPE, MyGlb.PANEL_FORM, "Residuicompetenze");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_RESIDUICOMPE, -1, GRP_ACCPERIMPECO_NEWGROUP);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_RESIDUICOMPE, PPQRY_PAR31, "A.ROWNAMERESID", "ROWNAMERESID", 12, 1, 0, -13997);
    PAN_ACCPERIMPECO.SetValueListItem(PFL_ACCPERIMPECO_RESIDUICOMPE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_ACCPERIMPECO.SetValueListItem(PFL_ACCPERIMPECO_RESIDUICOMPE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_ACCPERIMPECO.SetValueListItem(PFL_ACCPERIMPECO_RESIDUICOMPE, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 504, 116, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 296, 88, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_NEWPANELLABE, -1, GRP_ACCPERIMPECO_NEWGROUP);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 552, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 128);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_LIST, "Sl. Ril. Econ.");
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 4, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 148);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_SOLORILEECON, MyGlb.PANEL_FORM, "Solo Rilevanti Economica");
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_SOLORILEECON, -1, -1);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_SOLORILEECON, PPQRY_PAR31, "A.ROWNAMSORIEC", "ROWNAMSORIEC", 5, 1, 0, -13997);
    PAN_ACCPERIMPECO.SetValueListItem(PFL_ACCPERIMPECO_SOLORILEECON, (new IDVariant("S")), "S", "", "", -1);
    PAN_ACCPERIMPECO.SetValueListItem(PFL_ACCPERIMPECO_SOLORILEECON, (new IDVariant("N")), "N", "", "", -1);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 384, 164, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ACCPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 412, 180, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ACCPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ACCPERIMPECO.SetFieldPage(PFL_ACCPERIMPECO_ELABORA, -1, -1);
    PAN_ACCPERIMPECO.SetFieldPanel(PFL_ACCPERIMPECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ACCPERIMPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCPERIMPECO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~ROWNAMEAL~~) ");
    PAN_ACCPERIMPECO.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_ACCPERIMPECO.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCPERIMPECO.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~ROWNAMECENTR~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR A.DATA_VALIDITA >= ~~ROWNAMEAL~~) ");
    PAN_ACCPERIMPECO.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_ACCPERIMPECO.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCPERIMPECO.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    PAN_ACCPERIMPECO.SetIMDB(IMDB, "PQRY_PAR31", true);
    PAN_ACCPERIMPECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ACCPERIMPECO.SetQueryIMDB(PPQRY_PAR31, IMDBDef15.PQRY_PAR31_RS, IMDBDef6.TBL_PAR32);
    JustLoaded = true;
    PAN_ACCPERIMPECO.SetFieldPrimaryIndex(PFL_ACCPERIMPECO_ESPOSIZIONE, IMDBDef6.FLD_PAR32_ROWNAMEESPOS);
    PAN_ACCPERIMPECO.SetFieldPrimaryIndex(PFL_ACCPERIMPECO_FATTORE, IMDBDef6.FLD_PAR32_ROWNAMEFATTO);
    PAN_ACCPERIMPECO.SetFieldPrimaryIndex(PFL_ACCPERIMPECO_CENTRO, IMDBDef6.FLD_PAR32_ROWNAMECENTR);
    PAN_ACCPERIMPECO.SetFieldPrimaryIndex(PFL_ACCPERIMPECO_DAL, IMDBDef6.FLD_PAR32_ROWNAMEDAL);
    PAN_ACCPERIMPECO.SetFieldPrimaryIndex(PFL_ACCPERIMPECO_AL, IMDBDef6.FLD_PAR32_ROWNAMEAL);
    PAN_ACCPERIMPECO.SetFieldPrimaryIndex(PFL_ACCPERIMPECO_RESIDUICOMPE, IMDBDef6.FLD_PAR32_ROWNAMERESID);
    PAN_ACCPERIMPECO.SetFieldPrimaryIndex(PFL_ACCPERIMPECO_SOLORILEECON, IMDBDef6.FLD_PAR32_ROWNAMSORIEC);
    PAN_ACCPERIMPECO.SetMasterTable(0, "PAR32");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCPERIMPECO.Status() == 2)
    {
      int oldListQBE = PAN_ACCPERIMPECO.iUseListQBE;
      PAN_ACCPERIMPECO.iUseListQBE = 0;
      PAN_ACCPERIMPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCPERIMPECO.PanelCommand(Glb.PCM_FIND);
      PAN_ACCPERIMPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCPERIMPECO) PAN_ACCPERIMPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCPERIMPECO) PAN_ACCPERIMPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCPERIMPECO) PAN_ACCPERIMPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCPERIMPECO) PAN_ACCPERIMPECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCPERIMPECO) PAN_ACCPERIMPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
