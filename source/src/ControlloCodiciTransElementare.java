// **********************************************
// Controllo Codici Trans Elementare
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloCodiciTransElementare extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_CONTCODITRAN_NUMEROORDINA = 0;
  private static int GRP_CONTCODITRAN_DATAORDINATI = 1;
  private static int GRP_CONTCODITRAN_CODICDACONTR = 2;

  private static int PFL_CONTCODITRAN_DAL1 = 0;
  private static int PFL_CONTCODITRAN_AL1 = 1;
  private static int PFL_CONTCODITRAN_NEWPANELLAB1 = 2;
  private static int PFL_CONTCODITRAN_DAL = 3;
  private static int PFL_CONTCODITRAN_AL = 4;
  private static int PFL_CONTCODITRAN_NEWPANELLABE = 5;
  private static int PFL_CONTCODITRAN_UFFICIO = 6;
  private static int PFL_CONTCODITRAN_ELABORA = 7;
  private static int PFL_CONTCODITRAN_CODICDACONTR = 8;

  private static int PPQRY_NEWTABLE28 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_CONTCODITRAN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE55(IMDB);
    //
    //
    Init_PQRY_NEWTABLE28(IMDB);
    Init_PQRY_NEWTABLE28_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE55(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_NEWTABLE55, 7);
    IMDB.set_TblCode(IMDBDef5.TBL_NEWTABLE55, "TBL_NEWTABLE55");
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMENDAL, "ROWNAMENDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMENDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMENAL, "ROWNAMENAL");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMENAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMDAINSI, "ROWNAMDAINSI");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMDAINSI,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMCODACO, "ROWNAMCODACO");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE55,IMDBDef5.FLD_NEWTABLE55_ROWNAMCODACO,5,6,0);
    IMDB.TblAddNew(IMDBDef5.TBL_NEWTABLE55, 0);
  }

  private static void Init_PQRY_NEWTABLE28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE28, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE28, "PQRY_NEWTABLE28");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL, "ROWNAMENDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL, "ROWNAMENAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMCODACO, "ROWNAMCODACO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28,IMDBDef15.PQSL_NEWTABLE28_ROWNAMCODACO,5,6,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE28, 0);
  }

  private static void Init_PQRY_NEWTABLE28_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE28_RS, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE28_RS, "PQRY_NEWTABLE28_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL, "ROWNAMENDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL, "ROWNAMENAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMCODACO, "ROWNAMCODACO");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE28_RS,IMDBDef15.PQSL_NEWTABLE28_ROWNAMCODACO,5,6,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloCodiciTransElementare(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloCodiciTransElementare()
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
    FormIdx = MyGlb.FRM_CONCODTRAELE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "440F124B-2B1E-474D-9BE2-422C98F2BF83";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 340;
    DesignHeight = 326;
    set_Caption(new IDVariant("Controllo Codici Trans Elementare"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 340;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Controllo Codici Trans";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_CONTCODITRAN = new IDPanel(w, this, 1, "PAN_CONTCODITRAN");
    Frames[1].Content = PAN_CONTCODITRAN;
    PAN_CONTCODITRAN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTCODITRAN.VS = MainFrm.VisualStyleList;
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 340-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "08DBEE6D-3265-44CE-8127-7E4B6298CE71");
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 492, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTCODITRAN.InitStatus = 2;
    PAN_CONTCODITRAN_Init();
    PAN_CONTCODITRAN_InitFields();
    PAN_CONTCODITRAN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_NEWTABLE55, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONCODTRAELE_NEWTABLE28();
      }
      PAN_CONTCODITRAN.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloCodiciTransElementare);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloCodiciTransElementare.class.getName() : (Glb.ClassWithPackage(ControlloCodiciTransElementare.class) ? ControlloCodiciTransElementare.class.getName().substring(ControlloCodiciTransElementare.class.getPackage().getName().length() + 1) : ControlloCodiciTransElementare.class.getName()));
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
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Indicare almeno un parametro!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        if ((IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL, 0)))) || (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL, 0))) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL, 0))))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Indicare entrambi gli estremi dell'ordinativo!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        if ((IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL, 0)) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL, 0)))) || (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL, 0))) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL, 0))))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Indicare entrambe le date dell'ordinativo!", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("NUM_DA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENDAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("NUM_A")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMENAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_A")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_INI")), IDL.ToString(IMDB.Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMDAINSI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("UFFICIO")), ((IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMEUFFIC, 0))));
        MainFrm.SetParametroStampaJasper((new IDVariant("TIPO")), IMDB.Value(IMDBDef15.PQRY_NEWTABLE28, IMDBDef15.PQSL_NEWTABLE28_ROWNAMCODACO, 0));
        MainFrm.LanciaStampaJasper((new IDVariant("Controllo_Codici_Trans")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloCodiciTransElementare", "Elabora", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Controllo Codici Trans. Elementare", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMENDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMENAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMCODACO, 0, (new IDVariant("COD_5")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloCodiciTransElementare", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_NEWTABLEDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloCodiciTransElementare", "Unload", _e);
    }
  }

  // **********************************************************************
  // New Table: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_NEWTABLEDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMENDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMENAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMDAINSI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMCODACO, 0, new IDVariant());
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void CONCODTRAELE_NEWTABLE28() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE28_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_NEWTABLE55, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_NEWTABLE55, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE28_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE28_RS, 0, IMDBDef5.TBL_NEWTABLE55, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE28_RS, 0, 0, IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMENDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE28_RS, 1, 0, IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMENAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE28_RS, 2, 0, IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE28_RS, 3, 0, IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE28_RS, 4, 0, IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE28_RS, 5, 0, IMDBDef5.TBL_NEWTABLE55, IMDBDef5.FLD_NEWTABLE55_ROWNAMCODACO, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_NEWTABLE55, 0);
      if (IMDB.Eof(IMDBDef5.TBL_NEWTABLE55, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_NEWTABLE55, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE28_RS, 0);
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
  private void PAN_CONTCODITRAN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTCODITRAN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTCODITRAN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTCODITRAN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTCODITRAN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTCODITRAN);
    // Stub
  }

  private void PAN_CONTCODITRAN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CONTCODITRAN_ELABORA)
    {
      this.IdxPanelActived = this.PAN_CONTCODITRAN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CONTCODITRAN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTCODITRAN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTCODITRAN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTCODITRAN_Init()
  {

    PAN_CONTCODITRAN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTCODITRAN.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, "98597522-EFA1-49F7-95B9-4A5EE9DD7C26");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, "Numero Ordinativo");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, MyGlb.PANEL_LIST, 0, -9999, 88, 16, 0, 0);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, MyGlb.PANEL_FORM, 16, 7, 264, 49, 0, 0);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, 0, 106);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, 1, 13);
    PAN_CONTCODITRAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, 0, 4);
    PAN_CONTCODITRAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, 1, 4);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_NUMEROORDINA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, "0FA52CB3-7292-4B07-BE8A-CCD345D4CB44");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, "Data Ordinativo");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, MyGlb.PANEL_LIST, 88, -9999, 208, 16, 0, 0);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, MyGlb.PANEL_FORM, 16, 63, 264, 49, 0, 0);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, 0, 89);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, 1, 13);
    PAN_CONTCODITRAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, 0, 4);
    PAN_CONTCODITRAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, 1, 4);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_DATAORDINATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, "8DDD478E-365A-460B-A5E2-8663DE08B872");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, "Codice da Controllare");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, MyGlb.VIS_GROUPSTYLE);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_LIST, 0, -9999, 132, 16, 0, 0);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_FORM, 16, 147, 264, 49, 0, 0);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, 0, 120);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, 1, 13);
    PAN_CONTCODITRAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, 0, 4);
    PAN_CONTCODITRAN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, 1, 4);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_GROUP, GRP_CONTCODITRAN_CODICDACONTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CONTCODITRAN.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, "39D59043-A9CE-4F69-A974-6A3804DDDB2A");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, "Dal  ");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, "7432D51C-9C22-4973-9B9D-731F8D11DFAA");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, "Al ");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, "EED87B12-CA8A-4BFF-92B0-03A3495C7412");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, "1217F136-6568-4A2E-8B45-66A5BF9560BA");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, "Dal");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, "36B7C733-FAD3-4DE8-8A56-4E55FC68DF61");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, "Al");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, "05D05A84-B5AC-4765-8710-AF6197CB5E88");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, "50F8AC9A-D274-46CE-949B-8E2285BCD4E8");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, "Ufficio");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, "EBFEFCBD-0C24-4FF7-9EEF-00F7F167A377");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, "Elabora");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_CONTCODITRAN.SetImage(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, 0, "button1.gif", false);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_CONTCODITRAN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, "99177974-C78D-4739-8E99-6850365EEA87");
    PAN_CONTCODITRAN.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, "Codice Da Controllare");
    PAN_CONTCODITRAN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, "");
    PAN_CONTCODITRAN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.VIS_OPTBUTSENBOR);
    PAN_CONTCODITRAN.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTCODITRAN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_LIST, 36);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_LIST, "Dal  ");
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_FORM, 20, 32, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL1, MyGlb.PANEL_FORM, "Dal  ");
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_DAL1, -1, GRP_CONTCODITRAN_NUMEROORDINA);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_DAL1, PPQRY_NEWTABLE28, "A.ROWNAMENDAL", "ROWNAMENDAL", 1, 5, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_LIST, 48, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_LIST, 28);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_LIST, "Al ");
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_FORM, 148, 32, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_FORM, 20);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL1, MyGlb.PANEL_FORM, "Al ");
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_AL1, -1, GRP_CONTCODITRAN_NUMEROORDINA);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_AL1, PPQRY_NEWTABLE28, "A.ROWNAMENAL", "ROWNAMENAL", 1, 5, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, MyGlb.PANEL_LIST, 172, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, MyGlb.PANEL_FORM, 264, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_NEWPANELLAB1, -1, GRP_CONTCODITRAN_NUMEROORDINA);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_LIST, 88, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_LIST, 24);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_FORM, 20, 88, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_FORM, 28);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_DAL, -1, GRP_CONTCODITRAN_DATAORDINATI);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_DAL, PPQRY_NEWTABLE28, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_LIST, 192, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_LIST, 20);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_LIST, "Al");
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_FORM, 148, 88, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_FORM, 20);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_AL, MyGlb.PANEL_FORM, "Al");
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_AL, -1, GRP_CONTCODITRAN_DATAORDINATI);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_AL, PPQRY_NEWTABLE28, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, MyGlb.PANEL_LIST, 224, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, MyGlb.PANEL_FORM, 264, 92, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_NEWPANELLABE, -1, GRP_CONTCODITRAN_DATAORDINATI);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_LIST, 296, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_FORM, 16, 120, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_UFFICIO, -1, -1);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_UFFICIO, PPQRY_NEWTABLE28, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, MyGlb.PANEL_LIST, 196, 160, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, MyGlb.PANEL_FORM, 200, 216, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_ELABORA, -1, -1);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_LIST, 0, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_LIST, 132);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_LIST, "Codice Da Controllare");
    PAN_CONTCODITRAN.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_FORM, 20, 172, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODITRAN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_FORM, 132);
    PAN_CONTCODITRAN.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODITRAN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODITRAN_CODICDACONTR, MyGlb.PANEL_FORM, "Codice Da Controllare");
    PAN_CONTCODITRAN.SetFieldPage(PFL_CONTCODITRAN_CODICDACONTR, -1, GRP_CONTCODITRAN_CODICDACONTR);
    PAN_CONTCODITRAN.SetFieldPanel(PFL_CONTCODITRAN_CODICDACONTR, PPQRY_NEWTABLE28, "A.ROWNAMCODACO", "ROWNAMCODACO", 5, 6, 0, -13997);
    PAN_CONTCODITRAN.SetValueListItem(PFL_CONTCODITRAN_CODICDACONTR, (new IDVariant("COD_5")), "Codice V Livello", "", "", -1);
    PAN_CONTCODITRAN.SetValueListItem(PFL_CONTCODITRAN_CODICDACONTR, (new IDVariant("COD_EU")), "Codice Europeo", "", "", -1);
  }

  private void PAN_CONTCODITRAN_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTCODITRAN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_CONTCODITRAN.SetQuery(PPQRY_T53, 0, SQL, PFL_CONTCODITRAN_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53NEWEXPRES ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_CONTCODITRAN.SetQuery(PPQRY_T53, 1, SQL, PFL_CONTCODITRAN_UFFICIO, "");
    PAN_CONTCODITRAN.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTCODITRAN.SetIMDB(IMDB, "PQRY_NEWTABLE28", true);
    PAN_CONTCODITRAN.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_CONTCODITRAN.SetQueryIMDB(PPQRY_NEWTABLE28, IMDBDef15.PQRY_NEWTABLE28_RS, IMDBDef5.TBL_NEWTABLE55);
    JustLoaded = true;
    PAN_CONTCODITRAN.SetFieldPrimaryIndex(PFL_CONTCODITRAN_DAL1, IMDBDef5.FLD_NEWTABLE55_ROWNAMENDAL);
    PAN_CONTCODITRAN.SetFieldPrimaryIndex(PFL_CONTCODITRAN_AL1, IMDBDef5.FLD_NEWTABLE55_ROWNAMENAL);
    PAN_CONTCODITRAN.SetFieldPrimaryIndex(PFL_CONTCODITRAN_DAL, IMDBDef5.FLD_NEWTABLE55_ROWNAMEDAL);
    PAN_CONTCODITRAN.SetFieldPrimaryIndex(PFL_CONTCODITRAN_AL, IMDBDef5.FLD_NEWTABLE55_ROWNAMEAL);
    PAN_CONTCODITRAN.SetFieldPrimaryIndex(PFL_CONTCODITRAN_UFFICIO, IMDBDef5.FLD_NEWTABLE55_ROWNAMEUFFIC);
    PAN_CONTCODITRAN.SetFieldPrimaryIndex(PFL_CONTCODITRAN_CODICDACONTR, IMDBDef5.FLD_NEWTABLE55_ROWNAMCODACO);
    PAN_CONTCODITRAN.SetMasterTable(0, "NEWTABLE55");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTCODITRAN.Status() == 2)
    {
      int oldListQBE = PAN_CONTCODITRAN.iUseListQBE;
      PAN_CONTCODITRAN.iUseListQBE = 0;
      PAN_CONTCODITRAN.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTCODITRAN.PanelCommand(Glb.PCM_FIND);
      PAN_CONTCODITRAN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTCODITRAN) PAN_CONTCODITRAN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTCODITRAN) PAN_CONTCODITRAN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTCODITRAN) PAN_CONTCODITRAN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTCODITRAN) PAN_CONTCODITRAN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTCODITRAN) PAN_CONTCODITRAN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
