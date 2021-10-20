// **********************************************
// Eliminazione Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EliminazioneVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ES = 0;
  private static int PFL_PARAMETRI_PERIODO = 1;
  private static int PFL_PARAMETRI_ESERCIZIO = 2;
  private static int PFL_PARAMETRI_PROGRUO = 3;
  private static int PFL_PARAMETRI_ETICHEELABOR = 4;
  private static int PFL_PARAMETRI_PERIODLOOKUP = 5;

  private static int PPQRY_PARAMETRI549 = 0;

  private static int PPQRY_PERIODRIACCE = 1;

  private static int PPQRY_CAPUO = 2;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI561(IMDB);
    //
    //
    Init_PQRY_PARAMETRI549(IMDB);
    Init_PQRY_PARAMETRI549_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI561(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI561, 4);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI561, "TBL_PARAMETRI561");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES,12,1,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI561,IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG,1,8,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI561, 0);
  }

  private static void Init_PQRY_PARAMETRI549(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI549, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI549, "PQRY_PARAMETRI549");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGETTES,12,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPROG,1,8,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI549, 0);
  }

  private static void Init_PQRY_PARAMETRI549_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI549_RS, 4);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI549_RS, "PQRY_PARAMETRI549_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGETTES,12,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPROG, "NOMEOGGEPROG");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI549_RS,IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPROG,1,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EliminazioneVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public EliminazioneVariazioni()
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
    FormIdx = MyGlb.FRM_ELIMINVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "2848F571-5F97-4262-9955-921D146263DB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 540;
    DesignHeight = 210;
    set_Caption(new IDVariant("Eliminazione Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 540;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 540-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "36F1FE61-C42A-42E7-B6AC-6DC5E18888D0");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 784, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI561, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELIMINVARIAZ_PARAMETRI549();
      }
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
    if (CallerIdx == MyGlb.FRM_SCELPERIRIAC && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_PERIODO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELPERIRIAC && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_PERIODLOOKUP) {
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
    return (obj instanceof EliminazioneVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EliminazioneVariazioni.class.getName() : (Glb.ClassWithPackage(EliminazioneVariazioni.class) ? EliminazioneVariazioni.class.getName().substring(EliminazioneVariazioni.class.getPackage().getName().length() + 1) : EliminazioneVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      UNLOAD_PARAMEDELETE();
      ((ProposteVariazioniImpegniSubimpegni)MainFrm.GetForm(MyGlb.FRM_PROVARIMPSUB,0)).PAN_PROPOSVARIAZ.PanelCommand(Glb.PCM_REQUERY);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVariazioni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELPERIRIAC)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI, 0, IMDB.Value(IMDBDef8.PQRY_PERIODRIACC1, IMDBDef8.PQSL_PERIODRIACC1_PERIRIACCODI, 0));
        PAN_PARAMETRI.RefreshLookup();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVariazioni", "EndModal", _e);
    }
  }

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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VCODICEPERIO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VANNO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_VPERRIAFILDI = new IDVariant(0,IDVariant.STRING);
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG, 0)))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG, 0, (new IDVariant(-1)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES, 0)))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI, 0)))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1, ");
        SQL.append("  MAX(A.CODICE) as MAXPERRIACOD, ");
        SQL.append("  MAX(CASE WHEN A.TIPO = 'CONS' THEN TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) - 1 ELSE TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')) END) as MAIPRTCYT1YT, ");
        SQL.append("  MAX(CASE WHEN (A.FILTRO_DISP IS NULL) THEN 'EFF' ELSE CASE WHEN A.FILTRO_DISP = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END END) as MIINPRFDEIPR ");
        SQL.append("from ");
        SQL.append("  PERIODI_RIACCERTAMENTI A ");
        SQL.append("where ((TRUNC( SYSDATE ) BETWEEN A.DATA_INIZIO AND NVL(A.DATA_FINE, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          v_VCODICEPERIO = QV.Get("MAXPERRIACOD", IDVariant.INTEGER) ;
          v_VANNO = QV.Get("MAIPRTCYT1YT", IDVariant.INTEGER) ;
          v_VPERRIAFILDI = QV.Get("MIINPRFDEIPR", IDVariant.STRING) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(1)), true))
        {
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI, 0, new IDVariant(v_VCODICEPERIO));
          IMDB.set_Value(IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEESER, 0, new IDVariant(v_VANNO));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVariazioni", "Load", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PERIODO)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI, 0))))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0)))
          {
            IDVariant v_VPERIRIACTIP = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPO as PERIRIACTIPO ");
            SQL.append("from ");
            SQL.append("  PERIODI_RIACCERTAMENTI A ");
            SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VPERIRIACTIP = QV.Get("PERIRIACTIPO", IDVariant.STRING) ;
            }
            QV.Close();
            if (v_VPERIRIACTIP.equals((new IDVariant("CONS")), true))
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0, IDL.Sub(IDL.Year(IDL.Today()), (new IDVariant(1))));
            }
            else
            {
              IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0, IDL.Year(IDL.Today()));
            }
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVariazioni", "ParametriOnUpdatingRow", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGETTES, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Tipo Movimento obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI, 0)))
      {
        IDVariant S = null;
        S = (new IDVariant("Periodo di riaccertamento obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Esercizio Rif. obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (MainFrm.ControlloFaseEsefin(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0)).compareTo((new IDVariant(0)), true)<0)
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Gestione Movimenti non ammessa per l'Esercizio "));
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("<BR/>Non è possibile generare variazioni"));
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_MSG, IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0))), S)); 
        return 0;
      }
      IDVariant v_IMPACCELIMIN = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_SUBIMPELIMIN = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.ELIMINAVARIMPACCRIACC(IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEESER, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGETTES, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPERI, 0), IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGEPROG, 0), v_IMPACCELIMIN, v_SUBIMPELIMIN);
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).equals((new IDVariant("")), true))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Sono state eliminate "));
        IDVariant v_IMPACC = new IDVariant(0,IDVariant.STRING);
        v_IMPACC = (new IDVariant(" Variazioni "));
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI549, IMDBDef14.PQSL_PARAMETRI549_NOMEOGGETTES, 0).equals((new IDVariant("S")), true))
        {
          v_IMPACC = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_IMPACC, (new IDVariant("Impegni"))), (new IDVariant(" e "))), IDL.ToString(v_SUBIMPELIMIN)), (new IDVariant(" "))), (new IDVariant("Variazioni"))), (new IDVariant(" "))), (new IDVariant("SubImpegni")));
        }
        else
        {
          v_IMPACC = IDL.Add(IDL.Add(v_IMPACC, (new IDVariant(" "))), (new IDVariant("Accertamenti")));
        }
        MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<br/>"))), S), IDL.ToString(v_IMPACCELIMIN)), v_IMPACC)); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVariazioni", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Periodo Riacc
  // **********************************************************************
  public int SceltaPeriodoRiacc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Periodo Riacc Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELPERIRIAC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EliminazioneVariazioni", "SceltaPeriodoRiacc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELIMINVARIAZ_PARAMETRI549() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI549_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI561, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI561, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI549_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI549_RS, 0, IMDBDef5.TBL_PARAMETRI561, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI549_RS, 0, 0, IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI549_RS, 1, 0, IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI549_RS, 2, 0, IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI549_RS, 3, 0, IMDBDef5.TBL_PARAMETRI561, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI561, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI561, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI561, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI549_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_PERIODO)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaPeriodoRiacc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_PERIODLOOKUP)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaPeriodoRiacc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "1C04E3F0-7A5D-40EB-89DF-A19FE8F824CE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "ES");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "F3BC5065-F8A4-4542-9342-2D5473C9B6EC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "Periodo Riacc.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, 0 | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "F9A3027B-D776-4653-8208-AA42F9477CC6");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio Rif.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, "36ED7923-68F7-4949-A18B-01652C64BBCE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, "Unità Organizzativa");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "6054E687-5F2A-4855-8BDB-CD1FC5BB7893");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, "EB2BC604-55D5-4931-9093-5D8058A288C7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, "Periodo Riacc.");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_LIST, "ES");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 136, 4, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ES, MyGlb.PANEL_FORM, "ES");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ES, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ES, PPQRY_PARAMETRI549, "A.NOMEOGGETTES", "NOMEOGGETTES", 12, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ES, (new IDVariant("S")), "Impegni/SubImpegni", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_ES, (new IDVariant("E")), "Accertamenti", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 40, 28, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODO, PPQRY_PARAMETRI549, "A.NOMEOGGEPERI", "NOMEOGGEPERI", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio Rif.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 352, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio Rif.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAMETRI549, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_LIST, "Un. Organiz.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, 4, 52, 476, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, 128);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROGRUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROGRUO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROGRUO, PPQRY_PARAMETRI549, "A.NOMEOGGEPROG", "NOMEOGGEPROG", 1, 8, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 356, 100, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 400, 84, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHEELABOR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_LIST, 0, 36, 512, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_LIST, 236);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_LIST, "Periodo Riacc.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_FORM, 40, 28, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_FORM, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PERIODLOOKUP, MyGlb.PANEL_FORM, "Periodo Riacc.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PERIODLOOKUP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PERIODLOOKUP, PPQRY_PERIODRIACCE, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "PERIRIACDESC", 5, 202, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as PERIRIACDESC, ");
    SQL.append("  CASE WHEN NVL(A.FILTRO_DISP, 'DISP_31_12') = 'DISP_31_12' THEN 'FIN' ELSE 'EFF' END as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  PERIODI_RIACCERTAMENTI A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEPERI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_PERIODRIACCE, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_PERIODRIACCE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_PERIODRIACCE, "PERIODI_RIACCERTAMENTI");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as UOCAUOPRUNOR, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  '1' as ORD1, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCR ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~NOMEOGGEPROG~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '-1', ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~NOMEOGGEPROG~~ = -1) ");
    SQL.append("order by 3, 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAPUO, 0, SQL, PFL_PARAMETRI_PROGRUO, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as UOCAUOPRUNOR, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as CODICEUO, ");
    SQL.append("  '1' as ORD1, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_CODICE_UO(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) || ' - ' || ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as DESCR ");
    SQL.append("from ");
    SQL.append("  UO_CAP_UO A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~NOMEOGGETTES~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '-1', ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 3, 2 ");
    PAN_PARAMETRI.SetQuery(PPQRY_CAPUO, 1, SQL, PFL_PARAMETRI_PROGRUO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_CAPUO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI549", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI549, IMDBDef14.PQRY_PARAMETRI549_RS, IMDBDef5.TBL_PARAMETRI561);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ES, IMDBDef5.FLD_PARAMETRI561_NOMEOGGETTES);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PERIODO, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPERI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEESER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROGRUO, IMDBDef5.FLD_PARAMETRI561_NOMEOGGEPROG);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI561");
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
