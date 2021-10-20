// **********************************************
// Solleciti Di Riscossione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SollecitiDiRiscossione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SOLLECITI_CAPITOLOART = 0;
  private static int GRP_SOLLECITI_ACCERTAMENTO = 1;
  private static int GRP_SOLLECITI_DATAEMISORDI = 2;

  private static int PFL_SOLLECITI_CAPITOLO = 0;
  private static int PFL_SOLLECITI_ARTICOLO = 1;
  private static int PFL_SOLLECITI_INFOVOCEPEG = 2;
  private static int PFL_SOLLECITI_APRIVOCEPEG = 3;
  private static int PFL_SOLLECITI_SLASH = 4;
  private static int PFL_SOLLECITI_NEWPANELLAB1 = 5;
  private static int PFL_SOLLECITI_ACCERTAMENTO = 6;
  private static int PFL_SOLLECITI_ANNOACC = 7;
  private static int PFL_SOLLECITI_SLASH2 = 8;
  private static int PFL_SOLLECITI_APRIACC = 9;
  private static int PFL_SOLLECITI_NEWPANELLABE = 10;
  private static int PFL_SOLLECITI_PROTOCOLLO = 11;
  private static int PFL_SOLLECITI_DAL = 12;
  private static int PFL_SOLLECITI_AL = 13;
  private static int PFL_SOLLECITI_ELABORA = 14;

  private static int PPQRY_PAR91 = 0;


  IDPanel PAN_SOLLECITI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR58(IMDB);
    //
    //
    Init_PQRY_PAR91(IMDB);
    Init_PQRY_PAR91_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR58(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR58, 7);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR58, "TBL_PAR58");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEPROTO, "ROWNAMEPROTO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR58,IMDBDef6.FLD_PAR58_ROWNAMEPROTO,5,10,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR58, 0);
  }

  private static void Init_PQRY_PAR91(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR91, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR91, "PQRY_PAR91");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEPROTO, "ROWNAMEPROTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91,IMDBDef15.PQSL_PAR91_ROWNAMEPROTO,5,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR91, 0);
  }

  private static void Init_PQRY_PAR91_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR91_RS, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR91_RS, "PQRY_PAR91_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, "ROWNAMNUMACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMNUMACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMANNACC, "ROWNAMANNACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMANNACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEPROTO, "ROWNAMEPROTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR91_RS,IMDBDef15.PQSL_PAR91_ROWNAMEPROTO,5,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SollecitiDiRiscossione(MyWebEntryPoint w, IMDBObj imdb)
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
  public SollecitiDiRiscossione()
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
    FormIdx = MyGlb.FRM_SOLLEDIRISCO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9EE7694D-4FDA-4B64-89A8-523AB0200080";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 312;
    DesignHeight = 298;
    set_Caption(new IDVariant("Solleciti Di Riscossione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 312;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Solleciti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_SOLLECITI = new IDPanel(w, this, 1, "PAN_SOLLECITI");
    Frames[1].Content = PAN_SOLLECITI;
    PAN_SOLLECITI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SOLLECITI.VS = MainFrm.VisualStyleList;
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 312-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BFD32A1C-05C8-4736-901F-9D2D92572856");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 552, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SOLLECITI.InitStatus = 2;
    PAN_SOLLECITI_Init();
    PAN_SOLLECITI_InitFields();
    PAN_SOLLECITI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR58, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SOLLEDIRISCO_PAR91();
      }
      PAN_SOLLECITI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_SOLLECITI.FrIndex)
    {
      if (IdxFieldActived ==PFL_SOLLECITI_APRIVOCEPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_SOLLECITI.FrIndex)
    {
      if (IdxFieldActived ==PFL_SOLLECITI_APRIACC) {
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
    return (obj instanceof SollecitiDiRiscossione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SollecitiDiRiscossione.class.getName() : (Glb.ClassWithPackage(SollecitiDiRiscossione.class) ? SollecitiDiRiscossione.class.getName().substring(SollecitiDiRiscossione.class.getPackage().getName().length() + 1) : SollecitiDiRiscossione.class.getName()));
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
      if (IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEAL, 0), true)>0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Dal maggiore di Data Al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEAL, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Valorizzare entrambe le date", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if ((IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0))) || (!(!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0))) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0)))))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Accertamento Incompleto", IDVariant.STRING));
        if ((IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMANNACC, 0))) || (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMANNACC, 0)))))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("ORD_DA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEDAL, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("ORD_A")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEAL, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("PROT")), IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEPROTO, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("CAP")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("ART")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_ACC")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMANNACC, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("NUM_ACC")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, 0),(new IDVariant(-1)))));
          MainFrm.LanciaStampaJasper((new IDVariant("Solleciti_Riscossione")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
        else
        {
          MainFrm.set_AlertMessage(v_ERR); 
        }
      }
      else
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Capitolo/Art. Incompleto", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri
  // **********************************************************************
  public int Apri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "Apri", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Peg
  // **********************************************************************
  public int ApriPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "ApriPeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info PEG
  // **********************************************************************
  public int InfoPEG ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info PEG Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0));
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "InfoPEG", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Check Peg
  // **********************************************************************
  public boolean CheckPeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Check Peg Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(-1));
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0)))
      {
        v_RETVALUE = (new IDVariant(-1));
        return v_RETVALUE.booleanValue();
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  CAP A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.E_S = 'E') ");
      SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Capitolo/Art. non esistente", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        v_RETVALUE = (new IDVariant(0));
        return v_RETVALUE.booleanValue();
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "CheckPeg", _e);
      return false;
    }
  }

  // **********************************************************************
  // Check Acc
  // **********************************************************************
  public boolean CheckAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_RETVALUE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Check Acc Body
      // Procedure Body
      // 
      v_RETVALUE = (new IDVariant(-1));
      if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMANNACC, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, 0)))
      {
        v_RETVALUE = (new IDVariant(-1));
        return v_RETVALUE.booleanValue();
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ACC A ");
      SQL.append("where (A.ANNO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMANNACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.NUMERO_ACC = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Accertamento inesistente", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        v_RETVALUE = (new IDVariant(0));
        return v_RETVALUE.booleanValue();
      }
      return v_RETVALUE.booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "CheckAcc", _e);
      return false;
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
      IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMNUMACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMANNACC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEPROTO, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "UnloadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMANNACC, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMNUMACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMANNACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
        IMDB.set_Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Solleciti On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_SOLLECITI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_SOLLECITI, Cancel);
      // 
      // Solleciti On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0))))
      {
        CheckPeg();
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMNUMACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMANNACC, 0))))
      {
        CheckAcc();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "SollecitiOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Solleciti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SOLLECITI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SOLLECITI);
      // 
      // Solleciti On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR91, IMDBDef15.PQSL_PAR91_ROWNAMEARTIC, 0))))
      {
        PAN_SOLLECITI.SetFlags (Glb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_SOLLECITI.SetFlags (Glb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SollecitiDiRiscossione", "SollecitiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void SOLLEDIRISCO_PAR91() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR91_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR58, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR58, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR91_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR91_RS, 0, IMDBDef6.TBL_PAR58, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR91_RS, 0, 0, IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR91_RS, 1, 0, IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR91_RS, 2, 0, IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR91_RS, 3, 0, IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR91_RS, 4, 0, IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMNUMACC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR91_RS, 5, 0, IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMANNACC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR91_RS, 6, 0, IMDBDef6.TBL_PAR58, IMDBDef6.FLD_PAR58_ROWNAMEPROTO, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR58, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR58, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR58, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR91_RS, 0);
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
  private void PAN_SOLLECITI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SOLLECITI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_SOLLECITI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SOLLECITI_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_SOLLECITI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoPEG();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SOLLECITI_APRIVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_SOLLECITI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SOLLECITI_APRIACC)
    {
      this.IdxPanelActived = this.PAN_SOLLECITI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Apri();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SOLLECITI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SOLLECITI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SOLLECITI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SOLLECITI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SOLLECITI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SOLLECITI_Init()
  {

    PAN_SOLLECITI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SOLLECITI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, "0212104D-05B8-40F1-98E3-7577ACC18BE3");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, "Capitolo/Art.");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, MyGlb.VIS_GROUPSTYLE);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, MyGlb.PANEL_LIST, 248, -9999, 144, 16, 0, 0);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, MyGlb.PANEL_FORM, 32, 15, 240, 49, 0, 0);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, 0, 73);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, 1, 13);
    PAN_SOLLECITI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, 0, 4);
    PAN_SOLLECITI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, 1, 4);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_GROUP, GRP_SOLLECITI_CAPITOLOART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, "F27C7681-BF11-4E6E-921C-1CF381F37E4E");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, "Accertamento");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_LIST, 392, -9999, 112, 16, 0, 0);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_FORM, 32, 71, 240, 49, 0, 0);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, 0, 81);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, 1, 13);
    PAN_SOLLECITI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, 0, 4);
    PAN_SOLLECITI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, 1, 4);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_GROUP, GRP_SOLLECITI_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, "13DA3F95-D7FC-4447-9F32-8E85105D3EFD");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, "Data Emissione Ordinativi");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, MyGlb.VIS_GROUPSTYLE);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, MyGlb.PANEL_LIST, 0, -9999, 208, 16, 0, 0);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, MyGlb.PANEL_FORM, 32, 155, 240, 49, 0, 0);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, 0, 144);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, 1, 13);
    PAN_SOLLECITI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, 0, 4);
    PAN_SOLLECITI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, 1, 4);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_GROUP, GRP_SOLLECITI_DATAEMISORDI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SOLLECITI.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, "415A9584-D371-44BF-9E18-49D7B4B10064");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, "Capitolo");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, "E0B09EC7-98F2-4DFA-A9D1-568B7A9C7E8A");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, "Articolo");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, "A592D223-270B-4EA8-87ED-9D2B87C47976");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SOLLECITI.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, 0, "info.gif", false);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, "F20F3AC4-B379-4FEA-B96F-9BE01233EB76");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SOLLECITI.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, 0, "wsearch1.gif", false);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, "7452DD04-C08B-4443-9742-A72E596C0C8E");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, "/");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, "3301C0DC-1ED0-4A8D-B8D2-BEFD78C70C71");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, "21C24533-2C14-47B3-9F10-4C31949F0D65");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, "Accertamento");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, "C8B4E593-3A35-43E2-A2F3-88F98D95B45A");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, "Anno Acc");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, "FAA4511E-8E5B-4022-9DF8-FC803CF91D92");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, "/");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, MyGlb.VIS_VUOTONORMALE);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, "BE811095-75F0-4AF3-B3F6-B890383EC62D");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SOLLECITI.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, 0, "wsearch1.gif", false);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, "13D5AF04-D1FA-4CE6-A208-B11175657480");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, "65E0A584-02CA-41B3-86ED-24ACB472A7FF");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, "Protocollo");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, "702ED9B5-B160-4450-A6F2-D741CD44D094");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, "Dal");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, "B2EEE6AC-EDA9-4C2E-8146-6A68B5C2377F");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, "Al");
    PAN_SOLLECITI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, "");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SOLLECITI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, "E1800F1D-0127-46DB-AF91-15B56FCD829B");
    PAN_SOLLECITI.set_Header(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, "Elabora");
    PAN_SOLLECITI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SOLLECITI.SetImage(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, 0, "button1.gif", false);
    PAN_SOLLECITI.SetFlags(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SOLLECITI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_LIST, 248, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_FORM, 36, 40, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_CAPITOLO, -1, GRP_SOLLECITI_CAPITOLOART);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_CAPITOLO, PPQRY_PAR91, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_LIST, 320, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_FORM, 188, 40, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_FORM, 80);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_ARTICOLO, -1, GRP_SOLLECITI_CAPITOLOART);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_ARTICOLO, PPQRY_PAR91, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, MyGlb.PANEL_LIST, 68, 128, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, MyGlb.PANEL_LIST, 2);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, MyGlb.PANEL_FORM, 228, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_INFOVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_INFOVOCEPEG, -1, GRP_SOLLECITI_CAPITOLOART);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_INFOVOCEPEG, -1, "", "INFOVOCEPEG", 0, 0, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, MyGlb.PANEL_LIST, 60, 120, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, MyGlb.PANEL_LIST, 2);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, MyGlb.PANEL_FORM, 212, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIVOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_APRIVOCEPEG, -1, GRP_SOLLECITI_CAPITOLOART);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_APRIVOCEPEG, -1, "", "APRIVOCEPEG", 0, 0, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, MyGlb.PANEL_LIST, 240, 72, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, MyGlb.PANEL_FORM, 172, 40, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_SLASH, -1, GRP_SOLLECITI_CAPITOLOART);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, MyGlb.PANEL_LIST, 176, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, MyGlb.PANEL_FORM, 236, 44, 32, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_NEWPANELLAB1, -1, GRP_SOLLECITI_CAPITOLOART);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_LIST, 68);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_LIST, "Acc.");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_FORM, 36, 96, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_FORM, 76);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ACCERTAMENTO, MyGlb.PANEL_FORM, "Accert.");
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_ACCERTAMENTO, -1, GRP_SOLLECITI_ACCERTAMENTO);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_ACCERTAMENTO, PPQRY_PAR91, "A.ROWNAMNUMACC", "ROWNAMNUMACC", 1, 5, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_LIST, 432, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_LIST, 56);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_LIST, "Anno Acc");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_FORM, 104, 96, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_FORM, 80);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ANNOACC, MyGlb.PANEL_FORM, "Anno Acc");
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_ANNOACC, -1, GRP_SOLLECITI_ACCERTAMENTO);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_ANNOACC, PPQRY_PAR91, "A.ROWNAMANNACC", "ROWNAMANNACC", 1, 4, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, MyGlb.PANEL_LIST, 256, 88, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, MyGlb.PANEL_FORM, 88, 96, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_SLASH2, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_SLASH2, -1, GRP_SOLLECITI_ACCERTAMENTO);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_SLASH2, -1, "", "SLASH2", 0, 0, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, MyGlb.PANEL_LIST, 68, 128, 12, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, MyGlb.PANEL_LIST, 2);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, MyGlb.PANEL_FORM, 152, 100, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_APRIACC, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_APRIACC, -1, GRP_SOLLECITI_ACCERTAMENTO);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_APRIACC, -1, "", "APRIACC", 0, 0, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, MyGlb.PANEL_LIST, 256, 76, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, MyGlb.PANEL_FORM, 256, 96, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_NEWPANELLABE, -1, GRP_SOLLECITI_ACCERTAMENTO);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_LIST, 504, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_LIST, 56);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_LIST, "Protocollo");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_FORM, 128, 128, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_FORM, 68);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_PROTOCOLLO, MyGlb.PANEL_FORM, "Protocollo");
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_PROTOCOLLO, -1, -1);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_PROTOCOLLO, PPQRY_PAR91, "A.ROWNAMEPROTO", "ROWNAMEPROTO", 5, 10, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_FORM, 36, 180, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_DAL, -1, GRP_SOLLECITI_DATAEMISORDI);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_DAL, PPQRY_PAR91, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_LIST, 104, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_LIST, 20);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_FORM, 164, 180, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_FORM, 20);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SOLLECITI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_AL, -1, GRP_SOLLECITI_DATAEMISORDI);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_AL, PPQRY_PAR91, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, MyGlb.PANEL_LIST, 184, 164, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SOLLECITI.SetRect(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, MyGlb.PANEL_FORM, 192, 216, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SOLLECITI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SOLLECITI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SOLLECITI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SOLLECITI.SetFieldPage(PFL_SOLLECITI_ELABORA, -1, -1);
    PAN_SOLLECITI.SetFieldPanel(PFL_SOLLECITI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_SOLLECITI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SOLLECITI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SOLLECITI.SetIMDB(IMDB, "PQRY_PAR91", true);
    PAN_SOLLECITI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SOLLECITI.SetQueryIMDB(PPQRY_PAR91, IMDBDef15.PQRY_PAR91_RS, IMDBDef6.TBL_PAR58);
    JustLoaded = true;
    PAN_SOLLECITI.SetFieldPrimaryIndex(PFL_SOLLECITI_CAPITOLO, IMDBDef6.FLD_PAR58_ROWNAMECAPIT);
    PAN_SOLLECITI.SetFieldPrimaryIndex(PFL_SOLLECITI_ARTICOLO, IMDBDef6.FLD_PAR58_ROWNAMEARTIC);
    PAN_SOLLECITI.SetFieldPrimaryIndex(PFL_SOLLECITI_ACCERTAMENTO, IMDBDef6.FLD_PAR58_ROWNAMNUMACC);
    PAN_SOLLECITI.SetFieldPrimaryIndex(PFL_SOLLECITI_ANNOACC, IMDBDef6.FLD_PAR58_ROWNAMANNACC);
    PAN_SOLLECITI.SetFieldPrimaryIndex(PFL_SOLLECITI_PROTOCOLLO, IMDBDef6.FLD_PAR58_ROWNAMEPROTO);
    PAN_SOLLECITI.SetFieldPrimaryIndex(PFL_SOLLECITI_DAL, IMDBDef6.FLD_PAR58_ROWNAMEDAL);
    PAN_SOLLECITI.SetFieldPrimaryIndex(PFL_SOLLECITI_AL, IMDBDef6.FLD_PAR58_ROWNAMEAL);
    PAN_SOLLECITI.SetMasterTable(0, "PAR58");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SOLLECITI.Status() == 2)
    {
      int oldListQBE = PAN_SOLLECITI.iUseListQBE;
      PAN_SOLLECITI.iUseListQBE = 0;
      PAN_SOLLECITI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SOLLECITI.PanelCommand(Glb.PCM_FIND);
      PAN_SOLLECITI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SOLLECITI) PAN_SOLLECITI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOLLECITI) PAN_SOLLECITI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SOLLECITI) PAN_SOLLECITI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SOLLECITI) PAN_SOLLECITI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SOLLECITI) PAN_SOLLECITI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
