// **********************************************
// Lancia Genera Var Crono
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class LanciaGeneraVarCrono extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_GENEVARIDELI_DELIBERA = 0;
  private static int PFL_GENEVARIDELI_NUMERO1 = 1;
  private static int PFL_GENEVARIDELI_ANNO1 = 2;
  private static int PFL_GENEVARIDELI_SCELTADEL = 3;
  private static int PFL_GENEVARIDELI_INFODEL = 4;

  private static int PPQRY_PARS27 = 0;


  IDPanel PAN_GENEVARIDELI;
  private static int PFL_GENEVARIPROP_PROPOSTA = 0;
  private static int PFL_GENEVARIPROP_NUMERO = 1;
  private static int PFL_GENEVARIPROP_ANNO = 2;
  private static int PFL_GENEVARIPROP_SCELTAPROP = 3;
  private static int PFL_GENEVARIPROP_INFOPROP = 4;

  private static int PPQRY_PARS86 = 0;


  IDPanel PAN_GENEVARIPROP;
  private static int PFL_GENVARALTPAR_DESCRIZIONE = 0;
  private static int PFL_GENVARALTPAR_DATAREG = 1;
  private static int PFL_GENVARALTPAR_ETICHEELABOR = 2;
  private static int PFL_GENVARALTPAR_TIPOVARIAZIO = 3;

  private static int PPQRY_PARS87 = 0;

  private static int PPQRY_T54 = 1;


  IDPanel PAN_GENVARALTPAR;

  // Definition of Global Variables
  private IDVariant CONFERMA = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS39(IMDB);
    //
    //
    Init_PQRY_PARS27(IMDB);
    Init_PQRY_PARS27_RS(IMDB);
    Init_PQRY_PARS86(IMDB);
    Init_PQRY_PARS86_RS(IMDB);
    Init_PQRY_PARS87(IMDB);
    Init_PQRY_PARS87_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS39(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS39, 9);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS39, "TBL_PARS39");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGEPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGEANNO,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS39,IMDBDef3.FLD_PARS39_NOMOGGTIPVAR,1,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS39, 0);
  }

  private static void Init_PQRY_PARS27(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS27, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS27, "PQRY_PARS27");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS27,IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS27,IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS27,IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS27,IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS27,IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS27,IMDBDef12.PQSL_PARS27_NOMOGGANNDEL,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS27, 0);
  }

  private static void Init_PQRY_PARS27_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS27_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS27_RS, "PQRY_PARS27_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS27_RS,IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, "NOMOGGSEDDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS27_RS,IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS27_RS,IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, "NOMOGGNUMDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS27_RS,IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL,1,5,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS27_RS,IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, "NOMOGGANNDEL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS27_RS,IMDBDef12.PQSL_PARS27_NOMOGGANNDEL,1,4,0);
  }

  private static void Init_PQRY_PARS86(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS86, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS86, "PQRY_PARS86");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS86,IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS86,IMDBDef12.PQSL_PARS86_NOMEOGGEPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS86,IMDBDef12.PQSL_PARS86_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS86,IMDBDef12.PQSL_PARS86_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS86,IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS86,IMDBDef12.PQSL_PARS86_NOMEOGGEANNO,1,4,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS86, 0);
  }

  private static void Init_PQRY_PARS86_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS86_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS86_RS, "PQRY_PARS86_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS86_RS,IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, "NOMEOGGEPROP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS86_RS,IMDBDef12.PQSL_PARS86_NOMEOGGEPROP,5,8,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS86_RS,IMDBDef12.PQSL_PARS86_NOMEOGGENUME, "NOMEOGGENUME");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS86_RS,IMDBDef12.PQSL_PARS86_NOMEOGGENUME,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS86_RS,IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, "NOMEOGGEANNO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS86_RS,IMDBDef12.PQSL_PARS86_NOMEOGGEANNO,1,4,0);
  }

  private static void Init_PQRY_PARS87(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS87, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS87, "PQRY_PARS87");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS87,IMDBDef12.PQSL_PARS87_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS87,IMDBDef12.PQSL_PARS87_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS87,IMDBDef12.PQSL_PARS87_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS87,IMDBDef12.PQSL_PARS87_NOMOGGDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS87,IMDBDef12.PQSL_PARS87_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS87,IMDBDef12.PQSL_PARS87_NOMOGGTIPVAR,1,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARS87, 0);
  }

  private static void Init_PQRY_PARS87_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARS87_RS, 3);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARS87_RS, "PQRY_PARS87_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS87_RS,IMDBDef12.PQSL_PARS87_NOMEOGGEDESC, "NOMEOGGEDESC");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS87_RS,IMDBDef12.PQSL_PARS87_NOMEOGGEDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS87_RS,IMDBDef12.PQSL_PARS87_NOMOGGDATREG, "NOMOGGDATREG");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS87_RS,IMDBDef12.PQSL_PARS87_NOMOGGDATREG,6,14,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARS87_RS,IMDBDef12.PQSL_PARS87_NOMOGGTIPVAR, "NOMOGGTIPVAR");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARS87_RS,IMDBDef12.PQSL_PARS87_NOMOGGTIPVAR,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public LanciaGeneraVarCrono(MyWebEntryPoint w, IMDBObj imdb)
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
  public LanciaGeneraVarCrono()
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
    FormIdx = MyGlb.FRM_LANGENVARCR1;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "45F0AA2A-C4EC-4FAD-9C20-9AE615A05F18";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 444;
    DesignHeight = 254;
    set_Caption(new IDVariant("Generazione Variazioni da Cronoprogramma"));
    //
    Frames = new AFrame[6];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 444;
    Frames[1].Height = 228;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.298246;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 444;
    Frames[2].Height = 68;
    Frames[2].Vertical = true;
    Frames[2].FormFactor = 0.529412;
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[2].ChildFrame1 = Frames[3];
    Frames[3].Width = 444;
    Frames[3].Height = 36;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Generazione Variazioni Delibera";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 36;
    PAN_GENEVARIDELI = new IDPanel(w, this, 3, "PAN_GENEVARIDELI");
    Frames[3].Content = PAN_GENEVARIDELI;
    PAN_GENEVARIDELI.Lockable = false;
    PAN_GENEVARIDELI.iLocked = false;
    PAN_GENEVARIDELI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENEVARIDELI.VS = MainFrm.VisualStyleList;
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 444-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENEVARIDELI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "436A59BB-B1ED-4B37-965B-45F1E295FFE6");
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 168, 50, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENEVARIDELI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENEVARIDELI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENEVARIDELI.InitStatus = 1;
    PAN_GENEVARIDELI_Init();
    PAN_GENEVARIDELI_InitFields();
    PAN_GENEVARIDELI_InitQueries();
    Frames[4] = new AFrame(4);
    Frames[4].Parent = this;
    Frames[2].ChildFrame2 = Frames[4];
    Frames[4].Width = 444;
    Frames[4].Height = 32;
    Frames[4].FrHidden = true;
    Frames[4].Caption = "Generazione Variazioni Proposta";
    Frames[4].Parent = this;
    Frames[4].FixedHeight = 32;
    PAN_GENEVARIPROP = new IDPanel(w, this, 4, "PAN_GENEVARIPROP");
    Frames[4].Content = PAN_GENEVARIPROP;
    PAN_GENEVARIPROP.Lockable = false;
    PAN_GENEVARIPROP.iLocked = false;
    PAN_GENEVARIPROP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENEVARIPROP.VS = MainFrm.VisualStyleList;
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 444-MyGlb.PAN_OFFS_X, 32-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENEVARIPROP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "00340651-4839-404D-BF00-1E79B7D3B552");
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 168, 50, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENEVARIPROP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENEVARIPROP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENEVARIPROP.InitStatus = 2;
    PAN_GENEVARIPROP_Init();
    PAN_GENEVARIPROP_InitFields();
    PAN_GENEVARIPROP_InitQueries();
    Frames[5] = new AFrame(5);
    Frames[5].Parent = this;
    Frames[1].ChildFrame2 = Frames[5];
    Frames[5].Width = 444;
    Frames[5].Height = 160;
    Frames[5].FrHidden = true;
    Frames[5].Caption = "Generazione Variazioni Altri Parametri";
    Frames[5].Parent = this;
    Frames[5].FixedHeight = 160;
    PAN_GENVARALTPAR = new IDPanel(w, this, 5, "PAN_GENVARALTPAR");
    Frames[5].Content = PAN_GENVARALTPAR;
    PAN_GENVARALTPAR.Lockable = false;
    PAN_GENVARALTPAR.iLocked = false;
    PAN_GENVARALTPAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_GENVARALTPAR.VS = MainFrm.VisualStyleList;
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 444-MyGlb.PAN_OFFS_X, 160-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_GENVARALTPAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "98B889E3-36FC-4A1D-9A55-C100F0D29229");
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 528, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_GENVARALTPAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_GENVARALTPAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_GENVARALTPAR.InitStatus = 1;
    PAN_GENVARALTPAR_Init();
    PAN_GENVARALTPAR_InitFields();
    PAN_GENVARALTPAR_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS39, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LANGENVARCR1_PARS27();
      }
      if (IMDB.TblModified(IMDBDef3.TBL_PARS39, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LANGENVARCR1_PARS86();
      }
      if (IMDB.TblModified(IMDBDef3.TBL_PARS39, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        LANGENVARCR1_PARS87();
      }
      PAN_GENEVARIDELI.UpdatePanel(MainFrm);
      PAN_GENEVARIPROP.UpdatePanel(MainFrm);
      PAN_GENVARALTPAR.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_GENEVARIDELI.FrIndex)
    {
      if (IdxFieldActived ==PFL_GENEVARIDELI_SCELTADEL) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_GENEVARIPROP.FrIndex)
    {
      if (IdxFieldActived ==PFL_GENEVARIPROP_SCELTAPROP) {
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
    return (obj instanceof LanciaGeneraVarCrono);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? LanciaGeneraVarCrono.class.getName() : (Glb.ClassWithPackage(LanciaGeneraVarCrono.class) ? LanciaGeneraVarCrono.class.getName().substring(LanciaGeneraVarCrono.class.getPackage().getName().length() + 1) : LanciaGeneraVarCrono.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      UNLOAD_PARSDELETE();
      if (CONFERMA.booleanValue())
      {
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GEN_VAR_CRONO ");
        SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        SQL = new StringBuffer();
        SQL.append("delete from WRK_GEN_VAR_CRONO_VARIMP ");
        SQL.append("where (PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        ((GenerazioneVariazioniDaCronoprogramma)MainFrm.GetForm(MyGlb.FRM_GENEVARDACRO,0)).PAN_VARIAZIONI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGEPROP, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGENUME, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGEANNO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGEDESC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGDATREG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGTIPVAR, 0, new IDVariant());
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
      if (Result.booleanValue())
      {
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
        }
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && !(Result.booleanValue()))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0, (new IDVariant()));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_DELIBERA)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0, IMDB.Value(IMDBDef9.PQRY_DEL7, IMDBDef9.PQSL_DEL7_ANNO_DEL, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "EndModal", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGDATREG, 0, IDL.Today());
      CONFERMA = (new IDVariant(0));
      if (MainFrm.GENVARIMPSUB.equals((new IDVariant("SI")), true))
      {
        PAN_GENEVARIDELI.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_GENEVARIPROP.set_Visible((new IDVariant(-1)).booleanValue());
      }
      else
      {
        PAN_GENEVARIDELI.set_Visible((new IDVariant(0)).booleanValue());
        PAN_GENEVARIPROP.set_Visible((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "Load", _e);
    }
  }

  // **********************************************************************
  // Generazione Variazioni Delibera On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_GENEVARIDELI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni Delibera On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_GENEVARIDELI_DELIBERA)), true) || Column.equals((new IDVariant(PFL_GENEVARIDELI_NUMERO1)), true) || Column.equals((new IDVariant(PFL_GENEVARIDELI_ANNO1)), true))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = (new IDVariant());
        v_ANNODEL = (new IDVariant());
        v_NUMERODEL = (new IDVariant());
        v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0));
        v_ANNODEL = IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0);
        v_NUMERODEL = IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0);
        MainFrm.ControlloDelibere(v_SEDEDEL, v_ANNODEL, v_NUMERODEL, (new IDVariant("NO")));
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0, new IDVariant(v_ANNODEL));
        IMDB.set_Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0, new IDVariant(v_NUMERODEL));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "GenerazioneVariazioniDeliberaOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Generazione Variazioni Proposta On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_GENEVARIPROP_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni Proposta On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_GENEVARIPROP_PROPOSTA)), true))
      {
        if (FieldWasModified.booleanValue())
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0))))
          {
            IMDB.set_Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0, IDL.Upper(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0)));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "GenerazioneVariazioniPropostaOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Generazione Variazioni Altri Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_GENVARALTPAR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Generazione Variazioni Altri Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_GENVARALTPAR_DATAREG)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMOGGDATREG, 0))))
        {
          if (IDL.Year(IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMOGGDATREG, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
          {
            IDVariant S = new IDVariant(0,IDVariant.STRING);
            S = (new IDVariant("Errore, l'anno della data di registrazione deve appartenere a quello dell'esercizio del contesto"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMOGGDATREG, 0, IDL.Today());
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "GenerazioneVariazioniAltriParametriOnUpdatingRow", _e);
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
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "ApriDelibera", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Del
  // **********************************************************************
  public int InfoDel ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Del Body
      // Corpo Procedura
      // 
      if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_ANNOPARAM, 0, IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_PARAMNUMERO, 0, IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI415, IMDBDef1.FLD_PARAMETRI415_SEDEPARAM, 0, IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFORMDELIBE, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "InfoDel", _e);
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
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "InfoProposta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Scelta Prop
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaSceltaProp ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Scelta Prop Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "EtichettaSceltaProp", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Etichetta Elabora
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int EtichettaElabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Etichetta Elabora Body
      // Corpo Procedura
      // 
      if (MainFrm.GENVARIMPSUB.equals((new IDVariant("SI")), true))
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0),(new IDVariant(""))).equals((new IDVariant("")), true) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0)) && IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0),(new IDVariant(""))).equals((new IDVariant("")), true) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0)) && IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Indicare la Delibera o la Proposta."));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
        else
        {
          if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0))))
          {
            if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0),(new IDVariant(""))).equals((new IDVariant("")), true) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0)))
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("Delibera incompleta"));
              MainFrm.set_AlertMessage(S); 
              return 0;
            }
          }
          if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0 || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0))) || !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0))))
          {
            if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0),(new IDVariant(""))).equals((new IDVariant("")), true) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0)))
            {
              IDVariant S = new IDVariant(0,IDVariant.STRING);
              S = (new IDVariant("Proposta incompleta"));
              MainFrm.set_AlertMessage(S); 
              return 0;
            }
          }
        }
      }
      else
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0),(new IDVariant(""))).equals((new IDVariant("")), true) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0)) || IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0)))
        {
          IDVariant S = new IDVariant(0,IDVariant.STRING);
          S = (new IDVariant("Proposta nulla o incompleta"));
          MainFrm.set_AlertMessage(S); 
          return 0;
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMEOGGEDESC, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Descrizione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMOGGDATREG, 0)))
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Data di Registrazione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMOGGTIPVAR, 0)))
      {
        IDVariant S = null;
        S = (new IDVariant("Tipo Variazione obbligatoria"));
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.GENERAVARCOMPROESIGCRONO(MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMEOGGEDESC, 0), IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMOGGTIPVAR, 0), IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEPROP, 0), IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGENUME, 0), IMDB.Value(IMDBDef12.PQRY_PARS86, IMDBDef12.PQSL_PARS86_NOMEOGGEANNO, 0), IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGSEDDEL, 0), IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGNUMDEL, 0), IMDB.Value(IMDBDef12.PQRY_PARS27, IMDBDef12.PQSL_PARS27_NOMOGGANNDEL, 0), IMDB.Value(IMDBDef12.PQRY_PARS87, IMDBDef12.PQSL_PARS87_NOMOGGDATREG, 0), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.CONTROLLOCASSAVARCRONO(MainFrm.PROGRESESSIO);
        if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Elaborazione eseguita."));
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  WRK_CONTROLLO_ESEC_VAR A ");
          SQL.append("where (A.PROGR_SESSIONE = " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
          {
            IDVariant v_AVVISO2 = new IDVariant(0,IDVariant.STRING);
            v_AVVISO2 = (new IDVariant("Sono presenti le anomalie visualizzate nella stampa"));
            IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
            v_PAR1 = (new IDVariant("PROGR_SESSIONE"));
            IDVariant v_NOMESTAMPA = new IDVariant(0,IDVariant.STRING);
            v_NOMESTAMPA = (new IDVariant("Elenco_Cap_Cassa_Sup_Res_Comp"));
            MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
            MainFrm.LanciaStampaJasper(v_NOMESTAMPA, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
            v_AVVISO = IDL.Add(IDL.Add(v_AVVISO, (new IDVariant("<BR/>"))), v_AVVISO2);
          }
          MainFrm.set_AlertMessage(v_AVVISO); 
          CONFERMA = (new IDVariant(-1));
          MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("LanciaGeneraVarCrono", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void LANGENVARCR1_PARS27() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS27_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS39, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS39, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS27_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS27_RS, 0, IMDBDef3.TBL_PARS39, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS27_RS, 0, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGSEDDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS27_RS, 1, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS27_RS, 2, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGANNDEL, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS39, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS39, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS39, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS27_RS, 0);
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void LANGENVARCR1_PARS86() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS86_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS39, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS39, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS86_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS86_RS, 0, IMDBDef3.TBL_PARS39, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS86_RS, 0, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGEPROP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS86_RS, 1, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGENUME, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS86_RS, 2, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGEANNO, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS39, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS39, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS39, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS86_RS, 0);
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void LANGENVARCR1_PARS87() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PARS87_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS39, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS39, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PARS87_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PARS87_RS, 0, IMDBDef3.TBL_PARS39, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS87_RS, 0, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMEOGGEDESC, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS87_RS, 1, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGDATREG, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PARS87_RS, 2, 0, IMDBDef3.TBL_PARS39, IMDBDef3.FLD_PARS39_NOMOGGTIPVAR, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS39, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS39, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS39, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PARS87_RS, 0);
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
  private void PAN_GENEVARIDELI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENEVARIDELI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENEVARIDELI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENEVARIDELI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENEVARIDELI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GENEVARIDELI);
    // Stub
  }

  private void PAN_GENEVARIDELI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENEVARIDELI_SCELTADEL)
    {
      this.IdxPanelActived = this.PAN_GENEVARIDELI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriDelibera();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENEVARIDELI_INFODEL)
    {
      this.IdxPanelActived = this.PAN_GENEVARIDELI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDel();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENEVARIDELI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_GENEVARIDELI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_GENEVARIDELI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENEVARIDELI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_GENEVARIPROP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENEVARIPROP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENEVARIPROP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENEVARIPROP, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENEVARIPROP_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GENEVARIPROP);
    // Stub
  }

  private void PAN_GENEVARIPROP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENEVARIPROP_SCELTAPROP)
    {
      this.IdxPanelActived = this.PAN_GENEVARIPROP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaSceltaProp();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_GENEVARIPROP_INFOPROP)
    {
      this.IdxPanelActived = this.PAN_GENEVARIPROP.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposta();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENEVARIPROP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_GENEVARIPROP_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_GENEVARIPROP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENEVARIPROP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_GENVARALTPAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_GENVARALTPAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_GENVARALTPAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_GENVARALTPAR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_GENVARALTPAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_GENVARALTPAR);
    // Stub
  }

  private void PAN_GENVARALTPAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_GENVARALTPAR_ETICHEELABOR)
    {
      this.IdxPanelActived = this.PAN_GENVARALTPAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      EtichettaElabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_GENVARALTPAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_GENVARALTPAR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_GENVARALTPAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_GENVARALTPAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_GENEVARIDELI_Init()
  {

    PAN_GENEVARIDELI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENEVARIDELI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENEVARIDELI.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_GENEVARIDELI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, "6333B5CD-B6BC-40CC-86D2-9ACAE93497CF");
    PAN_GENEVARIDELI.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, "Delibera");
    PAN_GENEVARIDELI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, "");
    PAN_GENEVARIDELI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIDELI.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIDELI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, "E35E2535-042B-4929-847D-07C72040D165");
    PAN_GENEVARIDELI.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, "-");
    PAN_GENEVARIDELI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, "");
    PAN_GENEVARIDELI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIDELI.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIDELI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, "83667D45-8ABA-4D45-A330-DAC24BC03769");
    PAN_GENEVARIDELI.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, "/");
    PAN_GENEVARIDELI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, "");
    PAN_GENEVARIDELI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIDELI.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIDELI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, "8F8C58F4-E153-42A7-BF11-8C5A953E022A");
    PAN_GENEVARIDELI.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, "");
    PAN_GENEVARIDELI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENEVARIDELI.SetImage(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, 0, "wsearch1.gif", false);
    PAN_GENEVARIDELI.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENEVARIDELI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, "D7016F30-A767-4B72-BB61-A8677ABD38FC");
    PAN_GENEVARIDELI.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, "");
    PAN_GENEVARIDELI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENEVARIDELI.SetImage(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, 0, "info.gif", false);
    PAN_GENEVARIDELI.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_GENEVARIDELI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_LIST, 60);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIDELI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_LIST, "Delibera");
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_FORM, 28, 8, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_FORM, 72);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIDELI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_GENEVARIDELI.SetFieldPage(PFL_GENEVARIDELI_DELIBERA, -1, -1);
    PAN_GENEVARIDELI.SetFieldPanel(PFL_GENEVARIDELI_DELIBERA, PPQRY_PARS27, "A.NOMOGGSEDDEL", "NOMOGGSEDDEL", 5, 4, 0, -13997);
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_LIST, 52);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIDELI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_LIST, "-");
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_FORM, 164, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_FORM, 16);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIDELI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_NUMERO1, MyGlb.PANEL_FORM, "-");
    PAN_GENEVARIDELI.SetFieldPage(PFL_GENEVARIDELI_NUMERO1, -1, -1);
    PAN_GENEVARIDELI.SetFieldPanel(PFL_GENEVARIDELI_NUMERO1, PPQRY_PARS27, "A.NOMOGGNUMDEL", "NOMOGGNUMDEL", 1, 5, 0, -13997);
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_LIST, 40);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIDELI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_LIST, "/");
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_FORM, 228, 8, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_FORM, 16);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIDELI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_ANNO1, MyGlb.PANEL_FORM, "/");
    PAN_GENEVARIDELI.SetFieldPage(PFL_GENEVARIDELI_ANNO1, -1, -1);
    PAN_GENEVARIDELI.SetFieldPanel(PFL_GENEVARIDELI_ANNO1, PPQRY_PARS27, "A.NOMOGGANNDEL", "NOMOGGANNDEL", 1, 4, 0, -13997);
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, MyGlb.PANEL_LIST, 272, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, MyGlb.PANEL_FORM, 296, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_SCELTADEL, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIDELI.SetFieldPage(PFL_GENEVARIDELI_SCELTADEL, -1, -1);
    PAN_GENEVARIDELI.SetFieldPanel(PFL_GENEVARIDELI_SCELTADEL, -1, "", "SCELTADEL", 0, 0, 0, -13997);
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, MyGlb.PANEL_LIST, 280, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIDELI.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, MyGlb.PANEL_FORM, 316, 12, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIDELI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIDELI.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIDELI_INFODEL, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIDELI.SetFieldPage(PFL_GENEVARIDELI_INFODEL, -1, -1);
    PAN_GENEVARIDELI.SetFieldPanel(PFL_GENEVARIDELI_INFODEL, -1, "", "INFODEL", 0, 0, 0, -13997);
  }

  private void PAN_GENEVARIDELI_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENEVARIDELI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_GENEVARIDELI.SetIMDB(IMDB, "PQRY_PARS27", true);
    PAN_GENEVARIDELI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_GENEVARIDELI.SetQueryIMDB(PPQRY_PARS27, IMDBDef12.PQRY_PARS27_RS, IMDBDef3.TBL_PARS39);
    JustLoaded = true;
    PAN_GENEVARIDELI.SetFieldPrimaryIndex(PFL_GENEVARIDELI_DELIBERA, IMDBDef3.FLD_PARS39_NOMOGGSEDDEL);
    PAN_GENEVARIDELI.SetFieldPrimaryIndex(PFL_GENEVARIDELI_NUMERO1, IMDBDef3.FLD_PARS39_NOMOGGNUMDEL);
    PAN_GENEVARIDELI.SetFieldPrimaryIndex(PFL_GENEVARIDELI_ANNO1, IMDBDef3.FLD_PARS39_NOMOGGANNDEL);
    PAN_GENEVARIDELI.SetMasterTable(0, "PARS39");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENEVARIDELI.Status() == 2)
    {
      int oldListQBE = PAN_GENEVARIDELI.iUseListQBE;
      PAN_GENEVARIDELI.iUseListQBE = 0;
      PAN_GENEVARIDELI.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENEVARIDELI.PanelCommand(Glb.PCM_FIND);
      PAN_GENEVARIDELI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_GENEVARIPROP_Init()
  {

    PAN_GENEVARIPROP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENEVARIPROP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENEVARIPROP.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_GENEVARIPROP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, "2F198874-5D71-4EDC-A1BC-B48CEF6948AF");
    PAN_GENEVARIPROP.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, "Proposta");
    PAN_GENEVARIPROP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, "");
    PAN_GENEVARIPROP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIPROP.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIPROP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, "0F6E72A5-B425-4219-901A-766F9BE345CB");
    PAN_GENEVARIPROP.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, "-");
    PAN_GENEVARIPROP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, "");
    PAN_GENEVARIPROP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIPROP.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIPROP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, "877AB3D7-27D7-4427-9A93-AF3DD9766E92");
    PAN_GENEVARIPROP.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, "/");
    PAN_GENEVARIPROP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, "");
    PAN_GENEVARIPROP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENEVARIPROP.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_GENEVARIPROP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, "78F82D75-A5AE-4AA9-9AC7-C2FE1C39A80A");
    PAN_GENEVARIPROP.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, "");
    PAN_GENEVARIPROP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENEVARIPROP.SetImage(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, 0, "wsearch1.gif", false);
    PAN_GENEVARIPROP.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENEVARIPROP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, "F678CB2A-42D2-46AA-B14C-34B3A850B369");
    PAN_GENEVARIPROP.set_Header(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, "");
    PAN_GENEVARIPROP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_GENEVARIPROP.SetImage(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, 0, "info.gif", false);
    PAN_GENEVARIPROP.SetFlags(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_GENEVARIPROP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_LIST, 60);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_LIST, "Proposta");
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_FORM, 28, 0, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_FORM, 72);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_GENEVARIPROP.SetFieldPage(PFL_GENEVARIPROP_PROPOSTA, -1, -1);
    PAN_GENEVARIPROP.SetFieldPanel(PFL_GENEVARIPROP_PROPOSTA, PPQRY_PARS86, "A.NOMEOGGEPROP", "NOMEOGGEPROP", 5, 8, 0, -13997);
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_LIST, 52);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_LIST, "-");
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_FORM, 164, 0, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_FORM, 16);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_NUMERO, MyGlb.PANEL_FORM, "-");
    PAN_GENEVARIPROP.SetFieldPage(PFL_GENEVARIPROP_NUMERO, -1, -1);
    PAN_GENEVARIPROP.SetFieldPanel(PFL_GENEVARIPROP_NUMERO, PPQRY_PARS86, "A.NOMEOGGENUME", "NOMEOGGENUME", 1, 4, 0, -13997);
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_LIST, 40);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_LIST, "/");
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_FORM, 228, 0, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_FORM, 16);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_ANNO, MyGlb.PANEL_FORM, "/");
    PAN_GENEVARIPROP.SetFieldPage(PFL_GENEVARIPROP_ANNO, -1, -1);
    PAN_GENEVARIPROP.SetFieldPanel(PFL_GENEVARIPROP_ANNO, PPQRY_PARS86, "A.NOMEOGGEANNO", "NOMEOGGEANNO", 1, 4, 0, -13997);
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, MyGlb.PANEL_LIST, 272, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, MyGlb.PANEL_FORM, 296, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_SCELTAPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROP.SetFieldPage(PFL_GENEVARIPROP_SCELTAPROP, -1, -1);
    PAN_GENEVARIPROP.SetFieldPanel(PFL_GENEVARIPROP_SCELTAPROP, -1, "", "SCELTAPROP", 0, 0, 0, -13997);
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, MyGlb.PANEL_LIST, 280, 44, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, MyGlb.PANEL_LIST, 0);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, MyGlb.PANEL_LIST, 1);
    PAN_GENEVARIPROP.SetRect(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, MyGlb.PANEL_FORM, 316, 4, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENEVARIPROP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, MyGlb.PANEL_FORM, 0);
    PAN_GENEVARIPROP.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENEVARIPROP_INFOPROP, MyGlb.PANEL_FORM, 1);
    PAN_GENEVARIPROP.SetFieldPage(PFL_GENEVARIPROP_INFOPROP, -1, -1);
    PAN_GENEVARIPROP.SetFieldPanel(PFL_GENEVARIPROP_INFOPROP, -1, "", "INFOPROP", 0, 0, 0, -13997);
  }

  private void PAN_GENEVARIPROP_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENEVARIPROP.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_GENEVARIPROP.SetIMDB(IMDB, "PQRY_PARS86", true);
    PAN_GENEVARIPROP.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_GENEVARIPROP.SetQueryIMDB(PPQRY_PARS86, IMDBDef12.PQRY_PARS86_RS, IMDBDef3.TBL_PARS39);
    JustLoaded = true;
    PAN_GENEVARIPROP.SetFieldPrimaryIndex(PFL_GENEVARIPROP_PROPOSTA, IMDBDef3.FLD_PARS39_NOMEOGGEPROP);
    PAN_GENEVARIPROP.SetFieldPrimaryIndex(PFL_GENEVARIPROP_NUMERO, IMDBDef3.FLD_PARS39_NOMEOGGENUME);
    PAN_GENEVARIPROP.SetFieldPrimaryIndex(PFL_GENEVARIPROP_ANNO, IMDBDef3.FLD_PARS39_NOMEOGGEANNO);
    PAN_GENEVARIPROP.SetMasterTable(0, "PARS39");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENEVARIPROP.Status() == 2)
    {
      int oldListQBE = PAN_GENEVARIPROP.iUseListQBE;
      PAN_GENEVARIPROP.iUseListQBE = 0;
      PAN_GENEVARIPROP.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENEVARIPROP.PanelCommand(Glb.PCM_FIND);
      PAN_GENEVARIPROP.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_GENVARALTPAR_Init()
  {

    PAN_GENVARALTPAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_GENVARALTPAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_GENVARALTPAR.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_GENVARALTPAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, "D6B02730-6312-4ADF-8383-D833CD0B4CFC");
    PAN_GENVARALTPAR.set_Header(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, "Descrizione");
    PAN_GENVARALTPAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, "");
    PAN_GENVARALTPAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.VIS_NORMFIELPADR);
    PAN_GENVARALTPAR.SetFlags(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENVARALTPAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, "7AC348C6-1721-4C55-AACF-DC86471FB5C6");
    PAN_GENVARALTPAR.set_Header(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, "Data Reg.");
    PAN_GENVARALTPAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, "");
    PAN_GENVARALTPAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.VIS_NORMFIELPADR);
    PAN_GENVARALTPAR.SetFlags(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_GENVARALTPAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, "566D5ABE-8526-4509-8FC3-756517C704E7");
    PAN_GENVARALTPAR.set_Header(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, "Elabora");
    PAN_GENVARALTPAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, MyGlb.VIS_STATICBUTTON);
    PAN_GENVARALTPAR.SetImage(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, 0, "button1.gif", false);
    PAN_GENVARALTPAR.SetFlags(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_GENVARALTPAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, "FDE2F6C5-BD19-47F3-AF59-E6C61CD1DAD0");
    PAN_GENVARALTPAR.set_Header(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, "Tipo Variazione");
    PAN_GENVARALTPAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, "");
    PAN_GENVARALTPAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_GENVARALTPAR.SetFlags(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_GENVARALTPAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 356, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_LIST, 2);
    PAN_GENVARALTPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_FORM, 8, 0, 416, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_FORM, 92);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_GENVARALTPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_GENVARALTPAR.SetFieldPage(PFL_GENVARALTPAR_DESCRIZIONE, -1, -1);
    PAN_GENVARALTPAR.SetFieldPanel(PFL_GENVARALTPAR_DESCRIZIONE, PPQRY_PARS87, "A.NOMEOGGEDESC", "NOMEOGGEDESC", 5, 140, 0, -13997);
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_LIST, 60);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_LIST, 1);
    PAN_GENVARALTPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_LIST, "Data Reg.");
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_FORM, 40, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_FORM, 60);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_FORM, 1);
    PAN_GENVARALTPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_DATAREG, MyGlb.PANEL_FORM, "Data Reg");
    PAN_GENVARALTPAR.SetFieldPage(PFL_GENVARALTPAR_DATAREG, -1, -1);
    PAN_GENVARALTPAR.SetFieldPanel(PFL_GENVARALTPAR_DATAREG, PPQRY_PARS87, "A.NOMOGGDATREG", "NOMOGGDATREG", 6, 14, 0, -13997);
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, MyGlb.PANEL_LIST, 224, 180, 104, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, MyGlb.PANEL_LIST, 0);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, MyGlb.PANEL_LIST, 1);
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, MyGlb.PANEL_FORM, 344, 92, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, MyGlb.PANEL_FORM, 0);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_ETICHEELABOR, MyGlb.PANEL_FORM, 1);
    PAN_GENVARALTPAR.SetFieldPage(PFL_GENVARALTPAR_ETICHEELABOR, -1, -1);
    PAN_GENVARALTPAR.SetFieldPanel(PFL_GENVARALTPAR_ETICHEELABOR, -1, "", "ETICHEELABOR", 0, 0, 0, -13997);
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, 92);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_GENVARALTPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_GENVARALTPAR.SetRect(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, 4, 56, 420, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_GENVARALTPAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, 96);
    PAN_GENVARALTPAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_GENVARALTPAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_GENVARALTPAR_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_GENVARALTPAR.SetFieldPage(PFL_GENVARALTPAR_TIPOVARIAZIO, -1, -1);
    PAN_GENVARALTPAR.SetFieldPanel(PFL_GENVARALTPAR_TIPOVARIAZIO, PPQRY_PARS87, "A.NOMOGGTIPVAR", "NOMOGGTIPVAR", 1, 2, 0, -13997);
  }

  private void PAN_GENVARALTPAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_GENVARALTPAR.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T54 A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    SQL.append("where (A.CODICE = ~~NOMOGGTIPVAR~~) ");
    SQL.append("and   (B.CODICE = A.TIPOLOGIA) ");
    SQL.append("and   (B.TIPO_IMPORTO = 'RS') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_GENVARALTPAR.SetQuery(PPQRY_T54, 0, SQL, PFL_GENVARALTPAR_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T54CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T54 A, ");
    SQL.append("  TIPI_MOTIVAZIONE_VBIL B ");
    SQL.append("where (B.CODICE = A.TIPOLOGIA) ");
    SQL.append("and   (B.TIPO_IMPORTO = 'RS') ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_GENVARALTPAR.SetQuery(PPQRY_T54, 1, SQL, PFL_GENVARALTPAR_TIPOVARIAZIO, "");
    PAN_GENVARALTPAR.SetQueryDB(PPQRY_T54, MainFrm.Cf4armDBObject.DB, 4);
    PAN_GENVARALTPAR.SetIMDB(IMDB, "PQRY_PARS87", true);
    PAN_GENVARALTPAR.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_GENVARALTPAR.SetQueryIMDB(PPQRY_PARS87, IMDBDef12.PQRY_PARS87_RS, IMDBDef3.TBL_PARS39);
    JustLoaded = true;
    PAN_GENVARALTPAR.SetFieldPrimaryIndex(PFL_GENVARALTPAR_DESCRIZIONE, IMDBDef3.FLD_PARS39_NOMEOGGEDESC);
    PAN_GENVARALTPAR.SetFieldPrimaryIndex(PFL_GENVARALTPAR_DATAREG, IMDBDef3.FLD_PARS39_NOMOGGDATREG);
    PAN_GENVARALTPAR.SetFieldPrimaryIndex(PFL_GENVARALTPAR_TIPOVARIAZIO, IMDBDef3.FLD_PARS39_NOMOGGTIPVAR);
    PAN_GENVARALTPAR.SetMasterTable(0, "PARS39");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_GENVARALTPAR.Status() == 2)
    {
      int oldListQBE = PAN_GENVARALTPAR.iUseListQBE;
      PAN_GENVARALTPAR.iUseListQBE = 0;
      PAN_GENVARALTPAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_GENVARALTPAR.PanelCommand(Glb.PCM_FIND);
      PAN_GENVARALTPAR.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_GENEVARIDELI) PAN_GENEVARIDELI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_GENEVARIPROP) PAN_GENEVARIPROP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_GENVARALTPAR) PAN_GENVARALTPAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENEVARIDELI) PAN_GENEVARIDELI_ValidateRow(Cancel);
    if (SrcObj == PAN_GENEVARIPROP) PAN_GENEVARIPROP_ValidateRow(Cancel);
    if (SrcObj == PAN_GENVARALTPAR) PAN_GENVARALTPAR_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_GENEVARIDELI) PAN_GENEVARIDELI_DynamicProperties();
    if (SrcObj == PAN_GENEVARIPROP) PAN_GENEVARIPROP_DynamicProperties();
    if (SrcObj == PAN_GENVARALTPAR) PAN_GENVARALTPAR_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_GENEVARIDELI) PAN_GENEVARIDELI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_GENEVARIPROP) PAN_GENEVARIPROP_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_GENVARALTPAR) PAN_GENVARALTPAR_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_GENEVARIDELI) PAN_GENEVARIDELI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_GENEVARIPROP) PAN_GENEVARIPROP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_GENVARALTPAR) PAN_GENVARALTPAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
