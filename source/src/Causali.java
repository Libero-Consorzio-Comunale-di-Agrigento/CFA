// **********************************************
// Causali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Causali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_IMPEGNACCERT_CODICE1 = 0;
  private static int PFL_IMPEGNACCERT_DESCRIZIONE1 = 1;
  private static int PFL_IMPEGNACCERT_UTENTEINSER1 = 2;
  private static int PFL_IMPEGNACCERT_DATAINSERIM1 = 3;
  private static int PFL_IMPEGNACCERT_UTENTULTIAG1 = 4;
  private static int PFL_IMPEGNACCERT_DATAULTIMAG1 = 5;
  private static int PFL_IMPEGNACCERT_STATO = 6;

  private static int PPQRY_T77 = 0;


  IDPanel PAN_IMPEGNACCERT;
  private static int PFL_LIQUIDORDINA_CODICE = 0;
  private static int PFL_LIQUIDORDINA_DESCRIZIONE = 1;
  private static int PFL_LIQUIDORDINA_UTENTEINSERI = 2;
  private static int PFL_LIQUIDORDINA_DATAINSERIME = 3;
  private static int PFL_LIQUIDORDINA_UTENTULTIAGG = 4;
  private static int PFL_LIQUIDORDINA_DATAULTIMAGG = 5;

  private static int PPQRY_T66 = 0;


  IDPanel PAN_LIQUIDORDINA;
  CIDREObj BUK_IMPEACCEBOOK;
  OBook BKW_IMPEACCEBOOK;
  //
  // Template Pages constants
  private static int BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG = 1;
  private static int BUK_IMPEACCEBOOK_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_IMPEACCEBOOK_SPAN_NUMEROPAGIN1 = 3;
  private static int BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1 = 4;
  private static int BUK_IMPEACCEBOOK_RPTBOX_TITOLO1 = 5;

  //
  // Reports constants
  private static int BUK_IMPEACCEBOOK_RPT_NEWREPORT = 6;
  private static int BUK_IMPEACCEBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_IMPEACCEBOOK_RPTBOX_CODICEHEADE1 = 8;
  private static int BUK_IMPEACCEBOOK_SPAN_CODICE1 = 9;
  private static int BUK_IMPEACCEBOOK_RPTBOX_DESCRIHEADE1 = 10;
  private static int BUK_IMPEACCEBOOK_SPAN_DESCRIZIONE1 = 11;
  private static int BUK_IMPEACCEBOOK_RPTBOX_STATOHEADER = 12;
  private static int BUK_IMPEACCEBOOK_SPAN_C = 13;
  private static int BUK_IMPEACCEBOOK_SEC_TITOLO = 14;
  private static int BUK_IMPEACCEBOOK_RPTBOX_NEWBOX1 = 15;
  private static int BUK_IMPEACCEBOOK_SPAN_VARIADIBILA1 = 16;
  private static int BUK_IMPEACCEBOOK_SEC_DETAIL = 17;
  private static int BUK_IMPEACCEBOOK_RPTBOX_CODICE1 = 18;
  private static int BUK_IMPEACCEBOOK_SPAN_T5COCAIMACBO = 19;
  private static int BUK_IMPEACCEBOOK_RPTBOX_DESCRIZIONE1 = 20;
  private static int BUK_IMPEACCEBOOK_SPAN_T5DECAIMACBO = 21;
  private static int BUK_IMPEACCEBOOK_RPTBOX_STATO = 22;
  private static int BUK_IMPEACCEBOOK_SPAN_T57STATO = 23;
  private static int BUK_IMPEACCEBOOK_SEC_PAGEFOOTER = 24;
  private static int BUK_IMPEACCEBOOK_SEC_REPORTFOOTER = 25;

  CIDREObj BUK_LIQUORDIBOOK;
  OBook BKW_LIQUORDIBOOK;
  //
  // Template Pages constants
  private static int BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG = 1;
  private static int BUK_LIQUORDIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_LIQUORDIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_LIQUORDIBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_LIQUORDIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_LIQUORDIBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_LIQUORDIBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_LIQUORDIBOOK_SPAN_CODICE = 9;
  private static int BUK_LIQUORDIBOOK_RPTBOX_DESCRIHEADER = 10;
  private static int BUK_LIQUORDIBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_LIQUORDIBOOK_SEC_TITOLO = 12;
  private static int BUK_LIQUORDIBOOK_RPTBOX_NEWBOX = 13;
  private static int BUK_LIQUORDIBOOK_SPAN_VARIADIBILAN = 14;
  private static int BUK_LIQUORDIBOOK_SEC_DETAIL = 15;
  private static int BUK_LIQUORDIBOOK_RPTBOX_CODICE = 16;
  private static int BUK_LIQUORDIBOOK_SPAN_T5COCALIORBO = 17;
  private static int BUK_LIQUORDIBOOK_RPTBOX_DESCRIZIONE = 18;
  private static int BUK_LIQUORDIBOOK_SPAN_T5DECALIORBO = 19;
  private static int BUK_LIQUORDIBOOK_SEC_PAGEFOOTER = 20;
  private static int BUK_LIQUORDIBOOK_SEC_REPORTFOOTER = 21;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T77(IMDB);
    Init_PQRY_T66(IMDB);
    Init_PQRY_T57(IMDB);
    Init_PQRY_T58(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T77(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_T77, 7);
    IMDB.set_TblCode(IMDBDef8.PQRY_T77, "PQRY_T77");
    IMDB.set_FldCode(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_STATO, "STATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_T77,IMDBDef8.PQSL_T77_STATO,5,1,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_T77, 0);
  }

  private static void Init_PQRY_T66(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T66, 6);
    IMDB.set_TblCode(IMDBDef9.PQRY_T66, "PQRY_T66");
    IMDB.set_FldCode(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T66,IMDBDef9.PQSL_T66_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T66, 0);
  }

  private static void Init_PQRY_T57(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T57, 3);
    IMDB.set_TblCode(IMDBDef9.PQRY_T57, "PQRY_T57");
    IMDB.set_FldCode(IMDBDef9.PQRY_T57,IMDBDef9.PQSL_T57_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T57,IMDBDef9.PQSL_T57_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T57,IMDBDef9.PQSL_T57_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T57,IMDBDef9.PQSL_T57_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T57,IMDBDef9.PQSL_T57_T57STATO, "T57STATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T57,IMDBDef9.PQSL_T57_T57STATO,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T57, 0);
  }

  private static void Init_PQRY_T58(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T58, 2);
    IMDB.set_TblCode(IMDBDef9.PQRY_T58, "PQRY_T58");
    IMDB.set_FldCode(IMDBDef9.PQRY_T58,IMDBDef9.PQSL_T58_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T58,IMDBDef9.PQSL_T58_CODICE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T58,IMDBDef9.PQSL_T58_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T58,IMDBDef9.PQSL_T58_DESCRIZIONE,5,50,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T58, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Causali(MyWebEntryPoint w, IMDBObj imdb)
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
  public Causali()
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
    FormIdx = MyGlb.FRM_CAUSALI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "010F1D22-402E-40B5-BB1C-BD8E5D67A5E9";
    ResModeW = 3;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 696;
    DesignHeight = 414;
    set_Caption(new IDVariant("Causali"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 696;
    Frames[1].Height = 388;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 388;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "E4D044CE-302B-42FA-B00F-08A36E4D2F9C";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Impegno Accertamento";
    Frames[2].Parent = this;
    PAN_IMPEGNACCERT = new IDPanel(w, this, 2, "PAN_IMPEGNACCERT");
    Frames[2].Content = PAN_IMPEGNACCERT;
    PAN_IMPEGNACCERT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_IMPEGNACCERT.VS = MainFrm.VisualStyleList;
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_IMPEACCEBOOK != null)
      PAN_IMPEGNACCERT.SetBook(BUK_IMPEACCEBOOK);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2C94B05A-615C-40BA-BFDA-A02986CC28A5");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 556, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_IMPEGNACCERT.InitStatus = 2;
    PAN_IMPEGNACCERT_Init();
    PAN_IMPEGNACCERT_InitFields();
    PAN_IMPEGNACCERT_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Impegno Accertamento", "Causali degli impegni");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Liquidazione Ordinativo";
    Frames[3].Parent = this;
    PAN_LIQUIDORDINA = new IDPanel(w, this, 3, "PAN_LIQUIDORDINA");
    Frames[3].Content = PAN_LIQUIDORDINA;
    PAN_LIQUIDORDINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDORDINA.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 696-MyGlb.PAN_OFFS_X, 388-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_LIQUORDIBOOK != null)
      PAN_LIQUIDORDINA.SetBook(BUK_LIQUORDIBOOK);
    PAN_LIQUIDORDINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8CBC7264-F1B2-4AF4-BD96-F92606D6F7EB");
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 488, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_LIQUIDORDINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDORDINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDORDINA.InitStatus = 2;
    PAN_LIQUIDORDINA_Init();
    PAN_LIQUIDORDINA_InitFields();
    PAN_LIQUIDORDINA_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Liquidazione Ordinativo", "Causali liquidazioni/ordinativi");
    BKW_IMPEACCEBOOK = new OBook(this);
    BUK_IMPEACCEBOOK = new CIDREObj(BKW_IMPEACCEBOOK);
    BKW_IMPEACCEBOOK.iGuid = "C6139B27-560B-440F-A76D-E7012802112E";
    BKW_IMPEACCEBOOK.Code = "BUK_IMPEACCEBOOK";
    BKW_IMPEACCEBOOK.BookObj = BUK_IMPEACCEBOOK;
    BKW_IMPEACCEBOOK.InitDefMasks();
    BUK_IMPEACCEBOOK.InitBook(1, 1245185, "Impegno Accertamento Book", IMDB, MainFrm.VisualStyleList);
    BUK_IMPEACCEBOOK.InitHTML();
    BUK_IMPEACCEBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_IMPEACCEBOOK.Book.SetMainFrm(MainFrm);
    BUK_IMPEACCEBOOK.SetRTCGuid(0, "C6139B27-560B-440F-A76D-E7012802112E");
    BUK_IMPEACCEBOOK.SetObjCode(0, "IMPEACCEBOOK");
    if (PAN_IMPEGNACCERT != null)
      PAN_IMPEGNACCERT.SetBook(BUK_IMPEACCEBOOK);
    BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG_Init();
    BUK_IMPEACCEBOOK_RPT_NEWREPORT_Init();
    BUK_IMPEACCEBOOK_InitLinks();
    BKW_LIQUORDIBOOK = new OBook(this);
    BUK_LIQUORDIBOOK = new CIDREObj(BKW_LIQUORDIBOOK);
    BKW_LIQUORDIBOOK.iGuid = "7DD42646-B56C-4A1C-8FA8-636851D103ED";
    BKW_LIQUORDIBOOK.Code = "BUK_LIQUORDIBOOK";
    BKW_LIQUORDIBOOK.BookObj = BUK_LIQUORDIBOOK;
    BKW_LIQUORDIBOOK.InitDefMasks();
    BUK_LIQUORDIBOOK.InitBook(1, 1245185, "Liquidazione Ordinativo Book", IMDB, MainFrm.VisualStyleList);
    BUK_LIQUORDIBOOK.InitHTML();
    BUK_LIQUORDIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_LIQUORDIBOOK.Book.SetMainFrm(MainFrm);
    BUK_LIQUORDIBOOK.SetRTCGuid(0, "7DD42646-B56C-4A1C-8FA8-636851D103ED");
    BUK_LIQUORDIBOOK.SetObjCode(0, "LIQUORDIBOOK");
    if (PAN_LIQUIDORDINA != null)
      PAN_LIQUIDORDINA.SetBook(BUK_LIQUORDIBOOK);
    BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG_Init();
    BUK_LIQUORDIBOOK_RPT_NEWREPORT_Init();
    BUK_LIQUORDIBOOK_InitLinks();
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
      PAN_IMPEGNACCERT.UpdatePanel(MainFrm);
      PAN_LIQUIDORDINA.UpdatePanel(MainFrm);
      // BUK_IMPEACCEBOOK.UpdateBook();
      // BUK_LIQUORDIBOOK.UpdateBook();
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
    if (Code.equals("BUK_IMPEACCEBOOK")) return BUK_IMPEACCEBOOK;
    if (Code.equals("BUK_LIQUORDIBOOK")) return BUK_LIQUORDIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof Causali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Causali.class.getName() : (Glb.ClassWithPackage(Causali.class) ? Causali.class.getName().substring(Causali.class.getPackage().getName().length() + 1) : Causali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Impegno Accertamento On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_IMPEGNACCERT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegno Accertamento On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T57PD(IMDB.Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("Causali", "ImpegnoAccertamentoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno Accertamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_IMPEGNACCERT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_IMPEGNACCERT);
      // 
      // Impegno Accertamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_IMPEGNACCERT.IsNewRow()))
      {
        PAN_IMPEGNACCERT.SetFlags (Glb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_IMPEGNACCERT.SetFlags (Glb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_IMPEGNACCERT.set_ToolTip(Glb.OBJ_FIELD,PFL_IMPEGNACCERT_DESCRIZIONE1,IMDB.Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Causali", "ImpegnoAccertamentoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno Accertamento On Database Error Event
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
  private void PAN_IMPEGNACCERT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_IMPEGNACCERT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Impegno Accertamento On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Causali", "ImpegnoAccertamentoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Impegno Accertamento On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_IMPEGNACCERT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Impegno Accertamento On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_T77, IMDBDef8.PQSL_T77_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Causali", "ImpegnoAccertamentoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Ordinativo On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDORDINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQUIDORDINA);
      // 
      // Liquidazione Ordinativo On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_LIQUIDORDINA.IsNewRow()))
      {
        PAN_LIQUIDORDINA.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_LIQUIDORDINA.SetFlags (Glb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_LIQUIDORDINA.set_ToolTip(Glb.OBJ_FIELD,PFL_LIQUIDORDINA_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Causali", "LiquidazioneOrdinativoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Ordinativo On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_LIQUIDORDINA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Ordinativo On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T58PD(IMDB.Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_CODICE, 0));
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
      MainFrm.ErrObj.ProcError ("Causali", "LiquidazioneOrdinativoOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Ordinativo On Database Error Event
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
  private void PAN_LIQUIDORDINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_LIQUIDORDINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Liquidazione Ordinativo On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore(ErrorMessage)); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Causali", "LiquidazioneOrdinativoOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazione Ordinativo On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQUIDORDINA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazione Ordinativo On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T66, IMDBDef9.PQSL_T66_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Causali", "LiquidazioneOrdinativoOnUpdatingRowEvent", _e);
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CAPTION1 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Impegno/Accertamento", IDVariant.STRING));
      v_CAPTION1 = (new IDVariant("Liquidazione/Ordinativo", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      Frames[PAN_IMPEGNACCERT.FrIndex].set_Caption(new IDVariant(v_CAPTION).stringValue());
      Frames[PAN_LIQUIDORDINA.FrIndex].set_Caption(new IDVariant(v_CAPTION1).stringValue());
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      Frames[PAN_IMPEGNACCERT.FrIndex].set_Caption(new IDVariant(v_CAPTION1).stringValue());
      TAB_TAB.SetItemCaption((new IDVariant(PAN_IMPEGNACCERT.FrIndex)).intValue(), v_CAPTION.stringValue()); 
      TAB_TAB.SetItemCaption((new IDVariant(PAN_LIQUIDORDINA.FrIndex)).intValue(), v_CAPTION1.stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Causali", "LoadEvent", _e);
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_IMPEGNACCERT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_IMPEGNACCERT, Cancel);
    // Stub
  }

  private void PAN_IMPEGNACCERT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_IMPEGNACCERT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_IMPEGNACCERT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_IMPEGNACCERT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_IMPEGNACCERT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDORDINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDORDINA, Cancel);
    // Stub
  }

  private void PAN_LIQUIDORDINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_LIQUIDORDINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQUIDORDINA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDORDINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDORDINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_IMPEACCEBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_IMPEACCEBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_IMPEACCEBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_IMPEACCEBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_IMPEACCEBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_IMPEACCEBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_IMPEACCEBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_IMPEACCEBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_IMPEACCEBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG)
    {
      BUK_IMPEACCEBOOK.set_SpanValue(BUK_IMPEACCEBOOK_SPAN_NUMEROPAGIN1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_IMPEACCEBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_IMPEACCEBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_IMPEACCEBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_IMPEACCEBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_IMPEACCEBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_IMPEACCEBOOK_OnPreview()
  {
    PreviewBook = BKW_IMPEACCEBOOK;
    SetRD();
  }

  private void BUK_LIQUORDIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_LIQUORDIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_LIQUORDIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_LIQUORDIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_LIQUORDIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_LIQUORDIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_LIQUORDIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_LIQUORDIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_LIQUORDIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG)
    {
      BUK_LIQUORDIBOOK.set_SpanValue(BUK_LIQUORDIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIQUORDIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_LIQUORDIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_LIQUORDIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_LIQUORDIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_LIQUORDIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_LIQUORDIBOOK_OnPreview()
  {
    PreviewBook = BKW_LIQUORDIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_IMPEGNACCERT_Init()
  {

    PAN_IMPEGNACCERT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_IMPEGNACCERT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_IMPEGNACCERT.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, "6AFB654C-F99C-49E6-ADF5-1F8D913F6865");
    PAN_IMPEGNACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, "Codice");
    PAN_IMPEGNACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, "");
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, "ABD40656-5284-4A04-9377-840A31FC2A10");
    PAN_IMPEGNACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, "Descrizione");
    PAN_IMPEGNACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, "");
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, "4BC118B4-DA03-4518-8C54-A18BF8641FDD");
    PAN_IMPEGNACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_IMPEGNACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, "");
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, "5B8EAFCA-59A5-4B88-A2FA-E2FCB79E5FB8");
    PAN_IMPEGNACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_IMPEGNACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, "");
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, "FB42FD43-3FC8-47F6-99CF-701E20A9ED7E");
    PAN_IMPEGNACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_IMPEGNACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, "");
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, "2764F443-667A-4E8C-B9B8-79CB1A3FFAE2");
    PAN_IMPEGNACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_IMPEGNACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, "");
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_IMPEGNACCERT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, "F31D687F-5418-4471-AB0D-E3F77F4E4455");
    PAN_IMPEGNACCERT.set_Header(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, "Stato");
    PAN_IMPEGNACCERT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, "");
    PAN_IMPEGNACCERT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.VIS_NORMALFIELDS);
    PAN_IMPEGNACCERT.SetFlags(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_IMPEGNACCERT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_LIST, "Codice");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_FORM, 88);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_CODICE1, MyGlb.PANEL_FORM, "Codice");
    PAN_IMPEGNACCERT.SetFieldPage(PFL_IMPEGNACCERT_CODICE1, -1, -1);
    PAN_IMPEGNACCERT.SetFieldPanel(PFL_IMPEGNACCERT_CODICE1, PPQRY_T77, "A.CODICE", "CODICE", 1, 4, 0, -13997);
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_LIST, 60, 36, 420, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_FORM, 88);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_IMPEGNACCERT.SetFieldPage(PFL_IMPEGNACCERT_DESCRIZIONE1, -1, -1);
    PAN_IMPEGNACCERT.SetFieldPanel(PFL_IMPEGNACCERT_DESCRIZIONE1, PPQRY_T77, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_LIST, 420, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_FORM, 120);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_IMPEGNACCERT.SetFieldPage(PFL_IMPEGNACCERT_UTENTEINSER1, -1, -1);
    PAN_IMPEGNACCERT.SetFieldPanel(PFL_IMPEGNACCERT_UTENTEINSER1, PPQRY_T77, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_LIST, 540, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_FORM, 108);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAINSERIM1, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_IMPEGNACCERT.SetFieldPage(PFL_IMPEGNACCERT_DATAINSERIM1, -1, -1);
    PAN_IMPEGNACCERT.SetFieldPanel(PFL_IMPEGNACCERT_DATAINSERIM1, PPQRY_T77, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_LIST, 648, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_FORM, 112);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_IMPEGNACCERT.SetFieldPage(PFL_IMPEGNACCERT_UTENTULTIAG1, -1, -1);
    PAN_IMPEGNACCERT.SetFieldPanel(PFL_IMPEGNACCERT_UTENTULTIAG1, PPQRY_T77, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_LIST, 760, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_FORM, 100);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_DATAULTIMAG1, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_IMPEGNACCERT.SetFieldPage(PFL_IMPEGNACCERT_DATAULTIMAG1, -1, -1);
    PAN_IMPEGNACCERT.SetFieldPanel(PFL_IMPEGNACCERT_DATAULTIMAG1, PPQRY_T77, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_LIST, 480, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_LIST, 48);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_LIST, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_LIST, "Stato");
    PAN_IMPEGNACCERT.SetRect(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_FORM, 4, 52, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_IMPEGNACCERT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_FORM, 48);
    PAN_IMPEGNACCERT.SetNumRow(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_FORM, 1);
    PAN_IMPEGNACCERT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_IMPEGNACCERT_STATO, MyGlb.PANEL_FORM, "Stato");
    PAN_IMPEGNACCERT.SetFieldPage(PFL_IMPEGNACCERT_STATO, -1, -1);
    PAN_IMPEGNACCERT.SetFieldPanel(PFL_IMPEGNACCERT_STATO, PPQRY_T77, "A.STATO", "STATO", 5, 1, 0, -13997);
    PAN_IMPEGNACCERT.SetValueListItem(PFL_IMPEGNACCERT_STATO, (new IDVariant("U")), "In Uso", "", "", -1);
    PAN_IMPEGNACCERT.SetValueListItem(PFL_IMPEGNACCERT_STATO, (new IDVariant("D")), "In Disuso", "", "", -1);
  }

  private void PAN_IMPEGNACCERT_InitQueries()
  {
    StringBuffer SQL;

    PAN_IMPEGNACCERT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_IMPEGNACCERT.SetIMDB(IMDB, "PQRY_T77", true);
    PAN_IMPEGNACCERT.set_SetString(MyGlb.MASTER_ROWNAME, "T57");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.STATO as STATO ");
    PAN_IMPEGNACCERT.SetQuery(PPQRY_T77, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T57 A ");
    PAN_IMPEGNACCERT.SetQuery(PPQRY_T77, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNACCERT.SetQuery(PPQRY_T77, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNACCERT.SetQuery(PPQRY_T77, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_IMPEGNACCERT.SetQuery(PPQRY_T77, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_IMPEGNACCERT.SetQuery(PPQRY_T77, 5, SQL, -1, "");
    PAN_IMPEGNACCERT.SetQueryDB(PPQRY_T77, MainFrm.Cf4armDBObject.DB, 4);
    PAN_IMPEGNACCERT.SetMasterTable(0, "T57");
    PAN_IMPEGNACCERT.AddToSortList(PFL_IMPEGNACCERT_CODICE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_IMPEGNACCERT.Status() == 2)
    {
      int oldListQBE = PAN_IMPEGNACCERT.iUseListQBE;
      PAN_IMPEGNACCERT.iUseListQBE = 0;
      PAN_IMPEGNACCERT.PanelCommand(Glb.PCM_SEARCH);
      PAN_IMPEGNACCERT.PanelCommand(Glb.PCM_FIND);
      PAN_IMPEGNACCERT.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LIQUIDORDINA_Init()
  {

    PAN_LIQUIDORDINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDORDINA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDORDINA.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_LIQUIDORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, "F44717FD-7103-4C0D-AEAD-A1F412376DF4");
    PAN_LIQUIDORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, "Codice");
    PAN_LIQUIDORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, "");
    PAN_LIQUIDORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_LIQUIDORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, "DEDC20B7-B0E1-42D8-8D1C-F2EA631EDF45");
    PAN_LIQUIDORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, "Descrizione");
    PAN_LIQUIDORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, "");
    PAN_LIQUIDORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, "22E2C769-E08E-4D17-BA06-BBDEBFB3ACE7");
    PAN_LIQUIDORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_LIQUIDORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, "");
    PAN_LIQUIDORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, "0728C3F2-D14C-4768-B4A7-FC62915C483F");
    PAN_LIQUIDORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, "DATA INSERIMENTO");
    PAN_LIQUIDORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, "");
    PAN_LIQUIDORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, "1B4EE3E6-574A-47A4-BEFA-20CBDE1DDE89");
    PAN_LIQUIDORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_LIQUIDORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, "");
    PAN_LIQUIDORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, "E73498A2-F11A-4465-BA51-07658DA575EA");
    PAN_LIQUIDORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_LIQUIDORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, "");
    PAN_LIQUIDORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_LIQUIDORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_LIQUIDORDINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_LIST, 48);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_LIQUIDORDINA.SetFieldPage(PFL_LIQUIDORDINA_CODICE, -1, -1);
    PAN_LIQUIDORDINA.SetFieldPanel(PFL_LIQUIDORDINA_CODICE, PPQRY_T66, "A.CODICE", "CODICE", 1, 4, 0, -13997);
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 60, 36, 428, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_LIQUIDORDINA.SetFieldPage(PFL_LIQUIDORDINA_DESCRIZIONE, -1, -1);
    PAN_LIQUIDORDINA.SetFieldPanel(PFL_LIQUIDORDINA_DESCRIZIONE, PPQRY_T66, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_LIST, 420, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 52, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_LIQUIDORDINA.SetFieldPage(PFL_LIQUIDORDINA_UTENTEINSERI, -1, -1);
    PAN_LIQUIDORDINA.SetFieldPanel(PFL_LIQUIDORDINA_UTENTEINSERI, PPQRY_T66, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_LIST, 540, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_FORM, 4, 76, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_LIQUIDORDINA.SetFieldPage(PFL_LIQUIDORDINA_DATAINSERIME, -1, -1);
    PAN_LIQUIDORDINA.SetFieldPanel(PFL_LIQUIDORDINA_DATAINSERIME, PPQRY_T66, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_LIST, 648, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 100, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_LIQUIDORDINA.SetFieldPage(PFL_LIQUIDORDINA_UTENTULTIAGG, -1, -1);
    PAN_LIQUIDORDINA.SetFieldPanel(PFL_LIQUIDORDINA_UTENTULTIAGG, PPQRY_T66, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_LIST, 760, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_LIQUIDORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 124, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_LIQUIDORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDORDINA_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_LIQUIDORDINA.SetFieldPage(PFL_LIQUIDORDINA_DATAULTIMAGG, -1, -1);
    PAN_LIQUIDORDINA.SetFieldPanel(PFL_LIQUIDORDINA_DATAULTIMAGG, PPQRY_T66, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_LIQUIDORDINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDORDINA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDORDINA.SetIMDB(IMDB, "PQRY_T66", true);
    PAN_LIQUIDORDINA.set_SetString(MyGlb.MASTER_ROWNAME, "T58");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_LIQUIDORDINA.SetQuery(PPQRY_T66, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T58 A ");
    PAN_LIQUIDORDINA.SetQuery(PPQRY_T66, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDORDINA.SetQuery(PPQRY_T66, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDORDINA.SetQuery(PPQRY_T66, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDORDINA.SetQuery(PPQRY_T66, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_LIQUIDORDINA.SetQuery(PPQRY_T66, 5, SQL, -1, "");
    PAN_LIQUIDORDINA.SetQueryDB(PPQRY_T66, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDORDINA.SetMasterTable(0, "T58");
    PAN_LIQUIDORDINA.AddToSortList(PFL_LIQUIDORDINA_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDORDINA.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDORDINA.iUseListQBE;
      PAN_LIQUIDORDINA.iUseListQBE = 0;
      PAN_LIQUIDORDINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDORDINA.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDORDINA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG_Init()
  {
    BUK_IMPEACCEBOOK.InitMastro(BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG, "6808AA24-7840-4B8C-97E2-440488883A3F");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG, "IMPACCBOOPAG");
    BUK_IMPEACCEBOOK.InitMastroBox(BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG, BUK_IMPEACCEBOOK_RPTBOX_NUMEROPAGIN1, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_NUMEROPAGIN1, "FD4A2313-D39C-4E6B-B0B2-B4B2EB9EC18A");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_NUMEROPAGIN1, BUK_IMPEACCEBOOK_SPAN_NUMEROPAGIN1, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_NUMEROPAGIN1, "FE08AF36-43CE-4EA3-8FA4-FC03FDD27C5F");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_IMPEACCEBOOK.InitMastroBox(BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG, BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1, 1000, 2900, 19000, 25300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1, "E8D3216A-9FC1-4B3B-BD0B-00F60F8C08E8");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
    BUK_IMPEACCEBOOK.InitMastroBox(BUK_IMPEACCEBOOK_MST_IMPACCBOOPAG, BUK_IMPEACCEBOOK_RPTBOX_TITOLO1, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_TITOLO1, "E316257B-6E23-4E70-9C35-0392451D7151");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_TITOLO1, "TITOLO1");
  }

  private void BUK_IMPEACCEBOOK_RPT_NEWREPORT_InitQuery() { BUK_IMPEACCEBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_IMPEACCEBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.STATO as T57STATO ");
      SQL.append("from ");
      SQL.append("  T57 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_IMPEACCEBOOK.SetReportQuery(BUK_IMPEACCEBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "741F3968-11E5-451C-BA48-8305F1DFEE3F");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_IMPEACCEBOOK_RPT_NEWREPORT_Init()
  {
    BUK_IMPEACCEBOOK.InitReport(BUK_IMPEACCEBOOK_RPT_NEWREPORT, 196609);
    BUK_IMPEACCEBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPT_NEWREPORT, "269E6A1A-6945-41AE-8BC4-9286B233DA98");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_IMPEACCEBOOK.InitSection(BUK_IMPEACCEBOOK_RPT_NEWREPORT, BUK_IMPEACCEBOOK_SEC_PAGEHEADER, 900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEACCEBOOK.SetSectionRendersInto(BUK_IMPEACCEBOOK_SEC_PAGEHEADER, BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SEC_PAGEHEADER, "70ACCE7C-9799-48F9-BA4A-8061D43CAE80");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_IMPEACCEBOOK.InitReportBox(BUK_IMPEACCEBOOK_SEC_PAGEHEADER, BUK_IMPEACCEBOOK_RPTBOX_CODICEHEADE1, 100, 0, 1387, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_CODICEHEADE1, "DD2E9F2F-B4F2-45E8-88BA-693B882FA642");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_CODICEHEADE1, "CODICEHEADE1");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_CODICEHEADE1, BUK_IMPEACCEBOOK_SPAN_CODICE1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_CODICE1, "9C12A981-1C23-470A-B62C-A6F40C24425A");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_CODICE1, "CODICE1");
    BUK_IMPEACCEBOOK.InitReportBox(BUK_IMPEACCEBOOK_SEC_PAGEHEADER, BUK_IMPEACCEBOOK_RPTBOX_DESCRIHEADE1, 2000, 0, 11100, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_DESCRIHEADE1, "36D4D902-1D58-41F8-A78E-2BAC6F62D8D7");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_DESCRIHEADE1, BUK_IMPEACCEBOOK_SPAN_DESCRIZIONE1, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_DESCRIZIONE1, "0B88F78F-DA53-47D7-9367-3C7CDBCF153D");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_IMPEACCEBOOK.InitReportBox(BUK_IMPEACCEBOOK_SEC_PAGEHEADER, BUK_IMPEACCEBOOK_RPTBOX_STATOHEADER, 13200, 0, 900, 700, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_STATOHEADER, "3DC76954-4EF0-430C-8F8F-626E217171C8");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_STATOHEADER, "STATOHEADER");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_STATOHEADER, BUK_IMPEACCEBOOK_SPAN_C, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Stato", 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_C, "0DA15F8A-6AD6-4B06-8FE8-6B49C3EB9915");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_C, "C");
    BUK_IMPEACCEBOOK.InitSection(BUK_IMPEACCEBOOK_RPT_NEWREPORT, BUK_IMPEACCEBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEACCEBOOK.SetSectionRendersInto(BUK_IMPEACCEBOOK_SEC_TITOLO, BUK_IMPEACCEBOOK_RPTBOX_TITOLO1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SEC_TITOLO, "F9202DA7-4DFA-440F-9AC7-32878BDA1DD1");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SEC_TITOLO, "TITOLO");
    BUK_IMPEACCEBOOK.InitReportBox(BUK_IMPEACCEBOOK_SEC_TITOLO, BUK_IMPEACCEBOOK_RPTBOX_NEWBOX1, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_NEWBOX1, "073A3078-08B7-40F3-A558-238364047796");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_NEWBOX1, BUK_IMPEACCEBOOK_SPAN_VARIADIBILA1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Causali di Impegno o Accertamento", 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_VARIADIBILA1, "4FF812B2-5C02-4457-8B95-3AC3527107A9");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_VARIADIBILA1, "VARIADIBILA1");
    BUK_IMPEACCEBOOK.InitSection(BUK_IMPEACCEBOOK_RPT_NEWREPORT, BUK_IMPEACCEBOOK_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEACCEBOOK.SetSectionRendersInto(BUK_IMPEACCEBOOK_SEC_DETAIL, BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SEC_DETAIL, "D88F7C58-8E5C-4A7E-8929-F6DF0D64E0DD");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SEC_DETAIL, "DETAIL");
    BUK_IMPEACCEBOOK.InitReportBox(BUK_IMPEACCEBOOK_SEC_DETAIL, BUK_IMPEACCEBOOK_RPTBOX_CODICE1, 0, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_CODICE1, "3865F648-339E-439E-B1E1-420704D256C0");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_CODICE1, "CODICE1");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_CODICE1, BUK_IMPEACCEBOOK_SPAN_T5COCAIMACBO, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_T5COCAIMACBO, "6E913E44-17E4-4127-9343-E6BA5F1F60F5");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_T5COCAIMACBO, "T5COCAIMACBO");
    BUK_IMPEACCEBOOK.InitReportBox(BUK_IMPEACCEBOOK_SEC_DETAIL, BUK_IMPEACCEBOOK_RPTBOX_DESCRIZIONE1, 2000, 0, 11100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_DESCRIZIONE1, "BBA663FD-83C7-4205-8E73-C7288A901A0F");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_DESCRIZIONE1, BUK_IMPEACCEBOOK_SPAN_T5DECAIMACBO, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_T5DECAIMACBO, "753500D1-76DE-4FB5-B36F-CB69CEFB5480");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_T5DECAIMACBO, "T5DECAIMACBO");
    BUK_IMPEACCEBOOK.InitReportBox(BUK_IMPEACCEBOOK_SEC_DETAIL, BUK_IMPEACCEBOOK_RPTBOX_STATO, 13200, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_RPTBOX_STATO, "CA7E688E-455D-4DEC-8078-9B0BFFF24BA2");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_RPTBOX_STATO, "STATO");
    BUK_IMPEACCEBOOK.InitBoxSpan(BUK_IMPEACCEBOOK_RPTBOX_STATO, BUK_IMPEACCEBOOK_SPAN_T57STATO, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "", "::T57STATO", 1);
    BUK_IMPEACCEBOOK.SetSpanValueListItem(BUK_IMPEACCEBOOK_SPAN_T57STATO, "In Uso", "Scrivi il valore e spiega cosa significa", (new IDVariant("U")), null, "", -1);
    BUK_IMPEACCEBOOK.SetSpanValueListItem(BUK_IMPEACCEBOOK_SPAN_T57STATO, "In Disuso", "", (new IDVariant("D")), null, "", -1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SPAN_T57STATO, "7E9699A9-B136-48A5-8DCE-AB772BF63860");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SPAN_T57STATO, "T57STATO");
    BUK_IMPEACCEBOOK.InitSection(BUK_IMPEACCEBOOK_RPT_NEWREPORT, BUK_IMPEACCEBOOK_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEACCEBOOK.SetSectionRendersInto(BUK_IMPEACCEBOOK_SEC_PAGEFOOTER, BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SEC_PAGEFOOTER, "439F00F5-E686-49B7-B239-B6D286BF263C");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_IMPEACCEBOOK.InitSection(BUK_IMPEACCEBOOK_RPT_NEWREPORT, BUK_IMPEACCEBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_IMPEACCEBOOK.SetSectionRendersInto(BUK_IMPEACCEBOOK_SEC_REPORTFOOTER, BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1);
    BUK_IMPEACCEBOOK.SetRTCGuid(BUK_IMPEACCEBOOK_SEC_REPORTFOOTER, "CBDEE7C8-C688-4E7C-9381-68B12614B45C");
    BUK_IMPEACCEBOOK.SetObjCode(BUK_IMPEACCEBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_IMPEACCEBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_IMPEACCEBOOK_InitLinks()
  {
    BUK_IMPEACCEBOOK.SetBoxNextBox(BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1, BUK_IMPEACCEBOOK_RPTBOX_PAGEBODY1);
  }

  private void BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG_Init()
  {
    BUK_LIQUORDIBOOK.InitMastro(BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG, 3, 21000, 29700, 1, 1, 1);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG, "843C5A37-4912-4B11-9FCB-E015AA731B11");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG, "LIQORDBOOPAG");
    BUK_LIQUORDIBOOK.InitMastroBox(BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG, BUK_LIQUORDIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_NUMEROPAGINA, "B31F51D4-515E-4F57-BD91-FB402B3E3F6B");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIQUORDIBOOK.InitBoxSpan(BUK_LIQUORDIBOOK_RPTBOX_NUMEROPAGINA, BUK_LIQUORDIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SPAN_NUMEROPAGINA, "52C0F3D3-AB75-45C4-8B6F-568D98331FDE");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_LIQUORDIBOOK.InitMastroBox(BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG, BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY, 1000, 2900, 19000, 25300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY, "3ADE0786-5936-4196-B854-AE95FB859DC7");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_LIQUORDIBOOK.InitMastroBox(BUK_LIQUORDIBOOK_MST_LIQORDBOOPAG, BUK_LIQUORDIBOOK_RPTBOX_TITOLO, 1000, 900, 19000, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_TITOLO, "ED50D086-6E76-4CAD-BE43-ACAAA0F6B2ED");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_LIQUORDIBOOK_RPT_NEWREPORT_InitQuery() { BUK_LIQUORDIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_LIQUORDIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
      SQL.append("from ");
      SQL.append("  T58 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_LIQUORDIBOOK.SetReportQuery(BUK_LIQUORDIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "FAF1868B-1301-43ED-BEDC-8EBB45D1FC85");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_LIQUORDIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_LIQUORDIBOOK.InitReport(BUK_LIQUORDIBOOK_RPT_NEWREPORT, 196609);
    BUK_LIQUORDIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPT_NEWREPORT, "DEDE4D93-29E3-4353-BA74-87C76FC7A771");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_LIQUORDIBOOK.InitSection(BUK_LIQUORDIBOOK_RPT_NEWREPORT, BUK_LIQUORDIBOOK_SEC_PAGEHEADER, 800, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUORDIBOOK.SetSectionRendersInto(BUK_LIQUORDIBOOK_SEC_PAGEHEADER, BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SEC_PAGEHEADER, "C5D3DDCA-A09F-4EAB-915F-25F4800C0CFD");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_LIQUORDIBOOK.InitReportBox(BUK_LIQUORDIBOOK_SEC_PAGEHEADER, BUK_LIQUORDIBOOK_RPTBOX_CODICEHEADER, 0, 0, 1500, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_CODICEHEADER, "0AC9BE67-BBA6-4538-90BE-71E300AD1324");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_LIQUORDIBOOK.InitBoxSpan(BUK_LIQUORDIBOOK_RPTBOX_CODICEHEADER, BUK_LIQUORDIBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SPAN_CODICE, "76ABEDAA-8A10-4F78-B035-634FFB0CCE12");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SPAN_CODICE, "CODICE");
    BUK_LIQUORDIBOOK.InitReportBox(BUK_LIQUORDIBOOK_SEC_PAGEHEADER, BUK_LIQUORDIBOOK_RPTBOX_DESCRIHEADER, 1800, 0, 11200, 800, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_DESCRIHEADER, "CC6D2C4B-036F-41E2-9529-1439FF9F253F");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_LIQUORDIBOOK.InitBoxSpan(BUK_LIQUORDIBOOK_RPTBOX_DESCRIHEADER, BUK_LIQUORDIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SPAN_DESCRIZIONE, "3A466B84-19BB-4729-82A1-3D362AA02F97");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIQUORDIBOOK.InitSection(BUK_LIQUORDIBOOK_RPT_NEWREPORT, BUK_LIQUORDIBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUORDIBOOK.SetSectionRendersInto(BUK_LIQUORDIBOOK_SEC_TITOLO, BUK_LIQUORDIBOOK_RPTBOX_TITOLO);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SEC_TITOLO, "09CE404D-EF6B-4E49-9D8A-A8236C8E74EF");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SEC_TITOLO, "TITOLO");
    BUK_LIQUORDIBOOK.InitReportBox(BUK_LIQUORDIBOOK_SEC_TITOLO, BUK_LIQUORDIBOOK_RPTBOX_NEWBOX, 300, 200, 18500, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_NEWBOX, "D40C09FC-4ADD-4559-8405-258C39A240ED");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_LIQUORDIBOOK.InitBoxSpan(BUK_LIQUORDIBOOK_RPTBOX_NEWBOX, BUK_LIQUORDIBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Causali di Liquidazione", 1);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SPAN_VARIADIBILAN, "188149E7-E5EC-4A45-865B-FFACD2547EEB");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_LIQUORDIBOOK.InitSection(BUK_LIQUORDIBOOK_RPT_NEWREPORT, BUK_LIQUORDIBOOK_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUORDIBOOK.SetSectionRendersInto(BUK_LIQUORDIBOOK_SEC_DETAIL, BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SEC_DETAIL, "F94CB4B0-63CA-4BD5-A8F2-B4985A3E7512");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SEC_DETAIL, "DETAIL");
    BUK_LIQUORDIBOOK.InitReportBox(BUK_LIQUORDIBOOK_SEC_DETAIL, BUK_LIQUORDIBOOK_RPTBOX_CODICE, 0, 0, 1500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_CODICE, "B0511DBA-885D-4DAD-B561-CE7AEA2E2B53");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_CODICE, "CODICE");
    BUK_LIQUORDIBOOK.InitBoxSpan(BUK_LIQUORDIBOOK_RPTBOX_CODICE, BUK_LIQUORDIBOOK_SPAN_T5COCALIORBO, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SPAN_T5COCALIORBO, "2F93C8EA-821C-476D-B38B-E60F7BA98C58");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SPAN_T5COCALIORBO, "T5COCALIORBO");
    BUK_LIQUORDIBOOK.InitReportBox(BUK_LIQUORDIBOOK_SEC_DETAIL, BUK_LIQUORDIBOOK_RPTBOX_DESCRIZIONE, 1800, 0, 11200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_RPTBOX_DESCRIZIONE, "E1D8E003-1A78-4525-9EE4-A1601029D412");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_LIQUORDIBOOK.InitBoxSpan(BUK_LIQUORDIBOOK_RPTBOX_DESCRIZIONE, BUK_LIQUORDIBOOK_SPAN_T5DECALIORBO, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SPAN_T5DECALIORBO, "933EDD5B-3B2B-4D42-A9BC-87FDE0B40EA9");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SPAN_T5DECALIORBO, "T5DECALIORBO");
    BUK_LIQUORDIBOOK.InitSection(BUK_LIQUORDIBOOK_RPT_NEWREPORT, BUK_LIQUORDIBOOK_SEC_PAGEFOOTER, 0, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUORDIBOOK.SetSectionRendersInto(BUK_LIQUORDIBOOK_SEC_PAGEFOOTER, BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SEC_PAGEFOOTER, "9BF4C4BD-E7C5-4763-97AA-F189B5DC8B88");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_LIQUORDIBOOK.InitSection(BUK_LIQUORDIBOOK_RPT_NEWREPORT, BUK_LIQUORDIBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_LIQUORDIBOOK.SetSectionRendersInto(BUK_LIQUORDIBOOK_SEC_REPORTFOOTER, BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY);
    BUK_LIQUORDIBOOK.SetRTCGuid(BUK_LIQUORDIBOOK_SEC_REPORTFOOTER, "AB46197D-3407-49F6-8829-7A99E23BD8EE");
    BUK_LIQUORDIBOOK.SetObjCode(BUK_LIQUORDIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_LIQUORDIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_LIQUORDIBOOK_InitLinks()
  {
    BUK_LIQUORDIBOOK.SetBoxNextBox(BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY, BUK_LIQUORDIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_IMPEGNACCERT) PAN_IMPEGNACCERT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQUIDORDINA) PAN_LIQUIDORDINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGNACCERT) PAN_IMPEGNACCERT_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQUIDORDINA) PAN_LIQUIDORDINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_IMPEGNACCERT) PAN_IMPEGNACCERT_DynamicProperties();
    if (SrcObj == PAN_LIQUIDORDINA) PAN_LIQUIDORDINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_IMPEGNACCERT) PAN_IMPEGNACCERT_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LIQUIDORDINA) PAN_LIQUIDORDINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_IMPEGNACCERT) PAN_IMPEGNACCERT_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_LIQUIDORDINA) PAN_LIQUIDORDINA_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_IMPEGNACCERT) PAN_IMPEGNACCERT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_LIQUIDORDINA) PAN_LIQUIDORDINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_TAB) TAB_TAB_Click(PreviousPage, Cancel);
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
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_OnFormattingSection(SectionID);
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_OnFormattingPage(PageID);
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_OnConnecting(DBConn);
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_Activated(ObjID, BoxName);
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_IMPEACCEBOOK) BUK_IMPEACCEBOOK_OnPreview();
    if (SrcObj == BKW_LIQUORDIBOOK) BUK_LIQUORDIBOOK_OnPreview();
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
