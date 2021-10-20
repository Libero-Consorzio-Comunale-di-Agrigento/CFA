// **********************************************
// Monitoraggio Preventivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MonitoraggioPreventivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_STANZIAMENTI = 0;

  private static int PFL_PARAM_DATAELABORAZ = 0;
  private static int PFL_PARAM_TIPORICALCOL = 1;
  private static int PFL_PARAM_TIPOMONISTAN = 2;
  private static int PFL_PARAM_ELABORA = 3;

  private static int PPQRY_PARAM79 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM103(IMDB);
    //
    //
    Init_PQRY_PARAM79(IMDB);
    Init_PQRY_PARAM79_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM103(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAM103, 4);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAM103, "TBL_PARAM103");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMTIMOST, "ROWNAMTIMOST");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMTIMOST,5,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMTIPRIC, "ROWNAMTIPRIC");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMTIPRIC,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMTIMOCA, "ROWNAMTIMOCA");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAM103,IMDBDef6.FLD_PARAM103_ROWNAMTIMOCA,5,5,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAM103, 0);
  }

  private static void Init_PQRY_PARAM79(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAM79, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAM79, "PQRY_PARAM79");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM79,IMDBDef16.PQSL_PARAM79_ROWNAMTIPRIC, "ROWNAMTIPRIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM79,IMDBDef16.PQSL_PARAM79_ROWNAMTIPRIC,5,49,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM79,IMDBDef16.PQSL_PARAM79_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM79,IMDBDef16.PQSL_PARAM79_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM79,IMDBDef16.PQSL_PARAM79_ROWNAMTIMOST, "ROWNAMTIMOST");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM79,IMDBDef16.PQSL_PARAM79_ROWNAMTIMOST,5,5,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PARAM79, 0);
  }

  private static void Init_PQRY_PARAM79_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PARAM79_RS, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_PARAM79_RS, "PQRY_PARAM79_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM79_RS,IMDBDef16.PQSL_PARAM79_ROWNAMTIPRIC, "ROWNAMTIPRIC");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM79_RS,IMDBDef16.PQSL_PARAM79_ROWNAMTIPRIC,5,49,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM79_RS,IMDBDef16.PQSL_PARAM79_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM79_RS,IMDBDef16.PQSL_PARAM79_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PARAM79_RS,IMDBDef16.PQSL_PARAM79_ROWNAMTIMOST, "ROWNAMTIMOST");
    IMDB.SetFldParams(IMDBDef16.PQRY_PARAM79_RS,IMDBDef16.PQSL_PARAM79_ROWNAMTIMOST,5,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MonitoraggioPreventivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public MonitoraggioPreventivo()
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
    FormIdx = MyGlb.FRM_MONITOPREVEN;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4BEEBB04-A617-4BFE-9FF2-BCA0973611C2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 512;
    DesignHeight = 254;
    set_Caption(new IDVariant("Monitoraggio Preventivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 512;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0D79E73B-17D0-4046-8E27-B84A39D04447");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 740, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
    // Resetto il fuoco perch� le tabbed view lo possono modificare
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAM103, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MONITOPREVEN_PARAM79();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof MonitoraggioPreventivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MonitoraggioPreventivo.class.getName() : (Glb.ClassWithPackage(MonitoraggioPreventivo.class) ? MonitoraggioPreventivo.class.getName().substring(MonitoraggioPreventivo.class.getPackage().getName().length() + 1) : MonitoraggioPreventivo.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_TIPORICALCOL)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef16.PQRY_PARAM79, IMDBDef16.PQSL_PARAM79_ROWNAMTIPRIC, 0).equals((new IDVariant("RT")), true))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MonitoraggioPreventivo", "ParamOnUpdatingRow", _e);
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
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_TIPOMONISTAN = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1, ");
      SQL.append("  MIN(A.TIPO_MONIT) as MIWRPASTTIMO ");
      SQL.append("from ");
      SQL.append("  WRK_PATTO_STAMPA A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.TIPO_MONIT <> 'DATI') ");
      SQL.append("and   (A.TIPO_STAMPA = 'PS1') ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        v_TIPOMONISTAN = QV.Get("MIWRPASTTIMO", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMDATELA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMTIPRIC, 0, (new IDVariant("RT")));
      IMDB.set_Value(IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMTIMOST, 0, (new IDVariant("PSIM")));
      IMDB.set_Value(IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMTIMOCA, 0, new IDVariant(v_TIPOMONISTAN));
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_PARAM.ClearValueList(PFL_PARAM_TIPORICALCOL);
      PAN_PARAM.SetValueListItem(PFL_PARAM_TIPORICALCOL, (new IDVariant("RT")), ((new IDVariant("RT")).equals((new IDVariant("RT")))? new IDVariant("Ricalcola tutto") : (new IDVariant("RT")).equals((new IDVariant("RE")))? new IDVariant("Ricalcola effettivo") : (new IDVariant("RT")).equals((new IDVariant()))? new IDVariant("Mantieni dati esistenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      PAN_PARAM.SetValueListItem(PFL_PARAM_TIPORICALCOL, (new IDVariant()), ((new IDVariant()).equals((new IDVariant("RT")))? new IDVariant("Ricalcola tutto") : (new IDVariant()).equals((new IDVariant("RE")))? new IDVariant("Ricalcola effettivo") : (new IDVariant()).equals((new IDVariant()))? new IDVariant("Mantieni dati esistenti") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MonitoraggioPreventivo", "LoadEvent", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PARAM79, IMDBDef16.PQSL_PARAM79_ROWNAMTIPRIC, 0))))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.WORKPATTOMONITORAGGIOPREV(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("PS1")), IMDB.Value(IMDBDef16.PQRY_PARAM79, IMDBDef16.PQSL_PARAM79_ROWNAMTIMOST, 0), IMDB.Value(IMDBDef16.PQRY_PARAM79, IMDBDef16.PQSL_PARAM79_ROWNAMDATELA, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
      }
      IMDB.set_Value(IMDBDef6.TBL_PARAM106, IMDBDef6.FLD_PARAM106_ROWNAMTIMOST, 0, ((IMDB.Value(IMDBDef16.PQRY_PARAM79, IMDBDef16.PQSL_PARAM79_ROWNAMTIPRIC, 0).equals((new IDVariant("RT"))))?IMDB.Value(IMDBDef16.PQRY_PARAM79, IMDBDef16.PQSL_PARAM79_ROWNAMTIMOST, 0):IMDB.Value(IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMTIMOCA, 0)));
      IMDB.set_Value(IMDBDef6.TBL_PARAM106, IMDBDef6.FLD_PARAM106_ROWNAMDATELA, 0, IMDB.Value(IMDBDef16.PQRY_PARAM79, IMDBDef16.PQSL_PARAM79_ROWNAMDATELA, 0));
      MainFrm.Show(MyGlb.FRM_REPOMONIPREV, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MonitoraggioPreventivo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void MONITOPREVEN_PARAM79() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PARAM79_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM103, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAM103, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PARAM79_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PARAM79_RS, 0, IMDBDef6.TBL_PARAM103, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAM79_RS, 0, 0, IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMTIPRIC, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAM79_RS, 1, 0, IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PARAM79_RS, 2, 0, IMDBDef6.TBL_PARAM103, IMDBDef6.FLD_PARAM103_ROWNAMTIMOST, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAM103, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAM103, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAM103, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PARAM79_RS, 0);
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
  // cio� quando viene portata in primo piano
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, "6A134E95-67F3-44B6-8B25-FE8E117CE178");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, "Stanziamenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, MyGlb.PANEL_LIST, 0, -9999, 84, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, MyGlb.PANEL_FORM, 52, 91, 424, 49, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, 0, 75);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_STANZIAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, "4E455882-960B-4DD3-ABCF-671ED74A1553");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, "FB11513D-ED4E-42B6-9C51-B85A95250A8D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, "Sono gi� presenti dati per il monitoraggio dell'esercizio. Come procedere?");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, "1E9BA04E-6D6D-4D77-BD26-D7F40F07C22D");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, "Tipo Monit Stanz");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "DC7253FF-6545-4053-9016-731E26ABF9DA");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, 52, 12, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATAELABORAZ, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATAELABORAZ, PPQRY_PARAM79, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 49, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_LIST, "Sono gi� presenti dati per il monitoraggio dell'esercizio. Come procedere?");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_FORM, 52, 40, 424, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_FORM, 20);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPORICALCOL, MyGlb.PANEL_FORM, "Sono gi� presenti dati per il monitoraggio dell'esercizio. Come procedere?");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPORICALCOL, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPORICALCOL, PPQRY_PARAM79, "A.ROWNAMTIPRIC", "ROWNAMTIPRIC", 5, 49, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPORICALCOL, (new IDVariant("RT")), "Ricalcola tutto", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPORICALCOL, (new IDVariant("RE")), "Ricalcola effettivo", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPORICALCOL, (new IDVariant()), "Mantieni dati esistenti", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_LIST, "Tp. Mon. St.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_FORM, 56, 116, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_FORM, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOMONISTAN, MyGlb.PANEL_FORM, "Tp. Mon. St.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOMONISTAN, -1, GRP_PARAM_STANZIAMENTI);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOMONISTAN, PPQRY_PARAM79, "A.ROWNAMTIMOST", "ROWNAMTIMOST", 5, 5, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOMONISTAN, (new IDVariant("PSIM")), "da Simulato", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOMONISTAN, (new IDVariant("PEFF")), "da Effettivo", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOMONISTAN, (new IDVariant("PEVP")), "da Effettivo con Var. Provvisorie", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 264, 88, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 392, 164, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM79", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM79, IMDBDef16.PQRY_PARAM79_RS, IMDBDef6.TBL_PARAM103);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATAELABORAZ, IMDBDef6.FLD_PARAM103_ROWNAMDATELA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPORICALCOL, IMDBDef6.FLD_PARAM103_ROWNAMTIPRIC);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOMONISTAN, IMDBDef6.FLD_PARAM103_ROWNAMTIMOST);
    PAN_PARAM.SetMasterTable(0, "PARAM103");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
