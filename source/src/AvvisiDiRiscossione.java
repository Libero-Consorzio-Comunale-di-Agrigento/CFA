// **********************************************
// Avvisi Di Riscossione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AvvisiDiRiscossione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_AVVISDIRISCO_ORDINATIVI = 0;
  private static int GRP_AVVISDIRISCO_STAMPA = 1;

  private static int PFL_AVVISDIRISCO_DAL = 0;
  private static int PFL_AVVISDIRISCO_AL = 1;
  private static int PFL_AVVISDIRISCO_NEWPANELLAB1 = 2;
  private static int PFL_AVVISDIRISCO_NEWPANELABE2 = 3;
  private static int PFL_AVVISDIRISCO_CODICEDEBITO = 4;
  private static int PFL_AVVISDIRISCO_UFFICIO = 5;
  private static int PFL_AVVISDIRISCO_DATAAVVISI = 6;
  private static int PFL_AVVISDIRISCO_ELABORA = 7;
  private static int PFL_AVVISDIRISCO_STAMPA = 8;
  private static int PFL_AVVISDIRISCO_NEWPANELLABE = 9;
  private static int PFL_AVVISDIRISCO_NEWPANELABE1 = 10;
  private static int PFL_AVVISDIRISCO_BENDEBITORE = 11;
  private static int PFL_AVVISDIRISCO_SCEGBENFBUTT = 12;
  private static int PFL_AVVISDIRISCO_INFOBENFBUTT = 13;

  private static int PPQRY_AVVISDIRISC1 = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_T53 = 2;


  IDPanel PAN_AVVISDIRISCO;

  // Definition of Global Variables
  private IDVariant IMMAGINE = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_AVVISDIRISCO(IMDB);
    //
    //
    Init_PQRY_AVVISDIRISC1(IMDB);
    Init_PQRY_AVVISDIRISC1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_AVVISDIRISCO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_AVVISDIRISCO, 6);
    IMDB.set_TblCode(IMDBDef5.TBL_AVVISDIRISCO, "TBL_AVVISDIRISCO");
    IMDB.set_FldCode(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMDATAVV, "ROWNAMDATAVV");
    IMDB.SetFldParams(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMDATAVV,6,14,0);
    IMDB.set_FldCode(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMESTAMP,5,2,0);
    IMDB.set_FldCode(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef5.TBL_AVVISDIRISCO,IMDBDef5.FLD_AVVISDIRISCO_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef5.TBL_AVVISDIRISCO, 0);
  }

  private static void Init_PQRY_AVVISDIRISC1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_AVVISDIRISC1, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_AVVISDIRISC1, "PQRY_AVVISDIRISC1");
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMDATAVV, "ROWNAMDATAVV");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMDATAVV,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMESTAMP,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_AVVISDIRISC1, 0);
  }

  private static void Init_PQRY_AVVISDIRISC1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_AVVISDIRISC1_RS, 6);
    IMDB.set_TblCode(IMDBDef15.PQRY_AVVISDIRISC1_RS, "PQRY_AVVISDIRISC1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMDATAVV, "ROWNAMDATAVV");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMDATAVV,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMESTAMP, "ROWNAMESTAMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMESTAMP,5,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_AVVISDIRISC1_RS,IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AvvisiDiRiscossione(MyWebEntryPoint w, IMDBObj imdb)
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
  public AvvisiDiRiscossione()
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
    FormIdx = MyGlb.FRM_AVVISDIRISCO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E69E99EB-E5AC-46D0-AD09-44484F5C6FB3";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 440;
    DesignHeight = 298;
    set_Caption(new IDVariant("Avvisi Di Riscossione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 440;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Avvisi Di Riscossione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_AVVISDIRISCO = new IDPanel(w, this, 1, "PAN_AVVISDIRISCO");
    Frames[1].Content = PAN_AVVISDIRISCO;
    PAN_AVVISDIRISCO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_AVVISDIRISCO.VS = MainFrm.VisualStyleList;
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 440-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1E5737F5-DA36-413E-A044-F88142462193");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 748, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_AVVISDIRISCO.InitStatus = 2;
    PAN_AVVISDIRISCO_Init();
    PAN_AVVISDIRISCO_InitFields();
    PAN_AVVISDIRISCO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_AVVISDIRISCO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        AVVISDIRISCO_AVVISDIRISC1();
      }
      PAN_AVVISDIRISCO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_AVVISDIRISCO.FrIndex)
    {
      if (IdxFieldActived ==PFL_AVVISDIRISCO_SCEGBENFBUTT) {
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
    return (obj instanceof AvvisiDiRiscossione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AvvisiDiRiscossione.class.getName() : (Glb.ClassWithPackage(AvvisiDiRiscossione.class) ? AvvisiDiRiscossione.class.getName().substring(AvvisiDiRiscossione.class.getPackage().getName().length() + 1) : AvvisiDiRiscossione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Info Soggetti
  // **********************************************************************
  public int InfoSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Soggetti Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMECODI1, 0, IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, 0));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMRAGSOC, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_IMDB4, IMDBDef2.FLD_IMDB4_ROWNAMEINFO, 0, (new IDVariant(1)));
        MainFrm.Show(MyGlb.FRM_SOGGETTO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "InfoSoggetti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Seleziona Soggetti
  // **********************************************************************
  public int SelezionaSoggetti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Seleziona Soggetti Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "SelezionaSoggetti", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEDAL, 0, IDL.Add(v_ORDSTAMPATI, (new IDVariant(1))));
      IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEAL, 0, new IDVariant(v_NUMERO));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "RiempiDaAl", _e);
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
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as T67DESCRIZIO, ");
      SQL.append("  A.IMMAGINE as T67IMMAGINE, ");
      SQL.append("  A.BITMAP as T67BITMAP, ");
      SQL.append("  A.ESTENSIONE_FILE as T67ESTENFILE ");
      SQL.append("from ");
      SQL.append("  T67 A ");
      SQL.append("where (A.CODICE = 'AVV') ");
      SQL.append("and   (A.PROGRESSIVO = 1) ");
      C2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C2.EOF()) C2.MoveNext();
      while (!C2.EOF())
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMESTAMP2, IMDBDef5.FLD_PARAMESTAMP2_STAMPAFIRMA1, 0, new IDVariant(C2.Get("T67DESCRIZIO")));
        if (VBFiles.FileLen(C2.Get("T67BITMAP")).compareTo((new IDVariant(0)), true)>0)
        {
          Glb.CopyFile(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("\\"))), (new IDVariant("images"))), (new IDVariant("\\"))), (new IDVariant("firma"))), (new IDVariant("AVV"))), (new IDVariant("."))), VBFiles.FileExt(C2.Get("T67BITMAP"))).stringValue(), C2.Get("T67BITMAP").stringValue()); 
          IDVariant v_ESTE = null;
          v_ESTE = VBFiles.FileExt(C2.Get("T67BITMAP"));
          if (IDL.IsNull(C2.Get("T67ESTENFILE")))
          {
            SQL = new StringBuffer();
            SQL.append("update T67 set ");
            SQL.append("  ESTENSIONE_FILE = " + IDL.CSql(v_ESTE, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  CODICE = 'AVV', ");
            SQL.append("  PROGRESSIVO = 1 ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
        }
        C2.MoveNext();
      }
      C2.Close();
      MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("ORD_DA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEDAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("ORD_A")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("UFFICIO")), ((IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEUFFIC, 0).equals((new IDVariant(-1))))?(new IDVariant()):IDL.ToString(IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMEUFFIC, 0))));
      MainFrm.SetParametroStampaJasper((new IDVariant("CODICE")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), IDL.ToString(IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMDATAVV, 0)));
      if (IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMESTAMP, 0).equals((new IDVariant("A")), true))
      {
        MainFrm.LanciaStampaJasper((new IDVariant("Ord_Riscossione_Stampa")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        MainFrm.LanciaStampaJasper((new IDVariant("ord_avvisi_riepilogo")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEUFFIC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMDATAVV, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMESTAMP, 0, (new IDVariant("A")));
      IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMCODDEB, 0, (new IDVariant()));
      RiempiDaAl();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "EndModalEvent", _e);
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
      UNLOADEVENT_AVVDIRISDERO();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Avvisi Di Riscossione: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_AVVDIRISDERO() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMDATAVV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMESTAMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMCODDEB, 0, new IDVariant());
  }

  // **********************************************************************
  // Avvisi Di Riscossione On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_AVVISDIRISCO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_AVVISDIRISCO);
      // 
      // Avvisi Di Riscossione On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_AVVISDIRISC1, IMDBDef15.PQSL_AVVISDIRISC1_ROWNAMCODDEB, 0))))
      {
        PAN_AVVISDIRISCO.SetFlags (Glb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_AVVISDIRISCO.SetFlags (Glb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "AvvisiDiRiscossioneOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Avvisi Di Riscossione On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_AVVISDIRISCO_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Avvisi Di Riscossione On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_AVVISDIRISCO_BENDEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_AVVISDIRISCO.FieldText(PFL_AVVISDIRISCO_BENDEBITORE))), IDL.Today(), (new IDVariant("ORD")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AvvisiDiRiscossione", "AvvisiDiRiscossioneOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Avvisi Di Riscossione
  // Primary record source for panel data
  // **********************************************************************
  private void AVVISDIRISCO_AVVISDIRISC1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_AVVISDIRISC1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_AVVISDIRISCO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_AVVISDIRISCO, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_AVVISDIRISC1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_AVVISDIRISC1_RS, 0, IMDBDef5.TBL_AVVISDIRISCO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_AVVISDIRISC1_RS, 0, 0, IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_AVVISDIRISC1_RS, 1, 0, IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_AVVISDIRISC1_RS, 2, 0, IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_AVVISDIRISC1_RS, 3, 0, IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMDATAVV, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_AVVISDIRISC1_RS, 4, 0, IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMESTAMP, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_AVVISDIRISC1_RS, 5, 0, IMDBDef5.TBL_AVVISDIRISCO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMCODDEB, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_AVVISDIRISCO, 0);
      if (IMDB.Eof(IMDBDef5.TBL_AVVISDIRISCO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_AVVISDIRISCO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_AVVISDIRISC1_RS, 0);
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
  private void PAN_AVVISDIRISCO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_AVVISDIRISCO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_AVVISDIRISCO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_AVVISDIRISCO, Cancel);
    // Stub
  }

  private void PAN_AVVISDIRISCO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_AVVISDIRISCO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_AVVISDIRISCO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AVVISDIRISCO_SCEGBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_AVVISDIRISCO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezionaSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_AVVISDIRISCO_INFOBENFBUTT)
    {
      this.IdxPanelActived = this.PAN_AVVISDIRISCO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoSoggetti();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_AVVISDIRISCO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_AVVISDIRISCO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_AVVISDIRISCO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_AVVISDIRISCO_Init()
  {

    PAN_AVVISDIRISCO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_AVVISDIRISCO.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, "2B48956A-B062-464A-AB21-DB20077D6CD2");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, "Ordinativi");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, MyGlb.VIS_GROUPSTYLE);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, MyGlb.PANEL_LIST, 0, -9999, 80, 16, 0, 0);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, MyGlb.PANEL_FORM, 12, 7, 384, 57, 0, 0);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, 0, 55);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, 1, 13);
    PAN_AVVISDIRISCO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, 0, 4);
    PAN_AVVISDIRISCO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, 1, 4);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_ORDINATIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, "BD66AB7E-43D0-4ACD-AB0A-9064D27CDDFF");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, "Stampa");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, MyGlb.PANEL_LIST, 248, -9999, 96, 16, 0, 0);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, MyGlb.PANEL_FORM, 12, 159, 384, 49, 0, 0);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, 0, 44);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, 1, 13);
    PAN_AVVISDIRISCO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, 0, 4);
    PAN_AVVISDIRISCO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, 1, 4);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_GROUP, GRP_AVVISDIRISCO_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_AVVISDIRISCO.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, "6DC6C419-A776-4A29-AA83-4C070D8908F5");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, "Dal");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, "7065B5FB-F59D-456B-B2E0-412A2B126C85");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, "Al");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, "7152B37A-284C-4635-B3E3-A1C315FC9747");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, "30D3F72D-515D-484D-83FE-EC4B17DD688D");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, 0 | MyGlb.FLD_INFORM, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, "0885243C-81D5-4CBE-A952-C6740EFB54A1");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, "Codice Debitore");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, "BA6D6033-3CD0-4972-8EFA-F79813F4FC8D");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, "Ufficio");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, "E7C9EE8C-5829-4E4C-B854-39271267049D");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, "Data Avvisi");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.VIS_NORMALFIELDS);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, "61E85344-56FF-48A8-BBAD-9A5296ABC5A1");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, "Elabora");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_AVVISDIRISCO.SetImage(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, 0, "button1.gif", false);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, "FD092AA7-63AE-4C6E-8E32-F92A653C7112");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, "Stampa");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, "B07D13FE-08BB-4EDA-8012-FB80CA9EF3FF");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, 0 | MyGlb.FLD_INFORM, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, "72FF8117-5D86-460D-891A-C62705070E65");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, "FA762B4B-12E1-4FBC-8DFF-DCBF29E5F77E");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, "Debitore");
    PAN_AVVISDIRISCO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, "663E0949-CF10-4D71-A126-C120B87406DE");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AVVISDIRISCO.SetImage(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, 0, "wsearch1.gif", false);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_AVVISDIRISCO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, "D33F45B6-32C2-4C9D-B0F6-E87211DC2823");
    PAN_AVVISDIRISCO.set_Header(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, "");
    PAN_AVVISDIRISCO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_AVVISDIRISCO.SetImage(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, 0, "info.gif", false);
    PAN_AVVISDIRISCO.SetFlags(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_AVVISDIRISCO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_LIST, 24);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_FORM, 48, 40, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_FORM, 28);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_DAL, -1, GRP_AVVISDIRISCO_ORDINATIVI);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_DAL, PPQRY_AVVISDIRISC1, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 5, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_LIST, 20);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_LIST, "Al");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_FORM, 216, 40, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_FORM, 20);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_AL, MyGlb.PANEL_FORM, "Al");
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_AL, -1, GRP_AVVISDIRISCO_ORDINATIVI);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_AL, PPQRY_AVVISDIRISC1, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, MyGlb.PANEL_LIST, 144, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, MyGlb.PANEL_FORM, 380, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_NEWPANELLAB1, -1, GRP_AVVISDIRISCO_ORDINATIVI);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, MyGlb.PANEL_LIST, 152, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, MyGlb.PANEL_FORM, 16, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_NEWPANELABE2, -1, GRP_AVVISDIRISCO_ORDINATIVI);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_LIST, "Codice Debitore");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_FORM, 300, 76, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_CODICEDEBITO, -1, -1);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_CODICEDEBITO, PPQRY_AVVISDIRISC1, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_LIST, 80, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_FORM, 32, 104, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_FORM, 44);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_UFFICIO, -1, -1);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_UFFICIO, PPQRY_AVVISDIRISC1, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_LIST, 144, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_LIST, 64);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_LIST, "Data Avvisi");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_FORM, 4, 132, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_FORM, 72);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_DATAAVVISI, MyGlb.PANEL_FORM, "Data Avvisi");
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_DATAAVVISI, -1, -1);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_DATAAVVISI, PPQRY_AVVISDIRISC1, "A.ROWNAMDATAVV", "ROWNAMDATAVV", 6, 14, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, MyGlb.PANEL_LIST, 236, 184, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, MyGlb.PANEL_FORM, 312, 212, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_ELABORA, -1, -1);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_LIST, 248, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_LIST, 44);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_FORM, 80, 184, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_FORM, 80);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_STAMPA, MyGlb.PANEL_FORM, "Stampa");
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_STAMPA, -1, GRP_AVVISDIRISCO_STAMPA);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_STAMPA, PPQRY_AVVISDIRISC1, "A.ROWNAMESTAMP", "ROWNAMESTAMP", 5, 2, 0, -13997);
    PAN_AVVISDIRISCO.SetValueListItem(PFL_AVVISDIRISCO_STAMPA, (new IDVariant("A")), "Avvisi", "", "", -1);
    PAN_AVVISDIRISCO.SetValueListItem(PFL_AVVISDIRISCO_STAMPA, (new IDVariant("R")), "Riep. Debitori", "", "", -1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, MyGlb.PANEL_LIST, 264, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, MyGlb.PANEL_FORM, 16, 188, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_NEWPANELLABE, -1, GRP_AVVISDIRISCO_STAMPA);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, MyGlb.PANEL_LIST, 272, 200, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, MyGlb.PANEL_FORM, 376, 184, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_NEWPANELABE1, -1, GRP_AVVISDIRISCO_STAMPA);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_FORM, 16, 76, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_FORM, 60);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_BENDEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_BENDEBITORE, -1, -1);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_BENDEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, MyGlb.PANEL_FORM, 364, 80, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_SCEGBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_SCEGBENFBUTT, -1, -1);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_SCEGBENFBUTT, -1, "", "SCEGBENFBUTT", 0, 0, 0, -13997);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, MyGlb.PANEL_LIST, 320, 12, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, MyGlb.PANEL_LIST, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, MyGlb.PANEL_LIST, 1);
    PAN_AVVISDIRISCO.SetRect(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, MyGlb.PANEL_FORM, 380, 80, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_AVVISDIRISCO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, MyGlb.PANEL_FORM, 0);
    PAN_AVVISDIRISCO.SetNumRow(MyGlb.OBJ_FIELD, PFL_AVVISDIRISCO_INFOBENFBUTT, MyGlb.PANEL_FORM, 1);
    PAN_AVVISDIRISCO.SetFieldPage(PFL_AVVISDIRISCO_INFOBENFBUTT, -1, -1);
    PAN_AVVISDIRISCO.SetFieldPanel(PFL_AVVISDIRISCO_INFOBENFBUTT, -1, "", "INFOBENFBUTT", 0, 0, 0, -13997);
  }

  private void PAN_AVVISDIRISCO_InitQueries()
  {
    StringBuffer SQL;

    PAN_AVVISDIRISCO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AVVISDIRISCO.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_AVVISDIRISCO.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AVVISDIRISCO.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_AVVISDIRISCO.SetQueryLKE(PPQRY_BEN, PFL_AVVISDIRISCO_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_AVVISDIRISCO.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_AVVISDIRISCO.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_AVVISDIRISCO.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "BEN CODICE FISCALE");
    PAN_AVVISDIRISCO.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "BEN PARTITA IVA");
    PAN_AVVISDIRISCO.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_AVVISDIRISCO.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_AVVISDIRISCO.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_AVVISDIRISCO.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_AVVISDIRISCO.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_AVVISDIRISCO.SetQueryVisibleColumn(PPQRY_BEN, "AL");
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
    PAN_AVVISDIRISCO.SetQuery(PPQRY_T53, 0, SQL, PFL_AVVISDIRISCO_UFFICIO, "");
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
    PAN_AVVISDIRISCO.SetQuery(PPQRY_T53, 1, SQL, PFL_AVVISDIRISCO_UFFICIO, "");
    PAN_AVVISDIRISCO.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_AVVISDIRISCO.SetIMDB(IMDB, "PQRY_AVVISDIRISC1", true);
    PAN_AVVISDIRISCO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_AVVISDIRISCO.SetQueryIMDB(PPQRY_AVVISDIRISC1, IMDBDef15.PQRY_AVVISDIRISC1_RS, IMDBDef5.TBL_AVVISDIRISCO);
    JustLoaded = true;
    PAN_AVVISDIRISCO.SetFieldPrimaryIndex(PFL_AVVISDIRISCO_DAL, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEDAL);
    PAN_AVVISDIRISCO.SetFieldPrimaryIndex(PFL_AVVISDIRISCO_AL, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEAL);
    PAN_AVVISDIRISCO.SetFieldPrimaryIndex(PFL_AVVISDIRISCO_CODICEDEBITO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMCODDEB);
    PAN_AVVISDIRISCO.SetFieldPrimaryIndex(PFL_AVVISDIRISCO_UFFICIO, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMEUFFIC);
    PAN_AVVISDIRISCO.SetFieldPrimaryIndex(PFL_AVVISDIRISCO_DATAAVVISI, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMDATAVV);
    PAN_AVVISDIRISCO.SetFieldPrimaryIndex(PFL_AVVISDIRISCO_STAMPA, IMDBDef5.FLD_AVVISDIRISCO_ROWNAMESTAMP);
    PAN_AVVISDIRISCO.SetMasterTable(0, "AVVISDIRISCO");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_AVVISDIRISCO.Status() == 2)
    {
      int oldListQBE = PAN_AVVISDIRISCO.iUseListQBE;
      PAN_AVVISDIRISCO.iUseListQBE = 0;
      PAN_AVVISDIRISCO.PanelCommand(Glb.PCM_SEARCH);
      PAN_AVVISDIRISCO.PanelCommand(Glb.PCM_FIND);
      PAN_AVVISDIRISCO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_AVVISDIRISCO) PAN_AVVISDIRISCO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_AVVISDIRISCO) PAN_AVVISDIRISCO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_AVVISDIRISCO) PAN_AVVISDIRISCO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_AVVISDIRISCO) PAN_AVVISDIRISCO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_AVVISDIRISCO) PAN_AVVISDIRISCO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_AVVISDIRISCO) PAN_AVVISDIRISCO_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
