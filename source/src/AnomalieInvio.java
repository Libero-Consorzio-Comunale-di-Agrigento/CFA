// **********************************************
// Anomalie Invio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AnomalieInvio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ANOMALMANDAT_LIQUIDAZIONE = 0;
  private static int GRP_ANOMALMANDAT_MANDATO = 1;
  private static int GRP_ANOMALMANDAT_IMPEGNO = 2;

  private static int PFL_ANOMALMANDAT_TIPO1 = 0;
  private static int PFL_ANOMALMANDAT_NUMEROLIQ = 1;
  private static int PFL_ANOMALMANDAT_ANNOLIQ = 2;
  private static int PFL_ANOMALMANDAT_NUMEROMANOR1 = 3;
  private static int PFL_ANOMALMANDAT_ANNOMANORD1 = 4;
  private static int PFL_ANOMALMANDAT_NUMEROIMPAC1 = 5;
  private static int PFL_ANOMALMANDAT_ANNOIMPACC1 = 6;
  private static int PFL_ANOMALMANDAT_IMPORTO1 = 7;
  private static int PFL_ANOMALMANDAT_ANOMALIA1 = 8;

  private static int PPQRY_ANOINVMANIN1 = 0;


  IDPanel PAN_ANOMALMANDAT;
  private static int GRP_ANOMALREVERS_ORDINATIVO = 0;
  private static int GRP_ANOMALREVERS_ACCERTAMENTO = 1;

  private static int PFL_ANOMALREVERS_TIPO = 0;
  private static int PFL_ANOMALREVERS_NUMEROMANORD = 1;
  private static int PFL_ANOMALREVERS_ANNOMANORD = 2;
  private static int PFL_ANOMALREVERS_NUMEROIMPACC = 3;
  private static int PFL_ANOMALREVERS_ANNOIMPACC = 4;
  private static int PFL_ANOMALREVERS_IMPORTO = 5;
  private static int PFL_ANOMALREVERS_ANOMALIA = 6;

  private static int PPQRY_ANOINVMANINF = 0;


  IDPanel PAN_ANOMALREVERS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI599(IMDB);
    //
    //
    Init_PQRY_ANOINVMANIN1(IMDB);
    Init_PQRY_ANOINVMANINF(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI599(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI599, 1);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI599, "TBL_PARAMETRI599");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI599,IMDBDef6.FLD_PARAMETRI599_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI599,IMDBDef6.FLD_PARAMETRI599_PARAMTIPO,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI599, 0);
  }

  private static void Init_PQRY_ANOINVMANIN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ANOINVMANIN1, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_ANOINVMANIN1, "PQRY_ANOINVMANIN1");
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANOINVMAINTI, "ANOINVMAINTI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANOINVMAINTI,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINANLI, "ANINMAINANLI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINANLI,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINNULI, "ANINMAINNULI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINNULI,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINANMA, "ANINMAINANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINNUMA, "ANINMAINNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINANIM, "ANINMAINANIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINNUIM, "ANINMAINNUIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANINMAINNUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANOINVMAINIM, "ANOINVMAINIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANOINVMAINIM,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANOINVMAINAN, "ANOINVMAINAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANIN1,IMDBDef15.PQSL_ANOINVMANIN1_ANOINVMAINAN,5,52,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ANOINVMANIN1, 0);
  }

  private static void Init_PQRY_ANOINVMANINF(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_ANOINVMANINF, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_ANOINVMANINF, "PQRY_ANOINVMANINF");
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANOINVMAINTI, "ANOINVMAINTI");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANOINVMAINTI,12,1,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINANMA, "ANINMAINANMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINNUMA, "ANINMAINNUMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINNUMA,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINANIM, "ANINMAINANIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINNUIM, "ANINMAINNUIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANINMAINNUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANOINVMAINIM, "ANOINVMAINIM");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANOINVMAINIM,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANOINVMAINAN, "ANOINVMAINAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_ANOINVMANINF,IMDBDef15.PQSL_ANOINVMANINF_ANOINVMAINAN,5,52,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_ANOINVMANINF, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AnomalieInvio(MyWebEntryPoint w, IMDBObj imdb)
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
  public AnomalieInvio()
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
    FormIdx = MyGlb.FRM_ANOMALIINVIO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "02C67F53-040D-47C2-8C39-EA8FC22F76AE";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 784;
    DesignHeight = 514;
    set_Caption(new IDVariant("Anomalie Invio"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 784;
    Frames[1].Height = 488;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.5;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 784;
    Frames[2].Height = 244;
    Frames[2].Caption = "Anomalie Mandati";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 244;
    PAN_ANOMALMANDAT = new IDPanel(w, this, 2, "PAN_ANOMALMANDAT");
    Frames[2].Content = PAN_ANOMALMANDAT;
    PAN_ANOMALMANDAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ANOMALMANDAT.VS = MainFrm.VisualStyleList;
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0F619911-4D0E-46E9-837C-DF35B30A361B");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 736, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ANOMALMANDAT.InitStatus = 2;
    PAN_ANOMALMANDAT_Init();
    PAN_ANOMALMANDAT_InitFields();
    PAN_ANOMALMANDAT_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 784;
    Frames[3].Height = 244;
    Frames[3].Caption = "Anomalie Reversali";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 244;
    PAN_ANOMALREVERS = new IDPanel(w, this, 3, "PAN_ANOMALREVERS");
    Frames[3].Content = PAN_ANOMALREVERS;
    PAN_ANOMALREVERS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ANOMALREVERS.VS = MainFrm.VisualStyleList;
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 244-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "ACF371A8-8F87-41A4-AE89-1DC4AB30F7EB");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 736, 196, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ANOMALREVERS.InitStatus = 2;
    PAN_ANOMALREVERS_Init();
    PAN_ANOMALREVERS_InitFields();
    PAN_ANOMALREVERS_InitQueries();
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
      PAN_ANOMALMANDAT.UpdatePanel(MainFrm);
      PAN_ANOMALREVERS.UpdatePanel(MainFrm);
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
    return (obj instanceof AnomalieInvio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AnomalieInvio.class.getName() : (Glb.ClassWithPackage(AnomalieInvio.class) ? AnomalieInvio.class.getName().substring(AnomalieInvio.class.getPackage().getName().length() + 1) : AnomalieInvio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Anomalie Mandati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ANOMALMANDAT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ANOMALMANDAT);
      // 
      // Anomalie Mandati On Dynamic Properties Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnomalieInvio", "AnomalieMandatiOnDynamicProperties", _e);
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
      if (IMDB.Value(IMDBDef6.TBL_PARAMETRI599, IMDBDef6.FLD_PARAMETRI599_PARAMTIPO, 0).equals((new IDVariant("M")), true))
      {
        PAN_ANOMALMANDAT.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_ANOMALREVERS.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        PAN_ANOMALMANDAT.set_Visible((new IDVariant(0)).booleanValue());
        PAN_ANOMALREVERS.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AnomalieInvio", "Load", _e);
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
  private void PAN_ANOMALMANDAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ANOMALMANDAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ANOMALMANDAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ANOMALMANDAT, Cancel);
    // Stub
  }

  private void PAN_ANOMALMANDAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ANOMALMANDAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ANOMALMANDAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ANOMALMANDAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ANOMALREVERS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ANOMALREVERS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ANOMALREVERS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ANOMALREVERS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ANOMALREVERS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_ANOMALREVERS);
    // Stub
  }

  private void PAN_ANOMALREVERS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ANOMALREVERS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ANOMALREVERS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ANOMALREVERS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ANOMALMANDAT_Init()
  {

    PAN_ANOMALMANDAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ANOMALMANDAT.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, "C233393A-5847-4527-8D39-8A5A8BA971D2");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, "Liquidazione");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, -9999, 112, 16, 0, 0);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0, 3, 192, 73, 0, 0);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, 0, 70);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, 1, 13);
    PAN_ANOMALMANDAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, 0, 4);
    PAN_ANOMALMANDAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, 1, 4);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_LIQUIDAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, "5BE2793A-0841-48F2-B82E-222BDD06D32F");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, "Mandato");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, MyGlb.PANEL_LIST, 112, -9999, 112, 16, 0, 0);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, MyGlb.PANEL_FORM, 0, 51, 176, 73, 0, 0);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, 0, 50);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, 1, 13);
    PAN_ANOMALMANDAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, 0, 4);
    PAN_ANOMALMANDAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, 1, 4);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_MANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, "D82F8D3D-1BAC-4BFB-8586-E93CA8ED131E");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, "Impegno");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, MyGlb.VIS_GROUPSTYLE);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, MyGlb.PANEL_LIST, 224, -9999, 112, 16, 0, 0);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, MyGlb.PANEL_FORM, 0, 99, 176, 73, 0, 0);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, 0, 51);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, 1, 13);
    PAN_ANOMALMANDAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, 0, 4);
    PAN_ANOMALMANDAT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, 1, 4);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_GROUP, GRP_ANOMALMANDAT_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ANOMALMANDAT.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, "B22501B5-2CCE-4329-9810-EED7B3864024");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, "TIPO");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.VIS_NORMFIELPADR);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, "DB79CA1C-547D-4230-9502-8F8E9A66C91D");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, "Numero");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, "34D1C18F-7EBB-4E23-9C3A-1CFE99ECFD55");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, "Anno");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, "223F3688-43EB-46F6-9CC1-70ADD1D20474");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, "Numero");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, "83EB7414-9432-4C6F-9F65-07DA500B1127");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, "Anno");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, "F11AAF79-4A9E-4581-838E-B9BFA4FA70E1");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, "Numero");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, "3688A77C-A38D-4F54-BB72-39CEC1C5ED13");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, "Anno");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, "F70276F7-C4C0-41D8-907A-043120CE411C");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, "Importo");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALMANDAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, "C723E8EC-5766-4367-9122-232102B3A02C");
    PAN_ANOMALMANDAT.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, "Anomalia");
    PAN_ANOMALMANDAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, "");
    PAN_ANOMALMANDAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALMANDAT.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ANOMALMANDAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_LIST, 36);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_LIST, "TIPO");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_TIPO1, MyGlb.PANEL_FORM, "TIPO");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_TIPO1, -1, -1);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_TIPO1, PPQRY_ANOINVMANIN1, "A.TIPO", "ANOINVMAINTI", 12, 1, 0, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_LIST, "Numero");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_NUMEROLIQ, -1, GRP_ANOMALMANDAT_LIQUIDAZIONE);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_NUMEROLIQ, PPQRY_ANOINVMANIN1, "A.NUMERO_LIQ", "ANINMAINNULI", 1, 5, 0, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_LIST, 60, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_LIST, 68);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_LIST, "Anno");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_FORM, 4, 28, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOLIQ, MyGlb.PANEL_FORM, "Anno");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_ANNOLIQ, -1, GRP_ANOMALMANDAT_LIQUIDAZIONE);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_ANNOLIQ, PPQRY_ANOINVMANIN1, "A.ANNO_LIQ", "ANINMAINANLI", 1, 4, 0, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_LIST, 112, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_LIST, 108);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_LIST, "Numero");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROMANOR1, MyGlb.PANEL_FORM, "Numero");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_NUMEROMANOR1, -1, GRP_ANOMALMANDAT_MANDATO);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_NUMEROMANOR1, PPQRY_ANOINVMANIN1, "A.NUMERO_MANORD", "ANINMAINNUMA", 1, 5, 0, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_LIST, 172, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_LIST, 92);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_LIST, "Anno");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOMANORD1, MyGlb.PANEL_FORM, "Anno");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_ANNOMANORD1, -1, GRP_ANOMALMANDAT_MANDATO);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_ANNOMANORD1, PPQRY_ANOINVMANIN1, "A.ANNO_MANORD", "ANINMAINANMA", 1, 4, 0, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_LIST, 224, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_LIST, 104);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_LIST, "Numero");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_FORM, 4, 148, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_NUMEROIMPAC1, MyGlb.PANEL_FORM, "Numero");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_NUMEROIMPAC1, -1, GRP_ANOMALMANDAT_IMPEGNO);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_NUMEROIMPAC1, PPQRY_ANOINVMANIN1, "A.NUMERO_IMPACC", "ANINMAINNUIM", 1, 5, 0, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_LIST, 284, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_LIST, 88);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_LIST, "Anno");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANNOIMPACC1, MyGlb.PANEL_FORM, "Anno");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_ANNOIMPACC1, -1, GRP_ANOMALMANDAT_IMPEGNO);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_ANNOIMPACC1, PPQRY_ANOINVMANIN1, "A.ANNO_IMPACC", "ANINMAINANIM", 1, 4, 0, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_LIST, 336, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_LIST, 64);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_FORM, 4, 172, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_IMPORTO1, -1, -1);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_IMPORTO1, PPQRY_ANOINVMANIN1, "A.IMPORTO", "ANOINVMAINIM", 3, 14, 2, -13997);
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_LIST, 468, 36, 268, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_LIST, 68);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_LIST, "Anomalia");
    PAN_ANOMALMANDAT.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_FORM, 4, 196, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALMANDAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALMANDAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALMANDAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALMANDAT_ANOMALIA1, MyGlb.PANEL_FORM, "Anomalia");
    PAN_ANOMALMANDAT.SetFieldPage(PFL_ANOMALMANDAT_ANOMALIA1, -1, -1);
    PAN_ANOMALMANDAT.SetFieldPanel(PFL_ANOMALMANDAT_ANOMALIA1, PPQRY_ANOINVMANIN1, "A.ANOMALIA", "ANOINVMAINAN", 5, 52, 0, -13997);
  }

  private void PAN_ANOMALMANDAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_ANOMALMANDAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ANOMALMANDAT.SetIMDB(IMDB, "PQRY_ANOINVMANIN1", true);
    PAN_ANOMALMANDAT.set_SetString(MyGlb.MASTER_ROWNAME, "ANOMALIE INVIO MANORD INF");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as ANOINVMAINTI, ");
    SQL.append("  A.ANNO_LIQ as ANINMAINANLI, ");
    SQL.append("  A.NUMERO_LIQ as ANINMAINNULI, ");
    SQL.append("  A.ANNO_MANORD as ANINMAINANMA, ");
    SQL.append("  A.NUMERO_MANORD as ANINMAINNUMA, ");
    SQL.append("  A.ANNO_IMPACC as ANINMAINANIM, ");
    SQL.append("  A.NUMERO_IMPACC as ANINMAINNUIM, ");
    SQL.append("  A.IMPORTO as ANOINVMAINIM, ");
    SQL.append("  A.ANOMALIA as ANOINVMAINAN ");
    PAN_ANOMALMANDAT.SetQuery(PPQRY_ANOINVMANIN1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ANOMALIE_INVIO_MANORD_INF A ");
    PAN_ANOMALMANDAT.SetQuery(PPQRY_ANOINVMANIN1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MANORD = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO = ~~TBL_PARAMETRI599.PARAMTIPO~~) ");
    PAN_ANOMALMANDAT.SetQuery(PPQRY_ANOINVMANIN1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ANOMALMANDAT.SetQuery(PPQRY_ANOINVMANIN1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ANOMALMANDAT.SetQuery(PPQRY_ANOINVMANIN1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_MANORD, ");
    SQL.append("  A.NUMERO_MANORD, ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ, ");
    SQL.append("  A.ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC ");
    PAN_ANOMALMANDAT.SetQuery(PPQRY_ANOINVMANIN1, 5, SQL, -1, "");
    PAN_ANOMALMANDAT.SetQueryDB(PPQRY_ANOINVMANIN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ANOMALMANDAT.SetMasterTable(0, "ANOMALIE_INVIO_MANORD_INF");
    PAN_ANOMALMANDAT.AddToSortList(PFL_ANOMALMANDAT_ANNOMANORD1, true);
    PAN_ANOMALMANDAT.AddToSortList(PFL_ANOMALMANDAT_NUMEROMANOR1, true);
    PAN_ANOMALMANDAT.AddToSortList(PFL_ANOMALMANDAT_ANNOLIQ, true);
    PAN_ANOMALMANDAT.AddToSortList(PFL_ANOMALMANDAT_NUMEROLIQ, true);
    PAN_ANOMALMANDAT.AddToSortList(PFL_ANOMALMANDAT_ANNOIMPACC1, true);
    PAN_ANOMALMANDAT.AddToSortList(PFL_ANOMALMANDAT_NUMEROIMPAC1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ANOMALMANDAT.Status() == 2)
    {
      int oldListQBE = PAN_ANOMALMANDAT.iUseListQBE;
      PAN_ANOMALMANDAT.iUseListQBE = 0;
      PAN_ANOMALMANDAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_ANOMALMANDAT.PanelCommand(Glb.PCM_FIND);
      PAN_ANOMALMANDAT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ANOMALREVERS_Init()
  {

    PAN_ANOMALREVERS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ANOMALREVERS.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, "E6952DB9-CC5E-466E-9564-FCBC16B040C0");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, "Ordinativo");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, MyGlb.VIS_GROUPSTYLE);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, MyGlb.PANEL_FORM, 0, 51, 176, 73, 0, 0);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, 0, 59);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, 1, 13);
    PAN_ANOMALREVERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, 0, 4);
    PAN_ANOMALREVERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, 1, 4);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, "E92FA238-E143-42CF-A446-B784131A8911");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, "Accertamento");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, MyGlb.PANEL_LIST, 104, -9999, 104, 16, 0, 0);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, MyGlb.PANEL_FORM, 0, 99, 176, 73, 0, 0);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, 0, 81);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, 1, 13);
    PAN_ANOMALREVERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, 0, 4);
    PAN_ANOMALREVERS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, 1, 4);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_GROUP, GRP_ANOMALREVERS_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ANOMALREVERS.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, "C100B5B4-8608-41C8-AC56-A0C746200C33");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, "TIPO");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.VIS_NORMFIELPADR);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, "DF932BE0-DD04-4376-9AAC-95EFDD767292");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, "Numero");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, "94407FD9-3721-4F8D-88DF-411BFB926405");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, "Anno");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, "17B777D3-1983-4B5F-A317-5FA36FED1377");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, "Numero");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, "F28B6864-6648-493E-80EE-AB82425988A4");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, "Anno");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, "4F3FA24E-0F02-4DAB-8C26-CD6C8BE5D23A");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, "Importo");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ANOMALREVERS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, "D2BC9665-A8CD-4CAE-951B-F6878B178216");
    PAN_ANOMALREVERS.set_Header(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, "Anomalia");
    PAN_ANOMALREVERS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, "");
    PAN_ANOMALREVERS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.VIS_NORMALFIELDS);
    PAN_ANOMALREVERS.SetFlags(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ANOMALREVERS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_LIST, 36);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_LIST, "TIPO");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_TIPO, MyGlb.PANEL_FORM, "TIPO");
    PAN_ANOMALREVERS.SetFieldPage(PFL_ANOMALREVERS_TIPO, -1, -1);
    PAN_ANOMALREVERS.SetFieldPanel(PFL_ANOMALREVERS_TIPO, PPQRY_ANOINVMANINF, "A.TIPO", "ANOINVMAINTI", 12, 1, 0, -13997);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_LIST, 108);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_LIST, "Numero");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_FORM, 4, 100, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROMANORD, MyGlb.PANEL_FORM, "Numero");
    PAN_ANOMALREVERS.SetFieldPage(PFL_ANOMALREVERS_NUMEROMANORD, -1, GRP_ANOMALREVERS_ORDINATIVO);
    PAN_ANOMALREVERS.SetFieldPanel(PFL_ANOMALREVERS_NUMEROMANORD, PPQRY_ANOINVMANINF, "A.NUMERO_MANORD", "ANINMAINNUMA", 1, 5, 0, -13997);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_LIST, 56, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_LIST, 92);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_LIST, "Anno");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOMANORD, MyGlb.PANEL_FORM, "Anno");
    PAN_ANOMALREVERS.SetFieldPage(PFL_ANOMALREVERS_ANNOMANORD, -1, GRP_ANOMALREVERS_ORDINATIVO);
    PAN_ANOMALREVERS.SetFieldPanel(PFL_ANOMALREVERS_ANNOMANORD, PPQRY_ANOINVMANINF, "A.ANNO_MANORD", "ANINMAINANMA", 1, 4, 0, -13997);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_LIST, 104, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_LIST, "Numero");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_FORM, 4, 148, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_NUMEROIMPACC, MyGlb.PANEL_FORM, "Numero");
    PAN_ANOMALREVERS.SetFieldPage(PFL_ANOMALREVERS_NUMEROIMPACC, -1, GRP_ANOMALREVERS_ACCERTAMENTO);
    PAN_ANOMALREVERS.SetFieldPanel(PFL_ANOMALREVERS_NUMEROIMPACC, PPQRY_ANOINVMANINF, "A.NUMERO_IMPACC", "ANINMAINNUIM", 1, 5, 0, -13997);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_LIST, 160, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_LIST, "Anno");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANNOIMPACC, MyGlb.PANEL_FORM, "Anno");
    PAN_ANOMALREVERS.SetFieldPage(PFL_ANOMALREVERS_ANNOIMPACC, -1, GRP_ANOMALREVERS_ACCERTAMENTO);
    PAN_ANOMALREVERS.SetFieldPanel(PFL_ANOMALREVERS_ANNOIMPACC, PPQRY_ANOINVMANINF, "A.ANNO_IMPACC", "ANINMAINANIM", 1, 4, 0, -13997);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_LIST, 208, 36, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_FORM, 4, 172, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ANOMALREVERS.SetFieldPage(PFL_ANOMALREVERS_IMPORTO, -1, -1);
    PAN_ANOMALREVERS.SetFieldPanel(PFL_ANOMALREVERS_IMPORTO, PPQRY_ANOINVMANINF, "A.IMPORTO", "ANOINVMAINIM", 3, 14, 2, -13997);
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_LIST, 340, 36, 396, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_LIST, 68);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_LIST, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_LIST, "Anomalia");
    PAN_ANOMALREVERS.SetRect(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_FORM, 4, 196, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ANOMALREVERS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_FORM, 120);
    PAN_ANOMALREVERS.SetNumRow(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_FORM, 1);
    PAN_ANOMALREVERS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ANOMALREVERS_ANOMALIA, MyGlb.PANEL_FORM, "Anomalia");
    PAN_ANOMALREVERS.SetFieldPage(PFL_ANOMALREVERS_ANOMALIA, -1, -1);
    PAN_ANOMALREVERS.SetFieldPanel(PFL_ANOMALREVERS_ANOMALIA, PPQRY_ANOINVMANINF, "A.ANOMALIA", "ANOINVMAINAN", 5, 52, 0, -13997);
  }

  private void PAN_ANOMALREVERS_InitQueries()
  {
    StringBuffer SQL;

    PAN_ANOMALREVERS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ANOMALREVERS.SetIMDB(IMDB, "PQRY_ANOINVMANINF", true);
    PAN_ANOMALREVERS.set_SetString(MyGlb.MASTER_ROWNAME, "ANOMALIE INVIO MANORD INF");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as ANOINVMAINTI, ");
    SQL.append("  A.ANNO_MANORD as ANINMAINANMA, ");
    SQL.append("  A.NUMERO_MANORD as ANINMAINNUMA, ");
    SQL.append("  A.ANNO_IMPACC as ANINMAINANIM, ");
    SQL.append("  A.NUMERO_IMPACC as ANINMAINNUIM, ");
    SQL.append("  A.IMPORTO as ANOINVMAINIM, ");
    SQL.append("  A.ANOMALIA as ANOINVMAINAN ");
    PAN_ANOMALREVERS.SetQuery(PPQRY_ANOINVMANINF, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ANOMALIE_INVIO_MANORD_INF A ");
    PAN_ANOMALREVERS.SetQuery(PPQRY_ANOINVMANINF, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_MANORD = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO = ~~TBL_PARAMETRI599.PARAMTIPO~~) ");
    PAN_ANOMALREVERS.SetQuery(PPQRY_ANOINVMANINF, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ANOMALREVERS.SetQuery(PPQRY_ANOINVMANINF, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ANOMALREVERS.SetQuery(PPQRY_ANOINVMANINF, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_MANORD, ");
    SQL.append("  A.NUMERO_MANORD, ");
    SQL.append("  A.ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC ");
    PAN_ANOMALREVERS.SetQuery(PPQRY_ANOINVMANINF, 5, SQL, -1, "");
    PAN_ANOMALREVERS.SetQueryDB(PPQRY_ANOINVMANINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ANOMALREVERS.SetMasterTable(0, "ANOMALIE_INVIO_MANORD_INF");
    PAN_ANOMALREVERS.AddToSortList(PFL_ANOMALREVERS_ANNOMANORD, true);
    PAN_ANOMALREVERS.AddToSortList(PFL_ANOMALREVERS_NUMEROMANORD, true);
    PAN_ANOMALREVERS.AddToSortList(PFL_ANOMALREVERS_ANNOIMPACC, true);
    PAN_ANOMALREVERS.AddToSortList(PFL_ANOMALREVERS_NUMEROIMPACC, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ANOMALREVERS.Status() == 2)
    {
      int oldListQBE = PAN_ANOMALREVERS.iUseListQBE;
      PAN_ANOMALREVERS.iUseListQBE = 0;
      PAN_ANOMALREVERS.PanelCommand(Glb.PCM_SEARCH);
      PAN_ANOMALREVERS.PanelCommand(Glb.PCM_FIND);
      PAN_ANOMALREVERS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ANOMALMANDAT) PAN_ANOMALMANDAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ANOMALREVERS) PAN_ANOMALREVERS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ANOMALMANDAT) PAN_ANOMALMANDAT_ValidateRow(Cancel);
    if (SrcObj == PAN_ANOMALREVERS) PAN_ANOMALREVERS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ANOMALMANDAT) PAN_ANOMALMANDAT_DynamicProperties();
    if (SrcObj == PAN_ANOMALREVERS) PAN_ANOMALREVERS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ANOMALMANDAT) PAN_ANOMALMANDAT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ANOMALREVERS) PAN_ANOMALREVERS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ANOMALMANDAT) PAN_ANOMALMANDAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ANOMALREVERS) PAN_ANOMALREVERS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
