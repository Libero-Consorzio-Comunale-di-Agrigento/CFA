// **********************************************
// Controllo Codici Gestionali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ControlloCodiciGestionali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CONTCODIGEST_LIQUIDAZIONE = 0;
  private static int PFL_CONTCODIGEST_BENEFICIARIO = 1;
  private static int PFL_CONTCODIGEST_IMPORTO = 2;
  private static int PFL_CONTCODIGEST_DESCRIZIONE = 3;
  private static int PFL_CONTCODIGEST_STATOCGU = 4;

  private static int PPQRY_LIQ8 = 0;


  IDPanel PAN_CONTCODIGEST;
  CIDREObj BUK_LIBCONCODGES;
  OBook BKW_LIBCONCODGES;
  //
  // Template Pages constants
  private static int BUK_LIBCONCODGES_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBCONCODGES_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIBCONCODGES_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIBCONCODGES_RPTBOX_TESTATPAGINA = 4;
  private static int BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA = 5;
  private static int BUK_LIBCONCODGES_RPTBOX_PIEDEPAGINA = 6;

  //
  // Reports constants
  private static int BUK_LIBCONCODGES_RPT_NUOVOREPORT = 7;
  private static int BUK_LIBCONCODGES_SEC_INTESTREPORT = 8;
  private static int BUK_LIBCONCODGES_SEC_INTESTPAGINA = 9;
  private static int BUK_LIBCONCODGES_RPTBOX_TITOLO = 10;
  private static int BUK_LIBCONCODGES_SPAN_NUOVASPAN = 11;
  private static int BUK_LIBCONCODGES_RPTBOX_LIQUIDHEADER = 12;
  private static int BUK_LIBCONCODGES_SPAN_C1 = 13;
  private static int BUK_LIBCONCODGES_RPTBOX_BENEFIHEADER = 14;
  private static int BUK_LIBCONCODGES_SPAN_BENEFICIARI1 = 15;
  private static int BUK_LIBCONCODGES_RPTBOX_IMPORTHEADER = 16;
  private static int BUK_LIBCONCODGES_SPAN_IMPORTO1 = 17;
  private static int BUK_LIBCONCODGES_RPTBOX_DESCRIHEADER = 18;
  private static int BUK_LIBCONCODGES_SPAN_DESCRIZIONE1 = 19;
  private static int BUK_LIBCONCODGES_RPTBOX_STATOCGUHEAD = 20;
  private static int BUK_LIBCONCODGES_SPAN_C = 21;
  private static int BUK_LIBCONCODGES_SEC_DETTAGLIO = 22;
  private static int BUK_LIBCONCODGES_RPTBOX_LIQUIDAZIONE = 23;
  private static int BUK_LIBCONCODGES_SPAN_LIQUIDAZIONE = 24;
  private static int BUK_LIBCONCODGES_RPTBOX_BENEFICIARIO = 25;
  private static int BUK_LIBCONCODGES_SPAN_BENEFICIARIO = 26;
  private static int BUK_LIBCONCODGES_RPTBOX_IMPORTO = 27;
  private static int BUK_LIBCONCODGES_SPAN_IMPORTO = 28;
  private static int BUK_LIBCONCODGES_RPTBOX_DESCRIZIONE = 29;
  private static int BUK_LIBCONCODGES_SPAN_DESCRIZIONE = 30;
  private static int BUK_LIBCONCODGES_RPTBOX_STATOCGU = 31;
  private static int BUK_LIBCONCODGES_SPAN_STATOCGU = 32;
  private static int BUK_LIBCONCODGES_SEC_PIEDEPAGINA = 33;
  private static int BUK_LIBCONCODGES_SEC_PIEDEREPORT = 34;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_ELENCLIQUCGU(IMDB);
    //
    //
    Init_PQRY_LIQ8(IMDB);
    Init_PQRY_LIQ8_RS(IMDB);
    Init_PQRY_LIQ34(IMDB);
    Init_PQRY_LIQ34_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_ELENCLIQUCGU(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_ELENCLIQUCGU, 7);
    IMDB.set_TblCode(IMDBDef5.TBL_ELENCLIQUCGU, "TBL_ELENCLIQUCGU");
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQULIQU, "ELENLIQULIQU");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQULIQU,5,20,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUBENE, "ELENLIQUBENE");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUBENE,5,40,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUIMPO, "ELENLIQUIMPO");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUIMPO,3,14,2);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUDESC, "ELENLIQUDESC");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQSTACGU, "ELELIQSTACGU");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQSTACGU,5,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQANNLIQ, "ELELIQANNLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQANNLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQNUMLIQ, "ELELIQNUMLIQ");
    IMDB.SetFldParams(IMDBDef5.TBL_ELENCLIQUCGU,IMDBDef5.FLD_ELENCLIQUCGU_ELELIQNUMLIQ,1,5,0);
  }

  private static void Init_PQRY_LIQ8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ8, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ8, "PQRY_LIQ8");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQSTATOCGU, "LIQSTATOCGU");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_LIQSTATOCGU,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8,IMDBDef14.PQSL_LIQ8_NUMEROLIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ8, 0);
  }

  private static void Init_PQRY_LIQ8_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ8_RS, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ8_RS, "PQRY_LIQ8_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQSTATOCGU, "LIQSTATOCGU");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_LIQSTATOCGU,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ8_RS,IMDBDef14.PQSL_LIQ8_NUMEROLIQ,1,5,0);
  }

  private static void Init_PQRY_LIQ34(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ34, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ34, "PQRY_LIQ34");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQSTATOCGU, "LIQSTATOCGU");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_LIQSTATOCGU,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34,IMDBDef14.PQSL_LIQ34_NUMEROLIQ,1,5,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_LIQ34, 0);
  }

  private static void Init_PQRY_LIQ34_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_LIQ34_RS, 7);
    IMDB.set_TblCode(IMDBDef14.PQRY_LIQ34_RS, "PQRY_LIQ34_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQLIQUIDAZI, "LIQLIQUIDAZI");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQLIQUIDAZI,5,20,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQBENEFICIA, "LIQBENEFICIA");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQBENEFICIA,5,40,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQIMPORTO, "LIQIMPORTO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQIMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQDESCRIZIO, "LIQDESCRIZIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQDESCRIZIO,5,140,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQSTATOCGU, "LIQSTATOCGU");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_LIQSTATOCGU,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_ANNOLIQ, "ANNOLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_ANNOLIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_NUMEROLIQ, "NUMEROLIQ");
    IMDB.SetFldParams(IMDBDef14.PQRY_LIQ34_RS,IMDBDef14.PQSL_LIQ34_NUMEROLIQ,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ControlloCodiciGestionali(MyWebEntryPoint w, IMDBObj imdb)
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
  public ControlloCodiciGestionali()
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
    FormIdx = MyGlb.FRM_CONTCODIGEST;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "0D7447D1-5BD9-4461-9929-E0DF509F4754";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 374;
    set_Caption(new IDVariant("Controllo Codici Gestionali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 800;
    Frames[1].Height = 348;
    Frames[1].Caption = "Controllo Codici Gestionali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 348;
    PAN_CONTCODIGEST = new IDPanel(w, this, 1, "PAN_CONTCODIGEST");
    Frames[1].Content = PAN_CONTCODIGEST;
    PAN_CONTCODIGEST.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CONTCODIGEST.VS = MainFrm.VisualStyleList;
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 800-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_LIBCONCODGES != null)
      PAN_CONTCODIGEST.SetBook(BUK_LIBCONCODGES);
    PAN_CONTCODIGEST.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DE5C4E18-AB7A-4E66-98DE-EEC4870147A9");
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 756, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CONTCODIGEST.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CONTCODIGEST.InitStatus = 2;
    PAN_CONTCODIGEST_Init();
    PAN_CONTCODIGEST_InitFields();
    PAN_CONTCODIGEST_InitQueries();
    BKW_LIBCONCODGES = new OBook(this);
    BUK_LIBCONCODGES = new CIDREObj(BKW_LIBCONCODGES);
    BKW_LIBCONCODGES.iGuid = "7CF81145-03BE-4E72-93E9-24F4E7BA3D1B";
    BKW_LIBCONCODGES.Code = "BUK_LIBCONCODGES";
    BKW_LIBCONCODGES.BookObj = BUK_LIBCONCODGES;
    BKW_LIBCONCODGES.InitDefMasks();
    BUK_LIBCONCODGES.InitBook(1, 1245441, "Libro Controllo Codici Gestionali", IMDB, MainFrm.VisualStyleList);
    BUK_LIBCONCODGES.InitHTML();
    BUK_LIBCONCODGES.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBCONCODGES.Book.SetMainFrm(MainFrm);
    BUK_LIBCONCODGES.SetRTCGuid(0, "7CF81145-03BE-4E72-93E9-24F4E7BA3D1B");
    BUK_LIBCONCODGES.SetObjCode(0, "LIBCONCODGES");
    if (PAN_CONTCODIGEST != null)
      PAN_CONTCODIGEST.SetBook(BUK_LIBCONCODGES);
    BUK_LIBCONCODGES_MST_NUOVPAGIMAST_Init();
    BUK_LIBCONCODGES_RPT_NUOVOREPORT_Init();
    BUK_LIBCONCODGES_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCLIQUCGU, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTCODIGEST_LIQ8();
      }
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCLIQUCGU, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTCODIGEST_LIQ34();
      }
      PAN_CONTCODIGEST.UpdatePanel(MainFrm);
      // BUK_LIBCONCODGES.UpdateBook();
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
    if (Code.equals("BUK_LIBCONCODGES")) return BUK_LIBCONCODGES;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ControlloCodiciGestionali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ControlloCodiciGestionali.class.getName() : (Glb.ClassWithPackage(ControlloCodiciGestionali.class) ? ControlloCodiciGestionali.class.getName().substring(ControlloCodiciGestionali.class.getPackage().getName().length() + 1) : ControlloCodiciGestionali.class.getName()));
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
      UNLOAD_ELELIQCGUDEL();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ControlloCodiciGestionali", "Unload", _e);
    }
  }

  // **********************************************************************
  // Elenco Liquidazioni Cgu: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_ELELIQCGUDEL() throws SQLException
  {
    IMDB.TblTruncate(IMDBDef5.TBL_ELENCLIQUCGU);
  }

  // **********************************************************************
  // LIQ
  // Primary record source for panel data
  // **********************************************************************
  private void CONTCODIGEST_LIQ8() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_LIQ8_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCGU, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCGU, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_LIQ8_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_LIQ8_RS, 0, IMDBDef5.TBL_ELENCLIQUCGU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ8_RS, 0, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQULIQU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ8_RS, 1, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUBENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ8_RS, 2, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUIMPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ8_RS, 3, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUDESC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ8_RS, 4, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELELIQSTACGU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ8_RS, 5, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELELIQANNLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ8_RS, 6, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELELIQNUMLIQ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_ELENCLIQUCGU, 0);
      if (IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCGU, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCGU, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef14.PQRY_LIQ8_RS);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ8_RS,5,true);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ8_RS,6,true);
    IMDB.TblStartSort(IMDBDef14.PQRY_LIQ8_RS);
    IMDB.TblMoveFirst(IMDBDef14.PQRY_LIQ8_RS, 0);
  }

  // **********************************************************************
  // LIQ
  // Primary record source for panel data
  // **********************************************************************
  private void CONTCODIGEST_LIQ34() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_LIQ34_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCGU, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCGU, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_LIQ34_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_LIQ34_RS, 0, IMDBDef5.TBL_ELENCLIQUCGU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ34_RS, 0, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQULIQU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ34_RS, 1, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUBENE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ34_RS, 2, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUIMPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ34_RS, 3, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUDESC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ34_RS, 4, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELELIQSTACGU, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ34_RS, 5, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELELIQANNLIQ, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_LIQ34_RS, 6, 0, IMDBDef5.TBL_ELENCLIQUCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELELIQNUMLIQ, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_ELENCLIQUCGU, 0);
      if (IMDB.Eof(IMDBDef5.TBL_ELENCLIQUCGU, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_ELENCLIQUCGU, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblInitSort(IMDBDef14.PQRY_LIQ34_RS);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ34_RS,5,true);
    IMDB.TblSortBy(IMDBDef14.PQRY_LIQ34_RS,6,true);
    IMDB.TblStartSort(IMDBDef14.PQRY_LIQ34_RS);
    IMDB.TblMoveFirst(IMDBDef14.PQRY_LIQ34_RS, 0);
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
  private void PAN_CONTCODIGEST_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CONTCODIGEST, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CONTCODIGEST_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CONTCODIGEST, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CONTCODIGEST_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CONTCODIGEST);
    // Stub
  }

  private void PAN_CONTCODIGEST_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CONTCODIGEST_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CONTCODIGEST_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CONTCODIGEST_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_LIBCONCODGES_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBCONCODGES_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBCONCODGES_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBCONCODGES_SEC_INTESTPAGINA)
    {
    }
    if (SectionID==BUK_LIBCONCODGES_SEC_DETTAGLIO)
    {
    }
    if (SectionID==BUK_LIBCONCODGES_SEC_PIEDEPAGINA)
    {
    }
    if (SectionID==BUK_LIBCONCODGES_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBCONCODGES_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIBCONCODGES_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBCONCODGES_MST_NUOVPAGIMAST)
    {
      BUK_LIBCONCODGES.set_SpanValue(BUK_LIBCONCODGES_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBCONCODGES.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIBCONCODGES.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBCONCODGES_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBCONCODGES_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBCONCODGES_OnIMDBUpdate(int RepID)
  {
  try
  {
    if (RepID == BUK_LIBCONCODGES_RPT_NUOVOREPORT)
    {
      // Report's IMDB master query
      if (IMDB.TblModified(IMDBDef5.TBL_ELENCLIQUCGU, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CONTCODIGEST_LIQ34();
      }
    }
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBCONCODGES_OnPreview()
  {
    PreviewBook = BKW_LIBCONCODGES;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CONTCODIGEST_Init()
  {

    PAN_CONTCODIGEST.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CONTCODIGEST.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CONTCODIGEST.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_CONTCODIGEST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, "228D3A7C-D646-4125-925B-5D2FB4608CFA");
    PAN_CONTCODIGEST.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, "Liquidazione");
    PAN_CONTCODIGEST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, "");
    PAN_CONTCODIGEST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODIGEST.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODIGEST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, "161A8B38-A76A-4FEA-8653-59CC51BB918A");
    PAN_CONTCODIGEST.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, "Beneficiario");
    PAN_CONTCODIGEST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, "");
    PAN_CONTCODIGEST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODIGEST.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODIGEST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, "8003D26D-7F34-4E82-8F91-EF387540F5DA");
    PAN_CONTCODIGEST.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, "Importo");
    PAN_CONTCODIGEST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, "");
    PAN_CONTCODIGEST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODIGEST.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODIGEST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, "A542D5E4-AB37-4514-94BB-EB710C9F0269");
    PAN_CONTCODIGEST.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, "Descrizione");
    PAN_CONTCODIGEST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, "");
    PAN_CONTCODIGEST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODIGEST.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CONTCODIGEST.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, "CEE07AD5-E1C6-43B4-AC73-69D1216FA433");
    PAN_CONTCODIGEST.set_Header(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, "Stato Cgu");
    PAN_CONTCODIGEST.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, "");
    PAN_CONTCODIGEST.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.VIS_NORMALFIELDS);
    PAN_CONTCODIGEST.SetFlags(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CONTCODIGEST_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_LIST, 68);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_LIST, "Liquidazione");
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_FORM, 4, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_FORM, 68);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_LIQUIDAZIONE, MyGlb.PANEL_FORM, "Liquid.");
    PAN_CONTCODIGEST.SetFieldPage(PFL_CONTCODIGEST_LIQUIDAZIONE, -1, -1);
    PAN_CONTCODIGEST.SetFieldPanel(PFL_CONTCODIGEST_LIQUIDAZIONE, PPQRY_LIQ8, "A.ELENLIQULIQU", "LIQLIQUIDAZI", 5, 20, 0, -13997);
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_LIST, 84, 36, 252, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_LIST, 64);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 28, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_FORM, 64);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_BENEFICIARIO, MyGlb.PANEL_FORM, "Benefic.");
    PAN_CONTCODIGEST.SetFieldPage(PFL_CONTCODIGEST_BENEFICIARIO, -1, -1);
    PAN_CONTCODIGEST.SetFieldPanel(PFL_CONTCODIGEST_BENEFICIARIO, PPQRY_LIQ8, "A.ELENLIQUBENE", "LIQBENEFICIA", 5, 40, 0, -13997);
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_LIST, 336, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_LIST, 48);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_FORM, 4, 52, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_FORM, 48);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_IMPORTO, MyGlb.PANEL_FORM, "Imp.");
    PAN_CONTCODIGEST.SetFieldPage(PFL_CONTCODIGEST_IMPORTO, -1, -1);
    PAN_CONTCODIGEST.SetFieldPanel(PFL_CONTCODIGEST_IMPORTO, PPQRY_LIQ8, "A.ELENLIQUIMPO", "LIQIMPORTO", 3, 14, 2, -13997);
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_LIST, 444, 36, 248, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 424, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_CONTCODIGEST.SetFieldPage(PFL_CONTCODIGEST_DESCRIZIONE, -1, -1);
    PAN_CONTCODIGEST.SetFieldPanel(PFL_CONTCODIGEST_DESCRIZIONE, PPQRY_LIQ8, "A.ELENLIQUDESC", "LIQDESCRIZIO", 5, 140, 0, -13997);
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_LIST, 692, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_LIST, 56);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_LIST, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_LIST, "Stato Cgu");
    PAN_CONTCODIGEST.SetRect(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_FORM, 4, 112, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CONTCODIGEST.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_FORM, 56);
    PAN_CONTCODIGEST.SetNumRow(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_FORM, 1);
    PAN_CONTCODIGEST.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CONTCODIGEST_STATOCGU, MyGlb.PANEL_FORM, "St. Cgu");
    PAN_CONTCODIGEST.SetFieldPage(PFL_CONTCODIGEST_STATOCGU, -1, -1);
    PAN_CONTCODIGEST.SetFieldPanel(PFL_CONTCODIGEST_STATOCGU, PPQRY_LIQ8, "A.ELELIQSTACGU", "LIQSTATOCGU", 5, 10, 0, -13997);
  }

  private void PAN_CONTCODIGEST_InitQueries()
  {
    StringBuffer SQL;

    PAN_CONTCODIGEST.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CONTCODIGEST.SetIMDB(IMDB, "PQRY_LIQ8", true);
    PAN_CONTCODIGEST.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ");
    PAN_CONTCODIGEST.SetQueryIMDB(PPQRY_LIQ8, IMDBDef14.PQRY_LIQ8_RS, IMDBDef5.TBL_ELENCLIQUCGU);
    JustLoaded = true;
    PAN_CONTCODIGEST.SetFieldPrimaryIndex(PFL_CONTCODIGEST_LIQUIDAZIONE, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQULIQU);
    PAN_CONTCODIGEST.SetFieldPrimaryIndex(PFL_CONTCODIGEST_BENEFICIARIO, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUBENE);
    PAN_CONTCODIGEST.SetFieldPrimaryIndex(PFL_CONTCODIGEST_IMPORTO, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUIMPO);
    PAN_CONTCODIGEST.SetFieldPrimaryIndex(PFL_CONTCODIGEST_DESCRIZIONE, IMDBDef5.FLD_ELENCLIQUCGU_ELENLIQUDESC);
    PAN_CONTCODIGEST.SetFieldPrimaryIndex(PFL_CONTCODIGEST_STATOCGU, IMDBDef5.FLD_ELENCLIQUCGU_ELELIQSTACGU);
    PAN_CONTCODIGEST.SetMasterTable(0, "ELENCLIQUCGU");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CONTCODIGEST.Status() == 2)
    {
      int oldListQBE = PAN_CONTCODIGEST.iUseListQBE;
      PAN_CONTCODIGEST.iUseListQBE = 0;
      PAN_CONTCODIGEST.PanelCommand(Glb.PCM_SEARCH);
      PAN_CONTCODIGEST.PanelCommand(Glb.PCM_FIND);
      PAN_CONTCODIGEST.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_LIBCONCODGES_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBCONCODGES.InitMastro(BUK_LIBCONCODGES_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 1, 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_MST_NUOVPAGIMAST, "EB2944FD-22AC-42E6-ADD1-C97E9D16A4B6");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBCONCODGES.InitMastroBox(BUK_LIBCONCODGES_MST_NUOVPAGIMAST, BUK_LIBCONCODGES_RPTBOX_NUMEROPAGINA, 17500, 400, 2500, 400, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_NUMEROPAGINA, "B62B4E4E-AD14-4428-958E-F1E299368C7E");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_NUMEROPAGINA, BUK_LIBCONCODGES_SPAN_NUMEROPAGINA, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_NUMEROPAGINA, "E00DC280-2D6C-4D1B-BDE2-B4AB36A8D17D");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIBCONCODGES.InitMastroBox(BUK_LIBCONCODGES_MST_NUOVPAGIMAST, BUK_LIBCONCODGES_RPTBOX_TESTATPAGINA, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_TESTATPAGINA, "318EF927-2D7F-4241-AD6D-71169D916ED4");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_LIBCONCODGES.InitMastroBox(BUK_LIBCONCODGES_MST_NUOVPAGIMAST, BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA, 1000, 3100, 19000, 25400, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA, "FBEBE012-61A0-4028-92E2-264A4C78E003");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
    BUK_LIBCONCODGES.InitMastroBox(BUK_LIBCONCODGES_MST_NUOVPAGIMAST, BUK_LIBCONCODGES_RPTBOX_PIEDEPAGINA, 1000, 28600, 19000, 100, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_PIEDEPAGINA, "F5A962E2-D5A3-4AF2-9E17-F25FDE9C957B");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_PIEDEPAGINA, "PIEDEPAGINA");
  }

  private void BUK_LIBCONCODGES_RPT_NUOVOREPORT_InitQuery() { BUK_LIBCONCODGES_RPT_NUOVOREPORT_InitQuery(true, true); }
  private void BUK_LIBCONCODGES_RPT_NUOVOREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      BUK_LIBCONCODGES.SetReportQuery(BUK_LIBCONCODGES_RPT_NUOVOREPORT, (IDConnection)null, IMDBDef14.PQRY_LIQ34_RS, "", "302D743C-246F-4FE0-938F-D4953388A3C2");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBCONCODGES_RPT_NUOVOREPORT_Init()
  {
    BUK_LIBCONCODGES.InitReport(BUK_LIBCONCODGES_RPT_NUOVOREPORT, 196609);
    BUK_LIBCONCODGES_RPT_NUOVOREPORT_InitQuery(true, false);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPT_NUOVOREPORT, "CC94E1A9-5F89-4DEA-BD2C-B74EC5ABE49F");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPT_NUOVOREPORT, "NUOVOREPORT");
    BUK_LIBCONCODGES.InitSection(BUK_LIBCONCODGES_RPT_NUOVOREPORT, BUK_LIBCONCODGES_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCODGES.SetSectionRendersInto(BUK_LIBCONCODGES_SEC_INTESTREPORT, BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SEC_INTESTREPORT, "3DDA7610-7989-485E-9B0A-EE0719E24EC2");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBCONCODGES.InitSection(BUK_LIBCONCODGES_RPT_NUOVOREPORT, BUK_LIBCONCODGES_SEC_INTESTPAGINA, 1900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCODGES.SetSectionRendersInto(BUK_LIBCONCODGES_SEC_INTESTPAGINA, BUK_LIBCONCODGES_RPTBOX_TESTATPAGINA);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SEC_INTESTPAGINA, "D98B4788-9611-48AD-8735-BF29F3D6364F");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_INTESTPAGINA, BUK_LIBCONCODGES_RPTBOX_TITOLO, 0, 100, 19000, 1000, 0, 1, 1, MyGlb.VIS_TITOLIINBOX, 983041, 590, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_TITOLO, "39B4DCD6-AC04-4C2F-8B85-92BCD8DB846A");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_TITOLO, "TITOLO");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_TITOLO, BUK_LIBCONCODGES_SPAN_NUOVASPAN, MyGlb.VIS_TITOLIINBOX, 0, 0, 0, 271384961, "", "Controllo Codice Gestionale", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_NUOVASPAN, "B9B06EE2-BBFB-4225-A624-CF3F955DAC6B");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_NUOVASPAN, "NUOVASPAN");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_INTESTPAGINA, BUK_LIBCONCODGES_RPTBOX_LIQUIDHEADER, 0, 1300, 2000, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_LIQUIDHEADER, "C302EE7C-5608-4C27-828B-CD6053C9876E");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_LIQUIDHEADER, "LIQUIDHEADER");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_LIQUIDHEADER, BUK_LIBCONCODGES_SPAN_C1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Liquidazione", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_C1, "481FFC6F-BF16-4AF7-B23F-65EB4D4ED78F");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_C1, "C1");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_INTESTPAGINA, BUK_LIBCONCODGES_RPTBOX_BENEFIHEADER, 2100, 1300, 6089, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_BENEFIHEADER, "7C51B18A-7AE2-4D86-8564-4FD955455A9D");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_BENEFIHEADER, "BENEFIHEADER");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_BENEFIHEADER, BUK_LIBCONCODGES_SPAN_BENEFICIARI1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Beneficiario", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_BENEFICIARI1, "B9283DBC-0EFF-40F9-9693-F57C4F277A79");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_BENEFICIARI1, "BENEFICIARI1");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_INTESTPAGINA, BUK_LIBCONCODGES_RPTBOX_IMPORTHEADER, 8300, 1300, 2656, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_IMPORTHEADER, "E2D8A2F7-6BDB-41C0-AB19-AB6FB120978E");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_IMPORTHEADER, "IMPORTHEADER");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_IMPORTHEADER, BUK_LIBCONCODGES_SPAN_IMPORTO1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_IMPORTO1, "0AA29507-727C-41FA-84E6-388BE22D16F4");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_IMPORTO1, "IMPORTO1");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_INTESTPAGINA, BUK_LIBCONCODGES_RPTBOX_DESCRIHEADER, 11300, 1300, 6142, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_DESCRIHEADER, "1E9C1AD2-BB07-4254-BC08-5D0281A4B5C2");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_DESCRIHEADER, BUK_LIBCONCODGES_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_DESCRIZIONE1, "ED2DFDCB-A71B-4788-B310-4BC5259CE4ED");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_INTESTPAGINA, BUK_LIBCONCODGES_RPTBOX_STATOCGUHEAD, 17491, 1300, 1509, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_STATOCGUHEAD, "472C0F9C-233A-4DD9-870C-DDA2ACA051BD");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_STATOCGUHEAD, "STATOCGUHEAD");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_STATOCGUHEAD, BUK_LIBCONCODGES_SPAN_C, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Stato Cgu", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_C, "5DF90DCF-D1B8-4CC5-A2CF-71A0E0CDAECA");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_C, "C");
    BUK_LIBCONCODGES.InitSection(BUK_LIBCONCODGES_RPT_NUOVOREPORT, BUK_LIBCONCODGES_SEC_DETTAGLIO, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCODGES.SetSectionRendersInto(BUK_LIBCONCODGES_SEC_DETTAGLIO, BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SEC_DETTAGLIO, "8FD270A7-890A-4567-B352-3E05CED3711B");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_DETTAGLIO, BUK_LIBCONCODGES_RPTBOX_LIQUIDAZIONE, 0, 0, 2000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_LIQUIDAZIONE, "B0879B0B-DD58-4D85-957A-7DFA36D78916");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_LIQUIDAZIONE, "LIQUIDAZIONE");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_LIQUIDAZIONE, BUK_LIBCONCODGES_SPAN_LIQUIDAZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 20, 0, 271384705, "", "::LIQLIQUIDAZI", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_LIQUIDAZIONE, "4E3C8FB5-6D86-453D-B2B0-08E588F5766F");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_LIQUIDAZIONE, "LIQUIDAZIONE");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_DETTAGLIO, BUK_LIBCONCODGES_RPTBOX_BENEFICIARIO, 2100, 0, 6089, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_BENEFICIARIO, "05C98825-BA4B-4C36-9A2E-A84836D05C8E");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_BENEFICIARIO, "BENEFICIARIO");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_BENEFICIARIO, BUK_LIBCONCODGES_SPAN_BENEFICIARIO, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::LIQBENEFICIA", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_BENEFICIARIO, "ECA970E0-F858-48CB-8E76-7ABAA090559F");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_BENEFICIARIO, "BENEFICIARIO");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_DETTAGLIO, BUK_LIBCONCODGES_RPTBOX_IMPORTO, 8300, 0, 2656, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_IMPORTO, "06482B7B-5254-4B7F-8414-B8F622CEC82D");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_IMPORTO, "IMPORTO");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_IMPORTO, BUK_LIBCONCODGES_SPAN_IMPORTO, MyGlb.VIS_IMPORTO, 3, 14, 6, 271384705, "", "::LIQIMPORTO", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_IMPORTO, "0CFCC719-054B-4111-BC9D-F58CAB735803");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_DETTAGLIO, BUK_LIBCONCODGES_RPTBOX_DESCRIZIONE, 11300, 0, 6142, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_DESCRIZIONE, "7472D8FE-6635-455F-A729-F5B2BD1FB83D");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_DESCRIZIONE, BUK_LIBCONCODGES_SPAN_DESCRIZIONE, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "", "::LIQDESCRIZIO", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_DESCRIZIONE, "587C9AAA-B335-420F-B3FC-68B81A0AB64B");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIBCONCODGES.InitReportBox(BUK_LIBCONCODGES_SEC_DETTAGLIO, BUK_LIBCONCODGES_RPTBOX_STATOCGU, 17491, 0, 1509, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_RPTBOX_STATOCGU, "630E3038-5D8A-4E87-A80C-4894F57BDE3F");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_RPTBOX_STATOCGU, "STATOCGU");
    BUK_LIBCONCODGES.InitBoxSpan(BUK_LIBCONCODGES_RPTBOX_STATOCGU, BUK_LIBCONCODGES_SPAN_STATOCGU, MyGlb.VIS_DEFAREPOSTYL, 5, 10, 0, 271384705, "", "::LIQSTATOCGU", 1);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SPAN_STATOCGU, "BEA4D605-69A1-493E-8455-7337499C82D2");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SPAN_STATOCGU, "STATOCGU");
    BUK_LIBCONCODGES.InitSection(BUK_LIBCONCODGES_RPT_NUOVOREPORT, BUK_LIBCONCODGES_SEC_PIEDEPAGINA, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCODGES.SetSectionRendersInto(BUK_LIBCONCODGES_SEC_PIEDEPAGINA, BUK_LIBCONCODGES_RPTBOX_PIEDEPAGINA);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SEC_PIEDEPAGINA, "1E8D2376-62E4-4B3D-8197-C4D54249A1B7");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SEC_PIEDEPAGINA, "PIEDEPAGINA");
    BUK_LIBCONCODGES.InitSection(BUK_LIBCONCODGES_RPT_NUOVOREPORT, BUK_LIBCONCODGES_SEC_PIEDEREPORT, 0, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBCONCODGES.SetSectionRendersInto(BUK_LIBCONCODGES_SEC_PIEDEREPORT, BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA);
    BUK_LIBCONCODGES.SetRTCGuid(BUK_LIBCONCODGES_SEC_PIEDEREPORT, "CEE4D951-5966-452D-9EDC-392520F7CD70");
    BUK_LIBCONCODGES.SetObjCode(BUK_LIBCONCODGES_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBCONCODGES_RPT_NUOVOREPORT_InitQuery(false, true);
  }

  private void BUK_LIBCONCODGES_InitLinks()
  {
    BUK_LIBCONCODGES.SetBoxNextBox(BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA, BUK_LIBCONCODGES_RPTBOX_CORPOPAGINA);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CONTCODIGEST) PAN_CONTCODIGEST_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTCODIGEST) PAN_CONTCODIGEST_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CONTCODIGEST) PAN_CONTCODIGEST_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CONTCODIGEST) PAN_CONTCODIGEST_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CONTCODIGEST) PAN_CONTCODIGEST_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBCONCODGES) BUK_LIBCONCODGES_OnPreview();
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
