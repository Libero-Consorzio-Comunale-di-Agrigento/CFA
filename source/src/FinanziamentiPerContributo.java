// **********************************************
// Finanziamenti Per Contributo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentiPerContributo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAM_TIPOCONTRIBU = 0;
  private static int PFL_PARAM_PROGRUNITA = 1;
  private static int PFL_PARAM_ANCHEESAURIT = 2;
  private static int PFL_PARAM_ELABORA = 3;

  private static int PPQRY_PARAM11 = 0;

  private static int PPQRY_SO4ANAUNIORG = 1;


  IDPanel PAN_PARAM;
  CIDREObj BUK_LIBROFINANZI;
  OBook BKW_LIBROFINANZI;
  //
  // Template Pages constants
  private static int BUK_LIBROFINANZI_MST_NUOVPAGIMAST = 1;
  private static int BUK_LIBROFINANZI_RPTBOX_TESTATPAGIN1 = 2;
  private static int BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1 = 3;
  private static int BUK_LIBROFINANZI_RPTBOX_NUOVOBOX = 4;
  private static int BUK_LIBROFINANZI_SPAN_TSLFFPCPNTSL = 5;

  //
  // Reports constants
  private static int BUK_LIBROFINANZI_RPT_FINANZIAMENT = 6;
  private static int BUK_LIBROFINANZI_SEC_INTESTREPORT = 7;
  private static int BUK_LIBROFINANZI_SEC_INTESTPAGINA = 8;
  private static int BUK_LIBROFINANZI_RPTBOX_TITOLO2 = 9;
  private static int BUK_LIBROFINANZI_SPAN_FINANZIAMENT = 10;
  private static int BUK_LIBROFINANZI_RPTBOX_TITOLO3 = 11;
  private static int BUK_LIBROFINANZI_SPAN_IFEQCCUDCSDU = 12;
  private static int BUK_LIBROFINANZI_RPTBOX_CODICEHEADE1 = 13;
  private static int BUK_LIBROFINANZI_SPAN_CODICE1 = 14;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCRIHEADE1 = 15;
  private static int BUK_LIBROFINANZI_SPAN_DESCRIZIONE1 = 16;
  private static int BUK_LIBROFINANZI_RPTBOX_CAPITREGHEAD = 17;
  private static int BUK_LIBROFINANZI_SPAN_CAPITOLOREG = 18;
  private static int BUK_LIBROFINANZI_RPTBOX_ATTODIASSHEA = 19;
  private static int BUK_LIBROFINANZI_SPAN_ATTODIASSEGN = 20;
  private static int BUK_LIBROFINANZI_RPTBOX_LEGGEREGHEAD = 21;
  private static int BUK_LIBROFINANZI_SPAN_LEGGEREG = 22;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1 = 23;
  private static int BUK_LIBROFINANZI_SPAN_UNITAORGANIZ = 24;
  private static int BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEA1 = 25;
  private static int BUK_LIBROFINANZI_SPAN_IMPORTO = 26;
  private static int BUK_LIBROFINANZI_RPTBOX_ESAURIHEADER = 27;
  private static int BUK_LIBROFINANZI_SPAN_ESAURITO = 28;
  private static int BUK_LIBROFINANZI_RPTBOX_UTENTEHEADER = 29;
  private static int BUK_LIBROFINANZI_SPAN_UTENTE = 30;
  private static int BUK_LIBROFINANZI_SEC_DETTAGLIO = 31;
  private static int BUK_LIBROFINANZI_RPTBOX_CODICE = 32;
  private static int BUK_LIBROFINANZI_SPAN_FICOFIPECOLF = 33;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE1 = 34;
  private static int BUK_LIBROFINANZI_SPAN_FIDEFIPECOLF = 35;
  private static int BUK_LIBROFINANZI_RPTBOX_CAPITOREGION = 36;
  private static int BUK_LIBROFINANZI_SPAN_FICAREFIPCLF = 37;
  private static int BUK_LIBROFINANZI_RPTBOX_ATTODIASSEGN = 38;
  private static int BUK_LIBROFINANZI_SPAN_FIATASFIPCLF = 39;
  private static int BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG1 = 40;
  private static int BUK_LIBROFINANZI_SPAN_FIIMORFIPCLF = 41;
  private static int BUK_LIBROFINANZI_RPTBOX_SCADENZA1 = 42;
  private static int BUK_LIBROFINANZI_SPAN_IFSFPCLFSEOI = 43;
  private static int BUK_LIBROFINANZI_RPTBOX_DESCRUO1 = 44;
  private static int BUK_LIBROFINANZI_SPAN_FIDEUOFIPCLF = 45;
  private static int BUK_LIBROFINANZI_RPTBOX_LEGGEREG = 46;
  private static int BUK_LIBROFINANZI_SPAN_FILEREFIPCLF = 47;
  private static int BUK_LIBROFINANZI_RPTBOX_UTENTE = 48;
  private static int BUK_LIBROFINANZI_SPAN_FIUTINFIPCLF = 49;
  private static int BUK_LIBROFINANZI_SEC_PIEDEREPORT = 50;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM159(IMDB);
    //
    //
    Init_PQRY_PARAM11(IMDB);
    Init_PQRY_PARAM11_RS(IMDB);
    Init_PQRY_FINANZIAMEN1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM159(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAM159, 4);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAM159, "TBL_PARAM159");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARTIPOCONTR, "PARTIPOCONTR");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARTIPOCONTR,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARPROGRUNIT, "PARPROGRUNIT");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARPROGRUNIT,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARANCHEESAU, "PARANCHEESAU");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARANCHEESAU,5,52,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARUNITAORGA, "PARUNITAORGA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAM159,IMDBDef1.FLD_PARAM159_PARUNITAORGA,5,250,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAM159, 0);
  }

  private static void Init_PQRY_PARAM11(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAM11, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAM11, "PQRY_PARAM11");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM11,IMDBDef8.PQSL_PARAM11_PARTIPOCONTR, "PARTIPOCONTR");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM11,IMDBDef8.PQSL_PARAM11_PARTIPOCONTR,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM11,IMDBDef8.PQSL_PARAM11_PARPROGRUNIT, "PARPROGRUNIT");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM11,IMDBDef8.PQSL_PARAM11_PARPROGRUNIT,1,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM11,IMDBDef8.PQSL_PARAM11_PARANCHEESAU, "PARANCHEESAU");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM11,IMDBDef8.PQSL_PARAM11_PARANCHEESAU,5,52,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PARAM11, 0);
  }

  private static void Init_PQRY_PARAM11_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PARAM11_RS, 3);
    IMDB.set_TblCode(IMDBDef8.PQRY_PARAM11_RS, "PQRY_PARAM11_RS");
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM11_RS,IMDBDef8.PQSL_PARAM11_PARTIPOCONTR, "PARTIPOCONTR");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM11_RS,IMDBDef8.PQSL_PARAM11_PARTIPOCONTR,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM11_RS,IMDBDef8.PQSL_PARAM11_PARPROGRUNIT, "PARPROGRUNIT");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM11_RS,IMDBDef8.PQSL_PARAM11_PARPROGRUNIT,1,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PARAM11_RS,IMDBDef8.PQSL_PARAM11_PARANCHEESAU, "PARANCHEESAU");
    IMDB.SetFldParams(IMDBDef8.PQRY_PARAM11_RS,IMDBDef8.PQSL_PARAM11_PARANCHEESAU,5,52,0);
  }

  private static void Init_PQRY_FINANZIAMEN1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAMEN1, 18);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAMEN1, "PQRY_FINANZIAMEN1");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZCODICE, "FINANZCODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZCODICE,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZDESCRI, "FINANZDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZDESCRI,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZIAENTE, "FINANZIAENTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZIAENTE,1,6,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINNUMANNMUT, "FINNUMANNMUT");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINNUMANNMUT,5,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAANNOMUTU, "FINAANNOMUTU");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAANNOMUTU,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAIMPOORIG, "FINAIMPOORIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAIMPOORIG,3,14,2);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZCATEGO, "FINANZCATEGO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZCATEGO,1,3,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZDURATA, "FINANZDURATA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZDURATA,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAALLALPEG, "FINAALLALPEG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAALLALPEG,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAFINADISA, "FINAFINADISA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAFINADISA,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZIANOTE, "FINANZIANOTE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZIANOTE,5,2000,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZDIPART, "FINANZDIPART");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZDIPART,5,150,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINALEGGREGI, "FINALEGGREGI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINALEGGREGI,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINACAPIREGI, "FINACAPIREGI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINACAPIREGI,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAATTOASSE, "FINAATTOASSE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAATTOASSE,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAUTENINSE, "FINAUTENINSE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINAUTENINSE,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZSCADEN, "FINANZSCADEN");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANZSCADEN,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANDESCRUO, "FINANDESCRUO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN1,IMDBDef8.PQSL_FINANZIAMEN1_FINANDESCRUO,5,99,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAMEN1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentiPerContributo(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentiPerContributo()
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
    FormIdx = MyGlb.FRM_FINANPERCONT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4C916CFC-BF86-4D5E-B27C-42E69921F3DD";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 508;
    DesignHeight = 194;
    set_Caption(new IDVariant("Finanziamenti Per Contributo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 508;
    Frames[1].Height = 168;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 168;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 508-MyGlb.PAN_OFFS_X, 168-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0F3AF5F4-346E-41F9-BDC3-6E5FFBD7F565");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 560, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    BKW_LIBROFINANZI = new OBook(this);
    BUK_LIBROFINANZI = new CIDREObj(BKW_LIBROFINANZI);
    BKW_LIBROFINANZI.iGuid = "A50834AC-859C-4DF4-87B9-EDA6A3EEEA4E";
    BKW_LIBROFINANZI.Code = "BUK_LIBROFINANZI";
    BKW_LIBROFINANZI.BookObj = BUK_LIBROFINANZI;
    BKW_LIBROFINANZI.InitDefMasks();
    BUK_LIBROFINANZI.InitBook(1, 1245185, "Libro Finanziamenti", IMDB, MainFrm.VisualStyleList);
    BUK_LIBROFINANZI.InitHTML();
    BUK_LIBROFINANZI.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIBROFINANZI.Book.SetMainFrm(MainFrm);
    BUK_LIBROFINANZI.SetRTCGuid(0, "A50834AC-859C-4DF4-87B9-EDA6A3EEEA4E");
    BUK_LIBROFINANZI.SetObjCode(0, "LIBROFINANZI");
    BUK_LIBROFINANZI_MST_NUOVPAGIMAST_Init();
    BUK_LIBROFINANZI_RPT_FINANZIAMENT_Init();
    BUK_LIBROFINANZI_InitLinks();
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
      if (IMDB.TblModified(IMDBDef1.TBL_PARAM159, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FINANPERCONT_PARAM11();
      }
      PAN_PARAM.UpdatePanel(MainFrm);
      // BUK_LIBROFINANZI.UpdateBook();
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
    if (Code.equals("BUK_LIBROFINANZI")) return BUK_LIBROFINANZI;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof FinanziamentiPerContributo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentiPerContributo.class.getName() : (Glb.ClassWithPackage(FinanziamentiPerContributo.class) ? FinanziamentiPerContributo.class.getName().substring(FinanziamentiPerContributo.class.getPackage().getName().length() + 1) : FinanziamentiPerContributo.class.getName()));
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
      IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
      v_CAPTION = (new IDVariant("Finanziamenti per Contributo"));
      set_Caption(new IDVariant(v_CAPTION));
      IMDB.set_Value(IMDBDef1.TBL_PARAM159, IMDBDef1.FLD_PARAM159_PARPROGRUNIT, 0, (new IDVariant(-1)));
      if (MainFrm.COMPETENZA.compareTo((new IDVariant("TU")), true)!=0)
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiPerContributo", "Load", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Corpo Procedura
      // 
      BUK_LIBROFINANZI.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_LIBROFINANZI.RefreshQuery();
      BUK_LIBROFINANZI.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_LIBROFINANZI.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiPerContributo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Intestazione Pagina After Formatting
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_LIBROFINANZI_SEC_INTESTPAGINA_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Intestazione Pagina After Formatting Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef8.PQRY_PARAM11, IMDBDef8.PQSL_PARAM11_PARTIPOCONTR, 0).equals((new IDVariant("F")), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Elenco Contributi Funzioni Delegate "));
        BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_FINANZIAMENT, IDL.Add(v_SMS, MainFrm.Datetostring(IDL.Today())));
        BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_CAPITOREGION, (new IDVariant(-1)).booleanValue());
        BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_CAPITREGHEAD, (new IDVariant(-1)).booleanValue());
      }
      if (IMDB.Value(IMDBDef8.PQRY_PARAM11, IMDBDef8.PQSL_PARAM11_PARTIPOCONTR, 0).equals((new IDVariant("S")), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Elenco Contributi Straordinari "));
        BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_FINANZIAMENT, IDL.Add(v_SMS, MainFrm.Datetostring(IDL.Today())));
        BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_CAPITOREGION, (new IDVariant(0)).booleanValue());
        BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_CAPITREGHEAD, (new IDVariant(0)).booleanValue());
      }
      if (MainFrm.COMPETENZA.equals((new IDVariant("UC")), true))
      {
        BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_TITOLO3, (new IDVariant(-1)).booleanValue());
        BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_IFEQCCUDCSDU, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIDESCRUO, 0));
        BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_DESCRUO1, (new IDVariant(-1)).booleanValue());
        BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        if (MainFrm.COMPETENZA.equals((new IDVariant("TU")), true))
        {
          if (IMDB.Value(IMDBDef8.PQRY_PARAM11, IMDBDef8.PQSL_PARAM11_PARPROGRUNIT, 0).equals((new IDVariant(-1)), true))
          {
            BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_TITOLO3, (new IDVariant(0)).booleanValue());
          }
          else
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Unità Organizzativa: "));
            IDVariant v_DESCR = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as CF4WSTRUDESC ");
            SQL.append("from ");
            SQL.append("  CF4WEB_STRUTTURA A ");
            SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.PROGR_UNITA_ORGANIZZATIVA = " + IDL.CSql(IMDB.Value(IMDBDef8.PQRY_PARAM11, IMDBDef8.PQSL_PARAM11_PARPROGRUNIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_DESCR = QV.Get("CF4WSTRUDESC", IDVariant.STRING) ;
            }
            QV.Close();
            BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_TITOLO3, (new IDVariant(-1)).booleanValue());
            BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_IFEQCCUDCSDU, IDL.Add(v_SMS, v_DESCR));
          }
          BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_DESCRUO1, (new IDVariant(-1)).booleanValue());
          BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_DESCRUO1, (new IDVariant(0)).booleanValue());
          BUK_LIBROFINANZI.set_BoxVisible(BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1, (new IDVariant(0)).booleanValue());
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiPerContributo", "IntestazionePaginaAfterFormatting", _e);
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void FINANPERCONT_PARAM11() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef8.PQRY_PARAM11_RS);
    IMDB.TblMoveFirst(IMDBDef1.TBL_PARAM159, 0);
    Loop1: while (!IMDB.Eof(IMDBDef1.TBL_PARAM159, 0))
    {
      IMDB.TblAddNew(IMDBDef8.PQRY_PARAM11_RS, 0);
      IMDB.TblLinkRow(IMDBDef8.PQRY_PARAM11_RS, 0, IMDBDef1.TBL_PARAM159, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAM11_RS, 0, 0, IMDBDef1.TBL_PARAM159, IMDBDef1.FLD_PARAM159_PARTIPOCONTR, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAM11_RS, 1, 0, IMDBDef1.TBL_PARAM159, IMDBDef1.FLD_PARAM159_PARPROGRUNIT, 0);
      IMDB.TblLinkField(IMDBDef8.PQRY_PARAM11_RS, 2, 0, IMDBDef1.TBL_PARAM159, IMDBDef1.FLD_PARAM159_PARANCHEESAU, 0);
      IMDB.TblMoveNext(IMDBDef1.TBL_PARAM159, 0);
      if (IMDB.Eof(IMDBDef1.TBL_PARAM159, 0))
      {
        IMDB.TblMoveFirst(IMDBDef1.TBL_PARAM159, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef8.PQRY_PARAM11_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  private void BUK_LIBROFINANZI_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIBROFINANZI_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBROFINANZI_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_LIBROFINANZI_SEC_INTESTPAGINA)
    {
      BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_IFEQCCUDCSDU, new IDVariant(((MainFrm.COMPETENZA.equals((new IDVariant("UC"))))?IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIDESCRUO, 0):(new IDVariant("")))));
    }
    if (SectionID==BUK_LIBROFINANZI_SEC_DETTAGLIO)
    {
      BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_IFSFPCLFSEOI, new IDVariant(((BUK_LIBROFINANZI.GetReportColumn(BUK_LIBROFINANZI_RPT_FINANZIAMENT, "FINANZSCADEN").compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<=0 || IDL.IsNull(BUK_LIBROFINANZI.GetReportColumn(BUK_LIBROFINANZI_RPT_FINANZIAMENT, "FINANZSCADEN")))?(new IDVariant("SI")):(new IDVariant("NO")))));
    }
    if (SectionID==BUK_LIBROFINANZI_SEC_PIEDEREPORT)
    {
    }
  }

  private void BUK_LIBROFINANZI_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIBROFINANZI_SEC_INTESTPAGINA)
    {
      BUK_LIBROFINANZI_SEC_INTESTPAGINA_OnAfterFormattingSection();
    }
  }

  private void BUK_LIBROFINANZI_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIBROFINANZI_MST_NUOVPAGIMAST)
    {
      BUK_LIBROFINANZI.set_SpanValue(BUK_LIBROFINANZI_SPAN_TSLFFPCPNTSL, new IDVariant(IDL.Add(IDL.Add(IDL.ToString((new IDVariant(BUK_LIBROFINANZI.GetPageNumber()))), (new IDVariant("/"))), IDL.ToString((new IDVariant(BUK_LIBROFINANZI.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIBROFINANZI_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIBROFINANZI_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIBROFINANZI_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIBROFINANZI_OnPreview()
  {
    PreviewBook = BKW_LIBROFINANZI;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, "E61D16DB-9BAC-4F9C-AE48-E74283777C74");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, "Tipo Contributo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, "C1E2A579-76F9-48CB-8B8E-DED8FC7C6DB9");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, "Progr. Unità");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, "508D1E58-3845-4395-8D31-FC151C5B6415");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, "Anche esauriti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "549C11ED-42FB-4630-8D5E-B81EE00B3836");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_LIST, "Tipo Contributo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_FORM, 4, 4, 324, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TIPOCONTRIBU, MyGlb.PANEL_FORM, "Tipo Contributo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TIPOCONTRIBU, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TIPOCONTRIBU, PPQRY_PARAM11, "A.PARTIPOCONTR", "PARTIPOCONTR", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOCONTRIBU, (new IDVariant("F")), "Funzioni Delegate", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_TIPOCONTRIBU, (new IDVariant("S")), "Straordinari", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_LIST, 0, 36, 392, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_LIST, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_LIST, "Progr. Unità");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_FORM, 4, 28, 464, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PROGRUNITA, MyGlb.PANEL_FORM, "Progr. Unità");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PROGRUNITA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PROGRUNITA, PPQRY_PARAM11, "A.PARPROGRUNIT", "PARPROGRUNIT", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_LIST, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_LIST, "Anc. es.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_FORM, 4, 52, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ANCHEESAURIT, MyGlb.PANEL_FORM, "Anche esauriti");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ANCHEESAURIT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ANCHEESAURIT, PPQRY_PARAM11, "A.PARANCHEESAU", "PARANCHEESAU", 5, 52, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ANCHEESAURIT, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_ANCHEESAURIT, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 340, 100, 128, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 388, 92, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as SOANUNORDUO1, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PARPROGRUNIT~~) ");
    SQL.append("and   (A.OTTICA = B.OTTICA) ");
    SQL.append("and   (NVL(A.DAL, TRUNC( SYSDATE )) <= TRUNC( SYSDATE )) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'A', ");
    SQL.append("  '(Tutte)' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("where (-1 = ~~PARPROGRUNIT~~) ");
    SQL.append("order by 2 ");
    PAN_PARAM.SetQuery(PPQRY_SO4ANAUNIORG, 0, SQL, PFL_PARAM_PROGRUNITA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as SOANUNORDUO1, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A, ");
    SQL.append("  PARAMETRI_WEB B ");
    SQL.append("where (A.OTTICA = B.OTTICA) ");
    SQL.append("and   (NVL(A.DAL, TRUNC( SYSDATE )) <= TRUNC( SYSDATE )) ");
    SQL.append("and   (B.PROGRESSIVO = 1) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'A', ");
    SQL.append("  '(Tutte)' ");
    SQL.append("from ");
    SQL.append("  DUAL C ");
    SQL.append("order by 2 ");
    PAN_PARAM.SetQuery(PPQRY_SO4ANAUNIORG, 1, SQL, PFL_PARAM_PROGRUNITA, "");
    PAN_PARAM.SetQueryDB(PPQRY_SO4ANAUNIORG, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM11", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM11, IMDBDef8.PQRY_PARAM11_RS, IMDBDef1.TBL_PARAM159);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TIPOCONTRIBU, IMDBDef1.FLD_PARAM159_PARTIPOCONTR);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PROGRUNITA, IMDBDef1.FLD_PARAM159_PARPROGRUNIT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ANCHEESAURIT, IMDBDef1.FLD_PARAM159_PARANCHEESAU);
    PAN_PARAM.SetMasterTable(0, "PARAM159");
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

  private void BUK_LIBROFINANZI_MST_NUOVPAGIMAST_Init()
  {
    BUK_LIBROFINANZI.InitMastro(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, 3, 21000, 29700, 1, 2, 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, "2EC36409-981C-47EA-9C98-E51069F67C3E");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, "NUOVPAGIMAST");
    BUK_LIBROFINANZI.InitMastroBox(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, BUK_LIBROFINANZI_RPTBOX_TESTATPAGIN1, 1000, 1500, 27700, 3400, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_TESTATPAGIN1, "2CC53C89-B846-4EF2-83DC-702F380A69AB");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_TESTATPAGIN1, "TESTATPAGIN1");
    BUK_LIBROFINANZI.InitMastroBox(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1, 1000, 4900, 27700, 14100, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1, "DA754E6E-E9DD-465C-B558-966F599C16B2");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1, "CORPOPAGINA1");
    BUK_LIBROFINANZI.InitMastroBox(BUK_LIBROFINANZI_MST_NUOVPAGIMAST, BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, 25600, 500, 3100, 800, 0, 1, 1, MyGlb.VIS_NORMAA9RIGHT, 983041, 393, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, "A0157DEA-C875-45FF-96C8-17BAB4B12F32");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, "NUOVOBOX");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_NUOVOBOX, BUK_LIBROFINANZI_SPAN_TSLFFPCPNTSL, MyGlb.VIS_NORMAA9RIGHT, 5, 199, 0, 271384705, "", "", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_TSLFFPCPNTSL, "09829F01-EFDD-41A6-B646-980FF822EED0");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_TSLFFPCPNTSL, "TSLFFPCPNTSL");
  }

  private void BUK_LIBROFINANZI_RPT_FINANZIAMENT_InitQuery() { BUK_LIBROFINANZI_RPT_FINANZIAMENT_InitQuery(true, true); }
  private void BUK_LIBROFINANZI_RPT_FINANZIAMENT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as FINANZCODICE, ");
      SQL.append("  A.DESCRIZIONE as FINANZDESCRI, ");
      SQL.append("  A.ENTE as FINANZIAENTE, ");
      SQL.append("  A.NUMERO_MUTUO as FINNUMANNMUT, ");
      SQL.append("  A.ANNO_MUTUO as FINAANNOMUTU, ");
      SQL.append("  A.IMPORTO_ORIG as FINAIMPOORIG, ");
      SQL.append("  A.CATEGORIA as FINANZCATEGO, ");
      SQL.append("  A.TIPO_DURATA as FINANZDURATA, ");
      SQL.append("  A.COD_ALLEGATO as FINAALLALPEG, ");
      SQL.append("  A.COD_FIN_DISAV as FINAFINADISA, ");
      SQL.append("  A.NOTE as FINANZIANOTE, ");
      SQL.append("  A.DIPARTIMENTO as FINANZDIPART, ");
      SQL.append("  A.LEGGE_REG as FINALEGGREGI, ");
      SQL.append("  A.CAPITOLO_REG as FINACAPIREGI, ");
      SQL.append("  A.ATTO_ASS as FINAATTOASSE, ");
      SQL.append("  A.UTENTE_INSERIMENTO as FINAUTENINSE, ");
      SQL.append("  A.SCADENZA as FINANZSCADEN, ");
      SQL.append("  ( ");
      SQL.append("select distinct ");
      SQL.append("  MIN(B.DESCRIZIONE) ");
      SQL.append("from ");
      SQL.append("  CF4WEB_STRUTTURA B, ");
      SQL.append("  FINANZIAMENTI_UO C ");
      SQL.append("where (B.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.PROGR_UNITA_ORGANIZZATIVA = DECODE(" + IDL.CSql(MainFrm.COMPETENZA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'UC', ~~TBL_DATISESSIONE.SESSIPROGRU1~~, DECODE(" + IDL.CSql(MainFrm.COMPETENZA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'TU', DECODE(~~PQRY_PARAM11.PARPROGRUNIT~~, -1, B.PROGR_UNITA_ORGANIZZATIVA, ~~PQRY_PARAM11.PARPROGRUNIT~~), B.PROGR_UNITA_ORGANIZZATIVA))) ");
      SQL.append("and   (C.FINANZIAMENTO = A.CODICE) ");
      SQL.append("and   (C.PROGR_UNITA_ORGANIZZATIVA = B.PROGR_UNITA_ORGANIZZATIVA) ");
      SQL.append(") as FINANDESCRUO ");
      SQL.append("from ");
      SQL.append("  FINANZIAMENTI A ");
      SQL.append("where ((" + IDL.CSql(MainFrm.COMPETENZA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'TU' AND (A.CODICE IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  E.FINANZIAMENTO ");
      SQL.append("from ");
      SQL.append("  FINANZIAMENTI_UO E ");
      SQL.append("where (E.FINANZIAMENTO = A.CODICE) ");
      SQL.append("and   (E.PROGR_UNITA_ORGANIZZATIVA = DECODE(~~PQRY_PARAM11.PARPROGRUNIT~~, -1, E.PROGR_UNITA_ORGANIZZATIVA, ~~PQRY_PARAM11.PARPROGRUNIT~~)) ");
      SQL.append("))) OR (" + IDL.CSql(MainFrm.COMPETENZA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'UC' AND ((A.CODICE IN ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  D.FINANZIAMENTO ");
      SQL.append("from ");
      SQL.append("  FINANZIAMENTI_UO D ");
      SQL.append("where (D.FINANZIAMENTO = A.CODICE) ");
      SQL.append("and   (D.PROGR_UNITA_ORGANIZZATIVA = ~~TBL_DATISESSIONE.SESSIPROGRU1~~) ");
      SQL.append(")))) OR (" + IDL.CSql(MainFrm.COMPETENZA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'UNG')) ");
      SQL.append("and   (~~PQRY_PARAM11.PARANCHEESAU~~ = 'S' OR (~~PQRY_PARAM11.PARANCHEESAU~~ = 'N' AND (NOT ((A.SCADENZA IS NULL) OR A.SCADENZA <= ~~TBL_DATISESSIONE.SESSIOESERCI~~)))) ");
      SQL.append("and   ((NOT ((A.CAPITOLO_REG IS NULL)) AND ~~PQRY_PARAM11.PARTIPOCONTR~~ = 'F') OR (~~PQRY_PARAM11.PARTIPOCONTR~~ = 'S' AND (NOT ((A.ATTO_ASS IS NULL)) AND (A.CAPITOLO_REG IS NULL)))) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_LIBROFINANZI.SetReportQuery(BUK_LIBROFINANZI_RPT_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "73857710-3249-419A-A216-F06625FCF915");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIBROFINANZI_RPT_FINANZIAMENT_Init()
  {
    BUK_LIBROFINANZI.InitReport(BUK_LIBROFINANZI_RPT_FINANZIAMENT, 196609);
    BUK_LIBROFINANZI_RPT_FINANZIAMENT_InitQuery(true, false);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPT_FINANZIAMENT, "FF807438-339D-4382-B910-EAA3687732BA");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPT_FINANZIAMENT, "FINANZIAMENT");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_FINANZIAMENT, BUK_LIBROFINANZI_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_INTESTREPORT, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_INTESTREPORT, "D37C5F41-8655-490B-9DB2-64034FDE6DC9");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_FINANZIAMENT, BUK_LIBROFINANZI_SEC_INTESTPAGINA, 3000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_TESTATPAGIN1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_INTESTPAGINA, "0721389F-4960-4F7D-9072-60FA81705065");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_INTESTPAGINA, "INTESTPAGINA");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_TITOLO2, 0, 200, 27400, 800, 0, 1, 1, MyGlb.VIS_TITOLOREPOR1, 983041, 518, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_TITOLO2, "D633E7B2-A589-4712-93EC-9CC5212E15EC");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_TITOLO2, "TITOLO2");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_TITOLO2, BUK_LIBROFINANZI_SPAN_FINANZIAMENT, MyGlb.VIS_TITOLOREPOR1, 0, 0, 0, 271384961, "", "Finanziamenti", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FINANZIAMENT, "14783DF3-B664-4BC9-B042-DEF5A4B4ACCD");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FINANZIAMENT, "FINANZIAMENT");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_TITOLO3, 0, 1000, 27400, 800, 0, 1, 1, MyGlb.VIS_TITOLOREPOR1, 983041, 518, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_TITOLO3, "065DEBDD-1245-42E9-8936-CCEE9D584B33");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_TITOLO3, "TITOLO3");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_TITOLO3, BUK_LIBROFINANZI_SPAN_IFEQCCUDCSDU, MyGlb.VIS_TITOLOREPOR1, 5, 99, 0, 271384961, "Finanziamenti", "", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_IFEQCCUDCSDU, "9E96A233-F4A7-49F9-9CC0-CFF230D3A67E");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_IFEQCCUDCSDU, "IFEQCCUDCSDU");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_CODICEHEADE1, 0, 2300, 1400, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CODICEHEADE1, "F107752D-638A-4260-9250-EC122C6F6605");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_CODICEHEADE1, BUK_LIBROFINANZI_SPAN_CODICE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_CODICE1, "7AAAED63-C14C-4398-A988-77B35A7968A8");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_CODICE1, "CODICE1");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_DESCRIHEADE1, 1700, 2300, 4600, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCRIHEADE1, "CFBC7908-A050-47DE-935E-1EFE9CCCF145");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCRIHEADE1, BUK_LIBROFINANZI_SPAN_DESCRIZIONE1, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_DESCRIZIONE1, "76316B09-BDBD-4600-8445-9E74291931F7");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_CAPITREGHEAD, 7700, 2300, 2212, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CAPITREGHEAD, "64B09651-DFDD-4A6F-96F9-04A1C91FB579");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CAPITREGHEAD, "CAPITREGHEAD");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_CAPITREGHEAD, BUK_LIBROFINANZI_SPAN_CAPITOLOREG, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Capitolo Reg.", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_CAPITOLOREG, "529C14A8-EF90-4477-AE3E-ACF53D5FCFE1");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_CAPITOLOREG, "CAPITOLOREG");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_ATTODIASSHEA, 12600, 2300, 3800, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_ATTODIASSHEA, "9A909F14-5E59-411E-A403-A8FC77811E08");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_ATTODIASSHEA, "ATTODIASSHEA");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_ATTODIASSHEA, BUK_LIBROFINANZI_SPAN_ATTODIASSEGN, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Atto di Assegnazione", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_ATTODIASSEGN, "5C81E1AA-366F-4B3B-9902-F4E3A339690C");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_ATTODIASSEGN, "ATTODIASSEGN");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_LEGGEREGHEAD, 10000, 2300, 2500, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_LEGGEREGHEAD, "E44F58F3-C4C6-41BF-BF1C-EAFE5FCF80D9");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_LEGGEREGHEAD, "LEGGEREGHEAD");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_LEGGEREGHEAD, BUK_LIBROFINANZI_SPAN_LEGGEREG, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Legge Reg.", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_LEGGEREG, "94190C43-A00E-4622-9D5B-89BD69EC08D3");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_LEGGEREG, "LEGGEREG");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1, 18700, 2300, 4854, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1, "67006A7F-9139-40B0-8F56-F756057A7BD3");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1, "DESCRUOHEAD1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCRUOHEAD1, BUK_LIBROFINANZI_SPAN_UNITAORGANIZ, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Unità Organizzativa", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_UNITAORGANIZ, "CE0DAC03-F8F6-4FD9-BF95-954D5E79E7B5");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_UNITAORGANIZ, "UNITAORGANIZ");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEA1, 16500, 2300, 2136, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEA1, "E31FF344-B460-4F7C-AE70-040FF27F4B1C");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEA1, "IMPOORIGHEA1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_IMPOORIGHEA1, BUK_LIBROFINANZI_SPAN_IMPORTO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Importo", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_IMPORTO, "50831111-FA3D-4C49-985E-F728E2C41B5C");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_IMPORTO, "IMPORTO");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_ESAURIHEADER, 23600, 2300, 1401, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_ESAURIHEADER, "4380AFBD-C7F2-4F81-850E-A9E4E900F927");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_ESAURIHEADER, "ESAURIHEADER");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_ESAURIHEADER, BUK_LIBROFINANZI_SPAN_ESAURITO, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Esaurito", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_ESAURITO, "ADAE22D9-8B28-49B5-9F4C-FB359158251E");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_ESAURITO, "ESAURITO");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_INTESTPAGINA, BUK_LIBROFINANZI_RPTBOX_UTENTEHEADER, 25100, 2300, 2500, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_UTENTEHEADER, "53C03971-A53F-4584-91E7-EA1DBD34B5EF");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_UTENTEHEADER, "UTENTEHEADER");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_UTENTEHEADER, BUK_LIBROFINANZI_SPAN_UTENTE, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271319425, "", "Utente", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_UTENTE, "6E98875D-E7F1-417E-93EB-E5BF19CCB64E");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_UTENTE, "UTENTE");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_FINANZIAMENT, BUK_LIBROFINANZI_SEC_DETTAGLIO, 900, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_DETTAGLIO, "C5098075-AA08-4512-8F3D-1A94E84DF2B4");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_CODICE, 0, 0, 1500, 600, 0, 1, 1, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CODICE, "1B361EA4-3E6A-4EA4-BC8C-01947F5EB076");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CODICE, "CODICE");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_CODICE, BUK_LIBROFINANZI_SPAN_FICOFIPECOLF, MyGlb.VIS_NORMALEA9, 1, 5, 0, 271384705, "", "::FINANZCODICE", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FICOFIPECOLF, "9249CBE3-35B2-49EF-BEC3-D92F8D1E2CB3");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FICOFIPECOLF, "FICOFIPECOLF");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE1, 1700, 0, 5900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE1, "A0B4EADF-CE07-4624-81D5-2056499B2D98");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCRIZIONE1, BUK_LIBROFINANZI_SPAN_FIDEFIPECOLF, MyGlb.VIS_DEFAREPOSTYL, 5, 200, 0, 271384705, "", "::FINANZDESCRI", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FIDEFIPECOLF, "592D653F-990E-477D-89BC-4A57F78065A4");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FIDEFIPECOLF, "FIDEFIPECOLF");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_CAPITOREGION, 7700, 0, 2012, 600, 0, 1, 1, MyGlb.VIS_NORMALEA9, 983041, 375, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_CAPITOREGION, "CE3D18A5-2867-4446-9D7A-75255F1FA758");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_CAPITOREGION, "CAPITOREGION");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_CAPITOREGION, BUK_LIBROFINANZI_SPAN_FICAREFIPCLF, MyGlb.VIS_NORMALEA9, 5, 50, 0, 271384705, "", "::FINACAPIREGI", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FICAREFIPCLF, "66F704F6-A997-4A82-A7C3-2D1D2B3934D3");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FICAREFIPCLF, "FICAREFIPCLF");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_ATTODIASSEGN, 12600, 0, 3800, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_ATTODIASSEGN, "26D3BF59-C8B1-4E48-810D-95FE7CF6F022");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_ATTODIASSEGN, "ATTODIASSEGN");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_ATTODIASSEGN, BUK_LIBROFINANZI_SPAN_FIATASFIPCLF, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::FINAATTOASSE", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FIATASFIPCLF, "C637823F-4929-4940-9383-0ED96CB362C1");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FIATASFIPCLF, "FIATASFIPCLF");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG1, 16500, 0, 2067, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG1, "86269235-8FE4-4F1D-B651-2859307F8659");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG1, "IMPORTOORIG1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_IMPORTOORIG1, BUK_LIBROFINANZI_SPAN_FIIMORFIPCLF, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "", "::FINAIMPOORIG", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FIIMORFIPCLF, "7D9BACE8-F9AE-43F0-92C0-E202D58B79DE");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FIIMORFIPCLF, "FIIMORFIPCLF");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_SCADENZA1, 24000, 0, 467, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_SCADENZA1, "2500F489-4D7B-4676-894A-06A7016E4A3C");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_SCADENZA1, "SCADENZA1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_SCADENZA1, BUK_LIBROFINANZI_SPAN_IFSFPCLFSEOI, MyGlb.VIS_CHECKBOX, 5, 99, 0, 271384705, "", "", 1);
    BUK_LIBROFINANZI.SetSpanValueListItem(BUK_LIBROFINANZI_SPAN_IFSFPCLFSEOI, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "", -1);
    BUK_LIBROFINANZI.SetSpanValueListItem(BUK_LIBROFINANZI_SPAN_IFSFPCLFSEOI, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "", -1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_IFSFPCLFSEOI, "256FC256-87E6-484C-B225-B415D3FFC900");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_IFSFPCLFSEOI, "IFSFPCLFSEOI");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_DESCRUO1, 18700, 0, 4900, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_DESCRUO1, "ECAC0D01-A96D-46AE-9D7A-DA9B7146E354");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_DESCRUO1, "DESCRUO1");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_DESCRUO1, BUK_LIBROFINANZI_SPAN_FIDEUOFIPCLF, MyGlb.VIS_DEFAREPOSTYL, 5, 99, 0, 271384705, "", "::FINANDESCRUO", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FIDEUOFIPCLF, "35CE5CEE-F1D8-4E91-ADC4-015F70D9FB99");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FIDEUOFIPCLF, "FIDEUOFIPCLF");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_LEGGEREG, 10000, 0, 2500, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_LEGGEREG, "E47448CA-A013-4104-81D8-6600507048EB");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_LEGGEREG, "LEGGEREG");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_LEGGEREG, BUK_LIBROFINANZI_SPAN_FILEREFIPCLF, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "", "::FINALEGGREGI", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FILEREFIPCLF, "F7D00E8F-17C8-4212-A28F-0A7E170BFE34");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FILEREFIPCLF, "FILEREFIPCLF");
    BUK_LIBROFINANZI.InitReportBox(BUK_LIBROFINANZI_SEC_DETTAGLIO, BUK_LIBROFINANZI_RPTBOX_UTENTE, 25100, 0, 2500, 700, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_RPTBOX_UTENTE, "73A4EC9D-2D5A-4475-AD96-5703D72C742B");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_RPTBOX_UTENTE, "UTENTE");
    BUK_LIBROFINANZI.InitBoxSpan(BUK_LIBROFINANZI_RPTBOX_UTENTE, BUK_LIBROFINANZI_SPAN_FIUTINFIPCLF, MyGlb.VIS_DEFAREPOSTYL, 5, 8, 0, 271384705, "", "::FINAUTENINSE", 1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SPAN_FIUTINFIPCLF, "EE63F0F6-B4F0-49FB-B4A6-C1CE3144058D");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SPAN_FIUTINFIPCLF, "FIUTINFIPCLF");
    BUK_LIBROFINANZI.InitSection(BUK_LIBROFINANZI_RPT_FINANZIAMENT, BUK_LIBROFINANZI_SEC_PIEDEREPORT, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIBROFINANZI.SetSectionRendersInto(BUK_LIBROFINANZI_SEC_PIEDEREPORT, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1);
    BUK_LIBROFINANZI.SetRTCGuid(BUK_LIBROFINANZI_SEC_PIEDEREPORT, "14B96443-87D5-4D24-8B9B-FB245378F7B8");
    BUK_LIBROFINANZI.SetObjCode(BUK_LIBROFINANZI_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_LIBROFINANZI_RPT_FINANZIAMENT_InitQuery(false, true);
  }

  private void BUK_LIBROFINANZI_InitLinks()
  {
    BUK_LIBROFINANZI.SetBoxNextBox(BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1, BUK_LIBROFINANZI_RPTBOX_CORPOPAGINA1);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_LIBROFINANZI) BUK_LIBROFINANZI_OnPreview();
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
