// **********************************************
// Storico Scheda
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StoricoScheda extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int GRP_STORICSCHEDA_PESOINDICATO = 0;
  private static int GRP_STORICSCHEDA_PESOOBIETTIV = 1;

  private static int PFL_STORICSCHEDA_STATO = 0;
  private static int PFL_STORICSCHEDA_OBIETTIVOID = 1;
  private static int PFL_STORICSCHEDA_OBIETTIVO = 2;
  private static int PFL_STORICSCHEDA_DESCOBIETTIV = 3;
  private static int PFL_STORICSCHEDA_DESCRISCHEDA = 4;
  private static int PFL_STORICSCHEDA_DESCRIESTES1 = 5;
  private static int PFL_STORICSCHEDA_CATEGORIA1 = 6;
  private static int PFL_STORICSCHEDA_CATEGORIA = 7;
  private static int PFL_STORICSCHEDA_CLASSIFICAZ1 = 8;
  private static int PFL_STORICSCHEDA_CLASSIFICAZI = 9;
  private static int PFL_STORICSCHEDA_PEROBIETRAG1 = 10;
  private static int PFL_STORICSCHEDA_PERSOGLIRAG1 = 11;
  private static int PFL_STORICSCHEDA_PEROBIETRAGG = 12;
  private static int PFL_STORICSCHEDA_PERSOGLIRAGG = 13;
  private static int PFL_STORICSCHEDA_PROGETTO = 14;
  private static int PFL_STORICSCHEDA_PROGETDESCRI = 15;
  private static int PFL_STORICSCHEDA_PROGUNITORGA = 16;
  private static int PFL_STORICSCHEDA_SCHEDOBIETID = 17;
  private static int PFL_STORICSCHEDA_PROGRESSIVO = 18;
  private static int PFL_STORICSCHEDA_DESCPROGLABE = 19;
  private static int PFL_STORICSCHEDA_DESCOBIETTI1 = 20;
  private static int PFL_STORICSCHEDA_PESOINDICATO = 21;
  private static int PFL_STORICSCHEDA_PESOOB = 22;
  private static int PFL_STORICSCHEDA_CALCOLPERCEN = 23;
  private static int PFL_STORICSCHEDA_DESCRIESTESA = 24;
  private static int PFL_STORICSCHEDA_RESPONSABILE = 25;

  private static int PPQRY_POLSCHEDOBI5 = 0;

  private static int PPQRY_POLOBIETTIVI = 1;
  private static int PPQRY_PROGETTI = 2;
  private static int PPQRY_POLCATEGSCOB = 3;
  private static int PPQRY_POLCLASSSCOB = 4;


  IDPanel PAN_STORICSCHEDA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS21(IMDB);
    //
    //
    Init_PQRY_POLSCHEDOBI5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS21, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS21, "TBL_PARS21");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS21,IMDBDef4.FLD_PARS21_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS21,IMDBDef4.FLD_PARS21_ROWNAMECOMPE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS21,IMDBDef4.FLD_PARS21_ROWNAMPROCHI, "ROWNAMPROCHI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS21,IMDBDef4.FLD_PARS21_ROWNAMPROCHI,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS21,IMDBDef4.FLD_PARS21_ROWNAMSCOBID, "ROWNAMSCOBID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS21,IMDBDef4.FLD_PARS21_ROWNAMSCOBID,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS21, 0);
  }

  private static void Init_PQRY_POLSCHEDOBI5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLSCHEDOBI5, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLSCHEDOBI5, "PQRY_POLSCHEDOBI5");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_REPOSCSCOBID, "REPOSCSCOBID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_REPOSCSCOBID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_STATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_OBIETTIVO_ID, "OBIETTIVO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_OBIETTIVO_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_DESCRIZIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_RECODESCESTE, "RECODESCESTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_RECODESCESTE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_RECORDRESPON, "RECORDRESPON");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_RECORDRESPON,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_ANNULLATA, "ANNULLATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_ANNULLATA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_INDICATORI_TARGET, "PESO_INDICATORI_TARGET");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_INDICATORI_TARGET,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_INDICATORI_SOGLIA, "PESO_INDICATORI_SOGLIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_INDICATORI_SOGLIA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_TARGET, "PESO_TARGET");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_TARGET,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_SOGLIA_RAGGIUNTA, "PESO_SOGLIA_RAGGIUNTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PESO_SOGLIA_RAGGIUNTA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PROGETTO_ID,5,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_CATEGORIA, "CATEGORIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_CATEGORIA,5,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_CLASSIFICAZIONE, "CLASSIFICAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_CLASSIFICAZIONE,5,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_CALCOLO_PERCENTUALE, "CALCOLO_PERCENTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_CALCOLO_PERCENTUALE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_DESCRIZIONE_ESTESA, "DESCRIZIONE_ESTESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI5,IMDBDef12.PQSL_POLSCHEDOBI5_DESCRIZIONE_ESTESA,5,2000,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLSCHEDOBI5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StoricoScheda(MyWebEntryPoint w, IMDBObj imdb)
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
  public StoricoScheda()
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
    FormIdx = MyGlb.FRM_STORICSCHEDA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CC56CE1E-5714-450B-BAA5-529D6BC71AFB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 450;
    set_Caption(new IDVariant("Storico Scheda"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 424;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 424;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "D17DBF95-D606-40AD-AF5E-725FED1DB6A6";
    TAB_TAB.SetItemCount(1);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Storico Scheda";
    Frames[2].Parent = this;
    PAN_STORICSCHEDA = new IDPanel(w, this, 2, "PAN_STORICSCHEDA");
    Frames[2].Content = PAN_STORICSCHEDA;
    PAN_STORICSCHEDA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STORICSCHEDA.VS = MainFrm.VisualStyleList;
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 424-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "885B9190-28F8-4C67-8C01-7C61923D7F45");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 64, 1116, 224, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 44);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STORICSCHEDA.InitStatus = 2;
    PAN_STORICSCHEDA_Init();
    PAN_STORICSCHEDA_InitFields();
    PAN_STORICSCHEDA_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Storico Scheda", "");
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
      PAN_STORICSCHEDA.UpdatePanel(MainFrm);
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
    return (obj instanceof StoricoScheda);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StoricoScheda.class.getName() : (Glb.ClassWithPackage(StoricoScheda.class) ? StoricoScheda.class.getName().substring(StoricoScheda.class.getPackage().getName().length() + 1) : StoricoScheda.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Calcola Competenza
  // **********************************************************************
  public int CalcolaCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Calcola Competenza Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  OGGETTI_COMPETENZE A ");
      SQL.append("where (A.OGGETTO = 12) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.equals((new IDVariant(0)), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARS21, IMDBDef4.FLD_PARS21_ROWNAMECOMPE, 0, (new IDVariant("NO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARS21, IMDBDef4.FLD_PARS21_ROWNAMECOMPE, 0, (new IDVariant("SI")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoScheda", "CalcolaCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Tooltip
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Tooltip ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Tooltip Body
      // Procedure Body
      // 
      PAN_STORICSCHEDA.set_ToolTip(Glb.OBJ_FIELD,PFL_STORICSCHEDA_DESCOBIETTIV,(new IDVariant(PAN_STORICSCHEDA.FieldText(PFL_STORICSCHEDA_DESCOBIETTIV))).stringValue()); 
      PAN_STORICSCHEDA.set_ToolTip(Glb.OBJ_FIELD,PFL_STORICSCHEDA_DESCRISCHEDA,(new IDVariant(PAN_STORICSCHEDA.FieldText(PFL_STORICSCHEDA_DESCRISCHEDA))).stringValue()); 
      PAN_STORICSCHEDA.set_ToolTip(Glb.OBJ_FIELD,PFL_STORICSCHEDA_PROGETDESCRI,(new IDVariant(PAN_STORICSCHEDA.FieldText(PFL_STORICSCHEDA_PROGETDESCRI))).stringValue()); 
      PAN_STORICSCHEDA.set_ToolTip(Glb.OBJ_FIELD,PFL_STORICSCHEDA_CLASSIFICAZI,(new IDVariant(PAN_STORICSCHEDA.FieldText(PFL_STORICSCHEDA_CLASSIFICAZI))).stringValue()); 
      PAN_STORICSCHEDA.set_ToolTip(Glb.OBJ_FIELD,PFL_STORICSCHEDA_CATEGORIA,(new IDVariant(PAN_STORICSCHEDA.FieldText(PFL_STORICSCHEDA_CLASSIFICAZI))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoScheda", "Tooltip", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controlla Prop
  // **********************************************************************
  public int ControllaProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_DATACHIUS = new IDVariant(0,IDVariant.DATETIME);

    try
    {
      TransCount = 0;
      // 
      // Controlla Prop Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DATA_CHIUSURA as POLISTFADACH ");
      SQL.append("from ");
      SQL.append("  POL_ISTANZE_FASI A, ");
      SQL.append("  POL_FASI_PROCESSO B ");
      SQL.append("where (A.FASE_PROCESSO_ID = B.FASE_PROCESSO_ID) ");
      SQL.append("and   (B.CODICE = 'PROP') ");
      SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.PROGRESSIVO_ISTANZA = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MAX(C.PROGRESSIVO_ISTANZA) ");
      SQL.append("from ");
      SQL.append("  POL_ISTANZE_FASI C, ");
      SQL.append("  POL_FASI_PROCESSO D ");
      SQL.append("where (C.FASE_PROCESSO_ID = D.FASE_PROCESSO_ID) ");
      SQL.append("and   (D.CODICE = 'PROP') ");
      SQL.append("and   (C.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append(")) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DATACHIUS = QV.Get("POLISTFADACH", IDVariant.DATETIME) ;
      }
      QV.Close();
      if (IDL.NullValue(v_DATACHIUS,(new IDVariant("2099/01/01 00:00:00", IDVariant.DATETIME))).compareTo(IDL.Today(), true)<=0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARS21, IMDBDef4.FLD_PARS21_ROWNAMPROCHI, 0, (new IDVariant("SI")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARS21, IMDBDef4.FLD_PARS21_ROWNAMPROCHI, 0, (new IDVariant("NO")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoScheda", "ControllaProp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Desc Estesa
  // **********************************************************************
  public int ApriDescEstesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Desc Estesa Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_DIGITATESTO, (new IDVariant(-1)).intValue(), this); 
      ((DigitaTesto)MainFrm.GetForm(MyGlb.FRM_DIGITATESTO,0,true,this)).InizializzaNote(IMDB.Value(IMDBDef12.PQRY_POLSCHEDOBI5, IMDBDef12.PQSL_POLSCHEDOBI5_RECODESCESTE, 0), (new IDVariant(PAN_STORICSCHEDA.Header(Glb.OBJ_FIELD,PFL_STORICSCHEDA_DESCRIESTES1))), (new IDVariant(0)), (new IDVariant(2000)));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoScheda", "ApriDescEstesa", _e);
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
    IDVariant v_PROGETTOID = new IDVariant(0,IDVariant.STRING);
    IDVariant v_OBIETTIVOID = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_DESCPROGETTO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DESCOBIETTIV = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CODOBIETTIVO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      CalcolaCompetenza();
      if (IMDB.Value(IMDBDef4.TBL_PARS21, IMDBDef4.FLD_PARS21_ROWNAMECOMPE, 0).equals((new IDVariant("NO")), true))
      {
      }
      PAN_STORICSCHEDA.set_Header(Glb.OBJ_FIELD,PFL_STORICSCHEDA_PEROBIETRAG1, (new IDVariant("Obiettivo")).stringValue());
      PAN_STORICSCHEDA.set_Header(Glb.OBJ_FIELD,PFL_STORICSCHEDA_PERSOGLIRAG1, (new IDVariant("Soglia")).stringValue());
      PAN_STORICSCHEDA.set_Header(Glb.OBJ_FIELD,PFL_STORICSCHEDA_PEROBIETRAGG, (new IDVariant("Obiettivo")).stringValue());
      PAN_STORICSCHEDA.set_Header(Glb.OBJ_FIELD,PFL_STORICSCHEDA_PERSOGLIRAGG, (new IDVariant("Soglia")).stringValue());
      PAN_STORICSCHEDA.set_Header(Glb.OBJ_FIELD,PFL_STORICSCHEDA_DESCOBIETTIV, (new IDVariant("")).stringValue());
      PAN_STORICSCHEDA.set_Header(Glb.OBJ_FIELD,PFL_STORICSCHEDA_PROGETDESCRI, (new IDVariant("")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROGETTO_ID as POLSCHOBPRID, ");
      SQL.append("  A.OBIETTIVO_ID as POLSCHEOBIID ");
      SQL.append("from ");
      SQL.append("  POL_SCHEDE_OBIETTIVO A ");
      SQL.append("where (A.SCHEDA_OBIETTIVO_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARS21, IMDBDef4.FLD_PARS21_ROWNAMSCOBID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PROGETTOID = QV.Get("POLSCHOBPRID", IDVariant.STRING) ;
        v_OBIETTIVOID = QV.Get("POLSCHEOBIID", IDVariant.INTEGER) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as PROGETDESCRI ");
      SQL.append("from ");
      SQL.append("  PROGETTI A ");
      SQL.append("where (A.PROGETTO_ID = " + IDL.CSql(v_PROGETTOID, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCPROGETTO = QV.Get("PROGETDESCRI", IDVariant.STRING) ;
      }
      QV.Close();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as POLOBIETDESC, ");
      SQL.append("  A.CODICE as POLOBIETCODI ");
      SQL.append("from ");
      SQL.append("  POL_OBIETTIVI A ");
      SQL.append("where (A.OBIETTIVO_ID = " + IDL.CSql(v_OBIETTIVOID, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESCOBIETTIV = QV.Get("POLOBIETDESC", IDVariant.STRING) ;
        v_CODOBIETTIVO = QV.Get("POLOBIETCODI", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_STORICSCHEDA.set_FieldText(PFL_STORICSCHEDA_DESCPROGLABE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Progetto")), (new IDVariant(":"))), (new IDVariant(" "))), v_PROGETTOID), (new IDVariant(" - "))), v_DESCPROGETTO).stringValue());
      PAN_STORICSCHEDA.set_FieldText(PFL_STORICSCHEDA_DESCOBIETTI1, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Obiettivo")), (new IDVariant(":"))), (new IDVariant(" "))), v_CODOBIETTIVO), (new IDVariant(" - "))), v_DESCOBIETTIV).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoScheda", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Storico Scheda On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STORICSCHEDA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STORICSCHEDA);
      // 
      // Storico Scheda On Dynamic Properties Event Body
      // Procedure Body
      // 
      Tooltip();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoScheda", "StoricoSchedaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Storico Scheda On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STORICSCHEDA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Storico Scheda On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          Cancel.set((new IDVariant(-1)));
          PAN_STORICSCHEDA.SetFlags (Glb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STORICSCHEDA.SetFlags (Glb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          new IDVariant(PAN_STORICSCHEDA.ExportData((new IDVariant(-1)).booleanValue(),false)); 
          PAN_STORICSCHEDA.SetFlags (Glb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_STORICSCHEDA.SetFlags (Glb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoScheda", "StoricoSchedaOnCommandEvent", _e);
    }
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_STORICSCHEDA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STORICSCHEDA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STORICSCHEDA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STORICSCHEDA, Cancel);
    // Stub
  }

  private void PAN_STORICSCHEDA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_STORICSCHEDA_DESCRIESTES1)
    {
      this.IdxPanelActived = this.PAN_STORICSCHEDA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDescEstesa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_STORICSCHEDA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_STORICSCHEDA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STORICSCHEDA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STORICSCHEDA_Init()
  {

    PAN_STORICSCHEDA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STORICSCHEDA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, "52DB4B3E-3759-49A7-B96B-60C48ABB6B4C");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, "Peso Indicatori");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_LIST, 856, -9999, 96, 21, 0, 0);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_FORM, 0, 159, 192, 73, 0, 0);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, 0, 85);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, 1, 13);
    PAN_STORICSCHEDA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, 0, 4);
    PAN_STORICSCHEDA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, 1, 4);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOINDICATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, "8BC5D8D6-1F12-4C17-A406-1D21EC8F9B45");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, "Peso Obiettivi");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, MyGlb.PANEL_LIST, 952, -9999, 96, 21, 0, 0);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, MyGlb.PANEL_FORM, 0, 207, 188, 73, 0, 0);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, 0, 78);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, 1, 13);
    PAN_STORICSCHEDA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, 0, 4);
    PAN_STORICSCHEDA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, 1, 4);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_GROUP, GRP_STORICSCHEDA_PESOOBIETTIV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STORICSCHEDA.SetSize(MyGlb.OBJ_FIELD, 26);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, "03C8F1FA-CF82-4E28-8A90-84F24ED83287");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, "Stato");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, "23F7F588-4CB8-4877-B58D-4D0CDF500B37");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, "OBIETTIVO ID");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.VIS_NONNULLAFIEL);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, 0, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, "B002F4F4-2115-47A9-88E5-0CDDB39A3D15");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, "Obiettivo ");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.VIS_VISULOOUPCF4);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, "4476CB50-2B0B-4B93-A749-1F54A4CA4876");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, "Desc Obiettivo");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.VIS_HEADNOBORLEF);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, "E68463EF-8E8B-4D66-A24C-D88FEB7CD56A");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, "Descrizione Scheda");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, "FAC1659E-963C-48A3-ACE5-BDE473DE88C1");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, "Descrizione Estesa");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.VIS_HYPELINKIMMA);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, "B30FE08E-5386-44AE-80EF-704B41743C71");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, "Categoria");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, "E95D63FA-FE35-48B7-BA14-A554C9B4973E");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, "Categoria ");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.VIS_VISULOOUPCF4);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, "60813A70-08AE-45A4-9699-FD4565766970");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, "Classificazione");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, "F63C7090-3AA6-48A8-BCDC-4A604EC7DDF4");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, "Classificazione ");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.VIS_VISULOOUPCF4);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, "AF343AAD-EB0D-4CB9-B205-01F167E6429F");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, "per Obiettivo Raggiunto");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, "ED41DED3-B763-43B0-942E-360F61008EF9");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, "per Soglia Raggiunta");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, "644D389A-CE47-4D9A-A56C-2C5E1639532B");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, "per Obiettivo raggiunto");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, "21FF26A4-D986-457D-9279-DD650E778209");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, "per Soglia Raggiunta");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, "09EA8B13-E1EB-4570-8071-1E5BA80320FA");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, "Progetto");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, 0, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, "F1CD91CD-20BF-405F-9418-4D12DC54010A");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, "PROGETTI DESCRIZIONE");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.VIS_HEADNOBORLEF);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, "1722EF60-48A8-4362-ABA9-CC37449CF785");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.VIS_NONNULLAFIEL);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, 0, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, "42053DBC-D597-4856-A7F8-87AF2571D93E");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, "4133173D-04D7-4190-9727-4498D8F24A70");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, "PROGRESSIVO");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, "BA152EA7-C6E6-4581-B453-368057223547");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, MyGlb.VIS_ETICHEGRASSE);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, "562B4A6A-07E6-41CC-BE03-19B46F5DB7B4");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, MyGlb.VIS_ETICHEGRASSE);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, "2E94D82A-C385-47EA-8435-13A30AB21044");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, "Peso Indicatori");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, MyGlb.VIS_LABVISSTPEGR);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, "3C7CE5DE-9C5C-47B1-BAA4-4ACE6266F934");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, "Peso Obiettivi");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, MyGlb.VIS_LABVISSTPEGR);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, "AC4135C8-14B1-4878-ABD1-86796F29846C");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, "Calcolo Percentuale");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.VIS_CHECKSTYLE);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, "8942FA14-4896-42CE-AE57-22DCB9669E31");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, "DESCRIZIONE ESTESA");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, "");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.VIS_NORMFIELPADR);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STORICSCHEDA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, "D3E7DB9F-7AFE-4909-BE1C-D30510555136");
    PAN_STORICSCHEDA.set_Header(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, "Responsabile");
    PAN_STORICSCHEDA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, "ANAGRAFE UNITA ORGANIZZATIVA GET DESCRIZIONE (POL SCHEDE OBIETTIVO PROGR UNITA ORGANIZZATIVA, Today ())");
    PAN_STORICSCHEDA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.VIS_NORMFIELPADR);
    PAN_STORICSCHEDA.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_STORICSCHEDA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_LIST, 0, 112, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_LIST, 44);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_FORM, 4, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_FORM, 44);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_STATO, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_STATO, PPQRY_POLSCHEDOBI5, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_STATO, (new IDVariant("A")), "Attuale", "", "", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_STATO, (new IDVariant("P")), "Proposta", "", "", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_STATO, (new IDVariant("O")), "Obsoleta", "", "", -1);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_LIST, 72, 48, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_LIST, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_LIST, "OBIETTIVO ID");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_FORM, 4, 28, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_FORM, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVOID, MyGlb.PANEL_FORM, "OBIET. ID");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_OBIETTIVOID, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_OBIETTIVOID, PPQRY_POLSCHEDOBI5, "A.OBIETTIVO_ID", "OBIETTIVO_ID", 3, 10, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_LIST, 72, 48, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_LIST, 124);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_LIST, "Obiettivo ");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_FORM, 4, 28, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_FORM, 124);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_OBIETTIVO, MyGlb.PANEL_FORM, "Obiettivo ");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_OBIETTIVO, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_OBIETTIVO, PPQRY_POLOBIETTIVI, "A.CODICE", "POLOBIETCODI", 5, 10, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_LIST, 140, 48, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_LIST, 152);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_LIST, "Desc Obiettivo");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_FORM, 4, 52, 664, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_FORM, 152);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTIV, MyGlb.PANEL_FORM, "Desc Obiettivo");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_DESCOBIETTIV, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_DESCOBIETTIV, PPQRY_POLOBIETTIVI, "A.DESCRIZIONE", "POLOBIETDESC", 5, 100, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_LIST, 72, 112, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_LIST, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_LIST, "Descrizione Scheda");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_FORM, 4, 76, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_FORM, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_FORM, 2);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRISCHEDA, MyGlb.PANEL_FORM, "Descrizione Scheda");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_DESCRISCHEDA, -1, -1);
    PAN_STORICSCHEDA.SetFieldUnbound(PFL_STORICSCHEDA_DESCRISCHEDA, true);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_DESCRISCHEDA, PPQRY_POLSCHEDOBI5, "SUBSTR(A.DESCRIZIONE, 1, 30)", "DESCRIZIONE", 5, 99, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_LIST, 312, 112, 64, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_LIST, 68);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_LIST, "Descr. Estesa");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_FORM, 4, 520, 500, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_FORM, 68);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_FORM, 2);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTES1, MyGlb.PANEL_FORM, "Descr. Estesa");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_DESCRIESTES1, -1, -1);
    PAN_STORICSCHEDA.SetFieldUnbound(PFL_STORICSCHEDA_DESCRIESTES1, true);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_DESCRIESTES1, PPQRY_POLSCHEDOBI5, "CASE WHEN (A.DESCRIZIONE_ESTESA IS NULL) THEN 'N' ELSE 'P' END", "RECODESCESTE", 5, 99, 0, -13997);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_DESCRIESTES1, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_LIST, 616, 112, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_LIST, 68);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_LIST, "Categ.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_FORM, 4, 424, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_FORM, 68);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA1, MyGlb.PANEL_FORM, "Categoria");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_CATEGORIA1, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_CATEGORIA1, PPQRY_POLSCHEDOBI5, "A.CATEGORIA", "CATEGORIA", 5, 3, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_LIST, 376, 112, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_LIST, 192);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_LIST, "Categoria ");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_FORM, 4, 496, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_FORM, 192);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CATEGORIA, MyGlb.PANEL_FORM, "Categoria ");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_CATEGORIA, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_CATEGORIA, PPQRY_POLCATEGSCOB, "A.DESCRIZIONE", "POLCATSCODES", 5, 60, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_LIST, 856, 112, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_LIST, 100);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_LIST, "Classif.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_FORM, 4, 448, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_FORM, 100);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZ1, MyGlb.PANEL_FORM, "Classificazione");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_CLASSIFICAZ1, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_CLASSIFICAZ1, PPQRY_POLSCHEDOBI5, "A.CLASSIFICAZIONE", "CLASSIFICAZIONE", 5, 3, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_LIST, 616, 112, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_LIST, 220);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_LIST, "Classificazione ");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_FORM, 4, 472, 532, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_FORM, 220);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CLASSIFICAZI, MyGlb.PANEL_FORM, "Classificazione ");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_CLASSIFICAZI, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_CLASSIFICAZI, PPQRY_POLCLASSSCOB, "A.DESCRIZIONE", "POLCLASCODES", 5, 60, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_LIST, 856, 112, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_LIST, 140);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_LIST, "p. O. R.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_FORM, 4, 184, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_FORM, 140);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAG1, MyGlb.PANEL_FORM, "per Obiet. Raggiunto");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PEROBIETRAG1, -1, GRP_STORICSCHEDA_PESOINDICATO);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PEROBIETRAG1, PPQRY_POLSCHEDOBI5, "A.PESO_INDICATORI_TARGET", "PESO_INDICATORI_TARGET", 1, 5, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_LIST, 904, 112, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_LIST, 140);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_LIST, "p. S. R.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_FORM, 4, 208, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_FORM, 140);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAG1, MyGlb.PANEL_FORM, "per Soglia Raggiunta");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PERSOGLIRAG1, -1, GRP_STORICSCHEDA_PESOINDICATO);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PERSOGLIRAG1, PPQRY_POLSCHEDOBI5, "A.PESO_INDICATORI_SOGLIA", "PESO_INDICATORI_SOGLIA", 1, 5, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_LIST, 952, 112, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_LIST, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_LIST, "p. O. rg.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_FORM, 4, 232, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_FORM, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PEROBIETRAGG, MyGlb.PANEL_FORM, "per Ob. rgg.");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PEROBIETRAGG, -1, GRP_STORICSCHEDA_PESOOBIETTIV);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PEROBIETRAGG, PPQRY_POLSCHEDOBI5, "A.PESO_TARGET", "PESO_TARGET", 1, 5, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_LIST, 1000, 112, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_LIST, 136);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_LIST, "p. S. R.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_FORM, 4, 256, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_FORM, 136);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PERSOGLIRAGG, MyGlb.PANEL_FORM, "per Soglia Raggiunta");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PERSOGLIRAGG, -1, GRP_STORICSCHEDA_PESOOBIETTIV);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PERSOGLIRAGG, PPQRY_POLSCHEDOBI5, "A.PESO_SOGLIA_RAGGIUNTA", "PESO_SOGLIA_RAGGIUNTA", 1, 5, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_LIST, 1104, 48, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_LIST, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_LIST, "Prog.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_FORM, 4, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_FORM, 76);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETTO, MyGlb.PANEL_FORM, "Progetto");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PROGETTO, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PROGETTO, PPQRY_POLSCHEDOBI5, "A.PROGETTO_ID", "PROGETTO_ID", 5, 7, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_LIST, 1156, 48, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_LIST, 132);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_LIST, "PROGETTI DESCRIZIONE");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_FORM, 4, 304, 644, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_FORM, 132);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGETDESCRI, MyGlb.PANEL_FORM, "PROGETTI DESCRIZIONE");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PROGETDESCRI, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PROGETDESCRI, PPQRY_PROGETTI, "A.DESCRIZIONE", "PROGETDESCRI", 5, 100, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_LIST, 2012, 48, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 424, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGUNITORGA, MyGlb.PANEL_FORM, "PR. UNITA ORGANIZZATIVA");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PROGUNITORGA, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PROGUNITORGA, PPQRY_POLSCHEDOBI5, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_LIST, 2012, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 424, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_FORM, 120);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCH. OBIETTIVO ID");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_SCHEDOBIETID, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_SCHEDOBIETID, PPQRY_POLSCHEDOBI5, "A.SCHEDA_OBIETTIVO_ID", "REPOSCSCOBID", 3, 10, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_LIST, 2012, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 520, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PROGRESSIVO, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PROGRESSIVO, PPQRY_POLSCHEDOBI5, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, MyGlb.PANEL_LIST, 4, 4, 780, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, MyGlb.PANEL_LIST, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, MyGlb.PANEL_FORM, 4, 4, 780, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, MyGlb.PANEL_FORM, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCPROGLABE, MyGlb.PANEL_FORM, 2);
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_DESCPROGLABE, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_DESCPROGLABE, -1, "", "DESCPROGLABE", 0, 0, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, MyGlb.PANEL_LIST, 4, 32, 780, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, MyGlb.PANEL_LIST, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, MyGlb.PANEL_FORM, 12, 12, 780, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, MyGlb.PANEL_FORM, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCOBIETTI1, MyGlb.PANEL_FORM, 2);
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_DESCOBIETTI1, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_DESCOBIETTI1, -1, "", "DESCOBIETTI1", 0, 0, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_LIST, 856, 64, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_LIST, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_FORM, 1168, 60, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_FORM, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOINDICATO, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PESOINDICATO, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PESOINDICATO, -1, "", "PESOINDICATO", 0, 0, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, MyGlb.PANEL_LIST, 952, 64, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, MyGlb.PANEL_LIST, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, MyGlb.PANEL_FORM, 1176, 68, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, MyGlb.PANEL_FORM, 0);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_PESOOB, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_PESOOB, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_PESOOB, -1, "", "PESOOB", 0, 0, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_LIST, 1048, 112, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_LIST, 128);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_LIST, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_LIST, "Calc. Percen.");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_FORM, 4, 568, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_FORM, 128);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_FORM, 1);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_CALCOLPERCEN, MyGlb.PANEL_FORM, "Calcolo Percentuale");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_CALCOLPERCEN, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_CALCOLPERCEN, PPQRY_POLSCHEDOBI5, "A.CALCOLO_PERCENTUALE", "CALCOLO_PERCENTUALE", 5, 2, 0, -13997);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_CALCOLPERCEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STORICSCHEDA.SetValueListItem(PFL_STORICSCHEDA_CALCOLPERCEN, (new IDVariant()), "Null", "", "", -1);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_LIST, 1492, 112, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_LIST, 116);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_LIST, 2);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_LIST, "DESCRIZIONE ESTESA");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_FORM, 4, 592, 552, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_FORM, 116);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_FORM, 2);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_DESCRIESTESA, MyGlb.PANEL_FORM, "DESCRIZIONE ESTESA");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_DESCRIESTESA, -1, -1);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_DESCRIESTESA, PPQRY_POLSCHEDOBI5, "A.DESCRIZIONE_ESTESA", "DESCRIZIONE_ESTESA", 5, 2000, 0, -13997);
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_LIST, 0, 48, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_LIST, 72);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_LIST, 2);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_STORICSCHEDA.SetRect(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_FORM, 4, 592, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICSCHEDA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_FORM, 72);
    PAN_STORICSCHEDA.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_FORM, 2);
    PAN_STORICSCHEDA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICSCHEDA_RESPONSABILE, MyGlb.PANEL_FORM, "Respons.");
    PAN_STORICSCHEDA.SetFieldPage(PFL_STORICSCHEDA_RESPONSABILE, -1, -1);
    PAN_STORICSCHEDA.SetFieldUnbound(PFL_STORICSCHEDA_RESPONSABILE, true);
    PAN_STORICSCHEDA.SetFieldPanel(PFL_STORICSCHEDA_RESPONSABILE, PPQRY_POLSCHEDOBI5, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "RECORDRESPON", 5, 99, 0, -13997);
  }

  private void PAN_STORICSCHEDA_InitQueries()
  {
    StringBuffer SQL;

    PAN_STORICSCHEDA.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as POLOBIETCODI, ");
    SQL.append("  A.DESCRIZIONE as POLOBIETDESC ");
    SQL.append("from ");
    SQL.append("  POL_OBIETTIVI A ");
    SQL.append("where (A.OBIETTIVO_ID = ~~OBIETTIVO_ID~~) ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLOBIETTIVI, 0, SQL, -1, "");
    PAN_STORICSCHEDA.SetQueryDB(PPQRY_POLOBIETTIVI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORICSCHEDA.SetMasterTable(PPQRY_POLOBIETTIVI, "POL_OBIETTIVI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as PROGETDESCRI ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~PROGETTO_ID~~) ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    PAN_STORICSCHEDA.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORICSCHEDA.SetMasterTable(PPQRY_PROGETTI, "PROGETTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as POLCATSCODES ");
    SQL.append("from ");
    SQL.append("  POL_CATEGORIE_SCOB A ");
    SQL.append("where (A.CODICE = ~~CATEGORIA~~) ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLCATEGSCOB, 0, SQL, -1, "");
    PAN_STORICSCHEDA.SetQueryDB(PPQRY_POLCATEGSCOB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORICSCHEDA.SetMasterTable(PPQRY_POLCATEGSCOB, "POL_CATEGORIE_SCOB");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as POLCLASCODES ");
    SQL.append("from ");
    SQL.append("  POL_CLASSIFICAZIONI_SCOB A ");
    SQL.append("where (A.CODICE = ~~CLASSIFICAZIONE~~) ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLCLASSSCOB, 0, SQL, -1, "");
    PAN_STORICSCHEDA.SetQueryDB(PPQRY_POLCLASSSCOB, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORICSCHEDA.SetMasterTable(PPQRY_POLCLASSSCOB, "POL_CLASSIFICAZIONI_SCOB");
    PAN_STORICSCHEDA.SetIMDB(IMDB, "PQRY_POLSCHEDOBI5", true);
    PAN_STORICSCHEDA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as REPOSCSCOBID, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  A.OBIETTIVO_ID as OBIETTIVO_ID, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as DESCRIZIONE, ");
    SQL.append("  CASE WHEN (A.DESCRIZIONE_ESTESA IS NULL) THEN 'N' ELSE 'P' END as RECODESCESTE, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as RECORDRESPON, ");
    SQL.append("  A.ANNULLATA as ANNULLATA, ");
    SQL.append("  A.PESO_INDICATORI_TARGET as PESO_INDICATORI_TARGET, ");
    SQL.append("  A.PESO_INDICATORI_SOGLIA as PESO_INDICATORI_SOGLIA, ");
    SQL.append("  A.PESO_TARGET as PESO_TARGET, ");
    SQL.append("  A.PESO_SOGLIA_RAGGIUNTA as PESO_SOGLIA_RAGGIUNTA, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.CATEGORIA as CATEGORIA, ");
    SQL.append("  A.CLASSIFICAZIONE as CLASSIFICAZIONE, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.CALCOLO_PERCENTUALE as CALCOLO_PERCENTUALE, ");
    SQL.append("  A.DESCRIZIONE_ESTESA as DESCRIZIONE_ESTESA ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLSCHEDOBI5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_SCHEDE_OBIETTIVO A ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLSCHEDOBI5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.SCHEDA_OBIETTIVO_ID = ~~TBL_PARS21.ROWNAMSCOBID~~) ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLSCHEDOBI5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLSCHEDOBI5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLSCHEDOBI5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_STORICSCHEDA.SetQuery(PPQRY_POLSCHEDOBI5, 5, SQL, -1, "");
    PAN_STORICSCHEDA.SetQueryDB(PPQRY_POLSCHEDOBI5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORICSCHEDA.SetMasterTable(0, "POL_SCHEDE_OBIETTIVO");
    PAN_STORICSCHEDA.AddToSortList(PFL_STORICSCHEDA_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STORICSCHEDA.Status() == 2)
    {
      int oldListQBE = PAN_STORICSCHEDA.iUseListQBE;
      PAN_STORICSCHEDA.iUseListQBE = 0;
      PAN_STORICSCHEDA.PanelCommand(Glb.PCM_SEARCH);
      PAN_STORICSCHEDA.PanelCommand(Glb.PCM_FIND);
      PAN_STORICSCHEDA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STORICSCHEDA) PAN_STORICSCHEDA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORICSCHEDA) PAN_STORICSCHEDA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STORICSCHEDA) PAN_STORICSCHEDA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORICSCHEDA) PAN_STORICSCHEDA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STORICSCHEDA) PAN_STORICSCHEDA_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_STORICSCHEDA) PAN_STORICSCHEDA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
