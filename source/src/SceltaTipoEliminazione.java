// **********************************************
// Scelta Tipo Eliminazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaTipoEliminazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARATIPOELI1_NEWGROUP = 0;

  private static int PFL_PARATIPOELI1_TIPO = 0;
  private static int PFL_PARATIPOELI1_OKBUTTON = 1;
  private static int PFL_PARATIPOELI1_DAL = 2;
  private static int PFL_PARATIPOELI1_AL = 3;
  private static int PFL_PARATIPOELI1_DISTINTAN = 4;
  private static int PFL_PARATIPOELI1_DATARISTAMPA = 5;
  private static int PFL_PARATIPOELI1_NEWPANELLABE = 6;
  private static int PFL_PARATIPOELI1_NEWPANELABE1 = 7;
  private static int PFL_PARATIPOELI1_GROUPLABEL = 8;

  private static int PPQRY_TIPO1 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_PARATIPOELI1;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_TIPO1(IMDB);
    Init_PQRY_TIPO1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_TIPO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_TIPO1, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_TIPO1, "PQRY_TIPO1");
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1,IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS,6,12,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_TIPO1, 0);
  }

  private static void Init_PQRY_TIPO1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_TIPO1_RS, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_TIPO1_RS, "PQRY_TIPO1_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMETIPO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMEDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMEAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, "ROWNAMDISNUM");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS, "ROWNAMDATDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_TIPO1_RS,IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS,6,12,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaTipoEliminazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaTipoEliminazione()
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
    FormIdx = MyGlb.FRM_SCELTIPOELIM;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3EC18223-224D-4A71-AD91-706067495512";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 268;
    DesignHeight = 258;
    set_Caption(new IDVariant("Scelta Tipo Eliminazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 268;
    Frames[1].Height = 232;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Tipo Eliminazione 1";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 232;
    PAN_PARATIPOELI1 = new IDPanel(w, this, 1, "PAN_PARATIPOELI1");
    Frames[1].Content = PAN_PARATIPOELI1;
    PAN_PARATIPOELI1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARATIPOELI1.VS = MainFrm.VisualStyleList;
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 268-MyGlb.PAN_OFFS_X, 232-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8DAF249A-344A-4C25-B2D9-38943DB3D147");
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1232, 176, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARATIPOELI1.InitStatus = 2;
    PAN_PARATIPOELI1_Init();
    PAN_PARATIPOELI1_InitFields();
    PAN_PARATIPOELI1_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARATIPOELI1, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELTIPOELIM_TIPO1();
      }
      PAN_PARATIPOELI1.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaTipoEliminazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaTipoEliminazione.class.getName() : (Glb.ClassWithPackage(SceltaTipoEliminazione.class) ? SceltaTipoEliminazione.class.getName().substring(SceltaTipoEliminazione.class.getPackage().getName().length() + 1) : SceltaTipoEliminazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Tipo Eliminazione 1 On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARATIPOELI1_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARATIPOELI1);
      // 
      // Parametri Tipo Eliminazione 1 On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(2)), true))
      {
        PAN_PARATIPOELI1.SetFlags (Glb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARATIPOELI1.SetFlags (Glb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Mandati", IDVariant.STRING));
          PAN_PARATIPOELI1.set_FieldText(PFL_PARATIPOELI1_GROUPLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
        else
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Ordinativi", IDVariant.STRING));
          PAN_PARATIPOELI1.set_FieldText(PFL_PARATIPOELI1_GROUPLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
      }
      else
      {
        PAN_PARATIPOELI1.SetFlags (Glb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARATIPOELI1.SetFlags (Glb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(4)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Annulli", IDVariant.STRING));
          PAN_PARATIPOELI1.set_FieldText(PFL_PARATIPOELI1_GROUPLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(6)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Variazioni", IDVariant.STRING));
          PAN_PARATIPOELI1.set_FieldText(PFL_PARATIPOELI1_GROUPLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(7)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(8)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Sostituzioni", IDVariant.STRING));
          PAN_PARATIPOELI1.set_FieldText(PFL_PARATIPOELI1_GROUPLABEL, new IDVariant(v_NOMEGRUPPO).stringValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTipoEliminazione", "ParametriTipoEliminazione1OnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Form Eliminazione
  // **********************************************************************
  public int ApriFormEliminazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Form Eliminazione Body
      // Procedure Body
      // 
      MainFrm.RiempiIMDB();
      MainFrm.Show(MyGlb.FRM_ELIMINAZIONE, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTipoEliminazione", "ApriFormEliminazione", _e);
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Eliminazione", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEMANDA, 0).equals((new IDVariant(1)), true))
      {
      }
      if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEMANDA, 0).equals((new IDVariant(2)), true))
      {
        IDVariant v_MANDATO = new IDVariant(0,IDVariant.STRING);
        v_MANDATO = (new IDVariant("Ordinativo", IDVariant.STRING));
        IDVariant v_IMPEGNO = new IDVariant(0,IDVariant.STRING);
        v_IMPEGNO = (new IDVariant("Accertamento", IDVariant.STRING));
        IDVariant v_PAGATO = new IDVariant(0,IDVariant.STRING);
        v_PAGATO = (new IDVariant("Incassato", IDVariant.STRING));
        // ((Eliminazione)MainFrm.GetForm(MyGlb.FRM_ELIMINAZIONE,0)).PAN_ELIMINAZIONE.set_FieldText(((Eliminazione)MainFrm.GetForm(MyGlb.FRM_ELIMINAZIONE,0)).PFL_ELIMINAZIONE_MANDATOLABEL, new IDVariant(v_MANDATO).stringValue());
        // ((Eliminazione)MainFrm.GetForm(MyGlb.FRM_ELIMINAZIONE,0)).PAN_ELIMINAZIONE.set_FieldText(((Eliminazione)MainFrm.GetForm(MyGlb.FRM_ELIMINAZIONE,0)).PFL_ELIMINAZIONE_IMPEGNOLABEL, new IDVariant(v_IMPEGNO).stringValue());
        // ((Eliminazione)MainFrm.GetForm(MyGlb.FRM_ELIMINAZIONE,0)).PAN_ELIMINAZIONE.set_FieldText(((Eliminazione)MainFrm.GetForm(MyGlb.FRM_ELIMINAZIONE,0)).PFL_ELIMINAZIONE_PAGATOLABEL, new IDVariant(v_PAGATO).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTipoEliminazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Setta Data Ristampa
  // ritorna 1 se tutto ok
  // **********************************************************************
  public IDVariant SettaDataRistampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MYDATA = new IDVariant(0,IDVariant.DATETIME);

    try
    {
      TransCount = 0;
      // 
      // Setta Data Ristampa Body
      // Procedure Body
      // 
      // 
      // gestione data ristampa per i mandati
      // 
      if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        // 
        // controllo se esiste il mandato
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  MAN A ");
          SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_COUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Distinta non esistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            IMDB.set_Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS, 0, (new IDVariant()));
            return (new IDVariant(-1));
          }
        }
        // 
        // cerco la data ristampa
        // 
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIN(A.D_DATA_ELENCO) as MINMANDDATEL ");
          SQL.append("from ");
          SQL.append("  MAN A ");
          SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_MYDATA = QV.Get("MINMANDDATEL", IDVariant.DATETIME) ;
          }
          QV.Close();
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Errore nella ricerca della data dell'ultima distinta di trasmissione", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            return (new IDVariant(-1));
          }
        }
        IMDB.set_Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS, 0, new IDVariant(v_MYDATA));
        return (new IDVariant(1));
      }
      // 
      // gestione data ristampa per gli ordinativi
      // 
      if (IMDB.Value(IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0).equals((new IDVariant(2)), true))
      {
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        // 
        // controllo se esiste il mandato
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  ORD A ");
          SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " AND A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_COUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Distinta non esistente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            IMDB.set_Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS, 0, (new IDVariant()));
            return (new IDVariant(-1));
          }
        }
        // 
        // cerco la data ristampa
        // 
        {
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  MIN(A.D_DATA_ELENCO) as MINORDDDATEL ");
          SQL.append("from ");
          SQL.append("  ORD A ");
          SQL.append("where (A.ANNO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_ELENCO = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDISNUM, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_MYDATA = QV.Get("MINORDDDATEL", IDVariant.DATETIME) ;
          }
          QV.Close();
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
            v_MSG = (new IDVariant("Errore nella ricerca della data dell'ultima distinta di trasmissione", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_MSG); 
            return (new IDVariant(-1));
          }
        }
        IMDB.set_Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMDATDIS, 0, new IDVariant(v_MYDATA));
        return (new IDVariant(1));
      }
      return (new IDVariant(1));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTipoEliminazione", "SettaDataRistampa", _e);
      return new IDVariant();
    }
  }

  // **********************************************************************
  // Parametri Tipo Eliminazione 1 Distinta n Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARATIPOELI1_DISTINTAN_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Tipo Eliminazione 1 Distinta n Validate Event Body
      // Procedure Body
      // 
      SettaDataRistampa();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTipoEliminazione", "ParametriTipoEliminazione1DistintanValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Tipo Eliminazione 1 Tipo Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARATIPOELI1_TIPO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Tipo Eliminazione 1 Tipo Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(1)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(2)), true))
      {
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Invio", IDVariant.STRING));
          PAN_PARATIPOELI1.set_Header(Glb.OBJ_GROUP,GRP_PARATIPOELI1_NEWGROUP,v_NOMEGRUPPO.stringValue()); 
        }
        else
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Ordinativi", IDVariant.STRING));
          PAN_PARATIPOELI1.set_Header(Glb.OBJ_GROUP,GRP_PARATIPOELI1_NEWGROUP,v_NOMEGRUPPO.stringValue()); 
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(3)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(4)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Annulli", IDVariant.STRING));
          PAN_PARATIPOELI1.set_Header(Glb.OBJ_GROUP,GRP_PARATIPOELI1_NEWGROUP,v_NOMEGRUPPO.stringValue()); 
        }
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(5)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(6)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Variazioni", IDVariant.STRING));
          PAN_PARATIPOELI1.set_Header(Glb.OBJ_GROUP,GRP_PARATIPOELI1_NEWGROUP,v_NOMEGRUPPO.stringValue()); 
        }
        if (IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(7)), true) || IMDB.Value(IMDBDef15.PQRY_TIPO1, IMDBDef15.PQSL_TIPO1_ROWNAMETIPO, 0).equals((new IDVariant(8)), true))
        {
          IDVariant v_NOMEGRUPPO = new IDVariant(0,IDVariant.STRING);
          v_NOMEGRUPPO = (new IDVariant("Sostituzioni", IDVariant.STRING));
          PAN_PARATIPOELI1.set_Header(Glb.OBJ_GROUP,GRP_PARATIPOELI1_NEWGROUP,v_NOMEGRUPPO.stringValue()); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaTipoEliminazione", "ParametriTipoEliminazione1TipoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Tipo
  // Primary record source for panel data
  // **********************************************************************
  private void SCELTIPOELIM_TIPO1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_TIPO1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARATIPOELI1, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARATIPOELI1, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_TIPO1_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_TIPO1_RS, 0, IMDBDef6.TBL_PARATIPOELI1, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_TIPO1_RS, 0, 0, IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_TIPO1_RS, 1, 0, IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_TIPO1_RS, 2, 0, IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_TIPO1_RS, 3, 0, IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMDISNUM, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_TIPO1_RS, 4, 0, IMDBDef6.TBL_PARATIPOELI1, IMDBDef6.FLD_PARATIPOELI1_ROWNAMDATDIS, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARATIPOELI1, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARATIPOELI1, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARATIPOELI1, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_TIPO1_RS, 0);
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
  private void PAN_PARATIPOELI1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARATIPOELI1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARATIPOELI1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARATIPOELI1, Cancel);
    // Stub
  }

  private void PAN_PARATIPOELI1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARATIPOELI1_OKBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARATIPOELI1.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFormEliminazione();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARATIPOELI1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARATIPOELI1_TIPO)
      {
        PFL_PARATIPOELI1_TIPO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARATIPOELI1_DISTINTAN)
      {
        PFL_PARATIPOELI1_DISTINTAN_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARATIPOELI1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARATIPOELI1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARATIPOELI1_Init()
  {

    PAN_PARATIPOELI1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARATIPOELI1.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, "AA9A4924-2C55-4D1A-876C-A92D6FED152B");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, "New Group");
    PAN_PARATIPOELI1.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, MyGlb.VIS_GROUPSTYLE);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, MyGlb.PANEL_LIST, 0, -9999, 256, 0, 0, 0);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, MyGlb.PANEL_FORM, 8, 44, 228, 96, 0, 0);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, 0, 60);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, 1, 13);
    PAN_PARATIPOELI1.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, 0, 1);
    PAN_PARATIPOELI1.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, 1, 1);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_GROUP, GRP_PARATIPOELI1_NEWGROUP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARATIPOELI1.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, "74C4791F-5A0E-4075-8AF0-9FFEA52E41BA");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, "Tipo");
    PAN_PARATIPOELI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, "3DFDFC91-4361-4CB2-8981-B3D9CA58BC11");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, "OK");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARATIPOELI1.SetImage(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, 0, "button1.gif", false);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, "3B67E7DA-4B36-4BFE-994E-6FA5BBC0B825");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, "Dal");
    PAN_PARATIPOELI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, "4F6FD723-8D3E-490E-88BD-651703B53151");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, "Al");
    PAN_PARATIPOELI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, "680C6932-F9B6-4C03-AAE5-6155BF750D1D");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, "Distinta n.");
    PAN_PARATIPOELI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, "73DDD296-AA22-4DA8-9C1A-59837B75BC33");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, "Data Ristampa");
    PAN_PARATIPOELI1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, "20C03B0A-AD25-4AC2-B593-9925B22FF1C0");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, "C2081A0D-F02D-48F8-9F44-C252F995DD5C");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, "");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARATIPOELI1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, "05EAC097-2FE3-41E1-9110-F4D256F03EC4");
    PAN_PARATIPOELI1.set_Header(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, "Mandati");
    PAN_PARATIPOELI1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, MyGlb.VIS_VUOGRAALILEF);
    PAN_PARATIPOELI1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARATIPOELI1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_LIST, 28);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_FORM, 16, 12, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_FORM, 40);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_TIPO, -1, -1);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_TIPO, PPQRY_TIPO1, "A.ROWNAMETIPO", "ROWNAMETIPO", 1, 49, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, MyGlb.PANEL_LIST, 100, 104, 56, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, MyGlb.PANEL_FORM, 156, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_OKBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_OKBUTTON, -1, -1);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_OKBUTTON, -1, "", "OKBUTTON", 0, 0, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_FORM, 48, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_FORM, 32);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_DAL, -1, GRP_PARATIPOELI1_NEWGROUP);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_DAL, PPQRY_TIPO1, "A.ROWNAMEDAL", "ROWNAMEDAL", 1, 5, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_FORM, 140, 84, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_AL, -1, GRP_PARATIPOELI1_NEWGROUP);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_AL, PPQRY_TIPO1, "A.ROWNAMEAL", "ROWNAMEAL", 1, 5, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_LIST, 84);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_LIST, "Distinta n.");
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_FORM, 12, 108, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_FORM, 68);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DISTINTAN, MyGlb.PANEL_FORM, "Distinta n.");
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_DISTINTAN, -1, GRP_PARATIPOELI1_NEWGROUP);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_DISTINTAN, PPQRY_TIPO1, "A.ROWNAMDISNUM", "ROWNAMDISNUM", 1, 5, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_LIST, 72);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_LIST, "Data Ristampa");
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_FORM, 144, 108, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_FORM, 72);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_DATARISTAMPA, MyGlb.PANEL_FORM, "Dt. Rist.");
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_DATARISTAMPA, -1, GRP_PARATIPOELI1_NEWGROUP);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_DATARISTAMPA, PPQRY_TIPO1, "A.ROWNAMDATDIS", "ROWNAMDATDIS", 6, 12, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, MyGlb.PANEL_LIST, 212, 76, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, MyGlb.PANEL_FORM, 220, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_NEWPANELLABE, -1, GRP_PARATIPOELI1_NEWGROUP);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, MyGlb.PANEL_LIST, 220, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, MyGlb.PANEL_FORM, 220, 124, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_NEWPANELABE1, -1, GRP_PARATIPOELI1_NEWGROUP);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, MyGlb.PANEL_LIST, 68, 40, 124, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARATIPOELI1.SetRect(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, MyGlb.PANEL_FORM, 24, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARATIPOELI1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARATIPOELI1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARATIPOELI1_GROUPLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARATIPOELI1.SetFieldPage(PFL_PARATIPOELI1_GROUPLABEL, -1, -1);
    PAN_PARATIPOELI1.SetFieldPanel(PFL_PARATIPOELI1_GROUPLABEL, -1, "", "GROUPLABEL", 0, 0, 0, -13997);
  }

  private void PAN_PARATIPOELI1_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARATIPOELI1.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as DUALNEWEXPRE, ");
    SQL.append("  'Invio Mandati' as DUALNEWEXPR1 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~ROWNAMETIPO~~ = 1) ");
    SQL.append("and   (~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  2, ");
    SQL.append("  'Invio Ordinativi' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMETIPO~~ = 2) ");
    SQL.append("and   (~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  3, ");
    SQL.append("  'Annulli' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF C ");
    SQL.append("where (~~ROWNAMETIPO~~ = 3) ");
    SQL.append("and   (C.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  4, ");
    SQL.append("  'Annulli' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF D ");
    SQL.append("where (~~ROWNAMETIPO~~ = 4) ");
    SQL.append("and   (D.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  5, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF E ");
    SQL.append("where (~~ROWNAMETIPO~~ = 5) ");
    SQL.append("and   (E.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  6, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF F ");
    SQL.append("where (~~ROWNAMETIPO~~ = 6) ");
    SQL.append("and   (F.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  7, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF G ");
    SQL.append("where (~~ROWNAMETIPO~~ = 7) ");
    SQL.append("and   (G.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  8, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF H ");
    SQL.append("where (~~ROWNAMETIPO~~ = 8) ");
    SQL.append("and   (H.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    PAN_PARATIPOELI1.SetQuery(PPQRY_DUAL, 0, SQL, PFL_PARATIPOELI1_TIPO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  1 as DUALNEWEXPRE, ");
    SQL.append("  'Invio Mandati' as DUALNEWEXPR1 ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  2, ");
    SQL.append("  'Invio Ordinativi' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  3, ");
    SQL.append("  'Annulli' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF C ");
    SQL.append("where (C.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  4, ");
    SQL.append("  'Annulli' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF D ");
    SQL.append("where (D.GESTIONE_ANNULLI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  5, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF E ");
    SQL.append("where (E.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  6, ");
    SQL.append("  'Variazioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF F ");
    SQL.append("where (F.GESTIONE_VARIAZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  7, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF G ");
    SQL.append("where (G.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 1) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  8, ");
    SQL.append("  'Sostituzioni' ");
    SQL.append("from ");
    SQL.append("  PARAMETRI_MINF H ");
    SQL.append("where (H.GESTIONE_SOSTITUZIONI = 'SI' AND ~~TBL_PARATIPOELI1.ROWNAMEMANDA~~ = 2) ");
    PAN_PARATIPOELI1.SetQuery(PPQRY_DUAL, 1, SQL, PFL_PARATIPOELI1_TIPO, "");
    PAN_PARATIPOELI1.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARATIPOELI1.SetIMDB(IMDB, "PQRY_TIPO1", true);
    PAN_PARATIPOELI1.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARATIPOELI1.SetQueryIMDB(PPQRY_TIPO1, IMDBDef15.PQRY_TIPO1_RS, IMDBDef6.TBL_PARATIPOELI1);
    JustLoaded = true;
    PAN_PARATIPOELI1.SetFieldPrimaryIndex(PFL_PARATIPOELI1_TIPO, IMDBDef6.FLD_PARATIPOELI1_ROWNAMETIPO);
    PAN_PARATIPOELI1.SetFieldPrimaryIndex(PFL_PARATIPOELI1_DAL, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEDAL);
    PAN_PARATIPOELI1.SetFieldPrimaryIndex(PFL_PARATIPOELI1_AL, IMDBDef6.FLD_PARATIPOELI1_ROWNAMEAL);
    PAN_PARATIPOELI1.SetFieldPrimaryIndex(PFL_PARATIPOELI1_DISTINTAN, IMDBDef6.FLD_PARATIPOELI1_ROWNAMDISNUM);
    PAN_PARATIPOELI1.SetFieldPrimaryIndex(PFL_PARATIPOELI1_DATARISTAMPA, IMDBDef6.FLD_PARATIPOELI1_ROWNAMDATDIS);
    PAN_PARATIPOELI1.SetMasterTable(0, "PARATIPOELI1");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARATIPOELI1.Status() == 2)
    {
      int oldListQBE = PAN_PARATIPOELI1.iUseListQBE;
      PAN_PARATIPOELI1.iUseListQBE = 0;
      PAN_PARATIPOELI1.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARATIPOELI1.PanelCommand(Glb.PCM_FIND);
      PAN_PARATIPOELI1.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARATIPOELI1) PAN_PARATIPOELI1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARATIPOELI1) PAN_PARATIPOELI1_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARATIPOELI1) PAN_PARATIPOELI1_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARATIPOELI1) PAN_PARATIPOELI1_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARATIPOELI1) PAN_PARATIPOELI1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
