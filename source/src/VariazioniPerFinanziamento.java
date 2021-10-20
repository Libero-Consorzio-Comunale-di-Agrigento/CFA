// **********************************************
// Variazioni Per Finanziamento
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniPerFinanziamento extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_VARIAPERFINA_VARIABILAPEG = 0;
  private static int GRP_VARIAPERFINA_PARTE = 1;
  private static int GRP_VARIAPERFINA_VARIAZIONI = 2;
  private static int GRP_VARIAPERFINA_PERIODIVARIA = 3;
  private static int GRP_VARIAPERFINA_PROVVEDIMENT = 4;

  private static int PFL_VARIAPERFINA_FINANZIAMENT = 0;
  private static int PFL_VARIAPERFINA_OPERA = 1;
  private static int PFL_VARIAPERFINA_TIPOVARIAZIO = 2;
  private static int PFL_VARIAPERFINA_VARIABILAPEG = 3;
  private static int PFL_VARIAPERFINA_NEWPANELABE7 = 4;
  private static int PFL_VARIAPERFINA_PARTE = 5;
  private static int PFL_VARIAPERFINA_NEWPANELABE1 = 6;
  private static int PFL_VARIAPERFINA_DETTAGLOPERA = 7;
  private static int PFL_VARIAPERFINA_VARIAZIONI = 8;
  private static int PFL_VARIAPERFINA_NEWPANELABE5 = 9;
  private static int PFL_VARIAPERFINA_DAL = 10;
  private static int PFL_VARIAPERFINA_AL = 11;
  private static int PFL_VARIAPERFINA_NEWPANELABE6 = 12;
  private static int PFL_VARIAPERFINA_FINANZDESCRI = 13;
  private static int PFL_VARIAPERFINA_OPEREDESCRIZ = 14;
  private static int PFL_VARIAPERFINA_ELABORA = 15;
  private static int PFL_VARIAPERFINA_DELIBERA = 16;
  private static int PFL_VARIAPERFINA_TRATTIDELIBE = 17;
  private static int PFL_VARIAPERFINA_NUMERODELIBE = 18;
  private static int PFL_VARIAPERFINA_BARRADELIBER = 19;
  private static int PFL_VARIAPERFINA_ANNODELIBERA = 20;
  private static int PFL_VARIAPERFINA_APRISCELDELI = 21;
  private static int PFL_VARIAPERFINA_PROPOSTA = 22;
  private static int PFL_VARIAPERFINA_TRATTIPROPOS = 23;
  private static int PFL_VARIAPERFINA_NUMEROPROPOS = 24;
  private static int PFL_VARIAPERFINA_BARRAPROPOST = 25;
  private static int PFL_VARIAPERFINA_ANNOPROPOSTA = 26;
  private static int PFL_VARIAPERFINA_APRISCELPROP = 27;

  private static int PPQRY_PARAMETRI321 = 0;

  private static int PPQRY_FINANZIAMENT = 1;
  private static int PPQRY_OPERE = 2;

  private static int PPQRY_T54 = 3;


  IDPanel PAN_VARIAPERFINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI202(IMDB);
    //
    //
    Init_PQRY_PARAMETRI321(IMDB);
    Init_PQRY_PARAMETRI321_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI202(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI202, 15);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI202, "TBL_PARAMETRI202");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMDETOPE, "ROWNAMDETOPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI202,IMDBDef4.FLD_PARAMETRI202_ROWNAMDETOPE,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI202, 0);
  }

  private static void Init_PQRY_PARAMETRI321(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI321, 15);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI321, "PQRY_PARAMETRI321");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMDETOPE, "ROWNAMDETOPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321,IMDBDef12.PQSL_PARAMETRI321_ROWNAMDETOPE,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI321, 0);
  }

  private static void Init_PQRY_PARAMETRI321_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARAMETRI321_RS, 15);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARAMETRI321_RS, "PQRY_PARAMETRI321_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMVABIPE, "ROWNAMVABIPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMVABIPE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEFINAN, "ROWNAMEFINAN");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEFINAN,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA, "ROWNAMEOPERA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEVARIA,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMDETOPE, "ROWNAMDETOPE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARAMETRI321_RS,IMDBDef12.PQSL_PARAMETRI321_ROWNAMDETOPE,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniPerFinanziamento(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniPerFinanziamento()
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
    FormIdx = MyGlb.FRM_VARIAPERFINA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3F5108B8-3F29-44C7-8D1F-02C4320819F5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 608;
    DesignHeight = 390;
    set_Caption(new IDVariant("Variazioni Per Finanziamento"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 608;
    Frames[1].Height = 364;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Variazioni Per Finanziamento";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 364;
    PAN_VARIAPERFINA = new IDPanel(w, this, 1, "PAN_VARIAPERFINA");
    Frames[1].Content = PAN_VARIAPERFINA;
    PAN_VARIAPERFINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VARIAPERFINA.VS = MainFrm.VisualStyleList;
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 608-MyGlb.PAN_OFFS_X, 364-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "817B2CDC-85B6-4789-AE31-188BC36A4545");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1908, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VARIAPERFINA.InitStatus = 2;
    PAN_VARIAPERFINA_Init();
    PAN_VARIAPERFINA_InitFields();
    PAN_VARIAPERFINA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI202, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAPERFINA_PARAMETRI321();
      }
      PAN_VARIAPERFINA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCEFINIMPACC && flRis && IdxPanelActived == PAN_VARIAPERFINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERFINA_FINANZIAMENT) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAOPERE && flRis && IdxPanelActived == PAN_VARIAPERFINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERFINA_OPERA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_VARIAPERFINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERFINA_APRISCELDELI) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_VARIAPERFINA.FrIndex)
    {
      if (IdxFieldActived ==PFL_VARIAPERFINA_APRISCELPROP) {
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
    return (obj instanceof VariazioniPerFinanziamento);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniPerFinanziamento.class.getName() : (Glb.ClassWithPackage(VariazioniPerFinanziamento.class) ? VariazioniPerFinanziamento.class.getName().substring(VariazioniPerFinanziamento.class.getPackage().getName().length() + 1) : VariazioniPerFinanziamento.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Opera
  // **********************************************************************
  public int ApriOpera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Opera Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEES, 0, ((IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE, 0).equals((new IDVariant("ES")), true))?(new IDVariant("-1")):IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE, 0)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMECAPIT, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEARTIC, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEFINAN, 0, IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEFINAN, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI17, IMDBDef1.FLD_PARAMETRI17_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAOPERE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "ApriOpera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Finanziamento
  // **********************************************************************
  public int ApriFinanziamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Finanziamento Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMES, 0, ((IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE, 0).equals((new IDVariant("ES")), true))?(new IDVariant("-1")):IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE, 0)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMCAPITOL, 0, (new IDVariant(-1, IDVariant.DECIMAL)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMARTICOL, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMOPERA, 0, IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI18, IMDBDef1.FLD_PARAMETRI18_PARAMESERCIZ, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCEFINIMPACC, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "ApriFinanziamento", _e);
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
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "ApriDelibera", _e);
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
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "ApriProposta", _e);
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
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      v_DW = (new IDVariant("d_var_tipo3_fin", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEDAL, 0)).compareTo((new IDVariant(1900)), true)<0 || IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEAL, 0)).compareTo((new IDVariant(1900)), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      if (IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEDAL, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR2); 
        return 0;
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL, 0))))
      {
        IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
        v_AVVISO1 = (new IDVariant("Delibera non presente", IDVariant.STRING));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, 0))))
        {
          v_CONTATORE = (new IDVariant(0));
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  DEL A ");
          SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_CONTATORE.equals((new IDVariant(0)), true))
          {
            MainFrm.set_AlertMessage(v_AVVISO1); 
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
      if (MainFrm.GESTIODELIBE.booleanValue() && (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO, 0)) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO, 0))))))
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("Proposta non presente", IDVariant.STRING));
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO, 0))))
        {
          v_CONTATORE = (new IDVariant(0));
          if (MainFrm.GESTIODELIBE.booleanValue())
          {
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  COUNT(*) as COUNT1 ");
            SQL.append("from ");
            SQL.append("  PROPOSTE A ");
            SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
          IDVariant v_AVVISO1 = new IDVariant(0,IDVariant.STRING);
          v_AVVISO1 = (new IDVariant("Dati della Proposta incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO1); 
          return 0;
        }
      }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMVABIPE, 0));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMTIPVAR, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0),(new IDVariant("%20"))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0),(new IDVariant("%20"))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.Add(MainFrm.Datetostring(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEDAL, 0)), (new IDVariant("%20%2000:00:00"))));
      MainFrm.SetParametroStampa(IDL.Add(MainFrm.Datetostring(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEAL, 0)), (new IDVariant("%20%2000:00:00"))));
      MainFrm.SetParametroStampa((new IDVariant("S")));
      MainFrm.SetParametroStampa((new IDVariant("SI")));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEFINAN, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMDETOPE, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "Elabora", _e);
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
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMVABIPE, 0, (new IDVariant("PB")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMDETOPE, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEVARIA, 0, (new IDVariant("P")));
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_VARIAPERFINA.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEFINIMPACC)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEFINAN, 0, IMDB.Value(IMDBDef7.PQRY_FINANZIAME10, IMDBDef7.PQSL_FINANZIAME10_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAOPERE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA, 0, IMDB.Value(IMDBDef7.PQRY_OPERE5, IMDBDef7.PQSL_OPERE5_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "EndModalEvent", _e);
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
      UNLOADEVENT_PARADELEROWS();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void UNLOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMVABIPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEFINAN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEOPERA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMTIPVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEVARIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMUNIPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMDETOPE, 0, new IDVariant());
  }

  // **********************************************************************
  // Variazioni Per Finanziamento On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VARIAPERFINA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VARIAPERFINA);
      // 
      // Variazioni Per Finanziamento On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_VARIAPERFINA.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAPERFINA_FINANZDESCRI,(new IDVariant(PAN_VARIAPERFINA.FieldText(PFL_VARIAPERFINA_FINANZDESCRI))).stringValue()); 
      PAN_VARIAPERFINA.set_ToolTip(Glb.OBJ_FIELD,PFL_VARIAPERFINA_OPEREDESCRIZ,(new IDVariant(PAN_VARIAPERFINA.FieldText(PFL_VARIAPERFINA_OPEREDESCRIZ))).stringValue()); 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMEOPERA, 0))))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMDETOPE, 0, (new IDVariant("NO")));
        PAN_VARIAPERFINA.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_VARIAPERFINA.SetFlags (Glb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "VariazioniPerFinanziamentoOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Variazioni Per Finanziamento On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_VARIAPERFINA_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Variazioni Per Finanziamento On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_VARIAPERFINA_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_VARIAPERFINA_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARAMETRI321, IMDBDef12.PQSL_PARAMETRI321_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniPerFinanziamento", "VariazioniPerFinanziamentoOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAPERFINA_PARAMETRI321() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARAMETRI321_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI202, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI202, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARAMETRI321_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARAMETRI321_RS, 0, IMDBDef4.TBL_PARAMETRI202, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 0, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMVABIPE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 1, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 2, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEFINAN, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 3, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEOPERA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 4, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 5, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 6, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 7, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 8, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 9, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 10, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 11, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 12, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 13, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARAMETRI321_RS, 14, 0, IMDBDef4.TBL_PARAMETRI202, IMDBDef4.FLD_PARAMETRI202_ROWNAMDETOPE, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI202, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI202, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI202, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARAMETRI321_RS, 0);
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
  private void PAN_VARIAPERFINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VARIAPERFINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VARIAPERFINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VARIAPERFINA, Cancel);
    // Stub
  }

  private void PAN_VARIAPERFINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_VARIAPERFINA_FINANZIAMENT)
    {
      this.IdxPanelActived = this.PAN_VARIAPERFINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFinanziamento();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERFINA_OPERA)
    {
      this.IdxPanelActived = this.PAN_VARIAPERFINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriOpera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERFINA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_VARIAPERFINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERFINA_APRISCELDELI)
    {
      this.IdxPanelActived = this.PAN_VARIAPERFINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_VARIAPERFINA_APRISCELPROP)
    {
      this.IdxPanelActived = this.PAN_VARIAPERFINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_VARIAPERFINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_VARIAPERFINA_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_VARIAPERFINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VARIAPERFINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_VARIAPERFINA_Init()
  {

    PAN_VARIAPERFINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VARIAPERFINA.SetSize(MyGlb.OBJ_GROUP, 5);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, "91758057-48BB-41A0-B7BA-1C6DC72A5998");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, "Variazioni Bilancio/P.e.g");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_FORM, 12, 19, 220, 49, 0, 0);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, 0, 134);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, 1, 13);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, 0, 4);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, 1, 4);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIABILAPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, "8D12005B-F8DC-4DC0-B4CF-6B67D92F4A44");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, "Parte");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, MyGlb.PANEL_LIST, 72, -9999, 72, 16, 0, 0);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, MyGlb.PANEL_FORM, 272, 19, 288, 49, 0, 0);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, 0, 31);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, 1, 13);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, 0, 4);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, 1, 4);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, "561FBF7A-8C21-4525-BD34-29A539D2EDDA");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, "Variazioni");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_LIST, 264, -9999, 80, 16, 0, 0);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_FORM, 12, 171, 220, 49, 0, 0);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, 0, 55);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, 1, 13);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, 0, 4);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, 1, 4);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, "3F74988B-66BB-4802-89E7-219EB4D3D7C5");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, "Periodo di Variazione");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, MyGlb.PANEL_LIST, 344, -9999, 200, 16, 0, 0);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, MyGlb.PANEL_FORM, 300, 171, 260, 49, 0, 0);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, 0, 118);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, 1, 13);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, 0, 4);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, 1, 4);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PERIODIVARIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, "ACE0B065-CB3D-4751-8808-B0BFD23496CF");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, "Provvedimento");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, MyGlb.PANEL_LIST, 544, -9999, 272, 16, 0, 0);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, MyGlb.PANEL_FORM, 12, 235, 548, 49, 0, 0);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, 0, 87);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, 1, 13);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, 0, 4);
    PAN_VARIAPERFINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, 1, 4);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_GROUP, GRP_VARIAPERFINA_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_VARIAPERFINA.SetSize(MyGlb.OBJ_FIELD, 28);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, "CAAFD816-64D2-47AB-9156-650ED5B27BBA");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, "Finanziamento");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, "F3228046-07AC-49D7-B119-3B6D45E93A09");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, "Opera");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, "C5407755-6F4F-4D7A-978D-FC6C2327139F");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, "Tipo Variazione");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, "A6A33C4A-9B50-4430-B885-18057E9DBD2D");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, "Variazioni Bilancio Peg");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.VIS_OPTBUTSENBOR);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, "F3C76B69-986B-4C1A-8C74-0175E6C8471E");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, "2A602B35-AF7F-4679-B435-78E406EA9CB1");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, "Parte");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, "4FBC4E6D-6A78-409B-AE9C-15D35AD11355");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, "715E6EBA-7F5F-4618-8D81-EF3CDB9944E7");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, "Dettaglio Opera");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.VIS_CHECKSTYLE);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, "6C821E42-010A-4724-A511-55B4E54F8E69");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, "Variazioni");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, "336A6AA0-BEAE-429E-A8AE-0A03CF69A8EC");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, "B64E6D9D-B28B-4EEA-A812-B81180CEAEF9");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, "Dal");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, "6818AA66-4DDC-47A1-9AE8-940398C6A83D");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, "Al");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, "4BC649A6-FDDB-4B85-9885-66A1DA1D0304");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, MyGlb.VIS_SFONEBORDTRA);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, "44A16256-50F5-4C2A-8A2A-C190E093CD6E");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, "FINANZIAMENTI DESCRIZIONE");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, "87E72ADE-7985-4D06-87C3-F62FC08C1F66");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, "OPERE DESCRIZIONE");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.VIS_VISULOOUPCF4);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, "3611A01B-4768-4D65-BFCC-2BBAFE04BCF1");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, "Elabora");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERFINA.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, 0, "button1.gif", false);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, "B1311232-2806-4FA8-87D5-B2F514CAF5A5");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, "Delibera");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, "7AC34895-FC4A-4CBF-B302-02C5ED39E138");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, "-");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, "9B6E635A-2953-4318-924A-0A58E287D117");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, "Numero Delibera");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, "369DEADB-AA75-4217-AB83-0584CC99E31C");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, "/");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, "052AD680-6AD6-4442-B4B5-69AC2D573922");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, "Anno Delibera");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, "66914165-136B-4717-8443-0BFEE983486F");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERFINA.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, 0, "wsearch1.gif", false);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, "902987B7-2A2A-4EF8-9564-2586881E71D0");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, "Proposta");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, "30D380F0-6E1B-4528-BDC8-8CD57470D1D1");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, "-");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, "0CFA1A10-F899-48B3-B978-6270D2CBCA38");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, "Numero Proposta");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, "9D6D1916-B991-4781-A03D-9091D11440F8");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, "/");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, MyGlb.VIS_VUOTONORMALE);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, "A07BA641-EA81-41FD-A03A-0CDAF119D80D");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, "Anno Proposta");
    PAN_VARIAPERFINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_VARIAPERFINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, "B791DFDE-0C96-4EFE-B88D-F835FEA42F21");
    PAN_VARIAPERFINA.set_Header(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, "");
    PAN_VARIAPERFINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, MyGlb.VIS_STATICBUTTON);
    PAN_VARIAPERFINA.SetImage(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, 0, "wsearch1.gif", false);
    PAN_VARIAPERFINA.SetFlags(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_VARIAPERFINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_LIST, 144, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_LIST, "Finan.");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_FORM, 8, 84, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_FORM, 92);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_FINANZIAMENT, -1, -1);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_FINANZIAMENT, PPQRY_PARAMETRI321, "A.ROWNAMEFINAN", "ROWNAMEFINAN", 1, 5, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_LIST, 184, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_LIST, 40);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_FORM, 20, 108, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_FORM, 80);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_OPERA, -1, -1);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_OPERA, PPQRY_PARAMETRI321, "A.ROWNAMEOPERA", "ROWNAMEOPERA", 1, 5, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_LIST, 224, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tp. Var.");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_FORM, 208, 140, 352, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_FORM, 100);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_TIPOVARIAZIO, -1, -1);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_TIPOVARIAZIO, PPQRY_PARAMETRI321, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_LIST, 112);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_LIST, "Var. Bil. Peg");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_FORM, 36, 44, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIABILAPEG, MyGlb.PANEL_FORM, "Variaz. Bilancio Peg");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_VARIABILAPEG, -1, GRP_VARIAPERFINA_VARIABILAPEG);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_VARIABILAPEG, PPQRY_PARAMETRI321, "A.ROWNAMVABIPE", "ROWNAMVABIPE", 5, 2, 0, -13997);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_VARIABILAPEG, (new IDVariant("P")), "P.e.g", "", "", -1);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_VARIABILAPEG, (new IDVariant("SI")), "Bilancio", "", "", -1);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_VARIABILAPEG, (new IDVariant("PB")), "Entrambe", "", "", -1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, MyGlb.PANEL_LIST, 200, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, MyGlb.PANEL_FORM, 16, 48, 20, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE7, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_NEWPANELABE7, -1, GRP_VARIAPERFINA_VARIABILAPEG);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_NEWPANELABE7, -1, "", "NEWPANELABE7", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_LIST, 72, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_FORM, 332, 44, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_FORM, 48);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_PARTE, -1, GRP_VARIAPERFINA_PARTE);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_PARTE, PPQRY_PARAMETRI321, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 2, 0, -13997);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, MyGlb.PANEL_LIST, 372, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, MyGlb.PANEL_FORM, 276, 48, 8, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_NEWPANELABE1, -1, GRP_VARIAPERFINA_PARTE);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_LIST, 84);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_LIST, "Dettaglio Opera");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_FORM, 8, 140, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_FORM, 104);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DETTAGLOPERA, MyGlb.PANEL_FORM, "Dettaglio Opera");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_DETTAGLOPERA, -1, -1);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_DETTAGLOPERA, PPQRY_PARAMETRI321, "A.ROWNAMDETOPE", "ROWNAMDETOPE", 5, 2, 0, -13997);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_DETTAGLOPERA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_DETTAGLOPERA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_LIST, 264, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_FORM, 48, 196, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_VARIAZIONI, -1, GRP_VARIAPERFINA_VARIAZIONI);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_VARIAZIONI, PPQRY_PARAMETRI321, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 1, 0, -13997);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_VARIAZIONI, (new IDVariant("P")), "Provvisorie", "", "", -1);
    PAN_VARIAPERFINA.SetValueListItem(PFL_VARIAPERFINA_VARIAZIONI, (new IDVariant("D")), "Definitive", "", "", -1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, MyGlb.PANEL_LIST, 172, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, MyGlb.PANEL_FORM, 16, 200, 16, 8, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE5, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_NEWPANELABE5, -1, GRP_VARIAPERFINA_VARIAZIONI);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_NEWPANELABE5, -1, "", "NEWPANELABE5", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_LIST, 344, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_LIST, 24);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_FORM, 328, 196, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_FORM, 28);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_DAL, -1, GRP_VARIAPERFINA_PERIODIVARIA);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_DAL, PPQRY_PARAMETRI321, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_LIST, 440, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_LIST, 20);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_LIST, "Al");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_FORM, 452, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_FORM, 20);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_AL, MyGlb.PANEL_FORM, "Al");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_AL, -1, GRP_VARIAPERFINA_PERIODIVARIA);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_AL, PPQRY_PARAMETRI321, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, MyGlb.PANEL_LIST, 308, 188, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, MyGlb.PANEL_FORM, 304, 196, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NEWPANELABE6, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_NEWPANELABE6, -1, GRP_VARIAPERFINA_PERIODIVARIA);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_NEWPANELABE6, -1, "", "NEWPANELABE6", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_LIST, 160);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_LIST, 2);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_LIST, "FINANZIAMENTI DESCRIZIONE");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_FORM, 168, 84, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_FORM, 160);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_FINANZDESCRI, MyGlb.PANEL_FORM, "FINANZ. DESCRIZIONE");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_FINANZDESCRI, -1, -1);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_FINANZDESCRI, PPQRY_FINANZIAMENT, "A.DESCRIZIONE", "FINANZDESCRI", 5, 200, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_LIST, 0, 36, 504, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_LIST, 112);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_LIST, 2);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_LIST, "OPERE DESCRIZIONE");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_FORM, 168, 108, 392, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_FORM, 112);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_OPEREDESCRIZ, MyGlb.PANEL_FORM, "OP. DESCRIZIONE");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_OPEREDESCRIZ, -1, -1);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_OPEREDESCRIZ, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, MyGlb.PANEL_LIST, 428, 292, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, MyGlb.PANEL_FORM, 480, 300, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_ELABORA, -1, -1);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_LIST, 544, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_FORM, 16, 260, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_DELIBERA, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_DELIBERA, PPQRY_PARAMETRI321, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, MyGlb.PANEL_FORM, 116, 260, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIDELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_TRATTIDELIBE, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_TRATTIDELIBE, -1, "", "TRATTIDELIBE", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_LIST, 584, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_LIST, "N. Dl.");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_FORM, 136, 260, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_FORM, 96);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_NUMERODELIBE, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_NUMERODELIBE, PPQRY_PARAMETRI321, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 5, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, MyGlb.PANEL_LIST, 164, 272, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, MyGlb.PANEL_FORM, 176, 260, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRADELIBER, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_BARRADELIBER, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_BARRADELIBER, -1, "", "BARRADELIBER", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_LIST, 624, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_LIST, "A. Dl.");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_FORM, 196, 260, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNODELIBERA, MyGlb.PANEL_FORM, "Anno Delibera");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_ANNODELIBERA, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_ANNODELIBERA, PPQRY_PARAMETRI321, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, MyGlb.PANEL_LIST, 508, 256, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, MyGlb.PANEL_FORM, 232, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELDELI, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_APRISCELDELI, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_APRISCELDELI, -1, "", "APRISCELDELI", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_LIST, 664, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_FORM, 252, 260, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_PROPOSTA, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_PROPOSTA, PPQRY_PARAMETRI321, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, MyGlb.PANEL_LIST, 180, 288, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, MyGlb.PANEL_FORM, 424, 260, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_TRATTIPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_TRATTIPROPOS, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_TRATTIPROPOS, -1, "", "TRATTIPROPOS", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 736, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_LIST, "N. Pr.");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 444, 260, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 128);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_NUMEROPROPOS, MyGlb.PANEL_FORM, "Numero Proposta");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_NUMEROPROPOS, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_NUMEROPROPOS, PPQRY_PARAMETRI321, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, MyGlb.PANEL_LIST, 172, 280, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, MyGlb.PANEL_FORM, 484, 260, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_BARRAPROPOST, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_BARRAPROPOST, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_BARRAPROPOST, -1, "", "BARRAPROPOST", 0, 0, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 776, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_LIST, "A. Pr.");
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 504, 260, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 104);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_ANNOPROPOSTA, MyGlb.PANEL_FORM, "Anno Proposta");
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_ANNOPROPOSTA, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_ANNOPROPOSTA, PPQRY_PARAMETRI321, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, MyGlb.PANEL_LIST, 500, 248, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, MyGlb.PANEL_LIST, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, MyGlb.PANEL_LIST, 1);
    PAN_VARIAPERFINA.SetRect(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, MyGlb.PANEL_FORM, 540, 264, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VARIAPERFINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, MyGlb.PANEL_FORM, 0);
    PAN_VARIAPERFINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_VARIAPERFINA_APRISCELPROP, MyGlb.PANEL_FORM, 1);
    PAN_VARIAPERFINA.SetFieldPage(PFL_VARIAPERFINA_APRISCELPROP, -1, GRP_VARIAPERFINA_PROVVEDIMENT);
    PAN_VARIAPERFINA.SetFieldPanel(PFL_VARIAPERFINA_APRISCELPROP, -1, "", "APRISCELPROP", 0, 0, 0, -13997);
  }

  private void PAN_VARIAPERFINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_VARIAPERFINA.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZDESCRI ");
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEFINAN~~) ");
    PAN_VARIAPERFINA.SetQuery(PPQRY_FINANZIAMENT, 0, SQL, -1, "");
    PAN_VARIAPERFINA.SetQueryDB(PPQRY_FINANZIAMENT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAPERFINA.SetMasterTable(PPQRY_FINANZIAMENT, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEOPERA~~) ");
    PAN_VARIAPERFINA.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_VARIAPERFINA.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAPERFINA.SetMasterTable(PPQRY_OPERE, "OPERE");
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
    SQL.append("order by 1 ");
    PAN_VARIAPERFINA.SetQuery(PPQRY_T54, 0, SQL, PFL_VARIAPERFINA_TIPOVARIAZIO, "");
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
    SQL.append("order by 1 ");
    PAN_VARIAPERFINA.SetQuery(PPQRY_T54, 1, SQL, PFL_VARIAPERFINA_TIPOVARIAZIO, "");
    PAN_VARIAPERFINA.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VARIAPERFINA.SetIMDB(IMDB, "PQRY_PARAMETRI321", true);
    PAN_VARIAPERFINA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_VARIAPERFINA.SetQueryIMDB(PPQRY_PARAMETRI321, IMDBDef12.PQRY_PARAMETRI321_RS, IMDBDef4.TBL_PARAMETRI202);
    JustLoaded = true;
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_FINANZIAMENT, IMDBDef4.FLD_PARAMETRI202_ROWNAMEFINAN);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_OPERA, IMDBDef4.FLD_PARAMETRI202_ROWNAMEOPERA);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_TIPOVARIAZIO, IMDBDef4.FLD_PARAMETRI202_ROWNAMTIPVAR);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_VARIABILAPEG, IMDBDef4.FLD_PARAMETRI202_ROWNAMVABIPE);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_PARTE, IMDBDef4.FLD_PARAMETRI202_ROWNAMEPARTE);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_DETTAGLOPERA, IMDBDef4.FLD_PARAMETRI202_ROWNAMDETOPE);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_VARIAZIONI, IMDBDef4.FLD_PARAMETRI202_ROWNAMEVARIA);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_DAL, IMDBDef4.FLD_PARAMETRI202_ROWNAMEDAL);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_AL, IMDBDef4.FLD_PARAMETRI202_ROWNAMEAL);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_DELIBERA, IMDBDef4.FLD_PARAMETRI202_ROWNAMSEDDEL);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMDEL);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI202_ROWNAMANNDEL);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_PROPOSTA, IMDBDef4.FLD_PARAMETRI202_ROWNAMUNIPRO);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_NUMEROPROPOS, IMDBDef4.FLD_PARAMETRI202_ROWNAMNUMPRO);
    PAN_VARIAPERFINA.SetFieldPrimaryIndex(PFL_VARIAPERFINA_ANNOPROPOSTA, IMDBDef4.FLD_PARAMETRI202_ROWNAMANNPRO);
    PAN_VARIAPERFINA.SetMasterTable(0, "PARAMETRI202");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VARIAPERFINA.Status() == 2)
    {
      int oldListQBE = PAN_VARIAPERFINA.iUseListQBE;
      PAN_VARIAPERFINA.iUseListQBE = 0;
      PAN_VARIAPERFINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_VARIAPERFINA.PanelCommand(Glb.PCM_FIND);
      PAN_VARIAPERFINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_VARIAPERFINA) PAN_VARIAPERFINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAPERFINA) PAN_VARIAPERFINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_VARIAPERFINA) PAN_VARIAPERFINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_VARIAPERFINA) PAN_VARIAPERFINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VARIAPERFINA) PAN_VARIAPERFINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
