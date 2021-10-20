// **********************************************
// Riemissione Imp Acc Pluriennali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RiemissioneImpAccPluriennali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_RIEIMPACCPLU_DATARIEMISSI = 0;
  private static int PFL_RIEIMPACCPLU_RIEMISACCERT = 1;
  private static int PFL_RIEIMPACCPLU_RIEMISIMPEGN = 2;
  private static int PFL_RIEIMPACCPLU_RIEMISSUBIMP = 3;
  private static int PFL_RIEIMPACCPLU_OK = 4;
  private static int PFL_RIEIMPACCPLU_ANNULLA = 5;

  private static int PPQRY_OUT6 = 0;


  IDPanel PAN_RIEIMPACCPLU;

  // Definition of Global Variables
  private IDVariant RIEMIMPECHEC = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI122(IMDB);
    Init_TBL_OUT9(IMDB);
    //
    //
    Init_PQRY_OUT6(IMDB);
    Init_PQRY_OUT6_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI122(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI122, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI122, "TBL_PARAMETRI122");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI122,IMDBDef3.FLD_PARAMETRI122_ROWNAMEESEIN, "ROWNAMEESEIN");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI122,IMDBDef3.FLD_PARAMETRI122_ROWNAMEESEIN,1,4,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI122, 0);
  }

  private static void Init_TBL_OUT9(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_OUT9, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_OUT9, "TBL_OUT9");
    IMDB.set_FldCode(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMDATRIE, "ROWNAMDATRIE");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMDATRIE,6,14,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMRIEACC, "ROWNAMRIEACC");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMRIEACC,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMRIEIMP, "ROWNAMRIEIMP");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMRIEIMP,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMRIESUB, "ROWNAMRIESUB");
    IMDB.SetFldParams(IMDBDef3.TBL_OUT9,IMDBDef3.FLD_OUT9_ROWNAMRIESUB,1,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_OUT9, 0);
  }

  private static void Init_PQRY_OUT6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT6, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT6, "PQRY_OUT6");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMDATRIE, "ROWNAMDATRIE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMDATRIE,6,14,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMRIEACC, "ROWNAMRIEACC");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMRIEACC,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP, "ROWNAMRIEIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMRIESUB, "ROWNAMRIESUB");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6,IMDBDef11.PQSL_OUT6_ROWNAMRIESUB,1,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_OUT6, 0);
  }

  private static void Init_PQRY_OUT6_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_OUT6_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_OUT6_RS, "PQRY_OUT6_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMDATRIE, "ROWNAMDATRIE");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMDATRIE,6,14,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMRIEACC, "ROWNAMRIEACC");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMRIEACC,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP, "ROWNAMRIEIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMRIESUB, "ROWNAMRIESUB");
    IMDB.SetFldParams(IMDBDef11.PQRY_OUT6_RS,IMDBDef11.PQSL_OUT6_ROWNAMRIESUB,1,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RiemissioneImpAccPluriennali(MyWebEntryPoint w, IMDBObj imdb)
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
  public RiemissioneImpAccPluriennali()
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
    FormIdx = MyGlb.FRM_RIEIMPACCPLU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4BF41927-5C99-4670-9DF1-A16F235C9E06";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 380;
    DesignHeight = 254;
    set_Caption(new IDVariant("Riemissione Imp Acc Pluriennali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 380;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Riemissione Imp Acc Pluriennali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_RIEIMPACCPLU = new IDPanel(w, this, 1, "PAN_RIEIMPACCPLU");
    Frames[1].Content = PAN_RIEIMPACCPLU;
    PAN_RIEIMPACCPLU.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_RIEIMPACCPLU.VS = MainFrm.VisualStyleList;
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 380-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_RIEIMPACCPLU.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A3EA58BB-D56C-4A54-9A58-0970256E3B4F");
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 280, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_RIEIMPACCPLU.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_RIEIMPACCPLU.InitStatus = 2;
    PAN_RIEIMPACCPLU_Init();
    PAN_RIEIMPACCPLU_InitFields();
    PAN_RIEIMPACCPLU_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_OUT9, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RIEIMPACCPLU_OUT6();
      }
      PAN_RIEIMPACCPLU.UpdatePanel(MainFrm);
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
    return (obj instanceof RiemissioneImpAccPluriennali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RiemissioneImpAccPluriennali.class.getName() : (Glb.ClassWithPackage(RiemissioneImpAccPluriennali.class) ? RiemissioneImpAccPluriennali.class.getName().substring(RiemissioneImpAccPluriennali.class.getPackage().getName().length() + 1) : RiemissioneImpAccPluriennali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_CAP = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAP = (new IDVariant("Aggiornamento Bilancio Pluriennale", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAP, (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI122, IMDBDef3.FLD_PARAMETRI122_ROWNAMEESEIN, 0))));
      IMDB.set_Value(IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMDATRIE, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiemissioneImpAccPluriennali", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIESUB, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEACC, 0, (new IDVariant(0)));
      RIEMIMPECHEC = (new IDVariant(0));
      IMDB.set_Value(IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMRIEACC, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMRIEIMP, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMRIESUB, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiemissioneImpAccPluriennali", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Riemissione Imp Acc Pluriennali On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_RIEIMPACCPLU_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_RIEIMPACCPLU);
      // 
      // Riemissione Imp Acc Pluriennali On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (RIEMIMPECHEC.equals((new IDVariant(0)), true))
      {
        PAN_RIEIMPACCPLU.SetFlags (Glb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiemissioneImpAccPluriennali", "RiemissioneImpAccPluriennaliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Riemissione Imp Acc Pluriennali Riemissione Impegni Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_RIEIMPACCPLU_RIEMISIMPEGN_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Riemissione Imp Acc Pluriennali Riemissione Impegni Validate Event Body
      // Procedure Body
      // 
      if (RIEMIMPECHEC.equals((new IDVariant(0)), true) && IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP, 0).equals((new IDVariant(1)), true))
      {
        RIEMIMPECHEC = (new IDVariant(1));
        PAN_RIEIMPACCPLU.SetFlags (Glb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (RIEMIMPECHEC.equals((new IDVariant(1)), true) && IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP, 0).equals((new IDVariant(0)), true))
      {
        RIEMIMPECHEC = (new IDVariant(0));
        PAN_RIEIMPACCPLU.SetFlags (Glb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiemissioneImpAccPluriennali", "RiemissioneImpAccPluriennaliRiemissioneImpegniValidateEvent", _e);
    }
  }

  // **********************************************************************
  // OK Proc
  // **********************************************************************
  public int OKProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PROCTERMINAT = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESS2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESS3 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_PROCTERMINAT = (new IDVariant("Procedura Terminata", IDVariant.STRING));
      v_MESS2 = (new IDVariant("Primo Accertamento Emesso: ", IDVariant.STRING));
      v_MESS3 = (new IDVariant("Ultimo Accertamento Emesso: ", IDVariant.STRING));
      // 
      // OK Proc Body
      // Procedure Body
      // 
      v_PROCTERMINAT = IDL.Add(v_PROCTERMINAT, (new IDVariant("<BR/>")));
      if (IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEACC, 0).equals((new IDVariant(1)), true) && IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP, 0).equals((new IDVariant(1)), true))
      {
        IDVariant v_OUT1 = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_OUT2 = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_IMP1 = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_IMP2 = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SUBIMP1 = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_SUBIMP2 = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ERRORMESSAGE = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ERRORMESSAG2 = new IDVariant(0,IDVariant.STRING);
        IDVariant v_PRIMO = new IDVariant(0,IDVariant.STRING);
        v_PRIMO = (new IDVariant("Primo Impegno emesso: ", IDVariant.STRING));
        IDVariant v_ULTIMO = new IDVariant(0,IDVariant.STRING);
        v_ULTIMO = (new IDVariant("Ultimo Impegno emesso: ", IDVariant.STRING));
        IDVariant v_SUB1 = new IDVariant(0,IDVariant.STRING);
        v_SUB1 = (new IDVariant("Primo SubImpegno emesso: ", IDVariant.STRING));
        IDVariant v_SUB2 = new IDVariant(0,IDVariant.STRING);
        v_SUB2 = (new IDVariant("Ultimo SubImpegno emesso: ", IDVariant.STRING));
        v_ERRORMESSAGE = (new IDVariant(""));
        v_ERRORMESSAG2 = (new IDVariant(""));
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.BILACCERTAMENTIPLURIENNALI(IMDB.Value(IMDBDef3.TBL_PARAMETRI122, IMDBDef3.FLD_PARAMETRI122_ROWNAMEESEIN, 0), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMDATRIE, 0)), v_OUT1, v_OUT2);
        v_ERRORMESSAGE = (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()));
        MainFrm.Cf4armDBObject.BILIMPEGNIPLURIENNALI(IMDB.Value(IMDBDef3.TBL_PARAMETRI122, IMDBDef3.FLD_PARAMETRI122_ROWNAMEESEIN, 0), MainFrm.Datetostring(IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMDATRIE, 0)), IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIESUB, 0), v_IMP1, v_IMP2, v_SUBIMP1, v_SUBIMP2);
        v_ERRORMESSAG2 = (new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()));
        if (v_ERRORMESSAGE.compareTo((new IDVariant("")), true)!=0 && v_ERRORMESSAG2.compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(IDL.Add(IDL.Add(v_ERRORMESSAGE, (new IDVariant("<BR/>"))), v_ERRORMESSAG2)); 
        }
        else
        {
          // 
          // --------------------------------------------------
          // 
          // 
          if (v_ERRORMESSAGE.compareTo((new IDVariant("")), true)!=0 && v_ERRORMESSAG2.equals((new IDVariant("")), true))
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_ERRORMESSAGE, (new IDVariant("<BR/>"))), v_PRIMO), IDL.ToString(v_IMP1)), IDL.ToString(v_IMP1)), (new IDVariant("<BR/>"))), v_ULTIMO), IDL.ToString(v_IMP2)), (new IDVariant("<BR/>"))), v_SUB1), IDL.ToString(v_SUBIMP1)), v_SUB2), IDL.ToString(v_SUBIMP2))); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
          if (v_ERRORMESSAGE.equals((new IDVariant("")), true) && v_ERRORMESSAG2.compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_PROCTERMINAT, v_MESS2), IDL.ToString(v_OUT1)), (new IDVariant("<BR/>"))), v_MESS3), IDL.ToString(v_OUT2)), (new IDVariant("<BR/>"))), v_ERRORMESSAG2)); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
          if (v_ERRORMESSAGE.equals((new IDVariant("")), true) && v_ERRORMESSAG2.equals((new IDVariant("")), true))
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_PROCTERMINAT, v_MESS2), IDL.ToString(v_OUT1)), (new IDVariant("<BR/>"))), v_MESS3), IDL.ToString(v_OUT2)), (new IDVariant("<BR/>"))), v_PRIMO), IDL.ToString(v_IMP1)), (new IDVariant("<BR/>"))), v_ULTIMO), IDL.ToString(v_IMP2)), (new IDVariant("<BR/>"))), v_SUB1), IDL.ToString(v_SUBIMP1)), (new IDVariant("<BR/>"))), v_SUB2), IDL.ToString(v_SUBIMP2))); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEACC, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_OUT1 = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_OUT2 = new IDVariant(0,IDVariant.INTEGER);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.BILACCERTAMENTIPLURIENNALI(IMDB.Value(IMDBDef3.TBL_PARAMETRI122, IMDBDef3.FLD_PARAMETRI122_ROWNAMEESEIN, 0), IDL.ToString(IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMDATRIE, 0)), v_OUT1, v_OUT2);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_PROCTERMINAT, v_MESS2), IDL.ToString(v_OUT1)), (new IDVariant("<BR/>"))), v_MESS3), IDL.ToString(v_OUT2))); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
        }
        if (IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIEIMP, 0).equals((new IDVariant(1)), true))
        {
          IDVariant v_IMP1 = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_IMP2 = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SUBIMP1 = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SUBIMP2 = new IDVariant(0,IDVariant.INTEGER);
          v_IMP1 = (new IDVariant());
          v_IMP2 = (new IDVariant());
          v_SUBIMP1 = (new IDVariant());
          v_SUBIMP2 = (new IDVariant());
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.BILIMPEGNIPLURIENNALI(IMDB.Value(IMDBDef3.TBL_PARAMETRI122, IMDBDef3.FLD_PARAMETRI122_ROWNAMEESEIN, 0), MainFrm.Datetostring(IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMDATRIE, 0)), IMDB.Value(IMDBDef11.PQRY_OUT6, IMDBDef11.PQSL_OUT6_ROWNAMRIESUB, 0), v_IMP1, v_IMP2, v_SUBIMP1, v_SUBIMP2);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            IDVariant v_PRIMO = new IDVariant(0,IDVariant.STRING);
            v_PRIMO = (new IDVariant("Primo Impegno emesso: ", IDVariant.STRING));
            IDVariant v_ULTIMO = new IDVariant(0,IDVariant.STRING);
            v_ULTIMO = (new IDVariant("Ultimo Impegno emesso: ", IDVariant.STRING));
            IDVariant v_SUB1 = new IDVariant(0,IDVariant.STRING);
            v_SUB1 = (new IDVariant("Primo SubImpegno emesso: ", IDVariant.STRING));
            IDVariant v_SUB2 = new IDVariant(0,IDVariant.STRING);
            v_SUB2 = (new IDVariant("Ultimo SubImpegno emesso: ", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_PROCTERMINAT, v_PRIMO), IDL.ToString(v_IMP1)), (new IDVariant("<BR/>"))), v_ULTIMO), IDL.ToString(v_IMP2)), (new IDVariant("<BR/>"))), v_SUB1), IDL.ToString(v_SUBIMP1)), (new IDVariant("<BR/>"))), v_SUB2), IDL.ToString(v_SUBIMP2))); 
            MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiemissioneImpAccPluriennali", "OKProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla Proc
  // **********************************************************************
  public int AnnullaProc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Proc Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RiemissioneImpAccPluriennali", "AnnullaProc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // OUT
  // Primary record source for panel data
  // **********************************************************************
  private void RIEIMPACCPLU_OUT6() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_OUT6_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_OUT9, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_OUT9, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_OUT6_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_OUT6_RS, 0, IMDBDef3.TBL_OUT9, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT6_RS, 0, 0, IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMDATRIE, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT6_RS, 1, 0, IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMRIEACC, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT6_RS, 2, 0, IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMRIEIMP, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_OUT6_RS, 3, 0, IMDBDef3.TBL_OUT9, IMDBDef3.FLD_OUT9_ROWNAMRIESUB, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_OUT9, 0);
      if (IMDB.Eof(IMDBDef3.TBL_OUT9, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_OUT9, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_OUT6_RS, 0);
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
  private void PAN_RIEIMPACCPLU_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_RIEIMPACCPLU, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_RIEIMPACCPLU_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_RIEIMPACCPLU, Cancel);
    // Stub
  }

  private void PAN_RIEIMPACCPLU_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_RIEIMPACCPLU_OK)
    {
      this.IdxPanelActived = this.PAN_RIEIMPACCPLU.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      OKProc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_RIEIMPACCPLU_ANNULLA)
    {
      this.IdxPanelActived = this.PAN_RIEIMPACCPLU.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      AnnullaProc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_RIEIMPACCPLU_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_RIEIMPACCPLU_RIEMISIMPEGN)
      {
        PFL_RIEIMPACCPLU_RIEMISIMPEGN_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_RIEIMPACCPLU_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_RIEIMPACCPLU_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_RIEIMPACCPLU_Init()
  {

    PAN_RIEIMPACCPLU.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_RIEIMPACCPLU.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_RIEIMPACCPLU.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_RIEIMPACCPLU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, "E44C2CE3-B367-4829-9243-F66398E2542C");
    PAN_RIEIMPACCPLU.set_Header(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, "Data Riemissione");
    PAN_RIEIMPACCPLU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, "");
    PAN_RIEIMPACCPLU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.VIS_NORMALFIELDS);
    PAN_RIEIMPACCPLU.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RIEIMPACCPLU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, "41F06F6C-8710-4BAB-A8B8-7025720872FB");
    PAN_RIEIMPACCPLU.set_Header(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, "Riemissione Accertamenti");
    PAN_RIEIMPACCPLU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, "");
    PAN_RIEIMPACCPLU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.VIS_CHECKSTYLE);
    PAN_RIEIMPACCPLU.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RIEIMPACCPLU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, "141B93E1-6173-4156-B0BB-FD2CDE861324");
    PAN_RIEIMPACCPLU.set_Header(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, "Riemissione Impegni");
    PAN_RIEIMPACCPLU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, "");
    PAN_RIEIMPACCPLU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.VIS_CHECKSTYLE);
    PAN_RIEIMPACCPLU.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RIEIMPACCPLU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, "B11BA829-46CF-4460-9904-F20B562C9D5C");
    PAN_RIEIMPACCPLU.set_Header(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, "Riemissione Subimpegni");
    PAN_RIEIMPACCPLU.set_ToolTip(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, "");
    PAN_RIEIMPACCPLU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.VIS_CHECKSTYLE);
    PAN_RIEIMPACCPLU.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_RIEIMPACCPLU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, "CD6C6840-2BC7-41DF-96DA-6D6EE16FC7B3");
    PAN_RIEIMPACCPLU.set_Header(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, "OK");
    PAN_RIEIMPACCPLU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, MyGlb.VIS_STATICBUTTON);
    PAN_RIEIMPACCPLU.SetImage(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, 0, "button1.gif", false);
    PAN_RIEIMPACCPLU.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_RIEIMPACCPLU.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, "7E481E26-C4E3-4114-9A7A-452121F18CE6");
    PAN_RIEIMPACCPLU.set_Header(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, "Annulla");
    PAN_RIEIMPACCPLU.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, MyGlb.VIS_STATICBUTTON);
    PAN_RIEIMPACCPLU.SetImage(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, 0, "button1.gif", false);
    PAN_RIEIMPACCPLU.SetFlags(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_RIEIMPACCPLU_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_LIST, 92);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_LIST, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_LIST, "Data Riemissione");
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_FORM, 80, 16, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_FORM, 108);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_FORM, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_DATARIEMISSI, MyGlb.PANEL_FORM, "Data Riemissione");
    PAN_RIEIMPACCPLU.SetFieldPage(PFL_RIEIMPACCPLU_DATARIEMISSI, -1, -1);
    PAN_RIEIMPACCPLU.SetFieldPanel(PFL_RIEIMPACCPLU_DATARIEMISSI, PPQRY_OUT6, "A.ROWNAMDATRIE", "ROWNAMDATRIE", 6, 14, 0, -13997);
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_LIST, 136, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_LIST, 132);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_LIST, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_LIST, "Riemis. Accert.");
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_FORM, 96, 44, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_FORM, 156);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_FORM, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISACCERT, MyGlb.PANEL_FORM, "Riemissione Accertamenti");
    PAN_RIEIMPACCPLU.SetFieldPage(PFL_RIEIMPACCPLU_RIEMISACCERT, -1, -1);
    PAN_RIEIMPACCPLU.SetFieldPanel(PFL_RIEIMPACCPLU_RIEMISACCERT, PPQRY_OUT6, "A.ROWNAMRIEACC", "ROWNAMRIEACC", 1, 1, 0, -13997);
    PAN_RIEIMPACCPLU.SetValueListItem(PFL_RIEIMPACCPLU_RIEMISACCERT, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_RIEIMPACCPLU.SetValueListItem(PFL_RIEIMPACCPLU_RIEMISACCERT, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_LIST, 184, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_LIST, 104);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_LIST, "Riemis. Imp.");
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_FORM, 96, 72, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_FORM, 156);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISIMPEGN, MyGlb.PANEL_FORM, "Riemissione Impegni");
    PAN_RIEIMPACCPLU.SetFieldPage(PFL_RIEIMPACCPLU_RIEMISIMPEGN, -1, -1);
    PAN_RIEIMPACCPLU.SetFieldPanel(PFL_RIEIMPACCPLU_RIEMISIMPEGN, PPQRY_OUT6, "A.ROWNAMRIEIMP", "ROWNAMRIEIMP", 1, 1, 0, -13997);
    PAN_RIEIMPACCPLU.SetValueListItem(PFL_RIEIMPACCPLU_RIEMISIMPEGN, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_RIEIMPACCPLU.SetValueListItem(PFL_RIEIMPACCPLU_RIEMISIMPEGN, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_LIST, 232, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_LIST, 120);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_LIST, "Riemis. Subim.");
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_FORM, 104, 100, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_FORM, 148);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_RIEIMPACCPLU.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_RIEMISSUBIMP, MyGlb.PANEL_FORM, "Riemissione Subimpegni");
    PAN_RIEIMPACCPLU.SetFieldPage(PFL_RIEIMPACCPLU_RIEMISSUBIMP, -1, -1);
    PAN_RIEIMPACCPLU.SetFieldPanel(PFL_RIEIMPACCPLU_RIEMISSUBIMP, PPQRY_OUT6, "A.ROWNAMRIESUB", "ROWNAMRIESUB", 1, 1, 0, -13997);
    PAN_RIEIMPACCPLU.SetValueListItem(PFL_RIEIMPACCPLU_RIEMISSUBIMP, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_RIEIMPACCPLU.SetValueListItem(PFL_RIEIMPACCPLU_RIEMISSUBIMP, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, MyGlb.PANEL_LIST, 24, 136, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, MyGlb.PANEL_LIST, 0);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, MyGlb.PANEL_LIST, 1);
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, MyGlb.PANEL_FORM, 104, 144, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, MyGlb.PANEL_FORM, 0);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_OK, MyGlb.PANEL_FORM, 1);
    PAN_RIEIMPACCPLU.SetFieldPage(PFL_RIEIMPACCPLU_OK, -1, -1);
    PAN_RIEIMPACCPLU.SetFieldPanel(PFL_RIEIMPACCPLU_OK, -1, "", "OK", 0, 0, 0, -13997);
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, MyGlb.PANEL_LIST, 32, 144, 88, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, MyGlb.PANEL_LIST, 0);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, MyGlb.PANEL_LIST, 1);
    PAN_RIEIMPACCPLU.SetRect(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, MyGlb.PANEL_FORM, 196, 144, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_RIEIMPACCPLU.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, MyGlb.PANEL_FORM, 0);
    PAN_RIEIMPACCPLU.SetNumRow(MyGlb.OBJ_FIELD, PFL_RIEIMPACCPLU_ANNULLA, MyGlb.PANEL_FORM, 1);
    PAN_RIEIMPACCPLU.SetFieldPage(PFL_RIEIMPACCPLU_ANNULLA, -1, -1);
    PAN_RIEIMPACCPLU.SetFieldPanel(PFL_RIEIMPACCPLU_ANNULLA, -1, "", "ANNULLA", 0, 0, 0, -13997);
  }

  private void PAN_RIEIMPACCPLU_InitQueries()
  {
    StringBuffer SQL;

    PAN_RIEIMPACCPLU.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_RIEIMPACCPLU.SetIMDB(IMDB, "PQRY_OUT6", true);
    PAN_RIEIMPACCPLU.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_RIEIMPACCPLU.SetQueryIMDB(PPQRY_OUT6, IMDBDef11.PQRY_OUT6_RS, IMDBDef3.TBL_OUT9);
    JustLoaded = true;
    PAN_RIEIMPACCPLU.SetFieldPrimaryIndex(PFL_RIEIMPACCPLU_DATARIEMISSI, IMDBDef3.FLD_OUT9_ROWNAMDATRIE);
    PAN_RIEIMPACCPLU.SetFieldPrimaryIndex(PFL_RIEIMPACCPLU_RIEMISACCERT, IMDBDef3.FLD_OUT9_ROWNAMRIEACC);
    PAN_RIEIMPACCPLU.SetFieldPrimaryIndex(PFL_RIEIMPACCPLU_RIEMISIMPEGN, IMDBDef3.FLD_OUT9_ROWNAMRIEIMP);
    PAN_RIEIMPACCPLU.SetFieldPrimaryIndex(PFL_RIEIMPACCPLU_RIEMISSUBIMP, IMDBDef3.FLD_OUT9_ROWNAMRIESUB);
    PAN_RIEIMPACCPLU.SetMasterTable(0, "OUT9");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_RIEIMPACCPLU.Status() == 2)
    {
      int oldListQBE = PAN_RIEIMPACCPLU.iUseListQBE;
      PAN_RIEIMPACCPLU.iUseListQBE = 0;
      PAN_RIEIMPACCPLU.PanelCommand(Glb.PCM_SEARCH);
      PAN_RIEIMPACCPLU.PanelCommand(Glb.PCM_FIND);
      PAN_RIEIMPACCPLU.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_RIEIMPACCPLU) PAN_RIEIMPACCPLU_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_RIEIMPACCPLU) PAN_RIEIMPACCPLU_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_RIEIMPACCPLU) PAN_RIEIMPACCPLU_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_RIEIMPACCPLU) PAN_RIEIMPACCPLU_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_RIEIMPACCPLU) PAN_RIEIMPACCPLU_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
