// **********************************************
// Funzioni Servizi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FunzioniServizi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_FUNSERTABVIE;
  private static int PFL_FUNZIONI_FUNZIONE1 = 0;
  private static int PFL_FUNZIONI_DESCRIZIONE1 = 1;
  private static int PFL_FUNZIONI_DATAINSERIM1 = 2;
  private static int PFL_FUNZIONI_UTENTEINSER1 = 3;
  private static int PFL_FUNZIONI_UTENTULTIAG1 = 4;
  private static int PFL_FUNZIONI_DATAULTIMAG1 = 5;

  private static int PPQRY_FUNZIONI1 = 0;


  IDPanel PAN_FUNZIONI;
  private static int PFL_SERVIZI_SERVIZIO = 0;
  private static int PFL_SERVIZI_DESCRIZIONE = 1;
  private static int PFL_SERVIZI_RESPONSABILE = 2;
  private static int PFL_SERVIZI_SUDDCERTCONS = 3;
  private static int PFL_SERVIZI_INTESTALABEL = 4;
  private static int PFL_SERVIZI_FUNZIONE = 5;
  private static int PFL_SERVIZI_UTENTEINSERI = 6;
  private static int PFL_SERVIZI_DATAINSERIME = 7;
  private static int PFL_SERVIZI_UTENTULTIAGG = 8;
  private static int PFL_SERVIZI_DATAULTIMAGG = 9;

  private static int PPQRY_SERVIZI1 = 0;


  IDPanel PAN_SERVIZI;
  CIDREObj BUK_FUNZIONIBOOK;
  OBook BKW_FUNZIONIBOOK;
  //
  // Template Pages constants
  private static int BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE = 1;
  private static int BUK_FUNZIONIBOOK_RPTBOX_NUMEROPAGIN1 = 2;
  private static int BUK_FUNZIONIBOOK_SPAN_NUMEROPAGIN1 = 3;
  private static int BUK_FUNZIONIBOOK_RPTBOX_PAGEHEADER1 = 4;
  private static int BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1 = 5;

  //
  // Reports constants
  private static int BUK_FUNZIONIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_FUNZIONIBOOK_SEC_REPORTHEADER = 7;
  private static int BUK_FUNZIONIBOOK_SEC_TITOLO = 8;
  private static int BUK_FUNZIONIBOOK_RPTBOX_TITOLO2 = 9;
  private static int BUK_FUNZIONIBOOK_SPAN_FUNZIOESERVI = 10;
  private static int BUK_FUNZIONIBOOK_SEC_PAGEHEADER = 11;
  private static int BUK_FUNZIONIBOOK_RPTBOX_FUNZIOHEADER = 12;
  private static int BUK_FUNZIONIBOOK_SPAN_FUNZIONE = 13;
  private static int BUK_FUNZIONIBOOK_RPTBOX_DESCRIHEADE1 = 14;
  private static int BUK_FUNZIONIBOOK_SPAN_DESCRIZIONE1 = 15;
  private static int BUK_FUNZIONIBOOK_RPTBOX_SERVSERVHEAD = 16;
  private static int BUK_FUNZIONIBOOK_SPAN_SERVIZSERVIZ = 17;
  private static int BUK_FUNZIONIBOOK_RPTBOX_SERVRESPHEAD = 18;
  private static int BUK_FUNZIONIBOOK_SPAN_SERVIZRESPON = 19;
  private static int BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD = 20;
  private static int BUK_FUNZIONIBOOK_RPTBOX_FUNZIONE = 21;
  private static int BUK_FUNZIONIBOOK_SPAN_FUFUFUSEFUBO = 22;
  private static int BUK_FUNZIONIBOOK_RPTBOX_DESCRIZIONE2 = 23;
  private static int BUK_FUNZIONIBOOK_SPAN_FUDEFUSEFUBO = 24;
  private static int BUK_FUNZIONIBOOK_SEC_DETAIL = 25;
  private static int BUK_FUNZIONIBOOK_RPTBOX_SERVIZDESCRI = 26;
  private static int BUK_FUNZIONIBOOK_SPAN_FUSEDEFUSEFB = 27;
  private static int BUK_FUNZIONIBOOK_RPTBOX_SERVIZSERVIZ = 28;
  private static int BUK_FUNZIONIBOOK_SPAN_FUSESEFUSEFB = 29;
  private static int BUK_FUNZIONIBOOK_RPTBOX_SERVIZRESPON = 30;
  private static int BUK_FUNZIONIBOOK_SPAN_FUSEREFUSEFB = 31;
  private static int BUK_FUNZIONIBOOK_SEC_FUNZGROUFOOT = 32;
  private static int BUK_FUNZIONIBOOK_SEC_PAGEFOOTER = 33;
  private static int BUK_FUNZIONIBOOK_SEC_REPORTFOOTER = 34;

  CIDREObj BUK_SERVIZIBOOK;
  OBook BKW_SERVIZIBOOK;
  //
  // Template Pages constants
  private static int BUK_SERVIZIBOOK_MST_SERVBOOKPAGE = 1;
  private static int BUK_SERVIZIBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_SERVIZIBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_SERVIZIBOOK_RPTBOX_PAGEHEADER = 4;
  private static int BUK_SERVIZIBOOK_RPTBOX_PAGEBODY = 5;

  //
  // Reports constants
  private static int BUK_SERVIZIBOOK_RPT_NEWREPORT = 6;
  private static int BUK_SERVIZIBOOK_SEC_REPORTHEADE1 = 7;
  private static int BUK_SERVIZIBOOK_SEC_TITOLOHEADE1 = 8;
  private static int BUK_SERVIZIBOOK_RPTBOX_TITOLO1 = 9;
  private static int BUK_SERVIZIBOOK_SPAN_RICLASSIFIC1 = 10;
  private static int BUK_SERVIZIBOOK_RPTBOX_SOTTOTITOLO = 11;
  private static int BUK_SERVIZIBOOK_SPAN_SOTTOTITOLO1 = 12;
  private static int BUK_SERVIZIBOOK_SEC_PAGEHEADER1 = 13;
  private static int BUK_SERVIZIBOOK_RPTBOX_SERVIZHEADER = 14;
  private static int BUK_SERVIZIBOOK_SPAN_SERVIZIO = 15;
  private static int BUK_SERVIZIBOOK_RPTBOX_DESCRIHEADER = 16;
  private static int BUK_SERVIZIBOOK_SPAN_DESCRIZIONE = 17;
  private static int BUK_SERVIZIBOOK_RPTBOX_RESPONHEADER = 18;
  private static int BUK_SERVIZIBOOK_SPAN_RESPONSABILE = 19;
  private static int BUK_SERVIZIBOOK_SEC_DETAIL1 = 20;
  private static int BUK_SERVIZIBOOK_RPTBOX_SERVIZIO = 21;
  private static int BUK_SERVIZIBOOK_SPAN_SESEFUSESEBO = 22;
  private static int BUK_SERVIZIBOOK_RPTBOX_DESCRIZIONE1 = 23;
  private static int BUK_SERVIZIBOOK_SPAN_SEDEFUSESEBO = 24;
  private static int BUK_SERVIZIBOOK_RPTBOX_RESPONSABILE = 25;
  private static int BUK_SERVIZIBOOK_SPAN_SEREFUSESEBO = 26;
  private static int BUK_SERVIZIBOOK_SEC_PAGEFOOTER = 27;
  private static int BUK_SERVIZIBOOK_SEC_REPORTFOOTER = 28;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_FUNZIONI1(IMDB);
    Init_PQRY_SERVIZI1(IMDB);
    Init_PQRY_FUNZIONI2(IMDB);
    Init_PQRY_SERVIZI2(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_FUNZIONI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FUNZIONI1, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_FUNZIONI1, "PQRY_FUNZIONI1");
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI1,IMDBDef8.PQSL_FUNZIONI1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FUNZIONI1, 0);
  }

  private static void Init_PQRY_SERVIZI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_SERVIZI1, 9);
    IMDB.set_TblCode(IMDBDef8.PQRY_SERVIZI1, "PQRY_SERVIZI1");
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_FUNZIONE,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_SERVIZIO, "SERVIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_SERVIZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_RESPONSABILE, "RESPONSABILE");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_RESPONSABILE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_CERTIFICATO_CC, "CERTIFICATO_CC");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_CERTIFICATO_CC,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI1,IMDBDef8.PQSL_SERVIZI1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_SERVIZI1, 0);
  }

  private static void Init_PQRY_FUNZIONI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FUNZIONI2, 5);
    IMDB.set_TblCode(IMDBDef8.PQRY_FUNZIONI2, "PQRY_FUNZIONI2");
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZIOFUNZIO, "FUNZIOFUNZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZIOFUNZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZIODESCRI, "FUNZIODESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZIODESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZSERVSERV, "FUNZSERVSERV");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZSERVSERV,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZSERVDESC, "FUNZSERVDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZSERVDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZSERVRESP, "FUNZSERVRESP");
    IMDB.SetFldParams(IMDBDef8.PQRY_FUNZIONI2,IMDBDef8.PQSL_FUNZIONI2_FUNZSERVRESP,5,40,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FUNZIONI2, 0);
  }

  private static void Init_PQRY_SERVIZI2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_SERVIZI2, 6);
    IMDB.set_TblCode(IMDBDef8.PQRY_SERVIZI2, "PQRY_SERVIZI2");
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZFUNZIO, "SERVIZFUNZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZFUNZIO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZSERVIZ, "SERVIZSERVIZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZSERVIZ,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZDESCRI, "SERVIZDESCRI");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZDESCRI,5,140,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZRESPON, "SERVIZRESPON");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVIZRESPON,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERSUDCERCON, "SERSUDCERCON");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERSUDCERCON,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVFUNZDESC, "SERVFUNZDESC");
    IMDB.SetFldParams(IMDBDef8.PQRY_SERVIZI2,IMDBDef8.PQSL_SERVIZI2_SERVFUNZDESC,5,140,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_SERVIZI2, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FunzioniServizi(MyWebEntryPoint w, IMDBObj imdb)
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
  public FunzioniServizi()
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
    FormIdx = MyGlb.FRM_FUNZIOSERVIZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8DAF698A-EA8B-459E-9891-C396539D3C3B";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 502;
    set_Caption(new IDVariant("Funzioni Servizi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 476;
    Frames[1].Caption = "Funzioni Servizi Tabbed View";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 476;
    TAB_FUNSERTABVIE = new OTabView(this);
    Frames[1].Content = TAB_FUNSERTABVIE;
    TAB_FUNSERTABVIE.iGuid = "D55E2872-665C-47BF-AA85-D42D4AEA2084";
    TAB_FUNSERTABVIE.SetItemCount(2);
    TAB_FUNSERTABVIE.Placement = 1;
    TAB_FUNSERTABVIE.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Funzioni";
    Frames[2].Parent = this;
    PAN_FUNZIONI = new IDPanel(w, this, 2, "PAN_FUNZIONI");
    Frames[2].Content = PAN_FUNZIONI;
    PAN_FUNZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FUNZIONI.VS = MainFrm.VisualStyleList;
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 476-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_FUNZIONIBOOK != null)
      PAN_FUNZIONI.SetBook(BUK_FUNZIONIBOOK);
    PAN_FUNZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "594E88BD-8A79-4F9B-80EF-64E48B02E7C9");
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 556, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FUNZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FUNZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FUNZIONI.InitStatus = 2;
    PAN_FUNZIONI_Init();
    PAN_FUNZIONI_InitFields();
    PAN_FUNZIONI_InitQueries();
    TAB_FUNSERTABVIE.SetItem(1, Frames[2], 0, "", "Funzioni", "Tabella con le funzioni definite dall'ente");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Servizi";
    Frames[3].Parent = this;
    PAN_SERVIZI = new IDPanel(w, this, 3, "PAN_SERVIZI");
    Frames[3].Content = PAN_SERVIZI;
    PAN_SERVIZI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SERVIZI.VS = MainFrm.VisualStyleList;
    PAN_SERVIZI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 476-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    if (BUK_SERVIZIBOOK != null)
      PAN_SERVIZI.SetBook(BUK_SERVIZIBOOK);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9FD0ABD5-00CC-41C4-9298-986554E5A803");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 48, 800, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SERVIZI.InitStatus = 2;
    PAN_SERVIZI_Init();
    PAN_SERVIZI_InitFields();
    PAN_SERVIZI_InitQueries();
    TAB_FUNSERTABVIE.SetItem(2, Frames[3], 0, "", "Servizi", "Servizi definiti dall'ente");
    BKW_FUNZIONIBOOK = new OBook(this);
    BUK_FUNZIONIBOOK = new CIDREObj(BKW_FUNZIONIBOOK);
    BKW_FUNZIONIBOOK.iGuid = "84B486E7-47C7-4CDB-898A-43CE6B742ECC";
    BKW_FUNZIONIBOOK.Code = "BUK_FUNZIONIBOOK";
    BKW_FUNZIONIBOOK.BookObj = BUK_FUNZIONIBOOK;
    BKW_FUNZIONIBOOK.InitDefMasks();
    BUK_FUNZIONIBOOK.InitBook(1, 1245185, "Funzioni Book", IMDB, MainFrm.VisualStyleList);
    BUK_FUNZIONIBOOK.InitHTML();
    BUK_FUNZIONIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_FUNZIONIBOOK.Book.SetMainFrm(MainFrm);
    BUK_FUNZIONIBOOK.SetRTCGuid(0, "84B486E7-47C7-4CDB-898A-43CE6B742ECC");
    BUK_FUNZIONIBOOK.SetObjCode(0, "FUNZIONIBOOK");
    if (PAN_FUNZIONI != null)
      PAN_FUNZIONI.SetBook(BUK_FUNZIONIBOOK);
    BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE_Init();
    BUK_FUNZIONIBOOK_RPT_NEWREPORT_Init();
    BUK_FUNZIONIBOOK_InitLinks();
    BKW_SERVIZIBOOK = new OBook(this);
    BUK_SERVIZIBOOK = new CIDREObj(BKW_SERVIZIBOOK);
    BKW_SERVIZIBOOK.iGuid = "4FF8D70F-7C2C-415C-963A-09C0BD72595B";
    BKW_SERVIZIBOOK.Code = "BUK_SERVIZIBOOK";
    BKW_SERVIZIBOOK.BookObj = BUK_SERVIZIBOOK;
    BKW_SERVIZIBOOK.InitDefMasks();
    BUK_SERVIZIBOOK.InitBook(1, 1245185, "Servizi Book", IMDB, MainFrm.VisualStyleList);
    BUK_SERVIZIBOOK.InitHTML();
    BUK_SERVIZIBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SERVIZIBOOK.Book.SetMainFrm(MainFrm);
    BUK_SERVIZIBOOK.SetRTCGuid(0, "4FF8D70F-7C2C-415C-963A-09C0BD72595B");
    BUK_SERVIZIBOOK.SetObjCode(0, "SERVIZIBOOK");
    if (PAN_SERVIZI != null)
      PAN_SERVIZI.SetBook(BUK_SERVIZIBOOK);
    BUK_SERVIZIBOOK_MST_SERVBOOKPAGE_Init();
    BUK_SERVIZIBOOK_RPT_NEWREPORT_Init();
    BUK_SERVIZIBOOK_InitLinks();
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
      PAN_FUNZIONI.UpdatePanel(MainFrm);
      PAN_SERVIZI.UpdatePanel(MainFrm);
      // BUK_FUNZIONIBOOK.UpdateBook();
      // BUK_SERVIZIBOOK.UpdateBook();
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
    if (Code.equals("BUK_FUNZIONIBOOK")) return BUK_FUNZIONIBOOK;
    if (Code.equals("BUK_SERVIZIBOOK")) return BUK_SERVIZIBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof FunzioniServizi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FunzioniServizi.class.getName() : (Glb.ClassWithPackage(FunzioniServizi.class) ? FunzioniServizi.class.getName().substring(FunzioniServizi.class.getPackage().getName().length() + 1) : FunzioniServizi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Funzioni Servizi Tabbed View Change Page Event
  // Questo evento viene notificato dall'oggetto Tabbed
  // View quando viene cambiata la pagina attiva.
  // Previous Page: È un numero intero rappresentante l'indice della pagina precedentemente selezionata nel Tabbed View. Utilizzare la funzione Me del pannello o dell'oggetto visuale contenuto nel Tabbed View per effettuare il confronto. - Input
  // Cancel: Se impostato a True annulla il cambio pagina. - Input/Output
  // **********************************************************************
  private void TAB_FUNSERTABVIE_IntClick(IDVariant PreviousPage, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Funzioni Servizi Tabbed View Change Page Event Body
      // Procedure Body
      // 
      if (new IDVariant(TAB_FUNSERTABVIE.SelectedPageIndex()).equals((new IDVariant(PAN_SERVIZI.FrIndex)), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_FUNZIONE, 0)) || new IDVariant(PAN_FUNZIONI.Status()).equals((new IDVariant(3)), true))
        {
          Cancel.set((new IDVariant(-1)));
        }
        PAN_SERVIZI.set_FieldText(PFL_SERVIZI_INTESTALABEL, IDL.Add(IDL.Add((new IDVariant(PAN_FUNZIONI.FieldText(PFL_FUNZIONI_FUNZIONE1))), (new IDVariant(" - "))), IMDB.Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_DESCRIZIONE, 0)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "FunzioniServiziTabbedViewChangePageEvent", _e);
    }
  }

  // **********************************************************************
  // Funzioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FUNZIONI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FUNZIONI);
      // 
      // Funzioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_FUNZIONI.IsNewRow())
      {
        PAN_FUNZIONI.SetFlags (Glb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FUNZIONI.SetFlags (Glb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_FUNZIONI.set_ToolTip(Glb.OBJ_FIELD,PFL_FUNZIONI_DESCRIZIONE1,IMDB.Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "FunzioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Funzioni On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_FUNZIONI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Funzioni On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.FUNZIONIPD(IMDB.Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_FUNZIONE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "FunzioniOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Funzioni On Database Error Event
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
  private void PAN_FUNZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_FUNZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Funzioni On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "FunzioniOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Funzioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_FUNZIONI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Funzioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "FunzioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SERVIZI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SERVIZI);
      // 
      // Servizi On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (PAN_SERVIZI.IsNewRow())
      {
        PAN_FUNZIONI.SetFlags (Glb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_FUNZIONI.SetFlags (Glb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_SERVIZI.set_ToolTip(Glb.OBJ_FIELD,PFL_SERVIZI_DESCRIZIONE,IMDB.Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_DESCRIZIONE, 0).stringValue()); 
      PAN_SERVIZI.set_ToolTip(Glb.OBJ_FIELD,PFL_SERVIZI_RESPONSABILE,IMDB.Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_RESPONSABILE, 0).stringValue()); 
      PAN_SERVIZI.set_ToolTip(Glb.OBJ_FIELD,PFL_SERVIZI_INTESTALABEL,(new IDVariant(PAN_SERVIZI.FieldText(PFL_SERVIZI_INTESTALABEL))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "ServiziOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_SERVIZI_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.SERVIZIPD(IMDB.Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_FUNZIONE, 0), IMDB.Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_SERVIZIO, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "ServiziOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_SERVIZI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Servizi On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_FUNZIONE, 0, IMDB.Value(IMDBDef8.PQRY_FUNZIONI1, IMDBDef8.PQSL_FUNZIONI1_FUNZIONE, 0));
        IMDB.set_Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef8.PQRY_SERVIZI1, IMDBDef8.PQSL_SERVIZI1_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "ServiziOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Servizi On Database Error Event
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
  private void PAN_SERVIZI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SERVIZI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Servizi On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "ServiziOnDatabaseErrorEvent", _e);
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

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Funzioni/Servizi", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FunzioniServizi", "LoadEvent", _e);
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
  private void TAB_FUNSERTABVIE_Click(IDVariant OldPage, IDVariant Cancel)
  {
    TAB_FUNSERTABVIE_IntClick(OldPage, Cancel);
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FUNZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FUNZIONI, Cancel);
    // Stub
  }

  private void PAN_FUNZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FUNZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FUNZIONI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FUNZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FUNZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_SERVIZI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SERVIZI, Cancel);
    // Stub
  }

  private void PAN_SERVIZI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SERVIZI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SERVIZI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SERVIZI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SERVIZI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_FUNZIONIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_FUNZIONIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_FUNZIONIBOOK_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_FUNZIONIBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_FUNZIONIBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD)
    {
    }
    if (SectionID==BUK_FUNZIONIBOOK_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_FUNZIONIBOOK_SEC_FUNZGROUFOOT)
    {
    }
    if (SectionID==BUK_FUNZIONIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_FUNZIONIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_FUNZIONIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_FUNZIONIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE)
    {
      BUK_FUNZIONIBOOK.set_SpanValue(BUK_FUNZIONIBOOK_SPAN_NUMEROPAGIN1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FUNZIONIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_FUNZIONIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_FUNZIONIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_FUNZIONIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_FUNZIONIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_FUNZIONIBOOK_OnPreview()
  {
    PreviewBook = BKW_FUNZIONIBOOK;
    SetRD();
  }

  private void BUK_SERVIZIBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SERVIZIBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SERVIZIBOOK_SEC_REPORTHEADE1)
    {
    }
    if (SectionID==BUK_SERVIZIBOOK_SEC_TITOLOHEADE1)
    {
      BUK_SERVIZIBOOK.set_SpanValue(BUK_SERVIZIBOOK_SPAN_SOTTOTITOLO1, new IDVariant(IDL.Add((new IDVariant("Funzione:")), IDL.Add((new IDVariant(" ")), BUK_SERVIZIBOOK.GetReportColumn(BUK_SERVIZIBOOK_RPT_NEWREPORT, "SERVFUNZDESC")))));
    }
    if (SectionID==BUK_SERVIZIBOOK_SEC_PAGEHEADER1)
    {
    }
    if (SectionID==BUK_SERVIZIBOOK_SEC_DETAIL1)
    {
    }
    if (SectionID==BUK_SERVIZIBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_SERVIZIBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_SERVIZIBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SERVIZIBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SERVIZIBOOK_MST_SERVBOOKPAGE)
    {
      BUK_SERVIZIBOOK.set_SpanValue(BUK_SERVIZIBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SERVIZIBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_SERVIZIBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_SERVIZIBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SERVIZIBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SERVIZIBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SERVIZIBOOK_OnPreview()
  {
    PreviewBook = BKW_SERVIZIBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FUNZIONI_Init()
  {

    PAN_FUNZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FUNZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FUNZIONI.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_FUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, "EC0DE639-BBA6-40E1-B61C-B767C740D4C7");
    PAN_FUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, "Funzione");
    PAN_FUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, "");
    PAN_FUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_FUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_FUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, "C963C69A-71CE-4794-8D3B-93E2B370D2E6");
    PAN_FUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, "Descrizione");
    PAN_FUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, "");
    PAN_FUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.VIS_NORMALFIELDS);
    PAN_FUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, "08708624-4308-4699-8F57-5E4CC2BDFC95");
    PAN_FUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, "DATA INSERIMENTO");
    PAN_FUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, "");
    PAN_FUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.VIS_NORMFIELPADR);
    PAN_FUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, "436C954F-34A5-4847-BC6B-AE7E6C5C79BE");
    PAN_FUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, "UTENTE INSERIMENTO");
    PAN_FUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, "");
    PAN_FUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.VIS_NORMFIELPADR);
    PAN_FUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, "3212D909-2F1F-4622-86CC-B793FDCB8AA3");
    PAN_FUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, "UTENTE ULTIMO AGG");
    PAN_FUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, "");
    PAN_FUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_FUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FUNZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, "A3DE2FC0-A46C-4A30-A92C-34D5BECC0FD6");
    PAN_FUNZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, "DATA ULTIMO AGG");
    PAN_FUNZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, "");
    PAN_FUNZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.VIS_NORMFIELPADR);
    PAN_FUNZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FUNZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_LIST, 60);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_LIST, "Funzione");
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_FORM, 4, 4, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_FORM, 88);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_FORM, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_FUNZIONE1, MyGlb.PANEL_FORM, "Funzione");
    PAN_FUNZIONI.SetFieldPage(PFL_FUNZIONI_FUNZIONE1, -1, -1);
    PAN_FUNZIONI.SetFieldPanel(PFL_FUNZIONI_FUNZIONE1, PPQRY_FUNZIONI1, "A.FUNZIONE", "FUNZIONE", 1, 2, 0, -13997);
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, 60, 36, 496, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, 76);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, 4, 28, 488, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, 88);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, 2);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DESCRIZIONE1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_FUNZIONI.SetFieldPage(PFL_FUNZIONI_DESCRIZIONE1, -1, -1);
    PAN_FUNZIONI.SetFieldPanel(PFL_FUNZIONI_DESCRIZIONE1, PPQRY_FUNZIONI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_LIST, 284, 244, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_LIST, 108);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_LIST, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_FORM, 4, 64, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_FORM, 108);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_FORM, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAINSERIM1, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_FUNZIONI.SetFieldPage(PFL_FUNZIONI_DATAINSERIM1, -1, -1);
    PAN_FUNZIONI.SetFieldPanel(PFL_FUNZIONI_DATAINSERIM1, PPQRY_FUNZIONI1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_LIST, 20, 244, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_LIST, 120);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_LIST, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_FORM, 4, 88, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_FORM, 120);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_FORM, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTEINSER1, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_FUNZIONI.SetFieldPage(PFL_FUNZIONI_UTENTEINSER1, -1, -1);
    PAN_FUNZIONI.SetFieldPanel(PFL_FUNZIONI_UTENTEINSER1, PPQRY_FUNZIONI1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_LIST, 28, 268, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_LIST, 112);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_LIST, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_FORM, 4, 112, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_FORM, 112);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_FORM, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_UTENTULTIAG1, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_FUNZIONI.SetFieldPage(PFL_FUNZIONI_UTENTULTIAG1, -1, -1);
    PAN_FUNZIONI.SetFieldPanel(PFL_FUNZIONI_UTENTULTIAG1, PPQRY_FUNZIONI1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_LIST, 264, 272, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_LIST, 100);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_LIST, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_FUNZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_FORM, 4, 136, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FUNZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_FORM, 100);
    PAN_FUNZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_FORM, 1);
    PAN_FUNZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FUNZIONI_DATAULTIMAG1, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_FUNZIONI.SetFieldPage(PFL_FUNZIONI_DATAULTIMAG1, -1, -1);
    PAN_FUNZIONI.SetFieldPanel(PFL_FUNZIONI_DATAULTIMAG1, PPQRY_FUNZIONI1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_FUNZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FUNZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FUNZIONI.SetIMDB(IMDB, "PQRY_FUNZIONI1", true);
    PAN_FUNZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "FUNZIONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_FUNZIONI.SetQuery(PPQRY_FUNZIONI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FUNZIONI A ");
    PAN_FUNZIONI.SetQuery(PPQRY_FUNZIONI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FUNZIONE > 0) ");
    PAN_FUNZIONI.SetQuery(PPQRY_FUNZIONI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FUNZIONI.SetQuery(PPQRY_FUNZIONI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FUNZIONI.SetQuery(PPQRY_FUNZIONI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.FUNZIONE ");
    PAN_FUNZIONI.SetQuery(PPQRY_FUNZIONI1, 5, SQL, -1, "");
    PAN_FUNZIONI.SetQueryDB(PPQRY_FUNZIONI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FUNZIONI.SetMasterTable(0, "FUNZIONI");
    PAN_FUNZIONI.AddToSortList(PFL_FUNZIONI_FUNZIONE1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FUNZIONI.Status() == 2)
    {
      int oldListQBE = PAN_FUNZIONI.iUseListQBE;
      PAN_FUNZIONI.iUseListQBE = 0;
      PAN_FUNZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FUNZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_FUNZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_SERVIZI_Init()
  {

    PAN_SERVIZI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SERVIZI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_SERVIZI.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, "79355536-E989-4E18-B6CD-2BA6690FDDE6");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, "Servizio");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, "2969698D-1C25-4117-B3A4-02773DB19A1F");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, "Descrizione");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, "627ABE5D-35C3-460F-9AAD-693DABBA659C");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, "Responsabile");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, "7AC15ED8-C84B-4A6A-8A12-A321AC325096");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, "Suddivisione Cert. Cons.");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.VIS_CHECKSTYLE);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, "3E648981-4B36-4098-BB44-5C759CCDA22A");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, MyGlb.VIS_ETICHEGRASSE);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, "ED0E14B2-F0A4-469D-8F40-171E2B64ADC5");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, "FUNZIONE");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, "AE1A1EBE-4A95-48A7-937C-9283D115804E");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, "498B619C-CDD5-4766-BE27-4ED7E47BEB48");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, "AE9204E6-A8F6-4729-B428-75D1FA245D32");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SERVIZI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, "B38BA097-36AF-47E3-A6C5-FD311E431673");
    PAN_SERVIZI.set_Header(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_SERVIZI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, "");
    PAN_SERVIZI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_SERVIZI.SetFlags(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_SERVIZI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, 0, 84, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, 56);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_LIST, "Servizio");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, 4, 28, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, 112);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_SERVIZIO, MyGlb.PANEL_FORM, "Servizio");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_SERVIZIO, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_SERVIZIO, PPQRY_SERVIZI1, "A.SERVIZIO", "SERVIZIO", 1, 2, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, 72, 84, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 512, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, 112);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_DESCRIZIONE, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_DESCRIZIONE, PPQRY_SERVIZI1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_LIST, 456, 84, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_LIST, 84);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_LIST, "Responsabile");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_FORM, 4, 76, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_FORM, 112);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_RESPONSABILE, MyGlb.PANEL_FORM, "Responsabile");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_RESPONSABILE, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_RESPONSABILE, PPQRY_SERVIZI1, "A.RESPONSABILE", "RESPONSABILE", 5, 40, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_LIST, 720, 84, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_LIST, 96);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_LIST, "Suddivisione Cert. Cons.");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_FORM, 4, 100, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_FORM, 112);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_SUDDCERTCONS, MyGlb.PANEL_FORM, "Suddiv. Cert Cons");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_SUDDCERTCONS, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_SUDDCERTCONS, PPQRY_SERVIZI1, "A.CERTIFICATO_CC", "CERTIFICATO_CC", 5, 2, 0, -13997);
    PAN_SERVIZI.SetValueListItem(PFL_SERVIZI_SUDDCERTCONS, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SERVIZI.SetValueListItem(PFL_SERVIZI_SUDDCERTCONS, (new IDVariant()), "Null", "", "", -1);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, MyGlb.PANEL_LIST, 4, 8, 796, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, MyGlb.PANEL_FORM, 76, 8, 704, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_INTESTALABEL, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_INTESTALABEL, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_INTESTALABEL, -1, "", "INTESTALABEL", 0, 0, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, 60);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, 60);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_FUNZIONE, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_FUNZIONE, PPQRY_SERVIZI1, "A.FUNZIONE", "FUNZIONE", 1, 2, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_LIST, 4, 288, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSERIMENTO");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 124, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_UTENTEINSERI, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_UTENTEINSERI, PPQRY_SERVIZI1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_LIST, 264, 288, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_LIST, "DT. INSERIMENTO");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 148, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_DATAINSERIME, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_DATAINSERIME, PPQRY_SERVIZI1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_LIST, 14, 312, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULTIMO AGG");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 172, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_UTENTULTIAGG, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_UTENTULTIAGG, PPQRY_SERVIZI1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_LIST, 263, 312, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DT. ULTIMO AGG");
    PAN_SERVIZI.SetRect(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 196, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SERVIZI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_SERVIZI.SetNumRow(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_SERVIZI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SERVIZI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_SERVIZI.SetFieldPage(PFL_SERVIZI_DATAULTIMAGG, -1, -1);
    PAN_SERVIZI.SetFieldPanel(PFL_SERVIZI_DATAULTIMAGG, PPQRY_SERVIZI1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_SERVIZI_InitQueries()
  {
    StringBuffer SQL;

    PAN_SERVIZI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_SERVIZI.SetIMDB(IMDB, "PQRY_SERVIZI1", true);
    PAN_SERVIZI.set_SetString(MyGlb.MASTER_ROWNAME, "SERVIZI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.SERVIZIO as SERVIZIO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.RESPONSABILE as RESPONSABILE, ");
    SQL.append("  A.CERTIFICATO_CC as CERTIFICATO_CC, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  SERVIZI A ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.FUNZIONE = ~~PQRY_FUNZIONI1.FUNZIONE~~) ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.SERVIZIO ");
    PAN_SERVIZI.SetQuery(PPQRY_SERVIZI1, 5, SQL, -1, "");
    PAN_SERVIZI.SetQueryDB(PPQRY_SERVIZI1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SERVIZI.SetMasterTable(0, "SERVIZI");
    PAN_SERVIZI.AddToSortList(PFL_SERVIZI_SERVIZIO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SERVIZI.Status() == 2)
    {
      int oldListQBE = PAN_SERVIZI.iUseListQBE;
      PAN_SERVIZI.iUseListQBE = 0;
      PAN_SERVIZI.PanelCommand(Glb.PCM_SEARCH);
      PAN_SERVIZI.PanelCommand(Glb.PCM_FIND);
      PAN_SERVIZI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE_Init()
  {
    BUK_FUNZIONIBOOK.InitMastro(BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE, "E54AD13E-56E0-46E7-AAD7-46F96F1EB836");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE, "FUNZBOOKPAGE");
    BUK_FUNZIONIBOOK.InitMastroBox(BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE, BUK_FUNZIONIBOOK_RPTBOX_NUMEROPAGIN1, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_NUMEROPAGIN1, "19CA3191-C886-4413-A1A4-9A861330947D");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_NUMEROPAGIN1, BUK_FUNZIONIBOOK_SPAN_NUMEROPAGIN1, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_NUMEROPAGIN1, "340E6037-A090-412F-A423-8E7F5B5CF12C");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_NUMEROPAGIN1, "NUMEROPAGIN1");
    BUK_FUNZIONIBOOK.InitMastroBox(BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE, BUK_FUNZIONIBOOK_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 1600, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_PAGEHEADER1, "1C565629-9A7D-4108-86FC-DA9964458980");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_FUNZIONIBOOK.InitMastroBox(BUK_FUNZIONIBOOK_MST_FUNZBOOKPAGE, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1, 1000, 2700, 19000, 25900, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1, "5F02FE69-A1A4-46A2-8291-2E90C3C6D9E5");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_FUNZIONIBOOK_RPT_NEWREPORT_InitQuery() { BUK_FUNZIONIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_FUNZIONIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FUNZIONE as FUNZIOFUNZIO, ");
      SQL.append("  A.DESCRIZIONE as FUNZIODESCRI, ");
      SQL.append("  B.SERVIZIO as FUNZSERVSERV, ");
      SQL.append("  B.DESCRIZIONE as FUNZSERVDESC, ");
      SQL.append("  B.RESPONSABILE as FUNZSERVRESP ");
      SQL.append("from ");
      SQL.append("  FUNZIONI A, ");
      SQL.append("  SERVIZI B ");
      SQL.append("where (A.FUNZIONE > 0) ");
      SQL.append("and   (B.FUNZIONE(+) = A.FUNZIONE) ");
      SQL.append("order by ");
      SQL.append("  A.FUNZIONE ");
      BUK_FUNZIONIBOOK.SetReportQuery(BUK_FUNZIONIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "96D9DDFB-B08B-4D3A-93FE-12A4BABCED6C");
      if (BUK_FUNZIONIBOOK.FindObjByID(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD) != null)
        BUK_FUNZIONIBOOK.AddReportGroup(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, "FUNZIOFUNZIO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_FUNZIONIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_FUNZIONIBOOK.InitReport(BUK_FUNZIONIBOOK_RPT_NEWREPORT, 196609);
    BUK_FUNZIONIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPT_NEWREPORT, "C01B25A8-E594-445B-BA5F-074E3EF77928");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_REPORTHEADER, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_REPORTHEADER, "70B920E4-2D14-48EC-BE7D-62A4B9C53B7D");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_TITOLO, 1400, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978689, "");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_TITOLO, BUK_FUNZIONIBOOK_RPTBOX_PAGEHEADER1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_TITOLO, "FF6785AA-6E98-46B2-9C26-4A61E9E9F3C2");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_TITOLO, "TITOLO");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_TITOLO, BUK_FUNZIONIBOOK_RPTBOX_TITOLO2, 0, 200, 19000, 900, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_TITOLO2, "F325F947-7779-4538-A057-9B0C44FC3060");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_TITOLO2, "TITOLO2");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_TITOLO2, BUK_FUNZIONIBOOK_SPAN_FUNZIOESERVI, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Funzioni e Servizi", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_FUNZIOESERVI, "25C2E76D-43C7-4EE9-8BB1-0D43182E2EEC");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_FUNZIOESERVI, "FUNZIOESERVI");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_PAGEHEADER, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_PAGEHEADER, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_PAGEHEADER, "BFC6E0AA-2D33-4AF6-8C49-08AC362AAF7D");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_PAGEHEADER, BUK_FUNZIONIBOOK_RPTBOX_FUNZIOHEADER, 0, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_FUNZIOHEADER, "434C3A67-3437-495F-B3C5-5826A756DE29");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_FUNZIOHEADER, "FUNZIOHEADER");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_FUNZIOHEADER, BUK_FUNZIONIBOOK_SPAN_FUNZIONE, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Funzione", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_FUNZIONE, "9009A87D-02C1-4365-B57E-3B74FAF52AAD");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_FUNZIONE, "FUNZIONE");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_PAGEHEADER, BUK_FUNZIONIBOOK_RPTBOX_DESCRIHEADE1, 3400, 0, 11200, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_DESCRIHEADE1, "3A7071CC-7221-4AA0-A678-CA87DCB129A3");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_DESCRIHEADE1, "DESCRIHEADE1");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_DESCRIHEADE1, BUK_FUNZIONIBOOK_SPAN_DESCRIZIONE1, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_DESCRIZIONE1, "59B04EB0-203F-40EA-905C-67FE473D6C01");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_PAGEHEADER, BUK_FUNZIONIBOOK_RPTBOX_SERVSERVHEAD, 1700, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_SERVSERVHEAD, "ABB35813-4237-4757-9C78-2DCD6B8BE1AF");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_SERVSERVHEAD, "SERVSERVHEAD");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_SERVSERVHEAD, BUK_FUNZIONIBOOK_SPAN_SERVIZSERVIZ, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Servizio", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_SERVIZSERVIZ, "DA75C3EE-27BA-4FE5-9ABB-080E995AB36B");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_SERVIZSERVIZ, "SERVIZSERVIZ");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_PAGEHEADER, BUK_FUNZIONIBOOK_RPTBOX_SERVRESPHEAD, 14700, 0, 4300, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_SERVRESPHEAD, "B708A833-A4ED-44DE-AB97-A2AD7D5120BE");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_SERVRESPHEAD, "SERVRESPHEAD");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_SERVRESPHEAD, BUK_FUNZIONIBOOK_SPAN_SERVIZRESPON, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Responsabile", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_SERVIZRESPON, "DBCAEFA0-5023-4A87-8BE2-BCEF38FE408C");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_SERVIZRESPON, "SERVIZRESPON");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, 700, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 9502721, "FUNZIOFUNZIO");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, "16BA6409-1311-40C0-BD35-8B4668A658CB");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, "FUNZGROUHEAD");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, BUK_FUNZIONIBOOK_RPTBOX_FUNZIONE, 0, 100, 1600, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_FUNZIONE, "65F83D1C-740C-456B-9286-442EB536437C");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_FUNZIONE, "FUNZIONE");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_FUNZIONE, BUK_FUNZIONIBOOK_SPAN_FUFUFUSEFUBO, MyGlb.VIS_CAMSENBORCEN, 1, 2, 0, 271384705, "Brief description of field content.", "::FUNZIOFUNZIO", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_FUFUFUSEFUBO, "BE0A4B7F-8FD5-40C3-AA9D-03AEBB772E0B");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_FUFUFUSEFUBO, "FUFUFUSEFUBO");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, BUK_FUNZIONIBOOK_RPTBOX_DESCRIZIONE2, 3400, 100, 11200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_DESCRIZIONE2, "905F22D8-982D-43A5-9364-63E80E469F7D");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_DESCRIZIONE2, "DESCRIZIONE2");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_DESCRIZIONE2, BUK_FUNZIONIBOOK_SPAN_FUDEFUSEFUBO, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::FUNZIODESCRI", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_FUDEFUSEFUBO, "DD8F202A-7797-49BC-A251-4F80744D080A");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_FUDEFUSEFUBO, "FUDEFUSEFUBO");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 10027009, "");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_DETAIL, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_DETAIL, "388575EF-4C10-45F8-A65C-751B0F10D275");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_DETAIL, "DETAIL");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_DETAIL, BUK_FUNZIONIBOOK_RPTBOX_SERVIZDESCRI, 3400, 100, 11200, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_SERVIZDESCRI, "9838780E-E682-45FF-967D-4F843D4B2B9F");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_SERVIZDESCRI, "SERVIZDESCRI");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_SERVIZDESCRI, BUK_FUNZIONIBOOK_SPAN_FUSEDEFUSEFB, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::FUNZSERVDESC", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_FUSEDEFUSEFB, "FACA7FC0-DC24-49B9-8F89-2E4F85935E2B");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_FUSEDEFUSEFB, "FUSEDEFUSEFB");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_DETAIL, BUK_FUNZIONIBOOK_RPTBOX_SERVIZSERVIZ, 1700, 100, 1600, 400, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_SERVIZSERVIZ, "9F80B968-A08A-451C-8FF5-F3EBBCD02123");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_SERVIZSERVIZ, "SERVIZSERVIZ");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_SERVIZSERVIZ, BUK_FUNZIONIBOOK_SPAN_FUSESEFUSEFB, MyGlb.VIS_CAMSENBORCEN, 1, 2, 0, 271384705, "Brief description of field content.", "::FUNZSERVSERV", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_FUSESEFUSEFB, "3244D795-2998-445F-8065-575C8B1681B7");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_FUSESEFUSEFB, "FUSESEFUSEFB");
    BUK_FUNZIONIBOOK.InitReportBox(BUK_FUNZIONIBOOK_SEC_DETAIL, BUK_FUNZIONIBOOK_RPTBOX_SERVIZRESPON, 14700, 100, 4300, 400, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_RPTBOX_SERVIZRESPON, "9C873EC7-0CE2-426C-90D6-DE041E35F1D6");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_RPTBOX_SERVIZRESPON, "SERVIZRESPON");
    BUK_FUNZIONIBOOK.InitBoxSpan(BUK_FUNZIONIBOOK_RPTBOX_SERVIZRESPON, BUK_FUNZIONIBOOK_SPAN_FUSEREFUSEFB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::FUNZSERVRESP", 1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SPAN_FUSEREFUSEFB, "F139695A-974B-4AF0-8E4A-99BEC24D71E2");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SPAN_FUSEREFUSEFB, "FUSEREFUSEFB");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_FUNZGROUFOOT, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8912897, "FUNZIOFUNZIO");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_FUNZGROUFOOT, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_FUNZGROUFOOT, "DC010F84-7890-4615-AC36-719808485050");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_FUNZGROUFOOT, "FUNZGROUFOOT");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_PAGEFOOTER, 300, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_PAGEFOOTER, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_PAGEFOOTER, "5374379B-22F5-4B7B-BA6A-A713D985CAF8");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_FUNZIONIBOOK.InitSection(BUK_FUNZIONIBOOK_RPT_NEWREPORT, BUK_FUNZIONIBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_FUNZIONIBOOK.SetSectionRendersInto(BUK_FUNZIONIBOOK_SEC_REPORTFOOTER, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
    BUK_FUNZIONIBOOK.SetRTCGuid(BUK_FUNZIONIBOOK_SEC_REPORTFOOTER, "BDC23F08-B5C9-40CD-8971-01124F59BA18");
    BUK_FUNZIONIBOOK.SetObjCode(BUK_FUNZIONIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_FUNZIONIBOOK.AddReportGroup(BUK_FUNZIONIBOOK_SEC_FUNZGROUHEAD, "FUNZIOFUNZIO");
    BUK_FUNZIONIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_FUNZIONIBOOK_InitLinks()
  {
    BUK_FUNZIONIBOOK.SetBoxNextBox(BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1, BUK_FUNZIONIBOOK_RPTBOX_PAGEBODY1);
  }

  private void BUK_SERVIZIBOOK_MST_SERVBOOKPAGE_Init()
  {
    BUK_SERVIZIBOOK.InitMastro(BUK_SERVIZIBOOK_MST_SERVBOOKPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_MST_SERVBOOKPAGE, "005DD23D-91DC-436A-BD41-27BEC092F4AD");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_MST_SERVBOOKPAGE, "SERVBOOKPAGE");
    BUK_SERVIZIBOOK.InitMastroBox(BUK_SERVIZIBOOK_MST_SERVBOOKPAGE, BUK_SERVIZIBOOK_RPTBOX_NUMEROPAGINA, 18400, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_NUMEROPAGINA, "42A3540B-1008-445C-969D-2F873613C160");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_NUMEROPAGINA, BUK_SERVIZIBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_NUMEROPAGINA, "C7A94A57-39E9-46BF-9624-B172707133BC");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_SERVIZIBOOK.InitMastroBox(BUK_SERVIZIBOOK_MST_SERVBOOKPAGE, BUK_SERVIZIBOOK_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2100, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_PAGEHEADER, "6DB4D950-7A2B-45DA-9282-0BAABED5C2B3");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SERVIZIBOOK.InitMastroBox(BUK_SERVIZIBOOK_MST_SERVBOOKPAGE, BUK_SERVIZIBOOK_RPTBOX_PAGEBODY, 1000, 3300, 19000, 25300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_PAGEBODY, "A35A8477-FC95-42C6-8221-6265F756FB00");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
  }

  private void BUK_SERVIZIBOOK_RPT_NEWREPORT_InitQuery() { BUK_SERVIZIBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_SERVIZIBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.FUNZIONE as SERVIZFUNZIO, ");
      SQL.append("  A.SERVIZIO as SERVIZSERVIZ, ");
      SQL.append("  A.DESCRIZIONE as SERVIZDESCRI, ");
      SQL.append("  A.RESPONSABILE as SERVIZRESPON, ");
      SQL.append("  A.CERTIFICATO_CC as SERSUDCERCON, ");
      SQL.append("  B.DESCRIZIONE as SERVFUNZDESC ");
      SQL.append("from ");
      SQL.append("  SERVIZI A, ");
      SQL.append("  FUNZIONI B ");
      SQL.append("where (A.FUNZIONE = ~~PQRY_FUNZIONI1.FUNZIONE~~) ");
      SQL.append("and   (B.FUNZIONE(+) = A.FUNZIONE) ");
      SQL.append("order by ");
      SQL.append("  A.SERVIZIO ");
      BUK_SERVIZIBOOK.SetReportQuery(BUK_SERVIZIBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "7B714B03-3177-4FC6-B9B5-E209132D9161");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SERVIZIBOOK_RPT_NEWREPORT_Init()
  {
    BUK_SERVIZIBOOK.InitReport(BUK_SERVIZIBOOK_RPT_NEWREPORT, 196609);
    BUK_SERVIZIBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPT_NEWREPORT, "CEAF476C-AC6C-476A-9356-348261182231");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_SERVIZIBOOK.InitSection(BUK_SERVIZIBOOK_RPT_NEWREPORT, BUK_SERVIZIBOOK_SEC_REPORTHEADE1, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SERVIZIBOOK.SetSectionRendersInto(BUK_SERVIZIBOOK_SEC_REPORTHEADE1, BUK_SERVIZIBOOK_RPTBOX_PAGEBODY);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SEC_REPORTHEADE1, "87C98CFB-A88B-4587-BBD7-C554CBCE0D55");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SEC_REPORTHEADE1, "REPORTHEADE1");
    BUK_SERVIZIBOOK.InitSection(BUK_SERVIZIBOOK_RPT_NEWREPORT, BUK_SERVIZIBOOK_SEC_TITOLOHEADE1, 2100, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 10027265, "");
    BUK_SERVIZIBOOK.SetSectionRendersInto(BUK_SERVIZIBOOK_SEC_TITOLOHEADE1, BUK_SERVIZIBOOK_RPTBOX_PAGEHEADER);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SEC_TITOLOHEADE1, "5C9046FF-0402-49AA-8E96-19BBC8653182");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SEC_TITOLOHEADE1, "TITOLOHEADE1");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_TITOLOHEADE1, BUK_SERVIZIBOOK_RPTBOX_TITOLO1, 100, 100, 18800, 700, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_TITOLO1, "07D782F7-52C9-426A-B4B2-C45EB4EA7934");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_TITOLO1, "TITOLO1");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_TITOLO1, BUK_SERVIZIBOOK_SPAN_RICLASSIFIC1, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Servizi", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_RICLASSIFIC1, "A4B512AC-E502-47F4-A52B-ABD95E5F6E3F");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_RICLASSIFIC1, "RICLASSIFIC1");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_TITOLOHEADE1, BUK_SERVIZIBOOK_RPTBOX_SOTTOTITOLO, 0, 800, 19000, 1300, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_SOTTOTITOLO, "F3CF4CF6-35C2-4916-BAD1-0B8C4E4F2508");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_SOTTOTITOLO, "SOTTOTITOLO");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_SOTTOTITOLO, BUK_SERVIZIBOOK_SPAN_SOTTOTITOLO1, MyGlb.VIS_TITOLOREPORT, 5, 150, 0, 271319169, "", "", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_SOTTOTITOLO1, "507D43C7-2304-4D52-86AB-CF19D7A40BD3");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_SOTTOTITOLO1, "SOTTOTITOLO1");
    BUK_SERVIZIBOOK.InitSection(BUK_SERVIZIBOOK_RPT_NEWREPORT, BUK_SERVIZIBOOK_SEC_PAGEHEADER1, 500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SERVIZIBOOK.SetSectionRendersInto(BUK_SERVIZIBOOK_SEC_PAGEHEADER1, BUK_SERVIZIBOOK_RPTBOX_PAGEBODY);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SEC_PAGEHEADER1, "8D439CB9-9E1C-4783-BD60-5DD261D7C4C5");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SEC_PAGEHEADER1, "PAGEHEADER1");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_PAGEHEADER1, BUK_SERVIZIBOOK_RPTBOX_SERVIZHEADER, 0, 0, 1700, 400, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_SERVIZHEADER, "32ABF2E1-2A45-4205-8D09-9AB9CA6451DF");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_SERVIZHEADER, "SERVIZHEADER");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_SERVIZHEADER, BUK_SERVIZIBOOK_SPAN_SERVIZIO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384705, "", "Servizio", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_SERVIZIO, "6AA71123-A264-4AE1-B315-373D3E803466");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_SERVIZIO, "SERVIZIO");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_PAGEHEADER1, BUK_SERVIZIBOOK_RPTBOX_DESCRIHEADER, 1800, 0, 10890, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_DESCRIHEADER, "45146DB6-EFEA-4886-A183-BE711F9391E8");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_DESCRIHEADER, BUK_SERVIZIBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Descrizione", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_DESCRIZIONE, "DE65542F-D261-473C-AFB4-AFE507444C17");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_PAGEHEADER1, BUK_SERVIZIBOOK_RPTBOX_RESPONHEADER, 12800, 0, 6185, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_RESPONHEADER, "0B25EE67-18EA-4DBA-91EC-672F78402DCD");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_RESPONHEADER, "RESPONHEADER");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_RESPONHEADER, BUK_SERVIZIBOOK_SPAN_RESPONSABILE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384705, "", "Responsabile", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_RESPONSABILE, "16854D85-C754-4994-BCD2-6664BA1AF0B2");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_RESPONSABILE, "RESPONSABILE");
    BUK_SERVIZIBOOK.InitSection(BUK_SERVIZIBOOK_RPT_NEWREPORT, BUK_SERVIZIBOOK_SEC_DETAIL1, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SERVIZIBOOK.SetSectionRendersInto(BUK_SERVIZIBOOK_SEC_DETAIL1, BUK_SERVIZIBOOK_RPTBOX_PAGEBODY);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SEC_DETAIL1, "65D33991-DF3D-42A2-AABD-834CE20C05EE");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SEC_DETAIL1, "DETAIL1");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_DETAIL1, BUK_SERVIZIBOOK_RPTBOX_SERVIZIO, 0, 0, 1700, 500, 0, 1, 1, MyGlb.VIS_CAMSENBORCEN, 983041, 322, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_SERVIZIO, "0E88FA52-09BD-40F6-8C9F-3D6112A90D82");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_SERVIZIO, "SERVIZIO");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_SERVIZIO, BUK_SERVIZIBOOK_SPAN_SESEFUSESEBO, MyGlb.VIS_CAMSENBORCEN, 1, 2, 0, 271384705, "Brief description of field content.", "::SERVIZSERVIZ", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_SESEFUSESEBO, "BDCA6558-9F38-4C5E-BEB0-6068B3501707");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_SESEFUSESEBO, "SESEFUSESEBO");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_DETAIL1, BUK_SERVIZIBOOK_RPTBOX_DESCRIZIONE1, 1800, 0, 10900, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_DESCRIZIONE1, "7B50AB29-5666-41D3-8D43-AC70634498C1");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_DESCRIZIONE1, "DESCRIZIONE1");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_DESCRIZIONE1, BUK_SERVIZIBOOK_SPAN_SEDEFUSESEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 140, 0, 271384705, "Brief description of field content.", "::SERVIZDESCRI", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_SEDEFUSESEBO, "5808032C-41B6-4B1A-A7AE-C533140CC607");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_SEDEFUSESEBO, "SEDEFUSESEBO");
    BUK_SERVIZIBOOK.InitReportBox(BUK_SERVIZIBOOK_SEC_DETAIL1, BUK_SERVIZIBOOK_RPTBOX_RESPONSABILE, 12800, 0, 6185, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_RPTBOX_RESPONSABILE, "49B907D1-EDC3-443A-A93A-9C0CE6E41DF3");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_RPTBOX_RESPONSABILE, "RESPONSABILE");
    BUK_SERVIZIBOOK.InitBoxSpan(BUK_SERVIZIBOOK_RPTBOX_RESPONSABILE, BUK_SERVIZIBOOK_SPAN_SEREFUSESEBO, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::SERVIZRESPON", 1);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SPAN_SEREFUSESEBO, "756D5008-1D89-4B79-AA9D-CBB61C7EDB24");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SPAN_SEREFUSESEBO, "SEREFUSESEBO");
    BUK_SERVIZIBOOK.InitSection(BUK_SERVIZIBOOK_RPT_NEWREPORT, BUK_SERVIZIBOOK_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_SERVIZIBOOK.SetSectionRendersInto(BUK_SERVIZIBOOK_SEC_PAGEFOOTER, BUK_SERVIZIBOOK_RPTBOX_PAGEBODY);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SEC_PAGEFOOTER, "9151FB13-EF2A-4F43-A34B-F8898FC26218");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_SERVIZIBOOK.InitSection(BUK_SERVIZIBOOK_RPT_NEWREPORT, BUK_SERVIZIBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_SERVIZIBOOK.SetSectionRendersInto(BUK_SERVIZIBOOK_SEC_REPORTFOOTER, BUK_SERVIZIBOOK_RPTBOX_PAGEBODY);
    BUK_SERVIZIBOOK.SetRTCGuid(BUK_SERVIZIBOOK_SEC_REPORTFOOTER, "5A523B91-6878-481B-A4D4-CEED53B6F5A4");
    BUK_SERVIZIBOOK.SetObjCode(BUK_SERVIZIBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SERVIZIBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_SERVIZIBOOK_InitLinks()
  {
    BUK_SERVIZIBOOK.SetBoxNextBox(BUK_SERVIZIBOOK_RPTBOX_PAGEBODY, BUK_SERVIZIBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FUNZIONI) PAN_FUNZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FUNZIONI) PAN_FUNZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FUNZIONI) PAN_FUNZIONI_DynamicProperties();
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FUNZIONI) PAN_FUNZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FUNZIONI) PAN_FUNZIONI_OnPanelCommand(Command, Cancel, UserOp);
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_FUNZIONI) PAN_FUNZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_SERVIZI) PAN_SERVIZI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
  }  
  
  public void OnDownloadBlob(IDPanel SrcObj, IDVariant Cancel, IDVariant Column, IDVariant Size, IDVariant Extension, IDVariant Inline, IDVariant Filename, IDVariant MimeType)
  {
  }

  public void OnPrint(IDPanel SrcObj, IDVariant Cancel, IDVariant Dest, IDVariant SetWC)
  {
  }  
    
  public void TabClick(OTabView SrcObj, IDVariant PreviousPage, IDVariant Cancel)
  {
    if (SrcObj == TAB_FUNSERTABVIE) TAB_FUNSERTABVIE_Click(PreviousPage, Cancel);
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
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_OnFormattingSection(SectionID);
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_OnAfterFormattingSection(SectionID);
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_OnFormattingPage(PageID);
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_OnConnecting(DBConn);
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_Activated(ObjID, BoxName);
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_OnIMDBUpdate(ReportIdx);
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_FUNZIONIBOOK) BUK_FUNZIONIBOOK_OnPreview();
    if (SrcObj == BKW_SERVIZIBOOK) BUK_SERVIZIBOOK_OnPreview();
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
