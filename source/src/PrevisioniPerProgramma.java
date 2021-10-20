// **********************************************
// Previsioni Per Programma
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerProgramma extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVIPERPROG_PARTE = 0;

  private static int PFL_PREVIPERPROG_PROGRAMMA = 0;
  private static int PFL_PREVIPERPROG_DAPROGETTO = 1;
  private static int PFL_PREVIPERPROG_APROGETTO = 2;
  private static int PFL_PREVIPERPROG_DABILANSIMUL = 3;
  private static int PFL_PREVIPERPROG_RIEPIPERSERV = 4;
  private static int PFL_PREVIPERPROG_VARIAZIONI = 5;
  private static int PFL_PREVIPERPROG_DESCRIINTERV = 6;
  private static int PFL_PREVIPERPROG_PREVANNINCOR = 7;
  private static int PFL_PREVIPERPROG_TOTALPERTITO = 8;
  private static int PFL_PREVIPERPROG_DETTAGCAPITO = 9;
  private static int PFL_PREVIPERPROG_PARTE = 10;
  private static int PFL_PREVIPERPROG_NEWPANELABE1 = 11;
  private static int PFL_PREVIPERPROG_ELABORA = 12;

  private static int PPQRY_PAR80 = 0;

  private static int PPQRY_PROGRAMMI = 1;
  private static int PPQRY_PROGETTI1 = 2;
  private static int PPQRY_PROGETTI = 3;


  IDPanel PAN_PREVIPERPROG;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR55(IMDB);
    //
    //
    Init_PQRY_PAR80(IMDB);
    Init_PQRY_PAR80_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR55(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR55, 11);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR55, "TBL_PAR55");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEDAPRO, "ROWNAMEDAPRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEDAPRO,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEAPROG, "ROWNAMEAPROG");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEAPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMRIPESE, "ROWNAMRIPESE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMRIPESE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR55,IMDBDef3.FLD_PAR55_RONAPRANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR55, 0);
  }

  private static void Init_PQRY_PAR80(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR80, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR80, "PQRY_PAR80");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEDAPRO, "ROWNAMEDAPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEDAPRO,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEAPROG, "ROWNAMEAPROG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEAPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMRIPESE, "ROWNAMRIPESE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMRIPESE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80,IMDBDef12.PQSL_PAR80_RONAPRANINCO,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR80, 0);
  }

  private static void Init_PQRY_PAR80_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR80_RS, 11);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR80_RS, "PQRY_PAR80_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEDAPRO, "ROWNAMEDAPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEDAPRO,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEAPROG, "ROWNAMEAPROG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEAPROG,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMTOPETI,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMRIPESE, "ROWNAMRIPESE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMRIPESE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR80_RS,IMDBDef12.PQSL_PAR80_RONAPRANINCO,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerProgramma(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerProgramma()
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
    FormIdx = MyGlb.FRM_PREVIPERPROG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F80F771B-0DD5-46B9-A60C-75DD5D122EF8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 484;
    DesignHeight = 322;
    set_Caption(new IDVariant("Previsioni Per Programma"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 484;
    Frames[1].Height = 296;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per Programma";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 296;
    PAN_PREVIPERPROG = new IDPanel(w, this, 1, "PAN_PREVIPERPROG");
    Frames[1].Content = PAN_PREVIPERPROG;
    PAN_PREVIPERPROG.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVIPERPROG.VS = MainFrm.VisualStyleList;
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 484-MyGlb.PAN_OFFS_X, 296-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4CCFBA15-06B6-477F-B28C-8BA91FF855D5");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 560, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVIPERPROG.InitStatus = 2;
    PAN_PREVIPERPROG_Init();
    PAN_PREVIPERPROG_InitFields();
    PAN_PREVIPERPROG_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR55, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREVIPERPROG_PAR80();
      }
      PAN_PREVIPERPROG.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniPerProgramma);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerProgramma.class.getName() : (Glb.ClassWithPackage(PrevisioniPerProgramma.class) ? PrevisioniPerProgramma.class.getName().substring(PrevisioniPerProgramma.class.getPackage().getName().length() + 1) : PrevisioniPerProgramma.class.getName()));
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
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW = (new IDVariant("d_bil_pre_programmi", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMDABISI, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampa((new IDVariant("NO")));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampa(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEPROGR, 0),(new IDVariant(" "))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMDESINT, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEDAPRO, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEAPROG, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMRIPESE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMTOPETI, 0));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerProgramma", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEPROGR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEDAPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEAPROG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMDESINT, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMTOPETI, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMRIPESE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEVARIA, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_RONAPRANINCO, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerProgramma", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Programma On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVIPERPROG_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVIPERPROG);
      // 
      // Previsioni Per Programma On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEPROGR, 0))))
      {
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if ((IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true) || IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEPARTE, 0).equals((new IDVariant("ES")), true)) && IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERPROG.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerProgramma", "PrevisioniPerProgrammaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Programma On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_PREVIPERPROG_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Programma On Change Row Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEPROGR, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEDAPRO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PAR80, IMDBDef12.PQSL_PAR80_ROWNAMEAPROG, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerProgramma", "PrevisioniPerProgrammaOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREVIPERPROG_PAR80() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR80_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR55, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR55, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR80_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR80_RS, 0, IMDBDef3.TBL_PAR55, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 0, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 1, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEPROGR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 2, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEDAPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 3, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEAPROG, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 4, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 5, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 6, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 7, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMTOPETI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 8, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMRIPESE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 9, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR80_RS, 10, 0, IMDBDef3.TBL_PAR55, IMDBDef3.FLD_PAR55_RONAPRANINCO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR55, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR55, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR55, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR80_RS, 0);
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
  private void PAN_PREVIPERPROG_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVIPERPROG, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVIPERPROG_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVIPERPROG, Cancel);
    // Stub
  }

  private void PAN_PREVIPERPROG_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVIPERPROG_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVIPERPROG.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVIPERPROG_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PREVIPERPROG_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVIPERPROG_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVIPERPROG_Init()
  {

    PAN_PREVIPERPROG.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVIPERPROG.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, "C6C2FE6C-CA61-45B2-B9D3-5B1148900F76");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, "Parte");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, MyGlb.PANEL_FORM, 4, 7, 464, 49, 0, 0);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, 0, 31);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, 1, 13);
    PAN_PREVIPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, 0, 4);
    PAN_PREVIPERPROG.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, 1, 4);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVIPERPROG_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVIPERPROG.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, "84237F9A-64FB-4284-B149-F3A734CACEB3");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, "Programma");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, "9E65A5CA-BBA2-4AD9-A50D-629D317CC036");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, "Da Obiettivo Operativo");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, "78A08999-0CC0-4BAF-A018-61CFE4439246");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, "A Obiettivo Operativo");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, "787B9B56-93B1-4875-A916-818A1B2A7F94");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, "38076D1A-6A1E-45F3-A251-2718256D5993");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, "Riepilogo Per Servizi");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, "3746B48D-681C-4B8C-93A7-1EDF2222CAF1");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, "Variazioni");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, "9F67B28C-5E2B-4AC0-ADE7-164C6C3A9F24");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, "Descrizione Intervento");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, "BAE9FCF3-E22C-4500-A87C-281F9887E8FC");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, "3696255B-61AE-4C4F-845E-53F2D11297CD");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, "B3CCE28E-7363-4E52-B03F-14B143237E7F");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, "455FDA5C-8F76-4089-A508-EE1A2058D1F1");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, "Parte");
    PAN_PREVIPERPROG.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, "1DCF0C71-688F-473E-89B6-0BF692A52FFD");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, "");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PREVIPERPROG.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, "781670D5-D223-4CA8-AC83-A36113D824AB");
    PAN_PREVIPERPROG.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, "Elabora");
    PAN_PREVIPERPROG.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVIPERPROG.SetImage(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, 0, "button1.gif", false);
    PAN_PREVIPERPROG.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PREVIPERPROG_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, 72, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, 64);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, 68, 60, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, 80);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_PROGRAMMA, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_PROGRAMMA, PPQRY_PAR80, "A.ROWNAMEPROGR", "ROWNAMEPROGR", 5, 4, 0, -13997);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_LIST, 152, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_LIST, 68);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_LIST, "D. Ob. Opr.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_FORM, 8, 84, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_FORM, 140);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DAPROGETTO, MyGlb.PANEL_FORM, "Da Obiettivo Operativo");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_DAPROGETTO, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_DAPROGETTO, PPQRY_PAR80, "A.ROWNAMEDAPRO", "ROWNAMEDAPRO", 5, 4, 0, -13997);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_LIST, 192, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_LIST, 60);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_LIST, "A Ob. Oper.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_FORM, 4, 108, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_APROGETTO, MyGlb.PANEL_FORM, "A Obiettivo Operativo");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_APROGETTO, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_APROGETTO, PPQRY_PAR80, "A.ROWNAMEAPROG", "ROWNAMEAPROG", 5, 4, 0, -13997);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_LIST, 232, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_FORM, 20, 136, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_FORM, 128);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_DABILANSIMUL, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_DABILANSIMUL, PPQRY_PAR80, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_LIST, 104);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_LIST, "Rp. P. Srv.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_FORM, 316, 136, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_FORM, 128);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_RIEPIPERSERV, MyGlb.PANEL_FORM, "Riepilogo Per Servizi");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_RIEPIPERSERV, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_RIEPIPERSERV, PPQRY_PAR80, "A.ROWNAMRIPESE", "ROWNAMRIPESE", 5, 2, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_RIEPIPERSERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_RIEPIPERSERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, 432, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, 364, 160, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, 80);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_VARIAZIONI, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_VARIAZIONI, PPQRY_PAR80, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 2, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, 312, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Int.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, 4, 184, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_DESCRIINTERV, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_DESCRIINTERV, PPQRY_PAR80, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_LIST, 520, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_FORM, 288, 184, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_FORM, 156);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_PREVANNINCOR, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_PREVANNINCOR, PPQRY_PAR80, "A.RONAPRANINCO", "RONAPRANINCO", 5, 2, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_FORM, 40, 208, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_FORM, 108);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_TOTALPERTITO, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_TOTALPERTITO, PPQRY_PAR80, "A.ROWNAMTOPETI", "ROWNAMTOPETI", 5, 2, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, 272, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, 32, 160, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, 116);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_DETTAGCAPITO, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_DETTAGCAPITO, PPQRY_PAR80, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_FORM, 152, 32, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_FORM, 156);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_PARTE, -1, GRP_PREVIPERPROG_PARTE);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_PARTE, PPQRY_PAR80, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVIPERPROG.SetValueListItem(PFL_PREVIPERPROG_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, MyGlb.PANEL_LIST, 264, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, MyGlb.PANEL_FORM, 8, 36, 20, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_NEWPANELABE1, -1, GRP_PREVIPERPROG_PARTE);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, MyGlb.PANEL_LIST, 320, 252, 72, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERPROG.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, MyGlb.PANEL_FORM, 388, 240, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERPROG.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERPROG.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERPROG_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERPROG.SetFieldPage(PFL_PREVIPERPROG_ELABORA, -1, -1);
    PAN_PREVIPERPROG.SetFieldPanel(PFL_PREVIPERPROG_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PREVIPERPROG_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVIPERPROG.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGRACODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PROGRNEWEXPR ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERPROG.SetQuery(PPQRY_PROGRAMMI, 0, SQL, PFL_PREVIPERPROG_PROGRAMMA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGRACODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PROGRNEWEXPR ");
    SQL.append("from ");
    SQL.append("  PROGRAMMI A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERPROG.SetQuery(PPQRY_PROGRAMMI, 1, SQL, PFL_PREVIPERPROG_PROGRAMMA, "");
    PAN_PREVIPERPROG.SetQueryDB(PPQRY_PROGRAMMI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGETCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PROGENEWEXPR ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEDAPRO~~) ");
    SQL.append("and   (A.PROGRAMMA = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERPROG.SetQuery(PPQRY_PROGETTI1, 0, SQL, PFL_PREVIPERPROG_DAPROGETTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGETCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PROGENEWEXPR ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGRAMMA = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERPROG.SetQuery(PPQRY_PROGETTI1, 1, SQL, PFL_PREVIPERPROG_DAPROGETTO, "");
    PAN_PREVIPERPROG.SetQueryDB(PPQRY_PROGETTI1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGETCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PROGENEWEXPR ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEAPROG~~) ");
    SQL.append("and   (A.PROGRAMMA = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERPROG.SetQuery(PPQRY_PROGETTI, 0, SQL, PFL_PREVIPERPROG_APROGETTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as PROGETCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PROGENEWEXPR ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGRAMMA = ~~ROWNAMEPROGR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERPROG.SetQuery(PPQRY_PROGETTI, 1, SQL, PFL_PREVIPERPROG_APROGETTO, "");
    PAN_PREVIPERPROG.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVIPERPROG.SetIMDB(IMDB, "PQRY_PAR80", true);
    PAN_PREVIPERPROG.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PREVIPERPROG.SetQueryIMDB(PPQRY_PAR80, IMDBDef12.PQRY_PAR80_RS, IMDBDef3.TBL_PAR55);
    JustLoaded = true;
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_PROGRAMMA, IMDBDef3.FLD_PAR55_ROWNAMEPROGR);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_DAPROGETTO, IMDBDef3.FLD_PAR55_ROWNAMEDAPRO);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_APROGETTO, IMDBDef3.FLD_PAR55_ROWNAMEAPROG);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_DABILANSIMUL, IMDBDef3.FLD_PAR55_ROWNAMDABISI);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_RIEPIPERSERV, IMDBDef3.FLD_PAR55_ROWNAMRIPESE);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_VARIAZIONI, IMDBDef3.FLD_PAR55_ROWNAMEVARIA);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_DESCRIINTERV, IMDBDef3.FLD_PAR55_ROWNAMDESINT);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_PREVANNINCOR, IMDBDef3.FLD_PAR55_RONAPRANINCO);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_TOTALPERTITO, IMDBDef3.FLD_PAR55_ROWNAMTOPETI);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_DETTAGCAPITO, IMDBDef3.FLD_PAR55_ROWNAMDETCAP);
    PAN_PREVIPERPROG.SetFieldPrimaryIndex(PFL_PREVIPERPROG_PARTE, IMDBDef3.FLD_PAR55_ROWNAMEPARTE);
    PAN_PREVIPERPROG.SetMasterTable(0, "PAR55");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVIPERPROG.Status() == 2)
    {
      int oldListQBE = PAN_PREVIPERPROG.iUseListQBE;
      PAN_PREVIPERPROG.iUseListQBE = 0;
      PAN_PREVIPERPROG.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVIPERPROG.PanelCommand(Glb.PCM_FIND);
      PAN_PREVIPERPROG.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVIPERPROG) PAN_PREVIPERPROG_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERPROG) PAN_PREVIPERPROG_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVIPERPROG) PAN_PREVIPERPROG_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERPROG) PAN_PREVIPERPROG_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVIPERPROG) PAN_PREVIPERPROG_OnChangeRow();
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
    if (SrcObj == PAN_PREVIPERPROG) PAN_PREVIPERPROG_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
