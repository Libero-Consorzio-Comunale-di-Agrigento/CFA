// **********************************************
// Documenti Per Imputazione Contabile
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DocumentiPerImputazioneContabile extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_DOCPERIMCOPA_DOCUMENTIDI = 0;
  private static int GRP_DOCPERIMCOPA_DATADOCUMENT = 1;

  private static int PFL_DOCPERIMCOPA_SOLODALIQINC = 0;
  private static int PFL_DOCPERIMCOPA_SOLODAIMPUTA = 1;
  private static int PFL_DOCPERIMCOPA_CATEGORIA = 2;
  private static int PFL_DOCPERIMCOPA_ES = 3;
  private static int PFL_DOCPERIMCOPA_NEWPANELLAB1 = 4;
  private static int PFL_DOCPERIMCOPA_NEWPANELABE1 = 5;
  private static int PFL_DOCPERIMCOPA_DAL = 6;
  private static int PFL_DOCPERIMCOPA_AL = 7;
  private static int PFL_DOCPERIMCOPA_NEWPANELLABE = 8;
  private static int PFL_DOCPERIMCOPA_TASTOELABORA = 9;

  private static int PPQRY_VARIBILI1 = 0;

  private static int PPQRY_T08 = 1;


  IDPanel PAN_DOCPERIMCOPA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VARIBILI(IMDB);
    //
    //
    Init_PQRY_VARIBILI1(IMDB);
    Init_PQRY_VARIBILI1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VARIBILI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_VARIBILI, 7);
    IMDB.set_TblCode(IMDBDef2.TBL_VARIBILI, "TBL_VARIBILI");
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMEES,12,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMELI, "ROWNAMELI");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMELI,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMSOLIMP, "ROWNAMSOLIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMSOLIMP,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMEAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMECATEG,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMESOLOL, "ROWNAMESOLOL");
    IMDB.SetFldParams(IMDBDef2.TBL_VARIBILI,IMDBDef2.FLD_VARIBILI_ROWNAMESOLOL,5,49,0);
    IMDB.TblAddNew(IMDBDef2.TBL_VARIBILI, 0);
  }

  private static void Init_PQRY_VARIBILI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_VARIBILI1, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_VARIBILI1, "PQRY_VARIBILI1");
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMEES,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMELI, "ROWNAMELI");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMELI,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMSOLIMP, "ROWNAMSOLIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMSOLIMP,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMEAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1,IMDBDef9.PQSL_VARIBILI1_ROWNAMECATEG,5,49,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_VARIBILI1, 0);
  }

  private static void Init_PQRY_VARIBILI1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_VARIBILI1_RS, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_VARIBILI1_RS, "PQRY_VARIBILI1_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMEES, "ROWNAMEES");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMEES,12,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMELI, "ROWNAMELI");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMELI,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMSOLIMP, "ROWNAMSOLIMP");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMSOLIMP,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMEDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMEAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef9.PQRY_VARIBILI1_RS,IMDBDef9.PQSL_VARIBILI1_ROWNAMECATEG,5,49,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DocumentiPerImputazioneContabile(MyWebEntryPoint w, IMDBObj imdb)
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
  public DocumentiPerImputazioneContabile()
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
    FormIdx = MyGlb.FRM_DOCPERIMPCON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "919B0BD1-6CCB-46E7-9DE3-5C1DA9911CBB";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 280;
    DesignHeight = 326;
    set_Caption(new IDVariant("Documenti Per Imputazione Contabile"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 280;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Documenti Per Imputazione Contabile Panel";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_DOCPERIMCOPA = new IDPanel(w, this, 1, "PAN_DOCPERIMCOPA");
    Frames[1].Content = PAN_DOCPERIMCOPA;
    PAN_DOCPERIMCOPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCPERIMCOPA.VS = MainFrm.VisualStyleList;
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 280-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BE4FDBC9-BA62-4C2A-B6DF-ADC783C9DBD0");
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 544, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCPERIMCOPA.InitStatus = 1;
    PAN_DOCPERIMCOPA_Init();
    PAN_DOCPERIMCOPA_InitFields();
    PAN_DOCPERIMCOPA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_VARIBILI, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DOCPERIMPCON_VARIBILI1();
      }
      PAN_DOCPERIMCOPA.UpdatePanel(MainFrm);
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
    return (obj instanceof DocumentiPerImputazioneContabile);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DocumentiPerImputazioneContabile.class.getName() : (Glb.ClassWithPackage(DocumentiPerImputazioneContabile.class) ? DocumentiPerImputazioneContabile.class.getName().substring(DocumentiPerImputazioneContabile.class.getPackage().getName().length() + 1) : DocumentiPerImputazioneContabile.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Documenti Per Imputazione Contabile Panel After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DOCPERIMCOPA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti Per Imputazione Contabile Panel After Find Event Body
      // Procedure Body
      // 
      // if (IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEES, 0).equals((new IDVariant("S")), true))
      // {
        // PAN_DOCPERIMCOPA.SetFlags (Glb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneContabile", "DocumentiPerImputazioneContabilePanelAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti Per Imputazione Contabile Panel On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCPERIMCOPA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DOCPERIMCOPA);
      // 
      // Documenti Per Imputazione Contabile Panel On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEES, 0).equals((new IDVariant("E")), true))
      {
        PAN_DOCPERIMCOPA.SetFlags (Glb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DOCPERIMCOPA.SetFlags (Glb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMSOLIMP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_DOCPERIMCOPA.SetFlags (Glb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_DOCPERIMCOPA.SetFlags (Glb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneContabile", "DocumentiPerImputazioneContabilePanelOnDynamicPropertiesEvent", _e);
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
      v_NOMECAPTION = (new IDVariant("Documenti per Imputazione Contabile", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMEES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMECATEG, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMSOLIMP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMESOLOL, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMELI, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneContabile", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Varibili Solo da liquidare Incassare Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_DOCPERIMCOPA_SOLODALIQINC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Varibili Solo da liquidare Incassare Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMELI, 0).equals((new IDVariant("SI")), true))
      {
        PAN_DOCPERIMCOPA.SetFlags (Glb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneContabile", "VaribiliSolodaliquidareIncassareValidateEvent", _e);
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
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEDAL, 0)).compareTo((new IDVariant(1900)), true)<0 || IDL.Year(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEAL, 0)).compareTo((new IDVariant(1900)), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      if (IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEDAL, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR2); 
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Documenti_Imputazione_Contabile"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ES")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEES, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DAL")), MainFrm.Datetostring(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEDAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_AL")), MainFrm.Datetostring(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMEAL, 0)));
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMECATEG, 0)))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_CATEGORIA")), (new IDVariant("")));
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_CATEGORIA")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMECATEG, 0)));
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SOLO_LIQINC")), IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMELI, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SOLO_IMPUTARE")), IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMSOLIMP, 0));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneContabile", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Documenti Per Imputazione Contabile Panel Solo Da Imputare Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_DOCPERIMCOPA_SOLODAIMPUTA_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti Per Imputazione Contabile Panel Solo Da Imputare Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMSOLIMP, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_VARIBILI1, IMDBDef9.PQSL_VARIBILI1_ROWNAMELI, 0, (new IDVariant("NO")));
        PAN_DOCPERIMCOPA.SetFlags (Glb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        IMDB.set_Value(IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMESOLOL, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiPerImputazioneContabile", "DocumentiPerImputazioneContabilePanelSoloDaImputareValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Varibili
  // Primary record source for panel data
  // **********************************************************************
  private void DOCPERIMPCON_VARIBILI1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_VARIBILI1_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_VARIBILI, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_VARIBILI, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_VARIBILI1_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_VARIBILI1_RS, 0, IMDBDef2.TBL_VARIBILI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_VARIBILI1_RS, 0, 0, IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMEES, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_VARIBILI1_RS, 1, 0, IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMELI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_VARIBILI1_RS, 2, 0, IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMSOLIMP, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_VARIBILI1_RS, 3, 0, IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_VARIBILI1_RS, 4, 0, IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_VARIBILI1_RS, 5, 0, IMDBDef2.TBL_VARIBILI, IMDBDef2.FLD_VARIBILI_ROWNAMECATEG, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_VARIBILI, 0);
      if (IMDB.Eof(IMDBDef2.TBL_VARIBILI, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_VARIBILI, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_VARIBILI1_RS, 0);
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
  private void PAN_DOCPERIMCOPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCPERIMCOPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCPERIMCOPA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCPERIMCOPA, Cancel);
    // Stub
  }

  private void PAN_DOCPERIMCOPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DOCPERIMCOPA_TASTOELABORA)
    {
      this.IdxPanelActived = this.PAN_DOCPERIMCOPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DOCPERIMCOPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_DOCPERIMCOPA_SOLODALIQINC)
      {
        PFL_DOCPERIMCOPA_SOLODALIQINC_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_DOCPERIMCOPA_SOLODAIMPUTA)
      {
        PFL_DOCPERIMCOPA_SOLODAIMPUTA_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_DOCPERIMCOPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCPERIMCOPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DOCPERIMCOPA_Init()
  {

    PAN_DOCPERIMCOPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCPERIMCOPA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, "BF2C8B70-D34B-4BCA-8974-82C47435A8DC");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, "Documenti di");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, MyGlb.VIS_GROUPSTYLE);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, MyGlb.PANEL_LIST, 0, -9999, 64, 16, 0, 0);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, MyGlb.PANEL_FORM, 8, 15, 232, 53, 0, 0);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, 0, 74);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, 1, 13);
    PAN_DOCPERIMCOPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, 0, 4);
    PAN_DOCPERIMCOPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, 1, 4);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DOCUMENTIDI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, "88955E88-6CDF-492D-8A66-7E81A81DCB22");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, "Data Documenti");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, MyGlb.PANEL_LIST, 0, 159, 360, 73, 0, 0);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, MyGlb.PANEL_FORM, 8, 71, 232, 57, 0, 0);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, 0, 91);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, 1, 13);
    PAN_DOCPERIMCOPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, 0, 4);
    PAN_DOCPERIMCOPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, 1, 4);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_GROUP, GRP_DOCPERIMCOPA_DATADOCUMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_DOCPERIMCOPA.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, "672A1436-E918-4E42-8BF2-32C2828FA4EC");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, "Solo da liquidare/Incassare");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, "Liquidare o Incassare");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.VIS_CHECKSTYLE);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, "0E21D21E-4831-4AF0-98F9-170A764C5A80");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, "Solo da Imputare");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.VIS_CHECKSTYLE);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, "D4903341-ECAD-49C8-8222-E95E83A2C0BD");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, "Categoria");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, "B764171F-AAF9-4D17-930E-C6906D415036");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, "ES");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.VIS_OPTBUTSENBOR);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, "55654F16-18E7-418B-9931-87F405C05C94");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, "9665A3BF-A497-4D27-9D32-2587D2E97CF8");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, "A8DB8FFB-D34E-4418-86B2-A70564609621");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, "Dal");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, "78B97FAD-6E1A-42FB-99FC-2881F86C7F91");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, "Al");
    PAN_DOCPERIMCOPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, "C52897F7-2474-49F6-967C-C0C24638F390");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, "");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, 0 | MyGlb.FLD_INFORM, -1);
    PAN_DOCPERIMCOPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, "858BFFB4-6321-4BAC-9337-28324B7F2649");
    PAN_DOCPERIMCOPA.set_Header(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, "Elabora");
    PAN_DOCPERIMCOPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_DOCPERIMCOPA.SetImage(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, 0, "button1.gif", false);
    PAN_DOCPERIMCOPA.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_DOCPERIMCOPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_LIST, 64, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_LIST, 20);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_LIST, "S. d. lq. In.");
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_FORM, 36, 156, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_FORM, 180);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODALIQINC, MyGlb.PANEL_FORM, "Solo da liquidare/Incassare");
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_SOLODALIQINC, -1, -1);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_SOLODALIQINC, PPQRY_VARIBILI1, "A.ROWNAMELI", "ROWNAMELI", 5, 49, 0, -13997);
    PAN_DOCPERIMCOPA.SetValueListItem(PFL_DOCPERIMCOPA_SOLODALIQINC, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DOCPERIMCOPA.SetValueListItem(PFL_DOCPERIMCOPA_SOLODALIQINC, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_LIST, 104, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_LIST, 76);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_LIST, "Sl. da Imp.");
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_FORM, 36, 180, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_FORM, 180);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_SOLODAIMPUTA, MyGlb.PANEL_FORM, "Solo da Imputare");
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_SOLODAIMPUTA, -1, -1);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_SOLODAIMPUTA, PPQRY_VARIBILI1, "A.ROWNAMSOLIMP", "ROWNAMSOLIMP", 5, 49, 0, -13997);
    PAN_DOCPERIMCOPA.SetValueListItem(PFL_DOCPERIMCOPA_SOLODAIMPUTA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_DOCPERIMCOPA.SetValueListItem(PFL_DOCPERIMCOPA_SOLODAIMPUTA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_LIST, 144, 36, 400, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_LIST, 56);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_FORM, 20, 132, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_FORM, 64);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_CATEGORIA, -1, -1);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_CATEGORIA, PPQRY_VARIBILI1, "A.ROWNAMECATEG", "ROWNAMECATEG", 5, 49, 0, -13997);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_LIST, 20);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_LIST, "ES");
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_FORM, 52, 40, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_FORM, 24);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_ES, MyGlb.PANEL_FORM, "ES");
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_ES, -1, GRP_DOCPERIMCOPA_DOCUMENTIDI);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_ES, PPQRY_VARIBILI1, "A.ROWNAMEES", "ROWNAMEES", 12, 1, 0, -13997);
    PAN_DOCPERIMCOPA.SetValueListItem(PFL_DOCPERIMCOPA_ES, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_DOCPERIMCOPA.SetValueListItem(PFL_DOCPERIMCOPA_ES, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, MyGlb.PANEL_LIST, 188, 8, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, MyGlb.PANEL_FORM, 224, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_NEWPANELLAB1, -1, GRP_DOCPERIMCOPA_DOCUMENTIDI);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, MyGlb.PANEL_LIST, 124, 56, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, MyGlb.PANEL_FORM, 12, 52, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_NEWPANELABE1, -1, GRP_DOCPERIMCOPA_DOCUMENTIDI);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_LIST, 4, 184, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_LIST, 104);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_FORM, 12, 96, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_FORM, 28);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_DAL, -1, GRP_DOCPERIMCOPA_DATADOCUMENT);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_DAL, PPQRY_VARIBILI1, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 49, 0, -13997);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_LIST, 4, 208, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_LIST, 104);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_LIST, "Al");
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_FORM, 128, 96, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_FORM, 24);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_AL, MyGlb.PANEL_FORM, "Al");
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_AL, -1, GRP_DOCPERIMCOPA_DATADOCUMENT);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_AL, PPQRY_VARIBILI1, "A.ROWNAMEAL", "ROWNAMEAL", 6, 49, 0, -13997);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, MyGlb.PANEL_LIST, 140, 84, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, MyGlb.PANEL_FORM, 220, 112, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_NEWPANELLABE, -1, GRP_DOCPERIMCOPA_DATADOCUMENT);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, MyGlb.PANEL_LIST, 112, 272, 44, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, MyGlb.PANEL_LIST, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, MyGlb.PANEL_LIST, 1);
    PAN_DOCPERIMCOPA.SetRect(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, MyGlb.PANEL_FORM, 160, 232, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCPERIMCOPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, MyGlb.PANEL_FORM, 0);
    PAN_DOCPERIMCOPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCPERIMCOPA_TASTOELABORA, MyGlb.PANEL_FORM, 1);
    PAN_DOCPERIMCOPA.SetFieldPage(PFL_DOCPERIMCOPA_TASTOELABORA, -1, -1);
    PAN_DOCPERIMCOPA.SetFieldPanel(PFL_DOCPERIMCOPA_TASTOELABORA, -1, "", "TASTOELABORA", 0, 0, 0, -13997);
  }

  private void PAN_DOCPERIMCOPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCPERIMCOPA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T08CODICE, ");
    SQL.append("  A.DESCRIZIONE as T08DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T08 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECATEG~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMECATEG~~ = NULL) ");
    PAN_DOCPERIMCOPA.SetQuery(PPQRY_T08, 0, SQL, PFL_DOCPERIMCOPA_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T08CODICE, ");
    SQL.append("  A.DESCRIZIONE as T08DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T08 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    PAN_DOCPERIMCOPA.SetQuery(PPQRY_T08, 1, SQL, PFL_DOCPERIMCOPA_CATEGORIA, "");
    PAN_DOCPERIMCOPA.SetQueryDB(PPQRY_T08, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCPERIMCOPA.SetIMDB(IMDB, "PQRY_VARIBILI1", true);
    PAN_DOCPERIMCOPA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_DOCPERIMCOPA.SetQueryIMDB(PPQRY_VARIBILI1, IMDBDef9.PQRY_VARIBILI1_RS, IMDBDef2.TBL_VARIBILI);
    JustLoaded = true;
    PAN_DOCPERIMCOPA.SetFieldPrimaryIndex(PFL_DOCPERIMCOPA_SOLODALIQINC, IMDBDef2.FLD_VARIBILI_ROWNAMELI);
    PAN_DOCPERIMCOPA.SetFieldPrimaryIndex(PFL_DOCPERIMCOPA_SOLODAIMPUTA, IMDBDef2.FLD_VARIBILI_ROWNAMSOLIMP);
    PAN_DOCPERIMCOPA.SetFieldPrimaryIndex(PFL_DOCPERIMCOPA_CATEGORIA, IMDBDef2.FLD_VARIBILI_ROWNAMECATEG);
    PAN_DOCPERIMCOPA.SetFieldPrimaryIndex(PFL_DOCPERIMCOPA_ES, IMDBDef2.FLD_VARIBILI_ROWNAMEES);
    PAN_DOCPERIMCOPA.SetFieldPrimaryIndex(PFL_DOCPERIMCOPA_DAL, IMDBDef2.FLD_VARIBILI_ROWNAMEDAL);
    PAN_DOCPERIMCOPA.SetFieldPrimaryIndex(PFL_DOCPERIMCOPA_AL, IMDBDef2.FLD_VARIBILI_ROWNAMEAL);
    PAN_DOCPERIMCOPA.SetMasterTable(0, "VARIBILI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCPERIMCOPA.Status() == 2)
    {
      int oldListQBE = PAN_DOCPERIMCOPA.iUseListQBE;
      PAN_DOCPERIMCOPA.iUseListQBE = 0;
      PAN_DOCPERIMCOPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCPERIMCOPA.PanelCommand(Glb.PCM_FIND);
      PAN_DOCPERIMCOPA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DOCPERIMCOPA) PAN_DOCPERIMCOPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCPERIMCOPA) PAN_DOCPERIMCOPA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DOCPERIMCOPA) PAN_DOCPERIMCOPA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DOCPERIMCOPA) PAN_DOCPERIMCOPA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DOCPERIMCOPA) PAN_DOCPERIMCOPA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DOCPERIMCOPA) PAN_DOCPERIMCOPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
