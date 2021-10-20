// **********************************************
// Servizi Diretti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ServiziDiretti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_SOLOINECONOM = 0;
  private static int PFL_PARAMETRI_SOLDOMINDPRO = 1;

  private static int PPQRY_PARAMETRI254 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_SERVIZDIRETT_SERVIZIO = 0;
  private static int PFL_SERVIZDIRETT_DESCRIZIONE = 1;
  private static int PFL_SERVIZDIRETT_TIPO = 2;
  private static int PFL_SERVIZDIRETT_ECONOMIA = 3;
  private static int PFL_SERVIZDIRETT_CODICERTPREV = 4;
  private static int PFL_SERVIZDIRETT_UTENTEINSERI = 5;
  private static int PFL_SERVIZDIRETT_DATAINSERIME = 6;
  private static int PFL_SERVIZDIRETT_UTENTULTIAGG = 7;
  private static int PFL_SERVIZDIRETT_DATAULTIMAGG = 8;

  private static int PPQRY_T76 = 0;


  IDPanel PAN_SERVIZDIRETT;
  CIDREObj BUK_SERVDIREBOOK;
  OBook BKW_SERVDIREBOOK;
  //
  // Template Pages constants
  private static int BUK_SERVDIREBOOK_MST_DEFDEISEDIPA = 1;
  private static int BUK_SERVDIREBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_SERVDIREBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_SERVDIREBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_SERVDIREBOOK_SPAN_TITOLO = 5;
  private static int BUK_SERVDIREBOOK_RPTBOX_PAGEBODY = 6;
  private static int BUK_SERVDIREBOOK_RPTBOX_PAGEFOOTER = 7;

  //
  // Reports constants
  private static int BUK_SERVDIREBOOK_RPT_DEFDEISERDIR = 8;
  private static int BUK_SERVDIREBOOK_SEC_REPORTHEADER = 9;
  private static int BUK_SERVDIREBOOK_SEC_PAGEHEADER = 10;
  private static int BUK_SERVDIREBOOK_RPTBOX_CODICEHEADER = 11;
  private static int BUK_SERVDIREBOOK_SPAN_CODICE = 12;
  private static int BUK_SERVDIREBOOK_RPTBOX_DESCRIHEADER = 13;
  private static int BUK_SERVDIREBOOK_SPAN_DESCRIZIONE = 14;
  private static int BUK_SERVDIREBOOK_RPTBOX_TIPOHEADER = 15;
  private static int BUK_SERVDIREBOOK_SPAN_TIPO = 16;
  private static int BUK_SERVDIREBOOK_RPTBOX_ECONOIVAHEAD = 17;
  private static int BUK_SERVDIREBOOK_SPAN_ECONOMIAIVA = 18;
  private static int BUK_SERVDIREBOOK_SEC_DETAIL = 19;
  private static int BUK_SERVDIREBOOK_RPTBOX_CODICE = 20;
  private static int BUK_SERVDIREBOOK_SPAN_RET7COSDDDSD = 21;
  private static int BUK_SERVDIREBOOK_RPTBOX_DESCRIZIONE = 22;
  private static int BUK_SERVDIREBOOK_SPAN_RET7DESDDDSD = 23;
  private static int BUK_SERVDIREBOOK_RPTBOX_TIPO = 24;
  private static int BUK_SERVDIREBOOK_SPAN_RET7TISDDDSD = 25;
  private static int BUK_SERVDIREBOOK_RPTBOX_ECONOMIAIVA = 26;
  private static int BUK_SERVDIREBOOK_SPAN_NVRTEISDSDBN = 27;
  private static int BUK_SERVDIREBOOK_SEC_PAGEFOOTER = 28;
  private static int BUK_SERVDIREBOOK_SEC_REPORTFOOTER = 29;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI251(IMDB);
    //
    //
    Init_PQRY_PARAMETRI254(IMDB);
    Init_PQRY_PARAMETRI254_RS(IMDB);
    Init_PQRY_T76(IMDB);
    Init_PQRY_T75(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI251(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI251, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI251, "TBL_PARAMETRI251");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI251,IMDBDef2.FLD_PARAMETRI251_PARASOLINECO, "PARASOLINECO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI251,IMDBDef2.FLD_PARAMETRI251_PARASOLINECO,5,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI251,IMDBDef2.FLD_PARAMETRI251_PARSOLDOINPR, "PARSOLDOINPR");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI251,IMDBDef2.FLD_PARAMETRI251_PARSOLDOINPR,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI251, 0);
  }

  private static void Init_PQRY_PARAMETRI254(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI254, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI254, "PQRY_PARAMETRI254");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI254,IMDBDef9.PQSL_PARAMETRI254_PARASOLINECO, "PARASOLINECO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI254,IMDBDef9.PQSL_PARAMETRI254_PARASOLINECO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI254,IMDBDef9.PQSL_PARAMETRI254_PARSOLDOINPR, "PARSOLDOINPR");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI254,IMDBDef9.PQSL_PARAMETRI254_PARSOLDOINPR,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI254, 0);
  }

  private static void Init_PQRY_PARAMETRI254_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI254_RS, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI254_RS, "PQRY_PARAMETRI254_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI254_RS,IMDBDef9.PQSL_PARAMETRI254_PARASOLINECO, "PARASOLINECO");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI254_RS,IMDBDef9.PQSL_PARAMETRI254_PARASOLINECO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI254_RS,IMDBDef9.PQSL_PARAMETRI254_PARSOLDOINPR, "PARSOLDOINPR");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI254_RS,IMDBDef9.PQSL_PARAMETRI254_PARSOLDOINPR,5,2,0);
  }

  private static void Init_PQRY_T76(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T76, 9);
    IMDB.set_TblCode(IMDBDef9.PQRY_T76, "PQRY_T76");
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_ECONOMIA_IVA, "ECONOMIA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_ECONOMIA_IVA,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_CODICE_CP, "CODICE_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_CODICE_CP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T76,IMDBDef9.PQSL_T76_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T76, 0);
  }

  private static void Init_PQRY_T75(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T75, 4);
    IMDB.set_TblCode(IMDBDef9.PQRY_T75, "PQRY_T75");
    IMDB.set_FldCode(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_CODICE,1,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_ECONOMIA_IVA, "ECONOMIA_IVA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T75,IMDBDef9.PQSL_T75_ECONOMIA_IVA,5,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T75, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ServiziDiretti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ServiziDiretti()
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
    FormIdx = MyGlb.FRM_SERVIZDIRETT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8F20D158-7F11-4D81-953B-849735CEE72F";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 668;
    DesignHeight = 418;
    set_Caption(new IDVariant("Servizi Diretti"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 668;
    Frames[1].Height = 392;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0816327;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 668;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 668;
    Frames[2].FixedHeight = 32;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 668-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "21C3CB9D-CBA0-4242-8540-220D2C200772");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 96, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 668;
    Frames[3].Height = 360;
    Frames[3].Caption = "Servizi Diretti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 360;
    PAN_SERVIZDIRETT = new IDPanel(w, this, 3, "PAN_SERVIZDIRETT");
    Frames[3].Content = PAN_SERVIZDIRETT;
    PAN_SERVIZDIRETT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SERVIZDIRETT.VS = MainFrm.VisualStyleList;
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 668-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D2F641AF-DA83-41F8-985E-6A6630B2497B");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 600, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SERVIZDIRETT.InitStatus = 2;
    PAN_SERVIZDIRETT_Init();
    PAN_SERVIZDIRETT_InitFields();
    PAN_SERVIZDIRETT_InitQueries();
    BKW_SERVDIREBOOK = new OBook(this);
    BUK_SERVDIREBOOK = new CIDREObj(BKW_SERVDIREBOOK);
    BKW_SERVDIREBOOK.iGuid = "CF53EEAA-BEE2-43D0-936C-09D96B5ABE39";
    BKW_SERVDIREBOOK.Code = "BUK_SERVDIREBOOK";
    BKW_SERVDIREBOOK.BookObj = BUK_SERVDIREBOOK;
    BKW_SERVDIREBOOK.InitDefMasks();
    BUK_SERVDIREBOOK.InitBook(1, 1245441, "Servizi Diretti Book", IMDB, MainFrm.VisualStyleList);
    BUK_SERVDIREBOOK.InitHTML();
    BUK_SERVDIREBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SERVDIREBOOK.Book.SetMainFrm(MainFrm);
    BUK_SERVDIREBOOK.SetRTCGuid(0, "CF53EEAA-BEE2-43D0-936C-09D96B5ABE39");
    BUK_SERVDIREBOOK.SetObjCode(0, "SERVDIREBOOK");
    BUK_SERVDIREBOOK_MST_DEFDEISEDIPA_Init();
    BUK_SERVDIREBOOK_RPT_DEFDEISERDIR_Init();
    BUK_SERVDIREBOOK_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGGI76+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI91+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGGI76+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_APRIREPORT+BaseCmdLinIdx)
      {
        ApriReport();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ATAISEDOINPR+BaseCmdLinIdx)
      {
        AttribAiServiziDomIndProd();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ATTAISERINEC+BaseCmdLinIdx)
      {
        AttribAiServiziInEconomia();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ATTRDAESEPRE+BaseCmdLinIdx)
      {
        AttribDaEsercizioPrecedente();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI251, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SERVIZDIRETT_PARAMETRI254();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_SERVIZDIRETT.UpdatePanel(MainFrm);
      // BUK_SERVDIREBOOK.UpdateBook();
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
    if (Code.equals("BUK_SERVDIREBOOK")) return BUK_SERVDIREBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ServiziDiretti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ServiziDiretti.class.getName() : (Glb.ClassWithPackage(ServiziDiretti.class) ? ServiziDiretti.class.getName().substring(ServiziDiretti.class.getPackage().getName().length() + 1) : ServiziDiretti.class.getName()));
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      PAN_SERVIZDIRETT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_SERVIZDIRETT.SetCommandEnabled((new IDVariant(1)).intValue(), (new IDVariant(0)).booleanValue()); 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI251, IMDBDef2.FLD_PARAMETRI251_PARASOLINECO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI251, IMDBDef2.FLD_PARAMETRI251_PARSOLDOINPR, 0, (new IDVariant()));
      PAN_SERVIZDIRETT.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SERVIZDIRETT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SERVIZDIRETT);
      // 
      // Servizi Diretti On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_SERVIZDIRETT.IsNewRow())
      {
        PAN_SERVIZDIRETT.SetFlags (Glb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SERVIZDIRETT.SetFlags (Glb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_SERVIZDIRETT.set_ToolTip(Glb.OBJ_FIELD,PFL_SERVIZDIRETT_DESCRIZIONE,(new IDVariant(PAN_SERVIZDIRETT.FieldText(PFL_SERVIZDIRETT_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "ServiziDirettiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti On Change Row Event
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_SERVIZDIRETT_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi Diretti On Change Row Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_TIPO, 0)))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ATAISEDOINPR+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ATAISEDOINPR+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_ECONOMIA_IVA, 0)))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ATTAISERINEC+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ATTAISERINEC+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "ServiziDirettiOnChangeRowEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_SERVIZDIRETT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi Diretti On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.T75PD(IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
        }
        PAN_SERVIZDIRETT.set_Layout((new IDVariant(0)).intValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "ServiziDirettiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_SERVIZDIRETT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SERVIZDIRETT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Servizi Diretti On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "ServiziDirettiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_SERVIZDIRETT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi Diretti On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_TIPO, 0)) && IDL.IsNull(PAN_SERVIZDIRETT.GetLastValue(PFL_SERVIZDIRETT_TIPO)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_TIPO, 0, (new IDVariant("D")));
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_UTENTE_INSERIMENTO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_DATA_INSERIMENTO, 0)))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
          IMDB.set_Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_DATA_INSERIMENTO, 0, IDL.Today());
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_UTENTE_ULTIMO_AGG, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        }
        if (IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_DATA_ULTIMO_AGG, 0).compareTo(IDL.Today(), true)!=0)
        {
          IMDB.set_Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_DATA_ULTIMO_AGG, 0, IDL.Today());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "ServiziDirettiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi Diretti On Change Status Event
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status: E' un numero intero che rappresenta lo stato precedente del pannello. Deve essere confrontato con i valori della lista PanelStatus. - Input
  // **********************************************************************
  private void PAN_SERVIZDIRETT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi Diretti On Change Status Event Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_SERVIZDIRETT.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET3+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET3+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "ServiziDirettiOnChangeStatusEvent", _e);
    }
  }

  // **********************************************************************
  // Attrib Ai Servizi Dom Ind Prod
  // **********************************************************************
  public int AttribAiServiziDomIndProd ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attrib Ai Servizi Dom Ind Prod Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI, 0, IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_CODICE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARADESCSERV, 0, IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_DESCRIZIONE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0, IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_TIPO, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMINECONO, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_ATTRIALSERVI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "AttribAiServiziDomIndProd", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Attrib Ai Servizi In Economia
  // **********************************************************************
  public int AttribAiServiziInEconomia ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attrib Ai Servizi In Economia Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMSERVIZI, 0, IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_CODICE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARADESCSERV, 0, IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_DESCRIZIONE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMTIPO, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI252, IMDBDef2.FLD_PARAMETRI252_PARAMINECONO, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_ATTRIALSERVI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "AttribAiServiziInEconomia", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Attrib Da Esercizio Precedente
  // **********************************************************************
  public int AttribDaEsercizioPrecedente ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Attrib Da Esercizio Precedente Body
      // Procedure Body
      // 
      if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(2)), true)<0)
      {
        IDVariant v_NUMRECPREC = new IDVariant(0,IDVariant.INTEGER);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        v_NUMRECPREC = (new IDVariant(0));
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  SERCOS A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " - 1) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_NUMRECPREC = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0 || v_NUMRECPREC.equals((new IDVariant(0)), true))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Non esistono dati nella tabella dei servizi attribuiti per l'esercizio ", IDVariant.STRING));
          MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IDL.Sub(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)))))); 
        }
        else
        {
          IDVariant v_NUMRECESE = new IDVariant(0,IDVariant.INTEGER);
          v_NUMRECESE = (new IDVariant(0));
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  SERCOS A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_NUMRECESE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0 || v_NUMRECESE.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Attribuzioni già presenti per l'esercizio ", IDVariant.STRING));
            MainFrm.set_AlertMessage(IDL.Add(v_AVVISO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))); 
          }
          else
          {
            MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
            MainFrm.Cf4armDBObject.COPIASERCOS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_T76, IMDBDef9.PQSL_T76_CODICE, 0));
            if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
            {
              MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
            }
            else
            {
              IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
              v_AVVISO = (new IDVariant("Elaborazione eseguita!", IDVariant.STRING));
              MainFrm.set_AlertMessage(v_AVVISO); 
            }
          }
        }
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non è consentito effettuare questa operazione nella fase di bilancio corrente!", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "AttribDaEsercizioPrecedente", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Report
  // **********************************************************************
  public int ApriReport ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Report Body
      // Procedure Body
      // 
      BUK_SERVDIREBOOK.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_SERVDIREBOOK.ReportRefreshQuery(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR);
      BUK_SERVDIREBOOK.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_SERVDIREBOOK.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ServiziDiretti", "ApriReport", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SERVIZDIRETT_PARAMETRI254() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI254_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI251, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI251, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI254_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI254_RS, 0, IMDBDef2.TBL_PARAMETRI251, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI254_RS, 0, 0, IMDBDef2.TBL_PARAMETRI251, IMDBDef2.FLD_PARAMETRI251_PARASOLINECO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI254_RS, 1, 0, IMDBDef2.TBL_PARAMETRI251, IMDBDef2.FLD_PARAMETRI251_PARSOLDOINPR, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI251, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI251, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI251, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI254_RS, 0);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SERVIZDIRETT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SERVIZDIRETT, Cancel);
    // Stub
  }

  private void PAN_SERVIZDIRETT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SERVIZDIRETT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SERVIZDIRETT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SERVIZDIRETT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SERVIZDIRETT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_SERVDIREBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SERVDIREBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SERVDIREBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_SERVDIREBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_SERVDIREBOOK_SEC_DETAIL)
    {
      BUK_SERVDIREBOOK.set_SpanValue(BUK_SERVDIREBOOK_SPAN_NVRTEISDSDBN, new IDVariant(IDL.NullValue(BUK_SERVDIREBOOK.GetReportColumn(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, "ECONOMIA_IVA"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_SERVDIREBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_SERVDIREBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_SERVDIREBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SERVDIREBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SERVDIREBOOK_MST_DEFDEISEDIPA)
    {
      BUK_SERVDIREBOOK.set_SpanValue(BUK_SERVDIREBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SERVDIREBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SERVDIREBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_SERVDIREBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SERVDIREBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SERVDIREBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SERVDIREBOOK_OnPreview()
  {
    PreviewBook = BKW_SERVDIREBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, "FF09E0CE-29B3-4E36-8FB3-42C9D4D8429E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, "Solo In Economia");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, "7A50BE7D-696C-44C0-92F5-5ED51E1AE485");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, "Solo Dom. Ind./Produttivi");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_LIST, "Sl. In Econ.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_FORM, 16, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOINECONOM, MyGlb.PANEL_FORM, "Solo In Economia");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOINECONOM, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOINECONOM, PPQRY_PARAMETRI254, "A.PARASOLINECO", "PARASOLINECO", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOINECONOM, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOINECONOM, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_LIST, 48, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_LIST, "Sl. Dm. In. Prd.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_FORM, 156, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_FORM, 152);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLDOMINDPRO, MyGlb.PANEL_FORM, "Solo Dom. Ind./Produttivi");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLDOMINDPRO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLDOMINDPRO, PPQRY_PARAMETRI254, "A.PARSOLDOINPR", "PARSOLDOINPR", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLDOMINDPRO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLDOMINDPRO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI254", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI254, IMDBDef9.PQRY_PARAMETRI254_RS, IMDBDef2.TBL_PARAMETRI251);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOINECONOM, IMDBDef2.FLD_PARAMETRI251_PARASOLINECO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLDOMINDPRO, IMDBDef2.FLD_PARAMETRI251_PARSOLDOINPR);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI251");
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

  private void PAN_SERVIZDIRETT_Init()
  {

    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_FIELD, 9);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, "7150CA27-271B-4A0F-8922-3B70EFB60DBB");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, "Servizio");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, "3FFE1497-3C8A-40BF-8F4A-EAA8DD76B100");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, "Descrizione");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, "145F6A6C-BE14-406C-8C14-BE7B5502A8F9");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, "Tipo");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, "C3660348-734E-41B2-A95D-B60B802F3421");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, "Economia");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.VIS_CHECKSTYLE);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, "1A5B121C-ADCF-4D87-9CE8-E325BBD923BC");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, "Codice Certificato Prev.");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, "39C7BA71-31BF-4853-96CB-197B7EE10157");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, "3FE8DF4C-5C73-4716-A692-4BBA37C7E925");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, "47848382-00F4-4F01-9F55-9281B993D3A7");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZDIRETT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, "25FA24B9-3786-4126-82AE-C5EEF4A4644B");
    PAN_SERVIZDIRETT.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_SERVIZDIRETT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, "");
    PAN_SERVIZDIRETT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZDIRETT.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SERVIZDIRETT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, 48);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, 80, 12, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, 76);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_SERVIZIO, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_SERVIZIO, PPQRY_T76, "A.CODICE", "CODICE", 1, 3, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, 60, 36, 224, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, 64, 40, 540, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, 92);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_DESCRIZIONE, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_DESCRIZIONE, PPQRY_T76, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, 284, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, 100, 68, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, 56);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_TIPO, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_TIPO, PPQRY_T76, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_TIPO, (new IDVariant("P")), "Produttivo", "", "", -1);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_TIPO, (new IDVariant("G")), "Generale/Istituzionale", "", "", -1);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_TIPO, (new IDVariant("D")), "A domanda individuale", "", "", -1);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_LIST, 424, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_LIST, 84);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_LIST, "Economia");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_FORM, 68, 96, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_FORM, 88);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_ECONOMIA, MyGlb.PANEL_FORM, "Economia");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_ECONOMIA, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_ECONOMIA, PPQRY_T76, "A.ECONOMIA_IVA", "ECONOMIA_IVA", 5, 2, 0, -13997);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_ECONOMIA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SERVIZDIRETT.SetValueListItem(PFL_SERVIZDIRETT_ECONOMIA, (new IDVariant()), "Null", "", "", -1);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_LIST, 488, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_LIST, 64);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_LIST, "Codice Certificato Prev.");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_FORM, 152);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_CODICERTPREV, MyGlb.PANEL_FORM, "Codice Certificato Prev.");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_CODICERTPREV, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_CODICERTPREV, PPQRY_T76, "A.CODICE_CP", "CODICE_CP", 1, 5, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 148, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_UTENTEINSERI, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_UTENTEINSERI, PPQRY_T76, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_DATAINSERIME, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_DATAINSERIME, PPQRY_T76, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 148, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_UTENTULTIAGG, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_UTENTULTIAGG, PPQRY_T76, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_SERVIZDIRETT.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 148, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZDIRETT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_SERVIZDIRETT.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZDIRETT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZDIRETT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_SERVIZDIRETT.SetFieldPage(PFL_SERVIZDIRETT_DATAULTIMAGG, -1, -1);
    PAN_SERVIZDIRETT.SetFieldPanel(PFL_SERVIZDIRETT_DATAULTIMAGG, PPQRY_T76, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_SERVIZDIRETT_InitQueries()
  {
    StringBuffer SQL;

    PAN_SERVIZDIRETT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SERVIZDIRETT.SetIMDB(IMDB, "PQRY_T76", true);
    PAN_SERVIZDIRETT.set_SetString(MyGlb.MASTER_ROWNAME, "T75");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.ECONOMIA_IVA as ECONOMIA_IVA, ");
    SQL.append("  A.CODICE_CP as CODICE_CP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_SERVIZDIRETT.SetQuery(PPQRY_T76, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T75 A ");
    PAN_SERVIZDIRETT.SetQuery(PPQRY_T76, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where ((~~PQRY_PARAMETRI254.PARASOLINECO~~ = 'SI' AND A.ECONOMIA_IVA = 'SI') OR (~~PQRY_PARAMETRI254.PARASOLINECO~~ IS NULL)) ");
    SQL.append("and   ((~~PQRY_PARAMETRI254.PARSOLDOINPR~~ = 'SI' AND (A.TIPO = 'G' OR A.TIPO = 'D' OR A.TIPO = 'P')) OR (~~PQRY_PARAMETRI254.PARSOLDOINPR~~ IS NULL)) ");
    PAN_SERVIZDIRETT.SetQuery(PPQRY_T76, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZDIRETT.SetQuery(PPQRY_T76, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZDIRETT.SetQuery(PPQRY_T76, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_SERVIZDIRETT.SetQuery(PPQRY_T76, 5, SQL, -1, "");
    PAN_SERVIZDIRETT.SetQueryDB(PPQRY_T76, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SERVIZDIRETT.SetMasterTable(0, "T75");
    PAN_SERVIZDIRETT.AddToSortList(PFL_SERVIZDIRETT_SERVIZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SERVIZDIRETT.Status() == 2)
    {
      int oldListQBE = PAN_SERVIZDIRETT.iUseListQBE;
      PAN_SERVIZDIRETT.iUseListQBE = 0;
      PAN_SERVIZDIRETT.PanelCommand(Glb.PCM_SEARCH);
      PAN_SERVIZDIRETT.PanelCommand(Glb.PCM_FIND);
      PAN_SERVIZDIRETT.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_SERVDIREBOOK_MST_DEFDEISEDIPA_Init()
  {
    BUK_SERVDIREBOOK.InitMastro(BUK_SERVDIREBOOK_MST_DEFDEISEDIPA, 3, 21000, 29700, 1, 1, 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_MST_DEFDEISEDIPA, "766D36FE-4D2D-43F0-951E-D73FB207433E");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_MST_DEFDEISEDIPA, "DEFDEISEDIPA");
    BUK_SERVDIREBOOK.InitMastroBox(BUK_SERVDIREBOOK_MST_DEFDEISEDIPA, BUK_SERVDIREBOOK_RPTBOX_NUMEROPAGINA, 18100, 500, 1900, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_NUMEROPAGINA, "3E4D634A-2305-4F55-B420-67F8EEB4171B");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_NUMEROPAGINA, BUK_SERVDIREBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_NUMEROPAGINA, "012C6EFE-E5A4-45A0-B7D5-CCAADE5936FC");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SERVDIREBOOK.InitMastroBox(BUK_SERVDIREBOOK_MST_DEFDEISEDIPA, BUK_SERVDIREBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1200, 0, 3, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_PAGEHEADER, "1AEEB7D1-E8A8-4FCF-9FAD-B950D2399415");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_PAGEHEADER, BUK_SERVDIREBOOK_SPAN_TITOLO, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271319425, "", "Servizi Diretti", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_TITOLO, "85044CE0-A8BE-44CB-AE93-2A0AC4E9E01F");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_TITOLO, "TITOLO");
    BUK_SERVDIREBOOK.InitMastroBox(BUK_SERVDIREBOOK_MST_DEFDEISEDIPA, BUK_SERVDIREBOOK_RPTBOX_PAGEBODY, 1000, 2400, 19000, 23300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_PAGEBODY, "B75E1FDC-A0E1-489A-B896-C034A51E2695");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_SERVDIREBOOK.InitMastroBox(BUK_SERVDIREBOOK_MST_DEFDEISEDIPA, BUK_SERVDIREBOOK_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_PAGEFOOTER, "AC38304A-036C-47BA-8E99-C4CA026887A3");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
  }

  private void BUK_SERVDIREBOOK_RPT_DEFDEISERDIR_InitQuery() { BUK_SERVDIREBOOK_RPT_DEFDEISERDIR_InitQuery(true, true); }
  private void BUK_SERVDIREBOOK_RPT_DEFDEISERDIR_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  A.ECONOMIA_IVA as ECONOMIA_IVA ");
      SQL.append("from ");
      SQL.append("  T75 A ");
      SQL.append("where ((~~PQRY_PARAMETRI254.PARASOLINECO~~ = 'SI' AND A.ECONOMIA_IVA = 'SI') OR (~~PQRY_PARAMETRI254.PARASOLINECO~~ IS NULL)) ");
      SQL.append("and   ((~~PQRY_PARAMETRI254.PARSOLDOINPR~~ = 'SI' AND (A.TIPO = 'G' OR A.TIPO = 'D' OR A.TIPO = 'P')) OR (~~PQRY_PARAMETRI254.PARSOLDOINPR~~ IS NULL)) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_SERVDIREBOOK.SetReportQuery(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "ADE391A7-EC8A-4CBC-B20B-AFB11F535FD9");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SERVDIREBOOK_RPT_DEFDEISERDIR_Init()
  {
    BUK_SERVDIREBOOK.InitReport(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, 196865);
    BUK_SERVDIREBOOK_RPT_DEFDEISERDIR_InitQuery(true, false);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, "E9794F92-C8C3-4703-AFF4-518940B9152C");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, "DEFDEISERDIR");
    BUK_SERVDIREBOOK.InitSection(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, BUK_SERVDIREBOOK_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_SERVDIREBOOK.SetSectionRendersInto(BUK_SERVDIREBOOK_SEC_REPORTHEADER, BUK_SERVDIREBOOK_RPTBOX_PAGEBODY);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SEC_REPORTHEADER, "DCB643BE-3218-40FA-9FBE-0DB5A436B87F");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_SERVDIREBOOK.InitSection(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, BUK_SERVDIREBOOK_SEC_PAGEHEADER, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SERVDIREBOOK.SetSectionRendersInto(BUK_SERVDIREBOOK_SEC_PAGEHEADER, BUK_SERVDIREBOOK_RPTBOX_PAGEBODY);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SEC_PAGEHEADER, "E76A9AE8-0C0E-4DA6-A9EE-DE5FDD5F6BA8");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_PAGEHEADER, BUK_SERVDIREBOOK_RPTBOX_CODICEHEADER, 0, 0, 1200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_CODICEHEADER, "334B0433-0B75-4625-95B3-CADB2658BA6A");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_CODICEHEADER, BUK_SERVDIREBOOK_SPAN_CODICE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Servizio", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_CODICE, "43FE74A4-8015-43A6-A297-18DA8BA95F9A");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_CODICE, "CODICE");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_PAGEHEADER, BUK_SERVDIREBOOK_RPTBOX_DESCRIHEADER, 1300, 0, 11000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_DESCRIHEADER, "3268506E-7742-4190-8EB9-F20D4E2E75C3");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_DESCRIHEADER, BUK_SERVDIREBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_DESCRIZIONE, "7EF82357-D3F9-42E6-9ADF-F9FC96D8AF9E");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_PAGEHEADER, BUK_SERVDIREBOOK_RPTBOX_TIPOHEADER, 12500, 0, 3100, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_TIPOHEADER, "FA1FC61D-C4B3-4A92-AE68-730072AEB408");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_TIPOHEADER, "TIPOHEADER");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_TIPOHEADER, BUK_SERVDIREBOOK_SPAN_TIPO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Tipo", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_TIPO, "256DC7F6-5C42-44C4-A7E8-4B5B9C9B182B");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_TIPO, "TIPO");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_PAGEHEADER, BUK_SERVDIREBOOK_RPTBOX_ECONOIVAHEAD, 16500, 0, 1900, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_ECONOIVAHEAD, "6E820871-F637-4826-A5BF-4BF5E946BACB");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_ECONOIVAHEAD, "ECONOIVAHEAD");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_ECONOIVAHEAD, BUK_SERVDIREBOOK_SPAN_ECONOMIAIVA, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Economia", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_ECONOMIAIVA, "9C399710-0FF1-4DA1-B192-25425D387CD3");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_ECONOMIAIVA, "ECONOMIAIVA");
    BUK_SERVDIREBOOK.InitSection(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, BUK_SERVDIREBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SERVDIREBOOK.SetSectionRendersInto(BUK_SERVDIREBOOK_SEC_DETAIL, BUK_SERVDIREBOOK_RPTBOX_PAGEBODY);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SEC_DETAIL, "2A5C0F5C-5DF5-46BE-98E1-CC54113EA04A");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SEC_DETAIL, "DETAIL");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_DETAIL, BUK_SERVDIREBOOK_RPTBOX_CODICE, 0, 0, 1200, 400, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_CODICE, "C6AE2FAD-2A4C-4858-8AB3-0957E2938037");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_CODICE, "CODICE");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_CODICE, BUK_SERVDIREBOOK_SPAN_RET7COSDDDSD, MyGlb.VIS_CAMSENBORCEN, 1, 3, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_RET7COSDDDSD, "28FEC999-EB32-45D0-B2BC-F38CC47FB17E");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_RET7COSDDDSD, "RET7COSDDDSD");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_DETAIL, BUK_SERVDIREBOOK_RPTBOX_DESCRIZIONE, 1300, 0, 11000, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_DESCRIZIONE, "0FAE31E3-BC15-474E-89DE-A988CC2576D4");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_DESCRIZIONE, BUK_SERVDIREBOOK_SPAN_RET7DESDDDSD, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_RET7DESDDDSD, "10D9A6AD-F917-42E4-BC1C-C09EE882F352");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_RET7DESDDDSD, "RET7DESDDDSD");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_DETAIL, BUK_SERVDIREBOOK_RPTBOX_TIPO, 12500, 0, 3100, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_TIPO, "CA31AD76-B389-48EB-86F4-EADB596457FF");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_TIPO, "TIPO");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_TIPO, BUK_SERVDIREBOOK_SPAN_RET7TISDDDSD, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO", 1);
    BUK_SERVDIREBOOK.SetSpanValueListItem(BUK_SERVDIREBOOK_SPAN_RET7TISDDDSD, "Produttivo", "Type the value and explain what it means.", (new IDVariant("P")), null, "", -1);
    BUK_SERVDIREBOOK.SetSpanValueListItem(BUK_SERVDIREBOOK_SPAN_RET7TISDDDSD, "Generale/Istituzionale", "Type the value and explain what it means.", (new IDVariant("G")), null, "", -1);
    BUK_SERVDIREBOOK.SetSpanValueListItem(BUK_SERVDIREBOOK_SPAN_RET7TISDDDSD, "A domanda individuale", "Type the value and explain what it means.", (new IDVariant("D")), null, "", -1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_RET7TISDDDSD, "0CB45401-73B2-4617-945C-5EE1394BFD17");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_RET7TISDDDSD, "RET7TISDDDSD");
    BUK_SERVDIREBOOK.InitReportBox(BUK_SERVDIREBOOK_SEC_DETAIL, BUK_SERVDIREBOOK_RPTBOX_ECONOMIAIVA, 17000, 0, 600, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_RPTBOX_ECONOMIAIVA, "C11F45C5-E6A0-4772-A940-82D70AC12BF8");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_RPTBOX_ECONOMIAIVA, "ECONOMIAIVA");
    BUK_SERVDIREBOOK.InitBoxSpan(BUK_SERVDIREBOOK_RPTBOX_ECONOMIAIVA, BUK_SERVDIREBOOK_SPAN_NVRTEISDSDBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_SERVDIREBOOK.SetSpanValueListItem(BUK_SERVDIREBOOK_SPAN_NVRTEISDSDBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_SERVDIREBOOK.SetSpanValueListItem(BUK_SERVDIREBOOK_SPAN_NVRTEISDSDBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SPAN_NVRTEISDSDBN, "632C1D52-234E-4CCD-8A1B-7AB58475EBF6");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SPAN_NVRTEISDSDBN, "NVRTEISDSDBN");
    BUK_SERVDIREBOOK.InitSection(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, BUK_SERVDIREBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SERVDIREBOOK.SetSectionRendersInto(BUK_SERVDIREBOOK_SEC_PAGEFOOTER, BUK_SERVDIREBOOK_RPTBOX_PAGEFOOTER);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SEC_PAGEFOOTER, "E1B9066E-BFDE-4136-BEDE-5F91BDC8B7F1");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_SERVDIREBOOK.InitSection(BUK_SERVDIREBOOK_RPT_DEFDEISERDIR, BUK_SERVDIREBOOK_SEC_REPORTFOOTER, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_SERVDIREBOOK.SetSectionRendersInto(BUK_SERVDIREBOOK_SEC_REPORTFOOTER, BUK_SERVDIREBOOK_RPTBOX_PAGEBODY);
    BUK_SERVDIREBOOK.SetRTCGuid(BUK_SERVDIREBOOK_SEC_REPORTFOOTER, "AC7DEF1F-1F94-4F56-A32A-2A8A822E8A00");
    BUK_SERVDIREBOOK.SetObjCode(BUK_SERVDIREBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SERVDIREBOOK_RPT_DEFDEISERDIR_InitQuery(false, true);
  }

  private void BUK_SERVDIREBOOK_InitLinks()
  {
    BUK_SERVDIREBOOK.SetBoxNextBox(BUK_SERVDIREBOOK_RPTBOX_PAGEBODY, BUK_SERVDIREBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_OnChangeRow();
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
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_SERVIZDIRETT) PAN_SERVIZDIRETT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SERVDIREBOOK) BUK_SERVDIREBOOK_OnPreview();
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
