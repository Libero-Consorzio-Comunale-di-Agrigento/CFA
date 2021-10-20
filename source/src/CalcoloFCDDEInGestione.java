// **********************************************
// Calcolo FCDDE In Gestione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CalcoloFCDDEInGestione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_ESTRAZPRECED = 0;

  private static int PFL_PARAM_DATAESTRAZIO = 0;
  private static int PFL_PARAM_CHEKDATA = 1;
  private static int PFL_PARAM_LISDATESTPRE = 2;
  private static int PFL_PARAM_ETICVALOCONF = 3;

  private static int PPQRY_PARAM175 = 0;

  private static int PPQRY_FSCIMPORGEST = 1;


  IDPanel PAN_PARAM;
  private static int PFL_CALCFCDINGES_ESERCIZIO = 0;
  private static int PFL_CALCFCDINGES_TITOLO = 1;
  private static int PFL_CALCFCDINGES_CATEGOTIPOLO = 2;
  private static int PFL_CALCFCDINGES_CAPITOLO = 3;
  private static int PFL_CALCFCDINGES_ART = 4;
  private static int PFL_CALCFCDINGES_DESCRIZIONE = 5;
  private static int PFL_CALCFCDINGES_PERC = 6;
  private static int PFL_CALCFCDINGES_STANZINI = 7;
  private static int PFL_CALCFCDINGES_STANZDEF = 8;
  private static int PFL_CALCFCDINGES_STANZDEFBILA = 9;
  private static int PFL_CALCFCDINGES_VARIAZIONPRO = 10;
  private static int PFL_CALCFCDINGES_ACCERTATO = 11;
  private static int PFL_CALCFCDINGES_INCASSATO = 12;
  private static int PFL_CALCFCDINGES_PERCRECIPROC = 13;
  private static int PFL_CALCFCDINGES_PERCDAAPPLIC = 14;
  private static int PFL_CALCFCDINGES_DATAESTRAZI1 = 15;
  private static int PFL_CALCFCDINGES_NUOVOFCDDE = 16;
  private static int PFL_CALCFCDINGES_PERCACCANTON = 17;
  private static int PFL_CALCFCDINGES_NUOVFCDDACCA = 18;
  private static int PFL_CALCFCDINGES_VARDAAPPLICA = 19;

  private static int PPQRY_FSCIMPORGES1 = 0;


  IDPanel PAN_CALCFCDINGES;

  // Definition of Global Variables
  private IDVariant TIPOCLASSIF = new IDVariant(0,IDVariant.STRING);
  private IDVariant GESTVARPROVV = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM173(IMDB);
    //
    //
    Init_PQRY_FSCIMPORGES1(IMDB);
    Init_PQRY_PARAM175(IMDB);
    Init_PQRY_PARAM175_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM173(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAM173, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAM173, "TBL_PARAM173");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOMOGGDATEST, "NOMOGGDATEST");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOMOGGDATEST,6,15,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOMOGGCHEDAT, "NOMOGGCHEDAT");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOMOGGCHEDAT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOOGLIDAESPR, "NOOGLIDAESPR");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOOGLIDAESPR,6,15,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOMOGGDATFIL, "NOMOGGDATFIL");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAM173,IMDBDef3.FLD_PARAM173_NOMOGGDATFIL,6,15,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAM173, 0);
  }

  private static void Init_PQRY_FSCIMPORGES1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_FSCIMPORGES1, 20);
    IMDB.set_TblCode(IMDBDef11.PQRY_FSCIMPORGES1, "PQRY_FSCIMPORGES1");
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_FSCIMPGESTIT, "FSCIMPGESTIT");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_FSCIMPGESTIT,5,99,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_TIPOLOGIA_CATEGORIA, "TIPOLOGIA_CATEGORIA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_TIPOLOGIA_CATEGORIA,1,7,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_DESCRIZIONE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_BIL_PREV, "PERC_BIL_PREV");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_BIL_PREV,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_STANZ_INI, "STANZ_INI");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_STANZ_INI,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF, "STANZ_DEF");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL, "STANZ_DEF_BIL");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO, "ACCERTATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_INCASSATO, "INCASSATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_INCASSATO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_RECIPROCA, "PERC_RECIPROCA");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_RECIPROCA,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_DA_APPLICARE, "PERC_DA_APPLICARE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_DA_APPLICARE,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_DATA_ESTRAZIONE, "DATA_ESTRAZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_DATA_ESTRAZIONE,6,19,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_VARIAZIONI_PRO, "VARIAZIONI_PRO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_VARIAZIONI_PRO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE, "NUOVO_FCDDE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_ACCANTONAMENTO, "PERC_ACCANTONAMENTO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_PERC_ACCANTONAMENTO,3,5,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE_ACCANTONATO, "NUOVO_FCDDE_ACCANTONATO");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE_ACCANTONATO,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_VAR_DA_APPLICARE, "VAR_DA_APPLICARE");
    IMDB.SetFldParams(IMDBDef11.PQRY_FSCIMPORGES1,IMDBDef11.PQSL_FSCIMPORGES1_VAR_DA_APPLICARE,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_FSCIMPORGES1, 0);
  }

  private static void Init_PQRY_PARAM175(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM175, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM175, "PQRY_PARAM175");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM175,IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, "NOMOGGDATEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM175,IMDBDef11.PQSL_PARAM175_NOMOGGDATEST,6,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM175,IMDBDef11.PQSL_PARAM175_NOMOGGCHEDAT, "NOMOGGCHEDAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM175,IMDBDef11.PQSL_PARAM175_NOMOGGCHEDAT,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM175,IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR, "NOOGLIDAESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM175,IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR,6,15,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARAM175, 0);
  }

  private static void Init_PQRY_PARAM175_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARAM175_RS, 3);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARAM175_RS, "PQRY_PARAM175_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM175_RS,IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, "NOMOGGDATEST");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM175_RS,IMDBDef11.PQSL_PARAM175_NOMOGGDATEST,6,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM175_RS,IMDBDef11.PQSL_PARAM175_NOMOGGCHEDAT, "NOMOGGCHEDAT");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM175_RS,IMDBDef11.PQSL_PARAM175_NOMOGGCHEDAT,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PARAM175_RS,IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR, "NOOGLIDAESPR");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARAM175_RS,IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR,6,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CalcoloFCDDEInGestione(MyWebEntryPoint w, IMDBObj imdb)
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
  public CalcoloFCDDEInGestione()
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
    FormIdx = MyGlb.FRM_CALCFCDINGES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "36FB509F-D958-44F5-A1CE-685892224903";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1048;
    DesignHeight = 598;
    set_Caption(new IDVariant("Calcolo FCDDE in gestione"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1048;
    Frames[1].Height = 572;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.125874;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1048;
    Frames[2].Height = 72;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Param";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 72;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAM = new IDPanel(w, this, 2, "PAN_PARAM");
    Frames[2].Content = PAN_PARAM;
    PAN_PARAM.Lockable = false;
    PAN_PARAM.iLocked = false;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1048-MyGlb.PAN_OFFS_X, 72-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BA324471-9720-4A44-8AC2-69E9812E8121");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 128, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 1;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1048;
    Frames[3].Height = 500;
    Frames[3].Caption = "Calcolo FCDDE in gestione";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 500;
    PAN_CALCFCDINGES = new IDPanel(w, this, 3, "PAN_CALCFCDINGES");
    Frames[3].Content = PAN_CALCFCDINGES;
    PAN_CALCFCDINGES.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CALCFCDINGES.VS = MainFrm.VisualStyleList;
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1048-MyGlb.PAN_OFFS_X, 500-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "BCD7420F-FE7E-4F7D-B362-38C70A5D56F6");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1892, 356, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CALCFCDINGES.InitStatus = 2;
    PAN_CALCFCDINGES_Init();
    PAN_CALCFCDINGES_InitFields();
    PAN_CALCFCDINGES_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG19+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGG157+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG19+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CALCOLOFCDDE+BaseCmdLinIdx)
      {
        EtichettaElabora();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CONFVALOFCDD+BaseCmdLinIdx)
      {
        ConfermaValoriFCDDE();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ANNUCONFVALO+BaseCmdLinIdx)
      {
        AnnullaConfermaValori();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARAM173, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        CALCFCDINGES_PARAM175();
      }
      PAN_CALCFCDINGES.UpdatePanel(MainFrm);
      PAN_PARAM.UpdatePanel(MainFrm);
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
    return (obj instanceof CalcoloFCDDEInGestione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CalcoloFCDDEInGestione.class.getName() : (Glb.ClassWithPackage(CalcoloFCDDEInGestione.class) ? CalcoloFCDDEInGestione.class.getName().substring(CalcoloFCDDEInGestione.class.getPackage().getName().length() + 1) : CalcoloFCDDEInGestione.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Calcolo FCDDE in gestione On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CALCFCDINGES_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcolo FCDDE in gestione On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_CALCFCDINGES_STANZDEFBILA)), true) || Column.equals((new IDVariant(PFL_CALCFCDINGES_ACCERTATO)), true) || Column.equals((new IDVariant(PFL_CALCFCDINGES_INCASSATO)), true) || Column.equals((new IDVariant(PFL_CALCFCDINGES_PERCDAAPPLIC)), true)) && FieldWasModified.booleanValue())
      {
        if ((IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO, 0), true)>=0 && IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL, 0).equals((new IDVariant(0)), true)) || (IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO, 0).equals((new IDVariant(0)), true)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_RECIPROCA, 0, (new IDVariant(100, IDVariant.DECIMAL)));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_RECIPROCA, 0, new IDVariant(IDL.Sub((new IDVariant(100)), (IDL.Mul(IDL.Div(IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_INCASSATO, 0),(new IDVariant(0))), (((IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO, 0), true)>=0)?IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL, 0):IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO, 0)))), (new IDVariant(100))))),IDVariant.DECIMAL));
        }
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE, 0, IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_DA_APPLICARE, 0), (IDL.Div(((IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO, 0), true)>=0)?IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF_BIL, 0):IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_ACCERTATO, 0)), (new IDVariant(100))))));
        if (Column.compareTo((new IDVariant(PFL_CALCFCDINGES_PERCDAAPPLIC)), true)!=0)
        {
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_DA_APPLICARE, 0, ((IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_BIL_PREV, 0).compareTo(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_RECIPROCA, 0), true)<0)?IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_BIL_PREV, 0):IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_RECIPROCA, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_CALCFCDINGES_PERCACCANTON)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_ACCANTONAMENTO, 0),(new IDVariant(0))).compareTo((new IDVariant(0)), true)<0 || IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_ACCANTONAMENTO, 0),(new IDVariant(0))).compareTo((new IDVariant(100)), true)>0)
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("La Percentuale di Accantonamento deve essere compresa tra 0 e 100"));
          MainFrm.set_AlertMessage(v_AVVISO); 
          IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_ACCANTONAMENTO, 0, new IDVariant(IDL.ToFloat(PAN_CALCFCDINGES.GetLastValue(PFL_CALCFCDINGES_PERCACCANTON)),IDVariant.DECIMAL));
        }
      }
      if ((Column.equals((new IDVariant(PFL_CALCFCDINGES_NUOVOFCDDE)), true) || Column.equals((new IDVariant(PFL_CALCFCDINGES_PERCACCANTON)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE_ACCANTONATO, 0, IDL.Div((IDL.Mul(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_PERC_ACCANTONAMENTO, 0))), (new IDVariant(100))));
        IMDB.set_Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_VAR_DA_APPLICARE, 0, IDL.Sub(IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_NUOVO_FCDDE_ACCANTONATO, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_STANZ_DEF, 0)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "CalcoloFCDDEingestioneOnUpdatingRow", _e);
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
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_CLASSIF as FSCPARTIPCLA, ");
      SQL.append("  A.GEST_VARIAZIONI_PRO as FSCPARGEVAPR ");
      SQL.append("from ");
      SQL.append("  FSC_PARAMETRI A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        TIPOCLASSIF = QV.Get("FSCPARTIPCLA", IDVariant.STRING) ;
        GESTVARPROVV = QV.Get("FSCPARGEVAPR", IDVariant.STRING) ;
      }
      QV.Close();
      // 
      // 
      // 
      // 
      IMDB.set_Value(IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGCHEDAT, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGDATFIL, 0, (new IDVariant()));
      if (TIPOCLASSIF.equals((new IDVariant("CAP")), true))
      {
        // PAN_CALCFCDINGES.SetFlags (Glb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else if (TIPOCLASSIF.equals((new IDVariant("CAT")), true))
      {
        PAN_CALCFCDINGES.SetFlags (Glb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CALCFCDINGES.SetFlags (Glb.OBJ_FIELD, PFL_CALCFCDINGES_ART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CALCFCDINGES.set_Header(Glb.OBJ_FIELD,PFL_CALCFCDINGES_CATEGOTIPOLO, (new IDVariant("Categoria")).stringValue());
      }
      else
      {
        PAN_CALCFCDINGES.SetFlags (Glb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CALCFCDINGES.SetFlags (Glb.OBJ_FIELD, PFL_CALCFCDINGES_ART, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_CALCFCDINGES.set_Header(Glb.OBJ_FIELD,PFL_CALCFCDINGES_CATEGOTIPOLO, (new IDVariant("Tipologia")).stringValue());
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Stanziamento Definitivo |1"));
      PAN_CALCFCDINGES.set_Header(Glb.OBJ_FIELD,PFL_CALCFCDINGES_STANZDEFBILA, IDL.FormatMessage(S, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      if (IDL.NullValue(GESTVARPROVV,(new IDVariant("NO"))).compareTo((new IDVariant("SI")), true)!=0)
      {
        PAN_CALCFCDINGES.SetFlags (Glb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "Load", _e);
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
      UNLOAD_PARAMDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "Unload", _e);
    }
  }

  // **********************************************************************
  // Param: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGDATEST, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGCHEDAT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOOGLIDAESPR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGDATFIL, 0, new IDVariant());
  }

  // **********************************************************************
  // Conferma Valori FCDDE
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ConfermaValoriFCDDE ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Conferma Valori FCDDE Body
      // Corpo Procedura
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.FSCCONFERMAGEST(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_FSCIMPORGES1, IMDBDef11.PQSL_FSCIMPORGES1_DATA_ESTRAZIONE, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
      PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "ConfermaValoriFCDDE", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAM_CHEKDATA)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGCHEDAT, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0, (new IDVariant()));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR, 0, (new IDVariant()));
        }
      }
      if ((Column.equals((new IDVariant(PFL_PARAM_DATAESTRAZIO)), true) || Column.equals((new IDVariant(PFL_PARAM_LISDATESTPRE)), true)) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGDATFIL, 0, IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0),IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR, 0)));
        IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  FSC_STORICO_GEST A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.DATA = NVL(" + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ")) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_VCOUNT.compareTo((new IDVariant(0)), true)>0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "ParamOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Param On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAM);
      // 
      // Param On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGCHEDAT, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "ParamOnDynamicProperties", _e);
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
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0)))
      {
        MainFrm.set_AlertMessage((new IDVariant("Data estrazione obbligatoria"))); 
        return 0;
      }
      if (IDL.Year(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant("Data estrazione non coerente con l'esercizio"))); 
        return 0;
      }
      IDVariant v_CONTA = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  FSC_IMPORTI_GEST A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.DATA_ESTRAZIONE = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_CONTA = QV.Get("COUNT1", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_CONTA.compareTo((new IDVariant(0)), true)>0)
      {
        IDVariant v_CONTA1 = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  FSC_STORICO_GEST A ");
        SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.DATA = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTA1 = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_CONTA1.equals((new IDVariant(0)), true))
        {
          IDVariant v_CONFERMA = null;
          v_CONFERMA = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("Data estrazione già elaborata. Si vuole rielaborare?")))));
          if (!(IDL.IsNull(v_CONFERMA)))
          {
            if (!(v_CONFERMA.booleanValue()))
            {
              return 0;
            }
            else
            {
              MainFrm.Cf4armDBObject.FSCCALCOLOGEST(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0));
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                return 0;
              }
              MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
              PAN_CALCFCDINGES.PanelCommand(Glb.PCM_REQUERY);
            }
          }
        }
        else
        {
          IDVariant v_CONFERMA = null;
          v_CONFERMA = (new IDVariant(MainFrm.MessageConfirmEx((new IDVariant("Data estrazione già elaborata e confermata. Si vuole rielaborare?")))));
          if (!(IDL.IsNull(v_CONFERMA)))
          {
            if (!(v_CONFERMA.booleanValue()))
            {
              return 0;
            }
            else
            {
              MainFrm.Cf4armDBObject.FSCCALCOLOGEST(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0));
              if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
              {
                MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
                return 0;
              }
              MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
              PAN_CALCFCDINGES.PanelCommand(Glb.PCM_REQUERY);
            }
          }
        }
      }
      else
      {
        MainFrm.Cf4armDBObject.FSCCALCOLOGEST(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
        PAN_CALCFCDINGES.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "EtichettaElabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param Data Estrazione Validate
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel - Input/Output
  // **********************************************************************
  private void PFL_PARAM_DATAESTRAZIO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Data Estrazione Validate Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0))))
      {
        if (IDL.Year(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant("Data estrazione non coerente con l'esercizio"))); 
          IMDB.set_Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0, (new IDVariant()));
          return;
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "ParamDataEstrazioneValidate", _e);
    }
  }

  // **********************************************************************
  // Annulla Conferma Valori
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int AnnullaConfermaValori ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Annulla Conferma Valori Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0)) && IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR, 0)))
      {
        IDVariant v_SMSG = new IDVariant(0,IDVariant.STRING);
        v_SMSG = (new IDVariant("Selezionare una data valida"));
        MainFrm.set_AlertMessage(v_SMSG); 
        return 0;
      }
      IDVariant D = null;
      D = IDL.NullValue(IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOMOGGDATEST, 0),IMDB.Value(IMDBDef11.PQRY_PARAM175, IMDBDef11.PQSL_PARAM175_NOOGLIDAESPR, 0));
      IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COUNT(*) as COUNT1 ");
      SQL.append("from ");
      SQL.append("  FSC_STORICO_GEST A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.DATA = " + IDL.CSql(D, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
        S = (new IDVariant("Non sono presenti valori confermati per la data selezionata"));
        MainFrm.set_AlertMessage(S); 
      }
      else
      {
        IDVariant v_CONFIRM = new IDVariant(0,IDVariant.STRING);
        v_CONFIRM = (new IDVariant("Questa fase annullerà tutti i valori confermati relativi alla data selezionata.<BR/>Continuare?"));
        if (MainFrm.MessageConfirm(v_CONFIRM))
        {
          try
          {
            SQL = new StringBuffer();
            SQL.append("delete from FSC_STORICO_GEST ");
            SQL.append("where (ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (DATA = " + IDL.CSql(D, IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e8)
          {
            MainFrm.set_AlertMessage(new IDVariant(e8.getMessage())); 
            return 0;
          }
          MainFrm.set_AlertMessage((new IDVariant("Elaborazione eseguita"))); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CalcoloFCDDEInGestione", "AnnullaConfermaValori", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void CALCFCDINGES_PARAM175() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARAM175_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM173, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARAM173, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARAM175_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARAM175_RS, 0, IMDBDef3.TBL_PARAM173, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM175_RS, 0, 0, IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGDATEST, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM175_RS, 1, 0, IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOMOGGCHEDAT, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARAM175_RS, 2, 0, IMDBDef3.TBL_PARAM173, IMDBDef3.FLD_PARAM173_NOOGLIDAESPR, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARAM173, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARAM173, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARAM173, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARAM175_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_DATAESTRAZIO)
      {
        PFL_PARAM_DATAESTRAZIO_ValidateCell(Cancel);
      }
    }
    catch(Exception e) {}
  }

  private void PAN_PARAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CALCFCDINGES_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CALCFCDINGES, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CALCFCDINGES_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CALCFCDINGES, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CALCFCDINGES_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_CALCFCDINGES);
    // Stub
  }

  private void PAN_CALCFCDINGES_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_CALCFCDINGES_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CALCFCDINGES_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CALCFCDINGES_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CALCFCDINGES_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CALCFCDINGES_Init()
  {

    PAN_CALCFCDINGES.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CALCFCDINGES.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CALCFCDINGES.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, "9CCEF695-89A8-448D-81BC-4726CC272872");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, "ESERCIZIO");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, 0, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, "8496BEAC-0235-4F48-894C-3E2B264BC6DF");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, "Titolo");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, "D1C356B7-EA7E-40C0-855B-92219BE4FA81");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, "Tipologia");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, "A42DA7E6-1917-4D6B-BDBF-6E739F186847");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, "Capitolo");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, "25C46559-CB90-4D26-A8A9-1C81F3C590D3");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, "Art.");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.VIS_NORMALFIELDS);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, "A9452AA8-D26B-49E1-A59F-5D9DEEEF68DB");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, "Descrizione");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, "B7B97B9A-2F17-4367-8202-9062CEA2F7F2");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, "% Recip. Rettificata FCDDE Previsione");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, "Percentuale di rischio di inesigibilità applicata allo stanziamento iniziale di bilancio dei capitoli di entrata utilizzata nel calcolo del bilancio di previsione per la determinazione dello stanziamento del capitolo di spesa di Fondo Crediti di dubbia e difficile esazione");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, "2564AA29-28B4-4C30-919B-ECE2D0118DDE");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, "Fondo Finale FCDDE Previsione");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, "Stanziamento del capitolo di FCDDE a partire dai calcoli di bilancio di previsione");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, "0CF9184A-7C84-456E-A7F1-172E09255AD4");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, "Precedente Fondo Confermato");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, "Stanziamento del capitolo di spesa di FCDDE determinato nella precedente elaborazione del calcolo del FCDDE in corso di gestione.");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, "B69F4C5C-9FCD-4D39-A568-333B5A0D06B8");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, "Stanziamento Definitivo |1");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, "Stanziamento definitivo (iniziale e variazioni) del capitolo di entrata oggetto di svalutazione crediti.");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, "AC28FA05-F9CE-4C68-80FE-3CC7DBE090CD");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, "Di cui Variazioni Provvisorie");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, "Variazioni Provvisorie");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, "DC26C8D6-D412-4247-B677-FC1B0C5F6885");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, "Accertato");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, "Accertato di Competenza");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, "F0D4FFE3-93AD-4B0B-829C-17FBD5EF6BA0");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, "Incassato");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, "Incassato di Competenza");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, "C7E327CA-D4E8-45C9-8083-8DB4E312062E");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, "Perc. Reciproca");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, "100-[ Incassato / max(Stanziamento Definitivo, Accertato) * 100]\n");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, "0EE6B793-E5C0-44BB-B5BA-F6BCA87513F0");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, "Perc. da applicare");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, "min(% Recipr.Ret. FCDDE Prev , % Reciproca Calcolata)");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, "E9023792-C795-495F-A49E-2340A2FCFF72");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, "DATA ESTRAZIONE");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.VIS_NONNULLAFIEL);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, 0, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, "A1E1D9F0-7BAC-46FD-ACFB-D727CA0177DA");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, "Nuovo FCDDE");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, "% da Applicare * max(Stanziamento Definitivo, Accertato)  / 100");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, "2D803E9C-F487-41BD-A9DD-FB5E05DA07AB");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, "% di Accant.");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, "B7898DB4-1B37-45C2-A808-B87E441EB517");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, "Nuovo FCDDE Calcolato");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, "");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CALCFCDINGES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, "42D72D86-AA4B-4576-874C-5BFA03A74E36");
    PAN_CALCFCDINGES.set_Header(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, "Variazione da Applicare");
    PAN_CALCFCDINGES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, "(Nuovo FCDDE calcolato – Precedente Fondo Confermato) ? Variazione di Bilancio da applicare al capitolo di FCDDE");
    PAN_CALCFCDINGES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CALCFCDINGES.SetFlags(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CALCFCDINGES_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_ESERCIZIO, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_ESERCIZIO, PPQRY_FSCIMPORGES1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_LIST, 40);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_LIST, "Titolo");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_FORM, 4, 340, 548, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_FORM, 40);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_TITOLO, MyGlb.PANEL_FORM, "Titolo");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_TITOLO, -1, -1);
    PAN_CALCFCDINGES.SetFieldUnbound(PFL_CALCFCDINGES_TITOLO, true);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_TITOLO, PPQRY_FSCIMPORGES1, "SUBSTR(TO_CHAR ( A.TIPOLOGIA_CATEGORIA ), 1, 1)", "FSCIMPGESTIT", 5, 99, 0, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_LIST, 40, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_LIST, 140);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_LIST, "Tipologia");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_FORM, 188, 4, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_FORM, 152);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CATEGOTIPOLO, MyGlb.PANEL_FORM, "Tipologia");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_CATEGOTIPOLO, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_CATEGOTIPOLO, PPQRY_FSCIMPORGES1, "A.TIPOLOGIA_CATEGORIA", "TIPOLOGIA_CATEGORIA", 1, 7, 0, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_LIST, 108, 36, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_FORM, 396, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_FORM, 80);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_CAPITOLO, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_CAPITOLO, PPQRY_FSCIMPORGES1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_LIST, 256, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_LIST, 68);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_LIST, "Art.");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ART, MyGlb.PANEL_FORM, "Art.");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_ART, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_ART, PPQRY_FSCIMPORGES1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_LIST, 292, 36, 304, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_LIST, 96);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 52, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_DESCRIZIONE, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_DESCRIZIONE, PPQRY_FSCIMPORGES1, "A.DESCRIZIONE", "DESCRIZIONE", 5, 140, 0, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_LIST, 596, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_LIST, 88);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_LIST, "% Recip. Rettificata FCDDE Previsione");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERC, MyGlb.PANEL_FORM, "Rec. Rettif. FCD. Prev.");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_PERC, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_PERC, PPQRY_FSCIMPORGES1, "A.PERC_BIL_PREV", "PERC_BIL_PREV", 3, 5, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_LIST, 720, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_LIST, 64);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_LIST, "Fondo Finale FCDDE Previsione");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_FORM, 204, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_FORM, 88);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZINI, MyGlb.PANEL_FORM, "Fn. Fin. FC. Prv.");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_STANZINI, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_STANZINI, PPQRY_FSCIMPORGES1, "A.STANZ_INI", "STANZ_INI", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_LIST, 828, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_LIST, 68);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_LIST, "Precedente Fondo Confermato");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_FORM, 340, 76, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_FORM, 80);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEF, MyGlb.PANEL_FORM, "Prc. Fon. Cnf.");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_STANZDEF, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_STANZDEF, PPQRY_FSCIMPORGES1, "A.STANZ_DEF", "STANZ_DEF", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_LIST, 940, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_LIST, 88);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_LIST, "Stanziamento Definitivo |1");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_STANZDEFBILA, MyGlb.PANEL_FORM, "Stanziam. Defin. 1");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_STANZDEFBILA, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_STANZDEFBILA, PPQRY_FSCIMPORGES1, "A.STANZ_DEF_BIL", "STANZ_DEF_BIL", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_LIST, 1048, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_LIST, 104);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_LIST, "Di cui Variazioni Provvisorie");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_FORM, 4, 364, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_FORM, 104);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARIAZIONPRO, MyGlb.PANEL_FORM, "Di cui Var. Provv.");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_VARIAZIONPRO, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_VARIAZIONPRO, PPQRY_FSCIMPORGES1, "A.VARIAZIONI_PRO", "VARIAZIONI_PRO", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_LIST, 1156, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_LIST, 76);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_LIST, "Accertato");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_FORM, 204, 100, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_FORM, 88);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_ACCERTATO, MyGlb.PANEL_FORM, "Accertato");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_ACCERTATO, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_ACCERTATO, PPQRY_FSCIMPORGES1, "A.ACCERTATO", "ACCERTATO", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_LIST, 1264, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_LIST, 72);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_LIST, "Incassato");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_FORM, 340, 100, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_FORM, 88);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_INCASSATO, MyGlb.PANEL_FORM, "Incassato");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_INCASSATO, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_INCASSATO, PPQRY_FSCIMPORGES1, "A.INCASSATO", "INCASSATO", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_LIST, 1372, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_LIST, 104);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_LIST, "Perc. Reciproca");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_FORM, 4, 148, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCRECIPROC, MyGlb.PANEL_FORM, "Perc. Reciproca");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_PERCRECIPROC, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_PERCRECIPROC, PPQRY_FSCIMPORGES1, "A.PERC_RECIPROCA", "PERC_RECIPROCA", 3, 5, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_LIST, 1440, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_LIST, 120);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_LIST, "Perc. da applicare");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_FORM, 4, 172, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCDAAPPLIC, MyGlb.PANEL_FORM, "Perc. da applicare");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_PERCDAAPPLIC, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_PERCDAAPPLIC, PPQRY_FSCIMPORGES1, "A.PERC_DA_APPLICARE", "PERC_DA_APPLICARE", 3, 5, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_LIST, 1756, 36, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_LIST, 112);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_LIST, "DATA ESTRAZIONE");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_FORM, 188, 28, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_FORM, 128);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_DATAESTRAZI1, MyGlb.PANEL_FORM, "DATA ESTRAZIONE");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_DATAESTRAZI1, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_DATAESTRAZI1, PPQRY_FSCIMPORGES1, "A.DATA_ESTRAZIONE", "DATA_ESTRAZIONE", 6, 19, 0, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_LIST, 1508, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_LIST, 84);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_LIST, "Nuovo FCDDE");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_FORM, 4, 388, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_FORM, 84);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVOFCDDE, MyGlb.PANEL_FORM, "Nuovo FCDDE");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_NUOVOFCDDE, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_NUOVOFCDDE, PPQRY_FSCIMPORGES1, "A.NUOVO_FCDDE", "NUOVO_FCDDE", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_LIST, 1616, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_LIST, 144);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_LIST, "% di Accant.");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_FORM, 4, 436, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_FORM, 144);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_PERCACCANTON, MyGlb.PANEL_FORM, "% di Accant.");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_PERCACCANTON, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_PERCACCANTON, PPQRY_FSCIMPORGES1, "A.PERC_ACCANTONAMENTO", "PERC_ACCANTONAMENTO", 3, 5, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_LIST, 1676, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_LIST, 172);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_LIST, "Nuovo FCDDE Calcolato");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_FORM, 4, 460, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_FORM, 172);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_NUOVFCDDACCA, MyGlb.PANEL_FORM, "Nuovo FCDDE Calcolato");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_NUOVFCDDACCA, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_NUOVFCDDACCA, PPQRY_FSCIMPORGES1, "A.NUOVO_FCDDE_ACCANTONATO", "NUOVO_FCDDE_ACCANTONATO", 3, 14, 2, -13997);
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_LIST, 1784, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_LIST, 116);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_LIST, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_LIST, "Variazione da Applicare");
    PAN_CALCFCDINGES.SetRect(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_FORM, 4, 412, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CALCFCDINGES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_FORM, 116);
    PAN_CALCFCDINGES.SetNumRow(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_FORM, 1);
    PAN_CALCFCDINGES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CALCFCDINGES_VARDAAPPLICA, MyGlb.PANEL_FORM, "Variaz. da Appl.");
    PAN_CALCFCDINGES.SetFieldPage(PFL_CALCFCDINGES_VARDAAPPLICA, -1, -1);
    PAN_CALCFCDINGES.SetFieldPanel(PFL_CALCFCDINGES_VARDAAPPLICA, PPQRY_FSCIMPORGES1, "A.VAR_DA_APPLICARE", "VAR_DA_APPLICARE", 3, 14, 2, -13997);
  }

  private void PAN_CALCFCDINGES_InitQueries()
  {
    StringBuffer SQL;

    PAN_CALCFCDINGES.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_CALCFCDINGES.SetIMDB(IMDB, "PQRY_FSCIMPORGES1", true);
    PAN_CALCFCDINGES.set_SetString(MyGlb.MASTER_ROWNAME, "FSC IMPORTI GEST");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  SUBSTR(TO_CHAR ( A.TIPOLOGIA_CATEGORIA ), 1, 1) as FSCIMPGESTIT, ");
    SQL.append("  A.TIPOLOGIA_CATEGORIA as TIPOLOGIA_CATEGORIA, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  A.PERC_BIL_PREV as PERC_BIL_PREV, ");
    SQL.append("  A.STANZ_INI as STANZ_INI, ");
    SQL.append("  A.STANZ_DEF as STANZ_DEF, ");
    SQL.append("  A.STANZ_DEF_BIL as STANZ_DEF_BIL, ");
    SQL.append("  A.ACCERTATO as ACCERTATO, ");
    SQL.append("  A.INCASSATO as INCASSATO, ");
    SQL.append("  A.PERC_RECIPROCA as PERC_RECIPROCA, ");
    SQL.append("  A.PERC_DA_APPLICARE as PERC_DA_APPLICARE, ");
    SQL.append("  A.DATA_ESTRAZIONE as DATA_ESTRAZIONE, ");
    SQL.append("  A.VARIAZIONI_PRO as VARIAZIONI_PRO, ");
    SQL.append("  A.NUOVO_FCDDE as NUOVO_FCDDE, ");
    SQL.append("  A.PERC_ACCANTONAMENTO as PERC_ACCANTONAMENTO, ");
    SQL.append("  A.NUOVO_FCDDE_ACCANTONATO as NUOVO_FCDDE_ACCANTONATO, ");
    SQL.append("  A.VAR_DA_APPLICARE as VAR_DA_APPLICARE ");
    PAN_CALCFCDINGES.SetQuery(PPQRY_FSCIMPORGES1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FSC_IMPORTI_GEST A ");
    PAN_CALCFCDINGES.SetQuery(PPQRY_FSCIMPORGES1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.DATA_ESTRAZIONE = ~~TBL_PARAM173.NOMOGGDATFIL~~) ");
    PAN_CALCFCDINGES.SetQuery(PPQRY_FSCIMPORGES1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CALCFCDINGES.SetQuery(PPQRY_FSCIMPORGES1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CALCFCDINGES.SetQuery(PPQRY_FSCIMPORGES1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.TIPOLOGIA_CATEGORIA ");
    PAN_CALCFCDINGES.SetQuery(PPQRY_FSCIMPORGES1, 5, SQL, -1, "");
    PAN_CALCFCDINGES.SetQueryDB(PPQRY_FSCIMPORGES1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CALCFCDINGES.SetMasterTable(0, "FSC_IMPORTI_GEST");
    PAN_CALCFCDINGES.AddToSortList(PFL_CALCFCDINGES_CAPITOLO, true);
    PAN_CALCFCDINGES.AddToSortList(PFL_CALCFCDINGES_ART, true);
    PAN_CALCFCDINGES.AddToSortList(PFL_CALCFCDINGES_CATEGOTIPOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CALCFCDINGES.Status() == 2)
    {
      int oldListQBE = PAN_CALCFCDINGES.iUseListQBE;
      PAN_CALCFCDINGES.iUseListQBE = 0;
      PAN_CALCFCDINGES.PanelCommand(Glb.PCM_SEARCH);
      PAN_CALCFCDINGES.PanelCommand(Glb.PCM_FIND);
      PAN_CALCFCDINGES.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, "37A4504C-B006-4052-BE0A-14C06DE8EBE6");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, "Estrazioni precedenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, "Estrazioni precedenti");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, MyGlb.PANEL_FORM, 220, 11, 284, 49, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, 0, 119);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, 1, 4);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_ESTRAZPRECED, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, "3FB55383-EC62-433C-BD48-9EAF06D96A27");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, "Data Estrazione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, "3B615B27-065F-4571-8634-F44E37EF1707");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, "chek data");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, "chek data");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, "873F991C-DCE7-4426-8C1A-B1D1B32B086A");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, "Lista Estrazioni Precedenti");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, "0F299563-9EC4-4629-A7D5-5C86EF1C61B7");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, "Valori Confermati");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, MyGlb.VIS_VUOGRAALRIRO);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_LIST, 100);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_LIST, "Data Estrazione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_FORM, 8, 36, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAESTRAZIO, MyGlb.PANEL_FORM, "Data Estrazione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATAESTRAZIO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATAESTRAZIO, PPQRY_PARAM175, "A.NOMOGGDATEST", "NOMOGGDATEST", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_LIST, 0, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_LIST, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_LIST, "chek data");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_FORM, 224, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_FORM, 68);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CHEKDATA, MyGlb.PANEL_FORM, "chek data");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CHEKDATA, -1, GRP_PARAM_ESTRAZPRECED);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CHEKDATA, PPQRY_PARAM175, "A.NOMOGGCHEDAT", "NOMOGGCHEDAT", 5, 2, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CHEKDATA, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_CHEKDATA, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_LIST, 0, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_LIST, 188);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_LIST, "Lista Estrazioni Precedenti");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_FORM, 252, 36, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_FORM, 160);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_LISDATESTPRE, MyGlb.PANEL_FORM, "Lista Estrazioni Precedenti");
    PAN_PARAM.SetFieldPage(PFL_PARAM_LISDATESTPRE, -1, GRP_PARAM_ESTRAZPRECED);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_LISDATESTPRE, PPQRY_PARAM175, "A.NOOGLIDAESPR", "NOOGLIDAESPR", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, MyGlb.PANEL_LIST, 520, 36, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, MyGlb.PANEL_FORM, 512, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ETICVALOCONF, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ETICVALOCONF, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ETICVALOCONF, -1, "", "ETICVALOCONF", 0, 0, 0, -13997);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DATA_ESTRAZIONE as FSCIMPGEDAES, ");
    SQL.append("  A.DATA_ESTRAZIONE as FSCIMGEDAES1 ");
    SQL.append("from ");
    SQL.append("  FSC_IMPORTI_GEST A ");
    SQL.append("where (A.DATA_ESTRAZIONE = ~~NOOGLIDAESPR~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_ESTRAZIONE desc ");
    PAN_PARAM.SetQuery(PPQRY_FSCIMPORGEST, 0, SQL, PFL_PARAM_LISDATESTPRE, "");
    SQL = new StringBuffer();
    SQL.append("select distinct ");
    SQL.append("  A.DATA_ESTRAZIONE as FSCIMPGEDAES, ");
    SQL.append("  A.DATA_ESTRAZIONE as FSCIMGEDAES1 ");
    SQL.append("from ");
    SQL.append("  FSC_IMPORTI_GEST A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("order by ");
    SQL.append("  A.DATA_ESTRAZIONE desc ");
    PAN_PARAM.SetQuery(PPQRY_FSCIMPORGEST, 1, SQL, PFL_PARAM_LISDATESTPRE, "");
    PAN_PARAM.SetQueryDB(PPQRY_FSCIMPORGEST, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM175", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM175, IMDBDef11.PQRY_PARAM175_RS, IMDBDef3.TBL_PARAM173);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATAESTRAZIO, IMDBDef3.FLD_PARAM173_NOMOGGDATEST);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CHEKDATA, IMDBDef3.FLD_PARAM173_NOMOGGCHEDAT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_LISDATESTPRE, IMDBDef3.FLD_PARAM173_NOOGLIDAESPR);
    PAN_PARAM.SetMasterTable(0, "PARAM173");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAM.Status() == 2)
    {
      int oldListQBE = PAN_PARAM.iUseListQBE;
      PAN_PARAM.iUseListQBE = 0;
      PAN_PARAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAM.PanelCommand(Glb.PCM_FIND);
      PAN_PARAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CALCFCDINGES) PAN_CALCFCDINGES_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CALCFCDINGES) PAN_CALCFCDINGES_ValidateRow(Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CALCFCDINGES) PAN_CALCFCDINGES_DynamicProperties();
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CALCFCDINGES) PAN_CALCFCDINGES_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_PARAM) PAN_PARAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CALCFCDINGES) PAN_CALCFCDINGES_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_PARAM) PAN_PARAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
