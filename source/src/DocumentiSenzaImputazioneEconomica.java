// **********************************************
// Documenti Senza Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DocumentiSenzaImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARS_DATEDELDOCUM = 0;

  private static int PFL_PARS_ES1 = 0;
  private static int PFL_PARS_DATADAL = 1;
  private static int PFL_PARS_DATAAL = 2;
  private static int PFL_PARS_ETICHETTASD = 3;
  private static int PFL_PARS_ETISOLDODIEN = 4;
  private static int PFL_PARS_ETISOLDODISP = 5;

  private static int PPQRY_PARS66 = 0;


  IDPanel PAN_PARS;
  private static int PFL_DOCSENIMPECO_ES = 0;
  private static int PFL_DOCSENIMPECO_NUMERODOCUME = 1;
  private static int PFL_DOCSENIMPECO_DDATADOC = 2;
  private static int PFL_DOCSENIMPECO_ANNODOCUMENT = 3;
  private static int PFL_DOCSENIMPECO_TIPODOCUMENT = 4;
  private static int PFL_DOCSENIMPECO_NUMEROPROTOC = 5;
  private static int PFL_DOCSENIMPECO_DATAPROTOCOL = 6;
  private static int PFL_DOCSENIMPECO_ANNOPROT = 7;
  private static int PFL_DOCSENIMPECO_CODSOGGETTO = 8;
  private static int PFL_DOCSENIMPECO_RAGIONSOCIAL = 9;
  private static int PFL_DOCSENIMPECO_IMPORTO = 10;
  private static int PFL_DOCSENIMPECO_DESCRIZIONE = 11;
  private static int PFL_DOCSENIMPECO_CODICEDOC = 12;

  private static int PPQRY_VISDOCSENIMP = 0;


  IDPanel PAN_DOCSENIMPECO;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS71(IMDB);
    //
    //
    Init_PQRY_PARS66(IMDB);
    Init_PQRY_PARS66_RS(IMDB);
    Init_PQRY_VISDOCSENIMP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS71(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS71, 3);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS71, "TBL_PARS71");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS71,IMDBDef3.FLD_PARS71_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS71,IMDBDef3.FLD_PARS71_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS71,IMDBDef3.FLD_PARS71_NOMOGGDATDAL, "NOMOGGDATDAL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS71,IMDBDef3.FLD_PARS71_NOMOGGDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS71,IMDBDef3.FLD_PARS71_NOMEOGGDATAL, "NOMEOGGDATAL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS71,IMDBDef3.FLD_PARS71_NOMEOGGDATAL,6,10,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS71, 0);
  }

  private static void Init_PQRY_PARS66(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS66, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS66, "PQRY_PARS66");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS66,IMDBDef11.PQSL_PARS66_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS66,IMDBDef11.PQSL_PARS66_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS66,IMDBDef11.PQSL_PARS66_NOMOGGDATDAL, "NOMOGGDATDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS66,IMDBDef11.PQSL_PARS66_NOMOGGDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS66,IMDBDef11.PQSL_PARS66_NOMEOGGDATAL, "NOMEOGGDATAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS66,IMDBDef11.PQSL_PARS66_NOMEOGGDATAL,6,10,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARS66, 0);
  }

  private static void Init_PQRY_PARS66_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS66_RS, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS66_RS, "PQRY_PARS66_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS66_RS,IMDBDef11.PQSL_PARS66_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS66_RS,IMDBDef11.PQSL_PARS66_NOMEOGGETTES,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS66_RS,IMDBDef11.PQSL_PARS66_NOMOGGDATDAL, "NOMOGGDATDAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS66_RS,IMDBDef11.PQSL_PARS66_NOMOGGDATDAL,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS66_RS,IMDBDef11.PQSL_PARS66_NOMEOGGDATAL, "NOMEOGGDATAL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS66_RS,IMDBDef11.PQSL_PARS66_NOMEOGGDATAL,6,10,0);
  }

  private static void Init_PQRY_VISDOCSENIMP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_VISDOCSENIMP, 13);
    IMDB.set_TblCode(IMDBDef11.PQRY_VISDOCSENIMP, "PQRY_VISDOCSENIMP");
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VISDOCSEIMES, "VISDOCSEIMES");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VISDOCSEIMES,12,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMNUDO, "VIDOSEIMNUDO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMNUDO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMDDAD, "VIDOSEIMDDAD");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMDDAD,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMANDO, "VIDOSEIMANDO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMANDO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMTIDO, "VIDOSEIMTIDO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMTIDO,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMNUPR, "VIDOSEIMNUPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMNUPR,1,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMDAPR, "VIDOSEIMDAPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMDAPR,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMANPR, "VIDOSEIMANPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMANPR,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMCOSO, "VIDOSEIMCOSO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMCOSO,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMRASO, "VIDOSEIMRASO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMRASO,5,40,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VISDOCSEIMIM, "VISDOCSEIMIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VISDOCSEIMIM,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VISDOCSEIMDE, "VISDOCSEIMDE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VISDOCSEIMDE,5,60,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMCODO, "VIDOSEIMCODO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISDOCSENIMP,IMDBDef11.PQSL_VISDOCSENIMP_VIDOSEIMCODO,1,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_VISDOCSENIMP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DocumentiSenzaImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public DocumentiSenzaImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_DOCSENIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "80D549EC-F952-4B0B-885B-422ADFF3C92C";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 808;
    DesignHeight = 438;
    set_Caption(new IDVariant("Documenti senza Imputazione Economica"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 808;
    Frames[1].Height = 412;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.203883;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 808;
    Frames[2].Height = 84;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 84;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 808-MyGlb.PAN_OFFS_X, 84-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "324F6B65-0418-4850-8408-F45CB0C18178");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 160, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 808;
    Frames[3].Height = 328;
    Frames[3].Caption = "Documenti senza Imputazione Economica";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 328;
    PAN_DOCSENIMPECO = new IDPanel(w, this, 3, "PAN_DOCSENIMPECO");
    Frames[3].Content = PAN_DOCSENIMPECO;
    PAN_DOCSENIMPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DOCSENIMPECO.VS = MainFrm.VisualStyleList;
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 808-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "F995FD41-96B6-4234-B302-7D1631F508D9");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1332, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DOCSENIMPECO.InitStatus = 1;
    PAN_DOCSENIMPECO_Init();
    PAN_DOCSENIMPECO_InitFields();
    PAN_DOCSENIMPECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS71, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DOCSENIMPECO_PARS66();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_DOCSENIMPECO.UpdatePanel(MainFrm);
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
    return (obj instanceof DocumentiSenzaImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DocumentiSenzaImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(DocumentiSenzaImputazioneEconomica.class) ? DocumentiSenzaImputazioneEconomica.class.getName().substring(DocumentiSenzaImputazioneEconomica.class.getPackage().getName().length() + 1) : DocumentiSenzaImputazioneEconomica.class.getName()));
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
      LOAD_PARSDELETE();
      if (MainFrm.MODAIMPUENTR.compareTo((new IDVariant("FA")), true)!=0 || MainFrm.MODAIMPUSPES.compareTo((new IDVariant("FA")), true)!=0)
      {
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ES1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        if (MainFrm.MODAIMPUENTR.equals((new IDVariant("FA")), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGETTES, 0, (new IDVariant("E")));
        }
        if (MainFrm.MODAIMPUSPES.equals((new IDVariant("FA")), true))
        {
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGETTES, 0, (new IDVariant("S")));
        }
      }
      else
      {
        // 
        // /vedo l'option button
        // 
        // 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARS.SetFlags (Glb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGETTES, 0, (new IDVariant("T")));
      }
      IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMOGGDATDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGDATAL, 0, (new IDVariant()));
      PAN_DOCSENIMPECO.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiSenzaImputazioneEconomica", "Load", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMOGGDATDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGDATAL, 0, new IDVariant());
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiSenzaImputazioneEconomica", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGETTES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMOGGDATDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGDATAL, 0, new IDVariant());
  }

  // **********************************************************************
  // Documenti senza Imputazione Economica On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_DOCSENIMPECO_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti senza Imputazione Economica On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_DOCSENIMPECO.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_DOCSENIMPECO.Freezed = (new IDVariant(0)).booleanValue();
        PAN_DOCSENIMPECO_InitQueries();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiSenzaImputazioneEconomica", "DocumentisenzaImputazioneEconomicaOnCommand", _e);
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void DOCSENIMPECO_PARS66() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARS66_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS71, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS71, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARS66_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARS66_RS, 0, IMDBDef3.TBL_PARS71, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS66_RS, 0, 0, IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGETTES, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS66_RS, 1, 0, IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMOGGDATDAL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS66_RS, 2, 0, IMDBDef3.TBL_PARS71, IMDBDef3.FLD_PARS71_NOMEOGGDATAL, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS71, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS71, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS71, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARS66_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DOCSENIMPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DOCSENIMPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DOCSENIMPECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DOCSENIMPECO, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DOCSENIMPECO_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DOCSENIMPECO);
    // Stub
  }

  private void PAN_DOCSENIMPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_DOCSENIMPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DOCSENIMPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DOCSENIMPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, "191E61ED-F0D2-4E0A-8EA9-45CAED792DCD");
    PAN_PARS.set_Header(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, "Date del Documento");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, MyGlb.VIS_GROUPSTYLE);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, MyGlb.PANEL_LIST, 0, -9999, 60, 16, 0, 0);
    PAN_PARS.SetRect(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, MyGlb.PANEL_FORM, 224, 11, 260, 57, 0, 0);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, 0, 115);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, 1, 13);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, 0, 4);
    PAN_PARS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, 1, 4);
    PAN_PARS.SetFlags(MyGlb.OBJ_GROUP, GRP_PARS_DATEDELDOCUM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "006CA2A2-238B-4EE2-89AC-DE94A264954D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "ES");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ES1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, "C225F3D2-8B34-4389-ADE6-E670FE57DBFB");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, "Dal");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, "710FCE8F-C19C-4212-9203-72F31DAA78AD");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, "Al");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, "45629971-9AF8-42DB-BCD7-F7DBA1016F6B");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, "75F71199-3A1C-4EBE-8BAB-208EB592C85C");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, "Solo Documenti di Entrata");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, MyGlb.VIS_ETICGRASLEFT);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, "893A18B1-D028-4E4F-9BAA-9DEA77C454EC");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, "Solo Documenti di Spesa");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, MyGlb.VIS_ETICGRASLEFT);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, "ES");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 20, 12, 200, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 40);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 3);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, "ES");
    PAN_PARS.SetFieldPage(PFL_PARS_ES1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ES1, PPQRY_PARS66, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant("E")), "Entrata", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant("S")), "Spesa", "", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant("T")), "Tutti", "", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_LIST, 56);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_FORM, 228, 44, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_FORM, 28);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATADAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARS.SetFieldPage(PFL_PARS_DATADAL, -1, GRP_PARS_DATEDELDOCUM);
    PAN_PARS.SetFieldPanel(PFL_PARS_DATADAL, PPQRY_PARS66, "A.NOMOGGDATDAL", "NOMOGGDATDAL", 6, 10, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_LIST, 52);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_LIST, "Al");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_FORM, 352, 44, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_FORM, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_DATAAL, MyGlb.PANEL_FORM, "Al");
    PAN_PARS.SetFieldPage(PFL_PARS_DATAAL, -1, GRP_PARS_DATEDELDOCUM);
    PAN_PARS.SetFieldPanel(PFL_PARS_DATAAL, PPQRY_PARS66, "A.NOMEOGGDATAL", "NOMEOGGDATAL", 6, 10, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, MyGlb.PANEL_LIST, 432, 16, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, MyGlb.PANEL_FORM, 468, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHETTASD, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHETTASD, -1, GRP_PARS_DATEDELDOCUM);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHETTASD, -1, "", "ETICHETTASD", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, MyGlb.PANEL_LIST, 504, 40, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, MyGlb.PANEL_FORM, 24, 44, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODIEN, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETISOLDODIEN, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETISOLDODIEN, -1, "", "ETISOLDODIEN", 0, 0, 0, -13997);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, MyGlb.PANEL_LIST, 512, 48, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, MyGlb.PANEL_FORM, 24, 44, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETISOLDODISP, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETISOLDODISP, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETISOLDODISP, -1, "", "ETISOLDODISP", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS66", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS66, IMDBDef11.PQRY_PARS66_RS, IMDBDef3.TBL_PARS71);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ES1, IMDBDef3.FLD_PARS71_NOMEOGGETTES);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DATADAL, IMDBDef3.FLD_PARS71_NOMOGGDATDAL);
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_DATAAL, IMDBDef3.FLD_PARS71_NOMEOGGDATAL);
    PAN_PARS.SetMasterTable(0, "PARS71");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DOCSENIMPECO_Init()
  {

    PAN_DOCSENIMPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DOCSENIMPECO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DOCSENIMPECO.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, "8087FF06-3A99-4803-B0D7-32850CF967EA");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, "E S");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, "A4355D70-9C3D-409E-8685-BA0320AFC8F7");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, "Numero Documento");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, "853ADCD0-7DAE-40C0-9B8E-1119525C1885");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, "Data Documento");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, "B37AE945-7A2A-402A-BEB1-198EE6D2B335");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, "Anno Documento");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, "EFDE0F7D-0F0B-4AFA-B338-FA42A93ABEE5");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, "Tipo Documento");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, "51313DA2-EB58-4776-BE7E-679B93B44631");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, "Numero Protocollo");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, "C19B780C-0EBA-4C17-B4A3-84D74D27931D");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, "Data Protocollo");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, "B48CCD46-33D2-4DFC-8C4C-A9C412E95853");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, "Anno Protocollo");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, "7A183CB1-1036-40E2-B6EE-9E5D4F6434EC");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, "Cod. Soggetto");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, "3F4C39B4-D84F-4CED-A6F5-CD6505151DF0");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, "Ragione Sociale");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, "FDE36BF6-F21E-4C5D-8ED0-20DB2F45B9F6");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, "Importo");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, "23006139-74F4-41D7-B1B4-E1C882894F25");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, "Descrizione");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DOCSENIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, "FE8B0958-BB83-4F6E-AD56-93FEFDA90F58");
    PAN_DOCSENIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, "CODICE DOC");
    PAN_DOCSENIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, "");
    PAN_DOCSENIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.VIS_NORMFIELPADR);
    PAN_DOCSENIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_DOCSENIMPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_LIST, 24);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_LIST, "E S");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ES, MyGlb.PANEL_FORM, "E S");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_ES, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_ES, PPQRY_VISDOCSENIMP, "A.E_S", "VISDOCSEIMES", 12, 1, 0, -13997);
    PAN_DOCSENIMPECO.SetValueListItem(PFL_DOCSENIMPECO_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_DOCSENIMPECO.SetValueListItem(PFL_DOCSENIMPECO_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_LIST, 84);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_LIST, "Numero Documento");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_FORM, 4, 28, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMERODOCUME, MyGlb.PANEL_FORM, "Numero Documento");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_NUMERODOCUME, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_NUMERODOCUME, PPQRY_VISDOCSENIMP, "A.NUMERO_DOC", "VIDOSEIMNUDO", 5, 20, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_LIST, 128, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_LIST, "Data Documento");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_FORM, 4, 52, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DDATADOC, MyGlb.PANEL_FORM, "Data Documento");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_DDATADOC, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_DDATADOC, PPQRY_VISDOCSENIMP, "A.D_DATA_DOC", "VIDOSEIMDDAD", 6, 10, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_LIST, 204, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_LIST, 64);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_LIST, "Anno Documento");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_FORM, 4, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNODOCUMENT, MyGlb.PANEL_FORM, "Anno Documento");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_ANNODOCUMENT, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_ANNODOCUMENT, PPQRY_VISDOCSENIMP, "A.ANNO_DOC", "VIDOSEIMANDO", 1, 4, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_LIST, 280, 36, 152, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_LIST, 108);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_LIST, "Tipo Documento");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_FORM, 4, 100, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_TIPODOCUMENT, MyGlb.PANEL_FORM, "Tipo Documento");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_TIPODOCUMENT, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_TIPODOCUMENT, PPQRY_VISDOCSENIMP, "A.TIPO_DOCUMENTO", "VIDOSEIMTIDO", 5, 40, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_LIST, 432, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_LIST, 88);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_LIST, "Numero Protocollo");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_FORM, 4, 124, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_NUMEROPROTOC, MyGlb.PANEL_FORM, "Numero Protocollo");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_NUMEROPROTOC, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_NUMEROPROTOC, PPQRY_VISDOCSENIMP, "A.NUMERO_PROT", "VIDOSEIMNUPR", 1, 7, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_LIST, 504, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_LIST, 84);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_LIST, "Data Protocollo");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DATAPROTOCOL, MyGlb.PANEL_FORM, "Data Protocollo");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_DATAPROTOCOL, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_DATAPROTOCOL, PPQRY_VISDOCSENIMP, "A.D_DATA_PROT", "VIDOSEIMDAPR", 6, 10, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_LIST, 584, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_LIST, 72);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_LIST, "Anno Protocollo");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_FORM, 4, 172, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_ANNOPROT, MyGlb.PANEL_FORM, "Anno Protocollo");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_ANNOPROT, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_ANNOPROT, PPQRY_VISDOCSENIMP, "A.ANNO_PROT", "VIDOSEIMANPR", 1, 4, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_LIST, 652, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_LIST, 96);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_LIST, "Cod. Soggetto");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_FORM, 4, 196, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODSOGGETTO, MyGlb.PANEL_FORM, "Cod. Soggetto");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_CODSOGGETTO, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_CODSOGGETTO, PPQRY_VISDOCSENIMP, "A.COD_SOGGETTO", "VIDOSEIMCOSO", 1, 6, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 716, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 220, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_RAGIONSOCIAL, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_RAGIONSOCIAL, PPQRY_VISDOCSENIMP, "A.RAGIONE_SOCIALE", "VIDOSEIMRASO", 5, 40, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_LIST, 952, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_FORM, 4, 244, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_IMPORTO, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_IMPORTO, PPQRY_VISDOCSENIMP, "A.IMPORTO", "VISDOCSEIMIM", 3, 14, 2, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, 1096, 36, 236, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 268, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, 120);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_DESCRIZIONE, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_DESCRIZIONE, PPQRY_VISDOCSENIMP, "A.DESCRIZIONE", "VISDOCSEIMDE", 5, 60, 0, -13997);
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_LIST, 1244, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_LIST, 76);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_LIST, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_LIST, "COD. DOC");
    PAN_DOCSENIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_FORM, 204, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DOCSENIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_FORM, 88);
    PAN_DOCSENIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_FORM, 1);
    PAN_DOCSENIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DOCSENIMPECO_CODICEDOC, MyGlb.PANEL_FORM, "CODICE DOC");
    PAN_DOCSENIMPECO.SetFieldPage(PFL_DOCSENIMPECO_CODICEDOC, -1, -1);
    PAN_DOCSENIMPECO.SetFieldPanel(PFL_DOCSENIMPECO_CODICEDOC, PPQRY_VISDOCSENIMP, "A.CODICE_DOC", "VIDOSEIMCODO", 1, 2, 0, -13997);
  }

  private void PAN_DOCSENIMPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_DOCSENIMPECO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DOCSENIMPECO.SetIMDB(IMDB, "PQRY_VISDOCSENIMP", true);
    PAN_DOCSENIMPECO.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA DOCUMENTI SENZA IMPECO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.E_S as VISDOCSEIMES, ");
    SQL.append("  A.NUMERO_DOC as VIDOSEIMNUDO, ");
    SQL.append("  A.D_DATA_DOC as VIDOSEIMDDAD, ");
    SQL.append("  A.ANNO_DOC as VIDOSEIMANDO, ");
    SQL.append("  A.TIPO_DOCUMENTO as VIDOSEIMTIDO, ");
    SQL.append("  A.NUMERO_PROT as VIDOSEIMNUPR, ");
    SQL.append("  A.D_DATA_PROT as VIDOSEIMDAPR, ");
    SQL.append("  A.ANNO_PROT as VIDOSEIMANPR, ");
    SQL.append("  A.COD_SOGGETTO as VIDOSEIMCOSO, ");
    SQL.append("  A.RAGIONE_SOCIALE as VIDOSEIMRASO, ");
    SQL.append("  A.IMPORTO as VISDOCSEIMIM, ");
    SQL.append("  A.DESCRIZIONE as VISDOCSEIMDE, ");
    SQL.append("  A.CODICE_DOC as VIDOSEIMCODO ");
    PAN_DOCSENIMPECO.SetQuery(PPQRY_VISDOCSENIMP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_DOCUMENTI_SENZA_IMPECO A ");
    PAN_DOCSENIMPECO.SetQuery(PPQRY_VISDOCSENIMP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~PQRY_PARS66.NOMEOGGETTES~~ OR ~~PQRY_PARS66.NOMEOGGETTES~~ = 'T') ");
    SQL.append("and   ((A.D_DATA_DOC BETWEEN ~~PQRY_PARS66.NOMOGGDATDAL~~ AND NVL(~~PQRY_PARS66.NOMEOGGDATAL~~, A.D_DATA_DOC))) ");
    PAN_DOCSENIMPECO.SetQuery(PPQRY_VISDOCSENIMP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCSENIMPECO.SetQuery(PPQRY_VISDOCSENIMP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DOCSENIMPECO.SetQuery(PPQRY_VISDOCSENIMP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.D_DATA_DOC, ");
    SQL.append("  A.RAGIONE_SOCIALE, ");
    SQL.append("  A.NUMERO_DOC ");
    PAN_DOCSENIMPECO.SetQuery(PPQRY_VISDOCSENIMP, 5, SQL, -1, "");
    PAN_DOCSENIMPECO.SetQueryDB(PPQRY_VISDOCSENIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DOCSENIMPECO.SetMasterTable(0, "VISTA_DOCUMENTI_SENZA_IMPECO");
    PAN_DOCSENIMPECO.AddToSortList(PFL_DOCSENIMPECO_DDATADOC, true);
    PAN_DOCSENIMPECO.AddToSortList(PFL_DOCSENIMPECO_RAGIONSOCIAL, true);
    PAN_DOCSENIMPECO.AddToSortList(PFL_DOCSENIMPECO_NUMERODOCUME, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DOCSENIMPECO.Status() == 2)
    {
      int oldListQBE = PAN_DOCSENIMPECO.iUseListQBE;
      PAN_DOCSENIMPECO.iUseListQBE = 0;
      PAN_DOCSENIMPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_DOCSENIMPECO.PanelCommand(Glb.PCM_FIND);
      PAN_DOCSENIMPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DOCSENIMPECO) PAN_DOCSENIMPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_DOCSENIMPECO) PAN_DOCSENIMPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_DOCSENIMPECO) PAN_DOCSENIMPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DOCSENIMPECO) PAN_DOCSENIMPECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_DOCSENIMPECO) PAN_DOCSENIMPECO_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DOCSENIMPECO) PAN_DOCSENIMPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
