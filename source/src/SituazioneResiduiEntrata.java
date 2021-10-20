// **********************************************
// Situazione Residui Entrata
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneResiduiEntrata extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_CAPITOLO = 0;
  private static int PFL_PARAMETRI_ARTICOLO = 1;
  private static int PFL_PARAMETRI_DESCRICAPITO = 2;
  private static int PFL_PARAMETRI_DESCRIARTICO = 3;

  private static int PPQRY_PARAMETRI105 = 0;

  private static int PPQRY_DESCRICAPITO = 1;
  private static int PPQRY_DESCRIARTICO = 2;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_SITURESIENTR;
  OBook BKW_SITURESIENTR;
  //
  // Template Pages constants
  private static int BUK_SITURESIENTR_MST_SITURESIPAGE = 1;
  private static int BUK_SITURESIENTR_RPTBOX_PAGEHEADER1 = 2;
  private static int BUK_SITURESIENTR_RPTBOX_PAGEBODY = 3;
  private static int BUK_SITURESIENTR_RPTBOX_PAGEFOOTER1 = 4;

  //
  // Reports constants
  private static int BUK_SITURESIENTR_RPT_NEWREPORT = 5;
  private static int BUK_SITURESIENTR_SEC_REPORTHEADER = 6;
  private static int BUK_SITURESIENTR_RPTBOX_ANNOHEADER = 7;
  private static int BUK_SITURESIENTR_SPAN_ANNO = 8;
  private static int BUK_SITURESIENTR_RPTBOX_IMPOINIZHEAD = 9;
  private static int BUK_SITURESIENTR_SPAN_IMPORTINIZIA = 10;
  private static int BUK_SITURESIENTR_RPTBOX_VARIAZHEADER = 11;
  private static int BUK_SITURESIENTR_SPAN_VARIAZIONI = 12;
  private static int BUK_SITURESIENTR_RPTBOX_ACCERTHEADER = 13;
  private static int BUK_SITURESIENTR_SPAN_ACCERTAMENTI = 14;
  private static int BUK_SITURESIENTR_RPTBOX_INCASSHEADER = 15;
  private static int BUK_SITURESIENTR_SPAN_INCASSI = 16;
  private static int BUK_SITURESIENTR_RPTBOX_ORDINAHEADER = 17;
  private static int BUK_SITURESIENTR_SPAN_ORDINATIVI = 18;
  private static int BUK_SITURESIENTR_RPTBOX_DISPONHEADER = 19;
  private static int BUK_SITURESIENTR_SPAN_DISPONIBILI1 = 20;
  private static int BUK_SITURESIENTR_SEC_PAGEHEADER = 21;
  private static int BUK_SITURESIENTR_RPTBOX_NEWBOX = 22;
  private static int BUK_SITURESIENTR_SPAN_SITURESIENTR = 23;
  private static int BUK_SITURESIENTR_SEC_DETAIL = 24;
  private static int BUK_SITURESIENTR_RPTBOX_ANNO = 25;
  private static int BUK_SITURESIENTR_SPAN_REANSIREESRE = 26;
  private static int BUK_SITURESIENTR_RPTBOX_IMPORTINIZIA = 27;
  private static int BUK_SITURESIENTR_SPAN_REIMINSRESR1 = 28;
  private static int BUK_SITURESIENTR_RPTBOX_VARIAZIONI = 29;
  private static int BUK_SITURESIENTR_SPAN_REVASIREENSR = 30;
  private static int BUK_SITURESIENTR_RPTBOX_ACCERTAMENTI = 31;
  private static int BUK_SITURESIENTR_SPAN_REACSIREENSR = 32;
  private static int BUK_SITURESIENTR_RPTBOX_INCASSI = 33;
  private static int BUK_SITURESIENTR_SPAN_REINSIREESRE = 34;
  private static int BUK_SITURESIENTR_RPTBOX_ORDINATIVI = 35;
  private static int BUK_SITURESIENTR_SPAN_REORSIREESRE = 36;
  private static int BUK_SITURESIENTR_RPTBOX_DISPONIBILIT = 37;
  private static int BUK_SITURESIENTR_SPAN_DISPONIBILIT = 38;
  private static int BUK_SITURESIENTR_SEC_REPORTFOOTER = 39;
  private static int BUK_SITURESIENTR_RPTBOX_LABELTOT = 40;
  private static int BUK_SITURESIENTR_SPAN_TOT = 41;
  private static int BUK_SITURESIENTR_RPTBOX_SUMOFACCERTA = 42;
  private static int BUK_SITURESIENTR_SPAN_REFSRASRESRE = 43;
  private static int BUK_SITURESIENTR_RPTBOX_SUMOFIMPOINI = 44;
  private static int BUK_SITURESIENTR_SPAN_RFSRIISRESRE = 45;
  private static int BUK_SITURESIENTR_RPTBOX_SUMOFVARIAZI = 46;
  private static int BUK_SITURESIENTR_SPAN_REFSRVSRESRE = 47;
  private static int BUK_SITURESIENTR_RPTBOX_SUMOFORDINAT = 48;
  private static int BUK_SITURESIENTR_SPAN_REFSROSRESRE = 49;
  private static int BUK_SITURESIENTR_RPTBOX_SUMOFINCASSI = 50;
  private static int BUK_SITURESIENTR_SPAN_REFSRISRESRE = 51;
  private static int BUK_SITURESIENTR_RPTBOX_SUMOFDISPONI = 52;
  private static int BUK_SITURESIENTR_SPAN_REFSRDSRESRE = 53;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI100(IMDB);
    Init_TBL_TOTALI1(IMDB);
    //
    //
    Init_PQRY_VISTAACCELEN(IMDB);
    Init_PQRY_PARAMETRI105(IMDB);
    Init_PQRY_PARAMETRI105_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI100(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI100, 11);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI100, "TBL_PARAMETRI100");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMETRIDAL, "PARAMETRIDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMETRIDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMEESERCI, "PARAMEESERCI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMEESERCI,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMUOUTILI,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMETITOLO, "PARAMETITOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMETITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMECATEGO, "PARAMECATEGO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMECATEGO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMCODTERZ, "PARAMCODTERZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMCODTERZ,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMECAPITO, "PARAMECAPITO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMECAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMEARTICO, "PARAMEARTICO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMEARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMESEVOCE, "PARAMESEVOCE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI100,IMDBDef6.FLD_PARAMETRI100_PARAMESEVOCE,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI100, 0);
  }

  private static void Init_TBL_TOTALI1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_TOTALI1, 5);
    IMDB.set_TblCode(IMDBDef6.TBL_TOTALI1, "TBL_TOTALI1");
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTIMPORINIZ, "TOTIMPORINIZ");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTIMPORINIZ,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTVARIAZION, "TOTVARIAZION");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTVARIAZION,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTACCERTAME, "TOTACCERTAME");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTACCERTAME,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTORDINATIV, "TOTORDINATIV");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTORDINATIV,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTINCASSI, "TOTINCASSI");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI1,IMDBDef6.FLD_TOTALI1_TOTINCASSI,3,20,2);
    IMDB.TblAddNew(IMDBDef6.TBL_TOTALI1, 0);
  }

  private static void Init_PQRY_VISTAACCELEN(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_VISTAACCELEN, 7);
    IMDB.set_TblCode(IMDBDef17.PQRY_VISTAACCELEN, "PQRY_VISTAACCELEN");
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_SALDO_INI, "SALDO_INI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_SALDO_INI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_VARIAZIONI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_RECORDACCERT, "RECORDACCERT");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_RECORDACCERT,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_RECORDORDINA, "RECORDORDINA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_RECORDORDINA,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_RECORDINCASS, "RECORDINCASS");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_RECORDINCASS,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISTAACCELEN,IMDBDef17.PQSL_VISTAACCELEN_DISPONIBILITA,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_VISTAACCELEN, 0);
  }

  private static void Init_PQRY_PARAMETRI105(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI105, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI105, "PQRY_PARAMETRI105");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI105,IMDBDef17.PQSL_PARAMETRI105_PARAMECAPITO, "PARAMECAPITO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI105,IMDBDef17.PQSL_PARAMETRI105_PARAMECAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI105,IMDBDef17.PQSL_PARAMETRI105_PARAMEARTICO, "PARAMEARTICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI105,IMDBDef17.PQSL_PARAMETRI105_PARAMEARTICO,1,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI105, 0);
  }

  private static void Init_PQRY_PARAMETRI105_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI105_RS, 2);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI105_RS, "PQRY_PARAMETRI105_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI105_RS,IMDBDef17.PQSL_PARAMETRI105_PARAMECAPITO, "PARAMECAPITO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI105_RS,IMDBDef17.PQSL_PARAMETRI105_PARAMECAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI105_RS,IMDBDef17.PQSL_PARAMETRI105_PARAMEARTICO, "PARAMEARTICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI105_RS,IMDBDef17.PQSL_PARAMETRI105_PARAMEARTICO,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneResiduiEntrata(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneResiduiEntrata()
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
    FormIdx = MyGlb.FRM_SITURESIENTR;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5F4F8BCA-2938-4B05-B033-677F625193AF";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 856;
    DesignHeight = 574;
    set_Caption(new IDVariant("Situazione Residui Entrata"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 856;
    Frames[1].Height = 548;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.138686;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 856;
    Frames[2].Height = 76;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 76;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 856-MyGlb.PAN_OFFS_X, 76-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "229B8A98-B3EA-4F00-9767-79F23430138D");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 792, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 856;
    Frames[3].Height = 472;
    Frames[3].Caption = "Situazione Residui Entrata";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 472;
    BKW_SITURESIENTR = new OBook(this);
    BUK_SITURESIENTR = new CIDREObj(BKW_SITURESIENTR);
    Frames[3].Content = BKW_SITURESIENTR;
    BKW_SITURESIENTR.Height = 442;
    BKW_SITURESIENTR.Width = 856;
    BKW_SITURESIENTR.iGuid = "2D06A58A-5B8B-49FE-A1E7-EE4D846CD5A5";
    BKW_SITURESIENTR.Code = "BUK_SITURESIENTR";
    BKW_SITURESIENTR.BookObj = BUK_SITURESIENTR;
    BKW_SITURESIENTR.InitDefMasks();
    BUK_SITURESIENTR.set_FrIndex(3);
    BUK_SITURESIENTR.InitBook(1, 3342593, "Situazione Residui Entrata", IMDB, MainFrm.VisualStyleList);
    BUK_SITURESIENTR.InitHTML();
    BUK_SITURESIENTR.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITURESIENTR.SetSize(856, 442);
    BUK_SITURESIENTR.Book.SetMainFrm(MainFrm);
    BUK_SITURESIENTR.SetRTCGuid(0, "2D06A58A-5B8B-49FE-A1E7-EE4D846CD5A5");
    BUK_SITURESIENTR.SetObjCode(0, "SITURESIENTR");
    BUK_SITURESIENTR_MST_SITURESIPAGE_Init();
    BUK_SITURESIENTR_RPT_NEWREPORT_Init();
    BUK_SITURESIENTR_InitLinks();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI100, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITURESIENTR_PARAMETRI105();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      BUK_SITURESIENTR.UpdateBook();
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
    if (Code.equals("BUK_SITURESIENTR")) return BUK_SITURESIENTR;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SituazioneResiduiEntrata);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneResiduiEntrata.class.getName() : (Glb.ClassWithPackage(SituazioneResiduiEntrata.class) ? SituazioneResiduiEntrata.class.getName().substring(SituazioneResiduiEntrata.class.getPackage().getName().length() + 1) : SituazioneResiduiEntrata.class.getName()));
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
      MainFrm.ErrObj.ProcError ("SituazioneResiduiEntrata", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Unload Event
  // Evento notificato dal form prima della chiusura dello
  // stesso
  // Cancel: Se impostato a True la chiusura del form viene annullata. - Input/Output
  // Confirm: Rappresenta la scelta dell'utente per la chiusura dei form modali. True se l'utente ha confermato la scelta effettuata, False altrimenti. - Input
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
      // Unload Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARASOLOCOMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMETRIDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMEESERCI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMUOGESTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMETITOLO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMCODTERZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMECATEGO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMECAPITO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMEARTICO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMESEVOCE, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneResiduiEntrata", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARAMETRI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri After Find Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI105, IMDBDef17.PQSL_PARAMETRI105_PARAMECAPITO, 0)))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI105, IMDBDef17.PQSL_PARAMETRI105_PARAMEARTICO, 0)))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI105, IMDBDef17.PQSL_PARAMETRI105_PARAMECAPITO, 0).equals((new IDVariant(0)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI105, IMDBDef17.PQSL_PARAMETRI105_PARAMEARTICO, 0).equals((new IDVariant(0)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneResiduiEntrata", "ParametriAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_DESCRICAPITO,(new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_DESCRICAPITO))).stringValue()); 
      PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_DESCRIARTICO,(new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_DESCRIARTICO))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneResiduiEntrata", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SITURESIENTR_PARAMETRI105() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI105_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI100, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI100, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI105_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI105_RS, 0, IMDBDef6.TBL_PARAMETRI100, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI105_RS, 0, 0, IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMECAPITO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI105_RS, 1, 0, IMDBDef6.TBL_PARAMETRI100, IMDBDef6.FLD_PARAMETRI100_PARAMEARTICO, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI100, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI100, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI100, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI105_RS, 0);
  }

  
  
  // **********************************************
  // Event Stubs
  // **********************************************  
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_SITURESIENTR_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITURESIENTR_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITURESIENTR_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_SITURESIENTR_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_SITURESIENTR_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SITURESIENTR_SEC_REPORTFOOTER)
    {
      BUK_SITURESIENTR.set_SpanValue(BUK_SITURESIENTR_SPAN_REFSRASRESRE, new IDVariant(BUK_SITURESIENTR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESIENTR_SEC_REPORTFOOTER,"RECORDACCERT")));
      BUK_SITURESIENTR.set_SpanValue(BUK_SITURESIENTR_SPAN_RFSRIISRESRE, new IDVariant(BUK_SITURESIENTR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESIENTR_SEC_REPORTFOOTER,"SALDO_INI")));
      BUK_SITURESIENTR.set_SpanValue(BUK_SITURESIENTR_SPAN_REFSRVSRESRE, new IDVariant(BUK_SITURESIENTR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESIENTR_SEC_REPORTFOOTER,"VARIAZIONI")));
      BUK_SITURESIENTR.set_SpanValue(BUK_SITURESIENTR_SPAN_REFSROSRESRE, new IDVariant(BUK_SITURESIENTR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESIENTR_SEC_REPORTFOOTER,"RECORDORDINA")));
      BUK_SITURESIENTR.set_SpanValue(BUK_SITURESIENTR_SPAN_REFSRISRESRE, new IDVariant(BUK_SITURESIENTR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESIENTR_SEC_REPORTFOOTER,"RECORDINCASS")));
      BUK_SITURESIENTR.set_SpanValue(BUK_SITURESIENTR_SPAN_REFSRDSRESRE, new IDVariant(BUK_SITURESIENTR.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESIENTR_SEC_REPORTFOOTER,"DISPONIBILITA")));
    }
  }

  private void BUK_SITURESIENTR_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITURESIENTR_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITURESIENTR_MST_SITURESIPAGE)
    {
    }
  }

  private void BUK_SITURESIENTR_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SITURESIENTR_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITURESIENTR_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITURESIENTR_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "7A482DE3-376D-437E-8C8B-935F2B6EEFE2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "Capitolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "48BC377B-EAAA-47A0-9039-AD1ADBCC5097");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "Articolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, "2A3B6D26-A4FF-42B9-BE98-0DFAA4F16D5F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, "DESCRIZIONE CAPITOLO");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, "1F7D64CD-3592-466E-A95A-20EA12AE3512");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, "DESCRIZIONE ARTICOLO");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 552, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, "Capit.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 8, 16, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLO, PPQRY_PARAMETRI105, "A.PARAMECAPITO", "PARAMECAPITO", 3, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 592, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, "Artic.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 8, 40, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTICOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTICOLO, PPQRY_PARAMETRI105, "A.PARAMEARTICO", "PARAMEARTICO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, "DESCRIZIONE CAPITOLO");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, 188, 16, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, "DESCR. CAPIT.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRICAPITO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRICAPITO, PPQRY_DESCRICAPITO, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, "DESCRIZIONE ARTICOLO");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, 188, 40, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, "DESCR. ARTIC.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIARTICO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIARTICO, PPQRY_DESCRIARTICO, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~TBL_PARAMETRI100.PARAMECAPITO~~ AND A.ARTICOLO = 0) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI100.PARAMEESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_DESCRICAPITO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DESCRICAPITO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_DESCRICAPITO, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~TBL_PARAMETRI100.PARAMECAPITO~~ AND A.ARTICOLO = ~~TBL_PARAMETRI100.PARAMEARTICO~~) ");
    SQL.append("and   (A.E_S = 'E') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI100.PARAMEESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_DESCRIARTICO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DESCRIARTICO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_DESCRIARTICO, "CAP");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI105", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Parametri");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI105, IMDBDef17.PQRY_PARAMETRI105_RS, IMDBDef6.TBL_PARAMETRI100);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOLO, IMDBDef6.FLD_PARAMETRI100_PARAMECAPITO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ARTICOLO, IMDBDef6.FLD_PARAMETRI100_PARAMEARTICO);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI100");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_SITURESIENTR_MST_SITURESIPAGE_Init()
  {
    BUK_SITURESIENTR.InitMastro(BUK_SITURESIENTR_MST_SITURESIPAGE, 3, 21000, 29700, 1, 1, 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_MST_SITURESIPAGE, "72C39DC4-9A90-4836-ADB4-5B645E36CF6C");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_MST_SITURESIPAGE, "SITURESIPAGE");
    BUK_SITURESIENTR.InitMastroBox(BUK_SITURESIENTR_MST_SITURESIPAGE, BUK_SITURESIENTR_RPTBOX_PAGEHEADER1, 1000, 1000, 19000, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_PAGEHEADER1, "D61A50D7-F2A7-4A7F-A66E-048FD426B379");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_SITURESIENTR.InitMastroBox(BUK_SITURESIENTR_MST_SITURESIPAGE, BUK_SITURESIENTR_RPTBOX_PAGEBODY, 1000, 3600, 19000, 22700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_PAGEBODY, "584651B9-540A-4056-88D8-E27E43DFC4DF");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_SITURESIENTR.InitMastroBox(BUK_SITURESIENTR_MST_SITURESIPAGE, BUK_SITURESIENTR_RPTBOX_PAGEFOOTER1, 1000, 26600, 19000, 2000, 0, 3, 2, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_PAGEFOOTER1, "70AABD9D-95D4-4230-860B-D798EC116197");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_PAGEFOOTER1, "PAGEFOOTER1");
  }

  private void BUK_SITURESIENTR_RPT_NEWREPORT_InitQuery() { BUK_SITURESIENTR_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_SITURESIENTR_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
      SQL.append("  SUM(DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), -1, A.SALDO_INI, 0)) as SALDO_INI, ");
      SQL.append("  SUM(A.VARIAZIONI_RES) + SUM(DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), 0, A.SALDO_INI, 0)) as VARIAZIONI, ");
      SQL.append("  SUM(DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), -1, A.SALDO_INI, 0)) + SUM(A.VARIAZIONI_RES) + SUM(DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), 0, A.SALDO_INI, 0)) as RECORDACCERT, ");
      SQL.append("  SUM(A.ORDINATIVI) as RECORDORDINA, ");
      SQL.append("  MAX(NVL(A_INCASSATO(~~TBL_PARAMETRI100.PARAMEESERCI~~,DECODE(~~TBL_PARAMETRI100.PARAMECAPITO~~, 0, to_number(NULL), A.CAPITOLO),DECODE(~~TBL_PARAMETRI100.PARAMEARTICO~~, 0, to_number(NULL), A.ARTICOLO),A.ANNO_ACC), 0)) as RECORDINCASS, ");
      SQL.append("  SUM(A.DISPONIBILITA) as DISPONIBILITA ");
      SQL.append("from ");
      SQL.append("  VISTA_ACC_ELENCO A ");
      SQL.append("where (A.ESERCIZIO = ~~TBL_PARAMETRI100.PARAMEESERCI~~) ");
      SQL.append("and   (A.ANNO_ACC < ~~TBL_PARAMETRI100.PARAMEESERCI~~) ");
      SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI100.PARAMUOGESTI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
      SQL.append("and   ((~~TBL_PARAMETRI100.PARAMUOGESTI~~ IS NULL) OR ((A.SCADENZA_UO IS NULL) OR A.SCADENZA_UO >= TRUNC( SYSDATE ))) ");
      SQL.append("and   (~~TBL_PARAMETRI100.PARAMESEVOCE~~ = 'NO' OR (~~TBL_PARAMETRI100.PARAMESEVOCE~~ = 'SI' AND A.CAPITOLO = DECODE(~~TBL_PARAMETRI100.PARAMECAPITO~~, 0, A.CAPITOLO, ~~TBL_PARAMETRI100.PARAMECAPITO~~) AND A.ARTICOLO = DECODE(~~TBL_PARAMETRI100.PARAMEARTICO~~, 0, A.ARTICOLO, ~~TBL_PARAMETRI100.PARAMEARTICO~~) AND NVL(A.TITOLO, -1) = DECODE(~~TBL_PARAMETRI100.PARAMETITOLO~~, -1, NVL(A.TITOLO, -1), ~~TBL_PARAMETRI100.PARAMETITOLO~~) AND NVL(A.CATEGORIA, -1) = DECODE(~~TBL_PARAMETRI100.PARAMECATEGO~~, -1, NVL(A.CATEGORIA, -1), ~~TBL_PARAMETRI100.PARAMECATEGO~~) AND NVL(A.COD_TERZI, -1) = DECODE(~~TBL_PARAMETRI100.PARAMCODTERZ~~, -1, NVL(A.COD_TERZI, -1), ~~TBL_PARAMETRI100.PARAMCODTERZ~~))) ");
      SQL.append("group by ");
      SQL.append("  A.ANNO_ACC ");
      BUK_SITURESIENTR.SetReportQuery(BUK_SITURESIENTR_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "8C9F64CF-4ABC-4F41-A70E-7BC00A4DDB0D");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITURESIENTR_RPT_NEWREPORT_Init()
  {
    BUK_SITURESIENTR.InitReport(BUK_SITURESIENTR_RPT_NEWREPORT, 196609);
    BUK_SITURESIENTR_RPT_NEWREPORT_InitQuery(true, false);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPT_NEWREPORT, "CB17AB6E-9F8D-4483-A3FA-E53AEC6634B2");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPT_NEWREPORT, "NEWREPORT");
    BUK_SITURESIENTR.InitSection(BUK_SITURESIENTR_RPT_NEWREPORT, BUK_SITURESIENTR_SEC_REPORTHEADER, 600, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITURESIENTR.SetSectionRendersInto(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_PAGEBODY);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SEC_REPORTHEADER, "BADA898D-832D-4970-B045-E30678A1BF27");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_ANNOHEADER, 0, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_ANNOHEADER, "0DD49078-EA59-4DF4-9871-13AFE00D86A2");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_ANNOHEADER, "ANNOHEADER");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_ANNOHEADER, BUK_SITURESIENTR_SPAN_ANNO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Anno", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_ANNO, "21441720-8D5D-408D-A586-B6CD7618BC06");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_ANNO, "ANNO");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_IMPOINIZHEAD, 1300, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_IMPOINIZHEAD, "7F9C0491-E91F-42AB-A38C-AF88DABCCD45");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_IMPOINIZHEAD, "IMPOINIZHEAD");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_IMPOINIZHEAD, BUK_SITURESIENTR_SPAN_IMPORTINIZIA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo Iniziale", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_IMPORTINIZIA, "BAD3B8B7-1431-4770-9BDF-4B38F70AA1BC");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_IMPORTINIZIA, "IMPORTINIZIA");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_VARIAZHEADER, 4200, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_VARIAZHEADER, "2F0DAE87-B4EF-4248-BBD4-A4EE2211F9BF");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_VARIAZHEADER, "VARIAZHEADER");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_VARIAZHEADER, BUK_SITURESIENTR_SPAN_VARIAZIONI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Variazioni", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_VARIAZIONI, "ABD04E01-B20A-45D3-948D-2FB3E8C36359");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_VARIAZIONI, "VARIAZIONI");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_ACCERTHEADER, 7100, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_ACCERTHEADER, "44F31201-8344-43F9-8CBF-73DBA825B948");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_ACCERTHEADER, BUK_SITURESIENTR_SPAN_ACCERTAMENTI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Accertamenti", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_ACCERTAMENTI, "F77F94E2-207F-4366-BA80-086C85BBA616");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_ACCERTAMENTI, "ACCERTAMENTI");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_INCASSHEADER, 12900, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_INCASSHEADER, "097B87C2-E9AF-4CFA-BAC7-ADF450629A2A");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_INCASSHEADER, "INCASSHEADER");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_INCASSHEADER, BUK_SITURESIENTR_SPAN_INCASSI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Incassi", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_INCASSI, "B53EDA6F-A371-4A89-95B1-CADC5003FDBD");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_INCASSI, "INCASSI");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_ORDINAHEADER, 10000, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_ORDINAHEADER, "76297C46-D710-44ED-ADA8-DAD0F97C95E4");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_ORDINAHEADER, "ORDINAHEADER");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_ORDINAHEADER, BUK_SITURESIENTR_SPAN_ORDINATIVI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Ordinativi", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_ORDINATIVI, "EDF7FE48-7422-4CE9-86AC-48B30484CCBD");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_ORDINATIVI, "ORDINATIVI");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTHEADER, BUK_SITURESIENTR_RPTBOX_DISPONHEADER, 15800, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_DISPONHEADER, "DDB8AB6F-5DF5-4B18-B21C-061B3AE82296");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_DISPONHEADER, "DISPONHEADER");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_DISPONHEADER, BUK_SITURESIENTR_SPAN_DISPONIBILI1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_DISPONIBILI1, "429C02E5-1835-41BD-879D-C082C0594086");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_DISPONIBILI1, "DISPONIBILI1");
    BUK_SITURESIENTR.InitSection(BUK_SITURESIENTR_RPT_NEWREPORT, BUK_SITURESIENTR_SEC_PAGEHEADER, 1600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITURESIENTR.SetSectionRendersInto(BUK_SITURESIENTR_SEC_PAGEHEADER, BUK_SITURESIENTR_RPTBOX_PAGEHEADER1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SEC_PAGEHEADER, "FA518628-7B16-44A3-B17A-6406951BF926");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_PAGEHEADER, BUK_SITURESIENTR_RPTBOX_NEWBOX, 4400, 400, 9600, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_NEWBOX, "7723B6D8-878D-4069-B652-30DDC7B7CDAE");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_NEWBOX, "NEWBOX");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_NEWBOX, BUK_SITURESIENTR_SPAN_SITURESIENTR, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Situazione Residui - Entrata", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_SITURESIENTR, "107CA28D-0A07-42AC-B5FB-FE61104DFD65");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_SITURESIENTR, "SITURESIENTR");
    BUK_SITURESIENTR.InitSection(BUK_SITURESIENTR_RPT_NEWREPORT, BUK_SITURESIENTR_SEC_DETAIL, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITURESIENTR.SetSectionRendersInto(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_PAGEBODY);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SEC_DETAIL, "E9A4745D-A734-4AA6-B4B3-3D171C60DEC5");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SEC_DETAIL, "DETAIL");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_ANNO, 0, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_ANNO, "98E12944-C2E0-4E7E-B207-52453EC20651");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_ANNO, "ANNO");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_ANNO, BUK_SITURESIENTR_SPAN_REANSIREESRE, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "", "::ANNO_ACC", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REANSIREESRE, "448449C6-F91A-4C04-8A5D-19E9E15E3D1C");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REANSIREESRE, "REANSIREESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_IMPORTINIZIA, 1300, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_IMPORTINIZIA, "A7C546FF-BD7C-4F12-A618-5156F9B75A2A");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_IMPORTINIZIA, "IMPORTINIZIA");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_IMPORTINIZIA, BUK_SITURESIENTR_SPAN_REIMINSRESR1, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::SALDO_INI", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REIMINSRESR1, "7130D1B5-3D92-4AF0-8181-A4738F44844B");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REIMINSRESR1, "REIMINSRESR1");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_VARIAZIONI, 4200, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_VARIAZIONI, "EAB993DD-0E05-4845-8161-79911CAC44A4");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_VARIAZIONI, "VARIAZIONI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_VARIAZIONI, BUK_SITURESIENTR_SPAN_REVASIREENSR, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::VARIAZIONI", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REVASIREENSR, "324DED30-0FD7-413A-B257-B80B9D62D9B1");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REVASIREENSR, "REVASIREENSR");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_ACCERTAMENTI, 7100, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_ACCERTAMENTI, "0BFA73F6-3DAE-4840-A1B9-C05E406CD923");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_ACCERTAMENTI, "ACCERTAMENTI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_ACCERTAMENTI, BUK_SITURESIENTR_SPAN_REACSIREENSR, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDACCERT", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REACSIREENSR, "00E39543-CE20-406B-AB73-FFD73C089E69");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REACSIREENSR, "REACSIREENSR");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_INCASSI, 12900, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_INCASSI, "59786B42-A1BF-49DA-ADD4-4C2642618AF8");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_INCASSI, "INCASSI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_INCASSI, BUK_SITURESIENTR_SPAN_REINSIREESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDINCASS", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REINSIREESRE, "9EA9E955-AB8D-40B2-B350-3780F9069B59");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REINSIREESRE, "REINSIREESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_ORDINATIVI, 10000, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_ORDINATIVI, "F25523DE-BBDF-4D06-BEA9-E223334C3C46");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_ORDINATIVI, "ORDINATIVI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_ORDINATIVI, BUK_SITURESIENTR_SPAN_REORSIREESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDORDINA", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REORSIREESRE, "8EBF8A7E-7F80-440D-BE47-0B44F184D5A6");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REORSIREESRE, "REORSIREESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_DETAIL, BUK_SITURESIENTR_RPTBOX_DISPONIBILIT, 15800, 0, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_DISPONIBILIT, "A6DFA24C-FA48-4688-AF11-7064D19A7B49");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_DISPONIBILIT, BUK_SITURESIENTR_SPAN_DISPONIBILIT, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_DISPONIBILIT, "85815659-DC2A-4FF7-B888-4E9788CA0CAE");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_DISPONIBILIT, "DISPONIBILIT");
    BUK_SITURESIENTR.InitSection(BUK_SITURESIENTR_RPT_NEWREPORT, BUK_SITURESIENTR_SEC_REPORTFOOTER, 1200, 1, 0, 7, MyGlb.VIS_BORDOSUPERIO, 8978689, "");
    BUK_SITURESIENTR.SetSectionRendersInto(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_PAGEBODY);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SEC_REPORTFOOTER, "8CD13054-2089-4896-A1E4-C3636189A8A2");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_LABELTOT, 300, 200, 800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983297, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_LABELTOT, "B53A1BD3-D062-4670-BBEB-FD707E6C42B0");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_LABELTOT, "LABELTOT");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_LABELTOT, BUK_SITURESIENTR_SPAN_TOT, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_TOT, "3C5526FE-CEF5-42A8-BE8E-DDC64BE2CCEA");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_TOT, "TOT");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_SUMOFACCERTA, 7100, 200, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_SUMOFACCERTA, "79237821-57B8-44A2-8924-E7DDFA11CA38");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_SUMOFACCERTA, "SUMOFACCERTA");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_SUMOFACCERTA, BUK_SITURESIENTR_SPAN_REFSRASRESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REFSRASRESRE, "EA6F4081-998D-4624-AC59-881E72482B06");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REFSRASRESRE, "REFSRASRESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_SUMOFIMPOINI, 1300, 200, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_SUMOFIMPOINI, "2B6652F9-B6D3-4FEA-B028-431B8A0B1B94");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_SUMOFIMPOINI, "SUMOFIMPOINI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_SUMOFIMPOINI, BUK_SITURESIENTR_SPAN_RFSRIISRESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_RFSRIISRESRE, "EE5EB47E-CE02-4CEF-95A9-483F396EBBB8");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_RFSRIISRESRE, "RFSRIISRESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_SUMOFVARIAZI, 4200, 200, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_SUMOFVARIAZI, "1194B529-D265-4108-8A44-7E724DEEE4EE");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_SUMOFVARIAZI, "SUMOFVARIAZI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_SUMOFVARIAZI, BUK_SITURESIENTR_SPAN_REFSRVSRESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REFSRVSRESRE, "6A36D053-724D-4CDE-8745-032760E1643A");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REFSRVSRESRE, "REFSRVSRESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_SUMOFORDINAT, 10000, 200, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_SUMOFORDINAT, "DA39790F-16E4-43D6-A7FB-28321F5AAF21");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_SUMOFORDINAT, "SUMOFORDINAT");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_SUMOFORDINAT, BUK_SITURESIENTR_SPAN_REFSROSRESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REFSROSRESRE, "A7B0F9F3-640F-41C5-ADCF-E5FE3E5BC86D");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REFSROSRESRE, "REFSROSRESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_SUMOFINCASSI, 12900, 200, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_SUMOFINCASSI, "D5B7A81C-4C71-4CAF-BF4A-F5DE444D396D");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_SUMOFINCASSI, "SUMOFINCASSI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_SUMOFINCASSI, BUK_SITURESIENTR_SPAN_REFSRISRESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REFSRISRESRE, "281D3D14-A8D6-4BE7-BA40-748418FE402F");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REFSRISRESRE, "REFSRISRESRE");
    BUK_SITURESIENTR.InitReportBox(BUK_SITURESIENTR_SEC_REPORTFOOTER, BUK_SITURESIENTR_RPTBOX_SUMOFDISPONI, 15800, 200, 2700, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_RPTBOX_SUMOFDISPONI, "EF0B4679-9F2D-4BBF-8725-21E61E3A293A");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_RPTBOX_SUMOFDISPONI, "SUMOFDISPONI");
    BUK_SITURESIENTR.InitBoxSpan(BUK_SITURESIENTR_RPTBOX_SUMOFDISPONI, BUK_SITURESIENTR_SPAN_REFSRDSRESRE, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESIENTR.SetRTCGuid(BUK_SITURESIENTR_SPAN_REFSRDSRESRE, "7986901E-60A7-4C7F-B410-05D5CF536E10");
    BUK_SITURESIENTR.SetObjCode(BUK_SITURESIENTR_SPAN_REFSRDSRESRE, "REFSRDSRESRE");
    BUK_SITURESIENTR_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_SITURESIENTR_InitLinks()
  {
    BUK_SITURESIENTR.SetBoxNextBox(BUK_SITURESIENTR_RPTBOX_PAGEBODY, BUK_SITURESIENTR_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SITURESIENTR) BUK_SITURESIENTR_OnPreview();
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
