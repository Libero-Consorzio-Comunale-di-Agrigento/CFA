// **********************************************
// Situazione Residui Spesa
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneResiduiSpesa extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_DESCRICAPITO = 0;
  private static int PFL_PARAMETRI_DESCRIARTICO = 1;
  private static int PFL_PARAMETRI_CAPITOLO = 2;
  private static int PFL_PARAMETRI_ARTICOLO = 3;
  private static int PFL_PARAMETRI_SUBIMPEGNI = 4;

  private static int PPQRY_PARAMETRI104 = 0;

  private static int PPQRY_DESCRICAPITO = 1;
  private static int PPQRY_DESCRIARTICO = 2;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_SITURESISPES;
  OBook BKW_SITURESISPES;
  //
  // Template Pages constants
  private static int BUK_SITURESISPES_MST_SITURESIPAGE = 1;
  private static int BUK_SITURESISPES_RPTBOX_PAGEHEADER1 = 2;
  private static int BUK_SITURESISPES_RPTBOX_PAGEBODY1 = 3;

  //
  // Reports constants
  private static int BUK_SITURESISPES_RPT_NEWREPORT = 4;
  private static int BUK_SITURESISPES_SEC_REPORTHEADER = 5;
  private static int BUK_SITURESISPES_RPTBOX_ANNOHEADER = 6;
  private static int BUK_SITURESISPES_SPAN_ANNO = 7;
  private static int BUK_SITURESISPES_RPTBOX_IMPOINIZHEAD = 8;
  private static int BUK_SITURESISPES_SPAN_IMPORTINIZIA = 9;
  private static int BUK_SITURESISPES_RPTBOX_VARIAZHEADER = 10;
  private static int BUK_SITURESISPES_SPAN_VARIAZIONI = 11;
  private static int BUK_SITURESISPES_RPTBOX_IMPEGNHEADER = 12;
  private static int BUK_SITURESISPES_SPAN_IMPEGNI = 13;
  private static int BUK_SITURESISPES_RPTBOX_MANDATHEADER = 14;
  private static int BUK_SITURESISPES_SPAN_MANDATI = 15;
  private static int BUK_SITURESISPES_RPTBOX_PAGAMEHEADER = 16;
  private static int BUK_SITURESISPES_SPAN_PAGAMENTI = 17;
  private static int BUK_SITURESISPES_RPTBOX_DISPFINAHEAD = 18;
  private static int BUK_SITURESISPES_SPAN_C1 = 19;
  private static int BUK_SITURESISPES_RPTBOX_DISPEFFEHEAD = 20;
  private static int BUK_SITURESISPES_SPAN_C = 21;
  private static int BUK_SITURESISPES_SEC_PAGEHEADER = 22;
  private static int BUK_SITURESISPES_RPTBOX_TITOLO = 23;
  private static int BUK_SITURESISPES_SPAN_SITURESISPES = 24;
  private static int BUK_SITURESISPES_SEC_DETAIL = 25;
  private static int BUK_SITURESISPES_RPTBOX_ANNO = 26;
  private static int BUK_SITURESISPES_SPAN_REANSIRESSRS = 27;
  private static int BUK_SITURESISPES_RPTBOX_IMPORTINIZIA = 28;
  private static int BUK_SITURESISPES_SPAN_REIMINSIRSSR = 29;
  private static int BUK_SITURESISPES_RPTBOX_VARIAZIONI = 30;
  private static int BUK_SITURESISPES_SPAN_REVASIRESPSR = 31;
  private static int BUK_SITURESISPES_RPTBOX_IMPEGNI = 32;
  private static int BUK_SITURESISPES_SPAN_REIMSIRESPSR = 33;
  private static int BUK_SITURESISPES_RPTBOX_MANDATI = 34;
  private static int BUK_SITURESISPES_SPAN_REMASIRESPSR = 35;
  private static int BUK_SITURESISPES_RPTBOX_PAGAMENTI = 36;
  private static int BUK_SITURESISPES_SPAN_REPASIRESSRS = 37;
  private static int BUK_SITURESISPES_RPTBOX_DISPONFINANZ = 38;
  private static int BUK_SITURESISPES_SPAN_REDIFISRSSRS = 39;
  private static int BUK_SITURESISPES_RPTBOX_DISPONEFFETT = 40;
  private static int BUK_SITURESISPES_SPAN_REDIEFSRSSRS = 41;
  private static int BUK_SITURESISPES_SEC_REPORTFOOTER = 42;
  private static int BUK_SITURESISPES_RPTBOX_LABELTOTALE = 43;
  private static int BUK_SITURESISPES_SPAN_TOTU = 44;
  private static int BUK_SITURESISPES_RPTBOX_SUMOFIMPOINI = 45;
  private static int BUK_SITURESISPES_SPAN_RFSRIISRSSRS = 46;
  private static int BUK_SITURESISPES_RPTBOX_SUMOFVARIAZI = 47;
  private static int BUK_SITURESISPES_SPAN_REFSRVSRSSRS = 48;
  private static int BUK_SITURESISPES_RPTBOX_SUMOFIMPEGNI = 49;
  private static int BUK_SITURESISPES_SPAN_REFSRISRSSRS = 50;
  private static int BUK_SITURESISPES_RPTBOX_SUMOFMANDATI = 51;
  private static int BUK_SITURESISPES_SPAN_REFSRMSRSSRS = 52;
  private static int BUK_SITURESISPES_RPTBOX_SUMOFPAGAMEN = 53;
  private static int BUK_SITURESISPES_SPAN_REFSRPSRSSRS = 54;
  private static int BUK_SITURESISPES_RPTBOX_SUMOFDISPFIN = 55;
  private static int BUK_SITURESISPES_SPAN_RFSRDFSRSSRS = 56;
  private static int BUK_SITURESISPES_RPTBOX_SUMOFDISPEFF = 57;
  private static int BUK_SITURESISPES_SPAN_RFSRDESRSSRS = 58;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI101(IMDB);
    Init_TBL_TOTALI(IMDB);
    //
    //
    Init_PQRY_VISIMPSUUOU5(IMDB);
    Init_PQRY_PARAMETRI104(IMDB);
    Init_PQRY_PARAMETRI104_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI101(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PARAMETRI101, 12);
    IMDB.set_TblCode(IMDBDef6.TBL_PARAMETRI101, "TBL_PARAMETRI101");
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARASOLOCOMP, "PARASOLOCOMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARASOLOCOMP,5,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMETRIDAL, "PARAMETRIDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMETRIDAL,6,49,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMEESERCI, "PARAMEESERCI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMEESERCI,1,5,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMUOGESTI, "PARAMUOGESTI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMUOGESTI,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMUOUTILI, "PARAMUOUTILI");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMUOUTILI,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMETITOLO, "PARAMETITOLO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMETITOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMECATEGO, "PARAMECATEGO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMECATEGO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMCODTERZ, "PARAMCODTERZ");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMCODTERZ,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMECAPITO, "PARAMECAPITO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMECAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMEARTICO, "PARAMEARTICO");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMEARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMESEVOCE, "PARAMESEVOCE");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMESEVOCE,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMESUBIMP, "PARAMESUBIMP");
    IMDB.SetFldParams(IMDBDef6.TBL_PARAMETRI101,IMDBDef6.FLD_PARAMETRI101_PARAMESUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PARAMETRI101, 0);
  }

  private static void Init_TBL_TOTALI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_TOTALI, 5);
    IMDB.set_TblCode(IMDBDef6.TBL_TOTALI, "TBL_TOTALI");
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTIMPORINIZ, "TOTIMPORINIZ");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTIMPORINIZ,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTVARIAZION, "TOTVARIAZION");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTVARIAZION,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTIMPEGNI, "TOTIMPEGNI");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTIMPEGNI,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTMANDATI, "TOTMANDATI");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTMANDATI,3,20,2);
    IMDB.set_FldCode(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTPAGAMENTI, "TOTPAGAMENTI");
    IMDB.SetFldParams(IMDBDef6.TBL_TOTALI,IMDBDef6.FLD_TOTALI_TOTPAGAMENTI,3,20,2);
    IMDB.TblAddNew(IMDBDef6.TBL_TOTALI, 0);
  }

  private static void Init_PQRY_VISIMPSUUOU5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_VISIMPSUUOU5, 8);
    IMDB.set_TblCode(IMDBDef17.PQRY_VISIMPSUUOU5, "PQRY_VISIMPSUUOU5");
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_SALDO_INI, "SALDO_INI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_SALDO_INI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_VARIAZIONI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_RECORDIMPEGN, "RECORDIMPEGN");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_RECORDIMPEGN,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_MANDATI, "MANDATI");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_MANDATI,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_RECORDPAGAME, "RECORDPAGAME");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_RECORDPAGAME,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_DISPONFINANZ, "DISPONFINANZ");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_DISPONFINANZ,3,28,6);
    IMDB.set_FldCode(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef17.PQRY_VISIMPSUUOU5,IMDBDef17.PQSL_VISIMPSUUOU5_DISPONIBILITA,3,28,6);
    IMDB.TblAddNew(IMDBDef17.PQRY_VISIMPSUUOU5, 0);
  }

  private static void Init_PQRY_PARAMETRI104(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI104, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI104, "PQRY_PARAMETRI104");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI104,IMDBDef17.PQSL_PARAMETRI104_PARAMECAPITO, "PARAMECAPITO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI104,IMDBDef17.PQSL_PARAMETRI104_PARAMECAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI104,IMDBDef17.PQSL_PARAMETRI104_PARAMEARTICO, "PARAMEARTICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI104,IMDBDef17.PQSL_PARAMETRI104_PARAMEARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI104,IMDBDef17.PQSL_PARAMETRI104_PARAMESUBIMP, "PARAMESUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI104,IMDBDef17.PQSL_PARAMETRI104_PARAMESUBIMP,5,2,0);
    IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI104, 0);
  }

  private static void Init_PQRY_PARAMETRI104_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef17.PQRY_PARAMETRI104_RS, 3);
    IMDB.set_TblCode(IMDBDef17.PQRY_PARAMETRI104_RS, "PQRY_PARAMETRI104_RS");
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI104_RS,IMDBDef17.PQSL_PARAMETRI104_PARAMECAPITO, "PARAMECAPITO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI104_RS,IMDBDef17.PQSL_PARAMETRI104_PARAMECAPITO,3,16,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI104_RS,IMDBDef17.PQSL_PARAMETRI104_PARAMEARTICO, "PARAMEARTICO");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI104_RS,IMDBDef17.PQSL_PARAMETRI104_PARAMEARTICO,1,2,0);
    IMDB.set_FldCode(IMDBDef17.PQRY_PARAMETRI104_RS,IMDBDef17.PQSL_PARAMETRI104_PARAMESUBIMP, "PARAMESUBIMP");
    IMDB.SetFldParams(IMDBDef17.PQRY_PARAMETRI104_RS,IMDBDef17.PQSL_PARAMETRI104_PARAMESUBIMP,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneResiduiSpesa(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneResiduiSpesa()
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
    FormIdx = MyGlb.FRM_SITURESISPES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1C1F9046-8C5B-4380-A888-7ACC90020B58";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 570;
    set_Caption(new IDVariant("Situazione Residui Spesa"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 544;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.169118;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 844;
    Frames[2].Height = 92;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 92;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DA633E1A-19CE-4DCE-90CC-BF69F68C1511");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 880, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
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
    Frames[3].Width = 844;
    Frames[3].Height = 452;
    Frames[3].Caption = "Situazione Residui Spesa";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 452;
    BKW_SITURESISPES = new OBook(this);
    BUK_SITURESISPES = new CIDREObj(BKW_SITURESISPES);
    Frames[3].Content = BKW_SITURESISPES;
    BKW_SITURESISPES.Height = 422;
    BKW_SITURESISPES.Width = 844;
    BKW_SITURESISPES.iGuid = "DCC4AC08-9824-4E6B-8266-4F42416AD76B";
    BKW_SITURESISPES.Code = "BUK_SITURESISPES";
    BKW_SITURESISPES.BookObj = BUK_SITURESISPES;
    BKW_SITURESISPES.InitDefMasks();
    BUK_SITURESISPES.set_FrIndex(3);
    BUK_SITURESISPES.InitBook(1, 3342593, "Situazione Residui Spesa", IMDB, MainFrm.VisualStyleList);
    BUK_SITURESISPES.InitHTML();
    BUK_SITURESISPES.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_SITURESISPES.SetSize(844, 422);
    BUK_SITURESISPES.Book.SetMainFrm(MainFrm);
    BUK_SITURESISPES.SetRTCGuid(0, "DCC4AC08-9824-4E6B-8266-4F42416AD76B");
    BUK_SITURESISPES.SetObjCode(0, "SITURESISPES");
    BUK_SITURESISPES_MST_SITURESIPAGE_Init();
    BUK_SITURESISPES_RPT_NEWREPORT_Init();
    BUK_SITURESISPES_InitLinks();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PARAMETRI101, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITURESISPES_PARAMETRI104();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      BUK_SITURESISPES.UpdateBook();
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
    if (Code.equals("BUK_SITURESISPES")) return BUK_SITURESISPES;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof SituazioneResiduiSpesa);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneResiduiSpesa.class.getName() : (Glb.ClassWithPackage(SituazioneResiduiSpesa.class) ? SituazioneResiduiSpesa.class.getName().substring(SituazioneResiduiSpesa.class.getPackage().getName().length() + 1) : SituazioneResiduiSpesa.class.getName()));
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMESUBIMP, 0, (new IDVariant("NO")));
      if (MainFrm.TIPOORDINATI.equals((new IDVariant(3)), true) || MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true) || MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
      {
        BUK_SITURESISPES.set_BoxVisible(BUK_SITURESISPES_RPTBOX_DISPEFFEHEAD, (new IDVariant(-1)).booleanValue());
        BUK_SITURESISPES.set_BoxVisible(BUK_SITURESISPES_RPTBOX_DISPONEFFETT, (new IDVariant(-1)).booleanValue());
        BUK_SITURESISPES.set_BoxVisible(BUK_SITURESISPES_RPTBOX_SUMOFDISPEFF, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        BUK_SITURESISPES.set_BoxVisible(BUK_SITURESISPES_RPTBOX_DISPEFFEHEAD, (new IDVariant(0)).booleanValue());
        BUK_SITURESISPES.set_BoxVisible(BUK_SITURESISPES_RPTBOX_DISPONEFFETT, (new IDVariant(0)).booleanValue());
        BUK_SITURESISPES.set_BoxVisible(BUK_SITURESISPES_RPTBOX_SUMOFDISPEFF, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneResiduiSpesa", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARASOLOCOMP, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMETRIDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMEESERCI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMUOGESTI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMETITOLO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMCODTERZ, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMECATEGO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMECAPITO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMEARTICO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMESEVOCE, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneResiduiSpesa", "UnloadEvent", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI104, IMDBDef17.PQSL_PARAMETRI104_PARAMECAPITO, 0)))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef17.PQRY_PARAMETRI104, IMDBDef17.PQSL_PARAMETRI104_PARAMEARTICO, 0)))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI104, IMDBDef17.PQSL_PARAMETRI104_PARAMECAPITO, 0).equals((new IDVariant(0)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef17.PQRY_PARAMETRI104, IMDBDef17.PQSL_PARAMETRI104_PARAMEARTICO, 0).equals((new IDVariant(0)), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneResiduiSpesa", "ParametriAfterFindEvent", _e);
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
      MainFrm.ErrObj.ProcError ("SituazioneResiduiSpesa", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void SITURESISPES_PARAMETRI104() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef17.PQRY_PARAMETRI104_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI101, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PARAMETRI101, 0))
    {
      IMDB.TblAddNew(IMDBDef17.PQRY_PARAMETRI104_RS, 0);
      IMDB.TblLinkRow(IMDBDef17.PQRY_PARAMETRI104_RS, 0, IMDBDef6.TBL_PARAMETRI101, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI104_RS, 0, 0, IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMECAPITO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI104_RS, 1, 0, IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMEARTICO, 0);
      IMDB.TblLinkField(IMDBDef17.PQRY_PARAMETRI104_RS, 2, 0, IMDBDef6.TBL_PARAMETRI101, IMDBDef6.FLD_PARAMETRI101_PARAMESUBIMP, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PARAMETRI101, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PARAMETRI101, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PARAMETRI101, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef17.PQRY_PARAMETRI104_RS, 0);
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

  private void BUK_SITURESISPES_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_SITURESISPES_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_SITURESISPES_SEC_REPORTHEADER)
    {
    }
    if (SectionID==BUK_SITURESISPES_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_SITURESISPES_SEC_DETAIL)
    {
    }
    if (SectionID==BUK_SITURESISPES_SEC_REPORTFOOTER)
    {
      BUK_SITURESISPES.set_SpanValue(BUK_SITURESISPES_SPAN_RFSRIISRSSRS, new IDVariant(BUK_SITURESISPES.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESISPES_SEC_REPORTFOOTER,"SALDO_INI")));
      BUK_SITURESISPES.set_SpanValue(BUK_SITURESISPES_SPAN_REFSRVSRSSRS, new IDVariant(BUK_SITURESISPES.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESISPES_SEC_REPORTFOOTER,"VARIAZIONI")));
      BUK_SITURESISPES.set_SpanValue(BUK_SITURESISPES_SPAN_REFSRISRSSRS, new IDVariant(BUK_SITURESISPES.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESISPES_SEC_REPORTFOOTER,"RECORDIMPEGN")));
      BUK_SITURESISPES.set_SpanValue(BUK_SITURESISPES_SPAN_REFSRMSRSSRS, new IDVariant(BUK_SITURESISPES.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESISPES_SEC_REPORTFOOTER,"MANDATI")));
      BUK_SITURESISPES.set_SpanValue(BUK_SITURESISPES_SPAN_REFSRPSRSSRS, new IDVariant(BUK_SITURESISPES.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESISPES_SEC_REPORTFOOTER,"RECORDPAGAME")));
      BUK_SITURESISPES.set_SpanValue(BUK_SITURESISPES_SPAN_RFSRDFSRSSRS, new IDVariant(BUK_SITURESISPES.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESISPES_SEC_REPORTFOOTER,"DISPONFINANZ")));
      BUK_SITURESISPES.set_SpanValue(BUK_SITURESISPES_SPAN_RFSRDESRSSRS, new IDVariant(BUK_SITURESISPES.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_SITURESISPES_SEC_REPORTFOOTER,"DISPONIBILITA")));
    }
  }

  private void BUK_SITURESISPES_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_SITURESISPES_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_SITURESISPES_MST_SITURESIPAGE)
    {
    }
  }

  private void BUK_SITURESISPES_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_SITURESISPES_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_SITURESISPES_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_SITURESISPES_OnPreview()
  {
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, "54E941D0-8CA8-4A82-B35F-370334035102");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, "DESCRIZIONE CAPITOLO");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, "94656853-4EFC-492A-9227-FCADE49E8D23");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, "DESCRIZIONE ARTICOLO");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "62583987-10BA-4A43-8DF1-19D33177A8D2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "Capitolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "5DD05A7B-8985-4A41-A4CD-685FC1315566");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "Articolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "6C8F2F7C-6A07-4BF6-B3FE-E93B0FE4625B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "Subimpegni");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_LIST, "DESCRIZIONE CAPITOLO");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, 224, 32, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRICAPITO, MyGlb.PANEL_FORM, "DESCR. CAPIT.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRICAPITO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRICAPITO, PPQRY_DESCRICAPITO, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_LIST, "DESCRIZIONE ARTICOLO");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, 224, 56, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DESCRIARTICO, MyGlb.PANEL_FORM, "DESCR. ARTIC.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DESCRIARTICO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DESCRIARTICO, PPQRY_DESCRIARTICO, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_LIST, "Capit.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 32, 32, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CAPITOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CAPITOLO, PPQRY_PARAMETRI104, "A.PARAMECAPITO", "PARAMECAPITO", 3, 16, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_LIST, "Artic.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 36, 56, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ARTICOLO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ARTICOLO, PPQRY_PARAMETRI104, "A.PARAMEARTICO", "PARAMEARTICO", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_LIST, "Subimpegni");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 12, 8, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUBIMPEGNI, MyGlb.PANEL_FORM, "Subimpegni");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUBIMPEGNI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUBIMPEGNI, PPQRY_PARAMETRI104, "A.PARAMESUBIMP", "PARAMESUBIMP", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUBIMPEGNI, (new IDVariant("NO")), "NO", "", "", -1);
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
    SQL.append("where (A.CAPITOLO = ~~PARAMECAPITO~~ AND A.ARTICOLO = 0) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI101.PARAMEESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_DESCRICAPITO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DESCRICAPITO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_DESCRICAPITO, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
    SQL.append("from ");
    SQL.append("  CAP A ");
    SQL.append("where (A.CAPITOLO = ~~PARAMECAPITO~~ AND A.ARTICOLO = ~~PARAMEARTICO~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI101.PARAMEESERCI~~) ");
    PAN_PARAMETRI.SetQuery(PPQRY_DESCRIARTICO, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_DESCRIARTICO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_DESCRIARTICO, "CAP");
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI104", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Parametri");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI104, IMDBDef17.PQRY_PARAMETRI104_RS, IMDBDef6.TBL_PARAMETRI101);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CAPITOLO, IMDBDef6.FLD_PARAMETRI101_PARAMECAPITO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ARTICOLO, IMDBDef6.FLD_PARAMETRI101_PARAMEARTICO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SUBIMPEGNI, IMDBDef6.FLD_PARAMETRI101_PARAMESUBIMP);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI101");
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

  private void BUK_SITURESISPES_MST_SITURESIPAGE_Init()
  {
    BUK_SITURESISPES.InitMastro(BUK_SITURESISPES_MST_SITURESIPAGE, 3, 21000, 29700, 1, 2, 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_MST_SITURESIPAGE, "9B29B0AE-279B-4EDA-8868-B72E2F6AAA42");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_MST_SITURESIPAGE, "SITURESIPAGE");
    BUK_SITURESISPES.InitMastroBox(BUK_SITURESISPES_MST_SITURESIPAGE, BUK_SITURESISPES_RPTBOX_PAGEHEADER1, 1000, 1000, 27700, 2000, 0, 3, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_PAGEHEADER1, "C5E733DB-FC14-46C0-9DE8-3F562D4E949B");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_PAGEHEADER1, "PAGEHEADER1");
    BUK_SITURESISPES.InitMastroBox(BUK_SITURESISPES_MST_SITURESIPAGE, BUK_SITURESISPES_RPTBOX_PAGEBODY1, 1000, 3300, 27700, 16800, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_PAGEBODY1, "C50AAD33-F2B6-4A27-BC3C-1655CCED993F");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_PAGEBODY1, "PAGEBODY1");
  }

  private void BUK_SITURESISPES_RPT_NEWREPORT_InitQuery() { BUK_SITURESISPES_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_SITURESISPES_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.ANNO_IMP as ANNO_IMP, ");
      SQL.append("  SUM(DECODE(A.SE_SUBIMP, 'SI', 0, DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), -1, A.SALDO_INI, 0))) as SALDO_INI, ");
      SQL.append("  SUM(DECODE(A.SE_SUBIMP, 'SI', 0, A.VARIAZIONI_RES)) + SUM(DECODE(A.SE_SUBIMP, 'SI', 0, DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), 0, A.SALDO_INI, 0))) as VARIAZIONI, ");
      SQL.append("  SUM(DECODE(A.SE_SUBIMP, 'SI', 0, DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), -1, A.SALDO_INI, 0))) + SUM(DECODE(A.SE_SUBIMP, 'SI', 0, A.VARIAZIONI_RES)) + SUM(DECODE(A.SE_SUBIMP, 'SI', 0, DECODE(SIGN(NVL(A.ANNO_INTROD, 0) - A.ESERCIZIO), 0, A.SALDO_INI, 0))) as RECORDIMPEGN, ");
      SQL.append("  SUM(DECODE(A.SE_SUBIMP, 'SI', 0, A.MANDATI)) as MANDATI, ");
      SQL.append("  NVL(A_PAGAMENTI(~~TBL_PARAMETRI101.PARAMEESERCI~~,DECODE(~~TBL_PARAMETRI101.PARAMECAPITO~~, 0, to_number(NULL), ~~TBL_PARAMETRI101.PARAMECAPITO~~),DECODE(~~TBL_PARAMETRI101.PARAMEARTICO~~, 0, to_number(NULL), ~~TBL_PARAMETRI101.PARAMEARTICO~~),A.ANNO_IMP), 0) as RECORDPAGAME, ");
      SQL.append("  SUM(A.DISP_FIN) as DISPONFINANZ, ");
      SQL.append("  SUM(A.DISPONIBILITA) as DISPONIBILITA ");
      SQL.append("from ");
      SQL.append("  VISTA_IMP_SUB_UO_UT A ");
      SQL.append("where (NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1) = NVL(~~TBL_PARAMETRI101.PARAMUOGESTI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA, -1))) ");
      SQL.append("and   (NVL(A.PROGR_UNITA_ORGANIZZATIVA_UT, -1) = NVL(~~TBL_PARAMETRI101.PARAMUOUTILI~~, NVL(A.PROGR_UNITA_ORGANIZZATIVA_UT, -1))) ");
      SQL.append("and   ((~~TBL_PARAMETRI101.PARAMUOGESTI~~ IS NULL) OR (NVL(A.SCADENZA_UO, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE ))) ");
      SQL.append("and   ((~~TBL_PARAMETRI101.PARAMUOUTILI~~ IS NULL) OR (NVL(A.SCADENZA_UT, TO_DATE('2999-12-31','YYYY-MM-DD')) >= TRUNC( SYSDATE ))) ");
      SQL.append("and   (~~TBL_PARAMETRI101.PARAMESEVOCE~~ = 'NO' OR (~~TBL_PARAMETRI101.PARAMESEVOCE~~ = 'SI' AND A.CAPITOLO = DECODE(~~TBL_PARAMETRI101.PARAMECAPITO~~, 0, A.CAPITOLO, ~~TBL_PARAMETRI101.PARAMECAPITO~~) AND A.ARTICOLO = DECODE(~~TBL_PARAMETRI101.PARAMEARTICO~~, 0, A.ARTICOLO, ~~TBL_PARAMETRI101.PARAMEARTICO~~) AND NVL(A.TITOLO, -1) = DECODE(~~TBL_PARAMETRI101.PARAMETITOLO~~, -1, NVL(A.TITOLO, -1), ~~TBL_PARAMETRI101.PARAMETITOLO~~) AND NVL(A.COD_INTERVENTO, -1) = DECODE(~~TBL_PARAMETRI101.PARAMECATEGO~~, -1, NVL(A.COD_INTERVENTO, -1), ~~TBL_PARAMETRI101.PARAMECATEGO~~) AND NVL(A.COD_TERZI, -1) = DECODE(~~TBL_PARAMETRI101.PARAMCODTERZ~~, -1, NVL(A.COD_TERZI, -1), ~~TBL_PARAMETRI101.PARAMCODTERZ~~))) ");
      SQL.append("and   ((A.SE_SUBIMP = 'NO') OR (~~PQRY_PARAMETRI104.PARAMESUBIMP~~ = 'SI')) ");
      SQL.append("and   (A.ANNO_IMP < ~~TBL_PARAMETRI101.PARAMEESERCI~~) ");
      SQL.append("and   (A.ESERCIZIO = ~~TBL_PARAMETRI101.PARAMEESERCI~~) ");
      SQL.append("and   (A.TIPO_VIS = DECODE(~~TBL_DATISESSIONE.SESSIOMODULO~~, 'CFA', 'TUTTI', 'COMP')) ");
      SQL.append("group by ");
      SQL.append("  A.ANNO_IMP ");
      BUK_SITURESISPES.SetReportQuery(BUK_SITURESISPES_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "556CF92E-3468-44A2-ABEA-1B005EAE77FB");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_SITURESISPES_RPT_NEWREPORT_Init()
  {
    BUK_SITURESISPES.InitReport(BUK_SITURESISPES_RPT_NEWREPORT, 196609);
    BUK_SITURESISPES_RPT_NEWREPORT_InitQuery(true, false);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPT_NEWREPORT, "91240616-19CC-4CC0-ACE6-D4823A77A0C4");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPT_NEWREPORT, "NEWREPORT");
    BUK_SITURESISPES.InitSection(BUK_SITURESISPES_RPT_NEWREPORT, BUK_SITURESISPES_SEC_REPORTHEADER, 1200, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITURESISPES.SetSectionRendersInto(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_PAGEBODY1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SEC_REPORTHEADER, "457BC712-1630-4782-B6E1-5FA0B61A3212");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SEC_REPORTHEADER, "REPORTHEADER");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_ANNOHEADER, 0, 0, 1100, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_ANNOHEADER, "3F429982-002B-4B45-A4B2-4995EA554D31");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_ANNOHEADER, "ANNOHEADER");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_ANNOHEADER, BUK_SITURESISPES_SPAN_ANNO, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Anno", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_ANNO, "9DD6B1CF-55DF-4165-B55E-A0EDDBA259F9");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_ANNO, "ANNO");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_IMPOINIZHEAD, 1300, 0, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_IMPOINIZHEAD, "D04EA57B-AFF4-4819-998F-4003E0260059");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_IMPOINIZHEAD, "IMPOINIZHEAD");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_IMPOINIZHEAD, BUK_SITURESISPES_SPAN_IMPORTINIZIA, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Importo Iniziale", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_IMPORTINIZIA, "E10C3783-71A2-4878-9624-9E688BD7C86B");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_IMPORTINIZIA, "IMPORTINIZIA");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_VARIAZHEADER, 4400, 0, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_VARIAZHEADER, "1D0B2986-6DE5-4EF2-8CF0-49CFD57DF341");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_VARIAZHEADER, "VARIAZHEADER");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_VARIAZHEADER, BUK_SITURESISPES_SPAN_VARIAZIONI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Variazioni", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_VARIAZIONI, "C7D690AA-4869-429B-BED6-3677C75F7C56");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_VARIAZIONI, "VARIAZIONI");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_IMPEGNHEADER, 7500, 0, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_IMPEGNHEADER, "C19EB67E-2F6A-4B71-9E26-7CA4274B6AC7");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_IMPEGNHEADER, "IMPEGNHEADER");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_IMPEGNHEADER, BUK_SITURESISPES_SPAN_IMPEGNI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Impegni", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_IMPEGNI, "D7062977-67EE-47AE-8975-6AD9F2444D20");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_IMPEGNI, "IMPEGNI");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_MANDATHEADER, 10600, 0, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_MANDATHEADER, "6AC2F88E-8FEA-4BE8-BBE6-7D0C419F94D3");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_MANDATHEADER, BUK_SITURESISPES_SPAN_MANDATI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Mandati", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_MANDATI, "4A5CD707-144B-4B39-BF70-D3603A5B7A28");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_MANDATI, "MANDATI");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_PAGAMEHEADER, 13700, 0, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_PAGAMEHEADER, "A34B9156-9CC5-430D-96D3-1CBD0509FA71");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_PAGAMEHEADER, "PAGAMEHEADER");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_PAGAMEHEADER, BUK_SITURESISPES_SPAN_PAGAMENTI, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384705, "", "Pagamenti", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_PAGAMENTI, "958BC251-2890-4106-88AA-B6F09DAD034A");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_PAGAMENTI, "PAGAMENTI");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_DISPFINAHEAD, 16800, 0, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_DISPFINAHEAD, "034D7BCC-BAA5-422D-A15B-6167ED760971");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_DISPFINAHEAD, "DISPFINAHEAD");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_DISPFINAHEAD, BUK_SITURESISPES_SPAN_C1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità Finanziaria", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_C1, "6385F726-C211-4060-8DE8-5DEDCA012BBA");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_C1, "C1");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTHEADER, BUK_SITURESISPES_RPTBOX_DISPEFFEHEAD, 19900, 0, 3000, 1100, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_DISPEFFEHEAD, "99FEFB48-9F5E-4444-A5B4-DB6DC119501E");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_DISPEFFEHEAD, "DISPEFFEHEAD");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_DISPEFFEHEAD, BUK_SITURESISPES_SPAN_C, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Disponibilità Effettiva", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_C, "EE8F4723-2F16-424E-B6F3-1C408CB0A159");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_C, "C");
    BUK_SITURESISPES.InitSection(BUK_SITURESISPES_RPT_NEWREPORT, BUK_SITURESISPES_SEC_PAGEHEADER, 1600, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITURESISPES.SetSectionRendersInto(BUK_SITURESISPES_SEC_PAGEHEADER, BUK_SITURESISPES_RPTBOX_PAGEHEADER1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SEC_PAGEHEADER, "159270CA-9376-4739-9070-82DC26E7E6F2");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_PAGEHEADER, BUK_SITURESISPES_RPTBOX_TITOLO, 5100, 400, 9300, 700, 0, 1, 1, MyGlb.VIS_TITREPNOBOCE, 983041, 554, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_TITOLO, "4B0B6D31-7DDF-484A-9B2D-E72FA92094E3");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_TITOLO, "TITOLO");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_TITOLO, BUK_SITURESISPES_SPAN_SITURESISPES, MyGlb.VIS_TITREPNOBOCE, 0, 0, 0, 271384961, "", "Situazione Residui - Spesa", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_SITURESISPES, "B8F72ABD-63BA-4759-BDE6-6272939C065D");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_SITURESISPES, "SITURESISPES");
    BUK_SITURESISPES.InitSection(BUK_SITURESISPES_RPT_NEWREPORT, BUK_SITURESISPES_SEC_DETAIL, 800, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_SITURESISPES.SetSectionRendersInto(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_PAGEBODY1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SEC_DETAIL, "C06A44D2-74D5-452C-8264-D33F30EE6BD9");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SEC_DETAIL, "DETAIL");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_ANNO, 0, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_ANNO, "E061E27A-52A0-40D2-956D-3390AA39565D");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_ANNO, "ANNO");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_ANNO, BUK_SITURESISPES_SPAN_REANSIRESSRS, MyGlb.VIS_DEFAREPOSTYL, 1, 4, 0, 271384705, "", "::ANNO_IMP", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REANSIRESSRS, "58F516AB-84B6-426D-9F7B-1FE2C391686E");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REANSIRESSRS, "REANSIRESSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_IMPORTINIZIA, 1300, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_IMPORTINIZIA, "34F2815A-F995-4B50-A971-DBF66F23E970");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_IMPORTINIZIA, "IMPORTINIZIA");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_IMPORTINIZIA, BUK_SITURESISPES_SPAN_REIMINSIRSSR, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::SALDO_INI", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REIMINSIRSSR, "870E4DC9-BE53-4C25-9FB3-07F5935F59E2");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REIMINSIRSSR, "REIMINSIRSSR");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_VARIAZIONI, 4400, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_VARIAZIONI, "A76AAB1A-255B-4179-8ED5-0B1C76D12142");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_VARIAZIONI, "VARIAZIONI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_VARIAZIONI, BUK_SITURESISPES_SPAN_REVASIRESPSR, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::VARIAZIONI", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REVASIRESPSR, "83646D82-5044-4CA6-90ED-713009924F7E");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REVASIRESPSR, "REVASIRESPSR");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_IMPEGNI, 7500, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_IMPEGNI, "662943C3-5667-4340-B46E-D560376680F7");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_IMPEGNI, "IMPEGNI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_IMPEGNI, BUK_SITURESISPES_SPAN_REIMSIRESPSR, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Impegni", "::RECORDIMPEGN", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REIMSIRESPSR, "8637F90A-4E06-4DA3-9317-70CB8ACFA35E");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REIMSIRESPSR, "REIMSIRESPSR");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_MANDATI, 10600, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_MANDATI, "7C7F8BE2-FBD9-46AF-8847-EECA12255ADD");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_MANDATI, "MANDATI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_MANDATI, BUK_SITURESISPES_SPAN_REMASIRESPSR, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "Mandati", "::MANDATI", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REMASIRESPSR, "96BF32A3-13D6-4BAB-B774-59F149BE9700");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REMASIRESPSR, "REMASIRESPSR");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_PAGAMENTI, 13700, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_PAGAMENTI, "F3C56427-0479-4C13-88B2-4C5448285E2F");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_PAGAMENTI, "PAGAMENTI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_PAGAMENTI, BUK_SITURESISPES_SPAN_REPASIRESSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::RECORDPAGAME", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REPASIRESSRS, "4A4879EB-F7E1-47E7-9FA8-D8D17977BBB1");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REPASIRESSRS, "REPASIRESSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_DISPONFINANZ, 16800, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_DISPONFINANZ, "7357DBA3-B6F8-4EC7-A773-62C1AE8552E0");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_DISPONFINANZ, "DISPONFINANZ");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_DISPONFINANZ, BUK_SITURESISPES_SPAN_REDIFISRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::DISPONFINANZ", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REDIFISRSSRS, "17FE526C-3987-4072-979E-0C6E4DA78800");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REDIFISRSSRS, "REDIFISRSSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_DETAIL, BUK_SITURESISPES_RPTBOX_DISPONEFFETT, 19900, 0, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_DISPONEFFETT, "170378B5-3D35-4456-9277-5AD91F2FB574");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_DISPONEFFETT, "DISPONEFFETT");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_DISPONEFFETT, BUK_SITURESISPES_SPAN_REDIEFSRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "::DISPONIBILITA", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REDIEFSRSSRS, "7B8F00C5-6B0F-4A94-8970-2D11B22A9583");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REDIEFSRSSRS, "REDIEFSRSSRS");
    BUK_SITURESISPES.InitSection(BUK_SITURESISPES_RPT_NEWREPORT, BUK_SITURESISPES_SEC_REPORTFOOTER, 600, 1, 0, 7, MyGlb.VIS_BORDOSUPERIO, 8978433, "");
    BUK_SITURESISPES.SetSectionRendersInto(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_PAGEBODY1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SEC_REPORTFOOTER, "85859D5D-5A11-49D7-BD9B-5AB7D79F02F3");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_LABELTOTALE, 300, 100, 800, 400, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_LABELTOTALE, "CE066ED2-7760-466D-AECA-3FC25FC3A689");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_LABELTOTALE, "LABELTOTALE");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_LABELTOTALE, BUK_SITURESISPES_SPAN_TOTU, MyGlb.VIS_DEFAREPOSTYL, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_TOTU, "EE93AC78-E60C-4CA9-875B-484F14D48C88");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_TOTU, "TOTU");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_SUMOFIMPOINI, 1300, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_SUMOFIMPOINI, "A88677F3-3E1A-450C-A96E-30D7641790A5");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_SUMOFIMPOINI, "SUMOFIMPOINI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_SUMOFIMPOINI, BUK_SITURESISPES_SPAN_RFSRIISRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_RFSRIISRSSRS, "A185EEB6-9B48-462A-896D-C50FE6E7B25D");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_RFSRIISRSSRS, "RFSRIISRSSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_SUMOFVARIAZI, 4400, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_SUMOFVARIAZI, "2255BC3F-EB5F-49B5-845D-8B9D481AB311");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_SUMOFVARIAZI, "SUMOFVARIAZI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_SUMOFVARIAZI, BUK_SITURESISPES_SPAN_REFSRVSRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REFSRVSRSSRS, "2CF5922A-1FB6-4F71-83C7-A0F042394E79");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REFSRVSRSSRS, "REFSRVSRSSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_SUMOFIMPEGNI, 7500, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_SUMOFIMPEGNI, "F62B2F0B-A711-4255-BA2D-AE9CC6C24CC0");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_SUMOFIMPEGNI, "SUMOFIMPEGNI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_SUMOFIMPEGNI, BUK_SITURESISPES_SPAN_REFSRISRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REFSRISRSSRS, "F2835F69-E980-414B-B314-6C873DAD347C");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REFSRISRSSRS, "REFSRISRSSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_SUMOFMANDATI, 10600, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_SUMOFMANDATI, "ED7FAC7F-02FB-4F15-B53E-A5E43218CFD7");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_SUMOFMANDATI, "SUMOFMANDATI");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_SUMOFMANDATI, BUK_SITURESISPES_SPAN_REFSRMSRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REFSRMSRSSRS, "F39FEC33-2329-494E-BA2D-EF06330EB0AE");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REFSRMSRSSRS, "REFSRMSRSSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_SUMOFPAGAMEN, 13700, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_SUMOFPAGAMEN, "474DCDF5-9C23-46B2-AB2A-04BA0D06BBC0");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_SUMOFPAGAMEN, "SUMOFPAGAMEN");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_SUMOFPAGAMEN, BUK_SITURESISPES_SPAN_REFSRPSRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_REFSRPSRSSRS, "3BA0A740-012A-494D-9B2C-9E51F0943963");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_REFSRPSRSSRS, "REFSRPSRSSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_SUMOFDISPFIN, 16800, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_SUMOFDISPFIN, "F890E494-90B3-46DA-A0A4-F37A7D50B892");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_SUMOFDISPFIN, "SUMOFDISPFIN");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_SUMOFDISPFIN, BUK_SITURESISPES_SPAN_RFSRDFSRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_RFSRDFSRSSRS, "B9700175-A9B6-464F-8090-408E2C73186C");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_RFSRDFSRSSRS, "RFSRDFSRSSRS");
    BUK_SITURESISPES.InitReportBox(BUK_SITURESISPES_SEC_REPORTFOOTER, BUK_SITURESISPES_RPTBOX_SUMOFDISPEFF, 19900, 100, 3000, 500, 0, 1, 1, MyGlb.VIS_IMPORTO, 983041, 322, "", 1, -33);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_RPTBOX_SUMOFDISPEFF, "C272CFBA-D763-400A-B0CB-6B9192C95A76");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_RPTBOX_SUMOFDISPEFF, "SUMOFDISPEFF");
    BUK_SITURESISPES.InitBoxSpan(BUK_SITURESISPES_RPTBOX_SUMOFDISPEFF, BUK_SITURESISPES_SPAN_RFSRDESRSSRS, MyGlb.VIS_IMPORTO, 3, 28, 6, 271384705, "", "", 1);
    BUK_SITURESISPES.SetRTCGuid(BUK_SITURESISPES_SPAN_RFSRDESRSSRS, "D1BF3412-9FAE-44BB-B309-4B32964B6990");
    BUK_SITURESISPES.SetObjCode(BUK_SITURESISPES_SPAN_RFSRDESRSSRS, "RFSRDESRSSRS");
    BUK_SITURESISPES_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_SITURESISPES_InitLinks()
  {
    BUK_SITURESISPES.SetBoxNextBox(BUK_SITURESISPES_RPTBOX_PAGEBODY1, BUK_SITURESISPES_RPTBOX_PAGEBODY1);
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
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_SITURESISPES) BUK_SITURESISPES_OnPreview();
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
