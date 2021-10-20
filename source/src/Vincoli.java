// **********************************************
// Vincoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Vincoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_VINCOLI_CODICE = 0;
  private static int PFL_VINCOLI_DESCRIZIONE = 1;
  private static int PFL_VINCOLI_STAMPA = 2;
  private static int PFL_VINCOLI_RIFTESO1 = 3;
  private static int PFL_VINCOLI_RIFTESO2 = 4;
  private static int PFL_VINCOLI_RIFTESO3 = 5;
  private static int PFL_VINCOLI_CONTOCORRENT = 6;
  private static int PFL_VINCOLI_SCADENZA = 7;
  private static int PFL_VINCOLI_TIPOAVANZO = 8;
  private static int PFL_VINCOLI_NEWPANELLABE = 9;
  private static int PFL_VINCOLI_UTENTEINSERI = 10;
  private static int PFL_VINCOLI_DATAINSERIME = 11;
  private static int PFL_VINCOLI_UTENTULTIAGG = 12;
  private static int PFL_VINCOLI_DATAULTIMAGG = 13;

  private static int PPQRY_VINCOLI4 = 0;

  private static int PPQRY_TIPIAVANZO = 1;


  IDPanel PAN_VINCOLI;
  CIDREObj BUK_VINCOLIBOOK;
  OBook BKW_VINCOLIBOOK;
  //
  // Template Pages constants
  private static int BUK_VINCOLIBOOK_MST_VINCBOOKPAGE = 1;
  private static int BUK_VINCOLIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_VINCOLIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_VINCOLIBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_VINCOLIBOOK_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_VINCOLIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_VINCOLIBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_VINCOLIBOOK_SEC_TITOLO = 8;
  private static int BUK_VINCOLIBOOK_RPTBOX_TITOLO2 = 9;
  private static int BUK_VINCOLIBOOK_SPAN_FUNZIOESERVI = 10;
  private static int BUK_VINCOLIBOOK_SEC_PAGEHEADER = 11;
  private static int BUK_VINCOLIBOOK_RPTBOX_CODICEHEADER = 12;
  private static int BUK_VINCOLIBOOK_SPAN_CODICE = 13;
  private static int BUK_VINCOLIBOOK_RPTBOX_DESCRIHEADER = 14;
  private static int BUK_VINCOLIBOOK_SPAN_DESCRIZIONE = 15;
  private static int BUK_VINCOLIBOOK_RPTBOX_STAMPAHEADER = 16;
  private static int BUK_VINCOLIBOOK_SPAN_STAMPA = 17;
  private static int BUK_VINCOLIBOOK_RPTBOX_RIFTESO1HEAD = 18;
  private static int BUK_VINCOLIBOOK_SPAN_RIFTESO1 = 19;
  private static int BUK_VINCOLIBOOK_RPTBOX_SCADENHEADER = 20;
  private static int BUK_VINCOLIBOOK_SPAN_SCADENZA = 21;
  private static int BUK_VINCOLIBOOK_SEC_DETAIL = 22;
  private static int BUK_VINCOLIBOOK_RPTBOX_CODICE = 23;
  private static int BUK_VINCOLIBOOK_SPAN_VINCODVIVIBO = 24;
  private static int BUK_VINCOLIBOOK_RPTBOX_DESCRIZIONE = 25;
  private static int BUK_VINCOLIBOOK_SPAN_VINDESVIVIBO = 26;
  private static int BUK_VINCOLIBOOK_RPTBOX_STAMPA = 27;
  private static int BUK_VINCOLIBOOK_SPAN_NUVAVISTVVBN = 28;
  private static int BUK_VINCOLIBOOK_RPTBOX_RIFTESO1 = 29;
  private static int BUK_VINCOLIBOOK_SPAN_VIRITE1VIVIB = 30;
  private static int BUK_VINCOLIBOOK_RPTBOX_RIFTESO2 = 31;
  private static int BUK_VINCOLIBOOK_SPAN_VIRITE2VIVIB = 32;
  private static int BUK_VINCOLIBOOK_RPTBOX_RIFTESO3 = 33;
  private static int BUK_VINCOLIBOOK_SPAN_VIRITE3VIVIB = 34;
  private static int BUK_VINCOLIBOOK_RPTBOX_SCADENZA = 35;
  private static int BUK_VINCOLIBOOK_SPAN_VINSCAVIVIBO = 36;
  private static int BUK_VINCOLIBOOK_SEC_PAGEFOOTER = 37;
  private static int BUK_VINCOLIBOOK_SEC_REPORTFOOTER = 38;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_VINCOLI4(IMDB);
    Init_PQRY_VINCOLI3(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_VINCOLI4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VINCOLI4, 13);
    IMDB.set_TblCode(IMDBDef8.PQRY_VINCOLI4, "PQRY_VINCOLI4");
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_STAMPA, "STAMPA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_STAMPA,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_RIF_TESO_1, "RIF_TESO_1");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_RIF_TESO_1,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_RIF_TESO_2, "RIF_TESO_2");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_RIF_TESO_2,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_RIF_TESO_3, "RIF_TESO_3");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_RIF_TESO_3,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_CONTO_CORRENTE, "CONTO_CORRENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_CONTO_CORRENTE,5,20,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_SCADENZA,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_TIPO_AVANZO, "TIPO_AVANZO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_TIPO_AVANZO,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI4,IMDBDef8.PQSL_VINCOLI4_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VINCOLI4, 0);
  }

  private static void Init_PQRY_VINCOLI3(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_VINCOLI3, 8);
    IMDB.set_TblCode(IMDBDef8.PQRY_VINCOLI3, "PQRY_VINCOLI3");
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_STAMPA, "STAMPA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_STAMPA,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_RIF_TESO_1, "RIF_TESO_1");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_RIF_TESO_1,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_RIF_TESO_2, "RIF_TESO_2");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_RIF_TESO_2,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_RIF_TESO_3, "RIF_TESO_3");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_RIF_TESO_3,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_CONTO_CORRENTE, "CONTO_CORRENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_CONTO_CORRENTE,5,20,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef8.PQRY_VINCOLI3,IMDBDef8.PQSL_VINCOLI3_SCADENZA,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_VINCOLI3, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Vincoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public Vincoli()
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
    FormIdx = MyGlb.FRM_VINCOLI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "29ADF637-C2E3-4AA1-A872-208FBDC85458";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 446;
    set_Caption(new IDVariant("Vincoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 420;
    Frames[1].Caption = "Vincoli";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 420;
    PAN_VINCOLI = new IDPanel(w, this, 1, "PAN_VINCOLI");
    Frames[1].Content = PAN_VINCOLI;
    PAN_VINCOLI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VINCOLI.VS = MainFrm.VisualStyleList;
    PAN_VINCOLI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 420-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_VINCOLIBOOK != null)
      PAN_VINCOLI.SetBook(BUK_VINCOLIBOOK);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "544D4305-97A1-41F0-9D87-9AED64CED3EF");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 996, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VINCOLI.InitStatus = 2;
    PAN_VINCOLI_Init();
    PAN_VINCOLI_InitFields();
    PAN_VINCOLI_InitQueries();
    BKW_VINCOLIBOOK = new OBook(this);
    BUK_VINCOLIBOOK = new CIDREObj(BKW_VINCOLIBOOK);
    BKW_VINCOLIBOOK.iGuid = "16E0EFB4-97CD-4937-BED8-71EB2574511E";
    BKW_VINCOLIBOOK.Code = "BUK_VINCOLIBOOK";
    BKW_VINCOLIBOOK.BookObj = BUK_VINCOLIBOOK;
    BKW_VINCOLIBOOK.InitDefMasks();
    BUK_VINCOLIBOOK.InitBook(1, 1245185, "Vincoli Book", IMDB, MainFrm.VisualStyleList);
    BUK_VINCOLIBOOK.InitHTML();
    BUK_VINCOLIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_VINCOLIBOOK.Book.SetMainFrm(MainFrm);
    BUK_VINCOLIBOOK.SetRTCGuid(0, "16E0EFB4-97CD-4937-BED8-71EB2574511E");
    BUK_VINCOLIBOOK.SetObjCode(0, "VINCOLIBOOK");
    if (PAN_VINCOLI != null)
      PAN_VINCOLI.SetBook(BUK_VINCOLIBOOK);
    BUK_VINCOLIBOOK_MST_VINCBOOKPAGE_Init();
    BUK_VINCOLIBOOK_RPT_NEWREPORT_Init();
    BUK_VINCOLIBOOK_InitLinks();
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
      PAN_VINCOLI.UpdatePanel(MainFrm);
      // BUK_VINCOLIBOOK.UpdateBook();
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
    if (Code.equals("BUK_VINCOLIBOOK")) return BUK_VINCOLIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Vincoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Vincoli.class.getName() : (Glb.ClassWithPackage(Vincoli.class) ? Vincoli.class.getName().substring(Vincoli.class.getPackage().getName().length() + 1) : Vincoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Vincoli On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VINCOLI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VINCOLI);
      // 
      // Vincoli On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_VINCOLI.IsNewRow())
      {
        PAN_VINCOLI.SetFlags (Glb.OBJ_FIELD, PFL_VINCOLI_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VINCOLI.SetFlags (Glb.OBJ_FIELD, PFL_VINCOLI_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_VINCOLI.set_ToolTip(Glb.OBJ_FIELD,PFL_VINCOLI_DESCRIZIONE,(new IDVariant(PAN_VINCOLI.FieldText(PFL_VINCOLI_DESCRIZIONE))).stringValue()); 
      PAN_VINCOLI.set_ToolTip(Glb.OBJ_FIELD,PFL_VINCOLI_TIPOAVANZO,(new IDVariant(PAN_VINCOLI.FieldText(PFL_VINCOLI_TIPOAVANZO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Vincoli", "VincoliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Vincoli On Database Error Event
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
  private void PAN_VINCOLI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_VINCOLI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Vincoli On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Vincoli", "VincoliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Vincoli On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VINCOLI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Vincoli On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_VINCOLI4, IMDBDef8.PQSL_VINCOLI4_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_VINCOLI4, IMDBDef8.PQSL_VINCOLI4_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_VINCOLI4, IMDBDef8.PQSL_VINCOLI4_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_VINCOLI4, IMDBDef8.PQSL_VINCOLI4_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_VINCOLI4, IMDBDef8.PQSL_VINCOLI4_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_VINCOLI4, IMDBDef8.PQSL_VINCOLI4_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Vincoli", "VincoliOnUpdatingRowEvent", _e);
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
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Vincoli", "LoadEvent", _e);
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VINCOLI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VINCOLI, Cancel);
    // Stub
  }

  private void PAN_VINCOLI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VINCOLI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VINCOLI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VINCOLI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VINCOLI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_VINCOLIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_VINCOLIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_VINCOLIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_VINCOLIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_VINCOLIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_VINCOLIBOOK_SEC_DETAIL)
    {
      BUK_VINCOLIBOOK.set_SpanValue(BUK_VINCOLIBOOK_SPAN_NUVAVISTVVBN, new IDVariant(IDL.NullValue(BUK_VINCOLIBOOK.GetReportColumn(BUK_VINCOLIBOOK_RPT_NEWREPORT, "STAMPA"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_VINCOLIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_VINCOLIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_VINCOLIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_VINCOLIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_VINCOLIBOOK_MST_VINCBOOKPAGE)
    {
      BUK_VINCOLIBOOK.set_SpanValue(BUK_VINCOLIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_VINCOLIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_VINCOLIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_VINCOLIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_VINCOLIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_VINCOLIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_VINCOLIBOOK_OnPreview()
  {
    PreviewBook = BKW_VINCOLIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VINCOLI_Init()
  {

    PAN_VINCOLI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VINCOLI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VINCOLI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, "219D917B-0583-4FC4-B3CC-5AF11C6AF6FE");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, "Codice");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, "BEE8951B-A437-4517-A27A-C473EF0BE8B7");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, "Descrizione");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, "569538CC-BE83-44F2-A90A-85331E3B0505");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, "Stampa");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.VIS_CHECKSTYLE);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, "3DF47043-856B-4EA4-9F46-040580CECBAD");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, "RIF TESO 1");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, "AF52C650-8128-465A-84FF-A438FD99533C");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, "RIF TESO 2");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, "405F6570-31B0-416B-8EB0-D4CCCCAD0B6E");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, "RIF TESO 3");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, "580B5651-03CE-48EC-A6A6-FAF6534CA4E5");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, "Conto Corrente");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, "7309FDE8-6A4A-45FC-94D1-856B85E3C7AF");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, "Scadenza");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, "0C202F0A-0B8E-4917-80CD-A4429871FD7C");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, "Tipo Avanzo");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.VIS_NORMALFIELDS);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, "FCE33FE6-A07F-4EC2-B08D-31369009147D");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, "Rif. ti Tesoreria");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, "D8D5C1D2-0478-412D-A12B-EC267D70C65F");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, "E73A4731-8E04-40A2-80A1-B05F9F8567ED");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, "3D1C1D0D-5D7B-42EE-89E9-B2589F2719E3");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VINCOLI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, "ACE37A6F-299F-4EF7-99EE-7783740F095C");
    PAN_VINCOLI.set_Header(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_VINCOLI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, "");
    PAN_VINCOLI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_VINCOLI.SetFlags(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_VINCOLI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_CODICE, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_CODICE, PPQRY_VINCOLI4, "A.CODICE", "CODICE", 1, 7, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, 48, 36, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 496, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_DESCRIZIONE, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_DESCRIZIONE, PPQRY_VINCOLI4, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_LIST, 364, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_LIST, 48);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_LIST, "Stampa");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_FORM, 4, 52, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_STAMPA, MyGlb.PANEL_FORM, "Stampa");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_STAMPA, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_STAMPA, PPQRY_VINCOLI4, "A.STAMPA", "STAMPA", 5, 2, 0, -13997);
    PAN_VINCOLI.SetValueListItem(PFL_VINCOLI_STAMPA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VINCOLI.SetValueListItem(PFL_VINCOLI_STAMPA, (new IDVariant()), "Null", "", "", -1);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_LIST, 416, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_LIST, 64);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_LIST, "RIF TS. 1");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_FORM, 4, 76, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO1, MyGlb.PANEL_FORM, "RIF TESO 1");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_RIFTESO1, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_RIFTESO1, PPQRY_VINCOLI4, "A.RIF_TESO_1", "RIF_TESO_1", 5, 2, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_LIST, 452, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_LIST, 64);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_LIST, "RIF TS. 2");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_FORM, 4, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO2, MyGlb.PANEL_FORM, "RIF TESO 2");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_RIFTESO2, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_RIFTESO2, PPQRY_VINCOLI4, "A.RIF_TESO_2", "RIF_TESO_2", 5, 2, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_LIST, 488, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_LIST, 64);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_LIST, "RIF TESO 3");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_FORM, 4, 196, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_RIFTESO3, MyGlb.PANEL_FORM, "RIF TESO 3");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_RIFTESO3, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_RIFTESO3, PPQRY_VINCOLI4, "A.RIF_TESO_3", "RIF_TESO_3", 5, 4, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_LIST, 536, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_LIST, 104);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_LIST, "Conto Corrente");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_FORM, 4, 172, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_CONTOCORRENT, MyGlb.PANEL_FORM, "Conto Corrente");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_CONTOCORRENT, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_CONTOCORRENT, PPQRY_VINCOLI4, "A.CONTO_CORRENTE", "CONTO_CORRENTE", 5, 20, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, 712, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, 4, 220, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, 136);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_SCADENZA, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_SCADENZA, PPQRY_VINCOLI4, "A.SCADENZA", "SCADENZA", 6, 19, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_LIST, 800, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_LIST, 84);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_LIST, "Tipo Avanzo");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_FORM, 4, 340, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_FORM, 84);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_TIPOAVANZO, MyGlb.PANEL_FORM, "Tipo Avanzo");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_TIPOAVANZO, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_TIPOAVANZO, PPQRY_VINCOLI4, "A.TIPO_AVANZO", "TIPO_AVANZO", 3, 10, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, MyGlb.PANEL_LIST, 416, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, MyGlb.PANEL_LIST, 2);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, MyGlb.PANEL_FORM, 420, 0, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_NEWPANELLABE, MyGlb.PANEL_FORM, 2);
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_NEWPANELLABE, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_LIST, 8, 244, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 244, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_UTENTEINSERI, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_UTENTEINSERI, PPQRY_VINCOLI4, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_LIST, 258, 248, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_DATAINSERIME, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_DATAINSERIME, PPQRY_VINCOLI4, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_LIST, 12, 272, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 292, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_UTENTULTIAGG, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_UTENTULTIAGG, PPQRY_VINCOLI4, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_LIST, 266, 272, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_VINCOLI.SetRect(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 316, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VINCOLI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_VINCOLI.SetNumRow(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_VINCOLI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VINCOLI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_VINCOLI.SetFieldPage(PFL_VINCOLI_DATAULTIMAGG, -1, -1);
    PAN_VINCOLI.SetFieldPanel(PFL_VINCOLI_DATAULTIMAGG, PPQRY_VINCOLI4, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_VINCOLI_InitQueries()
  {
    StringBuffer SQL;

    PAN_VINCOLI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIAVANDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("where (A.CODICE = ~~TIPO_AVANZO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VINCOLI.SetQuery(PPQRY_TIPIAVANZO, 0, SQL, PFL_VINCOLI_TIPOAVANZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIAVANCODI, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPIAVANDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_AVANZO A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VINCOLI.SetQuery(PPQRY_TIPIAVANZO, 1, SQL, PFL_VINCOLI_TIPOAVANZO, "");
    PAN_VINCOLI.SetQueryDB(PPQRY_TIPIAVANZO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VINCOLI.SetIMDB(IMDB, "PQRY_VINCOLI4", true);
    PAN_VINCOLI.set_SetString(MyGlb.MASTER_ROWNAME, "VINCOLI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.STAMPA as STAMPA, ");
    SQL.append("  A.RIF_TESO_1 as RIF_TESO_1, ");
    SQL.append("  A.RIF_TESO_2 as RIF_TESO_2, ");
    SQL.append("  A.RIF_TESO_3 as RIF_TESO_3, ");
    SQL.append("  A.CONTO_CORRENTE as CONTO_CORRENTE, ");
    SQL.append("  A.SCADENZA as SCADENZA, ");
    SQL.append("  A.TIPO_AVANZO as TIPO_AVANZO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.CODICE > 0) ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_VINCOLI.SetQuery(PPQRY_VINCOLI4, 5, SQL, -1, "");
    PAN_VINCOLI.SetQueryDB(PPQRY_VINCOLI4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VINCOLI.SetMasterTable(0, "VINCOLI");
    PAN_VINCOLI.AddToSortList(PFL_VINCOLI_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VINCOLI.Status() == 2)
    {
      int oldListQBE = PAN_VINCOLI.iUseListQBE;
      PAN_VINCOLI.iUseListQBE = 0;
      PAN_VINCOLI.PanelCommand(Glb.PCM_SEARCH);
      PAN_VINCOLI.PanelCommand(Glb.PCM_FIND);
      PAN_VINCOLI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_VINCOLIBOOK_MST_VINCBOOKPAGE_Init()
  {
    BUK_VINCOLIBOOK.InitMastro(BUK_VINCOLIBOOK_MST_VINCBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_MST_VINCBOOKPAGE, "FE546BF5-7037-4D17-B3E2-904647837C7A");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_MST_VINCBOOKPAGE, "VINCBOOKPAGE");
    BUK_VINCOLIBOOK.InitMastroBox(BUK_VINCOLIBOOK_MST_VINCBOOKPAGE, BUK_VINCOLIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_NUMEROPAGINA, "A5CB3472-BB48-44E0-AFDE-84BB3A2BE5A2");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_NUMEROPAGINA, BUK_VINCOLIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_NUMEROPAGINA, "53E809A5-4576-4694-A179-89CA83F252C3");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_VINCOLIBOOK.InitMastroBox(BUK_VINCOLIBOOK_MST_VINCBOOKPAGE, BUK_VINCOLIBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 1500, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_PAGEHEADER, "E22497E3-0FAC-43E2-82AF-CF458CC2336C");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_VINCOLIBOOK.InitMastroBox(BUK_VINCOLIBOOK_MST_VINCBOOKPAGE, BUK_VINCOLIBOOK_RPTBOX_PAGEBODY, 1000, 2700, 19000, 25900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_PAGEBODY, "3E785B00-8048-4D46-B9CA-408A5F097C3F");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_VINCOLIBOOK_RPT_NEWREPORT_InitQuery() { BUK_VINCOLIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_VINCOLIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STAMPA as STAMPA, ");
      SQL.append("  A.RIF_TESO_1 as RIF_TESO_1, ");
      SQL.append("  A.RIF_TESO_2 as RIF_TESO_2, ");
      SQL.append("  A.RIF_TESO_3 as RIF_TESO_3, ");
      SQL.append("  A.CONTO_CORRENTE as CONTO_CORRENTE, ");
      SQL.append("  A.SCADENZA as SCADENZA ");
      SQL.append("from ");
      SQL.append("  VINCOLI A ");
      SQL.append("where (A.CODICE > 0) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_VINCOLIBOOK.SetReportQuery(BUK_VINCOLIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "1F0906EC-491E-4304-9137-7CA49A503F5F");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_VINCOLIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_VINCOLIBOOK.InitReport(BUK_VINCOLIBOOK_RPT_NEWREPORT, 196609);
    BUK_VINCOLIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPT_NEWREPORT, "AA8B1A76-CAB2-41B4-B17F-EBF63E3BEE31");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_VINCOLIBOOK.InitSection(BUK_VINCOLIBOOK_RPT_NEWREPORT, BUK_VINCOLIBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VINCOLIBOOK.SetSectionRendersInto(BUK_VINCOLIBOOK_SEC_REPORTHEADER, BUK_VINCOLIBOOK_RPTBOX_PAGEBODY);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SEC_REPORTHEADER, "B1C2537E-FA74-430D-A2D8-17DA0048E465");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_VINCOLIBOOK.InitSection(BUK_VINCOLIBOOK_RPT_NEWREPORT, BUK_VINCOLIBOOK_SEC_TITOLO, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_VINCOLIBOOK.SetSectionRendersInto(BUK_VINCOLIBOOK_SEC_TITOLO, BUK_VINCOLIBOOK_RPTBOX_PAGEHEADER);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SEC_TITOLO, "7C499F5A-E762-4264-A06A-F028E3CF274F");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SEC_TITOLO, "TITOLO");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_TITOLO, BUK_VINCOLIBOOK_RPTBOX_TITOLO2, 0, 200, 19000, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_TITOLO2, "3D988DB8-D89F-4C40-BB83-5797A9DCB378");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_TITOLO2, "TITOLO2");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_TITOLO2, BUK_VINCOLIBOOK_SPAN_FUNZIOESERVI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Vincoli", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_FUNZIOESERVI, "417DDCC6-777D-4EE5-9469-30D306A46E05");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_FUNZIOESERVI, "FUNZIOESERVI");
    BUK_VINCOLIBOOK.InitSection(BUK_VINCOLIBOOK_RPT_NEWREPORT, BUK_VINCOLIBOOK_SEC_PAGEHEADER, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VINCOLIBOOK.SetSectionRendersInto(BUK_VINCOLIBOOK_SEC_PAGEHEADER, BUK_VINCOLIBOOK_RPTBOX_PAGEBODY);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SEC_PAGEHEADER, "C51FA973-1810-402B-B51B-A174E108A9F6");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_PAGEHEADER, BUK_VINCOLIBOOK_RPTBOX_CODICEHEADER, 0, 0, 1309, 600, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_CODICEHEADER, "7D5357F5-A921-4BC1-BAB9-1FBEAC4E839D");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_CODICEHEADER, BUK_VINCOLIBOOK_SPAN_CODICE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Vincolo", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_CODICE, "10F83389-E446-46C7-9614-C40BF1200762");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_CODICE, "CODICE");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_PAGEHEADER, BUK_VINCOLIBOOK_RPTBOX_DESCRIHEADER, 1500, 0, 11200, 600, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_DESCRIHEADER, "34BD54B7-4B81-4C11-B7AF-30ECB682A52F");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_DESCRIHEADER, BUK_VINCOLIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_DESCRIZIONE, "90CF2BC5-7604-46FC-8146-7F2E24E01409");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_PAGEHEADER, BUK_VINCOLIBOOK_RPTBOX_STAMPAHEADER, 12800, 0, 1200, 600, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_STAMPAHEADER, "C43E2042-6EFF-414E-AB2F-8BCA57D01FFC");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_STAMPAHEADER, "STAMPAHEADER");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_STAMPAHEADER, BUK_VINCOLIBOOK_SPAN_STAMPA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Stampa", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_STAMPA, "615DD0CD-61A2-4FC6-A768-42FCC23E4D04");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_STAMPA, "STAMPA");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_PAGEHEADER, BUK_VINCOLIBOOK_RPTBOX_RIFTESO1HEAD, 14200, 0, 2700, 600, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_RIFTESO1HEAD, "EE227711-9C2C-4923-A7E8-C7C319D7841A");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_RIFTESO1HEAD, "RIFTESO1HEAD");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_RIFTESO1HEAD, BUK_VINCOLIBOOK_SPAN_RIFTESO1, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Rif.ti Tesoreria", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_RIFTESO1, "4A063021-A4B2-47BB-A146-3C3B0252B2CE");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_RIFTESO1, "RIFTESO1");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_PAGEHEADER, BUK_VINCOLIBOOK_RPTBOX_SCADENHEADER, 17100, 0, 1800, 600, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_SCADENHEADER, "255B341D-AAD7-4DE4-8462-057D0877360E");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_SCADENHEADER, "SCADENHEADER");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_SCADENHEADER, BUK_VINCOLIBOOK_SPAN_SCADENZA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Scadenza", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_SCADENZA, "C35B0BD8-5F3B-4D25-80DF-B99A217F37F3");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_SCADENZA, "SCADENZA");
    BUK_VINCOLIBOOK.InitSection(BUK_VINCOLIBOOK_RPT_NEWREPORT, BUK_VINCOLIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_VINCOLIBOOK.SetSectionRendersInto(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_PAGEBODY);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SEC_DETAIL, "BFF4DD1D-481E-4368-B5F9-4BE54CEEDEB7");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SEC_DETAIL, "DETAIL");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_CODICE, 0, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_CODICE, "DC429D44-863C-43DE-AC3F-DBC48D3FBF34");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_CODICE, BUK_VINCOLIBOOK_SPAN_VINCODVIVIBO, MyGlb.VIS_CAMSENBORCEN, 1, 7, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_VINCODVIVIBO, "3EC9BE09-44B1-4F21-9C22-FF30197725BE");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_VINCODVIVIBO, "VINCODVIVIBO");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_DESCRIZIONE, 1500, 0, 11200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_DESCRIZIONE, "E9507E08-FA27-4478-8479-2D62E163AC8C");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_DESCRIZIONE, BUK_VINCOLIBOOK_SPAN_VINDESVIVIBO, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_VINDESVIVIBO, "4A652C1F-8406-42B4-BEC3-B002E6D8BD86");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_VINDESVIVIBO, "VINDESVIVIBO");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_STAMPA, 13200, 0, 500, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_STAMPA, "9269CBA8-E66F-4B19-B143-0C9471D9E2C7");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_STAMPA, "STAMPA");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_STAMPA, BUK_VINCOLIBOOK_SPAN_NUVAVISTVVBN, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_VINCOLIBOOK.SetSpanValueListItem(BUK_VINCOLIBOOK_SPAN_NUVAVISTVVBN, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_VINCOLIBOOK.SetSpanValueListItem(BUK_VINCOLIBOOK_SPAN_NUVAVISTVVBN, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_NUVAVISTVVBN, "3DD968E3-9AEA-4BDB-9B2F-BBB23377E9C4");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_NUVAVISTVVBN, "NUVAVISTVVBN");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_RIFTESO1, 14200, 0, 751, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_RIFTESO1, "4B2D6D09-AFBC-48F0-9107-BF682DD2AFCA");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_RIFTESO1, "RIFTESO1");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_RIFTESO1, BUK_VINCOLIBOOK_SPAN_VIRITE1VIVIB, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "Brief description of field content.", "::RIF_TESO_1", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_VIRITE1VIVIB, "FCBE35C8-A024-4B4F-B91C-F7DA0F3FF013");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_VIRITE1VIVIB, "VIRITE1VIVIB");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_RIFTESO2, 15000, 0, 800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_RIFTESO2, "3875FE1B-E3CD-407F-83FE-402C98E5D64C");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_RIFTESO2, "RIFTESO2");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_RIFTESO2, BUK_VINCOLIBOOK_SPAN_VIRITE2VIVIB, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "Brief description of field content.", "::RIF_TESO_2", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_VIRITE2VIVIB, "5483DF55-C746-414B-AB3E-B1466FEE1C45");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_VIRITE2VIVIB, "VIRITE2VIVIB");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_RIFTESO3, 15900, 0, 1050, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_RIFTESO3, "063061AF-BFF9-456A-831D-2C5611DFF008");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_RIFTESO3, "RIFTESO3");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_RIFTESO3, BUK_VINCOLIBOOK_SPAN_VIRITE3VIVIB, MyGlb.VIS_DEFAREPOSTYL, 5, 4, 0, 271384705, "Brief description of field content.", "::RIF_TESO_3", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_VIRITE3VIVIB, "48AB8D61-42F9-40F3-AE04-1286A844EBEF");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_VIRITE3VIVIB, "VIRITE3VIVIB");
    BUK_VINCOLIBOOK.InitReportBox(BUK_VINCOLIBOOK_SEC_DETAIL, BUK_VINCOLIBOOK_RPTBOX_SCADENZA, 17100, 0, 1880, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_RPTBOX_SCADENZA, "2D0AC0C6-A6B3-4130-A999-1AD6D2538874");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_RPTBOX_SCADENZA, "SCADENZA");
    BUK_VINCOLIBOOK.InitBoxSpan(BUK_VINCOLIBOOK_RPTBOX_SCADENZA, BUK_VINCOLIBOOK_SPAN_VINSCAVIVIBO, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::SCADENZA", 1);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SPAN_VINSCAVIVIBO, "190CEB54-BC4F-4935-8AEF-F44186FD5AD9");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SPAN_VINSCAVIVIBO, "VINSCAVIVIBO");
    BUK_VINCOLIBOOK.InitSection(BUK_VINCOLIBOOK_RPT_NEWREPORT, BUK_VINCOLIBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_VINCOLIBOOK.SetSectionRendersInto(BUK_VINCOLIBOOK_SEC_PAGEFOOTER, BUK_VINCOLIBOOK_RPTBOX_PAGEBODY);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SEC_PAGEFOOTER, "D4BADA92-0181-47ED-9E63-1E9EBDB11FD5");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_VINCOLIBOOK.InitSection(BUK_VINCOLIBOOK_RPT_NEWREPORT, BUK_VINCOLIBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_VINCOLIBOOK.SetSectionRendersInto(BUK_VINCOLIBOOK_SEC_REPORTFOOTER, BUK_VINCOLIBOOK_RPTBOX_PAGEBODY);
    BUK_VINCOLIBOOK.SetRTCGuid(BUK_VINCOLIBOOK_SEC_REPORTFOOTER, "A118EBAA-C3C0-4305-8D50-CF878217A60C");
    BUK_VINCOLIBOOK.SetObjCode(BUK_VINCOLIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_VINCOLIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_VINCOLIBOOK_InitLinks()
  {
    BUK_VINCOLIBOOK.SetBoxNextBox(BUK_VINCOLIBOOK_RPTBOX_PAGEBODY, BUK_VINCOLIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VINCOLI) PAN_VINCOLI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_VINCOLIBOOK) BUK_VINCOLIBOOK_OnPreview();
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
