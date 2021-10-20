// **********************************************
// Composizione Variazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ComposizioneVariazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_ELENCOVARIAZ_TIPODISTAMPA = 0;
  private static int GRP_ELENCOVARIAZ_PARTE = 1;
  private static int GRP_ELENCOVARIAZ_TIPOIMPORTO = 2;
  private static int GRP_ELENCOVARIAZ_VARIAZIONI = 3;
  private static int GRP_ELENCOVARIAZ_PERIODIVARIA = 4;
  private static int GRP_ELENCOVARIAZ_PROVVEDIMENT = 5;

  private static int PFL_ELENCOVARIAZ_TIPOSTAMPA = 0;
  private static int PFL_ELENCOVARIAZ_PARTE = 1;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE1 = 2;
  private static int PFL_ELENCOVARIAZ_VARIAZIONI = 3;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE5 = 4;
  private static int PFL_ELENCOVARIAZ_TIPOMOTIVAZI = 5;
  private static int PFL_ELENCOVARIAZ_TIPOVARIAZIO = 6;
  private static int PFL_ELENCOVARIAZ_DAL = 7;
  private static int PFL_ELENCOVARIAZ_AL = 8;
  private static int PFL_ELENCOVARIAZ_NEWPANELABE6 = 9;
  private static int PFL_ELENCOVARIAZ_ETICHETTASF1 = 10;
  private static int PFL_ELENCOVARIAZ_DETTAGCAPITO = 11;
  private static int PFL_ELENCOVARIAZ_ORDINAMENTO = 12;
  private static int PFL_ELENCOVARIAZ_DELIBERA = 13;
  private static int PFL_ELENCOVARIAZ_TRATTIDELIBE = 14;
  private static int PFL_ELENCOVARIAZ_NUMERODELIBE = 15;
  private static int PFL_ELENCOVARIAZ_BARRADELIBER = 16;
  private static int PFL_ELENCOVARIAZ_ANNODELIBERA = 17;
  private static int PFL_ELENCOVARIAZ_APRISCELDELI = 18;
  private static int PFL_ELENCOVARIAZ_PROPOSTA = 19;
  private static int PFL_ELENCOVARIAZ_TRATTIPROPOS = 20;
  private static int PFL_ELENCOVARIAZ_NUMEROPROPOS = 21;
  private static int PFL_ELENCOVARIAZ_BARRAPROPOST = 22;
  private static int PFL_ELENCOVARIAZ_ANNOPROPOSTA = 23;
  private static int PFL_ELENCOVARIAZ_APRISCELPROP = 24;
  private static int PFL_ELENCOVARIAZ_ETICHETTASF = 25;
  private static int PFL_ELENCOVARIAZ_ELABORA = 26;
  private static int PFL_ELENCOVARIAZ_DESCRIVARIAZ = 27;
  private static int PFL_ELENCOVARIAZ_VARIABILAPEG = 28;

  private static int PPQRY_PARAMETRI519 = 0;

  private static int PPQRY_TIPIMOTIVBIL = 1;
  private static int PPQRY_T54 = 2;


  IDPanel PAN_ELENCOVARIAZ;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI510(IMDB);
    //
    //
    Init_PQRY_PARAMETRI519(IMDB);
    Init_PQRY_PARAMETRI519_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI510(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI510, 19);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI510, "TBL_PARAMETRI510");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDAGIPR, "ROWNAMDAGIPR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDAGIPR,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPSTA,12,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPMOT, "ROWNAMTIPMOT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPMOT,5,3,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI510,IMDBDef4.FLD_PARAMETRI510_ROWNAMEORDIN,5,3,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI510, 0);
  }

  private static void Init_PQRY_PARAMETRI519(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI519, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI519, "PQRY_PARAMETRI519");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPSTA,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPMOT, "ROWNAMTIPMOT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPMOT,5,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEORDIN,5,3,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI519, 0);
  }

  private static void Init_PQRY_PARAMETRI519_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI519_RS, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI519_RS, "PQRY_PARAMETRI519_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPSTA, "ROWNAMTIPSTA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPSTA,12,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDESVAR, "ROWNAMDESVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMDESVAR,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPMOT, "ROWNAMTIPMOT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPMOT,5,3,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI519_RS,IMDBDef12.PQSL_PARAMETRI519_ROWNAMEORDIN,5,3,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ComposizioneVariazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public ComposizioneVariazioni()
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
    FormIdx = MyGlb.FRM_COMPOSVARIAZ;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "E9F7A41A-E823-40EC-8787-67FCB85B1F4A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 624;
    DesignHeight = 298;
    set_Caption(new IDVariant("Composizione Variazioni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 624;
    Frames[1].Height = 272;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Elenco Variazioni";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 272;
    PAN_ELENCOVARIAZ = new IDPanel(w, this, 1, "PAN_ELENCOVARIAZ");
    Frames[1].Content = PAN_ELENCOVARIAZ;
    PAN_ELENCOVARIAZ.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENCOVARIAZ.VS = MainFrm.VisualStyleList;
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 624-MyGlb.PAN_OFFS_X, 272-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C3FADEBD-8886-46D2-B9EB-CE0878A4E8D6");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 852, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENCOVARIAZ.InitStatus = 2;
    PAN_ELENCOVARIAZ_Init();
    PAN_ELENCOVARIAZ_InitFields();
    PAN_ELENCOVARIAZ_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI510, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        COMPOSVARIAZ_PARAMETRI519();
      }
      PAN_ELENCOVARIAZ.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_ELENCOVARIAZ.FrIndex)
    {
      if (IdxFieldActived ==PFL_ELENCOVARIAZ_APRISCELPROP) {
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
    return (obj instanceof ComposizioneVariazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ComposizioneVariazioni.class.getName() : (Glb.ClassWithPackage(ComposizioneVariazioni.class) ? ComposizioneVariazioni.class.getName().substring(ComposizioneVariazioni.class.getPackage().getName().length() + 1) : ComposizioneVariazioni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Proposta
  // **********************************************************************
  public int ApriProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Proposta Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "ApriProposta", _e);
      return -1;
    }
  }

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
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEDAL, 0)).compareTo((new IDVariant(1900)), true)<0 || IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEAL, 0)).compareTo((new IDVariant(1900)), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEDAL, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR2); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL, 0))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Delibera non presente", IDVariant.STRING));
          v_CONTATORE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(v_AVVISO); 
            return 0;
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Delibera incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO, 0))))))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO, 0))))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Proposta inesistente", IDVariant.STRING));
          if (MainFrm.GESTIODELIBE.booleanValue())
          {
            v_CONTATORE = (new IDVariant(0));
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  PROPOSTE A ");
            SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
            }
            QV.Close();
            if (v_CONTATORE.equals((new IDVariant(0)), true))
            {
              MainFrm.set_AlertMessage(v_AVVISO); 
              return 0;
            }
          }
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Dati della Proposta incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      // 
      // lancio stampa
      // 
      {
        IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
        IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR2 = (new IDVariant("PARTE"));
        IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR3 = (new IDVariant("COMP_CASSA"));
        IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR4 = (new IDVariant("TIPO"));
        IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR5 = (new IDVariant("TIPO_VAR"));
        IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR6 = (new IDVariant("TIPO_MOTIV"));
        IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR7 = (new IDVariant("SEDE_DEL"));
        IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR8 = (new IDVariant("NUMERO_DEL"));
        IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR9 = (new IDVariant("ANNO_DEL"));
        IDVariant v_NOMEPAR10 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR10 = (new IDVariant("UNITA_PROP"));
        IDVariant v_NOMEPAR11 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR11 = (new IDVariant("NUMERO_PROP"));
        IDVariant v_NOMEPAR12 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR12 = (new IDVariant("ANNO_PROP"));
        IDVariant v_NOMEPAR13 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR13 = (new IDVariant("DATA_DAL"));
        IDVariant v_NOMEPAR14 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR14 = (new IDVariant("DATA_AL"));
        IDVariant v_NOMEPAR15 = new IDVariant(0,IDVariant.STRING);
        v_NOMEPAR15 = (new IDVariant("DETT_CAP"));
        IDVariant v_NOMESTAMPA = null;
        v_NOMESTAMPA = (new IDVariant("Composizione_Variazioni"));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEPARTE, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEVARIA, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPVAR, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPMOT, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR10, IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR11, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR12, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR13, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEDAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR14, IDL.ToString(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEAL, 0)));
        MainFrm.SetParametroStampaJasper(v_NOMEPAR15, IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMDETCAP, 0));
        MainFrm.SetParametroStampaJasper((new IDVariant("ORD")), ((IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMDETCAP, 0).equals((new IDVariant("SI"))))?IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMEORDIN, 0):(new IDVariant("-1"))));
        MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "Elabora", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMVABIPE, 0, (new IDVariant("PB")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMDETCAP, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEVARIA, 0, (new IDVariant("P")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPSTA, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMANNDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPMOT, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEORDIN, 0, (new IDVariant("CAP")));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "LoadEvent", _e);
    }
  }

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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENCOVARIAZ);
      // 
      // Elenco Variazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      // 
      // 
      // 
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPSTA, 0).equals((new IDVariant("U")), true))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_ELENCOVARIAZ.SetFlags (Glb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "ElencoVariazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Elenco Variazioni On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco Variazioni On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMUNIPRO, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_ELENCOVARIAZ_TIPOMOTIVAZI)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPMOT, 0)))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPMOT, 0, (new IDVariant("-1")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "ElencoVariazioniOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Per Finanziamento Tipo Variazione Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_ELENCOVARIAZ_TIPOVARIAZIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Per Finanziamento Tipo Variazione Validate Event Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPVAR, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI519, IMDBDef12.PQSL_PARAMETRI519_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ComposizioneVariazioni", "VariazioniPerFinanziamentoTipoVariazioneValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void COMPOSVARIAZ_PARAMETRI519() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI519_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI510, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI510, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI519_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI519_RS, 0, IMDBDef4.TBL_PARAMETRI510, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 0, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMVABIPE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 1, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 2, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 3, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 4, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 5, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 6, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 7, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 8, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 9, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 10, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 11, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 12, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 13, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPSTA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 14, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMDESVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 15, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPMOT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI519_RS, 16, 0, IMDBDef4.TBL_PARAMETRI510, IMDBDef4.FLD_PARAMETRI510_ROWNAMEORDIN, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI510, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI510, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI510, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI519_RS, 0);
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
  private void PAN_ELENCOVARIAZ_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENCOVARIAZ, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENCOVARIAZ_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENCOVARIAZ, Cancel);
    // Stub
  }

  private void PAN_ELENCOVARIAZ_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENCOVARIAZ_ELABORA)
    {
      this.IdxPanelActived = this.PAN_ELENCOVARIAZ.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENCOVARIAZ_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_ELENCOVARIAZ_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_ELENCOVARIAZ_TIPOVARIAZIO)
      {
        PFL_ELENCOVARIAZ_TIPOVARIAZIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_ELENCOVARIAZ_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENCOVARIAZ_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_ELENCOVARIAZ_Init()
  {

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, "6B5F277F-4A9D-4074-9625-66587A2D7682");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, "Tipo Di Stampa");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 0, 85);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPODISTAMPA, 0, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, "BC4EA75B-9639-41D4-B73C-0D152E94AA87");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, "Parte");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 72, -9999, 72, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 12, 11, 332, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 0, 31);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, "ABE1A5E5-0511-4688-9888-F6D95FC44833");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, "Tipo Importo");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, MyGlb.PANEL_FORM, 0, 0, 0, 0, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 0, 74);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_TIPOIMPORTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "D9D96D70-C44E-4C75-B63A-32BEBA3F7465");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 348, 11, 228, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0, 55);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, "6CDA256E-B5FF-4057-B186-D46985BB769B");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, "Periodo di Variazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, MyGlb.PANEL_LIST, 344, -9999, 200, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, MyGlb.PANEL_FORM, 348, 63, 228, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 0, 118);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PERIODIVARIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "6730557E-3DF9-4CF9-9272-CFC891F1A98F");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "Provvedimento");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, MyGlb.PANEL_FORM, 12, 139, 564, 49, 0, 0);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 87);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 13);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0, 4);
    PAN_ELENCOVARIAZ.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 1, 4);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_GROUP, GRP_ELENCOVARIAZ_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_FIELD, 29);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, "1B462673-7CD3-481F-9C8E-A67480A45C04");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, "Tipo Stampa");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "5C5558FE-3D8E-4403-BABD-4950A8202957");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "Parte");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, "54ABE5BC-89F5-4B3F-9BCA-C1B091BC5A9B");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "AC33BB7F-7180-4BF0-899D-2B100053C0A3");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "Variazioni");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, "B1FDD956-C709-4A7C-A1BB-B6F4F4C0CA16");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "22EBF859-A8AF-4817-939A-2F4714C818EF");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "Tipo Motivazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "70F3CD0E-FD36-4BE2-BC0E-9536DC31AD97");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "Tipo Variazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, "19AE72AC-6A76-49AB-BAE8-156FB4134F6B");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, "Dal");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, "AB25239E-2EC2-48FC-A9C5-AE2208779275");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, "Al");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, "6C61C1CD-1397-463A-862B-B996659F6909");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, "0FA37E14-8D24-4C92-94B1-32613D46972A");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, "E182FE2A-05C7-41E8-BDE0-5D9061143C04");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, "175A5158-FEB1-4BC9-AF2D-DEB9D45B7967");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, "Ordinamento");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "02687F6E-3C36-4A52-9F62-1326C8561981");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "FECDD498-5EDC-4E37-A3EE-761BBCD7CAD0");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "1AAEF29B-8D21-4089-9BC2-4B8C81E95D16");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "Numero Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "2EBAE751-2468-4D95-9A54-92BD629C221F");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "E0A863CB-D471-4183-96C3-FB8B950C3903");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "Anno Delibera");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "1070BC27-B5CD-4C36-ACEF-0159FFF891E8");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "FA83CCB9-C3E1-47CE-9182-E23C5024663E");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "5F6B25B2-ECE7-42CB-BD92-654B333855BC");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, "-");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "2CCB05C3-B851-4E68-89E8-29B1BEAACB0A");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "Numero Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "FACF89CD-2454-4C8C-82BB-7112E680AF75");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, "/");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "A59A06E0-067E-4907-A155-9C6DA9BE97EC");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "Anno Proposta");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "E472EE5C-5C88-4DDF-8669-D271191EB363");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "937AF007-2341-4C17-A301-8756F884B5E3");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, "7E9E05E3-55E8-49C6-93AC-F3B21369C413");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, "Elabora");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_ELENCOVARIAZ.SetImage(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, 0, "button1.gif", false);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, "C564BA95-89EC-441B-9BDF-E4A1D999865D");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, "Descrizione Variazione");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENCOVARIAZ.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, "6A5BD4AB-511E-41C1-AE02-8529A0C86E7F");
    PAN_ELENCOVARIAZ.set_Header(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, "Variazioni Bilancio Peg");
    PAN_ELENCOVARIAZ.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, "");
    PAN_ELENCOVARIAZ.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.VIS_OPTIONBUTTON);
    PAN_ELENCOVARIAZ.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_ELENCOVARIAZ_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 68);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_LIST, "Tipo Stampa");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, -56, 32, 396, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 68);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOSTAMPA, MyGlb.PANEL_FORM, "Tp. Stam.");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOSTAMPA, -1, GRP_ELENCOVARIAZ_TIPODISTAMPA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOSTAMPA, PPQRY_PARAMETRI519, "A.ROWNAMTIPSTA", "ROWNAMTIPSTA", 12, 1, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_TIPOSTAMPA, (new IDVariant("B")), "Per Bilancio/P.e.g.", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_TIPOSTAMPA, (new IDVariant("U")), "Per Unità Org.", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 72, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 80, 36, 260, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_PARTE, -1, GRP_ELENCOVARIAZ_PARTE);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_PARTE, PPQRY_PARAMETRI519, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_LIST, 372, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_FORM, 16, 36, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE1, -1, GRP_ELENCOVARIAZ_PARTE);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 384, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_VARIAZIONI, -1, GRP_ELENCOVARIAZ_VARIAZIONI);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_VARIAZIONI, PPQRY_PARAMETRI519, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 172, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 352, 40, 12, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE5, -1, GRP_ELENCOVARIAZ_VARIAZIONI);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_LIST, "Tipo Motivazione");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 16, 68, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, MyGlb.PANEL_FORM, "Tipo Motivazione");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOMOTIVAZI, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOMOTIVAZI, PPQRY_PARAMETRI519, "A.ROWNAMTIPMOT", "ROWNAMTIPMOT", 5, 3, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Var.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 24, 92, 320, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TIPOVARIAZIO, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TIPOVARIAZIO, PPQRY_PARAMETRI519, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, 344, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, 24);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, 352, 88, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, 28);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DAL, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DAL, PPQRY_PARAMETRI519, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, 440, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, 20);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_LIST, "Al");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, 468, 88, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, 20);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_AL, MyGlb.PANEL_FORM, "Al");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_AL, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_AL, PPQRY_PARAMETRI519, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_LIST, 308, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_FORM, 352, 88, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NEWPANELABE6, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NEWPANELABE6, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NEWPANELABE6, -1, "", "NEWPANELABE6", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_LIST, 384, 184, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_FORM, 356, 96, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF1, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ETICHETTASF1, -1, GRP_ELENCOVARIAZ_PERIODIVARIA);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ETICHETTASF1, -1, "", "ETICHETTASF1", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dettaglio Capitoli");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, 12, 116, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, 108);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DETTAGCAPITO, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DETTAGCAPITO, PPQRY_PARAMETRI519, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, 272, 116, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, 84);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordinamento");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ORDINAMENTO, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ORDINAMENTO, PPQRY_PARAMETRI519, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 5, 3, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_ORDINAMENTO, (new IDVariant("CAP")), "Capitolo", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_ORDINAMENTO, (new IDVariant("SBC")), "Struttura Bilancio-Capitolo", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 16, 164, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DELIBERA, PPQRY_PARAMETRI519, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 116, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 136, 164, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMERODELIBE, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMERODELIBE, PPQRY_PARAMETRI519, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 176, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRADELIBER, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 196, 164, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNODELIBERA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNODELIBERA, PPQRY_PARAMETRI519, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 236, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELDELI, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 260, 164, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_PROPOSTA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_PROPOSTA, PPQRY_PARAMETRI519, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 436, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 456, 164, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_NUMEROPROPOS, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_NUMEROPROPOS, PPQRY_PARAMETRI519, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 496, 164, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 516, 164, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ANNOPROPOSTA, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ANNOPROPOSTA, PPQRY_PARAMETRI519, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 556, 168, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_APRISCELPROP, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 596, 220, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 564, 164, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ETICHETTASF, -1, GRP_ELENCOVARIAZ_PROVVEDIMENT);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 496, 196, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_ELABORA, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_LIST, "Descrizione Variazione");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, 4, 292, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_DESCRIVARIAZ, MyGlb.PANEL_FORM, "Descrizione Variazione");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_DESCRIVARIAZ, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_DESCRIVARIAZ, PPQRY_PARAMETRI519, "A.ROWNAMDESVAR", "ROWNAMDESVAR", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DESCRIVARIAZ, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_DESCRIVARIAZ, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, 0, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_LIST, "Variazioni Bilancio Peg");
    PAN_ELENCOVARIAZ.SetRect(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, 4, 320, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENCOVARIAZ.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, 136);
    PAN_ELENCOVARIAZ.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, 1);
    PAN_ELENCOVARIAZ.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENCOVARIAZ_VARIABILAPEG, MyGlb.PANEL_FORM, "Variazioni Bilancio Peg");
    PAN_ELENCOVARIAZ.SetFieldPage(PFL_ELENCOVARIAZ_VARIABILAPEG, -1, -1);
    PAN_ELENCOVARIAZ.SetFieldPanel(PFL_ELENCOVARIAZ_VARIABILAPEG, PPQRY_PARAMETRI519, "A.ROWNAMVABIPE", "ROWNAMVABIPE", 5, 2, 0, -13997);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIABILAPEG, (new IDVariant("P")), "P.e.g", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIABILAPEG, (new IDVariant("SI")), "Bilancio", "", "", -1);
    PAN_ELENCOVARIAZ.SetValueListItem(PFL_ELENCOVARIAZ_VARIABILAPEG, (new IDVariant("PB")), "Entrambe", "", "", -1);
  }

  private void PAN_ELENCOVARIAZ_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENCOVARIAZ.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPMOTVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPMOTVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPMOT~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMTIPMOT~~ = '-1') ");
    SQL.append("order by 1 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_TIPIMOTIVBIL, 0, SQL, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPMOTVBICOD, ");
    SQL.append("  A.DESCRIZIONE as TIPMOTVBIDES ");
    SQL.append("from ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_TIPIMOTIVBIL, 1, SQL, PFL_ELENCOVARIAZ_TIPOMOTIVAZI, "");
    PAN_ELENCOVARIAZ.SetQueryDB(PPQRY_TIPIMOTIVBIL, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMTIPVAR~~ = -1) ");
    SQL.append("order by 1, 2 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_T54, 0, SQL, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  A.DESCRIZIONE as T54DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T54 A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1, 2 ");
    PAN_ELENCOVARIAZ.SetQuery(PPQRY_T54, 1, SQL, PFL_ELENCOVARIAZ_TIPOVARIAZIO, "");
    PAN_ELENCOVARIAZ.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENCOVARIAZ.SetIMDB(IMDB, "PQRY_PARAMETRI519", true);
    PAN_ELENCOVARIAZ.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_ELENCOVARIAZ.SetQueryIMDB(PPQRY_PARAMETRI519, IMDBDef12.PQRY_PARAMETRI519_RS, IMDBDef4.TBL_PARAMETRI510);
    JustLoaded = true;
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOSTAMPA, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPSTA);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_PARTE, IMDBDef4.FLD_PARAMETRI510_ROWNAMEPARTE);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_VARIAZIONI, IMDBDef4.FLD_PARAMETRI510_ROWNAMEVARIA);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOMOTIVAZI, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPMOT);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_TIPOVARIAZIO, IMDBDef4.FLD_PARAMETRI510_ROWNAMTIPVAR);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DAL, IMDBDef4.FLD_PARAMETRI510_ROWNAMEDAL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_AL, IMDBDef4.FLD_PARAMETRI510_ROWNAMEAL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DETTAGCAPITO, IMDBDef4.FLD_PARAMETRI510_ROWNAMDETCAP);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ORDINAMENTO, IMDBDef4.FLD_PARAMETRI510_ROWNAMEORDIN);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DELIBERA, IMDBDef4.FLD_PARAMETRI510_ROWNAMSEDDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI510_ROWNAMANNDEL);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_PROPOSTA, IMDBDef4.FLD_PARAMETRI510_ROWNAMUNIPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI510_ROWNAMNUMPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI510_ROWNAMANNPRO);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_DESCRIVARIAZ, IMDBDef4.FLD_PARAMETRI510_ROWNAMDESVAR);
    PAN_ELENCOVARIAZ.SetFieldPrimaryIndex(PFL_ELENCOVARIAZ_VARIABILAPEG, IMDBDef4.FLD_PARAMETRI510_ROWNAMVABIPE);
    PAN_ELENCOVARIAZ.SetMasterTable(0, "PARAMETRI510");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENCOVARIAZ.Status() == 2)
    {
      int oldListQBE = PAN_ELENCOVARIAZ.iUseListQBE;
      PAN_ELENCOVARIAZ.iUseListQBE = 0;
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENCOVARIAZ.PanelCommand(Glb.PCM_FIND);
      PAN_ELENCOVARIAZ.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ELENCOVARIAZ) PAN_ELENCOVARIAZ_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
