// **********************************************
// Ritenute Per Addizionale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RitenutePerAddizionale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;
  private static int GRP_PARAMETRI_MANDATI = 1;
  private static int GRP_PARAMETRI_ADDIZIONALE = 2;

  private static int PFL_PARAMETRI_ELABORA = 0;
  private static int PFL_PARAMETRI_DA = 1;
  private static int PFL_PARAMETRI_A = 2;
  private static int PFL_PARAMETRI_NEWPANELABE2 = 3;
  private static int PFL_PARAMETRI_DAL = 4;
  private static int PFL_PARAMETRI_AL = 5;
  private static int PFL_PARAMETRI_NEWPANELABE1 = 6;
  private static int PFL_PARAMETRI_REGCOM = 7;
  private static int PFL_PARAMETRI_NEWPANELLABE = 8;
  private static int PFL_PARAMETRI_UFFICIO = 9;
  private static int PFL_PARAMETRI_DATAELABORAZ = 10;

  private static int PPQRY_PARAMETRI165 = 0;

  private static int PPQRY_T53 = 1;


  IDPanel PAN_PARAMETRI;
  CIDREObj BUK_RITPERADDLIB;
  OBook BKW_RITPERADDLIB;
  //
  // Template Pages constants
  private static int BUK_RITPERADDLIB_MST_RITPERADDMAS = 1;
  private static int BUK_RITPERADDLIB_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_RITPERADDLIB_SPAN_CPTSRPALRPAP = 3;
  private static int BUK_RITPERADDLIB_RPTBOX_TESTATPAGINA = 4;
  private static int BUK_RITPERADDLIB_SPAN_UTPTTDPRRPAP = 5;
  private static int BUK_RITPERADDLIB_RPTBOX_SOTTTESTPAGI = 6;
  private static int BUK_RITPERADDLIB_SPAN_IEPDRPAPPARP = 7;
  private static int BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA = 8;

  //
  // Reports constants
  private static int BUK_RITPERADDLIB_RPT_RITPERADDREP = 9;
  private static int BUK_RITPERADDLIB_SEC_INTESTREPORT = 10;
  private static int BUK_RITPERADDLIB_SEC_DENOINTEGRUP = 11;
  private static int BUK_RITPERADDLIB_RPTBOX_DENOMINAZION = 12;
  private static int BUK_RITPERADDLIB_SPAN_DENOMINAZION = 13;
  private static int BUK_RITPERADDLIB_RPTBOX_BENRAGSOCHEA = 14;
  private static int BUK_RITPERADDLIB_SPAN_RAGIONSOCIAL = 15;
  private static int BUK_RITPERADDLIB_RPTBOX_BENCODFISHEA = 16;
  private static int BUK_RITPERADDLIB_SPAN_CODICEFISCAL = 17;
  private static int BUK_RITPERADDLIB_RPTBOX_MANDATHEADER = 18;
  private static int BUK_RITPERADDLIB_SPAN_MANDATO = 19;
  private static int BUK_RITPERADDLIB_RPTBOX_NUMEMANDHEAD = 20;
  private static int BUK_RITPERADDLIB_SPAN_NRO = 21;
  private static int BUK_RITPERADDLIB_RPTBOX_DDATAMANDHEA = 22;
  private static int BUK_RITPERADDLIB_SPAN_DATA = 23;
  private static int BUK_RITPERADDLIB_RPTBOX_LIQIMPONHEAD = 24;
  private static int BUK_RITPERADDLIB_SPAN_IMPONIBILE = 25;
  private static int BUK_RITPERADDLIB_RPTBOX_LIQALIQUHEAD = 26;
  private static int BUK_RITPERADDLIB_SPAN_ALIQ = 27;
  private static int BUK_RITPERADDLIB_RPTBOX_LIQRITIRPHEA = 28;
  private static int BUK_RITPERADDLIB_SPAN_RITENUTE = 29;
  private static int BUK_RITPERADDLIB_SEC_DETTAGLIO = 30;
  private static int BUK_RITPERADDLIB_RPTBOX_BERASOESESEE = 31;
  private static int BUK_RITPERADDLIB_SPAN_RBRSERPARPAL = 32;
  private static int BUK_RITPERADDLIB_RPTBOX_BENCODICFISC = 33;
  private static int BUK_RITPERADDLIB_SPAN_REBCFRPARPAL = 34;
  private static int BUK_RITPERADDLIB_RPTBOX_NUMEROMAND = 35;
  private static int BUK_RITPERADDLIB_SPAN_REMANMRPARFL = 36;
  private static int BUK_RITPERADDLIB_RPTBOX_DDATAMAND = 37;
  private static int BUK_RITPERADDLIB_SPAN_REMDDMRPARFL = 38;
  private static int BUK_RITPERADDLIB_RPTBOX_COMPRES = 39;
  private static int BUK_RITPERADDLIB_SPAN_IERLAIRPARPA = 40;
  private static int BUK_RITPERADDLIB_RPTBOX_LIQIMPONIBIL = 41;
  private static int BUK_RITPERADDLIB_SPAN_RELIIMRPARFL = 42;
  private static int BUK_RITPERADDLIB_RPTBOX_LIQALIQUOTA = 43;
  private static int BUK_RITPERADDLIB_SPAN_RELIARPARPAL = 44;
  private static int BUK_RITPERADDLIB_RPTBOX_LIQRITENIRPE = 45;
  private static int BUK_RITPERADDLIB_SPAN_RELRIRPARPAL = 46;
  private static int BUK_RITPERADDLIB_SEC_DENOPIEDGRUP = 47;
  private static int BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMP1 = 48;
  private static int BUK_RITPERADDLIB_SPAN_DPGSRLIRPARP = 49;
  private static int BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRII1 = 50;
  private static int BUK_RITPERADDLIB_SPAN_DPGSRLRIRPAR = 51;
  private static int BUK_RITPERADDLIB_RPTBOX_TOTALE1 = 52;
  private static int BUK_RITPERADDLIB_SPAN_TOTALE1 = 53;
  private static int BUK_RITPERADDLIB_RPTBOX_LINEA = 54;
  private static int BUK_RITPERADDLIB_SEC_PIEDEREPORT = 55;
  private static int BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMPO = 56;
  private static int BUK_RITPERADDLIB_SPAN_PRSRLIRPARPA = 57;
  private static int BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRIIR = 58;
  private static int BUK_RITPERADDLIB_SPAN_PRSRLRIRPARP = 59;
  private static int BUK_RITPERADDLIB_RPTBOX_TOTALE = 60;
  private static int BUK_RITPERADDLIB_SPAN_TOTALE = 61;


  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI170(IMDB);
    //
    //
    Init_PQRY_PARAMETRI165(IMDB);
    Init_PQRY_PARAMETRI165_RS(IMDB);
    Init_PQRY_LIQ28(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI170(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI170, 11);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI170, "TBL_PARAMETRI170");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMCASSA, "PARAMCASSA");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMCASSA,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMESERCIZ,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMDTARITE, "PARAMDTARITE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMDTARITE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMSUBIMPE, "PARAMSUBIMPE");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMSUBIMPE,5,49,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMREGCOM, "PARAMREGCOM");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI170,IMDBDef5.FLD_PARAMETRI170_PARAMREGCOM,5,49,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI170, 0);
  }

  private static void Init_PQRY_PARAMETRI165(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI165, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI165, "PQRY_PARAMETRI165");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMREGCOM, "PARAMREGCOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165,IMDBDef15.PQSL_PARAMETRI165_PARAMREGCOM,5,49,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI165, 0);
  }

  private static void Init_PQRY_PARAMETRI165_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI165_RS, 7);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI165_RS, "PQRY_PARAMETRI165_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, "PARAMINIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, "PARAMFINE");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMFINE,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMDAL, "PARAMDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMDAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMAL, "PARAMAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMAL,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMUFFICIO, "PARAMUFFICIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMUFFICIO,1,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARADATAELAB, "PARADATAELAB");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARADATAELAB,6,49,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMREGCOM, "PARAMREGCOM");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI165_RS,IMDBDef15.PQSL_PARAMETRI165_PARAMREGCOM,5,49,0);
  }

  private static void Init_PQRY_LIQ28(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_LIQ28, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_LIQ28, "PQRY_LIQ28");
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECBENCODFIS, "RECBENCODFIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECBENCODFIS,5,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECMANNUMMAN, "RECMANNUMMAN");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECMANNUMMAN,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECMANDDATMA, "RECMANDDATMA");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECMANDDATMA,6,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECLIQANNIMP, "RECLIQANNIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECLIQANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECORLIQIMP1, "RECORLIQIMP1");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECORLIQIMP1,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECORLIQALIQ, "RECORLIQALIQ");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECORLIQALIQ,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECLIQRITIRP, "RECLIQRITIRP");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_RECLIQRITIRP,3,28,6);
    IMDB.set_FldCode(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_DENOMINAZION, "DENOMINAZION");
    IMDB.SetFldParams(IMDBDef15.PQRY_LIQ28,IMDBDef15.PQSL_LIQ28_DENOMINAZION,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_LIQ28, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RitenutePerAddizionale(MyWebEntryPoint w, IMDBObj imdb)
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
  public RitenutePerAddizionale()
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
    FormIdx = MyGlb.FRM_RITENPERADDI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "170DDE38-13C7-4E23-86BA-8998AF9832B1";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 368;
    DesignHeight = 354;
    set_Caption(new IDVariant("Ritenute Per Addizionale"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 368;
    Frames[1].Height = 328;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 328;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 368-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "30E4DC3F-C455-43B1-A06F-C7C52E8742CC");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1792, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    BKW_RITPERADDLIB = new OBook(this);
    BUK_RITPERADDLIB = new CIDREObj(BKW_RITPERADDLIB);
    BKW_RITPERADDLIB.iGuid = "F31CADB6-2F34-4DF9-BFF2-A19BB879212B";
    BKW_RITPERADDLIB.Code = "BUK_RITPERADDLIB";
    BKW_RITPERADDLIB.BookObj = BUK_RITPERADDLIB;
    BKW_RITPERADDLIB.InitDefMasks();
    BUK_RITPERADDLIB.InitBook(1, 1245441, "Ritenute Per Addizionale Libro", IMDB, MainFrm.VisualStyleList);
    BUK_RITPERADDLIB.InitHTML();
    BUK_RITPERADDLIB.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_RITPERADDLIB.Book.SetMainFrm(MainFrm);
    BUK_RITPERADDLIB.SetRTCGuid(0, "F31CADB6-2F34-4DF9-BFF2-A19BB879212B");
    BUK_RITPERADDLIB.SetObjCode(0, "RITPERADDLIB");
    BUK_RITPERADDLIB_MST_RITPERADDMAS_Init();
    BUK_RITPERADDLIB_RPT_RITPERADDREP_Init();
    BUK_RITPERADDLIB_InitLinks();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI170, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RITENPERADDI_PARAMETRI165();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      // BUK_RITPERADDLIB.UpdateBook();
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
    if (Code.equals("BUK_RITPERADDLIB")) return BUK_RITPERADDLIB;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof RitenutePerAddizionale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RitenutePerAddizionale.class.getName() : (Glb.ClassWithPackage(RitenutePerAddizionale.class) ? RitenutePerAddizionale.class.getName().substring(RitenutePerAddizionale.class.getPackage().getName().length() + 1) : RitenutePerAddizionale.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PDATA = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      v_PDATA = (new IDVariant());
      BUK_RITPERADDLIB.set_PrintDestination((new IDVariant(3)).intValue());
      BUK_RITPERADDLIB.RefreshQuery();
      BUK_RITPERADDLIB.PrintBook((new IDVariant(1)).intValue(), (new IDVariant(-1)).intValue()); 
      MainFrm.set_RedirectTo((new IDVariant(BUK_RITPERADDLIB.GetWebFileName())));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant(""))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenutePerAddizionale", "Elabora", _e);
      return -1;
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Ritenute per Addizionale", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMINIZIO, 0, (new IDVariant(1)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMFINE, 0, (new IDVariant(12)));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARADATAELAB, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMREGCOM, 0, (new IDVariant("R")));
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMUFFICIO, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RitenutePerAddizionale", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMCASSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMINIZIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMFINE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARADATAELAB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMDTARITE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMUFFICIO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMSUBIMPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMREGCOM, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RITENPERADDI_PARAMETRI165() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI165_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI170, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI170, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI165_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI165_RS, 0, IMDBDef5.TBL_PARAMETRI170, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI165_RS, 0, 0, IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMINIZIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI165_RS, 1, 0, IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMFINE, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI165_RS, 2, 0, IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI165_RS, 3, 0, IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI165_RS, 4, 0, IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMUFFICIO, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI165_RS, 5, 0, IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARADATAELAB, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI165_RS, 6, 0, IMDBDef5.TBL_PARAMETRI170, IMDBDef5.FLD_PARAMETRI170_PARAMREGCOM, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI170, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI170, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI170, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI165_RS, 0);
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

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
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

  private void BUK_RITPERADDLIB_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_RITPERADDLIB_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_RITPERADDLIB_SEC_INTESTREPORT)
    {
    }
    if (SectionID==BUK_RITPERADDLIB_SEC_DENOINTEGRUP)
    {
    }
    if (SectionID==BUK_RITPERADDLIB_SEC_DETTAGLIO)
    {
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_IERLAIRPARPA, new IDVariant(((BUK_RITPERADDLIB.GetReportColumn(BUK_RITPERADDLIB_RPT_RITPERADDREP, "RECLIQANNIMP").equals(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))?(new IDVariant("Competenza")):(new IDVariant("Residui")))));
    }
    if (SectionID==BUK_RITPERADDLIB_SEC_DENOPIEDGRUP)
    {
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_DPGSRLIRPARP, new IDVariant(BUK_RITPERADDLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITPERADDLIB_SEC_DENOPIEDGRUP,"RECORLIQIMP1")));
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_DPGSRLRIRPAR, new IDVariant(BUK_RITPERADDLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITPERADDLIB_SEC_DENOPIEDGRUP,"RECLIQRITIRP")));
    }
    if (SectionID==BUK_RITPERADDLIB_SEC_PIEDEREPORT)
    {
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_PRSRLIRPARPA, new IDVariant(BUK_RITPERADDLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITPERADDLIB_SEC_PIEDEREPORT,"RECORLIQIMP1")));
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_PRSRLRIRPARP, new IDVariant(BUK_RITPERADDLIB.GetAggrFunct(IDREGlb.AGGR_SUM,BUK_RITPERADDLIB_SEC_PIEDEREPORT,"RECLIQRITIRP")));
    }
  }

  private void BUK_RITPERADDLIB_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_RITPERADDLIB_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_RITPERADDLIB_MST_RITPERADDMAS)
    {
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_CPTSRPALRPAP, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_RITPERADDLIB.GetPageNumber())))), (new IDVariant(" di "))), IDL.ToString((new IDVariant(BUK_RITPERADDLIB.GetTotalPagesNumber()))))));
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_UTPTTDPRRPAP, new IDVariant(IDL.Upper(IDL.Add(IDL.Add((new IDVariant(BUK_RITPERADDLIB.BoxToolTip(BUK_RITPERADDLIB_RPTBOX_TESTATPAGINA))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMREGCOM, 0).equals((new IDVariant("R")))? new IDVariant("Regionale") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMREGCOM, 0).equals((new IDVariant("C")))? new IDVariant("Comunale") :  new IDVariant())), MainFrm.ESERCIZIO))));
      BUK_RITPERADDLIB.set_SpanValue(BUK_RITPERADDLIB_SPAN_IEPDRPAPPARP, new IDVariant(((IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals(IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0)))?IDL.Add(IDL.Add((new IDVariant("Mese di")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())):IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Da")), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMINIZIO, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), (IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(1)))? new IDVariant("Gennaio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(2)))? new IDVariant("Febbraio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(3)))? new IDVariant("Marzo") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(4)))? new IDVariant("Aprile") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(5)))? new IDVariant("Maggio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(6)))? new IDVariant("Giugno") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(7)))? new IDVariant("Luglio") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(8)))? new IDVariant("Agosto") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(9)))? new IDVariant("Settembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(10)))? new IDVariant("Ottobre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(11)))? new IDVariant("Novembre") : IMDB.Value(IMDBDef15.PQRY_PARAMETRI165, IMDBDef15.PQSL_PARAMETRI165_PARAMFINE, 0).equals((new IDVariant(12)))? new IDVariant("Dicembre") :  new IDVariant())))));
    }
  }

  private void BUK_RITPERADDLIB_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_RITPERADDLIB_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_RITPERADDLIB_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_RITPERADDLIB_OnPreview()
  {
    PreviewBook = BKW_RITPERADDLIB;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "208A883F-6E28-4902-8D6E-E081A8A6A2A0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 16, 3, 300, 57, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 43);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "012411FE-DEE6-4E8B-89CD-2B9FFD0B141E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "Mandati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, MyGlb.PANEL_FORM, 16, 63, 300, 57, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 46);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_MANDATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, "BB12E15F-648D-406B-88D5-D44241A75268");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, "Addizionale");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_LIST, 0, -9999, 256, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, MyGlb.PANEL_FORM, 16, 123, 300, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 0, 65);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_ADDIZIONALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "E416EB47-9D17-4C68-A36E-D67B7D86F470");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "EA24FF87-81EA-419D-BF17-BA0670BDE83E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "FAFB5B5D-992F-435A-9996-FE7D2A0B4BCE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "75BEC478-36BA-4010-B240-2BCCCA6BAC7A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "5CDA0BB9-A78F-40AE-BF31-4183B8DB1E41");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "31777205-6263-465D-8EEF-78446A094AA4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "95D2B83B-FB38-47CC-AE83-BBE308E5C0BC");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, "3D84AA10-BC73-424F-A1E9-FCB8AB0A7950");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, "Regcom");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "BC5F6A6E-B37F-43B6-B336-289D7FB00D83");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "33D8A63F-6799-4A8A-8746-DE2EE27585DE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "D659E57B-198B-43BA-BDBF-717D3275B346");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 188, 204, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 236, 260, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 36);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 20, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA, PPQRY_PARAMETRI165, "A.PARAMINIZIO", "PARAMINIZIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DA, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, "A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 180, 28, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI165, "A.PARAMFINE", "PARAMFINE", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(1)), "Gennaio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(2)), "Febbraio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(3)), "Marzo", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(4)), "Aprile", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(5)), "Maggio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(6)), "Giugno", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(7)), "Luglio", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(8)), "Agosto", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(9)), "Settembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(10)), "Ottobre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(11)), "Novembre", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_A, (new IDVariant(12)), "Dicembre", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 188, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 300, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE2, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 24);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 20, 88, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI165, "A.PARAMDAL", "PARAMDAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 180, 88, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI165, "A.PARAMAL", "PARAMAL", 1, 5, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 112, 192, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 300, 104, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE1, -1, GRP_PARAMETRI_MANDATI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_LIST, "Regcom");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_FORM, 84, 148, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_REGCOM, MyGlb.PANEL_FORM, "Regc.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_REGCOM, -1, GRP_PARAMETRI_ADDIZIONALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_REGCOM, PPQRY_PARAMETRI165, "A.PARAMREGCOM", "PARAMREGCOM", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_REGCOM, (new IDVariant("R")), "Regionale", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_REGCOM, (new IDVariant("C")), "Comunale", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 148, 156, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 20, 160, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_ADDIZIONALE);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 36, 184, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_PARAMETRI165, "A.PARAMUFFICIO", "PARAMUFFICIO", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 20, 212, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 116);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_PARAMETRI165, "A.PARADATAELAB", "PARADATAELAB", 6, 49, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~PARAMUFFICIO~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~PARAMUFFICIO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI165", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI165, IMDBDef15.PQRY_PARAMETRI165_RS, IMDBDef5.TBL_PARAMETRI170);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA, IMDBDef5.FLD_PARAMETRI170_PARAMINIZIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef5.FLD_PARAMETRI170_PARAMFINE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef5.FLD_PARAMETRI170_PARAMDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef5.FLD_PARAMETRI170_PARAMAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_REGCOM, IMDBDef5.FLD_PARAMETRI170_PARAMREGCOM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef5.FLD_PARAMETRI170_PARAMUFFICIO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef5.FLD_PARAMETRI170_PARADATAELAB);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI170");
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

  private void BUK_RITPERADDLIB_MST_RITPERADDMAS_Init()
  {
    BUK_RITPERADDLIB.InitMastro(BUK_RITPERADDLIB_MST_RITPERADDMAS, 3, 21000, 29700, 1, 2, 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_MST_RITPERADDMAS, "95AAF7C7-8008-4832-9202-F34E87E46CD7");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_MST_RITPERADDMAS, "RITPERADDMAS");
    BUK_RITPERADDLIB.InitMastroBox(BUK_RITPERADDLIB_MST_RITPERADDMAS, BUK_RITPERADDLIB_RPTBOX_NUMEROPAGINA, 26000, 200, 2700, 600, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_NUMEROPAGINA, "4115D571-687E-4AFB-8466-B16E51EDE1A8");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_NUMEROPAGINA, BUK_RITPERADDLIB_SPAN_CPTSRPALRPAP, MyGlb.VIS_NORMAA8RIGHT, 5, 207, 0, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_CPTSRPALRPAP, "670A8342-12C5-4310-BC82-59E36070BC57");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_CPTSRPALRPAP, "CPTSRPALRPAP");
    BUK_RITPERADDLIB.InitMastroBox(BUK_RITPERADDLIB_MST_RITPERADDMAS, BUK_RITPERADDLIB_RPTBOX_TESTATPAGINA, 1000, 1300, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "Elenco Ritenute per Addizionale ", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_TESTATPAGINA, "FE748704-8732-42B7-93D8-3B2C99BE23C9");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_TESTATPAGINA, "TESTATPAGINA");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_TESTATPAGINA, BUK_RITPERADDLIB_SPAN_UTPTTDPRRPAP, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_UTPTTDPRRPAP, "27F7D3AA-035F-4CB5-9D84-B06F16806512");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_UTPTTDPRRPAP, "UTPTTDPRRPAP");
    BUK_RITPERADDLIB.InitMastroBox(BUK_RITPERADDLIB_MST_RITPERADDMAS, BUK_RITPERADDLIB_RPTBOX_SOTTTESTPAGI, 1000, 2400, 27700, 900, 0, 3, 1, MyGlb.VIS_TITREPNOBOCE, 983297, 554, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_SOTTTESTPAGI, "B3CF8988-F317-4FA1-BCBC-54F4E9393558");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_SOTTTESTPAGI, "SOTTTESTPAGI");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_SOTTTESTPAGI, BUK_RITPERADDLIB_SPAN_IEPDRPAPPARP, MyGlb.VIS_TITREPNOBOCE, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_IEPDRPAPPARP, "8D9D87AD-A03E-4CDB-91AA-CD1B79834D65");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_IEPDRPAPPARP, "IEPDRPAPPARP");
    BUK_RITPERADDLIB.InitMastroBox(BUK_RITPERADDLIB_MST_RITPERADDMAS, BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA, 1000, 3400, 27700, 16500, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA, "29F36A44-098B-41FD-A7C6-B74C4CF4AF6B");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA, "CORPOPAGINA");
  }

  private void BUK_RITPERADDLIB_RPT_RITPERADDREP_InitQuery() { BUK_RITPERADDLIB_RPT_RITPERADDREP_InitQuery(true, true); }
  private void BUK_RITPERADDLIB_RPT_RITPERADDREP_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
      SQL.append("  A.CODICE_FISCALE as RECBENCODFIS, ");
      SQL.append("  C.NUMERO_MAND as RECMANNUMMAN, ");
      SQL.append("  C.D_DATA_MAND as RECMANDDATMA, ");
      SQL.append("  B.ANNO_IMP as RECLIQANNIMP, ");
      SQL.append("  B.IMPONIBILE as RECORLIQIMP1, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', B.ALIQUOTA_ADD, B.ALIQUOTA_ADD_COM) as RECORLIQALIQ, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', B.RITENUTE_ADD, B.RITENUTE_ADD_COM) as RECLIQRITIRP, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', DECODE(DECODE(M.REGIONE, 5, DECODE(M.SIGLA, 'BZ', 21, 22), M.REGIONE), 1, 'Piemonte', 2, 'Valle d''Aosta', 3, 'Liguria', 4, 'Lombardia', 5, 'Trentino Alto Adige', 6, 'Veneto', 7, 'Friuli Venezia Giulia', 8, 'Emilia Romagna', 9, 'Marche', 10, 'Toscana', 11, 'Umbria', 12, 'Lazio', 13, 'Campania', 14, 'Abruzzo', 15, 'Molise', 16, 'Puglia', 17, 'Basilicata', 18, 'Calabria', 19, 'Sicilia', 20, 'Sardegna', 21, 'Bolzano', 22, 'Trento'), L.DENOMINAZIONE) as DENOMINAZION ");
      SQL.append("from ");
      SQL.append("  BEN A, ");
      SQL.append("  LIQ B, ");
      SQL.append("  MAN C, ");
      SQL.append("  AD4_COMUNI L, ");
      SQL.append("  AD4_PROVINCIE M ");
      SQL.append("where (B.BENEFICIARIO = A.CODICE(+)) ");
      SQL.append("and   (NVL(A.COMUNE_DOMICILIO, A.COMUNE) = L.COMUNE(+)) ");
      SQL.append("and   (NVL(A.PROVINCIA_DOMICILIO, A.PROVINCIA) = L.PROVINCIA_STATO(+)) ");
      SQL.append("and   (NVL(A.PROVINCIA_DOMICILIO, A.PROVINCIA) = M.PROVINCIA(+)) ");
      SQL.append("and   (B.ANNO_MAND = C.ANNO_MAND) ");
      SQL.append("and   (B.NUMERO_MAND = C.NUMERO_MAND) ");
      SQL.append("and   (DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', B.RITENUTE_ADD, B.RITENUTE_ADD_COM) > 0) ");
      SQL.append("and   ((B.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI165.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI165.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(B.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI165.PARAMUFFICIO~~, -1, NVL(B.UFFICIO, -1), ~~PQRY_PARAMETRI165.PARAMUFFICIO~~)) ");
      SQL.append("and   ((C.D_DATA_MAND BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI165.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI165.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (B.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'M') ");
      SQL.append("and   (C.D_DATA_MAND = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(D.D_DATA_MAND) ");
      SQL.append("from ");
      SQL.append("  MAN D ");
      SQL.append("where (D.ANNO_MAND = C.ANNO_MAND) ");
      SQL.append("and   (D.NUMERO_MAND = C.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("UNION ");
      SQL.append("select ");
      SQL.append("  G.RAGIONE_SOCIALE_ESTESA, ");
      SQL.append("  G.CODICE_FISCALE, ");
      SQL.append("  F.NUMERO_MAND, ");
      SQL.append("  F.D_DATA_MAND, ");
      SQL.append("  E.ANNO_IMP, ");
      SQL.append("  E.IMPONIBILE, ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', E.ALIQUOTA_ADD, E.ALIQUOTA_ADD_COM), ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', E.RITENUTE_ADD, E.RITENUTE_ADD_COM), ");
      SQL.append("  DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', DECODE(DECODE(K.REGIONE, 5, DECODE(K.SIGLA, 'BZ', 21, 22), K.REGIONE), 1, 'Piemonte', 2, 'Valle d''Aosta', 3, 'Liguria', 4, 'Lombardia', 5, 'Trentino Alto Adige', 6, 'Veneto', 7, 'Friuli Venezia Giulia', 8, 'Emilia Romagna', 9, 'Marche', 10, 'Toscana', 11, 'Umbria', 12, 'Lazio', 13, 'Campania', 14, 'Abruzzo', 15, 'Molise', 16, 'Puglia', 17, 'Basilicata', 18, 'Calabria', 19, 'Sicilia', 20, 'Sardegna', 21, 'Bolzano', 22, 'Trento'), J.DENOMINAZIONE) ");
      SQL.append("from ");
      SQL.append("  LIQ E, ");
      SQL.append("  MAN F, ");
      SQL.append("  BEN G, ");
      SQL.append("  PAGAMENTI H, ");
      SQL.append("  AD4_COMUNI J, ");
      SQL.append("  AD4_PROVINCIE K ");
      SQL.append("where (E.BENEFICIARIO = G.CODICE(+)) ");
      SQL.append("and   (NVL(G.COMUNE_DOMICILIO, G.COMUNE) = J.COMUNE(+)) ");
      SQL.append("and   (NVL(G.PROVINCIA_DOMICILIO, G.PROVINCIA) = J.PROVINCIA_STATO(+)) ");
      SQL.append("and   (NVL(G.PROVINCIA_DOMICILIO, G.PROVINCIA) = K.PROVINCIA(+)) ");
      SQL.append("and   (E.ANNO_LIQ = H.ANNO_LIQ) ");
      SQL.append("and   (E.NUMERO_LIQ = H.NUMERO_LIQ) ");
      SQL.append("and   (E.ANNO_MAND = H.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = H.NUMERO_MAND) ");
      SQL.append("and   (E.ANNO_MAND = F.ANNO_MAND) ");
      SQL.append("and   (E.NUMERO_MAND = F.NUMERO_MAND) ");
      SQL.append("and   (E.ANNO_MAND = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
      SQL.append("and   (DECODE(~~PQRY_PARAMETRI165.PARAMREGCOM~~, 'R', E.RITENUTE_ADD, E.RITENUTE_ADD_COM) > 0) ");
      SQL.append("and   ((E.NUMERO_MAND BETWEEN NVL(~~PQRY_PARAMETRI165.PARAMDAL~~, 1) AND NVL(~~PQRY_PARAMETRI165.PARAMAL~~, 99999))) ");
      SQL.append("and   (NVL(E.UFFICIO, -1) = DECODE(~~PQRY_PARAMETRI165.PARAMUFFICIO~~, -1, NVL(E.UFFICIO, -1), ~~PQRY_PARAMETRI165.PARAMUFFICIO~~)) ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(H.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(H.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   ((H.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(~~PQRY_PARAMETRI165.PARAMINIZIO~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy') AND LAST_DAY(TO_DATE((1)||'/'||(~~PQRY_PARAMETRI165.PARAMFINE~~)||'/'||(~~TBL_DATISESSIONE.SESSIOESERCI~~),'dd/mm/yyyy')))) ");
      SQL.append("and   (" + IDL.CSql(MainFrm.DATARIFRITEN, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " = 'P') ");
      SQL.append("and   (H.D_DATA_PAGAM = ");
      SQL.append("( ");
      SQL.append("select ");
      SQL.append("  MIN(I.D_DATA_PAGAM) ");
      SQL.append("from ");
      SQL.append("  PAGAMENTI I ");
      SQL.append("where ((I.D_DATA_PAGAM BETWEEN TO_DATE((1)||'/'||(1)||'/'||(H.ANNO_MAND),'dd/mm/yyyy') AND TO_DATE((31)||'/'||(12)||'/'||(H.ANNO_MAND),'dd/mm/yyyy'))) ");
      SQL.append("and   (I.ANNO_LIQ = H.ANNO_LIQ) ");
      SQL.append("and   (I.NUMERO_LIQ = H.NUMERO_LIQ) ");
      SQL.append("and   (I.ANNO_MAND = H.ANNO_MAND) ");
      SQL.append("and   (I.NUMERO_MAND = H.NUMERO_MAND) ");
      SQL.append(")) ");
      SQL.append("order by 9, 4, 3 ");
      BUK_RITPERADDLIB.SetReportQuery(BUK_RITPERADDLIB_RPT_RITPERADDREP, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "0E93765A-756C-4940-A858-08EE7A8893DA");
      if (BUK_RITPERADDLIB.FindObjByID(BUK_RITPERADDLIB_SEC_DENOINTEGRUP) != null)
        BUK_RITPERADDLIB.AddReportGroup(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, "DENOMINAZION");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_RITPERADDLIB_RPT_RITPERADDREP_Init()
  {
    BUK_RITPERADDLIB.InitReport(BUK_RITPERADDLIB_RPT_RITPERADDREP, 196865);
    BUK_RITPERADDLIB_RPT_RITPERADDREP_InitQuery(true, false);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPT_RITPERADDREP, "C08075DC-26AC-4CA6-B945-EF8BCAC586FA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPT_RITPERADDREP, "RITPERADDREP");
    BUK_RITPERADDLIB.InitSection(BUK_RITPERADDLIB_RPT_RITPERADDREP, BUK_RITPERADDLIB_SEC_INTESTREPORT, 0, 1, 0, 1, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RITPERADDLIB.SetSectionRendersInto(BUK_RITPERADDLIB_SEC_INTESTREPORT, BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SEC_INTESTREPORT, "5BAA37B4-9679-4468-9890-CBE503562D50");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SEC_INTESTREPORT, "INTESTREPORT");
    BUK_RITPERADDLIB.InitSection(BUK_RITPERADDLIB_RPT_RITPERADDREP, BUK_RITPERADDLIB_SEC_DENOINTEGRUP, 2200, 1, 0, 3, MyGlb.VIS_DEFAREPOSTYL, 9240577, "DENOMINAZION");
    BUK_RITPERADDLIB.SetSectionRendersInto(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, "66683FA6-5361-4012-90BB-C38143EE31B7");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, "DENOINTEGRUP");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_DENOMINAZION, 0, 100, 26900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_DENOMINAZION, "CAFC356C-F733-451E-9EAA-A98ABFB7AE57");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_DENOMINAZION, "DENOMINAZION");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_DENOMINAZION, BUK_RITPERADDLIB_SPAN_DENOMINAZION, MyGlb.VIS_INTSENZABORD, 5, 99, 0, 271384705, "If Equal (Param Regcom [Ritenute Per Addizionale - Parametri], Regionale, Decode (If Equal (PROVINCE REGIONE, Trentino Alto Adige, If Equal (PROVINCE SIGLA, BZ, Bolzano, Trento), PROVINCE REGIONE), Regioni), COMUNI DENOMINAZIONE)", "::DENOMINAZION", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_DENOMINAZION, "264059D5-F043-43EF-9FAD-FB0083B16169");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_DENOMINAZION, "DENOMINAZION");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_BENRAGSOCHEA, 0, 1000, 8900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_BENRAGSOCHEA, "846F9ACF-B8A9-4489-BFBB-9E1A17596356");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_BENRAGSOCHEA, "BENRAGSOCHEA");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_BENRAGSOCHEA, BUK_RITPERADDLIB_SPAN_RAGIONSOCIAL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Ragione Sociale", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_RAGIONSOCIAL, "57C0EA74-507D-45CA-A540-E1D14F1DBE24");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_RAGIONSOCIAL, "RAGIONSOCIAL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_BENCODFISHEA, 9100, 1000, 3800, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_BENCODFISHEA, "156C0EE4-8FB0-46EF-B577-9A58C8DBEA6B");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_BENCODFISHEA, "BENCODFISHEA");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_BENCODFISHEA, BUK_RITPERADDLIB_SPAN_CODICEFISCAL, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "Codice Fiscale", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_CODICEFISCAL, "72CF290F-7FB3-4D88-966F-41688E39C1D0");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_CODICEFISCAL, "CODICEFISCAL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_MANDATHEADER, 13000, 1000, 2800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_MANDATHEADER, "762179F1-1C9F-4029-B88D-3A5DAC3FABAA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_MANDATHEADER, "MANDATHEADER");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_MANDATHEADER, BUK_RITPERADDLIB_SPAN_MANDATO, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Mandato", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_MANDATO, "926741CC-611E-4DC5-9D3A-9F089C090BA4");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_MANDATO, "MANDATO");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_NUMEMANDHEAD, 13000, 1600, 900, 500, 0, 1, 1, MyGlb.VIS_INTSENZABORD, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_NUMEMANDHEAD, "6DB611D8-3024-4C2F-AA04-B0AFF84A7FA0");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_NUMEMANDHEAD, "NUMEMANDHEAD");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_NUMEMANDHEAD, BUK_RITPERADDLIB_SPAN_NRO, MyGlb.VIS_INTSENZABORD, 0, 0, 0, 271384961, "", "N.ro", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_NRO, "28691F9B-A177-421E-AAA6-A0B1277BC904");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_NRO, "NRO");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_DDATAMANDHEA, 14000, 1600, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORCE1, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_DDATAMANDHEA, "E3F6D033-1051-454B-B348-FBD73306BC0B");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_DDATAMANDHEA, "DDATAMANDHEA");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_DDATAMANDHEA, BUK_RITPERADDLIB_SPAN_DATA, MyGlb.VIS_INTSENBORCE1, 0, 0, 0, 271384961, "", "Data", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_DATA, "9A053148-2225-41AA-96FA-E8EA6DE3C4C0");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_DATA, "DATA");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_LIQIMPONHEAD, 18200, 1000, 3500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_LIQIMPONHEAD, "41B840DD-66F3-49C8-89E0-577463D855D0");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_LIQIMPONHEAD, "LIQIMPONHEAD");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_LIQIMPONHEAD, BUK_RITPERADDLIB_SPAN_IMPONIBILE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Imponibile", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_IMPONIBILE, "CF4C6862-43AF-4159-84C9-F85E6410054E");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_IMPONIBILE, "IMPONIBILE");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_LIQALIQUHEAD, 21800, 1000, 1100, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_LIQALIQUHEAD, "F143AB37-BD43-49DD-8910-213C00C3A551");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_LIQALIQUHEAD, "LIQALIQUHEAD");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_LIQALIQUHEAD, BUK_RITPERADDLIB_SPAN_ALIQ, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Aliq.", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_ALIQ, "1852A502-56A5-4300-A6A2-B2871BAD0A22");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_ALIQ, "ALIQ");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, BUK_RITPERADDLIB_RPTBOX_LIQRITIRPHEA, 23000, 1000, 3500, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_LIQRITIRPHEA, "1FBCB3AA-EFEB-46EC-8193-E6D183929013");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_LIQRITIRPHEA, "LIQRITIRPHEA");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_LIQRITIRPHEA, BUK_RITPERADDLIB_SPAN_RITENUTE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Ritenute", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_RITENUTE, "8E118C70-0FB5-4DEA-A824-14CCBCA0C034");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_RITENUTE, "RITENUTE");
    BUK_RITPERADDLIB.InitSection(BUK_RITPERADDLIB_RPT_RITPERADDREP, BUK_RITPERADDLIB_SEC_DETTAGLIO, 700, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_RITPERADDLIB.SetSectionRendersInto(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SEC_DETTAGLIO, "435AFC6F-826C-48EC-B3CC-258419DEB3D4");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SEC_DETTAGLIO, "DETTAGLIO");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_BERASOESESEE, 100, 0, 8800, 500, 0, 1, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_BERASOESESEE, "16088127-1E96-47D0-9359-B250C1E931DA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_BERASOESESEE, "BERASOESESEE");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_BERASOESESEE, BUK_RITPERADDLIB_SPAN_RBRSERPARPAL, MyGlb.VIS_DEFAREPOSTYL, 5, 60, 0, 271384705, "Brief description of field content.", "::REBERASOESES", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_RBRSERPARPAL, "44F3D5A8-FB80-40B7-869A-C7D4FE895AD7");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_RBRSERPARPAL, "RBRSERPARPAL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_BENCODICFISC, 9100, 0, 3800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_BENCODICFISC, "AE9DC057-F6C1-4D23-BAF1-E0EA6D5139DA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_BENCODICFISC, "BENCODICFISC");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_BENCODICFISC, BUK_RITPERADDLIB_SPAN_REBCFRPARPAL, MyGlb.VIS_DEFAREPOSTYL, 5, 16, 0, 271384705, "Brief description of field content.", "::RECBENCODFIS", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_REBCFRPARPAL, "63F22651-D040-487E-82A1-F831E47C5F56");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_REBCFRPARPAL, "REBCFRPARPAL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_NUMEROMAND, 13000, 0, 900, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_NUMEROMAND, "E1A2D745-2B2C-4A8C-9F59-2174583CE975");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_NUMEROMAND, "NUMEROMAND");
    BUK_RITPERADDLIB.set_BoxAlignment(BUK_RITPERADDLIB_RPTBOX_NUMEROMAND, 3);
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_NUMEROMAND, BUK_RITPERADDLIB_SPAN_REMANMRPARFL, MyGlb.VIS_DEFAREPOSTYL, 1, 5, 0, 271384705, "Brief description of field content.", "::RECMANNUMMAN", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_REMANMRPARFL, "D9204126-7022-40CE-A668-F1580CB395AC");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_REMANMRPARFL, "REMANMRPARFL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_DDATAMAND, 14000, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_DDATAMAND, "AAA9B498-A28C-4B7E-B428-285DF35B4F59");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_DDATAMAND, "DDATAMAND");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_DDATAMAND, BUK_RITPERADDLIB_SPAN_REMDDMRPARFL, MyGlb.VIS_DEFAREPOSTYL, 6, 19, 0, 271384705, "Brief description of field content.", "::RECMANDDATMA", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_REMDDMRPARFL, "3D44A462-A0DA-4058-ADFF-6BF5D9D2A210");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_REMDDMRPARFL, "REMDDMRPARFL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_COMPRES, 15900, 0, 2200, 500, 0, 1, 1, MyGlb.VIS_NORMAA8RIGHT, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_COMPRES, "ED696193-F8B4-4C96-AEBA-FC626ED01B63");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_COMPRES, "COMPRES");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_COMPRES, BUK_RITPERADDLIB_SPAN_IERLAIRPARPA, MyGlb.VIS_NORMAA8RIGHT, 5, 99, 0, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_IERLAIRPARPA, "1D87B9F1-BFBF-44FA-AC00-6F266D8FFD78");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_IERLAIRPARPA, "IERLAIRPARPA");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_LIQIMPONIBIL, 18200, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_LIQIMPONIBIL, "E137E524-65EB-47FE-A9D7-80BDAC486C5C");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_LIQIMPONIBIL, "LIQIMPONIBIL");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_LIQIMPONIBIL, BUK_RITPERADDLIB_SPAN_RELIIMRPARFL, MyGlb.VIS_DEFAREPOSTYL, 3, 14, 6, 271384705, "Brief description of field content.", "::RECORLIQIMP1", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_RELIIMRPARFL, "9EE4FE45-2A38-49CC-97BD-F69ECB7B61FA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_RELIIMRPARFL, "RELIIMRPARFL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_LIQALIQUOTA, 21800, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_LIQALIQUOTA, "357B2BE8-7A74-4488-937F-B55AFDBEB5DA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_LIQALIQUOTA, "LIQALIQUOTA");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_LIQALIQUOTA, BUK_RITPERADDLIB_SPAN_RELIARPARPAL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "Brief description of field content.", "::RECORLIQALIQ", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_RELIARPARPAL, "D295FAB9-22E5-4ACA-9AA6-46B544822646");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_RELIARPARPAL, "RELIARPARPAL");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DETTAGLIO, BUK_RITPERADDLIB_RPTBOX_LIQRITENIRPE, 23000, 0, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_LIQRITENIRPE, "991BB896-B473-4B62-82C2-281701CE9BEB");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_LIQRITENIRPE, "LIQRITENIRPE");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_LIQRITENIRPE, BUK_RITPERADDLIB_SPAN_RELRIRPARPAL, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "Brief description of field content.", "::RECLIQRITIRP", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_RELRIRPARPAL, "A81EFF2C-3019-42E1-84E3-F19BE3A3C43D");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_RELRIRPARPAL, "RELRIRPARPAL");
    BUK_RITPERADDLIB.InitSection(BUK_RITPERADDLIB_RPT_RITPERADDREP, BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, 800, 1, 0, 5, MyGlb.VIS_DEFAREPOSTYL, 8978433, "DENOMINAZION");
    BUK_RITPERADDLIB.SetSectionRendersInto(BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, "5F6A2092-BBBC-4CCD-A0BA-4218F2B0DF2D");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, "DENOPIEDGRUP");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMP1, 18200, 200, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMP1, "12F4B1A5-B6DB-40EE-BDC2-F421EA67C65B");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMP1, "SUMOFLIQIMP1");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMP1, BUK_RITPERADDLIB_SPAN_DPGSRLIRPARP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_DPGSRLIRPARP, "5C5BCA52-834C-4853-87BE-307719D19DBA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_DPGSRLIRPARP, "DPGSRLIRPARP");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRII1, 23000, 200, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRII1, "FCA6B872-3740-4DFD-891A-5DA4E325A99B");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRII1, "SUMOFLIQRII1");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRII1, BUK_RITPERADDLIB_SPAN_DPGSRLRIRPAR, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_DPGSRLRIRPAR, "08E3ED7F-4802-450A-98DC-428129261810");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_DPGSRLRIRPAR, "DPGSRLRIRPAR");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, BUK_RITPERADDLIB_RPTBOX_TOTALE1, 16300, 200, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_TOTALE1, "85FA9C65-DDEB-4CC1-8B42-28CD059EA5DB");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_TOTALE1, "TOTALE1");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_TOTALE1, BUK_RITPERADDLIB_SPAN_TOTALE1, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale...", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_TOTALE1, "23150223-2687-438A-B4E6-EEDCEE759343");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_TOTALE1, "TOTALE1");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_DENOPIEDGRUP, BUK_RITPERADDLIB_RPTBOX_LINEA, 18200, 0, 8100, 100, 0, 1, 1, MyGlb.VIS_BORDOINFERIO, 983041, 0, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_LINEA, "99D05BE0-9E41-48BE-8215-A85049160FFA");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_LINEA, "LINEA");
    BUK_RITPERADDLIB.InitSection(BUK_RITPERADDLIB_RPT_RITPERADDREP, BUK_RITPERADDLIB_SEC_PIEDEREPORT, 800, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_RITPERADDLIB.SetSectionRendersInto(BUK_RITPERADDLIB_SEC_PIEDEREPORT, BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SEC_PIEDEREPORT, "01E1A183-B667-4D76-842D-1BAA3C14E959");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SEC_PIEDEREPORT, "PIEDEREPORT");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_PIEDEREPORT, BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMPO, 18200, 100, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMPO, "40BCB7D8-9F85-4342-8A4C-F827089B5460");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMPO, "SUMOFLIQIMPO");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQIMPO, BUK_RITPERADDLIB_SPAN_PRSRLIRPARPA, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_PRSRLIRPARPA, "792312B7-D422-4367-B084-40309E0840D7");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_PRSRLIRPARPA, "PRSRLIRPARPA");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_PIEDEREPORT, BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRIIR, 23000, 200, 3500, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRIIR, "7F0338A0-F736-4937-A629-B89A434F1D85");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRIIR, "SUMOFLIQRIIR");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_SUMOFLIQRIIR, BUK_RITPERADDLIB_SPAN_PRSRLRIRPARP, MyGlb.VIS_DEFAREPOSTYL, 3, 28, 6, 271384705, "", "", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_PRSRLRIRPARP, "0FA3AE58-EE23-4957-8435-F31AA74426D9");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_PRSRLRIRPARP, "PRSRLRIRPARP");
    BUK_RITPERADDLIB.InitReportBox(BUK_RITPERADDLIB_SEC_PIEDEREPORT, BUK_RITPERADDLIB_RPTBOX_TOTALE, 16300, 100, 1800, 500, 0, 1, 1, MyGlb.VIS_INTSENBORRIG, 983041, 340, "", 1, -33);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_RPTBOX_TOTALE, "C5CD8448-0A3F-42A9-9937-AE4D12738E77");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_RPTBOX_TOTALE, "TOTALE");
    BUK_RITPERADDLIB.InitBoxSpan(BUK_RITPERADDLIB_RPTBOX_TOTALE, BUK_RITPERADDLIB_SPAN_TOTALE, MyGlb.VIS_INTSENBORRIG, 0, 0, 0, 271384961, "", "Totale", 1);
    BUK_RITPERADDLIB.SetRTCGuid(BUK_RITPERADDLIB_SPAN_TOTALE, "BE80D138-F5D5-4824-9C9C-B027549E0CC8");
    BUK_RITPERADDLIB.SetObjCode(BUK_RITPERADDLIB_SPAN_TOTALE, "TOTALE");
    BUK_RITPERADDLIB.AddReportGroup(BUK_RITPERADDLIB_SEC_DENOINTEGRUP, "DENOMINAZION");
    BUK_RITPERADDLIB_RPT_RITPERADDREP_InitQuery(false, true);
  }

  private void BUK_RITPERADDLIB_InitLinks()
  {
    BUK_RITPERADDLIB.SetBoxNextBox(BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA, BUK_RITPERADDLIB_RPTBOX_CORPOPAGINA);
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
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_RITPERADDLIB) BUK_RITPERADDLIB_OnPreview();
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
