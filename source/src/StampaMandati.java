// **********************************************
// Stampa Mandati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampaMandati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_MANDATI = 0;

  private static int PFL_PARAMETRI_DAL = 0;
  private static int PFL_PARAMETRI_AL = 1;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 2;
  private static int PFL_PARAMETRI_UFFICIO = 3;
  private static int PFL_PARAMETRI_PROPOSTA = 4;
  private static int PFL_PARAMETRI_SUBIMPEGNO = 5;
  private static int PFL_PARAMETRI_CODICERITENU = 6;
  private static int PFL_PARAMETRI_CAUSALE = 7;
  private static int PFL_PARAMETRI_CODICECREDIT = 8;
  private static int PFL_PARAMETRI_NOTE1 = 9;
  private static int PFL_PARAMETRI_ELABORA = 10;

  private static int PPQRY_PARAMETRI177 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI182(IMDB);
    //
    //
    Init_PQRY_PARAMETRI177(IMDB);
    Init_PQRY_PARAMETRI177_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI182(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI182, 12);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI182, "TBL_PARAMETRI182");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMMANDAL, "ROWNAMMANDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEMANAL, "ROWNAMEMANAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEUFFIC,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMECAMBI, "ROWNAMECAMBI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMECAMBI,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEPROPO,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMESUBIM, "ROWNAMESUBIM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMESUBIM,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMERITEN, "ROWNAMERITEN");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMERITEN,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMECAUSA,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEMODUL, "ROWNAMEMODUL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMEMODUL,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMECREDI,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMENOTE, "ROWNAMENOTE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMENOTE,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMDATSIO, "ROWNAMDATSIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI182,IMDBDef5.FLD_PARAMETRI182_ROWNAMDATSIO,6,19,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI182, 0);
  }

  private static void Init_PQRY_PARAMETRI177(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI177, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI177, "PQRY_PARAMETRI177");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMMANDAL, "ROWNAMMANDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEMANAL, "ROWNAMEMANAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEPROPO,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMESUBIM, "ROWNAMESUBIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMESUBIM,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMERITEN, "ROWNAMERITEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMERITEN,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECAUSA,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECREDI,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMENOTE, "ROWNAMENOTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMENOTE,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEUFFIC,1,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI177, 0);
  }

  private static void Init_PQRY_PARAMETRI177_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI177_RS, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI177_RS, "PQRY_PARAMETRI177_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMMANDAL, "ROWNAMMANDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMMANDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEMANAL, "ROWNAMEMANAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEMANAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEPROPO,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMESUBIM, "ROWNAMESUBIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMESUBIM,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMERITEN, "ROWNAMERITEN");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMERITEN,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECAUSA,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMECREDI,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMENOTE, "ROWNAMENOTE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMENOTE,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI177_RS,IMDBDef15.PQSL_PARAMETRI177_ROWNAMEUFFIC,1,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampaMandati(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampaMandati()
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
    FormIdx = MyGlb.FRM_STAMPAMANDAT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "526897CC-2285-434A-9576-11A674B32C77";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 348;
    DesignHeight = 294;
    set_Caption(new IDVariant("Stampa Mandati"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 348;
    Frames[1].Height = 268;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 268;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 348-MyGlb.PAN_OFFS_X, 268-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4A3D2549-06AE-4784-98DE-0A25F87AAC57");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1104, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI182, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMPAMANDAT_PARAMETRI177();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof StampaMandati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampaMandati.class.getName() : (Glb.ClassWithPackage(StampaMandati.class) ? StampaMandati.class.getName().substring(StampaMandati.class.getPackage().getName().length() + 1) : StampaMandati.class.getName()));
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
      if (IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMMANDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMEMANAL, 0), true)>0)
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Intervallo non corretto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
        return 0;
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DAL")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMMANDAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("AL")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMEMANAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("UFFICIO")), IDL.ToString(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMEUFFIC, 0))));
      MainFrm.SetParametroStampaJasper((new IDVariant("PROPOSTA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMEPROPO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("SUBIMPEGNO")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMESUBIM, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("COD_RITENUTE")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMERITEN, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("CAUSALE")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMECAUSA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("COD_CREDITORE")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMECREDI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("NOTE")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PARAMETRI177, IMDBDef15.PQSL_PARAMETRI177_ROWNAMENOTE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DATA_INIZIO_SIOPE")), IDL.ToString(MainFrm.DATAINIZSIOP));
      MainFrm.SetParametroStampaJasper((new IDVariant("VIS_FRAZIONABILE")), (((MainFrm.FASEBILANCIO.compareTo((new IDVariant(1)), true)>=0 && MainFrm.FASEBILANCIO.compareTo((new IDVariant(2)), true)<=0))?(new IDVariant("SI")):(new IDVariant("NO"))));
      MainFrm.LanciaStampaJasper((new IDVariant("Stampa_mandati")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaMandati", "Elabora", _e);
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
    IDVariant v_ULTIMOMANDAT1 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ULTIMOMANDAT = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CODICE = new IDVariant(0,IDVariant.STRING);
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CODICE = (new IDVariant("man", IDVariant.STRING));
      v_NOMECAPTION = (new IDVariant("Estremi Mandati ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEUFFIC, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEPROPO, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMESUBIM, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMERITEN, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMECAUSA, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMECREDI, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMENOTE, 0, (new IDVariant("N")));
      // 
      // calcolo ultimo mandato emesso e ultimo mandato stampato
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.MANDATI_STAMPATI as N04MANDASTAM ");
        SQL.append("from ");
        SQL.append("  N04 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ULTIMOMANDAT1 = QV.Get("N04MANDASTAM", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.NUMERO as N03NUMERO ");
        SQL.append("from ");
        SQL.append("  N03 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CODICE = " + IDL.CSql(v_CODICE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ULTIMOMANDAT = QV.Get("N03NUMERO", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if ((IDL.Add(v_ULTIMOMANDAT1, (new IDVariant(1)))).compareTo(v_ULTIMOMANDAT, true)>0)
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMMANDAL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEMANAL, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMMANDAL, 0, IDL.Add(v_ULTIMOMANDAT1, (new IDVariant(1))));
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEMANAL, 0, new IDVariant(v_ULTIMOMANDAT));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaMandati", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMMANDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEMANAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMECAMBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEPROPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMESUBIM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMERITEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEMODUL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMECREDI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMENOTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMDATSIO, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void STAMPAMANDAT_PARAMETRI177() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI177_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI182, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI182, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI177_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI177_RS, 0, IMDBDef5.TBL_PARAMETRI182, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 0, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMMANDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 1, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEMANAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 2, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEPROPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 3, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMESUBIM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 4, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMERITEN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 5, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 6, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMECREDI, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 7, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMENOTE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI177_RS, 8, 0, IMDBDef5.TBL_PARAMETRI182, IMDBDef5.FLD_PARAMETRI182_ROWNAMEUFFIC, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI182, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI182, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI182, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI177_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "3BB2AD15-2FA0-4B2F-8BEB-0C4F3602A9E2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 4, 11, 292, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 46);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "1EC3E9EC-0090-4E7C-BCA3-4457BC73E7A8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "09EF85AC-05CB-4C58-B1E0-68C4889E79C9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "E02C6875-F894-459F-A558-5025573CAB30");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "CA2A57D4-6978-4681-8D64-44442EBC7CDD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "D1DBFCC2-E135-499F-AE53-7B6A9504C732");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, "EE5F8D49-17E9-4EB0-A543-19B35BD5C71B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, "Sub - Impegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, "F3F58B9B-742B-4DD2-A022-C796FFB19E9D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, "Codice Ritenute");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "F82DDFA7-43AF-4F83-A400-BE720BEA0D98");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "Causale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, "0F6B534B-1D60-4D6B-B71C-18DAC812DF04");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, "Codice Creditore");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, "FB088479-E43C-45CA-B832-363CC0595E73");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, "Note");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "BC91E979-751D-4B60-A495-29B8340E4B7C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 8, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI177, "A.ROWNAMMANDAL", "ROWNAMMANDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 180, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI177, "A.ROWNAMEMANAL", "ROWNAMEMANAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 244, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 280, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 60, 68, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI177, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, "Prop.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 48, 92, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTA, PPQRY_PARAMETRI177, "A.ROWNAMEPROPO", "ROWNAMEPROPO", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PROPOSTA, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_PROPOSTA, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub - Impegno");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_FORM, 184, 92, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub Impegno");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUBIMPEGNO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUBIMPEGNO, PPQRY_PARAMETRI177, "A.ROWNAMESUBIM", "ROWNAMESUBIM", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNO, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNO, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_LIST, "Codice Ritenute");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_FORM, 8, 116, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICERITENU, MyGlb.PANEL_FORM, "Codice Ritenute");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICERITENU, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICERITENU, PPQRY_PARAMETRI177, "A.ROWNAMERITEN", "ROWNAMERITEN", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CODICERITENU, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CODICERITENU, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 216, 116, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAUSALE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAUSALE, PPQRY_PARAMETRI177, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CAUSALE, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CAUSALE, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_LIST, "Cod. Cred.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_FORM, 4, 142, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_FORM, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICECREDIT, MyGlb.PANEL_FORM, "Codice Creditore");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICECREDIT, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICECREDIT, PPQRY_PARAMETRI177, "A.ROWNAMECREDI", "ROWNAMECREDI", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CODICECREDIT, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_CODICECREDIT, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_LIST, "Note");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_FORM, 232, 142, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_FORM, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NOTE1, MyGlb.PANEL_FORM, "Note");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NOTE1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NOTE1, PPQRY_PARAMETRI177, "A.ROWNAMENOTE", "ROWNAMENOTE", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NOTE1, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_NOTE1, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 152, 104, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 216, 200, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI177", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI177, IMDBDef15.PQRY_PARAMETRI177_RS, IMDBDef5.TBL_PARAMETRI182);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI182_ROWNAMMANDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI182_ROWNAMEMANAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI182_ROWNAMEUFFIC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROPOSTA, IMDBDef5.FLD_PARAMETRI182_ROWNAMEPROPO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SUBIMPEGNO, IMDBDef5.FLD_PARAMETRI182_ROWNAMESUBIM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICERITENU, IMDBDef5.FLD_PARAMETRI182_ROWNAMERITEN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAUSALE, IMDBDef5.FLD_PARAMETRI182_ROWNAMECAUSA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICECREDIT, IMDBDef5.FLD_PARAMETRI182_ROWNAMECREDI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NOTE1, IMDBDef5.FLD_PARAMETRI182_ROWNAMENOTE);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI182");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
