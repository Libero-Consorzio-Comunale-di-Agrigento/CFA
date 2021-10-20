// **********************************************
// Controllo Anticipazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloAnticipazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DETTAGLIQUID = 0;

  private static int PPQRY_PARAMETRI145 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_CONTROANTICI_CODICE = 0;
  private static int PFL_CONTROANTICI_FINANZIAMENT = 1;
  private static int PFL_CONTROANTICI_MANDATI = 2;
  private static int PFL_CONTROANTICI_ORDINATIVI = 3;
  private static int PFL_CONTROANTICI_SALDOINIZ = 4;
  private static int PFL_CONTROANTICI_ANTICIPAZION = 5;
  private static int PFL_CONTROANTICI_DETTAGLIQUI1 = 6;

  private static int PPQRY_VISTOTCASFIN = 0;


  IDPanel PAN_CONTROANTICI;
  private static int PFL_DETTAGLIQUID_NUMEROLIQ = 0;
  private static int PFL_DETTAGLIQUID_DATALIQ = 1;
  private static int PFL_DETTAGLIQUID_IMPORTO = 2;
  private static int PFL_DETTAGLIQUID_VOCEPEG = 3;
  private static int PFL_DETTAGLIQUID_IMPEGNO = 4;
  private static int PFL_DETTAGLIQUID_SUBIMPEGNO = 5;
  private static int PFL_DETTAGLIQUID_BENEFICIARIO = 6;
  private static int PFL_DETTAGLIQUID_DESCRIZIONE = 7;
  private static int PFL_DETTAGLIQUID_LIQUIDALABEL = 8;

  private static int PPQRY_LIQ16 = 0;


  IDPanel PAN_DETTAGLIQUID;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI144(IMDB);
    //
    //
    Init_PQRY_VISTOTCASFIN(IMDB);
    Init_PQRY_PARAMETRI145(IMDB);
    Init_PQRY_PARAMETRI145_RS(IMDB);
    Init_PQRY_LIQ16(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI144(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI144, 2);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI144, "TBL_PARAMETRI144");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI144,IMDBDef5.FLD_PARAMETRI144_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI144,IMDBDef5.FLD_PARAMETRI144_PARAMUFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI144,IMDBDef5.FLD_PARAMETRI144_PARADETTLIQU, "PARADETTLIQU");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI144,IMDBDef5.FLD_PARAMETRI144_PARADETTLIQU,5,2,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI144, 0);
  }

  private static void Init_PQRY_VISTOTCASFIN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_VISTOTCASFIN, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_VISTOTCASFIN, "PQRY_VISTOTCASFIN");
    IMDB.set_FldCode(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_DESCRIZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_VISTOTCAFIMA, "VISTOTCAFIMA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_VISTOTCAFIMA,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_VISTOTCAFIOR, "VISTOTCAFIOR");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_VISTOTCAFIOR,2,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_SALDO_INI_CASSA, "SALDO_INI_CASSA");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_SALDO_INI_CASSA,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_VISTOTCAFIAN, "VISTOTCAFIAN");
    IMDB.SetFldParams(IMDBDef14.PQRY_VISTOTCASFIN,IMDBDef14.PQSL_VISTOTCASFIN_VISTOTCAFIAN,2,19,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_VISTOTCASFIN, 0);
  }

  private static void Init_PQRY_PARAMETRI145(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI145, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI145, "PQRY_PARAMETRI145");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI145,IMDBDef14.PQSL_PARAMETRI145_PARADETTLIQU, "PARADETTLIQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI145,IMDBDef14.PQSL_PARAMETRI145_PARADETTLIQU,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI145, 0);
  }

  private static void Init_PQRY_PARAMETRI145_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMETRI145_RS, 1);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMETRI145_RS, "PQRY_PARAMETRI145_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMETRI145_RS,IMDBDef14.PQSL_PARAMETRI145_PARADETTLIQU, "PARADETTLIQU");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMETRI145_RS,IMDBDef14.PQSL_PARAMETRI145_PARADETTLIQU,5,2,0);
  }

  private static void Init_PQRY_LIQ16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ16, 8);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ16, "PQRY_LIQ16");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_D_DATA_REG, "D_DATA_REG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_D_DATA_REG,6,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIQVOCEPEG, "LIQVOCEPEG");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIQVOCEPEG,5,201,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIQIMPEGNO, "LIQIMPEGNO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIQIMPEGNO,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIQSUBIMPEGN, "LIQSUBIMPEGN");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIQSUBIMPEGN,5,99,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIBERASOESES, "LIBERASOESES");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_LIBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ16,IMDBDef14.PQSL_LIQ16_DESCRIZIONE,5,140,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ16, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloAnticipazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloAnticipazioni()
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
    FormIdx = MyGlb.FRM_CONTROANTICI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8AF4F9B0-2AAE-4450-9B9E-30826F50761B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 804;
    DesignHeight = 570;
    set_Caption(new IDVariant("Controllo Anticipazioni"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 804;
    Frames[1].Height = 544;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.102941;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 804;
    Frames[2].Height = 56;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 56;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 56-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C1D5AA49-8C25-49E7-A831-E54F14E457B6");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 48, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 804;
    Frames[3].Height = 488;
    Frames[3].Caption = "Controllo Anticipazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 488;
    PAN_CONTROANTICI = new IDPanel(w, this, 3, "PAN_CONTROANTICI");
    Frames[3].Content = PAN_CONTROANTICI;
    PAN_CONTROANTICI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTROANTICI.VS = MainFrm.VisualStyleList;
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 804-MyGlb.PAN_OFFS_X, 488-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8767DE98-0887-4421-84E8-1AFAAA99D8CB");
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 756, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTROANTICI.InitStatus = 2;
    PAN_CONTROANTICI_Init();
    PAN_CONTROANTICI_InitFields();
    PAN_CONTROANTICI_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_CONTROANTICI.SetSubFrame(PFL_CONTROANTICI_DETTAGLIQUI1,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Dettagli Liquidazioni";
    Frames[4].Parent = this;
    PAN_DETTAGLIQUID = new IDPanel(w, this, 4, "PAN_DETTAGLIQUID");
    Frames[4].Content = PAN_DETTAGLIQUID;
    PAN_DETTAGLIQUID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DETTAGLIQUID.VS = MainFrm.VisualStyleList;
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "68EEAEE2-D6BA-4888-8F7A-64D53FF9F84D");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 4, 724, 116, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DETTAGLIQUID.InitStatus = 2;
    PAN_DETTAGLIQUID_Init();
    PAN_DETTAGLIQUID_InitFields();
    PAN_DETTAGLIQUID_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI144, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROANTICI_PARAMETRI145();
      }
      PAN_CONTROANTICI.UpdatePanel(MainFrm);
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_DETTAGLIQUID.UpdatePanel(MainFrm);
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
    return (obj instanceof ControlloAnticipazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloAnticipazioni.class.getName() : (Glb.ClassWithPackage(ControlloAnticipazioni.class) ? ControlloAnticipazioni.class.getName().substring(ControlloAnticipazioni.class.getPackage().getName().length() + 1) : ControlloAnticipazioni.class.getName()));
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      PAN_DETTAGLIQUID.SetRowSelector((new IDVariant(0)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloAnticipazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Controllo Anticipazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTROANTICI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CONTROANTICI);
      // 
      // Controllo Anticipazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_CONTROANTICI.set_ToolTip(Glb.OBJ_FIELD,PFL_CONTROANTICI_FINANZIAMENT,(new IDVariant(PAN_CONTROANTICI.FieldText(PFL_CONTROANTICI_FINANZIAMENT))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloAnticipazioni", "ControlloAnticipazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DETTAGLIQUID)), true))
      {
        if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI145, IMDBDef14.PQSL_PARAMETRI145_PARADETTLIQU, 0).equals((new IDVariant("SI")), true))
        {
          PAN_CONTROANTICI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_CONTROANTICI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloAnticipazioni", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARAMETRI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARAMETRI145, IMDBDef14.PQSL_PARAMETRI145_PARADETTLIQU, 0).equals((new IDVariant("SI")), true))
      {
        PAN_CONTROANTICI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CONTROANTICI.SetFlags (Glb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloAnticipazioni", "ParametriAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Dettagli Liquidazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DETTAGLIQUID_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_DETTAGLIQUID);
      // 
      // Dettagli Liquidazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_DETTAGLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLIQUID_BENEFICIARIO,(new IDVariant(PAN_DETTAGLIQUID.FieldText(PFL_DETTAGLIQUID_BENEFICIARIO))).stringValue()); 
      PAN_DETTAGLIQUID.set_ToolTip(Glb.OBJ_FIELD,PFL_DETTAGLIQUID_DESCRIZIONE,(new IDVariant(PAN_DETTAGLIQUID.FieldText(PFL_DETTAGLIQUID_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloAnticipazioni", "DettagliLiquidazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void CONTROANTICI_PARAMETRI145() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMETRI145_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI144, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI144, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMETRI145_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMETRI145_RS, 0, IMDBDef5.TBL_PARAMETRI144, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMETRI145_RS, 0, 0, IMDBDef5.TBL_PARAMETRI144, IMDBDef5.FLD_PARAMETRI144_PARADETTLIQU, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI144, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI144, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI144, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMETRI145_RS, 0);
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
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
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
  private void PAN_CONTROANTICI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTROANTICI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTROANTICI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTROANTICI, Cancel);
    // Stub
  }

  private void PAN_CONTROANTICI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTROANTICI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTROANTICI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTROANTICI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DETTAGLIQUID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DETTAGLIQUID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DETTAGLIQUID_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DETTAGLIQUID, Cancel);
    // Stub
  }

  private void PAN_DETTAGLIQUID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DETTAGLIQUID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DETTAGLIQUID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DETTAGLIQUID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTROANTICI_Init()
  {

    PAN_CONTROANTICI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTROANTICI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTROANTICI.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, "00708EDD-A214-4A05-A6BE-2E4BC08D5473");
    PAN_CONTROANTICI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, "Codice");
    PAN_CONTROANTICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, "");
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, "C01A8E4D-38B9-48CD-AECF-466959A20C6A");
    PAN_CONTROANTICI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, "Finanziamento");
    PAN_CONTROANTICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, "");
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, "B1609CD8-FDDC-4CDD-80D6-2E6F6F32F0DE");
    PAN_CONTROANTICI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, "Mandati");
    PAN_CONTROANTICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, "");
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, "16C5171A-EC74-452E-BCCD-2D127436AA97");
    PAN_CONTROANTICI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, "Ordinativi");
    PAN_CONTROANTICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, "");
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, "C5D248DB-421B-4EFE-8DF1-FC01A6BAA2EF");
    PAN_CONTROANTICI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, "Saldo Iniz.");
    PAN_CONTROANTICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, "");
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, "31258A73-C092-4EF8-A95C-856668185C22");
    PAN_CONTROANTICI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, "Anticipazione");
    PAN_CONTROANTICI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, "");
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROANTICI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, "40E90638-78FA-4B5D-B002-5C90C2525FFD");
    PAN_CONTROANTICI.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, "");
    PAN_CONTROANTICI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, MyGlb.VIS_VUOTONORMALE);
    PAN_CONTROANTICI.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CONTROANTICI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_LIST, 92);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_FORM, 212, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_FORM, 104);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CONTROANTICI.SetFieldPage(PFL_CONTROANTICI_CODICE, -1, -1);
    PAN_CONTROANTICI.SetFieldPanel(PFL_CONTROANTICI_CODICE, PPQRY_VISTOTCASFIN, "A.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_LIST, 48, 36, 284, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_LIST, 76);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 292, 584, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_FORM, 76);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanz.");
    PAN_CONTROANTICI.SetFieldPage(PFL_CONTROANTICI_FINANZIAMENT, -1, -1);
    PAN_CONTROANTICI.SetFieldPanel(PFL_CONTROANTICI_FINANZIAMENT, PPQRY_VISTOTCASFIN, "B.DESCRIZIONE", "DESCRIZIONE", 5, 200, 0, -13997);
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_LIST, 332, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_LIST, 48);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_LIST, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_LIST, "Mandati");
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_FORM, 4, 352, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_FORM, 48);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_FORM, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_MANDATI, MyGlb.PANEL_FORM, "Mand.");
    PAN_CONTROANTICI.SetFieldPage(PFL_CONTROANTICI_MANDATI, -1, -1);
    PAN_CONTROANTICI.SetFieldUnbound(PFL_CONTROANTICI_MANDATI, true);
    PAN_CONTROANTICI.SetFieldPanel(PFL_CONTROANTICI_MANDATI, PPQRY_VISTOTCASFIN, "NVL(A.MANDATI_RES_ESE, 0) + NVL(A.MANDATI_COMP_ESE, 0) + NVL(A.MANDATI_PREC, 0)", "VISTOTCAFIMA", 2, 19, 0, -13997);
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_LIST, 440, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_LIST, 56);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_LIST, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_LIST, "Ordinativi");
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_FORM, 4, 376, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_FORM, 56);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_FORM, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ORDINATIVI, MyGlb.PANEL_FORM, "Ordin.");
    PAN_CONTROANTICI.SetFieldPage(PFL_CONTROANTICI_ORDINATIVI, -1, -1);
    PAN_CONTROANTICI.SetFieldUnbound(PFL_CONTROANTICI_ORDINATIVI, true);
    PAN_CONTROANTICI.SetFieldPanel(PFL_CONTROANTICI_ORDINATIVI, PPQRY_VISTOTCASFIN, "NVL(A.ORDINATIVI_RES_ESE, 0) + NVL(A.ORDINATIVI_COMP_ESE, 0) + NVL(A.ORDINATIVI_PREC, 0) + NVL(A.VARIAZIONI_CASSA_TOT, 0) + NVL(A.SALDO_INI_CASSA, 0)", "VISTOTCAFIOR", 2, 19, 0, -13997);
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_LIST, 548, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_LIST, 96);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_LIST, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_LIST, "Saldo Iniz.");
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_FORM, 4, 328, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_FORM, 96);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_FORM, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_SALDOINIZ, MyGlb.PANEL_FORM, "Saldo Iniz.");
    PAN_CONTROANTICI.SetFieldPage(PFL_CONTROANTICI_SALDOINIZ, -1, -1);
    PAN_CONTROANTICI.SetFieldPanel(PFL_CONTROANTICI_SALDOINIZ, PPQRY_VISTOTCASFIN, "A.SALDO_INI_CASSA", "SALDO_INI_CASSA", 2, 15, 0, -13997);
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_LIST, 648, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_LIST, 72);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_LIST, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_LIST, "Anticipazione");
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_FORM, 4, 400, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_FORM, 72);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_FORM, 1);
    PAN_CONTROANTICI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_ANTICIPAZION, MyGlb.PANEL_FORM, "Anticip.");
    PAN_CONTROANTICI.SetFieldPage(PFL_CONTROANTICI_ANTICIPAZION, -1, -1);
    PAN_CONTROANTICI.SetFieldUnbound(PFL_CONTROANTICI_ANTICIPAZION, true);
    PAN_CONTROANTICI.SetFieldPanel(PFL_CONTROANTICI_ANTICIPAZION, PPQRY_VISTOTCASFIN, "(NVL(A.MANDATI_RES_ESE, 0) + NVL(A.MANDATI_COMP_ESE, 0) + NVL(A.MANDATI_PREC, 0)) - (NVL(A.ORDINATIVI_RES_ESE, 0) + NVL(A.ORDINATIVI_COMP_ESE, 0) + NVL(A.ORDINATIVI_PREC, 0) + NVL(A.VARIAZIONI_CASSA_TOT, 0) + NVL(A.SALDO_INI_CASSA, 0)) - NVL(B.SALDO_INI_CASSA, 0)", "VISTOTCAFIAN", 2, 19, 0, -13997);
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, MyGlb.PANEL_LIST, 4, 252, 760, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, MyGlb.PANEL_LIST, 0);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, MyGlb.PANEL_LIST, 12);
    PAN_CONTROANTICI.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, MyGlb.PANEL_FORM, 4, 252, 720, 116, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROANTICI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, MyGlb.PANEL_FORM, 0);
    PAN_CONTROANTICI.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROANTICI_DETTAGLIQUI1, MyGlb.PANEL_FORM, 8);
    PAN_CONTROANTICI.SetFieldPage(PFL_CONTROANTICI_DETTAGLIQUI1, -1, -1);
    PAN_CONTROANTICI.SetFieldPanel(PFL_CONTROANTICI_DETTAGLIQUI1, -1, "", "DETTAGLIQUI1", 0, 0, 0, -13997);
  }

  private void PAN_CONTROANTICI_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTROANTICI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTROANTICI.SetIMDB(IMDB, "PQRY_VISTOTCASFIN", true);
    PAN_CONTROANTICI.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA TOT CASSA FIN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  B.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  NVL(A.MANDATI_RES_ESE, 0) + NVL(A.MANDATI_COMP_ESE, 0) + NVL(A.MANDATI_PREC, 0) as VISTOTCAFIMA, ");
    SQL.append("  NVL(A.ORDINATIVI_RES_ESE, 0) + NVL(A.ORDINATIVI_COMP_ESE, 0) + NVL(A.ORDINATIVI_PREC, 0) + NVL(A.VARIAZIONI_CASSA_TOT, 0) + NVL(A.SALDO_INI_CASSA, 0) as VISTOTCAFIOR, ");
    SQL.append("  A.SALDO_INI_CASSA as SALDO_INI_CASSA, ");
    SQL.append("  (NVL(A.MANDATI_RES_ESE, 0) + NVL(A.MANDATI_COMP_ESE, 0) + NVL(A.MANDATI_PREC, 0)) - (NVL(A.ORDINATIVI_RES_ESE, 0) + NVL(A.ORDINATIVI_COMP_ESE, 0) + NVL(A.ORDINATIVI_PREC, 0) + NVL(A.VARIAZIONI_CASSA_TOT, 0) + NVL(A.SALDO_INI_CASSA, 0)) - NVL(B.SALDO_INI_CASSA, 0) as VISTOTCAFIAN ");
    PAN_CONTROANTICI.SetQuery(PPQRY_VISTOTCASFIN, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_TOT_CASSA_FIN A, ");
    SQL.append("  FINANZIAMENTI B ");
    PAN_CONTROANTICI.SetQuery(PPQRY_VISTOTCASFIN, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FINANZIAMENTO = B.CODICE) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CODICE IN ");
    SQL.append("( ");
    SQL.append("select distinct ");
    SQL.append("  C.FINANZIAMENTO ");
    SQL.append("from ");
    SQL.append("  LIQ C ");
    SQL.append("where (C.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((C.NUMERO_MAND IS NULL)) ");
    SQL.append("and   (NOT ((C.FINANZIAMENTO IS NULL))) ");
    SQL.append("and   (NVL(C.UFFICIO, -1) = NVL(C.UFFICIO, NVL(C.UFFICIO, -1))) ");
    SQL.append(")) ");
    SQL.append("and   ((NVL(A.MANDATI_RES_ESE, 0) + NVL(A.MANDATI_COMP_ESE, 0) + NVL(A.MANDATI_PREC, 0)) > (NVL(A.ORDINATIVI_RES_ESE, 0) + NVL(A.ORDINATIVI_COMP_ESE, 0) + NVL(A.ORDINATIVI_PREC, 0) + NVL(A.VARIAZIONI_CASSA_TOT, 0) + NVL(A.SALDO_INI_CASSA, 0))) ");
    PAN_CONTROANTICI.SetQuery(PPQRY_VISTOTCASFIN, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTROANTICI.SetQuery(PPQRY_VISTOTCASFIN, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CONTROANTICI.SetQuery(PPQRY_VISTOTCASFIN, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FINANZIAMENTO ");
    PAN_CONTROANTICI.SetQuery(PPQRY_VISTOTCASFIN, 5, SQL, -1, "");
    PAN_CONTROANTICI.SetQueryDB(PPQRY_VISTOTCASFIN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CONTROANTICI.SetMasterTable(0, "VISTA_TOT_CASSA_FIN");
    PAN_CONTROANTICI.AddToSortList(PFL_CONTROANTICI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTROANTICI.Status() == 2)
    {
      int oldListQBE = PAN_CONTROANTICI.iUseListQBE;
      PAN_CONTROANTICI.iUseListQBE = 0;
      PAN_CONTROANTICI.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTROANTICI.PanelCommand(Glb.PCM_FIND);
      PAN_CONTROANTICI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, "C7188A56-E76B-4B16-BAC4-1A87D7F748CD");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, "Dettagli Liquidazioni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_LIST, 64, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_LIST, "Dett. Liquid.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_FORM, 8, 8, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_FORM, 124);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DETTAGLIQUID, MyGlb.PANEL_FORM, "Dettagli Liquidazioni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DETTAGLIQUID, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DETTAGLIQUID, PPQRY_PARAMETRI145, "A.PARADETTLIQU", "PARADETTLIQU", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DETTAGLIQUID, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DETTAGLIQUID, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI145", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI145, IMDBDef14.PQRY_PARAMETRI145_RS, IMDBDef5.TBL_PARAMETRI144);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DETTAGLIQUID, IMDBDef5.FLD_PARAMETRI144_PARADETTLIQU);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI144");
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

  private void PAN_DETTAGLIQUID_Init()
  {

    PAN_DETTAGLIQUID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DETTAGLIQUID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DETTAGLIQUID.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, "686C9D47-4360-4526-B806-39BF680651B6");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, "Numero Liq");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, "7F06BEAA-84A0-4C85-8394-5C7F7E98D3F8");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, "Data liq");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, "8E1E5812-24CA-4A29-9436-626003EC7E80");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, "Importo");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, "B7DC83F1-E518-4E94-B08A-D94A9AC67155");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, "Voce Peg");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, "6E4D500A-D73C-4E21-AA8A-7ACF686BEA3E");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, "Impegno");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, "4090B646-EEC4-463B-84E3-3234EDD074CF");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, "Sub Impegno");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, "937ECBBC-C486-4665-A511-2D551C03EEE6");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, "Beneficiario");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, "CB699885-32A2-46C3-A62C-F64061E5BC2D");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, "Descrizione");
    PAN_DETTAGLIQUID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, "");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DETTAGLIQUID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, "43541C10-8BEE-46F1-85CA-6D1FBF5D96E0");
    PAN_DETTAGLIQUID.set_Header(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, "Liquidazione");
    PAN_DETTAGLIQUID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DETTAGLIQUID.SetFlags(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DETTAGLIQUID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 4, 40, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. Liq");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_NUMEROLIQ, MyGlb.PANEL_FORM, "Num. Liq");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_NUMEROLIQ, -1, -1);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_NUMEROLIQ, PPQRY_LIQ16, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_LIST, 44, 40, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_LIST, 68);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_LIST, "Data liq");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_FORM, 68);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DATALIQ, MyGlb.PANEL_FORM, "Data liq");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_DATALIQ, -1, -1);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_DATALIQ, PPQRY_LIQ16, "A.D_DATA_REG", "D_DATA_REG", 6, 10, 0, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_LIST, 128, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_FORM, 140, 28, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_IMPORTO, -1, -1);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_IMPORTO, PPQRY_LIQ16, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_LIST, 244, 40, 108, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_LIST, "Voce Peg");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_FORM, 4, 172, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_VOCEPEG, MyGlb.PANEL_FORM, "Voce Peg");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_VOCEPEG, -1, -1);
    PAN_DETTAGLIQUID.SetFieldUnbound(PFL_DETTAGLIQUID_VOCEPEG, true);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_VOCEPEG, PPQRY_LIQ16, "TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO )", "LIQVOCEPEG", 5, 201, 0, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_LIST, 352, 40, 80, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_LIST, 52);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_FORM, 4, 220, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_FORM, 52);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_IMPEGNO, MyGlb.PANEL_FORM, "Imp.");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_IMPEGNO, -1, -1);
    PAN_DETTAGLIQUID.SetFieldUnbound(PFL_DETTAGLIQUID_IMPEGNO, true);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_IMPEGNO, PPQRY_LIQ16, "DECODE(A.NUMERO_IMP, to_number(NULL), NULL, TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP ))", "LIQIMPEGNO", 5, 99, 0, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_LIST, 432, 40, 80, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_LIST, 72);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_LIST, "Sub Impegno");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_FORM, 4, 268, 504, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_FORM, 72);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_SUBIMPEGNO, MyGlb.PANEL_FORM, "Sub Impegno");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_SUBIMPEGNO, -1, -1);
    PAN_DETTAGLIQUID.SetFieldUnbound(PFL_DETTAGLIQUID_SUBIMPEGNO, true);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_SUBIMPEGNO, PPQRY_LIQ16, "DECODE(A.NUMERO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP ))", "LIQSUBIMPEGN", 5, 99, 0, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_LIST, 512, 40, 108, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_LIST, 132);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 148, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_FORM, 100);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_BENEFICIARIO, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_BENEFICIARIO, -1, -1);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_BENEFICIARIO, PPQRY_LIQ16, "B.RAGIONE_SOCIALE_ESTESA", "LIBERASOESES", 5, 60, 0, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_LIST, 620, 40, 108, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_LIST, 108);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_FORM, 124, 76, 184, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLIQUID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_DESCRIZIONE, -1, -1);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_DESCRIZIONE, PPQRY_LIQ16, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, MyGlb.PANEL_LIST, 4, 4, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, MyGlb.PANEL_LIST, 0);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, MyGlb.PANEL_LIST, 2);
    PAN_DETTAGLIQUID.SetRect(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, MyGlb.PANEL_FORM, 0, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DETTAGLIQUID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, MyGlb.PANEL_FORM, 0);
    PAN_DETTAGLIQUID.SetNumRow(MyGlb.OBJ_FIELD, PFL_DETTAGLIQUID_LIQUIDALABEL, MyGlb.PANEL_FORM, 2);
    PAN_DETTAGLIQUID.SetFieldPage(PFL_DETTAGLIQUID_LIQUIDALABEL, -1, -1);
    PAN_DETTAGLIQUID.SetFieldPanel(PFL_DETTAGLIQUID_LIQUIDALABEL, -1, "", "LIQUIDALABEL", 0, 0, 0, -13997);
  }

  private void PAN_DETTAGLIQUID_InitQueries()
  {
    StringBuffer SQL;

    PAN_DETTAGLIQUID.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DETTAGLIQUID.SetIMDB(IMDB, "PQRY_LIQ16", true);
    PAN_DETTAGLIQUID.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  A.D_DATA_REG as D_DATA_REG, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  TO_CHAR ( A.CAPITOLO ) || ' / ' || TO_CHAR ( A.ARTICOLO ) as LIQVOCEPEG, ");
    SQL.append("  DECODE(A.NUMERO_IMP, to_number(NULL), NULL, TO_CHAR ( A.NUMERO_IMP ) || ' / ' || TO_CHAR ( A.ANNO_IMP )) as LIQIMPEGNO, ");
    SQL.append("  DECODE(A.NUMERO_SUBIMP, to_number(NULL), NULL, TO_CHAR ( A.NUMERO_SUBIMP ) || ' / ' || TO_CHAR ( A.ANNO_SUBIMP )) as LIQSUBIMPEGN, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as LIBERASOESES, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_DETTAGLIQUID.SetQuery(PPQRY_LIQ16, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ A, ");
    SQL.append("  BEN B ");
    PAN_DETTAGLIQUID.SetQuery(PPQRY_LIQ16, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.BENEFICIARIO = B.CODICE(+)) ");
    SQL.append("and   (A.FINANZIAMENTO = ~~PQRY_VISTOTCASFIN.FINANZIAMENTO~~) ");
    SQL.append("and   (A.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (NVL(A.UFFICIO, -1) = NVL(~~TBL_PARAMETRI144.PARAMUFFICIO~~, NVL(A.UFFICIO, -1))) ");
    SQL.append("and   ((A.NUMERO_MAND IS NULL)) ");
    PAN_DETTAGLIQUID.SetQuery(PPQRY_LIQ16, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIQUID.SetQuery(PPQRY_LIQ16, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIQUID.SetQuery(PPQRY_LIQ16, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DETTAGLIQUID.SetQuery(PPQRY_LIQ16, 5, SQL, -1, "");
    PAN_DETTAGLIQUID.SetQueryDB(PPQRY_LIQ16, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DETTAGLIQUID.SetMasterTable(0, "LIQ");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DETTAGLIQUID.Status() == 2)
    {
      int oldListQBE = PAN_DETTAGLIQUID.iUseListQBE;
      PAN_DETTAGLIQUID.iUseListQBE = 0;
      PAN_DETTAGLIQUID.PanelCommand(Glb.PCM_SEARCH);
      PAN_DETTAGLIQUID.PanelCommand(Glb.PCM_FIND);
      PAN_DETTAGLIQUID.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTROANTICI) PAN_CONTROANTICI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DETTAGLIQUID) PAN_DETTAGLIQUID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTROANTICI) PAN_CONTROANTICI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_DETTAGLIQUID) PAN_DETTAGLIQUID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTROANTICI) PAN_CONTROANTICI_DynamicProperties();
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_DETTAGLIQUID) PAN_DETTAGLIQUID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTROANTICI) PAN_CONTROANTICI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DETTAGLIQUID) PAN_DETTAGLIQUID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CONTROANTICI) PAN_CONTROANTICI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DETTAGLIQUID) PAN_DETTAGLIQUID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
