// **********************************************
// Controlli UO Piano Dei Conti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlliUOPianoDeiConti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRO_ENTRATESPESA = 0;
  private static int PFL_FILTRO_TIPCONPIACON = 1;
  private static int PFL_FILTRO_GESTIOUTILIZ = 2;
  private static int PFL_FILTRO_UOSCADUTE = 3;
  private static int PFL_FILTRO_CAPITOSOTTOA = 4;

  private static int PPQRY_FILTRO14 = 0;


  IDPanel PAN_FILTRO;
  private static int PFL_CONTROLLI_CAPITOLO = 0;
  private static int PFL_CONTROLLI_ARTICOLO = 1;
  private static int PFL_CONTROLLI_DESCRIZIONE = 2;
  private static int PFL_CONTROLLI_CODICESTRUTT = 3;
  private static int PFL_CONTROLLI_TIPOUNITORGA = 4;
  private static int PFL_CONTROLLI_PROGUNITORGA = 5;
  private static int PFL_CONTROLLI_DESCROZIONEU = 6;
  private static int PFL_CONTROLLI_SCADENZA = 7;

  private static int PPQRY_CONTROLLICAP = 0;


  IDPanel PAN_CONTROLLI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRO17(IMDB);
    //
    //
    Init_PQRY_FILTRO14(IMDB);
    Init_PQRY_FILTRO14_RS(IMDB);
    Init_PQRY_CONTROLLICAP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRO17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_FILTRO17, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_FILTRO17, "TBL_FILTRO17");
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMOGGENTESP, "NOMOGGENTESP");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMOGGENTESP,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOOGTICOPICO, "NOOGTICOPICO");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOOGTICOPICO,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMOGGGESUTI, "NOMOGGGESUTI");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMOGGGESUTI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMEOGGUOSCA, "NOMEOGGUOSCA");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMEOGGUOSCA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMOGGCAPSOT, "NOMOGGCAPSOT");
    IMDB.SetFldParams(IMDBDef3.TBL_FILTRO17,IMDBDef3.FLD_FILTRO17_NOMOGGCAPSOT,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_FILTRO17, 0);
  }

  private static void Init_PQRY_FILTRO14(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FILTRO14, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_FILTRO14, "PQRY_FILTRO14");
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMOGGENTESP, "NOMOGGENTESP");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMOGGENTESP,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOOGTICOPICO, "NOOGTICOPICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOOGTICOPICO,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMOGGGESUTI, "NOMOGGGESUTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMOGGGESUTI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMEOGGUOSCA, "NOMEOGGUOSCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMEOGGUOSCA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMOGGCAPSOT, "NOMOGGCAPSOT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14,IMDBDef11.PQSL_FILTRO14_NOMOGGCAPSOT,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_FILTRO14, 0);
  }

  private static void Init_PQRY_FILTRO14_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FILTRO14_RS, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_FILTRO14_RS, "PQRY_FILTRO14_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMOGGENTESP, "NOMOGGENTESP");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMOGGENTESP,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOOGTICOPICO, "NOOGTICOPICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOOGTICOPICO,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMOGGGESUTI, "NOMOGGGESUTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMOGGGESUTI,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMEOGGUOSCA, "NOMEOGGUOSCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMEOGGUOSCA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMOGGCAPSOT, "NOMOGGCAPSOT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FILTRO14_RS,IMDBDef11.PQSL_FILTRO14_NOMOGGCAPSOT,5,2,0);
  }

  private static void Init_PQRY_CONTROLLICAP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CONTROLLICAP, 8);
    IMDB.set_TblCode(IMDBDef11.PQRY_CONTROLLICAP, "PQRY_CONTROLLICAP");
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCACOCA, "RECCONCACOCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCACOCA,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCAPART, "RECCONCAPART");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCAPART,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCAPDES, "RECCONCAPDES");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCAPDES,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCACOST, "RECCONCACOST");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCACOST,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECOCAPRUOCC, "RECOCAPRUOCC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECOCAPRUOCC,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCADEUO, "RECCONCADEUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCADEUO,5,4000,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECORDTIPOUN, "RECORDTIPOUN");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECORDTIPOUN,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCAPSCA, "RECCONCAPSCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_CONTROLLICAP,IMDBDef11.PQSL_CONTROLLICAP_RECCONCAPSCA,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CONTROLLICAP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlliUOPianoDeiConti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlliUOPianoDeiConti()
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
    FormIdx = MyGlb.FRM_CONUOPIADECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "56440A0E-8D84-40CA-A06F-70B4B3367A5F";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 824;
    DesignHeight = 546;
    set_Caption(new IDVariant("Controlli UO Piano Dei Conti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 824;
    Frames[1].Height = 520;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.123077;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 824;
    Frames[2].Height = 64;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtro";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 64;
    PAN_FILTRO = new IDPanel(w, this, 2, "PAN_FILTRO");
    Frames[2].Content = PAN_FILTRO;
    PAN_FILTRO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRO.VS = MainFrm.VisualStyleList;
    PAN_FILTRO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 824-MyGlb.PAN_OFFS_X, 64-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8033477A-5BAC-4054-A43A-8F2A5680677E");
    PAN_FILTRO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 980, 76, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRO.InitStatus = 2;
    PAN_FILTRO_Init();
    PAN_FILTRO_InitFields();
    PAN_FILTRO_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 824;
    Frames[3].Height = 456;
    Frames[3].Caption = "Controlli";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 456;
    PAN_CONTROLLI = new IDPanel(w, this, 3, "PAN_CONTROLLI");
    Frames[3].Content = PAN_CONTROLLI;
    PAN_CONTROLLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTROLLI.VS = MainFrm.VisualStyleList;
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 824-MyGlb.PAN_OFFS_X, 456-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ECFB3DEF-A1A1-4E79-91AA-54FFBCCF2916");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 762, 416, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTROLLI.InitStatus = 2;
    PAN_CONTROLLI_Init();
    PAN_CONTROLLI_InitFields();
    PAN_CONTROLLI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_FILTRO17, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONUOPIADECO_FILTRO14();
      }
      PAN_FILTRO.UpdatePanel(MainFrm);
      PAN_CONTROLLI.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlliUOPianoDeiConti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlliUOPianoDeiConti.class.getName() : (Glb.ClassWithPackage(ControlliUOPianoDeiConti.class) ? ControlliUOPianoDeiConti.class.getName().substring(ControlliUOPianoDeiConti.class.getPackage().getName().length() + 1) : ControlliUOPianoDeiConti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      // IMDB.set_Value(IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMOGGENTESP, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOOGTICOPICO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMOGGGESUTI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMEOGGUOSCA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMOGGCAPSOT, 0, (new IDVariant("NO")));
      set_Caption(IDL.Add(IDL.Add((new IDVariant("Controlli UO")), (new IDVariant(" "))), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlliUOPianoDeiConti", "Load", _e);
    }
  }

  // **********************************************************************
  // Controlli On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTROLLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTROLLI);
      // 
      // Controlli On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CONTROLLI.set_ToolTip(Glb.OBJ_FIELD,PFL_CONTROLLI_DESCRIZIONE,IMDB.Value(IMDBDef11.PQRY_CONTROLLICAP, IMDBDef11.PQSL_CONTROLLICAP_RECCONCAPDES, 0).stringValue()); 
      PAN_CONTROLLI.set_ToolTip(Glb.OBJ_FIELD,PFL_CONTROLLI_DESCROZIONEU,IMDB.Value(IMDBDef11.PQRY_CONTROLLICAP, IMDBDef11.PQSL_CONTROLLICAP_RECCONCADEUO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlliUOPianoDeiConti", "ControlliOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Filtro On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FILTRO);
      // 
      // Filtro On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOOGTICOPICO, 0).equals((new IDVariant(1)), true))
      {
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROLLI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROLLI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROLLI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FILTRO.SetFlags (Glb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROLLI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROLLI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CONTROLLI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlliUOPianoDeiConti", "FiltroOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Filtro
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CONUOPIADECO_FILTRO14() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_FILTRO14_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRO17, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_FILTRO17, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_FILTRO14_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_FILTRO14_RS, 0, IMDBDef3.TBL_FILTRO17, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRO14_RS, 0, 0, IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMOGGENTESP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRO14_RS, 1, 0, IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOOGTICOPICO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRO14_RS, 2, 0, IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMOGGGESUTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRO14_RS, 3, 0, IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMEOGGUOSCA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_FILTRO14_RS, 4, 0, IMDBDef3.TBL_FILTRO17, IMDBDef3.FLD_FILTRO17_NOMOGGCAPSOT, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_FILTRO17, 0);
      if (IMDB.Eof(IMDBDef3.TBL_FILTRO17, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_FILTRO17, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_FILTRO14_RS, 0);
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
  private void PAN_FILTRO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRO, Cancel);
    // Stub
  }

  private void PAN_FILTRO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CONTROLLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTROLLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTROLLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTROLLI, Cancel);
    // Stub
  }

  private void PAN_CONTROLLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTROLLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTROLLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTROLLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FILTRO_Init()
  {

    PAN_FILTRO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRO.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, "DE12852A-45DD-4021-8E3C-BCBCC16250FE");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, "Entrata E Spesa");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, "Descrivi il contenuto del campo");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, "D2101197-62F9-4155-A913-1F37EB9C3663");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, "Tipo Controllo");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, "A6D70E13-1D99-4C09-A127-9A3766C5D323");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, "Tipo UO");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, "9BC16F02-9A76-445E-ADC2-70F20569CBB9");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, "UO Scadute");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, "26529E67-F7BD-4795-8DB5-CEA4D2584034");
    PAN_FILTRO.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, "Capitoli Sottoarticolati");
    PAN_FILTRO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, "");
    PAN_FILTRO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRO.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_LIST, 96);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_LIST, "Entrata E Spesa");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_FORM, 24, 8, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_FORM, 96);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_ENTRATESPESA, MyGlb.PANEL_FORM, "Entrata E Spesa");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_ENTRATESPESA, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_ENTRATESPESA, PPQRY_FILTRO14, "A.NOMOGGENTESP", "NOMOGGENTESP", 5, 1, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_ENTRATESPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_ENTRATESPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_LIST, 0, 36, 508, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_LIST, 88);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_LIST, "Tipo Controllo");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_FORM, 168, 8, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_FORM, 88);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_TIPCONPIACON, MyGlb.PANEL_FORM, "Tipo Controllo");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_TIPCONPIACON, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_TIPCONPIACON, PPQRY_FILTRO14, "A.NOOGTICOPICO", "NOOGTICOPICO", 1, 5, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPCONPIACON, (new IDVariant(1)), "Capitoli con più UO associate", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_TIPCONPIACON, (new IDVariant(2)), "Capitoli con UO mancanti", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_LIST, 104);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_LIST, "Tipo UO");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_FORM, 196, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_FORM, 60);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_GESTIOUTILIZ, MyGlb.PANEL_FORM, "Tipo UO");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_GESTIOUTILIZ, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_GESTIOUTILIZ, PPQRY_FILTRO14, "A.NOMOGGGESUTI", "NOMOGGGESUTI", 5, 1, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_GESTIOUTILIZ, (new IDVariant("G")), "Gestione", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_GESTIOUTILIZ, (new IDVariant("U")), "Utilizzo", "", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_GESTIOUTILIZ, (new IDVariant("E")), "Entrambe", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_LIST, 76);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_LIST, "UO Scadute");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_FORM, 536, 8, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_FORM, 80);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_UOSCADUTE, MyGlb.PANEL_FORM, "UO Scadute");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_UOSCADUTE, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_UOSCADUTE, PPQRY_FILTRO14, "A.NOMEOGGUOSCA", "NOMEOGGUOSCA", 5, 2, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_UOSCADUTE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_UOSCADUTE, (new IDVariant()), "Null", "", "", -1);
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_LIST, 136);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_LIST, "Capitoli Sottoarticolati");
    PAN_FILTRO.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_FORM, 480, 36, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_FORM, 136);
    PAN_FILTRO.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRO_CAPITOSOTTOA, MyGlb.PANEL_FORM, "Capitoli Sottoarticolati");
    PAN_FILTRO.SetFieldPage(PFL_FILTRO_CAPITOSOTTOA, -1, -1);
    PAN_FILTRO.SetFieldPanel(PFL_FILTRO_CAPITOSOTTOA, PPQRY_FILTRO14, "A.NOMOGGCAPSOT", "NOMOGGCAPSOT", 5, 2, 0, -13997);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_CAPITOSOTTOA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_FILTRO.SetValueListItem(PFL_FILTRO_CAPITOSOTTOA, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_FILTRO_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FILTRO.SetIMDB(IMDB, "PQRY_FILTRO14", true);
    PAN_FILTRO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_FILTRO.SetQueryIMDB(PPQRY_FILTRO14, IMDBDef11.PQRY_FILTRO14_RS, IMDBDef3.TBL_FILTRO17);
    JustLoaded = true;
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_ENTRATESPESA, IMDBDef3.FLD_FILTRO17_NOMOGGENTESP);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_TIPCONPIACON, IMDBDef3.FLD_FILTRO17_NOOGTICOPICO);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_GESTIOUTILIZ, IMDBDef3.FLD_FILTRO17_NOMOGGGESUTI);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_UOSCADUTE, IMDBDef3.FLD_FILTRO17_NOMEOGGUOSCA);
    PAN_FILTRO.SetFieldPrimaryIndex(PFL_FILTRO_CAPITOSOTTOA, IMDBDef3.FLD_FILTRO17_NOMOGGCAPSOT);
    PAN_FILTRO.SetMasterTable(0, "FILTRO17");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRO.Status() == 2)
    {
      int oldListQBE = PAN_FILTRO.iUseListQBE;
      PAN_FILTRO.iUseListQBE = 0;
      PAN_FILTRO.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRO.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CONTROLLI_Init()
  {

    PAN_CONTROLLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTROLLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTROLLI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, "60EB2BD6-F108-4584-913B-DEC5D69AB1BB");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, "Capitolo");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, "FA23777F-AF50-48F6-8C7B-7A252F083C4E");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, "Articolo");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, "A9DE2107-326E-4BEA-AD56-FC6CFF2CA20B");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, "Descrizione Capitolo");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_VERTICAL | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, "AD84ABBA-B79C-4274-AEA9-33E34036A316");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, "Codice");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, "400029B1-CD2C-4EC9-8BBD-65069390D53E");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, "Tipo UO");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, "6DEE2BB1-39B7-4154-88DC-5501F335119C");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, "UO");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, "13AE9C4C-E56A-4D8B-B49A-3BFDC57352BA");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, "Descrizione UO");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROLLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, "F73E94D5-E222-4EE6-BCD9-A175E2A4C0AE");
    PAN_CONTROLLI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, "Scadenza");
    PAN_CONTROLLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, "");
    PAN_CONTROLLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROLLI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTROLLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_CAPITOLO, -1, -1);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_CAPITOLO, PPQRY_CONTROLLICAP, "A.CAPITOLO", "RECCONCACOCA", 3, 16, 0, -13997);
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_LIST, 104, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_ARTICOLO, -1, -1);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_ARTICOLO, PPQRY_CONTROLLICAP, "A.ARTICOLO", "RECCONCAPART", 1, 2, 0, -13997);
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_LIST, 156, 36, 183, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_DESCRIZIONE, -1, -1);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_DESCRIZIONE, PPQRY_CONTROLLICAP, "A.DESCRIZIONE", "RECCONCAPDES", 5, 140, 0, -13997);
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_LIST, 339, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_LIST, 120);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_LIST, "Codice");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_FORM, 4, 88, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_FORM, 120);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_FORM, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_CODICESTRUTT, MyGlb.PANEL_FORM, "Codice");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_CODICESTRUTT, -1, -1);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_CODICESTRUTT, PPQRY_CONTROLLICAP, "A.CODICE_STRUTTURA", "RECCONCACOST", 5, 10, 0, -13997);
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_LIST, 387, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_LIST, 172);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_LIST, "Tipo UO");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_FORM, 4, 160, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_FORM, 172);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_TIPOUNITORGA, MyGlb.PANEL_FORM, "Tipo UO");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_TIPOUNITORGA, -1, -1);
    PAN_CONTROLLI.SetFieldUnbound(PFL_CONTROLLI_TIPOUNITORGA, true);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_TIPOUNITORGA, PPQRY_CONTROLLICAP, "DECODE(A.TIPO_UNITA_ORGANIZZATIVA, 'G', 'Gestione', 'Utilizzo')", "RECORDTIPOUN", 5, 99, 0, -13997);
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_LIST, 451, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_LIST, "UO");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 112, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_PROGUNITORGA, MyGlb.PANEL_FORM, "UO");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_PROGUNITORGA, -1, -1);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_PROGUNITORGA, PPQRY_CONTROLLICAP, "A.PROGR_UNITA_ORGANIZZATIVA", "RECOCAPRUOCC", 1, 10, 0, -13997);
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_LIST, 491, 36, 195, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_LIST, 104);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_LIST, "Descrizione UO");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_FORM, 4, 136, 612, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_FORM, 104);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_FORM, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_DESCROZIONEU, MyGlb.PANEL_FORM, "Descrizione UO");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_DESCROZIONEU, -1, -1);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_DESCROZIONEU, PPQRY_CONTROLLICAP, "A.DESCRIZIONE_UO", "RECCONCADEUO", 5, 4000, 0, -13997);
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_LIST, 686, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_LIST, 68);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_CONTROLLI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_FORM, 4, 184, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROLLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_FORM, 68);
    PAN_CONTROLLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_CONTROLLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROLLI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_CONTROLLI.SetFieldPage(PFL_CONTROLLI_SCADENZA, -1, -1);
    PAN_CONTROLLI.SetFieldPanel(PFL_CONTROLLI_SCADENZA, PPQRY_CONTROLLICAP, "A.SCADENZA", "RECCONCAPSCA", 6, 10, 0, -13997);
  }

  private void PAN_CONTROLLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTROLLI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTROLLI.SetIMDB(IMDB, "PQRY_CONTROLLICAP", true);
    PAN_CONTROLLI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as RECCONCACOCA, ");
    SQL.append("  A.ARTICOLO as RECCONCAPART, ");
    SQL.append("  A.DESCRIZIONE as RECCONCAPDES, ");
    SQL.append("  A.CODICE_STRUTTURA as RECCONCACOST, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as RECOCAPRUOCC, ");
    SQL.append("  A.DESCRIZIONE_UO as RECCONCADEUO, ");
    SQL.append("  DECODE(A.TIPO_UNITA_ORGANIZZATIVA, 'G', 'Gestione', 'Utilizzo') as RECORDTIPOUN, ");
    SQL.append("  A.SCADENZA as RECCONCAPSCA ");
    PAN_CONTROLLI.SetQuery(PPQRY_CONTROLLICAP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CONTROLLI_CAP A ");
    PAN_CONTROLLI.SetQuery(PPQRY_CONTROLLICAP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~PQRY_FILTRO14.NOMOGGENTESP~~) ");
    SQL.append("and   (A.TIPO_CONTROLLO = ~~PQRY_FILTRO14.NOOGTICOPICO~~) ");
    SQL.append("and   (A.TIPO_UNITA_ORGANIZZATIVA = DECODE(~~PQRY_FILTRO14.NOMOGGGESUTI~~, 'E', A.TIPO_UNITA_ORGANIZZATIVA, ~~PQRY_FILTRO14.NOMOGGGESUTI~~)) ");
    SQL.append("and   (NVL(A.SCADENZA, SYSDATE + 1) > DECODE(DECODE(A.TIPO_CONTROLLO, 1, ~~PQRY_FILTRO14.NOMEOGGUOSCA~~, NULL), 'SI', NVL(A.SCADENZA, SYSDATE + 1) - 1, SYSDATE)) ");
    SQL.append("and   (DECODE(~~PQRY_FILTRO14.NOMEOGGUOSCA~~, 'SI', A.CONTA_UO_TUTTE, A.CONTA_UO) > 1) ");
    SQL.append("and   (DECODE(~~PQRY_FILTRO14.NOOGTICOPICO~~, 2, A.CAP_SOTTOARTICOLATI, ~~PQRY_FILTRO14.NOMOGGCAPSOT~~) = ~~PQRY_FILTRO14.NOMOGGCAPSOT~~) ");
    PAN_CONTROLLI.SetQuery(PPQRY_CONTROLLICAP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTROLLI.SetQuery(PPQRY_CONTROLLICAP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTROLLI.SetQuery(PPQRY_CONTROLLICAP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 1, 2, 7, 8 ");
    PAN_CONTROLLI.SetQuery(PPQRY_CONTROLLICAP, 5, SQL, -1, "");
    PAN_CONTROLLI.SetQueryDB(PPQRY_CONTROLLICAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTROLLI.SetMasterTable(0, "CONTROLLI_CAP");
    PAN_CONTROLLI.AddToSortList(PFL_CONTROLLI_CAPITOLO, true);
    PAN_CONTROLLI.AddToSortList(PFL_CONTROLLI_ARTICOLO, true);
    PAN_CONTROLLI.AddToSortList(PFL_CONTROLLI_TIPOUNITORGA, true);
    PAN_CONTROLLI.AddToSortList(PFL_CONTROLLI_SCADENZA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTROLLI.Status() == 2)
    {
      int oldListQBE = PAN_CONTROLLI.iUseListQBE;
      PAN_CONTROLLI.iUseListQBE = 0;
      PAN_CONTROLLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTROLLI.PanelCommand(Glb.PCM_FIND);
      PAN_CONTROLLI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CONTROLLI) PAN_CONTROLLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_ValidateRow(Cancel);
    if (SrcObj == PAN_CONTROLLI) PAN_CONTROLLI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_DynamicProperties();
    if (SrcObj == PAN_CONTROLLI) PAN_CONTROLLI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CONTROLLI) PAN_CONTROLLI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FILTRO) PAN_FILTRO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CONTROLLI) PAN_CONTROLLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
