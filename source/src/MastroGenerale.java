// **********************************************
// Mastro Generale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MastroGenerale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PAR_PARTE = 0;
  private static int GRP_PAR_CAPITOLO = 1;

  private static int PFL_PAR_PARTE = 0;
  private static int PFL_PAR_LABELPARTESX = 1;
  private static int PFL_PAR_LABELPARTEDX = 2;
  private static int PFL_PAR_CAPITOLODAL = 3;
  private static int PFL_PAR_ARTICOLODAL = 4;
  private static int PFL_PAR_CAPITOLOAL = 5;
  private static int PFL_PAR_ARTICOLOAL = 6;
  private static int PFL_PAR_APRIPEG1 = 7;
  private static int PFL_PAR_INFOPEG1 = 8;
  private static int PFL_PAR_APRIPEG2 = 9;
  private static int PFL_PAR_INFOPEG2 = 10;
  private static int PFL_PAR_TRATTINO2 = 11;
  private static int PFL_PAR_TRATTINO3 = 12;
  private static int PFL_PAR_RESICOMPENTR = 13;
  private static int PFL_PAR_ANNORESIDUO = 14;
  private static int PFL_PAR_MISSIONE = 15;
  private static int PFL_PAR_PROGRAMMA = 16;
  private static int PFL_PAR_UOUTILIZZO = 17;
  private static int PFL_PAR_UOGESTIONE = 18;
  private static int PFL_PAR_CENTRDICOSTO = 19;
  private static int PFL_PAR_SETTOROPERAT = 20;
  private static int PFL_PAR_SERVIZOPERAT = 21;
  private static int PFL_PAR_CHECKUOSO = 22;
  private static int PFL_PAR_ELABORA = 23;
  private static int PFL_PAR_DESCRIINTERV = 24;

  private static int PPQRY_PAR65 = 0;

  private static int PPQRY_FUNZIONI = 1;
  private static int PPQRY_SERVIZI = 2;
  private static int PPQRY_ANAGUNITORG1 = 3;
  private static int PPQRY_ANAGUNITORGA = 4;
  private static int PPQRY_CENCOS = 5;
  private static int PPQRY_SETTOROPERAT = 6;
  private static int PPQRY_SERVIZOPERAT = 7;


  IDPanel PAN_PAR;

  // Definition of Global Variables
  private IDVariant INIZIOWEB = new IDVariant(0,IDVariant.INTEGER);
  private IDVariant MODALVOCEDA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR110(IMDB);
    //
    //
    Init_PQRY_PAR65(IMDB);
    Init_PQRY_PAR65_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR110(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR110, 16);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR110, "TBL_PAR110");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMCAPDAL, "ROWNAMCAPDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMCAPDAL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMARTDAL, "ROWNAMARTDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMARTDAL,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMECAPAL, "ROWNAMECAPAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMECAPAL,3,16,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEARTAL, "ROWNAMEARTAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEARTAL,1,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMRECOEN,12,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEMISSI, "ROWNAMEMISSI");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEMISSI,5,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMCEDICO, "ROWNAMCEDICO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMCEDICO,5,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMSETOPE, "ROWNAMSETOPE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMSETOPE,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMSEROPE,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEUOSUD, "ROWNAMEUOSUD");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEUOSUD,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEUOSOT, "ROWNAMEUOSOT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMEUOSOT,1,8,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMCHSOUO, "ROWNAMCHSOUO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMCHSOUO,1,1,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR110,IMDBDef6.FLD_PAR110_ROWNAMDESINT,1,2,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR110, 0);
  }

  private static void Init_PQRY_PAR65(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR65, 16);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR65, "PQRY_PAR65");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, "ROWNAMCAPDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, "ROWNAMARTDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMARTDAL,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, "ROWNAMECAPAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMECAPAL,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, "ROWNAMEARTAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEARTAL,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMRECOEN,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMCHSOUO, "ROWNAMCHSOUO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMCHSOUO,1,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMDESINT,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEMISSI, "ROWNAMEMISSI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEMISSI,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMCEDICO, "ROWNAMCEDICO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMCEDICO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMSETOPE, "ROWNAMSETOPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMSETOPE,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMSEROPE,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEUOSUD, "ROWNAMEUOSUD");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEUOSUD,1,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT, "ROWNAMEUOSOT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65,IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT,1,8,0);
    IMDB.TblAddNew(IMDBDef16.PQRY_PAR65, 0);
  }

  private static void Init_PQRY_PAR65_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef16.PQRY_PAR65_RS, 16);
    IMDB.set_TblCode(IMDBDef16.PQRY_PAR65_RS, "PQRY_PAR65_RS");
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, "ROWNAMCAPDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, "ROWNAMARTDAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMARTDAL,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, "ROWNAMECAPAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMECAPAL,3,16,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, "ROWNAMEARTAL");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEARTAL,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMRECOEN,12,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMANNRES, "ROWNAMANNRES");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMANNRES,1,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMCHSOUO, "ROWNAMCHSOUO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMCHSOUO,1,1,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMDESINT,1,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEMISSI, "ROWNAMEMISSI");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEMISSI,5,2,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, "ROWNAMEPROGR");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEPROGR,5,4,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMCEDICO, "ROWNAMCEDICO");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMCEDICO,5,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMSETOPE, "ROWNAMSETOPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMSETOPE,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMSEROPE,1,6,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEUOSUD, "ROWNAMEUOSUD");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEUOSUD,1,8,0);
    IMDB.set_FldCode(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT, "ROWNAMEUOSOT");
    IMDB.SetFldParams(IMDBDef16.PQRY_PAR65_RS,IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT,1,8,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MastroGenerale(MyWebEntryPoint w, IMDBObj imdb)
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
  public MastroGenerale()
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
    FormIdx = MyGlb.FRM_MASTROGENERA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "35F8ADD9-23EE-4BE9-A87A-FE9AA63BD582";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 612;
    DesignHeight = 466;
    set_Caption(new IDVariant("Mastro Generale"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 612;
    Frames[1].Height = 440;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Par";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 440;
    PAN_PAR = new IDPanel(w, this, 1, "PAN_PAR");
    Frames[1].Content = PAN_PAR;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 612-MyGlb.PAN_OFFS_X, 440-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D4F6D90F-7AC3-4CA0-8CBA-1ED21AD89F49");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1080, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 2;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR110, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MASTROGENERA_PAR65();
      }
      PAN_PAR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PAR.FrIndex)
    {
      if (IdxFieldActived ==PFL_PAR_APRIPEG1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PAR.FrIndex)
    {
      if (IdxFieldActived ==PFL_PAR_APRIPEG2) {
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
    return (obj instanceof MastroGenerale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MastroGenerale.class.getName() : (Glb.ClassWithPackage(MastroGenerale.class) ? MastroGenerale.class.getName().substring(MastroGenerale.class.getPackage().getName().length() + 1) : MastroGenerale.class.getName()));
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
      LOADEVENT_PARDELETROWS();
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMRECOEN, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEPARTE, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCHSOUO, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEMISSI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEPROGR, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCEDICO, 0, (new IDVariant("-1")));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMSETOPE, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMSEROPE, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEUOSUD, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEUOSOT, 0, (new IDVariant(-1)));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo(IDL.NullValue(MainFrm.ESERCIZIO_INIZIO_WEB,(new IDVariant(2999))), true)<0)
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Servizio Operativo", IDVariant.STRING));
        INIZIOWEB = (new IDVariant(0));
        PAN_PAR.set_Header(Glb.OBJ_FIELD,PFL_PAR_CHECKUOSO, new IDVariant(v_CAPTION).stringValue());
        PAN_PAR.ClearValueList(PFL_PAR_CHECKUOSO);
        PAN_PAR.SetValueListItem(PFL_PAR_CHECKUOSO, (new IDVariant(1)), IDL.ToString((new IDVariant(1))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PAR.SetValueListItem(PFL_PAR_CHECKUOSO, (new IDVariant(0)), IDL.ToString((new IDVariant(0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_UOGESTIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);
        v_CAPTION = (new IDVariant("Unità Organizzativa", IDVariant.STRING));
        INIZIOWEB = (new IDVariant(-1));
        PAN_PAR.set_Header(Glb.OBJ_FIELD,PFL_PAR_CHECKUOSO, new IDVariant(v_CAPTION).stringValue());
        PAN_PAR.ClearValueList(PFL_PAR_CHECKUOSO);
        PAN_PAR.SetValueListItem(PFL_PAR_CHECKUOSO, (new IDVariant(2)), IDL.ToString((new IDVariant(2))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PAR.SetValueListItem(PFL_PAR_CHECKUOSO, (new IDVariant(0)), IDL.ToString((new IDVariant(0))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_UOGESTIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Par: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARDELETROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCAPDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMARTDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMECAPAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEARTAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMRECOEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMANNRES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEMISSI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEPROGR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCEDICO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMSETOPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMSEROPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEUOSUD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEUOSOT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCHSOUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMDESINT, 0, new IDVariant());
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
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCAPDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMARTDAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMECAPAL, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEARTAL, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "UnloadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true) && MODALVOCEDA.booleanValue())
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCAPDAL, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMARTDAL, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true) && Result.equals((new IDVariant(-1)), true) && !(MODALVOCEDA.booleanValue()))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMECAPAL, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEARTAL, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "EndModalEvent", _e);
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Capitolo dal inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0))))
      {
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTATORE.equals((new IDVariant(0)), true))
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Capitolo al inesistente", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      if (!(INIZIOWEB.booleanValue()) || (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSUD, 0).equals((new IDVariant(-1)), true) && IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT, 0).equals((new IDVariant(-1)), true)))
      {
        if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.Cf4armDBObject.WORKSTAMPAMSGE(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0),(new IDVariant(1.000000000000000e+016))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0),(new IDVariant(99))), (new IDVariant(-1)), (new IDVariant(-1)), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCEDICO, 0),(new IDVariant("-1"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMSETOPE, 0),(new IDVariant(-1))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMSEROPE, 0),(new IDVariant(-1))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("R"))))?(new IDVariant("NO")):(new IDVariant("SI"))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("C"))))?(new IDVariant("NO")):(new IDVariant("SI"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMANNRES, 0),(new IDVariant(-1))), MainFrm.PROGRESESSIO);
        }
        else
        {
          MainFrm.Cf4armDBObject.WORKSTAMPAMSGS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0),(new IDVariant(1.000000000000000e+016))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0),(new IDVariant(99))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEMISSI, 0),(new IDVariant("-1"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, 0),(new IDVariant("-1"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCEDICO, 0),(new IDVariant("-1"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMSETOPE, 0),(new IDVariant(-1))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMSEROPE, 0),(new IDVariant(-1))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("R"))))?(new IDVariant("NO")):(new IDVariant("SI"))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("C"))))?(new IDVariant("NO")):(new IDVariant("SI"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMANNRES, 0),(new IDVariant(-1))), MainFrm.PROGRESESSIO);
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.Cf4armDBObject.WORKSTAMPAMSGEUO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0),(new IDVariant(1.000000000000000e+016))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0),(new IDVariant(99))), (new IDVariant(-1)), (new IDVariant(-1)), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSUD, 0),(new IDVariant(-1))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT, 0),(new IDVariant(-1))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("R"))))?(new IDVariant("NO")):(new IDVariant("SI"))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("C"))))?(new IDVariant("NO")):(new IDVariant("SI"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMANNRES, 0),(new IDVariant(-1))), MainFrm.PROGRESESSIO);
        }
        else
        {
          MainFrm.Cf4armDBObject.WORKSTAMPAMSGSUO(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0),(new IDVariant(0))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0),(new IDVariant(1.000000000000000e+016))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0),(new IDVariant(99))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEMISSI, 0),(new IDVariant("-1"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, 0),(new IDVariant("-1"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSUD, 0),(new IDVariant(-1))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT, 0),(new IDVariant(-1))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("R"))))?(new IDVariant("NO")):(new IDVariant("SI"))), ((IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("C"))))?(new IDVariant("NO")):(new IDVariant("SI"))), IDL.NullValue(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMANNRES, 0),(new IDVariant(-1))), MainFrm.PROGRESESSIO);
        }
      }
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
          MainFrm.SetParametroStampaJasper((new IDVariant("E_S")), IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("STAMPA_SO")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCHSOUO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), IDL.ToString(IDL.Today()));
          MainFrm.SetParametroStampaJasper((new IDVariant("INT")), IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0), (new IDVariant(" Esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" elaborato in data "))), MainFrm.Datetostring(IDL.Today())), (new IDVariant(" ore "))), IDL.ToString(IDL.Time())));
          MainFrm.LanciaStampaJasper((new IDVariant("Mastro_Generale_e")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
        else
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
          MainFrm.SetParametroStampaJasper((new IDVariant("E_S")), IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("STAMPA_SO")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCHSOUO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("STAMPA_DI")), IDL.ToString(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMDESINT, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("DATA")), IDL.ToString(IDL.Today()));
          MainFrm.SetParametroStampaJasper((new IDVariant("INT")), IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(IMDB.Value(IMDBDef7.TBL_T64, IMDBDef7.FLD_T64_DENOMINAZIONE, 0), (new IDVariant(" Esercizio "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" elaborato in data "))), MainFrm.Datetostring(IDL.Today())), (new IDVariant(" ore "))), IDL.ToString(IDL.Time())));
          MainFrm.LanciaStampaJasper((new IDVariant("Mastro_Generale_s")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce PEG Dal
  // **********************************************************************
  public int ApriVocePEGDal ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce PEG Dal Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0));
      MODALVOCEDA = (new IDVariant(-1));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "ApriVocePEGDal", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg Dal
  // **********************************************************************
  public int InfoVocePegDal ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Dal Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0));
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "InfoVocePegDal", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Voce PEG Al
  // **********************************************************************
  public int ApriVocePEGAl ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Voce PEG Al Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0));
      MODALVOCEDA = (new IDVariant(0));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "ApriVocePEGAl", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg Al
  // **********************************************************************
  public int InfoVocePegAl ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Al Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0));
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "InfoVocePegAl", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Par On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PAR);
      // 
      // Par On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCAPDAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMARTDAL, 0))))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMECAPAL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEARTAL, 0))))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG2, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_INFOPEG2, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("E")), true) || IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMRECOEN, 0).equals((new IDVariant("R")), true))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true))
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_MISSIONE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_PROGRAMMA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_MISSIONE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_PROGRAMMA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (INIZIOWEB.booleanValue())
      {
        if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT, 0).equals((new IDVariant(-1)), true))
        {
          PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_CHECKUOSO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_CHECKUOSO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
      else
      {
        if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMSETOPE, 0).equals((new IDVariant(-1)), true))
        {
          PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PAR.SetFlags (Glb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "ParOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Par On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PAR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Par On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PAR_ANNORESIDUO)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMANNRES, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("L'Anno Residuo deve essere precedente all'esercizio", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMANNRES, 0, ((PAN_PAR.GetOrgValue(PFL_PAR_ANNORESIDUO).equals((new IDVariant())))?(new IDVariant()):IDL.ToInteger(PAN_PAR.GetOrgValue(PFL_PAR_ANNORESIDUO))));
        }
      }
      if (Column.equals((new IDVariant(PFL_PAR_UOGESTIONE)), true))
      {
        if (FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEUOSOT, 0))))
          {
            IMDB.set_Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMCHSOUO, 0, (new IDVariant(2)));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PAR_PARTE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEMISSI, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PAR_MISSIONE)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, 0, (new IDVariant()));
      }
      if (Column.equals((new IDVariant(PFL_PAR_PROGRAMMA)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, 0))))
        {
          IMDB.set_Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEMISSI, 0, IDL.SubStr(IMDB.Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMEPROGR, 0), (new IDVariant(1)), (new IDVariant(2))));
        }
      }
      if (!(INIZIOWEB.booleanValue()))
      {
        if (Column.equals((new IDVariant(PFL_PAR_SETTOROPERAT)), true) && FieldWasModified.booleanValue())
        {
          IMDB.set_Value(IMDBDef16.PQRY_PAR65, IMDBDef16.PQSL_PAR65_ROWNAMSEROPE, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MastroGenerale", "ParOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void MASTROGENERA_PAR65() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef16.PQRY_PAR65_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR110, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR110, 0))
    {
      IMDB.TblAddNew(IMDBDef16.PQRY_PAR65_RS, 0);
      IMDB.TblLinkRow(IMDBDef16.PQRY_PAR65_RS, 0, IMDBDef6.TBL_PAR110, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 0, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 1, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCAPDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 2, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMARTDAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 3, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMECAPAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 4, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEARTAL, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 5, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMRECOEN, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 6, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMANNRES, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 7, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCHSOUO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 8, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 9, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEMISSI, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 10, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEPROGR, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 11, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMCEDICO, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 12, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMSETOPE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 13, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMSEROPE, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 14, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEUOSUD, 0);
      IMDB.TblLinkField(IMDBDef16.PQRY_PAR65_RS, 15, 0, IMDBDef6.TBL_PAR110, IMDBDef6.FLD_PAR110_ROWNAMEUOSOT, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR110, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR110, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR110, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef16.PQRY_PAR65_RS, 0);
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
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PAR_APRIPEG1)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePEGDal();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_INFOPEG1)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePegDal();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_APRIPEG2)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriVocePEGAl();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_INFOPEG2)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePegAl();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PAR_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PAR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, "D0ECABF7-D2D5-469C-8440-1AA3143B3A05");
    PAN_PAR.set_Header(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, "Parte");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, MyGlb.PANEL_LIST, 0, -9999, 40, 16, 0, 0);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, MyGlb.PANEL_FORM, 48, 7, 460, 53, 0, 0);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, 0, 31);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, 1, 13);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, 0, 4);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, 1, 4);
    PAN_PAR.SetFlags(MyGlb.OBJ_GROUP, GRP_PAR_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, "C7E2487F-7032-4247-9DB8-B515883B81BB");
    PAN_PAR.set_Header(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, "Capitolo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, MyGlb.PANEL_LIST, 0, -9999, 232, 16, 0, 0);
    PAN_PAR.SetRect(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, MyGlb.PANEL_FORM, 48, 67, 332, 77, 0, 0);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, 0, 46);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, 1, 13);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, 0, 4);
    PAN_PAR.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, 1, 4);
    PAN_PAR.SetFlags(MyGlb.OBJ_GROUP, GRP_PAR_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 25);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, "B95A6FB3-3D8F-4F2A-B9B3-4CC134B80FCC");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, "Parte");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, "3EC665B8-B6E3-4271-A43D-3B03D8C3873D");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, "D7D0EA2C-08BD-4DC8-9ACE-D51814AEDEF6");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, "E0B5BB33-6C38-4FB8-8FA6-89055210231C");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, "Capitolo/Art. dal");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.VIS_NORFIEINTLUN);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, "E9FEA255-AB53-4CAA-A982-7486A39FF593");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, "Articolo Dal");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, "42F5E74A-6664-49CA-9DD9-8CC80C26D2BD");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, "Capitolo/Art. al");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.VIS_NORFIEINTLUN);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, "7329F32B-A0A4-4A27-93DD-9358F4724811");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, "Articolo Al");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, "7F7BEC08-247C-4D33-A842-DA4695AE3DB1");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, 0, "wsearch.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, "78CF0844-C62D-4EF8-BC9B-3771797EBDA4");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, 0, "info.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, "360285A6-744E-41AD-A293-5EEBAFDF7729");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, 0, "wsearch.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, "40C7257E-2578-4D16-905D-606E5576AE63");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, 0, "info.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, "6A44A3CE-191C-496E-834E-8D318E7E16F1");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, "/");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, "2A45D127-3B53-4CE1-8D36-51C7621D80BB");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, "/");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, "31082658-666D-402D-B040-F596DCC90D9A");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, "Residui Competenze Entrambi");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, "0E6F503C-A73D-4A1A-9BB1-3B86ADD14B93");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, "Anno Residuo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, "1A752D73-8D8C-41DD-AEBB-922F59BEC551");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, "Missione");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, "B2DDFF5D-DCB9-48BC-8E62-8FFF802BBF8B");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, "Programma");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, "8C8E19A0-B891-4768-BE54-778A5BA0A061");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, "U.O. Utilizzo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, "7CF60AD9-ADC3-4D1A-9398-AED7612E4045");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, "U.O. Gestione");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, "2395C3CF-A446-440D-B0D5-A4256BE2D846");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, "Centro Di Costo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, "A534B1E3-0174-41C6-8854-A596D71FF39F");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, "Settore Operativo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, "09346F5E-96E9-4D8C-A573-74B099DBC6B6");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, "Servizio Operativo");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, "907137AD-361F-456E-AB1A-A1924C74B43F");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, "Check UO SO");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "9EACE614-5063-449B-9B9C-18887BD5B769");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, "Elabora");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0, "button1.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, "8ED0E1BF-4E35-4F7F-B15A-23D383C0C005");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, "Descrizione Intervento");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.VIS_NORMFIELPADR);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_FORM, 164, 32, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_FORM, 36);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_PARTE, MyGlb.PANEL_FORM, "Par.");
    PAN_PAR.SetFieldPage(PFL_PAR_PARTE, -1, GRP_PAR_PARTE);
    PAN_PAR.SetFieldPanel(PFL_PAR_PARTE, PPQRY_PAR65, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, MyGlb.PANEL_LIST, 12, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, MyGlb.PANEL_FORM, 52, 44, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTESX, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_LABELPARTESX, -1, GRP_PAR_PARTE);
    PAN_PAR.SetFieldPanel(PFL_PAR_LABELPARTESX, -1, "", "LABELPARTESX", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, MyGlb.PANEL_LIST, 20, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, MyGlb.PANEL_FORM, 480, 44, 24, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_LABELPARTEDX, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_LABELPARTEDX, -1, GRP_PAR_PARTE);
    PAN_PAR.SetFieldPanel(PFL_PAR_LABELPARTEDX, -1, "", "LABELPARTEDX", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_LIST, 88, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_LIST, "Cap. Art dal");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_FORM, 52, 92, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_FORM, 104);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLODAL, MyGlb.PANEL_FORM, "Capitolo/Art. dal");
    PAN_PAR.SetFieldPage(PFL_PAR_CAPITOLODAL, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_CAPITOLODAL, PPQRY_PAR65, "A.ROWNAMCAPDAL", "ROWNAMCAPDAL", 3, 16, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_LIST, 160, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_LIST, 44);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_LIST, "Articolo Dal");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_FORM, 320, 92, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_FORM, 160);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLODAL, MyGlb.PANEL_FORM, "Articolo Dal");
    PAN_PAR.SetFieldPage(PFL_PAR_ARTICOLODAL, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_ARTICOLODAL, PPQRY_PAR65, "A.ROWNAMARTDAL", "ROWNAMARTDAL", 1, 2, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_LIST, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_LIST, "Cp. A. a.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_FORM, 52, 120, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_FORM, 104);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CAPITOLOAL, MyGlb.PANEL_FORM, "Capitolo/Art. al");
    PAN_PAR.SetFieldPage(PFL_PAR_CAPITOLOAL, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_CAPITOLOAL, PPQRY_PAR65, "A.ROWNAMECAPAL", "ROWNAMECAPAL", 3, 16, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_LIST, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_LIST, "Artic. Al");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_FORM, 320, 120, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_FORM, 56);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ARTICOLOAL, MyGlb.PANEL_FORM, "Artic. Al");
    PAN_PAR.SetFieldPage(PFL_PAR_ARTICOLOAL, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_ARTICOLOAL, PPQRY_PAR65, "A.ROWNAMEARTAL", "ROWNAMEARTAL", 1, 2, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_LIST, 256, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_FORM, 344, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_APRIPEG1, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_APRIPEG1, -1, "", "APRIPEG1", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_LIST, 264, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_FORM, 360, 96, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG1, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_INFOPEG1, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_INFOPEG1, -1, "", "INFOPEG1", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_LIST, 264, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_FORM, 344, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_APRIPEG2, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_APRIPEG2, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_APRIPEG2, -1, "", "APRIPEG2", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_LIST, 272, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_FORM, 360, 124, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_INFOPEG2, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_INFOPEG2, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_INFOPEG2, -1, "", "INFOPEG2", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_LIST, 92, 172, 16, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_LIST, 2);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_FORM, 304, 92, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO2, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_TRATTINO2, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_TRATTINO2, -1, "", "TRATTINO2", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_LIST, 100, 180, 16, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_LIST, 2);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_FORM, 304, 120, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TRATTINO3, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_TRATTINO3, -1, GRP_PAR_CAPITOLO);
    PAN_PAR.SetFieldPanel(PFL_PAR_TRATTINO3, -1, "", "TRATTINO3", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, 376, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, 152);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_LIST, "Res. Compet. Entrambi");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, 416, 68, 96, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, 160);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, 4);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_RESICOMPENTR, MyGlb.PANEL_FORM, "Residui Competenze Entrambi");
    PAN_PAR.SetFieldPage(PFL_PAR_RESICOMPENTR, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_RESICOMPENTR, PPQRY_PAR65, "A.ROWNAMRECOEN", "ROWNAMRECOEN", 12, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_RESICOMPENTR, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_RESICOMPENTR, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_RESICOMPENTR, (new IDVariant("E")), "Entrambi", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_LIST, 76);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_LIST, "Anno Residuo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_FORM, 384, 132, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_FORM, 88);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ANNORESIDUO, MyGlb.PANEL_FORM, "Anno Residuo");
    PAN_PAR.SetFieldPage(PFL_PAR_ANNORESIDUO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ANNORESIDUO, PPQRY_PAR65, "A.ROWNAMANNRES", "ROWNAMANNRES", 1, 4, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_LIST, 52);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_LIST, "Miss.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_FORM, 64, 164, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_FORM, 92);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_MISSIONE, MyGlb.PANEL_FORM, "Missione");
    PAN_PAR.SetFieldPage(PFL_PAR_MISSIONE, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_MISSIONE, PPQRY_PAR65, "A.ROWNAMEMISSI", "ROWNAMEMISSI", 5, 2, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_LIST, "Progr.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_FORM, 68, 188, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_FORM, 88);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_PROGRAMMA, MyGlb.PANEL_FORM, "Programma");
    PAN_PAR.SetFieldPage(PFL_PAR_PROGRAMMA, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_PROGRAMMA, PPQRY_PAR65, "A.ROWNAMEPROGR", "ROWNAMEPROGR", 5, 4, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_LIST, 88);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_LIST, "U.O. Utilizzo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_FORM, 28, 212, 484, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_FORM, 128);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UOUTILIZZO, MyGlb.PANEL_FORM, "U.O. Utilizzo");
    PAN_PAR.SetFieldPage(PFL_PAR_UOUTILIZZO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_UOUTILIZZO, PPQRY_PAR65, "A.ROWNAMEUOSUD", "ROWNAMEUOSUD", 1, 8, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_LIST, 84);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_LIST, "U.O. Gestione");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_FORM, 32, 236, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_FORM, 124);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_UOGESTIONE, MyGlb.PANEL_FORM, "U.O. Gestione");
    PAN_PAR.SetFieldPage(PFL_PAR_UOGESTIONE, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_UOGESTIONE, PPQRY_PAR65, "A.ROWNAMEUOSOT", "ROWNAMEUOSOT", 1, 8, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_LIST, 84);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_LIST, "Centro Di Costo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_FORM, 32, 212, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_FORM, 124);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CENTRDICOSTO, MyGlb.PANEL_FORM, "Centro Di Costo");
    PAN_PAR.SetFieldPage(PFL_PAR_CENTRDICOSTO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_CENTRDICOSTO, PPQRY_PAR65, "A.ROWNAMCEDICO", "ROWNAMCEDICO", 5, 8, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_LIST, 96);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_LIST, "Settore Operativo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_FORM, 20, 236, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_FORM, 136);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SETTOROPERAT, MyGlb.PANEL_FORM, "Settore Operativo");
    PAN_PAR.SetFieldPage(PFL_PAR_SETTOROPERAT, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SETTOROPERAT, PPQRY_PAR65, "A.ROWNAMSETOPE", "ROWNAMSETOPE", 1, 6, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, 96);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_LIST, "Servizio Operativo");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, 20, 260, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, 136);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SERVIZOPERAT, MyGlb.PANEL_FORM, "Servizio Operativo");
    PAN_PAR.SetFieldPage(PFL_PAR_SERVIZOPERAT, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SERVIZOPERAT, PPQRY_PAR65, "A.ROWNAMSEROPE", "ROWNAMSEROPE", 1, 6, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_LIST, 464, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_LIST, 48);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_LIST, "Check UO SO");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_FORM, 12, 284, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_FORM, 144);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_CHECKUOSO, MyGlb.PANEL_FORM, "Check UO SO");
    PAN_PAR.SetFieldPage(PFL_PAR_CHECKUOSO, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_CHECKUOSO, PPQRY_PAR65, "A.ROWNAMCHSOUO", "ROWNAMCHSOUO", 1, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_CHECKUOSO, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_CHECKUOSO, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 204, 136, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 432, 320, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_ELABORA, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_LIST, 140);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_LIST, "Descrizione Intervento");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_FORM, 4, 356, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_FORM, 140);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_PAR.SetFieldPage(PFL_PAR_DESCRIINTERV, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_DESCRIINTERV, PPQRY_PAR65, "A.ROWNAMDESINT", "ROWNAMDESINT", 1, 2, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_DESCRIINTERV, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_DESCRIINTERV, (new IDVariant(0)), "Zero", "", "", -1);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 8);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as FUNVISMIPRMI, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as FUNZIODESCRI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = ~~ROWNAMEMISSI~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PAR.SetQuery(PPQRY_FUNZIONI, 0, SQL, PFL_PAR_MISSIONE, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.MISSIONE as FUNVISMIPRMI, ");
    SQL.append("  A.MISSIONE || ' - ' || A.DES_MISSIONE as FUNZIODESCRI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PAR.SetQuery(PPQRY_FUNZIONI, 1, SQL, PFL_PAR_MISSIONE, "");
    PAN_PAR.SetQueryDB(PPQRY_FUNZIONI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as SERVISMIPRPR, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as SERVIZDESCRI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.PROGRAMMA = ~~ROWNAMEPROGR~~) ");
    SQL.append("and   (A.MISSIONE = NVL(~~ROWNAMEMISSI~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PAR.SetQuery(PPQRY_SERVIZI, 0, SQL, PFL_PAR_PROGRAMMA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRAMMA as SERVISMIPRPR, ");
    SQL.append("  A.PROGRAMMA || ' - ' || A.DES_PROGRAMMA as SERVIZDESCRI ");
    SQL.append("from ");
    SQL.append("  VISTA_MISSIONI_PROGRAMMI A ");
    SQL.append("where (A.MISSIONE = NVL(~~ROWNAMEMISSI~~, A.MISSIONE)) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_PAR.SetQuery(PPQRY_SERVIZI, 1, SQL, PFL_PAR_PROGRAMMA, "");
    PAN_PAR.SetQueryDB(PPQRY_SERVIZI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.ID_SUDDIVISIONE as ANAUNIORIDSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~ROWNAMEUOSUD~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.AL IS NULL) OR A.AL >= TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUOSUD~~ = -1) ");
    SQL.append("order by 3, 2 ");
    PAN_PAR.SetQuery(PPQRY_ANAGUNITORG1, 0, SQL, PFL_PAR_UOUTILIZZO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.ID_SUDDIVISIONE as ANAUNIORIDSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.AL IS NULL) OR A.AL >= TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 3, 2 ");
    PAN_PAR.SetQuery(PPQRY_ANAGUNITORG1, 1, SQL, PFL_PAR_UOUTILIZZO, "");
    PAN_PAR.SetQueryDB(PPQRY_ANAGUNITORG1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.ID_SUDDIVISIONE as ANAUNIORIDSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.PROGR_UNITA_ORGANIZZATIVA = ~~ROWNAMEUOSOT~~) ");
    SQL.append("and   (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.AL IS NULL) OR A.AL >= TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUOSOT~~ = -1) ");
    SQL.append("order by 3, 2 ");
    PAN_PAR.SetQuery(PPQRY_ANAGUNITORGA, 0, SQL, PFL_PAR_UOGESTIONE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGR_UNITA_ORGANIZZATIVA as ANUNORPRUNOR, ");
    SQL.append("  A.ID_SUDDIVISIONE as ANAUNIORIDSU, ");
    SQL.append("  A.CODICE_UO || ' - ' || A.DESCRIZIONE as ANAUNIORGDES ");
    SQL.append("from ");
    SQL.append("  ANAGRAFE_UNITA_ORGANIZZATIVE A ");
    SQL.append("where (A.OTTICA = " + IDL.CSql(MainFrm.OTTICA, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   ((A.AL IS NULL) OR A.AL >= TRUNC( SYSDATE )) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 3, 2 ");
    PAN_PAR.SetQuery(PPQRY_ANAGUNITORGA, 1, SQL, PFL_PAR_UOGESTIONE, "");
    PAN_PAR.SetQueryDB(PPQRY_ANAGUNITORGA, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CENTRO_COSTO as CENCCENTCOST, ");
    SQL.append("  A.CENTRO_COSTO || ' - ' || A.DESCRIZIONE as CENCOSDESCRI ");
    SQL.append("from ");
    SQL.append("  CENCOS A ");
    SQL.append("where (A.CENTRO_COSTO = ~~ROWNAMCEDICO~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMCEDICO~~ = '-1') ");
    SQL.append("order by 1 ");
    PAN_PAR.SetQuery(PPQRY_CENCOS, 0, SQL, PFL_PAR_CENTRDICOSTO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CENTRO_COSTO as CENCCENTCOST, ");
    SQL.append("  A.CENTRO_COSTO || ' - ' || A.DESCRIZIONE as CENCOSDESCRI ");
    SQL.append("from ");
    SQL.append("  CENCOS A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  '-1', ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PAR.SetQuery(PPQRY_CENCOS, 1, SQL, PFL_PAR_CENTRDICOSTO, "");
    PAN_PAR.SetQueryDB(PPQRY_CENCOS, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SETTORE as OPESETSETTOR, ");
    SQL.append("  TO_CHAR ( A.SETTORE ) || ' - ' || A.DESCRIZIONE as OPESETDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESET A ");
    SQL.append("where (A.SETTORE = ~~ROWNAMSETOPE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMSETOPE~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PAR.SetQuery(PPQRY_SETTOROPERAT, 0, SQL, PFL_PAR_SETTOROPERAT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SETTORE as OPESETSETTOR, ");
    SQL.append("  TO_CHAR ( A.SETTORE ) || ' - ' || A.DESCRIZIONE as OPESETDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESET A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PAR.SetQuery(PPQRY_SETTOROPERAT, 1, SQL, PFL_PAR_SETTOROPERAT, "");
    PAN_PAR.SetQueryDB(PPQRY_SETTOROPERAT, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as OPESERSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as OPESERDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESER A ");
    SQL.append("where (A.SERVIZIO = ~~ROWNAMSEROPE~~) ");
    SQL.append("and   (A.SETTORE = ~~ROWNAMSETOPE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMSEROPE~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_PAR.SetQuery(PPQRY_SERVIZOPERAT, 0, SQL, PFL_PAR_SERVIZOPERAT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.SERVIZIO as OPESERSERVIZ, ");
    SQL.append("  TO_CHAR ( A.SERVIZIO ) || ' - ' || A.DESCRIZIONE as OPESERDESCRI ");
    SQL.append("from ");
    SQL.append("  OPESER A ");
    SQL.append("where (A.SETTORE = ~~ROWNAMSETOPE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  'Tutti' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PAR.SetQuery(PPQRY_SERVIZOPERAT, 1, SQL, PFL_PAR_SERVIZOPERAT, "");
    PAN_PAR.SetQueryDB(PPQRY_SERVIZOPERAT, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR65", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR65, IMDBDef16.PQRY_PAR65_RS, IMDBDef6.TBL_PAR110);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_PARTE, IMDBDef6.FLD_PAR110_ROWNAMEPARTE);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CAPITOLODAL, IMDBDef6.FLD_PAR110_ROWNAMCAPDAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ARTICOLODAL, IMDBDef6.FLD_PAR110_ROWNAMARTDAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CAPITOLOAL, IMDBDef6.FLD_PAR110_ROWNAMECAPAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ARTICOLOAL, IMDBDef6.FLD_PAR110_ROWNAMEARTAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_RESICOMPENTR, IMDBDef6.FLD_PAR110_ROWNAMRECOEN);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ANNORESIDUO, IMDBDef6.FLD_PAR110_ROWNAMANNRES);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_MISSIONE, IMDBDef6.FLD_PAR110_ROWNAMEMISSI);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_PROGRAMMA, IMDBDef6.FLD_PAR110_ROWNAMEPROGR);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_UOUTILIZZO, IMDBDef6.FLD_PAR110_ROWNAMEUOSUD);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_UOGESTIONE, IMDBDef6.FLD_PAR110_ROWNAMEUOSOT);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CENTRDICOSTO, IMDBDef6.FLD_PAR110_ROWNAMCEDICO);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_SETTOROPERAT, IMDBDef6.FLD_PAR110_ROWNAMSETOPE);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_SERVIZOPERAT, IMDBDef6.FLD_PAR110_ROWNAMSEROPE);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_CHECKUOSO, IMDBDef6.FLD_PAR110_ROWNAMCHSOUO);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DESCRIINTERV, IMDBDef6.FLD_PAR110_ROWNAMDESINT);
    PAN_PAR.SetMasterTable(0, "PAR110");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
