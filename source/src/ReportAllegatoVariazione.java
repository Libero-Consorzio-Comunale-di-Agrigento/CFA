// **********************************************
// Report Allegato Variazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ReportAllegatoVariazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  CIDREObj BUK_ALLEGAVARIAZ;
  OBook BKW_ALLEGAVARIAZ;
  //
  // Template Pages constants
  private static int BUK_ALLEGAVARIAZ_MST_TEMPLATE = 1;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_PAGEHEADER = 2;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY = 3;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER = 4;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_PAG = 5;
  private static int BUK_ALLEGAVARIAZ_SPAN_CPTSAVRAVPND = 6;

  //
  // Reports constants
  private static int BUK_ALLEGAVARIAZ_RPT_REPORT = 7;
  private static int BUK_ALLEGAVARIAZ_SEC_REPORTHEADER = 8;
  private static int BUK_ALLEGAVARIAZ_SEC_PAGEHEADER = 9;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_LOGO = 10;
  private static int BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA = 11;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_DESTIPOVAR = 12;
  private static int BUK_ALLEGAVARIAZ_SPAN_DESTIPOVAR = 13;
  private static int BUK_ALLEGAVARIAZ_SEC_TIPVARGROHE1 = 14;
  private static int BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH = 15;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_UODESC = 16;
  private static int BUK_ALLEGAVARIAZ_SPAN_UODESC = 17;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_UNITAORGANIZ = 18;
  private static int BUK_ALLEGAVARIAZ_SPAN_UNITAORGANIZ = 19;
  private static int BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1 = 20;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_OGGETTO = 21;
  private static int BUK_ALLEGAVARIAZ_SPAN_OGGETTO = 22;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEGHEADE = 23;
  private static int BUK_ALLEGAVARIAZ_SPAN_VOCEPEG = 24;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_CODICEHEADER = 25;
  private static int BUK_ALLEGAVARIAZ_SPAN_CODICE = 26;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_DESCRCAPHEAD = 27;
  private static int BUK_ALLEGAVARIAZ_SPAN_DESCRIZIOCAP = 28;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_STNATTCOHEAD = 29;
  private static int BUK_ALLEGAVARIAZ_SPAN_STNATTCO = 30;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_VARIAZHEADER = 31;
  private static int BUK_ALLEGAVARIAZ_SPAN_VARIAZIONE = 32;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCOHEAD = 33;
  private static int BUK_ALLEGAVARIAZ_SPAN_STNDEFCO1 = 34;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE1 = 35;
  private static int BUK_ALLEGAVARIAZ_SPAN_STNDEFCO = 36;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_DETTAGOGGETT = 37;
  private static int BUK_ALLEGAVARIAZ_SPAN_DETTAGOGGET1 = 38;
  private static int BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE = 39;
  private static int BUK_ALLEGAVARIAZ_SEC_POWRSATIGRH1 = 40;
  private static int BUK_ALLEGAVARIAZ_SEC_DETAIL = 41;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG = 42;
  private static int BUK_ALLEGAVARIAZ_SPAN_REVOPEREAVAP = 43;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_CODICE = 44;
  private static int BUK_ALLEGAVARIAZ_SPAN_REPOWSCRAVAP = 45;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP = 46;
  private static int BUK_ALLEGAVARIAZ_SPAN_REPWSDCRAVAP = 47;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO = 48;
  private static int BUK_ALLEGAVARIAZ_SPAN_RPWSSACRAVAP = 49;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE = 50;
  private static int BUK_ALLEGAVARIAZ_SPAN_REPOWSVRAVAP = 51;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO = 52;
  private static int BUK_ALLEGAVARIAZ_SPAN_RPWSSDCRAVAP = 53;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE = 54;
  private static int BUK_ALLEGAVARIAZ_SPAN_MOTIVAZIONE = 55;
  private static int BUK_ALLEGAVARIAZ_SEC_POWRSATIGRFO = 56;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX1 = 57;
  private static int BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1 = 58;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTTITOLO = 59;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOT1 = 60;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANZATTU = 61;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATT1 = 62;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR = 63;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOTVAR1 = 64;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR1 = 65;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADE1 = 66;
  private static int BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT = 67;
  private static int BUK_ALLEGAVARIAZ_SEC_UOFOOTER = 68;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTUO = 69;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOT = 70;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANATTU1 = 71;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATTU = 72;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR2 = 73;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOTVAR = 74;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR3 = 75;
  private static int BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADEF = 76;
  private static int BUK_ALLEGAVARIAZ_SEC_TIPOVARFOOTE = 77;
  private static int BUK_ALLEGAVARIAZ_SEC_TIPOVAR1FOOT = 78;
  private static int BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER = 79;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_COMUNE = 80;
  private static int BUK_ALLEGAVARIAZ_SPAN_COMUNE = 81;
  private static int BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX = 82;
  private static int BUK_ALLEGAVARIAZ_SEC_REPORTFOOTER = 83;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_NEWTABLE17(IMDB);
    //
    //
    Init_PQRY_POLWRKSALP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_NEWTABLE17(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_NEWTABLE17, 6);
    IMDB.set_TblCode(IMDBDef4.TBL_NEWTABLE17, "TBL_NEWTABLE17");
    IMDB.set_FldCode(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMRIGDES, "ROWNAMRIGDES");
    IMDB.SetFldParams(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMRIGDES,9,999,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMECOMUN, "ROWNAMECOMUN");
    IMDB.SetFldParams(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMECOMUN,5,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMRIGDE1, "ROWNAMRIGDE1");
    IMDB.SetFldParams(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMRIGDE1,9,999,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMENOTE, "ROWNAMENOTE");
    IMDB.SetFldParams(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMENOTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_RONASUPETIVA, "RONASUPETIVA");
    IMDB.SetFldParams(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_RONASUPETIVA,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef4.TBL_NEWTABLE17,IMDBDef4.FLD_NEWTABLE17_ROWNAMTOPETI,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_NEWTABLE17, 0);
  }

  private static void Init_PQRY_POLWRKSALP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_POLWRKSALP, 18);
    IMDB.set_TblCode(IMDBDef12.PQRY_POLWRKSALP, "PQRY_POLWRKSALP");
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DES_UNITA_ORGANIZZATIVA, "DES_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DES_UNITA_ORGANIZZATIVA,5,120,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_NUM_PROPOSTA, "NUM_PROPOSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_NUM_PROPOSTA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_VOCE_PEG, "VOCE_PEG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_VOCE_PEG,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_CODICE,1,7,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DESCRIZIONE_CAP, "DESCRIZIONE_CAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DESCRIZIONE_CAP,5,300,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_STN_ATT_CO, "STN_ATT_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_STN_ATT_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_VARIAZIONE, "VARIAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_VARIAZIONE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_STN_DEF_CO, "STN_DEF_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_STN_DEF_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DESCRIZIONE,5,400,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_RECORDRAGG, "RECORDRAGG");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_RECORDRAGG,5,100,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DES_TIPO_VAR, "DES_TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DES_TIPO_VAR,5,40,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DES_VARIAZIONE, "DES_VARIAZIONE");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_DES_VARIAZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_TIPO_VAR, "TIPO_VAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_TIPO_VAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_PROGR_UNITA_ORGANIZZATIVA, "PROGR_UNITA_ORGANIZZATIVA");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_PROGR_UNITA_ORGANIZZATIVA,1,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_TITOLO, "TITOLO");
    IMDB.SetFldParams(IMDBDef12.PQRY_POLWRKSALP,IMDBDef12.PQSL_POLWRKSALP_TITOLO,1,1,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_POLWRKSALP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ReportAllegatoVariazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public ReportAllegatoVariazione()
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
    FormIdx = MyGlb.FRM_REPOALLEVARI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "A0475A4C-B82B-450A-AA69-E8829D644541";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1016;
    DesignHeight = 606;
    set_Caption(new IDVariant("Report Allegato Variazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1016;
    Frames[1].Height = 580;
    Frames[1].Caption = "Allegato Variazione";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 580;
    BKW_ALLEGAVARIAZ = new OBook(this);
    BUK_ALLEGAVARIAZ = new CIDREObj(BKW_ALLEGAVARIAZ);
    Frames[1].Content = BKW_ALLEGAVARIAZ;
    BKW_ALLEGAVARIAZ.Height = 550;
    BKW_ALLEGAVARIAZ.Width = 1016;
    BKW_ALLEGAVARIAZ.iGuid = "8A1FCAF4-4695-4AD6-879A-C7ADE68F95AF";
    BKW_ALLEGAVARIAZ.Code = "BUK_ALLEGAVARIAZ";
    BKW_ALLEGAVARIAZ.BookObj = BUK_ALLEGAVARIAZ;
    BKW_ALLEGAVARIAZ.InitDefMasks();
    BUK_ALLEGAVARIAZ.set_FrIndex(1);
    BUK_ALLEGAVARIAZ.InitBook(1, 3342593, "Allegato Variazione", IMDB, MainFrm.VisualStyleList);
    BUK_ALLEGAVARIAZ.InitHTML();
    BUK_ALLEGAVARIAZ.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_ALLEGAVARIAZ.SetSize(1016, 550);
    BUK_ALLEGAVARIAZ.Book.SetMainFrm(MainFrm);
    BUK_ALLEGAVARIAZ.SetRTCGuid(0, "8A1FCAF4-4695-4AD6-879A-C7ADE68F95AF");
    BUK_ALLEGAVARIAZ.SetObjCode(0, "ALLEGAVARIAZ");
    BUK_ALLEGAVARIAZ_MST_TEMPLATE_Init();
    BUK_ALLEGAVARIAZ_RPT_REPORT_Init();
    BUK_ALLEGAVARIAZ_InitLinks();
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
      BUK_ALLEGAVARIAZ.UpdateBook();
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
    if (Code.equals("BUK_ALLEGAVARIAZ")) return BUK_ALLEGAVARIAZ;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ReportAllegatoVariazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ReportAllegatoVariazione.class.getName() : (Glb.ClassWithPackage(ReportAllegatoVariazione.class) ? ReportAllegatoVariazione.class.getName().substring(ReportAllegatoVariazione.class.getPackage().getName().length() + 1) : ReportAllegatoVariazione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDCachedRowSet v_RS1 = new IDCachedRowSet();
    IDVariant v_RIGHVARIFIRM = new IDVariant(0,IDVariant.STRING);
    IDCachedRowSet v_RS2 = new IDCachedRowSet();
    IDVariant v_RIGHE2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      v_RIGHVARIFIRM = (new IDVariant(""));
      BUK_ALLEGAVARIAZ.SetBoxImage(BUK_ALLEGAVARIAZ_RPTBOX_LOGO, null, (new IDVariant("logo.bmp")).toString()); 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as descrizione ");
      SQL.append("from ");
      SQL.append("  T67 A ");
      SQL.append("where (A.CODICE = 'SAP') ");
      SQL.append("and   (A.PROGRESSIVO >= 1 AND A.PROGRESSIVO <= 3) ");
      v_RS1 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!v_RS1.EOF()) v_RS1.MoveNext();
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DESCRIZIONE as descrizione ");
      SQL.append("from ");
      SQL.append("  T67 A ");
      SQL.append("where (A.CODICE = 'SAP') ");
      SQL.append("and   (A.PROGRESSIVO >= 8 AND A.PROGRESSIVO <= 9) ");
      v_RS2 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!v_RS2.EOF()) v_RS2.MoveNext();
      v_RS1.MoveFirst();
      v_RS2.MoveFirst();
      while (!(v_RS1.EOF()))
      {
        v_RIGHVARIFIRM = IDL.Add(IDL.Add(v_RIGHVARIFIRM, v_RS1.Get((new IDVariant("descrizione")).stringValue())), (new IDVariant("<BR/>")));
        v_RS1.MoveNext();
      }
      while (!(v_RS2.EOF()))
      {
        v_RIGHE2 = IDL.Add(IDL.Add(v_RIGHE2, v_RS2.Get((new IDVariant("descrizione")).stringValue())), (new IDVariant("<BR/>")));
        v_RS2.MoveNext();
      }
      IMDB.set_Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_ROWNAMRIGDES, 0, new IDVariant(v_RIGHVARIFIRM));
      IMDB.set_Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_ROWNAMECOMUN, 0, IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_COMUNE, 0));
      IMDB.set_Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_ROWNAMRIGDE1, 0, new IDVariant(v_RIGHE2));
      BUK_ALLEGAVARIAZ.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_ALLEGAVARIAZ.ReportRefreshQuery(BUK_ALLEGAVARIAZ_RPT_REPORT);
      BUK_ALLEGAVARIAZ.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      // BUK_ALLEGAVARIAZ.ReportRefreshQuery(BUK_ALLEGAVARIAZ_RPT_REPORT);
      BUK_ALLEGAVARIAZ.PrintBook((new IDVariant(1)).intValue(), IDL.Sub((new IDVariant(BUK_ALLEGAVARIAZ.GetTotalPagesNumber())), (new IDVariant(1))).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_ALLEGAVARIAZ.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportAllegatoVariazione", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // TEMPLATE On Formatting Event
  // Evento notificato da una pagina quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ALLEGAVARIAZ_MST_TEMPLATE_OnFormattingPage()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // TEMPLATE On Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_ALLEGAVARIAZ.GetPageNumber())).compareTo(IDL.Sub((new IDVariant(BUK_ALLEGAVARIAZ.GetTotalPagesNumber())), (new IDVariant(1))), true)!=0)
      {
        BUK_ALLEGAVARIAZ.set_BoxVisible(BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER, (new IDVariant(0)).booleanValue());
      }
      else
      {
        BUK_ALLEGAVARIAZ.set_BoxVisible(BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER, (new IDVariant(-1)).booleanValue());
      }
      if (IMDB.Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_RONASUPETIVA, 0).equals((new IDVariant()), true))
      {
        BUK_ALLEGAVARIAZ.set_BoxVisible(BUK_ALLEGAVARIAZ_RPTBOX_DESTIPOVAR, (new IDVariant(0)).booleanValue());
        BUK_ALLEGAVARIAZ.set_SectionVisible(BUK_ALLEGAVARIAZ_SEC_TIPOVAR1FOOT, (new IDVariant(0)).booleanValue());
      }
      if (IMDB.Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_ROWNAMTOPETI, 0).equals((new IDVariant()), true))
      {
        BUK_ALLEGAVARIAZ.set_SectionVisible(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, (new IDVariant(0)).booleanValue());
      }
      if (BUK_ALLEGAVARIAZ.GetReportColumn(BUK_ALLEGAVARIAZ_RPT_REPORT, "E_S").equals((new IDVariant("E")), true))
      {
        BUK_ALLEGAVARIAZ.set_SectionVisible(BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_ALLEGAVARIAZ.set_SectionVisible(BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportAllegatoVariazione", "TEMPLATEOnFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail After Formatting Event
  // Evento notificato da una sezione dopo che è stata stampata
  // **********************************************************************
  private void BUK_ALLEGAVARIAZ_SEC_DETAIL_OnAfterFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_MAX = new IDVariant(0,IDVariant.INTEGER);
    IDVariant v_MAXMAX = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Detail After Formatting Event Body
      // Procedure Body
      // 
      if ((new IDVariant(BUK_ALLEGAVARIAZ.BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, IDREGlb.RECT_HEIGHT))).compareTo((new IDVariant(BUK_ALLEGAVARIAZ.BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, IDREGlb.RECT_HEIGHT))), true)>0)
      {
        v_MAX = new IDVariant((new IDVariant(BUK_ALLEGAVARIAZ.BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, IDREGlb.RECT_HEIGHT))),IDVariant.INTEGER);
      }
      else
      {
        v_MAX = new IDVariant((new IDVariant(BUK_ALLEGAVARIAZ.BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, IDREGlb.RECT_HEIGHT))),IDVariant.INTEGER);
      }
      if ((new IDVariant(BUK_ALLEGAVARIAZ.BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, IDREGlb.RECT_HEIGHT))).compareTo(v_MAX, true)>0)
      {
        v_MAXMAX = new IDVariant((new IDVariant(BUK_ALLEGAVARIAZ.BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, IDREGlb.RECT_HEIGHT))),IDVariant.INTEGER);
      }
      else
      {
        v_MAXMAX = new IDVariant(v_MAX);
      }
      v_MAXMAX = IDL.Add(v_MAXMAX, (new IDVariant(1)));
      BUK_ALLEGAVARIAZ.set_BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAXMAX),IDVariant.FLOAT).dblValue());
      BUK_ALLEGAVARIAZ.set_BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_CODICE, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAXMAX),IDVariant.FLOAT).dblValue());
      BUK_ALLEGAVARIAZ.set_BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAXMAX),IDVariant.FLOAT).dblValue());
      BUK_ALLEGAVARIAZ.set_BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAXMAX),IDVariant.FLOAT).dblValue());
      BUK_ALLEGAVARIAZ.set_BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAXMAX),IDVariant.FLOAT).dblValue());
      BUK_ALLEGAVARIAZ.set_BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAXMAX),IDVariant.FLOAT).dblValue());
      BUK_ALLEGAVARIAZ.set_BoxRect(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, IDREGlb.RECT_HEIGHT, new IDVariant(new IDVariant(v_MAXMAX),IDVariant.FLOAT).dblValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportAllegatoVariazione", "DetailAfterFormattingEvent", _e);
    }
  }

  // **********************************************************************
  // Detail Before Formatting Event
  // Evento notificato da una sezione quando viene preparata
  // per la stampa
  // **********************************************************************
  private void BUK_ALLEGAVARIAZ_SEC_DETAIL_OnFormattingSection()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Detail Before Formatting Event Body
      // Procedure Body
      // 
      // if (!(IDL.IsNull(BUK_ALLEGAVARIAZ.SpanValue(BUK_ALLEGAVARIAZ_SPAN_REVOPEREAVAP))))
      // {
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, new IDVariant(new IDVariant(MyGlb.VIS_BORDSUPEELAT),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_CODICE, new IDVariant(new IDVariant(MyGlb.VIS_BORDOSUPERIO),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, new IDVariant(new IDVariant(MyGlb.VIS_BORDSUPEELAT),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO, new IDVariant(new IDVariant(MyGlb.VIS_BORDOSUPERIO),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE, new IDVariant(new IDVariant(MyGlb.VIS_BORDSUPEELAT),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO, new IDVariant(new IDVariant(MyGlb.VIS_BORDOSUPERIO),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, new IDVariant(new IDVariant(MyGlb.VIS_BORDSUPEELAT),IDVariant.INTEGER).intValue());
      // }
      // else
      // {
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, new IDVariant(new IDVariant(MyGlb.VIS_BORDLATECUST),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_CODICE, new IDVariant(new IDVariant(MyGlb.VIS_NORMALEA8),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, new IDVariant(new IDVariant(MyGlb.VIS_BORDLATECUST),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO, new IDVariant(new IDVariant(MyGlb.VIS_NORMALEA8),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE, new IDVariant(new IDVariant(MyGlb.VIS_BORDLATECUST),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO, new IDVariant(new IDVariant(MyGlb.VIS_NORMALEA8),IDVariant.INTEGER).intValue());
        // BUK_ALLEGAVARIAZ.set_BoxVisualStyle(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, new IDVariant(new IDVariant(MyGlb.VIS_BORDLATECUST),IDVariant.INTEGER).intValue());
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ReportAllegatoVariazione", "DetailBeforeFormattingEvent", _e);
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
  private void BUK_ALLEGAVARIAZ_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_ALLEGAVARIAZ_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_TIPVARGROHE1)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1)
    {
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_DETTAGOGGET1, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(BUK_ALLEGAVARIAZ.GetReportColumn(BUK_ALLEGAVARIAZ_RPT_REPORT, "DES_VARIAZIONE"), (new IDVariant(" - "))), (new IDVariant("Parte"))), (new IDVariant(" "))), ((BUK_ALLEGAVARIAZ.GetReportColumn(BUK_ALLEGAVARIAZ_RPT_REPORT, "E_S").equals((new IDVariant("E"))))?(new IDVariant("Entrata")):(new IDVariant("Spesa")))), (new IDVariant(" "))), IDL.Add(IDL.Add((new IDVariant("Esercizio")), (new IDVariant(" "))), IDL.ToString(BUK_ALLEGAVARIAZ.GetReportColumn(BUK_ALLEGAVARIAZ_RPT_REPORT, "ESERCIZIO"))))));
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_POWRSATIGRH1)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_DETAIL)
    {
      BUK_ALLEGAVARIAZ_SEC_DETAIL_OnFormattingSection();
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_POWRSATIGRFO)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1)
    {
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOT1, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale Titolo")), (new IDVariant(" "))), IDL.ToString(BUK_ALLEGAVARIAZ.GetReportColumn(BUK_ALLEGAVARIAZ_RPT_REPORT, "TITOLO")))));
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATT1, new IDVariant(BUK_ALLEGAVARIAZ.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1,"STN_ATT_CO")));
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOTVAR1, new IDVariant(BUK_ALLEGAVARIAZ.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1,"VARIAZIONE")));
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADE1, new IDVariant(BUK_ALLEGAVARIAZ.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1,"STN_DEF_CO")));
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_UOFOOTER)
    {
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOT, new IDVariant(IDL.Add(IDL.Add((new IDVariant("Totale Unità Organizzativa")), (new IDVariant(" "))), IDL.ToString(BUK_ALLEGAVARIAZ.GetReportColumn(BUK_ALLEGAVARIAZ_RPT_REPORT, "PROGR_UNITA_ORGANIZZATIVA")))));
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATTU, new IDVariant(BUK_ALLEGAVARIAZ.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ALLEGAVARIAZ_SEC_UOFOOTER,"STN_ATT_CO")));
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOTVAR, new IDVariant(BUK_ALLEGAVARIAZ.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ALLEGAVARIAZ_SEC_UOFOOTER,"VARIAZIONE")));
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADEF, new IDVariant(BUK_ALLEGAVARIAZ.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_ALLEGAVARIAZ_SEC_UOFOOTER,"STN_DEF_CO")));
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_TIPOVARFOOTE)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_TIPOVAR1FOOT)
    {
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER)
    {
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_COMUNE, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef4.TBL_NEWTABLE17, IMDBDef4.FLD_NEWTABLE17_ROWNAMECOMUN, 0), (new IDVariant(","))), (new IDVariant(" "))), (new IDVariant("li'")))));
    }
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_ALLEGAVARIAZ_OnAfterFormattingSection(int SectionID)
  {
    if (SectionID==BUK_ALLEGAVARIAZ_SEC_DETAIL)
    {
      BUK_ALLEGAVARIAZ_SEC_DETAIL_OnAfterFormattingSection();
    }
  }

  private void BUK_ALLEGAVARIAZ_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_ALLEGAVARIAZ_MST_TEMPLATE)
    {
      BUK_ALLEGAVARIAZ.set_SpanValue(BUK_ALLEGAVARIAZ_SPAN_CPTSAVRAVPND, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_ALLEGAVARIAZ.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString(IDL.Sub((new IDVariant(BUK_ALLEGAVARIAZ.GetTotalPagesNumber())), (new IDVariant(1)))))));
      BUK_ALLEGAVARIAZ_MST_TEMPLATE_OnFormattingPage();
    }
  }

  private void BUK_ALLEGAVARIAZ_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_ALLEGAVARIAZ_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_ALLEGAVARIAZ_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_ALLEGAVARIAZ_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void BUK_ALLEGAVARIAZ_MST_TEMPLATE_Init()
  {
    BUK_ALLEGAVARIAZ.InitMastro(BUK_ALLEGAVARIAZ_MST_TEMPLATE, 3, 21000, 29700, 1, 2, 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_MST_TEMPLATE, "CDA82581-C64E-44B3-8B69-BCA9D422B15A");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_MST_TEMPLATE, "TEMPLATE");
    BUK_ALLEGAVARIAZ.InitMastroBox(BUK_ALLEGAVARIAZ_MST_TEMPLATE, BUK_ALLEGAVARIAZ_RPTBOX_PAGEHEADER, 1000, 500, 27700, 2300, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_PAGEHEADER, "4DA422C6-3A84-4FF9-9B45-F47162583F52");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_PAGEHEADER, "PAGEHEADER");
    BUK_ALLEGAVARIAZ.InitMastroBox(BUK_ALLEGAVARIAZ_MST_TEMPLATE, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY, 1000, 2800, 27700, 15700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY, "DA43267B-6333-4682-8EF9-2D4006789522");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_ALLEGAVARIAZ.InitMastroBox(BUK_ALLEGAVARIAZ_MST_TEMPLATE, BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER, 1000, 18500, 27700, 2400, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER, "452C2AF0-C79A-47FB-B5A3-94B1D7CEDB26");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER, "PAGEFOOTER");
    BUK_ALLEGAVARIAZ.InitMastroBox(BUK_ALLEGAVARIAZ_MST_TEMPLATE, BUK_ALLEGAVARIAZ_RPTBOX_PAG, 26900, 900, 1700, 600, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 851969, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_PAG, "D85BA6CA-9F12-404B-A109-637B5C6AB3D2");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_PAG, "PAG");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_PAG, BUK_ALLEGAVARIAZ_SPAN_CPTSAVRAVPND, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271384705, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_CPTSAVRAVPND, "E132202C-7AB3-4A9C-8D22-5ACEAE7F699B");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_CPTSAVRAVPND, "CPTSAVRAVPND");
  }

  private void BUK_ALLEGAVARIAZ_RPT_REPORT_InitQuery() { BUK_ALLEGAVARIAZ_RPT_REPORT_InitQuery(true, true); }
  private void BUK_ALLEGAVARIAZ_RPT_REPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.DES_UNITA_ORGANIZZATIVA as DES_UNITA_ORGANIZZATIVA, ");
      SQL.append("  A.NUM_PROPOSTA as NUM_PROPOSTA, ");
      SQL.append("  A.E_S as E_S, ");
      SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
      SQL.append("  A.VOCE_PEG as VOCE_PEG, ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE_CAP as DESCRIZIONE_CAP, ");
      SQL.append("  A.STN_ATT_CO as STN_ATT_CO, ");
      SQL.append("  A.VARIAZIONE as VARIAZIONE, ");
      SQL.append("  A.STN_DEF_CO as STN_DEF_CO, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  TO_CHAR ( A.ESERCIZIO ) || A.E_S as RECORDRAGG, ");
      SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
      SQL.append("  A.DES_TIPO_VAR as DES_TIPO_VAR, ");
      SQL.append("  A.DES_VARIAZIONE as DES_VARIAZIONE, ");
      SQL.append("  A.TIPO_VAR as TIPO_VAR, ");
      SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as PROGR_UNITA_ORGANIZZATIVA, ");
      SQL.append("  A.TITOLO as TITOLO ");
      SQL.append("from ");
      SQL.append("  POL_WRK_SALP A ");
      SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("order by 16, 17, 12, 18, 13 ");
      BUK_ALLEGAVARIAZ.SetReportQuery(BUK_ALLEGAVARIAZ_RPT_REPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "FD7841C3-2021-4BD2-A820-E67470F6928F");
      if (BUK_ALLEGAVARIAZ.FindObjByID(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA) != null)
        BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA, "TIPO_VAR");
      if (BUK_ALLEGAVARIAZ.FindObjByID(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH) != null)
        BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, "PROGR_UNITA_ORGANIZZATIVA");
      if (BUK_ALLEGAVARIAZ.FindObjByID(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1) != null)
        BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, "RECORDRAGG");
      if (BUK_ALLEGAVARIAZ.FindObjByID(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE) != null)
        BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE, "TITOLO");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_ALLEGAVARIAZ_RPT_REPORT_Init()
  {
    BUK_ALLEGAVARIAZ.InitReport(BUK_ALLEGAVARIAZ_RPT_REPORT, 196609);
    BUK_ALLEGAVARIAZ_RPT_REPORT_InitQuery(true, false);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPT_REPORT, "02D92E4C-B208-4D9F-86F9-BF76BA09AB50");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPT_REPORT, "REPORT");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_REPORTHEADER, 400, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_REPORTHEADER, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_REPORTHEADER, "AA301D0C-F6F1-46FE-81CC-3A963DFF8811");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_PAGEHEADER, 3900, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_PAGEHEADER, BUK_ALLEGAVARIAZ_RPTBOX_PAGEHEADER);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_PAGEHEADER, "40A669BD-9757-446E-852F-94DF190F09CF");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_PAGEHEADER, BUK_ALLEGAVARIAZ_RPTBOX_LOGO, 0, 100, 8300, 2000, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_LOGO, "2CA127D4-9FB2-454D-A0C6-245F38CABE00");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_LOGO, "LOGO");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA, 1000, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "TIPO_VAR");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA, "ADF36D6B-9F68-49F5-8DAE-0A51863C719D");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA, "TIPVARGROHEA");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA, BUK_ALLEGAVARIAZ_RPTBOX_DESTIPOVAR, 0, 0, 27700, 700, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_DESTIPOVAR, "74BFAE05-8A8A-4008-B660-DBD5AFB2B4F3");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_DESTIPOVAR, "DESTIPOVAR");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_DESTIPOVAR, BUK_ALLEGAVARIAZ_SPAN_DESTIPOVAR, MyGlb.VIS_INTSENBORCE1, 5, 40, 0, 271319169, "", "::DES_TIPO_VAR", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_DESTIPOVAR, "FF49B798-66A2-4381-B6F8-C292A4DA9719");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_DESTIPOVAR, "DESTIPOVAR");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_TIPVARGROHE1, 200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "TIPO_VAR");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHE1, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHE1, "9DAC26D4-3FBC-4839-89E8-FDAA6D5D0017");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHE1, "TIPVARGROHE1");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, 1400, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "PROGR_UNITA_ORGANIZZATIVA");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, "A9D4F149-DDD6-4166-8FBC-89858007D5AB");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, "POWRSAPRUOGH");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, BUK_ALLEGAVARIAZ_RPTBOX_UODESC, 3000, 100, 7400, 1300, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_UODESC, "8FF57B00-F43F-42ED-B5C2-D0BDAEDF18C3");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_UODESC, "UODESC");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_UODESC, BUK_ALLEGAVARIAZ_SPAN_UODESC, MyGlb.VIS_DEFAREPOSTYL, 5, 120, 0, 271319169, "", "::DES_UNITA_ORGANIZZATIVA", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_UODESC, "6D784289-B2AC-44C6-B301-C87454EDBC29");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_UODESC, "UODESC");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, BUK_ALLEGAVARIAZ_RPTBOX_UNITAORGANIZ, 0, 100, 2900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_UNITAORGANIZ, "29515273-A72A-4B2B-A510-910108B07666");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_UNITAORGANIZ, "UNITAORGANIZ");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_UNITAORGANIZ, BUK_ALLEGAVARIAZ_SPAN_UNITAORGANIZ, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "Unità Organizzativa", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_UNITAORGANIZ, "97BE4E1E-350D-4F3C-8C9A-950AD00D71C6");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_UNITAORGANIZ, "UNITAORGANIZ");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, 1400, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8978433, "RECORDRAGG");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, "AA1D7AAF-13F5-492D-A4C8-72006B13503D");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, "RAGGGROUHEA1");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_OGGETTO, 0, 200, 1600, 400, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_OGGETTO, "479DFAD8-44BF-4359-8329-6E1D9CDBC1A8");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_OGGETTO, "OGGETTO");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_OGGETTO, BUK_ALLEGAVARIAZ_SPAN_OGGETTO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271319425, "", "OGGETTO: ", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_OGGETTO, "EDE5B133-402A-4D15-A60C-62A68445BB27");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_OGGETTO, "OGGETTO");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEGHEADE, 0, 900, 2800, 500, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEGHEADE, "9120E7A0-4F85-42C0-9E90-2B6A10DD973F");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEGHEADE, "VOCEPEGHEADE");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEGHEADE, BUK_ALLEGAVARIAZ_SPAN_VOCEPEG, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Voce P.e.g.", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_VOCEPEG, "8F6CEB36-EF35-4F3A-92DA-225972A330FF");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_VOCEPEG, "VOCEPEG");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_CODICEHEADER, 2800, 900, 1400, 500, 0, 1, 1, MyGlb.VIS_INCOBOSUALDX, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_CODICEHEADER, "923EE127-AE9C-44D8-BC1A-86A33C6520AD");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_CODICEHEADER, BUK_ALLEGAVARIAZ_SPAN_CODICE, MyGlb.VIS_INCOBOSUALDX, 0, 0, 0, 271384961, "", "Codice", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_CODICE, "9186E0CE-A329-4885-B6E6-CCDA78BD91D8");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_CODICE, "CODICE");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_DESCRCAPHEAD, 4200, 900, 5000, 500, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_DESCRCAPHEAD, "DA49E731-1E6E-4251-BB8C-D6F6A3C14181");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_DESCRCAPHEAD, "DESCRCAPHEAD");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_DESCRCAPHEAD, BUK_ALLEGAVARIAZ_SPAN_DESCRIZIOCAP, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_DESCRIZIOCAP, "15B1FE29-7EA7-4862-950F-34DEB6E068D4");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_DESCRIZIOCAP, "DESCRIZIOCAP");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_STNATTCOHEAD, 9200, 900, 3800, 500, 0, 1, 1, MyGlb.VIS_INCOBOSUALDX, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCOHEAD, "66CC2EFF-4D07-4F6B-BB74-6178FAEA64B0");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCOHEAD, "STNATTCOHEAD");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCOHEAD, BUK_ALLEGAVARIAZ_SPAN_STNATTCO, MyGlb.VIS_INCOBOSUALDX, 0, 0, 0, 271384961, "", "Stanziamento Attuale", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_STNATTCO, "CE64CF1F-72D5-4E7D-8763-CFB21C24AEEA");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_STNATTCO, "STNATTCO");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_VARIAZHEADER, 13000, 900, 3800, 500, 0, 1, 1, MyGlb.VIS_INCOBOBSSDAD, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZHEADER, "863B60B6-1CE9-43F5-B7E9-5A2F84F8A549");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZHEADER, "VARIAZHEADER");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZHEADER, BUK_ALLEGAVARIAZ_SPAN_VARIAZIONE, MyGlb.VIS_INCOBOBSSDAD, 0, 0, 0, 271384961, "", "Variazione", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_VARIAZIONE, "B783832D-D330-4AE2-B20C-CCEF0F258B37");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_VARIAZIONE, "VARIAZIONE");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCOHEAD, 16800, 900, 3600, 500, 0, 1, 1, MyGlb.VIS_INCOBOSUALDX, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCOHEAD, "7B3B1EFA-0FF5-4269-99AD-8C1B1366169D");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCOHEAD, "STNDEFCOHEAD");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCOHEAD, BUK_ALLEGAVARIAZ_SPAN_STNDEFCO1, MyGlb.VIS_INCOBOSUALDX, 0, 0, 0, 271384961, "", "Stanziamento Definitivo", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_STNDEFCO1, "7320E410-5398-4CBC-AAA9-F8A5435C0DC6");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_STNDEFCO1, "STNDEFCO1");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE1, 20400, 900, 7300, 500, 0, 1, 1, MyGlb.VIS_INCOBOBOSUSD, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE1, "88DE67BF-832F-45A6-873E-2DEA47D59D0C");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE1, "MOTIVAZIONE1");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE1, BUK_ALLEGAVARIAZ_SPAN_STNDEFCO, MyGlb.VIS_INCOBOBOSUSD, 0, 0, 0, 271384961, "", "Motivazione", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_STNDEFCO, "65F3493A-A972-4403-A430-FD531AF2907E");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_STNDEFCO, "STNDEFCO");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, BUK_ALLEGAVARIAZ_RPTBOX_DETTAGOGGETT, 1600, 200, 26100, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_DETTAGOGGETT, "56F568FA-E824-465D-A84E-40D092040408");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_DETTAGOGGETT, "DETTAGOGGETT");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_DETTAGOGGETT, BUK_ALLEGAVARIAZ_SPAN_DETTAGOGGET1, MyGlb.VIS_DEFAREPOSTYL, 5, 418, 0, 271319425, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_DETTAGOGGET1, "35773473-F03C-4A72-86D5-33BF386EBE7C");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_DETTAGOGGET1, "DETTAGOGGET1");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE, 100, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "TITOLO");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE, "0F137162-5A55-4CC7-9AC7-C158E8971737");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE, "POWRSATIGRHE");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_POWRSATIGRH1, 0, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 8912897, "TITOLO");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRH1, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRH1, "418DC11C-A0D3-4502-A4CF-71022CC91DE6");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRH1, "POWRSATIGRH1");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_DETAIL, "124194FB-0FC1-48D4-BC89-BB217DAB28D8");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_DETAIL, "DETAIL");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, 0, 0, 2800, 600, 0, 1, 3, MyGlb.VIS_BORDLATECUST, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, "136B43C4-8F2F-4BE5-B0DB-1EEFF5A7C6E2");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, "VOCEPEG");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_VOCEPEG, BUK_ALLEGAVARIAZ_SPAN_REVOPEREAVAP, MyGlb.VIS_BORDLATECUST, 5, 20, 0, 271384705, "", "::VOCE_PEG", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_REVOPEREAVAP, "049B79DB-76AA-4C9A-86F5-213E9BCD4A20");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_REVOPEREAVAP, "REVOPEREAVAP");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_CODICE, 2800, 0, 1400, 600, 0, 1, 3, MyGlb.VIS_NORMALEA8, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_CODICE, "7BF46AF3-7799-4E83-A0EB-0EABB907A951");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_CODICE, "CODICE");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_CODICE, BUK_ALLEGAVARIAZ_SPAN_REPOWSCRAVAP, MyGlb.VIS_NORMALEA8, 1, 7, 0, 271384705, "", "::CODICE", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_REPOWSCRAVAP, "1FB7AA05-4330-455D-87F0-15E27B594E64");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_REPOWSCRAVAP, "REPOWSCRAVAP");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, 4200, 0, 5000, 600, 0, 1, 3, MyGlb.VIS_BORDLATECUST, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, "C2374FA8-F598-4FE0-A677-6291C4925DF7");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, "DESCRIZIOCAP");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_DESCRIZIOCAP, BUK_ALLEGAVARIAZ_SPAN_REPWSDCRAVAP, MyGlb.VIS_BORDLATECUST, 5, 300, 0, 271384705, "", "::DESCRIZIONE_CAP", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_REPWSDCRAVAP, "DABB6871-7E65-4572-A22F-3F5BEFC8AFB6");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_REPWSDCRAVAP, "REPWSDCRAVAP");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO, 9200, 0, 3800, 600, 0, 1, 3, MyGlb.VIS_NORMALEA8, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO, "718B8712-B4E1-4437-91D8-255995B8C777");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO, "STNATTCO");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_STNATTCO, BUK_ALLEGAVARIAZ_SPAN_RPWSSACRAVAP, MyGlb.VIS_NORMALEA8, 3, 14, 6, 271384705, "", "::STN_ATT_CO", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_RPWSSACRAVAP, "8A1C8552-85A8-4197-84CA-7E6BB24619B9");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_RPWSSACRAVAP, "RPWSSACRAVAP");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE, 13000, 0, 3800, 600, 0, 1, 3, MyGlb.VIS_BORDLATECUST, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE, "A454AAD0-07A0-4854-88F2-85FC63EC712D");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE, "VARIAZIONE");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_VARIAZIONE, BUK_ALLEGAVARIAZ_SPAN_REPOWSVRAVAP, MyGlb.VIS_BORDLATECUST, 3, 14, 6, 271384705, "", "::VARIAZIONE", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_REPOWSVRAVAP, "2F65F583-CE34-44F8-8CED-B92FB63989C4");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_REPOWSVRAVAP, "REPOWSVRAVAP");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO, 16800, 0, 3600, 600, 0, 1, 3, MyGlb.VIS_NORMALEA8, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO, "15CECBB6-3C63-46CB-967C-E06C3085B64D");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO, "STNDEFCO");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_STNDEFCO, BUK_ALLEGAVARIAZ_SPAN_RPWSSDCRAVAP, MyGlb.VIS_NORMALEA8, 3, 14, 6, 271384705, "", "::STN_DEF_CO", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_RPWSSDCRAVAP, "D1B1D842-F104-444D-8FDF-B55C363F2FC3");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_RPWSSDCRAVAP, "RPWSSDCRAVAP");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_DETAIL, BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, 20400, 0, 7300, 600, 0, 1, 3, MyGlb.VIS_BORDLATECUST, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, "3BC9725E-5785-4060-9EC8-9BA85E71A677");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, "MOTIVAZIONE");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_MOTIVAZIONE, BUK_ALLEGAVARIAZ_SPAN_MOTIVAZIONE, MyGlb.VIS_BORDLATECUST, 5, 400, 0, 271319425, "", "::DESCRIZIONE", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_MOTIVAZIONE, "7836B2EE-43DC-40F5-9B10-94338E486E62");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_MOTIVAZIONE, "MOTIVAZIONE");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_POWRSATIGRFO, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "TITOLO");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRFO, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRFO, "123C1703-DD80-4510-A699-A56B328A8608");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRFO, "POWRSATIGRFO");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRFO, BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX1, 0, 0, 27700, 100, 0, 1, 1, MyGlb.VIS_BORDOSUPERIO, 983041, 0, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX1, "395F51F8-2773-4D85-9A1E-4A36CA21F474");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "TITOLO");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, "1ABD8301-400E-4407-BAB0-2C261C1AB51B");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, "POWRSATIGRF1");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, BUK_ALLEGAVARIAZ_RPTBOX_TOTTITOLO, 4200, 0, 4900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTTITOLO, "B5471725-970C-4048-A531-7FB71C016CC3");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTTITOLO, "TOTTITOLO");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTTITOLO, BUK_ALLEGAVARIAZ_SPAN_TOT1, MyGlb.VIS_INTSENBORRIG, 5, 113, 0, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOT1, "517D991F-A4F6-48D9-A6E0-5282971C59E1");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOT1, "TOT1");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANZATTU, 9200, 0, 3800, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANZATTU, "302BC097-815A-4643-99DD-2F94796D5D68");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANZATTU, "TOTSTANZATTU");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANZATTU, BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATT1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATT1, "B942EB3D-77B0-4CC3-8361-E515292F54A4");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATT1, "TOTSTANZATT1");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR, 13000, 0, 3800, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR, "884034E9-A2E4-4577-85F8-7C495857C868");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR, "TOTVAR");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR, BUK_ALLEGAVARIAZ_SPAN_TOTVAR1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOTVAR1, "2E2AC1E9-CAE6-4A38-867F-987366AE93F5");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOTVAR1, "TOTVAR1");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRF1, BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR1, 16800, 0, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR1, "5A193EEB-50B7-4E9D-A36B-4ECA0866873F");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR1, "TOTVAR1");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR1, BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADE1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADE1, "72496BBA-1145-4359-A270-552F85555727");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADE1, "TOTSTANZADE1");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT, 100, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "RECORDRAGG");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT, "B6CB1D52-A423-4864-B357-F32015BA042C");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_RAGGGROUFOOT, "RAGGGROUFOOT");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_UOFOOTER, 600, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "PROGR_UNITA_ORGANIZZATIVA");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_UOFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_UOFOOTER, "8C253B49-9A53-4DC2-ACFB-7C22CB9AF4AB");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_UOFOOTER, "UOFOOTER");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_UOFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_TOTUO, 4200, 100, 4900, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTUO, "1EAED6B7-509F-41C4-B335-1A80CFC48FEF");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTUO, "TOTUO");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTUO, BUK_ALLEGAVARIAZ_SPAN_TOT, MyGlb.VIS_INTSENBORRIG, 5, 126, 0, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOT, "9717ECF2-348C-4116-B69F-BFEAAFD22B8D");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOT, "TOT");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_UOFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANATTU1, 9200, 100, 3800, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANATTU1, "6CDC8AD1-E77A-49C0-80E2-C765DD2791C7");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANATTU1, "TOTSTANATTU1");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTSTANATTU1, BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATTU, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATTU, "537C65C4-41C0-4D63-A43C-1082E466BB1A");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZATTU, "TOTSTANZATTU");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_UOFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR2, 13000, 100, 3800, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR2, "599DECC3-4121-46BC-9DCB-130ED0AADEC3");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR2, "TOTVAR2");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR2, BUK_ALLEGAVARIAZ_SPAN_TOTVAR, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOTVAR, "DB3BB2BF-28DC-43F4-BE52-5D0EC792BD66");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOTVAR, "TOTVAR");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_UOFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR3, 16800, 100, 3600, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR3, "C7A5FF5F-928A-4696-9434-E43E154265E6");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR3, "TOTVAR3");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_TOTVAR3, BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADEF, MyGlb.VIS_IMPORTO, 3, 28, 6, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADEF, "96691794-2B29-40E8-A305-0886FA340916");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_TOTSTANZADEF, "TOTSTANZADEF");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_TIPOVARFOOTE, 400, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "TIPO_VAR");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_TIPOVARFOOTE, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_TIPOVARFOOTE, "1D29DA37-4014-4457-A2BE-85AA47A4C4DD");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_TIPOVARFOOTE, "TIPOVARFOOTE");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_TIPOVAR1FOOT, 300, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 9109505, "TIPO_VAR");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_TIPOVAR1FOOT, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_TIPOVAR1FOOT, "E2DD97F2-7A17-4F92-893A-B3618E08EB9A");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_TIPOVAR1FOOT, "TIPOVAR1FOOT");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER, 2700, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER, "5A7D25AC-E5AD-473C-A4D5-5BFDC12E0099");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_COMUNE, 0, 1300, 4000, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_COMUNE, "94C39615-37FE-4A68-972A-8F4C5CBA217C");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_COMUNE, "COMUNE");
    BUK_ALLEGAVARIAZ.InitBoxSpan(BUK_ALLEGAVARIAZ_RPTBOX_COMUNE, BUK_ALLEGAVARIAZ_SPAN_COMUNE, MyGlb.VIS_INTSENBORRIG, 5, 54, 0, 271319169, "", "", 1);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SPAN_COMUNE, "6793B771-19F5-46E3-AC7B-22C63DA3A2BC");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SPAN_COMUNE, "COMUNE");
    BUK_ALLEGAVARIAZ.InitReportBox(BUK_ALLEGAVARIAZ_SEC_PAGEFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX, 4000, 1100, 2500, 500, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX, "7B966BB5-FFFD-40D9-9A79-EE3199C655E6");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_RPTBOX_NEWBOX, "NEWBOX");
    BUK_ALLEGAVARIAZ.InitSection(BUK_ALLEGAVARIAZ_RPT_REPORT, BUK_ALLEGAVARIAZ_SEC_REPORTFOOTER, 1700, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_ALLEGAVARIAZ.SetSectionRendersInto(BUK_ALLEGAVARIAZ_SEC_REPORTFOOTER, BUK_ALLEGAVARIAZ_RPTBOX_PAGEFOOTER);
    BUK_ALLEGAVARIAZ.SetRTCGuid(BUK_ALLEGAVARIAZ_SEC_REPORTFOOTER, "C47BC731-12AA-4961-890A-26A985EE184C");
    BUK_ALLEGAVARIAZ.SetObjCode(BUK_ALLEGAVARIAZ_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_TIPVARGROHEA, "TIPO_VAR");
    BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_POWRSAPRUOGH, "PROGR_UNITA_ORGANIZZATIVA");
    BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_RAGGGROUHEA1, "RECORDRAGG");
    BUK_ALLEGAVARIAZ.AddReportGroup(BUK_ALLEGAVARIAZ_SEC_POWRSATIGRHE, "TITOLO");
    BUK_ALLEGAVARIAZ_RPT_REPORT_InitQuery(false, true);
  }

  private void BUK_ALLEGAVARIAZ_InitLinks()
  {
    BUK_ALLEGAVARIAZ.SetBoxNextBox(BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY, BUK_ALLEGAVARIAZ_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_ALLEGAVARIAZ) BUK_ALLEGAVARIAZ_OnPreview();
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
