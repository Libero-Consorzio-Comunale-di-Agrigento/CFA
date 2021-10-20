// **********************************************
// CF4WEB IMPSUB DISPONIBILITA
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CF4WEBIMPSUBDISPONIBILITA extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_DISPONIBILIT_IMPSUBIMPEGN = 0;
  private static int PFL_DISPONIBILIT_SUBIMPEGNI = 1;
  private static int PFL_DISPONIBILIT_DISPONIBILIT = 2;
  private static int PFL_DISPONIBILIT_ORDINIEMESSI = 3;
  private static int PFL_DISPONIBILIT_DISPEMESSE = 4;
  private static int PFL_DISPONIBILIT_FATTURRICEVU = 5;
  private static int PFL_DISPONIBILIT_LIQEXTRAORDI = 6;
  private static int PFL_DISPONIBILIT_LIQTECNORDIN = 7;
  private static int PFL_DISPONIBILIT_LIQTECNDISP = 8;
  private static int PFL_DISPONIBILIT_LIQCONTORDIN = 9;
  private static int PFL_DISPONIBILIT_LIQCONTDISP = 10;
  private static int PFL_DISPONIBILIT_SPESCASSECON = 11;
  private static int PFL_DISPONIBILIT_PAGATO = 12;
  private static int PFL_DISPONIBILIT_LIQTECNICHEL = 13;
  private static int PFL_DISPONIBILIT_LIQCONTABILL = 14;

  private static int PPQRY_CF4WIMPSDISP = 0;


  IDPanel PAN_DISPONIBILIT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI72(IMDB);
    //
    //
    Init_PQRY_CF4WIMPSDISP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI72(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI72, 5);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI72, "TBL_PARAMETRI72");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMANNIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMNUMIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMANSUIM, "ROWNAMANSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMANSUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMNUSUIM, "ROWNAMNUSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMNUSUIM,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMIMSUIM, "ROWNAMIMSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI72,IMDBDef4.FLD_PARAMETRI72_ROWNAMIMSUIM,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI72, 0);
  }

  private static void Init_PQRY_CF4WIMPSDISP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_CF4WIMPSDISP, 16);
    IMDB.set_TblCode(IMDBDef13.PQRY_CF4WIMPSDISP, "PQRY_CF4WIMPSDISP");
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_CFIMDIIMSUIM, "CFIMDIIMSUIM");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_CFIMDIIMSUIM,2,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_IMPORTO_SUBIMP, "IMPORTO_SUBIMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_IMPORTO_SUBIMP,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_BUONI_EMESSI, "BUONI_EMESSI");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_BUONI_EMESSI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_DISPOSIZIONI_EMESSE, "DISPOSIZIONI_EMESSE");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_DISPOSIZIONI_EMESSE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_IMPORTO_IMP, "IMPORTO_IMP");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_IMPORTO_IMP,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_FATTURE_RICEVUTE, "FATTURE_RICEVUTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_FATTURE_RICEVUTE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQ_NO_BUONI, "LIQ_NO_BUONI");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQ_NO_BUONI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQ_BUONI_TECNICHE, "LIQ_BUONI_TECNICHE");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQ_BUONI_TECNICHE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQ_DISP_TECNICHE, "LIQ_DISP_TECNICHE");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQ_DISP_TECNICHE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQUIDAZIONI_BUONI, "LIQUIDAZIONI_BUONI");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQUIDAZIONI_BUONI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQUIDAZIONI_DISP, "LIQUIDAZIONI_DISP");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_LIQUIDAZIONI_DISP,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_SPESE_CASSA_ECON, "SPESE_CASSA_ECON");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_SPESE_CASSA_ECON,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_MANDATI, "MANDATI");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_MANDATI,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_DISPONIBILITA,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_CF4IMDILITEL, "CF4IMDILITEL");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_CF4IMDILITEL,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_CF4IMDILICOL, "CF4IMDILICOL");
    IMDB.SetFldParams(IMDBDef13.PQRY_CF4WIMPSDISP,IMDBDef13.PQSL_CF4WIMPSDISP_CF4IMDILICOL,3,14,2);
    IMDB.TblAddNew(IMDBDef13.PQRY_CF4WIMPSDISP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CF4WEBIMPSUBDISPONIBILITA(MyWebEntryPoint w, IMDBObj imdb)
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
  public CF4WEBIMPSUBDISPONIBILITA()
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
    FormIdx = MyGlb.FRM_CF4WIMPSDISP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D183FF0A-2D04-49CC-AF30-D5D2BCCE15F8";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 720;
    DesignHeight = 318;
    set_Caption(new IDVariant("CF4WEB IMPSUB DISPONIBILITA"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 720;
    Frames[1].Height = 292;
    Frames[1].Caption = "Disponibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 292;
    PAN_DISPONIBILIT = new IDPanel(w, this, 1, "PAN_DISPONIBILIT");
    Frames[1].Content = PAN_DISPONIBILIT;
    PAN_DISPONIBILIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISPONIBILIT.VS = MainFrm.VisualStyleList;
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 720-MyGlb.PAN_OFFS_X, 292-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0F5C1423-4EEC-4B46-A7A6-94A43C275CB8");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1572, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISPONIBILIT.InitStatus = 2;
    PAN_DISPONIBILIT_Init();
    PAN_DISPONIBILIT_InitFields();
    PAN_DISPONIBILIT_InitQueries();
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
      PAN_DISPONIBILIT.UpdatePanel(MainFrm);
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
    return (obj instanceof CF4WEBIMPSUBDISPONIBILITA);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CF4WEBIMPSUBDISPONIBILITA.class.getName() : (Glb.ClassWithPackage(CF4WEBIMPSUBDISPONIBILITA.class) ? CF4WEBIMPSUBDISPONIBILITA.class.getName().substring(CF4WEBIMPSUBDISPONIBILITA.class.getPackage().getName().length() + 1) : CF4WEBIMPSUBDISPONIBILITA.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Disponibilità After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_DISPONIBILIT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disponibilità After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMIMSUIM, 0).equals((new IDVariant("S")), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CF4WEBIMPSUBDISPONIBILITA", "DisponibilitàAfterFindEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Disponibilità", IDVariant.STRING));
      v_CAPTION1 = (new IDVariant("Imp. Impegno", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      if (IMDB.Value(IMDBDef4.TBL_PARAMETRI72, IMDBDef4.FLD_PARAMETRI72_ROWNAMIMSUIM, 0).equals((new IDVariant("I")), true))
      {
        PAN_DISPONIBILIT.set_Header(Glb.OBJ_FIELD,PFL_DISPONIBILIT_IMPSUBIMPEGN, new IDVariant(v_CAPTION1).stringValue());
      }
      if (MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_DISPONIBILIT.SetFlags (Glb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CF4WEBIMPSUBDISPONIBILITA", "LoadEvent", _e);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISPONIBILIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISPONIBILIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISPONIBILIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISPONIBILIT, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISPONIBILIT_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISPONIBILIT);
    // Stub
  }

  private void PAN_DISPONIBILIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DISPONIBILIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISPONIBILIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISPONIBILIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_DISPONIBILIT_Init()
  {

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_FIELD, 15);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, "E78758D3-CFC2-4812-9F61-2D29EC65976B");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, "Imp. Sub Impegno");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, "Importo");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, "58121666-4FB0-4C48-91DF-894278CDC301");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, "Sub-impegni");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "5DA95A55-D733-4894-BA31-31C392B03C95");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "Disponibilità");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, "Disponibilità");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, "71A3813F-491F-4A81-92A6-D92E21B5CC5A");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, "Ordini Emessi");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, "B946FF4F-5E39-439B-945F-67635C1B23A9");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, "Disp. Emesse");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, "405F02D1-11CE-4C1B-BC3D-40F4498AD85F");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, "Fatture Ricevute");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, "Fatture Ricevute");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, "1EC45BA9-4219-4C66-8A10-C1B88E47C521");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, "Liq.extra Ordini");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, "B963F2BF-1EF0-49CF-9995-3C2FE63578B8");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, "Liq. tecn. Ordini");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, "33392AD3-D121-48AF-9CEC-B587A40FCAD7");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, "Liq. tecn. disp");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, "Liq. tecn. disp");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, "1E4545B2-447F-4726-B362-DF84A249B98F");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, "Liq. cont. Ordini");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, "641326BA-CF30-4DF2-8292-B7F69C371F1E");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, "Liq. cont. disp");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, "F89138CC-329C-4BDC-BA22-7FD96CF64E36");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, "Spese Cassa Econ.");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, "5003B8CB-1D1A-4615-8703-7309EF343679");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, "Pagato");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, "29A7090B-CE2C-4D06-AE6A-6CEFA593833F");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, "Liq. Tecn. Dist. Liq.");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISPONIBILIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, "CD9BD74A-CA46-406F-9173-70F7A2CBA0BB");
    PAN_DISPONIBILIT.set_Header(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, "Liq. Cont. Dist. Liq.");
    PAN_DISPONIBILIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, "");
    PAN_DISPONIBILIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.VIS_CAMPTOTADISA);
    PAN_DISPONIBILIT.SetFlags(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DISPONIBILIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_LIST, 72);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_LIST, "Imp. Sub Impegno");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_FORM, 28, 8, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_FORM, 128);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_IMPSUBIMPEGN, MyGlb.PANEL_FORM, "Imp. Sub Impegno");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_IMPSUBIMPEGN, -1, -1);
    PAN_DISPONIBILIT.SetFieldUnbound(PFL_DISPONIBILIT_IMPSUBIMPEGN, true);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_IMPSUBIMPEGN, PPQRY_CF4WIMPSDISP, "NVL(A.IMPORTO_IMP, 0) + NVL(A.IMPORTO_SUBIMP, 0)", "CFIMDIIMSUIM", 2, 19, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_LIST, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_LIST, "Sub-impegni");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_FORM, 280, 8, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_FORM, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SUBIMPEGNI, MyGlb.PANEL_FORM, "Sub-impegni");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SUBIMPEGNI, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SUBIMPEGNI, PPQRY_CF4WIMPSDISP, "A.IMPORTO_SUBIMP", "IMPORTO_SUBIMP", 2, 15, 0, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 64);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 508, 8, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 96);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPONIBILIT, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPONIBILIT, PPQRY_CF4WIMPSDISP, "A.DISPONIBILITA", "DISPONIBILITA", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_LIST, 80);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_LIST, "Ordini Emessi");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_FORM, 52, 36, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_FORM, 104);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_ORDINIEMESSI, MyGlb.PANEL_FORM, "Ordini Emessi");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_ORDINIEMESSI, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_ORDINIEMESSI, PPQRY_CF4WIMPSDISP, "A.BUONI_EMESSI", "BUONI_EMESSI", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_LIST, 120);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_LIST, "Disp. Emesse");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_FORM, 272, 36, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_FORM, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_DISPEMESSE, MyGlb.PANEL_FORM, "Disp. Emesse");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_DISPEMESSE, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_DISPEMESSE, PPQRY_CF4WIMPSDISP, "A.DISPOSIZIONI_EMESSE", "DISPOSIZIONI_EMESSE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_LIST, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_LIST, "Fatture Ricevute");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_FORM, 32, 92, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_FORM, 124);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_FATTURRICEVU, MyGlb.PANEL_FORM, "Fatture Ricevute");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_FATTURRICEVU, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_FATTURRICEVU, PPQRY_CF4WIMPSDISP, "A.FATTURE_RICEVUTE", "FATTURE_RICEVUTE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_LIST, 80);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_LIST, "Liq.extra Ordini");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_FORM, 268, 92, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQEXTRAORDI, MyGlb.PANEL_FORM, "Liq.extra Ordini");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQEXTRAORDI, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQEXTRAORDI, PPQRY_CF4WIMPSDISP, "A.LIQ_NO_BUONI", "LIQ_NO_BUONI", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_LIST, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_LIST, "Liq. tecn. Ordini");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_FORM, 40, 120, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_FORM, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNORDIN, MyGlb.PANEL_FORM, "Liq. tecn. Ordini");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQTECNORDIN, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQTECNORDIN, PPQRY_CF4WIMPSDISP, "A.LIQ_BUONI_TECNICHE", "LIQ_BUONI_TECNICHE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_LIST, 104);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_LIST, "Liq. tecn. disp");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_FORM, 272, 120, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_FORM, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNDISP, MyGlb.PANEL_FORM, "Liq. tecn. disp");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQTECNDISP, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQTECNDISP, PPQRY_CF4WIMPSDISP, "A.LIQ_DISP_TECNICHE", "LIQ_DISP_TECNICHE", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_LIST, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_LIST, "Liq. cont. Ordini");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_FORM, 40, 148, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_FORM, 116);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTORDIN, MyGlb.PANEL_FORM, "Liq. cont. Ordini");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQCONTORDIN, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQCONTORDIN, PPQRY_CF4WIMPSDISP, "A.LIQUIDAZIONI_BUONI", "LIQUIDAZIONI_BUONI", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_LIST, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_LIST, "Liq. cont. disp");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_FORM, 272, 148, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_FORM, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTDISP, MyGlb.PANEL_FORM, "Liq. cont. disp");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQCONTDISP, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQCONTDISP, PPQRY_CF4WIMPSDISP, "A.LIQUIDAZIONI_DISP", "LIQUIDAZIONI_DISP", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, 108);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_LIST, "Spese Cassa Econ.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, 24, 196, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, 132);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_SPESCASSECON, MyGlb.PANEL_FORM, "Spese Cassa Econ.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_SPESCASSECON, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_SPESCASSECON, PPQRY_CF4WIMPSDISP, "A.SPESE_CASSA_ECON", "SPESE_CASSA_ECON", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_LIST, 56);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_LIST, "Pagato");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_FORM, 304, 196, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_FORM, 76);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_PAGATO, MyGlb.PANEL_FORM, "Pagato");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_PAGATO, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_PAGATO, PPQRY_CF4WIMPSDISP, "A.MANDATI", "MANDATI", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_LIST, 92);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_LIST, "Liq. Tecn. Dist. Liq.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_FORM, 492, 120, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQTECNICHEL, MyGlb.PANEL_FORM, "Liq. Tecn. Dist. Liq.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQTECNICHEL, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQTECNICHEL, PPQRY_CF4WIMPSDISP, "A.LIQ_TECNICHE_L", "CF4IMDILITEL", 3, 14, 2, -13997);
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_LIST, 100);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_LIST, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_LIST, "Liq. Cont. Dist. Liq.");
    PAN_DISPONIBILIT.SetRect(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_FORM, 492, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISPONIBILIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_FORM, 112);
    PAN_DISPONIBILIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_FORM, 1);
    PAN_DISPONIBILIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISPONIBILIT_LIQCONTABILL, MyGlb.PANEL_FORM, "Liq. Cont. Dist. Liq.");
    PAN_DISPONIBILIT.SetFieldPage(PFL_DISPONIBILIT_LIQCONTABILL, -1, -1);
    PAN_DISPONIBILIT.SetFieldPanel(PFL_DISPONIBILIT_LIQCONTABILL, PPQRY_CF4WIMPSDISP, "A.LIQ_CONTABILI_L", "CF4IMDILICOL", 3, 14, 2, -13997);
  }

  private void PAN_DISPONIBILIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISPONIBILIT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISPONIBILIT.SetIMDB(IMDB, "PQRY_CF4WIMPSDISP", true);
    PAN_DISPONIBILIT.set_SetString(MyGlb.MASTER_ROWNAME, "CF4WEB IMPSUB DISPONIBILITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  NVL(A.IMPORTO_IMP, 0) + NVL(A.IMPORTO_SUBIMP, 0) as CFIMDIIMSUIM, ");
    SQL.append("  A.IMPORTO_SUBIMP as IMPORTO_SUBIMP, ");
    SQL.append("  A.BUONI_EMESSI as BUONI_EMESSI, ");
    SQL.append("  A.DISPOSIZIONI_EMESSE as DISPOSIZIONI_EMESSE, ");
    SQL.append("  A.IMPORTO_IMP as IMPORTO_IMP, ");
    SQL.append("  A.FATTURE_RICEVUTE as FATTURE_RICEVUTE, ");
    SQL.append("  A.LIQ_NO_BUONI as LIQ_NO_BUONI, ");
    SQL.append("  A.LIQ_BUONI_TECNICHE as LIQ_BUONI_TECNICHE, ");
    SQL.append("  A.LIQ_DISP_TECNICHE as LIQ_DISP_TECNICHE, ");
    SQL.append("  A.LIQUIDAZIONI_BUONI as LIQUIDAZIONI_BUONI, ");
    SQL.append("  A.LIQUIDAZIONI_DISP as LIQUIDAZIONI_DISP, ");
    SQL.append("  A.SPESE_CASSA_ECON as SPESE_CASSA_ECON, ");
    SQL.append("  A.MANDATI as MANDATI, ");
    SQL.append("  A.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  A.LIQ_TECNICHE_L as CF4IMDILITEL, ");
    SQL.append("  A.LIQ_CONTABILI_L as CF4IMDILICOL ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_CF4WIMPSDISP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CF4WEB_IMPSUB_DISPONIBILITA A ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_CF4WIMPSDISP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((~~TBL_PARAMETRI72.ROWNAMIMSUIM~~ = 'S' AND A.ANNO_IMP = ~~TBL_PARAMETRI72.ROWNAMANNIMP~~ AND A.NUMERO_IMP = ~~TBL_PARAMETRI72.ROWNAMNUMIMP~~ AND A.ANNO_SUBIMP = ~~TBL_PARAMETRI72.ROWNAMANSUIM~~ AND A.NUMERO_SUBIMP = ~~TBL_PARAMETRI72.ROWNAMNUSUIM~~) OR (~~TBL_PARAMETRI72.ROWNAMIMSUIM~~ = 'I' AND A.ANNO_IMP = ~~TBL_PARAMETRI72.ROWNAMANNIMP~~ AND A.NUMERO_IMP = ~~TBL_PARAMETRI72.ROWNAMNUMIMP~~ AND A.ANNO_SUBIMP = 0 AND A.NUMERO_SUBIMP = 0)) ");
    PAN_DISPONIBILIT.SetQuery(PPQRY_CF4WIMPSDISP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_CF4WIMPSDISP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_CF4WIMPSDISP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISPONIBILIT.SetQuery(PPQRY_CF4WIMPSDISP, 5, SQL, -1, "");
    PAN_DISPONIBILIT.SetQueryDB(PPQRY_CF4WIMPSDISP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISPONIBILIT.SetMasterTable(0, "CF4WEB_IMPSUB_DISPONIBILITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISPONIBILIT.Status() == 2)
    {
      int oldListQBE = PAN_DISPONIBILIT.iUseListQBE;
      PAN_DISPONIBILIT.iUseListQBE = 0;
      PAN_DISPONIBILIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISPONIBILIT.PanelCommand(Glb.PCM_FIND);
      PAN_DISPONIBILIT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_DISPONIBILIT) PAN_DISPONIBILIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
