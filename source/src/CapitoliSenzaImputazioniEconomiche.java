// **********************************************
// Capitoli Senza Imputazioni Economiche
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CapitoliSenzaImputazioniEconomiche extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_ES = 0;
  private static int PFL_PARAM_CAPSENZAFATT = 1;
  private static int PFL_PARAM_CAPSENZACENT = 2;

  private static int PPQRY_PARAM165 = 0;


  IDPanel PAN_PARAM;
  private static int GRP_CAPSENIMPECO_PIACONECOPAT = 0;

  private static int PFL_CAPSENIMPECO_CAPITOLO = 0;
  private static int PFL_CAPSENIMPECO_ARTICOLO = 1;
  private static int PFL_CAPSENIMPECO_DESCRICAPITO = 2;
  private static int PFL_CAPSENIMPECO_CODICESTRUTT = 3;
  private static int PFL_CAPSENIMPECO_CODIVLIVELLO = 4;
  private static int PFL_CAPSENIMPECO_CODVLIVELLO = 5;
  private static int PFL_CAPSENIMPECO_CODICEGESTIO = 6;
  private static int PFL_CAPSENIMPECO_DESCRIZIONE = 7;
  private static int PFL_CAPSENIMPECO_ETICHCODGEST = 8;
  private static int PFL_CAPSENIMPECO_FATTORE = 9;
  private static int PFL_CAPSENIMPECO_DESCRIZIONE1 = 10;
  private static int PFL_CAPSENIMPECO_ETICHEFATTOR = 11;
  private static int PFL_CAPSENIMPECO_TIPOPDC = 12;
  private static int PFL_CAPSENIMPECO_CODICEPDC = 13;
  private static int PFL_CAPSENIMPECO_DESCRIZIOPDC = 14;
  private static int PFL_CAPSENIMPECO_CENTRO = 15;
  private static int PFL_CAPSENIMPECO_DESCRIZIONE2 = 16;
  private static int PFL_CAPSENIMPECO_ETICHECENTRO = 17;

  private static int PPQRY_CAP27 = 0;


  IDPanel PAN_CAPSENIMPECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM166(IMDB);
    //
    //
    Init_QRY_CFASELINTV83(IMDB);
    Init_PQRY_PARAM165(IMDB);
    Init_PQRY_PARAM165_RS(IMDB);
    Init_PQRY_CAP27(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM166(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM166, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM166, "TBL_PARAM166");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM166,IMDBDef3.FLD_PARAM166_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM166,IMDBDef3.FLD_PARAM166_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM166,IMDBDef3.FLD_PARAM166_NOMOGGCASEFA, "NOMOGGCASEFA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM166,IMDBDef3.FLD_PARAM166_NOMOGGCASEFA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM166,IMDBDef3.FLD_PARAM166_NOMOGGCASECE, "NOMOGGCASECE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM166,IMDBDef3.FLD_PARAM166_NOMOGGCASECE,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM166, 0);
  }

  private static void Init_QRY_CFASELINTV83(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.QRY_CFASELINTV83, 1);
    IMDB.set_TblCode(IMDBDef11.QRY_CFASELINTV83, "QRY_CFASELINTV83");
    IMDB.set_FldCode(IMDBDef11.QRY_CFASELINTV83,IMDBDef11.QSL_CFASELINTV83_COUNT, "COUNT");
    IMDB.SetFldParams(IMDBDef11.QRY_CFASELINTV83,IMDBDef11.QSL_CFASELINTV83_COUNT,1,19,0);
  }

  private static void Init_PQRY_PARAM165(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM165, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM165, "PQRY_PARAM165");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM165,IMDBDef11.PQSL_PARAM165_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM165,IMDBDef11.PQSL_PARAM165_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM165,IMDBDef11.PQSL_PARAM165_NOMOGGCASEFA, "NOMOGGCASEFA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM165,IMDBDef11.PQSL_PARAM165_NOMOGGCASEFA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM165,IMDBDef11.PQSL_PARAM165_NOMOGGCASECE, "NOMOGGCASECE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM165,IMDBDef11.PQSL_PARAM165_NOMOGGCASECE,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAM165, 0);
  }

  private static void Init_PQRY_PARAM165_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM165_RS, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM165_RS, "PQRY_PARAM165_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM165_RS,IMDBDef11.PQSL_PARAM165_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM165_RS,IMDBDef11.PQSL_PARAM165_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM165_RS,IMDBDef11.PQSL_PARAM165_NOMOGGCASEFA, "NOMOGGCASEFA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM165_RS,IMDBDef11.PQSL_PARAM165_NOMOGGCASEFA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM165_RS,IMDBDef11.PQSL_PARAM165_NOMOGGCASECE, "NOMOGGCASECE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM165_RS,IMDBDef11.PQSL_PARAM165_NOMOGGCASECE,5,2,0);
  }

  private static void Init_PQRY_CAP27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_CAP27, 15);
    IMDB.set_TblCode(IMDBDef11.PQRY_CAP27, "PQRY_CAP27");
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDCAPITO, "RECORDCAPITO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDCAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDARTICO, "RECORDARTICO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECODESCCAPI, "RECODESCCAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECODESCCAPI,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDCODICE, "RECORDCODICE");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDCODICE,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_CODIVLIVELLO, "CODIVLIVELLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_CODIVLIVELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_CODVLIVELLO, "CODVLIVELLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_CODVLIVELLO,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECOCODIGEST, "RECOCODIGEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECOCODIGEST,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECDESCODGES, "RECDESCODGES");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECDESCODGES,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDFATTOR, "RECORDFATTOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDFATTOR,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECODESCFATT, "RECODESCFATT");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECODESCFATT,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDCENTRO, "RECORDCENTRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECORDCENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECODESCCENT, "RECODESCCENT");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_RECODESCCENT,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_TIPOPDC, "TIPOPDC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_TIPOPDC,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_CODICEPDC, "CODICEPDC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_CODICEPDC,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_DESCRIZIOPDC, "DESCRIZIOPDC");
    IMDB.SetFldParams(IMDBDef11.PQRY_CAP27,IMDBDef11.PQSL_CAP27_DESCRIZIOPDC,5,99,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_CAP27, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CapitoliSenzaImputazioniEconomiche(MyWebEntryPoint w, IMDBObj imdb)
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
  public CapitoliSenzaImputazioniEconomiche()
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
    FormIdx = MyGlb.FRM_CAPSENIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "197B2852-F995-4AAC-9203-CE5F5993F661";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1032;
    DesignHeight = 514;
    set_Caption(new IDVariant("Capitoli senza Imputazioni Economiche"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1032;
    Frames[1].Height = 488;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.221311;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1032;
    Frames[2].Height = 108;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 108;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1032-MyGlb.PAN_OFFS_X, 108-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "40DF36EA-77E9-492C-8AC6-FC6B23748E16");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 144, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1032;
    Frames[3].Height = 380;
    Frames[3].Caption = "Capitoli senza Imputazioni Economiche";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 380;
    PAN_CAPSENIMPECO = new IDPanel(w, this, 3, "PAN_CAPSENIMPECO");
    Frames[3].Content = PAN_CAPSENIMPECO;
    PAN_CAPSENIMPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPSENIMPECO.VS = MainFrm.VisualStyleList;
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1032-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1C83276C-18A4-406A-AACE-70ECE2B199F5");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2164, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPSENIMPECO.InitStatus = 2;
    PAN_CAPSENIMPECO_Init();
    PAN_CAPSENIMPECO_InitFields();
    PAN_CAPSENIMPECO_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG20+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FA9+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG20+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRASSCEAICA+BaseCmdLinIdx)
      {
        ApriAssociaCentroAiCapitoli();
        break fine;
      }
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM166, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CAPSENIMPECO_PARAM165();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_CAPSENIMPECO.UpdatePanel(MainFrm);
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
    return (obj instanceof CapitoliSenzaImputazioniEconomiche);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CapitoliSenzaImputazioniEconomiche.class.getName() : (Glb.ClassWithPackage(CapitoliSenzaImputazioniEconomiche.class) ? CapitoliSenzaImputazioniEconomiche.class.getName().substring(CapitoliSenzaImputazioniEconomiche.class.getPackage().getName().length() + 1) : CapitoliSenzaImputazioniEconomiche.class.getName()));
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
      IMDB.set_Value(IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMOGGCASEFA, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMOGGCASECE, 0, (new IDVariant("SI")));
      // IMDB.set_Value(IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMEOGGETTES, 0, (new IDVariant("E")));
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_CS6+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_CAPSENIMPECO.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
        PAN_CAPSENIMPECO.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      }
      CloseOnSelection = (new IDVariant(0)).booleanValue();
      PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliSenzaImputazioniEconomiche", "Load", _e);
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
      UNLOAD_PARAMDELETE();
      UNLOAD_ANOMASSODELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliSenzaImputazioniEconomiche", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMOGGCASEFA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMOGGCASECE, 0, new IDVariant());
  }

  // **********************************************************************
  // Anomalie Assoc: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_ANOMASSODELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_ANOMALIASSOC);
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ASSOCENAICAP)), true) && Result.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef3.TBL_PARS63, IMDBDef3.FLD_PARS63_NOMEOGGERISP, 0),(new IDVariant("NO"))).equals((new IDVariant("SI")), true))
        {
          ENDMODAL_ANOMASSODELE();
          if (PAN_CAPSENIMPECO.ShowMultipleSel())
          {
            IDVariant I = null;
            I = (new IDVariant(1));
            C5 = PAN_CAPSENIMPECO.MasterRS();
            if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
            if (!C5.Bof()) PAN_CAPSENIMPECO.GotoFirst();
            while (!PAN_CAPSENIMPECO.RSEOF())
            {
              if (PAN_CAPSENIMPECO.IsRowSelected(I.intValue()))
              {
                UPDATECentroSuCapitolo(C5.Get("RECORDCAPITO"), C5.Get("RECORDARTICO"), IMDB.Value(IMDBDef11.PQRY_PARS62, IMDBDef11.PQSL_PARS62_NOMOGGANESSU, 0), C5.Get("RECORDFATTOR"), IMDB.Value(IMDBDef11.PQRY_PARS62, IMDBDef11.PQSL_PARS62_NOMEOGGECENT, 0), IMDB.Value(IMDBDef11.PQRY_PARAM165, IMDBDef11.PQSL_PARAM165_NOMEOGGETTES, 0));
              }
              I = IDL.Add(I, (new IDVariant(1)));
              PAN_CAPSENIMPECO.GotoNext();
            }
            if (CurPos>0) C5.absolute(CurPos);
          }
          else
          {
            UPDATECentroSuCapitolo(IMDB.Value(IMDBDef11.PQRY_CAP27, IMDBDef11.PQSL_CAP27_RECORDCAPITO, 0), IMDB.Value(IMDBDef11.PQRY_CAP27, IMDBDef11.PQSL_CAP27_RECORDARTICO, 0), IMDB.Value(IMDBDef11.PQRY_PARS62, IMDBDef11.PQSL_PARS62_NOMOGGANESSU, 0), IMDB.Value(IMDBDef11.PQRY_CAP27, IMDBDef11.PQSL_CAP27_RECORDFATTOR, 0), IMDB.Value(IMDBDef11.PQRY_PARS62, IMDBDef11.PQSL_PARS62_NOMEOGGECENT, 0), IMDB.Value(IMDBDef11.PQRY_PARAM165, IMDBDef11.PQSL_PARAM165_NOMEOGGETTES, 0));
          }
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          ENDMODAL_CFASELINTV83();
          if (!IMDB.Eof(IMDBDef11.QRY_CFASELINTV83, 0))
          {
            v_VCOUNT = IMDB.Value(IMDBDef11.QRY_CFASELINTV83, IMDBDef11.QSL_CFASELINTV83_COUNT, 0, IDVariant.INTEGER) ;
          }
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          }
          else
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Elaborazione eseguita con presenza di Anomalie"));
            MainFrm.set_AlertMessage(S); 
            MainFrm.Show(MyGlb.FRM_ANOASSCENACA, (new IDVariant(-1)).intValue(), this); 
          }
          PAN_CAPSENIMPECO.PanelCommand(Glb.PCM_REQUERY);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliSenzaImputazioniEconomiche", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Anomalie Assoc: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void ENDMODAL_ANOMASSODELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef3.TBL_ANOMALIASSOC);
  }

  // **********************************************************************
  // Cfaid: Select into variables
  // Quali dati devi selezionare con questa query?
  // **********************************************************************
  private void ENDMODAL_CFASELINTV83() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.QRY_CFASELINTV83);
    IMDB.TblTruncate(IMDBDef1.TMP_RECORDSET);
    IMDB.TblMoveFirst(IMDBDef3.TBL_ANOMALIASSOC, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_ANOMALIASSOC, 0))
    {
      IMDB.TblAddNew(IMDBDef1.TMP_RECORDSET, 0);
      IMDB.set_Value(IMDBDef1.TMP_RECORDSET, 0, 0, new IDVariant(1));
      IMDB.TblMoveNext(IMDBDef3.TBL_ANOMALIASSOC, 0);
      if (IMDB.Eof(IMDBDef3.TBL_ANOMALIASSOC, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_ANOMALIASSOC, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    AggrBuff = new IDVariant[1];
    for (int i=0; i<AggrBuff.length; i++) AggrBuff[i] = new IDVariant();
    AggrRowCount = new int[1];
    AggrCount = 0;
    IMDB.TblMoveFirst(IMDBDef1.TMP_RECORDSET, 0);
    if (IMDB.TblNumRows(IMDBDef1.TMP_RECORDSET) > 0)
    {
      while (true)
      {
        if (AggrCount == 0 && !IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
        {
          AggrBuff[0] = new IDVariant(1);
          if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0))) AggrRowCount[0] = 1; else AggrRowCount[0] = 0;
          AggrCount = 1;
          IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
        }
        else
        {
          AggrNewGroup = IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0);
          if (AggrNewGroup)
          {
            if (AggrCount > 0)
            {
              IMDB.TblAddNew(IMDBDef11.QRY_CFASELINTV83, 0);
              IMDB.set_Value(IMDBDef11.QRY_CFASELINTV83, 0, 0, new IDVariant(AggrBuff[0]));
            }
            AggrCount = 0;
            if (IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0)) break;
          }
          else
          {
            if (!IMDB.Eof(IMDBDef1.TMP_RECORDSET, 0))
            {
              if (!IDL.IsNull(IMDB.Value(IMDBDef1.TMP_RECORDSET, 0, 0)))
              {
                AggrBuff[0] = IDL.Add(AggrBuff[0], new IDVariant(1));
                AggrRowCount[0]++;
              }
              AggrCount++;
              IMDB.TblMoveNext(IMDBDef1.TMP_RECORDSET, 0);
            }
          }
        }
      }
    }
    IMDB.TblMoveFirst(IMDBDef11.QRY_CFASELINTV83, 0);
  }

  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_CAPSENZAFATT)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAM165, IMDBDef11.PQSL_PARAM165_NOMOGGCASEFA, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM165, IMDBDef11.PQSL_PARAM165_NOMOGGCASECE, 0, (new IDVariant("SI")));
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAM_CAPSENZACENT)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAM165, IMDBDef11.PQSL_PARAM165_NOMOGGCASECE, 0).equals((new IDVariant("SI")), true))
        {
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
          {
            PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_CAPSENIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliSenzaImputazioniEconomiche", "ParamOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Capitoli Senza Imputazioni Economiche On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPSENIMPECO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAPSENIMPECO);
      // 
      // Capitoli Senza Imputazioni Economiche On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CAPSENIMPECO.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPSENIMPECO_DESCRICAPITO,(new IDVariant(PAN_CAPSENIMPECO.FieldText(PFL_CAPSENIMPECO_DESCRICAPITO))).stringValue()); 
      PAN_CAPSENIMPECO.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPSENIMPECO_DESCRIZIONE,(new IDVariant(PAN_CAPSENIMPECO.FieldText(PFL_CAPSENIMPECO_DESCRIZIONE))).stringValue()); 
      PAN_CAPSENIMPECO.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPSENIMPECO_DESCRIZIONE1,(new IDVariant(PAN_CAPSENIMPECO.FieldText(PFL_CAPSENIMPECO_DESCRIZIONE1))).stringValue()); 
      PAN_CAPSENIMPECO.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPSENIMPECO_DESCRIZIONE2,(new IDVariant(PAN_CAPSENIMPECO.FieldText(PFL_CAPSENIMPECO_DESCRIZIONE2))).stringValue()); 
      PAN_CAPSENIMPECO.set_ObjRect(Glb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_CAPSENIMPECO.ObjRect(Glb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
      PAN_CAPSENIMPECO.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPSENIMPECO_DESCRIZIOPDC,(new IDVariant(PAN_CAPSENIMPECO.FieldText(PFL_CAPSENIMPECO_DESCRIZIOPDC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliSenzaImputazioniEconomiche", "CapitoliSenzaImputazioniEconomicheOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Apri Associa Centro Ai Capitoli
  // **********************************************************************
  public int ApriAssociaCentroAiCapitoli ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // Apri Associa Centro Ai Capitoli Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant N = new IDVariant(0,IDVariant.INTEGER);
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Nessun capitolo selezionato"));
      if (PAN_CAPSENIMPECO.ShowMultipleSel())
      {
        C3 = PAN_CAPSENIMPECO.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_CAPSENIMPECO.GotoFirst();
        while (!PAN_CAPSENIMPECO.RSEOF())
        {
          if (PAN_CAPSENIMPECO.IsRowSelected(I.intValue()))
          {
            N = IDL.Add(N, (new IDVariant(1)));
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_CAPSENIMPECO.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        if (N.equals((new IDVariant(0)), true))
        {
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      else
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_CAP27, IMDBDef11.PQSL_CAP27_RECORDCAPITO, 0)))
        {
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      MainFrm.Show(MyGlb.FRM_ASSOCENAICAP, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliSenzaImputazioniEconomiche", "ApriAssociaCentroAiCapitoli", _e);
      return -1;
    }
  }

  // **********************************************************************
  // UPDATE Centro Su Capitolo
  // Capitolo:  - Input
  // Articolo:  - Input
  // Esercizi Succ:  - Input
  // Fattore:  - Input
  // Centro:  - Input
  // ES:  - Input
  // **********************************************************************
  public int UPDATECentroSuCapitolo (IDVariant Capitolo, IDVariant Articolo, IDVariant EserciziSucc, IDVariant Fattore, IDVariant Centro, IDVariant ES)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // UPDATE Centro Su Capitolo Body
      // Corpo Procedura
      // 
      if (EserciziSucc.equals((new IDVariant("SI")), true))
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CAPITOLO as CAPCAPITOLO, ");
        SQL.append("  A.ARTICOLO as CAPARTICOLO, ");
        SQL.append("  A.ESERCIZIO as CAPESERCIZIO ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.ESERCIZIO >= " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("order by ");
        SQL.append("  A.ESERCIZIO, ");
        SQL.append("  A.CAPITOLO, ");
        SQL.append("  A.ARTICOLO ");
        C3 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!C3.EOF()) C3.MoveNext();
        while (!C3.EOF())
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("update CAP set ");
            SQL.append("  CENTRO = " + IDL.CSql(Centro, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(C3.Get("CAPESERCIZIO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (E_S = " + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e5)
          {
            IDVariant v_ANOMALIA = null;
            v_ANOMALIA = IDL.SubStr(new IDVariant(e5.getMessage()), (new IDVariant(12)));
            if (!(IDL.IsNull(Fattore)))
            {
              IDVariant v_VFATTORITIPO = new IDVariant(0,IDVariant.STRING);
              SQL = new StringBuffer();
              SQL.append("select ");
              SQL.append("  A.TIPO as FATTORITIPO ");
              SQL.append("from ");
              SQL.append("  FATTORI A ");
              SQL.append("where (A.FATTORE = " + IDL.CSql(Fattore, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
              QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
              if (!QV.EOF()) QV.MoveNext();
              if (!QV.EOF())
              {
                v_VFATTORITIPO = QV.Get("FATTORITIPO", IDVariant.STRING) ;
              }
              QV.Close();
              UPDACENSUCAP_ANOASSINSIN1(C3.Get("CAPESERCIZIO"), Capitolo, Articolo, Fattore, v_VFATTORITIPO, v_ANOMALIA);
            }
          }
          C3.MoveNext();
        }
        C3.Close();
      }
      else
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("update CAP set ");
          SQL.append("  CENTRO = " + IDL.CSql(Centro, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (E_S = " + IDL.CSql(ES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (CAPITOLO = " + IDL.CSql(Capitolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (ARTICOLO = " + IDL.CSql(Articolo, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e9)
        {
          IDVariant v_ANOMALIA = null;
          v_ANOMALIA = IDL.SubStr(new IDVariant(e9.getMessage()), (new IDVariant(12)));
          if (!(IDL.IsNull(Fattore)))
          {
            IDVariant v_VFATTORITIPO = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.TIPO as FATTORITIPO ");
            SQL.append("from ");
            SQL.append("  FATTORI A ");
            SQL.append("where (A.FATTORE = " + IDL.CSql(Fattore, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VFATTORITIPO = QV.Get("FATTORITIPO", IDVariant.STRING) ;
            }
            QV.Close();
            UPDACENSUCAP_ANOASSINSINT(Capitolo, Articolo, Fattore, v_VFATTORITIPO, v_ANOMALIA);
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliSenzaImputazioniEconomiche", "UPDATECentroSuCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Anomalie Assoc: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void UPDACENSUCAP_ANOASSINSIN1(IDVariant C3_CAPESERCIZIO, IDVariant Capitolo, IDVariant Articolo, IDVariant Fattore, IDVariant v_VFATTORITIPO, IDVariant v_ANOMALIA) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_ANOMALIASSOC, 0);
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEESER, 0, C3_CAPESERCIZIO);
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGECAPI, 0, Capitolo);
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEARTI, 0, Articolo);
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEFATT, 0, ((!(IDL.IsNull(Fattore)))?IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(Fattore, (new IDVariant(":"))), (new IDVariant(" "))), (new IDVariant("Fattore"))), (new IDVariant(" "))), (v_VFATTORITIPO.equals((new IDVariant("E")))? new IDVariant("Economico") : v_VFATTORITIPO.equals((new IDVariant("A")))? new IDVariant("Patrimoniale Attivo") : v_VFATTORITIPO.equals((new IDVariant("P")))? new IDVariant("Patrimoniale Passivo") :  new IDVariant())):(new IDVariant())));
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEANOM, 0, v_ANOMALIA);
  }

  // **********************************************************************
  // Anomalie Assoc: Insert into
  // Perchè stai inserendo queste righe?
  // **********************************************************************
  private void UPDACENSUCAP_ANOASSINSINT(IDVariant Capitolo, IDVariant Articolo, IDVariant Fattore, IDVariant v_VFATTORITIPO, IDVariant v_ANOMALIA) throws SQLException
  {
    IMDB.TblAddNew(IMDBDef3.TBL_ANOMALIASSOC, 0);
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGECAPI, 0, Capitolo);
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEARTI, 0, Articolo);
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEFATT, 0, ((!(IDL.IsNull(Fattore)))?IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(Fattore, (new IDVariant(":"))), (new IDVariant(" "))), (new IDVariant("Fattore"))), (new IDVariant(" "))), (v_VFATTORITIPO.equals((new IDVariant("E")))? new IDVariant("Economico") : v_VFATTORITIPO.equals((new IDVariant("A")))? new IDVariant("Patrimoniale Attivo") : v_VFATTORITIPO.equals((new IDVariant("P")))? new IDVariant("Patrimoniale Passivo") :  new IDVariant())):(new IDVariant())));
    IMDB.set_Value(IMDBDef3.TBL_ANOMALIASSOC, IMDBDef3.FLD_ANOMALIASSOC_NOMEOGGEANOM, 0, v_ANOMALIA);
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CAPSENIMPECO_PARAM165() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAM165_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM166, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM166, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAM165_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAM165_RS, 0, IMDBDef3.TBL_PARAM166, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM165_RS, 0, 0, IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM165_RS, 1, 0, IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMOGGCASEFA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM165_RS, 2, 0, IMDBDef3.TBL_PARAM166, IMDBDef3.FLD_PARAM166_NOMOGGCASECE, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM166, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM166, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM166, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAM165_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CAPSENIMPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPSENIMPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPSENIMPECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPSENIMPECO, Cancel);
    // Stub
  }

  private void PAN_CAPSENIMPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAPSENIMPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CAPSENIMPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPSENIMPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ES, "64E1E307-892C-4A7E-9E88-D368EFA837B8");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ES, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ES, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, "05871CC8-92ED-4290-954C-E18D4571095B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, "Cap. senza Fattore");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, "9396F2B9-C5D1-485B-B461-A9684DC587CD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, "Cap. senza Centro");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_LIST, 24);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_FORM, 16, 12, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_FORM, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ES, MyGlb.PANEL_FORM, "Parte");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ES, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ES, PPQRY_PARAM165, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_LIST, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_LIST, "C. sn. Ftt.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_FORM, 4, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_FORM, 116);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZAFATT, MyGlb.PANEL_FORM, "Cap. senza Fattore");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CAPSENZAFATT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CAPSENZAFATT, PPQRY_PARAM165, "A.NOMOGGCASEFA", "NOMOGGCASEFA", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CAPSENZAFATT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CAPSENZAFATT, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_LIST, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_LIST, "C. sn. Cnt.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_FORM, 4, 60, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_FORM, 116);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPSENZACENT, MyGlb.PANEL_FORM, "Cap. senza Centro");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CAPSENZACENT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CAPSENZACENT, PPQRY_PARAM165, "A.NOMOGGCASECE", "NOMOGGCASECE", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CAPSENZACENT, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CAPSENZACENT, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM165", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM165, IMDBDef11.PQRY_PARAM165_RS, IMDBDef3.TBL_PARAM166);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ES, IMDBDef3.FLD_PARAM166_NOMEOGGETTES);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CAPSENZAFATT, IMDBDef3.FLD_PARAM166_NOMOGGCASEFA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CAPSENZACENT, IMDBDef3.FLD_PARAM166_NOMOGGCASECE);
    PAN_PARAM.SetMasterTable(0, "PARAM166");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CAPSENIMPECO_Init()
  {

    PAN_CAPSENIMPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPSENIMPECO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, "15FECB08-E604-4DB3-A6B1-27ABB8D791DE");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, "Piano Conti Economico Patrimoniale");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, MyGlb.PANEL_LIST, 1372, -9999, 432, 16, 0, 0);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, MyGlb.PANEL_FORM, 0, 387, 616, 97, 0, 0);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, 0, 201);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, 1, 13);
    PAN_CAPSENIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, 0, 4);
    PAN_CAPSENIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, 1, 4);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_CAPSENIMPECO_PIACONECOPAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_CAPSENIMPECO.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, "F586DF44-BE63-4619-B70F-54EC8A806F5C");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, "Capitolo");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, "490B4ADC-2B36-4E33-A06F-4F35E8E0BA7E");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, "Art.");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, "2EB613AC-E506-4CB3-84FE-1A122FE66004");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, "Descrizione Capitolo");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, "F5BB7740-B6D0-4306-B26F-836DC71C13F4");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, "Codice");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, "1A53578A-1EB6-48D2-8037-53FA54084016");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, "Cod IV Livello");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, "1C6DE379-8329-404E-8E17-5567613F04D0");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, "Cod V Livello");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, "FC7EA849-1A71-40AE-B887-637B28451362");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, "Codice Gestionale");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, "8CC9E2C4-7363-4C88-8267-A51109B347D3");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, "Descrizione Cod Gest");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, "C363DA62-4889-4D55-B65F-F73707120726");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, "Cod. Gestionale");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, MyGlb.VIS_LABEVISUSTYL);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, "9E39F0C4-A751-4761-8E80-522EFFDB12CD");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, "Fattore");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, "F51BA6AD-0EEF-4C07-86E6-1A09D4878750");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, "Descrizione Fattore");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, "5E1420ED-1646-421F-A9D9-DBFEA0658B2E");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, "Fattore");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, MyGlb.VIS_LABEVISUSTYL);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, "24C32C67-6CE9-4F1E-8DA8-B9C0E95948C0");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, "Tipo");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, "9C88FFFA-D28F-470B-ADD8-8A315FDE794F");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, "Codice");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, "6FC60C4F-1387-464B-988D-41E417823F77");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, "Descrizione");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, "2B863440-F701-4B7B-8D2A-8EEA31C90465");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, "Centro");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, "41D2FBC4-C432-46A4-A010-8AE56D3C0185");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, "Descrizione Centro");
    PAN_CAPSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, "");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAPSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, "EDB50BF0-067C-47D5-AF8B-B4D70C030C57");
    PAN_CAPSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, "Centro");
    PAN_CAPSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CAPSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_CAPSENIMPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_FORM, 4, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_CAPITOLO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_CAPITOLO, PPQRY_CAP27, "A.CAPITOLO", "RECORDCAPITO", 3, 16, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_LIST, 144, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_ARTICOLO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_ARTICOLO, PPQRY_CAP27, "A.ARTICOLO", "RECORDARTICO", 1, 2, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_LIST, 184, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_LIST, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_LIST, "Descrizione Capitolo");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_FORM, 4, 52, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_FORM, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_FORM, 2);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRICAPITO, MyGlb.PANEL_FORM, "Descrizione Capitolo");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_DESCRICAPITO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_DESCRICAPITO, PPQRY_CAP27, "A.DESCRIZIONE", "RECODESCCAPI", 5, 140, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_LIST, 440, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_LIST, 120);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_LIST, "Codice");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_FORM, 4, 88, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_FORM, 120);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICESTRUTT, MyGlb.PANEL_FORM, "Codice");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_CODICESTRUTT, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_CODICESTRUTT, PPQRY_CAP27, "A.CODICE_STRUTTURA", "RECORDCODICE", 5, 10, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_LIST, 520, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_LIST, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_LIST, "Cod IV Livello");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_FORM, 4, 112, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_FORM, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODIVLIVELLO, MyGlb.PANEL_FORM, "Cod IV Livello");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_CODIVLIVELLO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldUnbound(PFL_CAPSENIMPECO_CODIVLIVELLO, true);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_CODIVLIVELLO, PPQRY_CAP27, "TO_CHAR ( GET_COD_LIVELLO_4(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) )", "CODIVLIVELLO", 5, 99, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_LIST, 616, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_LIST, 76);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_LIST, "Cod V Livello");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_FORM, 4, 136, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_FORM, 76);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODVLIVELLO, MyGlb.PANEL_FORM, "Cod V Livello");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_CODVLIVELLO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldUnbound(PFL_CAPSENIMPECO_CODVLIVELLO, true);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_CODVLIVELLO, PPQRY_CAP27, "TO_CHAR ( GET_COD_LIVELLO_5(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) )", "CODVLIVELLO", 5, 99, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_LIST, 712, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_LIST, 120);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_LIST, "Cod. Gest.");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 160, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_FORM, 120);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEGESTIO, MyGlb.PANEL_FORM, "Codice Gestionale");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_CODICEGESTIO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_CODICEGESTIO, PPQRY_CAP27, "A.CODICE_GESTIONALE", "RECOCODIGEST", 1, 4, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, 756, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione Cod Gest");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 184, 592, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione Cod Gest");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_DESCRIZIONE, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_DESCRIZIONE, PPQRY_CAP27, "E.DESCRIZIONE", "RECDESCODGES", 5, 200, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, MyGlb.PANEL_LIST, 712, 0, 300, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, MyGlb.PANEL_LIST, 0);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, MyGlb.PANEL_LIST, 2);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, MyGlb.PANEL_FORM, 696, 272, 164, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, MyGlb.PANEL_FORM, 0);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHCODGEST, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_ETICHCODGEST, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_ETICHCODGEST, -1, "", "ETICHCODGEST", 0, 0, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_LIST, 1012, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_LIST, 60);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_FORM, 4, 220, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_FORM, 60);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_FATTORE, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_FATTORE, PPQRY_CAP27, "A.FATTORE", "RECORDFATTOR", 5, 16, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_LIST, 1116, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_LIST, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione Fattore");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 244, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_FORM, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descr. Fatt.");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_DESCRIZIONE1, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_DESCRIZIONE1, PPQRY_CAP27, "C.DESCRIZIONE", "RECODESCFATT", 5, 200, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, MyGlb.PANEL_LIST, 1012, 0, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, MyGlb.PANEL_LIST, 0);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, MyGlb.PANEL_LIST, 2);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, MyGlb.PANEL_FORM, 996, 260, 348, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, MyGlb.PANEL_FORM, 0);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHEFATTOR, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_ETICHEFATTOR, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_ETICHEFATTOR, -1, "", "ETICHEFATTOR", 0, 0, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_LIST, 1372, 36, 88, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_LIST, 60);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_LIST, "Tipo");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_FORM, 4, 412, 568, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_FORM, 60);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_TIPOPDC, MyGlb.PANEL_FORM, "Tipo");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_TIPOPDC, -1, GRP_CAPSENIMPECO_PIACONECOPAT);
    PAN_CAPSENIMPECO.SetFieldUnbound(PFL_CAPSENIMPECO_TIPOPDC, true);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_TIPOPDC, PPQRY_CAP27, "GET_DESCR_PDC_ECO_PAT(C.FATTORE,'T')", "TIPOPDC", 5, 99, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_LIST, 1460, 36, 88, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_LIST, 72);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_LIST, "Codice");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_FORM, 4, 436, 580, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_FORM, 72);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CODICEPDC, MyGlb.PANEL_FORM, "Codice");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_CODICEPDC, -1, GRP_CAPSENIMPECO_PIACONECOPAT);
    PAN_CAPSENIMPECO.SetFieldUnbound(PFL_CAPSENIMPECO_CODICEPDC, true);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_CODICEPDC, PPQRY_CAP27, "GET_DESCR_PDC_ECO_PAT(C.FATTORE,'C')", "CODICEPDC", 5, 99, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_LIST, 1548, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_LIST, 100);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_FORM, 4, 460, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_FORM, 100);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIOPDC, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_DESCRIZIOPDC, -1, GRP_CAPSENIMPECO_PIACONECOPAT);
    PAN_CAPSENIMPECO.SetFieldUnbound(PFL_CAPSENIMPECO_DESCRIZIOPDC, true);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_DESCRIZIOPDC, PPQRY_CAP27, "GET_DESCR_PDC_ECO_PAT(C.FATTORE,'D')", "DESCRIZIOPDC", 5, 99, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_LIST, 1804, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_FORM, 4, 268, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_FORM, 52);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_CENTRO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_CENTRO, PPQRY_CAP27, "A.CENTRO", "RECORDCENTRO", 5, 16, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_LIST, 1908, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_LIST, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_LIST, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_LIST, "Descrizione Centro");
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_FORM, 4, 292, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_FORM, 84);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_DESCRIZIONE2, MyGlb.PANEL_FORM, "Descr. Centro");
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_DESCRIZIONE2, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_DESCRIZIONE2, PPQRY_CAP27, "D.DESCRIZIONE", "RECODESCCENT", 5, 200, 0, -13997);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, MyGlb.PANEL_LIST, 1804, 0, 360, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, MyGlb.PANEL_LIST, 0);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, MyGlb.PANEL_LIST, 2);
    PAN_CAPSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, MyGlb.PANEL_FORM, 1004, 268, 348, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, MyGlb.PANEL_FORM, 0);
    PAN_CAPSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPSENIMPECO_ETICHECENTRO, MyGlb.PANEL_FORM, 1);
    PAN_CAPSENIMPECO.SetFieldPage(PFL_CAPSENIMPECO_ETICHECENTRO, -1, -1);
    PAN_CAPSENIMPECO.SetFieldPanel(PFL_CAPSENIMPECO_ETICHECENTRO, -1, "", "ETICHECENTRO", 0, 0, 0, -13997);
  }

  private void PAN_CAPSENIMPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPSENIMPECO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAPSENIMPECO.SetIMDB(IMDB, "PQRY_CAP27", true);
    PAN_CAPSENIMPECO.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CAPITOLO as RECORDCAPITO, ");
    SQL.append("  A.ARTICOLO as RECORDARTICO, ");
    SQL.append("  A.DESCRIZIONE as RECODESCCAPI, ");
    SQL.append("  A.CODICE_STRUTTURA as RECORDCODICE, ");
    SQL.append("  TO_CHAR ( GET_COD_LIVELLO_4(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) ) as CODIVLIVELLO, ");
    SQL.append("  TO_CHAR ( GET_COD_LIVELLO_5(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) ) as CODVLIVELLO, ");
    SQL.append("  A.CODICE_GESTIONALE as RECOCODIGEST, ");
    SQL.append("  E.DESCRIZIONE as RECDESCODGES, ");
    SQL.append("  A.FATTORE as RECORDFATTOR, ");
    SQL.append("  C.DESCRIZIONE as RECODESCFATT, ");
    SQL.append("  A.CENTRO as RECORDCENTRO, ");
    SQL.append("  D.DESCRIZIONE as RECODESCCENT, ");
    SQL.append("  GET_DESCR_PDC_ECO_PAT(C.FATTORE,'T') as TIPOPDC, ");
    SQL.append("  GET_DESCR_PDC_ECO_PAT(C.FATTORE,'C') as CODICEPDC, ");
    SQL.append("  GET_DESCR_PDC_ECO_PAT(C.FATTORE,'D') as DESCRIZIOPDC ");
    PAN_CAPSENIMPECO.SetQuery(PPQRY_CAP27, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  FATTORI C, ");
    SQL.append("  CENTRI D, ");
    SQL.append("  CODICI_GESTIONALI E ");
    PAN_CAPSENIMPECO.SetQuery(PPQRY_CAP27, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (~~PQRY_PARAM165.NOMOGGCASEFA~~ = 'NO' OR (~~PQRY_PARAM165.NOMOGGCASEFA~~ = 'SI' AND (A.FATTORE IS NULL))) ");
    SQL.append("and   (~~PQRY_PARAM165.NOMOGGCASECE~~ = 'NO' OR (~~PQRY_PARAM165.NOMOGGCASECE~~ = 'SI' AND (A.CENTRO IS NULL) AND (NVL(");
    SQL.append("( ");
    SQL.append("select ");
    SQL.append("  B.TIPO ");
    SQL.append("from ");
    SQL.append("  FATTORI B ");
    SQL.append("where (B.FATTORE = A.FATTORE) ");
    SQL.append("), 'E') = 'E' OR (A.FATTORE IS NULL)))) ");
    SQL.append("and   (C.FATTORE(+) = A.FATTORE) ");
    SQL.append("and   (D.CENTRO(+) = A.CENTRO) ");
    SQL.append("and   (E.E_S(+) = A.E_S) ");
    SQL.append("and   (E.CODICE(+) = A.CODICE_GESTIONALE) ");
    SQL.append("and   (A.E_S = ~~PQRY_PARAM165.NOMEOGGETTES~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.FATTORE IS NULL) OR (A.CENTRO IS NULL)) ");
    PAN_CAPSENIMPECO.SetQuery(PPQRY_CAP27, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPSENIMPECO.SetQuery(PPQRY_CAP27, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPSENIMPECO.SetQuery(PPQRY_CAP27, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 5, 6, 1, 2 ");
    PAN_CAPSENIMPECO.SetQuery(PPQRY_CAP27, 5, SQL, -1, "");
    PAN_CAPSENIMPECO.SetQueryDB(PPQRY_CAP27, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPSENIMPECO.SetMasterTable(0, "CAP");
    PAN_CAPSENIMPECO.AddToSortList(PFL_CAPSENIMPECO_CODIVLIVELLO, true);
    PAN_CAPSENIMPECO.AddToSortList(PFL_CAPSENIMPECO_CODVLIVELLO, true);
    PAN_CAPSENIMPECO.AddToSortList(PFL_CAPSENIMPECO_CAPITOLO, true);
    PAN_CAPSENIMPECO.AddToSortList(PFL_CAPSENIMPECO_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPSENIMPECO.Status() == 2)
    {
      int oldListQBE = PAN_CAPSENIMPECO.iUseListQBE;
      PAN_CAPSENIMPECO.iUseListQBE = 0;
      PAN_CAPSENIMPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPSENIMPECO.PanelCommand(Glb.PCM_FIND);
      PAN_CAPSENIMPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CAPSENIMPECO) PAN_CAPSENIMPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_CAPSENIMPECO) PAN_CAPSENIMPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_CAPSENIMPECO) PAN_CAPSENIMPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CAPSENIMPECO) PAN_CAPSENIMPECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CAPSENIMPECO) PAN_CAPSENIMPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
