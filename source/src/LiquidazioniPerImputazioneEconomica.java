// **********************************************
// Liquidazioni Per Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LiquidazioniPerImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_LIQPERIMPECO_ESPOSIZIONE = 0;
  private static int GRP_LIQPERIMPECO_DATALIQUIDAZ = 1;
  private static int GRP_LIQPERIMPECO_DATECOMPETEN = 2;
  private static int GRP_LIQPERIMPECO_ORDINAMENPER = 3;
  private static int GRP_LIQPERIMPECO_TIPO = 4;
  private static int GRP_LIQPERIMPECO_PROVVEDIMENT = 5;

  private static int PFL_LIQPERIMPECO_ESPOSIZIONE = 0;
  private static int PFL_LIQPERIMPECO_FATTORE = 1;
  private static int PFL_LIQPERIMPECO_FATTORDESCRI = 2;
  private static int PFL_LIQPERIMPECO_CENTRO = 3;
  private static int PFL_LIQPERIMPECO_CENTRIDESCRI = 4;
  private static int PFL_LIQPERIMPECO_DAL = 5;
  private static int PFL_LIQPERIMPECO_AL = 6;
  private static int PFL_LIQPERIMPECO_ETICHETTASF = 7;
  private static int PFL_LIQPERIMPECO_DALECO = 8;
  private static int PFL_LIQPERIMPECO_ALECO = 9;
  private static int PFL_LIQPERIMPECO_ORDINAMENTO = 10;
  private static int PFL_LIQPERIMPECO_ELABORA = 11;
  private static int PFL_LIQPERIMPECO_TIPO = 12;
  private static int PFL_LIQPERIMPECO_PROPOSTA = 13;
  private static int PFL_LIQPERIMPECO_NUMEROPROPOS = 14;
  private static int PFL_LIQPERIMPECO_ANNOPROPOSTA = 15;
  private static int PFL_LIQPERIMPECO_DELIBERA = 16;
  private static int PFL_LIQPERIMPECO_NUMERODELIBE = 17;
  private static int PFL_LIQPERIMPECO_ANNODELIBERA = 18;
  private static int PFL_LIQPERIMPECO_NEWPANELLABE = 19;
  private static int PFL_LIQPERIMPECO_APRIDELIBERA = 20;
  private static int PFL_LIQPERIMPECO_INFODELIBEA = 21;
  private static int PFL_LIQPERIMPECO_APRIPROPOSTA = 22;
  private static int PFL_LIQPERIMPECO_INFOPROPOSTA = 23;
  private static int PFL_LIQPERIMPECO_TRATT = 24;
  private static int PFL_LIQPERIMPECO_TRATT1 = 25;
  private static int PFL_LIQPERIMPECO_TRATT2 = 26;
  private static int PFL_LIQPERIMPECO_TRATT3 = 27;

  private static int PPQRY_PAR49 = 0;

  private static int PPQRY_FATTORE = 1;
  private static int PPQRY_CENTRO = 2;


  IDPanel PAN_LIQPERIMPECO;

  // Definition of Global Variables
  private IDVariant INTEGRAZIGS4 = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR50(IMDB);
    //
    //
    Init_PQRY_PAR49(IMDB);
    Init_PQRY_PAR49_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR50(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR50, 16);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR50, "TBL_PAR50");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEORDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMGESECO, "ROWNAMGESECO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMGESECO,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMDALECO, "ROWNAMDALECO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMDALECO,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEALECO, "ROWNAMEALECO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR50,IMDBDef6.FLD_PAR50_ROWNAMEALECO,6,14,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR50, 0);
  }

  private static void Init_PQRY_PAR49(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR49, 15);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR49, "PQRY_PAR49");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEORDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMDALECO, "ROWNAMDALECO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMDALECO,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEALECO, "ROWNAMEALECO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49,IMDBDef16.PQSL_PAR49_ROWNAMEALECO,6,14,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR49, 0);
  }

  private static void Init_PQRY_PAR49_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR49_RS, 15);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR49_RS, "PQRY_PAR49_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEESPOS, "ROWNAMEESPOS");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEESPOS,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEFATTO, "ROWNAMEFATTO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEFATTO,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMECENTR, "ROWNAMECENTR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMECENTR,5,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEDAL, "ROWNAMEDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEORDIN, "ROWNAMEORDIN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEORDIN,1,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, "ROWNAMUNIPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMETIPO, "ROWNAMETIPO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMETIPO,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMDALECO, "ROWNAMDALECO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMDALECO,6,14,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEALECO, "ROWNAMEALECO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR49_RS,IMDBDef16.PQSL_PAR49_ROWNAMEALECO,6,14,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LiquidazioniPerImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public LiquidazioniPerImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_LIQPERIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C495B9C0-FB40-43CD-A755-F9D70DDBF879";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 620;
    DesignHeight = 438;
    set_Caption(new IDVariant("Liquidazioni Per Imputazione Economica"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 620;
    Frames[1].Height = 412;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Liquidazioni Per Imputazione Economica";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 412;
    PAN_LIQPERIMPECO = new IDPanel(w, this, 1, "PAN_LIQPERIMPECO");
    Frames[1].Content = PAN_LIQPERIMPECO;
    PAN_LIQPERIMPECO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_LIQPERIMPECO.VS = MainFrm.VisualStyleList;
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 620-MyGlb.PAN_OFFS_X, 412-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "C00EBA82-B182-450F-B816-CBEEE6163098");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1848, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_LIQPERIMPECO.InitStatus = 2;
    PAN_LIQPERIMPECO_Init();
    PAN_LIQPERIMPECO_InitFields();
    PAN_LIQPERIMPECO_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR50, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LIQPERIMPECO_PAR49();
      }
      PAN_LIQPERIMPECO.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_LIQPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQPERIMPECO_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_LIQPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQPERIMPECO_CENTRO) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_LIQPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQPERIMPECO_APRIDELIBERA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_LIQPERIMPECO.FrIndex)
    {
      if (IdxFieldActived ==PFL_LIQPERIMPECO_APRIPROPOSTA) {
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
    return (obj instanceof LiquidazioniPerImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LiquidazioniPerImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(LiquidazioniPerImputazioneEconomica.class) ? LiquidazioniPerImputazioneEconomica.class.getName().substring(LiquidazioniPerImputazioneEconomica.class.getPackage().getName().length() + 1) : LiquidazioniPerImputazioneEconomica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Apri Fattore
  // **********************************************************************
  public int ApriFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Fattore Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "ApriFattore", _e);
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

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMDALECO, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEALECO, 0))))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Date di competenza non coerenti"));
        if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMDALECO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEALECO, 0)))
        {
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
        else
        {
          if (IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEALECO, 0).compareTo(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMDALECO, 0), true)<0)
          {
            MainFrm.set_AlertMessage(S); 
            return 0;
          }
        }
      }
      if (IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEAL, 0).compareTo(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEDAL, 0), true)<0)
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Data Al inferiore a Data Dal", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        IDVariant v_PROPOSTAOK = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_DELIBERAOK = new IDVariant(0,IDVariant.INTEGER);
        if ((!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0)))) || (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0))))
        {
          v_PROPOSTAOK = (new IDVariant(-1));
        }
        else
        {
          v_PROPOSTAOK = (new IDVariant(0));
        }
        if ((!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0)))) || (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0))))
        {
          v_DELIBERAOK = (new IDVariant(-1));
        }
        else
        {
          v_DELIBERAOK = (new IDVariant(0));
        }
        if (v_PROPOSTAOK.equals((new IDVariant(-1)), true) && v_DELIBERAOK.equals((new IDVariant(-1)), true))
        {
          IDVariant v_NOMEPAR1 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR1 = (new IDVariant("ESERCIZIO"));
          IDVariant v_NOMEPAR2 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR2 = (new IDVariant("DATA_DAL"));
          IDVariant v_NOMEPAR3 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR3 = (new IDVariant("DATA_AL"));
          IDVariant v_NOMEPAR4 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR4 = (new IDVariant("FATTORE"));
          IDVariant v_NOMEPAR5 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR5 = (new IDVariant("CENTRO"));
          IDVariant v_NOMEPAR6 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR6 = (new IDVariant("UNITA_PROP"));
          IDVariant v_NOMEPAR7 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR7 = (new IDVariant("NUMERO_PROP"));
          IDVariant v_NOMEPAR8 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR8 = (new IDVariant("ANNO_PROP"));
          IDVariant v_NOMEPAR9 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR9 = (new IDVariant("SEDE_DEL"));
          IDVariant v_NOMEPAR10 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR10 = (new IDVariant("NUMERO_DEL"));
          IDVariant v_NOMEPAR11 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR11 = (new IDVariant("ANNO_DEL"));
          IDVariant v_NOMEPAR12 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR12 = (new IDVariant("TIPO"));
          IDVariant v_NOMEPAR13 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR13 = (new IDVariant("ESPOSIZIONE"));
          IDVariant v_NOMEPAR14 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR14 = (new IDVariant("ORDINAMENTO"));
          IDVariant v_NOMEPAR15 = new IDVariant(0,IDVariant.STRING);
          v_NOMEPAR15 = (new IDVariant("GEST_ECON"));
          IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
          v_NOMESTAMPA = (new IDVariant("Liquidazioni_per_Imputazione"));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR2, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEDAL, 0)));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR3, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEAL, 0)));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR4, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEFATTO, 0)));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR5, IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMECENTR, 0)));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR6, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0),IDL.ToString((new IDVariant(-1))))));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR7, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR8, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR9, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0),IDL.ToString((new IDVariant(-1))))));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR10, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR11, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR12, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMETIPO, 0));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR13, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEESPOS, 0));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR14, IDL.ToString(((IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEORDIN, 0).equals((new IDVariant()), true))?(new IDVariant(1)):IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEORDIN, 0))));
          MainFrm.SetParametroStampaJasper(v_NOMEPAR15, IMDB.Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMGESECO, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("DAL_ECO")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMDALECO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("AL_ECO")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEALECO, 0)));
          MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
        else
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("I campi della Proposta o della Delibera sono incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Centro
  // **********************************************************************
  public int ApriCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, (new IDVariant()));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "ApriCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Integrazione GS4
  // **********************************************************************
  public int ControlloIntegrazioneGS4 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PROCDEL = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      // 
      // Controllo Integrazione GS4 Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.PROC_DEL as T99PROCDEL ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PROCDEL = QV.Get("T99PROCDEL", IDVariant.STRING) ;
      }
      QV.Close();
      INTEGRAZIGS4 = new IDVariant(v_PROCDEL);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "ControlloIntegrazioneGS4", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Controllo Delibera
  // **********************************************************************
  public boolean ControlloDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Controllo Delibera Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0)))
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  DEL A ");
        SQL.append("where (A.SEDE_DEL = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO_DEL = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          return (new IDVariant(-1)).booleanValue();
        }
        else
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Delibera inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return (new IDVariant(0)).booleanValue();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "ControlloDelibera", _e);
      return false;
    }
  }

  // **********************************************************************
  // Controllo Proposta
  // **********************************************************************
  public boolean ControlloProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controllo Proposta Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0)))
      {
        return (new IDVariant(-1)).booleanValue();
      }
      else
      {
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  PROPOSTE A ");
        SQL.append("where (A.UNITA_PROPONENTE = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ANNO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          return (new IDVariant(-1)).booleanValue();
        }
        else
        {
          IDVariant v_ERROREPR = new IDVariant(0,IDVariant.STRING);
          v_ERROREPR = (new IDVariant("Proposta inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERROREPR); 
          return (new IDVariant(0)).booleanValue();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "ControlloProposta", _e);
      return false;
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
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "ApriProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposta
  // **********************************************************************
  public int InfoProposta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposta Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "InfoProposta", _e);
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
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibera
  // **********************************************************************
  public int InfoDelibera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibera Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "InfoDelibera", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEESPOS, 0, (new IDVariant("F")));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMDALECO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEALECO, 0, (new IDVariant()));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      if (MainFrm.GESTIOECONOM.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMGESECO, 0, (new IDVariant("N")));
      }
      else
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMGESECO, 0, (new IDVariant("Y")));
      }
      if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(2)), true)!=0)
      {
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEORDIN, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMETIPO, 0, (new IDVariant("T")));
      ControlloIntegrazioneGS4();
      if (!(MainFrm.GESTIODELIBE.booleanValue()))
      {
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEFATTO, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMECENTR, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.equals((new IDVariant(-1)), true))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "EndModalEvent", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEFATTO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMECENTR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMGESECO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMUNIPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMNUMPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMANNPRO, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMSEDDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMNUMDEL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMANNDEL, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Per Imputazione Economica On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_LIQPERIMPECO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_LIQPERIMPECO);
      // 
      // Liquidazioni Per Imputazione Economica On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNDEL, 0))))
      {
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMANNPRO, 0))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_LIQPERIMPECO.SetFlags (Glb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "LiquidazioniPerImputazioneEconomicaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Liquidazioni Per Imputazione Economica On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_LIQPERIMPECO_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Liquidazioni Per Imputazione Economica On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_LIQPERIMPECO_CENTRO)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMECENTR, 0))))
        {
          if (MainFrm.CentriPresente(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMECENTR, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Centro non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMECENTR, 0, PAN_LIQPERIMPECO.GetOrgValue(PFL_LIQPERIMPECO_CENTRO));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQPERIMPECO_FATTORE)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEFATTO, 0))))
        {
          if (MainFrm.FattorePresente(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEFATTO, 0), (new IDVariant("1900/01/01# 00:00:00", IDVariant.DATETIME)), (new IDVariant(""))).equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Fattore non presente", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMEFATTO, 0, PAN_LIQPERIMPECO.GetOrgValue(PFL_LIQPERIMPECO_FATTORE));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQPERIMPECO_DELIBERA)), true) || Column.equals((new IDVariant(PFL_LIQPERIMPECO_DELIBERA)), true) || Column.equals((new IDVariant(PFL_LIQPERIMPECO_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0, IDL.Upper(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMSEDDEL, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_LIQPERIMPECO_PROPOSTA)), true) || Column.equals((new IDVariant(PFL_LIQPERIMPECO_NUMEROPROPOS)), true) || Column.equals((new IDVariant(PFL_LIQPERIMPECO_ANNOPROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0, IDL.Upper(IMDB.Value(IMDBDef16.PQRY_PAR49, IMDBDef16.PQSL_PAR49_ROWNAMUNIPRO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LiquidazioniPerImputazioneEconomica", "LiquidazioniPerImputazioneEconomicaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void LIQPERIMPECO_PAR49() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR49_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR50, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR50, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR49_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR49_RS, 0, IMDBDef6.TBL_PAR50, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 0, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEESPOS, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 1, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEFATTO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 2, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMECENTR, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 3, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 4, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 5, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEORDIN, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 6, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMUNIPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 7, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 8, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 9, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 10, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 11, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 12, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMETIPO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 13, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMDALECO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR49_RS, 14, 0, IMDBDef6.TBL_PAR50, IMDBDef6.FLD_PAR50_ROWNAMEALECO, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR50, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR50, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR50, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR49_RS, 0);
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
  private void PAN_LIQPERIMPECO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_LIQPERIMPECO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_LIQPERIMPECO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_LIQPERIMPECO, Cancel);
    // Stub
  }

  private void PAN_LIQPERIMPECO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_LIQPERIMPECO_FATTORE)
    {
      this.IdxPanelActived = this.PAN_LIQPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQPERIMPECO_CENTRO)
    {
      this.IdxPanelActived = this.PAN_LIQPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQPERIMPECO_ELABORA)
    {
      this.IdxPanelActived = this.PAN_LIQPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQPERIMPECO_APRIDELIBERA)
    {
      this.IdxPanelActived = this.PAN_LIQPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQPERIMPECO_INFODELIBEA)
    {
      this.IdxPanelActived = this.PAN_LIQPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQPERIMPECO_APRIPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_LIQPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriProposta();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_LIQPERIMPECO_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_LIQPERIMPECO.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_LIQPERIMPECO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_LIQPERIMPECO_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_LIQPERIMPECO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_LIQPERIMPECO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_LIQPERIMPECO_Init()
  {

    PAN_LIQPERIMPECO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_LIQPERIMPECO.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, "00081946-6C6B-4D86-97C7-C8EA412ACF26");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 4, 7, 76, 81, 0, 0);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, 0, 65);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, 1, 13);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, 0, 4);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, 1, 4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, "176ED233-B310-4297-8DB0-D9F2558B76E4");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, "Data Liquidazioni");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, MyGlb.PANEL_LIST, 216, -9999, 208, 16, 0, 0);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, MyGlb.PANEL_FORM, 4, 95, 256, 49, 0, 0);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, 0, 96);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, 1, 13);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, 0, 4);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, 1, 4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATALIQUIDAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, "6DBEB2B9-A2A5-40E2-A3F3-C6466FD7D942");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, "Date Competenza");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, MyGlb.PANEL_LIST, 0, -9999, 80, 16, 0, 0);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, MyGlb.PANEL_FORM, 264, 95, 260, 49, 0, 0);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, 0, 101);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, 1, 13);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, 0, 4);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, 1, 4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_DATECOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, "038F7FA7-2A5C-4D1C-A320-92B61AF880BC");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, "Ordinamento Per");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, MyGlb.PANEL_LIST, 424, -9999, 104, 16, 0, 0);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, MyGlb.PANEL_FORM, 4, 247, 204, 49, 0, 0);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, 0, 96);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, 1, 13);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, 0, 4);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, 1, 4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_ORDINAMENPER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, "E0B6C4C7-32CD-4489-B2E0-F6CAC5670962");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, "Tipo");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, MyGlb.PANEL_FORM, 4, 153, 160, 85, 0, 0);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, 0, 24);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, 1, 13);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, 0, 4);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, 1, 4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, "C9854074-219D-448C-9EF1-CFA3C3A7C141");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, "Provvedimento");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, MyGlb.VIS_GROUPSTYLE);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, MyGlb.PANEL_LIST, 0, -9999, 92, 16, 0, 0);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, MyGlb.PANEL_FORM, 168, 153, 356, 85, 0, 0);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, 0, 87);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, 1, 13);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, 0, 4);
    PAN_LIQPERIMPECO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, 1, 4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_GROUP, GRP_LIQPERIMPECO_PROVVEDIMENT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_LIQPERIMPECO.SetSize(MyGlb.OBJ_FIELD, 28);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, "65078033-FFC3-47B6-BC0F-DFA5AA5D407E");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, "Esposizione");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, "51F6811D-08DD-4A14-90B2-0CAF5FADEE3B");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, "Fattore");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, "D3AB20D2-094A-4A5E-A0CC-F88AD7F5D8A0");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, "92DCA03A-D492-4CCD-B46A-6BAC92EBF21F");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, "Centro");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, "E68AC53E-D641-437A-A800-03BAE38E38FC");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, "B973B1E0-9475-495A-BCD2-63573582B787");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, "Dal");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, "666694DB-1E99-4A0B-B40B-0E70A33F8CAD");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, "Al");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, "E8B449AC-E227-4A18-8A28-A2B7842BEED2");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, MyGlb.VIS_SFONEBORDTRA);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, "0B99770A-FF15-450A-914E-93256E732B5A");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, "Dal");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, "DDFE2694-10D4-465A-B7EB-155C04261BEC");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, "Al");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, "E30E1E09-1155-4AA7-9582-327F31310B15");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, "Ordinamento");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.VIS_OPTIONBUTTON);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, "837D0C19-AB3A-4DE7-B33B-679025957E9C");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, "Elabora");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_LIQPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, 0, "button1.gif", false);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, "E2586DFE-7855-43A8-A168-99A51DFB52C5");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, "Tipo");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, "1A9042B5-EC69-49EE-A3B8-F15FAC5A0E4A");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, "Proposta");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, "B63AB942-FB80-47EE-957F-E433E04A2456");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, "Numero Proposta");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, "A7613B71-60B1-4D5C-9D72-4D58C11F1B06");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, "Anno Proposta");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, "CAFDE0A3-32B9-434E-B4DA-C2EB008125F2");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, "Delibera");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, "F4440A96-8883-4810-8168-FBB7ADFE91B2");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, "Numero Delibera");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, "A291281F-0C9F-4B7C-B3A6-C694CBD88ECA");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, "Anno Delibera");
    PAN_LIQPERIMPECO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, "154D72E9-0B4C-480C-A3A8-86F45B27EDE5");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, "6B8737E4-BD88-4B09-914E-A63F0ACB0846");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, 0, "wsearch.gif", false);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, "CCD33150-A4B8-496E-B0D5-17DC51CE1479");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, 0, "info.gif", false);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, "0456FC4E-3AA2-42AA-A092-050C1BEE2759");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, 0, "wsearch.gif", false);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, "30D23A28-DEBB-4266-A933-AD16BC5BF1DB");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, "");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_LIQPERIMPECO.SetImage(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, 0, "info.gif", false);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, "D1622CEA-C199-4E5E-9E07-426074584E8A");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, "-");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, "1D8FA068-E2ED-4A3C-8376-EC2B0FA60973");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, "/");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, "4D4840DA-7FC3-4DEA-B4E5-E57E858927F1");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, "-");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_LIQPERIMPECO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, "0AB4797B-0D84-46C9-9500-572205BDB1BE");
    PAN_LIQPERIMPECO.set_Header(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, "/");
    PAN_LIQPERIMPECO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, MyGlb.VIS_VUOTONORMALE);
    PAN_LIQPERIMPECO.SetFlags(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_LIQPERIMPECO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_LIST, "Esposizione");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 8, 32, 68, 52, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 88);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, 4);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ESPOSIZIONE, MyGlb.PANEL_FORM, "Esposizione");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_ESPOSIZIONE, -1, GRP_LIQPERIMPECO_ESPOSIZIONE);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_ESPOSIZIONE, PPQRY_PAR49, "A.ROWNAMEESPOS", "ROWNAMEESPOS", 5, 1, 0, -13997);
    PAN_LIQPERIMPECO.SetValueListItem(PFL_LIQPERIMPECO_ESPOSIZIONE, (new IDVariant("F")), "Fattore", "", "", -1);
    PAN_LIQPERIMPECO.SetValueListItem(PFL_LIQPERIMPECO_ESPOSIZIONE, (new IDVariant("C")), "Centro", "", "", -1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 96, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 44);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_LIST, "Fattore");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 80, 32, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 52);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_FATTORE, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_FATTORE, PPQRY_PAR49, "A.ROWNAMEFATTO", "ROWNAMEFATTO", 5, 16, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 280, 32, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_FATTORDESCRI, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_FATTORDESCRI, PPQRY_FATTORE, "A.DESCRIZIONE", "ROWNAMFATDES", 5, 200, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 160, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 44);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_LIST, "Centro");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 84, 56, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 48);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_CENTRO, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_CENTRO, PPQRY_PAR49, "A.ROWNAMECENTR", "ROWNAMECENTR", 5, 16, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 280, 55, 244, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_CENTRIDESCRI, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_CENTRIDESCRI, PPQRY_CENTRO, "A.DESCRIZIONE", "ROWNAMCENDES", 5, 200, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_LIST, 216, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_LIST, 24);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_FORM, 24, 120, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_FORM, 28);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_DAL, -1, GRP_LIQPERIMPECO_DATALIQUIDAZ);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_DAL, PPQRY_PAR49, "A.ROWNAMEDAL", "ROWNAMEDAL", 6, 14, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_LIST, 320, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_LIST, 20);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_LIST, "Al");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_FORM, 144, 120, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_FORM, 24);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_AL, MyGlb.PANEL_FORM, "Al");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_AL, -1, GRP_LIQPERIMPECO_DATALIQUIDAZ);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_AL, PPQRY_PAR49, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, MyGlb.PANEL_LIST, 8, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, MyGlb.PANEL_FORM, 8, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ETICHETTASF, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_ETICHETTASF, -1, GRP_LIQPERIMPECO_DATALIQUIDAZ);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_ETICHETTASF, -1, "", "ETICHETTASF", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_LIST, 48);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_LIST, "Dal");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_FORM, 268, 120, 132, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_FORM, 48);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DALECO, MyGlb.PANEL_FORM, "Dal");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_DALECO, -1, GRP_LIQPERIMPECO_DATECOMPETEN);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_DALECO, PPQRY_PAR49, "A.ROWNAMDALECO", "ROWNAMDALECO", 6, 14, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_LIST, 44);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_LIST, "Al");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_FORM, 404, 120, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_FORM, 32);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ALECO, MyGlb.PANEL_FORM, "Al");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_ALECO, -1, GRP_LIQPERIMPECO_DATECOMPETEN);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_ALECO, PPQRY_PAR49, "A.ROWNAMEALECO", "ROWNAMEALECO", 6, 14, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, 424, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, 72);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_LIST, "Ordinamento");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, 8, 272, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, 72);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ORDINAMENTO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_ORDINAMENTO, -1, GRP_LIQPERIMPECO_ORDINAMENPER);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_ORDINAMENTO, PPQRY_PAR49, "A.ROWNAMEORDIN", "ROWNAMEORDIN", 1, 1, 0, -13997);
    PAN_LIQPERIMPECO.SetValueListItem(PFL_LIQPERIMPECO_ORDINAMENTO, (new IDVariant()), "Data Liquidazione", "", "", -1);
    PAN_LIQPERIMPECO.SetValueListItem(PFL_LIQPERIMPECO_ORDINAMENTO, (new IDVariant(2)), "Data Mandato", "", "", -1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 232, 160, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 444, 264, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_ELABORA, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_LIST, 28);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_FORM, 8, 178, 152, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_FORM, 28);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_FORM, 4);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TIPO, MyGlb.PANEL_FORM, "Tp.");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_TIPO, -1, GRP_LIQPERIMPECO_TIPO);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_TIPO, PPQRY_PAR49, "A.ROWNAMETIPO", "ROWNAMETIPO", 12, 1, 0, -13997);
    PAN_LIQPERIMPECO.SetValueListItem(PFL_LIQPERIMPECO_TIPO, (new IDVariant("N")), "Non Emesse in Mandato", "", "", -1);
    PAN_LIQPERIMPECO.SetValueListItem(PFL_LIQPERIMPECO_TIPO, (new IDVariant("E")), "Emesse in Mandato", "", "", -1);
    PAN_LIQPERIMPECO.SetValueListItem(PFL_LIQPERIMPECO_TIPO, (new IDVariant("T")), "Tutte", "", "", -1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_LIST, 92);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_FORM, 176, 178, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_FORM, 64);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_PROPOSTA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_PROPOSTA, PPQRY_PAR49, "A.ROWNAMUNIPRO", "ROWNAMUNIPRO", 5, 8, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_LIST, 92);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_LIST, "Num. Proposta");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_FORM, 376, 178, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_FORM, 8);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMEROPROPOS, MyGlb.PANEL_FORM, "N. P.");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_NUMEROPROPOS, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_NUMEROPROPOS, PPQRY_PAR49, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 80);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_LIST, "Ann. Prop.");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 440, 178, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 8);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNOPROPOSTA, MyGlb.PANEL_FORM, "A. P.");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_ANNOPROPOSTA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_ANNOPROPOSTA, PPQRY_PAR49, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_FORM, 180, 202, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_FORM, 60);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_DELIBERA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_DELIBERA, PPQRY_PAR49, "A.ROWNAMSEDDEL", "ROWNAMSEDDEL", 5, 4, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_LIST, "Num. Delibera");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_FORM, 308, 202, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_FORM, 88);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_NUMERODELIBE, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_NUMERODELIBE, PPQRY_PAR49, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_LIST, "Ann. Delib.");
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_FORM, 376, 202, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_ANNODELIBERA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_ANNODELIBERA, PPQRY_PAR49, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 328, 156, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 172, 222, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_NEWPANELLABE, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, MyGlb.PANEL_LIST, 336, 164, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, MyGlb.PANEL_FORM, 420, 206, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_APRIDELIBERA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_APRIDELIBERA, -1, "", "APRIDELIBERA", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, MyGlb.PANEL_LIST, 344, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, MyGlb.PANEL_FORM, 440, 206, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFODELIBEA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_INFODELIBEA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_INFODELIBEA, -1, "", "INFODELIBEA", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, MyGlb.PANEL_LIST, 344, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, MyGlb.PANEL_FORM, 484, 182, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_APRIPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_APRIPROPOSTA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_APRIPROPOSTA, -1, "", "APRIPROPOSTA", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, MyGlb.PANEL_LIST, 352, 180, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, MyGlb.PANEL_FORM, 504, 182, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_INFOPROPOSTA, -1, GRP_LIQPERIMPECO_PROVVEDIMENT);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, MyGlb.PANEL_LIST, 296, 156, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, MyGlb.PANEL_FORM, 356, 178, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_TRATT, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_TRATT, -1, "", "TRATT", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, MyGlb.PANEL_LIST, 304, 164, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, MyGlb.PANEL_FORM, 424, 178, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT1, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_TRATT1, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_TRATT1, -1, "", "TRATT1", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, MyGlb.PANEL_LIST, 304, 164, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, MyGlb.PANEL_FORM, 288, 202, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT2, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_TRATT2, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_TRATT2, -1, "", "TRATT2", 0, 0, 0, -13997);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, MyGlb.PANEL_LIST, 312, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, MyGlb.PANEL_LIST, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, MyGlb.PANEL_LIST, 1);
    PAN_LIQPERIMPECO.SetRect(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, MyGlb.PANEL_FORM, 356, 202, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_LIQPERIMPECO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, MyGlb.PANEL_FORM, 0);
    PAN_LIQPERIMPECO.SetNumRow(MyGlb.OBJ_FIELD, PFL_LIQPERIMPECO_TRATT3, MyGlb.PANEL_FORM, 1);
    PAN_LIQPERIMPECO.SetFieldPage(PFL_LIQPERIMPECO_TRATT3, -1, -1);
    PAN_LIQPERIMPECO.SetFieldPanel(PFL_LIQPERIMPECO_TRATT3, -1, "", "TRATT3", 0, 0, 0, -13997);
  }

  private void PAN_LIQPERIMPECO_InitQueries()
  {
    StringBuffer SQL;

    PAN_LIQPERIMPECO.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMFATDES ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~ROWNAMEFATTO~~) ");
    PAN_LIQPERIMPECO.SetQuery(PPQRY_FATTORE, 0, SQL, -1, "");
    PAN_LIQPERIMPECO.SetQueryDB(PPQRY_FATTORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQPERIMPECO.SetMasterTable(PPQRY_FATTORE, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as ROWNAMCENDES ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~ROWNAMECENTR~~) ");
    PAN_LIQPERIMPECO.SetQuery(PPQRY_CENTRO, 0, SQL, -1, "");
    PAN_LIQPERIMPECO.SetQueryDB(PPQRY_CENTRO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_LIQPERIMPECO.SetMasterTable(PPQRY_CENTRO, "CENTRI");
    PAN_LIQPERIMPECO.SetIMDB(IMDB, "PQRY_PAR49", true);
    PAN_LIQPERIMPECO.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_LIQPERIMPECO.SetQueryIMDB(PPQRY_PAR49, IMDBDef16.PQRY_PAR49_RS, IMDBDef6.TBL_PAR50);
    JustLoaded = true;
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_ESPOSIZIONE, IMDBDef6.FLD_PAR50_ROWNAMEESPOS);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_FATTORE, IMDBDef6.FLD_PAR50_ROWNAMEFATTO);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_CENTRO, IMDBDef6.FLD_PAR50_ROWNAMECENTR);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_DAL, IMDBDef6.FLD_PAR50_ROWNAMEDAL);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_AL, IMDBDef6.FLD_PAR50_ROWNAMEAL);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_DALECO, IMDBDef6.FLD_PAR50_ROWNAMDALECO);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_ALECO, IMDBDef6.FLD_PAR50_ROWNAMEALECO);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_ORDINAMENTO, IMDBDef6.FLD_PAR50_ROWNAMEORDIN);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_TIPO, IMDBDef6.FLD_PAR50_ROWNAMETIPO);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_PROPOSTA, IMDBDef6.FLD_PAR50_ROWNAMUNIPRO);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_NUMEROPROPOS, IMDBDef6.FLD_PAR50_ROWNAMNUMPRO);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_ANNOPROPOSTA, IMDBDef6.FLD_PAR50_ROWNAMANNPRO);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_DELIBERA, IMDBDef6.FLD_PAR50_ROWNAMSEDDEL);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_NUMERODELIBE, IMDBDef6.FLD_PAR50_ROWNAMNUMDEL);
    PAN_LIQPERIMPECO.SetFieldPrimaryIndex(PFL_LIQPERIMPECO_ANNODELIBERA, IMDBDef6.FLD_PAR50_ROWNAMANNDEL);
    PAN_LIQPERIMPECO.SetMasterTable(0, "PAR50");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_LIQPERIMPECO.Status() == 2)
    {
      int oldListQBE = PAN_LIQPERIMPECO.iUseListQBE;
      PAN_LIQPERIMPECO.iUseListQBE = 0;
      PAN_LIQPERIMPECO.PanelCommand(Glb.PCM_SEARCH);
      PAN_LIQPERIMPECO.PanelCommand(Glb.PCM_FIND);
      PAN_LIQPERIMPECO.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_LIQPERIMPECO) PAN_LIQPERIMPECO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQPERIMPECO) PAN_LIQPERIMPECO_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_LIQPERIMPECO) PAN_LIQPERIMPECO_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_LIQPERIMPECO) PAN_LIQPERIMPECO_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_LIQPERIMPECO) PAN_LIQPERIMPECO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
