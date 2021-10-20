// **********************************************
// Accertamenti Per Debitore
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AccertamentiPerDebitore extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_ACCERPERDEBI_CODICEDEBITO = 0;
  private static int PFL_ACCERPERDEBI_RESIDUICOMPE = 1;
  private static int PFL_ACCERPERDEBI_DATAELABORAZ = 2;
  private static int PFL_ACCERPERDEBI_ELABORA = 3;
  private static int PFL_ACCERPERDEBI_SCEGBENEBUTT = 4;
  private static int PFL_ACCERPERDEBI_DEBITORSMART = 5;

  private static int PPQRY_PAR29 = 0;

  private static int PPQRY_BEN = 1;


  IDPanel PAN_ACCERPERDEBI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR30(IMDB);
    //
    //
    Init_PQRY_PAR29(IMDB);
    Init_PQRY_PAR29_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR30, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR30, "TBL_PAR30");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR30,IMDBDef6.FLD_PAR30_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR30,IMDBDef6.FLD_PAR30_ROWNAMERESID,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR30,IMDBDef6.FLD_PAR30_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR30,IMDBDef6.FLD_PAR30_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR30,IMDBDef6.FLD_PAR30_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR30,IMDBDef6.FLD_PAR30_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR30, 0);
  }

  private static void Init_PQRY_PAR29(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR29, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR29, "PQRY_PAR29");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR29,IMDBDef15.PQSL_PAR29_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR29,IMDBDef15.PQSL_PAR29_ROWNAMERESID,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR29,IMDBDef15.PQSL_PAR29_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR29,IMDBDef15.PQSL_PAR29_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR29,IMDBDef15.PQSL_PAR29_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR29,IMDBDef15.PQSL_PAR29_ROWNAMCODDEB,2,15,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR29, 0);
  }

  private static void Init_PQRY_PAR29_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR29_RS, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR29_RS, "PQRY_PAR29_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR29_RS,IMDBDef15.PQSL_PAR29_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR29_RS,IMDBDef15.PQSL_PAR29_ROWNAMERESID,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR29_RS,IMDBDef15.PQSL_PAR29_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR29_RS,IMDBDef15.PQSL_PAR29_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR29_RS,IMDBDef15.PQSL_PAR29_ROWNAMCODDEB, "ROWNAMCODDEB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR29_RS,IMDBDef15.PQSL_PAR29_ROWNAMCODDEB,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AccertamentiPerDebitore(MyWebEntryPoint w, IMDBObj imdb)
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
  public AccertamentiPerDebitore()
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
    FormIdx = MyGlb.FRM_ACCERPERDEBI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CF8D0042-9EB5-4664-97A9-44B0A9E7D437";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 416;
    DesignHeight = 254;
    set_Caption(new IDVariant("Accertamenti Per Debitore"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 416;
    Frames[1].Height = 228;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Accertamenti Per Debitore";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 228;
    PAN_ACCERPERDEBI = new IDPanel(w, this, 1, "PAN_ACCERPERDEBI");
    Frames[1].Content = PAN_ACCERPERDEBI;
    PAN_ACCERPERDEBI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ACCERPERDEBI.VS = MainFrm.VisualStyleList;
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 416-MyGlb.PAN_OFFS_X, 228-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ACCERPERDEBI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "84E84C86-A2ED-46D3-BA8A-629C0065C883");
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 756, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ACCERPERDEBI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ACCERPERDEBI.InitStatus = 2;
    PAN_ACCERPERDEBI_Init();
    PAN_ACCERPERDEBI_InitFields();
    PAN_ACCERPERDEBI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR30, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ACCERPERDEBI_PAR29();
      }
      PAN_ACCERPERDEBI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_ACCERPERDEBI.FrIndex)
    {
      if (IdxFieldActived ==PFL_ACCERPERDEBI_SCEGBENEBUTT) {
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
    return (obj instanceof AccertamentiPerDebitore);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AccertamentiPerDebitore.class.getName() : (Glb.ClassWithPackage(AccertamentiPerDebitore.class) ? AccertamentiPerDebitore.class.getName().substring(AccertamentiPerDebitore.class.getPackage().getName().length() + 1) : AccertamentiPerDebitore.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("DEBITORE"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("COMP_RES"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("DISPONIBILI"));
      IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR5 = (new IDVariant("DATA_ELAB"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("Accertamenti_per_Debitore"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef15.PQRY_PAR29, IMDBDef15.PQSL_PAR29_ROWNAMCODDEB, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef15.PQRY_PAR29, IMDBDef15.PQSL_PAR29_ROWNAMERESID, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, (new IDVariant("N")));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef15.PQRY_PAR29, IMDBDef15.PQSL_PAR29_ROWNAMDATELA, 0)));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerDebitore", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ben
  // **********************************************************************
  public int ApriBen ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ben Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerDebitore", "ApriBen", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMERESID, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMDATELA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerDebitore", "LoadEvent", _e);
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
      UNLOADEVENT_PARDELETROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerDebitore", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par: Delete rows
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARDELETROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMERESID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMCODDEB, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_PAR29, IMDBDef15.PQSL_PAR29_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef15.PQRY_PAR29, IMDBDef15.PQSL_PAR29_ROWNAMCODDEB, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerDebitore", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Per Debitore On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ACCERPERDEBI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ACCERPERDEBI);
      // 
      // Accertamenti Per Debitore On Dynamic Properties Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerDebitore", "AccertamentiPerDebitoreOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Accertamenti Per Debitore On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_ACCERPERDEBI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Accertamenti Per Debitore On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_ACCERPERDEBI_DEBITORSMART)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_ACCERPERDEBI.FieldText(PFL_ACCERPERDEBI_DEBITORSMART))), IDL.Today(), (new IDVariant("SITACC")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AccertamentiPerDebitore", "AccertamentiPerDebitoreOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ACCERPERDEBI_PAR29() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR29_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR30, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR30, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR29_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR29_RS, 0, IMDBDef6.TBL_PAR30, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR29_RS, 0, 0, IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMERESID, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR29_RS, 1, 0, IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR29_RS, 2, 0, IMDBDef6.TBL_PAR30, IMDBDef6.FLD_PAR30_ROWNAMCODDEB, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR30, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR30, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR30, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR29_RS, 0);
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
  private void PAN_ACCERPERDEBI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ACCERPERDEBI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ACCERPERDEBI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ACCERPERDEBI, Cancel);
    // Stub
  }

  private void PAN_ACCERPERDEBI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ACCERPERDEBI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ACCERPERDEBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ACCERPERDEBI_SCEGBENEBUTT)
    {
      this.IdxPanelActived = this.PAN_ACCERPERDEBI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriBen();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ACCERPERDEBI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ACCERPERDEBI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ACCERPERDEBI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ACCERPERDEBI_Init()
  {

    PAN_ACCERPERDEBI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ACCERPERDEBI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ACCERPERDEBI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_ACCERPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, "EB581EA7-0CF8-43F8-B2D9-1D67C0FCE06B");
    PAN_ACCERPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, "Codice Debitore");
    PAN_ACCERPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, "");
    PAN_ACCERPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, "04F8385C-4ECA-405F-AA80-7C747330C7F3");
    PAN_ACCERPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, "Residuicompetenzeentrambi");
    PAN_ACCERPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, "");
    PAN_ACCERPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.VIS_OPTIONBUTTON);
    PAN_ACCERPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, "EFBB868E-F803-4E28-9A29-D08D19DCF96D");
    PAN_ACCERPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, "Data Elaborazione");
    PAN_ACCERPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, "");
    PAN_ACCERPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ACCERPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, "5F7EC311-0281-49A2-AC99-BC986EDA9A33");
    PAN_ACCERPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, "Elabora");
    PAN_ACCERPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ACCERPERDEBI.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, 0, "button1.gif", false);
    PAN_ACCERPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, "D6AA5886-6018-4B8D-AC52-F00745717D8F");
    PAN_ACCERPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, "");
    PAN_ACCERPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_ACCERPERDEBI.SetImage(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, 0, "wsearch1.gif", false);
    PAN_ACCERPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ACCERPERDEBI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, "4EBF5DC8-C3B5-4F63-BFFA-F5EF03CBF5B6");
    PAN_ACCERPERDEBI.set_Header(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, "Debitore");
    PAN_ACCERPERDEBI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, "Debitore");
    PAN_ACCERPERDEBI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.VIS_NORMALFIELDS);
    PAN_ACCERPERDEBI.SetFlags(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ACCERPERDEBI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, 40);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, 1);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_LIST, "Cod. Debit.");
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, 284, 20, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, 40);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, 1);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_CODICEDEBITO, MyGlb.PANEL_FORM, "C. Db.");
    PAN_ACCERPERDEBI.SetFieldPage(PFL_ACCERPERDEBI_CODICEDEBITO, -1, -1);
    PAN_ACCERPERDEBI.SetFieldPanel(PFL_ACCERPERDEBI_CODICEDEBITO, PPQRY_PAR29, "A.ROWNAMCODDEB", "ROWNAMCODDEB", 2, 15, 0, -13997);
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_LIST, 72, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_LIST, 144);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_LIST, 1);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_LIST, "Residuicompetenzeentrambi");
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_FORM, 88, 48, 124, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_FORM, 160);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_FORM, 4);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_RESIDUICOMPE, MyGlb.PANEL_FORM, "Residuicompet.");
    PAN_ACCERPERDEBI.SetFieldPage(PFL_ACCERPERDEBI_RESIDUICOMPE, -1, -1);
    PAN_ACCERPERDEBI.SetFieldPanel(PFL_ACCERPERDEBI_RESIDUICOMPE, PPQRY_PAR29, "A.ROWNAMERESID", "ROWNAMERESID", 12, 1, 0, -13997);
    PAN_ACCERPERDEBI.SetValueListItem(PFL_ACCERPERDEBI_RESIDUICOMPE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_ACCERPERDEBI.SetValueListItem(PFL_ACCERPERDEBI_RESIDUICOMPE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_ACCERPERDEBI.SetValueListItem(PFL_ACCERPERDEBI_RESIDUICOMPE, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, 280, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, 4, 112, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, 120);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_ACCERPERDEBI.SetFieldPage(PFL_ACCERPERDEBI_DATAELABORAZ, -1, -1);
    PAN_ACCERPERDEBI.SetFieldPanel(PFL_ACCERPERDEBI_DATAELABORAZ, PPQRY_PAR29, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, MyGlb.PANEL_LIST, 244, 156, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, MyGlb.PANEL_FORM, 276, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ACCERPERDEBI.SetFieldPage(PFL_ACCERPERDEBI_ELABORA, -1, -1);
    PAN_ACCERPERDEBI.SetFieldPanel(PFL_ACCERPERDEBI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_LIST, 324, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_FORM, 344, 22, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_SCEGBENEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_ACCERPERDEBI.SetFieldPage(PFL_ACCERPERDEBI_SCEGBENEBUTT, -1, -1);
    PAN_ACCERPERDEBI.SetFieldPanel(PFL_ACCERPERDEBI_SCEGBENEBUTT, -1, "", "SCEGBENEBUTT", 0, 0, 0, -13997);
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_LIST, 80);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_LIST, 2);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_LIST, "Debitore");
    PAN_ACCERPERDEBI.SetRect(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_FORM, 24, 18, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ACCERPERDEBI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_FORM, 60);
    PAN_ACCERPERDEBI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_FORM, 1);
    PAN_ACCERPERDEBI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ACCERPERDEBI_DEBITORSMART, MyGlb.PANEL_FORM, "Debitore");
    PAN_ACCERPERDEBI.SetFieldPage(PFL_ACCERPERDEBI_DEBITORSMART, -1, -1);
    PAN_ACCERPERDEBI.SetFieldPanel(PFL_ACCERPERDEBI_DEBITORSMART, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
  }

  private void PAN_ACCERPERDEBI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ACCERPERDEBI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODDEB~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERPERDEBI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_ACCERPERDEBI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ACCERPERDEBI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_ACCERPERDEBI.SetQueryLKE(PPQRY_BEN, PFL_ACCERPERDEBI_CODICEDEBITO, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_ACCERPERDEBI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_ACCERPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_ACCERPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_ACCERPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_ACCERPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_ACCERPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_ACCERPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_ACCERPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_ACCERPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_ACCERPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_ACCERPERDEBI.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_ACCERPERDEBI.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    PAN_ACCERPERDEBI.SetIMDB(IMDB, "PQRY_PAR29", true);
    PAN_ACCERPERDEBI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ACCERPERDEBI.SetQueryIMDB(PPQRY_PAR29, IMDBDef15.PQRY_PAR29_RS, IMDBDef6.TBL_PAR30);
    JustLoaded = true;
    PAN_ACCERPERDEBI.SetFieldPrimaryIndex(PFL_ACCERPERDEBI_CODICEDEBITO, IMDBDef6.FLD_PAR30_ROWNAMCODDEB);
    PAN_ACCERPERDEBI.SetFieldPrimaryIndex(PFL_ACCERPERDEBI_RESIDUICOMPE, IMDBDef6.FLD_PAR30_ROWNAMERESID);
    PAN_ACCERPERDEBI.SetFieldPrimaryIndex(PFL_ACCERPERDEBI_DATAELABORAZ, IMDBDef6.FLD_PAR30_ROWNAMDATELA);
    PAN_ACCERPERDEBI.SetMasterTable(0, "PAR30");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ACCERPERDEBI.Status() == 2)
    {
      int oldListQBE = PAN_ACCERPERDEBI.iUseListQBE;
      PAN_ACCERPERDEBI.iUseListQBE = 0;
      PAN_ACCERPERDEBI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ACCERPERDEBI.PanelCommand(Glb.PCM_FIND);
      PAN_ACCERPERDEBI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ACCERPERDEBI) PAN_ACCERPERDEBI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCERPERDEBI) PAN_ACCERPERDEBI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ACCERPERDEBI) PAN_ACCERPERDEBI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ACCERPERDEBI) PAN_ACCERPERDEBI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ACCERPERDEBI) PAN_ACCERPERDEBI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_ACCERPERDEBI) PAN_ACCERPERDEBI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
