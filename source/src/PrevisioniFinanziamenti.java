// **********************************************
// Previsioni Finanziamenti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniFinanziamenti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVISFINANZ_FINANZIAMENT = 0;
  private static int GRP_PREVISFINANZ_TIPOESPOSIZI = 1;

  private static int PFL_PREVISFINANZ_TIPODIALLEGA = 0;
  private static int PFL_PREVISFINANZ_DABILANSIMUL = 1;
  private static int PFL_PREVISFINANZ_DETTAGLIO = 2;
  private static int PFL_PREVISFINANZ_DESCRIINTERV = 3;
  private static int PFL_PREVISFINANZ_ELABORA = 4;
  private static int PFL_PREVISFINANZ_FINANZIAMENT = 5;
  private static int PFL_PREVISFINANZ_TIPOESPOSIZI = 6;
  private static int PFL_PREVISFINANZ_NEWPANELABE1 = 7;

  private static int PPQRY_PAR5 = 0;

  private static int PPQRY_T69 = 1;


  IDPanel PAN_PREVISFINANZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR8(IMDB);
    //
    //
    Init_PQRY_PAR5(IMDB);
    Init_PQRY_PAR5_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR8, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR8, "TBL_PAR8");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMEFINAN,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMTIPESP, "ROWNAMTIPESP");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMTIPESP,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMTIDIAL, "ROWNAMTIDIAL");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMTIDIAL,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMDESINT,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR8,IMDBDef3.FLD_PAR8_ROWNAMEDETTA,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR8, 0);
  }

  private static void Init_PQRY_PAR5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR5, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR5, "PQRY_PAR5");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMEFINAN,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMTIPESP, "ROWNAMTIPESP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMTIPESP,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMTIDIAL, "ROWNAMTIDIAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMTIDIAL,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMDESINT,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5,IMDBDef12.PQSL_PAR5_ROWNAMEDETTA,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR5, 0);
  }

  private static void Init_PQRY_PAR5_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR5_RS, 6);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR5_RS, "PQRY_PAR5_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMEFINAN,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMTIPESP, "ROWNAMTIPESP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMTIPESP,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMTIDIAL, "ROWNAMTIDIAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMTIDIAL,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMDESINT,1,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR5_RS,IMDBDef12.PQSL_PAR5_ROWNAMEDETTA,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniFinanziamenti(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniFinanziamenti()
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
    FormIdx = MyGlb.FRM_PREVISFINANZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "406850B0-43F7-453B-B982-9AA24B25B9AF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 468;
    DesignHeight = 318;
    set_Caption(new IDVariant("Previsioni Finanziamenti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 468;
    Frames[1].Height = 292;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsione Finanziamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 292;
    PAN_PREVISFINANZ = new IDPanel(w, this, 1, "PAN_PREVISFINANZ");
    Frames[1].Content = PAN_PREVISFINANZ;
    PAN_PREVISFINANZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVISFINANZ.VS = MainFrm.VisualStyleList;
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 468-MyGlb.PAN_OFFS_X, 292-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1FEA0ACA-734F-49EB-99BB-81F56A02C760");
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVISFINANZ.InitStatus = 1;
    PAN_PREVISFINANZ_Init();
    PAN_PREVISFINANZ_InitFields();
    PAN_PREVISFINANZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR8, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREVISFINANZ_PAR5();
      }
      PAN_PREVISFINANZ.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniFinanziamenti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniFinanziamenti.class.getName() : (Glb.ClassWithPackage(PrevisioniFinanziamenti.class) ? PrevisioniFinanziamenti.class.getName().substring(PrevisioniFinanziamenti.class.getPackage().getName().length() + 1) : PrevisioniFinanziamenti.class.getName()));
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
      v_DW = (new IDVariant("d_finanziamenti_stampa", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMEFINAN, 0)));
      MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMDESINT, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant("NO"))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMTIDIAL, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMDABISI, 0));
      MainFrm.SetParametroStampa(((IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMEDETTA, 0).equals((new IDVariant(1)), true))?(new IDVariant("SI")):(new IDVariant("NO"))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMTIPESP, 0));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniFinanziamenti", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMEFINAN, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMTIPESP, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMDESINT, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMEDETTA, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniFinanziamenti", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsione Finanziamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVISFINANZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVISFINANZ);
      // 
      // Previsione Finanziamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMEFINAN, 0).equals((new IDVariant(2)), true))
      {
        PAN_PREVISFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVISFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMEFINAN, 0).equals((new IDVariant(3)), true))
      {
        PAN_PREVISFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVISFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMEDETTA, 0).equals((new IDVariant(1)), true))
      {
        PAN_PREVISFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVISFINANZ.SetFlags (Glb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PAR5, IMDBDef12.PQSL_PAR5_ROWNAMTIDIAL, 0)))
      {
        IMDB.set_Value(IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMTIDIAL, 0, (new IDVariant(1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniFinanziamenti", "PrevisioneFinanziamentiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREVISFINANZ_PAR5() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR5_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR8, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR8, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR5_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR5_RS, 0, IMDBDef3.TBL_PAR8, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR5_RS, 0, 0, IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMEFINAN, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR5_RS, 1, 0, IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMTIPESP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR5_RS, 2, 0, IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMTIDIAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR5_RS, 3, 0, IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR5_RS, 4, 0, IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR5_RS, 5, 0, IMDBDef3.TBL_PAR8, IMDBDef3.FLD_PAR8_ROWNAMEDETTA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR8, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR8, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR8, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR5_RS, 0);
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
  private void PAN_PREVISFINANZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVISFINANZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVISFINANZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVISFINANZ, Cancel);
    // Stub
  }

  private void PAN_PREVISFINANZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVISFINANZ_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVISFINANZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVISFINANZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PREVISFINANZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVISFINANZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVISFINANZ_Init()
  {

    PAN_PREVISFINANZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVISFINANZ.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, "361E0A10-2354-47FB-AEC0-D15C8D4CC8C2");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, "Finanziamenti");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, 0, -9999, 152, 16, 0, 0);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, 12, 7, 184, 85, 0, 0);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, 0, 79);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, 1, 13);
    PAN_PREVISFINANZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, 0, 4);
    PAN_PREVISFINANZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, 1, 4);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, "2451FEAD-A525-48E9-BD4B-BE2D22518625");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, "Tipo Esposizione");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_LIST, 152, -9999, 64, 16, 0, 0);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_FORM, 224, 7, 196, 85, 0, 0);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, 0, 92);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, 1, 13);
    PAN_PREVISFINANZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, 0, 4);
    PAN_PREVISFINANZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, 1, 4);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVISFINANZ_TIPOESPOSIZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVISFINANZ.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, "39858418-691A-4CCF-BA4E-CE72508E365F");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, "Tipo Di Allegato");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, "332991F8-FAC6-45B6-9013-A84EAAAB83B3");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, "84620902-50FE-440A-AAF8-F3575A9D5931");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, "Dettaglio");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, "25BF1D33-6EAA-4078-8AD1-6D48E0198EDA");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, "Descrizione Intervento");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, "48C0A86F-5F6E-49C4-9491-AAABE2126029");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, "Elabora");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVISFINANZ.SetImage(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, 0, "button1.gif", false);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, "044C8A7D-70A9-449D-82CE-040835132410");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, "Finanziamenti");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, "D8675A2E-E81F-4E17-93E6-03760B4E8A3D");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, "Tipo Esposizione");
    PAN_PREVISFINANZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVISFINANZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, "547FCC8B-552C-45A1-A02D-4442AD7348FE");
    PAN_PREVISFINANZ.set_Header(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, "");
    PAN_PREVISFINANZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVISFINANZ.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PREVISFINANZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_LIST, 216, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_LIST, 84);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_LIST, "Tp. Di Alleg.");
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_FORM, 8, 124, 412, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_FORM, 100);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_FORM, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPODIALLEGA, MyGlb.PANEL_FORM, "Tipo Di Allegato");
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_TIPODIALLEGA, -1, -1);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_TIPODIALLEGA, PPQRY_PAR5, "A.ROWNAMTIDIAL", "ROWNAMTIDIAL", 1, 2, 0, -13997);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_LIST, 256, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_FORM, 8, 168, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_FORM, 140);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_DABILANSIMUL, -1, -1);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_DABILANSIMUL, PPQRY_PAR5, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_LIST, 352, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_LIST, 52);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_LIST, "Dettaglio");
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_FORM, 336, 168, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_FORM, 60);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_FORM, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DETTAGLIO, MyGlb.PANEL_FORM, "Dettaglio");
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_DETTAGLIO, -1, -1);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_DETTAGLIO, PPQRY_PAR5, "A.ROWNAMEDETTA", "ROWNAMEDETTA", 1, 1, 0, -13997);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_DETTAGLIO, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_DETTAGLIO, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_LIST, 304, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_LIST, "Descr. Interv.");
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_FORM, 8, 196, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_FORM, 140);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_DESCRIINTERV, -1, -1);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_DESCRIINTERV, PPQRY_PAR5, "A.ROWNAMDESINT", "ROWNAMDESINT", 1, 1, 0, -13997);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_DESCRIINTERV, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_DESCRIINTERV, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, MyGlb.PANEL_LIST, 320, 208, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, MyGlb.PANEL_FORM, 340, 228, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_ELABORA, -1, -1);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, 76);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamenti");
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, 16, 32, 176, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, 136);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, 4);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamenti");
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_FINANZIAMENT, -1, GRP_PREVISFINANZ_FINANZIAMENT);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_FINANZIAMENT, PPQRY_PAR5, "A.ROWNAMEFINAN", "ROWNAMEFINAN", 1, 1, 0, -13997);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_FINANZIAMENT, (new IDVariant(1)), "Avanzo di Amministrazione", "", "", -1);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_FINANZIAMENT, (new IDVariant(2)), "Altri Finanziamenti", "", "", -1);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_FINANZIAMENT, (new IDVariant(3)), "Quadro Dimostrativo", "", "", -1);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_LIST, 152, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_LIST, 88);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_LIST, "Tp. Espos.");
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_FORM, 276, 32, 140, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_FORM, 136);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_FORM, 4);
    PAN_PREVISFINANZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_TIPOESPOSIZI, MyGlb.PANEL_FORM, "Tipo Esposizione");
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_TIPOESPOSIZI, -1, GRP_PREVISFINANZ_TIPOESPOSIZI);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_TIPOESPOSIZI, PPQRY_PAR5, "A.ROWNAMTIPESP", "ROWNAMTIPESP", 5, 1, 0, -13997);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_TIPOESPOSIZI, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVISFINANZ.SetValueListItem(PFL_PREVISFINANZ_TIPOESPOSIZI, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, MyGlb.PANEL_LIST, 316, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PREVISFINANZ.SetRect(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, MyGlb.PANEL_FORM, 228, 76, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVISFINANZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PREVISFINANZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVISFINANZ_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PREVISFINANZ.SetFieldPage(PFL_PREVISFINANZ_NEWPANELABE1, -1, GRP_PREVISFINANZ_TIPOESPOSIZI);
    PAN_PREVISFINANZ.SetFieldPanel(PFL_PREVISFINANZ_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
  }

  private void PAN_PREVISFINANZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVISFINANZ.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T69CODICE, ");
    SQL.append("  A.DESCRIZIONE as T69DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T69 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIDIAL~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PREVISFINANZ.SetQuery(PPQRY_T69, 0, SQL, PFL_PREVISFINANZ_TIPODIALLEGA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T69CODICE, ");
    SQL.append("  A.DESCRIZIONE as T69DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T69 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PREVISFINANZ.SetQuery(PPQRY_T69, 1, SQL, PFL_PREVISFINANZ_TIPODIALLEGA, "");
    PAN_PREVISFINANZ.SetQueryDB(PPQRY_T69, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVISFINANZ.SetIMDB(IMDB, "PQRY_PAR5", true);
    PAN_PREVISFINANZ.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PREVISFINANZ.SetQueryIMDB(PPQRY_PAR5, IMDBDef12.PQRY_PAR5_RS, IMDBDef3.TBL_PAR8);
    JustLoaded = true;
    PAN_PREVISFINANZ.SetFieldPrimaryIndex(PFL_PREVISFINANZ_TIPODIALLEGA, IMDBDef3.FLD_PAR8_ROWNAMTIDIAL);
    PAN_PREVISFINANZ.SetFieldPrimaryIndex(PFL_PREVISFINANZ_DABILANSIMUL, IMDBDef3.FLD_PAR8_ROWNAMDABISI);
    PAN_PREVISFINANZ.SetFieldPrimaryIndex(PFL_PREVISFINANZ_DETTAGLIO, IMDBDef3.FLD_PAR8_ROWNAMEDETTA);
    PAN_PREVISFINANZ.SetFieldPrimaryIndex(PFL_PREVISFINANZ_DESCRIINTERV, IMDBDef3.FLD_PAR8_ROWNAMDESINT);
    PAN_PREVISFINANZ.SetFieldPrimaryIndex(PFL_PREVISFINANZ_FINANZIAMENT, IMDBDef3.FLD_PAR8_ROWNAMEFINAN);
    PAN_PREVISFINANZ.SetFieldPrimaryIndex(PFL_PREVISFINANZ_TIPOESPOSIZI, IMDBDef3.FLD_PAR8_ROWNAMTIPESP);
    PAN_PREVISFINANZ.SetMasterTable(0, "PAR8");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVISFINANZ.Status() == 2)
    {
      int oldListQBE = PAN_PREVISFINANZ.iUseListQBE;
      PAN_PREVISFINANZ.iUseListQBE = 0;
      PAN_PREVISFINANZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVISFINANZ.PanelCommand(Glb.PCM_FIND);
      PAN_PREVISFINANZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVISFINANZ) PAN_PREVISFINANZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVISFINANZ) PAN_PREVISFINANZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVISFINANZ) PAN_PREVISFINANZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVISFINANZ) PAN_PREVISFINANZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVISFINANZ) PAN_PREVISFINANZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
