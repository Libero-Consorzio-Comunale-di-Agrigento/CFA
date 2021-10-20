// **********************************************
// Causali Previdenziali
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CausaliPrevidenziali extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAUSALPREVID_CODICE = 0;
  private static int PFL_CAUSALPREVID_DESCRIZIONE = 1;
  private static int PFL_CAUSALPREVID_PERCIMP = 2;
  private static int PFL_CAUSALPREVID_ALIQTOTALE = 3;
  private static int PFL_CAUSALPREVID_ALIQPERCIP = 4;
  private static int PFL_CAUSALPREVID_ALIQENTE = 5;
  private static int PFL_CAUSALPREVID_ACCERTAMENT1 = 6;
  private static int PFL_CAUSALPREVID_ANNOACC = 7;
  private static int PFL_CAUSALPREVID_APRIACCERTAM = 8;
  private static int PFL_CAUSALPREVID_INFOACCERTAM = 9;
  private static int PFL_CAUSALPREVID_IMPEGPERCIP1 = 10;
  private static int PFL_CAUSALPREVID_ANNOIMPEPERC = 11;
  private static int PFL_CAUSALPREVID_APRIIMPEGNCP = 12;
  private static int PFL_CAUSALPREVID_INFOIMPEGNCP = 13;
  private static int PFL_CAUSALPREVID_IMPEGENTE1 = 14;
  private static int PFL_CAUSALPREVID_ANNOIMPCE = 15;
  private static int PFL_CAUSALPREVID_APRIIMPEGNCE = 16;
  private static int PFL_CAUSALPREVID_INFOIMPEGNCE = 17;
  private static int PFL_CAUSALPREVID_TIPO = 18;
  private static int PFL_CAUSALPREVID_ACCERTAMENTO = 19;
  private static int PFL_CAUSALPREVID_IMPEGPERCIP = 20;
  private static int PFL_CAUSALPREVID_IMPEGENTE = 21;
  private static int PFL_CAUSALPREVID_SLASH = 22;
  private static int PFL_CAUSALPREVID_SLASH1 = 23;
  private static int PFL_CAUSALPREVID_SLASH2 = 24;
  private static int PFL_CAUSALPREVID_UTENTEINSERI = 25;
  private static int PFL_CAUSALPREVID_DATAINSERIME = 26;
  private static int PFL_CAUSALPREVID_UTENTULTIAGG = 27;
  private static int PFL_CAUSALPREVID_DATAULTIMAGG = 28;

  private static int PPQRY_T84 = 0;

  private static int PPQRY_INFO = 1;
  private static int PPQRY_APRI = 2;


  IDPanel PAN_CAUSALPREVID;
  CIDREObj BUK_CAUSPREVBOOK;
  OBook BKW_CAUSPREVBOOK;
  //
  // Template Pages constants
  private static int BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG = 1;
  private static int BUK_CAUSPREVBOOK_RPTBOX_NUMEROPAGINA = 2;
  private static int BUK_CAUSPREVBOOK_SPAN_NUMEROPAGINA = 3;
  private static int BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY = 4;
  private static int BUK_CAUSPREVBOOK_RPTBOX_TITOLO = 5;

  //
  // Reports constants
  private static int BUK_CAUSPREVBOOK_RPT_NEWREPORT = 6;
  private static int BUK_CAUSPREVBOOK_SEC_PAGEHEADER = 7;
  private static int BUK_CAUSPREVBOOK_RPTBOX_CODICEHEADER = 8;
  private static int BUK_CAUSPREVBOOK_SPAN_CODICE = 9;
  private static int BUK_CAUSPREVBOOK_RPTBOX_NEWBOX1 = 10;
  private static int BUK_CAUSPREVBOOK_SPAN_DESCRIZIONE = 11;
  private static int BUK_CAUSPREVBOOK_RPTBOX_PERCIMPOHEAD = 12;
  private static int BUK_CAUSPREVBOOK_SPAN_PERCIMP = 13;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ALIQINPSHEAD = 14;
  private static int BUK_CAUSPREVBOOK_SPAN_ALIQTOTALE = 15;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCPHEA = 16;
  private static int BUK_CAUSPREVBOOK_SPAN_ALIQPERCIP = 17;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCEHEA = 18;
  private static int BUK_CAUSPREVBOOK_SPAN_ALIQENTE = 19;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ACCERTHEADER = 20;
  private static int BUK_CAUSPREVBOOK_SPAN_ACCERTAMENTO = 21;
  private static int BUK_CAUSPREVBOOK_RPTBOX_IMPEPERCHEAD = 22;
  private static int BUK_CAUSPREVBOOK_SPAN_IMPEGNPERCIP = 23;
  private static int BUK_CAUSPREVBOOK_RPTBOX_IMPEENTEHEAD = 24;
  private static int BUK_CAUSPREVBOOK_SPAN_IMPEGNOENTE = 25;
  private static int BUK_CAUSPREVBOOK_SEC_TITOLO = 26;
  private static int BUK_CAUSPREVBOOK_RPTBOX_NEWBOX = 27;
  private static int BUK_CAUSPREVBOOK_SPAN_VARIADIBILAN = 28;
  private static int BUK_CAUSPREVBOOK_SEC_DETAIL = 29;
  private static int BUK_CAUSPREVBOOK_RPTBOX_CODICE = 30;
  private static int BUK_CAUSPREVBOOK_SPAN_T8COCAPRCAPB = 31;
  private static int BUK_CAUSPREVBOOK_RPTBOX_DESCRIZIONE = 32;
  private static int BUK_CAUSPREVBOOK_SPAN_T8DECAPRCAPB = 33;
  private static int BUK_CAUSPREVBOOK_RPTBOX_PERCIMPONIBI = 34;
  private static int BUK_CAUSPREVBOOK_SPAN_T8PEIMCAPCPB = 35;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ALIQUOTAINPS = 36;
  private static int BUK_CAUSPREVBOOK_SPAN_T8ALTOCAPCPB = 37;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCP = 38;
  private static int BUK_CAUSPREVBOOK_SPAN_T8ALPECAPCPB = 39;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCE = 40;
  private static int BUK_CAUSPREVBOOK_SPAN_T8ALENCAPCPB = 41;
  private static int BUK_CAUSPREVBOOK_RPTBOX_ACCERTAMENTO = 42;
  private static int BUK_CAUSPREVBOOK_SPAN_TSTACPCPBINI = 43;
  private static int BUK_CAUSPREVBOOK_RPTBOX_IMPEGNPERCIP = 44;
  private static int BUK_CAUSPREVBOOK_SPAN_TSTIPCPCPBIN = 45;
  private static int BUK_CAUSPREVBOOK_RPTBOX_IMPEGNOENTE = 46;
  private static int BUK_CAUSPREVBOOK_SPAN_TSTIECPCPBIN = 47;
  private static int BUK_CAUSPREVBOOK_SEC_PAGEFOOTER = 48;
  private static int BUK_CAUSPREVBOOK_SEC_REPORTFOOTER = 49;


  // Definition of Global Variables
  private IDVariant IMPEGNO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_T84(IMDB);
    Init_PQRY_T83(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_T84(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T84, 17);
    IMDB.set_TblCode(IMDBDef9.PQRY_T84, "PQRY_T84");
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_PERC_IMPONIBILE, "PERC_IMPONIBILE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_PERC_IMPONIBILE,3,6,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ALIQUOTA_INPS, "ALIQUOTA_INPS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ALIQUOTA_INPS,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ALIQUOTA_INPS_CP, "ALIQUOTA_INPS_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ALIQUOTA_INPS_CP,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ALIQUOTA_INPS_CE, "ALIQUOTA_INPS_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ALIQUOTA_INPS_CE,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ANNO_IMP_CP, "ANNO_IMP_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ANNO_IMP_CP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_NUMERO_IMP_CP, "NUMERO_IMP_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_NUMERO_IMP_CP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ANNO_IMP_CE, "ANNO_IMP_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_ANNO_IMP_CE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_NUMERO_IMP_CE, "NUMERO_IMP_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_NUMERO_IMP_CE,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_DATA_INSERIMENTO,6,19,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef9.PQRY_T84,IMDBDef9.PQSL_T84_DATA_ULTIMO_AGG,6,19,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T84, 0);
  }

  private static void Init_PQRY_T83(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_T83, 19);
    IMDB.set_TblCode(IMDBDef9.PQRY_T83, "PQRY_T83");
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_CODICE, "CODICE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_CODICE,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_DESCRIZIONE,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_PERC_IMPONIBILE, "PERC_IMPONIBILE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_PERC_IMPONIBILE,3,6,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ALIQUOTA_INPS, "ALIQUOTA_INPS");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ALIQUOTA_INPS,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ALIQUOTA_INPS_CP, "ALIQUOTA_INPS_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ALIQUOTA_INPS_CP,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ALIQUOTA_INPS_CE, "ALIQUOTA_INPS_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ALIQUOTA_INPS_CE,3,5,3);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ANNO_IMP_CP, "ANNO_IMP_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ANNO_IMP_CP,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_NUMERO_IMP_CP, "NUMERO_IMP_CP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_NUMERO_IMP_CP,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ANNO_IMP_CE, "ANNO_IMP_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_ANNO_IMP_CE,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_NUMERO_IMP_CE, "NUMERO_IMP_CE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_NUMERO_IMP_CE,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_TIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83INFOACCER, "T83INFOACCER");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83INFOACCER,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83SCELTACCE, "T83SCELTACCE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83SCELTACCE,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83INFOIMPCP, "T83INFOIMPCP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83INFOIMPCP,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83SCELIMPCP, "T83SCELIMPCP");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83SCELIMPCP,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83INFOIMPCE, "T83INFOIMPCE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83INFOIMPCE,5,99,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83SCELIMPCE, "T83SCELIMPCE");
    IMDB.SetFldParams(IMDBDef9.PQRY_T83,IMDBDef9.PQSL_T83_T83SCELIMPCE,5,1,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_T83, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CausaliPrevidenziali(MyWebEntryPoint w, IMDBObj imdb)
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
  public CausaliPrevidenziali()
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
    FormIdx = MyGlb.FRM_CAUSALPREVID;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "96427A9E-DE3E-4BBC-96F5-61D4411B5B9B";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 740;
    DesignHeight = 386;
    set_Caption(new IDVariant("Causali Previdenziali"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 740;
    Frames[1].Height = 360;
    Frames[1].Caption = "Causali Previdenziali";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 360;
    PAN_CAUSALPREVID = new IDPanel(w, this, 1, "PAN_CAUSALPREVID");
    Frames[1].Content = PAN_CAUSALPREVID;
    PAN_CAUSALPREVID.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAUSALPREVID.VS = MainFrm.VisualStyleList;
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 740-MyGlb.PAN_OFFS_X, 360-MyGlb.PAN_OFFS_Y, 0, 0);
    if (BUK_CAUSPREVBOOK != null)
      PAN_CAUSALPREVID.SetBook(BUK_CAUSPREVBOOK);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "564D50DE-70EC-4F53-BBBE-39D9E49FB12D");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 976, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAUSALPREVID.InitStatus = 2;
    PAN_CAUSALPREVID_Init();
    PAN_CAUSALPREVID_InitFields();
    PAN_CAUSALPREVID_InitQueries();
    BKW_CAUSPREVBOOK = new OBook(this);
    BUK_CAUSPREVBOOK = new CIDREObj(BKW_CAUSPREVBOOK);
    BKW_CAUSPREVBOOK.iGuid = "1D15879C-71E3-4A80-84D3-26109D7CBEB1";
    BKW_CAUSPREVBOOK.Code = "BUK_CAUSPREVBOOK";
    BKW_CAUSPREVBOOK.BookObj = BUK_CAUSPREVBOOK;
    BKW_CAUSPREVBOOK.InitDefMasks();
    BUK_CAUSPREVBOOK.InitBook(1, 1245185, "Causali Previdenziali Book", IMDB, MainFrm.VisualStyleList);
    BUK_CAUSPREVBOOK.InitHTML();
    BUK_CAUSPREVBOOK.SetHTMLValidate(w.BrowserClass, w.ParamsObj().HtmlConstraints);
    BUK_CAUSPREVBOOK.Book.SetMainFrm(MainFrm);
    BUK_CAUSPREVBOOK.SetRTCGuid(0, "1D15879C-71E3-4A80-84D3-26109D7CBEB1");
    BUK_CAUSPREVBOOK.SetObjCode(0, "CAUSPREVBOOK");
    if (PAN_CAUSALPREVID != null)
      PAN_CAUSALPREVID.SetBook(BUK_CAUSPREVBOOK);
    BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG_Init();
    BUK_CAUSPREVBOOK_RPT_NEWREPORT_Init();
    BUK_CAUSPREVBOOK_InitLinks();
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
      PAN_CAUSALPREVID.UpdatePanel(MainFrm);
      // BUK_CAUSPREVBOOK.UpdateBook();
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
    if (CallerIdx == MyGlb.FRM_SCELTAACCERT && flRis && IdxPanelActived == PAN_CAUSALPREVID.FrIndex)
    {
      if (IdxFieldActived ==PFL_CAUSALPREVID_APRIACCERTAM) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_CAUSALPREVID.FrIndex)
    {
      if (IdxFieldActived ==PFL_CAUSALPREVID_APRIIMPEGNCP) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_CAUSALPREVID.FrIndex)
    {
      if (IdxFieldActived ==PFL_CAUSALPREVID_APRIIMPEGNCE) {
      }
    }
  }
  

  // **********************************************
  // Enumerate books
  // **********************************************
  public CIDREObj SearchBook(String Code)
  {
    if (Code.equals("BUK_CAUSPREVBOOK")) return BUK_CAUSPREVBOOK;
    //
    return null;
  }

  // **************************************************
  // Torna TRUE se l'oggetto passato è una mia istanza
  // **************************************************
  public static boolean IsMyInstance(Object obj)
  {
    return (obj instanceof CausaliPrevidenziali);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CausaliPrevidenziali.class.getName() : (Glb.ClassWithPackage(CausaliPrevidenziali.class) ? CausaliPrevidenziali.class.getName().substring(CausaliPrevidenziali.class.getPackage().getName().length() + 1) : CausaliPrevidenziali.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // End Modal Event
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm: È un numero intero che identifica il form modale appena chiuso, utilizzare la funzione Me dell'oggetto form per effettuare il confronto. - Input
  // Result: True se l'utente ha confermato la scelta, chiudendo la videata modale tramite il bottone conferma nella barra del titolo, False altrimenti. E' possibile chiudere con conferma la videata anche tramite la procedura Close dell'oggetto form. - Input
  // Cancel: Se impostato a True viene annullata ogni elaborazione automatica successiva. In questo caso il framework non cercherà di trasportare automaticamente i dati dal form modale al form chiamante. - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // End Modal Event Body
      // Procedure Body
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAACCERT)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_NUMERO_ACC, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0, IMDB.Value(IMDBDef7.PQRY_ESEACC1, IMDBDef7.PQSL_ESEACC1_ANNO_ACC, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue() && IMPEGNO.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue() && IMPEGNO.equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "EndModalEvent", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAUSALPREVID_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAUSALPREVID);
      // 
      // Causali Previdenziali On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(PAN_CAUSALPREVID.IsNewRow()))
      {
        PAN_CAUSALPREVID.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CAUSALPREVID.SetFlags (Glb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CAUSALPREVID.set_ToolTip(Glb.OBJ_FIELD,PFL_CAUSALPREVID_DESCRIZIONE,IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_DESCRIZIONE, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CAUSALPREVID_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali On Command Event Body
      // Procedure Body
      // 
      if (Command.equals((new IDVariant(16)), true))
      {
        MainFrm.Cf4armDBObject.T83PD(IMDB.Value(IMDBDef9.PQRY_T85, IMDBDef9.PQSL_T85_CODICE, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          Cancel.set((new IDVariant(-1)));
          return;
        }
      }
      if (Command.equals((new IDVariant(128)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0))))
        {
          if (MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0)).equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0))))
        {
          if (MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0)).equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0))))
        {
          if (MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0)).equals((new IDVariant(-1)), true))
          {
            Cancel.set((new IDVariant(-1)));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali On Database Error Event
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
  private void PAN_CAUSALPREVID_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_CAUSALPREVID, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Causali Previdenziali On Database Error Event Body
      // Procedure Body
      // 
      MainFrm.set_AlertMessage(ErrorMessage); 
      Skip.set((new IDVariant(-1)));
      Cancel.set((new IDVariant(-1)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiOnDatabaseErrorEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CAUSALPREVID_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_CAUSALPREVID, Cancel);
      // 
      // Causali Previdenziali On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0))))
      {
      }
      else
      {
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0))))
      {
      }
      else
      {
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0))))
      {
      }
      else
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_CAUSALPREVID_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali On Updating Row Event Body
      // Procedure Body
      // 
      if (Inserting.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_UTENTE_INSERIMENTO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_DATA_INSERIMENTO, 0, IDL.Today());
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_UTENTE_ULTIMO_AGG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_DATA_ULTIMO_AGG, 0, (new IDVariant()));
      }
      else
      {
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali Accertamento  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALPREVID_ACCERTAMENT1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali Accertamento  Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiAccertamentoValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali ANNO ACC Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALPREVID_ANNOACC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali ANNO ACC Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.AccPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiANNOACCValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali Impeg. Percip.  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALPREVID_IMPEGPERCIP1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali Impeg. Percip.  Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiImpeg.Percip.ValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali Anno Impeg. Percip.  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALPREVID_ANNOIMPEPERC_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali Anno Impeg. Percip.  Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiAnnoImpeg.Percip.ValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali Impeg. Ente  Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALPREVID_IMPEGENTE1_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali Impeg. Ente  Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiImpeg.EnteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Causali Previdenziali ANNO IMP CE Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_CAUSALPREVID_ANNOIMPCE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Causali Previdenziali ANNO IMP CE Validate Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0))))
      {
        IDVariant v_FLAG = new IDVariant(0,IDVariant.INTEGER);
        v_FLAG = MainFrm.ImpPresente(IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0), IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0));
        if (v_FLAG.equals((new IDVariant(-1)), true))
        {
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "CausaliPrevidenzialiANNOIMPCEValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Info Accertamento
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_ACC, 0));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "InfoAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Accertamento
  // **********************************************************************
  public int ApriSceltaAccertamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Accertamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI96, IMDBDef1.FLD_PARAMETRI96_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAACCERT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "ApriSceltaAccertamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno CP
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegnoCP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno CP Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CP, 0));
      if (IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CP, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "InfoImpegnoCP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Impegno CP
  // **********************************************************************
  public int ApriSceltaImpegnoCP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Impegno CP Body
      // Procedure Body
      // 
      IMPEGNO = (new IDVariant(1));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "ApriSceltaImpegnoCP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno CE
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegnoCE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno CE Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_NUMERO_IMP_CE, 0));
      if (IMDB.Value(IMDBDef9.PQRY_T84, IMDBDef9.PQSL_T84_ANNO_IMP_CE, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "InfoImpegnoCE", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scelta Impegno CE
  // **********************************************************************
  public int ApriSceltaImpegnoCE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Impegno CE Body
      // Procedure Body
      // 
      IMPEGNO = (new IDVariant(2));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CausaliPrevidenziali", "ApriSceltaImpegnoCE", _e);
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
  private void PAN_CAUSALPREVID_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CAUSALPREVID_APRIACCERTAM)
    {
      this.IdxPanelActived = this.PAN_CAUSALPREVID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CAUSALPREVID_INFOACCERTAM)
    {
      this.IdxPanelActived = this.PAN_CAUSALPREVID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAccertamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CAUSALPREVID_APRIIMPEGNCP)
    {
      this.IdxPanelActived = this.PAN_CAUSALPREVID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaImpegnoCP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CAUSALPREVID_INFOIMPEGNCP)
    {
      this.IdxPanelActived = this.PAN_CAUSALPREVID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoCP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CAUSALPREVID_APRIIMPEGNCE)
    {
      this.IdxPanelActived = this.PAN_CAUSALPREVID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaImpegnoCE();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_CAUSALPREVID_INFOIMPEGNCE)
    {
      this.IdxPanelActived = this.PAN_CAUSALPREVID.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegnoCE();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CAUSALPREVID_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CAUSALPREVID_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALPREVID_ACCERTAMENT1)
      {
        PFL_CAUSALPREVID_ACCERTAMENT1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALPREVID_ANNOACC)
      {
        PFL_CAUSALPREVID_ANNOACC_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALPREVID_IMPEGPERCIP1)
      {
        PFL_CAUSALPREVID_IMPEGPERCIP1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALPREVID_ANNOIMPEPERC)
      {
        PFL_CAUSALPREVID_ANNOIMPEPERC_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALPREVID_IMPEGENTE1)
      {
        PFL_CAUSALPREVID_IMPEGENTE1_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_CAUSALPREVID_ANNOIMPCE)
      {
        PFL_CAUSALPREVID_ANNOIMPCE_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_CAUSALPREVID_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAUSALPREVID_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  private void BUK_CAUSPREVBOOK_OnConnecting(IDConnection DBConn)
  {
    MainFrm.OpenConnection(DBConn);
  }

  private void BUK_CAUSPREVBOOK_OnFormattingSection(int SectionID)
  {
    if (SectionID==BUK_CAUSPREVBOOK_SEC_PAGEHEADER)
    {
    }
    if (SectionID==BUK_CAUSPREVBOOK_SEC_TITOLO)
    {
    }
    if (SectionID==BUK_CAUSPREVBOOK_SEC_DETAIL)
    {
      BUK_CAUSPREVBOOK.set_SpanValue(BUK_CAUSPREVBOOK_SPAN_TSTACPCPBINI, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "NUMERO_ACC")), ((!(IDL.IsNull(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "NUMERO_ACC"))))?(new IDVariant(" / ")):(new IDVariant("")))), IDL.ToString(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "ANNO_ACC")))));
      BUK_CAUSPREVBOOK.set_SpanValue(BUK_CAUSPREVBOOK_SPAN_TSTIPCPCPBIN, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "NUMERO_IMP_CP")), ((!(IDL.IsNull(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "NUMERO_IMP_CP"))))?(new IDVariant(" / ")):(new IDVariant("")))), IDL.ToString(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "ANNO_IMP_CP")))));
      BUK_CAUSPREVBOOK.set_SpanValue(BUK_CAUSPREVBOOK_SPAN_TSTIECPCPBIN, new IDVariant(IDL.Add(IDL.Add(IDL.ToString(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "NUMERO_IMP_CE")), ((!(IDL.IsNull(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "NUMERO_IMP_CE"))))?(new IDVariant(" / ")):(new IDVariant("")))), IDL.ToString(BUK_CAUSPREVBOOK.GetReportColumn(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "ANNO_IMP_CE")))));
    }
    if (SectionID==BUK_CAUSPREVBOOK_SEC_PAGEFOOTER)
    {
    }
    if (SectionID==BUK_CAUSPREVBOOK_SEC_REPORTFOOTER)
    {
    }
  }

  private void BUK_CAUSPREVBOOK_OnAfterFormattingSection(int SectionID)
  {
  }

  private void BUK_CAUSPREVBOOK_OnFormattingPage(int PageID)
  {
    if (PageID==BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG)
    {
      BUK_CAUSPREVBOOK.set_SpanValue(BUK_CAUSPREVBOOK_SPAN_NUMEROPAGINA, new IDVariant(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Pag.")), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSPREVBOOK.GetPageNumber())))), (new IDVariant(" "))), (new IDVariant("di"))), (new IDVariant(" "))), IDL.ToString((new IDVariant(BUK_CAUSPREVBOOK.GetTotalPagesNumber()))))));
    }
  }

  private void BUK_CAUSPREVBOOK_Activated(int ObjID, String BoxName)
  {
  }

  private void BUK_CAUSPREVBOOK_OnChangingSpan(int SpanID, IDVariant OldValue, IDVariant NewValue, IDVariant Cancel)
  {
  }

  private void BUK_CAUSPREVBOOK_OnIMDBUpdate(int RepID)
  {
  try
  {
  } catch (Exception e) { e.printStackTrace(System.out); }
  }

  private void BUK_CAUSPREVBOOK_OnPreview()
  {
    PreviewBook = BKW_CAUSPREVBOOK;
    SetRD();
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAUSALPREVID_Init()
  {

    PAN_CAUSALPREVID.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAUSALPREVID.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAUSALPREVID.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, "78303599-0337-4743-8FB5-B4081EA19BC2");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, "Codice");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, "4B46125B-1E3A-428F-9A3D-7897FB859D50");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, "Descrizione");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, "7A09CE18-E196-42F8-B9DD-751D8BF2A60F");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, "Perc. Imp.");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.VIS_PERIMNOFICF4);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, "6A84AA01-20A6-4CE2-86F4-5E805A9ECE13");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, "Aliq. Totale");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.VIS_PERALINOFICF);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, "13885D4E-0D4E-4DAE-8D63-C72B1B14265E");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, "Aliq. Percip.");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.VIS_PERALINOFICF);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, "474AFDED-3145-4DFD-B900-0CB90F8A9465");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, "Aliq. Ente");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.VIS_PERALINOFICF);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, "188AB5FA-ABA2-40C4-992F-6EF887121F17");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, "Accertamento ");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, "Accertamento");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, "0A4ADF7F-7C0D-46C3-841D-18349FABC709");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, "ANNO ACC");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, "F44E17DB-A355-49F7-A9C9-791143637816");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, "Apri Accertamenti");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, "29DD4396-A7CA-4FD9-A7D3-6562AD89A374");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, "Info Accertamenti");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, "64C7F20D-5C5C-4D1A-834D-DC4A700C9EB3");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, "Impeg. Percip. ");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, "Impeg. Percip. ");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, "24E60090-0B58-40EC-BD56-ABF20FCC403B");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, "Anno Impeg. Percip. ");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, "Anno Impeg. Percip. ");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, "94A5EED5-CCF2-40C5-991F-08253A3CD221");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, "Apri Impegni CP");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, "F376B7E5-7063-4E1F-91B9-562FBF5B4E02");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, "Info Impegni CP");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, "663B8D85-84A1-4DAE-BD0A-5CABD5EC7E23");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, "Impeg. Ente ");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, "Impeg. Ente");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, "D1961A47-26CD-437E-8612-4F89BB91C4C3");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, "ANNO IMP CE");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, "FAF05929-4BF0-4DF2-AAD5-80AD540CE9EC");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, "Apri Impegni CE");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, "E66D3DDD-870A-4A3E-A99C-DCB17916CB3F");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, "Info Impegni CE");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, "44E53F68-E203-48D6-860D-EC33AC2CB6C6");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, "Tipo");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, "3F63183B-B044-4A81-97FE-0D96C8DCA5C9");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, "Accertamento");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, MyGlb.VIS_LABEVISUSTYL);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, "D3C3DDF4-1498-408C-9294-0647CC439678");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, "Impeg. Percip.  ");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, MyGlb.VIS_LABEVISUSTYL);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, "56EAACD7-B677-444C-9A57-9CF82206FCBA");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, "Impeg. Ente");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, MyGlb.VIS_LABEVISUSTYL);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, "170C9468-3336-4FB4-9B40-9B5FA03D0E14");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, "/");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, MyGlb.VIS_VUOTONORMALE);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, "AF30C4BB-3090-4628-83E6-0187B50878F3");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, "/");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, MyGlb.VIS_VUOTONORMALE);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, "8732E562-677C-4A18-A286-06AB7E7842C3");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, "/");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, MyGlb.VIS_VUOTONORMALE);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, "49CD2877-EA38-41D8-8E1B-BE5183C87F9E");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, "54D6D2BB-32AD-4761-90CC-012EE367E2AD");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, "DATA INSERIMENTO");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, "8D85EC84-704C-4716-A678-F292A1C473DB");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CAUSALPREVID.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, "BD8DAC56-2B76-469F-B529-9E98E87D204D");
    PAN_CAUSALPREVID.set_Header(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_CAUSALPREVID.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, "");
    PAN_CAUSALPREVID.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_CAUSALPREVID.SetFlags(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CAUSALPREVID_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_LIST, 64);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_FORM, 24, 12, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_FORM, 48);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_CODICE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_CODICE, PPQRY_T84, "A.CODICE", "CODICE", 1, 2, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_LIST, 56, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_LIST, 132);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_FORM, 124, 12, 344, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_FORM, 64);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DESCRIZIONE, MyGlb.PANEL_FORM, "Descr.");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_DESCRIZIONE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_DESCRIZIONE, PPQRY_T84, "A.DESCRIZIONE", "DESCRIZIONE", 5, 50, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_LIST, 288, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_LIST, 116);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_LIST, "Perc. Imp.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_FORM, 108, 44, 60, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_FORM, 20);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_PERCIMP, MyGlb.PANEL_FORM, "Perc Imp");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_PERCIMP, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_PERCIMP, PPQRY_T84, "A.PERC_IMPONIBILE", "PERC_IMPONIBILE", 3, 6, 3, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_LIST, 348, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_LIST, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_LIST, "Aliq. Totale");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_FORM, 172, 44, 60, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_FORM, 20);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQTOTALE, MyGlb.PANEL_FORM, "Alq. Tot.");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ALIQTOTALE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ALIQTOTALE, PPQRY_T84, "A.ALIQUOTA_INPS", "ALIQUOTA_INPS", 3, 5, 3, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_LIST, 412, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_LIST, 124);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_LIST, "Aliq. Percip.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_FORM, 236, 44, 68, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_FORM, 20);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQPERCIP, MyGlb.PANEL_FORM, "Aliq Percip");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ALIQPERCIP, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ALIQPERCIP, PPQRY_T84, "A.ALIQUOTA_INPS_CP", "ALIQUOTA_INPS_CP", 3, 5, 3, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_LIST, 480, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_LIST, 112);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_LIST, "Aliq. Ente");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_FORM, 308, 44, 56, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_FORM, 20);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ALIQENTE, MyGlb.PANEL_FORM, "Aliq Ente");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ALIQENTE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ALIQENTE, PPQRY_T84, "A.ALIQUOTA_INPS_CE", "ALIQUOTA_INPS_CE", 3, 5, 3, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_LIST, 536, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_LIST, 84);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_LIST, "Accert.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_FORM, 140, 104, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_FORM, 80);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENT1, MyGlb.PANEL_FORM, "Accert.");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ACCERTAMENT1, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ACCERTAMENT1, PPQRY_T84, "A.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_FORM, 288, 104, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ANNOACC, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ANNOACC, PPQRY_T84, "A.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_LIST, 624, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_LIST, 96);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_LIST, "A. Ac.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_FORM, 4, 320, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_FORM, 96);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIACCERTAM, MyGlb.PANEL_FORM, "Apri Accertamenti");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_APRIACCERTAM, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_APRIACCERTAM, PPQRY_APRI, "DECODE(~~CODICE~~, to_number(NULL), NULL, 'A')", "APRIACCERTAM", 5, 99, 0, -13997);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_LIST, 648, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_LIST, 96);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_LIST, "I. Ac.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_FORM, 4, 176, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_FORM, 96);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOACCERTAM, MyGlb.PANEL_FORM, "Info Accertamenti");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_INFOACCERTAM, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_INFOACCERTAM, PPQRY_INFO, "DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, 'I'))", "INFOACCERTAM", 5, 99, 0, -13997);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOACCERTAM, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_LIST, 672, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_LIST, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_LIST, "Impeg. Percip. ");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_FORM, 132, 128, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_FORM, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP1, MyGlb.PANEL_FORM, "Impeg. Percip. ");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_IMPEGPERCIP1, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_IMPEGPERCIP1, PPQRY_T84, "A.NUMERO_IMP_CP", "NUMERO_IMP_CP", 1, 5, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_LIST, 720, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_LIST, "A. Im. Prc.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_FORM, 288, 128, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_FORM, 80);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPEPERC, MyGlb.PANEL_FORM, "An. Imp. Prc.");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ANNOIMPEPERC, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ANNOIMPEPERC, PPQRY_T84, "A.ANNO_IMP_CP", "ANNO_IMP_CP", 1, 4, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_LIST, 760, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_LIST, 84);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_LIST, "A. I. C.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_FORM, 4, 368, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_FORM, 84);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCP, MyGlb.PANEL_FORM, "Apri Impegni CP");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_APRIIMPEGNCP, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_APRIIMPEGNCP, PPQRY_APRI, "DECODE(~~CODICE~~, to_number(NULL), NULL, 'A')", "APRIIMPEGNCP", 5, 99, 0, -13997);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_LIST, 784, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_LIST, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_LIST, "I. I. C.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_FORM, 4, 224, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_FORM, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCP, MyGlb.PANEL_FORM, "Info Impegni CP");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_INFOIMPEGNCP, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_INFOIMPEGNCP, PPQRY_INFO, "DECODE(~~ANNO_IMP_CP~~, to_number(NULL), NULL, DECODE(~~NUMERO_IMP_CP~~, to_number(NULL), NULL, 'I'))", "INFOIMPEGNCP", 5, 99, 0, -13997);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_LIST, 808, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_LIST, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_LIST, "Impeg. Ente ");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_FORM, 136, 152, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_FORM, 84);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE1, MyGlb.PANEL_FORM, "Impeg. Ente ");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_IMPEGENTE1, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_IMPEGENTE1, PPQRY_T84, "A.NUMERO_IMP_CE", "NUMERO_IMP_CE", 1, 5, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_LIST, 856, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_LIST, 76);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_LIST, "ANN. IM. CE");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_FORM, 288, 152, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ANNOIMPCE, MyGlb.PANEL_FORM, "ANNO IMP CE");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ANNOIMPCE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ANNOIMPCE, PPQRY_T84, "A.ANNO_IMP_CE", "ANNO_IMP_CE", 1, 4, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_LIST, 896, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_LIST, 84);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_LIST, "A. I. C.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_FORM, 4, 416, 516, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_FORM, 84);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_APRIIMPEGNCE, MyGlb.PANEL_FORM, "Apri Impegni CE");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_APRIIMPEGNCE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_APRIIMPEGNCE, PPQRY_APRI, "DECODE(~~CODICE~~, to_number(NULL), NULL, 'A')", "APRIIMPEGNCE", 5, 99, 0, -13997);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_APRIIMPEGNCE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_LIST, 920, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_LIST, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_LIST, "I. I. C.");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_FORM, 4, 272, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_FORM, 88);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_FORM, 2);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_INFOIMPEGNCE, MyGlb.PANEL_FORM, "Info Impegni CE");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_INFOIMPEGNCE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_INFOIMPEGNCE, PPQRY_INFO, "DECODE(~~ANNO_IMP_CE~~, to_number(NULL), NULL, DECODE(~~NUMERO_IMP_CE~~, to_number(NULL), NULL, 'I'))", "INFOIMPEGNCE", 5, 99, 0, -13997);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAUSALPREVID.SetValueListItem(PFL_CAUSALPREVID_INFOIMPEGNCE, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_LIST, 944, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_FORM, 368, 44, 44, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_FORM, 20);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_TIPO, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_TIPO, PPQRY_T84, "A.TIPO", "TIPO", 5, 1, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, MyGlb.PANEL_LIST, 536, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, MyGlb.PANEL_LIST, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, MyGlb.PANEL_LIST, 2);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, MyGlb.PANEL_FORM, 536, 0, 88, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, MyGlb.PANEL_FORM, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_ACCERTAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_ACCERTAMENTO, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_ACCERTAMENTO, -1, "", "ACCERTAMENTO", 0, 0, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, MyGlb.PANEL_LIST, 672, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, MyGlb.PANEL_LIST, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, MyGlb.PANEL_LIST, 2);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, MyGlb.PANEL_FORM, 544, 8, 88, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, MyGlb.PANEL_FORM, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGPERCIP, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_IMPEGPERCIP, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_IMPEGPERCIP, -1, "", "IMPEGPERCIP", 0, 0, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, MyGlb.PANEL_LIST, 810, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, MyGlb.PANEL_LIST, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, MyGlb.PANEL_LIST, 2);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, MyGlb.PANEL_FORM, 552, 16, 88, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, MyGlb.PANEL_FORM, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_IMPEGENTE, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_IMPEGENTE, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_IMPEGENTE, -1, "", "IMPEGENTE", 0, 0, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, MyGlb.PANEL_LIST, 152, 132, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, MyGlb.PANEL_LIST, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, MyGlb.PANEL_FORM, 272, 104, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, MyGlb.PANEL_FORM, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_SLASH, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_SLASH, -1, "", "SLASH", 0, 0, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, MyGlb.PANEL_LIST, 160, 140, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, MyGlb.PANEL_LIST, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, MyGlb.PANEL_FORM, 272, 128, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, MyGlb.PANEL_FORM, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH1, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_SLASH1, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_SLASH1, -1, "", "SLASH1", 0, 0, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, MyGlb.PANEL_LIST, 168, 148, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, MyGlb.PANEL_LIST, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, MyGlb.PANEL_FORM, 272, 152, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, MyGlb.PANEL_FORM, 0);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_SLASH2, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_SLASH2, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_SLASH2, -1, "", "SLASH2", 0, 0, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_LIST, 972, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 176, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_UTENTEINSERI, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_UTENTEINSERI, PPQRY_T84, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_LIST, 1092, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_FORM, 4, 200, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_DATAINSERIME, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_DATAINSERIME, PPQRY_T84, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 19, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_LIST, 1200, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 224, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_UTENTULTIAGG, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_UTENTULTIAGG, PPQRY_T84, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_LIST, 1312, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_CAUSALPREVID.SetRect(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 248, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAUSALPREVID.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_CAUSALPREVID.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_CAUSALPREVID.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAUSALPREVID_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_CAUSALPREVID.SetFieldPage(PFL_CAUSALPREVID_DATAULTIMAGG, -1, -1);
    PAN_CAUSALPREVID.SetFieldPanel(PFL_CAUSALPREVID_DATAULTIMAGG, PPQRY_T84, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 19, 0, -13997);
  }

  private void PAN_CAUSALPREVID_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAUSALPREVID.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~ANNO_ACC~~, to_number(NULL), NULL, DECODE(~~NUMERO_ACC~~, to_number(NULL), NULL, 'I')) as INFOACCERTAM, ");
    SQL.append("  DECODE(~~ANNO_IMP_CP~~, to_number(NULL), NULL, DECODE(~~NUMERO_IMP_CP~~, to_number(NULL), NULL, 'I')) as INFOIMPEGNCP, ");
    SQL.append("  DECODE(~~ANNO_IMP_CE~~, to_number(NULL), NULL, DECODE(~~NUMERO_IMP_CE~~, to_number(NULL), NULL, 'I')) as INFOIMPEGNCE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CAUSALPREVID.SetQuery(PPQRY_INFO, 0, SQL, -1, "");
    PAN_CAUSALPREVID.SetQueryDB(PPQRY_INFO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALPREVID.SetMasterTable(PPQRY_INFO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~CODICE~~, to_number(NULL), NULL, 'A') as APRIACCERTAM, ");
    SQL.append("  DECODE(~~CODICE~~, to_number(NULL), NULL, 'A') as APRIIMPEGNCP, ");
    SQL.append("  DECODE(~~CODICE~~, to_number(NULL), NULL, 'A') as APRIIMPEGNCE ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_CAUSALPREVID.SetQuery(PPQRY_APRI, 0, SQL, -1, "");
    PAN_CAUSALPREVID.SetQueryDB(PPQRY_APRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALPREVID.SetMasterTable(PPQRY_APRI, "DUAL");
    PAN_CAUSALPREVID.SetIMDB(IMDB, "PQRY_T84", true);
    PAN_CAUSALPREVID.set_SetString(MyGlb.MASTER_ROWNAME, "T83");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as CODICE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.PERC_IMPONIBILE as PERC_IMPONIBILE, ");
    SQL.append("  A.ALIQUOTA_INPS as ALIQUOTA_INPS, ");
    SQL.append("  A.ALIQUOTA_INPS_CP as ALIQUOTA_INPS_CP, ");
    SQL.append("  A.ALIQUOTA_INPS_CE as ALIQUOTA_INPS_CE, ");
    SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  A.ANNO_IMP_CP as ANNO_IMP_CP, ");
    SQL.append("  A.NUMERO_IMP_CP as NUMERO_IMP_CP, ");
    SQL.append("  A.ANNO_IMP_CE as ANNO_IMP_CE, ");
    SQL.append("  A.NUMERO_IMP_CE as NUMERO_IMP_CE, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG ");
    PAN_CAUSALPREVID.SetQuery(PPQRY_T84, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  T83 A ");
    PAN_CAUSALPREVID.SetQuery(PPQRY_T84, 1, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALPREVID.SetQuery(PPQRY_T84, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALPREVID.SetQuery(PPQRY_T84, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAUSALPREVID.SetQuery(PPQRY_T84, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_CAUSALPREVID.SetQuery(PPQRY_T84, 5, SQL, -1, "");
    PAN_CAUSALPREVID.SetQueryDB(PPQRY_T84, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAUSALPREVID.SetMasterTable(0, "T83");
    PAN_CAUSALPREVID.AddToSortList(PFL_CAUSALPREVID_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAUSALPREVID.Status() == 2)
    {
      int oldListQBE = PAN_CAUSALPREVID.iUseListQBE;
      PAN_CAUSALPREVID.iUseListQBE = 0;
      PAN_CAUSALPREVID.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAUSALPREVID.PanelCommand(Glb.PCM_FIND);
      PAN_CAUSALPREVID.iUseListQBE = oldListQBE;
    }
  }

  private void BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG_Init()
  {
    BUK_CAUSPREVBOOK.InitMastro(BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG, 3, 21000, 29700, 1, 2, 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG, "504746B4-75B0-40DD-A5DC-90F024552971");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG, "CAUPREBOOPAG");
    BUK_CAUSPREVBOOK.InitMastroBox(BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG, BUK_CAUSPREVBOOK_RPTBOX_NUMEROPAGINA, 27000, 400, 1600, 300, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_NUMEROPAGINA, "E07D71F9-CEFE-4EE4-A636-82E87BF1A359");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_NUMEROPAGINA, BUK_CAUSPREVBOOK_SPAN_NUMEROPAGINA, MyGlb.VIS_DEFAREPOSTYL, 5, 207, 0, 271319169, "", "", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_NUMEROPAGINA, "B8D438E7-470F-4ACD-B3F0-0707E17D2B25");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_NUMEROPAGINA, "NUMEROPAGINA");
    BUK_CAUSPREVBOOK.InitMastroBox(BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG, BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY, 1000, 2700, 27600, 16700, 0, 3, 3, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY, "1BE0DC19-76BB-4160-ABDE-6DBD873EC79E");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY, "PAGEBODY");
    BUK_CAUSPREVBOOK.InitMastroBox(BUK_CAUSPREVBOOK_MST_CAUPREBOOPAG, BUK_CAUSPREVBOOK_RPTBOX_TITOLO, 1000, 900, 27600, 1800, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 0, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_TITOLO, "7694B69E-A887-4DBA-B92B-F9BBD64BE4AC");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_TITOLO, "TITOLO");
  }

  private void BUK_CAUSPREVBOOK_RPT_NEWREPORT_InitQuery() { BUK_CAUSPREVBOOK_RPT_NEWREPORT_InitQuery(true, true); }
  private void BUK_CAUSPREVBOOK_RPT_NEWREPORT_InitQuery(boolean flReport, boolean flGraphs)
  {
    StringBuffer SQL = new StringBuffer();
    if (flReport)
    {
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.CODICE as CODICE, ");
      SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
      SQL.append("  A.PERC_IMPONIBILE as PERC_IMPONIBILE, ");
      SQL.append("  A.ALIQUOTA_INPS as ALIQUOTA_INPS, ");
      SQL.append("  A.ALIQUOTA_INPS_CP as ALIQUOTA_INPS_CP, ");
      SQL.append("  A.ALIQUOTA_INPS_CE as ALIQUOTA_INPS_CE, ");
      SQL.append("  A.ANNO_ACC as ANNO_ACC, ");
      SQL.append("  A.NUMERO_ACC as NUMERO_ACC, ");
      SQL.append("  A.ANNO_IMP_CP as ANNO_IMP_CP, ");
      SQL.append("  A.NUMERO_IMP_CP as NUMERO_IMP_CP, ");
      SQL.append("  A.ANNO_IMP_CE as ANNO_IMP_CE, ");
      SQL.append("  A.NUMERO_IMP_CE as NUMERO_IMP_CE, ");
      SQL.append("  A.TIPO as TIPO, ");
      SQL.append("  DECODE(A.ANNO_ACC, to_number(NULL), NULL, DECODE(A.NUMERO_ACC, to_number(NULL), NULL, 'E')) as T83INFOACCER, ");
      SQL.append("  'E' as T83SCELTACCE, ");
      SQL.append("  DECODE(A.ANNO_IMP_CP, to_number(NULL), NULL, DECODE(A.NUMERO_IMP_CP, to_number(NULL), NULL, 'E')) as T83INFOIMPCP, ");
      SQL.append("  'E' as T83SCELIMPCP, ");
      SQL.append("  DECODE(A.ANNO_IMP_CE, to_number(NULL), NULL, DECODE(A.NUMERO_IMP_CE, to_number(NULL), NULL, 'E')) as T83INFOIMPCE, ");
      SQL.append("  'E' as T83SCELIMPCE ");
      SQL.append("from ");
      SQL.append("  T83 A ");
      SQL.append("order by ");
      SQL.append("  A.CODICE ");
      BUK_CAUSPREVBOOK.SetReportQuery(BUK_CAUSPREVBOOK_RPT_NEWREPORT, MainFrm.Cf4armDBObject.DB, -1, SQL.toString(), "B36AA888-5CDD-41EB-BDCB-3450E1B5C85F");
    }
    if (flGraphs)
    {
    }
  }

  private void BUK_CAUSPREVBOOK_RPT_NEWREPORT_Init()
  {
    BUK_CAUSPREVBOOK.InitReport(BUK_CAUSPREVBOOK_RPT_NEWREPORT, 196609);
    BUK_CAUSPREVBOOK_RPT_NEWREPORT_InitQuery(true, false);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "9FECDBF5-263C-48DD-AC6D-171F3B2CE5F9");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPT_NEWREPORT, "NEWREPORT");
    BUK_CAUSPREVBOOK.InitSection(BUK_CAUSPREVBOOK_RPT_NEWREPORT, BUK_CAUSPREVBOOK_SEC_PAGEHEADER, 700, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSPREVBOOK.SetSectionRendersInto(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, "CFA72D4F-E022-495C-9131-14B4FCD61189");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, "PAGEHEADER");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_CODICEHEADER, 300, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_CODICEHEADER, "A256576D-3A1A-4D2D-BEF5-D87FFA7B2231");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_CODICEHEADER, "CODICEHEADER");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_CODICEHEADER, BUK_CAUSPREVBOOK_SPAN_CODICE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384705, "", "Codice", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_CODICE, "81C71552-CABD-4F5F-8851-8A9EF0522CAE");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_CODICE, "CODICE");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_NEWBOX1, 1600, 0, 3300, 600, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_NEWBOX1, "333F3E28-F9CF-408B-A50D-0434230D6A8B");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_NEWBOX1, "NEWBOX1");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_NEWBOX1, BUK_CAUSPREVBOOK_SPAN_DESCRIZIONE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Descrizione", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_DESCRIZIONE, "0AD9C5EA-448B-42F1-92EC-E0C8ECB03D26");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_PERCIMPOHEAD, 10900, 0, 2500, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_PERCIMPOHEAD, "D0C3B17D-D6AA-4DBB-B428-EB188AC1754A");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_PERCIMPOHEAD, "PERCIMPOHEAD");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_PERCIMPOHEAD, BUK_CAUSPREVBOOK_SPAN_PERCIMP, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Perc. Imponibile", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_PERCIMP, "52737E31-A116-4E14-9338-CD7507333D7A");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_PERCIMP, "PERCIMP");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_ALIQINPSHEAD, 13700, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPSHEAD, "2225D947-BEBE-45BF-A87D-ED311D010D53");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPSHEAD, "ALIQINPSHEAD");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPSHEAD, BUK_CAUSPREVBOOK_SPAN_ALIQTOTALE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Aliquota", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_ALIQTOTALE, "F9D1C659-879A-4E85-8499-25D78577B056");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_ALIQTOTALE, "ALIQTOTALE");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCPHEA, 15500, 0, 1800, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCPHEA, "48865A49-C165-4D52-8ABD-37D713260C57");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCPHEA, "ALIQINPCPHEA");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCPHEA, BUK_CAUSPREVBOOK_SPAN_ALIQPERCIP, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "c/Percip.", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_ALIQPERCIP, "0991B11C-5F81-489B-BA67-197137CDCAA7");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_ALIQPERCIP, "ALIQPERCIP");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCEHEA, 17400, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCEHEA, "6586BA16-CA7B-4049-AA78-65506B0F1D8A");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCEHEA, "ALIQINPCEHEA");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ALIQINPCEHEA, BUK_CAUSPREVBOOK_SPAN_ALIQENTE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "c/Ente", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_ALIQENTE, "97A4617B-5BBC-4A6A-A088-8DBE9E0F47B5");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_ALIQENTE, "ALIQENTE");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_ACCERTHEADER, 18600, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ACCERTHEADER, "9253224F-E16A-419A-BD7D-4971C084696A");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ACCERTHEADER, "ACCERTHEADER");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ACCERTHEADER, BUK_CAUSPREVBOOK_SPAN_ACCERTAMENTO, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Accertamento", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_ACCERTAMENTO, "911FC3A0-02F9-4BCB-9C9C-73D071432384");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_IMPEPERCHEAD, 21500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_IMPEPERCHEAD, "01CBCE2F-4811-44A3-BA03-1612B55A815D");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_IMPEPERCHEAD, "IMPEPERCHEAD");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_IMPEPERCHEAD, BUK_CAUSPREVBOOK_SPAN_IMPEGNPERCIP, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Impegno Percip.", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_IMPEGNPERCIP, "E8C24AE9-9E87-4081-9DDF-9E1961CCB7E8");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_IMPEGNPERCIP, "IMPEGNPERCIP");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_PAGEHEADER, BUK_CAUSPREVBOOK_RPTBOX_IMPEENTEHEAD, 24500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_NORMALGRASSE, 983041, 340, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_IMPEENTEHEAD, "8F8FE190-521D-4F50-B7C7-DC329D3D82D1");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_IMPEENTEHEAD, "IMPEENTEHEAD");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_IMPEENTEHEAD, BUK_CAUSPREVBOOK_SPAN_IMPEGNOENTE, MyGlb.VIS_NORMALGRASSE, 0, 0, 0, 271384961, "", "Impegno Ente", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_IMPEGNOENTE, "A02C5960-B069-4DF8-ADE7-B78109D16771");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_IMPEGNOENTE, "IMPEGNOENTE");
    BUK_CAUSPREVBOOK.InitSection(BUK_CAUSPREVBOOK_RPT_NEWREPORT, BUK_CAUSPREVBOOK_SEC_TITOLO, 1500, 1, 0, 2, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSPREVBOOK.SetSectionRendersInto(BUK_CAUSPREVBOOK_SEC_TITOLO, BUK_CAUSPREVBOOK_RPTBOX_TITOLO);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SEC_TITOLO, "B17BC275-FDBC-4CCE-8C08-4CAFDA15D65E");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SEC_TITOLO, "TITOLO");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_TITOLO, BUK_CAUSPREVBOOK_RPTBOX_NEWBOX, 300, 200, 27000, 1000, 0, 1, 1, MyGlb.VIS_TITOLOREPORT, 983041, 554, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_NEWBOX, "A09914C9-F88F-4814-A45F-D305B7D72DEB");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_NEWBOX, "NEWBOX");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_NEWBOX, BUK_CAUSPREVBOOK_SPAN_VARIADIBILAN, MyGlb.VIS_TITOLOREPORT, 0, 0, 0, 271384961, "", "Causali I.N.P.S.", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_VARIADIBILAN, "6EA7719B-372E-4613-86F5-B1C457F3CDFF");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_VARIADIBILAN, "VARIADIBILAN");
    BUK_CAUSPREVBOOK.InitSection(BUK_CAUSPREVBOOK_RPT_NEWREPORT, BUK_CAUSPREVBOOK_SEC_DETAIL, 600, 1, 0, 4, MyGlb.VIS_DEFAREPOSTYL, 8978433, "");
    BUK_CAUSPREVBOOK.SetSectionRendersInto(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SEC_DETAIL, "F3DDB837-895B-4A0F-9421-9869E24DC6F2");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SEC_DETAIL, "DETAIL");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_CODICE, 100, 0, 1100, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_CODICE, "931B10B9-1586-45C6-BB7D-6828A4C6A423");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_CODICE, "CODICE");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_CODICE, BUK_CAUSPREVBOOK_SPAN_T8COCAPRCAPB, MyGlb.VIS_DEFAREPOSTYL, 1, 2, 0, 271384705, "Brief description of field content.", "::CODICE", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_T8COCAPRCAPB, "391FED7C-F076-4F20-8338-90DCAF11ECD7");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_T8COCAPRCAPB, "T8COCAPRCAPB");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_DESCRIZIONE, 1600, 0, 9000, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_DESCRIZIONE, "62ECFDD7-CF54-4C93-A38D-7D5283221E28");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_DESCRIZIONE, "DESCRIZIONE");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_DESCRIZIONE, BUK_CAUSPREVBOOK_SPAN_T8DECAPRCAPB, MyGlb.VIS_DEFAREPOSTYL, 5, 50, 0, 271384705, "Brief description of field content.", "::DESCRIZIONE", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_T8DECAPRCAPB, "968496A1-C144-450F-9FC9-BCD562DC7A59");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_T8DECAPRCAPB, "T8DECAPRCAPB");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_PERCIMPONIBI, 10900, 0, 1600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_PERCIMPONIBI, "D47C9866-EE19-4E15-8FFF-75FF35849AB0");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_PERCIMPONIBI, "PERCIMPONIBI");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_PERCIMPONIBI, BUK_CAUSPREVBOOK_SPAN_T8PEIMCAPCPB, MyGlb.VIS_DEFAREPOSTYL, 3, 6, 6, 271384705, "Brief description of field content.", "::PERC_IMPONIBILE", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_T8PEIMCAPCPB, "60D49DD6-B3CA-4361-AE3A-CC845357761A");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_T8PEIMCAPCPB, "T8PEIMCAPCPB");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_ALIQUOTAINPS, 13500, 0, 1300, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOTAINPS, "E01C5DA7-F61B-4262-955A-8ECC3079A18E");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOTAINPS, "ALIQUOTAINPS");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOTAINPS, BUK_CAUSPREVBOOK_SPAN_T8ALTOCAPCPB, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQUOTA_INPS", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_T8ALTOCAPCPB, "C9B0F4F2-A04F-4807-9CFA-A2D9C169A1BC");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_T8ALTOCAPCPB, "T8ALTOCAPCPB");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCP, 15200, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCP, "0E8092E8-84C2-4E66-B1D3-9D250D56B8C1");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCP, "ALIQUOINPSCP");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCP, BUK_CAUSPREVBOOK_SPAN_T8ALPECAPCPB, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQUOTA_INPS_CP", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_T8ALPECAPCPB, "FF093902-77B0-4FE0-92F9-E7383EFB45BF");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_T8ALPECAPCPB, "T8ALPECAPCPB");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCE, 16800, 0, 1400, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCE, "E684A27F-6CAE-4DD6-902A-E9EFE2C4B484");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCE, "ALIQUOINPSCE");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ALIQUOINPSCE, BUK_CAUSPREVBOOK_SPAN_T8ALENCAPCPB, MyGlb.VIS_DEFAREPOSTYL, 3, 5, 6, 271384705, "Brief description of field content.", "::ALIQUOTA_INPS_CE", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_T8ALENCAPCPB, "AC78DE27-1FFB-4A65-AF9D-FDA5BAE41F91");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_T8ALENCAPCPB, "T8ALENCAPCPB");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_ACCERTAMENTO, 18600, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_ACCERTAMENTO, "3A1030FB-0275-4902-83DB-F31129F4127D");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_ACCERTAMENTO, "ACCERTAMENTO");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_ACCERTAMENTO, BUK_CAUSPREVBOOK_SPAN_TSTACPCPBINI, MyGlb.VIS_DEFAREPOSTYL, 5, 297, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_TSTACPCPBINI, "06C6B7AC-68DC-4AD2-AE48-E8A7DCCD5820");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_TSTACPCPBINI, "TSTACPCPBINI");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_IMPEGNPERCIP, 21500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_IMPEGNPERCIP, "0A667420-D1A2-4842-A0B8-8D523AD58100");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_IMPEGNPERCIP, "IMPEGNPERCIP");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_IMPEGNPERCIP, BUK_CAUSPREVBOOK_SPAN_TSTIPCPCPBIN, MyGlb.VIS_DEFAREPOSTYL, 5, 297, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_TSTIPCPCPBIN, "2346E553-DB18-466C-AB44-03047CFC5E1B");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_TSTIPCPCPBIN, "TSTIPCPCPBIN");
    BUK_CAUSPREVBOOK.InitReportBox(BUK_CAUSPREVBOOK_SEC_DETAIL, BUK_CAUSPREVBOOK_RPTBOX_IMPEGNOENTE, 24500, 0, 2600, 500, 0, 1, 1, MyGlb.VIS_DEFAREPOSTYL, 983041, 322, "", 1, -33);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_RPTBOX_IMPEGNOENTE, "05611C3D-3808-4AEE-A547-28E84E6B1B74");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_RPTBOX_IMPEGNOENTE, "IMPEGNOENTE");
    BUK_CAUSPREVBOOK.InitBoxSpan(BUK_CAUSPREVBOOK_RPTBOX_IMPEGNOENTE, BUK_CAUSPREVBOOK_SPAN_TSTIECPCPBIN, MyGlb.VIS_DEFAREPOSTYL, 5, 297, 0, 271384705, "Brief description of field content.", "", 1);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SPAN_TSTIECPCPBIN, "A99F42C5-292E-4DBC-964E-4FAA29E17AC9");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SPAN_TSTIECPCPBIN, "TSTIECPCPBIN");
    BUK_CAUSPREVBOOK.InitSection(BUK_CAUSPREVBOOK_RPT_NEWREPORT, BUK_CAUSPREVBOOK_SEC_PAGEFOOTER, 600, 1, 0, 6, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CAUSPREVBOOK.SetSectionRendersInto(BUK_CAUSPREVBOOK_SEC_PAGEFOOTER, BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SEC_PAGEFOOTER, "5B65388B-9B2B-4314-AAFF-D5B38A2FBA37");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SEC_PAGEFOOTER, "PAGEFOOTER");
    BUK_CAUSPREVBOOK.InitSection(BUK_CAUSPREVBOOK_RPT_NEWREPORT, BUK_CAUSPREVBOOK_SEC_REPORTFOOTER, 400, 1, 0, 7, MyGlb.VIS_DEFAREPOSTYL, 8912897, "");
    BUK_CAUSPREVBOOK.SetSectionRendersInto(BUK_CAUSPREVBOOK_SEC_REPORTFOOTER, BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY);
    BUK_CAUSPREVBOOK.SetRTCGuid(BUK_CAUSPREVBOOK_SEC_REPORTFOOTER, "67AF8494-76A1-4A7B-86DE-AD8362E1F60A");
    BUK_CAUSPREVBOOK.SetObjCode(BUK_CAUSPREVBOOK_SEC_REPORTFOOTER, "REPORTFOOTER");
    BUK_CAUSPREVBOOK_RPT_NEWREPORT_InitQuery(false, true);
  }

  private void BUK_CAUSPREVBOOK_InitLinks()
  {
    BUK_CAUSPREVBOOK.SetBoxNextBox(BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY, BUK_CAUSPREVBOOK_RPTBOX_PAGEBODY);
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAUSALPREVID) PAN_CAUSALPREVID_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALPREVID) PAN_CAUSALPREVID_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAUSALPREVID) PAN_CAUSALPREVID_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAUSALPREVID) PAN_CAUSALPREVID_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAUSALPREVID) PAN_CAUSALPREVID_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_CAUSALPREVID) PAN_CAUSALPREVID_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_OnFormattingSection(SectionID);
  }

  public void OnAfterFormattingSection(OBook SrcObj, int SectionID)
  {
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_OnAfterFormattingSection(SectionID);
  }

  public void OnFormattingPage(OBook SrcObj, int PageID)
  {
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_OnFormattingPage(PageID);
  }

  public void OnChangingSpan(OBook SrcObj, int SpanIdx, IDVariant OldVal, IDVariant NewVal, IDVariant Cancel)
  {
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_OnChangingSpan(SpanIdx, OldVal, NewVal, Cancel);
  }

  public void OnBoxDrop(OBook SrcObj, IDVariant SrcBoxIdx, IDVariant DstBoxIdx)
  {
  }

  public void OnBoxTransform(OBook SrcObj, IDVariant BoxIdx, IDVariant NewX, IDVariant NewY, IDVariant NewW, IDVariant NewH, IDVariant Cancel)
  {
  }

  public void OnConnecting(OBook SrcObj, IDConnection DBConn)
  {
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_OnConnecting(DBConn);
  }

  public void Activated(OBook SrcObj, int ObjID, String BoxName)
  {
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_Activated(ObjID, BoxName);
  }

  public void OnIMDBUpdate(OBook SrcObj, int ReportIdx)
  {
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_OnIMDBUpdate(ReportIdx);
  }

  public void OnPreview(OBook SrcObj)
  {
    if (SrcObj == BKW_CAUSPREVBOOK) BUK_CAUSPREVBOOK_OnPreview();
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
