// **********************************************
// Variazioni Equilibri Di Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniEquilibriDiBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VARIEQUDIBIL_VARIAZIONI = 0;
  private static int PFL_VARIEQUDIBIL_PROPOSTA = 1;
  private static int PFL_VARIEQUDIBIL_NUMEROPROPOS = 2;
  private static int PFL_VARIEQUDIBIL_ANNOPROPOSTA = 3;
  private static int PFL_VARIEQUDIBIL_DELIBERA = 4;
  private static int PFL_VARIEQUDIBIL_TRATTIDELIBE = 5;
  private static int PFL_VARIEQUDIBIL_NUMERODELIBE = 6;
  private static int PFL_VARIEQUDIBIL_BARRADELIBER = 7;
  private static int PFL_VARIEQUDIBIL_ANNODELIBERA = 8;
  private static int PFL_VARIEQUDIBIL_APRISCELDELI = 9;
  private static int PFL_VARIEQUDIBIL_TRATTIPROPOS = 10;
  private static int PFL_VARIEQUDIBIL_BARRAPROPOST = 11;
  private static int PFL_VARIEQUDIBIL_APRISCELPROP = 12;
  private static int PFL_VARIEQUDIBIL_ETICINFOPROP = 13;
  private static int PFL_VARIEQUDIBIL_ETICHEOBBLIG = 14;
  private static int PFL_VARIEQUDIBIL_ELABORA = 15;
  private static int PFL_VARIEQUDIBIL_INFODEL = 16;

  private static int PPQRY_PARAMETRI525 = 0;


  IDPanel PAN_VARIEQUDIBIL;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI526(IMDB);
    //
    //
    Init_PQRY_PARAMETRI525(IMDB);
    Init_PQRY_PARAMETRI525_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI526(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI526, 7);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI526, "TBL_PARAMETRI526");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI526,IMDBDef4.FLD_PARAMETRI526_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI526, 0);
  }

  private static void Init_PQRY_PARAMETRI525(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI525, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI525, "PQRY_PARAMETRI525");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI525, 0);
  }

  private static void Init_PQRY_PARAMETRI525_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI525_RS, 7);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI525_RS, "PQRY_PARAMETRI525_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI525_RS,IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO,1,4,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniEquilibriDiBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniEquilibriDiBilancio()
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
    FormIdx = MyGlb.FRM_VARIEQUDIBIL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "94E50610-AB11-49FD-8726-2C2C533D4AC2";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 396;
    DesignHeight = 210;
    set_Caption(new IDVariant("Variazioni Equilibri di Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 396;
    Frames[1].Height = 184;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Variazioni Equilibri di Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 184;
    PAN_VARIEQUDIBIL = new IDPanel(w, this, 1, "PAN_VARIEQUDIBIL");
    Frames[1].Content = PAN_VARIEQUDIBIL;
    PAN_VARIEQUDIBIL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIEQUDIBIL.VS = MainFrm.VisualStyleList;
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 396-MyGlb.PAN_OFFS_X, 184-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "6718A5BF-333C-43C2-BEE7-70A614A16008");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 352, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIEQUDIBIL.InitStatus = 2;
    PAN_VARIEQUDIBIL_Init();
    PAN_VARIEQUDIBIL_InitFields();
    PAN_VARIEQUDIBIL_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI526, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIEQUDIBIL_PARAMETRI525();
      }
      PAN_VARIEQUDIBIL.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VARIEQUDIBIL.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIEQUDIBIL_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_VARIEQUDIBIL.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIEQUDIBIL_APRISCELPROP) {
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
    return (obj instanceof VariazioniEquilibriDiBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniEquilibriDiBilancio.class.getName() : (Glb.ClassWithPackage(VariazioniEquilibriDiBilancio.class) ? VariazioniEquilibriDiBilancio.class.getName().substring(VariazioniEquilibriDiBilancio.class.getPackage().getName().length() + 1) : VariazioniEquilibriDiBilancio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Info Prop
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaInfoProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Info Prop Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, 0));
      MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "EtichettaInfoProp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Del
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Del Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0));
      MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "InfoDel", _e);
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
      LOADEVENT_PARAMEDELETE();
      // set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMEVARIA, 0, (new IDVariant("D")));
      PAN_VARIEQUDIBIL.set_FieldText(PFL_VARIEQUDIBIL_ETICHEOBBLIG, IDL.Add((new IDVariant(PAN_VARIEQUDIBIL.FieldText(PFL_VARIEQUDIBIL_ETICHEOBBLIG))), (new IDVariant("Delibera"))).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNPRO, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "EndModalEvent", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNPRO, 0, new IDVariant());
  }

  // **********************************************************************
  // Variazioni Equilibri di Bilancio On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIEQUDIBIL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIEQUDIBIL);
      // 
      // Variazioni Equilibri di Bilancio On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, 0))))
      {
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0))))
      {
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.GESTIODELIBE.booleanValue())
        {
          PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      else
      {
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VARIEQUDIBIL.SetFlags (Glb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "VariazioniEquilibridiBilancioOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Variazioni Equilibri di Bilancio On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_VARIEQUDIBIL_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Equilibri di Bilancio On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_VARIEQUDIBIL_VARIAZIONI)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_OBBLIGATORIO = new IDVariant(0,IDVariant.STRING);
        v_OBBLIGATORIO = (new IDVariant("Obbligatorio indicare la "));
        if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0, (new IDVariant()));
          PAN_VARIEQUDIBIL.set_FieldText(PFL_VARIEQUDIBIL_ETICHEOBBLIG, IDL.Add(v_OBBLIGATORIO, (new IDVariant("Proposta"))).stringValue());
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, 0, (new IDVariant()));
          PAN_VARIEQUDIBIL.set_FieldText(PFL_VARIEQUDIBIL_ETICHEOBBLIG, IDL.Add(v_OBBLIGATORIO, (new IDVariant("Delibera"))).stringValue());
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIEQUDIBIL_PROPOSTA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_VARIEQUDIBIL_DELIBERA)), true) || Column.equals((new IDVariant(PFL_VARIEQUDIBIL_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_VARIEQUDIBIL_ANNODELIBERA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Delibera inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "VariazioniEquilibridiBilancioOnUpdatingRow", _e);
    }
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
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA, 0).equals((new IDVariant("P")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Variazioni provvisorie: Obbligatorio indicare una Proposta esistente"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Variazioni Definitive: Obbligatorio indicare una Delibera esistente"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      IDVariant C = new IDVariant(0,IDVariant.STRING);
      C = (new IDVariant("Var_Equilibri_Bilancio"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SEDE_DEL")), IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMSEDDEL, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_NUMERO_DEL")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMDEL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO_DEL")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNDEL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_UNITA_PROP")), IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMUNIPRO, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_NUMERO_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMNUMPRO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ANNO_PROP")), IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMANNPRO, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_VAR")), IMDB.Value(IMDBDef12.PQRY_PARAMETRI525, IMDBDef12.PQSL_PARAMETRI525_ROWNAMEVARIA, 0));
      MainFrm.LanciaStampaJasper(C, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniEquilibriDiBilancio", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIEQUDIBIL_PARAMETRI525() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI525_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI526, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI526, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI525_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI525_RS, 0, IMDBDef4.TBL_PARAMETRI526, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI525_RS, 0, 0, IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI525_RS, 1, 0, IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI525_RS, 2, 0, IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI525_RS, 3, 0, IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI525_RS, 4, 0, IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI525_RS, 5, 0, IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI525_RS, 6, 0, IMDBDef4.TBL_PARAMETRI526, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNPRO, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI526, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI526, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI526, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI525_RS, 0);
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
  private void PAN_VARIEQUDIBIL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIEQUDIBIL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIEQUDIBIL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIEQUDIBIL, Cancel);
    // Stub
  }

  private void PAN_VARIEQUDIBIL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIEQUDIBIL_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_VARIEQUDIBIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIEQUDIBIL_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_VARIEQUDIBIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIEQUDIBIL_ETICINFOPROP)
    {
      this.IdxPanelActived = this.PAN_VARIEQUDIBIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaInfoProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIEQUDIBIL_ELABORA)
    {
      this.IdxPanelActived = this.PAN_VARIEQUDIBIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIEQUDIBIL_INFODEL)
    {
      this.IdxPanelActived = this.PAN_VARIEQUDIBIL.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDel();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIEQUDIBIL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIEQUDIBIL_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIEQUDIBIL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIEQUDIBIL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIEQUDIBIL_Init()
  {

    PAN_VARIEQUDIBIL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIEQUDIBIL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VARIEQUDIBIL.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, "C90AB933-FC47-4AF1-8F4C-D15F9D4621CD");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, "Variazioni");
    PAN_VARIEQUDIBIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.VIS_OPTIONBUTTON);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, "5680BC60-1C03-4FE9-814C-35F3935F1A0A");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, "Proposta");
    PAN_VARIEQUDIBIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, "AA1D7989-71CD-4D3B-A0E1-F9619B56B194");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, "Numero Proposta");
    PAN_VARIEQUDIBIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, "4ADF9104-A18E-4CED-A1F8-79C45C4252A7");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, "Anno Proposta");
    PAN_VARIEQUDIBIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, "964EC653-3CE9-4915-9464-6038536367FE");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, "Delibera");
    PAN_VARIEQUDIBIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, "DA0E2219-2985-4919-8776-DA4178A698D9");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, "-");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, "E69E04AD-1EAD-46FC-A583-4A25516D2C58");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, "Numero Delibera");
    PAN_VARIEQUDIBIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, "D38E4E6B-78A7-49F7-8C46-A5E94C3BBE69");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, "/");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, "8913BB0E-41D5-421E-A5F1-D8DD6271FE46");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, "Anno Delibera");
    PAN_VARIEQUDIBIL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, "65AA72EC-DBC2-4FFA-A11D-AB5362ED7B55");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_VARIEQUDIBIL.SetImage(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, "B46FAC8A-D432-4BF1-B238-251CA0E57E56");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, "-");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, "CFCCA652-985D-4731-95FD-77373CB7E28F");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, "/");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, "8002E8EE-D80D-4A9B-BD4F-E2ECD4893DC2");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_VARIEQUDIBIL.SetImage(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, "0D12D2CB-4B75-4987-900C-55104B778800");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIEQUDIBIL.SetImage(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, 0, "info.gif", false);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, "D862E6C6-E942-4879-9746-D0681723A985");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, "Obbligatorio indicare la ");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, MyGlb.VIS_VUOGRAALILEF);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, "0A59686E-1581-4455-9A48-54B10F9A2DF1");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, "Elabora");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIEQUDIBIL.SetImage(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, 0, "button1.gif", false);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIEQUDIBIL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, "9583C7FD-CBB9-4921-A316-792359FDC26D");
    PAN_VARIEQUDIBIL.set_Header(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, "");
    PAN_VARIEQUDIBIL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_VARIEQUDIBIL.SetImage(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, 0, "info.gif", false);
    PAN_VARIEQUDIBIL.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_VARIEQUDIBIL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_FORM, 12, 24, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_FORM, 68);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_VARIAZIONI, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_VARIAZIONI, PPQRY_PARAMETRI525, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_VARIEQUDIBIL.SetValueListItem(PFL_VARIEQUDIBIL_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_VARIEQUDIBIL.SetValueListItem(PFL_VARIEQUDIBIL_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_FORM, 20, 48, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_PROPOSTA, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_PROPOSTA, PPQRY_PARAMETRI525, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Prop.");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_FORM, 212, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_NUMEROPROPOS, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_NUMEROPROPOS, PPQRY_PARAMETRI525, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prop.");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_FORM, 272, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_ANNOPROPOSTA, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_ANNOPROPOSTA, PPQRY_PARAMETRI525, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_FORM, 24, 48, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_DELIBERA, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_DELIBERA, PPQRY_PARAMETRI525, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, MyGlb.PANEL_FORM, 128, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_TRATTIDELIBE, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delib.");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_FORM, 148, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_NUMERODELIBE, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_NUMERODELIBE, PPQRY_PARAMETRI525, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, MyGlb.PANEL_FORM, 188, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_BARRADELIBER, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_FORM, 208, 48, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_ANNODELIBERA, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_ANNODELIBERA, PPQRY_PARAMETRI525, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, MyGlb.PANEL_FORM, 248, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_APRISCELDELI, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, MyGlb.PANEL_FORM, 192, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_TRATTIPROPOS, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, MyGlb.PANEL_FORM, 252, 48, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_BARRAPROPOST, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, MyGlb.PANEL_FORM, 312, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_APRISCELPROP, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, MyGlb.PANEL_LIST, 288, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, MyGlb.PANEL_FORM, 332, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICINFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_ETICINFOPROP, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_ETICINFOPROP, -1, "", "ETICINFOPROP", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, MyGlb.PANEL_LIST, 24, 80, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, MyGlb.PANEL_FORM, 20, 80, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ETICHEOBBLIG, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_ETICHEOBBLIG, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_ETICHEOBBLIG, -1, "", "ETICHEOBBLIG", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, MyGlb.PANEL_FORM, 200, 104, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_ELABORA, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, MyGlb.PANEL_LIST, 296, 60, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, MyGlb.PANEL_LIST, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, MyGlb.PANEL_LIST, 1);
    PAN_VARIEQUDIBIL.SetRect(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, MyGlb.PANEL_FORM, 268, 52, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIEQUDIBIL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, MyGlb.PANEL_FORM, 0);
    PAN_VARIEQUDIBIL.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIEQUDIBIL_INFODEL, MyGlb.PANEL_FORM, 1);
    PAN_VARIEQUDIBIL.SetFieldPage(PFL_VARIEQUDIBIL_INFODEL, -1, -1);
    PAN_VARIEQUDIBIL.SetFieldPanel(PFL_VARIEQUDIBIL_INFODEL, -1, "", "INFODEL", 0, 0, 0, -13997);
  }

  private void PAN_VARIEQUDIBIL_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIEQUDIBIL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_VARIEQUDIBIL.SetIMDB(IMDB, "PQRY_PARAMETRI525", true);
    PAN_VARIEQUDIBIL.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VARIEQUDIBIL.SetQueryIMDB(PPQRY_PARAMETRI525, IMDBDef12.PQRY_PARAMETRI525_RS, IMDBDef4.TBL_PARAMETRI526);
    JustLoaded = true;
    PAN_VARIEQUDIBIL.SetFieldPrimaryIndex(PFL_VARIEQUDIBIL_VARIAZIONI, IMDBDef4.FLD_PARAMETRI526_ROWNAMEVARIA);
    PAN_VARIEQUDIBIL.SetFieldPrimaryIndex(PFL_VARIEQUDIBIL_PROPOSTA, IMDBDef4.FLD_PARAMETRI526_ROWNAMUNIPRO);
    PAN_VARIEQUDIBIL.SetFieldPrimaryIndex(PFL_VARIEQUDIBIL_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMPRO);
    PAN_VARIEQUDIBIL.SetFieldPrimaryIndex(PFL_VARIEQUDIBIL_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNPRO);
    PAN_VARIEQUDIBIL.SetFieldPrimaryIndex(PFL_VARIEQUDIBIL_DELIBERA, IMDBDef4.FLD_PARAMETRI526_ROWNAMSEDDEL);
    PAN_VARIEQUDIBIL.SetFieldPrimaryIndex(PFL_VARIEQUDIBIL_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI526_ROWNAMNUMDEL);
    PAN_VARIEQUDIBIL.SetFieldPrimaryIndex(PFL_VARIEQUDIBIL_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI526_ROWNAMANNDEL);
    PAN_VARIEQUDIBIL.SetMasterTable(0, "PARAMETRI526");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIEQUDIBIL.Status() == 2)
    {
      int oldListQBE = PAN_VARIEQUDIBIL.iUseListQBE;
      PAN_VARIEQUDIBIL.iUseListQBE = 0;
      PAN_VARIEQUDIBIL.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIEQUDIBIL.PanelCommand(Glb.PCM_FIND);
      PAN_VARIEQUDIBIL.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIEQUDIBIL) PAN_VARIEQUDIBIL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIEQUDIBIL) PAN_VARIEQUDIBIL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIEQUDIBIL) PAN_VARIEQUDIBIL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIEQUDIBIL) PAN_VARIEQUDIBIL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIEQUDIBIL) PAN_VARIEQUDIBIL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
