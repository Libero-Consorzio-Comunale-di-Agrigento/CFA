// **********************************************
// Giornale Vincoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GiornaleVincoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SITCASPERVIN_TIPO = 0;
  private static int GRP_SITCASPERVIN_PERIODO = 1;

  private static int PFL_SITCASPERVIN_TIPOVINCOLO = 0;
  private static int PFL_SITCASPERVIN_VINCOLDESCRI = 1;
  private static int PFL_SITCASPERVIN_TIPO = 2;
  private static int PFL_SITCASPERVIN_NEWPANELABE1 = 3;
  private static int PFL_SITCASPERVIN_DAL = 4;
  private static int PFL_SITCASPERVIN_AL = 5;
  private static int PFL_SITCASPERVIN_NEWPANELABE3 = 6;
  private static int PFL_SITCASPERVIN_DETTAGLI = 7;
  private static int PFL_SITCASPERVIN_VINCOLSCADUT = 8;
  private static int PFL_SITCASPERVIN_ELABORA = 9;

  private static int PPQRY_PAR27 = 0;

  private static int PPQRY_VINCOLI = 1;


  IDPanel PAN_SITCASPERVIN;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR28(IMDB);
    //
    //
    Init_PQRY_PAR27(IMDB);
    Init_PQRY_PAR27_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR28, 6);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR28, "TBL_PAR28");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMETIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMEDAL,6,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMEAL,6,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMEDETTA,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMVINSCA, "ROWNAMVINSCA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR28,IMDBDef6.FLD_PAR28_ROWNAMVINSCA,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR28, 0);
  }

  private static void Init_PQRY_PAR27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR27, 6);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR27, "PQRY_PAR27");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMETIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMEDAL,6,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMEAL,6,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMEDETTA,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMVINSCA, "ROWNAMVINSCA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27,IMDBDef16.PQSL_PAR27_ROWNAMVINSCA,5,2,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR27, 0);
  }

  private static void Init_PQRY_PAR27_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR27_RS, 6);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR27_RS, "PQRY_PAR27_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMTIPVIN, "ROWNAMTIPVIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMTIPVIN,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMETIPO,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMEDAL,6,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMEAL,6,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMEDETTA, "ROWNAMEDETTA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMEDETTA,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMVINSCA, "ROWNAMVINSCA");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR27_RS,IMDBDef16.PQSL_PAR27_ROWNAMVINSCA,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GiornaleVincoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public GiornaleVincoli()
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
    FormIdx = MyGlb.FRM_GIORNAVINCOL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4C2D9FA3-0C70-4B62-BBF1-553B24B0CA49";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 400;
    DesignHeight = 290;
    set_Caption(new IDVariant("Giornale Vincoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 400;
    Frames[1].Height = 264;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Situazione Cassa Per Vincolo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 264;
    PAN_SITCASPERVIN = new IDPanel(w, this, 1, "PAN_SITCASPERVIN");
    Frames[1].Content = PAN_SITCASPERVIN;
    PAN_SITCASPERVIN.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SITCASPERVIN.VS = MainFrm.VisualStyleList;
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 400-MyGlb.PAN_OFFS_X, 264-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A05D755D-8651-4897-B2A0-DA6EE135D14A");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 652, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SITCASPERVIN.InitStatus = 2;
    PAN_SITCASPERVIN_Init();
    PAN_SITCASPERVIN_InitFields();
    PAN_SITCASPERVIN_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR28, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GIORNAVINCOL_PAR27();
      }
      PAN_SITCASPERVIN.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAVINCOL && flRis && IdxPanelActived == PAN_SITCASPERVIN.FrIndex)
    {
      if (IdxFieldActived ==PFL_SITCASPERVIN_TIPOVINCOLO) {
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
    return (obj instanceof GiornaleVincoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GiornaleVincoli.class.getName() : (Glb.ClassWithPackage(GiornaleVincoli.class) ? GiornaleVincoli.class.getName().substring(GiornaleVincoli.class.getPackage().getName().length() + 1) : GiornaleVincoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Vincoli
  // **********************************************************************
  public int ApriVincoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Vincoli Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAVINCOL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleVincoli", "ApriVincoli", _e);
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
      if (IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMEDAL, 0).compareTo(IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMEAL, 0), true)>0)
      {
        IDVariant v_MESSA = new IDVariant(0,IDVariant.STRING);
        v_MESSA = (new IDVariant("Errore. Data dal superiore a Data al", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MESSA); 
      }
      else
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("DATA_DAL"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("DATA_AL"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("TIPO_VINCOLO"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("TIPO"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("DETTAGLI"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("SCADUTI"));
        IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
        v_NOMESTAMPA = (new IDVariant("Giornale_Vincoli"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMTIPVIN, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMETIPO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, ((IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMEDETTA, 0).equals((new IDVariant("SI")), true))?(new IDVariant("S")):(new IDVariant("N"))));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, ((IMDB.Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMVINSCA, 0).equals((new IDVariant("SI")), true))?(new IDVariant()):(new IDVariant("S"))));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleVincoli", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMETIPO, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMEDETTA, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMVINSCA, 0, (new IDVariant("NO")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleVincoli", "LoadEvent", _e);
    }
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAVINCOL)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef16.PQRY_PAR27, IMDBDef16.PQSL_PAR27_ROWNAMTIPVIN, 0, IMDB.Value(IMDBDef7.PQRY_VINCOLI2, IMDBDef7.PQSL_VINCOLI2_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleVincoli", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMTIPVIN, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GiornaleVincoli", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void GIORNAVINCOL_PAR27() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR27_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR28, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR28, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR27_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR27_RS, 0, IMDBDef6.TBL_PAR28, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR27_RS, 0, 0, IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMTIPVIN, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR27_RS, 1, 0, IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMETIPO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR27_RS, 2, 0, IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR27_RS, 3, 0, IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR27_RS, 4, 0, IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMEDETTA, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR27_RS, 5, 0, IMDBDef6.TBL_PAR28, IMDBDef6.FLD_PAR28_ROWNAMVINSCA, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR28, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR28, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR28, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR27_RS, 0);
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
  private void PAN_SITCASPERVIN_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_SITCASPERVIN, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SITCASPERVIN_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SITCASPERVIN, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SITCASPERVIN_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_SITCASPERVIN);
    // Stub
  }

  private void PAN_SITCASPERVIN_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_SITCASPERVIN_TIPOVINCOLO)
    {
      this.IdxPanelActived = this.PAN_SITCASPERVIN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVincoli();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_SITCASPERVIN_ELABORA)
    {
      this.IdxPanelActived = this.PAN_SITCASPERVIN.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_SITCASPERVIN_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_SITCASPERVIN_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SITCASPERVIN_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SITCASPERVIN_Init()
  {

    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, "1A6FEE4F-C62D-4CBE-BA85-1CCF687A5613");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, "Tipo");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, MyGlb.VIS_GROUPSTYLE);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, MyGlb.PANEL_LIST, 40, -9999, 96, 16, 0, 0);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, MyGlb.PANEL_FORM, 8, 35, 344, 49, 0, 0);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, 0, 24);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, 1, 13);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, 0, 4);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, 1, 4);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, "5A871F5A-FAD6-4E87-AB05-7CD12ECF5423");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, "Periodo");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, MyGlb.PANEL_LIST, 136, -9999, 144, 16, 0, 0);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, MyGlb.PANEL_FORM, 8, 91, 344, 49, 0, 0);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, 0, 43);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, 1, 13);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, 0, 4);
    PAN_SITCASPERVIN.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, 1, 4);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_GROUP, GRP_SITCASPERVIN_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, "B2D0F77E-04F7-4325-A94D-AB1095CD9EBC");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, "Tipo Vincolo");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, "D9274C3D-F1C0-4437-BDB5-38A9C2061393");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, "VINCOLI DESCRIZIONE");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, "8E71D8A1-F05B-4949-BC5B-EF2DDDACC92D");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, "Tipo");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, "C7D52698-7B5B-4521-AA8E-EBAFA7C494A5");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, "70E18322-B704-48E6-B205-EEAA8F2203F2");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, "Dal");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, "0956717E-A315-41E7-B0B2-04D51C526E22");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, "Al");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, "4E9F2A49-7CC2-45D9-B5B5-CF2791F02A5C");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, "ED512460-07CB-4F11-8C81-F62ACBE19ADA");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, "Dettagli");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.VIS_CHECKSTYLE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, "41C7ABAA-FC27-4DBE-90F1-0FCEA0310331");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, "Vincoli Scaduti");
    PAN_SITCASPERVIN.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, "");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.VIS_CHECKSTYLE);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SITCASPERVIN.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, "76F387E9-59C5-4853-AE4A-625494FE917E");
    PAN_SITCASPERVIN.set_Header(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, "Elabora");
    PAN_SITCASPERVIN.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_SITCASPERVIN.SetImage(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, 0, "button1.gif", false);
    PAN_SITCASPERVIN.SetFlags(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_SITCASPERVIN_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_LIST, 64);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tp. Vinc.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_FORM, 8, 8, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_FORM, 80);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_TIPOVINCOLO, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_TIPOVINCOLO, PPQRY_PAR27, "A.ROWNAMTIPVIN", "ROWNAMTIPVIN", 1, 6, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_LIST, 120);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_LIST, "VINCOLI DESCRIZIONE");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_FORM, 156, 8, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_FORM, 120);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLDESCRI, MyGlb.PANEL_FORM, "VINC. DESCRIZIONE");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_VINCOLDESCRI, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_VINCOLDESCRI, PPQRY_VINCOLI, "A.DESCRIZIONE", "ROWNAMVINDES", 5, 50, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_LIST, 40, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_LIST, 28);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_FORM, 92, 60, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_FORM, 88);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_TIPO, -1, GRP_SITCASPERVIN_TIPO);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_TIPO, PPQRY_PAR27, "A.ROWNAMETIPO", "ROWNAMETIPO", 5, 2, 0, -13997);
    PAN_SITCASPERVIN.SetValueListItem(PFL_SITCASPERVIN_TIPO, (new IDVariant("E")), "Emessi", "", "", -1);
    PAN_SITCASPERVIN.SetValueListItem(PFL_SITCASPERVIN_TIPO, (new IDVariant("PR")), "Pagati/Riscossi", "", "", -1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, MyGlb.PANEL_LIST, 160, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, MyGlb.PANEL_FORM, 12, 64, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_NEWPANELABE1, -1, GRP_SITCASPERVIN_TIPO);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_LIST, 136, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_LIST, 24);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_FORM, 12, 116, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_FORM, 76);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_DAL, -1, GRP_SITCASPERVIN_PERIODO);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_DAL, PPQRY_PAR27, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 8, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_LIST, 208, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_LIST, 20);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_LIST, "Al");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_FORM, 200, 116, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_FORM, 20);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_AL, MyGlb.PANEL_FORM, "Al");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_AL, -1, GRP_SITCASPERVIN_PERIODO);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_AL, PPQRY_PAR27, "A.ROWNAMEAL", "ROWNAMEAL", 6, 8, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, MyGlb.PANEL_LIST, 160, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, MyGlb.PANEL_FORM, 336, 120, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_NEWPANELABE3, -1, GRP_SITCASPERVIN_PERIODO);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_LIST, 280, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_LIST, 48);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_LIST, "Dettagli");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_FORM, 24, 152, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_FORM, 64);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_DETTAGLI, MyGlb.PANEL_FORM, "Dettagli");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_DETTAGLI, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_DETTAGLI, PPQRY_PAR27, "A.ROWNAMEDETTA", "ROWNAMEDETTA", 5, 2, 0, -13997);
    PAN_SITCASPERVIN.SetValueListItem(PFL_SITCASPERVIN_DETTAGLI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SITCASPERVIN.SetValueListItem(PFL_SITCASPERVIN_DETTAGLI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_LIST, 76);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_LIST, "Vinc. Scad.");
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_FORM, 180, 152, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_FORM, 96);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_VINCOLSCADUT, MyGlb.PANEL_FORM, "Vincoli Scaduti");
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_VINCOLSCADUT, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_VINCOLSCADUT, PPQRY_PAR27, "A.ROWNAMVINSCA", "ROWNAMVINSCA", 5, 2, 0, -13997);
    PAN_SITCASPERVIN.SetValueListItem(PFL_SITCASPERVIN_VINCOLSCADUT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SITCASPERVIN.SetValueListItem(PFL_SITCASPERVIN_VINCOLSCADUT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, MyGlb.PANEL_LIST, 164, 184, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_SITCASPERVIN.SetRect(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, MyGlb.PANEL_FORM, 272, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SITCASPERVIN.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_SITCASPERVIN.SetNumRow(MyGlb.OBJ_FIELD, PFL_SITCASPERVIN_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_SITCASPERVIN.SetFieldPage(PFL_SITCASPERVIN_ELABORA, -1, -1);
    PAN_SITCASPERVIN.SetFieldPanel(PFL_SITCASPERVIN_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_SITCASPERVIN_InitQueries()
  {
    StringBuffer SQL;

    PAN_SITCASPERVIN.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMVINDES ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVIN~~) ");
    PAN_SITCASPERVIN.SetQuery(PPQRY_VINCOLI, 0, SQL, -1, "");
    PAN_SITCASPERVIN.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SITCASPERVIN.SetMasterTable(PPQRY_VINCOLI, "VINCOLI");
    PAN_SITCASPERVIN.SetIMDB(IMDB, "PQRY_PAR27", true);
    PAN_SITCASPERVIN.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_SITCASPERVIN.SetQueryIMDB(PPQRY_PAR27, IMDBDef16.PQRY_PAR27_RS, IMDBDef6.TBL_PAR28);
    JustLoaded = true;
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_TIPOVINCOLO, IMDBDef6.FLD_PAR28_ROWNAMTIPVIN);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_TIPO, IMDBDef6.FLD_PAR28_ROWNAMETIPO);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_DAL, IMDBDef6.FLD_PAR28_ROWNAMEDAL);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_AL, IMDBDef6.FLD_PAR28_ROWNAMEAL);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_DETTAGLI, IMDBDef6.FLD_PAR28_ROWNAMEDETTA);
    PAN_SITCASPERVIN.SetFieldPrimaryIndex(PFL_SITCASPERVIN_VINCOLSCADUT, IMDBDef6.FLD_PAR28_ROWNAMVINSCA);
    PAN_SITCASPERVIN.SetMasterTable(0, "PAR28");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SITCASPERVIN.Status() == 2)
    {
      int oldListQBE = PAN_SITCASPERVIN.iUseListQBE;
      PAN_SITCASPERVIN.iUseListQBE = 0;
      PAN_SITCASPERVIN.PanelCommand(Glb.PCM_SEARCH);
      PAN_SITCASPERVIN.PanelCommand(Glb.PCM_FIND);
      PAN_SITCASPERVIN.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SITCASPERVIN) PAN_SITCASPERVIN_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
