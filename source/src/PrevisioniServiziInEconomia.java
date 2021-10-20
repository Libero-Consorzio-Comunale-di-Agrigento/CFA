// **********************************************
// Previsioni Servizi In Economia
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniServiziInEconomia extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PREVSERINECO_DASERVIZIO = 0;
  private static int PFL_PREVSERINECO_ASERVIZIO = 1;
  private static int PFL_PREVSERINECO_DABILANSIMUL = 2;
  private static int PFL_PREVSERINECO_DETTAGCAPITO = 3;
  private static int PFL_PREVSERINECO_DESCRIINTERV = 4;
  private static int PFL_PREVSERINECO_ELABORA = 5;

  private static int PPQRY_PARAMETRI193 = 0;

  private static int PPQRY_T76 = 1;
  private static int PPQRY_T75 = 2;


  IDPanel PAN_PREVSERINECO;

  // Definition of Global Variables
  private IDVariant FIRSTIME = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI264(IMDB);
    //
    //
    Init_PQRY_PARAMETRI193(IMDB);
    Init_PQRY_PARAMETRI193_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI264(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI264, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI264, "TBL_PARAMETRI264");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMEDASER, "ROWNAMEDASER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMEDASER,1,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMEASERV, "ROWNAMEASERV");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMEASERV,1,3,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI264,IMDBDef3.FLD_PARAMETRI264_ROWNAMDESINT,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI264, 0);
  }

  private static void Init_PQRY_PARAMETRI193(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI193, 5);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI193, "PQRY_PARAMETRI193");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEDASER, "ROWNAMEDASER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEDASER,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEASERV, "ROWNAMEASERV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEASERV,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDESINT,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI193, 0);
  }

  private static void Init_PQRY_PARAMETRI193_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI193_RS, 5);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI193_RS, "PQRY_PARAMETRI193_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEDASER, "ROWNAMEDASER");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEDASER,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEASERV, "ROWNAMEASERV");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMEASERV,1,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI193_RS,IMDBDef12.PQSL_PARAMETRI193_ROWNAMDESINT,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniServiziInEconomia(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniServiziInEconomia()
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
    FormIdx = MyGlb.FRM_PREVSERINECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3D7EDD5B-7095-4B75-99D2-02309228BDCD";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 472;
    DesignHeight = 246;
    set_Caption(new IDVariant("Previsioni Servizi In Economia"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 472;
    Frames[1].Height = 220;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Servizi In Economia";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 220;
    PAN_PREVSERINECO = new IDPanel(w, this, 1, "PAN_PREVSERINECO");
    Frames[1].Content = PAN_PREVSERINECO;
    PAN_PREVSERINECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVSERINECO.VS = MainFrm.VisualStyleList;
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 472-MyGlb.PAN_OFFS_X, 220-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVSERINECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C2B0B892-1456-45F7-B34A-3B27AA8BCF9C");
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 200, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVSERINECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVSERINECO.InitStatus = 2;
    PAN_PREVSERINECO_Init();
    PAN_PREVSERINECO_InitFields();
    PAN_PREVSERINECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI264, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREVSERINECO_PARAMETRI193();
      }
      PAN_PREVSERINECO.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniServiziInEconomia);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniServiziInEconomia.class.getName() : (Glb.ClassWithPackage(PrevisioniServiziInEconomia.class) ? PrevisioniServiziInEconomia.class.getName().substring(PrevisioniServiziInEconomia.class.getPackage().getName().length() + 1) : PrevisioniServiziInEconomia.class.getName()));
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
      v_DW = (new IDVariant("d_serv_econ", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI193, IMDBDef12.PQSL_PARAMETRI193_ROWNAMEDASER, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI193, IMDBDef12.PQSL_PARAMETRI193_ROWNAMEASERV, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI193, IMDBDef12.PQSL_PARAMETRI193_ROWNAMDABISI, 0)));
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI193, IMDBDef12.PQSL_PARAMETRI193_ROWNAMDETCAP, 0)));
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI193, IMDBDef12.PQSL_PARAMETRI193_ROWNAMDESINT, 0)));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniServiziInEconomia", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMDESINT, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniServiziInEconomia", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Servizi In Economia After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PREVSERINECO_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Servizi In Economia After Find Event Body
      // Procedure Body
      // 
      if (FIRSTIME.equals((new IDVariant(1)), true))
      {
        FIRSTIME = (new IDVariant(0));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMEDASER, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMEASERV, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniServiziInEconomia", "PrevisioniServiziInEconomiaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Servizi In Economia On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVSERINECO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVSERINECO);
      // 
      // Previsioni Servizi In Economia On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI193, IMDBDef12.PQSL_PARAMETRI193_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PREVSERINECO.SetFlags (Glb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVSERINECO.SetFlags (Glb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniServiziInEconomia", "PrevisioniServiziInEconomiaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void PREVSERINECO_PARAMETRI193() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI193_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI264, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI264, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI193_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI193_RS, 0, IMDBDef3.TBL_PARAMETRI264, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI193_RS, 0, 0, IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMEDASER, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI193_RS, 1, 0, IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMEASERV, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI193_RS, 2, 0, IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI193_RS, 3, 0, IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI193_RS, 4, 0, IMDBDef3.TBL_PARAMETRI264, IMDBDef3.FLD_PARAMETRI264_ROWNAMDESINT, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI264, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI264, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI264, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI193_RS, 0);
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
  private void PAN_PREVSERINECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVSERINECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVSERINECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVSERINECO, Cancel);
    // Stub
  }

  private void PAN_PREVSERINECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVSERINECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVSERINECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVSERINECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PREVSERINECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVSERINECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVSERINECO_Init()
  {

    PAN_PREVSERINECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVSERINECO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PREVSERINECO.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PREVSERINECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, "1628A1C7-6F90-440D-AEC7-5495002F1F70");
    PAN_PREVSERINECO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, "Da Servizio");
    PAN_PREVSERINECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, "");
    PAN_PREVSERINECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVSERINECO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVSERINECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, "426E0898-492D-41DA-A204-79C88C0BE069");
    PAN_PREVSERINECO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, "A Servizio");
    PAN_PREVSERINECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, "");
    PAN_PREVSERINECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVSERINECO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVSERINECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, "EE082AB0-C1B5-4E82-9296-F6D74D70E2B7");
    PAN_PREVSERINECO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVSERINECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, "");
    PAN_PREVSERINECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVSERINECO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVSERINECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, "AB11527E-2473-49BC-917A-943CFF4098A1");
    PAN_PREVSERINECO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVSERINECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, "");
    PAN_PREVSERINECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVSERINECO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVSERINECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, "66005A9F-E142-4842-8EDA-0B002CAF52BC");
    PAN_PREVSERINECO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, "Descrizione Intervento");
    PAN_PREVSERINECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, "");
    PAN_PREVSERINECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVSERINECO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVSERINECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, "AC37F7D9-8E52-483A-A01D-141CE5BACBE7");
    PAN_PREVSERINECO.set_Header(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, "Elabora");
    PAN_PREVSERINECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVSERINECO.SetImage(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, 0, "button1.gif", false);
    PAN_PREVSERINECO.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PREVSERINECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_LIST, 64);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_LIST, "Da Serv.");
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_FORM, 4, 4, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_FORM, 76);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DASERVIZIO, MyGlb.PANEL_FORM, "Da Servizio");
    PAN_PREVSERINECO.SetFieldPage(PFL_PREVSERINECO_DASERVIZIO, -1, -1);
    PAN_PREVSERINECO.SetFieldPanel(PFL_PREVSERINECO_DASERVIZIO, PPQRY_PARAMETRI193, "A.ROWNAMEDASER", "ROWNAMEDASER", 1, 3, 0, -13997);
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_LIST, 56);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_LIST, "A Serv.");
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_FORM, 4, 28, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_FORM, 76);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ASERVIZIO, MyGlb.PANEL_FORM, "A Servizio");
    PAN_PREVSERINECO.SetFieldPage(PFL_PREVSERINECO_ASERVIZIO, -1, -1);
    PAN_PREVSERINECO.SetFieldPanel(PFL_PREVSERINECO_ASERVIZIO, PPQRY_PARAMETRI193, "A.ROWNAMEASERV", "ROWNAMEASERV", 1, 3, 0, -13997);
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_FORM, 256, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_FORM, 136);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVSERINECO.SetFieldPage(PFL_PREVSERINECO_DABILANSIMUL, -1, -1);
    PAN_PREVSERINECO.SetFieldPanel(PFL_PREVSERINECO_DABILANSIMUL, PPQRY_PARAMETRI193, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_PREVSERINECO.SetValueListItem(PFL_PREVSERINECO_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_PREVSERINECO.SetValueListItem(PFL_PREVSERINECO_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_FORM, 256, 76, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_FORM, 136);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVSERINECO.SetFieldPage(PFL_PREVSERINECO_DETTAGCAPITO, -1, -1);
    PAN_PREVSERINECO.SetFieldPanel(PFL_PREVSERINECO_DETTAGCAPITO, PPQRY_PARAMETRI193, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_PREVSERINECO.SetValueListItem(PFL_PREVSERINECO_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVSERINECO.SetValueListItem(PFL_PREVSERINECO_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_LIST, 160, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Int.");
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_FORM, 244, 100, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_FORM, 148);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVSERINECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_PREVSERINECO.SetFieldPage(PFL_PREVSERINECO_DESCRIINTERV, -1, -1);
    PAN_PREVSERINECO.SetFieldPanel(PFL_PREVSERINECO_DESCRIINTERV, PPQRY_PARAMETRI193, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_PREVSERINECO.SetValueListItem(PFL_PREVSERINECO_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVSERINECO.SetValueListItem(PFL_PREVSERINECO_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, MyGlb.PANEL_LIST, 300, 144, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVSERINECO.SetRect(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, MyGlb.PANEL_FORM, 336, 144, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVSERINECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVSERINECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVSERINECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVSERINECO.SetFieldPage(PFL_PREVSERINECO_ELABORA, -1, -1);
    PAN_PREVSERINECO.SetFieldPanel(PFL_PREVSERINECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PREVSERINECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVSERINECO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  A.DESCRIZIONE as T75DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEDASER~~) ");
    SQL.append("and   (A.ECONOMIA_IVA = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVSERINECO.SetQuery(PPQRY_T76, 0, SQL, PFL_PREVSERINECO_DASERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  A.DESCRIZIONE as T75DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.ECONOMIA_IVA = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVSERINECO.SetQuery(PPQRY_T76, 1, SQL, PFL_PREVSERINECO_DASERVIZIO, "");
    PAN_PREVSERINECO.SetQueryDB(PPQRY_T76, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  A.DESCRIZIONE as T75DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEASERV~~) ");
    SQL.append("and   (A.ECONOMIA_IVA = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVSERINECO.SetQuery(PPQRY_T75, 0, SQL, PFL_PREVSERINECO_ASERVIZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T75CODICE, ");
    SQL.append("  A.DESCRIZIONE as T75DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T75 A ");
    SQL.append("where (A.ECONOMIA_IVA = 'SI') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVSERINECO.SetQuery(PPQRY_T75, 1, SQL, PFL_PREVSERINECO_ASERVIZIO, "");
    PAN_PREVSERINECO.SetQueryDB(PPQRY_T75, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVSERINECO.SetIMDB(IMDB, "PQRY_PARAMETRI193", true);
    PAN_PREVSERINECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PREVSERINECO.SetQueryIMDB(PPQRY_PARAMETRI193, IMDBDef12.PQRY_PARAMETRI193_RS, IMDBDef3.TBL_PARAMETRI264);
    JustLoaded = true;
    PAN_PREVSERINECO.SetFieldPrimaryIndex(PFL_PREVSERINECO_DASERVIZIO, IMDBDef3.FLD_PARAMETRI264_ROWNAMEDASER);
    PAN_PREVSERINECO.SetFieldPrimaryIndex(PFL_PREVSERINECO_ASERVIZIO, IMDBDef3.FLD_PARAMETRI264_ROWNAMEASERV);
    PAN_PREVSERINECO.SetFieldPrimaryIndex(PFL_PREVSERINECO_DABILANSIMUL, IMDBDef3.FLD_PARAMETRI264_ROWNAMDABISI);
    PAN_PREVSERINECO.SetFieldPrimaryIndex(PFL_PREVSERINECO_DETTAGCAPITO, IMDBDef3.FLD_PARAMETRI264_ROWNAMDETCAP);
    PAN_PREVSERINECO.SetFieldPrimaryIndex(PFL_PREVSERINECO_DESCRIINTERV, IMDBDef3.FLD_PARAMETRI264_ROWNAMDESINT);
    PAN_PREVSERINECO.SetMasterTable(0, "PARAMETRI264");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVSERINECO.Status() == 2)
    {
      int oldListQBE = PAN_PREVSERINECO.iUseListQBE;
      PAN_PREVSERINECO.iUseListQBE = 0;
      PAN_PREVSERINECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVSERINECO.PanelCommand(Glb.PCM_FIND);
      PAN_PREVSERINECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVSERINECO) PAN_PREVSERINECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVSERINECO) PAN_PREVSERINECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVSERINECO) PAN_PREVSERINECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVSERINECO) PAN_PREVSERINECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVSERINECO) PAN_PREVSERINECO_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PREVSERINECO) PAN_PREVSERINECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
