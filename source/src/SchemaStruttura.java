// **********************************************
// Schema Struttura
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SchemaStruttura extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_SCHESTRUBILA_INSERIMENTO = 0;
  private static int GRP_SCHESTRUBILA_AGGIORNAMENT = 1;

  private static int PFL_SCHESTRUBILA_SCHEMSTRUTID = 0;
  private static int PFL_SCHESTRUBILA_PARTE = 1;
  private static int PFL_SCHESTRUBILA_LIVELLO = 2;
  private static int PFL_SCHESTRUBILA_DESCRIZIONE = 3;
  private static int PFL_SCHESTRUBILA_CHIAVE = 4;
  private static int PFL_SCHESTRUBILA_FORMATO = 5;
  private static int PFL_SCHESTRUBILA_DESCRILIVELL = 6;
  private static int PFL_SCHESTRUBILA_UTENTE1 = 7;
  private static int PFL_SCHESTRUBILA_DATA1 = 8;
  private static int PFL_SCHESTRUBILA_UTENTE = 9;
  private static int PFL_SCHESTRUBILA_DATA = 10;
  private static int PFL_SCHESTRUBILA_ESERCIZIO = 11;

  private static int PPQRY_BILSCHEMSTR1 = 0;

  private static int PPQRY_DUAL1 = 1;
  private static int PPQRY_DUAL = 2;


  IDPanel PAN_SCHESTRUBILA;
  CIDREObj BUK_SCHSTRBILBOO;
  OBook BKW_SCHSTRBILBOO;
  //
  // Template Pages constants
  private static int BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA = 1;
  private static int BUK_SCHSTRBILBOO_RPTBOX_PAGEHEADER = 2;
  private static int BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY = 3;
  private static int BUK_SCHSTRBILBOO_RPTBOX_PAGEFOOTER = 4;
  private static int BUK_SCHSTRBILBOO_RPTBOX_PAG = 5;
  private static int BUK_SCHSTRBILBOO_SPAN_CPTSSSBBSSPN = 6;

  //
  // Reports constants
  private static int BUK_SCHSTRBILBOO_RPT_NEWREPORT = 7;
  private static int BUK_SCHSTRBILBOO_SEC_REPORTHEADER = 8;
  private static int BUK_SCHSTRBILBOO_SEC_PAGEHEADER = 9;
  private static int BUK_SCHSTRBILBOO_RPTBOX_ESHEADER = 10;
  private static int BUK_SCHSTRBILBOO_SPAN_PARTE = 11;
  private static int BUK_SCHSTRBILBOO_RPTBOX_LIVELLHEADER = 12;
  private static int BUK_SCHSTRBILBOO_SPAN_LIVELLO = 13;
  private static int BUK_SCHSTRBILBOO_RPTBOX_DESCRIHEADER = 14;
  private static int BUK_SCHSTRBILBOO_SPAN_DESCRIZIONE = 15;
  private static int BUK_SCHSTRBILBOO_RPTBOX_SECHIAVHEADE = 16;
  private static int BUK_SCHSTRBILBOO_SPAN_CHIAVE = 17;
  private static int BUK_SCHSTRBILBOO_RPTBOX_FORMATHEADER = 18;
  private static int BUK_SCHSTRBILBOO_SPAN_FORMATO = 19;
  private static int BUK_SCHSTRBILBOO_RPTBOX_DESCLIVEHEAD = 20;
  private static int BUK_SCHSTRBILBOO_SPAN_DESCRILIVELL = 21;
  private static int BUK_SCHSTRBILBOO_RPTBOX_TITOLO = 22;
  private static int BUK_SCHSTRBILBOO_SPAN_SCHESTRUBILA = 23;
  private static int BUK_SCHSTRBILBOO_SEC_DETAIL = 24;
  private static int BUK_SCHSTRBILBOO_RPTBOX_ES = 25;
  private static int BUK_SCHSTRBILBOO_SPAN_REPASCSTSSBB = 26;
  private static int BUK_SCHSTRBILBOO_RPTBOX_LIVELLO = 27;
  private static int BUK_SCHSTRBILBOO_SPAN_RELISCSTSSBB = 28;
  private static int BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE = 29;
  private static int BUK_SCHSTRBILBOO_SPAN_REDESCSTSSBB = 30;
  private static int BUK_SCHSTRBILBOO_RPTBOX_SECHIAVE = 31;
  private static int BUK_SCHSTRBILBOO_SPAN_SECHIAVE = 32;
  private static int BUK_SCHSTRBILBOO_RPTBOX_FORMATO = 33;
  private static int BUK_SCHSTRBILBOO_SPAN_REFOSCSTSSBB = 34;
  private static int BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL = 35;
  private static int BUK_SCHSTRBILBOO_SPAN_REDELISSSSBB = 36;
  private static int BUK_SCHSTRBILBOO_SEC_PAGEFOOTER = 37;
  private static int BUK_SCHSTRBILBOO_SEC_REPORTFOOTER = 38;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_VARS(IMDB);
    //
    //
    Init_PQRY_BILSCHEMSTR1(IMDB);
    Init_PQRY_BILSCHEMSTRU(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_VARS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_VARS, 2);
    IMDB.set_TblCode(IMDBDef1.TBL_VARS, "TBL_VARS");
    IMDB.set_FldCode(IMDBDef1.TBL_VARS,IMDBDef1.FLD_VARS_NOMOGGBLOTOT, "NOMOGGBLOTOT");
    IMDB.SetFldParams(IMDBDef1.TBL_VARS,IMDBDef1.FLD_VARS_NOMOGGBLOTOT,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_VARS,IMDBDef1.FLD_VARS_NOMEOGGEERRM, "NOMEOGGEERRM");
    IMDB.SetFldParams(IMDBDef1.TBL_VARS,IMDBDef1.FLD_VARS_NOMEOGGEERRM,5,250,0);
    IMDB.TblAddNew(IMDBDef1.TBL_VARS, 0);
  }

  private static void Init_PQRY_BILSCHEMSTR1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_BILSCHEMSTR1, 12);
    IMDB.set_TblCode(IMDBDef8.PQRY_BILSCHEMSTR1, "PQRY_BILSCHEMSTR1");
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_SCHEMA_STRUTTURA_ID, "SCHEMA_STRUTTURA_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_SCHEMA_STRUTTURA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_LIVELLO, "LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_LIVELLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_SE_CHIAVE, "SE_CHIAVE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_SE_CHIAVE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_FORMATO, "FORMATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_FORMATO,1,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DESCRIZIONE_LIVELLO, "DESCRIZIONE_LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DESCRIZIONE_LIVELLO,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_DATA_ULTIMO_AGG,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTR1,IMDBDef8.PQSL_BILSCHEMSTR1_ESERCIZIO,1,4,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_BILSCHEMSTR1, 0);
  }

  private static void Init_PQRY_BILSCHEMSTRU(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_BILSCHEMSTRU, 11);
    IMDB.set_TblCode(IMDBDef8.PQRY_BILSCHEMSTRU, "PQRY_BILSCHEMSTRU");
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_SCHEMA_STRUTTURA_ID, "SCHEMA_STRUTTURA_ID");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_SCHEMA_STRUTTURA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_LIVELLO, "LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_LIVELLO,1,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_SE_CHIAVE, "SE_CHIAVE");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_SE_CHIAVE,5,2,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_FORMATO, "FORMATO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_FORMATO,1,1,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DESCRIZIONE_LIVELLO, "DESCRIZIONE_LIVELLO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DESCRIZIONE_LIVELLO,5,40,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef8.PQRY_BILSCHEMSTRU,IMDBDef8.PQSL_BILSCHEMSTRU_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_BILSCHEMSTRU, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SchemaStruttura(MyWebEntryPoint w, IMDBObj imdb)
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
  public SchemaStruttura()
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
    FormIdx = MyGlb.FRM_SCHEMASTRUTT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6259BBEC-D2FC-4084-8FC4-E7260781337E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 792;
    DesignHeight = 438;
    set_Caption(new IDVariant("Schema Struttura"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 792;
    Frames[1].Height = 412;
    Frames[1].Caption = "Schema Struttura Bilancio";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 412;
    PAN_SCHESTRUBILA = new IDPanel(w, this, 1, "PAN_SCHESTRUBILA");
    Frames[1].Content = PAN_SCHESTRUBILA;
    PAN_SCHESTRUBILA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_SCHESTRUBILA.VS = MainFrm.VisualStyleList;
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 792-MyGlb.PAN_OFFS_X, 412-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_SCHSTRBILBOO != null)
      PAN_SCHESTRUBILA.SetBook(BUK_SCHSTRBILBOO);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C30729CC-9D5F-4F4A-9953-1E53CF18FD3D");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 692, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_SCHESTRUBILA.InitStatus = 2;
    PAN_SCHESTRUBILA_Init();
    PAN_SCHESTRUBILA_InitFields();
    PAN_SCHESTRUBILA_InitQueries();
    BKW_SCHSTRBILBOO = new OBook(this);
    BUK_SCHSTRBILBOO = new CIDREObj(BKW_SCHSTRBILBOO);
    BKW_SCHSTRBILBOO.iGuid = "188DE6CD-92FD-44D6-B09A-186B8497B2E3";
    BKW_SCHSTRBILBOO.Code = "BUK_SCHSTRBILBOO";
    BKW_SCHSTRBILBOO.BookObj = BUK_SCHSTRBILBOO;
    BKW_SCHSTRBILBOO.InitDefMasks();
    BUK_SCHSTRBILBOO.InitBook(1, 1245185, "Schema Struttura Bilancio Book", IMDB, MainFrm.VisualStyleList);
    BUK_SCHSTRBILBOO.InitHTML();
    BUK_SCHSTRBILBOO.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SCHSTRBILBOO.Book.SetMainFrm(MainFrm);
    BUK_SCHSTRBILBOO.SetRTCGuid(0, "188DE6CD-92FD-44D6-B09A-186B8497B2E3");
    BUK_SCHSTRBILBOO.SetObjCode(0, "SCHSTRBILBOO");
    if (PAN_SCHESTRUBILA != null)
      PAN_SCHESTRUBILA.SetBook(BUK_SCHSTRBILBOO);
    BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA_Init();
    BUK_SCHSTRBILBOO_RPT_NEWREPORT_Init();
    BUK_SCHSTRBILBOO_InitLinks();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG102+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG109+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG102+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_DUPLSUNUOESE+BaseCmdLinIdx)
      {
        DuplicaSuNuovoEsercizioPROC();
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
      PAN_SCHESTRUBILA.UpdatePanel(MainFrm);
      // BUK_SCHSTRBILBOO.UpdateBook();
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
    if (Code.equals("BUK_SCHSTRBILBOO")) return BUK_SCHSTRBILBOO;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SchemaStruttura);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SchemaStruttura.class.getName() : (Glb.ClassWithPackage(SchemaStruttura.class) ? SchemaStruttura.class.getName().substring(SchemaStruttura.class.getPackage().getName().length() + 1) : SchemaStruttura.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Schema Struttura Bilancio Before Insert Event
  // Evento notificato dal pannello prima dell'inserimento
  // nel database dei dati relativi ad una nuova riga di
  // pannello.
  // Cancel: Se impostato a True non effettua l'inserimento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_SCHESTRUBILA_BeforeInsert (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schema Struttura Bilancio Before Insert Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_DATA_INSERIMENTO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "SchemaStrutturaBilancioBeforeInsertEvent", _e);
    }
  }

  // **********************************************************************
  // Schema Struttura Bilancio Before Update Event
  // Evento notificato dal pannello prima dell'aggiornamento
  // nel database dei dati relativi ad una riga di pannello
  // modificata.
  // Cancel: Se impostato a True non effettua l'aggiornamento dei dati di questa riga. La fase di salvataggio delle altre righe prosegue normalmente. - Input/Output
  // **********************************************************************
  private void PAN_SCHESTRUBILA_BeforeUpdate (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schema Struttura Bilancio Before Update Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_DATA_ULTIMO_AGG, 0, IDL.Today());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "SchemaStrutturaBilancioBeforeUpdateEvent", _e);
    }
  }

  // **********************************************************************
  // Schema Struttura Bilancio On Database Error Event
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
  private void PAN_SCHESTRUBILA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_SCHESTRUBILA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Schema Struttura Bilancio On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "SchemaStrutturaBilancioOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Schema Struttura Bilancio On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_SCHESTRUBILA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_SCHESTRUBILA);
      // 
      // Schema Struttura Bilancio On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_SCHESTRUBILA.set_ToolTip(Glb.OBJ_FIELD,PFL_SCHESTRUBILA_DESCRIZIONE,(new IDVariant(PAN_SCHESTRUBILA.FieldText(PFL_SCHESTRUBILA_DESCRIZIONE))).stringValue()); 
      PAN_SCHESTRUBILA.set_ToolTip(Glb.OBJ_FIELD,PFL_SCHESTRUBILA_DESCRILIVELL,(new IDVariant(PAN_SCHESTRUBILA.FieldText(PFL_SCHESTRUBILA_DESCRILIVELL))).stringValue()); 
      if (IDL.NullValue(IMDB.Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_LIVELLO, 0),(new IDVariant(-1))).equals((new IDVariant(0)), true))
      {
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (PAN_SCHESTRUBILA.IsNewRow())
      {
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMOGGBLOTOT, 0).equals((new IDVariant("SI")), true))
      {
        DisabilitaTutto();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "SchemaStrutturaBilancioOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Schema Struttura Bilancio After Commit Event
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated: Numero di righe che sono state aggiornate o inserite con successo. - Input
  // Rows In Errors: Numero di righe che non sono state aggiornate o inserite a causa di errori di database. - Input
  // **********************************************************************
  private void PAN_SCHESTRUBILA_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schema Struttura Bilancio After Commit Event Body
      // Procedure Body
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_SCHESTRUBILA.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "SchemaStrutturaBilancioAfterCommitEvent", _e);
    }
  }

  // **********************************************************************
  // Schema Struttura Bilancio On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_SCHESTRUBILA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schema Struttura Bilancio On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_SCHEMA_STRUTTURA_ID, 0))))
        {
          IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_SCHEMA_STRUTTURA_ID, 0, (new IDVariant()));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_ULTIMO_AGG, 0))))
        {
          IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef8.PQRY_BILSCHEMSTR1, IMDBDef8.PQSL_BILSCHEMSTR1_DATA_ULTIMO_AGG, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "SchemaStrutturaBilancioOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Schema Struttura Bilancio On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_SCHESTRUBILA_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Schema Struttura Bilancio On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(8)), true))
      {
        if (IMDB.Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMOGGBLOTOT, 0).equals((new IDVariant("SI")), true))
        {
          Cancel.set((new IDVariant(-1)));
          MainFrm.set_AlertMessage(IMDB.Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMEOGGEERRM, 0)); 
        }
      }
      if (Command.equals((new IDVariant(16)), true))
      {
        if (IMDB.Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMOGGBLOTOT, 0).equals((new IDVariant("SI")), true))
        {
          Cancel.set((new IDVariant(-1)));
          MainFrm.set_AlertMessage(IMDB.Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMEOGGEERRM, 0)); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "SchemaStrutturaBilancioOnCommand", _e);
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_SCHSTRBILBOO_SEC_DETAIL_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Detail After Formatting Event Body
      // Procedure Body
      // 
      // if ((new IDVariant(BUK_SCHSTRBILBOO.BoxRect(BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT))).compareTo((new IDVariant(BUK_SCHSTRBILBOO.BoxRect(BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL, IDREGlb.RECT_HEIGHT))), true)>0)
      // {
        // v_MAX = new IDVariant((new IDVariant(BUK_SCHSTRBILBOO.BoxRect(BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT))),IDVariant.INTEGER);
      // }
      // else
      // {
        // v_MAX = new IDVariant((new IDVariant(BUK_SCHSTRBILBOO.BoxRect(BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL, IDREGlb.RECT_HEIGHT))),IDVariant.INTEGER);
      // }
      // BUK_SCHSTRBILBOO.set_BoxRect(BUK_SCHSTRBILBOO_RPTBOX_ES, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAX),IDVariant.FLOAT).dblValue());
      // BUK_SCHSTRBILBOO.set_BoxRect(BUK_SCHSTRBILBOO_RPTBOX_LIVELLO, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAX),IDVariant.FLOAT).dblValue());
      // BUK_SCHSTRBILBOO.set_BoxRect(BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAX),IDVariant.FLOAT).dblValue());
      // BUK_SCHSTRBILBOO.set_BoxRect(BUK_SCHSTRBILBOO_RPTBOX_SECHIAVE, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAX),IDVariant.FLOAT).dblValue());
      // BUK_SCHSTRBILBOO.set_BoxRect(BUK_SCHSTRBILBOO_RPTBOX_FORMATO, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAX),IDVariant.FLOAT).dblValue());
      // BUK_SCHSTRBILBOO.set_BoxRect(BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAX),IDVariant.FLOAT).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Duplica Su Nuovo Esercizio PROC
  // **********************************************************************
  public int DuplicaSuNuovoEsercizioPROC ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Duplica Su Nuovo Esercizio PROC Body
      // Corpo Procedura
      // 
      IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  BIL_SCHEMA_STRUTTURA A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_ER = new IDVariant(0,IDVariant.STRING);
        v_ER = (new IDVariant("Schema Struttura già presente per l'Esercizio"));
        MainFrm.set_AlertMessage(v_ER); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.GENERASTRUTTURA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          PAN_SCHESTRUBILA.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "DuplicaSuNuovoEsercizioPROC", _e);
      return -1;
    }
  }

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
      PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IDVariant v_ERRMSG = new IDVariant(0,IDVariant.STRING);
      if (MainFrm.BloccoTotaleSuEsercizioFinanziario(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), v_ERRMSG))
      {
        IMDB.set_Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMOGGBLOTOT, 0, (new IDVariant("SI")));
        IMDB.set_Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMEOGGEERRM, 0, new IDVariant(v_ERRMSG));
        PAN_SCHESTRUBILA.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_FA4+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMOGGBLOTOT, 0, (new IDVariant("NO")));
        IMDB.set_Value(IMDBDef1.TBL_VARS, IMDBDef1.FLD_VARS_NOMEOGGEERRM, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "Load", _e);
    }
  }

  // **********************************************************************
  // Disabilita Tutto
  // **********************************************************************
  public int DisabilitaTutto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Disabilita Tutto Body
      // Corpo Procedura
      // 
      PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      PAN_SCHESTRUBILA.SetFlags (Glb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SchemaStruttura", "DisabilitaTutto", _e);
      return -1;
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
  private void PAN_SCHESTRUBILA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_SCHESTRUBILA, Cancel);
    // Stub
  }

  private void PAN_SCHESTRUBILA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_SCHESTRUBILA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_SCHESTRUBILA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_SCHESTRUBILA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_SCHESTRUBILA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_SCHSTRBILBOO_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SCHSTRBILBOO_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SCHSTRBILBOO_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_SCHSTRBILBOO_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_SCHSTRBILBOO_SEC_DETAIL)
    {
      BUK_SCHSTRBILBOO.set_SpanValue(BUK_SCHSTRBILBOO_SPAN_SECHIAVE, new IDVariant(IDL.NullValue(BUK_SCHSTRBILBOO.GetReportColumn(BUK_SCHSTRBILBOO_RPT_NEWREPORT, "SE_CHIAVE"),(new IDVariant("NO")))));
    }
    if (SectionID==BUK_SCHSTRBILBOO_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_SCHSTRBILBOO_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_SCHSTRBILBOO_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SCHSTRBILBOO_SEC_DETAIL)
    {
      BUK_SCHSTRBILBOO_SEC_DETAIL_OnAfterFormattingSection();
    }
  }

  private void BUK_SCHSTRBILBOO_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA)
    {
      BUK_SCHSTRBILBOO.set_SpanValue(BUK_SCHSTRBILBOO_SPAN_CPTSSSBBSSPN, new IDVariant(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), IDL.ToString((new IDVariant(BUK_SCHSTRBILBOO.GetPageNumber())))), (new IDVariant(" / "))), IDL.ToString((new IDVariant(BUK_SCHSTRBILBOO.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_SCHSTRBILBOO_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SCHSTRBILBOO_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SCHSTRBILBOO_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SCHSTRBILBOO_OnPreview()
  {
    PreviewBook = BKW_SCHSTRBILBOO;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_SCHESTRUBILA_Init()
  {

    PAN_SCHESTRUBILA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_SCHESTRUBILA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, "C6F9D832-DA05-43A0-8DDF-A95529E63631");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, "Inserimento");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, MyGlb.PANEL_LIST, 4, 267, 292, 49, 0, 0);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, MyGlb.PANEL_FORM, 0, 147, 224, 73, 0, 0);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, 0, 70);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, 1, 13);
    PAN_SCHESTRUBILA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, 0, 4);
    PAN_SCHESTRUBILA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, 1, 4);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_INSERIMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, "D7084514-B7B8-4240-9A9C-CC85D8178655");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, "Aggiornamento");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, MyGlb.VIS_DEFAPANESTYL);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, MyGlb.PANEL_LIST, 364, 267, 284, 49, 0, 0);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, MyGlb.PANEL_FORM, 0, 195, 216, 73, 0, 0);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, 0, 88);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, 1, 13);
    PAN_SCHESTRUBILA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, 0, 4);
    PAN_SCHESTRUBILA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, 1, 4);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_GROUP, GRP_SCHESTRUBILA_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_SCHESTRUBILA.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, "5A9DB581-9439-4760-B9BF-41738560C2B7");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, "SCHEMA STRUTTURA ID");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, "948451F0-9957-4FC2-BFC0-8C4DB255D10B");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, "Parte");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, "BCB6D96A-1756-4954-94E2-BEA501A9A9AF");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, "Livello");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, "654F25E2-ECC2-487D-9F81-EF4D57D9353D");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, "Descrizione");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, "08BD32FB-C6E1-45A7-9324-6F244CE457A0");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, "Chiave");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.VIS_CHECKSTYLE);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, "30C1F52A-64DC-4AB9-9B99-62D4672A0369");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, "Formato");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, "A1290E8F-054F-440E-BAEA-59704B3B01D5");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, "Descrizione Livello");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, "71C95B72-EA28-40DD-AF52-3A74980BFFDA");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, "Utente");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, "58AB2B7B-BA3B-4151-935E-10C9AEAD452D");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, "Data");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, "7B109F70-0DC6-450C-9A44-FE7821EE8CFB");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, "Utente ");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, "5D112CEB-7788-4E4E-9556-42213B2DC068");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, "Data ");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_SCHESTRUBILA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, "943D04D0-A7D9-4996-8092-01B89F6CEB2D");
    PAN_SCHESTRUBILA.set_Header(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, "ESERCIZIO");
    PAN_SCHESTRUBILA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, "");
    PAN_SCHESTRUBILA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_SCHESTRUBILA.SetFlags(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, 0, -1);
  }

  private void PAN_SCHESTRUBILA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_LIST, 128);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_LIST, "SCHEMA STRUTTURA ID");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_FORM, 4, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_FORM, 128);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_SCHEMSTRUTID, MyGlb.PANEL_FORM, "SCH. STRUTTURA ID");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_SCHEMSTRUTID, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_SCHEMSTRUTID, PPQRY_BILSCHEMSTR1, "A.SCHEMA_STRUTTURA_ID", "SCHEMA_STRUTTURA_ID", 3, 10, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_LIST, 24);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_FORM, 4, 28, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_FORM, 24);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_PARTE, MyGlb.PANEL_FORM, "Pr.");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_PARTE, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_PARTE, PPQRY_BILSCHEMSTR1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_SCHESTRUBILA.SetValueListItem(PFL_SCHESTRUBILA_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_SCHESTRUBILA.SetValueListItem(PFL_SCHESTRUBILA_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_LIST, 64, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_LIST, 48);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_LIST, "Livello");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_FORM, 4, 52, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_FORM, 48);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_LIVELLO, MyGlb.PANEL_FORM, "Livello");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_LIVELLO, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_LIVELLO, PPQRY_BILSCHEMSTR1, "A.LIVELLO", "LIVELLO", 1, 2, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_LIST, 108, 36, 240, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 76, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_DESCRIZIONE, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_DESCRIZIONE, PPQRY_BILSCHEMSTR1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_LIST, 348, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_LIST, 60);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_LIST, "Chiave");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_FORM, 4, 100, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_FORM, 60);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_CHIAVE, MyGlb.PANEL_FORM, "Chiave");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_CHIAVE, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_CHIAVE, PPQRY_BILSCHEMSTR1, "A.SE_CHIAVE", "SE_CHIAVE", 5, 2, 0, -13997);
    PAN_SCHESTRUBILA.SetValueListItem(PFL_SCHESTRUBILA_CHIAVE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_SCHESTRUBILA.SetValueListItem(PFL_SCHESTRUBILA_CHIAVE, (new IDVariant()), "Null", "", "", -1);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_LIST, 396, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_LIST, 60);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_LIST, "Formato");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_FORM, 60);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_FORMATO, MyGlb.PANEL_FORM, "Formato");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_FORMATO, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_FORMATO, PPQRY_BILSCHEMSTR1, "A.FORMATO", "FORMATO", 1, 1, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_LIST, 452, 36, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_LIST, 120);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_LIST, "Descrizione Livello");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_FORM, 4, 148, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_FORM, 120);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DESCRILIVELL, MyGlb.PANEL_FORM, "Descrizione Livello");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_DESCRILIVELL, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_DESCRILIVELL, PPQRY_BILSCHEMSTR1, "A.DESCRIZIONE_LIVELLO", "DESCRIZIONE_LIVELLO", 5, 40, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_LIST, 8, 292, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_LIST, 52);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_LIST, "Utente");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_FORM, 4, 172, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_FORM, 120);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE1, MyGlb.PANEL_FORM, "Utente");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_UTENTE1, -1, GRP_SCHESTRUBILA_INSERIMENTO);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_UTENTE1, PPQRY_BILSCHEMSTR1, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_LIST, 180, 292, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_LIST, 40);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_LIST, "Data");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_FORM, 4, 196, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_FORM, 108);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA1, MyGlb.PANEL_FORM, "Data");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_DATA1, -1, GRP_SCHESTRUBILA_INSERIMENTO);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_DATA1, PPQRY_BILSCHEMSTR1, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_LIST, 368, 292, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_LIST, 52);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_LIST, "Utente ");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_FORM, 4, 220, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_FORM, 112);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_UTENTE, MyGlb.PANEL_FORM, "Utente ");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_UTENTE, -1, GRP_SCHESTRUBILA_AGGIORNAMENT);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_UTENTE, PPQRY_BILSCHEMSTR1, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_LIST, 536, 292, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_LIST, 40);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_LIST, "Data ");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_FORM, 4, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_FORM, 100);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_DATA, MyGlb.PANEL_FORM, "Data ");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_DATA, -1, GRP_SCHESTRUBILA_AGGIORNAMENT);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_DATA, PPQRY_BILSCHEMSTR1, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_LIST, 692, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_SCHESTRUBILA.SetRect(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 268, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_SCHESTRUBILA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_SCHESTRUBILA.SetNumRow(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_SCHESTRUBILA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_SCHESTRUBILA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_SCHESTRUBILA.SetFieldPage(PFL_SCHESTRUBILA_ESERCIZIO, -1, -1);
    PAN_SCHESTRUBILA.SetFieldPanel(PFL_SCHESTRUBILA_ESERCIZIO, PPQRY_BILSCHEMSTR1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
  }

  private void PAN_SCHESTRUBILA_InitQueries()
  {
    StringBuffer SQL;

    PAN_SCHESTRUBILA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_INSERIMENTO~~ IS NULL))) ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_SCHESTRUBILA_UTENTE1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_INSERIMENTO~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_INSERIMENTO~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_SCHESTRUBILA_UTENTE1, "");
    PAN_SCHESTRUBILA.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_ULTIMO_AGG~~ IS NULL))) ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_DUAL, 0, SQL, PFL_SCHESTRUBILA_UTENTE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_ULTIMO_AGG~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_ULTIMO_AGG~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_DUAL, 1, SQL, PFL_SCHESTRUBILA_UTENTE, "");
    PAN_SCHESTRUBILA.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHESTRUBILA.SetIMDB(IMDB, "PQRY_BILSCHEMSTR1", true);
    PAN_SCHESTRUBILA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SCHEMA_STRUTTURA_ID as SCHEMA_STRUTTURA_ID, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.LIVELLO as LIVELLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.SE_CHIAVE as SE_CHIAVE, ");
    SQL.append("  A.FORMATO as FORMATO, ");
    SQL.append("  A.DESCRIZIONE_LIVELLO as DESCRIZIONE_LIVELLO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_BILSCHEMSTR1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_SCHEMA_STRUTTURA A ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_BILSCHEMSTR1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_BILSCHEMSTR1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHESTRUBILA.SetQuery(PPQRY_BILSCHEMSTR1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_SCHESTRUBILA.SetQuery(PPQRY_BILSCHEMSTR1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.LIVELLO ");
    PAN_SCHESTRUBILA.SetQuery(PPQRY_BILSCHEMSTR1, 5, SQL, -1, "");
    PAN_SCHESTRUBILA.SetQueryDB(PPQRY_BILSCHEMSTR1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_SCHESTRUBILA.SetMasterTable(0, "BIL_SCHEMA_STRUTTURA");
    PAN_SCHESTRUBILA.AddToSortList(PFL_SCHESTRUBILA_PARTE, true);
    PAN_SCHESTRUBILA.AddToSortList(PFL_SCHESTRUBILA_LIVELLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_SCHESTRUBILA.Status() == 2)
    {
      int oldListQBE = PAN_SCHESTRUBILA.iUseListQBE;
      PAN_SCHESTRUBILA.iUseListQBE = 0;
      PAN_SCHESTRUBILA.PanelCommand(Glb.PCM_SEARCH);
      PAN_SCHESTRUBILA.PanelCommand(Glb.PCM_FIND);
      PAN_SCHESTRUBILA.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA_Init()
  {
    BUK_SCHSTRBILBOO.InitMastro(BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA, 3, 21000, 29700, 1, 1, 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA, "C7386978-B5B5-4E5A-B49A-F1F34B79A128");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA, "SCHSTRBIBOPA");
    BUK_SCHSTRBILBOO.InitMastroBox(BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA, BUK_SCHSTRBILBOO_RPTBOX_PAGEHEADER, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_PAGEHEADER, "27B76004-81B0-4146-A232-362FB8B0BCA4");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_SCHSTRBILBOO.InitMastroBox(BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA, BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY, 1000, 3000, 19000, 23300, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY, "128FA217-B802-42E3-9429-1D6CC0E227C6");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_SCHSTRBILBOO.InitMastroBox(BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA, BUK_SCHSTRBILBOO_RPTBOX_PAGEFOOTER, 1000, 26700, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_PAGEFOOTER, "59F74372-4AB3-41F2-979C-CF1EF64D6429");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
    BUK_SCHSTRBILBOO.InitMastroBox(BUK_SCHSTRBILBOO_MST_SCHSTRBIBOPA, BUK_SCHSTRBILBOO_RPTBOX_PAG, 18000, 1000, 2000, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_PAG, "F1B8E40F-CA3A-4178-B525-B7582B1A87BE");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_PAG, "PAG");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_PAG, BUK_SCHSTRBILBOO_SPAN_CPTSSSBBSSPN, MyGlb.VIS_DEFAREPOSTYL, 5, 205, 0, 271384705, "", "", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_CPTSSSBBSSPN, "0826706B-C3E0-4B5F-A5F7-8738C14E5859");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_CPTSSSBBSSPN, "CPTSSSBBSSPN");
  }

  private void BUK_SCHSTRBILBOO_RPT_NEWREPORT_InitQuery() { BUK_SCHSTRBILBOO_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_SCHSTRBILBOO_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.SCHEMA_STRUTTURA_ID as SCHEMA_STRUTTURA_ID, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.LIVELLO as LIVELLO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.SE_CHIAVE as SE_CHIAVE, ");
      SQL.append("  A.FORMATO as FORMATO, ");
      SQL.append("  A.DESCRIZIONE_LIVELLO as DESCRIZIONE_LIVELLO, ");
      SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
      SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
      SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
      SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
      SQL.append("from ");
      SQL.append("  BIL_SCHEMA_STRUTTURA A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("order by ");
      SQL.append("  A.E_S, ");
      SQL.append("  A.LIVELLO ");
      BUK_SCHSTRBILBOO.SetReportQuery(BUK_SCHSTRBILBOO_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "06BEBCD2-141F-4FF5-BF10-F383F9B68A8D");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SCHSTRBILBOO_RPT_NEWREPORT_Init()
  {
    BUK_SCHSTRBILBOO.InitReport(BUK_SCHSTRBILBOO_RPT_NEWREPORT, 196609);
    BUK_SCHSTRBILBOO_RPT_NEWREPORT_InitQuery(true, false);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPT_NEWREPORT, "B559B0FC-9452-4A77-9744-B04B4219BD5A");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPT_NEWREPORT, "NEWREPORT");
    BUK_SCHSTRBILBOO.InitSection(BUK_SCHSTRBILBOO_RPT_NEWREPORT, BUK_SCHSTRBILBOO_SEC_REPORTHEADER, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_SCHSTRBILBOO.SetSectionRendersInto(BUK_SCHSTRBILBOO_SEC_REPORTHEADER, BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SEC_REPORTHEADER, "4F84CFCE-786E-4D35-8EA9-60705DF10415");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_SCHSTRBILBOO.InitSection(BUK_SCHSTRBILBOO_RPT_NEWREPORT, BUK_SCHSTRBILBOO_SEC_PAGEHEADER, 2000, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SCHSTRBILBOO.SetSectionRendersInto(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_PAGEHEADER);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, "C8AABA8A-FC6B-4F31-86DF-44F5790A4D16");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_ESHEADER, 0, 1600, 1300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_ESHEADER, "C9CA76E4-720B-4C7F-BDFA-E84F544F9362");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_ESHEADER, "ESHEADER");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_ESHEADER, BUK_SCHSTRBILBOO_SPAN_PARTE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Parte", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_PARTE, "A312C91F-1C6C-42CB-8C98-7B7655022670");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_PARTE, "PARTE");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_LIVELLHEADER, 1600, 1600, 1007, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_LIVELLHEADER, "03BCC212-ED1E-4B4C-B10E-0DB32C38B692");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_LIVELLHEADER, "LIVELLHEADER");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_LIVELLHEADER, BUK_SCHSTRBILBOO_SPAN_LIVELLO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Livello", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_LIVELLO, "CB3D62FE-1E75-4C74-A916-C0467440E332");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_LIVELLO, "LIVELLO");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_DESCRIHEADER, 2800, 1600, 6000, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_DESCRIHEADER, "0BF21DAF-E5B7-4E9B-8FA2-6A18ECA12F99");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_DESCRIHEADER, "DESCRIHEADER");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_DESCRIHEADER, BUK_SCHSTRBILBOO_SPAN_DESCRIZIONE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_DESCRIZIONE, "358B886E-869E-45FD-BB7D-500A0ED89BBE");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_SECHIAVHEADE, 9000, 1600, 1100, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_SECHIAVHEADE, "575A465A-8F5B-41FA-8D62-5A8775B0864D");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_SECHIAVHEADE, "SECHIAVHEADE");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_SECHIAVHEADE, BUK_SCHSTRBILBOO_SPAN_CHIAVE, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Chiave", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_CHIAVE, "AFB5E9F5-2219-46BC-83E3-D0D1E2AF373C");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_CHIAVE, "CHIAVE");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_FORMATHEADER, 10200, 1600, 1300, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_FORMATHEADER, "82AD7A92-4B99-46BA-8CE9-7B2833C333C2");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_FORMATHEADER, "FORMATHEADER");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_FORMATHEADER, BUK_SCHSTRBILBOO_SPAN_FORMATO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Formato", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_FORMATO, "F176B1FE-BBDC-4CE4-9CA4-81C12D42E5AE");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_FORMATO, "FORMATO");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_DESCLIVEHEAD, 11700, 1600, 7200, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_DESCLIVEHEAD, "0C265F7F-A0F0-4F22-BD84-F94CBFE4EB51");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_DESCLIVEHEAD, "DESCLIVEHEAD");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_DESCLIVEHEAD, BUK_SCHSTRBILBOO_SPAN_DESCRILIVELL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Descrizione Livello", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_DESCRILIVELL, "C7925EE5-E510-4F56-AA88-51A0103A27DF");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_DESCRILIVELL, "DESCRILIVELL");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_PAGEHEADER, BUK_SCHSTRBILBOO_RPTBOX_TITOLO, 0, 600, 19000, 700, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_TITOLO, "3B5A6F43-7B2E-41A8-87CC-00F9EE9EEEE5");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_TITOLO, "TITOLO");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_TITOLO, BUK_SCHSTRBILBOO_SPAN_SCHESTRUBILA, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Schema Struttura Bilancio", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_SCHESTRUBILA, "9CBB2D04-BE77-4E34-84C1-2AB130C73948");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_SCHESTRUBILA, "SCHESTRUBILA");
    BUK_SCHSTRBILBOO.InitSection(BUK_SCHSTRBILBOO_RPT_NEWREPORT, BUK_SCHSTRBILBOO_SEC_DETAIL, 500, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SCHSTRBILBOO.SetSectionRendersInto(BUK_SCHSTRBILBOO_SEC_DETAIL, BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SEC_DETAIL, "49E55790-2558-4F6C-9CE2-AB1716068FFE");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SEC_DETAIL, "DETAIL");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_DETAIL, BUK_SCHSTRBILBOO_RPTBOX_ES, 0, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_ES, "74D922F5-B206-4832-8576-B63A55BF265C");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_ES, "ES");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_ES, BUK_SCHSTRBILBOO_SPAN_REPASCSTSSBB, MyGlb.VIS_DEFAREPOSTYL, 5, 1, 0, 271384705, "Brief description of field content.", "::E_S", 1);
    BUK_SCHSTRBILBOO.SetSpanValueListItem(BUK_SCHSTRBILBOO_SPAN_REPASCSTSSBB, "Entrata", "Parte Entrata", (new IDVariant("E")), null, "", -1);
    BUK_SCHSTRBILBOO.SetSpanValueListItem(BUK_SCHSTRBILBOO_SPAN_REPASCSTSSBB, "Spesa", "Parte Spesa", (new IDVariant("S")), null, "", -1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_REPASCSTSSBB, "B6754CBA-949C-4ADA-A45D-7AB224B67244");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_REPASCSTSSBB, "REPASCSTSSBB");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_DETAIL, BUK_SCHSTRBILBOO_RPTBOX_LIVELLO, 1600, 0, 1007, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_LIVELLO, "D3682FFE-3060-4639-B69F-C93C4F4363C5");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_LIVELLO, "LIVELLO");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_LIVELLO, BUK_SCHSTRBILBOO_SPAN_RELISCSTSSBB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::LIVELLO", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_RELISCSTSSBB, "F502263C-30D9-48C4-A305-C02BF097CC5D");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_RELISCSTSSBB, "RELISCSTSSBB");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_DETAIL, BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE, 2800, 0, 6049, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE, "577BD817-CA68-4311-B427-7F2A82246F36");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_DESCRIZIONE, BUK_SCHSTRBILBOO_SPAN_REDESCSTSSBB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_REDESCSTSSBB, "0257AA6F-528D-453E-B9AE-6410DB7C051F");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_REDESCSTSSBB, "REDESCSTSSBB");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_DETAIL, BUK_SCHSTRBILBOO_RPTBOX_SECHIAVE, 9300, 0, 499, 500, 0, 1, 1, MyGlb.VIS_IMMAGINE, 983041, 107, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_SECHIAVE, "D17C1F46-5B25-4684-9C2A-4A7279D80DE7");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_SECHIAVE, "SECHIAVE");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_SECHIAVE, BUK_SCHSTRBILBOO_SPAN_SECHIAVE, MyGlb.VIS_IMMAGINE, 5, 99, 0, 271319425, "", "", 1);
    BUK_SCHSTRBILBOO.SetSpanValueListItem(BUK_SCHSTRBILBOO_SPAN_SECHIAVE, "SI", "Type the value and explain what it means.", (new IDVariant("SI")), null, "CheckSel.JPG", -1);
    BUK_SCHSTRBILBOO.SetSpanValueListItem(BUK_SCHSTRBILBOO_SPAN_SECHIAVE, "NO", "Type the value and explain what it means.", (new IDVariant("NO")), null, "CheckNotSel.JPG", -1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_SECHIAVE, "9F960E80-2090-4680-9788-847B9EA2F35E");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_SECHIAVE, "SECHIAVE");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_DETAIL, BUK_SCHSTRBILBOO_RPTBOX_FORMATO, 10200, 0, 1235, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_FORMATO, "1EFA0A4F-222D-4C4E-8FF5-707648A0DD01");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_FORMATO, "FORMATO");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_FORMATO, BUK_SCHSTRBILBOO_SPAN_REFOSCSTSSBB, MyGlb.VIS_DEFAREPOSTYL, 1, 1, 0, 271384705, "Brief description of field content.", "::FORMATO", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_REFOSCSTSSBB, "B42B491D-8DA2-4005-A632-F78D70B0F245");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_REFOSCSTSSBB, "REFOSCSTSSBB");
    BUK_SCHSTRBILBOO.InitReportBox(BUK_SCHSTRBILBOO_SEC_DETAIL, BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL, 11700, 0, 7200, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL, "0D89938F-85A9-4E33-919E-722D2BCCBC2B");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL, "DESCRILIVELL");
    BUK_SCHSTRBILBOO.InitBoxSpan(BUK_SCHSTRBILBOO_RPTBOX_DESCRILIVELL, BUK_SCHSTRBILBOO_SPAN_REDELISSSSBB, MyGlb.VIS_DEFAREPOSTYL, 5, 40, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE_LIVELLO", 1);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SPAN_REDELISSSSBB, "96E4E34A-99BF-4594-AF93-23AF3139BB5C");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SPAN_REDELISSSSBB, "REDELISSSSBB");
    BUK_SCHSTRBILBOO.InitSection(BUK_SCHSTRBILBOO_RPT_NEWREPORT, BUK_SCHSTRBILBOO_SEC_PAGEFOOTER, 1000, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_SCHSTRBILBOO.SetSectionRendersInto(BUK_SCHSTRBILBOO_SEC_PAGEFOOTER, BUK_SCHSTRBILBOO_RPTBOX_PAGEFOOTER);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SEC_PAGEFOOTER, "11CAB03D-17BC-4E22-B16D-97EABF4E1E82");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_SCHSTRBILBOO.InitSection(BUK_SCHSTRBILBOO_RPT_NEWREPORT, BUK_SCHSTRBILBOO_SEC_REPORTFOOTER, 1000, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_SCHSTRBILBOO.SetSectionRendersInto(BUK_SCHSTRBILBOO_SEC_REPORTFOOTER, BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY);
    BUK_SCHSTRBILBOO.SetRTCGuid(BUK_SCHSTRBILBOO_SEC_REPORTFOOTER, "D2085E41-49AB-4976-B9B5-61F22A1EA831");
    BUK_SCHSTRBILBOO.SetObjCode(BUK_SCHSTRBILBOO_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SCHSTRBILBOO_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_SCHSTRBILBOO_InitLinks()
  {
    BUK_SCHSTRBILBOO.SetBoxNextBox(BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY, BUK_SCHSTRBILBOO_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_OnPanelCommand(Command, Cancel, UserOp);
  }
  
  public void BeforeFind(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void BeforeInsert(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_BeforeInsert(Cancel);
  }
  
  public void BeforeUpdate(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_BeforeUpdate(Cancel);
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
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_SCHESTRUBILA) PAN_SCHESTRUBILA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SCHSTRBILBOO) BUK_SCHSTRBILBOO_OnPreview();
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
