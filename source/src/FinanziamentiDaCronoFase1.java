// **********************************************
// Finanziamenti Da Crono Fase 1
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentiDaCronoFase1 extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_ESERCIZIO = 0;
  private static int PFL_PARAMETRI_VARIAZICRONO = 1;
  private static int PFL_PARAMETRI_ETICHEELABOR = 2;
  private static int PFL_PARAMETRI_DESTINAZIONE = 3;

  private static int PPQRY_PARAFINDACR1 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_PARAMETRI;
  private static int PFL_NOTEFUNZIONI_MODULO = 0;
  private static int PFL_NOTEFUNZIONI_PAGINA = 1;
  private static int PFL_NOTEFUNZIONI_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONI_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO21 = 0;


  IDPanel PAN_NOTEFUNZIONI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAFINDACRO(IMDB);
    //
    //
    Init_PQRY_PARAFINDACR1(IMDB);
    Init_PQRY_PARAFINDACR1_RS(IMDB);
    Init_PQRY_NOTEFUNZIO21(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAFINDACRO(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAFINDACRO, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAFINDACRO, "TBL_PARAFINDACRO");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAFINDACRO,IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAFINDACRO,IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAFINDACRO,IMDBDef3.FLD_PARAFINDACRO_NOMOGGVARCRO, "NOMOGGVARCRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAFINDACRO,IMDBDef3.FLD_PARAFINDACRO_NOMOGGVARCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAFINDACRO,IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEDEST, "NOMEOGGEDEST");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAFINDACRO,IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEDEST,5,6,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAFINDACRO, 0);
  }

  private static void Init_PQRY_PARAFINDACR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAFINDACR1, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAFINDACR1, "PQRY_PARAFINDACR1");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAFINDACR1,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAFINDACR1,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAFINDACR1,IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO, "NOMOGGVARCRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAFINDACR1,IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAFINDACR1,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST, "NOMEOGGEDEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAFINDACR1,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST,5,6,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAFINDACR1, 0);
  }

  private static void Init_PQRY_PARAFINDACR1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAFINDACR1_RS, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAFINDACR1_RS, "PQRY_PARAFINDACR1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAFINDACR1_RS,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAFINDACR1_RS,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAFINDACR1_RS,IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO, "NOMOGGVARCRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAFINDACR1_RS,IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO,1,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAFINDACR1_RS,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST, "NOMEOGGEDEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAFINDACR1_RS,IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST,5,6,0);
  }

  private static void Init_PQRY_NOTEFUNZIO21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_NOTEFUNZIO21, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_NOTEFUNZIO21, "PQRY_NOTEFUNZIO21");
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNMOD, "RECNOTFUNMOD");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNMOD,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNPAG, "RECNOTFUNPAG");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNPAG,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNFUN, "RECNOTFUNFUN");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNFUN,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNDES, "RECNOTFUNDES");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO21,IMDBDef11.PQSL_NOTEFUNZIO21_RECNOTFUNDES,9,9999,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_NOTEFUNZIO21, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentiDaCronoFase1(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentiDaCronoFase1()
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
    FormIdx = MyGlb.FRM_FINDACROFAS1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "247BEBC2-FBB2-4E1D-B808-E7E9C260DB0B";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 888;
    DesignHeight = 294;
    set_Caption(new IDVariant("Parametri Finanziamenti da Crono"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 888;
    Frames[1].Height = 268;
    Frames[1].FormFactor = 0.518018;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 460;
    Frames[2].Height = 268;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri Finanziamenti da Cronoprogramma";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 268;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 460-MyGlb.PAN_OFFS_X, 268-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FD4BB09C-874E-40BC-8643-E1CE92244902");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 244, 336, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 428;
    Frames[3].Height = 268;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "NOTE FUNZIONALITA NI";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 268;
    PAN_NOTEFUNZIONI = new IDPanel(w, this, 3, "PAN_NOTEFUNZIONI");
    Frames[3].Content = PAN_NOTEFUNZIONI;
    PAN_NOTEFUNZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONI.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 428-MyGlb.PAN_OFFS_X, 268-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5B11CDCE-9FAC-45C2-8D66-F000E287010E");
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 432, 136, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONI.InitStatus = 2;
    PAN_NOTEFUNZIONI_Init();
    PAN_NOTEFUNZIONI_InitFields();
    PAN_NOTEFUNZIONI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAFINDACRO, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FINDACROFAS1_PARAFINDACR1();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONI.UpdatePanel(MainFrm);
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
    return (obj instanceof FinanziamentiDaCronoFase1);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentiDaCronoFase1.class.getName() : (Glb.ClassWithPackage(FinanziamentiDaCronoFase1.class) ? FinanziamentiDaCronoFase1.class.getName().substring(FinanziamentiDaCronoFase1.class.getPackage().getName().length() + 1) : FinanziamentiDaCronoFase1.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      IMDB.set_Value(IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMOGGVARCRO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEDEST, 0, (new IDVariant("BIL")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase1", "Load", _e);
    }
  }

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
      UNLOAD_PARFINDACRDE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase1", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri Finanziamenti Da Crono: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARFINDACRDE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMOGGVARCRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEDEST, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
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
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST, 0)) || (IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST, 0).compareTo((new IDVariant("BIL")), true)!=0 && IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST, 0).compareTo((new IDVariant("BPR")), true)!=0))
      {
        IDVariant v_VMSGE = new IDVariant(0,IDVariant.STRING);
        v_VMSGE = (new IDVariant("Selezionare la Destinazione dell'Elaborazione"));
        MainFrm.set_AlertMessage(v_VMSGE); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO, 0)) || (IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO, 0).compareTo((new IDVariant(1)), true)!=0 && IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO, 0).compareTo((new IDVariant(2)), true)!=0))
      {
        IDVariant v_VMSGE = new IDVariant(0,IDVariant.STRING);
        v_VMSGE = (new IDVariant("Selezionare la Variazione del Crono"));
        MainFrm.set_AlertMessage(v_VMSGE); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.FINGENDACRONOCARICAWRK(IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEESER, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO, 0), IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  WRK_GEN_FIN_DA_CRONO_DET A ");
        SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.equals((new IDVariant(0)), true))
        {
          IDVariant v_VMSG = new IDVariant(0,IDVariant.STRING);
          v_VMSG = (new IDVariant("Nessun finanziamento per i cronoprogrammi selezionati"));
          MainFrm.set_AlertMessage(v_VMSG); 
        }
        else
        {
          if ((MainFrm.GetForm(MyGlb.FRM_FINDACROFAS2, 0, false)!=null))
          {
            MainFrm.UnloadForm(MyGlb.FRM_FINDACROFAS2,(new IDVariant(0)).booleanValue()); 
          }
          IMDB.set_Value(IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEESER, 0, IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEESER, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMOGGVARCRO, 0, IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMOGGVARCRO, 0));
          IMDB.set_Value(IMDBDef3.TBL_PARAMETFDCF2, IMDBDef3.FLD_PARAMETFDCF2_NOMEOGGEDEST, 0, IMDB.Value(IMDBDef11.PQRY_PARAFINDACR1, IMDBDef11.PQSL_PARAFINDACR1_NOMEOGGEDEST, 0));
          MainFrm.Show(MyGlb.FRM_FINDACROFAS2, (new IDVariant(0)).intValue(), this); 
        }
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiDaCronoFase1", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Finanziamenti Da Crono
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FINDACROFAS1_PARAFINDACR1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAFINDACR1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAFINDACRO, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAFINDACRO, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAFINDACR1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAFINDACR1_RS, 0, IMDBDef3.TBL_PARAFINDACRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAFINDACR1_RS, 0, 0, IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAFINDACR1_RS, 1, 0, IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMOGGVARCRO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAFINDACR1_RS, 2, 0, IMDBDef3.TBL_PARAFINDACRO, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEDEST, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAFINDACRO, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAFINDACRO, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAFINDACRO, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAFINDACR1_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONI);
    // Stub
  }

  private void PAN_NOTEFUNZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONI_IntValidateRow(Cancel);
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "EF5C7DA8-6C65-422A-B19C-317449260926");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, "FA4B0B86-2223-48EF-905E-AF441F9C7E04");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, "Variazioni Crono");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "665AE673-99AF-4A83-9B9A-AC260C786C38");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "Elabora");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, "EtichettaElabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, "A583F8A7-92C7-4ED8-8BDB-C98195303405");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, "Destinazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 16, 12, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAFINDACR1, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARAMETRI.set_Alignment(PFL_PARAMETRI_ESERCIZIO, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_LIST, 60, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_LIST, "Variazioni Crono");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_FORM, 12, 36, 436, 64, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_FORM, 4);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_VARIAZICRONO, MyGlb.PANEL_FORM, "Variazioni Crono");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_VARIAZICRONO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_VARIAZICRONO, PPQRY_PARAFINDACR1, "A.NOMOGGVARCRO", "NOMOGGVARCRO", 1, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZICRONO, (new IDVariant(1)), "Variazioni Considerate Sempre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_VARIAZICRONO, (new IDVariant(2)), "Variazioni non Considerate", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 232, 96, 136, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 368, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ETICHEELABOR, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_ETICHEELABOR, 3);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_LIST, "Destinazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_FORM, 28, 104, 420, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_FORM, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_FORM, 4);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESTINAZIONE, MyGlb.PANEL_FORM, "Destinazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESTINAZIONE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESTINAZIONE, PPQRY_PARAFINDACR1, "A.NOMEOGGEDEST", "NOMEOGGEDEST", 5, 6, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESTINAZIONE, (new IDVariant("BIL")), "Finanziamenti Bilancio Effettivo", "Finanziamenti da Cronoprogramma", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DESTINAZIONE, (new IDVariant("BPR")), "Finanziamenti Bilancio Simulato", "Finanziamenti da Cronoprogramma", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ as ESERCIZIO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 1 ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  ~~TBL_DATISESSIONE.SESSIOESERCI~~ + 2 ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    PAN_PARAMETRI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAFINDACR1", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAFINDACR1, IMDBDef11.PQRY_PARAFINDACR1_RS, IMDBDef3.TBL_PARAFINDACRO);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEESER);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_VARIAZICRONO, IMDBDef3.FLD_PARAFINDACRO_NOMOGGVARCRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DESTINAZIONE, IMDBDef3.FLD_PARAFINDACRO_NOMEOGGEDEST);
    PAN_PARAMETRI.SetMasterTable(0, "PARAFINDACRO");
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

  private void PAN_NOTEFUNZIONI_Init()
  {

    PAN_NOTEFUNZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, "C94E6866-BDB6-479F-8AE8-75939276B77F");
    PAN_NOTEFUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, "MODULO");
    PAN_NOTEFUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, "");
    PAN_NOTEFUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, "DEB8FDBE-8BD7-4525-AFFF-59D20BDF117F");
    PAN_NOTEFUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, "");
    PAN_NOTEFUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, "4F7D36E1-C3DE-4C80-820D-7809ABF93C83");
    PAN_NOTEFUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, "");
    PAN_NOTEFUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, "93595D82-2616-4694-AC80-80FA71997D36");
    PAN_NOTEFUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, " ");
    PAN_NOTEFUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, "");
    PAN_NOTEFUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_FORM, 56);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONI.SetFieldPage(PFL_NOTEFUNZIONI_MODULO, -1, -1);
    PAN_NOTEFUNZIONI.SetFieldPanel(PFL_NOTEFUNZIONI_MODULO, PPQRY_NOTEFUNZIO21, "A.MODULO", "RECNOTFUNMOD", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_LIST, 52);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_FORM, 4, 28, 560, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_FORM, 52);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONI.SetFieldPage(PFL_NOTEFUNZIONI_PAGINA, -1, -1);
    PAN_NOTEFUNZIONI.SetFieldPanel(PFL_NOTEFUNZIONI_PAGINA, PPQRY_NOTEFUNZIO21, "A.PAGINA", "RECNOTFUNPAG", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_LIST, 64);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_FORM, 4, 64, 572, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_FORM, 64);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONI.SetFieldPage(PFL_NOTEFUNZIONI_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONI.SetFieldPanel(PFL_NOTEFUNZIONI_FUNZIONE, PPQRY_NOTEFUNZIO21, "A.FUNZIONE", "RECNOTFUNFUN", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_LIST, " ");
    PAN_NOTEFUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, -44, 28, 632, 288, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 60);
    PAN_NOTEFUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, 22);
    PAN_NOTEFUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONI_DESCRIZIONE, MyGlb.PANEL_FORM, " ");
    PAN_NOTEFUNZIONI.SetFieldPage(PFL_NOTEFUNZIONI_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONI.SetFieldPanel(PFL_NOTEFUNZIONI_DESCRIZIONE, PPQRY_NOTEFUNZIO21, "A.DESCRIZIONE", "RECNOTFUNDES", 9, 9999, 0, -13997);
    PAN_NOTEFUNZIONI.set_Alignment(PFL_NOTEFUNZIONI_DESCRIZIONE, 2);
  }

  private void PAN_NOTEFUNZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONI.SetIMDB(IMDB, "PQRY_NOTEFUNZIO21", true);
    PAN_NOTEFUNZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as RECNOTFUNMOD, ");
    SQL.append("  A.PAGINA as RECNOTFUNPAG, ");
    SQL.append("  A.FUNZIONE as RECNOTFUNFUN, ");
    SQL.append("  A.DESCRIZIONE as RECNOTFUNDES ");
    PAN_NOTEFUNZIONI.SetQuery(PPQRY_NOTEFUNZIO21, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONI.SetQuery(PPQRY_NOTEFUNZIO21, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = 'Finanziamenti da Crono') ");
    SQL.append("and   (A.FUNZIONE = 'Descrizione Parametri') ");
    PAN_NOTEFUNZIONI.SetQuery(PPQRY_NOTEFUNZIO21, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONI.SetQuery(PPQRY_NOTEFUNZIO21, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONI.SetQuery(PPQRY_NOTEFUNZIO21, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONI.SetQuery(PPQRY_NOTEFUNZIO21, 5, SQL, -1, "");
    PAN_NOTEFUNZIONI.SetQueryDB(PPQRY_NOTEFUNZIO21, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONI.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONI.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONI.iUseListQBE;
      PAN_NOTEFUNZIONI.iUseListQBE = 0;
      PAN_NOTEFUNZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONI) PAN_NOTEFUNZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONI) PAN_NOTEFUNZIONI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONI) PAN_NOTEFUNZIONI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONI) PAN_NOTEFUNZIONI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_NOTEFUNZIONI) PAN_NOTEFUNZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
