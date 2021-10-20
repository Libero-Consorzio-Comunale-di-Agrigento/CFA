// **********************************************
// Pagamenti Mandati Per Flusso
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PagamentiMandatiPerFlusso extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMEPAGAME_DATAPAGAMENT = 0;

  private static int PFL_PARAMEPAGAME_IDFLUSSOBT1 = 0;
  private static int PFL_PARAMEPAGAME_DATADAL = 1;
  private static int PFL_PARAMEPAGAME_DATAAL = 2;

  private static int PPQRY_PARAMEPAGAM2 = 0;


  IDPanel PAN_PARAMEPAGAME;
  private static int GRP_PAGAMENTI_MANDATO = 0;
  private static int GRP_PAGAMENTI_DOCUMENTO = 1;

  private static int PFL_PAGAMENTI_NUMEROMAND = 0;
  private static int PFL_PAGAMENTI_ANNOMAND = 1;
  private static int PFL_PAGAMENTI_BENEFICIARIO = 2;
  private static int PFL_PAGAMENTI_MANIMPORTO = 3;
  private static int PFL_PAGAMENTI_PAGAMENTO = 4;
  private static int PFL_PAGAMENTI_DATA = 5;
  private static int PFL_PAGAMENTI_NUMERO = 6;
  private static int PFL_PAGAMENTI_QUIETANZA = 7;
  private static int PFL_PAGAMENTI_DATAPAGAM = 8;
  private static int PFL_PAGAMENTI_PROGRESSIVO = 9;
  private static int PFL_PAGAMENTI_FATNUMERODOC = 10;
  private static int PFL_PAGAMENTI_FATDDATADOC = 11;
  private static int PFL_PAGAMENTI_ANNOLIQ = 12;
  private static int PFL_PAGAMENTI_NUMEROLIQ = 13;
  private static int PFL_PAGAMENTI_DATAVALUTA = 14;
  private static int PFL_PAGAMENTI_CODICRIFOPER = 15;
  private static int PFL_PAGAMENTI_IMPORTOBOLLO = 16;
  private static int PFL_PAGAMENTI_IMPORTOSPESE = 17;
  private static int PFL_PAGAMENTI_IMPORTCOMMIS = 18;
  private static int PFL_PAGAMENTI_IDFLUSSOBT = 19;
  private static int PFL_PAGAMENTI_SOMMADIPAGAM = 20;
  private static int PFL_PAGAMENTI_UTENTULTIAGG = 21;
  private static int PFL_PAGAMENTI_DATAULTIMAGG = 22;

  private static int PPQRY_PAGAMENTI1 = 0;

  private static int PPQRY_DOCUMENTO = 1;
  private static int PPQRY_MAN = 2;


  IDPanel PAN_PAGAMENTI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMEPAGAME(IMDB);
    //
    //
    Init_PQRY_PARAMEPAGAM2(IMDB);
    Init_PQRY_PARAMEPAGAM2_RS(IMDB);
    Init_PQRY_PAGAMENTI1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMEPAGAME(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMEPAGAME, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMEPAGAME, "TBL_PARAMEPAGAME");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAME,IMDBDef5.FLD_PARAMEPAGAME_ROWNAMIDFLBT, "ROWNAMIDFLBT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAME,IMDBDef5.FLD_PARAMEPAGAME_ROWNAMIDFLBT,9,500,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAME,IMDBDef5.FLD_PARAMEPAGAME_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAME,IMDBDef5.FLD_PARAMEPAGAME_ROWNAMDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMEPAGAME,IMDBDef5.FLD_PARAMEPAGAME_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMEPAGAME,IMDBDef5.FLD_PARAMEPAGAME_ROWNAMEDATAL,6,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMEPAGAME, 0);
  }

  private static void Init_PQRY_PARAMEPAGAM2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMEPAGAM2, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMEPAGAM2, "PQRY_PARAMEPAGAM2");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEPAGAM2,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMIDFLBT, "ROWNAMIDFLBT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEPAGAM2,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMIDFLBT,9,500,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEPAGAM2,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEPAGAM2,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEPAGAM2,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEPAGAM2,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMEDATAL,6,10,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMEPAGAM2, 0);
  }

  private static void Init_PQRY_PARAMEPAGAM2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMEPAGAM2_RS, 3);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMEPAGAM2_RS, "PQRY_PARAMEPAGAM2_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEPAGAM2_RS,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMIDFLBT, "ROWNAMIDFLBT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEPAGAM2_RS,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMIDFLBT,9,500,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEPAGAM2_RS,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMDATDAL, "ROWNAMDATDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEPAGAM2_RS,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMEPAGAM2_RS,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMEDATAL, "ROWNAMEDATAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMEPAGAM2_RS,IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMEDATAL,6,10,0);
  }

  private static void Init_PQRY_PAGAMENTI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PAGAMENTI1, 19);
    IMDB.set_TblCode(IMDBDef14.PQRY_PAGAMENTI1, "PQRY_PAGAMENTI1");
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_ANNO_MAND, "ANNO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_ANNO_MAND,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_DATA_PAGAM, "DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_DATA_PAGAM,1,7,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_NUMERO_PAGAM, "NUMERO_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_NUMERO_PAGAM,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_D_DATA_PAGAM, "D_DATA_PAGAM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_D_DATA_PAGAM,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIDFLUSBT, "PAGAIDFLUSBT");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIDFLUSBT,5,500,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGADATAVALU, "PAGADATAVALU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGADATAVALU,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGCODRIFOPE, "PAGCODRIFOPE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGCODRIFOPE,5,50,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIMPOBOLL, "PAGAIMPOBOLL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIMPOBOLL,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIMPOSPES, "PAGAIMPOSPES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIMPOSPES,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIMPOCOMM, "PAGAIMPOCOMM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PAGAMENTI1,IMDBDef14.PQSL_PAGAMENTI1_PAGAIMPOCOMM,3,14,2);
    IMDB.TblAddNew(IMDBDef14.PQRY_PAGAMENTI1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PagamentiMandatiPerFlusso(MyWebEntryPoint w, IMDBObj imdb)
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
  public PagamentiMandatiPerFlusso()
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
    FormIdx = MyGlb.FRM_PAGMANPERFLU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FEF67097-728A-4958-B8ED-F0C0E67998FA";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1180;
    DesignHeight = 434;
    set_Caption(new IDVariant("Pagamenti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1180;
    Frames[1].Height = 408;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.147059;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1180;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Pagamenti";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMEPAGAME = new IDPanel(w, this, 2, "PAN_PARAMEPAGAME");
    Frames[2].Content = PAN_PARAMEPAGAME;
    PAN_PARAMEPAGAME.Lockable = false;
    PAN_PARAMEPAGAME.iLocked = false;
    PAN_PARAMEPAGAME.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEPAGAME.VS = MainFrm.VisualStyleList;
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1180-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEPAGAME.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D054BA69-A26E-4E7E-A9D2-E5E5C7B885EA");
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 424, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMEPAGAME.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEPAGAME.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEPAGAME.InitStatus = 2;
    PAN_PARAMEPAGAME_Init();
    PAN_PARAMEPAGAME_InitFields();
    PAN_PARAMEPAGAME_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1180;
    Frames[3].Height = 348;
    Frames[3].Caption = "Pagamenti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 348;
    PAN_PAGAMENTI = new IDPanel(w, this, 3, "PAN_PAGAMENTI");
    Frames[3].Content = PAN_PAGAMENTI;
    PAN_PAGAMENTI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAGAMENTI.VS = MainFrm.VisualStyleList;
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1180-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7EFF5F8C-129E-4C60-9276-3EFE965D3CD3");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 12, 1788, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAGAMENTI.InitStatus = 2;
    PAN_PAGAMENTI_Init();
    PAN_PAGAMENTI_InitFields();
    PAN_PAGAMENTI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMEPAGAME, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PAGMANPERFLU_PARAMEPAGAM2();
      }
      PAN_PARAMEPAGAME.UpdatePanel(MainFrm);
      PAN_PAGAMENTI.UpdatePanel(MainFrm);
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
    return (obj instanceof PagamentiMandatiPerFlusso);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PagamentiMandatiPerFlusso.class.getName() : (Glb.ClassWithPackage(PagamentiMandatiPerFlusso.class) ? PagamentiMandatiPerFlusso.class.getName().substring(PagamentiMandatiPerFlusso.class.getPackage().getName().length() + 1) : PagamentiMandatiPerFlusso.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Pagamenti On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMEPAGAME_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Pagamenti On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMEPAGAME_IDFLUSSOBT1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMEPAGAM2, IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMIDFLBT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMEPAGAM2, IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMDATDAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMEPAGAM2, IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMEDATAL, 0)))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMEPAGAM2, IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMDATDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef14.PQRY_PARAMEPAGAM2, IMDBDef14.PQSL_PARAMEPAGAM2_ROWNAMEDATAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandatiPerFlusso", "ParametriPagamentiOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pagamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAGAMENTI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PAGAMENTI);
      // 
      // Pagamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_BENEFICIARIO,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_BENEFICIARIO))).stringValue()); 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_QUIETANZA,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_QUIETANZA))).stringValue()); 
      PAN_PAGAMENTI.set_ToolTip(Glb.OBJ_FIELD,PFL_PAGAMENTI_IDFLUSSOBT,(new IDVariant(PAN_PAGAMENTI.FieldText(PFL_PAGAMENTI_IDFLUSSOBT))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandatiPerFlusso", "PagamentiOnDynamicPropertiesEvent", _e);
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
      UNLOADEVENT_PARAPAGADELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandatiPerFlusso", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Pagamenti: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARAPAGADELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAME, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMIDFLBT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAME, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMDATDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMEPAGAME, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMEDATAL, 0, new IDVariant());
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
    IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_LAB = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MSG = (new IDVariant("Mandato ", IDVariant.STRING));
      v_NOMECAPTION = (new IDVariant("Pagamenti", IDVariant.STRING));
      v_LAB = (new IDVariant("Importo: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(this.Caption(), MainFrm.ESERCIZIO));
      Frames[PAN_PAGAMENTI.FrIndex].set_Caption(IDL.Add((new IDVariant(Frames[PAN_PAGAMENTI.FrIndex].Caption)), MainFrm.ESERCIZIO).stringValue());
      Settaimporto();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandatiPerFlusso", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Settaimporto
  // **********************************************************************
  public int Settaimporto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_IMPORTO = (new IDVariant("Importo: ", IDVariant.STRING));
      // 
      // Settaimporto Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PagamentiMandatiPerFlusso", "Settaimporto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Pagamenti
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void PAGMANPERFLU_PARAMEPAGAM2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMEPAGAM2_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMEPAGAME, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMEPAGAME, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMEPAGAM2_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMEPAGAM2_RS, 0, IMDBDef5.TBL_PARAMEPAGAME, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMEPAGAM2_RS, 0, 0, IMDBDef5.TBL_PARAMEPAGAME, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMIDFLBT, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMEPAGAM2_RS, 1, 0, IMDBDef5.TBL_PARAMEPAGAME, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMDATDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMEPAGAM2_RS, 2, 0, IMDBDef5.TBL_PARAMEPAGAME, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMEDATAL, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMEPAGAME, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMEPAGAME, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMEPAGAME, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMEPAGAM2_RS, 0);
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
  private void PAN_PARAMEPAGAME_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEPAGAME, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEPAGAME_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEPAGAME, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEPAGAME_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEPAGAME);
    // Stub
  }

  private void PAN_PARAMEPAGAME_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMEPAGAME_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMEPAGAME_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEPAGAME_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEPAGAME_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PAGAMENTI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAGAMENTI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAGAMENTI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAGAMENTI, Cancel);
    // Stub
  }

  private void PAN_PAGAMENTI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PAGAMENTI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAGAMENTI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAGAMENTI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMEPAGAME_Init()
  {

    PAN_PARAMEPAGAME.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEPAGAME.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMEPAGAME.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, "3D666DC5-40A6-4344-A92E-6F94CBF9C66A");
    PAN_PARAMEPAGAME.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, "Data Pagamento");
    PAN_PARAMEPAGAME.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, "");
    PAN_PARAMEPAGAME.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, MyGlb.PANEL_LIST, 0, -9999, 60, 16, 0, 0);
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, MyGlb.PANEL_FORM, 400, 3, 308, 49, 0, 0);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, 0, 95);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, 1, 13);
    PAN_PARAMEPAGAME.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, 0, 4);
    PAN_PARAMEPAGAME.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, 1, 4);
    PAN_PARAMEPAGAME.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMEPAGAME_DATAPAGAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMEPAGAME.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMEPAGAME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, "D4D7CCFD-A280-41A7-BCFF-AF0A180C1CD2");
    PAN_PARAMEPAGAME.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, "Id Flusso BT");
    PAN_PARAMEPAGAME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, "");
    PAN_PARAMEPAGAME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEPAGAME.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEPAGAME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, "0EBC6816-9013-4F86-B23F-587413ED26B3");
    PAN_PARAMEPAGAME.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, "Dal");
    PAN_PARAMEPAGAME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, "");
    PAN_PARAMEPAGAME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEPAGAME.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEPAGAME.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, "C3485C77-502D-4C85-A93B-2A22306EE36C");
    PAN_PARAMEPAGAME.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, "Al");
    PAN_PARAMEPAGAME.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, "");
    PAN_PARAMEPAGAME.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEPAGAME.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMEPAGAME_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_LIST, 0, 36, 304, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_LIST, 76);
    PAN_PARAMEPAGAME.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEPAGAME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_FORM, 8, 28, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_FORM, 104);
    PAN_PARAMEPAGAME.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEPAGAME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_IDFLUSSOBT1, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_PARAMEPAGAME.SetFieldPage(PFL_PARAMEPAGAME_IDFLUSSOBT1, -1, -1);
    PAN_PARAMEPAGAME.SetFieldPanel(PFL_PARAMEPAGAME_IDFLUSSOBT1, PPQRY_PARAMEPAGAM2, "A.ROWNAMIDFLBT", "ROWNAMIDFLBT", 9, 500, 0, -13997);
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_LIST, 56);
    PAN_PARAMEPAGAME.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEPAGAME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_FORM, 404, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_FORM, 56);
    PAN_PARAMEPAGAME.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEPAGAME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATADAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMEPAGAME.SetFieldPage(PFL_PARAMEPAGAME_DATADAL, -1, GRP_PARAMEPAGAME_DATAPAGAMENT);
    PAN_PARAMEPAGAME.SetFieldPanel(PFL_PARAMEPAGAME_DATADAL, PPQRY_PARAMEPAGAM2, "A.ROWNAMDATDAL", "ROWNAMDATDAL", 6, 10, 0, -13997);
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMEPAGAME.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEPAGAME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMEPAGAME.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_FORM, 564, 28, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEPAGAME.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_FORM, 52);
    PAN_PARAMEPAGAME.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEPAGAME.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEPAGAME_DATAAL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMEPAGAME.SetFieldPage(PFL_PARAMEPAGAME_DATAAL, -1, GRP_PARAMEPAGAME_DATAPAGAMENT);
    PAN_PARAMEPAGAME.SetFieldPanel(PFL_PARAMEPAGAME_DATAAL, PPQRY_PARAMEPAGAM2, "A.ROWNAMEDATAL", "ROWNAMEDATAL", 6, 10, 0, -13997);
  }

  private void PAN_PARAMEPAGAME_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEPAGAME.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMEPAGAME.SetIMDB(IMDB, "PQRY_PARAMEPAGAM2", true);
    PAN_PARAMEPAGAME.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMEPAGAME.SetQueryIMDB(PPQRY_PARAMEPAGAM2, IMDBDef14.PQRY_PARAMEPAGAM2_RS, IMDBDef5.TBL_PARAMEPAGAME);
    JustLoaded = true;
    PAN_PARAMEPAGAME.SetFieldPrimaryIndex(PFL_PARAMEPAGAME_IDFLUSSOBT1, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMIDFLBT);
    PAN_PARAMEPAGAME.SetFieldPrimaryIndex(PFL_PARAMEPAGAME_DATADAL, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMDATDAL);
    PAN_PARAMEPAGAME.SetFieldPrimaryIndex(PFL_PARAMEPAGAME_DATAAL, IMDBDef5.FLD_PARAMEPAGAME_ROWNAMEDATAL);
    PAN_PARAMEPAGAME.SetMasterTable(0, "PARAMEPAGAME");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEPAGAME.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEPAGAME.iUseListQBE;
      PAN_PARAMEPAGAME.iUseListQBE = 0;
      PAN_PARAMEPAGAME.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEPAGAME.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEPAGAME.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PAGAMENTI_Init()
  {

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, "3D4378C6-18BE-42DD-9141-A20B4E773E6E");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, "Mandato");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, MyGlb.PANEL_LIST, 4, -9999, 100, 16, 0, 0);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, MyGlb.PANEL_FORM, 0, 75, 136, 73, 0, 0);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, 0, 50);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, 1, 13);
    PAN_PAGAMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, 0, 4);
    PAN_PAGAMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, 1, 4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_MANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, "F104AD20-41CF-43EF-82AE-31B77A1FC894");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, "Documento");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_LIST, 828, -9999, 172, 16, 0, 0);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, MyGlb.PANEL_FORM, 0, 195, 220, 121, 0, 0);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, 0, 65);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, 1, 13);
    PAN_PAGAMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, 0, 4);
    PAN_PAGAMENTI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, 1, 4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_GROUP, GRP_PAGAMENTI_DOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "1BA9FFC9-560C-46A2-92D7-F9841C26FE38");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "Numero");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "67FF1635-EEA7-44E9-8BA1-7FF0BAD2DDAD");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "Anno");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "9B50260A-2F77-440C-8227-51C6B7CE3AB9");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "Beneficiario");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, "des_beneficiario");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, "AFBB1B8F-7447-4601-9781-09DD900E407E");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, "Importo Mandato");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, "DB516BE6-D0FB-4ADD-BD12-9756FB9A0CBE");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, "Pagamento");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, "importo");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "F5D29CB0-FA73-42AA-A023-693632F3C4C3");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "Data");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, "d_data_pagam");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "E7E61153-A605-48D1-BBC8-65A3A9A46509");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "Numero");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "FE032C8A-6D40-4B37-AB41-EAF2AA49D169");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "Quietanza");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, "9FC77EA9-EDA6-472D-B677-E12786C9A10A");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, "DATA PAGAM");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "5BBDDEAB-036B-45A7-ADB4-E87F7C7FA5D5");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "PROGRESSIVO");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "9FF14838-8F5B-4FD5-B857-B9A108FCA6C9");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "Numero");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "466086F6-0ABF-40AB-8D10-6783547A76A0");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "Data");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "BE831500-DA17-4424-9BF1-B6B56634A3DB");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "ANNO LIQ");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "B1812C11-ADD3-427F-9276-532B3080E036");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "NUMERO LIQ");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.VIS_NONNULLAFIEL);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, "43D117D2-BBD8-491D-945D-04410A2E2DE2");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, "Data Valuta");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, "38380481-F580-429C-96C3-5984DCDD7408");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, "Codice Rif. Operazione");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, "E5B3586B-1896-4ED1-84E0-1C15277FA54E");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, "Importo Bollo");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.VIS_NORFIECF4IMP);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, "68988523-3E47-4ABE-BA19-2407F3B424A9");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, "Importo Spese");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.VIS_NORFIECF4IMP);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, "88DA9096-6210-4057-AA81-9D5DA28D156B");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, "Importo Commissioni");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.VIS_NORFIECF4IMP);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, "CA8DC3E6-466F-48BA-81D2-D3380398C21A");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, "Id Flusso BT");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.VIS_NORMALFIELDS);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, "E0D3B586-AE56-404C-ACCF-8A5CE8C27E5F");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, MyGlb.VIS_CAMPTOTADISA);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_PAGAMENTI.SetSumField(PFL_PAGAMENTI_SOMMADIPAGAM, PFL_PAGAMENTI_PAGAMENTO);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "F817F8CF-61AA-4098-9711-1B36548731DB");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PAGAMENTI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "F35DF99E-26AC-49D4-BBDD-BB738D0F76C5");
    PAN_PAGAMENTI.set_Header(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_PAGAMENTI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, "");
    PAN_PAGAMENTI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_PAGAMENTI.SetFlags(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PAGAMENTI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 4, 48, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_LIST, "Numero");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 4, 124, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROMAND, MyGlb.PANEL_FORM, "Numero");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMEROMAND, -1, GRP_PAGAMENTI_MANDATO);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMEROMAND, PPQRY_PAGAMENTI1, "A.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 60, 48, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_LIST, "Anno");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 4, 100, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOMAND, MyGlb.PANEL_FORM, "Anno");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOMAND, -1, GRP_PAGAMENTI_MANDATO);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOMAND, PPQRY_PAGAMENTI1, "A.ANNO_MAND", "ANNO_MAND", 1, 4, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 104, 48, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 124);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 244, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 124);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_BENEFICIARIO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_BENEFICIARIO, PPQRY_DOCUMENTO, "B.RAGIONE_SOCIALE_ESTESA", "FABERASOESES", 5, 60, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_LIST, 292, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_LIST, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_LIST, "Importo Mandato");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_FORM, 4, 316, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_FORM, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_MANIMPORTO, MyGlb.PANEL_FORM, "Imp. Mandato");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_MANIMPORTO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_MANIMPORTO, PPQRY_MAN, "A.IMPORTO", "MANIMPORTO", 3, 14, 2, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, 400, 48, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_LIST, "Pagamento");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, 56);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PAGAMENTO, MyGlb.PANEL_FORM, "Pagam.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_PAGAMENTO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_PAGAMENTO, PPQRY_PAGAMENTI1, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 508, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 4, 196, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATA, PPQRY_PAGAMENTI1, "A.D_DATA_PAGAM", "D_DATA_PAGAM", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 588, 48, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMERO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMERO, PPQRY_PAGAMENTI1, "A.NUMERO_PAGAM", "NUMERO_PAGAM", 5, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 644, 48, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 4, 268, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_QUIETANZA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_QUIETANZA, PPQRY_DOCUMENTO, "D.DESCRIZIONE", "FATT02DESCRI", 5, 40, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_LIST, 702, 108, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_LIST, 76);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_LIST, "DATA PAGAM");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_FORM, 4, 28, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_FORM, 76);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAPAGAM, MyGlb.PANEL_FORM, "DT. PAGAM");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATAPAGAM, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATAPAGAM, PPQRY_PAGAMENTI1, "A.DATA_PAGAM", "DATA_PAGAM", 1, 7, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 776, 108, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_PROGRESSIVO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_PROGRESSIVO, PPQRY_PAGAMENTI1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 828, 48, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_LIST, "Numero");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATNUMERODOC, MyGlb.PANEL_FORM, "Numero");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_FATNUMERODOC, -1, GRP_PAGAMENTI_DOCUMENTO);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_FATNUMERODOC, PPQRY_DOCUMENTO, "E.NUMERO_DOC", "FATNUMERODOC", 5, 20, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 928, 48, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_LIST, "Data");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 92);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_FATDDATADOC, MyGlb.PANEL_FORM, "Data");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_FATDDATADOC, -1, GRP_PAGAMENTI_DOCUMENTO);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_FATDDATADOC, PPQRY_DOCUMENTO, "E.D_DATA_DOC", "FATDDATADOC", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 1068, 108, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 148, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_ANNOLIQ, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_ANNOLIQ, PPQRY_PAGAMENTI1, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 1284, 108, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_LIST, "NUMERO LIQ");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 172, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_NUMEROLIQ, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_NUMEROLIQ, PPQRY_PAGAMENTI1, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_LIST, 1000, 48, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_LIST, 88);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_LIST, "Data Valuta");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_FORM, 4, 364, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_FORM, 88);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAVALUTA, MyGlb.PANEL_FORM, "Data Valuta");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATAVALUTA, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATAVALUTA, PPQRY_PAGAMENTI1, "A.DATA_VALUTA", "PAGADATAVALU", 6, 10, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_LIST, 1084, 48, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_LIST, 144);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_LIST, "Codice Rif. Operazione");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_FORM, 4, 388, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_FORM, 144);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_CODICRIFOPER, MyGlb.PANEL_FORM, "Codice Rif. Operazione");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_CODICRIFOPER, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_CODICRIFOPER, PPQRY_PAGAMENTI1, "A.CODICE_RIF_OPERAZIONE", "PAGCODRIFOPE", 5, 50, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_LIST, 1284, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_LIST, "Importo Bollo");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_FORM, 4, 412, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOBOLLO, MyGlb.PANEL_FORM, "Importo Bollo");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPORTOBOLLO, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPORTOBOLLO, PPQRY_PAGAMENTI1, "A.IMPORTO_BOLLO", "PAGAIMPOBOLL", 3, 14, 2, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_LIST, 1404, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_LIST, "Importo Spese");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_FORM, 4, 436, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTOSPESE, MyGlb.PANEL_FORM, "Importo Spese");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPORTOSPESE, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPORTOSPESE, PPQRY_PAGAMENTI1, "A.IMPORTO_SPESE", "PAGAIMPOSPES", 3, 14, 2, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_LIST, 1524, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_LIST, 144);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_LIST, "Importo Commissioni");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_FORM, 4, 460, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_FORM, 144);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IMPORTCOMMIS, MyGlb.PANEL_FORM, "Importo Commissioni");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IMPORTCOMMIS, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IMPORTCOMMIS, PPQRY_PAGAMENTI1, "A.IMPORTO_COMMISSIONI", "PAGAIMPOCOMM", 3, 14, 2, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_LIST, 1644, 48, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_LIST, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_FORM, 4, 340, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_FORM, 84);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_IDFLUSSOBT, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_IDFLUSSOBT, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_IDFLUSSOBT, PPQRY_PAGAMENTI1, "A.ID_FLUSSO_BT", "PAGAIDFLUSBT", 5, 500, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, MyGlb.PANEL_LIST, 400, 252, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, MyGlb.PANEL_LIST, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, MyGlb.PANEL_FORM, 196, 324, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, MyGlb.PANEL_FORM, 0);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_SOMMADIPAGAM, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_SOMMADIPAGAM, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_SOMMADIPAGAM, -1, "", "SOMMADIPAGAM", 0, 0, 0, -13997);
    PAN_PAGAMENTI.set_Mask(PFL_PAGAMENTI_SOMMADIPAGAM, "#,###,###,##0.00");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 780, 104, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 364, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_UTENTULTIAGG, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_UTENTULTIAGG, PPQRY_PAGAMENTI1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 780, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_PAGAMENTI.SetRect(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 388, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAGAMENTI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_PAGAMENTI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_PAGAMENTI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAGAMENTI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_PAGAMENTI.SetFieldPage(PFL_PAGAMENTI_DATAULTIMAGG, -1, -1);
    PAN_PAGAMENTI.SetFieldPanel(PFL_PAGAMENTI_DATAULTIMAGG, PPQRY_PAGAMENTI1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
  }

  private void PAN_PAGAMENTI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAGAMENTI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  E.D_DATA_DOC as FATDDATADOC, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as FABERASOESES, ");
    SQL.append("  D.DESCRIZIONE as FATT02DESCRI, ");
    SQL.append("  E.NUMERO_DOC as FATNUMERODOC, ");
    SQL.append("  CASE WHEN (E.NUMERO_DOC IS NULL) THEN NULL ELSE E.NUMERO_DOC || ' ' || 'del' || ' ' || TO_CHAR ( E.D_DATA_DOC ) END as FATDOCUMEXPR ");
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B, ");
    SQL.append("  QTN C, ");
    SQL.append("  T02 D, ");
    SQL.append("  FAT E, ");
    SQL.append("  BEN F ");
    SQL.append("where (~~ANNO_LIQ~~ = A.ANNO_LIQ) ");
    SQL.append("and   (~~NUMERO_LIQ~~ = A.NUMERO_LIQ) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    SQL.append("and   (C.NUM_QUIETANZA(+) = A.NUM_QUIETANZA) ");
    SQL.append("and   (A.BENEFICIARIO = C.CODICE(+)) ");
    SQL.append("and   (C.TIPO_QUIETANZA = D.CODICE(+)) ");
    SQL.append("and   (A.FAT_ANNO_PROG = E.ANNO_PROG(+) AND A.FAT_NUMERO_PROG = E.NUMERO_PROG(+)) ");
    SQL.append("and   (A.DIVERSO_BEN = F.CODICE(+)) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_DOCUMENTO, 0, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_DOCUMENTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(PPQRY_DOCUMENTO, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as MANIMPORTO ");
    SQL.append("from ");
    SQL.append("  MAN A ");
    SQL.append("where (A.ANNO_MAND = ~~ANNO_MAND~~) ");
    SQL.append("and   (A.NUMERO_MAND = ~~NUMERO_MAND~~) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_MAN, 0, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_MAN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(PPQRY_MAN, "MAN");
    PAN_PAGAMENTI.SetIMDB(IMDB, "PQRY_PAGAMENTI1", true);
    PAN_PAGAMENTI.set_SetString(MyGlb.MASTER_ROWNAME, "PAGAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_MAND as ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.DATA_PAGAM as DATA_PAGAM, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.NUMERO_PAGAM as NUMERO_PAGAM, ");
    SQL.append("  A.D_DATA_PAGAM as D_DATA_PAGAM, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ID_FLUSSO_BT as PAGAIDFLUSBT, ");
    SQL.append("  A.DATA_VALUTA as PAGADATAVALU, ");
    SQL.append("  A.CODICE_RIF_OPERAZIONE as PAGCODRIFOPE, ");
    SQL.append("  A.IMPORTO_BOLLO as PAGAIMPOBOLL, ");
    SQL.append("  A.IMPORTO_SPESE as PAGAIMPOSPES, ");
    SQL.append("  A.IMPORTO_COMMISSIONI as PAGAIMPOCOMM ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PAGAMENTI A ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.ID_FLUSSO_BT, '-1') = NVL(~~PQRY_PARAMEPAGAM2.ROWNAMIDFLBT~~, NVL(A.ID_FLUSSO_BT, '-1'))) ");
    SQL.append("and   ((A.D_DATA_PAGAM BETWEEN DECODE(~~PQRY_PARAMEPAGAM2.ROWNAMDATDAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMEPAGAM2.ROWNAMDATDAL~~) AND DECODE(~~PQRY_PARAMEPAGAM2.ROWNAMEDATAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~PQRY_PARAMEPAGAM2.ROWNAMEDATAL~~))) ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ, ");
    SQL.append("  A.D_DATA_PAGAM, ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND ");
    PAN_PAGAMENTI.SetQuery(PPQRY_PAGAMENTI1, 5, SQL, -1, "");
    PAN_PAGAMENTI.SetQueryDB(PPQRY_PAGAMENTI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAGAMENTI.SetMasterTable(0, "PAGAMENTI");
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_ANNOLIQ, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_NUMEROLIQ, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_DATA, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_ANNOMAND, true);
    PAN_PAGAMENTI.AddToSortList(PFL_PAGAMENTI_NUMEROMAND, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAGAMENTI.Status() == 2)
    {
      int oldListQBE = PAN_PAGAMENTI.iUseListQBE;
      PAN_PAGAMENTI.iUseListQBE = 0;
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAGAMENTI.PanelCommand(Glb.PCM_FIND);
      PAN_PAGAMENTI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMEPAGAME) PAN_PARAMEPAGAME_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEPAGAME) PAN_PARAMEPAGAME_ValidateRow(Cancel);
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMEPAGAME) PAN_PARAMEPAGAME_DynamicProperties();
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMEPAGAME) PAN_PARAMEPAGAME_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMEPAGAME) PAN_PARAMEPAGAME_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PAGAMENTI) PAN_PAGAMENTI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
