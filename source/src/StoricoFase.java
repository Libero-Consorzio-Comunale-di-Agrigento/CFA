// **********************************************
// Storico Fase
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class StoricoFase extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int GRP_STORICOFASE_PESOINDICATO = 0;
  private static int GRP_STORICOFASE_PESOOBIETTIV = 1;

  private static int PFL_STORICOFASE_RESPONSABILE = 0;
  private static int PFL_STORICOFASE_STATO = 1;
  private static int PFL_STORICOFASE_DESCRIZIONE = 2;
  private static int PFL_STORICOFASE_PEROBIETRAG1 = 3;
  private static int PFL_STORICOFASE_PERSOGLIRAG1 = 4;
  private static int PFL_STORICOFASE_PEROBIETRAGG = 5;
  private static int PFL_STORICOFASE_PERSOGLIRAGG = 6;
  private static int PFL_STORICOFASE_PROGUNITORGA = 7;
  private static int PFL_STORICOFASE_SCHEDOBIETID = 8;
  private static int PFL_STORICOFASE_PROGRESSIVO = 9;
  private static int PFL_STORICOFASE_PESOINDICATO = 10;
  private static int PFL_STORICOFASE_PESOOB = 11;
  private static int PFL_STORICOFASE_CALCOLPERCEN = 12;

  private static int PPQRY_POLSCHEDOBI6 = 0;


  IDPanel PAN_STORICOFASE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS23(IMDB);
    //
    //
    Init_PQRY_POLSCHEDOBI6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS23(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARS23, 2);
    IMDB.set_TblCode(IMDBDef4.TBL_PARS23, "TBL_PARS23");
    IMDB.set_FldCode(IMDBDef4.TBL_PARS23,IMDBDef4.FLD_PARS23_ROWNAMECOMPE, "ROWNAMECOMPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS23,IMDBDef4.FLD_PARS23_ROWNAMECOMPE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARS23,IMDBDef4.FLD_PARS23_ROWNAMFAOBID, "ROWNAMFAOBID");
    IMDB.SetFldParams(IMDBDef4.TBL_PARS23,IMDBDef4.FLD_PARS23_ROWNAMFAOBID,1,10,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARS23, 0);
  }

  private static void Init_PQRY_POLSCHEDOBI6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLSCHEDOBI6, 12);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLSCHEDOBI6, "PQRY_POLSCHEDOBI6");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_REPOSCSCOBID, "REPOSCSCOBID");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_REPOSCSCOBID,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_STATO,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_DESCRIZIONE,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_RECORDRESPON, "RECORDRESPON");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_RECORDRESPON,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_ANNULLATA, "ANNULLATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_ANNULLATA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_INDICATORI_TARGET, "PESO_INDICATORI_TARGET");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_INDICATORI_TARGET,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_INDICATORI_SOGLIA, "PESO_INDICATORI_SOGLIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_INDICATORI_SOGLIA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_TARGET, "PESO_TARGET");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_TARGET,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_SOGLIA_RAGGIUNTA, "PESO_SOGLIA_RAGGIUNTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PESO_SOGLIA_RAGGIUNTA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_CALCOLO_PERCENTUALE, "CALCOLO_PERCENTUALE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLSCHEDOBI6,IMDBDef12.PQSL_POLSCHEDOBI6_CALCOLO_PERCENTUALE,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLSCHEDOBI6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public StoricoFase(MyWebEntryPoint w, IMDBObj imdb)
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
  public StoricoFase()
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
    FormIdx = MyGlb.FRM_STORICOFASE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F7805E78-19C3-4EDB-B705-CE9BDD68B9C8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 386;
    set_Caption(new IDVariant("Storico Fase"));
    //
    Frames = new AFrame[3];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 360;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "5706840D-8FE2-4529-A50B-46A3B35772D1";
    TAB_TAB.SetItemCount(1);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Storico Fase";
    Frames[2].Parent = this;
    PAN_STORICOFASE = new IDPanel(w, this, 2, "PAN_STORICOFASE");
    Frames[2].Content = PAN_STORICOFASE;
    PAN_STORICOFASE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_STORICOFASE.VS = MainFrm.VisualStyleList;
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3190C2F0-CBC7-4914-B381-948B9A11DA53");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 564, 228, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 44);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_STORICOFASE.InitStatus = 2;
    PAN_STORICOFASE_Init();
    PAN_STORICOFASE_InitFields();
    PAN_STORICOFASE_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Storico Fase", "");
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
      PAN_STORICOFASE.UpdatePanel(MainFrm);
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
    return (obj instanceof StoricoFase);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? StoricoFase.class.getName() : (Glb.ClassWithPackage(StoricoFase.class) ? StoricoFase.class.getName().substring(StoricoFase.class.getPackage().getName().length() + 1) : StoricoFase.class.getName()));
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
        IMDB.set_Value(IMDBDef4.TBL_PARS23, IMDBDef4.FLD_PARS23_ROWNAMECOMPE, 0, (new IDVariant("NO")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARS23, IMDBDef4.FLD_PARS23_ROWNAMECOMPE, 0, (new IDVariant("SI")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoFase", "CalcolaCompetenza", _e);
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
      PAN_STORICOFASE.set_ToolTip(Glb.OBJ_FIELD,PFL_STORICOFASE_DESCRIZIONE,(new IDVariant(PAN_STORICOFASE.FieldText(PFL_STORICOFASE_DESCRIZIONE))).stringValue()); 
      PAN_STORICOFASE.set_ToolTip(Glb.OBJ_FIELD,PFL_STORICOFASE_RESPONSABILE,(new IDVariant(PAN_STORICOFASE.FieldText(PFL_STORICOFASE_RESPONSABILE))).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoFase", "Tooltip", _e);
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
    IDVariant v_DESC = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      CalcolaCompetenza();
      if (IMDB.Value(IMDBDef4.TBL_PARS23, IMDBDef4.FLD_PARS23_ROWNAMECOMPE, 0).equals((new IDVariant("NO")), true))
      {
        PAN_STORICOFASE.SetFlags (Glb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_STORICOFASE.set_Header(Glb.OBJ_FIELD,PFL_STORICOFASE_PEROBIETRAG1, (new IDVariant("Obiettivo")).stringValue());
      PAN_STORICOFASE.set_Header(Glb.OBJ_FIELD,PFL_STORICOFASE_PERSOGLIRAG1, (new IDVariant("Soglia")).stringValue());
      PAN_STORICOFASE.set_Header(Glb.OBJ_FIELD,PFL_STORICOFASE_PEROBIETRAGG, (new IDVariant("Obiettivo")).stringValue());
      PAN_STORICOFASE.set_Header(Glb.OBJ_FIELD,PFL_STORICOFASE_PERSOGLIRAGG, (new IDVariant("Soglia")).stringValue());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as POLFASOBIDES ");
      SQL.append("from ");
      SQL.append("  POL_FASI_OBIETTIVO A ");
      SQL.append("where (A.FASE_OBIETTIVO_ID = " + IDL.CSql(IMDB.Value(IMDBDef4.TBL_PARS23, IMDBDef4.FLD_PARS23_ROWNAMFAOBID, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_DESC = QV.Get("POLFASOBIDES", IDVariant.STRING) ;
      }
      QV.Close();
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoFase", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Storico Fase On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_STORICOFASE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_STORICOFASE);
      // 
      // Storico Fase On Dynamic Properties Event Body
      // Procedure Body
      // 
      Tooltip();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoFase", "StoricoFaseOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Storico Fase On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_STORICOFASE_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Storico Fase On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(131072)), true))
      {
        if (UserOperation.booleanValue())
        {
          Cancel.set((new IDVariant(-1)));
          new IDVariant(PAN_STORICOFASE.ExportData((new IDVariant(-1)).booleanValue(),false)); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("StoricoFase", "StoricoFaseOnCommandEvent", _e);
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
  private void PAN_STORICOFASE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_STORICOFASE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_STORICOFASE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_STORICOFASE, Cancel);
    // Stub
  }

  private void PAN_STORICOFASE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_STORICOFASE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_STORICOFASE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_STORICOFASE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_STORICOFASE_Init()
  {

    PAN_STORICOFASE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_STORICOFASE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, "B7673A5F-B982-450F-A88C-7AD75D9C5169");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, "Peso Indicatori");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, MyGlb.PANEL_LIST, 304, -9999, 96, 21, 0, 0);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, MyGlb.PANEL_FORM, 0, 159, 192, 73, 0, 0);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, 0, 85);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, 1, 13);
    PAN_STORICOFASE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, 0, 4);
    PAN_STORICOFASE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, 1, 4);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOINDICATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, "E79BCBC5-2E01-4029-8C7A-94A7C6CAF39B");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, "Peso Obiettivi");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, MyGlb.VIS_DEFAPANESTYL);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, MyGlb.PANEL_LIST, 400, -9999, 96, 21, 0, 0);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, MyGlb.PANEL_FORM, 0, 207, 188, 73, 0, 0);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, 0, 78);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, 1, 13);
    PAN_STORICOFASE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, 0, 4);
    PAN_STORICOFASE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, 1, 4);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_GROUP, GRP_STORICOFASE_PESOOBIETTIV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_STORICOFASE.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, "49083687-0B40-4887-80A7-90648A5E4965");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, "Responsabile");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, "E3935645-4A4A-4102-9E7E-CFF27D0DA1AB");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, "Stato");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, "D183772A-5DB0-4504-99F6-D74E581509F1");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, "Descrizione");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, "34C75DBE-55FE-4DD9-B318-F40449BFE3C0");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, "per Obiettivo Raggiunto");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, "BEEECC12-896A-495E-8644-DCB3F48A1AC7");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, "per Soglia Raggiunta");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, "8436B9B2-96A4-4BAE-B9B8-F783466371B1");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, "per Obiettivo raggiunto");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, "4D7B73E0-DF81-4636-94C5-BB362E86AA0E");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, "per Soglia Raggiunta");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.VIS_NORMALFIELDS);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, "9BEA4B45-E744-4A95-9F2B-F3D8F7140768");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.VIS_NONNULLAFIEL);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, 0, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, "12CBB8DB-6419-469F-8C29-8324299712A0");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, "SCHEDA OBIETTIVO ID");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.VIS_NONNULLAFIEL);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, 0, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, "7CAD5EF5-71F8-4E9B-9546-635006C009A3");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, "PROGRESSIVO");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, "15E8DFED-5E62-4082-A9D6-B17E6DEA8C43");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, "Peso Indicatori");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, MyGlb.VIS_LABVISSTPEGR);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, "114FBECD-4528-438E-9B63-80B811D36B5C");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, "Peso Obiettivi");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, MyGlb.VIS_LABVISSTPEGR);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_STORICOFASE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, "64A06A29-AFC7-4589-9223-D351A2149D0D");
    PAN_STORICOFASE.set_Header(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, "Calcolo Percentuale");
    PAN_STORICOFASE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, "");
    PAN_STORICOFASE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.VIS_CHECKSTYLE);
    PAN_STORICOFASE.SetFlags(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_STORICOFASE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_LIST, 0, 48, 228, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_LIST, 72);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_FORM, 4, 112, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_FORM, 72);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_FORM, 2);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_RESPONSABILE, MyGlb.PANEL_FORM, "Respons.");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_RESPONSABILE, -1, -1);
    PAN_STORICOFASE.SetFieldUnbound(PFL_STORICOFASE_RESPONSABILE, true);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_RESPONSABILE, PPQRY_POLSCHEDOBI6, "ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE ))", "RECORDRESPON", 5, 99, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_LIST, 0, 48, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_LIST, 44);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_FORM, 4, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_FORM, 44);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_STATO, -1, -1);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_STATO, PPQRY_POLSCHEDOBI6, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_STORICOFASE.SetValueListItem(PFL_STORICOFASE_STATO, (new IDVariant("A")), "Attuale", "", "", -1);
    PAN_STORICOFASE.SetValueListItem(PFL_STORICOFASE_STATO, (new IDVariant("P")), "Proposta", "", "", -1);
    PAN_STORICOFASE.SetValueListItem(PFL_STORICOFASE_STATO, (new IDVariant("O")), "Obsoleta", "", "", -1);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_LIST, 72, 48, 232, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_DESCRIZIONE, -1, -1);
    PAN_STORICOFASE.SetFieldUnbound(PFL_STORICOFASE_DESCRIZIONE, true);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_DESCRIZIONE, PPQRY_POLSCHEDOBI6, "SUBSTR(A.DESCRIZIONE, 1, 30)", "DESCRIZIONE", 5, 99, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_LIST, 304, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_LIST, 140);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_LIST, "p. O. R.");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_FORM, 4, 184, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_FORM, 140);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAG1, MyGlb.PANEL_FORM, "per Obiet. Raggiunto");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PEROBIETRAG1, -1, GRP_STORICOFASE_PESOINDICATO);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PEROBIETRAG1, PPQRY_POLSCHEDOBI6, "A.PESO_INDICATORI_TARGET", "PESO_INDICATORI_TARGET", 1, 5, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_LIST, 352, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_LIST, 140);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_LIST, "p. S. R.");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_FORM, 4, 208, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_FORM, 140);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAG1, MyGlb.PANEL_FORM, "per Soglia Raggiunta");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PERSOGLIRAG1, -1, GRP_STORICOFASE_PESOINDICATO);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PERSOGLIRAG1, PPQRY_POLSCHEDOBI6, "A.PESO_INDICATORI_SOGLIA", "PESO_INDICATORI_SOGLIA", 1, 5, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_LIST, 400, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_LIST, 76);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_LIST, "p. O. rg.");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_FORM, 4, 232, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_FORM, 76);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PEROBIETRAGG, MyGlb.PANEL_FORM, "per Ob. rgg.");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PEROBIETRAGG, -1, GRP_STORICOFASE_PESOOBIETTIV);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PEROBIETRAGG, PPQRY_POLSCHEDOBI6, "A.PESO_TARGET", "PESO_TARGET", 1, 5, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_LIST, 448, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_LIST, 136);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_LIST, "p. S. R.");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_FORM, 4, 256, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_FORM, 136);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PERSOGLIRAGG, MyGlb.PANEL_FORM, "per Soglia Raggiunta");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PERSOGLIRAGG, -1, GRP_STORICOFASE_PESOOBIETTIV);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PERSOGLIRAGG, PPQRY_POLSCHEDOBI6, "A.PESO_SOGLIA_RAGGIUNTA", "PESO_SOGLIA_RAGGIUNTA", 1, 5, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_LIST, 2012, 48, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_LIST, 164);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 424, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_FORM, 164);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGUNITORGA, MyGlb.PANEL_FORM, "PR. UNITA ORGANIZZATIVA");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PROGUNITORGA, -1, -1);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PROGUNITORGA, PPQRY_POLSCHEDOBI6, "A.PROGR_UNITA_ORGANIZZATIVA", "PROGR_UNITA_ORGANIZZATIVA", 1, 8, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_LIST, 2012, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_LIST, 120);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_LIST, "SCHEDA OBIETTIVO ID");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_FORM, 4, 424, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_FORM, 120);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_SCHEDOBIETID, MyGlb.PANEL_FORM, "SCH. OBIETTIVO ID");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_SCHEDOBIETID, -1, -1);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_SCHEDOBIETID, PPQRY_POLSCHEDOBI6, "A.SCHEDA_OBIETTIVO_ID", "REPOSCSCOBID", 3, 10, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_LIST, 2012, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 520, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PROGRESSIVO, -1, -1);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PROGRESSIVO, PPQRY_POLSCHEDOBI6, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, MyGlb.PANEL_LIST, 304, 0, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, MyGlb.PANEL_LIST, 0);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, MyGlb.PANEL_FORM, 1168, 60, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, MyGlb.PANEL_FORM, 0);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOINDICATO, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PESOINDICATO, -1, -1);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PESOINDICATO, -1, "", "PESOINDICATO", 0, 0, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, MyGlb.PANEL_LIST, 400, 0, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, MyGlb.PANEL_LIST, 0);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, MyGlb.PANEL_FORM, 1176, 68, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, MyGlb.PANEL_FORM, 0);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_PESOOB, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_PESOOB, -1, -1);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_PESOOB, -1, "", "PESOOB", 0, 0, 0, -13997);
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_LIST, 496, 48, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_LIST, 128);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_LIST, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_LIST, "Calc. Percen.");
    PAN_STORICOFASE.SetRect(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_FORM, 4, 568, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_STORICOFASE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_FORM, 128);
    PAN_STORICOFASE.SetNumRow(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_FORM, 1);
    PAN_STORICOFASE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_STORICOFASE_CALCOLPERCEN, MyGlb.PANEL_FORM, "Calcolo Percentuale");
    PAN_STORICOFASE.SetFieldPage(PFL_STORICOFASE_CALCOLPERCEN, -1, -1);
    PAN_STORICOFASE.SetFieldPanel(PFL_STORICOFASE_CALCOLPERCEN, PPQRY_POLSCHEDOBI6, "A.CALCOLO_PERCENTUALE", "CALCOLO_PERCENTUALE", 5, 2, 0, -13997);
    PAN_STORICOFASE.SetValueListItem(PFL_STORICOFASE_CALCOLPERCEN, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_STORICOFASE.SetValueListItem(PFL_STORICOFASE_CALCOLPERCEN, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_STORICOFASE_InitQueries()
  {
    StringBuffer SQL;

    PAN_STORICOFASE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_STORICOFASE.SetIMDB(IMDB, "PQRY_POLSCHEDOBI6", true);
    PAN_STORICOFASE.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SCHEDA_OBIETTIVO_ID as REPOSCSCOBID, ");
    SQL.append("  A.STATO as STATO, ");
    SQL.append("  SUBSTR(A.DESCRIZIONE, 1, 30) as DESCRIZIONE, ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVA.GET_DESCRIZIONE(A.PROGR_UNITA_ORGANIZZATIVA,TRUNC( SYSDATE )) as RECORDRESPON, ");
    SQL.append("  A.ANNULLATA as ANNULLATA, ");
    SQL.append("  A.PESO_INDICATORI_TARGET as PESO_INDICATORI_TARGET, ");
    SQL.append("  A.PESO_INDICATORI_SOGLIA as PESO_INDICATORI_SOGLIA, ");
    SQL.append("  A.PESO_TARGET as PESO_TARGET, ");
    SQL.append("  A.PESO_SOGLIA_RAGGIUNTA as PESO_SOGLIA_RAGGIUNTA, ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.CALCOLO_PERCENTUALE as CALCOLO_PERCENTUALE ");
    PAN_STORICOFASE.SetQuery(PPQRY_POLSCHEDOBI6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  POL_FASI_OBIETTIVO A ");
    PAN_STORICOFASE.SetQuery(PPQRY_POLSCHEDOBI6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FASE_OBIETTIVO_ID = ~~TBL_PARS23.ROWNAMFAOBID~~) ");
    PAN_STORICOFASE.SetQuery(PPQRY_POLSCHEDOBI6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STORICOFASE.SetQuery(PPQRY_POLSCHEDOBI6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_STORICOFASE.SetQuery(PPQRY_POLSCHEDOBI6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_STORICOFASE.SetQuery(PPQRY_POLSCHEDOBI6, 5, SQL, -1, "");
    PAN_STORICOFASE.SetQueryDB(PPQRY_POLSCHEDOBI6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_STORICOFASE.SetMasterTable(0, "POL_FASI_OBIETTIVO");
    PAN_STORICOFASE.AddToSortList(PFL_STORICOFASE_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_STORICOFASE.Status() == 2)
    {
      int oldListQBE = PAN_STORICOFASE.iUseListQBE;
      PAN_STORICOFASE.iUseListQBE = 0;
      PAN_STORICOFASE.PanelCommand(Glb.PCM_SEARCH);
      PAN_STORICOFASE.PanelCommand(Glb.PCM_FIND);
      PAN_STORICOFASE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_STORICOFASE) PAN_STORICOFASE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORICOFASE) PAN_STORICOFASE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_STORICOFASE) PAN_STORICOFASE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_STORICOFASE) PAN_STORICOFASE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_STORICOFASE) PAN_STORICOFASE_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_STORICOFASE) PAN_STORICOFASE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
