// **********************************************
// Estratto C C P
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EstrattoCCP extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ESTRATTOCCP_DATAESTRATTO = 0;

  private static int PFL_ESTRATTOCCP_DAL = 0;
  private static int PFL_ESTRATTOCCP_AL = 1;
  private static int PFL_ESTRATTOCCP_DETTAGLI = 2;
  private static int PFL_ESTRATTOCCP_PERCAUSALE = 3;
  private static int PFL_ESTRATTOCCP_ELABORA = 4;

  private static int PPQRY_ESTRATTOCCP1 = 0;


  IDPanel PAN_ESTRATTOCCP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ESTRATTOCCP(IMDB);
    //
    //
    Init_PQRY_ESTRATTOCCP1(IMDB);
    Init_PQRY_ESTRATTOCCP1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ESTRATTOCCP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_ESTRATTOCCP, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_ESTRATTOCCP, "TBL_ESTRATTOCCP");
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDETTA,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMPERCAU, "ROWNAMPERCAU");
    IMDB.SetFldParams(IMDBDef6.TBL_ESTRATTOCCP,IMDBDef6.FLD_ESTRATTOCCP_ROWNAMPERCAU,1,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_ESTRATTOCCP, 0);
  }

  private static void Init_PQRY_ESTRATTOCCP1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ESTRATTOCCP1, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_ESTRATTOCCP1, "PQRY_ESTRATTOCCP1");
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDETTA,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMPERCAU, "ROWNAMPERCAU");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMPERCAU,1,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ESTRATTOCCP1, 0);
  }

  private static void Init_PQRY_ESTRATTOCCP1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 4);
    IMDB.set_TblCode(IMDBDef15.PQRY_ESTRATTOCCP1_RS, "PQRY_ESTRATTOCCP1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDETTA,1,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMPERCAU, "ROWNAMPERCAU");
    IMDB.SetFldParams(IMDBDef15.PQRY_ESTRATTOCCP1_RS,IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMPERCAU,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EstrattoCCP(MyWebEntryPoint w, IMDBObj imdb)
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
  public EstrattoCCP()
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
    FormIdx = MyGlb.FRM_ESTRATTOCCP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A740055C-18F7-403C-B967-A3BF6BEB85CB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 260;
    DesignHeight = 166;
    set_Caption(new IDVariant("Estratto C C P"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 260;
    Frames[1].Height = 140;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Estratto C C P";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 140;
    PAN_ESTRATTOCCP = new IDPanel(w, this, 1, "PAN_ESTRATTOCCP");
    Frames[1].Content = PAN_ESTRATTOCCP;
    PAN_ESTRATTOCCP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ESTRATTOCCP.VS = MainFrm.VisualStyleList;
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 260-MyGlb.PAN_OFFS_X, 140-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ESTRATTOCCP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7727F180-0D81-4DB5-8D99-BF7FEF1130A4");
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 328, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ESTRATTOCCP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ESTRATTOCCP.InitStatus = 2;
    PAN_ESTRATTOCCP_Init();
    PAN_ESTRATTOCCP_InitFields();
    PAN_ESTRATTOCCP_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_ESTRATTOCCP, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ESTRATTOCCP_ESTRATTOCCP1();
      }
      PAN_ESTRATTOCCP.UpdatePanel(MainFrm);
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
    return (obj instanceof EstrattoCCP);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EstrattoCCP.class.getName() : (Glb.ClassWithPackage(EstrattoCCP.class) ? EstrattoCCP.class.getName().substring(EstrattoCCP.class.getPackage().getName().length() + 1) : EstrattoCCP.class.getName()));
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
      if (IMDB.Value(IMDBDef15.PQRY_ESTRATTOCCP1, IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_ESTRATTOCCP1, IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEAL, 0), true)>0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Dal maggiore di data Al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DAL")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ESTRATTOCCP1, IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ESTRATTOCCP1, IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PER_CAUSALE")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ESTRATTOCCP1, IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMPERCAU, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("DETTAGLIO")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_ESTRATTOCCP1, IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDETTA, 0)));
        MainFrm.LanciaStampaJasper((new IDVariant("Estratto_CCP")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoCCP", "Elabora", _e);
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Estratto C.C.P.", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAP, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDETTA, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMPERCAU, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoCCP", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Estratto C C P On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ESTRATTOCCP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ESTRATTOCCP);
      // 
      // Estratto C C P On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_ESTRATTOCCP1, IMDBDef15.PQSL_ESTRATTOCCP1_ROWNAMEDETTA, 0).equals((new IDVariant(1)), true))
      {
        PAN_ESTRATTOCCP.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ESTRATTOCCP.SetFlags (Glb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EstrattoCCP", "EstrattoCCPOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Estratto C C P
  // Primary record source for panel data
  // **********************************************************************
  private void ESTRATTOCCP_ESTRATTOCCP1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_ESTRATTOCCP1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_ESTRATTOCCP, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_ESTRATTOCCP, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 0, IMDBDef6.TBL_ESTRATTOCCP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 0, 0, IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 1, 0, IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 2, 0, IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDETTA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 3, 0, IMDBDef6.TBL_ESTRATTOCCP, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMPERCAU, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_ESTRATTOCCP, 0);
      if (IMDB.Eof(IMDBDef6.TBL_ESTRATTOCCP, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_ESTRATTOCCP, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_ESTRATTOCCP1_RS, 0);
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
  private void PAN_ESTRATTOCCP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ESTRATTOCCP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ESTRATTOCCP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ESTRATTOCCP, Cancel);
    // Stub
  }

  private void PAN_ESTRATTOCCP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ESTRATTOCCP_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ESTRATTOCCP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ESTRATTOCCP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ESTRATTOCCP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ESTRATTOCCP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ESTRATTOCCP_Init()
  {

    PAN_ESTRATTOCCP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ESTRATTOCCP.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_ESTRATTOCCP.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, "6FDB336E-739E-4069-8E91-4EF80B083623");
    PAN_ESTRATTOCCP.set_Header(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, "Data Estratto");
    PAN_ESTRATTOCCP.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, "");
    PAN_ESTRATTOCCP.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, MyGlb.PANEL_LIST, 0, -9999, 208, 16, 0, 0);
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, MyGlb.PANEL_FORM, 4, 7, 240, 49, 0, 0);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, 0, 76);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, 1, 13);
    PAN_ESTRATTOCCP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, 0, 4);
    PAN_ESTRATTOCCP.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, 1, 4);
    PAN_ESTRATTOCCP.SetFlags(MyGlb.OBJ_GROUP, GRP_ESTRATTOCCP_DATAESTRATTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ESTRATTOCCP.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_ESTRATTOCCP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, "DD542BFC-B99E-4287-8861-8DCB7658619E");
    PAN_ESTRATTOCCP.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, "Dal");
    PAN_ESTRATTOCCP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, "");
    PAN_ESTRATTOCCP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTOCCP.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTOCCP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, "0722B2B8-1790-4FD0-9947-43BFBD4693B5");
    PAN_ESTRATTOCCP.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, "Al");
    PAN_ESTRATTOCCP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, "");
    PAN_ESTRATTOCCP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ESTRATTOCCP.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTOCCP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, "1D1C0E43-CDBA-4CC3-B9AC-D551D1F7B282");
    PAN_ESTRATTOCCP.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, "Dettagli");
    PAN_ESTRATTOCCP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, "");
    PAN_ESTRATTOCCP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.VIS_CHECKSTYLE);
    PAN_ESTRATTOCCP.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTOCCP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, "181D733B-B2FB-4C76-A903-D7B4CBB397CA");
    PAN_ESTRATTOCCP.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, "Per Causale");
    PAN_ESTRATTOCCP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, "");
    PAN_ESTRATTOCCP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.VIS_CHECKSTYLE);
    PAN_ESTRATTOCCP.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ESTRATTOCCP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, "DAAFFF3F-332E-492E-81C4-6E84EE44E654");
    PAN_ESTRATTOCCP.set_Header(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, "Elabora");
    PAN_ESTRATTOCCP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ESTRATTOCCP.SetImage(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, 0, "button1.gif", false);
    PAN_ESTRATTOCCP.SetFlags(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_ESTRATTOCCP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_FORM, 8, 32, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_FORM, 28);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ESTRATTOCCP.SetFieldPage(PFL_ESTRATTOCCP_DAL, -1, GRP_ESTRATTOCCP_DATAESTRATTO);
    PAN_ESTRATTOCCP.SetFieldPanel(PFL_ESTRATTOCCP_DAL, PPQRY_ESTRATTOCCP1, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_LIST, 104, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_LIST, 20);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_FORM, 136, 32, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_FORM, 20);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ESTRATTOCCP.SetFieldPage(PFL_ESTRATTOCCP_AL, -1, GRP_ESTRATTOCCP_DATAESTRATTO);
    PAN_ESTRATTOCCP.SetFieldPanel(PFL_ESTRATTOCCP_AL, PPQRY_ESTRATTOCCP1, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_LIST, 48);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_LIST, "Dettagli");
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_FORM, 4, 64, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_FORM, 60);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_DETTAGLI, MyGlb.PANEL_FORM, "Dettagli");
    PAN_ESTRATTOCCP.SetFieldPage(PFL_ESTRATTOCCP_DETTAGLI, -1, -1);
    PAN_ESTRATTOCCP.SetFieldPanel(PFL_ESTRATTOCCP_DETTAGLI, PPQRY_ESTRATTOCCP1, "A.ROWNAMEDETTA", "ROWNAMEDETTA", 1, 1, 0, -13997);
    PAN_ESTRATTOCCP.SetValueListItem(PFL_ESTRATTOCCP_DETTAGLI, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESTRATTOCCP.SetValueListItem(PFL_ESTRATTOCCP_DETTAGLI, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_LIST, 280, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_LIST, 68);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_LIST, "Per Caus.");
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_FORM, 136, 64, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_FORM, 80);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTOCCP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_PERCAUSALE, MyGlb.PANEL_FORM, "Per Causale");
    PAN_ESTRATTOCCP.SetFieldPage(PFL_ESTRATTOCCP_PERCAUSALE, -1, -1);
    PAN_ESTRATTOCCP.SetFieldPanel(PFL_ESTRATTOCCP_PERCAUSALE, PPQRY_ESTRATTOCCP1, "A.ROWNAMPERCAU", "ROWNAMPERCAU", 1, 1, 0, -13997);
    PAN_ESTRATTOCCP.SetValueListItem(PFL_ESTRATTOCCP_PERCAUSALE, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ESTRATTOCCP.SetValueListItem(PFL_ESTRATTOCCP_PERCAUSALE, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, MyGlb.PANEL_LIST, 140, 112, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ESTRATTOCCP.SetRect(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, MyGlb.PANEL_FORM, 160, 96, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ESTRATTOCCP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ESTRATTOCCP.SetNumRow(MyGlb.OBJ_FIELD, PFL_ESTRATTOCCP_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ESTRATTOCCP.SetFieldPage(PFL_ESTRATTOCCP_ELABORA, -1, -1);
    PAN_ESTRATTOCCP.SetFieldPanel(PFL_ESTRATTOCCP_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_ESTRATTOCCP_InitQueries()
  {
    StringBuffer SQL;

    PAN_ESTRATTOCCP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ESTRATTOCCP.SetIMDB(IMDB, "PQRY_ESTRATTOCCP1", true);
    PAN_ESTRATTOCCP.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ESTRATTOCCP.SetQueryIMDB(PPQRY_ESTRATTOCCP1, IMDBDef15.PQRY_ESTRATTOCCP1_RS, IMDBDef6.TBL_ESTRATTOCCP);
    JustLoaded = true;
    PAN_ESTRATTOCCP.SetFieldPrimaryIndex(PFL_ESTRATTOCCP_DAL, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDAL);
    PAN_ESTRATTOCCP.SetFieldPrimaryIndex(PFL_ESTRATTOCCP_AL, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEAL);
    PAN_ESTRATTOCCP.SetFieldPrimaryIndex(PFL_ESTRATTOCCP_DETTAGLI, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMEDETTA);
    PAN_ESTRATTOCCP.SetFieldPrimaryIndex(PFL_ESTRATTOCCP_PERCAUSALE, IMDBDef6.FLD_ESTRATTOCCP_ROWNAMPERCAU);
    PAN_ESTRATTOCCP.SetMasterTable(0, "ESTRATTOCCP");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ESTRATTOCCP.Status() == 2)
    {
      int oldListQBE = PAN_ESTRATTOCCP.iUseListQBE;
      PAN_ESTRATTOCCP.iUseListQBE = 0;
      PAN_ESTRATTOCCP.PanelCommand(Glb.PCM_SEARCH);
      PAN_ESTRATTOCCP.PanelCommand(Glb.PCM_FIND);
      PAN_ESTRATTOCCP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ESTRATTOCCP) PAN_ESTRATTOCCP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTRATTOCCP) PAN_ESTRATTOCCP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ESTRATTOCCP) PAN_ESTRATTOCCP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ESTRATTOCCP) PAN_ESTRATTOCCP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ESTRATTOCCP) PAN_ESTRATTOCCP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
