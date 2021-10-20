// **********************************************
// Controllo Equitalia
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloEquitalia extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CONTROEQUITA_LIQUIDAZIONE = 0;
  private static int PFL_CONTROEQUITA_BENEFICIARIO = 1;
  private static int PFL_CONTROEQUITA_IMPORTO = 2;
  private static int PFL_CONTROEQUITA_DESCRIZIONE = 3;

  private static int PPQRY_LIQ59 = 0;


  IDPanel PAN_CONTROEQUITA;
  CIDREObj BUK_LIBRCONTEQUI;
  OBook BKW_LIBRCONTEQUI;
  //
  // Template Pages constants
  private static int BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBRCONTEQUI_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBRCONTEQUI_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBRCONTEQUI_RPTBOX_TESTATPAGINA = 4;
  private static int BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA = 5;
  private static int BUK_LIBRCONTEQUI_RPTBOX_PIEDEPAGINA = 6;

  //
  // Reports constants
  private static int BUK_LIBRCONTEQUI_RPT_NUOVOREPORT = 7;
  private static int BUK_LIBRCONTEQUI_SEC_INTESTREPORT = 8;
  private static int BUK_LIBRCONTEQUI_SEC_INTESTPAGINA = 9;
  private static int BUK_LIBRCONTEQUI_RPTBOX_TITOLO = 10;
  private static int BUK_LIBRCONTEQUI_SPAN_NUOVASPAN = 11;
  private static int BUK_LIBRCONTEQUI_RPTBOX_LIQUIDHEADER = 12;
  private static int BUK_LIBRCONTEQUI_SPAN_LIQUIDAZION1 = 13;
  private static int BUK_LIBRCONTEQUI_RPTBOX_BENEFIHEADER = 14;
  private static int BUK_LIBRCONTEQUI_SPAN_BENEFICIARI1 = 15;
  private static int BUK_LIBRCONTEQUI_RPTBOX_IMPORTHEADER = 16;
  private static int BUK_LIBRCONTEQUI_SPAN_IMPORTO1 = 17;
  private static int BUK_LIBRCONTEQUI_RPTBOX_DESCRIHEADER = 18;
  private static int BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE1 = 19;
  private static int BUK_LIBRCONTEQUI_SEC_DETTAGLIO = 20;
  private static int BUK_LIBRCONTEQUI_RPTBOX_LIQUIDAZIONE = 21;
  private static int BUK_LIBRCONTEQUI_SPAN_LIQUIDAZIONE = 22;
  private static int BUK_LIBRCONTEQUI_RPTBOX_BENEFICIARIO = 23;
  private static int BUK_LIBRCONTEQUI_SPAN_BENEFICIARIO = 24;
  private static int BUK_LIBRCONTEQUI_RPTBOX_IMPORTO = 25;
  private static int BUK_LIBRCONTEQUI_SPAN_IMPORTO = 26;
  private static int BUK_LIBRCONTEQUI_RPTBOX_DESCRIZIONE = 27;
  private static int BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE = 28;
  private static int BUK_LIBRCONTEQUI_SEC_PIEDEPAGINA = 29;
  private static int BUK_LIBRCONTEQUI_SEC_PIEDEREPORT = 30;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ELENCOEQUITA(IMDB);
    //
    //
    Init_PQRY_LIQ59(IMDB);
    Init_PQRY_LIQ59_RS(IMDB);
    Init_PQRY_LIQ31(IMDB);
    Init_PQRY_LIQ31_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ELENCOEQUITA(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_ELENCOEQUITA, 6);
    IMDB.set_TblCode(IMDBDef5.TBL_ELENCOEQUITA, "TBL_ELENCOEQUITA");
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQULIQU, "ELENLIQULIQU");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQULIQU,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUBENE, "ELENLIQUBENE");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUBENE,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUIMPO, "ELENLIQUIMPO");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUDESC, "ELENLIQUDESC");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELELIQANNLIQ, "ELELIQANNLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELELIQANNLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELELIQNUMLIQ, "ELELIQNUMLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCOEQUITA,IMDBDef5.FLD_ELENCOEQUITA_ELELIQNUMLIQ,1,5,0);
  }

  private static void Init_PQRY_LIQ59(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ59, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ59, "PQRY_LIQ59");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59,IMDBDef14.PQSL_LIQ59_NUMEROLIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ59, 0);
  }

  private static void Init_PQRY_LIQ59_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ59_RS, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ59_RS, "PQRY_LIQ59_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ59_RS,IMDBDef14.PQSL_LIQ59_NUMEROLIQ,1,5,0);
  }

  private static void Init_PQRY_LIQ31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ31, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ31, "PQRY_LIQ31");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31,IMDBDef14.PQSL_LIQ31_NUMEROLIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ31, 0);
  }

  private static void Init_PQRY_LIQ31_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ31_RS, 6);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ31_RS, "PQRY_LIQ31_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ31_RS,IMDBDef14.PQSL_LIQ31_NUMEROLIQ,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloEquitalia(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloEquitalia()
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
    FormIdx = MyGlb.FRM_CONTROEQUITA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E125C58F-FED7-4B2E-99E9-CFF8C22C9388";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 732;
    DesignHeight = 374;
    set_Caption(new IDVariant("Controllo Equitalia"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 732;
    Frames[1].Height = 348;
    Frames[1].Caption = "Controllo Equitalia";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_CONTROEQUITA = new IDPanel(w, this, 1, "PAN_CONTROEQUITA");
    Frames[1].Content = PAN_CONTROEQUITA;
    PAN_CONTROEQUITA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTROEQUITA.VS = MainFrm.VisualStyleList;
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 732-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBRCONTEQUI != null)
      PAN_CONTROEQUITA.SetBook(BUK_LIBRCONTEQUI);
    PAN_CONTROEQUITA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8085D81E-4519-4358-AF12-C65322F952F4");
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 692, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTROEQUITA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTROEQUITA.InitStatus = 2;
    PAN_CONTROEQUITA_Init();
    PAN_CONTROEQUITA_InitFields();
    PAN_CONTROEQUITA_InitQueries();
    BKW_LIBRCONTEQUI = new OBook(this);
    BUK_LIBRCONTEQUI = new CIDREObj(BKW_LIBRCONTEQUI);
    BKW_LIBRCONTEQUI.iGuid = "1EEE1A0A-7A94-438B-B18D-703F9904D82C";
    BKW_LIBRCONTEQUI.Code = "BUK_LIBRCONTEQUI";
    BKW_LIBRCONTEQUI.BookObj = BUK_LIBRCONTEQUI;
    BKW_LIBRCONTEQUI.InitDefMasks();
    BUK_LIBRCONTEQUI.InitBook(1, 1245441, "Libro Controllo Equitalia", IMDB, MainFrm.VisualStyleList);
    BUK_LIBRCONTEQUI.InitHTML();
    BUK_LIBRCONTEQUI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBRCONTEQUI.Book.SetMainFrm(MainFrm);
    BUK_LIBRCONTEQUI.SetRTCGuid(0, "1EEE1A0A-7A94-438B-B18D-703F9904D82C");
    BUK_LIBRCONTEQUI.SetObjCode(0, "LIBRCONTEQUI");
    if (PAN_CONTROEQUITA != null)
      PAN_CONTROEQUITA.SetBook(BUK_LIBRCONTEQUI);
    BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST_Init();
    BUK_LIBRCONTEQUI_RPT_NUOVOREPORT_Init();
    BUK_LIBRCONTEQUI_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCOEQUITA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROEQUITA_LIQ59();
      }
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCOEQUITA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROEQUITA_LIQ31();
      }
      PAN_CONTROEQUITA.UpdatePanel(MainFrm);
      // BUK_LIBRCONTEQUI.UpdateBook();
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
    if (Code.equals("BUK_LIBRCONTEQUI")) return BUK_LIBRCONTEQUI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloEquitalia);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloEquitalia.class.getName() : (Glb.ClassWithPackage(ControlloEquitalia.class) ? ControlloEquitalia.class.getName().substring(ControlloEquitalia.class.getPackage().getName().length() + 1) : ControlloEquitalia.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      UNLOAD_ELENEQUIDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloEquitalia", "Unload", _e);
    }
  }

  // **********************************************************************
  // Elenco Equitalia: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_ELENEQUIDELE() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_ELENCOEQUITA);
  }

  // **********************************************************************
  // LIQ
  // Primary record source for panel data
  // **********************************************************************
  private void CONTROEQUITA_LIQ59() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_LIQ59_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCOEQUITA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_ELENCOEQUITA, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_LIQ59_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_LIQ59_RS, 0, IMDBDef5.TBL_ELENCOEQUITA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ59_RS, 0, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQULIQU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ59_RS, 1, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUBENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ59_RS, 2, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUIMPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ59_RS, 3, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUDESC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ59_RS, 4, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELELIQANNLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ59_RS, 5, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELELIQNUMLIQ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_ELENCOEQUITA, 0);
      if (IMDB.Eof(IMDBDef5.TBL_ELENCOEQUITA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCOEQUITA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef14.PQRY_LIQ59_RS);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ59_RS,4,true);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ59_RS,5,true);
    IMDB.TblStartSort(IMDBDef14.PQRY_LIQ59_RS);
    IMDB.TblMoveFirst(IMDBDef14.PQRY_LIQ59_RS, 0);
  }

  // **********************************************************************
  // LIQ
  // Primary record source for panel data
  // **********************************************************************
  private void CONTROEQUITA_LIQ31() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_LIQ31_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCOEQUITA, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_ELENCOEQUITA, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_LIQ31_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_LIQ31_RS, 0, IMDBDef5.TBL_ELENCOEQUITA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ31_RS, 0, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQULIQU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ31_RS, 1, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUBENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ31_RS, 2, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUIMPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ31_RS, 3, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUDESC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ31_RS, 4, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELELIQANNLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ31_RS, 5, 0, IMDBDef5.TBL_ELENCOEQUITA, IMDBDef5.FLD_ELENCOEQUITA_ELELIQNUMLIQ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_ELENCOEQUITA, 0);
      if (IMDB.Eof(IMDBDef5.TBL_ELENCOEQUITA, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCOEQUITA, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef14.PQRY_LIQ31_RS);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ31_RS,4,true);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ31_RS,5,true);
    IMDB.TblStartSort(IMDBDef14.PQRY_LIQ31_RS);
    IMDB.TblMoveFirst(IMDBDef14.PQRY_LIQ31_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
  // **********************************************************************
  // Load
  // Evento notificato alla videata al momento del caricamento
  // in memoria.
  // **********************************************************************
  private void IntFormLoad ()
  {
      MainFrm.IntFormLoad(this);
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
  private void PAN_CONTROEQUITA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTROEQUITA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTROEQUITA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTROEQUITA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTROEQUITA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTROEQUITA);
    // Stub
  }

  private void PAN_CONTROEQUITA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTROEQUITA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTROEQUITA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTROEQUITA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBRCONTEQUI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBRCONTEQUI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBRCONTEQUI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBRCONTEQUI_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBRCONTEQUI_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_LIBRCONTEQUI_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_LIBRCONTEQUI_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBRCONTEQUI_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBRCONTEQUI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST)
    {
      BUK_LIBRCONTEQUI.set_SpanValue(BUK_LIBRCONTEQUI_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRCONTEQUI.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBRCONTEQUI.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBRCONTEQUI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBRCONTEQUI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBRCONTEQUI_OnIMDBUpdate(int RepID)
  {
  try
  {
    if (RepID == BUK_LIBRCONTEQUI_RPT_NUOVOREPORT)
    {
      // Report's IMDB master query
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCOEQUITA, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTROEQUITA_LIQ31();
      }
    }
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBRCONTEQUI_OnPreview()
  {
    PreviewBook = BKW_LIBRCONTEQUI;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTROEQUITA_Init()
  {

    PAN_CONTROEQUITA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTROEQUITA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTROEQUITA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_CONTROEQUITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, "DB1F9E4D-216B-47E3-8B0B-AC79341DA155");
    PAN_CONTROEQUITA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, "Liquidazione");
    PAN_CONTROEQUITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, "");
    PAN_CONTROEQUITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROEQUITA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROEQUITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, "38CEA98D-8559-43AA-A23F-883F93D12C63");
    PAN_CONTROEQUITA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, "Beneficiario");
    PAN_CONTROEQUITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, "");
    PAN_CONTROEQUITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROEQUITA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROEQUITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, "16877DFB-A406-413E-8163-A706A7CFC3C0");
    PAN_CONTROEQUITA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, "Importo");
    PAN_CONTROEQUITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, "");
    PAN_CONTROEQUITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROEQUITA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTROEQUITA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, "B0B39C4B-ED90-4B99-AE79-7DF8071B8C77");
    PAN_CONTROEQUITA.set_Header(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, "Descrizione");
    PAN_CONTROEQUITA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, "");
    PAN_CONTROEQUITA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTROEQUITA.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTROEQUITA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_LIST, 68);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_FORM, 4, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_FORM, 68);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_LIQUIDAZIONE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_CONTROEQUITA.SetFieldPage(PFL_CONTROEQUITA_LIQUIDAZIONE, -1, -1);
    PAN_CONTROEQUITA.SetFieldPanel(PFL_CONTROEQUITA_LIQUIDAZIONE, PPQRY_LIQ59, "A.ELENLIQULIQU", "LIQLIQUIDAZI", 5, 20, 0, -13997);
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_LIST, 84, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_LIST, 64);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 28, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_FORM, 64);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_BENEFICIARIO, MyGlb.PANEL_FORM, "Benefic.");
    PAN_CONTROEQUITA.SetFieldPage(PFL_CONTROEQUITA_BENEFICIARIO, -1, -1);
    PAN_CONTROEQUITA.SetFieldPanel(PFL_CONTROEQUITA_BENEFICIARIO, PPQRY_LIQ59, "A.ELENLIQUBENE", "LIQBENEFICIA", 5, 40, 0, -13997);
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_LIST, 336, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_CONTROEQUITA.SetFieldPage(PFL_CONTROEQUITA_IMPORTO, -1, -1);
    PAN_CONTROEQUITA.SetFieldPanel(PFL_CONTROEQUITA_IMPORTO, PPQRY_LIQ59, "A.ELENLIQUIMPO", "LIQIMPORTO", 3, 14, 2, -13997);
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_LIST, 444, 36, 248, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONTROEQUITA.SetRect(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 424, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTROEQUITA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_CONTROEQUITA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CONTROEQUITA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTROEQUITA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_CONTROEQUITA.SetFieldPage(PFL_CONTROEQUITA_DESCRIZIONE, -1, -1);
    PAN_CONTROEQUITA.SetFieldPanel(PFL_CONTROEQUITA_DESCRIZIONE, PPQRY_LIQ59, "A.ELENLIQUDESC", "LIQDESCRIZIO", 5, 140, 0, -13997);
  }

  private void PAN_CONTROEQUITA_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTROEQUITA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTROEQUITA.SetIMDB(IMDB, "PQRY_LIQ59", true);
    PAN_CONTROEQUITA.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    PAN_CONTROEQUITA.SetQueryIMDB(PPQRY_LIQ59, IMDBDef14.PQRY_LIQ59_RS, IMDBDef5.TBL_ELENCOEQUITA);
    JustLoaded = true;
    PAN_CONTROEQUITA.SetFieldPrimaryIndex(PFL_CONTROEQUITA_LIQUIDAZIONE, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQULIQU);
    PAN_CONTROEQUITA.SetFieldPrimaryIndex(PFL_CONTROEQUITA_BENEFICIARIO, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUBENE);
    PAN_CONTROEQUITA.SetFieldPrimaryIndex(PFL_CONTROEQUITA_IMPORTO, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUIMPO);
    PAN_CONTROEQUITA.SetFieldPrimaryIndex(PFL_CONTROEQUITA_DESCRIZIONE, IMDBDef5.FLD_ELENCOEQUITA_ELENLIQUDESC);
    PAN_CONTROEQUITA.SetMasterTable(0, "ELENCOEQUITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTROEQUITA.Status() == 2)
    {
      int oldListQBE = PAN_CONTROEQUITA.iUseListQBE;
      PAN_CONTROEQUITA.iUseListQBE = 0;
      PAN_CONTROEQUITA.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTROEQUITA.PanelCommand(Glb.PCM_FIND);
      PAN_CONTROEQUITA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBRCONTEQUI.InitMastro(BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST, "397A7A81-6C43-4B25-980E-ADF1CDA0E5CC");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBRCONTEQUI.InitMastroBox(BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST, BUK_LIBRCONTEQUI_RPTBOX_NUMEROPAGINA, 17500, 400, 2500, 400, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_NUMEROPAGINA, "649D8223-F32B-4212-9061-F8131BDC0ECD");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_NUMEROPAGINA, BUK_LIBRCONTEQUI_SPAN_NUMEROPAGINA, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_NUMEROPAGINA, "19889FFD-8327-47FA-8523-26F3661AA64E");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBRCONTEQUI.InitMastroBox(BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST, BUK_LIBRCONTEQUI_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_TESTATPAGINA, "F3BDEFB3-B029-4025-AFD6-7242D044E67F");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBRCONTEQUI.InitMastroBox(BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST, BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA, 1000, 3100, 19000, 22600, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA, "3810651C-5E82-4062-93B2-832CB24BFCCC");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBRCONTEQUI.InitMastroBox(BUK_LIBRCONTEQUI_MST_NUOVPAGIMAST, BUK_LIBRCONTEQUI_RPTBOX_PIEDEPAGINA, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_PIEDEPAGINA, "360E1B94-F6D9-4898-8ABF-CEE1BDF1FE94");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_LIBRCONTEQUI_RPT_NUOVOREPORT_InitQuery() { BUK_LIBRCONTEQUI_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBRCONTEQUI_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      BUK_LIBRCONTEQUI.SetReportQuery(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, (IDConnection)null, IMDBDef14.PQRY_LIQ31_RS, "", "6DF41888-9764-4687-8D80-9581A4D53DA3");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBRCONTEQUI_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBRCONTEQUI.InitReport(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, 196609);
    BUK_LIBRCONTEQUI_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, "0EB24D3A-D23D-4CBD-BA2B-399D36931D26");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBRCONTEQUI.InitSection(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, BUK_LIBRCONTEQUI_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRCONTEQUI.SetSectionRendersInto(BUK_LIBRCONTEQUI_SEC_INTESTREPORT, BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SEC_INTESTREPORT, "12CBE6F3-DBEB-4A4F-B0E2-4821BB828D1D");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBRCONTEQUI.InitSection(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRCONTEQUI.SetSectionRendersInto(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, BUK_LIBRCONTEQUI_RPTBOX_TESTATPAGINA);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, "FE926476-5726-421B-A96F-1BCC501A3DEB");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, BUK_LIBRCONTEQUI_RPTBOX_TITOLO, 0, 100, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITOLIINBOX, 983041, 590, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_TITOLO, "E4EE9847-B000-4B6E-87CC-A109F54D5BC9");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_TITOLO, BUK_LIBRCONTEQUI_SPAN_NUOVASPAN, MyGlb.VIS_TITOLIINBOX, 0, 0, 0, 271384961, "", "Controllo Equitalia", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_NUOVASPAN, "96D1E583-5020-43C9-AAE6-8ABEDB136D25");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, BUK_LIBRCONTEQUI_RPTBOX_LIQUIDHEADER, 0, 1500, 2200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_LIQUIDHEADER, "28D9A679-8CA8-4F4F-BD96-EC2D88BABE32");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_LIQUIDHEADER, BUK_LIBRCONTEQUI_SPAN_LIQUIDAZION1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Liquidazione", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_LIQUIDAZION1, "B9ACD40D-A9E9-48FD-B479-DA774E2DDBA5");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_LIQUIDAZION1, "LIQUIDAZION1");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, BUK_LIBRCONTEQUI_RPTBOX_BENEFIHEADER, 2300, 1500, 6678, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_BENEFIHEADER, "F7EA703C-6721-4D32-81CE-A2A95DC729F0");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_BENEFIHEADER, "BENEFIHEADER");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_BENEFIHEADER, BUK_LIBRCONTEQUI_SPAN_BENEFICIARI1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Beneficiario", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_BENEFICIARI1, "614132B2-D078-45D7-BBD8-07A50895682C");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_BENEFICIARI1, "BENEFICIARI1");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, BUK_LIBRCONTEQUI_RPTBOX_IMPORTHEADER, 9100, 1500, 2810, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_IMPORTHEADER, "E4E0B8B5-FEFD-480A-8A9F-79D3335183A3");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_IMPORTHEADER, BUK_LIBRCONTEQUI_SPAN_IMPORTO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_IMPORTO1, "E213E4A4-6139-40BD-9F33-DBB017B20E6D");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_IMPORTO1, "IMPORTO1");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_INTESTPAGINA, BUK_LIBRCONTEQUI_RPTBOX_DESCRIHEADER, 12300, 1500, 6653, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_DESCRIHEADER, "3E95DE3C-4641-4A27-BDA5-80D6FE154845");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_DESCRIHEADER, BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE1, "6BF9D5BC-1F08-4179-9947-6516D17A3BD0");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBRCONTEQUI.InitSection(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, BUK_LIBRCONTEQUI_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRCONTEQUI.SetSectionRendersInto(BUK_LIBRCONTEQUI_SEC_DETTAGLIO, BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SEC_DETTAGLIO, "ACA6D5F8-EE1C-40B9-A4DE-B745CC4A5E2B");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_DETTAGLIO, BUK_LIBRCONTEQUI_RPTBOX_LIQUIDAZIONE, 0, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_LIQUIDAZIONE, "3C3B5797-FFC2-48D2-B547-668FB8B2443D");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_LIQUIDAZIONE, "LIQUIDAZIONE");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_LIQUIDAZIONE, BUK_LIBRCONTEQUI_SPAN_LIQUIDAZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384705, "", "::LIQLIQUIDAZI", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_LIQUIDAZIONE, "A7C7FFA7-56C6-426F-8DEC-7C91ED56E9C5");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_LIQUIDAZIONE, "LIQUIDAZIONE");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_DETTAGLIO, BUK_LIBRCONTEQUI_RPTBOX_BENEFICIARIO, 2300, 0, 6678, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_BENEFICIARIO, "2DD14F96-0F3E-480C-8F4A-FFA616D285C5");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_BENEFICIARIO, "BENEFICIARIO");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_BENEFICIARIO, BUK_LIBRCONTEQUI_SPAN_BENEFICIARIO, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::LIQBENEFICIA", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_BENEFICIARIO, "9B349F13-B420-43A8-8D19-1CC98DD4ADE8");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_BENEFICIARIO, "BENEFICIARIO");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_DETTAGLIO, BUK_LIBRCONTEQUI_RPTBOX_IMPORTO, 9100, 0, 2810, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_IMPORTO, "41170932-8FF1-41F3-B8D9-F38407B03C37");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_IMPORTO, BUK_LIBRCONTEQUI_SPAN_IMPORTO, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::LIQIMPORTO", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_IMPORTO, "53FAB1FB-F599-4B18-B020-9F24A10C38C9");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBRCONTEQUI.InitReportBox(BUK_LIBRCONTEQUI_SEC_DETTAGLIO, BUK_LIBRCONTEQUI_RPTBOX_DESCRIZIONE, 12300, 0, 6653, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_RPTBOX_DESCRIZIONE, "3454DED1-3D21-4EE8-AFFA-74EA81C92DA9");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRCONTEQUI.InitBoxSpan(BUK_LIBRCONTEQUI_RPTBOX_DESCRIZIONE, BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::LIQDESCRIZIO", 1);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE, "667017E1-E474-4D0D-BA35-A3E5B636EA7C");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBRCONTEQUI.InitSection(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, BUK_LIBRCONTEQUI_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRCONTEQUI.SetSectionRendersInto(BUK_LIBRCONTEQUI_SEC_PIEDEPAGINA, BUK_LIBRCONTEQUI_RPTBOX_PIEDEPAGINA);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SEC_PIEDEPAGINA, "4091DA64-B1FF-417C-90E2-EA46F3763033");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBRCONTEQUI.InitSection(BUK_LIBRCONTEQUI_RPT_NUOVOREPORT, BUK_LIBRCONTEQUI_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBRCONTEQUI.SetSectionRendersInto(BUK_LIBRCONTEQUI_SEC_PIEDEREPORT, BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA);
    BUK_LIBRCONTEQUI.SetRTCGuid(BUK_LIBRCONTEQUI_SEC_PIEDEREPORT, "83673B4C-2341-4B1F-89D4-29A96E06A7DB");
    BUK_LIBRCONTEQUI.SetObjCode(BUK_LIBRCONTEQUI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBRCONTEQUI_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBRCONTEQUI_InitLinks()
  {
    BUK_LIBRCONTEQUI.SetBoxNextBox(BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA, BUK_LIBRCONTEQUI_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTROEQUITA) PAN_CONTROEQUITA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTROEQUITA) PAN_CONTROEQUITA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTROEQUITA) PAN_CONTROEQUITA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTROEQUITA) PAN_CONTROEQUITA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTROEQUITA) PAN_CONTROEQUITA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBRCONTEQUI) BUK_LIBRCONTEQUI_OnPreview();
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
