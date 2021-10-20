// **********************************************
// Causali Fiscali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CausaliFiscali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAUSALFISCAL_CODICE = 0;
  private static int PFL_CAUSALFISCAL_QUADRO = 1;
  private static int PFL_CAUSALFISCAL_DESCRIZIONE = 2;
  private static int PFL_CAUSALFISCAL_CAUSALE770 = 3;
  private static int PFL_CAUSALFISCAL_ARTICDILEGGE = 4;
  private static int PFL_CAUSALFISCAL_INVIOENTI = 5;
  private static int PFL_CAUSALFISCAL_CODTS = 6;
  private static int PFL_CAUSALFISCAL_TIPORITENUTA = 7;
  private static int PFL_CAUSALFISCAL_UTENTEINSERI = 8;
  private static int PFL_CAUSALFISCAL_DATAINSERIME = 9;
  private static int PFL_CAUSALFISCAL_UTENTULTIAGG = 10;
  private static int PFL_CAUSALFISCAL_DATAULTIMAGG = 11;

  private static int PPQRY_T63 = 0;


  IDPanel PAN_CAUSALFISCAL;
  CIDREObj BUK_CAUSFISCBOOK;
  OBook BKW_CAUSFISCBOOK;
  //
  // Template Pages constants
  private static int BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG = 1;
  private static int BUK_CAUSFISCBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CAUSFISCBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CAUSFISCBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CAUSFISCBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CAUSFISCBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_CAUSFISCBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_CAUSFISCBOOK_SPAN_CODICE = 9;
  private static int BUK_CAUSFISCBOOK_RPTBOX_QUADROHEADER = 10;
  private static int BUK_CAUSFISCBOOK_SPAN_QUADRO = 11;
  private static int BUK_CAUSFISCBOOK_RPTBOX_DESCRIHEADER = 12;
  private static int BUK_CAUSFISCBOOK_SPAN_DESCRIZIONE = 13;
  private static int BUK_CAUSFISCBOOK_RPTBOX_DESABBREHEAD = 14;
  private static int BUK_CAUSFISCBOOK_SPAN_CAUSALE770 = 15;
  private static int BUK_CAUSFISCBOOK_RPTBOX_ARTICOHEADER = 16;
  private static int BUK_CAUSFISCBOOK_SPAN_ARTICDILEGGE = 17;
  private static int BUK_CAUSFISCBOOK_RPTBOX_TIPOCERTHEAD = 18;
  private static int BUK_CAUSFISCBOOK_SPAN_INVIOENTI = 19;
  private static int BUK_CAUSFISCBOOK_RPTBOX_CODICTSHEADE = 20;
  private static int BUK_CAUSFISCBOOK_SPAN_CODTS = 21;
  private static int BUK_CAUSFISCBOOK_RPTBOX_TIPORITEHEAD = 22;
  private static int BUK_CAUSFISCBOOK_SPAN_TIPORITENUTA = 23;
  private static int BUK_CAUSFISCBOOK_SEC_TITOLO = 24;
  private static int BUK_CAUSFISCBOOK_RPTBOX_NEWBOX = 25;
  private static int BUK_CAUSFISCBOOK_SPAN_VARIADIBILAN = 26;
  private static int BUK_CAUSFISCBOOK_SEC_DETAIL = 27;
  private static int BUK_CAUSFISCBOOK_RPTBOX_CODICE = 28;
  private static int BUK_CAUSFISCBOOK_SPAN_T6COCAFICAFB = 29;
  private static int BUK_CAUSFISCBOOK_RPTBOX_QUADRO = 30;
  private static int BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB = 31;
  private static int BUK_CAUSFISCBOOK_RPTBOX_DESCRIZIONE = 32;
  private static int BUK_CAUSFISCBOOK_SPAN_T6DECAFICAFB = 33;
  private static int BUK_CAUSFISCBOOK_RPTBOX_DESABBREVIAT = 34;
  private static int BUK_CAUSFISCBOOK_SPAN_T6CA77CAFCFB = 35;
  private static int BUK_CAUSFISCBOOK_RPTBOX_ARTICOLO = 36;
  private static int BUK_CAUSFISCBOOK_SPAN_T6ARDILCFCFB = 37;
  private static int BUK_CAUSFISCBOOK_RPTBOX_TIPOCERT = 38;
  private static int BUK_CAUSFISCBOOK_SPAN_IETIECFCFBES = 39;
  private static int BUK_CAUSFISCBOOK_RPTBOX_CODICETS = 40;
  private static int BUK_CAUSFISCBOOK_SPAN_T6COTSCAFCFB = 41;
  private static int BUK_CAUSFISCBOOK_RPTBOX_TIPORITENUTA = 42;
  private static int BUK_CAUSFISCBOOK_SPAN_T6TIRICAFCFB = 43;
  private static int BUK_CAUSFISCBOOK_SEC_PAGEFOOTER = 44;
  private static int BUK_CAUSFISCBOOK_SEC_REPORTFOOTER = 45;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T63(IMDB);
    Init_PQRY_T79(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T63(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T63, 13);
    IMDB.set_TblCode(IMDBDef9.PQRY_T63, "PQRY_T63");
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_QUADRO, "QUADRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_QUADRO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DES_ABBREVIATA, "DES_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DES_ABBREVIATA,5,9,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_TIPO_CERT, "TIPO_CERT");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_TIPO_CERT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_ARTICOLO,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_SUB_QUADRO, "SUB_QUADRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_SUB_QUADRO,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_CODICE_TS, "CODICE_TS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_CODICE_TS,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_TIPO_RITENUTA, "TIPO_RITENUTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_TIPO_RITENUTA,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T63,IMDBDef9.PQSL_T63_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T63, 0);
  }

  private static void Init_PQRY_T79(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T79, 9);
    IMDB.set_TblCode(IMDBDef9.PQRY_T79, "PQRY_T79");
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_QUADRO, "QUADRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_QUADRO,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_DESCRIZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_DES_ABBREVIATA, "DES_ABBREVIATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_DES_ABBREVIATA,5,9,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_TIPO_CERT, "TIPO_CERT");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_TIPO_CERT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_ARTICOLO,5,30,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_SUB_QUADRO, "SUB_QUADRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_SUB_QUADRO,5,3,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_CODICE_TS, "CODICE_TS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_CODICE_TS,5,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_TIPO_RITENUTA, "TIPO_RITENUTA");
    IMDB.SetFldParams(IMDBDef9.PQRY_T79,IMDBDef9.PQSL_T79_TIPO_RITENUTA,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T79, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CausaliFiscali(MyWebEntryPoint w, IMDBObj imdb)
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
  public CausaliFiscali()
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
    FormIdx = MyGlb.FRM_CAUSALFISCAL;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "ED568EA9-05FE-4CAB-AB26-19B9DB97352B";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 680;
    DesignHeight = 386;
    set_Caption(new IDVariant("Causali Fiscali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 680;
    Frames[1].Height = 360;
    Frames[1].Caption = "Causali Fiscali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_CAUSALFISCAL = new IDPanel(w, this, 1, "PAN_CAUSALFISCAL");
    Frames[1].Content = PAN_CAUSALFISCAL;
    PAN_CAUSALFISCAL.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAUSALFISCAL.VS = MainFrm.VisualStyleList;
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 680-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CAUSFISCBOOK != null)
      PAN_CAUSALFISCAL.SetBook(BUK_CAUSFISCBOOK);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "EE6490E8-1534-4371-BEBD-FA3994DB6873");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 636, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAUSALFISCAL.InitStatus = 2;
    PAN_CAUSALFISCAL_Init();
    PAN_CAUSALFISCAL_InitFields();
    PAN_CAUSALFISCAL_InitQueries();
    BKW_CAUSFISCBOOK = new OBook(this);
    BUK_CAUSFISCBOOK = new CIDREObj(BKW_CAUSFISCBOOK);
    BKW_CAUSFISCBOOK.iGuid = "843D2A8D-3F65-44C7-91CB-72759E1CBDA5";
    BKW_CAUSFISCBOOK.Code = "BUK_CAUSFISCBOOK";
    BKW_CAUSFISCBOOK.BookObj = BUK_CAUSFISCBOOK;
    BKW_CAUSFISCBOOK.InitDefMasks();
    BUK_CAUSFISCBOOK.InitBook(1, 1245185, "Causali Fiscali Book", IMDB, MainFrm.VisualStyleList);
    BUK_CAUSFISCBOOK.InitHTML();
    BUK_CAUSFISCBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CAUSFISCBOOK.Book.SetMainFrm(MainFrm);
    BUK_CAUSFISCBOOK.SetRTCGuid(0, "843D2A8D-3F65-44C7-91CB-72759E1CBDA5");
    BUK_CAUSFISCBOOK.SetObjCode(0, "CAUSFISCBOOK");
    if (PAN_CAUSALFISCAL != null)
      PAN_CAUSALFISCAL.SetBook(BUK_CAUSFISCBOOK);
    BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG_Init();
    BUK_CAUSFISCBOOK_RPT_NEWREPORT_Init();
    BUK_CAUSFISCBOOK_InitLinks();
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
      PAN_CAUSALFISCAL.UpdatePanel(MainFrm);
      // BUK_CAUSFISCBOOK.UpdateBook();
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
    if (Code.equals("BUK_CAUSFISCBOOK")) return BUK_CAUSFISCBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CausaliFiscali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CausaliFiscali.class.getName() : (Glb.ClassWithPackage(CausaliFiscali.class) ? CausaliFiscali.class.getName().substring(CausaliFiscali.class.getPackage().getName().length() + 1) : CausaliFiscali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Causali Fiscali On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAUSALFISCAL_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAUSALFISCAL);
      // 
      // Causali Fiscali On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CAUSALFISCAL.IsNewRow()))
      {
        PAN_CAUSALFISCAL.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CAUSALFISCAL.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CAUSALFISCAL.set_ToolTip(Glb.OBJ_FIELD,PFL_CAUSALFISCAL_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_DESCRIZIONE, 0).stringValue()); 
      PAN_CAUSALFISCAL.set_ToolTip(Glb.OBJ_FIELD,PFL_CAUSALFISCAL_ARTICDILEGGE,IMDB.Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_ARTICOLO, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliFiscali", "CausaliFiscaliOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Fiscali On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CAUSALFISCAL_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Fiscali On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T62PD(IMDB.Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliFiscali", "CausaliFiscaliOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Fiscali On Database Error Event
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
  private void PAN_CAUSALFISCAL_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CAUSALFISCAL, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Causali Fiscali On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliFiscali", "CausaliFiscaliOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Fiscali On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CAUSALFISCAL_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Fiscali On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T63, IMDBDef9.PQSL_T63_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliFiscali", "CausaliFiscaliOnUpdatingRowEvent", _e);
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
      MainFrm.ErrObj.ProcError ("CausaliFiscali", "LoadEvent", _e);
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
  private void PAN_CAUSALFISCAL_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAUSALFISCAL, Cancel);
    // Stub
  }

  private void PAN_CAUSALFISCAL_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CAUSALFISCAL_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CAUSALFISCAL_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CAUSALFISCAL_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAUSALFISCAL_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CAUSFISCBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CAUSFISCBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CAUSFISCBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CAUSFISCBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CAUSFISCBOOK_SEC_DETAIL)
    {
      BUK_CAUSFISCBOOK.set_SpanValue(BUK_CAUSFISCBOOK_SPAN_IETIECFCFBES, new IDVariant(((BUK_CAUSFISCBOOK.GetReportColumn(BUK_CAUSFISCBOOK_RPT_NEWREPORT, "TIPO_CERT").equals((new IDVariant("E"))))?(new IDVariant("SI")):(new IDVariant("NO")))));
    }
    if (SectionID==BUK_CAUSFISCBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CAUSFISCBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CAUSFISCBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CAUSFISCBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG)
    {
      BUK_CAUSFISCBOOK.set_SpanValue(BUK_CAUSFISCBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSFISCBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSFISCBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CAUSFISCBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CAUSFISCBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CAUSFISCBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CAUSFISCBOOK_OnPreview()
  {
    PreviewBook = BKW_CAUSFISCBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAUSALFISCAL_Init()
  {

    PAN_CAUSALFISCAL.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAUSALFISCAL.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAUSALFISCAL.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, "505A10B6-D7E2-4AFA-ABE7-4732FA927088");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, "Codice");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, "2A12CD30-5F59-4CCF-91A4-C68507190C37");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, "Quadro");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, "E58230BF-1403-4E25-A380-17DA4D9FC003");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, "Descrizione");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, "FF7E2903-A1EC-4F84-9197-54405DB9C00A");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, "Causale 770");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, "03D2160C-0179-4E1A-8377-5C001309CF6A");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, "Articolo di Legge");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, "05DF2EF6-D0C6-41D7-989F-25B14098B1F1");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, "Invio Enti");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.VIS_CHECKSTYLE);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, "55A935BF-7BF2-452F-BD59-E631892DB4F5");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, "Cod. T.S.");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, "18E387E3-9AB1-40CB-B8CC-6BE5562BB48E");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, "Tipo Ritenuta");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, "932DEB33-2DD3-4AE2-BCBE-71E56F3AD28F");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, "F759363A-1F32-4BC4-9727-609E79B1E267");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, "E7A6D464-C429-487F-92F1-5A80BC3650D8");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALFISCAL.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, "189CFC63-6BEA-40B8-893C-25C7D40F2517");
    PAN_CAUSALFISCAL.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CAUSALFISCAL.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, "");
    PAN_CAUSALFISCAL.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALFISCAL.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAUSALFISCAL_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_FORM, 4, 4, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_CODICE, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_CODICE, PPQRY_T63, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_LIST, 56, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_LIST, 40);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_LIST, "Quadro");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_FORM, 4, 28, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_QUADRO, MyGlb.PANEL_FORM, "Quadro");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_QUADRO, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_QUADRO, PPQRY_T63, "A.QUADRO", "QUADRO", 5, 2, 0, -13997);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_QUADRO, (new IDVariant("SA")), "SA", "", "", -1);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_QUADRO, (new IDVariant("SC")), "SC", "", "", -1);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_QUADRO, (new IDVariant("SE")), "SE", "", "", -1);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_QUADRO, (new IDVariant("SF")), "SF", "", "", -1);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_QUADRO, (new IDVariant("SH")), "SH", "", "", -1);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_QUADRO, (new IDVariant("SR")), "SR", "", "", -1);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_LIST, 108, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_DESCRIZIONE, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_DESCRIZIONE, PPQRY_T63, "A.DESCRIZIONE", "DESCRIZIONE", 5, 30, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_LIST, 252, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_LIST, 120);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_LIST, "Causale 770");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_FORM, 4, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CAUSALE770, MyGlb.PANEL_FORM, "Causale 770");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_CAUSALE770, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_CAUSALE770, PPQRY_T63, "A.DES_ABBREVIATA", "DES_ABBREVIATA", 5, 9, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_LIST, 320, 36, 132, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_LIST, 60);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_LIST, "Articolo di Legge");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_FORM, 4, 124, 360, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_ARTICDILEGGE, MyGlb.PANEL_FORM, "Articolo di Legge");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_ARTICDILEGGE, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_ARTICDILEGGE, PPQRY_T63, "A.ARTICOLO", "ARTICOLO", 5, 30, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_LIST, 452, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_LIST, 80);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_LIST, "Invio Enti");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_FORM, 4, 100, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_INVIOENTI, MyGlb.PANEL_FORM, "Invio Enti");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_INVIOENTI, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_INVIOENTI, PPQRY_T63, "A.TIPO_CERT", "TIPO_CERT", 5, 1, 0, -13997);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_INVIOENTI, (new IDVariant("E")), "E", "", "", -1);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_INVIOENTI, (new IDVariant()), "Null", "", "", -1);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_LIST, 508, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_LIST, 80);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_LIST, "Cod. T.S.");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_FORM, 4, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_CODTS, MyGlb.PANEL_FORM, "Cod. T.S.");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_CODTS, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_CODTS, PPQRY_T63, "A.CODICE_TS", "CODICE_TS", 5, 2, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_LIST, 564, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_LIST, 120);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_LIST, "Tipo Ritenuta");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_FORM, 4, 196, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_FORM, 104);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_TIPORITENUTA, MyGlb.PANEL_FORM, "Tipo Ritenuta");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_TIPORITENUTA, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_TIPORITENUTA, PPQRY_T63, "A.TIPO_RITENUTA", "TIPO_RITENUTA", 5, 1, 0, -13997);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_TIPORITENUTA, (new IDVariant("A")), "Acconto", "", "", -1);
    PAN_CAUSALFISCAL.SetValueListItem(PFL_CAUSALFISCAL_TIPORITENUTA, (new IDVariant("I")), "Imposta", "", "", -1);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, 628, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 220, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_UTENTEINSERI, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_UTENTEINSERI, PPQRY_T63, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, 748, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, 4, 244, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_DATAINSERIME, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_DATAINSERIME, PPQRY_T63, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, 856, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 268, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_UTENTULTIAGG, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_UTENTULTIAGG, PPQRY_T63, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, 968, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CAUSALFISCAL.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 292, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALFISCAL.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CAUSALFISCAL.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALFISCAL.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALFISCAL_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CAUSALFISCAL.SetFieldPage(PFL_CAUSALFISCAL_DATAULTIMAGG, -1, -1);
    PAN_CAUSALFISCAL.SetFieldPanel(PFL_CAUSALFISCAL_DATAULTIMAGG, PPQRY_T63, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CAUSALFISCAL_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAUSALFISCAL.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CAUSALFISCAL.SetIMDB(IMDB, "PQRY_T63", true);
    PAN_CAUSALFISCAL.set_SetString(MyGlb.MASTER_ROWNAME, "T62");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.QUADRO as QUADRO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DES_ABBREVIATA as DES_ABBREVIATA, ");
    SQL.append("  A.TIPO_CERT as TIPO_CERT, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.SUB_QUADRO as SUB_QUADRO, ");
    SQL.append("  A.CODICE_TS as CODICE_TS, ");
    SQL.append("  A.TIPO_RITENUTA as TIPO_RITENUTA, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CAUSALFISCAL.SetQuery(PPQRY_T63, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T62 A ");
    PAN_CAUSALFISCAL.SetQuery(PPQRY_T63, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALFISCAL.SetQuery(PPQRY_T63, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALFISCAL.SetQuery(PPQRY_T63, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALFISCAL.SetQuery(PPQRY_T63, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CAUSALFISCAL.SetQuery(PPQRY_T63, 5, SQL, -1, "");
    PAN_CAUSALFISCAL.SetQueryDB(PPQRY_T63, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALFISCAL.SetMasterTable(0, "T62");
    PAN_CAUSALFISCAL.AddToSortList(PFL_CAUSALFISCAL_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAUSALFISCAL.Status() == 2)
    {
      int oldListQBE = PAN_CAUSALFISCAL.iUseListQBE;
      PAN_CAUSALFISCAL.iUseListQBE = 0;
      PAN_CAUSALFISCAL.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAUSALFISCAL.PanelCommand(Glb.PCM_FIND);
      PAN_CAUSALFISCAL.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG_Init()
  {
    BUK_CAUSFISCBOOK.InitMastro(BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG, "3A94583D-400D-486B-8EF6-B96C3573CF9B");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG, "CAUFISBOOPAG");
    BUK_CAUSFISCBOOK.InitMastroBox(BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG, BUK_CAUSFISCBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_NUMEROPAGINA, "6AE31FD2-FCD7-4798-9F63-B52CA818122A");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_NUMEROPAGINA, BUK_CAUSFISCBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_NUMEROPAGINA, "AD85CC43-9C34-4853-9580-340F1A580785");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CAUSFISCBOOK.InitMastroBox(BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG, BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY, "21913D5D-DE27-4FB9-8BB2-7F9E19D2E1F6");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CAUSFISCBOOK.InitMastroBox(BUK_CAUSFISCBOOK_MST_CAUFISBOOPAG, BUK_CAUSFISCBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_TITOLO, "91B7D696-5306-4A55-B0CB-43AA8228E0D5");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CAUSFISCBOOK_RPT_NEWREPORT_InitQuery() { BUK_CAUSFISCBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CAUSFISCBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.QUADRO as QUADRO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.DES_ABBREVIATA as DES_ABBREVIATA, ");
      SQL.append("  A.TIPO_CERT as TIPO_CERT, ");
      SQL.append("  A.ARTICOLO as ARTICOLO, ");
      SQL.append("  A.SUB_QUADRO as SUB_QUADRO, ");
      SQL.append("  A.CODICE_TS as CODICE_TS, ");
      SQL.append("  A.TIPO_RITENUTA as TIPO_RITENUTA ");
      SQL.append("from ");
      SQL.append("  T62 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CAUSFISCBOOK.SetReportQuery(BUK_CAUSFISCBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "3454D522-53A1-4B8C-92C4-C609A43ED0A0");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CAUSFISCBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CAUSFISCBOOK.InitReport(BUK_CAUSFISCBOOK_RPT_NEWREPORT, 196609);
    BUK_CAUSFISCBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPT_NEWREPORT, "2F4C0838-F9B1-4A1C-8714-58890D1519C3");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CAUSFISCBOOK.InitSection(BUK_CAUSFISCBOOK_RPT_NEWREPORT, BUK_CAUSFISCBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSFISCBOOK.SetSectionRendersInto(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, "5DCA712A-C587-4388-90B5-EB7EF17BC561");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_CODICEHEADER, 200, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_CODICEHEADER, "5A0C2653-D5A5-452B-8BDB-143814C9E4D0");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_CODICEHEADER, BUK_CAUSFISCBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_CODICE, "31228ADC-F8D8-46A1-B9E9-75CA60DD4A15");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_CODICE, "CODICE");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_QUADROHEADER, 1500, 0, 1100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_QUADROHEADER, "7484129B-0B63-4972-ACEA-00D4C1DE80AB");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_QUADROHEADER, "QUADROHEADER");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_QUADROHEADER, BUK_CAUSFISCBOOK_SPAN_QUADRO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Quadro", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_QUADRO, "C8024090-FC69-4904-ABAD-EEAA8FAB4425");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_QUADRO, "QUADRO");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_DESCRIHEADER, 2800, 0, 3755, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_DESCRIHEADER, "E5BAEECF-55CC-4578-92C6-D9CB0A8C9217");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_DESCRIHEADER, BUK_CAUSFISCBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_DESCRIZIONE, "DCB1BB26-6BF6-4687-9D5A-6EFB1AA234CC");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_DESABBREHEAD, 7300, 0, 1745, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_DESABBREHEAD, "07E83B8B-7A68-48C1-A5C3-A0382775D0C4");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_DESABBREHEAD, "DESABBREHEAD");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_DESABBREHEAD, BUK_CAUSFISCBOOK_SPAN_CAUSALE770, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Causale 770", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_CAUSALE770, "5626649E-7C01-4C8D-8386-7184AD951AAD");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_CAUSALE770, "CAUSALE770");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_ARTICOHEADER, 9200, 0, 2500, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_ARTICOHEADER, "7C8706EE-3F96-4FB6-A461-943904A8C007");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_ARTICOHEADER, "ARTICOHEADER");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_ARTICOHEADER, BUK_CAUSFISCBOOK_SPAN_ARTICDILEGGE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Articolo", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_ARTICDILEGGE, "E7E9182C-9860-460C-9343-A546CC2ECFDE");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_ARTICDILEGGE, "ARTICDILEGGE");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_TIPOCERTHEAD, 12600, 0, 1453, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_TIPOCERTHEAD, "D664E5A0-0FAB-4783-9A54-122B1980C331");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_TIPOCERTHEAD, "TIPOCERTHEAD");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_TIPOCERTHEAD, BUK_CAUSFISCBOOK_SPAN_INVIOENTI, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Invio Enti", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_INVIOENTI, "EBD540FD-29AE-4A94-8733-8E62F8F23170");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_INVIOENTI, "INVIOENTI");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_CODICTSHEADE, 14300, 0, 1471, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_CODICTSHEADE, "1CFD5321-918A-49F4-AB9C-B04EABC2236B");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_CODICTSHEADE, "CODICTSHEADE");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_CODICTSHEADE, BUK_CAUSFISCBOOK_SPAN_CODTS, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Cod. T.S.", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_CODTS, "59FBE0CB-F94D-4552-BDD2-40BD812F3BD4");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_CODTS, "CODTS");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_PAGEHEADER, BUK_CAUSFISCBOOK_RPTBOX_TIPORITEHEAD, 16200, 0, 1990, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_TIPORITEHEAD, "4B6E77A8-8CF3-4978-9414-3BAFE3977D60");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_TIPORITEHEAD, "TIPORITEHEAD");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_TIPORITEHEAD, BUK_CAUSFISCBOOK_SPAN_TIPORITENUTA, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Tipo Ritenuta", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_TIPORITENUTA, "6A886DFE-EFC0-46AD-A850-5B842E5CC1BF");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_TIPORITENUTA, "TIPORITENUTA");
    BUK_CAUSFISCBOOK.InitSection(BUK_CAUSFISCBOOK_RPT_NEWREPORT, BUK_CAUSFISCBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSFISCBOOK.SetSectionRendersInto(BUK_CAUSFISCBOOK_SEC_TITOLO, BUK_CAUSFISCBOOK_RPTBOX_TITOLO);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SEC_TITOLO, "A3ECB859-7C70-4449-A270-1CA2ECB31889");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SEC_TITOLO, "TITOLO");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_TITOLO, BUK_CAUSFISCBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_NEWBOX, "070DE0AF-FB87-4B7C-86E2-6D53FD8E472C");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_NEWBOX, BUK_CAUSFISCBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Causali Fiscali", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_VARIADIBILAN, "DC38799D-83DF-4F17-B68F-B2A5C149A6CA");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CAUSFISCBOOK.InitSection(BUK_CAUSFISCBOOK_RPT_NEWREPORT, BUK_CAUSFISCBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSFISCBOOK.SetSectionRendersInto(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SEC_DETAIL, "56F65A1B-EEE2-4C04-BF9C-3B17AC363A30");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SEC_DETAIL, "DETAIL");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_CODICE, 0, 0, 1000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_CODICE, "3494979A-09FC-4A3A-91B8-879A82EB9CD0");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_CODICE, BUK_CAUSFISCBOOK_SPAN_T6COCAFICAFB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_T6COCAFICAFB, "66CE9ED5-41C1-4C29-8E6E-340C41EFFFCF");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_T6COCAFICAFB, "T6COCAFICAFB");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_QUADRO, 1800, 0, 819, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_QUADRO, "02DF7B82-B765-4DF3-990D-0F60629B2FD5");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_QUADRO, "QUADRO");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_QUADRO, BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "Brief description of field content.", "::QUADRO", 1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "SA", "", (new IDVariant("SA")), null, "", -1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "SC", "", (new IDVariant("SC")), null, "", -1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "SE", "", (new IDVariant("SE")), null, "", -1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "SF", "", (new IDVariant("SF")), null, "", -1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "SH", "", (new IDVariant("SH")), null, "", -1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "SR", "", (new IDVariant("SR")), null, "", -1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "52052386-C313-4E81-9D51-6C76438F8A96");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_T6QUCAFICAFB, "T6QUCAFICAFB");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_DESCRIZIONE, 2800, 0, 4300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_DESCRIZIONE, "5B8F1C22-78BB-4B06-9F95-E3CFBB953FC3");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_DESCRIZIONE, BUK_CAUSFISCBOOK_SPAN_T6DECAFICAFB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_T6DECAFICAFB, "7FD27FA7-BD2E-460B-9EE4-769BA44D8F74");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_T6DECAFICAFB, "T6DECAFICAFB");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_DESABBREVIAT, 7300, 0, 1745, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_DESABBREVIAT, "CF70A025-1B35-4156-BB90-1AC0D30598D8");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_DESABBREVIAT, "DESABBREVIAT");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_DESABBREVIAT, BUK_CAUSFISCBOOK_SPAN_T6CA77CAFCFB, MyGlb.VIS_DEFAREPOSTYL, 5, 9, 0, 271384705, "Brief description of field content.", "::DES_ABBREVIATA", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_T6CA77CAFCFB, "B79FB67C-F9EB-4D4A-AB5E-22FBE1CB881A");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_T6CA77CAFCFB, "T6CA77CAFCFB");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_ARTICOLO, 9200, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_ARTICOLO, "F9A74A2D-665D-44EF-AE71-2A4E246C6B81");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_ARTICOLO, "ARTICOLO");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_ARTICOLO, BUK_CAUSFISCBOOK_SPAN_T6ARDILCFCFB, MyGlb.VIS_DEFAREPOSTYL, 5, 30, 0, 271384705, "Brief description of field content.", "::ARTICOLO", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_T6ARDILCFCFB, "89F7BE11-4705-40CA-B8B2-0AAEB7E51BC4");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_T6ARDILCFCFB, "T6ARDILCFCFB");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_TIPOCERT, 13100, 0, 553, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_TIPOCERT, "87BBEBA2-953F-4E50-AB01-2EBFFE3D71CA");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_TIPOCERT, "TIPOCERT");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_TIPOCERT, BUK_CAUSFISCBOOK_SPAN_IETIECFCFBES, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_IETIECFCFBES, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_IETIECFCFBES, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_IETIECFCFBES, "6C742B37-39A7-4E10-946C-0A1817422389");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_IETIECFCFBES, "IETIECFCFBES");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_CODICETS, 14300, 0, 1471, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_CODICETS, "40E52F04-D272-424D-8077-18A0B7D173A8");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_CODICETS, "CODICETS");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_CODICETS, BUK_CAUSFISCBOOK_SPAN_T6COTSCAFCFB, MyGlb.VIS_DEFAREPOSTYL, 5, 2, 0, 271384705, "Brief description of field content.", "::CODICE_TS", 1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_T6COTSCAFCFB, "E91762D2-533C-4C5E-9015-2AC2CF50F3B4");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_T6COTSCAFCFB, "T6COTSCAFCFB");
    BUK_CAUSFISCBOOK.InitReportBox(BUK_CAUSFISCBOOK_SEC_DETAIL, BUK_CAUSFISCBOOK_RPTBOX_TIPORITENUTA, 16200, 0, 1890, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_RPTBOX_TIPORITENUTA, "72277367-B3D2-4DF8-835F-EC3C6855F8FF");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_RPTBOX_TIPORITENUTA, "TIPORITENUTA");
    BUK_CAUSFISCBOOK.InitBoxSpan(BUK_CAUSFISCBOOK_RPTBOX_TIPORITENUTA, BUK_CAUSFISCBOOK_SPAN_T6TIRICAFCFB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::TIPO_RITENUTA", 1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6TIRICAFCFB, "Acconto", "Type the value and explain what it means.", (new IDVariant("A")), null, "", -1);
    BUK_CAUSFISCBOOK.SetSpanValueListItem(BUK_CAUSFISCBOOK_SPAN_T6TIRICAFCFB, "Imposta", "Type the value and explain what it means.", (new IDVariant("I")), null, "", -1);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SPAN_T6TIRICAFCFB, "2101E9F7-40CE-49ED-BD62-ED3D4EE1C32C");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SPAN_T6TIRICAFCFB, "T6TIRICAFCFB");
    BUK_CAUSFISCBOOK.InitSection(BUK_CAUSFISCBOOK_RPT_NEWREPORT, BUK_CAUSFISCBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CAUSFISCBOOK.SetSectionRendersInto(BUK_CAUSFISCBOOK_SEC_PAGEFOOTER, BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SEC_PAGEFOOTER, "74CF9C88-B7D3-49CC-BC76-2F5925246603");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CAUSFISCBOOK.InitSection(BUK_CAUSFISCBOOK_RPT_NEWREPORT, BUK_CAUSFISCBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CAUSFISCBOOK.SetSectionRendersInto(BUK_CAUSFISCBOOK_SEC_REPORTFOOTER, BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSFISCBOOK.SetRTCGuid(BUK_CAUSFISCBOOK_SEC_REPORTFOOTER, "7D4AC2D5-82FC-4241-84DD-983139C53E26");
    BUK_CAUSFISCBOOK.SetObjCode(BUK_CAUSFISCBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CAUSFISCBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CAUSFISCBOOK_InitLinks()
  {
    BUK_CAUSFISCBOOK.SetBoxNextBox(BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY, BUK_CAUSFISCBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAUSALFISCAL) PAN_CAUSALFISCAL_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALFISCAL) PAN_CAUSALFISCAL_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAUSALFISCAL) PAN_CAUSALFISCAL_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALFISCAL) PAN_CAUSALFISCAL_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAUSALFISCAL) PAN_CAUSALFISCAL_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CAUSALFISCAL) PAN_CAUSALFISCAL_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CAUSFISCBOOK) BUK_CAUSFISCBOOK_OnPreview();
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
