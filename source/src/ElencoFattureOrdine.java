// **********************************************
// Elenco Fatture Ordine
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoFattureOrdine extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_FATTURE_NUMEROFATTUR = 0;
  private static int PFL_FATTURE_DATAFATTURA = 1;
  private static int PFL_FATTURE_IMPUTATO = 2;
  private static int PFL_FATTURE_LIQUIDATO = 3;
  private static int PFL_FATTURE_TOTFATTURE = 4;
  private static int PFL_FATTURE_PROGRESSIVO = 5;
  private static int PFL_FATTURE_ESTREMORDINE = 6;
  private static int PFL_FATTURE_ESTREMIMPEGN = 7;

  private static int PPQRY_FATTUREBUON2 = 0;


  IDPanel PAN_FATTURE;
  private static int PFL_LIQUIDAZIONI_NUMERODISTIN = 0;
  private static int PFL_LIQUIDAZIONI_ANNODISTINTA = 1;
  private static int PFL_LIQUIDAZIONI_IMPORTO = 2;
  private static int PFL_LIQUIDAZIONI_NUMEROLIQ = 3;
  private static int PFL_LIQUIDAZIONI_ANNOLIQ = 4;
  private static int PFL_LIQUIDAZIONI_DISTINTA = 5;
  private static int PFL_LIQUIDAZIONI_LIQUIDAZIONE = 6;
  private static int PFL_LIQUIDAZIONI_DATALIQUIDAZ = 7;
  private static int PFL_LIQUIDAZIONI_NUMEROMANDAT = 8;
  private static int PFL_LIQUIDAZIONI_DATAMANDATO = 9;
  private static int PFL_LIQUIDAZIONI_MANDATO = 10;
  private static int PFL_LIQUIDAZIONI_TOTIMPORTO = 11;

  private static int PPQRY_LIQFATTUBUO2 = 0;


  IDPanel PAN_LIQUIDAZIONI;
  private static int PFL_PARAM_TOTALEIMPUTA = 0;
  private static int PFL_PARAM_TOTALELIQUID = 1;

  private static int PPQRY_PARAM45 = 0;


  IDPanel PAN_PARAM;
  private static int PFL_PARAM1_TOTALEIMPORT = 0;

  private static int PPQRY_PARAM33 = 0;


  IDPanel PAN_PARAM1;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM40(IMDB);
    //
    //
    Init_PQRY_FATTUREBUON2(IMDB);
    Init_PQRY_LIQFATTUBUO2(IMDB);
    Init_PQRY_PARAM45(IMDB);
    Init_PQRY_PARAM45_RS(IMDB);
    Init_PQRY_PARAM33(IMDB);
    Init_PQRY_PARAM33_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM40(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAM40, 13);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAM40, "TBL_PARAM40");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMANNBUO, "ROWNAMANNBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMANNBUO,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMNUMBUO, "ROWNAMNUMBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMNUMBUO,1,6,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMPROBUO, "ROWNAMPROBUO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMPROBUO,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMPROIMP, "ROWNAMPROIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMPROIMP,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMDAEMBU, "ROWNAMDAEMBU");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMDAEMBU,6,10,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMDESDET, "ROWNAMDESDET");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMDESDET,9,2000,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMTOTIM1, "ROWNAMTOTIM1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMTOTIM1,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMTOTLIQ, "ROWNAMTOTLIQ");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMTOTLIQ,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMTOTIMP, "ROWNAMTOTIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMTOTIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMNUMIMP, "ROWNAMNUMIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMNUMIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMANNIMP, "ROWNAMANNIMP");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMANNIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMNUMSUB, "ROWNAMNUMSUB");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMNUMSUB,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMANNSUB, "ROWNAMANNSUB");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAM40,IMDBDef2.FLD_PARAM40_ROWNAMANNSUB,1,4,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAM40, 0);
  }

  private static void Init_PQRY_FATTUREBUON2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FATTUREBUON2, 6);
    IMDB.set_TblCode(IMDBDef10.PQRY_FATTUREBUON2, "PQRY_FATTUREBUON2");
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_PROGRESSIVO,1,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_IMPUTATO, "IMPUTATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_IMPUTATO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_LIQUIDATO, "LIQUIDATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_FATTUREBUON2,IMDBDef10.PQSL_FATTUREBUON2_LIQUIDATO,3,14,2);
    IMDB.TblAddNew(IMDBDef10.PQRY_FATTUREBUON2, 0);
  }

  private static void Init_PQRY_LIQFATTUBUO2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_LIQFATTUBUO2, 9);
    IMDB.set_TblCode(IMDBDef10.PQRY_LIQFATTUBUO2, "PQRY_LIQFATTUBUO2");
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_ANNO_DISTINTA, "ANNO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_ANNO_DISTINTA,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_NUMERO_DISTINTA, "NUMERO_DISTINTA");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_NUMERO_DISTINTA,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_DATA_REGISTRAZIONE, "DATA_REGISTRAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_DATA_REGISTRAZIONE,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_ANNO_LIQ, "ANNO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_ANNO_LIQ,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_NUMERO_LIQ, "NUMERO_LIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_NUMERO_LIQ,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_LIFABULIDDDR, "LIFABULIDDDR");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_LIFABULIDDDR,6,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_NUMERO_MAND, "NUMERO_MAND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_NUMERO_MAND,1,5,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_DATA_MAND, "DATA_MAND");
    IMDB.SetFldParams(IMDBDef10.PQRY_LIQFATTUBUO2,IMDBDef10.PQSL_LIQFATTUBUO2_DATA_MAND,1,7,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_LIQFATTUBUO2, 0);
  }

  private static void Init_PQRY_PARAM45(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM45, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM45, "PQRY_PARAM45");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM45,IMDBDef10.PQSL_PARAM45_ROWNAMTOTIM1, "ROWNAMTOTIM1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM45,IMDBDef10.PQSL_PARAM45_ROWNAMTOTIM1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM45,IMDBDef10.PQSL_PARAM45_ROWNAMTOTLIQ, "ROWNAMTOTLIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM45,IMDBDef10.PQSL_PARAM45_ROWNAMTOTLIQ,3,14,2);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM45, 0);
  }

  private static void Init_PQRY_PARAM45_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM45_RS, 2);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM45_RS, "PQRY_PARAM45_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM45_RS,IMDBDef10.PQSL_PARAM45_ROWNAMTOTIM1, "ROWNAMTOTIM1");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM45_RS,IMDBDef10.PQSL_PARAM45_ROWNAMTOTIM1,3,14,2);
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM45_RS,IMDBDef10.PQSL_PARAM45_ROWNAMTOTLIQ, "ROWNAMTOTLIQ");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM45_RS,IMDBDef10.PQSL_PARAM45_ROWNAMTOTLIQ,3,14,2);
  }

  private static void Init_PQRY_PARAM33(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM33, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM33, "PQRY_PARAM33");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM33,IMDBDef10.PQSL_PARAM33_ROWNAMTOTIMP, "ROWNAMTOTIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM33,IMDBDef10.PQSL_PARAM33_ROWNAMTOTIMP,3,14,2);
    IMDB.TblAddNew(IMDBDef10.PQRY_PARAM33, 0);
  }

  private static void Init_PQRY_PARAM33_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_PARAM33_RS, 1);
    IMDB.set_TblCode(IMDBDef10.PQRY_PARAM33_RS, "PQRY_PARAM33_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_PARAM33_RS,IMDBDef10.PQSL_PARAM33_ROWNAMTOTIMP, "ROWNAMTOTIMP");
    IMDB.SetFldParams(IMDBDef10.PQRY_PARAM33_RS,IMDBDef10.PQSL_PARAM33_ROWNAMTOTIMP,3,14,2);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoFattureOrdine(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoFattureOrdine()
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
    FormIdx = MyGlb.FRM_ELENFATTORDI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "701D530F-8A5A-4B44-A811-1E0AD37BDC85";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 604;
    DesignHeight = 498;
    set_Caption(new IDVariant("Elenco Fatture Ordine"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 604;
    Frames[1].Height = 472;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 472;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "59CF5A55-82C1-44EC-A200-90BE9A275CB9";
    TAB_TAB.SetItemCount(2);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Fatture";
    Frames[2].Parent = this;
    PAN_FATTURE = new IDPanel(w, this, 2, "PAN_FATTURE");
    Frames[2].Content = PAN_FATTURE;
    PAN_FATTURE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FATTURE.VS = MainFrm.VisualStyleList;
    PAN_FATTURE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 604-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D6448438-D8A8-434D-98C1-BFA7D066C88B");
    PAN_FATTURE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 4, 56, 428, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FATTURE.InitStatus = 2;
    PAN_FATTURE_Init();
    PAN_FATTURE_InitFields();
    PAN_FATTURE_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Fatture", "Imputazione delle fatture ai buoni d'ordine");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Liquidazioni";
    Frames[3].Parent = this;
    PAN_LIQUIDAZIONI = new IDPanel(w, this, 3, "PAN_LIQUIDAZIONI");
    Frames[3].Content = PAN_LIQUIDAZIONI;
    PAN_LIQUIDAZIONI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQUIDAZIONI.VS = MainFrm.VisualStyleList;
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 604-MyGlb.PAN_OFFS_X, 472-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BC493A1E-283D-442E-AA64-A16911955ABD");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 488, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQUIDAZIONI.InitStatus = 2;
    PAN_LIQUIDAZIONI_Init();
    PAN_LIQUIDAZIONI_InitFields();
    PAN_LIQUIDAZIONI_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Liquidazioni", "Liquidazioni avvenute su fatture_buoni");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    PAN_FATTURE.SetSubFrame(PFL_FATTURE_TOTFATTURE,4);
    Frames[4].set_SubFrame(true);
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Param";
    Frames[4].Parent = this;
    PAN_PARAM = new IDPanel(w, this, 4, "PAN_PARAM");
    Frames[4].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A47BA6A1-3E4F-4A8D-B8B6-1E09A76DB831");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 416, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    PAN_LIQUIDAZIONI.SetSubFrame(PFL_LIQUIDAZIONI_TOTIMPORTO,5);
    Frames[5].set_SubFrame(true);
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Param 1";
    Frames[5].Parent = this;
    PAN_PARAM1 = new IDPanel(w, this, 5, "PAN_PARAM1");
    Frames[5].Content = PAN_PARAM1;
    PAN_PARAM1.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM1.VS = MainFrm.VisualStyleList;
    PAN_PARAM1.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3A00A137-DBB0-4AC7-B7BA-3E5240B91475");
    PAN_PARAM1.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 208, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM1.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM1.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM1.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM1.InitStatus = 2;
    PAN_PARAM1_Init();
    PAN_PARAM1_InitFields();
    PAN_PARAM1_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM40, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENFATTORDI_PARAM45();
      }
      if (IMDB.TblModified(IMDBDef2.TBL_PARAM40, MyGlb.GlbRefModIdx) || IMDB.TblModified(IMDBDef10.PQRY_PARAM45, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENFATTORDI_PARAM33();
      }
      PAN_FATTURE.UpdatePanel(MainFrm);
      PAN_LIQUIDAZIONI.UpdatePanel(MainFrm);
      PAN_PARAM.UpdatePanel(MainFrm);
      PAN_PARAM1.UpdatePanel(MainFrm);
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
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof ElencoFattureOrdine);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoFattureOrdine.class.getName() : (Glb.ClassWithPackage(ElencoFattureOrdine.class) ? ElencoFattureOrdine.class.getName().substring(ElencoFattureOrdine.class.getPackage().getName().length() + 1) : ElencoFattureOrdine.class.getName()));
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
    IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO3 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_MESSAGGIO4 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_MESSAGGIO = (new IDVariant("Elenco Fatture ", IDVariant.STRING));
      v_MESSAGGIO1 = (new IDVariant("Ordine: ", IDVariant.STRING));
      v_MESSAGGIO2 = (new IDVariant("Dett: ", IDVariant.STRING));
      v_MESSAGGIO3 = (new IDVariant("Imp. ", IDVariant.STRING));
      v_MESSAGGIO4 = (new IDVariant("Sub. ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_MESSAGGIO, MainFrm.ESERCIZIO));
      if (!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMPROBUO, 0))))
      {
        PAN_FATTURE.set_FieldText(PFL_FATTURE_ESTREMORDINE, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO1, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMNUMBUO, 0))), (new IDVariant(" - "))), MainFrm.Datetostring(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMDAEMBU, 0))), (new IDVariant(" - "))), v_MESSAGGIO2), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMPROBUO, 0))), (new IDVariant(" - "))), IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMDESDET, 0)).stringValue());
      }
      else
      {
        PAN_FATTURE.set_FieldText(PFL_FATTURE_ESTREMORDINE, IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO1, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMNUMBUO, 0))), (new IDVariant(" - "))), MainFrm.Datetostring(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMDAEMBU, 0))).stringValue());
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMPROIMP, 0))))
      {
        PAN_FATTURE.set_FieldText(PFL_FATTURE_ESTREMIMPEGN, IDL.Add(IDL.Add(IDL.Add(v_MESSAGGIO3, IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMNUMIMP, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMANNIMP, 0))).stringValue());
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_SUBPERVOCPE4, IMDBDef16.PQSL_SUBPERVOCPE4_ROWNAMANNSUB, 0))))
        {
          PAN_FATTURE.set_FieldText(PFL_FATTURE_ESTREMIMPEGN, IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(PAN_FATTURE.FieldText(PFL_FATTURE_ESTREMIMPEGN))), (new IDVariant(" - "))), v_MESSAGGIO4), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMNUMSUB, 0))), (new IDVariant(" / "))), IDL.ToString(IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMANNSUB, 0))).stringValue());
        }
        PAN_FATTURE.SetFlags (Glb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FATTURE.SetFlags (Glb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFattureOrdine", "LoadEvent", _e);
    }
  }

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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFattureOrdine", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMANNBUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMNUMBUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMPROBUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMPROIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMDAEMBU, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMDESDET, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTIM1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTLIQ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMNUMIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMANNIMP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMNUMSUB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMANNSUB, 0, new IDVariant());
  }

  // **********************************************************************
  // Liquidazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTIMP, 0, PAN_LIQUIDAZIONI.GetFieldSum(PFL_LIQUIDAZIONI_IMPORTO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFattureOrdine", "LiquidazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Fatture After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FATTURE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Fatture After Find Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTIM1, 0, PAN_FATTURE.GetFieldSum(PFL_FATTURE_IMPUTATO));
      IMDB.set_Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTLIQ, 0, PAN_FATTURE.GetFieldSum(PFL_FATTURE_LIQUIDATO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFattureOrdine", "FattureAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Fatture On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FATTURE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FATTURE);
      // 
      // Fatture On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_FATTURE.set_ToolTip(Glb.OBJ_FIELD,PFL_FATTURE_NUMEROFATTUR,(new IDVariant(PAN_FATTURE.FieldText(PFL_FATTURE_NUMEROFATTUR))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFattureOrdine", "FattureOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void ELENFATTORDI_PARAM45() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM45_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM40, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM40, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_PARAM45_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM45_RS, 0, IMDBDef2.TBL_PARAM40, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM45_RS, 0, 0, IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTIM1, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_PARAM45_RS, 1, 0, IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTLIQ, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM40, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM40, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM40, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM45_RS, 0);
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void ELENFATTORDI_PARAM33() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_PARAM33_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM40, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAM40, 0))
    {
      if (IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTIM1, 0).equals(IMDB.Value(IMDBDef10.PQRY_PARAM45, IMDBDef10.PQSL_PARAM45_ROWNAMTOTIM1, 0), true))
      {
        if (IMDB.Value(IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTLIQ, 0).equals(IMDB.Value(IMDBDef10.PQRY_PARAM45, IMDBDef10.PQSL_PARAM45_ROWNAMTOTLIQ, 0), true))
        {
          IMDB.TblAddNew(IMDBDef10.PQRY_PARAM33_RS, 0);
          IMDB.TblLinkRow(IMDBDef10.PQRY_PARAM33_RS, 0, IMDBDef2.TBL_PARAM40, 0);
          IMDB.TblLinkField(IMDBDef10.PQRY_PARAM33_RS, 0, 0, IMDBDef2.TBL_PARAM40, IMDBDef2.FLD_PARAM40_ROWNAMTOTIMP, 0);
        }
      }
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAM40, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAM40, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAM40, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_PARAM33_RS, 0);
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_FATTURE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FATTURE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FATTURE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FATTURE, Cancel);
    // Stub
  }

  private void PAN_FATTURE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FATTURE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FATTURE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FATTURE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQUIDAZIONI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQUIDAZIONI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQUIDAZIONI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_LIQUIDAZIONI);
    // Stub
  }

  private void PAN_LIQUIDAZIONI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_LIQUIDAZIONI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_LIQUIDAZIONI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQUIDAZIONI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAM1_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM1, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM1_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM1, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM1_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAM1);
    // Stub
  }

  private void PAN_PARAM1_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM1_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM1_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM1_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FATTURE_Init()
  {

    PAN_FATTURE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FATTURE.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FATTURE.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, "9587B37C-861F-4AF1-B042-4FCED3AE6425");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, "Numero Fattura");
    PAN_FATTURE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, "90F529E7-5603-42DD-8E9E-196510D8C248");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, "Data Fattura");
    PAN_FATTURE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, "D890F6BE-5E6A-4BFF-A1AC-C40C873BC0F7");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, "Imputato");
    PAN_FATTURE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, "3D05B4AB-27F2-40C3-B2DA-4FE86DA9F735");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, "Liquidato");
    PAN_FATTURE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, "F04F8104-DB28-407B-9BB2-FD1683521E12");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, MyGlb.VIS_VUOTONORMALE);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, "1343AFBE-F96C-4F42-A929-B757B1EB8E3B");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, "PROGRESSIVO");
    PAN_FATTURE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, "C3DB8147-38B6-4FD5-8A0F-6C356A76523B");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, MyGlb.VIS_ETICHEGRASSE);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FATTURE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, "850B6899-F7E5-4FBF-A8E8-34A95E01ECF6");
    PAN_FATTURE.set_Header(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, "");
    PAN_FATTURE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, MyGlb.VIS_ETICHEGRASSE);
    PAN_FATTURE.SetFlags(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_FATTURE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_LIST, 4, 92, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_LIST, 76);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_LIST, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_LIST, "Numero Fattura");
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_FORM, 4, 220, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_FORM, 76);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_FORM, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_NUMEROFATTUR, MyGlb.PANEL_FORM, "Num. Fatt.");
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_NUMEROFATTUR, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_NUMEROFATTUR, PPQRY_FATTUREBUON2, "B.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_LIST, 148, 92, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_LIST, 72);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_LIST, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_LIST, "Data Fattura");
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_FORM, 4, 268, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_FORM, 72);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_FORM, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_DATAFATTURA, MyGlb.PANEL_FORM, "Dt. Fattura");
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_DATAFATTURA, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_DATAFATTURA, PPQRY_FATTUREBUON2, "B.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_LIST, 224, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_LIST, 60);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_LIST, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_LIST, "Imputato");
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_FORM, 4, 124, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_FORM, 136);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_FORM, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_IMPUTATO, MyGlb.PANEL_FORM, "Imputato");
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_IMPUTATO, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_IMPUTATO, PPQRY_FATTUREBUON2, "A.IMPUTATO", "IMPUTATO", 3, 14, 2, -13997);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_LIST, 328, 92, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_LIST, 64);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_LIST, "Liquidato");
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_FORM, 4, 148, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_FORM, 136);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_LIQUIDATO, MyGlb.PANEL_FORM, "Liquidato");
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_LIQUIDATO, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_LIQUIDATO, PPQRY_FATTUREBUON2, "A.LIQUIDATO", "LIQUIDATO", 3, 14, 2, -13997);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, MyGlb.PANEL_LIST, 200, 300, 268, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, MyGlb.PANEL_LIST, 0);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, MyGlb.PANEL_LIST, 4);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, MyGlb.PANEL_FORM, 112, 244, 252, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, MyGlb.PANEL_FORM, 0);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_TOTFATTURE, MyGlb.PANEL_FORM, 4);
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_TOTFATTURE, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_TOTFATTURE, -1, "", "TOTFATTURE", 0, 0, 0, -13997);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 268, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_FATTURE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FATTURE_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_PROGRESSIVO, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_PROGRESSIVO, PPQRY_FATTUREBUON2, "A.PROGRESSIVO", "PROGRESSIVO", 1, 10, 0, -13997);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, MyGlb.PANEL_LIST, 0, 4, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, MyGlb.PANEL_LIST, 0);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, MyGlb.PANEL_LIST, 1);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, MyGlb.PANEL_FORM, 0, 0, 320, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, MyGlb.PANEL_FORM, 0);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMORDINE, MyGlb.PANEL_FORM, 1);
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_ESTREMORDINE, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_ESTREMORDINE, -1, "", "ESTREMORDINE", 0, 0, 0, -13997);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0, 28, 332, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_FATTURE.SetRect(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, MyGlb.PANEL_FORM, 8, 8, 320, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FATTURE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_FATTURE.SetNumRow(MyGlb.OBJ_FIELD, PFL_FATTURE_ESTREMIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_FATTURE.SetFieldPage(PFL_FATTURE_ESTREMIMPEGN, -1, -1);
    PAN_FATTURE.SetFieldPanel(PFL_FATTURE_ESTREMIMPEGN, -1, "", "ESTREMIMPEGN", 0, 0, 0, -13997);
  }

  private void PAN_FATTURE_InitQueries()
  {
    StringBuffer SQL;

    PAN_FATTURE.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FATTURE.SetIMDB(IMDB, "PQRY_FATTUREBUON2", true);
    PAN_FATTURE.set_SetString(MyGlb.MASTER_ROWNAME, "FATTURE BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  B.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  B.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  B.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  A.IMPUTATO as IMPUTATO, ");
    SQL.append("  A.LIQUIDATO as LIQUIDATO ");
    PAN_FATTURE.SetQuery(PPQRY_FATTUREBUON2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FATTURE_BUONI A, ");
    SQL.append("  FAT B ");
    PAN_FATTURE.SetQuery(PPQRY_FATTUREBUON2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_PROG = B.ANNO_PROG) ");
    SQL.append("and   (A.NUMERO_PROG = B.NUMERO_PROG) ");
    SQL.append("and   (A.ANNO_BUONO = NVL(~~TBL_PARAM40.ROWNAMANNBUO~~, A.ANNO_BUONO)) ");
    SQL.append("and   (A.NUMERO_BUONO = NVL(~~TBL_PARAM40.ROWNAMNUMBUO~~, A.NUMERO_BUONO)) ");
    SQL.append("and   (A.PROGRESSIVO_BUONO = NVL(~~TBL_PARAM40.ROWNAMPROBUO~~, A.PROGRESSIVO_BUONO)) ");
    SQL.append("and   (A.PROGRESSIVO_IMP = NVL(~~TBL_PARAM40.ROWNAMPROIMP~~, A.PROGRESSIVO_IMP)) ");
    PAN_FATTURE.SetQuery(PPQRY_FATTUREBUON2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTURE.SetQuery(PPQRY_FATTUREBUON2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FATTURE.SetQuery(PPQRY_FATTUREBUON2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.PROGRESSIVO ");
    PAN_FATTURE.SetQuery(PPQRY_FATTUREBUON2, 5, SQL, -1, "");
    PAN_FATTURE.SetQueryDB(PPQRY_FATTUREBUON2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FATTURE.SetMasterTable(0, "FATTURE_BUONI");
    PAN_FATTURE.AddToSortList(PFL_FATTURE_PROGRESSIVO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FATTURE.Status() == 2)
    {
      int oldListQBE = PAN_FATTURE.iUseListQBE;
      PAN_FATTURE.iUseListQBE = 0;
      PAN_FATTURE.PanelCommand(Glb.PCM_SEARCH);
      PAN_FATTURE.PanelCommand(Glb.PCM_FIND);
      PAN_FATTURE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_LIQUIDAZIONI_Init()
  {

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "AB3614E7-CD71-4009-9B0E-8943CE7059D7");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "Numero Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "3478511E-5115-46F2-A77A-D171C69DA4E2");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "Anno Distinta");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "E2242DB5-9010-4439-97ED-B67BAB08895E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "Importo");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "A5091DC2-46C0-425A-A1DF-7B84757ABE63");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "NUMERO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "F65BC3DF-C7AB-4BCA-B87C-405BFB679397");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "ANNO LIQ");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, "8E7EF3FD-2432-42C7-8E2A-66235A3235BB");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, "Distinta");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, "E1FB9AA2-DACD-43AD-A247-4E3E47D11E29");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, "Liquidazione");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, "CD6EED6B-7740-4EBB-859B-1CA850F6E053");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, "Data Liquidazione");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, "96C6ECC8-07D7-4B7A-8F37-745AEDA0162E");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, "Numero Mandato");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, "8D5BB330-85D1-4670-808D-5A38E22892E4");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, "Data Mandato");
    PAN_LIQUIDAZIONI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, "F993A4A9-F78C-4D78-A26E-504656FA8DC1");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, "Mandato");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.VIS_LABEVISUSTYL);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_LIQUIDAZIONI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, "4527B5D6-D5DC-4010-AB9E-F5E93B91013C");
    PAN_LIQUIDAZIONI.set_Header(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, "");
    PAN_LIQUIDAZIONI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQUIDAZIONI.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_LIQUIDAZIONI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_LIST, "Numero Distinta");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 356, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 120);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMERODISTIN, MyGlb.PANEL_FORM, "Numero Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMERODISTIN, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMERODISTIN, PPQRY_LIQFATTUBUO2, "A.NUMERO_DISTINTA", "NUMERO_DISTINTA", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 56, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 88);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_LIST, "Ann. Dist.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 204, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 104);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno Distinta");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNODISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNODISTINTA, PPQRY_LIQFATTUBUO2, "A.ANNO_DISTINTA", "ANNO_DISTINTA", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 104, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 4, 100, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_IMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_IMPORTO, PPQRY_LIQFATTUBUO2, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 184, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_LIST, "NUMERO LIQ");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 4, 148, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 72);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROLIQ, MyGlb.PANEL_FORM, "NUM. LIQ");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROLIQ, PPQRY_LIQFATTUBUO2, "A.NUMERO_LIQ", "NUMERO_LIQ", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 240, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_LIST, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_ANNOLIQ, MyGlb.PANEL_FORM, "ANNO LIQ");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_ANNOLIQ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_ANNOLIQ, PPQRY_LIQFATTUBUO2, "A.ANNO_LIQ", "ANNO_LIQ", 1, 4, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_LIST, 0, 0, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_FORM, 0, 0, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DISTINTA, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DISTINTA, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DISTINTA, -1, "", "DISTINTA", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_LIST, 184, 0, 104, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_FORM, 8, 8, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_LIQUIDAZIONE, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_LIQUIDAZIONE, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_LIQUIDAZIONE, -1, "", "LIQUIDAZIONE", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 288, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_LIST, "Data Liquidazione");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 4, 172, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 60);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATALIQUIDAZ, MyGlb.PANEL_FORM, "Dt. Liq.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DATALIQUIDAZ, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DATALIQUIDAZ, PPQRY_LIQFATTUBUO2, "B.D_DATA_REG", "LIFABULIDDDR", 6, 10, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_LIST, 380, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_LIST, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_LIST, "Numero Mandato");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_FORM, 4, 196, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_FORM, 84);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_NUMEROMANDAT, MyGlb.PANEL_FORM, "Num. Mand.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_NUMEROMANDAT, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_NUMEROMANDAT, PPQRY_LIQFATTUBUO2, "B.NUMERO_MAND", "NUMERO_MAND", 1, 5, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_LIST, 436, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_LIST, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_LIST, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_LIST, "Dt. Mand.");
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_FORM, 4, 220, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_FORM, 68);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_FORM, 1);
    PAN_LIQUIDAZIONI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_DATAMANDATO, MyGlb.PANEL_FORM, "Dt. Mand.");
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_DATAMANDATO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_DATAMANDATO, PPQRY_LIQFATTUBUO2, "C.DATA_MAND", "DATA_MAND", 1, 7, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_LIST, 380, 0, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_LIST, 2);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_FORM, 16, 16, 100, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_MANDATO, MyGlb.PANEL_FORM, 2);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_MANDATO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_MANDATO, -1, "", "MANDATO", 0, 0, 0, -13997);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, MyGlb.PANEL_LIST, 64, 244, 156, 64, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, MyGlb.PANEL_LIST, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, MyGlb.PANEL_LIST, 4);
    PAN_LIQUIDAZIONI.SetRect(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, MyGlb.PANEL_FORM, 64, 244, 216, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQUIDAZIONI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, MyGlb.PANEL_FORM, 0);
    PAN_LIQUIDAZIONI.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQUIDAZIONI_TOTIMPORTO, MyGlb.PANEL_FORM, 3);
    PAN_LIQUIDAZIONI.SetFieldPage(PFL_LIQUIDAZIONI_TOTIMPORTO, -1, -1);
    PAN_LIQUIDAZIONI.SetFieldPanel(PFL_LIQUIDAZIONI_TOTIMPORTO, -1, "", "TOTIMPORTO", 0, 0, 0, -13997);
  }

  private void PAN_LIQUIDAZIONI_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQUIDAZIONI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_LIQUIDAZIONI.SetIMDB(IMDB, "PQRY_LIQFATTUBUO2", true);
    PAN_LIQUIDAZIONI.set_SetString(MyGlb.MASTER_ROWNAME, "LIQ FATTURE BUONI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_DISTINTA as ANNO_DISTINTA, ");
    SQL.append("  A.NUMERO_DISTINTA as NUMERO_DISTINTA, ");
    SQL.append("  A.DATA_REGISTRAZIONE as DATA_REGISTRAZIONE, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.ANNO_LIQ as ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ as NUMERO_LIQ, ");
    SQL.append("  B.D_DATA_REG as LIFABULIDDDR, ");
    SQL.append("  B.NUMERO_MAND as NUMERO_MAND, ");
    SQL.append("  C.DATA_MAND as DATA_MAND ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQFATTUBUO2, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  LIQ_FATTURE_BUONI A, ");
    SQL.append("  LIQ B, ");
    SQL.append("  MAN C ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQFATTUBUO2, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.PROGR_FABU = ~~PQRY_FATTUREBUON2.PROGRESSIVO~~) ");
    SQL.append("and   (A.ANNO_LIQ = B.ANNO_LIQ) ");
    SQL.append("and   (A.NUMERO_LIQ = B.NUMERO_LIQ) ");
    SQL.append("and   (B.ANNO_MAND = C.ANNO_MAND(+)) ");
    SQL.append("and   (B.NUMERO_MAND = C.NUMERO_MAND(+)) ");
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQFATTUBUO2, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQFATTUBUO2, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQFATTUBUO2, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_LIQUIDAZIONI.SetQuery(PPQRY_LIQFATTUBUO2, 5, SQL, -1, "");
    PAN_LIQUIDAZIONI.SetQueryDB(PPQRY_LIQFATTUBUO2, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQUIDAZIONI.SetMasterTable(0, "LIQ_FATTURE_BUONI");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQUIDAZIONI.Status() == 2)
    {
      int oldListQBE = PAN_LIQUIDAZIONI.iUseListQBE;
      PAN_LIQUIDAZIONI.iUseListQBE = 0;
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQUIDAZIONI.PanelCommand(Glb.PCM_FIND);
      PAN_LIQUIDAZIONI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, "7235AD87-675C-43C5-8FE8-20F94AF310BB");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, "Totale Imputato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, "F9E68822-3342-4383-90FB-304352F3C3E5");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, "Totale Liquidato");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.VIS_NORFIECF4IMP);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_LIST, 832, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_LIST, 88);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_LIST, "Totale Imputato");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_FORM, 24, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALEIMPUTA, MyGlb.PANEL_FORM, "Totale Imputato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TOTALEIMPUTA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TOTALEIMPUTA, PPQRY_PARAM45, "A.ROWNAMTOTIM1", "ROWNAMTOTIM1", 3, 14, 2, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_LIST, 1040, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_LIST, 84);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_LIST, "Totale Liquidato");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_FORM, 128, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_TOTALELIQUID, MyGlb.PANEL_FORM, "Totale Liquidato");
    PAN_PARAM.SetFieldPage(PFL_PARAM_TOTALELIQUID, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TOTALELIQUID, PPQRY_PARAM45, "A.ROWNAMTOTLIQ", "ROWNAMTOTLIQ", 3, 14, 2, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM45", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM45, IMDBDef10.PQRY_PARAM45_RS, IMDBDef2.TBL_PARAM40);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TOTALEIMPUTA, IMDBDef2.FLD_PARAM40_ROWNAMTOTIM1);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_TOTALELIQUID, IMDBDef2.FLD_PARAM40_ROWNAMTOTLIQ);
    PAN_PARAM.SetMasterTable(0, "PARAM40");
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

  private void PAN_PARAM1_Init()
  {

    PAN_PARAM1.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM1.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAM1.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAM1.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, "D7E5CB2D-62C1-497C-B746-3EE94C410737");
    PAN_PARAM1.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, "Totale Importo");
    PAN_PARAM1.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, "");
    PAN_PARAM1.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM1.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM1_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_LIST, 1248, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_LIST, 80);
    PAN_PARAM1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_LIST, "Totale Importo");
    PAN_PARAM1.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_FORM, 40, 4, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM1.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_FORM, 112);
    PAN_PARAM1.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM1.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM1_TOTALEIMPORT, MyGlb.PANEL_FORM, "Totale Importo");
    PAN_PARAM1.SetFieldPage(PFL_PARAM1_TOTALEIMPORT, -1, -1);
    PAN_PARAM1.SetFieldPanel(PFL_PARAM1_TOTALEIMPORT, PPQRY_PARAM33, "A.ROWNAMTOTIMP", "ROWNAMTOTIMP", 3, 14, 2, -13997);
  }

  private void PAN_PARAM1_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM1.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM1.SetIMDB(IMDB, "PQRY_PARAM33", true);
    PAN_PARAM1.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM1.SetQueryIMDB(PPQRY_PARAM33, IMDBDef10.PQRY_PARAM33_RS, IMDBDef2.TBL_PARAM40);
    JustLoaded = true;
    PAN_PARAM1.SetFieldPrimaryIndex(PFL_PARAM1_TOTALEIMPORT, IMDBDef2.FLD_PARAM40_ROWNAMTOTIMP);
    PAN_PARAM1.SetMasterTable(0, "PARAM40");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM1.Status() == 2)
    {
      int oldListQBE = PAN_PARAM1.iUseListQBE;
      PAN_PARAM1.iUseListQBE = 0;
      PAN_PARAM1.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM1.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM1.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FATTURE) PAN_FATTURE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAM1) PAN_PARAM1_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTURE) PAN_FATTURE_ValidateRow(Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAM1) PAN_PARAM1_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FATTURE) PAN_FATTURE_DynamicProperties();
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_DynamicProperties();
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
    if (SrcObj == PAN_PARAM1) PAN_PARAM1_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FATTURE) PAN_FATTURE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAM1) PAN_PARAM1_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FATTURE) PAN_FATTURE_AfterFind(CmdFind);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FATTURE) PAN_FATTURE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_LIQUIDAZIONI) PAN_LIQUIDAZIONI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAM1) PAN_PARAM1_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
  }

  public void OnPreview(OBook SrcObj)
  {
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
