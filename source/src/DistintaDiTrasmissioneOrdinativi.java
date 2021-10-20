// **********************************************
// Distinta Di Trasmissione Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DistintaDiTrasmissioneOrdinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DISTDITRAORD_NUOVADISTINT = 0;

  private static int PFL_DISTDITRAORD_DISTIGIAEMES = 0;
  private static int PFL_DISTDITRAORD_DISTINTAN = 1;
  private static int PFL_DISTDITRAORD_DATADISTEMES = 2;
  private static int PFL_DISTDITRAORD_NUOVADISTINT = 3;
  private static int PFL_DISTDITRAORD_ORDINATIVDAL = 4;
  private static int PFL_DISTDITRAORD_AL = 5;
  private static int PFL_DISTDITRAORD_DATADISTINTA = 6;
  private static int PFL_DISTDITRAORD_DANUMERARE = 7;
  private static int PFL_DISTDITRAORD_UFFICIO = 8;
  private static int PFL_DISTDITRAORD_ELABORA = 9;
  private static int PFL_DISTDITRAORD_ETIDISGIAEME = 10;
  private static int PFL_DISTDITRAORD_NUOVADISTIN1 = 11;

  private static int PPQRY_NEWTABLE21 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_DISTDITRAORD;

  // Definition of Global Variables
  private IDVariant DISTNUM = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE22(IMDB);
    //
    //
    Init_PQRY_NEWTABLE21(IMDB);
    Init_PQRY_NEWTABLE21_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_NEWTABLE22, 10);
    IMDB.set_TblCode(IMDBDef5.TBL_NEWTABLE22, "TBL_NEWTABLE22");
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM, "ROWNAMDIGIEM");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS, "ROWNAMNUODIS");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEDISTN, "ROWNAMEDISTN");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEDISTN,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMDADIEM, "ROWNAMDADIEM");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMDADIEM,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMORDDAL, "ROWNAMORDDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMORDDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMDATDIS,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEDANUM, "ROWNAMEDANUM");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEDANUM,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMECONTA, "ROWNAMECONTA");
    IMDB.SetFldParams(IMDBDef5.TBL_NEWTABLE22,IMDBDef5.FLD_NEWTABLE22_ROWNAMECONTA,1,999,0);
    IMDB.TblAddNew(IMDBDef5.TBL_NEWTABLE22, 0);
  }

  private static void Init_PQRY_NEWTABLE21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE21, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE21, "PQRY_NEWTABLE21");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, "ROWNAMDIGIEM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN, "ROWNAMEDISTN");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDADIEM, "ROWNAMDADIEM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDADIEM,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, "ROWNAMORDDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDANUM, "ROWNAMEDANUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDANUM,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMNUODIS, "ROWNAMNUODIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21,IMDBDef15.PQSL_NEWTABLE21_ROWNAMNUODIS,5,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE21, 0);
  }

  private static void Init_PQRY_NEWTABLE21_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_NEWTABLE21_RS, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_NEWTABLE21_RS, "PQRY_NEWTABLE21_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, "ROWNAMDIGIEM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN, "ROWNAMEDISTN");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDADIEM, "ROWNAMDADIEM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDADIEM,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, "ROWNAMORDDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDANUM, "ROWNAMEDANUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDANUM,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMNUODIS, "ROWNAMNUODIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_NEWTABLE21_RS,IMDBDef15.PQSL_NEWTABLE21_ROWNAMNUODIS,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DistintaDiTrasmissioneOrdinativi(MyWebEntryPoint w, IMDBObj imdb)
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
  public DistintaDiTrasmissioneOrdinativi()
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
    FormIdx = MyGlb.FRM_DISTDITRAORD;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D90D1CA3-43D9-4666-92E8-4224E2A5B6EC";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 352;
    DesignHeight = 290;
    set_Caption(new IDVariant("Distinta Di Trasmissione Ordinativi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 352;
    Frames[1].Height = 264;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Distinta Di Trasmissione Ordinativi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 264;
    PAN_DISTDITRAORD = new IDPanel(w, this, 1, "PAN_DISTDITRAORD");
    Frames[1].Content = PAN_DISTDITRAORD;
    PAN_DISTDITRAORD.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTDITRAORD.VS = MainFrm.VisualStyleList;
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 352-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C7CD5248-FD3F-4ACF-BA01-FF5A0CC702FC");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 680, 196, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTDITRAORD.InitStatus = 2;
    PAN_DISTDITRAORD_Init();
    PAN_DISTDITRAORD_InitFields();
    PAN_DISTDITRAORD_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_NEWTABLE22, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DISTDITRAORD_NEWTABLE21();
      }
      PAN_DISTDITRAORD.UpdatePanel(MainFrm);
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
    return (obj instanceof DistintaDiTrasmissioneOrdinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DistintaDiTrasmissioneOrdinativi.class.getName() : (Glb.ClassWithPackage(DistintaDiTrasmissioneOrdinativi.class) ? DistintaDiTrasmissioneOrdinativi.class.getName().substring(DistintaDiTrasmissioneOrdinativi.class.getPackage().getName().length() + 1) : DistintaDiTrasmissioneOrdinativi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Riempi Da Al
  // **********************************************************************
  public int RiempiDaAl ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ORDSTAMPATI = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_NUMERO = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Riempi Da Al Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ORDINATIVI_STAMPATI as N04ORDINSTAM, ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  N04 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("group by ");
      SQL.append("  A.ORDINATIVI_STAMPATI ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_ORDSTAMPATI = QV.Get("N04ORDINSTAM", IDVariant.INTEGER) ;
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.NUMERO as N03NUMERO ");
      SQL.append("from ");
      SQL.append("  N03 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CODICE = LOWER('ORD')) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_NUMERO = QV.Get("N03NUMERO", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        SQL = new StringBuffer();
        SQL.append("insert into N04 ");
        SQL.append("( ");
        SQL.append("  ESERCIZIO, ");
        SQL.append("  ORDINATIVI_STAMPATI, ");
        SQL.append("  MANDATI_STAMPATI, ");
        SQL.append("  ELENCO_MANDATI, ");
        SQL.append("  ELENCO_ORDINATIVI ");
        SQL.append(") ");
        SQL.append("values ");
        SQL.append("( ");
        SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0, ");
        SQL.append("  0 ");
        SQL.append(") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        v_ORDSTAMPATI = (new IDVariant(0));
      }
      if (v_NUMERO.compareTo(v_ORDSTAMPATI, true)>0)
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMORDDAL, 0, IDL.Add(v_ORDSTAMPATI, (new IDVariant(1))));
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEAL, 0, new IDVariant(v_NUMERO));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMORDDAL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEAL, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "RiempiDaAl", _e);
      return -1;
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

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      DISTNUM = (new IDVariant(0));
      // 
      // RISTAMPA
      // 
      if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant("E")), true))
      {
        if (IMDB.Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMECONTA, 0).equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Distinta non esistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          // 
          // +
          // 
          Stampa();
        }
      }
      // 
      // NUOVA DISTINTA------------------------------------
      // ---------------------------
      // 
      if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMNUODIS, 0).equals((new IDVariant("N")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0)))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Indicare l'intervallo degli ordinativi", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0), true)>0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Ordinativi dal maggiore di al", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS, 0)) || IDL.Year(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data Distinta non indicata o non appartenente all'esercizio del contesto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
        if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDANUM, 0).equals((new IDVariant("SI")), true))
        {
          if ((new IDVariant(Rimunera())).equals((new IDVariant(-1)), true))
          {
            Stampa();
          }
        }
        else
        {
          Stampa();
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Rimunera
  // **********************************************************************
  public boolean Rimunera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_ELENCO = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Rimunera Body
      // Procedure Body
      // 
      IDVariant v_VCOUNTMAN = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  ORD A ");
      SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   ((A.NUMERO_ORD BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNTMAN = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_VCOUNTMAN.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_DAINSERIRE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  ORD A ");
        SQL.append("where (A.ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((A.NUMERO_ORD BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   (NVL(A.UFFICIO, -1) = DECODE(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, NVL(A.UFFICIO, -1), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        SQL.append("and   ((A.NUMERO_ELENCO IS NULL)) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DAINSERIRE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_DAINSERIRE.equals((new IDVariant(0)), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Nell'intervallo indicato non sono presenti ordinativi da inserire in distinta"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return (new IDVariant(0)).booleanValue();
        }
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Ordinativi inesistenti"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        return (new IDVariant(0)).booleanValue();
      }
      v_ELENCO = (new IDVariant());
      MainFrm.Cf4armDBObject.N04NUMERAZIONE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.Lower((new IDVariant("Ordinativi"))), IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0), v_ELENCO);
      DISTNUM = new IDVariant(v_ELENCO);
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return (new IDVariant(0)).booleanValue();
      }
      else
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Elaborata Distinta n. ", IDVariant.STRING));
        MainFrm.set_AlertMessage(IDL.Add(v_MSG, IDL.ToString(DISTNUM))); 
        try
        {
          SQL = new StringBuffer();
          SQL.append("update ORD set ");
          SQL.append("  ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  NUMERO_ELENCO = " + IDL.CSql(v_ELENCO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  D_DATA_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ANNO_ORD = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((NUMERO_ORD BETWEEN " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")) ");
          SQL.append("and   (NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1) = -1 OR UFFICIO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   ((NUMERO_ELENCO IS NULL)) ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e11)
        {
          MainFrm.set_AlertMessage(new IDVariant(e11.getMessage())); 
          return (new IDVariant(0)).booleanValue();
        }
      }
      return (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "Rimunera", _e);
      return false;
    }
  }

  // **********************************************************************
  // Stampa
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DA")), IDL.ToString(((IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant()), true))?IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, 0):(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("A")), IDL.ToString(((IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant()), true))?IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0):(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("UFFICIO")), ((IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant()), true))?((IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, 0))):(new IDVariant("0"))));
      MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DISTINTA")), ((IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant("E")), true))?IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDADIEM, 0)):IDL.ToString(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS, 0))));
      MainFrm.SetParametroStampaJasper((new IDVariant("NUM_DISTINTA")), IDL.ToString(((IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant("E")), true))?IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN, 0):DISTNUM)));
      MainFrm.LanciaStampaJasper((new IDVariant("Distinta_Tras_Ord")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "Stampa", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDISTN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDADIEM, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS, 0, (new IDVariant("N")));
      RiempiDaAl();
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDATDIS, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDANUM, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEUFFIC, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      PAN_DISTDITRAORD.set_Header(Glb.OBJ_GROUP,GRP_DISTDITRAORD_NUOVADISTINT,(new IDVariant("")).stringValue()); 
      IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMECONTA, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "LoadEvent", _e);
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
      DISTNUM = (new IDVariant(0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Distinta Di Trasmissione Ordinativi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_DISTDITRAORD_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinta Di Trasmissione Ordinativi On Updating Row Event Body
      // Procedure Body
      // 
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_DISTINTAN)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDISTN, 0, IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN, 0));
      }
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_ORDINATIVDAL)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMORDDAL, 0, IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMORDDAL, 0));
      }
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_AL)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEAL, 0, IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEAL, 0));
      }
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_DATADISTINTA)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDATDIS, 0, IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDATDIS, 0));
      }
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_DANUMERARE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDANUM, 0, IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDANUM, 0));
      }
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_UFFICIO)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEUFFIC, 0, IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEUFFIC, 0));
      }
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_DISTIGIAEMES)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS, 0, (new IDVariant()));
      }
      if ((Column.equals((new IDVariant(PFL_DISTDITRAORD_NUOVADISTINT)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS, 0, (new IDVariant("N")));
      }
      // if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant("E")), true))
      // {
        // IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS, 0, (new IDVariant()));
      // }
      // if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMNUODIS, 0).equals((new IDVariant("N")), true))
      // {
        // IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM, 0, (new IDVariant()));
      // }
      PAN_DISTDITRAORD.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "DistintaDiTrasmissioneOrdinativiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Distinta Di Trasmissione Ordinativi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTDITRAORD_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISTDITRAORD);
      // 
      // Distinta Di Trasmissione Ordinativi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMDIGIEM, 0).equals((new IDVariant("E")), true))
      {
        PAN_DISTDITRAORD.SetFlags (Glb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_DISTDITRAORD.SetFlags (Glb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMNUODIS, 0).equals((new IDVariant("N")), true))
      {
        PAN_DISTDITRAORD.SetFlags (Glb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
        PAN_DISTDITRAORD.SetFlags (Glb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "DistintaDiTrasmissioneOrdinativiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Distinta Di Trasmissione Ordinativi Distinta N Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_DISTDITRAORD_DISTINTAN_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Distinta Di Trasmissione Ordinativi Distinta N Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN, 0))))
      {
        IDVariant v_DDATAELENCO = new IDVariant(0,IDVariant.DATETIME);
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  MIN(A.D_DATA_ELENCO) as MINORDDDATEL, ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  ORD A ");
        SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_NEWTABLE21, IMDBDef15.PQSL_NEWTABLE21_ROWNAMEDISTN, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DDATAELENCO = QV.Get("MINORDDDATEL", IDVariant.DATETIME) ;
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDADIEM, 0, new IDVariant(v_DDATAELENCO));
        IMDB.set_Value(IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMECONTA, 0, new IDVariant(v_CONTATORE));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DistintaDiTrasmissioneOrdinativi", "DistintaDiTrasmissioneOrdinativiDistintaNValidateEvent", _e);
    }
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void DISTDITRAORD_NEWTABLE21() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_NEWTABLE21_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_NEWTABLE22, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_NEWTABLE22, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_NEWTABLE21_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_NEWTABLE21_RS, 0, IMDBDef5.TBL_NEWTABLE22, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 0, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 1, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDISTN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 2, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDADIEM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 3, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMORDDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 4, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 5, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMDATDIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 6, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDANUM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 7, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_NEWTABLE21_RS, 8, 0, IMDBDef5.TBL_NEWTABLE22, IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_NEWTABLE22, 0);
      if (IMDB.Eof(IMDBDef5.TBL_NEWTABLE22, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_NEWTABLE22, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_NEWTABLE21_RS, 0);
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
  private void PAN_DISTDITRAORD_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTDITRAORD, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTDITRAORD_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTDITRAORD, Cancel);
    // Stub
  }

  private void PAN_DISTDITRAORD_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DISTDITRAORD_ELABORA)
    {
      this.IdxPanelActived = this.PAN_DISTDITRAORD.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DISTDITRAORD_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_DISTDITRAORD_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_DISTDITRAORD_DISTINTAN)
      {
        PFL_DISTDITRAORD_DISTINTAN_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_DISTDITRAORD_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTDITRAORD_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISTDITRAORD_Init()
  {

    PAN_DISTDITRAORD.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTDITRAORD.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, "00919BC2-282D-4EAB-8946-946510A37E0E");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, "Nuova Distinta");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, MyGlb.VIS_GROUPSTYLE);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_LIST, 304, -9999, 296, 16, 0, 0);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_FORM, 8, 83, 308, 97, 0, 0);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, 0, 82);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, 1, 13);
    PAN_DISTDITRAORD.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, 0, 4);
    PAN_DISTDITRAORD.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, 1, 4);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_GROUP, GRP_DISTDITRAORD_NUOVADISTINT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DISTDITRAORD.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, "2D0848C9-CF5A-456B-A251-0B535E475A8C");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, "Distinta Già Emessa");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, "A0FF5BB5-F496-481A-9650-0288373C337B");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, "Distinta N.");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, "4AB39C42-C4E8-4818-9255-579369CCAA59");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, "Data Distinta Emessa");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, "992FC7DB-5E17-4611-A607-5039DB5812E8");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, "Nuova Distinta");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, "A8D96E98-17E3-474E-A0C6-D6C37B53EE87");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, "Ordinativi dal");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, "A06AB520-7E83-4C8B-BD59-74FF067BD2C3");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, "Al");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, "289DD9C2-9A4C-4B88-9940-7CBD05E35363");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, "Data Distinta");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, "1B83C715-3561-4B13-B0C6-D2835436562A");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, "Da Numerare");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.VIS_CHECKSTYLE);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, "B62ADC26-6829-4DFB-8050-0E0F5F325576");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, "Ufficio");
    PAN_DISTDITRAORD.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, "");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, "ADAF39E1-179F-4494-8B87-2F36A4F57408");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, "Elabora");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_DISTDITRAORD.SetImage(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, 0, "button1.gif", false);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, "4B59444F-D9D7-4449-8AC9-E8066EBB0665");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, "Distinta già emessa");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, MyGlb.VIS_VUOGRAALILEF);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DISTDITRAORD.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, "BB425F64-C5EE-4B48-85F8-1A2E8E84424D");
    PAN_DISTDITRAORD.set_Header(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, "Nuova Distinta");
    PAN_DISTDITRAORD.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, MyGlb.VIS_VUOGRAALILEF);
    PAN_DISTDITRAORD.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_DISTDITRAORD_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_LIST, 68);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_LIST, "Distinta Già Emessa");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_FORM, 8, 8, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_FORM, 128);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTIGIAEMES, MyGlb.PANEL_FORM, "Distinta Già Emessa");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_DISTIGIAEMES, -1, -1);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_DISTIGIAEMES, PPQRY_NEWTABLE21, "A.ROWNAMDIGIEM", "ROWNAMDIGIEM", 5, 1, 0, -13997);
    PAN_DISTDITRAORD.SetValueListItem(PFL_DISTDITRAORD_DISTIGIAEMES, (new IDVariant("E")), "Distinta già emessa", "", "", -1);
    PAN_DISTDITRAORD.SetValueListItem(PFL_DISTDITRAORD_DISTIGIAEMES, (new IDVariant()), "Fake", "", "", -1);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_LIST, 120, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_LIST, 56);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_LIST, "Dist. N");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_FORM, 12, 32, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_FORM, 68);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DISTINTAN, MyGlb.PANEL_FORM, "Distinta N.");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_DISTINTAN, -1, -1);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_DISTINTAN, PPQRY_NEWTABLE21, "A.ROWNAMEDISTN", "ROWNAMEDISTN", 1, 5, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_LIST, 160, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_LIST, 112);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_LIST, "Data Distinta Emessa");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_FORM, 132, 32, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_FORM, 128);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTEMES, MyGlb.PANEL_FORM, "Data Distinta Emessa");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_DATADISTEMES, -1, -1);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_DATADISTEMES, PPQRY_NEWTABLE21, "A.ROWNAMDADIEM", "ROWNAMDADIEM", 6, 14, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_LIST, 80);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_LIST, "Nuova Distinta");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_FORM, 8, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_FORM, 80);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTINT, MyGlb.PANEL_FORM, "Nuov. Dist.");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_NUOVADISTINT, -1, -1);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_NUOVADISTINT, PPQRY_NEWTABLE21, "A.ROWNAMNUODIS", "ROWNAMNUODIS", 5, 1, 0, -13997);
    PAN_DISTDITRAORD.SetValueListItem(PFL_DISTDITRAORD_NUOVADISTINT, (new IDVariant("N")), "Nuova Distinta", "", "", -1);
    PAN_DISTDITRAORD.SetValueListItem(PFL_DISTDITRAORD_NUOVADISTINT, (new IDVariant()), "Fake", "", "", -1);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_LIST, 304, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_LIST, 72);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_LIST, "Or. d.");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_FORM, 12, 108, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_FORM, 84);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ORDINATIVDAL, MyGlb.PANEL_FORM, "Ordinativi dal");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_ORDINATIVDAL, -1, GRP_DISTDITRAORD_NUOVADISTINT);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_ORDINATIVDAL, PPQRY_NEWTABLE21, "A.ROWNAMORDDAL", "ROWNAMORDDAL", 1, 5, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_LIST, 344, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_LIST, 20);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_LIST, "Al");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_FORM, 240, 108, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_FORM, 20);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_AL, MyGlb.PANEL_FORM, "Al");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_AL, -1, GRP_DISTDITRAORD_NUOVADISTINT);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_AL, PPQRY_NEWTABLE21, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_LIST, 384, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_LIST, 72);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_LIST, "Data Distinta");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_FORM, 12, 132, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_FORM, 84);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DATADISTINTA, MyGlb.PANEL_FORM, "Data Distinta");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_DATADISTINTA, -1, GRP_DISTDITRAORD_NUOVADISTINT);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_DATADISTINTA, PPQRY_NEWTABLE21, "A.ROWNAMDATDIS", "ROWNAMDATDIS", 6, 14, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_LIST, 496, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_LIST, 72);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_LIST, "D. N.");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_FORM, 204, 132, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_FORM, 84);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_DANUMERARE, MyGlb.PANEL_FORM, "Da Numerare");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_DANUMERARE, -1, GRP_DISTDITRAORD_NUOVADISTINT);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_DANUMERARE, PPQRY_NEWTABLE21, "A.ROWNAMEDANUM", "ROWNAMEDANUM", 5, 2, 0, -13997);
    PAN_DISTDITRAORD.SetValueListItem(PFL_DISTDITRAORD_DANUMERARE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DISTDITRAORD.SetValueListItem(PFL_DISTDITRAORD_DANUMERARE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_LIST, 536, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_FORM, 52, 156, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_UFFICIO, -1, GRP_DISTDITRAORD_NUOVADISTINT);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_UFFICIO, PPQRY_NEWTABLE21, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, MyGlb.PANEL_LIST, 152, 188, 76, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, MyGlb.PANEL_FORM, 236, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_ELABORA, -1, -1);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, MyGlb.PANEL_LIST, 44, 16, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, MyGlb.PANEL_LIST, 0);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, MyGlb.PANEL_FORM, 32, 8, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, MyGlb.PANEL_FORM, 0);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_ETIDISGIAEME, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_ETIDISGIAEME, -1, -1);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_ETIDISGIAEME, -1, "", "ETIDISGIAEME", 0, 0, 0, -13997);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, MyGlb.PANEL_LIST, 52, 24, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, MyGlb.PANEL_LIST, 0);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, MyGlb.PANEL_LIST, 1);
    PAN_DISTDITRAORD.SetRect(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, MyGlb.PANEL_FORM, 32, 60, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTDITRAORD.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, MyGlb.PANEL_FORM, 0);
    PAN_DISTDITRAORD.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTDITRAORD_NUOVADISTIN1, MyGlb.PANEL_FORM, 1);
    PAN_DISTDITRAORD.SetFieldPage(PFL_DISTDITRAORD_NUOVADISTIN1, -1, -1);
    PAN_DISTDITRAORD.SetFieldPanel(PFL_DISTDITRAORD_NUOVADISTIN1, -1, "", "NUOVADISTIN1", 0, 0, 0, -13997);
  }

  private void PAN_DISTDITRAORD_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTDITRAORD.SetSize(MyGlb.OBJ_QUERY, 2);
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
    PAN_DISTDITRAORD.SetQuery(PPQRY_T53, 0, SQL, PFL_DISTDITRAORD_UFFICIO, "");
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
    PAN_DISTDITRAORD.SetQuery(PPQRY_T53, 1, SQL, PFL_DISTDITRAORD_UFFICIO, "");
    PAN_DISTDITRAORD.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTDITRAORD.SetIMDB(IMDB, "PQRY_NEWTABLE21", true);
    PAN_DISTDITRAORD.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_DISTDITRAORD.SetQueryIMDB(PPQRY_NEWTABLE21, IMDBDef15.PQRY_NEWTABLE21_RS, IMDBDef5.TBL_NEWTABLE22);
    JustLoaded = true;
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_DISTIGIAEMES, IMDBDef5.FLD_NEWTABLE22_ROWNAMDIGIEM);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_DISTINTAN, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDISTN);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_DATADISTEMES, IMDBDef5.FLD_NEWTABLE22_ROWNAMDADIEM);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_NUOVADISTINT, IMDBDef5.FLD_NEWTABLE22_ROWNAMNUODIS);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_ORDINATIVDAL, IMDBDef5.FLD_NEWTABLE22_ROWNAMORDDAL);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_AL, IMDBDef5.FLD_NEWTABLE22_ROWNAMEAL);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_DATADISTINTA, IMDBDef5.FLD_NEWTABLE22_ROWNAMDATDIS);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_DANUMERARE, IMDBDef5.FLD_NEWTABLE22_ROWNAMEDANUM);
    PAN_DISTDITRAORD.SetFieldPrimaryIndex(PFL_DISTDITRAORD_UFFICIO, IMDBDef5.FLD_NEWTABLE22_ROWNAMEUFFIC);
    PAN_DISTDITRAORD.SetMasterTable(0, "NEWTABLE22");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTDITRAORD.Status() == 2)
    {
      int oldListQBE = PAN_DISTDITRAORD.iUseListQBE;
      PAN_DISTDITRAORD.iUseListQBE = 0;
      PAN_DISTDITRAORD.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTDITRAORD.PanelCommand(Glb.PCM_FIND);
      PAN_DISTDITRAORD.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISTDITRAORD) PAN_DISTDITRAORD_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTDITRAORD) PAN_DISTDITRAORD_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISTDITRAORD) PAN_DISTDITRAORD_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISTDITRAORD) PAN_DISTDITRAORD_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISTDITRAORD) PAN_DISTDITRAORD_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
