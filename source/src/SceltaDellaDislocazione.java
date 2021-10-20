// **********************************************
// Scelta Della Dislocazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SceltaDellaDislocazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_UTILIDALSERV = 0;

  private static int PPQRY_1 = 0;
  private static int PPQRY_NEWTABLE15 = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_DISLOCAZIONI_DISLOCAZIONE = 0;
  private static int PFL_DISLOCAZIONI_DESCRIZIONE = 1;
  private static int PFL_DISLOCAZIONI_SUBCONSEGNAT = 2;

  private static int PPQRY_DISLOCAZIONI = 0;


  IDPanel PAN_DISLOCAZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI347(IMDB);
    Init_TBL_NEWTABLE52(IMDB);
    //
    //
    Init_PQRY_DISLOCAZIONI(IMDB);
    Init_PQRY_1(IMDB);
    Init_PQRY_1_RS(IMDB);
    Init_PQRY_NEWTABLE15(IMDB);
    Init_PQRY_NEWTABLE15_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI347(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI347, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI347, "TBL_PARAMETRI347");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI347,IMDBDef1.FLD_PARAMETRI347_PARAMSTABILI, "PARAMSTABILI");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI347,IMDBDef1.FLD_PARAMETRI347_PARAMSTABILI,5,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI347,IMDBDef1.FLD_PARAMETRI347_PARUTIDALSER, "PARUTIDALSER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI347,IMDBDef1.FLD_PARAMETRI347_PARUTIDALSER,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI347,IMDBDef1.FLD_PARAMETRI347_PARAPROGSERV, "PARAPROGSERV");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI347,IMDBDef1.FLD_PARAMETRI347_PARAPROGSERV,1,9,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI347, 0);
  }

  private static void Init_TBL_NEWTABLE52(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_NEWTABLE52, 3);
    IMDB.set_TblCode(IMDBDef1.TBL_NEWTABLE52, "TBL_NEWTABLE52");
    IMDB.set_FldCode(IMDBDef1.TBL_NEWTABLE52,IMDBDef1.FLD_NEWTABLE52_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef1.TBL_NEWTABLE52,IMDBDef1.FLD_NEWTABLE52_ROWNAMETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_NEWTABLE52,IMDBDef1.FLD_NEWTABLE52_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef1.TBL_NEWTABLE52,IMDBDef1.FLD_NEWTABLE52_ROWNAMEORDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_NEWTABLE52,IMDBDef1.FLD_NEWTABLE52_ROWNAMEINFO, "ROWNAMEINFO");
    IMDB.SetFldParams(IMDBDef1.TBL_NEWTABLE52,IMDBDef1.FLD_NEWTABLE52_ROWNAMEINFO,1,1,0);
    IMDB.TblAddNew(IMDBDef1.TBL_NEWTABLE52, 0);
  }

  private static void Init_PQRY_DISLOCAZIONI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_DISLOCAZIONI, 4);
    IMDB.set_TblCode(IMDBDef7.PQRY_DISLOCAZIONI, "PQRY_DISLOCAZIONI");
    IMDB.set_FldCode(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_STABILIMENTO, "STABILIMENTO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_STABILIMENTO,5,4,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_DISLOCAZIONE, "DISLOCAZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_DISLOCAZIONE,5,6,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_SUB_CONSEGNATARIO, "SUB_CONSEGNATARIO");
    IMDB.SetFldParams(IMDBDef7.PQRY_DISLOCAZIONI,IMDBDef7.PQSL_DISLOCAZIONI_SUB_CONSEGNATARIO,5,40,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_DISLOCAZIONI, 0);
  }

  private static void Init_PQRY_1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_1, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_1, "PQRY_1");
    IMDB.set_FldCode(IMDBDef7.PQRY_1,IMDBDef7.PQSL_1_PARUTIDALSER, "PARUTIDALSER");
    IMDB.SetFldParams(IMDBDef7.PQRY_1,IMDBDef7.PQSL_1_PARUTIDALSER,5,2,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_1, 0);
  }

  private static void Init_PQRY_1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_1_RS, 1);
    IMDB.set_TblCode(IMDBDef7.PQRY_1_RS, "PQRY_1_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_1_RS,IMDBDef7.PQSL_1_PARUTIDALSER, "PARUTIDALSER");
    IMDB.SetFldParams(IMDBDef7.PQRY_1_RS,IMDBDef7.PQSL_1_PARUTIDALSER,5,2,0);
  }

  private static void Init_PQRY_NEWTABLE15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_NEWTABLE15, 2);
    IMDB.set_TblCode(IMDBDef7.PQRY_NEWTABLE15, "PQRY_NEWTABLE15");
    IMDB.set_FldCode(IMDBDef7.PQRY_NEWTABLE15,IMDBDef7.PQSL_NEWTABLE15_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef7.PQRY_NEWTABLE15,IMDBDef7.PQSL_NEWTABLE15_ROWNAMETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_NEWTABLE15,IMDBDef7.PQSL_NEWTABLE15_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef7.PQRY_NEWTABLE15,IMDBDef7.PQSL_NEWTABLE15_ROWNAMEORDIN,1,1,0);
    IMDB.TblAddNew(IMDBDef7.PQRY_NEWTABLE15, 0);
  }

  private static void Init_PQRY_NEWTABLE15_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef7.PQRY_NEWTABLE15_RS, 2);
    IMDB.set_TblCode(IMDBDef7.PQRY_NEWTABLE15_RS, "PQRY_NEWTABLE15_RS");
    IMDB.set_FldCode(IMDBDef7.PQRY_NEWTABLE15_RS,IMDBDef7.PQSL_NEWTABLE15_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef7.PQRY_NEWTABLE15_RS,IMDBDef7.PQSL_NEWTABLE15_ROWNAMETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef7.PQRY_NEWTABLE15_RS,IMDBDef7.PQSL_NEWTABLE15_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef7.PQRY_NEWTABLE15_RS,IMDBDef7.PQSL_NEWTABLE15_ROWNAMEORDIN,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SceltaDellaDislocazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public SceltaDellaDislocazione()
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
    FormIdx = MyGlb.FRM_SCELDELLDISL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9EA1573D-A1E6-4818-BA1F-24CF384690C0";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 644;
    DesignHeight = 418;
    set_Caption(new IDVariant("Scelta Della Dislocazione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 644;
    Frames[1].Height = 392;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.153061;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 644;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 644-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3F0A73C8-FEA8-4693-B6F2-E03F85FC0E71");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 112, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 644;
    Frames[3].Height = 332;
    Frames[3].Caption = "Dislocazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 332;
    PAN_DISLOCAZIONI = new IDPanel(w, this, 3, "PAN_DISLOCAZIONI");
    Frames[3].Content = PAN_DISLOCAZIONI;
    PAN_DISLOCAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISLOCAZIONI.VS = MainFrm.VisualStyleList;
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 644-MyGlb.PAN_OFFS_X, 332-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISLOCAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2B15BE22-D3E9-458A-A869-7891374B1562");
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 4, 600, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISLOCAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISLOCAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISLOCAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISLOCAZIONI.InitStatus = 2;
    PAN_DISLOCAZIONI_Init();
    PAN_DISLOCAZIONI_InitFields();
    PAN_DISLOCAZIONI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAMETRI347, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELDELLDISL_1();
      }
      if (IMDB.TblModified(IMDBDef1.TBL_NEWTABLE52, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SCELDELLDISL_NEWTABLE15();
      }
      PAN_DISLOCAZIONI.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    return (obj instanceof SceltaDellaDislocazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SceltaDellaDislocazione.class.getName() : (Glb.ClassWithPackage(SceltaDellaDislocazione.class) ? SceltaDellaDislocazione.class.getName().substring(SceltaDellaDislocazione.class.getPackage().getName().length() + 1) : SceltaDellaDislocazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Dislocazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISLOCAZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DISLOCAZIONI);
      // 
      // Dislocazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DISLOCAZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_DISLOCAZIONI_DESCRIZIONE,(new IDVariant(PAN_DISLOCAZIONI.FieldText(PFL_DISLOCAZIONI_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDellaDislocazione", "DislocazioniOnDynamicPropertiesEvent", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI347, IMDBDef1.FLD_PARAMETRI347_PARAMSTABILI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI347, IMDBDef1.FLD_PARAMETRI347_PARUTIDALSER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI347, IMDBDef1.FLD_PARAMETRI347_PARAPROGSERV, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDellaDislocazione", "UnloadEvent", _e);
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
    IDVariant v_ISPRESENTESE1 = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_ISPRESENTESE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      // 
      // controllo se esiste il record di T99 per l'esercizio del contesto
      // 
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  DECODE(A.ESERCIZIO, to_number(NULL), 0, -1) as IFEQT9ESNUFT ");
        SQL.append("from ");
        SQL.append("  T99 A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_ISPRESENTESE1 = QV.Get("IFEQT9ESNUFT", IDVariant.INTEGER) ;
        }
        QV.Close();
      }
      if (v_ISPRESENTESE1.equals((new IDVariant(0)), true))
      {
        // 
        // controllo se esiste esiste il record di T99 per l'esercizio precedente (esercizio-1)
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  DECODE(A.ESERCIZIO, to_number(NULL), 0, -1) as IFEQT9ESNUFT ");
          SQL.append("from ");
          SQL.append("  T99 A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_ISPRESENTESE = QV.Get("IFEQT9ESNUFT", IDVariant.INTEGER) ;
          }
          QV.Close();
        }
        if (v_ISPRESENTESE.booleanValue())
        {
          // 
          // se esiste copio i dati della row dell'esercizio precedente nella row dell'esercizio del contesto
          // 
          {
            try
            {
              // BeginTrans();
              // 
              // se non esiste
              // 
              {
                SQL = new StringBuffer();
                SQL.append("insert into T99 ");
                SQL.append("( ");
                SQL.append("  ESERCIZIO, ");
                SQL.append("  TIPO_TOTALE_FC ");
                SQL.append(") ");
                SQL.append("values ");
                SQL.append("( ");
                SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
                SQL.append("  0 ");
                SQL.append(") ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
              // 
              // se invece esiste copo i dati della row dell'esercizio precedente in quella dell'esercizio del contesto
              // 
              {
                SQL = new StringBuffer();
                SQL.append("insert into T99 ");
                SQL.append("( ");
                SQL.append("  ESERCIZIO, ");
                SQL.append("  VARCOM_OBBLIG, ");
                SQL.append("  PROTOCOLLO_AUTO, ");
                SQL.append("  REG_IVA_AUTO, ");
                SQL.append("  CC_OBBLIG, ");
                SQL.append("  LIQ_AUTO, ");
                SQL.append("  DIFFERENZA_MAG, ");
                SQL.append("  CONTROLLO_CF, ");
                SQL.append("  CONTROLLO_IMPUTAZIONE, ");
                SQL.append("  TIPO_BIL_BUDGET, ");
                SQL.append("  TIPO_TOTALE_FC ");
                SQL.append(") ");
                SQL.append("select ");
                SQL.append("  A.ESERCIZIO + 1, ");
                SQL.append("  A.VARCOM_OBBLIG, ");
                SQL.append("  A.PROTOCOLLO_AUTO, ");
                SQL.append("  A.REG_IVA_AUTO, ");
                SQL.append("  A.CC_OBBLIG, ");
                SQL.append("  A.LIQ_AUTO, ");
                SQL.append("  A.DIFFERENZA_MAG, ");
                SQL.append("  A.CONTROLLO_CF, ");
                SQL.append("  A.CONTROLLO_IMPUTAZIONE, ");
                SQL.append("  A.TIPO_BIL_BUDGET, ");
                SQL.append("  0 ");
                SQL.append("from ");
                SQL.append("  T99 A ");
                SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
                MainFrm.Cf4armDBObject.DBO().Execute(SQL);
              }
            }
            catch (Exception e10)
            {
              IDVariant v_AERRORMESSAG = new IDVariant(0,IDVariant.STRING);
              v_AERRORMESSAG = (new IDVariant("Errore di accesso al database!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AERRORMESSAG); 
              // RollbackTrans();
            }
            // CommitTrans();
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SceltaDellaDislocazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Master Query
  // Primary record source for panel data
  // **********************************************************************
  private void SCELDELLDISL_1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_1_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI347, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAMETRI347, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_1_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_1_RS, 0, IMDBDef1.TBL_PARAMETRI347, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_1_RS, 0, 0, IMDBDef1.TBL_PARAMETRI347, IMDBDef1.FLD_PARAMETRI347_PARUTIDALSER, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAMETRI347, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAMETRI347, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAMETRI347, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_1_RS, 0);
  }

  // **********************************************************************
  // New Table
  // Primary record source for panel data
  // **********************************************************************
  private void SCELDELLDISL_NEWTABLE15() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef7.PQRY_NEWTABLE15_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_NEWTABLE52, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_NEWTABLE52, 0))
    {
      IMDB.TblAddNew(IMDBDef7.PQRY_NEWTABLE15_RS, 0);
      IMDB.TblLinkRow(IMDBDef7.PQRY_NEWTABLE15_RS, 0, IMDBDef1.TBL_NEWTABLE52, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_NEWTABLE15_RS, 0, 0, IMDBDef1.TBL_NEWTABLE52, IMDBDef1.FLD_NEWTABLE52_ROWNAMETIPO, 0);
      IMDB.TblLinkField(IMDBDef7.PQRY_NEWTABLE15_RS, 1, 0, IMDBDef1.TBL_NEWTABLE52, IMDBDef1.FLD_NEWTABLE52_ROWNAMEORDIN, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_NEWTABLE52, 0);
      if (IMDB.Eof(IMDBDef1.TBL_NEWTABLE52, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_NEWTABLE52, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef7.PQRY_NEWTABLE15_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISLOCAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISLOCAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISLOCAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISLOCAZIONI, Cancel);
    // Stub
  }

  private void PAN_DISLOCAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISLOCAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISLOCAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISLOCAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISLOCAZIONI_Init()
  {

    PAN_DISLOCAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISLOCAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISLOCAZIONI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_DISLOCAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, "3E56CA00-BCB3-4AB3-8174-89D17F37460B");
    PAN_DISLOCAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, "Dislocazione");
    PAN_DISLOCAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, "");
    PAN_DISLOCAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DISLOCAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_VERTICAL | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DISLOCAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, "CE5DE8B7-F87C-4F1D-B8EC-690F444B3A00");
    PAN_DISLOCAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, "Descrizione");
    PAN_DISLOCAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, "");
    PAN_DISLOCAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DISLOCAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_DISLOCAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, "AEA04EB1-EE17-4204-9108-D86232BA9981");
    PAN_DISLOCAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, "Sub Consegnatario");
    PAN_DISLOCAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, "Sub Consegnatario");
    PAN_DISLOCAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.VIS_NORMALFIELDS);
    PAN_DISLOCAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISLOCAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_LIST, 0, 40, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISLOCAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DISLOCAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DISLOCAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_LIST, "Dislocazione");
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_FORM, 4, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISLOCAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_FORM, 96);
    PAN_DISLOCAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DISLOCAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DISLOCAZIONE, MyGlb.PANEL_FORM, "Dislocazione");
    PAN_DISLOCAZIONI.SetFieldPage(PFL_DISLOCAZIONI_DISLOCAZIONE, -1, -1);
    PAN_DISLOCAZIONI.SetFieldPanel(PFL_DISLOCAZIONI_DISLOCAZIONE, PPQRY_DISLOCAZIONI, "A.DISLOCAZIONE", "DISLOCAZIONE", 5, 6, 0, -13997);
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 40, 288, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISLOCAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_DISLOCAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DISLOCAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISLOCAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_DISLOCAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DISLOCAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DISLOCAZIONI.SetFieldPage(PFL_DISLOCAZIONI_DESCRIZIONE, -1, -1);
    PAN_DISLOCAZIONI.SetFieldPanel(PFL_DISLOCAZIONI_DESCRIZIONE, PPQRY_DISLOCAZIONI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_LIST, 392, 40, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISLOCAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_LIST, 120);
    PAN_DISLOCAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_LIST, 1);
    PAN_DISLOCAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_LIST, "Sub Consegnatario");
    PAN_DISLOCAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_FORM, 4, 76, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISLOCAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_FORM, 120);
    PAN_DISLOCAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_FORM, 1);
    PAN_DISLOCAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISLOCAZIONI_SUBCONSEGNAT, MyGlb.PANEL_FORM, "Sub Consegnatario");
    PAN_DISLOCAZIONI.SetFieldPage(PFL_DISLOCAZIONI_SUBCONSEGNAT, -1, -1);
    PAN_DISLOCAZIONI.SetFieldPanel(PFL_DISLOCAZIONI_SUBCONSEGNAT, PPQRY_DISLOCAZIONI, "A.SUB_CONSEGNATARIO", "SUB_CONSEGNATARIO", 5, 40, 0, -13997);
  }

  private void PAN_DISLOCAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISLOCAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISLOCAZIONI.SetIMDB(IMDB, "PQRY_DISLOCAZIONI", true);
    PAN_DISLOCAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "DISLOCAZIONI");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.STABILIMENTO as STABILIMENTO, ");
    SQL.append("  A.DISLOCAZIONE as DISLOCAZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SUB_CONSEGNATARIO as SUB_CONSEGNATARIO ");
    PAN_DISLOCAZIONI.SetQuery(PPQRY_DISLOCAZIONI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  DISLOCAZIONI A, ");
    SQL.append("  DISLOCAZIONI_BENI B ");
    PAN_DISLOCAZIONI.SetQuery(PPQRY_DISLOCAZIONI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.STABILIMENTO = B.STABILIMENTO(+)) ");
    SQL.append("and   (A.DISLOCAZIONE = B.DISLOCAZIONE(+)) ");
    SQL.append("and   (A.STABILIMENTO = ~~TBL_PARAMETRI347.PARAMSTABILI~~) ");
    SQL.append("and   (B.PROGR_SERVIZIO = DECODE(~~PQRY_1.PARUTIDALSER~~, 'Si', ~~TBL_PARAMETRI347.PARAPROGSERV~~, B.PROGR_SERVIZIO)) ");
    PAN_DISLOCAZIONI.SetQuery(PPQRY_DISLOCAZIONI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISLOCAZIONI.SetQuery(PPQRY_DISLOCAZIONI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISLOCAZIONI.SetQuery(PPQRY_DISLOCAZIONI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DESCRIZIONE ");
    PAN_DISLOCAZIONI.SetQuery(PPQRY_DISLOCAZIONI, 5, SQL, -1, "");
    PAN_DISLOCAZIONI.SetQueryDB(PPQRY_DISLOCAZIONI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISLOCAZIONI.SetMasterTable(0, "DISLOCAZIONI");
    PAN_DISLOCAZIONI.AddToSortList(PFL_DISLOCAZIONI_DESCRIZIONE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISLOCAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_DISLOCAZIONI.iUseListQBE;
      PAN_DISLOCAZIONI.iUseListQBE = 0;
      PAN_DISLOCAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISLOCAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_DISLOCAZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, "B280ACF4-C324-4198-9660-881067F8F338");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, "Utilizzate Dal Servizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_LIST, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_LIST, "Utilizzate Dal Servizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_FORM, 16, 8, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UTILIDALSERV, MyGlb.PANEL_FORM, "Utiliz. Dal Servizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UTILIDALSERV, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UTILIDALSERV, PPQRY_1, "A.PARUTIDALSER", "PARUTIDALSER", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UTILIDALSERV, (new IDVariant("Si")), "Utilizzate dal Servizio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UTILIDALSERV, (new IDVariant("No")), "Dislocazioni dello stabilimento", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_1", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_1, IMDBDef7.PQRY_1_RS, IMDBDef1.TBL_PARAMETRI347);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UTILIDALSERV, IMDBDef1.FLD_PARAMETRI347_PARUTIDALSER);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI347");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISLOCAZIONI) PAN_DISLOCAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISLOCAZIONI) PAN_DISLOCAZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISLOCAZIONI) PAN_DISLOCAZIONI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISLOCAZIONI) PAN_DISLOCAZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISLOCAZIONI) PAN_DISLOCAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
