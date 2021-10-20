// **********************************************
// Assegnazione UO Capitoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AssegnazioneUOCapitoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMETRI_UOGESTNONASS = 0;
  private static int PFL_PARAMETRI_UOUTILNONASS = 1;

  private static int PPQRY_PARAMETRI639 = 0;


  IDPanel PAN_PARAMETRI;
  private static int PFL_ASSEGUOCAPIT_PROGRESSIVO = 0;
  private static int PFL_ASSEGUOCAPIT_ESERCIZIO = 1;
  private static int PFL_ASSEGUOCAPIT_ES = 2;
  private static int PFL_ASSEGUOCAPIT_CAPITOLO = 3;
  private static int PFL_ASSEGUOCAPIT_ARTICOLO = 4;
  private static int PFL_ASSEGUOCAPIT_DESCRCAPITOL = 5;
  private static int PFL_ASSEGUOCAPIT_UOGESTIATTUA = 6;
  private static int PFL_ASSEGUOCAPIT_NUOVAUOGESTI = 7;
  private static int PFL_ASSEGUOCAPIT_UOUTILIATTUA = 8;
  private static int PFL_ASSEGUOCAPIT_NUOVAUOUTILI = 9;
  private static int PFL_ASSEGUOCAPIT_DATASCADENUO = 10;
  private static int PFL_ASSEGUOCAPIT_SIMULAZIONE = 11;
  private static int PFL_ASSEGUOCAPIT_AGGIORNAMENT = 12;
  private static int PFL_ASSEGUOCAPIT_OTTICAOLD = 13;
  private static int PFL_ASSEGUOCAPIT_OTTICANEW = 14;
  private static int PFL_ASSEGUOCAPIT_PROGUOGESOLD = 15;
  private static int PFL_ASSEGUOCAPIT_CODUOGESTOLD = 16;
  private static int PFL_ASSEGUOCAPIT_DESCUOGESOLD = 17;
  private static int PFL_ASSEGUOCAPIT_PROGUOGESNEW = 18;
  private static int PFL_ASSEGUOCAPIT_CODUOGESTNEW = 19;
  private static int PFL_ASSEGUOCAPIT_DESCUOGESNEW = 20;
  private static int PFL_ASSEGUOCAPIT_PROGUOUTIOLD = 21;
  private static int PFL_ASSEGUOCAPIT_CODUOUTILOLD = 22;
  private static int PFL_ASSEGUOCAPIT_DESCUOUTIOLD = 23;
  private static int PFL_ASSEGUOCAPIT_PROGUOUTINEW = 24;
  private static int PFL_ASSEGUOCAPIT_CODUOUTILNEW = 25;
  private static int PFL_ASSEGUOCAPIT_DESCUOUTINEW = 26;
  private static int PFL_ASSEGUOCAPIT_DATAINSERIME = 27;
  private static int PFL_ASSEGUOCAPIT_UTENTEINSERI = 28;
  private static int PFL_ASSEGUOCAPIT_DATAULTIMAGG = 29;
  private static int PFL_ASSEGUOCAPIT_UTENTULTIAGG = 30;
  private static int PFL_ASSEGUOCAPIT_DATAELIMINAZ = 31;
  private static int PFL_ASSEGUOCAPIT_UTENTEELIMIN = 32;
  private static int PFL_ASSEGUOCAPIT_DATAELABRETT = 33;
  private static int PFL_ASSEGUOCAPIT_UTENELABRETT = 34;

  private static int PPQRY_RETTIUOCAPIT = 0;

  private static int PPQRY_UOGESTINUOVA = 1;
  private static int PPQRY_UOUTILINUOVA = 2;


  IDPanel PAN_ASSEGUOCAPIT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI638(IMDB);
    //
    //
    Init_PQRY_PARAMETRI639(IMDB);
    Init_PQRY_PARAMETRI639_RS(IMDB);
    Init_PQRY_RETTIUOCAPIT(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI638(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI638, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI638, "TBL_PARAMETRI638");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARAMOTTIOLD, "PARAMOTTIOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARAMOTTIOLD,5,18,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARAMOTTINEW, "PARAMOTTINEW");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARAMOTTINEW,5,18,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARSOLUOGEVU, "PARSOLUOGEVU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARSOLUOGEVU,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARSOLUOUTVU, "PARSOLUOUTVU");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI638,IMDBDef3.FLD_PARAMETRI638_PARSOLUOUTVU,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI638, 0);
  }

  private static void Init_PQRY_PARAMETRI639(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI639, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI639, "PQRY_PARAMETRI639");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI639,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOGEVU, "PARSOLUOGEVU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI639,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOGEVU,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI639,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOUTVU, "PARSOLUOUTVU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI639,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOUTVU,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI639, 0);
  }

  private static void Init_PQRY_PARAMETRI639_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI639_RS, 2);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI639_RS, "PQRY_PARAMETRI639_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI639_RS,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOGEVU, "PARSOLUOGEVU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI639_RS,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOGEVU,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI639_RS,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOUTVU, "PARSOLUOUTVU");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI639_RS,IMDBDef11.PQSL_PARAMETRI639_PARSOLUOUTVU,5,2,0);
  }

  private static void Init_PQRY_RETTIUOCAPIT(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_RETTIUOCAPIT, 31);
    IMDB.set_TblCode(IMDBDef11.PQRY_RETTIUOCAPIT, "PQRY_RETTIUOCAPIT");
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_CAPITOLO, "DESCR_CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_CAPITOLO,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_OTTICA_OLD, "OTTICA_OLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_OTTICA_OLD,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_OTTICA_NEW, "OTTICA_NEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_OTTICA_NEW,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_GEST_OLD, "PROGR_UO_GEST_OLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_GEST_OLD,3,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_GEST_OLD, "COD_UO_GEST_OLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_GEST_OLD,5,50,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_GEST_OLD, "DESCR_UO_GEST_OLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_GEST_OLD,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UOGESTIATTUA, "UOGESTIATTUA");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UOGESTIATTUA,5,553,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_GEST_NEW, "PROGR_UO_GEST_NEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_GEST_NEW,3,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_GEST_NEW, "COD_UO_GEST_NEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_GEST_NEW,5,50,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_GEST_NEW, "DESCR_UO_GEST_NEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_GEST_NEW,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_UTILIZZO_OLD, "PROGR_UO_UTILIZZO_OLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_UTILIZZO_OLD,3,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_UTILIZZO_OLD, "COD_UO_UTILIZZO_OLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_UTILIZZO_OLD,5,50,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_UTILIZZO_OLD, "DESCR_UO_UTILIZZO_OLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_UTILIZZO_OLD,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UOUTILIATTUA, "UOUTILIATTUA");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UOUTILIATTUA,5,553,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_UTILIZZO_NEW, "PROGR_UO_UTILIZZO_NEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_UTILIZZO_NEW,3,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_UTILIZZO_NEW, "COD_UO_UTILIZZO_NEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_COD_UO_UTILIZZO_NEW,5,50,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_UTILIZZO_NEW, "DESCR_UO_UTILIZZO_NEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DESCR_UO_UTILIZZO_NEW,5,500,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_SCADENZA_UO, "DATA_SCADENZA_UO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_SCADENZA_UO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_ELIMINAZIONE, "DATA_ELIMINAZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_ELIMINAZIONE,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_ELIMINAZIONE, "UTENTE_ELIMINAZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_ELIMINAZIONE,5,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_ELAB_RETTIFICA, "DATA_ELAB_RETTIFICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_DATA_ELAB_RETTIFICA,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_ELAB_RETTIFICA, "UTENTE_ELAB_RETTIFICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_RETTIUOCAPIT,IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_ELAB_RETTIFICA,5,8,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_RETTIUOCAPIT, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AssegnazioneUOCapitoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public AssegnazioneUOCapitoli()
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
    FormIdx = MyGlb.FRM_ASSEGUOCAPIT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7C44CA8E-6993-40E9-9B2A-8AC17FBE8308";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 832;
    DesignHeight = 434;
    set_Caption(new IDVariant("Assegnazione UO Capitoli"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 832;
    Frames[1].Height = 408;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0784314;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 832;
    Frames[2].Height = 32;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 32;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2C79FBE5-BC74-45C9-8B6D-BBB6C6116A04");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 96, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 832;
    Frames[3].Height = 376;
    Frames[3].Caption = "Assegnazione UO Capitoli";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 376;
    PAN_ASSEGUOCAPIT = new IDPanel(w, this, 3, "PAN_ASSEGUOCAPIT");
    Frames[3].Content = PAN_ASSEGUOCAPIT;
    PAN_ASSEGUOCAPIT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ASSEGUOCAPIT.VS = MainFrm.VisualStyleList;
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 832-MyGlb.PAN_OFFS_X, 376-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D8C9F6C3-ED2A-4067-B589-93DC2C7F42C2");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1344, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ASSEGUOCAPIT.InitStatus = 2;
    PAN_ASSEGUOCAPIT_Init();
    PAN_ASSEGUOCAPIT_InitFields();
    PAN_ASSEGUOCAPIT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG184+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG183+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG184+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_AGGIVALOCOM5+BaseCmdLinIdx)
      {
        AggiornaValoriComuni();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_UOUTIDAUOGES+BaseCmdLinIdx)
      {
        UoUtilizzodaUoGestione();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ESCLUDCAPITO+BaseCmdLinIdx)
      {
        EscludiCapitolo();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI638, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ASSEGUOCAPIT_PARAMETRI639();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_ASSEGUOCAPIT.UpdatePanel(MainFrm);
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
    return (obj instanceof AssegnazioneUOCapitoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AssegnazioneUOCapitoli.class.getName() : (Glb.ClassWithPackage(AssegnazioneUOCapitoli.class) ? AssegnazioneUOCapitoli.class.getName().substring(AssegnazioneUOCapitoli.class.getPackage().getName().length() + 1) : AssegnazioneUOCapitoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      PAN_ASSEGUOCAPIT.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ASSEGUOCAPIT.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARSOLUOGEVU, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARSOLUOUTVU, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "Load", _e);
    }
  }

  // **********************************************************************
  // End Modal
  // Evento notificato dall'oggetto form in applicazioni
  // Web quando viene chiusa una finestra modale
  // LookupForm - Input
  // Result - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void IntEndModal(IDVariant LookupForm,IDVariant Result,IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C3;

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_AGGIVALCOMUO)), true) && Result.booleanValue())
      {
        IDVariant I = null;
        I = (new IDVariant(1));
        IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
        C3 = PAN_ASSEGUOCAPIT.MasterRS();
        if (C3.size()>0) CurPos = C3.getRow(); else CurPos = 0;
        if (!C3.Bof()) PAN_ASSEGUOCAPIT.GotoFirst();
        while (!PAN_ASSEGUOCAPIT.RSEOF())
        {
          if (PAN_ASSEGUOCAPIT.IsRowSelected(I.intValue()))
          {
            v_SELEZIONATO = (new IDVariant(-1));
            if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARACKUOGEST, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update RETTIFICA_UO_CAPITOLI set ");
              SQL.append("  PROGR_UO_GEST_NEW = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  COD_UO_GEST_NEW = SO4_UTIL.UNITA_GET_CODICE_VALIDO(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )), ");
              SQL.append("  DESCR_UO_GEST_NEW = SO4_UTIL.UNITA_GET_DESCR_VALIDA(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOGESTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
            if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARACKUOUTIL, 0).equals((new IDVariant("SI")), true))
            {
              SQL = new StringBuffer();
              SQL.append("update RETTIFICA_UO_CAPITOLI set ");
              SQL.append("  PROGR_UO_UTILIZZO_NEW = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
              SQL.append("  COD_UO_UTILIZZO_NEW = SO4_UTIL.UNITA_GET_CODICE_VALIDO(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )), ");
              SQL.append("  DESCR_UO_UTILIZZO_NEW = SO4_UTIL.UNITA_GET_DESCR_VALIDA(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAMETRI636, IMDBDef11.PQSL_PARAMETRI636_PARAMUOUTILI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",TRUNC( SYSDATE )) ");
              SQL.append("where (PROGRESSIVO = " + IDL.CSql(C3.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
              MainFrm.Cf4armDBObject.DBO().Execute(SQL);
            }
          }
          I = IDL.Add(I, (new IDVariant(1)));
          PAN_ASSEGUOCAPIT.GotoNext();
        }
        if (CurPos>0) C3.absolute(CurPos);
        if (!(v_SELEZIONATO.booleanValue()))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Non e' stata selezionata nessuna riga"));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
        else
        {
          PAN_ASSEGUOCAPIT.PanelCommand(Glb.PCM_REQUERY);
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_RETTIDEFINUO)), true) && Result.booleanValue())
      {
        PAN_ASSEGUOCAPIT.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Assegnazione UO Capitoli On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ASSEGUOCAPIT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ASSEGUOCAPIT);
      // 
      // Assegnazione UO Capitoli On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_RETTIUOCAPIT, IMDBDef11.PQSL_RETTIUOCAPIT_PROGRESSIVO, 0))))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_RETTIUOCAPIT, IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_GEST_NEW, 0)))
        {
          PAN_ASSEGUOCAPIT.set_VisualStyle(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_NUOVAUOGESTI,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_ASSEGUOCAPIT.set_VisualStyle(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_NUOVAUOGESTI,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_RETTIUOCAPIT, IMDBDef11.PQSL_RETTIUOCAPIT_PROGR_UO_UTILIZZO_NEW, 0)))
        {
          PAN_ASSEGUOCAPIT.set_VisualStyle(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_NUOVAUOUTILI,new IDVariant(MyGlb.VIS_NORFIESFOROS).intValue()); 
        }
        else
        {
          PAN_ASSEGUOCAPIT.set_VisualStyle(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_NUOVAUOUTILI,new IDVariant(MyGlb.VIS_NORMALFIELDS).intValue()); 
        }
      }
      PAN_ASSEGUOCAPIT.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_DESCRCAPITOL,(new IDVariant(PAN_ASSEGUOCAPIT.FieldText(PFL_ASSEGUOCAPIT_DESCRCAPITOL))).stringValue()); 
      PAN_ASSEGUOCAPIT.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_UOGESTIATTUA,(new IDVariant(PAN_ASSEGUOCAPIT.FieldText(PFL_ASSEGUOCAPIT_UOGESTIATTUA))).stringValue()); 
      PAN_ASSEGUOCAPIT.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_NUOVAUOGESTI,(new IDVariant(PAN_ASSEGUOCAPIT.FieldText(PFL_ASSEGUOCAPIT_NUOVAUOGESTI))).stringValue()); 
      PAN_ASSEGUOCAPIT.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_UOUTILIATTUA,(new IDVariant(PAN_ASSEGUOCAPIT.FieldText(PFL_ASSEGUOCAPIT_UOUTILIATTUA))).stringValue()); 
      PAN_ASSEGUOCAPIT.set_ToolTip(Glb.OBJ_FIELD,PFL_ASSEGUOCAPIT_NUOVAUOUTILI,(new IDVariant(PAN_ASSEGUOCAPIT.FieldText(PFL_ASSEGUOCAPIT_NUOVAUOUTILI))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "AssegnazioneUOCapitoliOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Assegnazione UO Capitoli On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_ASSEGUOCAPIT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Assegnazione UO Capitoli On Updating Row Body
      // Corpo Procedura
      // 
      if (FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_RETTIUOCAPIT, IMDBDef11.PQSL_RETTIUOCAPIT_UTENTE_ULTIMO_AGG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        IMDB.set_Value(IMDBDef11.PQRY_RETTIUOCAPIT, IMDBDef11.PQSL_RETTIUOCAPIT_DATA_ULTIMO_AGG, 0, IDL.Today());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "AssegnazioneUOCapitoliOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Assegnazione UO Capitoli On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_ASSEGUOCAPIT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Assegnazione UO Capitoli On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_ASSEGUOCAPIT.Status()).compareTo((new IDVariant(2)), true)!=0)
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET26+BaseCmdSetIdx, (new IDVariant(0)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdSetVisible(MyGlb.CMDS_COMMANDSET26+BaseCmdSetIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "AssegnazioneUOCapitoliOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Assegnazione UO Capitoli After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_ASSEGUOCAPIT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Assegnazione UO Capitoli After Find Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARAMOTTIOLD, 0)))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARAMOTTIOLD, 0, IMDB.Value(IMDBDef11.PQRY_RETTIUOCAPIT, IMDBDef11.PQSL_RETTIUOCAPIT_OTTICA_OLD, 0));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARAMOTTINEW, 0)))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARAMOTTINEW, 0, IMDB.Value(IMDBDef11.PQRY_RETTIUOCAPIT, IMDBDef11.PQSL_RETTIUOCAPIT_OTTICA_NEW, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "AssegnazioneUOCapitoliAfterFind", _e);
    }
  }

  // **********************************************************************
  // Aggiorna Valori Comuni
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AggiornaValoriComuni ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiorna Valori Comuni Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI637, IMDBDef3.FLD_PARAMETRI637_PARAMOTTINEW, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARAMOTTINEW, 0));
      MainFrm.Show(MyGlb.FRM_AGGIVALCOMUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "AggiornaValoriComuni", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Uo Utilizzo da Uo Gestione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int UoUtilizzodaUoGestione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Uo Utilizzo da Uo Gestione Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_AVVISOCONFER = new IDVariant(0,IDVariant.STRING);
      v_AVVISOCONFER = (new IDVariant("Per le righe selezionate, la Nuova Uo Utilizzo verrà impostata uguale alla Nuova Uo di Gestione presente sulla riga stessa."));
      if (!(MainFrm.MessageConfirm(v_AVVISOCONFER)))
      {
        return 0;
      }
      C4 = PAN_ASSEGUOCAPIT.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_ASSEGUOCAPIT.GotoFirst();
      while (!PAN_ASSEGUOCAPIT.RSEOF())
      {
        if (PAN_ASSEGUOCAPIT.IsRowSelected(I.intValue()))
        {
          v_SELEZIONATO = (new IDVariant(-1));
          SQL = new StringBuffer();
          SQL.append("update RETTIFICA_UO_CAPITOLI set ");
          SQL.append("  PROGR_UO_UTILIZZO_NEW = RETTIFICA_UO_CAPITOLI.PROGR_UO_GEST_NEW, ");
          SQL.append("  COD_UO_UTILIZZO_NEW = RETTIFICA_UO_CAPITOLI.COD_UO_GEST_NEW, ");
          SQL.append("  DESCR_UO_UTILIZZO_NEW = RETTIFICA_UO_CAPITOLI.DESCR_UO_GEST_NEW ");
          SQL.append("where (PROGRESSIVO = " + IDL.CSql(C4.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ASSEGUOCAPIT.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      if (!(v_SELEZIONATO.booleanValue()))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non e' stata selezionata nessuna riga"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        PAN_ASSEGUOCAPIT.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "UoUtilizzodaUoGestione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Escludi Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EscludiCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Escludi Capitolo Body
      // Corpo Procedura
      // 
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant v_SELEZIONATO = new IDVariant(0,IDVariant.INTEGER);
      IDVariant v_AVVISOCONFER = new IDVariant(0,IDVariant.STRING);
      v_AVVISOCONFER = (new IDVariant("Le righe relative ai capitoli selezionati verranno eliminate e i capitoli non saranno trattati dall'elaborazione. Continuare?"));
      if (!(MainFrm.MessageConfirm(v_AVVISOCONFER)))
      {
        return 0;
      }
      C4 = PAN_ASSEGUOCAPIT.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_ASSEGUOCAPIT.GotoFirst();
      while (!PAN_ASSEGUOCAPIT.RSEOF())
      {
        if (PAN_ASSEGUOCAPIT.IsRowSelected(I.intValue()))
        {
          v_SELEZIONATO = (new IDVariant(-1));
          SQL = new StringBuffer();
          SQL.append("update RETTIFICA_UO_CAPITOLI set ");
          SQL.append("  DATA_ELIMINAZIONE = TRUNC( SYSDATE ) ");
          SQL.append("where (PROGRESSIVO = " + IDL.CSql(C4.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ASSEGUOCAPIT.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      if (!(v_SELEZIONATO.booleanValue()))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Non e' stata selezionata nessuna riga"));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Elaborazione Eseguita"));
        MainFrm.set_AlertMessage(v_AVVISO); 
        PAN_ASSEGUOCAPIT.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "EscludiCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Simulazione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Simulazione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Simulazione Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_ASSEGUOCAPIT.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Confermare o Annullare le modifiche in sospeso prima di continuare."));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IDVariant v_ERRORIOUT = new IDVariant(0,IDVariant.STRING);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.RETTIFICAUOCAMBIOOTTICA(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARAMOTTINEW, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), (new IDVariant("SI")), (new IDVariant("NO")), v_ERRORIOUT);
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          return 0;
        }
        else
        {
          if (v_ERRORIOUT.equals((new IDVariant("SI")), true))
          {
            MainFrm.Show(MyGlb.FRM_ERRRETUOCAOT, (new IDVariant(0)).intValue(), this); 
          }
          else
          {
            MainFrm.Show(MyGlb.FRM_LOGRETUOCAOT, (new IDVariant(0)).intValue(), this); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "Simulazione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Aggiornamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Aggiornamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Aggiornamento Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_ASSEGUOCAPIT.Status()).equals((new IDVariant(3)), true))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Confermare o Annullare le modifiche in sospeso prima di continuare."));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI641, IMDBDef3.FLD_PARAMETRI641_PARAMOTTINEW, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARAMOTTINEW, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI641, IMDBDef3.FLD_PARAMETRI641_PARACOPCOMUO, 0, (new IDVariant()));
        MainFrm.Show(MyGlb.FRM_RETTIDEFINUO, (new IDVariant(1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AssegnazioneUOCapitoli", "Aggiornamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ASSEGUOCAPIT_PARAMETRI639() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI639_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI638, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI638, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI639_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI639_RS, 0, IMDBDef3.TBL_PARAMETRI638, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI639_RS, 0, 0, IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARSOLUOGEVU, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI639_RS, 1, 0, IMDBDef3.TBL_PARAMETRI638, IMDBDef3.FLD_PARAMETRI638_PARSOLUOUTVU, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI638, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI638, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI638, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI639_RS, 0);
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ASSEGUOCAPIT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ASSEGUOCAPIT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ASSEGUOCAPIT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ASSEGUOCAPIT, Cancel);
    // Stub
  }

  private void PAN_ASSEGUOCAPIT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ASSEGUOCAPIT_SIMULAZIONE)
    {
      this.IdxPanelActived = this.PAN_ASSEGUOCAPIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Simulazione();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ASSEGUOCAPIT_AGGIORNAMENT)
    {
      this.IdxPanelActived = this.PAN_ASSEGUOCAPIT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Aggiornamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ASSEGUOCAPIT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ASSEGUOCAPIT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_ASSEGUOCAPIT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ASSEGUOCAPIT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, "A2F0E297-57DA-459A-8533-50CAED4BABBB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, "UO Gestione non assegnata");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, "FE8D5360-113E-435C-8014-9601A49EF3D5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, "UO Utilizzo non assegnata");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_LIST, 140);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_LIST, "U. Gst. nn. ass.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_FORM, 4, 4, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_FORM, 164);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOGESTNONASS, MyGlb.PANEL_FORM, "UO Gestione non assegnata");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UOGESTNONASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UOGESTNONASS, PPQRY_PARAMETRI639, "A.PARSOLUOGEVU", "PARSOLUOGEVU", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UOGESTNONASS, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UOGESTNONASS, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_LIST, 132);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_LIST, "U. Utl. nn. ass.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_FORM, 204, 4, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_FORM, 156);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UOUTILNONASS, MyGlb.PANEL_FORM, "UO Utilizzo non assegnata");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UOUTILNONASS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UOUTILNONASS, PPQRY_PARAMETRI639, "A.PARSOLUOUTVU", "PARSOLUOUTVU", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UOUTILNONASS, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_UOUTILNONASS, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI639", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI639, IMDBDef11.PQRY_PARAMETRI639_RS, IMDBDef3.TBL_PARAMETRI638);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UOGESTNONASS, IMDBDef3.FLD_PARAMETRI638_PARSOLUOGEVU);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UOUTILNONASS, IMDBDef3.FLD_PARAMETRI638_PARSOLUOUTVU);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI638");
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

  private void PAN_ASSEGUOCAPIT_Init()
  {

    PAN_ASSEGUOCAPIT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ASSEGUOCAPIT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ASSEGUOCAPIT.SetSize(MyGlb.OBJ_FIELD, 35);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, "418AEDAF-4237-4FF0-A731-F8D4CEC80E45");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, "PROGRESSIVO");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, "863F44C3-9873-4349-9498-C07CC1B7725D");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, "ESERCIZIO");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, 0, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, "B15513B7-458E-4583-8A66-261B0087222B");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, "Parte");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, "E9516412-E291-40FC-8F9B-24F938F52C69");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, "Capitolo");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, "3D85D322-7BF1-4718-8AF3-62F7F2A37C5D");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, "Art.");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, "316255D2-7AFA-4303-BC93-54064D77275D");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, "Descrizione");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, "9B172039-B315-410A-A956-6D8C6A607F1B");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, "Uo Gestione Attuale");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, "054BA8AB-A768-42DD-822D-C3C4665507C4");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, "Nuova UO Gestione");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, "AF899A96-5077-4BC9-844C-17E353907A28");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, "Uo Utilizzo Attuale");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, "32217322-58CB-4A24-ADB7-F909A1455DEE");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, "Nuova UO Utilizzo");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, "7583F950-97D8-4626-83CD-DEF0809541D9");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, "Scadenza UO");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, "88491BD3-0E46-4374-8AAC-9A0DAF51EF19");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, "Simulazione");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, MyGlb.VIS_STATICBUTTON);
    PAN_ASSEGUOCAPIT.SetImage(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, 0, "button1.gif", false);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, "6722FEF7-530C-4AA0-916E-C8D0FAAE9A72");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, "Aggiornamento");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, MyGlb.VIS_STATICBUTTON);
    PAN_ASSEGUOCAPIT.SetImage(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, 0, "button1.gif", false);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, "A13710B7-BA9F-4589-8514-82850958133C");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, "OTTICA OLD");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, "3FF2AB7D-F5F7-41DA-9B80-C02B49706DE5");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, "OTTICA NEW");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, "716CF96F-2CDD-4FCE-952E-8A87128D0FE9");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, "PROGR UO GEST OLD");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, "4FDA16EA-9EE9-4209-8ECF-1FA1B595AACA");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, "COD UO GEST OLD");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, "5BB9F88B-67B1-48B1-AEBE-144B8B2C17D3");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, "DESCR UO GEST OLD");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, "82982923-78A5-448B-AF8E-9F4E50EF6F8F");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, "Nuova UO Gestione");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, "77E6C2B9-9F73-4177-9FED-86B3B29C8E7A");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, "COD UO GEST NEW");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, "8F78A9AC-0B02-46E4-9474-7F2B855EBFFB");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, "DESCR UO GEST NEW");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, "2C85DF44-820D-4E1E-AC31-F2618E3B0E10");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, "PROGR UO UTILIZZO OLD");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, "F135DBA9-FBB6-495E-8295-B5C0A26F5E4D");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, "COD UO UTILIZZO OLD");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, "48857A84-ACDE-43BA-845E-FA2DFE4E96D0");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, "DESCR UO UTILIZZO OLD");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, "8B9C1AB8-FA7B-4EB9-9279-CF0059E6A9F9");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, "Nuova UO Utilizzo");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.VIS_NORMALFIELDS);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, "DFB0585D-6B7B-4AB1-B71B-787784A23204");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, "COD UO UTILIZZO NEW");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, "B158502E-3025-4A0E-9734-260AEEE07417");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, "DESCR UO UTILIZZO NEW");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, "9F6BF59B-225B-43B1-89BD-032C6EC40164");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, "DATA INSERIMENTO");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, "5E90F21E-2D9F-457E-B9E3-BD6138C8F503");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, "45C18A52-B79B-44D8-A50A-E5E86EF5CE05");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, "F7B78B43-D539-4B06-8E08-56A7AA976D1B");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, "5C0E7332-E845-49BE-9AFC-684E5438EF42");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, "DATA ELIMINAZIONE");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, "FED61392-1A12-47E9-9275-24FDFB9324F1");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, "UTENTE ELIMINAZIONE");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, "6A18804E-446E-4F7E-85CC-F79E735D9542");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, "DATA ELAB RETTIFICA");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ASSEGUOCAPIT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, "28237D8E-4430-4B84-9DD9-10D58F26B321");
    PAN_ASSEGUOCAPIT.set_Header(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, "UTENTE ELAB RETTIFICA");
    PAN_ASSEGUOCAPIT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, "");
    PAN_ASSEGUOCAPIT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.VIS_NORMFIELPADR);
    PAN_ASSEGUOCAPIT.SetFlags(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ASSEGUOCAPIT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_PROGRESSIVO, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_PROGRESSIVO, PPQRY_RETTIUOCAPIT, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_LIST, 40, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_FORM, 188, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_ESERCIZIO, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_ESERCIZIO, PPQRY_RETTIUOCAPIT, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_LIST, 24);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_LIST, "Parte");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_FORM, 324, 4, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_FORM, 40);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ES, MyGlb.PANEL_FORM, "Parte");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_ES, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_ES, PPQRY_RETTIUOCAPIT, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_ASSEGUOCAPIT.SetValueListItem(PFL_ASSEGUOCAPIT_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ASSEGUOCAPIT.SetValueListItem(PFL_ASSEGUOCAPIT_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_LIST, 44, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_FORM, 420, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_CAPITOLO, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_CAPITOLO, PPQRY_RETTIUOCAPIT, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_LIST, 180, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_ARTICOLO, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_ARTICOLO, PPQRY_RETTIUOCAPIT, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_LIST, 212, 36, 212, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_LIST, 124);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_FORM, 4, 52, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCRCAPITOL, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DESCRCAPITOL, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DESCRCAPITOL, PPQRY_RETTIUOCAPIT, "A.DESCR_CAPITOLO", "DESCR_CAPITOLO", 5, 500, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_LIST, 424, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_LIST, 124);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_LIST, "Uo Gestione Attuale");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_FORM, 4, 232, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_FORM, 124);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOGESTIATTUA, MyGlb.PANEL_FORM, "Uo Gestione Attuale");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_UOGESTIATTUA, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldUnbound(PFL_ASSEGUOCAPIT_UOGESTIATTUA, true);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_UOGESTIATTUA, PPQRY_RETTIUOCAPIT, "A.COD_UO_GEST_OLD || ' - ' || A.DESCR_UO_GEST_OLD", "UOGESTIATTUA", 5, 553, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_LIST, 632, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_LIST, 300);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_LIST, "Nuova UO Gestione");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_FORM, 4, 196, 744, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_FORM, 300);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOGESTI, MyGlb.PANEL_FORM, "Nuova UO Gestione");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_NUOVAUOGESTI, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_NUOVAUOGESTI, PPQRY_UOGESTINUOVA, "A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA", "UOGESTINUOVA", 5, 173, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_LIST, 840, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_LIST, 112);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_LIST, "Uo Utilizzo Attuale");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_FORM, 4, 280, 548, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_FORM, 112);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UOUTILIATTUA, MyGlb.PANEL_FORM, "Uo Utilizzo Attuale");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_UOUTILIATTUA, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldUnbound(PFL_ASSEGUOCAPIT_UOUTILIATTUA, true);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_UOUTILIATTUA, PPQRY_RETTIUOCAPIT, "A.COD_UO_UTILIZZO_OLD || ' - ' || A.DESCR_UO_UTILIZZO_OLD", "UOUTILIATTUA", 5, 553, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_LIST, 1048, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_LIST, 292);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_LIST, "Nuova UO Utilizzo");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_FORM, 4, 328, 736, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_FORM, 292);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_NUOVAUOUTILI, MyGlb.PANEL_FORM, "Nuova UO Utilizzo");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_NUOVAUOUTILI, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_NUOVAUOUTILI, PPQRY_UOUTILINUOVA, "A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA", "UOUTILINUOVA", 5, 173, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_LIST, 1256, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_LIST, 120);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_LIST, "Scadenza UO");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_FORM, 188, 172, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_FORM, 136);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATASCADENUO, MyGlb.PANEL_FORM, "Scadenza UO");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DATASCADENUO, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DATASCADENUO, PPQRY_RETTIUOCAPIT, "A.DATA_SCADENZA_UO", "DATA_SCADENZA_UO", 6, 10, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, MyGlb.PANEL_LIST, 568, 248, 100, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, MyGlb.PANEL_LIST, 0);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, MyGlb.PANEL_FORM, 484, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, MyGlb.PANEL_FORM, 0);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_SIMULAZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_SIMULAZIONE, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_SIMULAZIONE, -1, "", "SIMULAZIONE", 0, 0, 0, -13869);
    PAN_ASSEGUOCAPIT.set_ImageResizeMode(PFL_ASSEGUOCAPIT_SIMULAZIONE, 3);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, MyGlb.PANEL_LIST, 684, 248, 100, 32, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, MyGlb.PANEL_LIST, 0);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, MyGlb.PANEL_FORM, 492, 12, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, MyGlb.PANEL_FORM, 0);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_AGGIORNAMENT, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_AGGIORNAMENT, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_AGGIORNAMENT, -1, "", "AGGIORNAMENT", 0, 0, 0, -13869);
    PAN_ASSEGUOCAPIT.set_ImageResizeMode(PFL_ASSEGUOCAPIT_AGGIORNAMENT, 3);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_LIST, 380, 36, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_LIST, 76);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_LIST, "OTTICA OLD");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_FORM, 4, 76, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICAOLD, MyGlb.PANEL_FORM, "OTTICA OLD");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_OTTICAOLD, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_OTTICAOLD, PPQRY_RETTIUOCAPIT, "A.OTTICA_OLD", "OTTICA_OLD", 5, 20, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_LIST, 476, 36, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_LIST, 80);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_LIST, "OTTICA NEW");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_FORM, 4, 100, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_OTTICANEW, MyGlb.PANEL_FORM, "OTTICA NEW");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_OTTICANEW, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_OTTICANEW, PPQRY_RETTIUOCAPIT, "A.OTTICA_NEW", "OTTICA_NEW", 5, 20, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_LIST, 380, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_LIST, 124);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_LIST, "PROGR UO GEST OLD");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_FORM, 308, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESOLD, MyGlb.PANEL_FORM, "PROGR UO GEST OLD");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_PROGUOGESOLD, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_PROGUOGESOLD, PPQRY_RETTIUOCAPIT, "A.PROGR_UO_GEST_OLD", "PROGR_UO_GEST_OLD", 3, 18, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_LIST, 4, 292, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_LIST, "COD UO GEST OLD");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_FORM, 4, 124, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTOLD, MyGlb.PANEL_FORM, "COD UO GEST OLD");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_CODUOGESTOLD, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_CODUOGESTOLD, PPQRY_RETTIUOCAPIT, "A.COD_UO_GEST_OLD", "COD_UO_GEST_OLD", 5, 50, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_LIST, 4, 316, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_LIST, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_LIST, "DESCR UO GEST OLD");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_FORM, 4, 148, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESOLD, MyGlb.PANEL_FORM, "DESCR UO GEST OLD");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DESCUOGESOLD, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DESCUOGESOLD, PPQRY_RETTIUOCAPIT, "A.DESCR_UO_GEST_OLD", "DESCR_UO_GEST_OLD", 5, 500, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_LIST, 632, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_LIST, 124);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_LIST, "Nuova UO Gestione");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOGESNEW, MyGlb.PANEL_FORM, "Nuova UO Gestione");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_PROGUOGESNEW, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_PROGUOGESNEW, PPQRY_RETTIUOCAPIT, "A.PROGR_UO_GEST_NEW", "PROGR_UO_GEST_NEW", 3, 18, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_LIST, 4, 364, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_LIST, "COD UO GEST NEW");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_FORM, 4, 196, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOGESTNEW, MyGlb.PANEL_FORM, "COD UO GEST NEW");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_CODUOGESTNEW, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_CODUOGESTNEW, PPQRY_RETTIUOCAPIT, "A.COD_UO_GEST_NEW", "COD_UO_GEST_NEW", 5, 50, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_LIST, 4, 388, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_LIST, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_LIST, "DESCR UO GEST NEW");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_FORM, 4, 220, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOGESNEW, MyGlb.PANEL_FORM, "DESCR UO GEST NEW");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DESCUOGESNEW, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DESCUOGESNEW, PPQRY_RETTIUOCAPIT, "A.DESCR_UO_GEST_NEW", "DESCR_UO_GEST_NEW", 5, 500, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_LIST, 516, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_LIST, 148);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_LIST, "P. U. UT. O.");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_FORM, 4, 244, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTIOLD, MyGlb.PANEL_FORM, "PR. UO UTILIZZO OLD");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_PROGUOUTIOLD, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_PROGUOUTIOLD, PPQRY_RETTIUOCAPIT, "A.PROGR_UO_UTILIZZO_OLD", "PROGR_UO_UTILIZZO_OLD", 3, 18, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_LIST, 4, 436, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_LIST, "COD UO UTIL. OLD");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_FORM, 4, 268, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILOLD, MyGlb.PANEL_FORM, "COD UO UTIL. OLD");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_CODUOUTILOLD, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_CODUOUTILOLD, PPQRY_RETTIUOCAPIT, "A.COD_UO_UTILIZZO_OLD", "COD_UO_UTILIZZO_OLD", 5, 50, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_LIST, 4, 460, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_LIST, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_LIST, "DESCR UO UTILIZZO OLD");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_FORM, 4, 292, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_FORM, 160);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTIOLD, MyGlb.PANEL_FORM, "DESCR UO UTILIZZO OLD");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DESCUOUTIOLD, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DESCUOUTIOLD, PPQRY_RETTIUOCAPIT, "A.DESCR_UO_UTILIZZO_OLD", "DESCR_UO_UTILIZZO_OLD", 5, 500, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_LIST, 1256, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_LIST, 152);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_LIST, "Nuova UO Utilizzo");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_FORM, 188, 244, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_FORM, 160);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_PROGUOUTINEW, MyGlb.PANEL_FORM, "Nuova UO Utilizzo");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_PROGUOUTINEW, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_PROGUOUTINEW, PPQRY_RETTIUOCAPIT, "A.PROGR_UO_UTILIZZO_NEW", "PROGR_UO_UTILIZZO_NEW", 3, 18, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_LIST, 4, 508, 528, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_LIST, "COD UO UTIL. NEW");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_FORM, 4, 316, 552, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_FORM, 152);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_CODUOUTILNEW, MyGlb.PANEL_FORM, "COD UO UTILIZZO NEW");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_CODUOUTILNEW, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_CODUOUTILNEW, PPQRY_RETTIUOCAPIT, "A.COD_UO_UTILIZZO_NEW", "COD_UO_UTILIZZO_NEW", 5, 50, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_LIST, 4, 532, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_LIST, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_LIST, "DESCR UO UTILIZZO NEW");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_FORM, 4, 340, 560, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_FORM, 160);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_FORM, 2);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DESCUOUTINEW, MyGlb.PANEL_FORM, "DESCR UO UTILIZZO NEW");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DESCUOUTINEW, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DESCUOUTINEW, PPQRY_RETTIUOCAPIT, "A.DESCR_UO_UTILIZZO_NEW", "DESCR_UO_UTILIZZO_NEW", 5, 500, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_LIST, 468, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_LIST, 120);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_FORM, 308, 76, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAINSERIME, MyGlb.PANEL_FORM, "DATA INSERIMENTO");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DATAINSERIME, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DATAINSERIME, PPQRY_RETTIUOCAPIT, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_LIST, 556, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_LIST, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_LIST, "UTEN. INSER.");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_FORM, 188, 28, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_FORM, 144);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEINSERI, MyGlb.PANEL_FORM, "UTENTE INSERIMENTO");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_UTENTEINSERI, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_UTENTEINSERI, PPQRY_RETTIUOCAPIT, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_LIST, 628, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_LIST, 116);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 364, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_FORM, 128);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAULTIMAGG, MyGlb.PANEL_FORM, "DATA ULTIMO AGG");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DATAULTIMAGG, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DATAULTIMAGG, PPQRY_RETTIUOCAPIT, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_LIST, 716, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_LIST, 124);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTEN. ULT. AGG");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_FORM, 236, 364, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_FORM, 136);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTENTE ULTIMO AGG");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_UTENTULTIAGG, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_UTENTULTIAGG, PPQRY_RETTIUOCAPIT, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_LIST, 468, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_LIST, 124);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_LIST, "DATA ELIMINAZIONE");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_FORM, 4, 388, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_FORM, 136);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELIMINAZ, MyGlb.PANEL_FORM, "DATA ELIMINAZIONE");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DATAELIMINAZ, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DATAELIMINAZ, PPQRY_RETTIUOCAPIT, "A.DATA_ELIMINAZIONE", "DATA_ELIMINAZIONE", 6, 10, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_LIST, 556, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_LIST, 132);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_LIST, "UTEN. ELIMIN.");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_FORM, 244, 388, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_FORM, 144);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENTEELIMIN, MyGlb.PANEL_FORM, "UTENTE ELIMINAZIONE");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_UTENTEELIMIN, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_UTENTEELIMIN, PPQRY_RETTIUOCAPIT, "A.UTENTE_ELIMINAZIONE", "UTENTE_ELIMINAZIONE", 5, 8, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_LIST, 628, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_LIST, 132);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_LIST, "DATA ELAB RETTIFICA");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_FORM, 4, 412, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_FORM, 144);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_DATAELABRETT, MyGlb.PANEL_FORM, "DATA ELAB RETTIFICA");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_DATAELABRETT, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_DATAELABRETT, PPQRY_RETTIUOCAPIT, "A.DATA_ELAB_RETTIFICA", "DATA_ELAB_RETTIFICA", 6, 10, 0, -13997);
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_LIST, 716, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_LIST, 144);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_LIST, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_LIST, "UTEN. ELAB RETTIFICA");
    PAN_ASSEGUOCAPIT.SetRect(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_FORM, 252, 412, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ASSEGUOCAPIT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_FORM, 160);
    PAN_ASSEGUOCAPIT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_FORM, 1);
    PAN_ASSEGUOCAPIT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ASSEGUOCAPIT_UTENELABRETT, MyGlb.PANEL_FORM, "UTENTE ELAB RETTIFICA");
    PAN_ASSEGUOCAPIT.SetFieldPage(PFL_ASSEGUOCAPIT_UTENELABRETT, -1, -1);
    PAN_ASSEGUOCAPIT.SetFieldPanel(PFL_ASSEGUOCAPIT_UTENELABRETT, PPQRY_RETTIUOCAPIT, "A.UTENTE_ELAB_RETTIFICA", "UTENTE_ELAB_RETTIFICA", 5, 8, 0, -13997);
  }

  private void PAN_ASSEGUOCAPIT_InitQueries()
  {
    StringBuffer SQL;

    PAN_ASSEGUOCAPIT.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO, ");
    SQL.append("  A.AL as AL, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as UOGESTINUOVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UO_GEST_NEW~~) ");
    SQL.append("and   (A.OTTICA = ~~TBL_PARAMETRI638.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 5, 2, 3 ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_UOGESTINUOVA, 0, SQL, -1, "");
    PAN_ASSEGUOCAPIT.SetQueryDB(PPQRY_UOGESTINUOVA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ASSEGUOCAPIT.SetMasterTable(PPQRY_UOGESTINUOVA, "SO4_ANA_UNITA_ORGANIZZATIVE");
    PAN_ASSEGUOCAPIT.SetQueryLKE(PPQRY_UOGESTINUOVA, PFL_ASSEGUOCAPIT_PROGUOGESNEW, "SOANUNORPRUO");
    PAN_ASSEGUOCAPIT.SetQueryLKE(PPQRY_UOGESTINUOVA, PFL_ASSEGUOCAPIT_CODUOGESTNEW, "SOANUNORCOUO");
    PAN_ASSEGUOCAPIT.SetQueryLKE(PPQRY_UOGESTINUOVA, PFL_ASSEGUOCAPIT_DESCUOGESNEW, "SOANUNORDEUO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO, ");
    SQL.append("  A.AL as AL, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as UOGESTINUOVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = ~~TBL_PARAMETRI638.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 5, 2, 3 ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_UOGESTINUOVA, 1, SQL, -1, "");
    PAN_ASSEGUOCAPIT.SetQueryHeaderColumn(PPQRY_UOGESTINUOVA, "AL", "SO4 ANA UNITA ORGANIZZATIVE AL");
    PAN_ASSEGUOCAPIT.SetQueryHeaderColumn(PPQRY_UOGESTINUOVA, "GROUPID", "Suddivisione");
    PAN_ASSEGUOCAPIT.SetQueryHeaderColumn(PPQRY_UOGESTINUOVA, "UOGESTINUOVA", "UO Gestione Nuova");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO, ");
    SQL.append("  A.AL as AL, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as UOUTILINUOVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~PROGR_UO_UTILIZZO_NEW~~) ");
    SQL.append("and   (A.OTTICA = ~~TBL_PARAMETRI638.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 5, 2, 3 ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_UOUTILINUOVA, 0, SQL, -1, "");
    PAN_ASSEGUOCAPIT.SetQueryDB(PPQRY_UOUTILINUOVA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ASSEGUOCAPIT.SetMasterTable(PPQRY_UOUTILINUOVA, "SO4_ANA_UNITA_ORGANIZZATIVE");
    PAN_ASSEGUOCAPIT.SetQueryLKE(PPQRY_UOUTILINUOVA, PFL_ASSEGUOCAPIT_PROGUOUTINEW, "SOANUNORPRUO");
    PAN_ASSEGUOCAPIT.SetQueryLKE(PPQRY_UOUTILINUOVA, PFL_ASSEGUOCAPIT_CODUOUTILNEW, "SOANUNORCOUO");
    PAN_ASSEGUOCAPIT.SetQueryLKE(PPQRY_UOUTILINUOVA, PFL_ASSEGUOCAPIT_DESCUOUTINEW, "SOANUNORDEUO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as SOANUNORPRUO, ");
    SQL.append("  A.CODICE_UO as SOANUNORCOUO, ");
    SQL.append("  A.DES_UNITA_ORGANIZZATIVA as SOANUNORDEUO, ");
    SQL.append("  A.AL as AL, ");
    SQL.append("  A.COD_SUDDIVISIONE || ' - ' || A.DES_SUDDIVISIONE as GROUPID, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DES_UNITA_ORGANIZZATIVA as UOUTILINUOVA ");
    SQL.append("from ");
    SQL.append("  SO4_ANA_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = ~~TBL_PARAMETRI638.PARAMOTTINEW~~) ");
    SQL.append("and   (A.DAL <= TRUNC( SYSDATE ) AND NVL(A.AL, TRUNC( SYSDATE )) >= TRUNC( SYSDATE )) ");
    SQL.append("order by 5, 2, 3 ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_UOUTILINUOVA, 1, SQL, -1, "");
    PAN_ASSEGUOCAPIT.SetQueryHeaderColumn(PPQRY_UOUTILINUOVA, "AL", "SO4 ANA UNITA ORGANIZZATIVE AL");
    PAN_ASSEGUOCAPIT.SetQueryHeaderColumn(PPQRY_UOUTILINUOVA, "GROUPID", "Suddivisione");
    PAN_ASSEGUOCAPIT.SetQueryHeaderColumn(PPQRY_UOUTILINUOVA, "UOUTILINUOVA", "UO Utilizzo Nuova");
    PAN_ASSEGUOCAPIT.SetIMDB(IMDB, "PQRY_RETTIUOCAPIT", true);
    PAN_ASSEGUOCAPIT.set_SetString(MyGlb.MASTER_ROWNAME, "RETTIFICA UO CAPITOLI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCR_CAPITOLO as DESCR_CAPITOLO, ");
    SQL.append("  A.OTTICA_OLD as OTTICA_OLD, ");
    SQL.append("  A.OTTICA_NEW as OTTICA_NEW, ");
    SQL.append("  A.PROGR_UO_GEST_OLD as PROGR_UO_GEST_OLD, ");
    SQL.append("  A.COD_UO_GEST_OLD as COD_UO_GEST_OLD, ");
    SQL.append("  A.DESCR_UO_GEST_OLD as DESCR_UO_GEST_OLD, ");
    SQL.append("  A.COD_UO_GEST_OLD || ' - ' || A.DESCR_UO_GEST_OLD as UOGESTIATTUA, ");
    SQL.append("  A.PROGR_UO_GEST_NEW as PROGR_UO_GEST_NEW, ");
    SQL.append("  A.COD_UO_GEST_NEW as COD_UO_GEST_NEW, ");
    SQL.append("  A.DESCR_UO_GEST_NEW as DESCR_UO_GEST_NEW, ");
    SQL.append("  A.PROGR_UO_UTILIZZO_OLD as PROGR_UO_UTILIZZO_OLD, ");
    SQL.append("  A.COD_UO_UTILIZZO_OLD as COD_UO_UTILIZZO_OLD, ");
    SQL.append("  A.DESCR_UO_UTILIZZO_OLD as DESCR_UO_UTILIZZO_OLD, ");
    SQL.append("  A.COD_UO_UTILIZZO_OLD || ' - ' || A.DESCR_UO_UTILIZZO_OLD as UOUTILIATTUA, ");
    SQL.append("  A.PROGR_UO_UTILIZZO_NEW as PROGR_UO_UTILIZZO_NEW, ");
    SQL.append("  A.COD_UO_UTILIZZO_NEW as COD_UO_UTILIZZO_NEW, ");
    SQL.append("  A.DESCR_UO_UTILIZZO_NEW as DESCR_UO_UTILIZZO_NEW, ");
    SQL.append("  A.DATA_SCADENZA_UO as DATA_SCADENZA_UO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ELIMINAZIONE as DATA_ELIMINAZIONE, ");
    SQL.append("  A.UTENTE_ELIMINAZIONE as UTENTE_ELIMINAZIONE, ");
    SQL.append("  A.DATA_ELAB_RETTIFICA as DATA_ELAB_RETTIFICA, ");
    SQL.append("  A.UTENTE_ELAB_RETTIFICA as UTENTE_ELAB_RETTIFICA ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_RETTIUOCAPIT, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  RETTIFICA_UO_CAPITOLI A ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_RETTIUOCAPIT, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   ((A.DATA_ELAB_RETTIFICA IS NULL)) ");
    SQL.append("and   ((A.DATA_ELIMINAZIONE IS NULL)) ");
    SQL.append("and   ((~~PQRY_PARAMETRI639.PARSOLUOGEVU~~ IS NULL) OR ((A.PROGR_UO_GEST_NEW IS NULL))) ");
    SQL.append("and   ((~~PQRY_PARAMETRI639.PARSOLUOUTVU~~ IS NULL) OR ((A.PROGR_UO_UTILIZZO_NEW IS NULL))) ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_RETTIUOCAPIT, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_RETTIUOCAPIT, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_RETTIUOCAPIT, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.COD_UO_GEST_OLD ");
    PAN_ASSEGUOCAPIT.SetQuery(PPQRY_RETTIUOCAPIT, 5, SQL, -1, "");
    PAN_ASSEGUOCAPIT.SetQueryDB(PPQRY_RETTIUOCAPIT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ASSEGUOCAPIT.SetMasterTable(0, "RETTIFICA_UO_CAPITOLI");
    PAN_ASSEGUOCAPIT.AddToSortList(PFL_ASSEGUOCAPIT_ES, true);
    PAN_ASSEGUOCAPIT.AddToSortList(PFL_ASSEGUOCAPIT_CAPITOLO, true);
    PAN_ASSEGUOCAPIT.AddToSortList(PFL_ASSEGUOCAPIT_ARTICOLO, true);
    PAN_ASSEGUOCAPIT.AddToSortList(PFL_ASSEGUOCAPIT_CODUOGESTOLD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ASSEGUOCAPIT.Status() == 2)
    {
      int oldListQBE = PAN_ASSEGUOCAPIT.iUseListQBE;
      PAN_ASSEGUOCAPIT.iUseListQBE = 0;
      PAN_ASSEGUOCAPIT.PanelCommand(Glb.PCM_SEARCH);
      PAN_ASSEGUOCAPIT.PanelCommand(Glb.PCM_FIND);
      PAN_ASSEGUOCAPIT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ASSEGUOCAPIT) PAN_ASSEGUOCAPIT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_ASSEGUOCAPIT) PAN_ASSEGUOCAPIT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_ASSEGUOCAPIT) PAN_ASSEGUOCAPIT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ASSEGUOCAPIT) PAN_ASSEGUOCAPIT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ASSEGUOCAPIT) PAN_ASSEGUOCAPIT_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_ASSEGUOCAPIT) PAN_ASSEGUOCAPIT_AfterFind(CmdFind);
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
    if (SrcObj == PAN_ASSEGUOCAPIT) PAN_ASSEGUOCAPIT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
