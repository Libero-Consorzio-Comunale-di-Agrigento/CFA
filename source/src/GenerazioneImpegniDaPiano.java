// **********************************************
// Generazione Impegni Da Piano
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class GenerazioneImpegniDaPiano extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARAMFILTRI_ESERCIZIO = 0;
  private static int PFL_PARAMFILTRI_CAPITOLO1 = 1;
  private static int PFL_PARAMFILTRI_ARTICOLO1 = 2;
  private static int PFL_PARAMFILTRI_ETICHSCELCAP = 3;
  private static int PFL_PARAMFILTRI_INFOCAP = 4;
  private static int PFL_PARAMFILTRI_FINANZIAMEN1 = 5;
  private static int PFL_PARAMFILTRI_IMPEGGIAGENE = 6;
  private static int PFL_PARAMFILTRI_DESCRIFINANZ = 7;

  private static int PPQRY_PATS1 = 0;

  private static int PPQRY_FINANZIAMEN1 = 1;


  IDPanel PAN_PARAMFILTRI;
  private static int PFL_GENEIMPDAPIA_ESERCIZIPLUR = 0;
  private static int PFL_GENEIMPDAPIA_CAPITOLO = 1;
  private static int PFL_GENEIMPDAPIA_ARTICOLO = 2;
  private static int PFL_GENEIMPDAPIA_CAPDESCRIZIO = 3;
  private static int PFL_GENEIMPDAPIA_INFOCAPITOLO = 4;
  private static int PFL_GENEIMPDAPIA_VOCEECONOMIC = 5;
  private static int PFL_GENEIMPDAPIA_DESCRIZOPERA = 6;
  private static int PFL_GENEIMPDAPIA_CORRISENTRAT = 7;
  private static int PFL_GENEIMPDAPIA_FINANZIAMENT = 8;
  private static int PFL_GENEIMPDAPIA_IMPORTO = 9;
  private static int PFL_GENEIMPDAPIA_REISCDASTANZ = 10;
  private static int PFL_GENEIMPDAPIA_IMPGENERATO = 11;
  private static int PFL_GENEIMPDAPIA_CRONOPROGRID = 12;
  private static int PFL_GENEIMPDAPIA_PROGREIMPUTA = 13;
  private static int PFL_GENEIMPDAPIA_OPERA = 14;
  private static int PFL_GENEIMPDAPIA_ENTRESIGDIFF = 15;

  private static int PPQRY_TESTATCRONOP = 0;

  private static int PPQRY_OPERE = 1;
  private static int PPQRY_CAP = 2;
  private static int PPQRY_DUAL = 3;
  private static int PPQRY_INFOCAPITOLO = 4;

  private static int PPQRY_FINANZIAMENT = 5;


  IDPanel PAN_GENEIMPDAPIA;
  private static int GRP_PARAMELAB_DELIBERA = 0;

  private static int PFL_PARAMELAB_TIPOELABORAZ = 0;
  private static int PFL_PARAMELAB_ETICHEANNULL = 1;
  private static int PFL_PARAMELAB_ETICHEELABOR = 2;
  private static int PFL_PARAMELAB_SEDEDELIBERA = 3;
  private static int PFL_PARAMELAB_NUMERODELIBE = 4;
  private static int PFL_PARAMELAB_ANNODELIBERA = 5;
  private static int PFL_PARAMELAB_APRI = 6;
  private static int PFL_PARAMELAB_DACRONOPROGR = 7;

  private static int PPQRY_PATS7 = 0;


  IDPanel PAN_PARAMELAB;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PATS(IMDB);
    //
    //
    Init_PQRY_PATS1(IMDB);
    Init_PQRY_PATS1_RS(IMDB);
    Init_PQRY_TESTATCRONOP(IMDB);
    Init_PQRY_PATS7(IMDB);
    Init_PQRY_PATS7_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PATS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PATS, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PATS, "TBL_PATS");
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGIMGIGE, "NOMOGGIMGIGE");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGIMGIGE,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGTIPELA, "NOMOGGTIPELA");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGTIPELA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGDACRO, "NOMEOGGDACRO");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS,IMDBDef3.FLD_PATS_NOMEOGGDACRO,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PATS, 0);
  }

  private static void Init_PQRY_PATS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS1, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS1, "PQRY_PATS1");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMOGGIMGIGE, "NOMOGGIMGIGE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1,IMDBDef11.PQSL_PATS1_NOMOGGIMGIGE,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PATS1, 0);
  }

  private static void Init_PQRY_PATS1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS1_RS, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS1_RS, "PQRY_PATS1_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGEFINA, "NOMEOGGEFINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMEOGGEFINA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMOGGIMGIGE, "NOMOGGIMGIGE");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS1_RS,IMDBDef11.PQSL_PATS1_NOMOGGIMGIGE,5,2,0);
  }

  private static void Init_PQRY_TESTATCRONOP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_TESTATCRONOP, 11);
    IMDB.set_TblCode(IMDBDef11.PQRY_TESTATCRONOP, "PQRY_TESTATCRONOP");
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_CRONOPROGRAMMA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECPIACRESPL, "RECPIACRESPL");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECPIACRESPL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROCAP, "RECIMPCROCAP");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROCAP,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROART, "RECIMPCROART");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROART,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECPIACROFIN, "RECPIACROFIN");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECPIACROFIN,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECORDIMPORT, "RECORDIMPORT");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECORDIMPORT,3,28,6);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_REISCDASTANZ, "REISCDASTANZ");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_REISCDASTANZ,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_IMPGENERATO, "IMPGENERATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_IMPGENERATO,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECIMPCRPRIM, "RECIMPCRPRIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RECIMPCRPRIM,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RETECRENESDI, "RETECRENESDI");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONOP,IMDBDef11.PQSL_TESTATCRONOP_RETECRENESDI,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_TESTATCRONOP, 0);
  }

  private static void Init_PQRY_PATS7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS7, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS7, "PQRY_PATS7");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGTIPELA, "NOMOGGTIPELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGTIPELA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMEOGGDACRO, "NOMEOGGDACRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7,IMDBDef11.PQSL_PATS7_NOMEOGGDACRO,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PATS7, 0);
  }

  private static void Init_PQRY_PATS7_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS7_RS, 5);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS7_RS, "PQRY_PATS7_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGTIPELA, "NOMOGGTIPELA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGTIPELA,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMEOGGDACRO, "NOMEOGGDACRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS7_RS,IMDBDef11.PQSL_PATS7_NOMEOGGDACRO,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public GenerazioneImpegniDaPiano(MyWebEntryPoint w, IMDBObj imdb)
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
  public GenerazioneImpegniDaPiano()
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
    FormIdx = MyGlb.FRM_GENEIMPDAPIA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "4C4C5CE2-0C92-4C03-A40D-631841EDC719";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 800;
    DesignHeight = 482;
    set_Caption(new IDVariant("Generazione Impegni da Piano"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1084;
    Frames[1].Height = 456;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.131579;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1084;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param Filtri";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1084;
    Frames[2].FixedHeight = 60;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMFILTRI = new IDPanel(w, this, 2, "PAN_PARAMFILTRI");
    Frames[2].Content = PAN_PARAMFILTRI;
    PAN_PARAMFILTRI.Lockable = false;
    PAN_PARAMFILTRI.iLocked = false;
    PAN_PARAMFILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMFILTRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "FCF43BF2-EF38-40B4-B71B-84EC5AB13BA8");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 856, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMFILTRI.InitStatus = 2;
    PAN_PARAMFILTRI_Init();
    PAN_PARAMFILTRI_InitFields();
    PAN_PARAMFILTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1084;
    Frames[3].Height = 396;
    Frames[3].Vertical = true;
    Frames[3].FormFactor = 0.828283;
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[3].ChildFrame1 = Frames[4];
    Frames[4].Width = 1084;
    Frames[4].Height = 328;
    Frames[4].Caption = "Generazione Impegni da Piano";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 328;
    PAN_GENEIMPDAPIA = new IDPanel(w, this, 4, "PAN_GENEIMPDAPIA");
    Frames[4].Content = PAN_GENEIMPDAPIA;
    PAN_GENEIMPDAPIA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENEIMPDAPIA.VS = MainFrm.VisualStyleList;
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0A3C7A52-36CE-45FF-B275-75162D6B392D");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1076, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENEIMPDAPIA.InitStatus = 2;
    PAN_GENEIMPDAPIA_Init();
    PAN_GENEIMPDAPIA_InitFields();
    PAN_GENEIMPDAPIA_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[3].ChildFrame2 = Frames[5];
    Frames[5].Width = 1084;
    Frames[5].Height = 68;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Param Elab";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 68;
    PAN_PARAMELAB = new IDPanel(w, this, 5, "PAN_PARAMELAB");
    Frames[5].Content = PAN_PARAMELAB;
    PAN_PARAMELAB.Lockable = false;
    PAN_PARAMELAB.iLocked = false;
    PAN_PARAMELAB.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMELAB.VS = MainFrm.VisualStyleList;
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1084-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "314C5FCA-6CE5-4EC5-BFA9-5A2712ADB565");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 532, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMELAB.InitStatus = 1;
    PAN_PARAMELAB_Init();
    PAN_PARAMELAB_InitFields();
    PAN_PARAMELAB_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PATS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEIMPDAPIA_PATS1();
      }
      if (IMDB.TblModified(IMDBDef3.TBL_PATS, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        GENEIMPDAPIA_PATS7();
      }
      PAN_PARAMFILTRI.UpdatePanel(MainFrm);
      PAN_GENEIMPDAPIA.UpdatePanel(MainFrm);
      PAN_PARAMELAB.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_ELENCOFINANZ && flRis && IdxPanelActived == PAN_PARAMFILTRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMFILTRI_FINANZIAMEN1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMELAB.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMELAB_APRI) {
      }
    }
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
    return (obj instanceof GenerazioneImpegniDaPiano);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? GenerazioneImpegniDaPiano.class.getName() : (Glb.ClassWithPackage(GenerazioneImpegniDaPiano.class) ? GenerazioneImpegniDaPiano.class.getName().substring(GenerazioneImpegniDaPiano.class.getPackage().getName().length() + 1) : GenerazioneImpegniDaPiano.class.getName()));
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
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Body
      // Corpo Procedura
      // 
      LOAD_PATSDELETE();
      IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGIMGIGE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGTIPELA, 0, (new IDVariant("IF")));
      IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGDACRO, 0, (new IDVariant("NO")));
      if (MainFrm.FINANZIAMENT.booleanValue())
      {
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      SQL = new StringBuffer();
      SQL.append("select distinct ");
      SQL.append("  A.CRONOPROGRAMMA_ID as CRONOPROGRID, ");
      SQL.append("  A.PROGRESSIVO_IMPUTAZIONE as PROGREIMPUTA ");
      SQL.append("from ");
      SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI A ");
      C4 = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!C4.EOF()) C4.MoveNext();
      while (!C4.EOF())
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.GENERACRONOPIANOCOMPTMP(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), C4.Get("CRONOPROGRID"), C4.Get("PROGREIMPUTA"), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return;
        }
        C4.MoveNext();
      }
      C4.Close();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "Load", _e);
    }
  }

  // **********************************************************************
  // Pats: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PATSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGIMGIGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGTIPELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGDACRO, 0, new IDVariant());
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
      UNLOAD_PATSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pats: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PATSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEFINA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGIMGIGE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGTIPELA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGDACRO, 0, new IDVariant());
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

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_ELENCOFINANZ)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEFINA, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME24, IMDBDef7.PQSL_FINANZIAME24_FINANZCODICE, 0));
      }
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCCADACAECUJ)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Generazione Impegni da Piano On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENEIMPDAPIA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_GENEIMPDAPIA);
      // 
      // Generazione Impegni da Piano On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_GENEIMPDAPIA.set_ToolTip(Glb.OBJ_FIELD,PFL_GENEIMPDAPIA_CAPDESCRIZIO,(new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_CAPDESCRIZIO))).stringValue()); 
      PAN_GENEIMPDAPIA.set_ToolTip(Glb.OBJ_FIELD,PFL_GENEIMPDAPIA_DESCRIZOPERA,(new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_DESCRIZOPERA))).stringValue()); 
      PAN_GENEIMPDAPIA.set_ToolTip(Glb.OBJ_FIELD,PFL_GENEIMPDAPIA_FINANZIAMENT,(new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_FINANZIAMENT))).stringValue()); 
      PAN_GENEIMPDAPIA.set_ToolTip(Glb.OBJ_FIELD,PFL_GENEIMPDAPIA_VOCEECONOMIC,(new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_VOCEECONOMIC))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "GenerazioneImpegnidaPianoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Param Filtri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMFILTRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Filtri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMFILTRI_FINANZIAMEN1)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEFINA, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  FINANZIAMENTI A ");
          SQL.append("where (A.CODICE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEFINA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Finanziamento inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEFINA, 0, (new IDVariant()));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAMFILTRI_CAPITOLO1)), true) || Column.equals((new IDVariant(PFL_PARAMFILTRI_ARTICOLO1)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Capitolo inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "ParamFiltriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Param Elab On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMELAB_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Elab On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMELAB_SEDEDELIBERA)), true) || Column.equals((new IDVariant(PFL_PARAMELAB_NUMERODELIBE)), true) || Column.equals((new IDVariant(PFL_PARAMELAB_ANNODELIBERA)), true) && FieldWasModified.booleanValue())
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0)));
        }
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, 0))))
        {
          v_SEDEDEL = (new IDVariant());
          v_ANNODEL = (new IDVariant());
          v_NUMERODEL = (new IDVariant());
          v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0));
          v_ANNODEL = IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, 0);
          v_NUMERODEL = IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, 0);
          MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("NO")));
          IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0, new IDVariant(v_SEDEDEL));
          IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, 0, new IDVariant(v_ANNODEL));
          IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, 0, new IDVariant(v_NUMERODEL));
          IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMEOGGDACRO, 0, (new IDVariant("NO")));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMELAB_DACRONOPROGR)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "ParamElabOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Param Elab On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMELAB_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMELAB);
      // 
      // Param Elab On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMEOGGDACRO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_APRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAMELAB.SetFlags (Glb.OBJ_FIELD, PFL_PARAMELAB_APRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "ParamElabOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Finanziamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Finanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamento Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_ELENCOFINANZ, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "Finanziamento", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Capitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitolo Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGPROUO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGEESER, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_IN15, IMDBDef1.FLD_IN15_NOMEOGGETTES, 0, (new IDVariant("S")));
        MainFrm.Show(MyGlb.FRM_SCCADACAECUJ, (new IDVariant(-1)).intValue(), this); 
      }
      else
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
        MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "Capitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Cap
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Cap Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARPROUNIORG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "InfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Annulla
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Annulla ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Body
      // Corpo Procedura
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "Annulla", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Corrispondenza Entrata
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CorrispondenzaEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Corrispondenza Entrata Body
      // Corpo Procedura
      // 
      if (IDL.NullValue((new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_CORRISENTRAT))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && IDL.NullValue((new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_CORRISENTRAT))),(new IDVariant("OK"))).compareTo((new IDVariant("OK")), true)!=0)
      {
        IDVariant v_AVVISO = null;
        v_AVVISO = (new IDVariant());
        if (IDL.NullValue((new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_CORRISENTRAT))),(new IDVariant(""))).equals((new IDVariant("E1")), true))
        {
          IDVariant v_AVVISOE1 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE1 = (new IDVariant("Non è stata indica l'Entrata per il Piano"));
          v_AVVISO = new IDVariant(v_AVVISOE1);
        }
        else if (IDL.NullValue((new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_CORRISENTRAT))),(new IDVariant(""))).equals((new IDVariant("E2")), true))
        {
          IDVariant v_AVVISOE2 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE2 = (new IDVariant("Il totale degli importi del Piano non coincide con il totale importi del folder Entrata"));
          v_AVVISO = new IDVariant(v_AVVISOE2);
        }
        else if (IDL.NullValue((new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_CORRISENTRAT))),(new IDVariant(""))).equals((new IDVariant("E3")), true))
        {
          IDVariant v_AVVISOE3 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE3 = (new IDVariant("L'importo del Piano non coincide con il totale importi del folder Entrata con esercizio spesa uguale all'anno pluriennale della riga"));
          v_AVVISO = new IDVariant(v_AVVISOE3);
        }
        else if (IDL.NullValue((new IDVariant(PAN_GENEIMPDAPIA.FieldText(PFL_GENEIMPDAPIA_CORRISENTRAT))),(new IDVariant(""))).equals((new IDVariant("E4")), true))
        {
          IDVariant v_AVVISOE4 = new IDVariant(0,IDVariant.STRING);
          v_AVVISOE4 = (new IDVariant("Esistono Variazioni sul Piano per le quali non è stata generata la Variazione di Bilancio"));
          v_AVVISO = new IDVariant(v_AVVISOE4);
        }
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "CorrispondenzaEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C5;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Corpo Procedura
      // 
      IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
      v_AVVISO = (new IDVariant("Generare gli impegni per i piani visibili in elenco?"));
      if (!(MainFrm.MessageConfirm(v_AVVISO)))
      {
        return 0;
      }
      else
      {
        C5 = PAN_GENEIMPDAPIA.MasterRS();
        if (C5.size()>0) CurPos = C5.getRow(); else CurPos = 0;
        if (!C5.Bof()) PAN_GENEIMPDAPIA.GotoFirst();
        while (!PAN_GENEIMPDAPIA.RSEOF())
        {
          IDVariant v_VCAPVOCEECON = null;
          v_VCAPVOCEECON = (new IDVariant());
          if (C5.Get("RETECRENESDI").equals((new IDVariant("SI")), true))
          {
            IDVariant v_VCROVERENTSP = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  CRONO_VERIFICA_ENTRATA_SPESA(" + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("CRONOPROGRAMMA_ID"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("RECIMPCRPRIM"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("RECPIACROFIN"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(C5.Get("RECPIACRESPL"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ",'SI') as CVESSERTCCIR ");
            SQL.append("from ");
            SQL.append("  DUAL A ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCROVERENTSP = QV.Get("CVESSERTCCIR", IDVariant.STRING) ;
            }
            QV.Close();
            if (v_VCROVERENTSP.compareTo((new IDVariant("OK")), true)!=0)
            {
              IDVariant v_AVVISOANOMAL = new IDVariant(0,IDVariant.STRING);
              v_AVVISOANOMAL = (new IDVariant("Esistono Anomalie sul Piano del Cronoprogramma"));
              MainFrm.set_AlertMessage(v_AVVISOANOMAL); 
              return 0;
            }
          }
          if (!(MainFrm.SIOPEATTIARM.booleanValue()))
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.VOCE_ECON as CAPVOCEECON ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.ARTICOLO = " + IDL.CSql(C5.Get("RECIMPCROART"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(C5.Get("RECIMPCROCAP"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'S') ");
            SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPVOCEECON = QV.Get("CAPVOCEECON", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (IDL.IsNull(v_VCAPVOCEECON))
            {
              IDVariant v_MESSAGGIO = new IDVariant(0,IDVariant.STRING);
              v_MESSAGGIO = (new IDVariant("E' necessario inserire la Voce Economica per tutti i capitoli degli impegni che verranno generati"));
              MainFrm.set_AlertMessage(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Capitolo")), (new IDVariant(" "))), IDL.ToString(C5.Get("RECIMPCROCAP"))), (new IDVariant("/"))), IDL.ToString(C5.Get("RECIMPCROART"))), (new IDVariant("<BR/>"))), v_MESSAGGIO)); 
              return 0;
            }
          }
          PAN_GENEIMPDAPIA.GotoNext();
        }
        if (CurPos>0) C5.absolute(CurPos);
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CRONOGENERAIMPEGNI(IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEESER, 0), IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGECAPI, 0), IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEARTI, 0), IMDB.Value(IMDBDef11.PQRY_PATS1, IMDBDef11.PQSL_PATS1_NOMEOGGEFINA, 0), IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGTIPELA, 0), IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMEOGGDACRO, 0), IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGSEDDEL, 0), IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef11.PQRY_PATS7, IMDBDef11.PQSL_PATS7_NOMOGGANNDEL, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_CONFERMA = new IDVariant(0,IDVariant.STRING);
          v_CONFERMA = (new IDVariant("Elaborazione eseguita"));
          MainFrm.set_AlertMessage(v_CONFERMA); 
          PAN_GENEIMPDAPIA.PanelCommand(Glb.PCM_REQUERY);
        }
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  WRK_IMP_NO_RIL_ECO A ");
        SQL.append("where (A.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
          v_NOMESTAMPA = (new IDVariant("Elenco_Imp_No_Ril_eco"));
          MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
          MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Delibera
  // **********************************************************************
  public int ApriDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Delibera Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Capitolo
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int InfoCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Capitolo Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_TESTATCRONOP, IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROCAP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_TESTATCRONOP, IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROART, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMESERCIZ, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONOP, IMDBDef11.PQSL_TESTATCRONOP_RECPIACRESPL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONOP, IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROCAP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONOP, IMDBDef11.PQSL_TESTATCRONOP_RECIMPCROART, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("GenerazioneImpegniDaPiano", "InfoCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pats
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENEIMPDAPIA_PATS1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PATS1_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PATS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PATS, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PATS1_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PATS1_RS, 0, IMDBDef3.TBL_PATS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS1_RS, 0, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS1_RS, 1, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS1_RS, 2, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS1_RS, 3, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGEFINA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS1_RS, 4, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGIMGIGE, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PATS, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PATS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PATS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PATS1_RS, 0);
  }

  // **********************************************************************
  // Pats
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void GENEIMPDAPIA_PATS7() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PATS7_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PATS, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PATS, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PATS7_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PATS7_RS, 0, IMDBDef3.TBL_PATS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS7_RS, 0, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGTIPELA, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS7_RS, 1, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS7_RS, 2, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS7_RS, 3, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMOGGANNDEL, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS7_RS, 4, 0, IMDBDef3.TBL_PATS, IMDBDef3.FLD_PATS_NOMEOGGDACRO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PATS, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PATS, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PATS, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PATS7_RS, 0);
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
  private void PAN_PARAMFILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMFILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMFILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMFILTRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMFILTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMFILTRI);
    // Stub
  }

  private void PAN_PARAMFILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMFILTRI_ETICHSCELCAP)
    {
      this.IdxPanelActived = this.PAN_PARAMFILTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Capitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMFILTRI_INFOCAP)
    {
      this.IdxPanelActived = this.PAN_PARAMFILTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCap();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMFILTRI_FINANZIAMEN1)
    {
      this.IdxPanelActived = this.PAN_PARAMFILTRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Finanziamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMFILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMFILTRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMFILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMFILTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_GENEIMPDAPIA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENEIMPDAPIA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENEIMPDAPIA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENEIMPDAPIA, Cancel);
    // Stub
  }

  private void PAN_GENEIMPDAPIA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENEIMPDAPIA_INFOCAPITOLO)
    {
      this.IdxPanelActived = this.PAN_GENEIMPDAPIA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENEIMPDAPIA_CORRISENTRAT)
    {
      this.IdxPanelActived = this.PAN_GENEIMPDAPIA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      CorrispondenzaEntrata();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENEIMPDAPIA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_GENEIMPDAPIA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENEIMPDAPIA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMELAB_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMELAB, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMELAB_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMELAB, Cancel);
    // Stub
  }

  private void PAN_PARAMELAB_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMELAB_ETICHEANNULL)
    {
      this.IdxPanelActived = this.PAN_PARAMELAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Annulla();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMELAB_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_PARAMELAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMELAB_APRI)
    {
      this.IdxPanelActived = this.PAN_PARAMELAB.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMELAB_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMELAB_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMELAB_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMELAB_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMFILTRI_Init()
  {

    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, "F09429E6-261F-4A24-841E-B315736A37EF");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, "Esercizio");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, "F789E9A6-4F27-4F1E-B151-50F6FEB42BCD");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, "Capitolo/Art.");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, "61611A6C-5324-45FD-80AE-8FD8CAE0F976");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, "/");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, "CFD894AE-A1F0-4AA7-8C4F-AC15195A7072");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMFILTRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, 0, "wsearch1.gif", false);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, "48E826AB-7B33-455D-9F4A-E30278140632");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMFILTRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, 0, "info.gif", false);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, "300B34A8-5709-4337-B6D6-602DD4702992");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, "Finanziamento");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, "FCEE28CE-D813-4EB8-A19A-C1627E5C5A49");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, "Impegni già Generati");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, "Cronoprogrammi che hanno almeno un Piano con Anno Plur maggiore o uguale all'Esercizio del contesto");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMFILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, "66AD87D4-9632-456B-B5C4-5795B037FCAC");
    PAN_PARAMFILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, "Descrizione Finanziamento");
    PAN_PARAMFILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, "");
    PAN_PARAMFILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARAMFILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
  }

  private void PAN_PARAMFILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, 132);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_LIST, "Eserc.");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, 32, 4, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, 60);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_ESERCIZIO, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_ESERCIZIO, PPQRY_PATS1, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_LIST, 56);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_FORM, 8, 28, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_FORM, 84);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_CAPITOLO1, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_CAPITOLO1, PPQRY_PATS1, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_LIST, 52);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_LIST, "/");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_FORM, 244, 28, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_FORM, 16);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ARTICOLO1, MyGlb.PANEL_FORM, "/");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_ARTICOLO1, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_ARTICOLO1, PPQRY_PATS1, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, MyGlb.PANEL_LIST, 340, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, MyGlb.PANEL_FORM, 292, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_ETICHSCELCAP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_ETICHSCELCAP, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_ETICHSCELCAP, -1, "", "ETICHSCELCAP", 0, 0, 0, -13997);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, MyGlb.PANEL_LIST, 348, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, MyGlb.PANEL_LIST, 0);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, MyGlb.PANEL_FORM, 312, 32, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, MyGlb.PANEL_FORM, 0);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_INFOCAP, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_INFOCAP, -1, "", "INFOCAP", 0, 0, 0, -13997);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_LIST, 92);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_FORM, 364, 28, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_FORM, 92);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_FINANZIAMEN1, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_FINANZIAMEN1, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_FINANZIAMEN1, PPQRY_PATS1, "A.NOMEOGGEFINA", "NOMEOGGEFINA", 1, 5, 0, -13997);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_LIST, 80);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_LIST, "Impegni già Generati");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_FORM, 324, 4, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_FORM, 132);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_IMPEGGIAGENE, MyGlb.PANEL_FORM, "Impegni già Generati");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_IMPEGGIAGENE, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_IMPEGGIAGENE, PPQRY_PATS1, "A.NOMOGGIMGIGE", "NOMOGGIMGIGE", 5, 2, 0, -13997);
    PAN_PARAMFILTRI.SetValueListItem(PFL_PARAMFILTRI_IMPEGGIAGENE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMFILTRI.SetValueListItem(PFL_PARAMFILTRI_IMPEGGIAGENE, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 176);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_LIST, 2);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_LIST, "Descrizione Finanziamento");
    PAN_PARAMFILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 516, 28, 292, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMFILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 176);
    PAN_PARAMFILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMFILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMFILTRI_DESCRIFINANZ, MyGlb.PANEL_FORM, "Descrizione Finanziamento");
    PAN_PARAMFILTRI.SetFieldPage(PFL_PARAMFILTRI_DESCRIFINANZ, -1, -1);
    PAN_PARAMFILTRI.SetFieldPanel(PFL_PARAMFILTRI_DESCRIFINANZ, PPQRY_FINANZIAMEN1, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
  }

  private void PAN_PARAMFILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMFILTRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~NOMEOGGEFINA~~) ");
    PAN_PARAMFILTRI.SetQuery(PPQRY_FINANZIAMEN1, 0, SQL, -1, "");
    PAN_PARAMFILTRI.SetQueryDB(PPQRY_FINANZIAMEN1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMFILTRI.SetMasterTable(PPQRY_FINANZIAMEN1, "FINANZIAMENTI");
    PAN_PARAMFILTRI.SetIMDB(IMDB, "PQRY_PATS1", true);
    PAN_PARAMFILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMFILTRI.SetQueryIMDB(PPQRY_PATS1, IMDBDef11.PQRY_PATS1_RS, IMDBDef3.TBL_PATS);
    JustLoaded = true;
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_ESERCIZIO, IMDBDef3.FLD_PATS_NOMEOGGEESER);
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_CAPITOLO1, IMDBDef3.FLD_PATS_NOMEOGGECAPI);
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_ARTICOLO1, IMDBDef3.FLD_PATS_NOMEOGGEARTI);
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_FINANZIAMEN1, IMDBDef3.FLD_PATS_NOMEOGGEFINA);
    PAN_PARAMFILTRI.SetFieldPrimaryIndex(PFL_PARAMFILTRI_IMPEGGIAGENE, IMDBDef3.FLD_PATS_NOMOGGIMGIGE);
    PAN_PARAMFILTRI.SetMasterTable(0, "PATS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMFILTRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMFILTRI.iUseListQBE;
      PAN_PARAMFILTRI.iUseListQBE = 0;
      PAN_PARAMFILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMFILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMFILTRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_GENEIMPDAPIA_Init()
  {

    PAN_GENEIMPDAPIA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENEIMPDAPIA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENEIMPDAPIA.SetSize(MyGlb.OBJ_FIELD, 16);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, "E746F86C-F7D7-4874-B6F3-EF99331DC4DE");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, "Esercizio");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISKEY, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, "B71E64B9-FAF4-4F29-8B1F-1566B41204D6");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, "Capitolo");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, "78E859FE-092B-42C7-A3CC-4E5C5DC47036");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, "Art.");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, "029FDE44-B83A-43FC-9EDC-D934788587E7");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, "Descrizione");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, "68EA2EAC-1117-4472-96E9-A2AE370DF9B4");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, " ");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.VIS_HYPELINKIMMA);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, "11B1964D-284D-45CA-91EC-352AEAB55096");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, "Voce Economica");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, "B5864C4D-2D8B-4EE5-8809-4259973018C2");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, "Opera");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.VIS_VISULOOUPCF4);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, "5E9411EA-A699-481F-A0E3-57FFD1AC6F4E");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, " ");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.VIS_HYPELINKIMMA);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, "730700EE-A2C6-4D77-A530-D87DE7873AD5");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, "Finanziamento");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISKEY, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, "E2B2DF88-AF08-4A59-8133-219AA49540CF");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, "Importo");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISAGGR | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, "12669595-0383-4DFB-89F2-A2B4933FD5AC");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, "Reiscr. da Stn");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.VIS_CHECKSTYLE);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, "DD1252D2-66C1-4562-9CC0-B8F65E9CFBEA");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, "Imp. Gen.");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.VIS_CHECKSTYLE);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, "6CCEC1DB-7802-4E83-AA57-5820E89345DD");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, "CRONOPROGRAMMA ID");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, "7074B468-C147-4068-B1CC-B3378ED5A835");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, "PROGRESSIVO IMPUTAZIONE");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, "DF18E8E9-19D4-48BC-A462-39A6EE323368");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, "Opera Progetto");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, 0, -1);
    PAN_GENEIMPDAPIA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, "6663EE3E-8421-4018-AC6D-BE38525FFA2C");
    PAN_GENEIMPDAPIA.set_Header(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, "ENTRATA ESIG DIFF");
    PAN_GENEIMPDAPIA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, "");
    PAN_GENEIMPDAPIA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.VIS_NORMFIELPADR);
    PAN_GENEIMPDAPIA.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_GENEIMPDAPIA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_LIST, 100);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_LIST, "Esercizio");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_FORM, 4, 52, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_FORM, 100);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ESERCIZIPLUR, MyGlb.PANEL_FORM, "Esercizio");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_ESERCIZIPLUR, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_ESERCIZIPLUR, PPQRY_TESTATCRONOP, "D.ESERCIZIO_PLUR", "RECPIACRESPL", 1, 4, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_LIST, 60, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_FORM, 4, 76, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_CAPITOLO, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_CAPITOLO, PPQRY_TESTATCRONOP, "C.CAPITOLO", "RECIMPCROCAP", 3, 16, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_LIST, 172, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_FORM, 4, 100, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_ARTICOLO, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_ARTICOLO, PPQRY_TESTATCRONOP, "C.ARTICOLO", "RECIMPCROART", 1, 2, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_LIST, 204, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_LIST, 108);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_LIST, "Descrizione");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_FORM, 4, 196, 468, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_FORM, 108);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_FORM, 2);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CAPDESCRIZIO, MyGlb.PANEL_FORM, "Descrizione");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_CAPDESCRIZIO, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_CAPDESCRIZIO, PPQRY_CAP, "A.DESCRIZIONE", "CAPDESCRIZIO", 5, 140, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_LIST, 348, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_LIST, 116);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_LIST, " ");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_FORM, 4, 304, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_FORM, 116);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_INFOCAPITOLO, MyGlb.PANEL_FORM, " ");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_INFOCAPITOLO, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_INFOCAPITOLO, PPQRY_INFOCAPITOLO, "'I'", "INFOCAPITOLO", 5, 1, 0, -13997);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_INFOCAPITOLO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_LIST, 368, 36, 112, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_LIST, 124);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_LIST, "Voce Economica");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_FORM, 4, 232, 632, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_FORM, 124);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_VOCEECONOMIC, MyGlb.PANEL_FORM, "Voce Economica");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_VOCEECONOMIC, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_VOCEECONOMIC, PPQRY_CAP, "DECODE(A.VOCE_ECON, to_number(NULL), '', TO_CHAR ( A.VOCE_ECON ) || ' - ' || B.DESCRIZIONE)", "CAPVOCEECONO", 5, 99, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_LIST, 480, 36, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_LIST, 224);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_FORM, 4, 4, 660, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_FORM, 224);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_FORM, 2);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_DESCRIZOPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_DESCRIZOPERA, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_DESCRIZOPERA, PPQRY_OPERE, "TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE", "OPEREDESCRIZ", 5, 302, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_LIST, 656, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_LIST, 176);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_LIST, " ");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_FORM, 4, 280, 684, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_FORM, 176);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CORRISENTRAT, MyGlb.PANEL_FORM, " ");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_CORRISENTRAT, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_CORRISENTRAT, PPQRY_DUAL, "DECODE(~~RETECRENESDI~~, 'SI', CRONO_VERIFICA_ENTRATA_SPESA(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~CRONOPROGRAMMA_ID~~,~~RECIMPCRPRIM~~,~~RECPIACROFIN~~,~~RECPIACRESPL~~,'SI'), 'OK')", "CORRISENTRAT", 5, 99, 0, -13997);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_CORRISENTRAT, (new IDVariant("OK")), "Faccina Verde", "", "smileverde.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_CORRISENTRAT, (new IDVariant("E1")), "Faccina rossa (Errore 1)", "Non è stata indica l'Entrata per il Piano", "smilerosso.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_CORRISENTRAT, (new IDVariant("E2")), "Faccina rossa (Errore 2)", "Il totale degli importi del Piano non coincide con il totale importi del folder Entrata", "smilerosso.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_CORRISENTRAT, (new IDVariant("E3")), "Faccina rossa (Errore 3)", "L'importo del Piano non coincide con il totale importi del folder Entrata con esercizio spesa uguale all'anno pluriennale della riga", "smilerosso.gif", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_CORRISENTRAT, (new IDVariant("E4")), "Faccina rossa (Errore 4)", "Esistono Variazioni sul Piano per le quali non è stata generata la Variazione di Bilancio", "smilerosso.gif", -1);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_LIST, 680, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_LIST, 100);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_FORM, 100);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_FINANZIAMENT, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_FINANZIAMENT, PPQRY_TESTATCRONOP, "D.FINANZIAMENTO", "RECPIACROFIN", 1, 5, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_LIST, 868, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_FORM, 4, 148, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_IMPORTO, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldUnbound(PFL_GENEIMPDAPIA_IMPORTO, true);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_IMPORTO, PPQRY_TESTATCRONOP, "SUM(E.IMPORTO)", "RECORDIMPORT", 3, 28, 6, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_LIST, 992, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_LIST, 176);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_LIST, "Reiscr. da Stn");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_FORM, 4, 256, 684, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_FORM, 176);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_REISCDASTANZ, MyGlb.PANEL_FORM, "Reiscr. da Stn");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_REISCDASTANZ, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldUnbound(PFL_GENEIMPDAPIA_REISCDASTANZ, true);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_REISCDASTANZ, PPQRY_TESTATCRONOP, "CASE WHEN E.ANNO_FINANZIAMENTO < E.ESERCIZIO_PLUR THEN 'SI' ELSE NULL END", "REISCDASTANZ", 5, 99, 0, -13997);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_REISCDASTANZ, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_REISCDASTANZ, (new IDVariant()), "Null", "", "", -1);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_LIST, 1040, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_LIST, 88);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_LIST, "Imp. Gen.");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_FORM, 4, 172, 596, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_FORM, 88);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_IMPGENERATO, MyGlb.PANEL_FORM, "Imp. Gen.");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_IMPGENERATO, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldUnbound(PFL_GENEIMPDAPIA_IMPGENERATO, true);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_IMPGENERATO, PPQRY_TESTATCRONOP, "DECODE(D.NUMERO_IMP_PURO, to_number(NULL), 'NO', 'SI')", "IMPGENERATO", 5, 99, 0, -13997);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_IMPGENERATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_IMPGENERATO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_LIST, 140);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_FORM, 140);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_CRONOPROGRID, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_CRONOPROGRID, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_CRONOPROGRID, PPQRY_TESTATCRONOP, "B.CRONOPROGRAMMA_ID", "CRONOPROGRAMMA_ID", 3, 10, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_LIST, 1056, 36, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_LIST, 168);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_LIST, "PROGRESSIVO IMPUTAZIONE");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_FORM, 4, 280, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_FORM, 168);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_PROGREIMPUTA, MyGlb.PANEL_FORM, "PROGRESSIVO IMPUTAZIONE");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_PROGREIMPUTA, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_PROGREIMPUTA, PPQRY_TESTATCRONOP, "C.PROGRESSIVO_IMPUTAZIONE", "RECIMPCRPRIM", 3, 10, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_LIST, 232, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_LIST, 68);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_LIST, "Opera Progetto");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_FORM, 68);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_OPERA, MyGlb.PANEL_FORM, "Op. Prog.");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_OPERA, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_OPERA, PPQRY_TESTATCRONOP, "B.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_LIST, 1056, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_LIST, 116);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_LIST, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_LIST, "ENTRATA ESIG DIFF");
    PAN_GENEIMPDAPIA.SetRect(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_FORM, 4, 304, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEIMPDAPIA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_FORM, 116);
    PAN_GENEIMPDAPIA.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_FORM, 1);
    PAN_GENEIMPDAPIA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEIMPDAPIA_ENTRESIGDIFF, MyGlb.PANEL_FORM, "ENTRATA ESIG DIFF");
    PAN_GENEIMPDAPIA.SetFieldPage(PFL_GENEIMPDAPIA_ENTRESIGDIFF, -1, -1);
    PAN_GENEIMPDAPIA.SetFieldPanel(PFL_GENEIMPDAPIA_ENTRESIGDIFF, PPQRY_TESTATCRONOP, "B.ENTRATA_ESIG_DIFF", "RETECRENESDI", 5, 2, 0, -13997);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_ENTRESIGDIFF, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_GENEIMPDAPIA.SetValueListItem(PFL_GENEIMPDAPIA_ENTRESIGDIFF, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_GENEIMPDAPIA_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENEIMPDAPIA.SetSize(MyGlb.OBJ_QUERY, 6);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_GENEIMPDAPIA.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENEIMPDAPIA.SetMasterTable(PPQRY_OPERE, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO, ");
    SQL.append("  DECODE(A.VOCE_ECON, to_number(NULL), '', TO_CHAR ( A.VOCE_ECON ) || ' - ' || B.DESCRIZIONE) as CAPVOCEECONO ");
    SQL.append("from ");
    SQL.append("  CAP A, ");
    SQL.append("  VOCI_ECONOMICHE B ");
    SQL.append("where (B.CODICE(+) = A.VOCE_ECON) ");
    SQL.append("and   (B.E_S(+) = A.E_S) ");
    SQL.append("and   (A.ARTICOLO = ~~RECIMPCROART~~) ");
    SQL.append("and   (A.CAPITOLO = ~~RECIMPCROCAP~~) ");
    SQL.append("and   (A.E_S = 'S') ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_GENEIMPDAPIA.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENEIMPDAPIA.SetMasterTable(PPQRY_CAP, "CAP");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~RETECRENESDI~~, 'SI', CRONO_VERIFICA_ENTRATA_SPESA(~~TBL_DATISESSIONE.SESSIOESERCI~~,~~CRONOPROGRAMMA_ID~~,~~RECIMPCRPRIM~~,~~RECPIACROFIN~~,~~RECPIACRESPL~~,'SI'), 'OK') as CORRISENTRAT ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~CRONOPROGRAMMA_ID~~ IS NULL))) ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_GENEIMPDAPIA.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENEIMPDAPIA.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  'I' as INFOCAPITOLO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~RECIMPCROCAP~~ IS NULL)) AND NOT ((~~RECIMPCROART~~ IS NULL))) ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_INFOCAPITOLO, 0, SQL, -1, "");
    PAN_GENEIMPDAPIA.SetQueryDB(PPQRY_INFOCAPITOLO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENEIMPDAPIA.SetMasterTable(PPQRY_INFOCAPITOLO, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~RECPIACROFIN~~) ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, PFL_GENEIMPDAPIA_FINANZIAMENT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FINANZCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_FINANZIAMENT, 1, SQL, PFL_GENEIMPDAPIA_FINANZIAMENT, "");
    PAN_GENEIMPDAPIA.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENEIMPDAPIA.SetIMDB(IMDB, "PQRY_TESTATCRONOP", true);
    PAN_GENEIMPDAPIA.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CRONOPROGRAMMA_ID as CRONOPROGRAMMA_ID, ");
    SQL.append("  D.ESERCIZIO_PLUR as RECPIACRESPL, ");
    SQL.append("  C.CAPITOLO as RECIMPCROCAP, ");
    SQL.append("  C.ARTICOLO as RECIMPCROART, ");
    SQL.append("  B.OPERA as OPERA, ");
    SQL.append("  D.FINANZIAMENTO as RECPIACROFIN, ");
    SQL.append("  SUM(E.IMPORTO) as RECORDIMPORT, ");
    SQL.append("  CASE WHEN E.ANNO_FINANZIAMENTO < E.ESERCIZIO_PLUR THEN 'SI' ELSE NULL END as REISCDASTANZ, ");
    SQL.append("  DECODE(D.NUMERO_IMP_PURO, to_number(NULL), 'NO', 'SI') as IMPGENERATO, ");
    SQL.append("  C.PROGRESSIVO_IMPUTAZIONE as RECIMPCRPRIM, ");
    SQL.append("  B.ENTRATA_ESIG_DIFF as RETECRENESDI ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_TESTATCRONOP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_GEN_VAR_CRONO A, ");
    SQL.append("  TESTATE_CRONOPROGRAMMI B, ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI C, ");
    SQL.append("  PIANI_CRONOPROGRAMMI D, ");
    SQL.append("  CRONO_PIANO_COMP_TMP E ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_TESTATCRONOP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (B.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (C.CRONOPROGRAMMA_ID = B.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (D.CRONOPROGRAMMA_ID = C.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (D.PROGRESSIVO_IMPUTAZIONE = C.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   (E.CRONOPROGRAMMA_ID = D.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (E.PROGRESSIVO_IMPUTAZIONE = D.PROGRESSIVO_IMPUTAZIONE) ");
    SQL.append("and   (E.ESERCIZIO_PLUR = D.ESERCIZIO_PLUR) ");
    SQL.append("and   (E.FINANZIAMENTO = D.FINANZIAMENTO) ");
    SQL.append("and   (D.ESERCIZIO_PLUR = NVL(~~PQRY_PATS1.NOMEOGGEESER~~, D.ESERCIZIO_PLUR)) ");
    SQL.append("and   (C.CAPITOLO = NVL(~~PQRY_PATS1.NOMEOGGECAPI~~, C.CAPITOLO)) ");
    SQL.append("and   (C.ARTICOLO = NVL(~~PQRY_PATS1.NOMEOGGEARTI~~, C.ARTICOLO)) ");
    SQL.append("and   (D.FINANZIAMENTO = NVL(~~PQRY_PATS1.NOMEOGGEFINA~~, D.FINANZIAMENTO)) ");
    SQL.append("and   (~~PQRY_PATS1.NOMOGGIMGIGE~~ = 'SI' OR ((D.NUMERO_IMP_PURO IS NULL) AND (D.NUMERO_IMP_REISC IS NULL))) ");
    SQL.append("and   (E.SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_TESTATCRONOP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("group by ");
    SQL.append("  B.CRONOPROGRAMMA_ID, ");
    SQL.append("  D.ESERCIZIO_PLUR, ");
    SQL.append("  C.CAPITOLO, ");
    SQL.append("  C.ARTICOLO, ");
    SQL.append("  B.OPERA, ");
    SQL.append("  D.FINANZIAMENTO, ");
    SQL.append("  CASE WHEN E.ANNO_FINANZIAMENTO < E.ESERCIZIO_PLUR THEN 'SI' ELSE NULL END, ");
    SQL.append("  DECODE(D.NUMERO_IMP_PURO, to_number(NULL), 'NO', 'SI'), ");
    SQL.append("  C.PROGRESSIVO_IMPUTAZIONE, ");
    SQL.append("  B.ENTRATA_ESIG_DIFF ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_TESTATCRONOP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("having (SUM(E.IMPORTO) > 0) ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_TESTATCRONOP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 5, 3, 4, 6, 8, 9, 2 ");
    PAN_GENEIMPDAPIA.SetQuery(PPQRY_TESTATCRONOP, 5, SQL, -1, "");
    PAN_GENEIMPDAPIA.SetQueryDB(PPQRY_TESTATCRONOP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENEIMPDAPIA.SetMasterTable(0, "WRK_GEN_VAR_CRONO");
    PAN_GENEIMPDAPIA.AddToSortList(PFL_GENEIMPDAPIA_OPERA, true);
    PAN_GENEIMPDAPIA.AddToSortList(PFL_GENEIMPDAPIA_CAPITOLO, true);
    PAN_GENEIMPDAPIA.AddToSortList(PFL_GENEIMPDAPIA_ARTICOLO, true);
    PAN_GENEIMPDAPIA.AddToSortList(PFL_GENEIMPDAPIA_FINANZIAMENT, true);
    PAN_GENEIMPDAPIA.AddToSortList(PFL_GENEIMPDAPIA_REISCDASTANZ, true);
    PAN_GENEIMPDAPIA.AddToSortList(PFL_GENEIMPDAPIA_IMPGENERATO, true);
    PAN_GENEIMPDAPIA.AddToSortList(PFL_GENEIMPDAPIA_ESERCIZIPLUR, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENEIMPDAPIA.Status() == 2)
    {
      int oldListQBE = PAN_GENEIMPDAPIA.iUseListQBE;
      PAN_GENEIMPDAPIA.iUseListQBE = 0;
      PAN_GENEIMPDAPIA.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENEIMPDAPIA.PanelCommand(Glb.PCM_FIND);
      PAN_GENEIMPDAPIA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMELAB_Init()
  {

    PAN_PARAMELAB.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMELAB.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, "48BBC86D-2739-42AA-BBA4-2D7101FC181F");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, "Delibera");
    PAN_PARAMELAB.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, MyGlb.PANEL_LIST, 0, -9999, 128, 0, 0, 0);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, MyGlb.PANEL_FORM, 20, 32, 504, 28, 0, 0);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, 0, 47);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, 1, 13);
    PAN_PARAMELAB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, 0, 1);
    PAN_PARAMELAB.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, 1, 1);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMELAB_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMELAB.SetSize(MyGlb.OBJ_FIELD, 8);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, "03933BF8-E3A7-440F-9660-882B199AAC86");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, "Tipo Elaborazione:");
    PAN_PARAMELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.VIS_OPTIBUTINTSX);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, "4902589F-6A60-4A77-861B-86E35243738F");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, "Annulla");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMELAB.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, 0, "button1.gif", false);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, "1F3EF1F3-926A-448B-BCF9-7940651AA449");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, "Elabora");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMELAB.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, 0, "button1.gif", false);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, "1F50C9BC-3CBC-4A91-80A5-289FA75100C8");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, "Delibera:");
    PAN_PARAMELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, "F98E7D25-322F-4179-A77C-C8074D0EB4EA");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, "-");
    PAN_PARAMELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, "0EB1ECA4-24EA-4EA3-8804-6A8A04A15083");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, "/");
    PAN_PARAMELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, "33D40286-76B1-4D3D-851E-DF3566EC53F4");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMELAB.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, 0, "wsearch1.gif", false);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMELAB.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, "E1FCCD04-2829-4C0F-B69C-C80A62B5B101");
    PAN_PARAMELAB.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, "da Cronoprogramma");
    PAN_PARAMELAB.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, "");
    PAN_PARAMELAB.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMELAB.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMELAB_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_LIST, 0, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_LIST, 112);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_LIST, "Tipo Elaborazione:");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_FORM, 20, 8, 504, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_TIPOELABORAZ, MyGlb.PANEL_FORM, "Tipo Elaborazione:");
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_TIPOELABORAZ, -1, -1);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_TIPOELABORAZ, PPQRY_PATS7, "A.NOMOGGTIPELA", "NOMOGGTIPELA", 5, 2, 0, -13997);
    PAN_PARAMELAB.SetValueListItem(PFL_PARAMELAB_TIPOELABORAZ, (new IDVariant("IF")), "Impegno per Finanziamento", "Generazione di un impegno per finanziamento", "", -1);
    PAN_PARAMELAB.SetValueListItem(PFL_PARAMELAB_TIPOELABORAZ, (new IDVariant("IU")), "Impegno Unico", "Generazione di un impegno unico con più fiananziamenti", "", -1);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_LIST, 196, 20, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_FORM, 580, 28, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEANNULL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_ETICHEANNULL, -1, -1);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_ETICHEANNULL, -1, "", "ETICHEANNULL", 0, 0, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 204, 28, 84, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 752, 28, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_ETICHEELABOR, -1, -1);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_LIST, "Delibera:");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_FORM, 24, 36, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_FORM, 108);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_SEDEDELIBERA, MyGlb.PANEL_FORM, "Delibera:");
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_SEDEDELIBERA, -1, GRP_PARAMELAB_DELIBERA);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_SEDEDELIBERA, PPQRY_PATS7, "A.NOMOGGSEDDEL", "NOMOGGSEDDEL", 5, 4, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_LIST, 104);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_LIST, "-");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_FORM, 184, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_FORM, 16);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_NUMERODELIBE, MyGlb.PANEL_FORM, "-");
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_NUMERODELIBE, -1, GRP_PARAMELAB_DELIBERA);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_NUMERODELIBE, PPQRY_PATS7, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 6, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_LIST, 88);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_LIST, "/");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_FORM, 260, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_FORM, 16);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_ANNODELIBERA, MyGlb.PANEL_FORM, "/");
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_ANNODELIBERA, -1, GRP_PARAMELAB_DELIBERA);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_ANNODELIBERA, PPQRY_PATS7, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, MyGlb.PANEL_LIST, 232, 36, 20, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, MyGlb.PANEL_LIST, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, MyGlb.PANEL_FORM, 324, 40, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, MyGlb.PANEL_FORM, 0);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_APRI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_APRI, -1, GRP_PARAMELAB_DELIBERA);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_APRI, -1, "", "APRI", 0, 0, 0, -13997);
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_LIST, 128);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_LIST, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_LIST, "da Cronoprogramma");
    PAN_PARAMELAB.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_FORM, 368, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMELAB.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_FORM, 128);
    PAN_PARAMELAB.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_FORM, 1);
    PAN_PARAMELAB.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMELAB_DACRONOPROGR, MyGlb.PANEL_FORM, "da Cronoprogramma");
    PAN_PARAMELAB.SetFieldPage(PFL_PARAMELAB_DACRONOPROGR, -1, GRP_PARAMELAB_DELIBERA);
    PAN_PARAMELAB.SetFieldPanel(PFL_PARAMELAB_DACRONOPROGR, PPQRY_PATS7, "A.NOMEOGGDACRO", "NOMEOGGDACRO", 5, 2, 0, -13997);
    PAN_PARAMELAB.SetValueListItem(PFL_PARAMELAB_DACRONOPROGR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMELAB.SetValueListItem(PFL_PARAMELAB_DACRONOPROGR, (new IDVariant("NO")), "NO", "", "", -1);
  }

  private void PAN_PARAMELAB_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMELAB.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMELAB.SetIMDB(IMDB, "PQRY_PATS7", true);
    PAN_PARAMELAB.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAMELAB.SetQueryIMDB(PPQRY_PATS7, IMDBDef11.PQRY_PATS7_RS, IMDBDef3.TBL_PATS);
    JustLoaded = true;
    PAN_PARAMELAB.SetFieldPrimaryIndex(PFL_PARAMELAB_TIPOELABORAZ, IMDBDef3.FLD_PATS_NOMOGGTIPELA);
    PAN_PARAMELAB.SetFieldPrimaryIndex(PFL_PARAMELAB_SEDEDELIBERA, IMDBDef3.FLD_PATS_NOMOGGSEDDEL);
    PAN_PARAMELAB.SetFieldPrimaryIndex(PFL_PARAMELAB_NUMERODELIBE, IMDBDef3.FLD_PATS_NOMOGGNUMDEL);
    PAN_PARAMELAB.SetFieldPrimaryIndex(PFL_PARAMELAB_ANNODELIBERA, IMDBDef3.FLD_PATS_NOMOGGANNDEL);
    PAN_PARAMELAB.SetFieldPrimaryIndex(PFL_PARAMELAB_DACRONOPROGR, IMDBDef3.FLD_PATS_NOMEOGGDACRO);
    PAN_PARAMELAB.SetMasterTable(0, "PATS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMELAB.Status() == 2)
    {
      int oldListQBE = PAN_PARAMELAB.iUseListQBE;
      PAN_PARAMELAB.iUseListQBE = 0;
      PAN_PARAMELAB.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMELAB.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMELAB.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_GENEIMPDAPIA) PAN_GENEIMPDAPIA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_ValidateRow(Cancel);
    if (SrcObj == PAN_GENEIMPDAPIA) PAN_GENEIMPDAPIA_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_DynamicProperties();
    if (SrcObj == PAN_GENEIMPDAPIA) PAN_GENEIMPDAPIA_DynamicProperties();
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_GENEIMPDAPIA) PAN_GENEIMPDAPIA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMFILTRI) PAN_PARAMFILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_GENEIMPDAPIA) PAN_GENEIMPDAPIA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMELAB) PAN_PARAMELAB_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
