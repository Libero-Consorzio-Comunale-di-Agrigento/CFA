// **********************************************
// Informazioni Sull Opera
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class InformazioniSullOpera extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_INFOSULLOPER_DESCRIZOPERA = 0;
  private static int PFL_INFOSULLOPER_PREVISINIZI1 = 1;
  private static int PFL_INFOSULLOPER_VARIAZIONI1 = 2;
  private static int PFL_INFOSULLOPER_PREVISATTUA1 = 3;
  private static int PFL_INFOSULLOPER_ACCERTCOMPET = 4;
  private static int PFL_INFOSULLOPER_DISPONIBILI1 = 5;
  private static int PFL_INFOSULLOPER_VARIAZPROVV1 = 6;
  private static int PFL_INFOSULLOPER_ACCERTRESIDU = 7;
  private static int PFL_INFOSULLOPER_ORDINACOMPET = 8;
  private static int PFL_INFOSULLOPER_RESIDUO1 = 9;
  private static int PFL_INFOSULLOPER_TOTALE1 = 10;
  private static int PFL_INFOSULLOPER_PREVISINIZIA = 11;
  private static int PFL_INFOSULLOPER_VARIAZIONI = 12;
  private static int PFL_INFOSULLOPER_PREVISATTUAL = 13;
  private static int PFL_INFOSULLOPER_IMPEGNCOMPET = 14;
  private static int PFL_INFOSULLOPER_DISPONIBILIT = 15;
  private static int PFL_INFOSULLOPER_VARIAZPROVVI = 16;
  private static int PFL_INFOSULLOPER_IMPEGNRESIDU = 17;
  private static int PFL_INFOSULLOPER_SUBIMPEGNATO = 18;
  private static int PFL_INFOSULLOPER_LIQUIDATO = 19;
  private static int PFL_INFOSULLOPER_MANDATCOMPET = 20;
  private static int PFL_INFOSULLOPER_RESIDUO = 21;
  private static int PFL_INFOSULLOPER_TOTALE = 22;
  private static int PFL_INFOSULLOPER_LABELENTRATA = 23;
  private static int PFL_INFOSULLOPER_LABELSPESA = 24;
  private static int PFL_INFOSULLOPER_APRPREINENOP = 25;
  private static int PFL_INFOSULLOPER_APRELEVAENOP = 26;
  private static int PFL_INFOSULLOPER_APRPREINSPOP = 27;
  private static int PFL_INFOSULLOPER_APRACCDICOOP = 28;
  private static int PFL_INFOSULLOPER_APRVARPRENOP = 29;
  private static int PFL_INFOSULLOPER_APRACCARESOP = 30;
  private static int PFL_INFOSULLOPER_APRORDDICOOP = 31;
  private static int PFL_INFOSULLOPER_APRORDARESOP = 32;
  private static int PFL_INFOSULLOPER_APRELEVASPOP = 33;
  private static int PFL_INFOSULLOPER_APRIMPDICOOP = 34;
  private static int PFL_INFOSULLOPER_APRVARPRSPOP = 35;
  private static int PFL_INFOSULLOPER_APRIMPARESOP = 36;
  private static int PFL_INFOSULLOPER_APRSUBIMOPOP = 37;
  private static int PFL_INFOSULLOPER_APRILIQUIOPE = 38;
  private static int PFL_INFOSULLOPER_APRMANDICOOP = 39;
  private static int PFL_INFOSULLOPER_APRMANARESOP = 40;
  private static int PFL_INFOSULLOPER_OPERA = 41;

  private static int PPQRY_VISTATOTOPE2 = 0;


  IDPanel PAN_INFOSULLOPER;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI21(IMDB);
    //
    //
    Init_PQRY_VISTATOTOPE2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI21(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI21, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI21, "TBL_PARAMETRI21");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI21,IMDBDef1.FLD_PARAMETRI21_PARAMOPERA, "PARAMOPERA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI21,IMDBDef1.FLD_PARAMETRI21_PARAMOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI21,IMDBDef1.FLD_PARAMETRI21_PARADESCOPER, "PARADESCOPER");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI21,IMDBDef1.FLD_PARAMETRI21_PARADESCOPER,5,60,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI21, 0);
  }

  private static void Init_PQRY_VISTATOTOPE2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VISTATOTOPE2, 25);
    IMDB.set_TblCode(IMDBDef8.PQRY_VISTATOTOPE2, "PQRY_VISTATOTOPE2");
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_INI_E, "PREVISIONE_INI_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_INI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARIAZIONI_E, "VARIAZIONI_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARIAZIONI_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_ATT_E, "PREVISIONE_ATT_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_ATT_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ACCERTATO_COMP, "ACCERTATO_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ACCERTATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_DISPONIBILITA_E, "DISPONIBILITA_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_DISPONIBILITA_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARCOMPRO_E, "VARCOMPRO_E");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARCOMPRO_E,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ACCERTATO_RES, "ACCERTATO_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ACCERTATO_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ORDINATIVI_COMP, "ORDINATIVI_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ORDINATIVI_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ORDINATIVI_RES, "ORDINATIVI_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ORDINATIVI_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ORDINATIVI, "ORDINATIVI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_ORDINATIVI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_INI_S, "PREVISIONE_INI_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_INI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARIAZIONI_S, "VARIAZIONI_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARIAZIONI_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_ATT_S, "PREVISIONE_ATT_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_PREVISIONE_ATT_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_IMPEGNATO_COMP, "IMPEGNATO_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_IMPEGNATO_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_DISPONIBILITA_S, "DISPONIBILITA_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_DISPONIBILITA_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARCOMPRO_S, "VARCOMPRO_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VARCOMPRO_S,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_IMPEGNATO_RES, "IMPEGNATO_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_IMPEGNATO_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_SUBIMPEGNATO, "SUBIMPEGNATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_SUBIMPEGNATO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_LIQUIDATO,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_MANDATI_COMP, "MANDATI_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_MANDATI_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_MANDATI_RES, "MANDATI_RES");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_MANDATI_RES,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_MANDATI, "MANDATI");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_MANDATI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VISTOTOPDEOP, "VISTOTOPDEOP");
    IMDB.SetFldParams(IMDBDef8.PQRY_VISTATOTOPE2,IMDBDef8.PQSL_VISTATOTOPE2_VISTOTOPDEOP,5,302,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VISTATOTOPE2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public InformazioniSullOpera(MyWebEntryPoint w, IMDBObj imdb)
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
  public InformazioniSullOpera()
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
    FormIdx = MyGlb.FRM_INFOSULLOPER;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D49FB049-9DA9-4864-B8E3-B0E63004B72C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 616;
    DesignHeight = 434;
    set_Caption(new IDVariant("Informazioni Sull Opera"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 616;
    Frames[1].Height = 408;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Informazioni Sull Opera";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 408;
    PAN_INFOSULLOPER = new IDPanel(w, this, 1, "PAN_INFOSULLOPER");
    Frames[1].Content = PAN_INFOSULLOPER;
    PAN_INFOSULLOPER.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INFOSULLOPER.VS = MainFrm.VisualStyleList;
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 616-MyGlb.PAN_OFFS_X, 408-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BCF2EB2A-7086-4F95-ADBC-0F162A7B3D50");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2004, 268, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INFOSULLOPER.InitStatus = 1;
    PAN_INFOSULLOPER_Init();
    PAN_INFOSULLOPER_InitFields();
    PAN_INFOSULLOPER_InitQueries();
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
      PAN_INFOSULLOPER.UpdatePanel(MainFrm);
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
    return (obj instanceof InformazioniSullOpera);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? InformazioniSullOpera.class.getName() : (Glb.ClassWithPackage(InformazioniSullOpera.class) ? InformazioniSullOpera.class.getName().substring(InformazioniSullOpera.class.getPackage().getName().length() + 1) : InformazioniSullOpera.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Informazioni sull'Opera", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZOPER, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriPrevisioneInizialeSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Previsione Iniziale Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriPrevisioneInizialeEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Previsione Iniziale Entrata Body
      // Procedure Body
      // 
      // IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI22, IMDBDef1.FLD_PARAMETRI22_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_PREVINIZOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_PREVINIZOPER, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriPrevisioneInizialeEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIAZIOPERA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIAZIOPERA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriElencoVariazioniEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Elenco Variazioni Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriElencoVariazioniSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Elenco Variazioni Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI23, IMDBDef1.FLD_PARAMETRI23_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIAZIOPERA,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIAZIOPERA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriElencoVariazioniSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti Di Competenza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriAccertamentiDiCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti Di Competenza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI24, IMDBDef1.FLD_PARAMETRI24_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEDICOMOPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEDICOMOPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriAccertamentiDiCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni Di Competenza Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriImpegniDiCompetenzaOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni Di Competenza Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMFINANZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI26, IMDBDef1.FLD_PARAMETRI26_PARAMTIPO, 0, (new IDVariant("Opera")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGDICOMPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGDICOMPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriImpegniDiCompetenzaOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazioni Provvisorie Entrata
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioniProvvisorieEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazioni Provvisorie Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMTIPO, 0, (new IDVariant("Entrata")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVOPER, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriVariazioniProvvisorieEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Variazione Provvisoria Spesa
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriVariazioneProvvisoriaSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Variazione Provvisoria Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI27, IMDBDef1.FLD_PARAMETRI27_PARAMTIPO, 0, (new IDVariant("Spesa")));
      MainFrm.UnloadForm(MyGlb.FRM_VARIPROVOPER,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_VARIPROVOPER, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriVariazioneProvvisoriaSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Accertamenti a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriAccertamentiaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Accertamenti a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI28, IMDBDef1.FLD_PARAMETRI28_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.UnloadForm(MyGlb.FRM_ACCEARESIOPE,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_ACCEARESIOPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriAccertamentiaResiduo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Impegni a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriImpegniaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Impegni a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMFINANZI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI315, IMDBDef1.FLD_PARAMETRI315_PARAMTIPO, 0, (new IDVariant("Opera")));
      MainFrm.UnloadForm(MyGlb.FRM_IMPEGNARESID,(new IDVariant(-1)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_IMPEGNARESID, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriImpegniaResiduo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Sub Impegni Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriSubImpegniOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Sub Impegni Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI30, IMDBDef1.FLD_PARAMETRI30_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_SUBIMPEGOPER, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriSubImpegniOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Liquidazioni Opera
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriLiquidazioniOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Liquidazioni Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI31, IMDBDef1.FLD_PARAMETRI31_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_LIQUIDAOPERA, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriLiquidazioniOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi di Competenza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinatividiCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi di Competenza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI32, IMDBDef1.FLD_PARAMETRI32_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_ORDIDICOMOPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriOrdinatividiCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Ordinativi a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriOrdinativiaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Ordinativi a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI34, IMDBDef1.FLD_PARAMETRI34_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_ORDIARESIOPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriOrdinativiaResiduo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati di Competenza
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatidiCompetenza ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati di Competenza Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI36, IMDBDef1.FLD_PARAMETRI36_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_MANDDICOMOPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriMandatidiCompetenza", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Mandati a Residuo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriMandatiaResiduo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Mandati a Residuo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI37, IMDBDef1.FLD_PARAMETRI37_PARAMOPERA, 0, IMDB.Value(IMDBDef8.PQRY_VISTATOTOPE2, IMDBDef8.PQSL_VISTATOTOPE2_OPERA, 0));
      MainFrm.Show(MyGlb.FRM_MANDARESIOPE, (new IDVariant(2)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("InformazioniSullOpera", "ApriMandatiaResiduo", _e);
      return -1;
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
  private void PAN_INFOSULLOPER_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INFOSULLOPER, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INFOSULLOPER_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INFOSULLOPER, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INFOSULLOPER_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_INFOSULLOPER);
    // Stub
  }

  private void PAN_INFOSULLOPER_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRPREINENOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRELEVAENOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRPREINSPOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriPrevisioneInizialeSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRACCDICOOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAccertamentiDiCompetenza();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRVARPRENOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioniProvvisorieEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRACCARESOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriAccertamentiaResiduo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRORDDICOOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinatividiCompetenza();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRORDARESOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOrdinativiaResiduo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRELEVASPOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriElencoVariazioniSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRIMPDICOOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImpegniDiCompetenzaOpera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRVARPRSPOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVariazioneProvvisoriaSpesa();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRIMPARESOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriImpegniaResiduo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRSUBIMOPOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSubImpegniOpera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRILIQUIOPE)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriLiquidazioniOpera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRMANDICOOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMandatidiCompetenza();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_INFOSULLOPER_APRMANARESOP)
    {
      this.IdxPanelActived = this.PAN_INFOSULLOPER.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriMandatiaResiduo();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_INFOSULLOPER_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INFOSULLOPER_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INFOSULLOPER_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_INFOSULLOPER_Init()
  {

    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_FIELD, 42);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, "7C866B25-5728-4F9A-9F12-D20AF6690144");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, "Descrizione Opera ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.VIS_VUOTOGRASSET);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, "5912703D-68D8-4576-BF1E-F07EDDB7A192");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, "Previsione Iniziale");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, "E55A90F1-4D87-45E8-8B26-0CA9D7DAF31C");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, "Variazioni");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, "EEC99721-C708-464C-B2EF-B27211798832");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, "Previsione Attuale");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, "0FDBB00E-9618-45B9-952F-26FDB700CED5");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, "Accertato Competenza");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, "DB4D1295-83C4-4CBA-9E24-B260187E3324");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, "Disponibilità");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, "9F875E39-6A0D-4EC4-99AE-3FEBF5AAECC3");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, "Variazioni Provvisorie");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, "9F2C712D-E59E-4AA4-843B-06B89C19A5E5");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, "Accertato Residuo");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, "E5777A8F-ED53-4CDA-ABF9-C27EEAD3BF6F");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, "Ordinativi Competenza");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, "93711983-357E-494E-9C20-F1A32F2FCC86");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, "Residuo");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, "7F84D24C-CB69-4161-8EE9-9DC1ED54D19E");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, "Totale");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, "093390AE-3879-4BD0-9DFD-B1FA565EC7EC");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, "Previsione Iniziale ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, "79259575-F699-45B4-B5DD-5AFCA2162E72");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, "Variazioni ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, "9A56ACDA-63BA-4FEB-815E-F4A812E87522");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, "Previsione Attuale ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, "1F11CBA1-E4D8-45DE-A775-02F3ADC8AB3A");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, "Impegnato Competenza");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, "B990A32A-B82D-4FF7-A605-E47BD9355DA9");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, "Disponibilità ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, "82489DA2-B230-49E3-84A6-6F1A788328DC");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, "Variazioni Provvisorie ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, "1FAA29AB-4B12-4353-8DCF-EB05DE29167A");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, "Impegnato Residuo");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, "D4B189F4-1596-43BD-8010-5A5842399B63");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, "Sub Impegnato");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, "0F1DE652-7DB9-4079-A38F-B99AA89D5261");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, "Liquidato");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, "CB57C67D-D966-47B3-9D3E-46599234ECF4");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, "Mandati Competenza");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, "01B3249C-F335-4408-9822-CEC2D5095D67");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, "Residuo ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, "08CBD293-DF97-40FD-AD23-8AE670F52214");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, "Totale ");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.VIS_NORFIECF4IMP);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, "ABC66483-E381-47EA-8373-BFF94667965A");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, "Entrata");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.VIS_VUOTOGRASSET);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, "80923623-14EC-4918-8ABC-44BCB1A62B8F");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, "Spesa");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.VIS_VUOTOGRASSET);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, "BF7C00A0-89F2-49F1-BF75-C52A3D2CBA5A");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, "A900F362-7840-49C9-B441-8CE4C6AF7127");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, "BB9C5EBC-B72F-4DB3-8DFD-95D17B6613F2");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, "66C62499-E65F-45CD-9FFC-7ED117BD823E");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, "02DF9308-4746-4A0D-A492-074FD068197A");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, "0B83844D-5217-451A-9E64-F59F15AEFACB");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, "0624CA98-6B1B-46B5-B8C4-0AFBB805BDE7");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, "46E1E3EF-A2EB-4CC6-A9C9-B6813CFB1500");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, "3B8CD1D9-9CE0-4640-9685-A60923EF12A6");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, "C8B7776E-0204-4743-AB78-80493693B618");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, "03E5CF70-5376-4AC3-8D15-1F93AECFBFAE");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, "D657D5D6-F33A-4B04-9AC6-881F61E8FEF0");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, "01D9C692-5226-42DF-8A04-3C1F6594AE4E");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, "F55BE549-0655-4DFB-B5E4-4247CDDE5FF8");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, "B202F1C4-EA32-410C-9F16-D66C78FD71DD");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, "A3573284-D7EF-4950-BF5D-149887A52AED");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, MyGlb.VIS_STATICBUTTON);
    PAN_INFOSULLOPER.SetImage(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, 0, "info.gif", false);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_INFOSULLOPER.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, "3C1792D2-31D4-499E-902D-765EFDA29B22");
    PAN_INFOSULLOPER.set_Header(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, "OPERA");
    PAN_INFOSULLOPER.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, "");
    PAN_INFOSULLOPER.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.VIS_NONNULLAFIEL);
    PAN_INFOSULLOPER.SetFlags(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, 0, -1);
  }

  private void PAN_INFOSULLOPER_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 0, 36, 428, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, 3);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_LIST, "Descrizione Opera ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 12, 12, 532, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DESCRIZOPERA, MyGlb.PANEL_FORM, "Descr. Opera");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DESCRIZOPERA, -1, -1);
    PAN_INFOSULLOPER.SetFieldUnbound(PFL_INFOSULLOPER_DESCRIZOPERA, true);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DESCRIZOPERA, PPQRY_VISTATOTOPE2, "TO_CHAR ( A.OPERA ) || ' - ' || A.DES_OPERA", "VISTOTOPDEOP", 5, 302, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_LIST, "Previsione Iniziale");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, 32, 68, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, 116);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZI1, MyGlb.PANEL_FORM, "Previsione Iniziale");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISINIZI1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISINIZI1, PPQRY_VISTATOTOPE2, "A.PREVISIONE_INI_E", "PREVISIONE_INI_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_LIST, "Variazioni");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, 72, 92, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, 76);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI1, MyGlb.PANEL_FORM, "Variazioni");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZIONI1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZIONI1, PPQRY_VISTATOTOPE2, "A.VARIAZIONI_E", "VARIAZIONI_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_LIST, "Previsione Attuale");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, 32, 116, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, 116);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUA1, MyGlb.PANEL_FORM, "Previsione Attuale");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISATTUA1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISATTUA1, PPQRY_VISTATOTOPE2, "A.PREVISIONE_ATT_E", "PREVISIONE_ATT_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, 104);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_LIST, "Accer. Compet.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, 8, 140, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, 140);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTCOMPET, MyGlb.PANEL_FORM, "Accertato Competenza");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_ACCERTCOMPET, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_ACCERTCOMPET, PPQRY_VISTATOTOPE2, "A.ACCERTATO_COMP", "ACCERTATO_COMP", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, 92);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, 60, 164, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, 88);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILI1, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPONIBILI1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPONIBILI1, PPQRY_VISTATOTOPE2, "A.DISPONIBILITA_E", "DISPONIBILITA_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, 84);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_LIST, "Variazioni Provvisorie");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, 16, 188, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVV1, MyGlb.PANEL_FORM, "Variazioni Provvisorie");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROVV1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROVV1, PPQRY_VISTATOTOPE2, "A.VARCOMPRO_E", "VARCOMPRO_E", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_LIST, 92);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_LIST, "Accertato Residuo");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_FORM, 16, 212, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_FORM, 132);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ACCERTRESIDU, MyGlb.PANEL_FORM, "Accertato Residuo");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_ACCERTRESIDU, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_ACCERTRESIDU, PPQRY_VISTATOTOPE2, "A.ACCERTATO_RES", "ACCERTATO_RES", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_LIST, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_LIST, "Ordin. Comp.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_FORM, 8, 284, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_FORM, 140);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_ORDINACOMPET, MyGlb.PANEL_FORM, "Ordinativi Competenza");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_ORDINACOMPET, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_ORDINACOMPET, PPQRY_VISTATOTOPE2, "A.ORDINATIVI_COMP", "ORDINATIVI_COMP", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_LIST, 92);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_LIST, "Residuo");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_FORM, 80, 308, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_FORM, 68);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO1, MyGlb.PANEL_FORM, "Residuo");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_RESIDUO1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_RESIDUO1, PPQRY_VISTATOTOPE2, "A.ORDINATIVI_RES", "ORDINATIVI_RES", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_LIST, 68);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_LIST, "Totale");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_FORM, 88, 332, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_FORM, 60);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE1, MyGlb.PANEL_FORM, "Totale");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_TOTALE1, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_TOTALE1, PPQRY_VISTATOTOPE2, "A.ORDINATIVI", "ORDINATIVI", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 96);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_LIST, "Previsione Iniziale ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 312, 68, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 120);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISINIZIA, MyGlb.PANEL_FORM, "Previsione Iniziale ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISINIZIA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISINIZIA, PPQRY_VISTATOTOPE2, "A.PREVISIONE_INI_S", "PREVISIONE_INI_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, 352, 92, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, 80);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZIONI, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZIONI, PPQRY_VISTATOTOPE2, "A.VARIAZIONI_S", "VARIAZIONI_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_LIST, "Previsione Attuale ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 312, 116, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 120);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_PREVISATTUAL, MyGlb.PANEL_FORM, "Previsione Attuale ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_PREVISATTUAL, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_PREVISATTUAL, PPQRY_VISTATOTOPE2, "A.PREVISIONE_ATT_S", "PREVISIONE_ATT_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, 100);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_LIST, "Impeg. Compet.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, 284, 140, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, 148);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNCOMPET, MyGlb.PANEL_FORM, "Impegnato Competenza");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_IMPEGNCOMPET, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_IMPEGNCOMPET, PPQRY_VISTATOTOPE2, "A.IMPEGNATO_COMP", "IMPEGNATO_COMP", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, 92);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, 344, 164, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, 88);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_DISPONIBILIT, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_DISPONIBILIT, PPQRY_VISTATOTOPE2, "A.DISPONIBILITA_S", "DISPONIBILITA_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, 84);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_LIST, "Variaz. Provv.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, 296, 188, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, 136);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_VARIAZPROVVI, MyGlb.PANEL_FORM, "Variazioni Provvisorie ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_VARIAZPROVVI, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_VARIAZPROVVI, PPQRY_VISTATOTOPE2, "A.VARCOMPRO_S", "VARCOMPRO_S", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_LIST, 92);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_LIST, "Impegnato Residuo");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_FORM, 304, 212, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_FORM, 128);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_IMPEGNRESIDU, MyGlb.PANEL_FORM, "Impegnato Residuo");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_IMPEGNRESIDU, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_IMPEGNRESIDU, PPQRY_VISTATOTOPE2, "A.IMPEGNATO_RES", "IMPEGNATO_RES", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_LIST, 88);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_LIST, "Sub Impegnato");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_FORM, 324, 236, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_FORM, 108);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_SUBIMPEGNATO, MyGlb.PANEL_FORM, "Sub Impegnato");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_SUBIMPEGNATO, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_SUBIMPEGNATO, PPQRY_VISTATOTOPE2, "A.SUBIMPEGNATO", "SUBIMPEGNATO", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_LIST, 64);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_LIST, "Liquidato");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_FORM, 328, 260, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_FORM, 104);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LIQUIDATO, MyGlb.PANEL_FORM, "Liquidato");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_LIQUIDATO, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_LIQUIDATO, PPQRY_VISTATOTOPE2, "A.LIQUIDATO", "LIQUIDATO", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_LIST, 88);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_LIST, "Mand. Compet.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_FORM, 296, 284, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_FORM, 136);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_MANDATCOMPET, MyGlb.PANEL_FORM, "Mandati Competenza");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_MANDATCOMPET, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_MANDATCOMPET, PPQRY_VISTATOTOPE2, "A.MANDATI_COMP", "MANDATI_COMP", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_LIST, 76);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_LIST, "Res.");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_FORM, 324, 308, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_FORM, 108);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_RESIDUO, MyGlb.PANEL_FORM, "Residuo ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_RESIDUO, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_RESIDUO, PPQRY_VISTATOTOPE2, "A.MANDATI_RES", "MANDATI_RES", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_LIST, 56);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_LIST, "Totale ");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_FORM, 368, 332, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_FORM, 64);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_TOTALE, MyGlb.PANEL_FORM, "Totale ");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_TOTALE, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_TOTALE, PPQRY_VISTATOTOPE2, "A.MANDATI", "MANDATI", 2, 15, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_LIST, 76, 12, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_FORM, 92, 44, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELENTRATA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_LABELENTRATA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_LABELENTRATA, -1, "", "LABELENTRATA", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_LIST, 84, 20, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_FORM, 384, 44, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_LABELSPESA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_LABELSPESA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_LABELSPESA, -1, "", "LABELSPESA", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_LIST, 228, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_FORM, 248, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINENOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRPREINENOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRPREINENOP, -1, "", "APRPREINENOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_LIST, 236, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_FORM, 248, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVAENOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRELEVAENOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRELEVAENOP, -1, "", "APRELEVAENOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_LIST, 244, 52, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_FORM, 532, 72, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRPREINSPOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRPREINSPOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRPREINSPOP, -1, "", "APRPREINSPOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_FORM, 248, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCDICOOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRACCDICOOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRACCDICOOP, -1, "", "APRACCDICOOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_FORM, 248, 192, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRENOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRVARPRENOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRVARPRENOP, -1, "", "APRVARPRENOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, MyGlb.PANEL_LIST, 268, 76, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, MyGlb.PANEL_FORM, 248, 216, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRACCARESOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRACCARESOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRACCARESOP, -1, "", "APRACCARESOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, MyGlb.PANEL_LIST, 276, 84, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, MyGlb.PANEL_FORM, 248, 288, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDDICOOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRORDDICOOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRORDDICOOP, -1, "", "APRORDDICOOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, MyGlb.PANEL_LIST, 284, 92, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, MyGlb.PANEL_FORM, 248, 312, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRORDARESOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRORDARESOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRORDARESOP, -1, "", "APRORDARESOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_LIST, 252, 60, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_FORM, 532, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRELEVASPOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRELEVASPOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRELEVASPOP, -1, "", "APRELEVASPOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_LIST, 260, 68, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_FORM, 532, 144, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPDICOOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRIMPDICOOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRIMPDICOOP, -1, "", "APRIMPDICOOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_LIST, 268, 76, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_FORM, 532, 192, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRVARPRSPOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRVARPRSPOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRVARPRSPOP, -1, "", "APRVARPRSPOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, MyGlb.PANEL_LIST, 276, 84, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, MyGlb.PANEL_FORM, 532, 216, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRIMPARESOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRIMPARESOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRIMPARESOP, -1, "", "APRIMPARESOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, MyGlb.PANEL_LIST, 284, 92, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, MyGlb.PANEL_FORM, 532, 240, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRSUBIMOPOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRSUBIMOPOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRSUBIMOPOP, -1, "", "APRSUBIMOPOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, MyGlb.PANEL_LIST, 292, 100, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, MyGlb.PANEL_FORM, 532, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRILIQUIOPE, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRILIQUIOPE, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRILIQUIOPE, -1, "", "APRILIQUIOPE", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, MyGlb.PANEL_LIST, 300, 108, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, MyGlb.PANEL_FORM, 532, 288, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANDICOOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRMANDICOOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRMANDICOOP, -1, "", "APRMANDICOOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, MyGlb.PANEL_LIST, 308, 116, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, MyGlb.PANEL_LIST, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, MyGlb.PANEL_FORM, 532, 312, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, MyGlb.PANEL_FORM, 0);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_APRMANARESOP, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_APRMANARESOP, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_APRMANARESOP, -1, "", "APRMANARESOP", 0, 0, 0, -13997);
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, 44);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_LIST, "OPERA");
    PAN_INFOSULLOPER.SetRect(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, 4, 324, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INFOSULLOPER.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, 44);
    PAN_INFOSULLOPER.SetNumRow(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_INFOSULLOPER.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INFOSULLOPER_OPERA, MyGlb.PANEL_FORM, "OPERA");
    PAN_INFOSULLOPER.SetFieldPage(PFL_INFOSULLOPER_OPERA, -1, -1);
    PAN_INFOSULLOPER.SetFieldPanel(PFL_INFOSULLOPER_OPERA, PPQRY_VISTATOTOPE2, "A.OPERA", "OPERA", 1, 5, 0, -13997);
  }

  private void PAN_INFOSULLOPER_InitQueries()
  {
    StringBuffer SQL;

    PAN_INFOSULLOPER.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_INFOSULLOPER.SetIMDB(IMDB, "PQRY_VISTATOTOPE2", true);
    PAN_INFOSULLOPER.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA TOT OPE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.PREVISIONE_INI_E as PREVISIONE_INI_E, ");
    SQL.append("  A.VARIAZIONI_E as VARIAZIONI_E, ");
    SQL.append("  A.PREVISIONE_ATT_E as PREVISIONE_ATT_E, ");
    SQL.append("  A.ACCERTATO_COMP as ACCERTATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_E as DISPONIBILITA_E, ");
    SQL.append("  A.VARCOMPRO_E as VARCOMPRO_E, ");
    SQL.append("  A.ACCERTATO_RES as ACCERTATO_RES, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.ORDINATIVI_COMP as ORDINATIVI_COMP, ");
    SQL.append("  A.ORDINATIVI_RES as ORDINATIVI_RES, ");
    SQL.append("  A.ORDINATIVI as ORDINATIVI, ");
    SQL.append("  A.PREVISIONE_INI_S as PREVISIONE_INI_S, ");
    SQL.append("  A.VARIAZIONI_S as VARIAZIONI_S, ");
    SQL.append("  A.PREVISIONE_ATT_S as PREVISIONE_ATT_S, ");
    SQL.append("  A.IMPEGNATO_COMP as IMPEGNATO_COMP, ");
    SQL.append("  A.DISPONIBILITA_S as DISPONIBILITA_S, ");
    SQL.append("  A.VARCOMPRO_S as VARCOMPRO_S, ");
    SQL.append("  A.IMPEGNATO_RES as IMPEGNATO_RES, ");
    SQL.append("  A.SUBIMPEGNATO as SUBIMPEGNATO, ");
    SQL.append("  A.LIQUIDATO as LIQUIDATO, ");
    SQL.append("  A.MANDATI_COMP as MANDATI_COMP, ");
    SQL.append("  A.MANDATI_RES as MANDATI_RES, ");
    SQL.append("  A.MANDATI as MANDATI, ");
    SQL.append("  TO_CHAR ( A.OPERA ) || ' - ' || A.DES_OPERA as VISTOTOPDEOP ");
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_TOT_OPE A ");
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.OPERA = ~~TBL_PARAMETRI21.PARAMOPERA~~) ");
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INFOSULLOPER.SetQuery(PPQRY_VISTATOTOPE2, 5, SQL, -1, "");
    PAN_INFOSULLOPER.SetQueryDB(PPQRY_VISTATOTOPE2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INFOSULLOPER.SetMasterTable(0, "VISTA_TOT_OPE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INFOSULLOPER.Status() == 2)
    {
      int oldListQBE = PAN_INFOSULLOPER.iUseListQBE;
      PAN_INFOSULLOPER.iUseListQBE = 0;
      PAN_INFOSULLOPER.PanelCommand(Glb.PCM_SEARCH);
      PAN_INFOSULLOPER.PanelCommand(Glb.PCM_FIND);
      PAN_INFOSULLOPER.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_INFOSULLOPER) PAN_INFOSULLOPER_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
