// **********************************************
// Rettifica UO Per Cambio Ottica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RettificaUOPerCambioOttica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRTIPO_MAPPAUOCAPIT = 0;

  private static int PFL_PARAMETRTIPO_TIPO = 0;
  private static int PFL_PARAMETRTIPO_ETICHLABELS1 = 1;

  private static int PPQRY_PARAMETRI633 = 0;


  IDPanel PAN_PARAMETRTIPO;
  private static int GRP_PARAMEOTTICA_CAMBIOOTTICA = 0;
  private static int GRP_PARAMEOTTICA_ABBINUOCAPIT = 1;

  private static int PFL_PARAMEOTTICA_OTTICAOLD = 0;
  private static int PFL_PARAMEOTTICA_OTTICANEW = 1;
  private static int PFL_PARAMEOTTICA_SCADENZAUO = 2;
  private static int PFL_PARAMEOTTICA_SOLOCAPCONUO = 3;
  private static int PFL_PARAMEOTTICA_ETICHLABELSX = 4;

  private static int PPQRY_PARAMETRI634 = 0;

  private static int PPQRY_OTTICHEENTI1 = 1;
  private static int PPQRY_OTTICHEENTI = 2;


  IDPanel PAN_PARAMEOTTICA;
  private static int PFL_PARAMEELABOR_VISUALGENERA = 0;

  private static int PPQRY_MASTERQUERY8 = 0;


  IDPanel PAN_PARAMEELABOR;
  private static int PFL_NOTEFUNZIONA_MODULO = 0;
  private static int PFL_NOTEFUNZIONA_PAGINA = 1;
  private static int PFL_NOTEFUNZIONA_FUNZIONE = 2;
  private static int PFL_NOTEFUNZIONA_DESCRIZIONE = 3;

  private static int PPQRY_NOTEFUNZIO19 = 0;


  IDPanel PAN_NOTEFUNZIONA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI635(IMDB);
    //
    //
    Init_PQRY_PARAMETRI633(IMDB);
    Init_PQRY_PARAMETRI633_RS(IMDB);
    Init_PQRY_PARAMETRI634(IMDB);
    Init_PQRY_PARAMETRI634_RS(IMDB);
    Init_PQRY_MASTERQUERY8(IMDB);
    Init_PQRY_NOTEFUNZIO19(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI635(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI635, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI635, "TBL_PARAMETRI635");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMTIPO,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMOTTIOLD, "PARAMOTTIOLD");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMOTTIOLD,5,18,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMOTTINEW, "PARAMOTTINEW");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMOTTINEW,5,18,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMSCADEUO, "PARAMSCADEUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARAMSCADEUO,6,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARSOLCACOUO, "PARSOLCACOUO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI635,IMDBDef3.FLD_PARAMETRI635_PARSOLCACOUO,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI635, 0);
  }

  private static void Init_PQRY_PARAMETRI633(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI633, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI633, "PQRY_PARAMETRI633");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI633,IMDBDef11.PQSL_PARAMETRI633_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI633,IMDBDef11.PQSL_PARAMETRI633_PARAMTIPO,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI633, 0);
  }

  private static void Init_PQRY_PARAMETRI633_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI633_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI633_RS, "PQRY_PARAMETRI633_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI633_RS,IMDBDef11.PQSL_PARAMETRI633_PARAMTIPO, "PARAMTIPO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI633_RS,IMDBDef11.PQSL_PARAMETRI633_PARAMTIPO,5,1,0);
  }

  private static void Init_PQRY_PARAMETRI634(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI634, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI634, "PQRY_PARAMETRI634");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTIOLD, "PARAMOTTIOLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTIOLD,5,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTINEW, "PARAMOTTINEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTINEW,5,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARAMSCADEUO, "PARAMSCADEUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARAMSCADEUO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARSOLCACOUO, "PARSOLCACOUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634,IMDBDef11.PQSL_PARAMETRI634_PARSOLCACOUO,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI634, 0);
  }

  private static void Init_PQRY_PARAMETRI634_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAMETRI634_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAMETRI634_RS, "PQRY_PARAMETRI634_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTIOLD, "PARAMOTTIOLD");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTIOLD,5,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTINEW, "PARAMOTTINEW");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARAMOTTINEW,5,18,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARAMSCADEUO, "PARAMSCADEUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARAMSCADEUO,6,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARSOLCACOUO, "PARSOLCACOUO");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAMETRI634_RS,IMDBDef11.PQSL_PARAMETRI634_PARSOLCACOUO,5,2,0);
  }

  private static void Init_PQRY_MASTERQUERY8(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_MASTERQUERY8, 0);
    IMDB.set_TblCode(IMDBDef11.PQRY_MASTERQUERY8, "PQRY_MASTERQUERY8");
    IMDB.TblAddNew(IMDBDef11.PQRY_MASTERQUERY8, 0);
  }

  private static void Init_PQRY_NOTEFUNZIO19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_NOTEFUNZIO19, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_NOTEFUNZIO19, "PQRY_NOTEFUNZIO19");
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_MODULO, "MODULO");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_MODULO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_PAGINA, "PAGINA");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_PAGINA,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_FUNZIONE, "FUNZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_FUNZIONE,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_NOTEFUNZIO19,IMDBDef11.PQSL_NOTEFUNZIO19_DESCRIZIONE,9,9999,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_NOTEFUNZIO19, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RettificaUOPerCambioOttica(MyWebEntryPoint w, IMDBObj imdb)
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
  public RettificaUOPerCambioOttica()
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
    FormIdx = MyGlb.FRM_RETUOPERCAOT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "F0226EF1-9FFD-432D-9247-EA152D40BAC8";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 980;
    DesignHeight = 230;
    set_Caption(new IDVariant("Rettifica UO per Cambio Ottica"));
    //
    Frames = new AFrame[8];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 980;
    Frames[1].Height = 204;
    Frames[1].FormFactor = 0.763265;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 748;
    Frames[2].Height = 204;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.333333;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 748;
    Frames[3].Height = 68;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Parametri Tipo";
    Frames[3].Parent = this;
    Frames[3].FixedWidth = 748;
    Frames[3].FixedHeight = 68;
    Frames[3].MinWidth = Frames[3].Width;
    Frames[3].MaxWidth = Frames[3].Width;
    Frames[3].MinHeight = Frames[3].Height;
    Frames[3].MaxHeight = Frames[3].Height;
    PAN_PARAMETRTIPO = new IDPanel(w, this, 3, "PAN_PARAMETRTIPO");
    Frames[3].Content = PAN_PARAMETRTIPO;
    PAN_PARAMETRTIPO.Lockable = false;
    PAN_PARAMETRTIPO.iLocked = false;
    PAN_PARAMETRTIPO.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRTIPO.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 748-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRTIPO.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CAA6FC66-6B46-4AC6-AA15-202E964F6EBA");
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRTIPO.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRTIPO.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRTIPO.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRTIPO.InitStatus = 1;
    PAN_PARAMETRTIPO_Init();
    PAN_PARAMETRTIPO_InitFields();
    PAN_PARAMETRTIPO_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 748;
    Frames[4].Height = 136;
    Frames[4].Vertical = true;
    Frames[4].FormFactor = 0.676471;
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[4].ChildFrame1 = Frames[5];
    Frames[5].Width = 748;
    Frames[5].Height = 92;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Parametri Ottica";
    Frames[5].Parent = this;
    Frames[5].FixedWidth = 748;
    Frames[5].FixedHeight = 92;
    Frames[5].MinWidth = Frames[5].Width;
    Frames[5].MaxWidth = Frames[5].Width;
    Frames[5].MinHeight = Frames[5].Height;
    Frames[5].MaxHeight = Frames[5].Height;
    PAN_PARAMEOTTICA = new IDPanel(w, this, 5, "PAN_PARAMEOTTICA");
    Frames[5].Content = PAN_PARAMEOTTICA;
    PAN_PARAMEOTTICA.Lockable = false;
    PAN_PARAMEOTTICA.iLocked = false;
    PAN_PARAMEOTTICA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEOTTICA.VS = MainFrm.VisualStyleList;
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 748-MyGlb.PAN_OFFS_X, 92-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "4CAA6482-2E08-410D-B3B4-91636A9A0787");
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 400, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEOTTICA.InitStatus = 1;
    PAN_PARAMEOTTICA_Init();
    PAN_PARAMEOTTICA_InitFields();
    PAN_PARAMEOTTICA_InitQueries();
    Frames[6] = new AFrame(6);
    Frames[6].Parent = this;
    Frames[4].ChildFrame2 = Frames[6];
    Frames[6].Width = 748;
    Frames[6].Height = 44;
    Frames[6].FrHidden = true;
    Frames[6].Caption = "Parametri Elabora";
    Frames[6].Parent = this;
    Frames[6].FixedWidth = 748;
    Frames[6].FixedHeight = 44;
    Frames[6].MinWidth = Frames[6].Width;
    Frames[6].MaxWidth = Frames[6].Width;
    Frames[6].MinHeight = Frames[6].Height;
    Frames[6].MaxHeight = Frames[6].Height;
    PAN_PARAMEELABOR = new IDPanel(w, this, 6, "PAN_PARAMEELABOR");
    Frames[6].Content = PAN_PARAMEELABOR;
    PAN_PARAMEELABOR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMEELABOR.VS = MainFrm.VisualStyleList;
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 748-MyGlb.PAN_OFFS_X, 44-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0AFF7708-B8F7-4B83-82D9-D9117BCC553C");
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMEELABOR.InitStatus = 1;
    PAN_PARAMEELABOR_Init();
    PAN_PARAMEELABOR_InitFields();
    PAN_PARAMEELABOR_InitQueries();
    Frames[7] = new AFrame(7);
    Frames[7].Parent = this;
    Frames[1].ChildFrame2 = Frames[7];
    Frames[7].Width = 232;
    Frames[7].Height = 204;
    Frames[7].FrHidden = true;
    Frames[7].Caption = "NOTE FUNZIONALITA";
    Frames[7].Parent = this;
    Frames[7].FixedHeight = 204;
    PAN_NOTEFUNZIONA = new IDPanel(w, this, 7, "PAN_NOTEFUNZIONA");
    Frames[7].Content = PAN_NOTEFUNZIONA;
    PAN_NOTEFUNZIONA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_NOTEFUNZIONA.VS = MainFrm.VisualStyleList;
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 232-MyGlb.PAN_OFFS_X, 204-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "0E07577B-D908-4B3A-AA40-335C73F19BBF");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 0, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_NOTEFUNZIONA.InitStatus = 2;
    PAN_NOTEFUNZIONA_Init();
    PAN_NOTEFUNZIONA_InitFields();
    PAN_NOTEFUNZIONA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI635, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETUOPERCAOT_PARAMETRI633();
      }
      if (IMDB.TblModified(IMDBDef3.TBL_PARAMETRI635, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RETUOPERCAOT_PARAMETRI634();
      }
      PAN_PARAMETRTIPO.UpdatePanel(MainFrm);
      PAN_PARAMEOTTICA.UpdatePanel(MainFrm);
      PAN_PARAMEELABOR.UpdatePanel(MainFrm);
      PAN_NOTEFUNZIONA.UpdatePanel(MainFrm);
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
    return (obj instanceof RettificaUOPerCambioOttica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RettificaUOPerCambioOttica.class.getName() : (Glb.ClassWithPackage(RettificaUOPerCambioOttica.class) ? RettificaUOPerCambioOttica.class.getName().substring(RettificaUOPerCambioOttica.class.getPackage().getName().length() + 1) : RettificaUOPerCambioOttica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri Tipo On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRTIPO_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRTIPO);
      // 
      // Parametri Tipo On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI633, IMDBDef11.PQSL_PARAMETRI633_PARAMTIPO, 0).equals((new IDVariant("V")), true))
      {
        IDVariant v_VISUALIZZA = new IDVariant(0,IDVariant.STRING);
        v_VISUALIZZA = (new IDVariant("Visualizza"));
        PAN_PARAMEELABOR.set_FieldText(PFL_PARAMEELABOR_VISUALGENERA, new IDVariant(v_VISUALIZZA).stringValue());
        PAN_PARAMEOTTICA.set_Visible((new IDVariant(0)).booleanValue());
      }
      else
      {
        IDVariant v_GENERA = new IDVariant(0,IDVariant.STRING);
        v_GENERA = (new IDVariant("Genera"));
        PAN_PARAMEELABOR.set_FieldText(PFL_PARAMEELABOR_VISUALGENERA, new IDVariant(v_GENERA).stringValue());
        PAN_PARAMEOTTICA.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOPerCambioOttica", "ParametriTipoOnDynamicProperties", _e);
    }
  }

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
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMTIPO, 0, (new IDVariant("V")));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMSCADEUO, 0, IDL.Today());
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMOTTIOLD, 0, new IDVariant(MainFrm.OTTICA));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARSOLCACOUO, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOPerCambioOttica", "Load", _e);
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
      UNLOAD_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOPerCambioOttica", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMTIPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMOTTIOLD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMOTTINEW, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMSCADEUO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARSOLCACOUO, 0, new IDVariant());
  }

  // **********************************************************************
  // Parametri Ottica On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEOTTICA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMEOTTICA);
      // 
      // Parametri Ottica On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_PARAMEOTTICA.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMEOTTICA_OTTICAOLD,(new IDVariant(PAN_PARAMEOTTICA.FieldText(PFL_PARAMEOTTICA_OTTICAOLD))).stringValue()); 
      PAN_PARAMEOTTICA.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMEOTTICA_OTTICANEW,(new IDVariant(PAN_PARAMEOTTICA.FieldText(PFL_PARAMEOTTICA_OTTICANEW))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOPerCambioOttica", "ParametriOtticaOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Visualizza Genera
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisualizzaGenera ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Genera Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAMETRI633, IMDBDef11.PQSL_PARAMETRI633_PARAMTIPO, 0).equals((new IDVariant("R")), true))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI634, IMDBDef11.PQSL_PARAMETRI634_PARAMOTTIOLD, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI634, IMDBDef11.PQSL_PARAMETRI634_PARAMOTTINEW, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Indicare entrambe le Ottiche"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        else if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAMETRI634, IMDBDef11.PQSL_PARAMETRI634_PARAMSCADEUO, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Indicare la Scadenza UO"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.RETTIFICAUOCAPINS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI634, IMDBDef11.PQSL_PARAMETRI634_PARAMOTTIOLD, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI634, IMDBDef11.PQSL_PARAMETRI634_PARAMOTTINEW, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI634, IMDBDef11.PQSL_PARAMETRI634_PARAMSCADEUO, 0), IMDB.Value(IMDBDef11.PQRY_PARAMETRI634, IMDBDef11.PQSL_PARAMETRI634_PARSOLCACOUO, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage(MainFrm.PulisciMessaggioErrore((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())))); 
          return 0;
        }
      }
      MainFrm.Show(MyGlb.FRM_ASSEGUOCAPIT, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RettificaUOPerCambioOttica", "VisualizzaGenera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void RETUOPERCAOT_PARAMETRI633() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI633_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI635, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI635, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI633_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI633_RS, 0, IMDBDef3.TBL_PARAMETRI635, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI633_RS, 0, 0, IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMTIPO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI635, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI635, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI635, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI633_RS, 0);
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void RETUOPERCAOT_PARAMETRI634() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAMETRI634_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI635, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAMETRI635, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAMETRI634_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAMETRI634_RS, 0, IMDBDef3.TBL_PARAMETRI635, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI634_RS, 0, 0, IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMOTTIOLD, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI634_RS, 1, 0, IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMOTTINEW, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI634_RS, 2, 0, IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARAMSCADEUO, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAMETRI634_RS, 3, 0, IMDBDef3.TBL_PARAMETRI635, IMDBDef3.FLD_PARAMETRI635_PARSOLCACOUO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAMETRI635, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAMETRI635, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAMETRI635, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAMETRI634_RS, 0);
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
  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMETRTIPO_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRTIPO, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRTIPO_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRTIPO, Cancel);
    // Stub
  }

  private void PAN_PARAMETRTIPO_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRTIPO_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRTIPO_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRTIPO_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMEOTTICA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEOTTICA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEOTTICA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEOTTICA, Cancel);
    // Stub
  }

  private void PAN_PARAMEOTTICA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMEOTTICA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEOTTICA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEOTTICA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_PARAMEELABOR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMEELABOR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMEELABOR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMEELABOR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMEELABOR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMEELABOR);
    // Stub
  }

  private void PAN_PARAMEELABOR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMEELABOR_VISUALGENERA)
    {
      this.IdxPanelActived = this.PAN_PARAMEELABOR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VisualizzaGenera();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMEELABOR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMEELABOR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMEELABOR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_NOTEFUNZIONA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_NOTEFUNZIONA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_NOTEFUNZIONA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_NOTEFUNZIONA);
    // Stub
  }

  private void PAN_NOTEFUNZIONA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_NOTEFUNZIONA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_NOTEFUNZIONA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_NOTEFUNZIONA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRTIPO_Init()
  {

    PAN_PARAMETRTIPO.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRTIPO.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRTIPO.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, "AFC03359-16BF-4AC6-8654-E3280E44BDC2");
    PAN_PARAMETRTIPO.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, "Mappatura UO/Capitoli");
    PAN_PARAMETRTIPO.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, "");
    PAN_PARAMETRTIPO.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, MyGlb.PANEL_LIST, 0, -9999, 128, 16, 0, 0);
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, MyGlb.PANEL_FORM, 20, 11, 460, 49, 0, 0);
    PAN_PARAMETRTIPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, 0, 129);
    PAN_PARAMETRTIPO.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, 1, 13);
    PAN_PARAMETRTIPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, 0, 4);
    PAN_PARAMETRTIPO.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, 1, 4);
    PAN_PARAMETRTIPO.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRTIPO_MAPPAUOCAPIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRTIPO.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARAMETRTIPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, "83D0B101-04FA-4559-A125-DFBB4A11FF36");
    PAN_PARAMETRTIPO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, "Tipo");
    PAN_PARAMETRTIPO.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, "");
    PAN_PARAMETRTIPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRTIPO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRTIPO.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, "5A86E268-7CE2-4895-877A-61A61402E8D5");
    PAN_PARAMETRTIPO.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, "");
    PAN_PARAMETRTIPO.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAMETRTIPO.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRTIPO_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRTIPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_LIST, 32);
    PAN_PARAMETRTIPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRTIPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_LIST, "Tipo");
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_FORM, 108, 36, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRTIPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMETRTIPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRTIPO.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_TIPO, MyGlb.PANEL_FORM, "Tipo");
    PAN_PARAMETRTIPO.SetFieldPage(PFL_PARAMETRTIPO_TIPO, -1, GRP_PARAMETRTIPO_MAPPAUOCAPIT);
    PAN_PARAMETRTIPO.SetFieldPanel(PFL_PARAMETRTIPO_TIPO, PPQRY_PARAMETRI633, "A.PARAMTIPO", "PARAMTIPO", 5, 1, 0, -13997);
    PAN_PARAMETRTIPO.SetValueListItem(PFL_PARAMETRTIPO_TIPO, (new IDVariant("R")), "Genera Dati", "", "", -1);
    PAN_PARAMETRTIPO.SetValueListItem(PFL_PARAMETRTIPO_TIPO, (new IDVariant("V")), "Visualizza e Modifica Dati", "", "", -1);
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, MyGlb.PANEL_LIST, 20, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRTIPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRTIPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRTIPO.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, MyGlb.PANEL_FORM, 24, 44, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRTIPO.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRTIPO.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRTIPO_ETICHLABELS1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRTIPO.SetFieldPage(PFL_PARAMETRTIPO_ETICHLABELS1, -1, GRP_PARAMETRTIPO_MAPPAUOCAPIT);
    PAN_PARAMETRTIPO.SetFieldPanel(PFL_PARAMETRTIPO_ETICHLABELS1, -1, "", "ETICHLABELS1", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRTIPO_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRTIPO.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRTIPO.SetIMDB(IMDB, "PQRY_PARAMETRI633", true);
    PAN_PARAMETRTIPO.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRTIPO.SetQueryIMDB(PPQRY_PARAMETRI633, IMDBDef11.PQRY_PARAMETRI633_RS, IMDBDef3.TBL_PARAMETRI635);
    JustLoaded = true;
    PAN_PARAMETRTIPO.SetFieldPrimaryIndex(PFL_PARAMETRTIPO_TIPO, IMDBDef3.FLD_PARAMETRI635_PARAMTIPO);
    PAN_PARAMETRTIPO.SetMasterTable(0, "PARAMETRI635");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRTIPO.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRTIPO.iUseListQBE;
      PAN_PARAMETRTIPO.iUseListQBE = 0;
      PAN_PARAMETRTIPO.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRTIPO.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRTIPO.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMEOTTICA_Init()
  {

    PAN_PARAMEOTTICA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEOTTICA.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, "0EFA84F1-AC2C-4135-A501-696BE95CB137");
    PAN_PARAMEOTTICA.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, "Cambio Ottica");
    PAN_PARAMEOTTICA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, "");
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, MyGlb.PANEL_LIST, 0, -9999, 152, 16, 0, 0);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, MyGlb.PANEL_FORM, 20, 7, 460, 77, 0, 0);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, 0, 79);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, 1, 13);
    PAN_PARAMEOTTICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, 0, 4);
    PAN_PARAMEOTTICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, 1, 4);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_CAMBIOOTTICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, "1DE559AF-31E1-481B-B361-0BC9F830192A");
    PAN_PARAMEOTTICA.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, "Abbinamento UO/Capitoli");
    PAN_PARAMEOTTICA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, "");
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, MyGlb.PANEL_LIST, 0, -9999, 96, 16, 0, 0);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, MyGlb.PANEL_FORM, 484, 7, 244, 77, 0, 0);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, 0, 143);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, 1, 13);
    PAN_PARAMEOTTICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, 0, 4);
    PAN_PARAMEOTTICA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, 1, 4);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMEOTTICA_ABBINUOCAPIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMEOTTICA.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, "97A94264-0C1D-40FC-B017-6F119603910A");
    PAN_PARAMEOTTICA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, "da Ottica");
    PAN_PARAMEOTTICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, "");
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, "0D4FE9C4-2642-4F9D-AE5B-52A34A60F7B4");
    PAN_PARAMEOTTICA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, "a Ottica");
    PAN_PARAMEOTTICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, "");
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, "66D96C97-6095-43AC-B1D0-9FC8BEE04648");
    PAN_PARAMEOTTICA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, "Scadenza UO");
    PAN_PARAMEOTTICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, "");
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, "3B70EA77-101B-41C4-B199-A4D1C74335D3");
    PAN_PARAMEOTTICA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, "Solo Capitoli Con UO di Gestione");
    PAN_PARAMEOTTICA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, "Momentaneamente invisibile in attesa di implementare sulla procedure");
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMEOTTICA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, "F20F0413-0856-40BC-B3D8-407B88CB6441");
    PAN_PARAMEOTTICA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, "");
    PAN_PARAMEOTTICA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, MyGlb.VIS_VUOTOGRASSET);
    PAN_PARAMEOTTICA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMEOTTICA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_LIST, 64);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_LIST, "da Ottica");
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_FORM, 24, 32, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_FORM, 80);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICAOLD, MyGlb.PANEL_FORM, "da Ottica");
    PAN_PARAMEOTTICA.SetFieldPage(PFL_PARAMEOTTICA_OTTICAOLD, -1, GRP_PARAMEOTTICA_CAMBIOOTTICA);
    PAN_PARAMEOTTICA.SetFieldPanel(PFL_PARAMEOTTICA_OTTICAOLD, PPQRY_PARAMETRI634, "A.PARAMOTTIOLD", "PARAMOTTIOLD", 5, 18, 0, -13997);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_LIST, 68);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_LIST, "a Ottica");
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_FORM, 24, 60, 452, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_FORM, 80);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_OTTICANEW, MyGlb.PANEL_FORM, "a Ottica");
    PAN_PARAMEOTTICA.SetFieldPage(PFL_PARAMEOTTICA_OTTICANEW, -1, GRP_PARAMEOTTICA_CAMBIOOTTICA);
    PAN_PARAMEOTTICA.SetFieldPanel(PFL_PARAMEOTTICA_OTTICANEW, PPQRY_PARAMETRI634, "A.PARAMOTTINEW", "PARAMOTTINEW", 5, 18, 0, -13997);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_LIST, 84);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_LIST, "Scadenza UO");
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_FORM, 544, 32, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_FORM, 84);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SCADENZAUO, MyGlb.PANEL_FORM, "Scadenza UO");
    PAN_PARAMEOTTICA.SetFieldPage(PFL_PARAMEOTTICA_SCADENZAUO, -1, GRP_PARAMEOTTICA_ABBINUOCAPIT);
    PAN_PARAMEOTTICA.SetFieldPanel(PFL_PARAMEOTTICA_SCADENZAUO, PPQRY_PARAMETRI634, "A.PARAMSCADEUO", "PARAMSCADEUO", 6, 10, 0, -13997);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_LIST, 120);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_LIST, "Sl. Cap. Cn. U. di Gst.");
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_FORM, 512, 60, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_FORM, 188);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOTTICA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_SOLOCAPCONUO, MyGlb.PANEL_FORM, "Solo Capitoli Con UO di Gestione");
    PAN_PARAMEOTTICA.SetFieldPage(PFL_PARAMEOTTICA_SOLOCAPCONUO, -1, GRP_PARAMEOTTICA_ABBINUOCAPIT);
    PAN_PARAMEOTTICA.SetFieldPanel(PFL_PARAMEOTTICA_SOLOCAPCONUO, PPQRY_PARAMETRI634, "A.PARSOLCACOUO", "PARSOLCACOUO", 5, 2, 0, -13997);
    PAN_PARAMEOTTICA.SetValueListItem(PFL_PARAMEOTTICA_SOLOCAPCONUO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMEOTTICA.SetValueListItem(PFL_PARAMEOTTICA_SOLOCAPCONUO, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, MyGlb.PANEL_LIST, 496, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, MyGlb.PANEL_LIST, 1);
    PAN_PARAMEOTTICA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, MyGlb.PANEL_FORM, 488, 68, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEOTTICA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEOTTICA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEOTTICA_ETICHLABELSX, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEOTTICA.SetFieldPage(PFL_PARAMEOTTICA_ETICHLABELSX, -1, GRP_PARAMEOTTICA_ABBINUOCAPIT);
    PAN_PARAMEOTTICA.SetFieldPanel(PFL_PARAMEOTTICA_ETICHLABELSX, -1, "", "ETICHLABELSX", 0, 0, 0, -13997);
  }

  private void PAN_PARAMEOTTICA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEOTTICA.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OTTICA as OTTIENTIOTTI, ");
    SQL.append("  A.OTTICA || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SO4_OTTICHE_ENTI A ");
    SQL.append("where (A.OTTICA = ~~PARAMOTTIOLD~~) ");
    SQL.append("order by ");
    SQL.append("  A.OTTICA ");
    PAN_PARAMEOTTICA.SetQuery(PPQRY_OTTICHEENTI1, 0, SQL, PFL_PARAMEOTTICA_OTTICAOLD, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OTTICA as OTTIENTIOTTI, ");
    SQL.append("  A.OTTICA || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  SO4_OTTICHE_ENTI A ");
    SQL.append("order by ");
    SQL.append("  A.OTTICA ");
    PAN_PARAMEOTTICA.SetQuery(PPQRY_OTTICHEENTI1, 1, SQL, PFL_PARAMEOTTICA_OTTICAOLD, "");
    PAN_PARAMEOTTICA.SetQueryDB(PPQRY_OTTICHEENTI1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OTTICA as OTTIENTIOTTI, ");
    SQL.append("  A.OTTICA || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  SO4_OTTICHE_ENTI A ");
    SQL.append("where (A.OTTICA = ~~PARAMOTTINEW~~) ");
    SQL.append("order by ");
    SQL.append("  A.OTTICA ");
    PAN_PARAMEOTTICA.SetQuery(PPQRY_OTTICHEENTI, 0, SQL, PFL_PARAMEOTTICA_OTTICANEW, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.OTTICA as OTTIENTIOTTI, ");
    SQL.append("  A.OTTICA || ' - ' || A.DESCRIZIONE as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  SO4_OTTICHE_ENTI A ");
    SQL.append("order by ");
    SQL.append("  A.OTTICA ");
    PAN_PARAMEOTTICA.SetQuery(PPQRY_OTTICHEENTI, 1, SQL, PFL_PARAMEOTTICA_OTTICANEW, "");
    PAN_PARAMEOTTICA.SetQueryDB(PPQRY_OTTICHEENTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMEOTTICA.SetIMDB(IMDB, "PQRY_PARAMETRI634", true);
    PAN_PARAMEOTTICA.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMEOTTICA.SetQueryIMDB(PPQRY_PARAMETRI634, IMDBDef11.PQRY_PARAMETRI634_RS, IMDBDef3.TBL_PARAMETRI635);
    JustLoaded = true;
    PAN_PARAMEOTTICA.SetFieldPrimaryIndex(PFL_PARAMEOTTICA_OTTICAOLD, IMDBDef3.FLD_PARAMETRI635_PARAMOTTIOLD);
    PAN_PARAMEOTTICA.SetFieldPrimaryIndex(PFL_PARAMEOTTICA_OTTICANEW, IMDBDef3.FLD_PARAMETRI635_PARAMOTTINEW);
    PAN_PARAMEOTTICA.SetFieldPrimaryIndex(PFL_PARAMEOTTICA_SCADENZAUO, IMDBDef3.FLD_PARAMETRI635_PARAMSCADEUO);
    PAN_PARAMEOTTICA.SetFieldPrimaryIndex(PFL_PARAMEOTTICA_SOLOCAPCONUO, IMDBDef3.FLD_PARAMETRI635_PARSOLCACOUO);
    PAN_PARAMEOTTICA.SetMasterTable(0, "PARAMETRI635");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEOTTICA.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEOTTICA.iUseListQBE;
      PAN_PARAMEOTTICA.iUseListQBE = 0;
      PAN_PARAMEOTTICA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEOTTICA.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEOTTICA.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAMEELABOR_Init()
  {

    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_FIELD, 1);
    PAN_PARAMEELABOR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, "733A144D-6335-440E-88F1-1167679F9D04");
    PAN_PARAMEELABOR.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, "Visualizza");
    PAN_PARAMEELABOR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMEELABOR.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, 0, "button1.gif", false);
    PAN_PARAMEELABOR.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMEELABOR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, MyGlb.PANEL_LIST, 404, 128, 84, 48, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, MyGlb.PANEL_LIST, 2);
    PAN_PARAMEELABOR.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, MyGlb.PANEL_FORM, 644, 4, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMEELABOR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMEELABOR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMEELABOR_VISUALGENERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMEELABOR.SetFieldPage(PFL_PARAMEELABOR_VISUALGENERA, -1, -1);
    PAN_PARAMEELABOR.SetFieldPanel(PFL_PARAMEELABOR_VISUALGENERA, -1, "", "VISUALGENERA", 0, 0, 0, -13869);
  }

  private void PAN_PARAMEELABOR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMEELABOR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMEELABOR.set_ShowInfoMessages(false);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMEELABOR.Status() == 2)
    {
      int oldListQBE = PAN_PARAMEELABOR.iUseListQBE;
      PAN_PARAMEELABOR.iUseListQBE = 0;
      PAN_PARAMEELABOR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMEELABOR.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMEELABOR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_NOTEFUNZIONA_Init()
  {

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "CEA3F5D9-6DBF-489E-BF02-4236D4270AB3");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "MODULO");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "53CA3517-C03D-4210-8C36-EA5D762080D3");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "PAGINA");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "378F3A50-4D58-46CA-AC8F-FCDA58002535");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "FUNZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_NOTEFUNZIONA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "17BE297F-7735-49D2-97B6-F6B21C438B4D");
    PAN_NOTEFUNZIONA.set_Header(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, "");
    PAN_NOTEFUNZIONA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.VIS_HTMEDISTNOSF);
    PAN_NOTEFUNZIONA.SetFlags(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_NOTEFUNZIONA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 56);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_LIST, "MODULO");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 4, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, 1);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_MODULO, MyGlb.PANEL_FORM, "MODULO");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_MODULO, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_MODULO, PPQRY_NOTEFUNZIO19, "A.MODULO", "MODULO", 5, 20, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 4, 164, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_LIST, "PAGINA");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 4, 28, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_PAGINA, MyGlb.PANEL_FORM, "PAGINA");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_PAGINA, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_PAGINA, PPQRY_NOTEFUNZIO19, "A.PAGINA", "PAGINA", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 4, 200, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_LIST, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 4, 52, 496, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, 2);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_FUNZIONE, MyGlb.PANEL_FORM, "FUNZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_FUNZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_FUNZIONE, PPQRY_NOTEFUNZIO19, "A.FUNZIONE", "FUNZIONE", 5, 200, 0, -13997);
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 104, 236, 396, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, 3);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetRect(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 8, 16, 216, 180, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_NOTEFUNZIONA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 96);
    PAN_NOTEFUNZIONA.SetNumRow(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, 13);
    PAN_NOTEFUNZIONA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_NOTEFUNZIONA_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCRIZIONE");
    PAN_NOTEFUNZIONA.SetFieldPage(PFL_NOTEFUNZIONA_DESCRIZIONE, -1, -1);
    PAN_NOTEFUNZIONA.SetFieldPanel(PFL_NOTEFUNZIONA_DESCRIZIONE, PPQRY_NOTEFUNZIO19, "A.DESCRIZIONE", "DESCRIZIONE", 9, 9999, 0, -13997);
  }

  private void PAN_NOTEFUNZIONA_InitQueries()
  {
    StringBuffer SQL;

    PAN_NOTEFUNZIONA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_NOTEFUNZIONA.SetIMDB(IMDB, "PQRY_NOTEFUNZIO19", true);
    PAN_NOTEFUNZIONA.set_SetString(MyGlb.MASTER_ROWNAME, "NOTE FUNZIONALITA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.MODULO as MODULO, ");
    SQL.append("  A.PAGINA as PAGINA, ");
    SQL.append("  A.FUNZIONE as FUNZIONE, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO19, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  NOTE_FUNZIONALITA A ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO19, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.MODULO = ~~TBL_DATISESSIONE.SESSIOMODULO~~) ");
    SQL.append("and   (A.PAGINA = " + IDL.CSql(MainFrm.GetForm(MyGlb.FRM_RETUOPERCAOT,0).Caption(), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
    SQL.append("and   (A.FUNZIONE = 'Descrizione') ");
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO19, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO19, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO19, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_NOTEFUNZIONA.SetQuery(PPQRY_NOTEFUNZIO19, 5, SQL, -1, "");
    PAN_NOTEFUNZIONA.SetQueryDB(PPQRY_NOTEFUNZIO19, MainFrm.Cf4armDBObject.DB, 4);
    PAN_NOTEFUNZIONA.SetMasterTable(0, "NOTE_FUNZIONALITA");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_NOTEFUNZIONA.Status() == 2)
    {
      int oldListQBE = PAN_NOTEFUNZIONA.iUseListQBE;
      PAN_NOTEFUNZIONA.iUseListQBE = 0;
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_SEARCH);
      PAN_NOTEFUNZIONA.PanelCommand(Glb.PCM_FIND);
      PAN_NOTEFUNZIONA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRTIPO) PAN_PARAMETRTIPO_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMEOTTICA) PAN_PARAMEOTTICA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRTIPO) PAN_PARAMETRTIPO_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMEOTTICA) PAN_PARAMEOTTICA_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_ValidateRow(Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRTIPO) PAN_PARAMETRTIPO_DynamicProperties();
    if (SrcObj == PAN_PARAMEOTTICA) PAN_PARAMEOTTICA_DynamicProperties();
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_DynamicProperties();
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRTIPO) PAN_PARAMETRTIPO_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMEOTTICA) PAN_PARAMEOTTICA_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRTIPO) PAN_PARAMETRTIPO_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMEOTTICA) PAN_PARAMEOTTICA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAMEELABOR) PAN_PARAMEELABOR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_NOTEFUNZIONA) PAN_NOTEFUNZIONA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
