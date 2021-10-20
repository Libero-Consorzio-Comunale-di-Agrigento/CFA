// **********************************************
// Comunicazione Liquidazioni Periodiche IVA
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ComunicazioneLiquidazioniPeriodicheIVA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_COMLIQPERIVA_PERIODPRECED = 0;

  private static int PFL_COMLIQPERIVA_ESERCIZIO = 0;
  private static int PFL_COMLIQPERIVA_TRIMESTRE = 1;
  private static int PFL_COMLIQPERIVA_DEBITO = 2;
  private static int PFL_COMLIQPERIVA_CREDITO = 3;
  private static int PFL_COMLIQPERIVA_SOLOATTITRIM = 4;
  private static int PFL_COMLIQPERIVA_IMPMASDANOVE = 5;
  private static int PFL_COMLIQPERIVA_ELABORA = 6;
  private static int PFL_COMLIQPERIVA_ETIESTFILXML = 7;

  private static int PPQRY_PARAMETRI242 = 0;


  IDPanel PAN_COMLIQPERIVA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI588(IMDB);
    //
    //
    Init_PQRY_PARAMETRI242(IMDB);
    Init_PQRY_PARAMETRI242_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI588(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI588, 10);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI588, "TBL_PARAMETRI588");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEDEBIT,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMECREDI,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMSOATTR,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMINTREG, "ROWNAMINTREG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMINTREG,5,19,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMNUPRPA, "ROWNAMNUPRPA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMNUPRPA,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATDA, "ROWNAMEDATDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATDA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI588,IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATAA,6,14,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI588, 0);
  }

  private static void Init_PQRY_PARAMETRI242(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI242, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI242, "PQRY_PARAMETRI242");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMECREDI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242,IMDBDef10.PQSL_PARAMETRI242_ROWNAMSOATTR,5,1,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI242, 0);
  }

  private static void Init_PQRY_PARAMETRI242_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAMETRI242_RS, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAMETRI242_RS, "PQRY_PARAMETRI242_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI, "ROWNAMPERTRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI,1,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT, "ROWNAMEDEBIT");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMECREDI, "ROWNAMECREDI");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMECREDI,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV, "RONAIMMADANV");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV,3,16,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMSOATTR, "ROWNAMSOATTR");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAMETRI242_RS,IMDBDef10.PQSL_PARAMETRI242_ROWNAMSOATTR,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ComunicazioneLiquidazioniPeriodicheIVA(MyWebEntryPoint w, IMDBObj imdb)
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
  public ComunicazioneLiquidazioniPeriodicheIVA()
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
    FormIdx = MyGlb.FRM_COMLIQPERIVA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "868F7BB3-DADC-4014-AF99-3B0A29294BA6";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 420;
    DesignHeight = 254;
    set_Caption(new IDVariant("Comunicazione Liquidazioni Periodiche IVA"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 420;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Comunicazione Liquidazioni Periodiche IVA";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_COMLIQPERIVA = new IDPanel(w, this, 1, "PAN_COMLIQPERIVA");
    Frames[1].Content = PAN_COMLIQPERIVA;
    PAN_COMLIQPERIVA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_COMLIQPERIVA.VS = MainFrm.VisualStyleList;
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 420-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ECA9D81C-EC0E-44B7-A27B-8E4565F981E2");
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 524, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_COMLIQPERIVA.InitStatus = 2;
    PAN_COMLIQPERIVA_Init();
    PAN_COMLIQPERIVA_InitFields();
    PAN_COMLIQPERIVA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI588, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        COMLIQPERIVA_PARAMETRI242();
      }
      PAN_COMLIQPERIVA.UpdatePanel(MainFrm);
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
    return (obj instanceof ComunicazioneLiquidazioniPeriodicheIVA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ComunicazioneLiquidazioniPeriodicheIVA.class.getName() : (Glb.ClassWithPackage(ComunicazioneLiquidazioniPeriodicheIVA.class) ? ComunicazioneLiquidazioniPeriodicheIVA.class.getName().substring(ComunicazioneLiquidazioniPeriodicheIVA.class.getPackage().getName().length() + 1) : ComunicazioneLiquidazioniPeriodicheIVA.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant D = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      D = (new IDVariant(25.82, IDVariant.DECIMAL));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_VCOMLIIVFIXM = new IDVariant(0,IDVariant.STRING);
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMSOATTR, 0, (new IDVariant("M")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_RONAIMMADANV, 0, new IDVariant(D));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDEBIT, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMECREDI, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
      // 
      // controllo  e message confir
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FILE_XML as COMLIQIVFIXM ");
      SQL.append("from ");
      SQL.append("  COMUNICAZIONE_LIQ_IVA A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TRIMESTRE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOMLIIVFIXM = QV.Get("COMLIQIVFIXM", IDVariant.STRING) ;
      }
      QV.Close();
      if (!(IDL.IsNull(v_VCOMLIIVFIXM)) && IDL.Length(v_VCOMLIIVFIXM).compareTo((new IDVariant(0)), true)>0)
      {
        PAN_COMLIQPERIVA.SetFlags (Glb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_COMLIQPERIVA.SetFlags (Glb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IDVariant v_VDEBITOPREC = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VCREDITOPREC = new IDVariant(0,IDVariant.DECIMAL);
      IDVariant v_VESERCIZPREC = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VTRIMESTPREC = new IDVariant(0,IDVariant.INTEGER);
      if (IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0).equals((new IDVariant(1)), true))
      {
        v_VESERCIZPREC = IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0), (new IDVariant(1)));
        v_VTRIMESTPREC = (new IDVariant(4));
      }
      else
      {
        v_VESERCIZPREC = IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0);
        v_VTRIMESTPREC = IDL.Sub(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0), (new IDVariant(1)));
      }
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.IMPORTO_DA_VERSARE_M3 as COLIIVIMDAVM, ");
      SQL.append("  A.IMPORTO_A_CREDITO_M3 as COLIIVIMACRM ");
      SQL.append("from ");
      SQL.append("  COMUNICAZIONE_LIQ_IVA A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(v_VESERCIZPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TRIMESTRE = " + IDL.CSql(v_VTRIMESTPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VDEBITOPREC = QV.Get("COLIIVIMDAVM", IDVariant.DECIMAL) ;
        v_VCREDITOPREC = QV.Get("COLIIVIMACRM", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMECREDI, 0, new IDVariant(v_VCREDITOPREC));
      if (v_VDEBITOPREC.compareTo(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_RONAIMMADANV, 0), true)<=0)
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDEBIT, 0, new IDVariant(v_VDEBITOPREC));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneLiquidazioniPeriodicheIVA", "LoadEvent", _e);
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
      UNLOADEVENT_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneLiquidazioniPeriodicheIVA", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDEBIT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMECREDI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSOATTR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_RONAIMMADANV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMINTREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMNUPRPA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEDATAA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMEANNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMACCDOV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSALRIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMDESSTA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMSTAPRE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMMESTPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI241, IMDBDef2.FLD_PARAMETRI241_ROWNAMANSTPR, 0, new IDVariant());
  }

  // **********************************************************************
  // Comunicazione Liquidazioni Periodiche IVA On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_COMLIQPERIVA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Comunicazione Liquidazioni Periodiche IVA On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_COMLIQPERIVA_TRIMESTRE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATAA, 0, MainFrm.Getdatatrimestre(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC, 0)));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATDA, 0, MainFrm.Getdatainiziotrimestre(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI, 0),(new IDVariant(1))), IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC, 0)));
      }
      if ((Column.equals((new IDVariant(PFL_COMLIQPERIVA_TRIMESTRE)), true) || Column.equals((new IDVariant(PFL_COMLIQPERIVA_ESERCIZIO)), true)) && FieldWasModified.booleanValue())
      {
        IDVariant v_VCOMLIIVFIXM = new IDVariant(0,IDVariant.STRING);
        // 
        // controllo  e message confir
        // 
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.FILE_XML as COMLIQIVFIXM ");
        SQL.append("from ");
        SQL.append("  COMUNICAZIONE_LIQ_IVA A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TRIMESTRE = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOMLIIVFIXM = QV.Get("COMLIQIVFIXM", IDVariant.STRING) ;
        }
        QV.Close();
        if (!(IDL.IsNull(v_VCOMLIIVFIXM)) && IDL.Length(v_VCOMLIIVFIXM).compareTo((new IDVariant(0)), true)>0)
        {
          PAN_COMLIQPERIVA.SetFlags (Glb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_COMLIQPERIVA.SetFlags (Glb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        IDVariant v_VDEBITOPREC = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VCREDITOPREC = new IDVariant(0,IDVariant.DECIMAL);
        IDVariant v_VESERCIZPREC = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_VTRIMESTPREC = new IDVariant(0,IDVariant.INTEGER);
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI, 0).equals((new IDVariant(1)), true))
        {
          v_VESERCIZPREC = IDL.Sub(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC, 0), (new IDVariant(1)));
          v_VTRIMESTPREC = (new IDVariant(4));
        }
        else
        {
          v_VESERCIZPREC = IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEESERC, 0);
          v_VTRIMESTPREC = IDL.Sub(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMPERTRI, 0), (new IDVariant(1)));
        }
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.IMPORTO_DA_VERSARE_M3 as COLIIVIMDAVM, ");
        SQL.append("  A.IMPORTO_A_CREDITO_M3 as COLIIVIMACRM ");
        SQL.append("from ");
        SQL.append("  COMUNICAZIONE_LIQ_IVA A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(v_VESERCIZPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.TRIMESTRE = " + IDL.CSql(v_VTRIMESTPREC, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VDEBITOPREC = QV.Get("COLIIVIMDAVM", IDVariant.DECIMAL) ;
          v_VCREDITOPREC = QV.Get("COLIIVIMACRM", IDVariant.DECIMAL) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMECREDI, 0, new IDVariant(v_VCREDITOPREC));
        if (v_VDEBITOPREC.compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV, 0), true)<=0)
        {
          IMDB.set_Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT, 0, new IDVariant(v_VDEBITOPREC));
        }
      }
      if (Column.equals((new IDVariant(PFL_COMLIQPERIVA_DEBITO)), true) && FieldModified.equals((new IDVariant(-1)), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV, 0), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Il debito del periodo precedente non puo' superare l'importo massimo da non versare", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneLiquidazioniPeriodicheIVA", "ComunicazioneLiquidazioniPeriodicheIVAOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CHECK = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      IDVariant v_PERIODO = new IDVariant(0,IDVariant.STRING);
      v_PERIODO = IDL.Add((new IDVariant("Periodo")), (new IDVariant(" ")));
      if (IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATDA, 0)).compareTo(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATAA, 0)), true)!=0)
      {
        v_PERIODO = IDL.Add(IDL.Add(IDL.Add(v_PERIODO, MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATDA, 0)))), (new IDVariant(" - "))), MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATAA, 0))));
      }
      else
      {
        v_PERIODO = IDL.Add(v_PERIODO, MainFrm.Mesedanumero(IDL.Month(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATDA, 0))));
      }
      v_PERIODO = IDL.Add(IDL.Add(v_PERIODO, (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0)));
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMECREDI, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0 && IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)!=0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Inserire solo credito o solo debito", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_ROWNAMEDEBIT, 0).compareTo(IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV, 0), true)>0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Il debito del periodo precedente non puo' superare l'importo massimo da non versare", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      v_CHECK = (new IDVariant(0));
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  1 as UNO ");
      SQL.append("from ");
      SQL.append("  T04 A, ");
      SQL.append("  FATPRI B ");
      SQL.append("where (A.TIPO_REGISTRO = B.TIPO_REGISTRO) ");
      SQL.append("and   (A.TIPO_BOLLATO = B.TIPO_BOLLATO) ");
      SQL.append("and   ((A.RIMBORSI IS NULL)) ");
      SQL.append("and   ((B.DATA_DOC BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATDA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDATAA, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      SQL.append("and   ((B.ANNO_PROG IS NULL)) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CHECK = QV.Get("UNO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CHECK.equals((new IDVariant(1)), true))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Per il periodo di elaborazione sono presenti documenti nel Registro Debitori non Codificati che non sono ancora stati Contabilizzati: il Registro Riepilogativo non può essere stampato.", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      IDVariant v_VCOUNTCOMUNI = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_IRICALCOLO = null;
      v_IRICALCOLO = (new IDVariant(1));
      // 
      // controllo  e message confir
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  COMUNICAZIONE_LIQ_IVA A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TRIMESTRE = " + IDL.CSql(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNTCOMUNI = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNTCOMUNI.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_STRIMESSCELT = null;
        v_STRIMESSCELT = (IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio - Marzo") : IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0).equals((new IDVariant(2)))? new IDVariant("Aprile - Giugno") : IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0).equals((new IDVariant(3)))? new IDVariant("Luglio - Settembre") : IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0).equals((new IDVariant(4)))? new IDVariant("Ottobre - Dicembre") :  new IDVariant());
        IDVariant S = null;
        S = IDL.Add(IDL.Add((new IDVariant("Per il trimestre scelto (")), v_STRIMESSCELT), (new IDVariant("), è già presente una elaborazione.<br/>Vuoi sovrascrivere?")));
        v_IRICALCOLO = (new IDVariant(MainFrm.MessageConfirmEx(S, (new IDVariant("Si;No")))));
        if (IDL.IsNull(v_IRICALCOLO))
        {
          return 0;
        }
      }
      if (v_IRICALCOLO.equals((new IDVariant(1)), true))
      {
        MainFrm.Cf4armDBObject.COMUNICAZIONELIQIVAPKGESTRAZIONEDATI(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMSOATTR, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDEBIT, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMECREDI, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_RONAIMMADANV, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          // 
          // Apertura maschera dati
          // 
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0));
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV, 0));
          MainFrm.Show(MyGlb.FRM_DATCOMLIQIVA, (new IDVariant(0)).intValue(), this); 
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      else
      {
        // 
        // Apertura maschera dati
        // 
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMEOGGEESER, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOMOGGPERTRI, 0, IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI589, IMDBDef2.FLD_PARAMETRI589_NOOGIMMADANV, 0, IMDB.Value(IMDBDef10.PQRY_PARAMETRI242, IMDBDef10.PQSL_PARAMETRI242_RONAIMMADANV, 0));
        MainFrm.Show(MyGlb.FRM_DATCOMLIQIVA, (new IDVariant(0)).intValue(), this); 
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneLiquidazioniPeriodicheIVA", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Estra File XML
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaEstraFileXML ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Estra File XML Body
      // Corpo Procedura
      // 
      MainFrm.ApriFileXMLComunLiqIva(IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0), IMDB.Value(IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComunicazioneLiquidazioniPeriodicheIVA", "EtichettaEstraFileXML", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void COMLIQPERIVA_PARAMETRI242() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAMETRI242_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI588, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI588, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAMETRI242_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAMETRI242_RS, 0, IMDBDef2.TBL_PARAMETRI588, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI242_RS, 0, 0, IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI242_RS, 1, 0, IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI242_RS, 2, 0, IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDEBIT, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI242_RS, 3, 0, IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMECREDI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI242_RS, 4, 0, IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_RONAIMMADANV, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAMETRI242_RS, 5, 0, IMDBDef2.TBL_PARAMETRI588, IMDBDef2.FLD_PARAMETRI588_ROWNAMSOATTR, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI588, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI588, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI588, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAMETRI242_RS, 0);
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
  private void PAN_COMLIQPERIVA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_COMLIQPERIVA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_COMLIQPERIVA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_COMLIQPERIVA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_COMLIQPERIVA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_COMLIQPERIVA);
    // Stub
  }

  private void PAN_COMLIQPERIVA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_COMLIQPERIVA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_COMLIQPERIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_COMLIQPERIVA_ETIESTFILXML)
    {
      this.IdxPanelActived = this.PAN_COMLIQPERIVA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaEstraFileXML();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_COMLIQPERIVA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_COMLIQPERIVA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_COMLIQPERIVA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_COMLIQPERIVA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_COMLIQPERIVA_Init()
  {

    PAN_COMLIQPERIVA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_COMLIQPERIVA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, "99A54DD2-06C9-4CD3-8574-C4B61635979F");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, "Periodo Precedente");
    PAN_COMLIQPERIVA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, "");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, MyGlb.VIS_GROUPSTYLE);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, MyGlb.PANEL_FORM, 24, 51, 364, 49, 0, 0);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, 0, 111);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, 1, 13);
    PAN_COMLIQPERIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, 0, 4);
    PAN_COMLIQPERIVA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, 1, 4);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_GROUP, GRP_COMLIQPERIVA_PERIODPRECED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_COMLIQPERIVA.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, "0284E0C0-6FC9-49A3-8F94-55D53D04D616");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, "Esercizio");
    PAN_COMLIQPERIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, "");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, "5917434D-BB1B-4490-950C-937DDC38FA37");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, "Trimestre");
    PAN_COMLIQPERIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, "");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.VIS_NORMALFIELDS);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, "A5DE1552-09A9-424A-9355-0D0296EF9AB0");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, "Debito");
    PAN_COMLIQPERIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, "");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, "4E52485A-05A2-4DF6-B382-B35FDD55D7E6");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, "Credito");
    PAN_COMLIQPERIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, "");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.VIS_NORFIECF4IMP);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, "A38B62C9-C635-4980-B3C5-94933C7CD88B");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, "Solo Attività Trimestrali");
    PAN_COMLIQPERIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, "");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.VIS_CHESTYNOBOCA);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, "DA5E574C-70E1-455F-B966-E2C38C7971A8");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, "Importo Massimo Da Non Versare");
    PAN_COMLIQPERIVA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, "");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.VIS_NORFIECF4IMP);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, "1BF3D082-A38E-449C-9E2A-0D1341AEC2F0");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, "Elabora");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_COMLIQPERIVA.SetImage(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, 0, "button1.gif", false);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_COMLIQPERIVA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, "96BE3FBE-8EBD-441F-AEC8-6BBB89BEED8B");
    PAN_COMLIQPERIVA.set_Header(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, "Estrai File XML");
    PAN_COMLIQPERIVA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, MyGlb.VIS_STATICBUTTON);
    PAN_COMLIQPERIVA.SetImage(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, 0, "button_large.GIF", false);
    PAN_COMLIQPERIVA.SetFlags(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_COMLIQPERIVA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_FORM, 28, 16, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_ESERCIZIO, -1, -1);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_ESERCIZIO, PPQRY_PARAMETRI242, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 4, 0, -13997);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_LIST, 112);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_LIST, "Trimestre");
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_FORM, 156, 16, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_FORM, 112);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_TRIMESTRE, MyGlb.PANEL_FORM, "Trimestre");
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_TRIMESTRE, -1, -1);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_TRIMESTRE, PPQRY_PARAMETRI242, "A.ROWNAMPERTRI", "ROWNAMPERTRI", 1, 2, 0, -13997);
    PAN_COMLIQPERIVA.SetValueListItem(PFL_COMLIQPERIVA_TRIMESTRE, (new IDVariant(1)), "Gennaio - Marzo", "", "", -1);
    PAN_COMLIQPERIVA.SetValueListItem(PFL_COMLIQPERIVA_TRIMESTRE, (new IDVariant(2)), "Aprile - Giugno", "", "", -1);
    PAN_COMLIQPERIVA.SetValueListItem(PFL_COMLIQPERIVA_TRIMESTRE, (new IDVariant(3)), "Luglio - Settembre", "", "", -1);
    PAN_COMLIQPERIVA.SetValueListItem(PFL_COMLIQPERIVA_TRIMESTRE, (new IDVariant(4)), "Ottobre - Dicembre", "", "", -1);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_LIST, 40);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_LIST, "Debito");
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_FORM, 28, 76, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_FORM, 52);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_DEBITO, MyGlb.PANEL_FORM, "Debito");
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_DEBITO, -1, GRP_COMLIQPERIVA_PERIODPRECED);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_DEBITO, PPQRY_PARAMETRI242, "A.ROWNAMEDEBIT", "ROWNAMEDEBIT", 3, 14, 2, -13997);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_LIST, 56, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_LIST, 44);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_LIST, "Credito");
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_FORM, 220, 76, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_FORM, 60);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_CREDITO, MyGlb.PANEL_FORM, "Credito");
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_CREDITO, -1, GRP_COMLIQPERIVA_PERIODPRECED);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_CREDITO, PPQRY_PARAMETRI242, "A.ROWNAMECREDI", "ROWNAMECREDI", 3, 14, 2, -13997);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 144);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_LIST, "Solo Attività Trimestrali");
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 212, 116, 174, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 148);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_SOLOATTITRIM, MyGlb.PANEL_FORM, "Solo Attività Trimestrali");
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_SOLOATTITRIM, -1, -1);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_SOLOATTITRIM, PPQRY_PARAMETRI242, "A.ROWNAMSOATTR", "ROWNAMSOATTR", 5, 1, 0, -13997);
    PAN_COMLIQPERIVA.SetValueListItem(PFL_COMLIQPERIVA_SOLOATTITRIM, (new IDVariant("T")), "T", "", "", -1);
    PAN_COMLIQPERIVA.SetValueListItem(PFL_COMLIQPERIVA_SOLOATTITRIM, (new IDVariant("E")), "E", "", "", -1);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 160, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 168);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_LIST, "Imp. Mass. Da Non Versare");
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 84, 148, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 200);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_IMPMASDANOVE, MyGlb.PANEL_FORM, "Importo Massimo Da Non Versare");
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_IMPMASDANOVE, -1, -1);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_IMPMASDANOVE, PPQRY_PARAMETRI242, "A.RONAIMMADANV", "RONAIMMADANV", 3, 16, 2, -13997);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, MyGlb.PANEL_LIST, 284, 160, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, MyGlb.PANEL_FORM, 308, 184, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_ELABORA, -1, -1);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, MyGlb.PANEL_LIST, 16, 180, 100, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, MyGlb.PANEL_LIST, 0);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, MyGlb.PANEL_LIST, 1);
    PAN_COMLIQPERIVA.SetRect(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, MyGlb.PANEL_FORM, 12, 184, 132, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_COMLIQPERIVA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, MyGlb.PANEL_FORM, 0);
    PAN_COMLIQPERIVA.SetNumRow(MyGlb.OBJ_FIELD, PFL_COMLIQPERIVA_ETIESTFILXML, MyGlb.PANEL_FORM, 1);
    PAN_COMLIQPERIVA.SetFieldPage(PFL_COMLIQPERIVA_ETIESTFILXML, -1, -1);
    PAN_COMLIQPERIVA.SetFieldPanel(PFL_COMLIQPERIVA_ETIESTFILXML, -1, "", "ETIESTFILXML", 0, 0, 0, -13997);
  }

  private void PAN_COMLIQPERIVA_InitQueries()
  {
    StringBuffer SQL;

    PAN_COMLIQPERIVA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_COMLIQPERIVA.SetIMDB(IMDB, "PQRY_PARAMETRI242", true);
    PAN_COMLIQPERIVA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_COMLIQPERIVA.SetQueryIMDB(PPQRY_PARAMETRI242, IMDBDef10.PQRY_PARAMETRI242_RS, IMDBDef2.TBL_PARAMETRI588);
    JustLoaded = true;
    PAN_COMLIQPERIVA.SetFieldPrimaryIndex(PFL_COMLIQPERIVA_ESERCIZIO, IMDBDef2.FLD_PARAMETRI588_ROWNAMEESERC);
    PAN_COMLIQPERIVA.SetFieldPrimaryIndex(PFL_COMLIQPERIVA_TRIMESTRE, IMDBDef2.FLD_PARAMETRI588_ROWNAMPERTRI);
    PAN_COMLIQPERIVA.SetFieldPrimaryIndex(PFL_COMLIQPERIVA_DEBITO, IMDBDef2.FLD_PARAMETRI588_ROWNAMEDEBIT);
    PAN_COMLIQPERIVA.SetFieldPrimaryIndex(PFL_COMLIQPERIVA_CREDITO, IMDBDef2.FLD_PARAMETRI588_ROWNAMECREDI);
    PAN_COMLIQPERIVA.SetFieldPrimaryIndex(PFL_COMLIQPERIVA_SOLOATTITRIM, IMDBDef2.FLD_PARAMETRI588_ROWNAMSOATTR);
    PAN_COMLIQPERIVA.SetFieldPrimaryIndex(PFL_COMLIQPERIVA_IMPMASDANOVE, IMDBDef2.FLD_PARAMETRI588_RONAIMMADANV);
    PAN_COMLIQPERIVA.SetMasterTable(0, "PARAMETRI588");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_COMLIQPERIVA.Status() == 2)
    {
      int oldListQBE = PAN_COMLIQPERIVA.iUseListQBE;
      PAN_COMLIQPERIVA.iUseListQBE = 0;
      PAN_COMLIQPERIVA.PanelCommand(Glb.PCM_SEARCH);
      PAN_COMLIQPERIVA.PanelCommand(Glb.PCM_FIND);
      PAN_COMLIQPERIVA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_COMLIQPERIVA) PAN_COMLIQPERIVA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_COMLIQPERIVA) PAN_COMLIQPERIVA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_COMLIQPERIVA) PAN_COMLIQPERIVA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_COMLIQPERIVA) PAN_COMLIQPERIVA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_COMLIQPERIVA) PAN_COMLIQPERIVA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
