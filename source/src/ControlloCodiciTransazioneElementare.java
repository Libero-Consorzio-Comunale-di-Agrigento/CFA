// **********************************************
// Controllo Codici Transazione Elementare
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloCodiciTransazioneElementare extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CONCODTRAELE_LIQUIDAZIONE = 0;
  private static int PFL_CONCODTRAELE_BENEFICIARIO = 1;
  private static int PFL_CONCODTRAELE_IMPORTO = 2;
  private static int PFL_CONCODTRAELE_DESCRIZIONE = 3;
  private static int PFL_CONCODTRAELE_STATOCTE = 4;

  private static int PPQRY_LIQ35 = 0;


  IDPanel PAN_CONCODTRAELE;
  CIDREObj BUK_LIBCONCOTREL;
  OBook BKW_LIBCONCOTREL;
  //
  // Template Pages constants
  private static int BUK_LIBCONCOTREL_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBCONCOTREL_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBCONCOTREL_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBCONCOTREL_RPTBOX_TESTATPAGINA = 4;
  private static int BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA = 5;
  private static int BUK_LIBCONCOTREL_RPTBOX_PIEDEPAGINA = 6;

  //
  // Reports constants
  private static int BUK_LIBCONCOTREL_RPT_NUOVOREPORT = 7;
  private static int BUK_LIBCONCOTREL_SEC_INTESTREPORT = 8;
  private static int BUK_LIBCONCOTREL_SEC_INTESTPAGINA = 9;
  private static int BUK_LIBCONCOTREL_RPTBOX_TITOLO = 10;
  private static int BUK_LIBCONCOTREL_SPAN_NUOVASPAN = 11;
  private static int BUK_LIBCONCOTREL_RPTBOX_LIQUIDHEADER = 12;
  private static int BUK_LIBCONCOTREL_SPAN_C1 = 13;
  private static int BUK_LIBCONCOTREL_RPTBOX_BENEFIHEADER = 14;
  private static int BUK_LIBCONCOTREL_SPAN_BENEFICIARI1 = 15;
  private static int BUK_LIBCONCOTREL_RPTBOX_IMPORTHEADER = 16;
  private static int BUK_LIBCONCOTREL_SPAN_IMPORTO1 = 17;
  private static int BUK_LIBCONCOTREL_RPTBOX_DESCRIHEADER = 18;
  private static int BUK_LIBCONCOTREL_SPAN_DESCRIZIONE1 = 19;
  private static int BUK_LIBCONCOTREL_RPTBOX_STATOCTEHEAD = 20;
  private static int BUK_LIBCONCOTREL_SPAN_C = 21;
  private static int BUK_LIBCONCOTREL_SEC_DETTAGLIO = 22;
  private static int BUK_LIBCONCOTREL_RPTBOX_LIQUIDAZIONE = 23;
  private static int BUK_LIBCONCOTREL_SPAN_LILICCTELCCG = 24;
  private static int BUK_LIBCONCOTREL_RPTBOX_BENEFICIARIO = 25;
  private static int BUK_LIBCONCOTREL_SPAN_LIBECCTELCCG = 26;
  private static int BUK_LIBCONCOTREL_RPTBOX_IMPORTO = 27;
  private static int BUK_LIBCONCOTREL_SPAN_LIIMCCTELCCG = 28;
  private static int BUK_LIBCONCOTREL_RPTBOX_DESCRIZIONE = 29;
  private static int BUK_LIBCONCOTREL_SPAN_LIDECCTELCCG = 30;
  private static int BUK_LIBCONCOTREL_RPTBOX_STATOCTE = 31;
  private static int BUK_LIBCONCOTREL_SPAN_LSCCCTELCCTE = 32;
  private static int BUK_LIBCONCOTREL_SEC_PIEDEPAGINA = 33;
  private static int BUK_LIBCONCOTREL_SEC_PIEDEREPORT = 34;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ELENCLIQUCTE(IMDB);
    //
    //
    Init_PQRY_LIQ35(IMDB);
    Init_PQRY_LIQ35_RS(IMDB);
    Init_PQRY_LIQ32(IMDB);
    Init_PQRY_LIQ32_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ELENCLIQUCTE(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_ELENCLIQUCTE, 7);
    IMDB.set_TblCode(IMDBDef5.TBL_ELENCLIQUCTE, "TBL_ELENCLIQUCTE");
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQULIQU, "ELENLIQULIQU");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQULIQU,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUBENE, "ELENLIQUBENE");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUBENE,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUIMPO, "ELENLIQUIMPO");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUDESC, "ELENLIQUDESC");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQSTACTE, "ELELIQSTACTE");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQSTACTE,5,100,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQANNLIQ, "ELELIQANNLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQANNLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQNUMLIQ, "ELELIQNUMLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCTE,IMDBDef5.FLD_ELENCLIQUCTE_ELELIQNUMLIQ,1,5,0);
  }

  private static void Init_PQRY_LIQ35(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ35, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ35, "PQRY_LIQ35");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQSTATOCTE, "LIQSTATOCTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_LIQSTATOCTE,5,100,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35,IMDBDef14.PQSL_LIQ35_NUMEROLIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ35, 0);
  }

  private static void Init_PQRY_LIQ35_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ35_RS, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ35_RS, "PQRY_LIQ35_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQSTATOCTE, "LIQSTATOCTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_LIQSTATOCTE,5,100,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ35_RS,IMDBDef14.PQSL_LIQ35_NUMEROLIQ,1,5,0);
  }

  private static void Init_PQRY_LIQ32(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ32, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ32, "PQRY_LIQ32");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQSTATOCTE, "LIQSTATOCTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_LIQSTATOCTE,5,100,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32,IMDBDef14.PQSL_LIQ32_NUMEROLIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ32, 0);
  }

  private static void Init_PQRY_LIQ32_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ32_RS, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ32_RS, "PQRY_LIQ32_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQSTATOCTE, "LIQSTATOCTE");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_LIQSTATOCTE,5,100,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ32_RS,IMDBDef14.PQSL_LIQ32_NUMEROLIQ,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloCodiciTransazioneElementare(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloCodiciTransazioneElementare()
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
    FormIdx = MyGlb.FRM_CONCODTRAEL1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "148DD01E-1C16-460D-8F48-E0001C0D9AAE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 374;
    set_Caption(new IDVariant("Controllo Codici Transazione Elementare"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 348;
    Frames[1].Caption = "Controllo Codici Transazione Elementare";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_CONCODTRAELE = new IDPanel(w, this, 1, "PAN_CONCODTRAELE");
    Frames[1].Content = PAN_CONCODTRAELE;
    PAN_CONCODTRAELE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONCODTRAELE.VS = MainFrm.VisualStyleList;
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBCONCOTREL != null)
      PAN_CONCODTRAELE.SetBook(BUK_LIBCONCOTREL);
    PAN_CONCODTRAELE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "009EC05D-9542-4CAD-97A9-474F1FEE92FE");
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 796, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONCODTRAELE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONCODTRAELE.InitStatus = 2;
    PAN_CONCODTRAELE_Init();
    PAN_CONCODTRAELE_InitFields();
    PAN_CONCODTRAELE_InitQueries();
    BKW_LIBCONCOTREL = new OBook(this);
    BUK_LIBCONCOTREL = new CIDREObj(BKW_LIBCONCOTREL);
    BKW_LIBCONCOTREL.iGuid = "71B0AA5B-3D15-4F3A-BBDA-EDE80D8C80EE";
    BKW_LIBCONCOTREL.Code = "BUK_LIBCONCOTREL";
    BKW_LIBCONCOTREL.BookObj = BUK_LIBCONCOTREL;
    BKW_LIBCONCOTREL.InitDefMasks();
    BUK_LIBCONCOTREL.InitBook(1, 1245441, "Libro Controllo Codici Transazione Elementare", IMDB, MainFrm.VisualStyleList);
    BUK_LIBCONCOTREL.InitHTML();
    BUK_LIBCONCOTREL.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBCONCOTREL.Book.SetMainFrm(MainFrm);
    BUK_LIBCONCOTREL.SetRTCGuid(0, "71B0AA5B-3D15-4F3A-BBDA-EDE80D8C80EE");
    BUK_LIBCONCOTREL.SetObjCode(0, "LIBCONCOTREL");
    if (PAN_CONCODTRAELE != null)
      PAN_CONCODTRAELE.SetBook(BUK_LIBCONCOTREL);
    BUK_LIBCONCOTREL_MST_NUOVPAGIMAST_Init();
    BUK_LIBCONCOTREL_RPT_NUOVOREPORT_Init();
    BUK_LIBCONCOTREL_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCLIQUCTE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONCODTRAEL1_LIQ35();
      }
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCLIQUCTE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONCODTRAEL1_LIQ32();
      }
      PAN_CONCODTRAELE.UpdatePanel(MainFrm);
      // BUK_LIBCONCOTREL.UpdateBook();
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
    if (Code.equals("BUK_LIBCONCOTREL")) return BUK_LIBCONCOTREL;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloCodiciTransazioneElementare);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloCodiciTransazioneElementare.class.getName() : (Glb.ClassWithPackage(ControlloCodiciTransazioneElementare.class) ? ControlloCodiciTransazioneElementare.class.getName().substring(ControlloCodiciTransazioneElementare.class.getPackage().getName().length() + 1) : ControlloCodiciTransazioneElementare.class.getName()));
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
      UNLOAD_ELELIQCTEDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloCodiciTransazioneElementare", "Unload", _e);
    }
  }

  // **********************************************************************
  // Elenco Liquidazioni CTE: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_ELELIQCTEDEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_ELENCLIQUCTE);
  }

  // **********************************************************************
  // LIQ
  // Primary record source for panel data
  // **********************************************************************
  private void CONCODTRAEL1_LIQ35() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_LIQ35_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCTE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCTE, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_LIQ35_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_LIQ35_RS, 0, IMDBDef5.TBL_ELENCLIQUCTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ35_RS, 0, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQULIQU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ35_RS, 1, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUBENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ35_RS, 2, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUIMPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ35_RS, 3, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUDESC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ35_RS, 4, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELELIQSTACTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ35_RS, 5, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELELIQANNLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ35_RS, 6, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELELIQNUMLIQ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_ELENCLIQUCTE, 0);
      if (IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCTE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCTE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef14.PQRY_LIQ35_RS);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ35_RS,5,true);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ35_RS,6,true);
    IMDB.TblStartSort(IMDBDef14.PQRY_LIQ35_RS);
    IMDB.TblMoveFirst(IMDBDef14.PQRY_LIQ35_RS, 0);
  }

  // **********************************************************************
  // LIQ
  // Primary record source for panel data
  // **********************************************************************
  private void CONCODTRAEL1_LIQ32() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_LIQ32_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCTE, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCTE, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_LIQ32_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_LIQ32_RS, 0, IMDBDef5.TBL_ELENCLIQUCTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ32_RS, 0, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQULIQU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ32_RS, 1, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUBENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ32_RS, 2, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUIMPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ32_RS, 3, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUDESC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ32_RS, 4, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELELIQSTACTE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ32_RS, 5, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELELIQANNLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ32_RS, 6, 0, IMDBDef5.TBL_ELENCLIQUCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELELIQNUMLIQ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_ELENCLIQUCTE, 0);
      if (IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCTE, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCTE, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef14.PQRY_LIQ32_RS);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ32_RS,5,true);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ32_RS,6,true);
    IMDB.TblStartSort(IMDBDef14.PQRY_LIQ32_RS);
    IMDB.TblMoveFirst(IMDBDef14.PQRY_LIQ32_RS, 0);
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
  private void PAN_CONCODTRAELE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONCODTRAELE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONCODTRAELE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONCODTRAELE, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONCODTRAELE_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONCODTRAELE);
    // Stub
  }

  private void PAN_CONCODTRAELE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONCODTRAELE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONCODTRAELE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONCODTRAELE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBCONCOTREL_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBCONCOTREL_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBCONCOTREL_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBCONCOTREL_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBCONCOTREL_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_LIBCONCOTREL_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_LIBCONCOTREL_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBCONCOTREL_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBCONCOTREL_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBCONCOTREL_MST_NUOVPAGIMAST)
    {
      BUK_LIBCONCOTREL.set_SpanValue(BUK_LIBCONCOTREL_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBCONCOTREL.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBCONCOTREL.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBCONCOTREL_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBCONCOTREL_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBCONCOTREL_OnIMDBUpdate(int RepID)
  {
  try
  {
    if (RepID == BUK_LIBCONCOTREL_RPT_NUOVOREPORT)
    {
      // Report's IMDB master query
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCLIQUCTE, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONCODTRAEL1_LIQ32();
      }
    }
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBCONCOTREL_OnPreview()
  {
    PreviewBook = BKW_LIBCONCOTREL;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONCODTRAELE_Init()
  {

    PAN_CONCODTRAELE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONCODTRAELE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONCODTRAELE.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_CONCODTRAELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, "D535ED14-AB83-4B84-BE6F-CC04C7AEB680");
    PAN_CONCODTRAELE.set_Header(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, "Liquidazione");
    PAN_CONCODTRAELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, "");
    PAN_CONCODTRAELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONCODTRAELE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONCODTRAELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, "5EF38720-1178-4740-A6F2-DF5918C49475");
    PAN_CONCODTRAELE.set_Header(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, "Beneficiario");
    PAN_CONCODTRAELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, "");
    PAN_CONCODTRAELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONCODTRAELE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONCODTRAELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, "C6189915-ACEE-4AC5-89BC-AFCA988A5C94");
    PAN_CONCODTRAELE.set_Header(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, "Importo");
    PAN_CONCODTRAELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, "");
    PAN_CONCODTRAELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONCODTRAELE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONCODTRAELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, "D34813D5-6259-4E3B-91AC-AD27D1B0A3E3");
    PAN_CONCODTRAELE.set_Header(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, "Descrizione");
    PAN_CONCODTRAELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, "");
    PAN_CONCODTRAELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONCODTRAELE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONCODTRAELE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, "471C0952-9163-451C-A3B6-63698FEF5264");
    PAN_CONCODTRAELE.set_Header(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, "Stato");
    PAN_CONCODTRAELE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, "Stato");
    PAN_CONCODTRAELE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONCODTRAELE.SetFlags(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONCODTRAELE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_LIST, 68);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_FORM, 4, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_FORM, 68);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_LIQUIDAZIONE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_CONCODTRAELE.SetFieldPage(PFL_CONCODTRAELE_LIQUIDAZIONE, -1, -1);
    PAN_CONCODTRAELE.SetFieldPanel(PFL_CONCODTRAELE_LIQUIDAZIONE, PPQRY_LIQ35, "A.ELENLIQULIQU", "LIQLIQUIDAZI", 5, 20, 0, -13997);
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_LIST, 84, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_LIST, 64);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 28, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_FORM, 64);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_BENEFICIARIO, MyGlb.PANEL_FORM, "Benefic.");
    PAN_CONCODTRAELE.SetFieldPage(PFL_CONCODTRAELE_BENEFICIARIO, -1, -1);
    PAN_CONCODTRAELE.SetFieldPanel(PFL_CONCODTRAELE_BENEFICIARIO, PPQRY_LIQ35, "A.ELENLIQUBENE", "LIQBENEFICIA", 5, 40, 0, -13997);
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_LIST, 296, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_CONCODTRAELE.SetFieldPage(PFL_CONCODTRAELE_IMPORTO, -1, -1);
    PAN_CONCODTRAELE.SetFieldPanel(PFL_CONCODTRAELE_IMPORTO, PPQRY_LIQ35, "A.ELENLIQUIMPO", "LIQIMPORTO", 3, 14, 2, -13997);
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_LIST, 404, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 424, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_CONCODTRAELE.SetFieldPage(PFL_CONCODTRAELE_DESCRIZIONE, -1, -1);
    PAN_CONCODTRAELE.SetFieldPanel(PFL_CONCODTRAELE_DESCRIZIONE, PPQRY_LIQ35, "A.ELENLIQUDESC", "LIQDESCRIZIO", 5, 140, 0, -13997);
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_LIST, 620, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_LIST, 56);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_LIST, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_LIST, "Stato");
    PAN_CONCODTRAELE.SetRect(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_FORM, 4, 112, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONCODTRAELE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_FORM, 56);
    PAN_CONCODTRAELE.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_FORM, 1);
    PAN_CONCODTRAELE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONCODTRAELE_STATOCTE, MyGlb.PANEL_FORM, "Stato");
    PAN_CONCODTRAELE.SetFieldPage(PFL_CONCODTRAELE_STATOCTE, -1, -1);
    PAN_CONCODTRAELE.SetFieldPanel(PFL_CONCODTRAELE_STATOCTE, PPQRY_LIQ35, "A.ELELIQSTACTE", "LIQSTATOCTE", 5, 100, 0, -13997);
  }

  private void PAN_CONCODTRAELE_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONCODTRAELE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONCODTRAELE.SetIMDB(IMDB, "PQRY_LIQ35", true);
    PAN_CONCODTRAELE.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    PAN_CONCODTRAELE.SetQueryIMDB(PPQRY_LIQ35, IMDBDef14.PQRY_LIQ35_RS, IMDBDef5.TBL_ELENCLIQUCTE);
    JustLoaded = true;
    PAN_CONCODTRAELE.SetFieldPrimaryIndex(PFL_CONCODTRAELE_LIQUIDAZIONE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQULIQU);
    PAN_CONCODTRAELE.SetFieldPrimaryIndex(PFL_CONCODTRAELE_BENEFICIARIO, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUBENE);
    PAN_CONCODTRAELE.SetFieldPrimaryIndex(PFL_CONCODTRAELE_IMPORTO, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUIMPO);
    PAN_CONCODTRAELE.SetFieldPrimaryIndex(PFL_CONCODTRAELE_DESCRIZIONE, IMDBDef5.FLD_ELENCLIQUCTE_ELENLIQUDESC);
    PAN_CONCODTRAELE.SetFieldPrimaryIndex(PFL_CONCODTRAELE_STATOCTE, IMDBDef5.FLD_ELENCLIQUCTE_ELELIQSTACTE);
    PAN_CONCODTRAELE.SetMasterTable(0, "ELENCLIQUCTE");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONCODTRAELE.Status() == 2)
    {
      int oldListQBE = PAN_CONCODTRAELE.iUseListQBE;
      PAN_CONCODTRAELE.iUseListQBE = 0;
      PAN_CONCODTRAELE.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONCODTRAELE.PanelCommand(Glb.PCM_FIND);
      PAN_CONCODTRAELE.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBCONCOTREL_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBCONCOTREL.InitMastro(BUK_LIBCONCOTREL_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_MST_NUOVPAGIMAST, "91B57963-F8BD-4164-AB63-EBDEA79E3858");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBCONCOTREL.InitMastroBox(BUK_LIBCONCOTREL_MST_NUOVPAGIMAST, BUK_LIBCONCOTREL_RPTBOX_NUMEROPAGINA, 17500, 400, 2500, 400, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_NUMEROPAGINA, "B9EC1C36-5A64-41E8-9729-D64CCDCCA36F");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_NUMEROPAGINA, BUK_LIBCONCOTREL_SPAN_NUMEROPAGINA, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_NUMEROPAGINA, "40BF6A94-4D56-4278-950A-CCD71C074AA4");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBCONCOTREL.InitMastroBox(BUK_LIBCONCOTREL_MST_NUOVPAGIMAST, BUK_LIBCONCOTREL_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_TESTATPAGINA, "E64B6E3E-6754-4427-8F6D-1E031A7CAA15");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBCONCOTREL.InitMastroBox(BUK_LIBCONCOTREL_MST_NUOVPAGIMAST, BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA, 1000, 3100, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA, "AD2A5CF8-5A1E-45CF-A8E9-13166F44130F");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBCONCOTREL.InitMastroBox(BUK_LIBCONCOTREL_MST_NUOVPAGIMAST, BUK_LIBCONCOTREL_RPTBOX_PIEDEPAGINA, 1000, 28600, 19000, 100, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_PIEDEPAGINA, "B96933B5-6318-4F8B-B189-C7D6051F4336");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_LIBCONCOTREL_RPT_NUOVOREPORT_InitQuery() { BUK_LIBCONCOTREL_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBCONCOTREL_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      BUK_LIBCONCOTREL.SetReportQuery(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, (IDConnection)null, IMDBDef14.PQRY_LIQ32_RS, "", "A9FA11F9-8335-4083-AFD9-2FD036499D95");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBCONCOTREL_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBCONCOTREL.InitReport(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, 196609);
    BUK_LIBCONCOTREL_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, "391EB7EA-196D-429B-8D2F-C150026F491D");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBCONCOTREL.InitSection(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, BUK_LIBCONCOTREL_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCOTREL.SetSectionRendersInto(BUK_LIBCONCOTREL_SEC_INTESTREPORT, BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SEC_INTESTREPORT, "342BBA03-E05D-4B60-A3C0-62DB3E375430");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBCONCOTREL.InitSection(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, BUK_LIBCONCOTREL_SEC_INTESTPAGINA, 1900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCOTREL.SetSectionRendersInto(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, BUK_LIBCONCOTREL_RPTBOX_TESTATPAGINA);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, "E1FBAB82-472A-4BCA-997B-DE0C29345D75");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, BUK_LIBCONCOTREL_RPTBOX_TITOLO, 0, 100, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITOLIINBOX, 983041, 590, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_TITOLO, "09F6FAE5-E169-40CB-97F7-0C4DDD719F47");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_TITOLO, BUK_LIBCONCOTREL_SPAN_NUOVASPAN, MyGlb.VIS_TITOLIINBOX, 0, 0, 0, 271384961, "", "Controllo Codice Gestionale", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_NUOVASPAN, "FDA82E33-504A-4AFF-B12A-667AC654EDA2");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, BUK_LIBCONCOTREL_RPTBOX_LIQUIDHEADER, 0, 1300, 2000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_LIQUIDHEADER, "7562C259-07DC-419F-88F6-4E428CD9B90E");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_LIQUIDHEADER, BUK_LIBCONCOTREL_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Liquidazione", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_C1, "B6075B28-7F0F-4BE4-BA4D-80A82782416A");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_C1, "C1");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, BUK_LIBCONCOTREL_RPTBOX_BENEFIHEADER, 2100, 1300, 6089, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_BENEFIHEADER, "7A6DE3D9-8723-4D48-B841-695DD0275B36");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_BENEFIHEADER, "BENEFIHEADER");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_BENEFIHEADER, BUK_LIBCONCOTREL_SPAN_BENEFICIARI1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Beneficiario", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_BENEFICIARI1, "33E67B89-E3FB-4558-9ACD-B77E9EA2DEB5");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_BENEFICIARI1, "BENEFICIARI1");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, BUK_LIBCONCOTREL_RPTBOX_IMPORTHEADER, 8300, 1300, 2656, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_IMPORTHEADER, "ABB730F0-8899-4408-8CDD-C856791E5A7E");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_IMPORTHEADER, BUK_LIBCONCOTREL_SPAN_IMPORTO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_IMPORTO1, "5B2B37FC-D6D9-4EE9-9538-58A64E177A08");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_IMPORTO1, "IMPORTO1");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, BUK_LIBCONCOTREL_RPTBOX_DESCRIHEADER, 11300, 1300, 6142, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_DESCRIHEADER, "864565D9-5490-47B2-810B-3F89A16E544C");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_DESCRIHEADER, BUK_LIBCONCOTREL_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_DESCRIZIONE1, "BDE44F81-EB20-4183-86E2-67018B73F2CE");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_INTESTPAGINA, BUK_LIBCONCOTREL_RPTBOX_STATOCTEHEAD, 17491, 1300, 1509, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_STATOCTEHEAD, "49E3BB05-BD6D-47A3-8EBA-87E4DA87E6A2");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_STATOCTEHEAD, "STATOCTEHEAD");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_STATOCTEHEAD, BUK_LIBCONCOTREL_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Stato CTE", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_C, "A87915EB-D900-4055-8317-9380F4E34921");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_C, "C");
    BUK_LIBCONCOTREL.InitSection(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, BUK_LIBCONCOTREL_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCOTREL.SetSectionRendersInto(BUK_LIBCONCOTREL_SEC_DETTAGLIO, BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SEC_DETTAGLIO, "0C52345C-4027-4C8F-9A66-6F68E892A229");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_DETTAGLIO, BUK_LIBCONCOTREL_RPTBOX_LIQUIDAZIONE, 0, 0, 2000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_LIQUIDAZIONE, "BFF050B4-ABCB-49A0-857C-BED8F52724A5");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_LIQUIDAZIONE, "LIQUIDAZIONE");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_LIQUIDAZIONE, BUK_LIBCONCOTREL_SPAN_LILICCTELCCG, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384705, "", "::LIQLIQUIDAZI", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_LILICCTELCCG, "F3E1F028-3392-4DC0-A5D6-AA5285E556C8");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_LILICCTELCCG, "LILICCTELCCG");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_DETTAGLIO, BUK_LIBCONCOTREL_RPTBOX_BENEFICIARIO, 2100, 0, 6089, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_BENEFICIARIO, "6B16F465-9276-43E9-8B87-9D1C032C3EB7");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_BENEFICIARIO, "BENEFICIARIO");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_BENEFICIARIO, BUK_LIBCONCOTREL_SPAN_LIBECCTELCCG, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::LIQBENEFICIA", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_LIBECCTELCCG, "37673F42-87C8-4982-88AA-9D135EAEE5EE");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_LIBECCTELCCG, "LIBECCTELCCG");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_DETTAGLIO, BUK_LIBCONCOTREL_RPTBOX_IMPORTO, 8300, 0, 2656, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_IMPORTO, "FA2B6ED2-321B-4D4A-8D65-B063462B17A8");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_IMPORTO, BUK_LIBCONCOTREL_SPAN_LIIMCCTELCCG, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::LIQIMPORTO", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_LIIMCCTELCCG, "86B32B21-9219-404C-86D3-0022B735148C");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_LIIMCCTELCCG, "LIIMCCTELCCG");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_DETTAGLIO, BUK_LIBCONCOTREL_RPTBOX_DESCRIZIONE, 11300, 0, 6142, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_DESCRIZIONE, "2D6F0DA6-2548-4C48-B928-403921001907");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_DESCRIZIONE, BUK_LIBCONCOTREL_SPAN_LIDECCTELCCG, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::LIQDESCRIZIO", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_LIDECCTELCCG, "62351B5C-9A69-4C5A-995E-525964FC0992");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_LIDECCTELCCG, "LIDECCTELCCG");
    BUK_LIBCONCOTREL.InitReportBox(BUK_LIBCONCOTREL_SEC_DETTAGLIO, BUK_LIBCONCOTREL_RPTBOX_STATOCTE, 17491, 0, 1509, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_RPTBOX_STATOCTE, "59A1CC05-6271-4CB1-A9B8-5329FBED6E15");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_RPTBOX_STATOCTE, "STATOCTE");
    BUK_LIBCONCOTREL.InitBoxSpan(BUK_LIBCONCOTREL_RPTBOX_STATOCTE, BUK_LIBCONCOTREL_SPAN_LSCCCTELCCTE, MyGlb.VIS_DEFAREPOSTYL, 5, 100, 0, 271384705, "", "::LIQSTATOCTE", 1);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SPAN_LSCCCTELCCTE, "8F44AD6B-056B-4820-8D4F-9643AF6C1CE7");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SPAN_LSCCCTELCCTE, "LSCCCTELCCTE");
    BUK_LIBCONCOTREL.InitSection(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, BUK_LIBCONCOTREL_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCOTREL.SetSectionRendersInto(BUK_LIBCONCOTREL_SEC_PIEDEPAGINA, BUK_LIBCONCOTREL_RPTBOX_PIEDEPAGINA);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SEC_PIEDEPAGINA, "C2D03AEB-50B0-4958-9699-E127261B5D35");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBCONCOTREL.InitSection(BUK_LIBCONCOTREL_RPT_NUOVOREPORT, BUK_LIBCONCOTREL_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCOTREL.SetSectionRendersInto(BUK_LIBCONCOTREL_SEC_PIEDEREPORT, BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA);
    BUK_LIBCONCOTREL.SetRTCGuid(BUK_LIBCONCOTREL_SEC_PIEDEREPORT, "78C55A1A-1A5B-4716-AE42-7CEBE1A619A7");
    BUK_LIBCONCOTREL.SetObjCode(BUK_LIBCONCOTREL_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBCONCOTREL_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBCONCOTREL_InitLinks()
  {
    BUK_LIBCONCOTREL.SetBoxNextBox(BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA, BUK_LIBCONCOTREL_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONCODTRAELE) PAN_CONCODTRAELE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONCODTRAELE) PAN_CONCODTRAELE_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONCODTRAELE) PAN_CONCODTRAELE_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONCODTRAELE) PAN_CONCODTRAELE_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONCODTRAELE) PAN_CONCODTRAELE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBCONCOTREL) BUK_LIBCONCOTREL_OnPreview();
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
