// **********************************************
// Stampa Ordinativi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StampaOrdinativi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PAR_ORDINATIVI = 0;

  private static int PFL_PAR_DAL = 0;
  private static int PFL_PAR_AL = 1;
  private static int PFL_PAR_NEWPANELLABE = 2;
  private static int PFL_PAR_NEWPANELABE1 = 3;
  private static int PFL_PAR_UFFICIO = 4;
  private static int PFL_PAR_CODICEDEBITO = 5;
  private static int PFL_PAR_CAUSALE = 6;
  private static int PFL_PAR_ELABORA = 7;

  private static int PPQRY_PAR92 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_PAR;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR60(IMDB);
    //
    //
    Init_PQRY_PAR92(IMDB);
    Init_PQRY_PAR92_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR60(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PAR60, 5);
    IMDB.set_TblCode(IMDBDef5.TBL_PAR60, "TBL_PAR60");
    IMDB.set_FldCode(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMORDDAL, "ROWNAMORDDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMORDDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMCODDEB,5,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PAR60,IMDBDef5.FLD_PAR60_ROWNAMECAUSA,5,1,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PAR60, 0);
  }

  private static void Init_PQRY_PAR92(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR92, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR92, "PQRY_PAR92");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMORDDAL, "ROWNAMORDDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMORDDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMCODDEB,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92,IMDBDef15.PQSL_PAR92_ROWNAMECAUSA,5,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR92, 0);
  }

  private static void Init_PQRY_PAR92_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR92_RS, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR92_RS, "PQRY_PAR92_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMORDDAL, "ROWNAMORDDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMORDDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMCODDEB,5,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR92_RS,IMDBDef15.PQSL_PAR92_ROWNAMECAUSA,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StampaOrdinativi(MyWebEntryPoint w, IMDBObj imdb)
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
  public StampaOrdinativi()
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
    FormIdx = MyGlb.FRM_STAMPAORDINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DDE5F5CD-1D03-4F32-815A-8B0FDF32E475";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 372;
    DesignHeight = 206;
    set_Caption(new IDVariant("Stampa Ordinativi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 372;
    Frames[1].Height = 180;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Par";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 180;
    PAN_PAR = new IDPanel(w, this, 1, "PAN_PAR");
    Frames[1].Content = PAN_PAR;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 372-MyGlb.PAN_OFFS_X, 180-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "15B084CE-EC75-40A0-BD8B-B060B19B25F1");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 248, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 2;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PAR60, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        STAMPAORDINA_PAR92();
      }
      PAN_PAR.UpdatePanel(MainFrm);
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
    return (obj instanceof StampaOrdinativi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StampaOrdinativi.class.getName() : (Glb.ClassWithPackage(StampaOrdinativi.class) ? StampaOrdinativi.class.getName().substring(StampaOrdinativi.class.getPackage().getName().length() + 1) : StampaOrdinativi.class.getName()));
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
    IDVariant v_RES = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMORDDAL, 0).compareTo(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMEAL, 0), true)>0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Ordinativi dal maggiore di al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
        return 0;
      }
      if (!(MainFrm.SIOPEATTIARM.booleanValue()))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  CONTROLLO_CGE(NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMORDDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0),NVL(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMEAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", 0),DECODE(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", -1, to_number(NULL), " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ")," + IDL.CSql(MainFrm.DATAINIZSIOP, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CDCCNVRNDSOP ");
        SQL.append("from ");
        SQL.append("  DUAL A ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_RES = QV.Get("CDCCNVRNDSOP", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_RES.equals((new IDVariant(1)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Sono presenti ordinativi senza codice gestionale o con codice gestionale errato o scaduto: eseguire la funzione Controllo Codici Gestionali", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DAL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMORDDAL, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("AL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMEAL, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("UFFICIO")), ((IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMEUFFIC, 0))));
      MainFrm.SetParametroStampaJasper((new IDVariant("DEBITORE")), IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMCODDEB, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("CAUSALE")), IMDB.Value(IMDBDef15.PQRY_PAR92, IMDBDef15.PQSL_PAR92_ROWNAMECAUSA, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("DATA_INIZIO_SIOPE")), IDL.ToString(IDL.NullValue(MainFrm.DATAINIZSIOP,(new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME)))));
      MainFrm.LanciaStampaJasper((new IDVariant("Stampa_ordinativi")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaOrdinativi", "Elabora", _e);
      return -1;
    }
  }

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
        IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMORDDAL, 0, IDL.Add(v_ORDSTAMPATI, (new IDVariant(1))));
        IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMEAL, 0, new IDVariant(v_NUMERO));
      }
      else
      {
        IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMORDDAL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMEAL, 0, (new IDVariant()));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaOrdinativi", "RiempiDaAl", _e);
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
      RiempiDaAl();
      // 
      // Recupero ufficio dalle impostazioni
      // 
      // 
      IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0))))
      {
        IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMEUFFIC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      }
      IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMCODDEB, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMECAUSA, 0, (new IDVariant("N")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StampaOrdinativi", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void STAMPAORDINA_PAR92() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR92_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PAR60, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PAR60, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR92_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR92_RS, 0, IMDBDef5.TBL_PAR60, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR92_RS, 0, 0, IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMORDDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR92_RS, 1, 0, IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR92_RS, 2, 0, IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR92_RS, 3, 0, IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMCODDEB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR92_RS, 4, 0, IMDBDef5.TBL_PAR60, IMDBDef5.FLD_PAR60_ROWNAMECAUSA, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PAR60, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PAR60, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PAR60, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR92_RS, 0);
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
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PAR);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PAR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, "00959B13-E4FC-43D1-98A2-109A5EC6ED3B");
    PAN_PAR.set_Header(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, "Ordinativi");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, MyGlb.PANEL_FORM, 12, 7, 308, 49, 0, 0);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, 0, 55);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, 1, 13);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, 0, 4);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, 1, 4);
    PAN_PAR.SetFlags(MyGlb.OBJ_GROUP, GRP_PAR_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DAL, "CC7962E1-6EE8-4EBC-BB9A-4D94572B7704");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DAL, "Dal");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DAL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_AL, "7D74D7A7-5786-442A-9085-6B739E3BC270");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_AL, "Al");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_AL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, "63AE1898-18D1-4E35-AAA0-6C0D36116E97");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, 0 | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, "CE0A2CFF-E445-4287-B3A0-F2345105DFED");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, 0 | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, "FBDD20FD-D1C5-413E-A015-15A3AC09A63B");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, "Ufficio");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, "FFD46121-147E-4F57-9C28-EFF6453D8933");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, "Codice Debitore");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, "1EFD0CB8-1988-46E5-8ADF-3CC9E228B444");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, "Causale");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "C3537063-1B01-4C17-8859-A07073AD092F");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "Elabora");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0, "button1.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_LIST, 72);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_FORM, 36, 32, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PAR.SetFieldPage(PFL_PAR_DAL, -1, GRP_PAR_ORDINATIVI);
    PAN_PAR.SetFieldPanel(PFL_PAR_DAL, PPQRY_PAR92, "A.ROWNAMORDDAL", "ROWNAMORDDAL", 1, 5, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 20);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 168, 32, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 20);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PAR.SetFieldPage(PFL_PAR_AL, -1, GRP_PAR_ORDINATIVI);
    PAN_PAR.SetFieldPanel(PFL_PAR_AL, PPQRY_PAR92, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 132, 12, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 304, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_NEWPANELLABE, -1, GRP_PAR_ORDINATIVI);
    PAN_PAR.SetFieldPanel(PFL_PAR_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, MyGlb.PANEL_LIST, 140, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, MyGlb.PANEL_FORM, 16, 40, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_NEWPANELABE1, -1, GRP_PAR_ORDINATIVI);
    PAN_PAR.SetFieldPanel(PFL_PAR_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_FORM, 16, 64, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PAR.SetFieldPage(PFL_PAR_UFFICIO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_UFFICIO, PPQRY_PAR92, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_LIST, 84);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_LIST, "Cod. Debit.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_FORM, 68, 88, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_FORM, 100);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CODICEDEBITO, MyGlb.PANEL_FORM, "Codice Debitore");
    PAN_PAR.SetFieldPage(PFL_PAR_CODICEDEBITO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_CODICEDEBITO, PPQRY_PAR92, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_CODICEDEBITO, (new IDVariant("S")), "S", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_CODICEDEBITO, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_LIST, "Causale");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_FORM, 232, 88, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_FORM, 64);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PAR.SetFieldPage(PFL_PAR_CAUSALE, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_CAUSALE, PPQRY_PAR92, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_CAUSALE, (new IDVariant("S")), "S", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_CAUSALE, (new IDVariant("N")), "N", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 208, 124, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 240, 116, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_ELABORA, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 2);
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
    PAN_PAR.SetQuery(PPQRY_T53, 0, SQL, PFL_PAR_UFFICIO, "");
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
    PAN_PAR.SetQuery(PPQRY_T53, 1, SQL, PFL_PAR_UFFICIO, "");
    PAN_PAR.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR92", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR92, IMDBDef15.PQRY_PAR92_RS, IMDBDef5.TBL_PAR60);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DAL, IMDBDef5.FLD_PAR60_ROWNAMORDDAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_AL, IMDBDef5.FLD_PAR60_ROWNAMEAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_UFFICIO, IMDBDef5.FLD_PAR60_ROWNAMEUFFIC);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CODICEDEBITO, IMDBDef5.FLD_PAR60_ROWNAMCODDEB);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CAUSALE, IMDBDef5.FLD_PAR60_ROWNAMECAUSA);
    PAN_PAR.SetMasterTable(0, "PAR60");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
