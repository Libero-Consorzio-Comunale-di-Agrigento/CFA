// **********************************************
// Reiscrizioni Da Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ReiscrizioniDaImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARFS_NUMEROIMP = 0;
  private static int PFL_PARFS_ANNOIMP = 1;
  private static int PFL_PARFS_PROVVISORDEF = 2;
  private static int PFL_PARFS_ETICHEELABOR = 3;

  private static int PPQRY_PARFS1 = 0;


  IDPanel PAN_PARFS;
  CIDREObj BUK_STAMREIDAIMP;
  OBook BKW_STAMREIDAIMP;
  //
  // Template Pages constants
  private static int BUK_STAMREIDAIMP_MST_NUOVPAGIMAST = 1;
  private static int BUK_STAMREIDAIMP_RPTBOX_TESTATPAGINA = 2;
  private static int BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA = 3;
  private static int BUK_STAMREIDAIMP_RPTBOX_PIEDEPAGINA = 4;
  private static int BUK_STAMREIDAIMP_RPTBOX_PAG = 5;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN1 = 6;
  private static int BUK_STAMREIDAIMP_SPAN_STREDAIRDIPN = 7;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN2 = 8;
  private static int BUK_STAMREIDAIMP_SPAN_STREDIRDINOP = 9;

  //
  // Reports constants
  private static int BUK_STAMREIDAIMP_RPT_NUOVOREPORT1 = 10;
  private static int BUK_STAMREIDAIMP_SEC_INTESTREPOR1 = 11;
  private static int BUK_STAMREIDAIMP_SEC_INTESTPAGIN1 = 12;
  private static int BUK_STAMREIDAIMP_RPTBOX_REISCDAIMPEG = 13;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN3 = 14;
  private static int BUK_STAMREIDAIMP_RPTBOX_IMPEGNO = 15;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN4 = 16;
  private static int BUK_STAMREIDAIMP_RPTBOX_IMPEGNO1 = 17;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN5 = 18;
  private static int BUK_STAMREIDAIMP_RPTBOX_COMPETENZA1 = 19;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN6 = 20;
  private static int BUK_STAMREIDAIMP_RPTBOX_CASSA1 = 21;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN7 = 22;
  private static int BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP = 23;
  private static int BUK_STAMREIDAIMP_RPTBOX_IMP = 24;
  private static int BUK_STAMREIDAIMP_SPAN_NUOVASPAN8 = 25;
  private static int BUK_STAMREIDAIMP_RPTBOX_CAPITOLO = 26;
  private static int BUK_STAMREIDAIMP_SPAN_REBIPRDISRDI = 27;
  private static int BUK_STAMREIDAIMP_RPTBOX_DESC1 = 28;
  private static int BUK_STAMREIDAIMP_SPAN_REIMDRDISRDI = 29;
  private static int BUK_STAMREIDAIMP_RPTBOX_DESCIMP = 30;
  private static int BUK_STAMREIDAIMP_SPAN_REDECRDISRDI = 31;
  private static int BUK_STAMREIDAIMP_SEC_DETTAGLIO1 = 32;
  private static int BUK_STAMREIDAIMP_RPTBOX_COMPETENZA = 33;
  private static int BUK_STAMREIDAIMP_SPAN_REVAIRDISRDI = 34;
  private static int BUK_STAMREIDAIMP_RPTBOX_CASSA = 35;
  private static int BUK_STAMREIDAIMP_SPAN_REVICRDISRDI = 36;
  private static int BUK_STAMREIDAIMP_SEC_IMPEPIEDGRUP = 37;
  private static int BUK_STAMREIDAIMP_RPTBOX_SUB = 38;
  private static int BUK_STAMREIDAIMP_SEC_PIEDEPAGINA = 39;
  private static int BUK_STAMREIDAIMP_SEC_PIEDEREPORT = 40;
  private static int BUK_STAMREIDAIMP_RPT_NUOVOREPORT = 41;
  private static int BUK_STAMREIDAIMP_SEC_INTESTREPORT = 42;
  private static int BUK_STAMREIDAIMP_SEC_INTESTPAGINA = 43;
  private static int BUK_STAMREIDAIMP_SEC_DETTAGLIO = 44;
  private static int BUK_STAMREIDAIMP_RPTBOX_DESC = 45;
  private static int BUK_STAMREIDAIMP_SPAN_REDEREDISRDI = 46;
  private static int BUK_STAMREIDAIMP_RPTBOX_COMO = 47;
  private static int BUK_STAMREIDAIMP_SPAN_REIMREDISRDI = 48;
  private static int BUK_STAMREIDAIMP_RPTBOX_COMO1 = 49;
  private static int BUK_STAMREIDAIMP_SPAN_RECOREDISRDI = 50;
  private static int BUK_STAMREIDAIMP_SEC_PIEDEPAGINA1 = 51;
  private static int BUK_STAMREIDAIMP_SEC_PIEDEREPORT1 = 52;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARFS(IMDB);
    //
    //
    Init_PQRY_PARFS1(IMDB);
    Init_PQRY_PARFS1_RS(IMDB);
    Init_PQRY_VARCOM5(IMDB);
    Init_PQRY_VARCOM7(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARFS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARFS, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARFS, "TBL_PARFS");
    IMDB.set_FldCode(IMDBDef4.TBL_PARFS,IMDBDef4.FLD_PARFS_NOMOGGNUMIMP, "NOMOGGNUMIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARFS,IMDBDef4.FLD_PARFS_NOMOGGNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARFS,IMDBDef4.FLD_PARFS_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARFS,IMDBDef4.FLD_PARFS_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARFS,IMDBDef4.FLD_PARFS_NOMOGGPRODEF, "NOMOGGPRODEF");
    IMDB.SetFldParams(IMDBDef4.TBL_PARFS,IMDBDef4.FLD_PARFS_NOMOGGPRODEF,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARFS, 0);
  }

  private static void Init_PQRY_PARFS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARFS1, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARFS1, "PQRY_PARFS1");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARFS1,IMDBDef12.PQSL_PARFS1_NOMOGGNUMIMP, "NOMOGGNUMIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARFS1,IMDBDef12.PQSL_PARFS1_NOMOGGNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARFS1,IMDBDef12.PQSL_PARFS1_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARFS1,IMDBDef12.PQSL_PARFS1_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARFS1,IMDBDef12.PQSL_PARFS1_NOMOGGPRODEF, "NOMOGGPRODEF");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARFS1,IMDBDef12.PQSL_PARFS1_NOMOGGPRODEF,5,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARFS1, 0);
  }

  private static void Init_PQRY_PARFS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARFS1_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARFS1_RS, "PQRY_PARFS1_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARFS1_RS,IMDBDef12.PQSL_PARFS1_NOMOGGNUMIMP, "NOMOGGNUMIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARFS1_RS,IMDBDef12.PQSL_PARFS1_NOMOGGNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARFS1_RS,IMDBDef12.PQSL_PARFS1_NOMOGGANNIMP, "NOMOGGANNIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARFS1_RS,IMDBDef12.PQSL_PARFS1_NOMOGGANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARFS1_RS,IMDBDef12.PQSL_PARFS1_NOMOGGPRODEF, "NOMOGGPRODEF");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARFS1_RS,IMDBDef12.PQSL_PARFS1_NOMOGGPRODEF,5,1,0);
  }

  private static void Init_PQRY_VARCOM5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM5, 8);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM5, "PQRY_VARCOM5");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECOVARCIMPO, "RECOVARCIMPO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECOVARCIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECVARIMPCAS, "RECVARIMPCAS");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECVARIMPCAS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECORDBILPEG, "RECORDBILPEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECORDBILPEG,5,199,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECORDIMPEGN,5,199,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_DESCCAP, "DESCCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_DESCCAP,5,99,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECORIMPDESC, "RECORIMPDESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECORIMPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECVARANNIMP, "RECVARANNIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECVARANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECVARNUMIMP, "RECVARNUMIMP");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM5,IMDBDef12.PQSL_VARCOM5_RECVARNUMIMP,1,5,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM5, 0);
  }

  private static void Init_PQRY_VARCOM7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_VARCOM7, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_VARCOM7, "PQRY_VARCOM7");
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM7,IMDBDef12.PQSL_VARCOM7_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM7,IMDBDef12.PQSL_VARCOM7_IMPORTO,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM7,IMDBDef12.PQSL_VARCOM7_COMPETENZA, "COMPETENZA");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM7,IMDBDef12.PQSL_VARCOM7_COMPETENZA,3,28,6);
    IMDB.set_FldCode(IMDBDef12.PQRY_VARCOM7,IMDBDef12.PQSL_VARCOM7_DESC1, "DESC1");
    IMDB.SetFldParams(IMDBDef12.PQRY_VARCOM7,IMDBDef12.PQSL_VARCOM7_DESC1,5,99,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_VARCOM7, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ReiscrizioniDaImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public ReiscrizioniDaImpegno()
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
    FormIdx = MyGlb.FRM_REISCDAIMPEG;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4679CDED-FAA3-4155-BDBA-2A19895328CF";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 260;
    DesignHeight = 130;
    set_Caption(new IDVariant("Reiscrizioni da Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 260;
    Frames[1].Height = 104;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parfs";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 104;
    PAN_PARFS = new IDPanel(w, this, 1, "PAN_PARFS");
    Frames[1].Content = PAN_PARFS;
    PAN_PARFS.Lockable = false;
    PAN_PARFS.iLocked = false;
    PAN_PARFS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARFS.VS = MainFrm.VisualStyleList;
    PAN_PARFS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 260-MyGlb.PAN_OFFS_X, 104-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARFS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DCE510CF-B62F-478E-9A4F-9D239AF36095");
    PAN_PARFS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 208, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARFS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARFS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARFS.InitStatus = 1;
    PAN_PARFS_Init();
    PAN_PARFS_InitFields();
    PAN_PARFS_InitQueries();
    BKW_STAMREIDAIMP = new OBook(this);
    BUK_STAMREIDAIMP = new CIDREObj(BKW_STAMREIDAIMP);
    BKW_STAMREIDAIMP.iGuid = "EB32B17E-BB36-4DF0-B5EC-FF73271FD5B0";
    BKW_STAMREIDAIMP.Code = "BUK_STAMREIDAIMP";
    BKW_STAMREIDAIMP.BookObj = BUK_STAMREIDAIMP;
    BKW_STAMREIDAIMP.InitDefMasks();
    BUK_STAMREIDAIMP.InitBook(1, 1245441, "Stampa Reiscrizioni Da Impegno", IMDB, MainFrm.VisualStyleList);
    BUK_STAMREIDAIMP.InitHTML();
    BUK_STAMREIDAIMP.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_STAMREIDAIMP.Book.SetMainFrm(MainFrm);
    BUK_STAMREIDAIMP.SetRTCGuid(0, "EB32B17E-BB36-4DF0-B5EC-FF73271FD5B0");
    BUK_STAMREIDAIMP.SetObjCode(0, "STAMREIDAIMP");
    BUK_STAMREIDAIMP_MST_NUOVPAGIMAST_Init();
    BUK_STAMREIDAIMP_RPT_NUOVOREPORT1_Init();
    BUK_STAMREIDAIMP_RPT_NUOVOREPORT_Init();
    BUK_STAMREIDAIMP_InitLinks();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARFS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        REISCDAIMPEG_PARFS1();
      }
      PAN_PARFS.UpdatePanel(MainFrm);
      // BUK_STAMREIDAIMP.UpdateBook();
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
    if (Code.equals("BUK_STAMREIDAIMP")) return BUK_STAMREIDAIMP;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ReiscrizioniDaImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ReiscrizioniDaImpegno.class.getName() : (Glb.ClassWithPackage(ReiscrizioniDaImpegno.class) ? ReiscrizioniDaImpegno.class.getName().substring(ReiscrizioniDaImpegno.class.getPackage().getName().length() + 1) : ReiscrizioniDaImpegno.class.getName()));
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
      LOAD_PARFSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReiscrizioniDaImpegno", "Load", _e);
    }
  }

  // **********************************************************************
  // Parfs: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PARFSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGPRODEF, 0, new IDVariant());
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
      UNLOAD_PARFSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReiscrizioniDaImpegno", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parfs: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARFSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGPRODEF, 0, new IDVariant());
  }

  // **********************************************************************
  // Parfs On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARFS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parfs On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_PARFS_NUMEROIMP)), true) || Column.equals((new IDVariant(PFL_PARFS_ANNOIMP)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARFS1, IMDBDef12.PQSL_PARFS1_NOMOGGNUMIMP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARFS1, IMDBDef12.PQSL_PARFS1_NOMOGGANNIMP, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  IMP A ");
          SQL.append("where (A.ANNO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARFS1, IMDBDef12.PQSL_PARFS1_NOMOGGANNIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_IMP = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARFS1, IMDBDef12.PQSL_PARFS1_NOMOGGNUMIMP, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef12.PQRY_PARFS1, IMDBDef12.PQSL_PARFS1_NOMOGGNUMIMP, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARFS1, IMDBDef12.PQSL_PARFS1_NOMOGGANNIMP, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReiscrizioniDaImpegno", "ParfsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARFS1, IMDBDef12.PQSL_PARFS1_NOMOGGPRODEF, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Provvisorie Definitive obbligatorio"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      BUK_STAMREIDAIMP.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_STAMREIDAIMP.RefreshQuery();
      BUK_STAMREIDAIMP.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_STAMREIDAIMP.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReiscrizioniDaImpegno", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parfs
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void REISCDAIMPEG_PARFS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARFS1_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARFS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARFS, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARFS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARFS1_RS, 0, IMDBDef4.TBL_PARFS, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARFS1_RS, 0, 0, IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGNUMIMP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARFS1_RS, 1, 0, IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGANNIMP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARFS1_RS, 2, 0, IMDBDef4.TBL_PARFS, IMDBDef4.FLD_PARFS_NOMOGGPRODEF, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARFS, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARFS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARFS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARFS1_RS, 0);
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
  private void PAN_PARFS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARFS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARFS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARFS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARFS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARFS);
    // Stub
  }

  private void PAN_PARFS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARFS_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARFS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARFS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARFS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARFS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARFS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_STAMREIDAIMP_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_STAMREIDAIMP_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_STAMREIDAIMP_SEC_INTESTREPOR1)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_INTESTPAGIN1)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_DETTAGLIO1)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_IMPEPIEDGRUP)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_PIEDEPAGINA1)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_PIEDEREPORT1)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_STAMREIDAIMP_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_STAMREIDAIMP_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_STAMREIDAIMP_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_STAMREIDAIMP_MST_NUOVPAGIMAST)
    {
      BUK_STAMREIDAIMP.set_SpanValue(BUK_STAMREIDAIMP_SPAN_STREDAIRDIPN, new IDVariant((new IDVariant(BUK_STAMREIDAIMP.GetPageNumber()))));
      BUK_STAMREIDAIMP.set_SpanValue(BUK_STAMREIDAIMP_SPAN_STREDIRDINOP, new IDVariant((new IDVariant(BUK_STAMREIDAIMP.GetTotalPagesNumber()))));
    }
  }

  private void BUK_STAMREIDAIMP_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_STAMREIDAIMP_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_STAMREIDAIMP_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_STAMREIDAIMP_OnPreview()
  {
    PreviewBook = BKW_STAMREIDAIMP;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARFS_Init()
  {

    PAN_PARFS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARFS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARFS.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARFS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, "1D6DEE5F-0AD8-4DAF-B911-E929D22A4880");
    PAN_PARFS.set_Header(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, "Impegno");
    PAN_PARFS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, "");
    PAN_PARFS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARFS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARFS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, "A71852AD-E56C-4A4D-BDF8-658731850180");
    PAN_PARFS.set_Header(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, "/");
    PAN_PARFS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, "");
    PAN_PARFS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARFS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARFS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, "F618AA89-6A32-4624-AA20-41C83A917F92");
    PAN_PARFS.set_Header(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, "Provvisorie Def");
    PAN_PARFS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, "");
    PAN_PARFS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARFS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARFS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, "D6B7D998-CA35-4572-ACC6-CD11654A26CD");
    PAN_PARFS.set_Header(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, "Elabora");
    PAN_PARFS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARFS.SetImage(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARFS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARFS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_LIST, 80);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARFS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_LIST, "Imp.");
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_FORM, 4, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_FORM, 68);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARFS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARFS_NUMEROIMP, MyGlb.PANEL_FORM, "Impegno");
    PAN_PARFS.SetFieldPage(PFL_PARFS_NUMEROIMP, -1, -1);
    PAN_PARFS.SetFieldPanel(PFL_PARFS_NUMEROIMP, PPQRY_PARFS1, "A.NOMOGGNUMIMP", "NOMOGGNUMIMP", 1, 5, 0, -13997);
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_LIST, 64);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARFS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_LIST, "/");
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_FORM, 124, 4, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_FORM, 16);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARFS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARFS_ANNOIMP, MyGlb.PANEL_FORM, "/");
    PAN_PARFS.SetFieldPage(PFL_PARFS_ANNOIMP, -1, -1);
    PAN_PARFS.SetFieldPanel(PFL_PARFS_ANNOIMP, PPQRY_PARFS1, "A.NOMOGGANNIMP", "NOMOGGANNIMP", 1, 4, 0, -13997);
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_LIST, 96);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_LIST, 1);
    PAN_PARFS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_LIST, "Provvisorie Def");
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_FORM, 76, 28, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_FORM, 96);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_FORM, 1);
    PAN_PARFS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARFS_PROVVISORDEF, MyGlb.PANEL_FORM, "Provvisorie Def");
    PAN_PARFS.SetFieldPage(PFL_PARFS_PROVVISORDEF, -1, -1);
    PAN_PARFS.SetFieldPanel(PFL_PARFS_PROVVISORDEF, PPQRY_PARFS1, "A.NOMOGGPRODEF", "NOMOGGPRODEF", 5, 1, 0, -13997);
    PAN_PARFS.SetValueListItem(PFL_PARFS_PROVVISORDEF, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_PARFS.SetValueListItem(PFL_PARFS_PROVVISORDEF, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, MyGlb.PANEL_LIST, 136, 60, 100, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARFS.SetRect(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, MyGlb.PANEL_FORM, 152, 56, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARFS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARFS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARFS_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARFS.SetFieldPage(PFL_PARFS_ETICHEELABOR, -1, -1);
    PAN_PARFS.SetFieldPanel(PFL_PARFS_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
  }

  private void PAN_PARFS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARFS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARFS.SetIMDB(IMDB, "PQRY_PARFS1", true);
    PAN_PARFS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARFS.SetQueryIMDB(PPQRY_PARFS1, IMDBDef12.PQRY_PARFS1_RS, IMDBDef4.TBL_PARFS);
    JustLoaded = true;
    PAN_PARFS.SetFieldPrimaryIndex(PFL_PARFS_NUMEROIMP, IMDBDef4.FLD_PARFS_NOMOGGNUMIMP);
    PAN_PARFS.SetFieldPrimaryIndex(PFL_PARFS_ANNOIMP, IMDBDef4.FLD_PARFS_NOMOGGANNIMP);
    PAN_PARFS.SetFieldPrimaryIndex(PFL_PARFS_PROVVISORDEF, IMDBDef4.FLD_PARFS_NOMOGGPRODEF);
    PAN_PARFS.SetMasterTable(0, "PARFS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARFS.Status() == 2)
    {
      int oldListQBE = PAN_PARFS.iUseListQBE;
      PAN_PARFS.iUseListQBE = 0;
      PAN_PARFS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARFS.PanelCommand(Glb.PCM_FIND);
      PAN_PARFS.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_STAMREIDAIMP_MST_NUOVPAGIMAST_Init()
  {
    BUK_STAMREIDAIMP.InitMastro(BUK_STAMREIDAIMP_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_MST_NUOVPAGIMAST, "E9A04B55-DAF9-4BF5-A1C0-3BB0947DA8FF");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_STAMREIDAIMP.InitMastroBox(BUK_STAMREIDAIMP_MST_NUOVPAGIMAST, BUK_STAMREIDAIMP_RPTBOX_TESTATPAGINA, 1000, 500, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_TESTATPAGINA, "9E5320B4-2412-4988-8F27-1CE6A113AF10");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_STAMREIDAIMP.InitMastroBox(BUK_STAMREIDAIMP_MST_NUOVPAGIMAST, BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA, 1000, 2500, 19000, 25600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA, "B99176EA-271A-41EC-B70D-32BF848E5307");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_STAMREIDAIMP.InitMastroBox(BUK_STAMREIDAIMP_MST_NUOVPAGIMAST, BUK_STAMREIDAIMP_RPTBOX_PIEDEPAGINA, 1000, 28100, 19000, 600, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_PIEDEPAGINA, "DDBCF17C-E89B-4C42-9F44-D8A792C7089A");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_STAMREIDAIMP.InitMastroBox(BUK_STAMREIDAIMP_MST_NUOVPAGIMAST, BUK_STAMREIDAIMP_RPTBOX_PAG, 17500, 600, 2500, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_PAG, "E4E481EF-09F1-4FFA-BA98-FD3FFD1E55F2");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_PAG, "PAG");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_PAG, BUK_STAMREIDAIMP_SPAN_NUOVASPAN1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "Pag. ", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN1, "CE8DBE7F-4112-407B-8A3E-89B743B842D6");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN1, "NUOVASPAN1");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_PAG, BUK_STAMREIDAIMP_SPAN_STREDAIRDIPN, MyGlb.VIS_DEFAREPOSTYL, 1, 19, 0, 271384705, "", "", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_STREDAIRDIPN, "99EDB194-AC61-4BF8-A9E0-B25937EC349D");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_STREDAIRDIPN, "STREDAIRDIPN");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_PAG, BUK_STAMREIDAIMP_SPAN_NUOVASPAN2, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", " di ", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN2, "F4206A08-A34C-4632-AC0B-B0A28C3B64DE");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN2, "NUOVASPAN2");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_PAG, BUK_STAMREIDAIMP_SPAN_STREDIRDINOP, MyGlb.VIS_DEFAREPOSTYL, 1, 19, 0, 271384705, "", "", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_STREDIRDINOP, "614B724F-F9D1-41C7-8474-2520078E88B4");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_STREDIRDINOP, "STREDIRDINOP");
  }

  private void BUK_STAMREIDAIMP_RPT_NUOVOREPORT1_InitQuery() { BUK_STAMREIDAIMP_RPT_NUOVOREPORT1_InitQuery(true, true); }
  private void BUK_STAMREIDAIMP_RPT_NUOVOREPORT1_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.IMPORTO as RECOVARCIMPO, ");
      SQL.append("  A.IMPORTO_CASSA as RECVARIMPCAS, ");
      SQL.append("  TO_CHAR ( A.CAPITOLO ) || '/' || TO_CHAR ( A.ARTICOLO ) as RECORDBILPEG, ");
      SQL.append("  TO_CHAR ( A.NUMERO_IMP ) || '/' || TO_CHAR ( A.ANNO_IMP ) as RECORDIMPEGN, ");
      SQL.append("  A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO) as DESCCAP, ");
      SQL.append("  J.DESCRIZIONE as RECORIMPDESC, ");
      SQL.append("  A.ANNO_IMP as RECVARANNIMP, ");
      SQL.append("  A.NUMERO_IMP as RECVARNUMIMP ");
      SQL.append("from ");
      SQL.append("  VARCOM A, ");
      SQL.append("  IMP J ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (~~PQRY_PARFS1.NOMOGGPRODEF~~ = 'D') ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (NOT ((A.ANNO_IMP IS NULL))) ");
      SQL.append("and   (A.NUMERO_IMP = NVL(~~PQRY_PARFS1.NOMOGGNUMIMP~~, A.NUMERO_IMP)) ");
      SQL.append("and   (A.ANNO_IMP = NVL(~~PQRY_PARFS1.NOMOGGANNIMP~~, A.ANNO_IMP)) ");
      SQL.append("and   (J.ANNO_IMP = A.ANNO_IMP) ");
      SQL.append("and   (J.NUMERO_IMP = A.NUMERO_IMP) ");
      SQL.append("and   (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  T54 G, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL H, ");
      SQL.append("  TIPI_IMPORTO_VBIL I ");
      SQL.append("where (G.CODICE = A.TIPO_VAR) ");
      SQL.append("and   (H.CODICE = G.TIPOLOGIA) ");
      SQL.append("and   (I.CODICE = H.TIPO_IMPORTO) ");
      SQL.append("and   (I.TIPO_REISCRIZIONE = 'IMP') ");
      SQL.append("))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  B.IMPORTO, ");
      SQL.append("  B.IMPORTO_CASSA, ");
      SQL.append("  TO_CHAR ( B.CAPITOLO ) || '/' || TO_CHAR ( B.ARTICOLO ), ");
      SQL.append("  TO_CHAR ( B.NUMERO_IMP ) || '/' || TO_CHAR ( B.ANNO_IMP ), ");
      SQL.append("  A_GET_DESCRIZIONE_CAP(B.ESERCIZIO,B.E_S,B.CAPITOLO,B.ARTICOLO), ");
      SQL.append("  F.DESCRIZIONE, ");
      SQL.append("  B.ANNO_IMP, ");
      SQL.append("  B.NUMERO_IMP ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO B, ");
      SQL.append("  IMP F ");
      SQL.append("where (B.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (~~PQRY_PARFS1.NOMOGGPRODEF~~ = 'P') ");
      SQL.append("and   (B.E_S = 'S') ");
      SQL.append("and   (NOT ((B.ANNO_IMP IS NULL))) ");
      SQL.append("and   (B.NUMERO_IMP = NVL(~~PQRY_PARFS1.NOMOGGNUMIMP~~, B.NUMERO_IMP)) ");
      SQL.append("and   (B.ANNO_IMP = NVL(~~PQRY_PARFS1.NOMOGGANNIMP~~, B.ANNO_IMP)) ");
      SQL.append("and   (F.ANNO_IMP = B.ANNO_IMP) ");
      SQL.append("and   (F.NUMERO_IMP = B.NUMERO_IMP) ");
      SQL.append("and   (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  T54 C, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL D, ");
      SQL.append("  TIPI_IMPORTO_VBIL E ");
      SQL.append("where (C.CODICE = B.TIPO_VAR) ");
      SQL.append("and   (D.CODICE = C.TIPOLOGIA) ");
      SQL.append("and   (E.CODICE = D.TIPO_IMPORTO) ");
      SQL.append("and   (E.TIPO_REISCRIZIONE = 'IMP') ");
      SQL.append("))) ");
      SQL.append("order by 4 ");
      BUK_STAMREIDAIMP.SetReportQuery(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "2070C22D-13AC-40AB-AF14-43232F33236A");
      if (BUK_STAMREIDAIMP.FindObjByID(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP) != null)
        BUK_STAMREIDAIMP.AddReportGroup(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, "RECORDIMPEGN");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMREIDAIMP_RPT_NUOVOREPORT1_Init()
  {
    BUK_STAMREIDAIMP.InitReport(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, 196609);
    BUK_STAMREIDAIMP_RPT_NUOVOREPORT1_InitQuery(true, false);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, "508963D4-8B84-4F37-927C-A77F12A9F863");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, "NUOVOREPORT1");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, BUK_STAMREIDAIMP_SEC_INTESTREPOR1, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_INTESTREPOR1, BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_INTESTREPOR1, "CDC9E063-9EE6-4E22-A0AF-5C5F31A9B91D");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_INTESTREPOR1, "INTESTREPOR1");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, BUK_STAMREIDAIMP_RPTBOX_TESTATPAGINA);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, "78739547-718E-49EA-9704-217110A5B6D2");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, "INTESTPAGIN1");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, BUK_STAMREIDAIMP_RPTBOX_REISCDAIMPEG, 0, 0, 19000, 700, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_REISCDAIMPEG, "E7F3952F-D444-477C-98EF-759AC44A468E");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_REISCDAIMPEG, "REISCDAIMPEG");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_REISCDAIMPEG, BUK_STAMREIDAIMP_SPAN_NUOVASPAN3, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384705, "", "Reiscrizioni da Impegno", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN3, "133CBBFB-23E0-43F0-8BBA-2C827A3787BC");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN3, "NUOVASPAN3");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, BUK_STAMREIDAIMP_RPTBOX_IMPEGNO, 0, 1500, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_IMPEGNO, "1A97B9EB-348D-477B-BA17-CE117EED5F5D");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_IMPEGNO, "IMPEGNO");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_IMPEGNO, BUK_STAMREIDAIMP_SPAN_NUOVASPAN4, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Impegno", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN4, "3655A2C8-5680-4EFB-A1D5-3FE8F9A1CD0E");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN4, "NUOVASPAN4");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, BUK_STAMREIDAIMP_RPTBOX_IMPEGNO1, 6200, 1500, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_IMPEGNO1, "9EDAB58C-FEFF-43FC-A128-30ACA8485FF8");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_IMPEGNO1, "IMPEGNO1");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_IMPEGNO1, BUK_STAMREIDAIMP_SPAN_NUOVASPAN5, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Capitolo/Art.", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN5, "B8D0AC59-F3D0-4651-9B69-A4F1A837647C");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN5, "NUOVASPAN5");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, BUK_STAMREIDAIMP_RPTBOX_COMPETENZA1, 13200, 1500, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA1, "50F369B5-D088-4947-AAF0-2D4AF2222DB8");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA1, "COMPETENZA1");
    BUK_STAMREIDAIMP.set_BoxAlignment(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA1, 4);
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA1, BUK_STAMREIDAIMP_SPAN_NUOVASPAN6, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Competenza", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN6, "1407B5C0-8744-4A4E-89B6-0B56A0F6462E");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN6, "NUOVASPAN6");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_INTESTPAGIN1, BUK_STAMREIDAIMP_RPTBOX_CASSA1, 16200, 1500, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_CASSA1, "072460AD-4797-4A3A-9EAE-F98970D1E669");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_CASSA1, "CASSA1");
    BUK_STAMREIDAIMP.set_BoxAlignment(BUK_STAMREIDAIMP_RPTBOX_CASSA1, 4);
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_CASSA1, BUK_STAMREIDAIMP_SPAN_NUOVASPAN7, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Cassa", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN7, "E018C10C-0E86-4478-93DE-6B135E536FFF");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN7, "NUOVASPAN7");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORDIMPEGN");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, "4969FEBA-27AD-4423-8E04-F5D2351D712B");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, "IMPEINTEGRUP");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, BUK_STAMREIDAIMP_RPTBOX_IMP, 0, 0, 1800, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_IMP, "0DC4C24B-BDB5-4677-A02E-D52B28C6DB36");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_IMP, "IMP");
    BUK_STAMREIDAIMP.set_BoxAlignment(BUK_STAMREIDAIMP_RPTBOX_IMP, 4);
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_IMP, BUK_STAMREIDAIMP_SPAN_NUOVASPAN8, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384705, "", "12345/2013", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_NUOVASPAN8, "B0ED1E13-D431-4251-9603-FA1C11021090");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_NUOVASPAN8, "NUOVASPAN8");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, BUK_STAMREIDAIMP_RPTBOX_CAPITOLO, 6200, 0, 3000, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_CAPITOLO, "B5D30A9A-FF1F-4D75-A73D-F83C3E25CF71");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_CAPITOLO, "CAPITOLO");
    BUK_STAMREIDAIMP.set_BoxAlignment(BUK_STAMREIDAIMP_RPTBOX_CAPITOLO, 2);
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_CAPITOLO, BUK_STAMREIDAIMP_SPAN_REBIPRDISRDI, MyGlb.VIS_DEFAREPOSTYL, 5, 199, 0, 271384961, "1234567894564567/12", "::RECORDBILPEG", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_REBIPRDISRDI, "DD884A68-08E4-4213-83AC-BD31FD8E6C43");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_REBIPRDISRDI, "REBIPRDISRDI");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, BUK_STAMREIDAIMP_RPTBOX_DESC1, 1900, 0, 4100, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_DESC1, "6C53A1F7-8E4B-4309-83A5-59297CB4B198");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_DESC1, "DESC1");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_DESC1, BUK_STAMREIDAIMP_SPAN_REIMDRDISRDI, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Desc", "::RECORIMPDESC", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_REIMDRDISRDI, "148E8EE3-D91F-45F5-8840-9240292DF76D");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_REIMDRDISRDI, "REIMDRDISRDI");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, BUK_STAMREIDAIMP_RPTBOX_DESCIMP, 9300, 0, 3600, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_DESCIMP, "5A01E658-94B9-4B60-9475-39BFA90D51F2");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_DESCIMP, "DESCIMP");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_DESCIMP, BUK_STAMREIDAIMP_SPAN_REDECRDISRDI, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "Desc Imp", "::DESCCAP", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_REDECRDISRDI, "1C91FC64-8B45-4353-8915-2CFF28C21835");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_REDECRDISRDI, "REDECRDISRDI");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, BUK_STAMREIDAIMP_SEC_DETTAGLIO1, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_DETTAGLIO1, BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_DETTAGLIO1, "1276B45A-6D17-4D61-AAB1-A99E9A8327CF");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_DETTAGLIO1, "DETTAGLIO1");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_DETTAGLIO1, BUK_STAMREIDAIMP_RPTBOX_COMPETENZA, 13200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA, "50CFF4CB-D62C-4A14-BB75-4DC4F567EAB2");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA, "COMPETENZA");
    BUK_STAMREIDAIMP.set_BoxAlignment(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA, 4);
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_COMPETENZA, BUK_STAMREIDAIMP_SPAN_REVAIRDISRDI, MyGlb.VIS_IMPORTOA8, 3, 14, 6, 271384705, "123.456.789.123,12", "::RECOVARCIMPO", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_REVAIRDISRDI, "D65FE6A0-96FF-4E6E-95CE-FAB7A19C7FDB");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_REVAIRDISRDI, "REVAIRDISRDI");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_DETTAGLIO1, BUK_STAMREIDAIMP_RPTBOX_CASSA, 16200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_CASSA, "FEDAE38C-27A1-4412-AEAA-752871012BD1");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_CASSA, "CASSA");
    BUK_STAMREIDAIMP.set_BoxAlignment(BUK_STAMREIDAIMP_RPTBOX_CASSA, 4);
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_CASSA, BUK_STAMREIDAIMP_SPAN_REVICRDISRDI, MyGlb.VIS_IMPORTOA8, 3, 14, 6, 271384705, "123.456.789.123,12", "::RECVARIMPCAS", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_REVICRDISRDI, "C6D6803B-01CC-47EB-8976-313C6D167CCC");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_REVICRDISRDI, "REVICRDISRDI");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, BUK_STAMREIDAIMP_SEC_IMPEPIEDGRUP, 800, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORDIMPEGN");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_IMPEPIEDGRUP, BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_IMPEPIEDGRUP, "ECA8E75E-DD5E-459B-94B0-CE19D0614713");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_IMPEPIEDGRUP, "IMPEPIEDGRUP");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_IMPEPIEDGRUP, BUK_STAMREIDAIMP_RPTBOX_SUB, 0, 0, 19000, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_SUB, "5CE99B9F-C0C5-4689-87CA-2864B5BA02D7");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_SUB, "SUB");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, BUK_STAMREIDAIMP_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_PIEDEPAGINA, BUK_STAMREIDAIMP_RPTBOX_PIEDEPAGINA);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_PIEDEPAGINA, "5FB8C451-7327-4CCA-8954-60CFA68F053A");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT1, BUK_STAMREIDAIMP_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_PIEDEREPORT, BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_PIEDEREPORT, "2DDF00FC-18ED-4AC9-9E80-75F81CD3FBBA");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_STAMREIDAIMP.AddReportGroup(BUK_STAMREIDAIMP_SEC_IMPEINTEGRUP, "RECORDIMPEGN");
    BUK_STAMREIDAIMP_RPT_NUOVOREPORT1_InitQuery(false, true);
  }

  private void BUK_STAMREIDAIMP_RPT_NUOVOREPORT_InitQuery() { BUK_STAMREIDAIMP_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_STAMREIDAIMP_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(A.IMPORTO) as IMPORTO, ");
      SQL.append("  SUM(A.IMPORTO_CASSA) as COMPETENZA, ");
      SQL.append("  MAX(A_GET_DESCRIZIONE_CAP(A.ESERCIZIO,A.E_S,A.CAPITOLO,A.ARTICOLO)) as DESC1 ");
      SQL.append("from ");
      SQL.append("  VARCOM A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (~~PQRY_PARFS1.NOMOGGPRODEF~~ = 'D') ");
      SQL.append("and   (A.E_S = 'S') ");
      SQL.append("and   (A.NUMERO_IMP = ~~" + BUK_STAMREIDAIMP_RPT_NUOVOREPORT1 + ".RECVARNUMIMP~~) ");
      SQL.append("and   (A.ANNO_IMP = ~~" + BUK_STAMREIDAIMP_RPT_NUOVOREPORT1 + ".RECVARANNIMP~~) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  T54 B, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL C, ");
      SQL.append("  TIPI_IMPORTO_VBIL D ");
      SQL.append("where (B.CODICE = A.TIPO_VAR) ");
      SQL.append("and   (C.CODICE = B.TIPOLOGIA) ");
      SQL.append("and   (D.CODICE = C.TIPO_IMPORTO) ");
      SQL.append("and   (D.TIPO_REISCRIZIONE = 'IMP') ");
      SQL.append(")))) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  SUM(E.IMPORTO), ");
      SQL.append("  SUM(E.IMPORTO_CASSA), ");
      SQL.append("  MAX(A_GET_DESCRIZIONE_CAP(E.ESERCIZIO,E.E_S,E.CAPITOLO,E.ARTICOLO)) ");
      SQL.append("from ");
      SQL.append("  VARCOMPRO E ");
      SQL.append("where (E.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (~~PQRY_PARFS1.NOMOGGPRODEF~~ = 'P') ");
      SQL.append("and   (E.E_S = 'S') ");
      SQL.append("and   (E.NUMERO_IMP = ~~" + BUK_STAMREIDAIMP_RPT_NUOVOREPORT1 + ".RECVARNUMIMP~~) ");
      SQL.append("and   (E.ANNO_IMP = ~~" + BUK_STAMREIDAIMP_RPT_NUOVOREPORT1 + ".RECVARANNIMP~~) ");
      SQL.append("and   (NOT (EXISTS(");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  1 ");
      SQL.append("from ");
      SQL.append("  T54 F, ");
      SQL.append("  TIPI_MOTIVAZIONE_VBIL G, ");
      SQL.append("  TIPI_IMPORTO_VBIL H ");
      SQL.append("where (F.CODICE = E.TIPO_VAR) ");
      SQL.append("and   (G.CODICE = F.TIPOLOGIA) ");
      SQL.append("and   (H.CODICE = G.TIPO_IMPORTO) ");
      SQL.append("and   (H.TIPO_REISCRIZIONE = 'IMP') ");
      SQL.append(")))) ");
      BUK_STAMREIDAIMP.SetReportQuery(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "60DC40F4-6C5C-46E8-ACBF-A3897F8E81EA");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_STAMREIDAIMP_RPT_NUOVOREPORT_Init()
  {
    BUK_STAMREIDAIMP.InitReport(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, 196609);
    BUK_STAMREIDAIMP.SetSubReportBox(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, BUK_STAMREIDAIMP_RPTBOX_SUB);
    BUK_STAMREIDAIMP_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, "ABF5D6CB-AF9E-4AE2-A33B-7A562025892D");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, BUK_STAMREIDAIMP_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_INTESTREPORT, BUK_STAMREIDAIMP_RPTBOX_SUB);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_INTESTREPORT, "8F0FFA02-66B6-40F2-A4DA-AC6B327B17FF");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, BUK_STAMREIDAIMP_SEC_INTESTPAGINA, 0, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_INTESTPAGINA, BUK_STAMREIDAIMP_RPTBOX_SUB);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_INTESTPAGINA, "7FBA7235-99EC-4A69-97E1-68819DFC0743");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, BUK_STAMREIDAIMP_SEC_DETTAGLIO, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_DETTAGLIO, BUK_STAMREIDAIMP_RPTBOX_SUB);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_DETTAGLIO, "0FC0AC3E-4630-44EB-A877-5301892AF330");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_DETTAGLIO, BUK_STAMREIDAIMP_RPTBOX_DESC, 9300, 100, 3600, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_DESC, "981D3D1C-56CD-4DA2-9854-88627DA7BFAE");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_DESC, "DESC");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_DESC, BUK_STAMREIDAIMP_SPAN_REDEREDISRDI, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "Desc", "::DESC1", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_REDEREDISRDI, "D4C0B052-A968-414A-B7C3-B05A46789F85");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_REDEREDISRDI, "REDEREDISRDI");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_DETTAGLIO, BUK_STAMREIDAIMP_RPTBOX_COMO, 13200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_COMO, "7C08A674-55CA-4EE4-8566-8E08811E5CE1");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_COMO, "COMO");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_COMO, BUK_STAMREIDAIMP_SPAN_REIMREDISRDI, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "12", "::IMPORTO", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_REIMREDISRDI, "AFAE76EF-9B73-4E86-9E25-1E8E1E42CA0F");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_REIMREDISRDI, "REIMREDISRDI");
    BUK_STAMREIDAIMP.InitReportBox(BUK_STAMREIDAIMP_SEC_DETTAGLIO, BUK_STAMREIDAIMP_RPTBOX_COMO1, 16200, 100, 2800, 400, 0, 1, 1, MyGlb.VIS_IMPORTOA8, 983041, 340, "", 1, -33);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_RPTBOX_COMO1, "29C63C99-8367-4007-AF9D-0F3BFC2CD373");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_RPTBOX_COMO1, "COMO1");
    BUK_STAMREIDAIMP.InitBoxSpan(BUK_STAMREIDAIMP_RPTBOX_COMO1, BUK_STAMREIDAIMP_SPAN_RECOREDISRDI, MyGlb.VIS_IMPORTOA8, 3, 28, 6, 271384705, "12", "::COMPETENZA", 1);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SPAN_RECOREDISRDI, "3383E8F8-446E-4DEB-9F2A-467F982C1486");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SPAN_RECOREDISRDI, "RECOREDISRDI");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, BUK_STAMREIDAIMP_SEC_PIEDEPAGINA1, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_PIEDEPAGINA1, BUK_STAMREIDAIMP_RPTBOX_SUB);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_PIEDEPAGINA1, "1A8002BB-D69A-49B0-8241-13D55A79A6D7");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_PIEDEPAGINA1, "PIEDEPAGINA1");
    BUK_STAMREIDAIMP.InitSection(BUK_STAMREIDAIMP_RPT_NUOVOREPORT, BUK_STAMREIDAIMP_SEC_PIEDEREPORT1, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_STAMREIDAIMP.SetSectionRendersInto(BUK_STAMREIDAIMP_SEC_PIEDEREPORT1, BUK_STAMREIDAIMP_RPTBOX_SUB);
    BUK_STAMREIDAIMP.SetRTCGuid(BUK_STAMREIDAIMP_SEC_PIEDEREPORT1, "A22D4330-BA06-412A-AE11-8D356412E0E7");
    BUK_STAMREIDAIMP.SetObjCode(BUK_STAMREIDAIMP_SEC_PIEDEREPORT1, "PIEDEREPORT1");
    BUK_STAMREIDAIMP_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_STAMREIDAIMP_InitLinks()
  {
    BUK_STAMREIDAIMP.SetBoxNextBox(BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA, BUK_STAMREIDAIMP_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARFS) PAN_PARFS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARFS) PAN_PARFS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARFS) PAN_PARFS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARFS) PAN_PARFS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARFS) PAN_PARFS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_STAMREIDAIMP) BUK_STAMREIDAIMP_OnPreview();
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
