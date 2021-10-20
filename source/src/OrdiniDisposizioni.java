// **********************************************
// Ordini Disposizioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdiniDisposizioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  OTabView TAB_TAB;
  private static int PFL_ORDINI_DATA = 0;
  private static int PFL_ORDINI_NRO = 1;
  private static int PFL_ORDINI_ANNO = 2;
  private static int PFL_ORDINI_INFO = 3;
  private static int PFL_ORDINI_TIPO = 4;
  private static int PFL_ORDINI_BENEFICIARI1 = 5;
  private static int PFL_ORDINI_IMPORTO1 = 6;
  private static int PFL_ORDINI_FATTURATO = 7;
  private static int PFL_ORDINI_LIQTECNICO = 8;
  private static int PFL_ORDINI_LIQCONTABILE = 9;

  private static int PPQRY_WEBVISBUODIS = 0;


  IDPanel PAN_ORDINI;
  private static int PFL_ECONOMATO_ORDINE1 = 0;
  private static int PFL_ECONOMATO_FORNITORE = 1;
  private static int PFL_ECONOMATO_MAGAZZINO = 2;
  private static int PFL_ECONOMATO_IMPORTO2 = 3;
  private static int PFL_ECONOMATO_APERTO = 4;
  private static int PFL_ECONOMATO_ARRIVATO = 5;
  private static int PFL_ECONOMATO_LIQUIDABILE = 6;
  private static int PFL_ECONOMATO_LIQUIDATO1 = 7;

  private static int PPQRY_ELENCORDICF4 = 0;


  IDPanel PAN_ECONOMATO;
  private static int PFL_CASSAECONOMA_ORDINE = 0;
  private static int PFL_CASSAECONOMA_BENEFICIARIO = 1;
  private static int PFL_CASSAECONOMA_DESCDOCUMENT = 2;
  private static int PFL_CASSAECONOMA_FUNZIOECONOM = 3;
  private static int PFL_CASSAECONOMA_IMPORTO = 4;
  private static int PFL_CASSAECONOMA_LIQUIDATO = 5;

  private static int PPQRY_ELENCBUONCF4 = 0;


  IDPanel PAN_CASSAECONOMA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI73(IMDB);
    //
    //
    Init_PQRY_WEBVISBUODIS(IMDB);
    Init_PQRY_ELENCORDICF4(IMDB);
    Init_PQRY_ELENCBUONCF4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI73(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI73, 3);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI73, "TBL_PARAMETRI73");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI73,IMDBDef4.FLD_PARAMETRI73_ROWNAMANIMSU, "ROWNAMANIMSU");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI73,IMDBDef4.FLD_PARAMETRI73_ROWNAMANIMSU,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI73,IMDBDef4.FLD_PARAMETRI73_ROWNAMNUIMSU, "ROWNAMNUIMSU");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI73,IMDBDef4.FLD_PARAMETRI73_ROWNAMNUIMSU,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI73,IMDBDef4.FLD_PARAMETRI73_ROWNAMIMSUIM, "ROWNAMIMSUIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI73,IMDBDef4.FLD_PARAMETRI73_ROWNAMIMSUIM,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI73, 0);
  }

  private static void Init_PQRY_WEBVISBUODIS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_WEBVISBUODIS, 11);
    IMDB.set_TblCode(IMDBDef13.PQRY_WEBVISBUODIS, "PQRY_WEBVISBUODIS");
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_DATA, "DATA");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_DATA,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_NUMERO, "NUMERO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_NUMERO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_ANNO, "ANNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_ANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_DES_BENEFICIARIO, "DES_BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_DES_BENEFICIARIO,5,40,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_IMP_FATTURATO, "IMP_FATTURATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_IMP_FATTURATO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_LIQ_TECNICO, "LIQ_TECNICO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_LIQ_TECNICO,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_LIQ_CONTABILE, "LIQ_CONTABILE");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_LIQ_CONTABILE,3,14,2);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_SE_CHIUSO, "SE_CHIUSO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_SE_CHIUSO,5,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_TIPO, "TIPO");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_TIPO,5,12,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_WEBVISBUDIIN, "WEBVISBUDIIN");
    IMDB.SetFldParams(IMDBDef13.PQRY_WEBVISBUODIS,IMDBDef13.PQSL_WEBVISBUODIS_WEBVISBUDIIN,5,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_WEBVISBUODIS, 0);
  }

  private static void Init_PQRY_ELENCORDICF4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_ELENCORDICF4, 11);
    IMDB.set_TblCode(IMDBDef13.PQRY_ELENCORDICF4, "PQRY_ELENCORDICF4");
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMPORTO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_APERTO, "IMP_APERTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_APERTO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_ARRIVATO, "IMP_ARRIVATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_ARRIVATO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_LIQUIDABILE, "IMP_LIQUIDABILE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_LIQUIDABILE,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_LIQUIDATO, "IMP_LIQUIDATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_IMP_LIQUIDATO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ELEORDCF4ORD, "ELEORDCF4ORD");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ELEORDCF4ORD,5,503,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ELEORDCF4FOR, "ELEORDCF4FOR");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ELEORDCF4FOR,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ELEORDCF4MAG, "ELEORDCF4MAG");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ELEORDCF4MAG,5,142,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ANNO_ORDINE, "ANNO_ORDINE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_ANNO_ORDINE,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_NUMERO_ORDINE, "NUMERO_ORDINE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_NUMERO_ORDINE,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_DATA_ORDINE, "DATA_ORDINE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCORDICF4,IMDBDef13.PQSL_ELENCORDICF4_DATA_ORDINE,6,19,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_ELENCORDICF4, 0);
  }

  private static void Init_PQRY_ELENCBUONCF4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_ELENCBUONCF4, 17);
    IMDB.set_TblCode(IMDBDef13.PQRY_ELENCBUONCF4, "PQRY_ELENCBUONCF4");
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ANNO_BUONO, "ANNO_BUONO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ANNO_BUONO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_NUMERO_BUONO, "NUMERO_BUONO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_NUMERO_BUONO,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DATA_BUONO, "DATA_BUONO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DATA_BUONO,6,19,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_BENEFICIARIO, "BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_BENEFICIARIO,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DESCR_BENEFICIARIO, "DESCR_BENEFICIARIO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DESCR_BENEFICIARIO,5,50,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DESCR_DOCUMENTO, "DESCR_DOCUMENTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DESCR_DOCUMENTO,5,66,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_FUNZIONE_ECONOMALE, "FUNZIONE_ECONOMALE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_FUNZIONE_ECONOMALE,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DESCR_FUNZIONE, "DESCR_FUNZIONE");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_DESCR_FUNZIONE,5,30,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ANNO_IMPEGNO, "ANNO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ANNO_IMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_NUMERO_IMPEGNO, "NUMERO_IMPEGNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_NUMERO_IMPEGNO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ANNO_SUBIMPEGNO, "ANNO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ANNO_SUBIMPEGNO,1,4,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_NUMERO_SUBIMPEGNO, "NUMERO_SUBIMPEGNO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_NUMERO_SUBIMPEGNO,1,5,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_IMPORTO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_IMP_LIQUIDATO, "IMP_LIQUIDATO");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_IMP_LIQUIDATO,2,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ELEBUOCF4ORD, "ELEBUOCF4ORD");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ELEBUOCF4ORD,5,503,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ELEBUOCF4BEN, "ELEBUOCF4BEN");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ELEBUOCF4BEN,5,99,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ELEBUOCFFUEC, "ELEBUOCFFUEC");
    IMDB.SetFldParams(IMDBDef13.PQRY_ELENCBUONCF4,IMDBDef13.PQSL_ELENCBUONCF4_ELEBUOCFFUEC,5,63,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_ELENCBUONCF4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdiniDisposizioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdiniDisposizioni()
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
    FormIdx = MyGlb.FRM_ORDINIDISPOS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "061F4798-6912-4206-A318-52C3778BBB62";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 406;
    set_Caption(new IDVariant("Ordini Disposizioni"));
    //
    Frames = new AFrame[5];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 380;
    Frames[1].Caption = "Tab";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 380;
    TAB_TAB = new OTabView(this);
    Frames[1].Content = TAB_TAB;
    TAB_TAB.iGuid = "0E6C7622-AFD7-46E7-B21A-A975E63D21C7";
    TAB_TAB.SetItemCount(3);
    TAB_TAB.Placement = 1;
    TAB_TAB.FrIndex = 1;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[2].InTabbed = true;
    Frames[2].Caption = "Ordini";
    Frames[2].Parent = this;
    PAN_ORDINI = new IDPanel(w, this, 2, "PAN_ORDINI");
    Frames[2].Content = PAN_ORDINI;
    PAN_ORDINI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINI.VS = MainFrm.VisualStyleList;
    PAN_ORDINI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "9CB98CC0-1E7C-4858-8DBA-3CC8486BAEC7");
    PAN_ORDINI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 796, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINI.InitStatus = 2;
    PAN_ORDINI_Init();
    PAN_ORDINI_InitFields();
    PAN_ORDINI_InitQueries();
    TAB_TAB.SetItem(1, Frames[2], 0, "", "Ordini", "");
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[3].InTabbed = true;
    Frames[3].Caption = "Economato";
    Frames[3].Parent = this;
    PAN_ECONOMATO = new IDPanel(w, this, 3, "PAN_ECONOMATO");
    Frames[3].Content = PAN_ECONOMATO;
    PAN_ECONOMATO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ECONOMATO.VS = MainFrm.VisualStyleList;
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "19B2ABF8-45E7-4DD2-A28D-F57451CD6B91");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1040, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ECONOMATO.InitStatus = 2;
    PAN_ECONOMATO_Init();
    PAN_ECONOMATO_InitFields();
    PAN_ECONOMATO_InitQueries();
    TAB_TAB.SetItem(2, Frames[3], 0, "", "Economato", "");
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[4].InTabbed = true;
    Frames[4].Caption = "Cassa Economale";
    Frames[4].Parent = this;
    PAN_CASSAECONOMA = new IDPanel(w, this, 4, "PAN_CASSAECONOMA");
    Frames[4].Content = PAN_CASSAECONOMA;
    PAN_CASSAECONOMA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CASSAECONOMA.VS = MainFrm.VisualStyleList;
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 380-MyGlb.PAN_OFFS_Y- MyGlb.PAN_OFFS_PAGEY, 0, 0);
    PAN_CASSAECONOMA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8D484123-A339-4C42-BB3D-39E9DEB60723");
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1092, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CASSAECONOMA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CASSAECONOMA.InitStatus = 2;
    PAN_CASSAECONOMA_Init();
    PAN_CASSAECONOMA_InitFields();
    PAN_CASSAECONOMA_InitQueries();
    TAB_TAB.SetItem(3, Frames[4], 0, "", "Cassa Economale", "");
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
      PAN_ORDINI.UpdatePanel(MainFrm);
      PAN_ECONOMATO.UpdatePanel(MainFrm);
      PAN_CASSAECONOMA.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdiniDisposizioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdiniDisposizioni.class.getName() : (Glb.ClassWithPackage(OrdiniDisposizioni.class) ? OrdiniDisposizioni.class.getName().substring(OrdiniDisposizioni.class.getPackage().getName().length() + 1) : OrdiniDisposizioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Ordini After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ORDINI_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOMECOMANDO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_SATTIVO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Ordini After Find Event Body
      // Procedure Body
      // 
      v_NOMECOMANDO = MainFrm.AFC.GetComando(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0), (new IDVariant("ordini_buoni")));
      if (v_NOMECOMANDO.equals((new IDVariant("ordini_buoni_attiva")), true) && MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true))
      {
        IDVariant v_TIPOORDINI = new IDVariant(0,IDVariant.STRING);
        IDVariant v_TIPOBUONI = new IDVariant(0,IDVariant.STRING);
        // 
        // folder economato
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.OBJECT_TYPE as USEOBJOBJTYP ");
          SQL.append("from ");
          SQL.append("  USER_OBJECTS A ");
          SQL.append("where (A.OBJECT_NAME = 'ELENCO_ORDINI_CF4') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_TIPOORDINI = QV.Get("USEOBJOBJTYP", IDVariant.STRING) ;
          }
          QV.Close();
        }
        // 
        // folder economale
        // 
        {
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  A.OBJECT_TYPE as USEOBJOBJTYP ");
          SQL.append("from ");
          SQL.append("  USER_OBJECTS A ");
          SQL.append("where (A.OBJECT_NAME = 'ELENCO_BUONI_CF4') ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_TIPOBUONI = QV.Get("USEOBJOBJTYP", IDVariant.STRING) ;
          }
          QV.Close();
        }
        if (IDL.NullValue(v_TIPOORDINI,(new IDVariant("TABLE"))).equals((new IDVariant("TABLE")), true) && IDL.NullValue(v_TIPOBUONI,(new IDVariant("TABLE"))).equals((new IDVariant("TABLE")), true))
        {
          v_SATTIVO = (new IDVariant("NN"));
        }
        else
        {
          if (IDL.NullValue(v_TIPOORDINI,(new IDVariant("TABLE"))).equals((new IDVariant("TABLE")), true) && IDL.NullValue(v_TIPOBUONI,(new IDVariant("TABLE"))).equals((new IDVariant("SYNONYM")), true))
          {
            v_SATTIVO = (new IDVariant("YN"));
          }
          else
          {
            if (IDL.NullValue(v_TIPOORDINI,(new IDVariant("TABLE"))).equals((new IDVariant("SYNONYM")), true) && IDL.NullValue(v_TIPOBUONI,(new IDVariant("TABLE"))).equals((new IDVariant("TABLE")), true))
            {
              v_SATTIVO = (new IDVariant("NY"));
            }
            else
            {
              if (IDL.NullValue(v_TIPOORDINI,(new IDVariant("TABLE"))).equals((new IDVariant("SYNONYM")), true) && IDL.NullValue(v_TIPOBUONI,(new IDVariant("TABLE"))).equals((new IDVariant("SYNONYM")), true))
              {
                v_SATTIVO = (new IDVariant("YY"));
              }
            }
          }
        }
      }
      else
      {
        // 
        // Non cambia niente
        // 
        v_SATTIVO = (new IDVariant("NN"));
      }
      if (v_SATTIVO.equals((new IDVariant("YN")), true))
      {
        PAN_ORDINI.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_ECONOMATO.set_Visible((new IDVariant(0)).booleanValue());
        PAN_CASSAECONOMA.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        if (v_SATTIVO.equals((new IDVariant("NY")), true))
        {
          PAN_ORDINI.set_Visible((new IDVariant(-1)).booleanValue());
          PAN_ECONOMATO.set_Visible((new IDVariant(-1)).booleanValue());
          PAN_CASSAECONOMA.set_Visible((new IDVariant(0)).booleanValue());
        }
        else
        {
          if (v_SATTIVO.equals((new IDVariant("YY")), true))
          {
            PAN_ORDINI.set_Visible((new IDVariant(-1)).booleanValue());
            PAN_ECONOMATO.set_Visible((new IDVariant(-1)).booleanValue());
            PAN_CASSAECONOMA.set_Visible((new IDVariant(-1)).booleanValue());
          }
          else
          {
            PAN_ORDINI.set_Visible((new IDVariant(-1)).booleanValue());
            PAN_ECONOMATO.set_Visible((new IDVariant(0)).booleanValue());
            PAN_CASSAECONOMA.set_Visible((new IDVariant(0)).booleanValue());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniDisposizioni", "OrdiniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Ordini On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINI);
      // 
      // Ordini On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ORDINI.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINI_BENEFICIARI1,(new IDVariant(PAN_ORDINI.FieldText(PFL_ORDINI_BENEFICIARI1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniDisposizioni", "OrdiniOnDynamicPropertiesEvent", _e);
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
      v_CAPTION = (new IDVariant("Ordini-Disposizioni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IDVariant v_ORDINIDISP = new IDVariant(0,IDVariant.STRING);
      v_ORDINIDISP = (new IDVariant("Ordini Disp."));
      IDVariant v_DISTINTELIQ = new IDVariant(0,IDVariant.STRING);
      v_DISTINTELIQ = (new IDVariant("Distinte Liq."));
      IDVariant v_ORDDISDISLIQ = new IDVariant(0,IDVariant.STRING);
      v_ORDDISDISLIQ = (new IDVariant("Ordini-Disp.-Dist. Liq."));
      set_Caption(IDL.Add(v_CAPTION, MainFrm.ESERCIZIO));
      if (MainFrm.PROCEDUBUONI.equals((new IDVariant("SI")), true) && IDL.IsNull(MainFrm.ATTILIQ))
      {
        Frames[PAN_ORDINI.FrIndex].set_Caption(new IDVariant(v_ORDINIDISP).stringValue());
        TAB_TAB.SetItemCaption((new IDVariant(PAN_ORDINI.FrIndex)).intValue(), v_ORDINIDISP.stringValue()); 
      }
      else if (IDL.IsNull(MainFrm.PROCEDUBUONI) && MainFrm.ATTILIQ.equals((new IDVariant("SI")), true))
      {
        Frames[PAN_ORDINI.FrIndex].set_Caption(new IDVariant(v_DISTINTELIQ).stringValue());
        TAB_TAB.SetItemCaption((new IDVariant(PAN_ORDINI.FrIndex)).intValue(), v_DISTINTELIQ.stringValue()); 
      }
      else
      {
        Frames[PAN_ORDINI.FrIndex].set_Caption(new IDVariant(v_ORDDISDISLIQ).stringValue());
        TAB_TAB.SetItemCaption((new IDVariant(PAN_ORDINI.FrIndex)).intValue(), v_ORDDISDISLIQ.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniDisposizioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Economato On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ECONOMATO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ECONOMATO);
      // 
      // Economato On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ECONOMATO.set_ToolTip(Glb.OBJ_FIELD,PFL_ECONOMATO_FORNITORE,(new IDVariant(PAN_ECONOMATO.FieldText(PFL_ECONOMATO_FORNITORE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniDisposizioni", "EconomatoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Cassa Economale On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CASSAECONOMA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CASSAECONOMA);
      // 
      // Cassa Economale On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_CASSAECONOMA.set_ToolTip(Glb.OBJ_FIELD,PFL_CASSAECONOMA_BENEFICIARIO,(new IDVariant(PAN_CASSAECONOMA.FieldText(PFL_CASSAECONOMA_BENEFICIARIO))).stringValue()); 
      PAN_CASSAECONOMA.set_ToolTip(Glb.OBJ_FIELD,PFL_CASSAECONOMA_DESCDOCUMENT,(new IDVariant(PAN_CASSAECONOMA.FieldText(PFL_CASSAECONOMA_DESCDOCUMENT))).stringValue()); 
      PAN_CASSAECONOMA.set_ToolTip(Glb.OBJ_FIELD,PFL_CASSAECONOMA_FUNZIOECONOM,(new IDVariant(PAN_CASSAECONOMA.FieldText(PFL_CASSAECONOMA_FUNZIOECONOM))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniDisposizioni", "CassaEconomaleOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Info
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Info ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_TIPO, 0).equals((new IDVariant("BUONO")), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_ANNO_BUONO, 0, IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_ANNO, 0));
        IMDB.set_Value(IMDBDef2.TBL_ORDINI1, IMDBDef2.FLD_ORDINI1_NUMERO_BUONO, 0, new IDVariant(IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_NUMERO, 0),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_INFOORDINI, (new IDVariant(2)).intValue(), this); 
      }
      else if (IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_TIPO, 0).equals((new IDVariant("DISPOSIZIONE")), true))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI91, IMDBDef1.FLD_PARAMETRI91_PARAANNODISP, 0, IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_ANNO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI91, IMDBDef1.FLD_PARAMETRI91_PARAPROGDISP, 0, new IDVariant(IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_NUMERO, 0),IDVariant.INTEGER));
        MainFrm.Show(MyGlb.FRM_INFODISPOSIZ, (new IDVariant(2)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI412, IMDBDef1.FLD_PARAMETRI412_PARANNDISFIL, 0, IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_ANNO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI412, IMDBDef1.FLD_PARAMETRI412_PARNUMDISFIL, 0, new IDVariant(IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_NUMERO, 0),IDVariant.INTEGER));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI412, IMDBDef1.FLD_PARAMETRI412_PARDATDISFIL, 0, IMDB.Value(IMDBDef13.PQRY_WEBVISBUODIS, IMDBDef13.PQSL_WEBVISBUODIS_DATA, 0));
        MainFrm.Show(MyGlb.FRM_INFODISTLIQU, (new IDVariant(2)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdiniDisposizioni", "Info", _e);
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
  private void TAB_TAB_Click(IDVariant OldPage, IDVariant Cancel)
  {
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ORDINI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ORDINI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ORDINI, Cancel);
    // Stub
  }

  private void PAN_ORDINI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINI_INFO)
    {
      this.IdxPanelActived = this.PAN_ORDINI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Info();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ECONOMATO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ECONOMATO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ECONOMATO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ECONOMATO, Cancel);
    // Stub
  }

  private void PAN_ECONOMATO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_ECONOMATO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ECONOMATO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ECONOMATO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CASSAECONOMA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CASSAECONOMA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CASSAECONOMA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CASSAECONOMA, Cancel);
    // Stub
  }

  private void PAN_CASSAECONOMA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CASSAECONOMA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CASSAECONOMA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CASSAECONOMA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ORDINI_Init()
  {

    PAN_ORDINI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINI.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, "D595723A-4743-4982-B117-AF8C19E3CFF3");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, "Data");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, "0CF18CBE-2FA4-47D2-9510-953A5D27B613");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, "N.ro");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, "Numero");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, "D2BCDAE1-CCFB-4223-8B36-A0F98B3A0EFF");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, "Anno");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, "FA454A2C-49E4-4CFD-BB54-C70D63217E97");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, " ");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, "35C7B2AA-1257-42FA-801B-71E43C32EC2B");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, "Tipo");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, "Tipo");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, "E2E1C421-479D-4B99-891E-CF0EA03A4A46");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, "Beneficiario");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, "555CF594-A62A-472C-B298-C1CD0E296A40");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, "Importo");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, "9B1C1E25-DC16-4FF0-A3FE-C12D953AD0F1");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, "Fatturato");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, "5E686370-4CB8-4B17-90EC-D3268B3492BC");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, "Liq. Tecnico");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, "CFA144BE-CAC8-48C4-9BFB-2DB21D65DED1");
    PAN_ORDINI.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, "Liq. Contabile");
    PAN_ORDINI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, "");
    PAN_ORDINI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.VIS_NORFIECF4IMP);
    PAN_ORDINI.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ORDINI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_LIST, 36);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_FORM, 4, 172, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_FORM, 48);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_DATA, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_DATA, PPQRY_WEBVISBUODIS, "A.DATA", "DATA", 6, 19, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_LIST, 64, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_LIST, 52);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_LIST, "N.ro");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_FORM, 4, 148, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_FORM, 64);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_NRO, MyGlb.PANEL_FORM, "N.ro");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_NRO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_NRO, PPQRY_WEBVISBUODIS, "A.NUMERO", "NUMERO", 2, 15, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_LIST, 100, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_LIST, "Anno");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_FORM, 4, 324, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_FORM, 40);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_ANNO, MyGlb.PANEL_FORM, "Anno");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_ANNO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_ANNO, PPQRY_WEBVISBUODIS, "A.ANNO", "ANNO", 1, 4, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_LIST, 140, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_LIST, 28);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_LIST, " ");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_FORM, 12, 276, 460, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_FORM, 28);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_FORM, 2);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_INFO, MyGlb.PANEL_FORM, " ");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_INFO, -1, -1);
    PAN_ORDINI.SetFieldUnbound(PFL_ORDINI_INFO, true);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_INFO, PPQRY_WEBVISBUODIS, "'I'", "WEBVISBUDIIN", 5, 1, 0, -13997);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINI.SetValueListItem(PFL_ORDINI_INFO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_LIST, 164, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_FORM, 48);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_TIPO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_TIPO, PPQRY_WEBVISBUODIS, "A.TIPO", "TIPO", 5, 12, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_LIST, 244, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_LIST, 104);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_FORM, 4, 244, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_FORM, 64);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_BENEFICIARI1, MyGlb.PANEL_FORM, "Benefic.");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_BENEFICIARI1, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_BENEFICIARI1, PPQRY_WEBVISBUODIS, "A.DES_BENEFICIARIO", "DES_BENEFICIARIO", 5, 40, 0, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_LIST, 452, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_LIST, 56);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_FORM, 4, 628, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_FORM, 56);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_IMPORTO1, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_IMPORTO1, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_IMPORTO1, PPQRY_WEBVISBUODIS, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_LIST, 544, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_LIST, 92);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_LIST, "Fatturato");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_FORM, 4, 652, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_FORM, 92);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_FATTURATO, MyGlb.PANEL_FORM, "Fatturato");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_FATTURATO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_FATTURATO, PPQRY_WEBVISBUODIS, "A.IMP_FATTURATO", "IMP_FATTURATO", 3, 14, 2, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_LIST, 628, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_LIST, 76);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_LIST, "Liq. Tecnico");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_FORM, 4, 700, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_FORM, 76);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQTECNICO, MyGlb.PANEL_FORM, "Liq. Tecnico");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_LIQTECNICO, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_LIQTECNICO, PPQRY_WEBVISBUODIS, "A.LIQ_TECNICO", "LIQ_TECNICO", 3, 14, 2, -13997);
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_LIST, 712, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_LIST, 84);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_LIST, "Liq. Contabile");
    PAN_ORDINI.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_FORM, 4, 748, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_FORM, 84);
    PAN_ORDINI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINI_LIQCONTABILE, MyGlb.PANEL_FORM, "Liq. Contabile");
    PAN_ORDINI.SetFieldPage(PFL_ORDINI_LIQCONTABILE, -1, -1);
    PAN_ORDINI.SetFieldPanel(PFL_ORDINI_LIQCONTABILE, PPQRY_WEBVISBUODIS, "A.LIQ_CONTABILE", "LIQ_CONTABILE", 3, 14, 2, -13997);
  }

  private void PAN_ORDINI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDINI.SetIMDB(IMDB, "PQRY_WEBVISBUODIS", true);
    PAN_ORDINI.set_SetString(MyGlb.MASTER_ROWNAME, "WEB VISTA BUONI DISP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DATA as DATA, ");
    SQL.append("  A.NUMERO as NUMERO, ");
    SQL.append("  A.ANNO as ANNO, ");
    SQL.append("  A.DES_BENEFICIARIO as DES_BENEFICIARIO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMP_FATTURATO as IMP_FATTURATO, ");
    SQL.append("  A.LIQ_TECNICO as LIQ_TECNICO, ");
    SQL.append("  A.LIQ_CONTABILE as LIQ_CONTABILE, ");
    SQL.append("  A.SE_CHIUSO as SE_CHIUSO, ");
    SQL.append("  A.TIPO as TIPO, ");
    SQL.append("  'I' as WEBVISBUDIIN ");
    PAN_ORDINI.SetQuery(PPQRY_WEBVISBUODIS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WEB_VISTA_BUONI_DISP A ");
    PAN_ORDINI.SetQuery(PPQRY_WEBVISBUODIS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (DECODE(~~TBL_PARAMETRI73.ROWNAMIMSUIM~~, 'I', A.ANNO_IMPEGNO, A.ANNO_SUBIMP) = ~~TBL_PARAMETRI73.ROWNAMANIMSU~~) ");
    SQL.append("and   (DECODE(~~TBL_PARAMETRI73.ROWNAMIMSUIM~~, 'I', A.NUMERO_IMPEGNO, A.NUMERO_SUBIMP) = ~~TBL_PARAMETRI73.ROWNAMNUIMSU~~) ");
    PAN_ORDINI.SetQuery(PPQRY_WEBVISBUODIS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINI.SetQuery(PPQRY_WEBVISBUODIS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINI.SetQuery(PPQRY_WEBVISBUODIS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.DATA, ");
    SQL.append("  A.NUMERO ");
    PAN_ORDINI.SetQuery(PPQRY_WEBVISBUODIS, 5, SQL, -1, "");
    PAN_ORDINI.SetQueryDB(PPQRY_WEBVISBUODIS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINI.SetMasterTable(0, "WEB_VISTA_BUONI_DISP");
    PAN_ORDINI.AddToSortList(PFL_ORDINI_DATA, true);
    PAN_ORDINI.AddToSortList(PFL_ORDINI_NRO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINI.Status() == 2)
    {
      int oldListQBE = PAN_ORDINI.iUseListQBE;
      PAN_ORDINI.iUseListQBE = 0;
      PAN_ORDINI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINI.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ECONOMATO_Init()
  {

    PAN_ECONOMATO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ECONOMATO.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ECONOMATO.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, "E4719BF8-FBDE-403B-8CA9-699442543BBC");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, "Ordine");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, "9469D0D1-6FFB-43D4-BF8B-29588AD0E6C9");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, "Fornitore");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, "8B6A6686-302D-4582-ADC7-2BAADABB547D");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, "Magazzino");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, "93FEF0EF-5E0C-4CAC-B96A-1EF48C1181F7");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, "Importo");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, "FBF065AF-8ABF-45E2-B8FA-957657538231");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, "Aperto");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, "73C53ADD-1E9E-4BA3-99D6-2BAE4A8C811A");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, "Arrivato");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, "4B163AAA-515A-488C-854C-1A5AA0192593");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, "Liquidabile");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ECONOMATO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, "E7A6137C-0850-4182-ABBD-C54E88DFDB22");
    PAN_ECONOMATO.set_Header(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, "Liquidato");
    PAN_ECONOMATO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, "");
    PAN_ECONOMATO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.VIS_NORMALFIELDS);
    PAN_ECONOMATO.SetFlags(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ECONOMATO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_LIST, 0, 36, 148, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_LIST, 40);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_LIST, "Ordine");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_FORM, 4, 292, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_FORM, 40);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_FORM, 2);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ORDINE1, MyGlb.PANEL_FORM, "Ord.");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_ORDINE1, -1, -1);
    PAN_ECONOMATO.SetFieldUnbound(PFL_ECONOMATO_ORDINE1, true);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_ORDINE1, PPQRY_ELENCORDICF4, "TO_CHAR ( A.ANNO_ORDINE ) || ' / ' || TO_CHAR ( A.NUMERO_ORDINE ) || ' - ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_ORDINE, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_ORDINE, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_ORDINE, 'yyyy')) )", "ELEORDCF4ORD", 5, 503, 0, -13997);
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_LIST, 148, 36, 316, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_LIST, 32);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_LIST, "Fornitore");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_FORM, 4, 340, 464, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_FORM, 32);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_FORM, 2);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_FORNITORE, MyGlb.PANEL_FORM, "Frn.");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_FORNITORE, -1, -1);
    PAN_ECONOMATO.SetFieldUnbound(PFL_ECONOMATO_FORNITORE, true);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_FORNITORE, PPQRY_ELENCORDICF4, "SUBSTR(B.RAGIONE_SOCIALE_ESTESA, 1, 40)", "ELEORDCF4FOR", 5, 99, 0, -13997);
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_LIST, 464, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_LIST, 60);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_LIST, "Magazzino");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_FORM, 4, 388, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_FORM, 60);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_FORM, 2);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_MAGAZZINO, MyGlb.PANEL_FORM, "Magaz.");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_MAGAZZINO, -1, -1);
    PAN_ECONOMATO.SetFieldUnbound(PFL_ECONOMATO_MAGAZZINO, true);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_MAGAZZINO, PPQRY_ELENCORDICF4, "TO_CHAR ( A.COD_MAGAZZINO ) || ' - ' || A.DESCR_MAGAZZINO", "ELEORDCF4MAG", 5, 142, 0, -13997);
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_LIST, 656, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_LIST, 56);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_LIST, "Importo");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_FORM, 4, 196, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_FORM, 136);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_IMPORTO2, MyGlb.PANEL_FORM, "Importo");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_IMPORTO2, -1, -1);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_IMPORTO2, PPQRY_ELENCORDICF4, "A.IMPORTO", "IMPORTO", 2, 15, 0, -13997);
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_LIST, 740, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_LIST, 72);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_LIST, "Aperto");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_FORM, 4, 220, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_FORM, 136);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_FORM, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_APERTO, MyGlb.PANEL_FORM, "Aperto");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_APERTO, -1, -1);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_APERTO, PPQRY_ELENCORDICF4, "A.IMP_APERTO", "IMP_APERTO", 2, 15, 0, -13997);
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_LIST, 816, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_LIST, 84);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_LIST, "Arrivato");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_FORM, 4, 244, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_FORM, 136);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_FORM, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_ARRIVATO, MyGlb.PANEL_FORM, "Arrivato");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_ARRIVATO, -1, -1);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_ARRIVATO, PPQRY_ELENCORDICF4, "A.IMP_ARRIVATO", "IMP_ARRIVATO", 2, 15, 0, -13997);
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_LIST, 896, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_LIST, 92);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_LIST, "Liquidabile");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_FORM, 4, 268, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_FORM, 136);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_FORM, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDABILE, MyGlb.PANEL_FORM, "Liquidabile");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_LIQUIDABILE, -1, -1);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_LIQUIDABILE, PPQRY_ELENCORDICF4, "A.IMP_LIQUIDABILE", "IMP_LIQUIDABILE", 2, 15, 0, -13997);
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_LIST, 968, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_LIST, 88);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_LIST, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_LIST, "Liquidato");
    PAN_ECONOMATO.SetRect(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_FORM, 364, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ECONOMATO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_FORM, 104);
    PAN_ECONOMATO.SetNumRow(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_FORM, 1);
    PAN_ECONOMATO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ECONOMATO_LIQUIDATO1, MyGlb.PANEL_FORM, "Liquidato");
    PAN_ECONOMATO.SetFieldPage(PFL_ECONOMATO_LIQUIDATO1, -1, -1);
    PAN_ECONOMATO.SetFieldPanel(PFL_ECONOMATO_LIQUIDATO1, PPQRY_ELENCORDICF4, "A.IMP_LIQUIDATO", "IMP_LIQUIDATO", 2, 15, 0, -13997);
  }

  private void PAN_ECONOMATO_InitQueries()
  {
    StringBuffer SQL;

    PAN_ECONOMATO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ECONOMATO.SetIMDB(IMDB, "PQRY_ELENCORDICF4", true);
    PAN_ECONOMATO.set_SetString(MyGlb.MASTER_ROWNAME, "ELENCO ORDINI CF4");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMP_APERTO as IMP_APERTO, ");
    SQL.append("  A.IMP_ARRIVATO as IMP_ARRIVATO, ");
    SQL.append("  A.IMP_LIQUIDABILE as IMP_LIQUIDABILE, ");
    SQL.append("  A.IMP_LIQUIDATO as IMP_LIQUIDATO, ");
    SQL.append("  TO_CHAR ( A.ANNO_ORDINE ) || ' / ' || TO_CHAR ( A.NUMERO_ORDINE ) || ' - ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_ORDINE, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_ORDINE, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_ORDINE, 'yyyy')) ) as ELEORDCF4ORD, ");
    SQL.append("  SUBSTR(B.RAGIONE_SOCIALE_ESTESA, 1, 40) as ELEORDCF4FOR, ");
    SQL.append("  TO_CHAR ( A.COD_MAGAZZINO ) || ' - ' || A.DESCR_MAGAZZINO as ELEORDCF4MAG, ");
    SQL.append("  A.ANNO_ORDINE as ANNO_ORDINE, ");
    SQL.append("  A.NUMERO_ORDINE as NUMERO_ORDINE, ");
    SQL.append("  A.DATA_ORDINE as DATA_ORDINE ");
    PAN_ECONOMATO.SetQuery(PPQRY_ELENCORDICF4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ELENCO_ORDINI_CF4 A, ");
    SQL.append("  BEN B ");
    PAN_ECONOMATO.SetQuery(PPQRY_ELENCORDICF4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_IMPEGNO = ~~TBL_PARAMETRI73.ROWNAMANIMSU~~) ");
    SQL.append("and   (A.NUMERO_IMPEGNO = ~~TBL_PARAMETRI73.ROWNAMNUIMSU~~) ");
    SQL.append("and   (B.CODICE(+) = A.FORNITORE) ");
    PAN_ECONOMATO.SetQuery(PPQRY_ELENCORDICF4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ECONOMATO.SetQuery(PPQRY_ELENCORDICF4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ECONOMATO.SetQuery(PPQRY_ELENCORDICF4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ORDINE, ");
    SQL.append("  A.NUMERO_ORDINE, ");
    SQL.append("  A.DATA_ORDINE ");
    PAN_ECONOMATO.SetQuery(PPQRY_ELENCORDICF4, 5, SQL, -1, "");
    PAN_ECONOMATO.SetQueryDB(PPQRY_ELENCORDICF4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ECONOMATO.SetMasterTable(0, "ELENCO_ORDINI_CF4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ECONOMATO.Status() == 2)
    {
      int oldListQBE = PAN_ECONOMATO.iUseListQBE;
      PAN_ECONOMATO.iUseListQBE = 0;
      PAN_ECONOMATO.PanelCommand(Glb.PCM_SEARCH);
      PAN_ECONOMATO.PanelCommand(Glb.PCM_FIND);
      PAN_ECONOMATO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CASSAECONOMA_Init()
  {

    PAN_CASSAECONOMA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CASSAECONOMA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CASSAECONOMA.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_CASSAECONOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, "E633CDE5-425D-4184-B0B2-4549191AF9B0");
    PAN_CASSAECONOMA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, "Ordine");
    PAN_CASSAECONOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, "");
    PAN_CASSAECONOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSAECONOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSAECONOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, "8C60C201-579D-4260-A751-B767615858B8");
    PAN_CASSAECONOMA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, "Beneficiario");
    PAN_CASSAECONOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, "");
    PAN_CASSAECONOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSAECONOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSAECONOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, "FD98FFE1-D6FE-4E56-A6DD-BC678EC47BC8");
    PAN_CASSAECONOMA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, "Desc. Documento");
    PAN_CASSAECONOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, "");
    PAN_CASSAECONOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSAECONOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSAECONOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, "97BB3038-DDA4-4834-B00E-7E2104CF9CF7");
    PAN_CASSAECONOMA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, "Funzione Economale");
    PAN_CASSAECONOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, "");
    PAN_CASSAECONOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSAECONOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSAECONOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, "5562DDF2-4DA1-4C43-AC8F-50683A3061BC");
    PAN_CASSAECONOMA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, "Importo");
    PAN_CASSAECONOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, "");
    PAN_CASSAECONOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSAECONOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CASSAECONOMA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, "5E30E238-84EE-44FF-9019-D3225FCC2C14");
    PAN_CASSAECONOMA.set_Header(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, "Liquidato");
    PAN_CASSAECONOMA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, "");
    PAN_CASSAECONOMA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.VIS_NORMALFIELDS);
    PAN_CASSAECONOMA.SetFlags(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CASSAECONOMA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_LIST, 40);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_LIST, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_LIST, "Ordine");
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_FORM, 4, 292, 472, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_FORM, 40);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_FORM, 2);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_ORDINE, MyGlb.PANEL_FORM, "Ord.");
    PAN_CASSAECONOMA.SetFieldPage(PFL_CASSAECONOMA_ORDINE, -1, -1);
    PAN_CASSAECONOMA.SetFieldUnbound(PFL_CASSAECONOMA_ORDINE, true);
    PAN_CASSAECONOMA.SetFieldPanel(PFL_CASSAECONOMA_ORDINE, PPQRY_ELENCBUONCF4, "TO_CHAR ( A.ANNO_BUONO ) || ' / ' || TO_CHAR ( A.NUMERO_BUONO ) || ' - ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_BUONO, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_BUONO, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_BUONO, 'yyyy')) )", "ELEBUOCF4ORD", 5, 503, 0, -13997);
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_LIST, 152, 36, 356, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_LIST, 64);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_LIST, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_FORM, 4, 340, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_FORM, 64);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_FORM, 2);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_BENEFICIARIO, MyGlb.PANEL_FORM, "Benefic.");
    PAN_CASSAECONOMA.SetFieldPage(PFL_CASSAECONOMA_BENEFICIARIO, -1, -1);
    PAN_CASSAECONOMA.SetFieldUnbound(PFL_CASSAECONOMA_BENEFICIARIO, true);
    PAN_CASSAECONOMA.SetFieldPanel(PFL_CASSAECONOMA_BENEFICIARIO, PPQRY_ELENCBUONCF4, "SUBSTR(B.RAGIONE_SOCIALE_ESTESA, 1, 40)", "ELEBUOCF4BEN", 5, 99, 0, -13997);
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_LIST, 508, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_LIST, 108);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_LIST, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_LIST, "Desc. Documento");
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_FORM, 4, 100, 472, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_FORM, 136);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_FORM, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_DESCDOCUMENT, MyGlb.PANEL_FORM, "Desc. Documento");
    PAN_CASSAECONOMA.SetFieldPage(PFL_CASSAECONOMA_DESCDOCUMENT, -1, -1);
    PAN_CASSAECONOMA.SetFieldPanel(PFL_CASSAECONOMA_DESCDOCUMENT, PPQRY_ELENCBUONCF4, "A.DESCR_DOCUMENTO", "DESCR_DOCUMENTO", 5, 66, 0, -13997);
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_LIST, 684, 36, 248, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_LIST, 108);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_LIST, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_LIST, "Funzione Economale");
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_FORM, 4, 388, 540, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_FORM, 108);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_FORM, 2);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_FUNZIOECONOM, MyGlb.PANEL_FORM, "Funzione Economale");
    PAN_CASSAECONOMA.SetFieldPage(PFL_CASSAECONOMA_FUNZIOECONOM, -1, -1);
    PAN_CASSAECONOMA.SetFieldUnbound(PFL_CASSAECONOMA_FUNZIOECONOM, true);
    PAN_CASSAECONOMA.SetFieldPanel(PFL_CASSAECONOMA_FUNZIOECONOM, PPQRY_ELENCBUONCF4, "A.DESCR_FUNZIONE || ' - ' || A.DESCR_FUNZIONE", "ELEBUOCFFUEC", 5, 63, 0, -13997);
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_LIST, 932, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_FORM, 136);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_CASSAECONOMA.SetFieldPage(PFL_CASSAECONOMA_IMPORTO, -1, -1);
    PAN_CASSAECONOMA.SetFieldPanel(PFL_CASSAECONOMA_IMPORTO, PPQRY_ELENCBUONCF4, "A.IMPORTO", "IMPORTO", 2, 15, 0, -13997);
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_LIST, 1012, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_LIST, 88);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_LIST, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_LIST, "Liquidato");
    PAN_CASSAECONOMA.SetRect(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_FORM, 356, 4, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CASSAECONOMA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_FORM, 104);
    PAN_CASSAECONOMA.SetNumRow(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_FORM, 1);
    PAN_CASSAECONOMA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CASSAECONOMA_LIQUIDATO, MyGlb.PANEL_FORM, "Liquidato");
    PAN_CASSAECONOMA.SetFieldPage(PFL_CASSAECONOMA_LIQUIDATO, -1, -1);
    PAN_CASSAECONOMA.SetFieldPanel(PFL_CASSAECONOMA_LIQUIDATO, PPQRY_ELENCBUONCF4, "A.IMP_LIQUIDATO", "IMP_LIQUIDATO", 2, 15, 0, -13997);
  }

  private void PAN_CASSAECONOMA_InitQueries()
  {
    StringBuffer SQL;

    PAN_CASSAECONOMA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CASSAECONOMA.SetIMDB(IMDB, "PQRY_ELENCBUONCF4", true);
    PAN_CASSAECONOMA.set_SetString(MyGlb.MASTER_ROWNAME, "ELENCO BUONI CF4");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ANNO_BUONO as ANNO_BUONO, ");
    SQL.append("  A.NUMERO_BUONO as NUMERO_BUONO, ");
    SQL.append("  A.DATA_BUONO as DATA_BUONO, ");
    SQL.append("  A.BENEFICIARIO as BENEFICIARIO, ");
    SQL.append("  A.DESCR_BENEFICIARIO as DESCR_BENEFICIARIO, ");
    SQL.append("  A.DESCR_DOCUMENTO as DESCR_DOCUMENTO, ");
    SQL.append("  A.FUNZIONE_ECONOMALE as FUNZIONE_ECONOMALE, ");
    SQL.append("  A.DESCR_FUNZIONE as DESCR_FUNZIONE, ");
    SQL.append("  A.ANNO_IMPEGNO as ANNO_IMPEGNO, ");
    SQL.append("  A.NUMERO_IMPEGNO as NUMERO_IMPEGNO, ");
    SQL.append("  A.ANNO_SUBIMPEGNO as ANNO_SUBIMPEGNO, ");
    SQL.append("  A.NUMERO_SUBIMPEGNO as NUMERO_SUBIMPEGNO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.IMP_LIQUIDATO as IMP_LIQUIDATO, ");
    SQL.append("  TO_CHAR ( A.ANNO_BUONO ) || ' / ' || TO_CHAR ( A.NUMERO_BUONO ) || ' - ' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_BUONO, 'dd')) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_BUONO, 'mm' )) ) || '/' || TO_CHAR ( TO_NUMBER(TO_CHAR(A.DATA_BUONO, 'yyyy')) ) as ELEBUOCF4ORD, ");
    SQL.append("  SUBSTR(B.RAGIONE_SOCIALE_ESTESA, 1, 40) as ELEBUOCF4BEN, ");
    SQL.append("  A.DESCR_FUNZIONE || ' - ' || A.DESCR_FUNZIONE as ELEBUOCFFUEC ");
    PAN_CASSAECONOMA.SetQuery(PPQRY_ELENCBUONCF4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  ELENCO_BUONI_CF4 A, ");
    SQL.append("  BEN B ");
    PAN_CASSAECONOMA.SetQuery(PPQRY_ELENCBUONCF4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_IMPEGNO = ~~TBL_PARAMETRI73.ROWNAMANIMSU~~) ");
    SQL.append("and   (A.NUMERO_IMPEGNO = ~~TBL_PARAMETRI73.ROWNAMNUIMSU~~) ");
    SQL.append("and   (B.CODICE(+) = A.BENEFICIARIO) ");
    PAN_CASSAECONOMA.SetQuery(PPQRY_ELENCBUONCF4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CASSAECONOMA.SetQuery(PPQRY_ELENCBUONCF4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CASSAECONOMA.SetQuery(PPQRY_ELENCBUONCF4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_BUONO, ");
    SQL.append("  A.NUMERO_BUONO, ");
    SQL.append("  A.DATA_BUONO ");
    PAN_CASSAECONOMA.SetQuery(PPQRY_ELENCBUONCF4, 5, SQL, -1, "");
    PAN_CASSAECONOMA.SetQueryDB(PPQRY_ELENCBUONCF4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CASSAECONOMA.SetMasterTable(0, "ELENCO_BUONI_CF4");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CASSAECONOMA.Status() == 2)
    {
      int oldListQBE = PAN_CASSAECONOMA.iUseListQBE;
      PAN_CASSAECONOMA.iUseListQBE = 0;
      PAN_CASSAECONOMA.PanelCommand(Glb.PCM_SEARCH);
      PAN_CASSAECONOMA.PanelCommand(Glb.PCM_FIND);
      PAN_CASSAECONOMA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ECONOMATO) PAN_ECONOMATO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CASSAECONOMA) PAN_CASSAECONOMA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_ValidateRow(Cancel);
    if (SrcObj == PAN_ECONOMATO) PAN_ECONOMATO_ValidateRow(Cancel);
    if (SrcObj == PAN_CASSAECONOMA) PAN_CASSAECONOMA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_DynamicProperties();
    if (SrcObj == PAN_ECONOMATO) PAN_ECONOMATO_DynamicProperties();
    if (SrcObj == PAN_CASSAECONOMA) PAN_CASSAECONOMA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ECONOMATO) PAN_ECONOMATO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CASSAECONOMA) PAN_CASSAECONOMA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_ORDINI) PAN_ORDINI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ECONOMATO) PAN_ECONOMATO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CASSAECONOMA) PAN_CASSAECONOMA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
