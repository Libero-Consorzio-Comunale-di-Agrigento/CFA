// **********************************************
// Programmi Progetti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ProgrammiProgetti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_PROGRAMMI_PROGRAMMA1 = 0;
  private static int PFL_PROGRAMMI_DESCRIZIONE1 = 1;
  private static int PFL_PROGRAMMI_UTENTEINSER1 = 2;
  private static int PFL_PROGRAMMI_DATAINSERIM1 = 3;
  private static int PFL_PROGRAMMI_UTENTULTIAG1 = 4;
  private static int PFL_PROGRAMMI_DATAULTIMAG1 = 5;
  private static int PFL_PROGRAMMI_DESCRIMISSIO = 6;
  private static int PFL_PROGRAMMI_DESCRIPROGR1 = 7;
  private static int PFL_PROGRAMMI_CODMISSIONE = 8;
  private static int PFL_PROGRAMMI_CODPROGRAMMA = 9;
  private static int PFL_PROGRAMMI_IDMISSIONE = 10;
  private static int PFL_PROGRAMMI_IDPROGRAMMA = 11;

  private static int PPQRY_PROGRAMMI1 = 0;

  private static int PPQRY_MISSIONI = 1;
  private static int PPQRY_PROGRAMMI = 2;


  IDPanel PAN_PROGRAMMI;
  private static int PFL_OBIETTOPERAT_PROGETTO = 0;
  private static int PFL_OBIETTOPERAT_PROGRAMMA = 1;
  private static int PFL_OBIETTOPERAT_DESCRIZIONE = 2;
  private static int PFL_OBIETTOPERAT_RESPONSABILE = 3;
  private static int PFL_OBIETTOPERAT_PROGETTOID = 4;
  private static int PFL_OBIETTOPERAT_UTENTEINSERI = 5;
  private static int PFL_OBIETTOPERAT_DATAINSERIME = 6;
  private static int PFL_OBIETTOPERAT_UTENTULTIAGG = 7;
  private static int PFL_OBIETTOPERAT_DATAULTIMAGG = 8;
  private static int PFL_OBIETTOPERAT_DESCRIPROGRA = 9;

  private static int PPQRY_PROGETTI = 0;


  IDPanel PAN_OBIETTOPERAT;
  CIDREObj BUK_PROGRAMMBOOK;
  OBook BKW_PROGRAMMBOOK;
  //
  // Template Pages constants
  private static int BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE = 1;
  private static int BUK_PROGRAMMBOOK_RPTBOX_PAGEHEADER = 2;
  private static int BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY = 3;
  private static int BUK_PROGRAMMBOOK_RPTBOX_NUMEROPAGINA = 4;
  private static int BUK_PROGRAMMBOOK_SPAN_NUMEROPAGINA = 5;

  //
  // Reports constants
  private static int BUK_PROGRAMMBOOK_RPT_NEWREPORT = 6;
  private static int BUK_PROGRAMMBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_PROGRAMMBOOK_SEC_PAGEHEADER = 8;
  private static int BUK_PROGRAMMBOOK_RPTBOX_NEWBOX = 9;
  private static int BUK_PROGRAMMBOOK_SPAN_PROGRAEPROGE = 10;
  private static int BUK_PROGRAMMBOOK_RPTBOX_CODICEHEADER = 11;
  private static int BUK_PROGRAMMBOOK_SPAN_PROGRAMMA = 12;
  private static int BUK_PROGRAMMBOOK_RPTBOX_HEADERPROGRA = 13;
  private static int BUK_PROGRAMMBOOK_SPAN_PROGETTO1 = 14;
  private static int BUK_PROGRAMMBOOK_RPTBOX_HEADERDESCRI = 15;
  private static int BUK_PROGRAMMBOOK_SPAN_PROGETTO = 16;
  private static int BUK_PROGRAMMBOOK_RPTBOX_HEADERRESPON = 17;
  private static int BUK_PROGRAMMBOOK_SPAN_DESCRIZIONE = 18;
  private static int BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD = 19;
  private static int BUK_PROGRAMMBOOK_RPTBOX_CODICE = 20;
  private static int BUK_PROGRAMMBOOK_SPAN_PPPPPBPDPPPB = 21;
  private static int BUK_PROGRAMMBOOK_SEC_DETAIL = 22;
  private static int BUK_PROGRAMMBOOK_RPTBOX_CODICEPROGET = 23;
  private static int BUK_PROGRAMMBOOK_SPAN_PRPRCOPRPRP1 = 24;
  private static int BUK_PROGRAMMBOOK_RPTBOX_DESCRIPROGET = 25;
  private static int BUK_PROGRAMMBOOK_SPAN_PRPRDEPRPRPB = 26;
  private static int BUK_PROGRAMMBOOK_RPTBOX_RESPONSABILE = 27;
  private static int BUK_PROGRAMMBOOK_SPAN_PRPRREPRPRPB = 28;
  private static int BUK_PROGRAMMBOOK_SEC_PROGGROUFOOT = 29;
  private static int BUK_PROGRAMMBOOK_SEC_REPORTFOOTER = 30;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PROGRAMMI1(IMDB);
    Init_PQRY_PROGETTI(IMDB);
    Init_PQRY_PROGRAMMI2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PROGRAMMI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PROGRAMMI1, 10);
    IMDB.set_TblCode(IMDBDef8.PQRY_PROGRAMMI1, "PQRY_PROGRAMMI1");
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_COD_MISSIONE, "COD_MISSIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_COD_MISSIONE,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_COD_PROGRAMMA, "COD_PROGRAMMA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_COD_PROGRAMMA,1,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_ID_MISSIONE, "ID_MISSIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_ID_MISSIONE,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_ID_PROGRAMMA, "ID_PROGRAMMA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI1,IMDBDef8.PQSL_PROGRAMMI1_ID_PROGRAMMA,3,10,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PROGRAMMI1, 0);
  }

  private static void Init_PQRY_PROGETTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PROGETTI, 9);
    IMDB.set_TblCode(IMDBDef8.PQRY_PROGETTI, "PQRY_PROGETTI");
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_PROGRAMMA, "PROGRAMMA");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_PROGRAMMA,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_RESPONSABILE, "RESPONSABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_RESPONSABILE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_PROGETTO_ID, "PROGETTO_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_PROGETTO_ID,5,9,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGETTI,IMDBDef8.PQSL_PROGETTI_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PROGETTI, 0);
  }

  private static void Init_PQRY_PROGRAMMI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_PROGRAMMI2, 9);
    IMDB.set_TblCode(IMDBDef8.PQRY_PROGRAMMI2, "PQRY_PROGRAMMI2");
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_CODICE,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_DESCRIZIONE,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_PROGPROGCODI, "PROGPROGCODI");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_PROGPROGCODI,5,4,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_PROGPROGDESC, "PROGPROGDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_PROGPROGDESC,5,100,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_RESPONSABILE, "RESPONSABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_PROGRAMMI2,IMDBDef8.PQSL_PROGRAMMI2_RESPONSABILE,5,40,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_PROGRAMMI2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ProgrammiProgetti(MyWebEntryPoint w, IMDBObj imdb)
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
  public ProgrammiProgetti()
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
    FormIdx = MyGlb.FRM_PROGRAPROGET;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "17D4BD87-A3E8-40B6-BF6B-582CCCE57F44";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 920;
    DesignHeight = 418;
    set_Caption(new IDVariant("Programmi e Obiettivi Operativi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 920;
    Frames[1].Height = 392;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 392;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "1C1F9DB6-AB5B-4EFD-AA12-A184224739FD";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Programmi";
    Frames[2].Parent = this;
    PAN_PROGRAMMI = new IDPanel(w, this, 2, "PAN_PROGRAMMI");
    Frames[2].Content = PAN_PROGRAMMI;
    PAN_PROGRAMMI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PROGRAMMI.VS = MainFrm.VisualStyleList;
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 920-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_PROGRAMMBOOK != null)
      PAN_PROGRAMMI.SetBook(BUK_PROGRAMMBOOK);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B525C4BD-2824-4B39-AF44-E2DDECCEFB0E");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 888, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PROGRAMMI.InitStatus = 2;
    PAN_PROGRAMMI_Init();
    PAN_PROGRAMMI_InitFields();
    PAN_PROGRAMMI_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Programmi", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Obiettivi Operativi";
    Frames[3].Parent = this;
    PAN_OBIETTOPERAT = new IDPanel(w, this, 3, "PAN_OBIETTOPERAT");
    Frames[3].Content = PAN_OBIETTOPERAT;
    PAN_OBIETTOPERAT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_OBIETTOPERAT.VS = MainFrm.VisualStyleList;
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 920-MyGlb.PAN_OFFS_X, 392-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "756EA24D-E0A1-4AC6-A53C-F18662C7339D");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 36, 484, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_OBIETTOPERAT.InitStatus = 2;
    PAN_OBIETTOPERAT_Init();
    PAN_OBIETTOPERAT_InitFields();
    PAN_OBIETTOPERAT_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Obiettivi Operativi", "");
    BKW_PROGRAMMBOOK = new OBook(this);
    BUK_PROGRAMMBOOK = new CIDREObj(BKW_PROGRAMMBOOK);
    BKW_PROGRAMMBOOK.iGuid = "C137A0D6-E5A7-4701-8FFD-0B714BCDF217";
    BKW_PROGRAMMBOOK.Code = "BUK_PROGRAMMBOOK";
    BKW_PROGRAMMBOOK.BookObj = BUK_PROGRAMMBOOK;
    BKW_PROGRAMMBOOK.InitDefMasks();
    BUK_PROGRAMMBOOK.InitBook(1, 1245185, "Programmi Book", IMDB, MainFrm.VisualStyleList);
    BUK_PROGRAMMBOOK.InitHTML();
    BUK_PROGRAMMBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_PROGRAMMBOOK.Book.SetMainFrm(MainFrm);
    BUK_PROGRAMMBOOK.SetRTCGuid(0, "C137A0D6-E5A7-4701-8FFD-0B714BCDF217");
    BUK_PROGRAMMBOOK.SetObjCode(0, "PROGRAMMBOOK");
    if (PAN_PROGRAMMI != null)
      PAN_PROGRAMMI.SetBook(BUK_PROGRAMMBOOK);
    BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE_Init();
    BUK_PROGRAMMBOOK_RPT_NEWREPORT_Init();
    BUK_PROGRAMMBOOK_InitLinks();
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
      PAN_PROGRAMMI.UpdatePanel(MainFrm);
      PAN_OBIETTOPERAT.UpdatePanel(MainFrm);
      // BUK_PROGRAMMBOOK.UpdateBook();
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
    if (Code.equals("BUK_PROGRAMMBOOK")) return BUK_PROGRAMMBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ProgrammiProgetti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ProgrammiProgetti.class.getName() : (Glb.ClassWithPackage(ProgrammiProgetti.class) ? ProgrammiProgetti.class.getName().substring(ProgrammiProgetti.class.getPackage().getName().length() + 1) : ProgrammiProgetti.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Tab Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_TAB_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PROGRAMMA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_PROGRAMMA = (new IDVariant("Programma: ", IDVariant.STRING));
      // 
      // Tab Change Page Event Body
      // Procedure Body
      // 
      PAN_OBIETTOPERAT.set_FieldText(PFL_OBIETTOPERAT_DESCRIPROGRA, IDL.Add(IDL.Add(IDL.Add(v_PROGRAMMA, IMDB.Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_CODICE, 0)), (new IDVariant(" - "))), IMDB.Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_DESCRIZIONE, 0)).stringValue());
      if (new IDVariant(TAB_TAB.SelectedPageIndex()).equals((new IDVariant(PAN_OBIETTOPERAT.FrIndex)), true))
      {
        if (new IDVariant(PAN_PROGRAMMI.Status()).equals((new IDVariant(3)), true) || IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_CODICE, 0)))
        {
          Cancel.set((new IDVariant(-1)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "TabChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Programmi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PROGRAMMI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PROGRAMMI);
      // 
      // Programmi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_PROGRAMMI.IsNewRow()))
      {
        PAN_PROGRAMMI.SetFlags (Glb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PROGRAMMI.SetFlags (Glb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_PROGRAMMI.set_ToolTip(Glb.OBJ_FIELD,PFL_PROGRAMMI_DESCRIZIONE1,IMDB.Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ProgrammiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Programmi Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_PROGRAMMI_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Programmi Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ProgrammiBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Programmi Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_PROGRAMMI_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Programmi Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_DATA_INSERIMENTO, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ProgrammiBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Programmi On Database Error Event
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
  private void PAN_PROGRAMMI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_PROGRAMMI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Programmi On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ProgrammiOnDatabaseErrorEvent", _e);
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
      set_Caption(IDL.Add(this.Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Obiettivi Operativi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_OBIETTOPERAT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_OBIETTOPERAT);
      // 
      // Obiettivi Operativi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_OBIETTOPERAT.IsNewRow()))
      {
        PAN_OBIETTOPERAT.SetFlags (Glb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_OBIETTOPERAT.SetFlags (Glb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_OBIETTOPERAT.set_ToolTip(Glb.OBJ_FIELD,PFL_OBIETTOPERAT_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_DESCRIZIONE, 0).stringValue()); 
      PAN_OBIETTOPERAT.set_ToolTip(Glb.OBJ_FIELD,PFL_OBIETTOPERAT_RESPONSABILE,IMDB.Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_RESPONSABILE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ObiettiviOperativiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Obiettivi Operativi Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_OBIETTOPERAT_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Obiettivi Operativi Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ObiettiviOperativiBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Obiettivi Operativi Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_OBIETTOPERAT_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Obiettivi Operativi Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_PROGETTO_ID, 0, IDL.Add(IDL.Add(IMDB.Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_CODICE, 0), (new IDVariant("/"))), IMDB.Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_CODICE, 0)));
      IMDB.set_Value(IMDBDef8.PQRY_PROGETTI, IMDBDef8.PQSL_PROGETTI_PROGRAMMA, 0, IMDB.Value(IMDBDef8.PQRY_PROGRAMMI1, IMDBDef8.PQSL_PROGRAMMI1_CODICE, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ObiettiviOperativiBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Obiettivi Operativi On Database Error Event
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
  private void PAN_OBIETTOPERAT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_OBIETTOPERAT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Obiettivi Operativi On Database Error Event Body
      // Procedure Body
      // 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ProgrammiProgetti", "ObiettiviOperativiOnDatabaseErrorEvent", _e);
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
    TAB_TAB_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PROGRAMMI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PROGRAMMI, Cancel);
    // Stub
  }

  private void PAN_PROGRAMMI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PROGRAMMI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PROGRAMMI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PROGRAMMI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_OBIETTOPERAT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_OBIETTOPERAT, Cancel);
    // Stub
  }

  private void PAN_OBIETTOPERAT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_OBIETTOPERAT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_OBIETTOPERAT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_OBIETTOPERAT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_PROGRAMMBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_PROGRAMMBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_PROGRAMMBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_PROGRAMMBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD)
    {
      BUK_PROGRAMMBOOK.set_SpanValue(BUK_PROGRAMMBOOK_SPAN_PPPPPBPDPPPB, new IDVariant(IDL.Add(IDL.Add(BUK_PROGRAMMBOOK.GetReportColumn(BUK_PROGRAMMBOOK_RPT_NEWREPORT, "CODICE"), (new IDVariant(" - "))), BUK_PROGRAMMBOOK.GetReportColumn(BUK_PROGRAMMBOOK_RPT_NEWREPORT, "DESCRIZIONE"))));
    }
    if (SectionID==BUK_PROGRAMMBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_PROGRAMMBOOK_SEC_PROGGROUFOOT)
    {
    }
    if (SectionID==BUK_PROGRAMMBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_PROGRAMMBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_PROGRAMMBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE)
    {
      BUK_PROGRAMMBOOK.set_SpanValue(BUK_PROGRAMMBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PROGRAMMBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_PROGRAMMBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_PROGRAMMBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_PROGRAMMBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_PROGRAMMBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_PROGRAMMBOOK_OnPreview()
  {
    PreviewBook = BKW_PROGRAMMBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PROGRAMMI_Init()
  {

    PAN_PROGRAMMI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PROGRAMMI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PROGRAMMI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, "DB1B1C8C-5398-4962-975E-06ADC189CD04");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, "Programma");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, "Codice del programma");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, "F6182D98-694A-46EA-9B53-5546A4EE21AB");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, "Descrizione");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, "Descrizione del programma");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, "C54EE986-6DC7-43D8-B73A-024F7F5F893E");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, "8D37D30F-EEC3-4A97-8D64-2F3577647633");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, "12183A82-ABE3-47CE-A42A-D0FFABB45AD8");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, "A4B29072-1EDE-4820-9D6E-F748B286864B");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, "294A38CD-E98A-4CCE-8F8B-1043CACC8089");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, "Missione");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, "3ED35BCD-2CBA-4D2F-8ACC-8217B482B82C");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, "Programma");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, "DBB18D18-CCFF-4959-B7E9-B145F54BED96");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, "Missione");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, "CECCD090-8EDA-4191-9CF9-DF9505B57825");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, "Programma");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, "14829B26-0215-46EF-A702-604C75FF8FB2");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, "ID MISSIONE");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PROGRAMMI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, "BFE0F8F9-AE40-4A7E-BE58-052EA66B3AE0");
    PAN_PROGRAMMI.set_Header(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, "ID PROGRAMMA");
    PAN_PROGRAMMI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, "");
    PAN_PROGRAMMI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.VIS_NORMFIELPADR);
    PAN_PROGRAMMI.SetFlags(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PROGRAMMI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_LIST, 48);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_LIST, "Programma");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_FORM, 128);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_PROGRAMMA1, MyGlb.PANEL_FORM, "Programma");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_PROGRAMMA1, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_PROGRAMMA1, PPQRY_PROGRAMMI1, "A.CODICE", "CODICE", 5, 4, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_LIST, 80, 36, 320, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_LIST, 72);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 512, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_FORM, 128);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_DESCRIZIONE1, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_DESCRIZIONE1, PPQRY_PROGRAMMI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_LIST, 240, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_FORM, 128);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTEINSER1, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_UTENTEINSER1, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_UTENTEINSER1, PPQRY_PROGRAMMI1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_LIST, 312, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 220, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_FORM, 128);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAINSERIM1, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_DATAINSERIM1, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_DATAINSERIM1, PPQRY_PROGRAMMI1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_LIST, 472, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_FORM, 128);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_UTENTULTIAG1, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_UTENTULTIAG1, PPQRY_PROGRAMMI1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_LIST, 536, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_FORM, 4, 268, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_FORM, 128);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DATAULTIMAG1, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_DATAULTIMAG1, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_DATAULTIMAG1, PPQRY_PROGRAMMI1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_LIST, 400, 36, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_LIST, 168);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_LIST, "Missione");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_FORM, 4, 148, 588, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_FORM, 168);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_FORM, 2);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIMISSIO, MyGlb.PANEL_FORM, "Missione");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_DESCRIMISSIO, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_DESCRIMISSIO, PPQRY_MISSIONI, "A.CODICE_GERARCHIA || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 164, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_LIST, 644, 36, 244, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_LIST, 236);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_LIST, "Programma");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_FORM, 4, 184, 656, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_FORM, 236);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_FORM, 2);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_DESCRIPROGR1, MyGlb.PANEL_FORM, "Programma");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_DESCRIPROGR1, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_DESCRIPROGR1, PPQRY_PROGRAMMI, "A.CODICE_GERARCHIA || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 164, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_LIST, 552, 248, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_LIST, 92);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_LIST, "Missione");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_FORM, 4, 52, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_FORM, 92);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODMISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_CODMISSIONE, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_CODMISSIONE, PPQRY_PROGRAMMI1, "A.COD_MISSIONE", "COD_MISSIONE", 1, 10, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_LIST, 570, 272, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_LIST, 112);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_LIST, "Programma");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_FORM, 112);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_CODPROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_CODPROGRAMMA, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_CODPROGRAMMA, PPQRY_PROGRAMMI1, "A.COD_PROGRAMMA", "COD_PROGRAMMA", 1, 10, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_LIST, 120, 264, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_LIST, 80);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_LIST, "ID MISSIONE");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_FORM, 80);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDMISSIONE, MyGlb.PANEL_FORM, "ID MISSIONE");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_IDMISSIONE, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_IDMISSIONE, PPQRY_PROGRAMMI1, "A.ID_MISSIONE", "ID_MISSIONE", 3, 10, 0, -13997);
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_LIST, 288, 264, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_LIST, 100);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_LIST, "ID PROGRAMMA");
    PAN_PROGRAMMI.SetRect(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_FORM, 4, 124, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PROGRAMMI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_FORM, 100);
    PAN_PROGRAMMI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PROGRAMMI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PROGRAMMI_IDPROGRAMMA, MyGlb.PANEL_FORM, "ID PROGRAMMA");
    PAN_PROGRAMMI.SetFieldPage(PFL_PROGRAMMI_IDPROGRAMMA, -1, -1);
    PAN_PROGRAMMI.SetFieldPanel(PFL_PROGRAMMI_IDPROGRAMMA, PPQRY_PROGRAMMI1, "A.ID_PROGRAMMA", "ID_PROGRAMMA", 3, 10, 0, -13997);
  }

  private void PAN_PROGRAMMI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PROGRAMMI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as BILSTRUTCODI, ");
    SQL.append("  A.STRUTTURA_ID as BILSTRUTTUID, ");
    SQL.append("  A.CODICE_GERARCHIA || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_STRUTTURA A ");
    SQL.append("where (A.CODICE = ~~COD_MISSIONE~~) ");
    SQL.append("and   (A.LIVELLO = 1) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PROGRAMMI.SetQuery(PPQRY_MISSIONI, 0, SQL, -1, "");
    PAN_PROGRAMMI.SetQueryDB(PPQRY_MISSIONI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGRAMMI.SetMasterTable(PPQRY_MISSIONI, "BIL_STRUTTURA");
    PAN_PROGRAMMI.SetQueryLKE(PPQRY_MISSIONI, PFL_PROGRAMMI_CODMISSIONE, "BILSTRUTCODI");
    PAN_PROGRAMMI.SetQueryLKE(PPQRY_MISSIONI, PFL_PROGRAMMI_IDMISSIONE, "BILSTRUTTUID");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as BILSTRUTCODI, ");
    SQL.append("  A.STRUTTURA_ID as BILSTRUTTUID, ");
    SQL.append("  A.CODICE_GERARCHIA || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_STRUTTURA A ");
    SQL.append("where (A.LIVELLO = 1) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PROGRAMMI.SetQuery(PPQRY_MISSIONI, 1, SQL, -1, "");
    PAN_PROGRAMMI.SetQueryHeaderColumn(PPQRY_MISSIONI, "DESCRIZIONE", "Descrizione Missione");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as BILSTRUTCODI, ");
    SQL.append("  A.STRUTTURA_ID as BILSTRUTTUID, ");
    SQL.append("  A.CODICE_GERARCHIA || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_STRUTTURA A ");
    SQL.append("where (A.CODICE = ~~COD_PROGRAMMA~~) ");
    SQL.append("and   (A.CODICE_PADRE_GERARCHIA = LPAD(TO_CHAR ( ~~COD_MISSIONE~~ ), 2, SUBSTR('0', 1, 1))) ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI, 0, SQL, -1, "");
    PAN_PROGRAMMI.SetQueryDB(PPQRY_PROGRAMMI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGRAMMI.SetMasterTable(PPQRY_PROGRAMMI, "BIL_STRUTTURA");
    PAN_PROGRAMMI.SetQueryLKE(PPQRY_PROGRAMMI, PFL_PROGRAMMI_CODPROGRAMMA, "BILSTRUTCODI");
    PAN_PROGRAMMI.SetQueryLKE(PPQRY_PROGRAMMI, PFL_PROGRAMMI_IDPROGRAMMA, "BILSTRUTTUID");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.CODICE as BILSTRUTCODI, ");
    SQL.append("  A.STRUTTURA_ID as BILSTRUTTUID, ");
    SQL.append("  A.CODICE_GERARCHIA || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  BIL_STRUTTURA A ");
    SQL.append("where (A.CODICE_PADRE_GERARCHIA = LPAD(TO_CHAR ( ~~COD_MISSIONE~~ ), 2, SUBSTR('0', 1, 1))) ");
    SQL.append("and   (A.LIVELLO = 2) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI, 1, SQL, -1, "");
    PAN_PROGRAMMI.SetQueryHeaderColumn(PPQRY_PROGRAMMI, "DESCRIZIONE", "Descrizione Programma");
    PAN_PROGRAMMI.SetIMDB(IMDB, "PQRY_PROGRAMMI1", true);
    PAN_PROGRAMMI.set_SetString(MyGlb.MASTER_ROWNAME, "PROGRAMMI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.COD_MISSIONE as COD_MISSIONE, ");
    SQL.append("  A.COD_PROGRAMMA as COD_PROGRAMMA, ");
    SQL.append("  A.ID_MISSIONE as ID_MISSIONE, ");
    SQL.append("  A.ID_PROGRAMMA as ID_PROGRAMMA ");
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROGRAMMI A ");
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PROGRAMMI.SetQuery(PPQRY_PROGRAMMI1, 5, SQL, -1, "");
    PAN_PROGRAMMI.SetQueryDB(PPQRY_PROGRAMMI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PROGRAMMI.SetMasterTable(0, "PROGRAMMI");
    PAN_PROGRAMMI.AddToSortList(PFL_PROGRAMMI_PROGRAMMA1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PROGRAMMI.Status() == 2)
    {
      int oldListQBE = PAN_PROGRAMMI.iUseListQBE;
      PAN_PROGRAMMI.iUseListQBE = 0;
      PAN_PROGRAMMI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PROGRAMMI.PanelCommand(Glb.PCM_FIND);
      PAN_PROGRAMMI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_OBIETTOPERAT_Init()
  {

    PAN_OBIETTOPERAT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_OBIETTOPERAT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_OBIETTOPERAT.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, "4F84C9CD-A907-48D1-BEDD-224658D24FEA");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, "Obiettivo Operativo");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, "3EB6F4C8-2429-42E4-A058-77A7D630A6CD");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, "PROGRAMMA");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.VIS_NONNULLAFIEL);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, 0, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, "EBA3AC2B-8BE2-430F-8B6B-1DD4B517BA9E");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, "Descrizione");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, "5E5E9897-CA1B-44D1-A8DF-AEA90D39406C");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, "Responsabile");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, "69501590-8377-4F8B-A665-9D5C659FE0C8");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, "PROGETTO ID");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, "BFE5C82C-BC97-4DDC-BBA5-8F20967FFDA3");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, "BB523CFD-A9A4-42F1-BF62-367EB9EB4B7B");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, "63296339-AA91-4BB2-BF11-43970C808146");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, "E2B3E788-02F0-4D7B-994A-B6624AF3EA51");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_OBIETTOPERAT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_OBIETTOPERAT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, "3B8C1082-77FB-41B5-9D2F-BFE0812D9593");
    PAN_OBIETTOPERAT.set_Header(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, "");
    PAN_OBIETTOPERAT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, MyGlb.VIS_ETICGRASLEFT);
    PAN_OBIETTOPERAT.SetFlags(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_OBIETTOPERAT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_LIST, 0, 72, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_LIST, 48);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTO, MyGlb.PANEL_FORM, "Obiettivo Operativo");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_PROGETTO, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_PROGETTO, PPQRY_PROGETTI, "A.CODICE", "CODICE", 5, 4, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_LIST, 56, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_LIST, 76);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_LIST, "PROG.");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_FORM, 188, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_FORM, 88);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGRAMMA, MyGlb.PANEL_FORM, "PROGRAMMA");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_PROGRAMMA, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_PROGRAMMA, PPQRY_PROGETTI, "A.PROGRAMMA", "PROGRAMMA", 5, 4, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_LIST, 68, 72, 292, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 28, 520, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_DESCRIZIONE, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_DESCRIZIONE, PPQRY_PROGETTI, "A.DESCRIZIONE", "DESCRIZIONE", 5, 100, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_LIST, 360, 72, 124, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_LIST, 84);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_FORM, 4, 52, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_RESPONSABILE, MyGlb.PANEL_FORM, "Responsabile");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_RESPONSABILE, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_RESPONSABILE, PPQRY_PROGETTI, "A.RESPONSABILE", "RESPONSABILE", 5, 40, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_LIST, 472, 72, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_LIST, 76);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_LIST, "PROGETTO ID");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_FORM, 332, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_FORM, 88);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_PROGETTOID, MyGlb.PANEL_FORM, "PROGETTO ID");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_PROGETTOID, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_PROGETTOID, PPQRY_PROGETTI, "A.PROGETTO_ID", "PROGETTO_ID", 5, 9, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_LIST, 432, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_UTENTEINSERI, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_UTENTEINSERI, PPQRY_PROGETTI, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_LIST, 504, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_FORM, 4, 220, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_DATAINSERIME, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_DATAINSERIME, PPQRY_PROGETTI, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_LIST, 664, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTN. ULT. A.");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 244, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_UTENTULTIAGG, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_UTENTULTIAGG, PPQRY_PROGETTI, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_LIST, 712, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 268, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_FORM, 128);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_DATAULTIMAGG, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_DATAULTIMAGG, PPQRY_PROGETTI, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, MyGlb.PANEL_LIST, 0, 4, 476, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, MyGlb.PANEL_LIST, 0);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, MyGlb.PANEL_LIST, 1);
    PAN_OBIETTOPERAT.SetRect(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, MyGlb.PANEL_FORM, 0, 4, 480, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_OBIETTOPERAT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, MyGlb.PANEL_FORM, 0);
    PAN_OBIETTOPERAT.SetNumRow(MyGlb.OBJ_FIELD, PFL_OBIETTOPERAT_DESCRIPROGRA, MyGlb.PANEL_FORM, 1);
    PAN_OBIETTOPERAT.SetFieldPage(PFL_OBIETTOPERAT_DESCRIPROGRA, -1, -1);
    PAN_OBIETTOPERAT.SetFieldPanel(PFL_OBIETTOPERAT_DESCRIPROGRA, -1, "", "DESCRIPROGRA", 0, 0, 0, -13997);
  }

  private void PAN_OBIETTOPERAT_InitQueries()
  {
    StringBuffer SQL;

    PAN_OBIETTOPERAT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_OBIETTOPERAT.SetIMDB(IMDB, "PQRY_PROGETTI", true);
    PAN_OBIETTOPERAT.set_SetString(MyGlb.MASTER_ROWNAME, "PROGETTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.PROGRAMMA as PROGRAMMA, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.RESPONSABILE as RESPONSABILE, ");
    SQL.append("  A.PROGETTO_ID as PROGETTO_ID, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_OBIETTOPERAT.SetQuery(PPQRY_PROGETTI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    PAN_OBIETTOPERAT.SetQuery(PPQRY_PROGETTI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGRAMMA = ~~PQRY_PROGRAMMI1.CODICE~~) ");
    PAN_OBIETTOPERAT.SetQuery(PPQRY_PROGETTI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OBIETTOPERAT.SetQuery(PPQRY_PROGETTI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_OBIETTOPERAT.SetQuery(PPQRY_PROGETTI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_OBIETTOPERAT.SetQuery(PPQRY_PROGETTI, 5, SQL, -1, "");
    PAN_OBIETTOPERAT.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_OBIETTOPERAT.SetMasterTable(0, "PROGETTI");
    PAN_OBIETTOPERAT.AddToSortList(PFL_OBIETTOPERAT_PROGETTO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_OBIETTOPERAT.Status() == 2)
    {
      int oldListQBE = PAN_OBIETTOPERAT.iUseListQBE;
      PAN_OBIETTOPERAT.iUseListQBE = 0;
      PAN_OBIETTOPERAT.PanelCommand(Glb.PCM_SEARCH);
      PAN_OBIETTOPERAT.PanelCommand(Glb.PCM_FIND);
      PAN_OBIETTOPERAT.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE_Init()
  {
    BUK_PROGRAMMBOOK.InitMastro(BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE, 3, 21000, 29700, 1, 2, 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE, "B9E1B101-6D8E-46B5-8DE0-52A8DE9A23FE");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE, "PROGBOOKPAGE");
    BUK_PROGRAMMBOOK.InitMastroBox(BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE, BUK_PROGRAMMBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 27700, 2200, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_PAGEHEADER, "4EEA4803-73F7-45D8-A0AE-DF50EAC462D4");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_PROGRAMMBOOK.InitMastroBox(BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE, BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY, 1000, 3400, 27700, 16500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY, "089D50EA-9A41-40F2-B0D4-770A670F5D3C");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_PROGRAMMBOOK.InitMastroBox(BUK_PROGRAMMBOOK_MST_PROGBOOKPAGE, BUK_PROGRAMMBOOK_RPTBOX_NUMEROPAGINA, 26500, 300, 2200, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_NUMEROPAGINA, "6670EE40-A01D-448F-B2D0-BD6761E77253");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_NUMEROPAGINA, BUK_PROGRAMMBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_NUMEROPAGINA, "395A8150-F5DE-4973-BD69-77B557135A9B");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
  }

  private void BUK_PROGRAMMBOOK_RPT_NEWREPORT_InitQuery() { BUK_PROGRAMMBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_PROGRAMMBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
      SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
      SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
      SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
      SQL.append("  B.CODICE as PROGPROGCODI, ");
      SQL.append("  B.DESCRIZIONE as PROGPROGDESC, ");
      SQL.append("  B.RESPONSABILE as RESPONSABILE ");
      SQL.append("from ");
      SQL.append("  PROGRAMMI A, ");
      SQL.append("  PROGETTI B ");
      SQL.append("where (B.PROGRAMMA = A.CODICE) ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_PROGRAMMBOOK.SetReportQuery(BUK_PROGRAMMBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "500549BE-D5DA-40A2-A250-678C8B5AD5E1");
      if (BUK_PROGRAMMBOOK.FindObjByID(BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD) != null)
        BUK_PROGRAMMBOOK.AddReportGroup(BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD, "CODICE");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_PROGRAMMBOOK_RPT_NEWREPORT_Init()
  {
    BUK_PROGRAMMBOOK.InitReport(BUK_PROGRAMMBOOK_RPT_NEWREPORT, 196609);
    BUK_PROGRAMMBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPT_NEWREPORT, "34951544-E4F8-43A3-AC51-C3E5430A38E0");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_PROGRAMMBOOK.InitSection(BUK_PROGRAMMBOOK_RPT_NEWREPORT, BUK_PROGRAMMBOOK_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PROGRAMMBOOK.SetSectionRendersInto(BUK_PROGRAMMBOOK_SEC_REPORTHEADER, BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SEC_REPORTHEADER, "657355C0-6279-453A-9EB8-BE51D22542C5");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_PROGRAMMBOOK.InitSection(BUK_PROGRAMMBOOK_RPT_NEWREPORT, BUK_PROGRAMMBOOK_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PROGRAMMBOOK.SetSectionRendersInto(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, BUK_PROGRAMMBOOK_RPTBOX_PAGEHEADER);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, "7E35E40A-1D7C-4369-94F0-E898BCAFFF9D");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, BUK_PROGRAMMBOOK_RPTBOX_NEWBOX, 100, 100, 27400, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_NEWBOX, "1EF23F5A-32D1-459A-9C54-FA3F0EEEF730");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_NEWBOX, BUK_PROGRAMMBOOK_SPAN_PROGRAEPROGE, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Programmi e Progetti", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PROGRAEPROGE, "613FA982-CAA3-46D0-A96D-CE0EC749C0E5");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PROGRAEPROGE, "PROGRAEPROGE");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, BUK_PROGRAMMBOOK_RPTBOX_CODICEHEADER, 0, 1500, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_CODICEHEADER, "6D0061EA-88C2-486D-8AB6-1EA796B2CD3B");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_CODICEHEADER, BUK_PROGRAMMBOOK_SPAN_PROGRAMMA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Programma", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PROGRAMMA, "93FB5601-5E1C-4B98-B530-C8CD5F7DE799");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PROGRAMMA, "PROGRAMMA");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, BUK_PROGRAMMBOOK_RPTBOX_HEADERPROGRA, 12000, 1500, 1300, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_HEADERPROGRA, "01B642A7-F99F-4C2E-B0CB-889FF9B80240");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_HEADERPROGRA, "HEADERPROGRA");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_HEADERPROGRA, BUK_PROGRAMMBOOK_SPAN_PROGETTO1, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Progetto", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PROGETTO1, "689D7667-2217-4471-BAF2-B92B79329802");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PROGETTO1, "PROGETTO1");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, BUK_PROGRAMMBOOK_RPTBOX_HEADERDESCRI, 13600, 1500, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_HEADERDESCRI, "82FEA65B-9020-4026-989A-560E2F9414A2");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_HEADERDESCRI, "HEADERDESCRI");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_HEADERDESCRI, BUK_PROGRAMMBOOK_SPAN_PROGETTO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PROGETTO, "EF4A013A-4B5F-4AC1-8A08-A645209D73C3");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PROGETTO, "PROGETTO");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_PAGEHEADER, BUK_PROGRAMMBOOK_RPTBOX_HEADERRESPON, 21500, 1500, 2000, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_HEADERRESPON, "A88FAEDB-A645-4AAD-86EA-E2A014FCB149");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_HEADERRESPON, "HEADERRESPON");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_HEADERRESPON, BUK_PROGRAMMBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Responsabile", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_DESCRIZIONE, "BCCA4116-F6F5-4538-BA4D-BD71FCE921B0");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_PROGRAMMBOOK.InitSection(BUK_PROGRAMMBOOK_RPT_NEWREPORT, BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD, 500, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "CODICE");
    BUK_PROGRAMMBOOK.SetSectionRendersInto(BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD, BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD, "FAD9D8B5-1956-475F-9944-6CB51BADAA7C");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD, "PROGGROUHEAD");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD, BUK_PROGRAMMBOOK_RPTBOX_CODICE, 0, 0, 11800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_CODICE, "DFB8F55E-5974-42A0-96F4-57C2D37DCD87");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_CODICE, "CODICE");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_CODICE, BUK_PROGRAMMBOOK_SPAN_PPPPPBPDPPPB, MyGlb.VIS_DEFAREPOSTYL, 5, 107, 0, 271384705, "Codice del programma", "", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PPPPPBPDPPPB, "C8752D95-C87E-4A40-A725-9639B508A22A");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PPPPPBPDPPPB, "PPPPPBPDPPPB");
    BUK_PROGRAMMBOOK.InitSection(BUK_PROGRAMMBOOK_RPT_NEWREPORT, BUK_PROGRAMMBOOK_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PROGRAMMBOOK.SetSectionRendersInto(BUK_PROGRAMMBOOK_SEC_DETAIL, BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SEC_DETAIL, "44FA2F33-C9C7-4C35-9BCB-9EB086BBBB9B");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SEC_DETAIL, "DETAIL");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_DETAIL, BUK_PROGRAMMBOOK_RPTBOX_CODICEPROGET, 12000, 100, 1500, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_CODICEPROGET, "D290A172-68CD-4547-AFBC-6A423796D912");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_CODICEPROGET, "CODICEPROGET");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_CODICEPROGET, BUK_PROGRAMMBOOK_SPAN_PRPRCOPRPRP1, MyGlb.VIS_DEFAREPOSTYL, 5, 4, 0, 271384705, "", "::PROGPROGCODI", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PRPRCOPRPRP1, "CD142AAE-E17B-4C16-A519-461C8FDE88E3");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PRPRCOPRPRP1, "PRPRCOPRPRP1");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_DETAIL, BUK_PROGRAMMBOOK_RPTBOX_DESCRIPROGET, 13700, 100, 7800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_DESCRIPROGET, "03D484C0-CE23-45B2-88F2-9A976A5ADBC8");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_DESCRIPROGET, "DESCRIPROGET");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_DESCRIPROGET, BUK_PROGRAMMBOOK_SPAN_PRPRDEPRPRPB, MyGlb.VIS_DEFAREPOSTYL, 5, 100, 0, 271384705, "", "::PROGPROGDESC", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PRPRDEPRPRPB, "0CABFC10-8CB8-4F59-81E3-5F183CC99FBD");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PRPRDEPRPRPB, "PRPRDEPRPRPB");
    BUK_PROGRAMMBOOK.InitReportBox(BUK_PROGRAMMBOOK_SEC_DETAIL, BUK_PROGRAMMBOOK_RPTBOX_RESPONSABILE, 21700, 100, 5800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_RPTBOX_RESPONSABILE, "1817A668-8080-4EE9-89A4-E73D5F2CB72B");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_RPTBOX_RESPONSABILE, "RESPONSABILE");
    BUK_PROGRAMMBOOK.InitBoxSpan(BUK_PROGRAMMBOOK_RPTBOX_RESPONSABILE, BUK_PROGRAMMBOOK_SPAN_PRPRREPRPRPB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "", "::RESPONSABILE", 1);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SPAN_PRPRREPRPRPB, "D0F43903-2809-4588-801B-37A804021B7F");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SPAN_PRPRREPRPRPB, "PRPRREPRPRPB");
    BUK_PROGRAMMBOOK.InitSection(BUK_PROGRAMMBOOK_RPT_NEWREPORT, BUK_PROGRAMMBOOK_SEC_PROGGROUFOOT, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "CODICE");
    BUK_PROGRAMMBOOK.SetSectionRendersInto(BUK_PROGRAMMBOOK_SEC_PROGGROUFOOT, BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SEC_PROGGROUFOOT, "AFD6E36E-1C99-454D-AB18-97D090258D9A");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SEC_PROGGROUFOOT, "PROGGROUFOOT");
    BUK_PROGRAMMBOOK.InitSection(BUK_PROGRAMMBOOK_RPT_NEWREPORT, BUK_PROGRAMMBOOK_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_PROGRAMMBOOK.SetSectionRendersInto(BUK_PROGRAMMBOOK_SEC_REPORTFOOTER, BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY);
    BUK_PROGRAMMBOOK.SetRTCGuid(BUK_PROGRAMMBOOK_SEC_REPORTFOOTER, "F16AAE4F-0058-437A-934B-1CE963967475");
    BUK_PROGRAMMBOOK.SetObjCode(BUK_PROGRAMMBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_PROGRAMMBOOK.AddReportGroup(BUK_PROGRAMMBOOK_SEC_PROGGROUHEAD, "CODICE");
    BUK_PROGRAMMBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_PROGRAMMBOOK_InitLinks()
  {
    BUK_PROGRAMMBOOK.SetBoxNextBox(BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY, BUK_PROGRAMMBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PROGRAMMI) PAN_PROGRAMMI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_OBIETTOPERAT) PAN_OBIETTOPERAT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGRAMMI) PAN_PROGRAMMI_ValidateRow(Cancel);
    if (SrcObj == PAN_OBIETTOPERAT) PAN_OBIETTOPERAT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PROGRAMMI) PAN_PROGRAMMI_DynamicProperties();
    if (SrcObj == PAN_OBIETTOPERAT) PAN_OBIETTOPERAT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGRAMMI) PAN_PROGRAMMI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_OBIETTOPERAT) PAN_OBIETTOPERAT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PROGRAMMI) PAN_PROGRAMMI_BeforeInsert(Cancel);
    if (SrcObj == PAN_OBIETTOPERAT) PAN_OBIETTOPERAT_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PROGRAMMI) PAN_PROGRAMMI_BeforeUpdate(Cancel);
    if (SrcObj == PAN_OBIETTOPERAT) PAN_OBIETTOPERAT_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_PROGRAMMI) PAN_PROGRAMMI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_OBIETTOPERAT) PAN_OBIETTOPERAT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_PROGRAMMBOOK) BUK_PROGRAMMBOOK_OnPreview();
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
