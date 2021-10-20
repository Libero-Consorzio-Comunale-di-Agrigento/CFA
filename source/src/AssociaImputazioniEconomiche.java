// **********************************************
// Associa Imputazioni Economiche
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AssociaImputazioniEconomiche extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_IMDBPARS_FATTORE = 0;
  private static int PFL_IMDBPARS_FATTORDESCRI = 1;
  private static int PFL_IMDBPARS_CENTRO = 2;
  private static int PFL_IMDBPARS_CENTRIDESCRI = 3;
  private static int PFL_IMDBPARS_COMPETENZDAL = 4;
  private static int PFL_IMDBPARS_COMPETENZAAL = 5;
  private static int PFL_IMDBPARS_ETICHEELABOR = 6;
  private static int PFL_IMDBPARS_FATTORITIPO = 7;

  private static int PPQRY_IMDBPARS1 = 0;

  private static int PPQRY_FATTORI = 1;
  private static int PPQRY_CENTRI = 2;


  IDPanel PAN_IMDBPARS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_IMDBPARS(IMDB);
    //
    //
    Init_PQRY_IMDBPARS1(IMDB);
    Init_PQRY_IMDBPARS1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_IMDBPARS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_IMDBPARS, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_IMDBPARS, "TBL_IMDBPARS");
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGEFATT, "NOMEOGGEFATT");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGEFATT,5,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGECENT, "NOMEOGGECENT");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGECENT,5,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGCOMDAL, "NOMOGGCOMDAL");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGCOMDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGCOMAL, "NOMEOGGCOMAL");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGCOMAL,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, "NOMOGGQUALIV");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV, "NOMOGGQUILIV");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV,1,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGCEDICO, "NOMOGGCEDICO");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGCEDICO,5,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGFATOLD, "NOMOGGFATOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_IMDBPARS,IMDBDef3.FLD_IMDBPARS_NOMOGGFATOLD,5,16,0);
    IMDB.TblAddNew(IMDBDef3.TBL_IMDBPARS, 0);
  }

  private static void Init_PQRY_IMDBPARS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_IMDBPARS1, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_IMDBPARS1, "PQRY_IMDBPARS1");
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, "NOMEOGGEFATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, "NOMEOGGECENT");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, "NOMOGGCOMDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, "NOMEOGGCOMAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_IMDBPARS1, 0);
  }

  private static void Init_PQRY_IMDBPARS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_IMDBPARS1_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_IMDBPARS1_RS, "PQRY_IMDBPARS1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, "NOMEOGGEFATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, "NOMEOGGECENT");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, "NOMOGGCOMDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, "NOMEOGGCOMAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_IMDBPARS1_RS,IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL,6,10,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AssociaImputazioniEconomiche(MyWebEntryPoint w, IMDBObj imdb)
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
  public AssociaImputazioniEconomiche()
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
    FormIdx = MyGlb.FRM_ASSOIMPUECON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6F966487-BAB5-4B3B-A0B5-9DABDFB0024A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2113;
    DesignWidth = 584;
    DesignHeight = 154;
    set_Caption(new IDVariant("Associa Imputazioni Economiche"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 584;
    Frames[1].Height = 128;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "IMDB Pars";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 128;
    PAN_IMDBPARS = new IDPanel(w, this, 1, "PAN_IMDBPARS");
    Frames[1].Content = PAN_IMDBPARS;
    PAN_IMDBPARS.Lockable = false;
    PAN_IMDBPARS.iLocked = false;
    PAN_IMDBPARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMDBPARS.VS = MainFrm.VisualStyleList;
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 584-MyGlb.PAN_OFFS_X, 128-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2084B361-451B-4F6D-B861-FEE4271838A5");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1120, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMDBPARS.InitStatus = 1;
    PAN_IMDBPARS_Init();
    PAN_IMDBPARS_InitFields();
    PAN_IMDBPARS_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_IMDBPARS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ASSOIMPUECON_IMDBPARS1();
      }
      PAN_IMDBPARS.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_IMDBPARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMDBPARS_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_IMDBPARS.FrIndex)
    {
      if (IdxFieldActived ==PFL_IMDBPARS_CENTRO) {
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
    return (obj instanceof AssociaImputazioniEconomiche);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AssociaImputazioniEconomiche.class.getName() : (Glb.ClassWithPackage(AssociaImputazioniEconomiche.class) ? AssociaImputazioniEconomiche.class.getName().substring(AssociaImputazioniEconomiche.class.getPackage().getName().length() + 1) : AssociaImputazioniEconomiche.class.getName()));
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
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VMAX = new IDVariant(0,IDVariant.STRING);
      if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV, 0))))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MAX(B.FATTORE) as MAXFATTOFATT ");
        SQL.append("from ");
        SQL.append("  RELAZIONI_CONTI_FATTORI A, ");
        SQL.append("  FATTORI B ");
        SQL.append("where (B.FATTORE = A.FATTORE) ");
        SQL.append("and   (NVL(B.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
        SQL.append("and   (A.CONTO_ID_D IN ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  C.CONTO_ID ");
        SQL.append("from ");
        SQL.append("  STRUTTURA_PIANO_CONTI C, ");
        SQL.append("  RELAZIONI_PCF_PCE D ");
        SQL.append("where (D.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (D.LIVELLO_PCF = 5) ");
        SQL.append("and   (INSTR(C.CODICE, D.CODICE_PCE, 1) > 0) ");
        SQL.append("and   (D.TIPO_PCE = C.TIPO_PIANO) ");
        SQL.append("and   (D.CODICE_PCF = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN D.ESERCIZIO_INIZIO AND NVL(D.ESERCIZIO_FINE, 9999))) ");
        SQL.append("UNION ");
        SQL.append("select ");
        SQL.append("  E.CONTO_ID ");
        SQL.append("from ");
        SQL.append("  STRUTTURA_PIANO_CONTI E, ");
        SQL.append("  RELAZIONI_PCF_PCE F ");
        SQL.append("where (F.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (F.LIVELLO_PCF = 4) ");
        SQL.append("and   (INSTR(E.CODICE, F.CODICE_PCE, 1) > 0) ");
        SQL.append("and   (F.TIPO_PCE = E.TIPO_PIANO) ");
        SQL.append("and   (F.CODICE_PCF = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN F.ESERCIZIO_INIZIO AND NVL(F.ESERCIZIO_FINE, 9999))) ");
        SQL.append(")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_VMAX = QV.Get("MAXFATTOFATT", IDVariant.STRING) ;
        }
        QV.Close();
      }
      else if (!(IDL.IsNull(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0))))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MAX(B.FATTORE) as MAXFATTOFATT ");
        SQL.append("from ");
        SQL.append("  RELAZIONI_CONTI_FATTORI A, ");
        SQL.append("  FATTORI B ");
        SQL.append("where (B.FATTORE = A.FATTORE) ");
        SQL.append("and   (NVL(B.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
        SQL.append("and   (A.CONTO_ID_D IN ");
        SQL.append("( ");
        SQL.append("select ");
        SQL.append("  C.CONTO_ID ");
        SQL.append("from ");
        SQL.append("  STRUTTURA_PIANO_CONTI C, ");
        SQL.append("  RELAZIONI_PCF_PCE D ");
        SQL.append("where (D.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (D.LIVELLO_PCF = 4) ");
        SQL.append("and   (INSTR(C.CODICE, D.CODICE_PCE, 1) > 0) ");
        SQL.append("and   (D.TIPO_PCE = C.TIPO_PIANO) ");
        SQL.append("and   (D.CODICE_PCF = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN D.ESERCIZIO_INIZIO AND NVL(D.ESERCIZIO_FINE, 9999))) ");
        SQL.append("UNION ");
        SQL.append("select ");
        SQL.append("  E.CONTO_ID ");
        SQL.append("from ");
        SQL.append("  STRUTTURA_PIANO_CONTI E, ");
        SQL.append("  RELAZIONI_PCF_PCE F ");
        SQL.append("where (F.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (F.LIVELLO_PCF = 5) ");
        SQL.append("and   (INSTR(E.CODICE, F.CODICE_PCE, 1) > 0) ");
        SQL.append("and   (F.TIPO_PCE = E.TIPO_PIANO) ");
        SQL.append("and   (SUBSTR(TO_CHAR ( F.CODICE_PCF ), 1, 7) = TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        SQL.append("and   ((" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " BETWEEN F.ESERCIZIO_INIZIO AND NVL(F.ESERCIZIO_FINE, 9999))) ");
        SQL.append(")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_VMAX = QV.Get("MAXFATTOFATT", IDVariant.STRING) ;
        }
        QV.Close();
      }
      if (v_VCOUNT.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGEFATT, 0, new IDVariant(v_VMAX));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "Load", _e);
    }
  }

  // **********************************************************************
  // Unload
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel - Input/Output
  // Confirm - Input
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
      // Unload Body
      // Corpo Procedura
      // 
      UNLOAD_IMDBPARSDELE();
      IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGFATOLD, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "Unload", _e);
    }
  }

  // **********************************************************************
  // IMDB Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_IMDBPARSDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGEFATT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGECENT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGCOMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGCOMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGCEDICO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGFATOLD, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
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
      // End Modal Body
      // Corpo Procedura
      // 
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "EndModal", _e);
    }
  }

  // **********************************************************************
  // IMDB Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_IMDBPARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // IMDB Pars On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_IMDBPARS_FATTORE)), true))
      {
        if (IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0).compareTo(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGFATOLD, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0, (new IDVariant()));
          if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0))))
          {
            IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
            IDVariant v_VMAX = new IDVariant(0,IDVariant.STRING);
            if (MainFrm.FattorePresente(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0), IDL.Today(), (new IDVariant(""))).compareTo((new IDVariant(0)), true)<=0)
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("Fattore inesistente o scaduto"));
              MainFrm.set_AlertMessage(S); 
              IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0, (new IDVariant()));
            }
            else
            {
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  COUNT(*) as COUNT1, ");
              SQL.append("  MAX(A.TIPO) as MAXFATTOTIPO ");
              SQL.append("from ");
              SQL.append("  FATTORI A ");
              SQL.append("where (A.FATTORE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
              SQL.append("and   (FATTORE_ASS_PCE(A.FATTORE," + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") = 'SI') ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
                v_VMAX = QV.Get("MAXFATTOTIPO", IDVariant.STRING) ;
              }
              QV.Close();
              if (v_VCOUNT.equals((new IDVariant(0)), true))
              {
                IDVariant S = new IDVariant(0,IDVariant.STRING);
                S = (new IDVariant("Fattore non previsto dal quarto o quinto livello indicato.<br/> Continuare?"));
                IDVariant B = null;
                B = (new IDVariant(MainFrm.MessageConfirmEx(S)));
                if (IDL.IsNull(B))
                {
                  return;
                }
                else
                {
                  if (!(B.booleanValue()))
                  {
                    IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0, (new IDVariant()));
                  }
                }
              }
            }
            IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGFATOLD, 0, IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0));
          }
          else
          {
            IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGFATOLD, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_IMDBPARS_CENTRO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0))))
        {
          IDVariant v_VCOUNT1 = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CENTRI A ");
          SQL.append("where (A.CENTRO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (NVL(A.DATA_VALIDITA, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE )) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT1.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Centro inesistente o scaduto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_IMDBPARS_COMPETENZDAL)), true) || Column.equals((new IDVariant(PFL_IMDBPARS_COMPETENZAAL)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0))))
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0),(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))).compareTo(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, 0), true)<0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Date competenza incongruenti"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "IMDBParsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // IMDB Pars On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMDBPARS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMDBPARS);
      // 
      // IMDB Pars On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_IMDBPARS.set_ToolTip(Glb.OBJ_FIELD,PFL_IMDBPARS_FATTORDESCRI,(new IDVariant(PAN_IMDBPARS.FieldText(PFL_IMDBPARS_FATTORDESCRI))).stringValue()); 
      PAN_IMDBPARS.set_ToolTip(Glb.OBJ_FIELD,PFL_IMDBPARS_CENTRIDESCRI,(new IDVariant(PAN_IMDBPARS.FieldText(PFL_IMDBPARS_CENTRIDESCRI))).stringValue()); 
      if (IDL.NullValue((new IDVariant(PAN_IMDBPARS.FieldText(PFL_IMDBPARS_FATTORITIPO))),(new IDVariant("E"))).compareTo((new IDVariant("E")), true)!=0)
      {
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_IMDBPARS.SetFlags (Glb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "IMDBParsOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Fattore
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Fattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fattore Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IDL.Today());
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMNASTUT, 0, (new IDVariant("SI")));
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMTUTIFA, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMFICOEC, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMCODQUA, 0, IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUALIV, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMCODQUI, 0, IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGQUILIV, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMEES, 0, IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGETTES, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "Fattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Centro
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Centro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Centro Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "Centro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      PAN_IMDBPARS.PanelCommand(Glb.PCM_UPDATE);
      IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGCEDICO, 0, (new IDVariant()));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0))))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Date competenza incomplete"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
      {
        if ((new IDVariant(PAN_IMDBPARS.FieldText(PFL_IMDBPARS_FATTORITIPO))).equals((new IDVariant("E")), true))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0)))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Centro di Costo non indicato. Per i fattori economici verrà usato il centro di default.<BR/>Continuare?"));
            if (!(MainFrm.MessageConfirm(S)))
            {
              return 0;
            }
            IDVariant v_VCENTROCOMOD = new IDVariant(0,IDVariant.STRING);
            v_VCENTROCOMOD = (new IDVariant());
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.CC_INS_SOPR as FATCOMCCINSO ");
            SQL.append("from ");
            SQL.append("  FATTORI_COMODO A ");
            SQL.append("where (A.PROGRESSIVO = 1) ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCENTROCOMOD = QV.Get("FATCOMCCINSO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGCEDICO, 0, new IDVariant(v_VCENTROCOMOD));
          }
        }
      }
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGEFATT, 0, IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGEFATT, 0));
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGECENT, 0, IDL.NullValue(IMDB.Value(IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGCEDICO, 0),IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGECENT, 0)));
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMOGGCOMDAL, 0, IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMOGGCOMDAL, 0));
      IMDB.set_Value(IMDBDef3.TBL_IMDB6, IMDBDef3.FLD_IMDB6_NOMEOGGCOMAL, 0, IMDB.Value(IMDBDef11.PQRY_IMDBPARS1, IMDBDef11.PQSL_IMDBPARS1_NOMEOGGCOMAL, 0));
      if (((RecuperoRettificaEconomicaSuMovimenti)MainFrm.GetForm(MyGlb.FRM_RECRETECSUMO,0)).EtichettaElabora())
      {
        MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssociaImputazioniEconomiche", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // IMDB Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ASSOIMPUECON_IMDBPARS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_IMDBPARS1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_IMDBPARS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_IMDBPARS, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_IMDBPARS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_IMDBPARS1_RS, 0, IMDBDef3.TBL_IMDBPARS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_IMDBPARS1_RS, 0, 0, IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGEFATT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_IMDBPARS1_RS, 1, 0, IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGECENT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_IMDBPARS1_RS, 2, 0, IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMOGGCOMDAL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_IMDBPARS1_RS, 3, 0, IMDBDef3.TBL_IMDBPARS, IMDBDef3.FLD_IMDBPARS_NOMEOGGCOMAL, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_IMDBPARS, 0);
      if (IMDB.Eof(IMDBDef3.TBL_IMDBPARS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_IMDBPARS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_IMDBPARS1_RS, 0);
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
  private void PAN_IMDBPARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_IMDBPARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMDBPARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMDBPARS, Cancel);
    // Stub
  }

  private void PAN_IMDBPARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_IMDBPARS_FATTORE)
    {
      this.IdxPanelActived = this.PAN_IMDBPARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Fattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMDBPARS_CENTRO)
    {
      this.IdxPanelActived = this.PAN_IMDBPARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Centro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_IMDBPARS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_IMDBPARS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_IMDBPARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_IMDBPARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_IMDBPARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMDBPARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMDBPARS_Init()
  {

    PAN_IMDBPARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMDBPARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMDBPARS.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, "00538655-7DD6-4D6A-A32C-8779B3701085");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, "Fattore");
    PAN_IMDBPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, "");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, "7A98D7B9-52DD-42A8-B632-6E8C4F2E8DB2");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_IMDBPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, "");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, "7A2FDD3B-670E-45AF-AFE5-E99E64FCAB57");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, "Centro");
    PAN_IMDBPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, "");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_NOACTD | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, "54715AFF-C385-4C84-B8ED-97B19DEAE00D");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_IMDBPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, "");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, "3B632590-4B4A-43F8-AA87-88FFC088FE89");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, "Competenza Dal");
    PAN_IMDBPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, "");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, "7B393ABA-F42D-445C-B26C-8CEA604415D7");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, "Al");
    PAN_IMDBPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, "");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, "0DE54840-E447-47D0-9BFE-0AADAB5EC8A4");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, "Elabora");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_IMDBPARS.SetImage(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_IMDBPARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, "33479B8F-3E16-4B8C-BC2D-3ACEDEFBA00F");
    PAN_IMDBPARS.set_Header(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, "FATTORI TIPO");
    PAN_IMDBPARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, "");
    PAN_IMDBPARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.VIS_LOOKUPFIELDS);
    PAN_IMDBPARS.SetFlags(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMDBPARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_LIST, 52);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_FORM, 4, 4, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_FORM, 112);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_FATTORE, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_FATTORE, PPQRY_IMDBPARS1, "A.NOMEOGGEFATT", "NOMEOGGEFATT", 5, 16, 0, -13997);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_LIST, 136);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_FORM, 248, 4, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_FORM, 136);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORDESCRI, MyGlb.PANEL_FORM, "FATTORI DESCRIZIONE");
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_FATTORDESCRI, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_LIST, 48);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_FORM, 4, 28, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_FORM, 112);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_CENTRO, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_CENTRO, PPQRY_IMDBPARS1, "A.NOMEOGGECENT", "NOMEOGGECENT", 5, 16, 0, -13997);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_LIST, 128);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_FORM, 248, 28, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_FORM, 128);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENTRI DESCRIZIONE");
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_CENTRIDESCRI, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "FATTCENTDESC", 5, 200, 0, -13997);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_LIST, 100);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza Dal");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_FORM, 4, 52, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_FORM, 112);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza Dal");
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_COMPETENZDAL, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_COMPETENZDAL, PPQRY_IMDBPARS1, "A.NOMOGGCOMDAL", "NOMOGGCOMDAL", 6, 10, 0, -13997);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_LIST, 96);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_LIST, "Al");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_FORM, 220, 52, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_FORM, 24);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_COMPETENZAAL, MyGlb.PANEL_FORM, "Al");
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_COMPETENZAAL, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_COMPETENZAAL, PPQRY_IMDBPARS1, "A.NOMEOGGCOMAL", "NOMEOGGCOMAL", 6, 10, 0, -13997);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, MyGlb.PANEL_LIST, 448, 84, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, MyGlb.PANEL_FORM, 476, 80, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_ETICHEELABOR, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_LIST, 88);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_LIST, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_LIST, "FATTORI TIPO");
    PAN_IMDBPARS.SetRect(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_FORM, 44, 88, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMDBPARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_FORM, 88);
    PAN_IMDBPARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_FORM, 1);
    PAN_IMDBPARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMDBPARS_FATTORITIPO, MyGlb.PANEL_FORM, "FATTORI TIPO");
    PAN_IMDBPARS.SetFieldPage(PFL_IMDBPARS_FATTORITIPO, -1, -1);
    PAN_IMDBPARS.SetFieldPanel(PFL_IMDBPARS_FATTORITIPO, PPQRY_FATTORI, "A.TIPO", "FATTORITIPO", 5, 1, 0, -13997);
    PAN_IMDBPARS.SetValueListItem(PFL_IMDBPARS_FATTORITIPO, (new IDVariant("E")), "Economico", "", "", -1);
    PAN_IMDBPARS.SetValueListItem(PFL_IMDBPARS_FATTORITIPO, (new IDVariant("A")), "Patrimoniale Attivo", "", "", -1);
    PAN_IMDBPARS.SetValueListItem(PFL_IMDBPARS_FATTORITIPO, (new IDVariant("P")), "Patrimoniale Passivo", "", "", -1);
  }

  private void PAN_IMDBPARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMDBPARS.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI, ");
    SQL.append("  A.TIPO as FATTORITIPO ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~NOMEOGGEFATT~~) ");
    PAN_IMDBPARS.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_IMDBPARS.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMDBPARS.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTCENTDESC ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~NOMEOGGECENT~~) ");
    PAN_IMDBPARS.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_IMDBPARS.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMDBPARS.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    PAN_IMDBPARS.SetIMDB(IMDB, "PQRY_IMDBPARS1", true);
    PAN_IMDBPARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_IMDBPARS.SetQueryIMDB(PPQRY_IMDBPARS1, IMDBDef11.PQRY_IMDBPARS1_RS, IMDBDef3.TBL_IMDBPARS);
    JustLoaded = true;
    PAN_IMDBPARS.SetFieldPrimaryIndex(PFL_IMDBPARS_FATTORE, IMDBDef3.FLD_IMDBPARS_NOMEOGGEFATT);
    PAN_IMDBPARS.SetFieldPrimaryIndex(PFL_IMDBPARS_CENTRO, IMDBDef3.FLD_IMDBPARS_NOMEOGGECENT);
    PAN_IMDBPARS.SetFieldPrimaryIndex(PFL_IMDBPARS_COMPETENZDAL, IMDBDef3.FLD_IMDBPARS_NOMOGGCOMDAL);
    PAN_IMDBPARS.SetFieldPrimaryIndex(PFL_IMDBPARS_COMPETENZAAL, IMDBDef3.FLD_IMDBPARS_NOMEOGGCOMAL);
    PAN_IMDBPARS.SetMasterTable(0, "IMDBPARS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMDBPARS.Status() == 2)
    {
      int oldListQBE = PAN_IMDBPARS.iUseListQBE;
      PAN_IMDBPARS.iUseListQBE = 0;
      PAN_IMDBPARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMDBPARS.PanelCommand(Glb.PCM_FIND);
      PAN_IMDBPARS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMDBPARS) PAN_IMDBPARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMDBPARS) PAN_IMDBPARS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMDBPARS) PAN_IMDBPARS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMDBPARS) PAN_IMDBPARS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMDBPARS) PAN_IMDBPARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
