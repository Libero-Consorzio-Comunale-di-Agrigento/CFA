// **********************************************
// Subimpegni Per Beneficiario
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SubimpegniPerBeneficiario extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_SUBIMPERBENE_BENEFICIARIO = 0;
  private static int PFL_SUBIMPERBENE_CODICEBENEFI = 1;
  private static int PFL_SUBIMPERBENE_RESIDUI = 2;
  private static int PFL_SUBIMPERBENE_DATAELABORAZ = 3;
  private static int PFL_SUBIMPERBENE_ELABORA = 4;
  private static int PFL_SUBIMPERBENE_SCEGBENEBUTT = 5;

  private static int PPQRY_SUBIMPERBEN1 = 0;

  private static int PPQRY_BEN = 1;


  IDPanel PAN_SUBIMPERBENE;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_SUBIMPERBEN3(IMDB);
    //
    //
    Init_PQRY_SUBIMPERBEN1(IMDB);
    Init_PQRY_SUBIMPERBEN1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_SUBIMPERBEN3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_SUBIMPERBEN3, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_SUBIMPERBEN3, "TBL_SUBIMPERBEN3");
    IMDB.set_FldCode(IMDBDef6.TBL_SUBIMPERBEN3,IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBIMPERBEN3,IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMERESID,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBIMPERBEN3,IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBIMPERBEN3,IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_SUBIMPERBEN3,IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef6.TBL_SUBIMPERBEN3,IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMCODBEN,2,15,0);
    IMDB.TblAddNew(IMDBDef6.TBL_SUBIMPERBEN3, 0);
  }

  private static void Init_PQRY_SUBIMPERBEN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBIMPERBEN1, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBIMPERBEN1, "PQRY_SUBIMPERBEN1");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBIMPERBEN1,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBIMPERBEN1,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMERESID,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBIMPERBEN1,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBIMPERBEN1,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBIMPERBEN1,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBIMPERBEN1,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMCODBEN,2,15,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_SUBIMPERBEN1, 0);
  }

  private static void Init_PQRY_SUBIMPERBEN1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_SUBIMPERBEN1_RS, 3);
    IMDB.set_TblCode(IMDBDef16.PQRY_SUBIMPERBEN1_RS, "PQRY_SUBIMPERBEN1_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBIMPERBEN1_RS,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMERESID, "ROWNAMERESID");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBIMPERBEN1_RS,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMERESID,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBIMPERBEN1_RS,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBIMPERBEN1_RS,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMDATELA,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_SUBIMPERBEN1_RS,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef16.PQRY_SUBIMPERBEN1_RS,IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMCODBEN,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SubimpegniPerBeneficiario(MyWebEntryPoint w, IMDBObj imdb)
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
  public SubimpegniPerBeneficiario()
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
    FormIdx = MyGlb.FRM_SUBIMPERBENE;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5AC72F34-B3A8-4BB6-A674-4D2C2B4F7048";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 424;
    DesignHeight = 250;
    set_Caption(new IDVariant("Subimpegni Per Beneficiario"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 424;
    Frames[1].Height = 224;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Subimpegni Per Beneficiario";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 224;
    PAN_SUBIMPERBENE = new IDPanel(w, this, 1, "PAN_SUBIMPERBENE");
    Frames[1].Content = PAN_SUBIMPERBENE;
    PAN_SUBIMPERBENE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SUBIMPERBENE.VS = MainFrm.VisualStyleList;
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 424-MyGlb.PAN_OFFS_X, 224-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SUBIMPERBENE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2FD67221-0E26-4320-A7B2-6556C72BC35B");
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 636, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SUBIMPERBENE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SUBIMPERBENE.InitStatus = 2;
    PAN_SUBIMPERBENE_Init();
    PAN_SUBIMPERBENE_InitFields();
    PAN_SUBIMPERBENE_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_SUBIMPERBEN3, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SUBIMPERBENE_SUBIMPERBEN1();
      }
      PAN_SUBIMPERBENE.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_SUBIMPERBENE.FrIndex)
    {
      if (IdxFieldActived ==PFL_SUBIMPERBENE_SCEGBENEBUTT) {
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
  // Torna TRUE se l'oggetto passato � una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SubimpegniPerBeneficiario);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SubimpegniPerBeneficiario.class.getName() : (Glb.ClassWithPackage(SubimpegniPerBeneficiario.class) ? SubimpegniPerBeneficiario.class.getName().substring(SubimpegniPerBeneficiario.class.getPackage().getName().length() + 1) : SubimpegniPerBeneficiario.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.ErrObj.ProcError ("SubimpegniPerBeneficiario", "ApriBen", _e);
      return -1;
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
      IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
      IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR2 = (new IDVariant("BENEFICIARIO"));
      IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR3 = (new IDVariant("COMP_RES"));
      IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
      v_NOMEPAR4 = (new IDVariant("DATA_ELAB"));
      IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
      v_NOMESTAMPA = (new IDVariant("SubImpegni_per_Beneficiario"));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_SUBIMPERBEN1, IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMCODBEN, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IMDB.Value(IMDBDef16.PQRY_SUBIMPERBEN1, IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMERESID, 0));
      MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_SUBIMPERBEN1, IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMDATELA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("DISP_EFFETTIVA")), ((MainFrm.DispEffImpDaGE4())?(new IDVariant("SI")):(new IDVariant("NO"))));
      MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerBeneficiario", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMERESID, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMDATELA, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerBeneficiario", "LoadEvent", _e);
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
      UNLOADEVENT_SUBPERBEDERO();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerBeneficiario", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Beneficiario: Delete rows
  // Perch� stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_SUBPERBEDERO() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMERESID, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMDATELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMCODBEN, 0, new IDVariant());
  }

  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: � un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercher� di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
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
        IMDB.set_Value(IMDBDef16.PQRY_SUBIMPERBEN1, IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMCODBEN, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_SUBIMPERBEN1, IMDBDef16.PQSL_SUBIMPERBEN1_ROWNAMCODBEN, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerBeneficiario", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Beneficiario On Dynamic Properties Event
  // Consente l'aggiustamento delle propriet� visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SUBIMPERBENE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SUBIMPERBENE);
      // 
      // Subimpegni Per Beneficiario On Dynamic Properties Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerBeneficiario", "SubimpegniPerBeneficiarioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Beneficiario On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_SUBIMPERBENE_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Subimpegni Per Beneficiario On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_SUBIMPERBENE_BENEFICIARIO)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_SUBIMPERBENE.FieldText(PFL_SUBIMPERBENE_BENEFICIARIO))), IDL.Today(), (new IDVariant("SITSUBIMP")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SubimpegniPerBeneficiario", "SubimpegniPerBeneficiarioOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Subimpegni Per Beneficiario
  // Primary record source for panel data
  // **********************************************************************
  private void SUBIMPERBENE_SUBIMPERBEN1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_SUBIMPERBEN1_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_SUBIMPERBEN3, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_SUBIMPERBEN3, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_SUBIMPERBEN1_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_SUBIMPERBEN1_RS, 0, IMDBDef6.TBL_SUBIMPERBEN3, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBIMPERBEN1_RS, 0, 0, IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMERESID, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBIMPERBEN1_RS, 1, 0, IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_SUBIMPERBEN1_RS, 2, 0, IMDBDef6.TBL_SUBIMPERBEN3, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMCODBEN, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_SUBIMPERBEN3, 0);
      if (IMDB.Eof(IMDBDef6.TBL_SUBIMPERBEN3, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_SUBIMPERBEN3, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_SUBIMPERBEN1_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  private void PAN_SUBIMPERBENE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SUBIMPERBENE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SUBIMPERBENE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SUBIMPERBENE, Cancel);
    // Stub
  }

  private void PAN_SUBIMPERBENE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SUBIMPERBENE_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SUBIMPERBENE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SUBIMPERBENE_SCEGBENEBUTT)
    {
      this.IdxPanelActived = this.PAN_SUBIMPERBENE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriBen();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SUBIMPERBENE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SUBIMPERBENE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SUBIMPERBENE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SUBIMPERBENE_Init()
  {

    PAN_SUBIMPERBENE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SUBIMPERBENE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SUBIMPERBENE.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_SUBIMPERBENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, "55B09FB6-B9DE-4E8C-9306-AE68CB91CF4D");
    PAN_SUBIMPERBENE.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, "Beneficiario");
    PAN_SUBIMPERBENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, "");
    PAN_SUBIMPERBENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPERBENE.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPERBENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, "22A7DEC1-8849-4C0D-886A-C7F19E25C73F");
    PAN_SUBIMPERBENE.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, "Codice Beneficiario");
    PAN_SUBIMPERBENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, "");
    PAN_SUBIMPERBENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPERBENE.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, 0 | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPERBENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, "DCEEDE64-ECD9-4B1A-ACAC-01DF4A0A7B00");
    PAN_SUBIMPERBENE.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, "Residui");
    PAN_SUBIMPERBENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, "");
    PAN_SUBIMPERBENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.VIS_OPTIONBUTTON);
    PAN_SUBIMPERBENE.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPERBENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, "A951D3FF-8342-4304-AB47-B457753FEEAC");
    PAN_SUBIMPERBENE.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, "Data Elaborazione");
    PAN_SUBIMPERBENE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, "");
    PAN_SUBIMPERBENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_SUBIMPERBENE.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SUBIMPERBENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, "58F102EB-D981-45BA-A39E-66E688BED450");
    PAN_SUBIMPERBENE.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, "Elabora");
    PAN_SUBIMPERBENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SUBIMPERBENE.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, 0, "button1.gif", false);
    PAN_SUBIMPERBENE.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_SUBIMPERBENE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, "331BB032-DAD4-4255-82BA-3DDEF816BC2A");
    PAN_SUBIMPERBENE.set_Header(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, "");
    PAN_SUBIMPERBENE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, MyGlb.VIS_IMAGEBUTTONS);
    PAN_SUBIMPERBENE.SetImage(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, 0, "wsearch1.gif", false);
    PAN_SUBIMPERBENE.SetFlags(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SUBIMPERBENE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_LIST, 80);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_LIST, 2);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_FORM, 48, 8, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_FORM, 80);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_SUBIMPERBENE.SetFieldPage(PFL_SUBIMPERBENE_BENEFICIARIO, -1, -1);
    PAN_SUBIMPERBENE.SetFieldPanel(PFL_SUBIMPERBENE_BENEFICIARIO, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_LIST, 40);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_LIST, "Cod. Benef.");
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_FORM, 316, 8, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_FORM, 40);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_CODICEBENEFI, MyGlb.PANEL_FORM, "C. Bn.");
    PAN_SUBIMPERBENE.SetFieldPage(PFL_SUBIMPERBENE_CODICEBENEFI, -1, -1);
    PAN_SUBIMPERBENE.SetFieldPanel(PFL_SUBIMPERBENE_CODICEBENEFI, PPQRY_SUBIMPERBEN1, "A.ROWNAMCODBEN", "ROWNAMCODBEN", 2, 15, 0, -13997);
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_LIST, 72, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_LIST, 44);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_LIST, "Residui");
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_FORM, 136, 40, 92, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_FORM, 112);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_FORM, 4);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_RESIDUI, MyGlb.PANEL_FORM, "Residui");
    PAN_SUBIMPERBENE.SetFieldPage(PFL_SUBIMPERBENE_RESIDUI, -1, -1);
    PAN_SUBIMPERBENE.SetFieldPanel(PFL_SUBIMPERBENE_RESIDUI, PPQRY_SUBIMPERBEN1, "A.ROWNAMERESID", "ROWNAMERESID", 5, 1, 0, -13997);
    PAN_SUBIMPERBENE.SetValueListItem(PFL_SUBIMPERBENE_RESIDUI, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_SUBIMPERBENE.SetValueListItem(PFL_SUBIMPERBENE_RESIDUI, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_SUBIMPERBENE.SetValueListItem(PFL_SUBIMPERBENE_RESIDUI, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_LIST, 160, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_FORM, 16, 104, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPERBENE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_SUBIMPERBENE.SetFieldPage(PFL_SUBIMPERBENE_DATAELABORAZ, -1, -1);
    PAN_SUBIMPERBENE.SetFieldPanel(PFL_SUBIMPERBENE_DATAELABORAZ, PPQRY_SUBIMPERBEN1, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 14, 0, -13997);
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, MyGlb.PANEL_LIST, 196, 144, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, MyGlb.PANEL_FORM, 288, 156, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPERBENE.SetFieldPage(PFL_SUBIMPERBENE_ELABORA, -1, -1);
    PAN_SUBIMPERBENE.SetFieldPanel(PFL_SUBIMPERBENE_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, MyGlb.PANEL_LIST, 324, 0, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, MyGlb.PANEL_LIST, 0);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, MyGlb.PANEL_LIST, 1);
    PAN_SUBIMPERBENE.SetRect(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, MyGlb.PANEL_FORM, 380, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SUBIMPERBENE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, MyGlb.PANEL_FORM, 0);
    PAN_SUBIMPERBENE.SetNumRow(MyGlb.OBJ_FIELD, PFL_SUBIMPERBENE_SCEGBENEBUTT, MyGlb.PANEL_FORM, 1);
    PAN_SUBIMPERBENE.SetFieldPage(PFL_SUBIMPERBENE_SCEGBENEBUTT, -1, -1);
    PAN_SUBIMPERBENE.SetFieldPanel(PFL_SUBIMPERBENE_SCEGBENEBUTT, -1, "", "SCEGBENEBUTT", 0, 0, 0, -13997);
  }

  private void PAN_SUBIMPERBENE_InitQueries()
  {
    StringBuffer SQL;

    PAN_SUBIMPERBENE.SetSize(MyGlb.OBJ_QUERY, 2);
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
    SQL.append("where (A.CODICE = ~~ROWNAMCODBEN~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SUBIMPERBENE.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_SUBIMPERBENE.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SUBIMPERBENE.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_SUBIMPERBENE.SetQueryLKE(PPQRY_BEN, PFL_SUBIMPERBENE_CODICEBENEFI, "BENCODICE");
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
    PAN_SUBIMPERBENE.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_SUBIMPERBENE.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_SUBIMPERBENE.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_SUBIMPERBENE.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_SUBIMPERBENE.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_SUBIMPERBENE.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_SUBIMPERBENE.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_SUBIMPERBENE.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_SUBIMPERBENE.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_SUBIMPERBENE.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_SUBIMPERBENE.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_SUBIMPERBENE.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    PAN_SUBIMPERBENE.SetIMDB(IMDB, "PQRY_SUBIMPERBEN1", true);
    PAN_SUBIMPERBENE.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SUBIMPERBENE.SetQueryIMDB(PPQRY_SUBIMPERBEN1, IMDBDef16.PQRY_SUBIMPERBEN1_RS, IMDBDef6.TBL_SUBIMPERBEN3);
    JustLoaded = true;
    PAN_SUBIMPERBENE.SetFieldPrimaryIndex(PFL_SUBIMPERBENE_CODICEBENEFI, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMCODBEN);
    PAN_SUBIMPERBENE.SetFieldPrimaryIndex(PFL_SUBIMPERBENE_RESIDUI, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMERESID);
    PAN_SUBIMPERBENE.SetFieldPrimaryIndex(PFL_SUBIMPERBENE_DATAELABORAZ, IMDBDef6.FLD_SUBIMPERBEN3_ROWNAMDATELA);
    PAN_SUBIMPERBENE.SetMasterTable(0, "SUBIMPERBEN3");
    //
    // Rieseguo la query se il pannello era gi� in stato DATA
    if (PAN_SUBIMPERBENE.Status() == 2)
    {
      int oldListQBE = PAN_SUBIMPERBENE.iUseListQBE;
      PAN_SUBIMPERBENE.iUseListQBE = 0;
      PAN_SUBIMPERBENE.PanelCommand(Glb.PCM_SEARCH);
      PAN_SUBIMPERBENE.PanelCommand(Glb.PCM_FIND);
      PAN_SUBIMPERBENE.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SUBIMPERBENE) PAN_SUBIMPERBENE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBIMPERBENE) PAN_SUBIMPERBENE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SUBIMPERBENE) PAN_SUBIMPERBENE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SUBIMPERBENE) PAN_SUBIMPERBENE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SUBIMPERBENE) PAN_SUBIMPERBENE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_SUBIMPERBENE) PAN_SUBIMPERBENE_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
