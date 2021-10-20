// **********************************************
// Fase 2 Altri Dati Liquidazione
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class Fase2AltriDatiLiquidazione extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARALIQUMULT_DIVERSBENEFI = 0;
  private static int GRP_PARALIQUMULT_ECONOMICA = 1;
  private static int GRP_PARALIQUMULT_CONTABTESORE = 2;
  private static int GRP_PARALIQUMULT_MANDINFORMAT = 3;

  private static int PFL_PARALIQUMULT_ALTDATLIQLAB = 0;
  private static int PFL_PARALIQUMULT_UFFICIO = 1;
  private static int PFL_PARALIQUMULT_CAUSALE = 2;
  private static int PFL_PARALIQUMULT_TIPOVINCOLO = 3;
  private static int PFL_PARALIQUMULT_BENDIVERBENE = 4;
  private static int PFL_PARALIQUMULT_CODICDIVEBEN = 5;
  private static int PFL_PARALIQUMULT_SCEGBENELABE = 6;
  private static int PFL_PARALIQUMULT_QUIDIVBENLAB = 7;
  private static int PFL_PARALIQUMULT_NUMQUIDIVBEN = 8;
  private static int PFL_PARALIQUMULT_DESQUIDIVBEN = 9;
  private static int PFL_PARALIQUMULT_FATTORE = 10;
  private static int PFL_PARALIQUMULT_FATTORDESCRI = 11;
  private static int PFL_PARALIQUMULT_CENTRO = 12;
  private static int PFL_PARALIQUMULT_CENTRIDESCRI = 13;
  private static int PFL_PARALIQUMULT_COMPETENZDAL = 14;
  private static int PFL_PARALIQUMULT_AL = 15;
  private static int PFL_PARALIQUMULT_ECONOLABELDX = 16;
  private static int PFL_PARALIQUMULT_NUMECONTLABE = 17;
  private static int PFL_PARALIQUMULT_NUMEROCONTAB = 18;
  private static int PFL_PARALIQUMULT_DATACONTLABE = 19;
  private static int PFL_PARALIQUMULT_DATACONTABIL = 20;
  private static int PFL_PARALIQUMULT_CONTALABESUP = 21;
  private static int PFL_PARALIQUMULT_SPESE = 22;
  private static int PFL_PARALIQUMULT_SCADENZA = 23;
  private static int PFL_PARALIQUMULT_COMMISSIONI = 24;
  private static int PFL_PARALIQUMULT_ALLEGATI = 25;
  private static int PFL_PARALIQUMULT_INFOTESORIER = 26;
  private static int PFL_PARALIQUMULT_MADAINFLABDX = 27;
  private static int PFL_PARALIQUMULT_AVANTILABEL = 28;
  private static int PFL_PARALIQUMULT_INDIETRLABEL = 29;

  private static int PPQRY_PARALIQUMUL1 = 0;

  private static int PPQRY_QUIETADIVBEN = 1;
  private static int PPQRY_FATTORI = 2;
  private static int PPQRY_CENTRI = 3;
  private static int PPQRY_BEN = 4;

  private static int PPQRY_T53 = 5;
  private static int PPQRY_T58 = 6;
  private static int PPQRY_VINCOLI = 7;
  private static int PPQRY_TIPISPESMINF = 8;


  IDPanel PAN_PARALIQUMULT;

  // Definition of Global Variables
  private IDVariant SPESADAPROPO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    //
    //
    Init_PQRY_PARALIQUMUL1(IMDB);
    Init_PQRY_PARALIQUMUL1_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_PQRY_PARALIQUMUL1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARALIQUMUL1, 16);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARALIQUMUL1, "PQRY_PARALIQUMUL1");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMFATTORE, "PARAMFATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMFATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, "DIVERSO_BEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN, "NUM_QUIETANZA_DIV_BEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_SCADENZA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1,IMDBDef14.PQSL_PARALIQUMUL1_INFO_TESORIERE,5,200,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARALIQUMUL1, 0);
  }

  private static void Init_PQRY_PARALIQUMUL1_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 16);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARALIQUMUL1_RS, "PQRY_PARALIQUMUL1_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_UFFICIO, "UFFICIO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_UFFICIO,1,5,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_CAUSALE, "CAUSALE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_CAUSALE,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARATIPOVINC, "PARATIPOVINC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARATIPOVINC,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMFATTORE, "PARAMFATTORE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMFATTORE,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCENTRO, "PARAMCENTRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCENTRO,5,16,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPDAL, "PARAMCOMPDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPDAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPAL, "PARAMCOMPAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_PARAMCOMPAL,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, "DIVERSO_BEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN,2,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN, "NUM_QUIETANZA_DIV_BEN");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_NUMERO_CONTABILE, "NUMERO_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_NUMERO_CONTABILE,5,10,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_DATA_CONTABILE, "DATA_CONTABILE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_DATA_CONTABILE,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_SPESE, "SPESE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_SPESE,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_SCADENZA, "SCADENZA");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_SCADENZA,6,19,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_ALLEGATI, "ALLEGATI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_ALLEGATI,5,150,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_COMMISSIONI, "COMMISSIONI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_COMMISSIONI,1,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_INFO_TESORIERE, "INFO_TESORIERE");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARALIQUMUL1_RS,IMDBDef14.PQSL_PARALIQUMUL1_INFO_TESORIERE,5,200,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public Fase2AltriDatiLiquidazione(MyWebEntryPoint w, IMDBObj imdb)
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
  public Fase2AltriDatiLiquidazione()
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
    FormIdx = MyGlb.FRM_FAS2ALTDATLI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "76C947B8-D55D-4423-B221-7196677E9C4E";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 600;
    DesignHeight = 578;
    set_Caption(new IDVariant("Fase 2 Altri Dati Liquidazione"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 600;
    Frames[1].Height = 552;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Liquidazione Multipla";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 552;
    PAN_PARALIQUMULT = new IDPanel(w, this, 1, "PAN_PARALIQUMULT");
    Frames[1].Content = PAN_PARALIQUMULT;
    PAN_PARALIQUMULT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARALIQUMULT.VS = MainFrm.VisualStyleList;
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 600-MyGlb.PAN_OFFS_X, 552-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "76C9BF1E-78BA-4188-A645-84D1453CF3BA");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2212, 976, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARALIQUMULT.InitStatus = 2;
    PAN_PARALIQUMULT_Init();
    PAN_PARALIQUMULT_InitFields();
    PAN_PARALIQUMULT_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARALIQUMULT, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        FAS2ALTDATLI_PARALIQUMUL1();
      }
      PAN_PARALIQUMULT.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_SCEGBENELABE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCEQUIDELSOG && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_NUMQUIDIVBEN) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAFATTOR && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_FATTORE) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTACENTRI && flRis && IdxPanelActived == PAN_PARALIQUMULT.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARALIQUMULT_CENTRO) {
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
    return (obj instanceof Fase2AltriDatiLiquidazione);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? Fase2AltriDatiLiquidazione.class.getName() : (Glb.ClassWithPackage(Fase2AltriDatiLiquidazione.class) ? Fase2AltriDatiLiquidazione.class.getName().substring(Fase2AltriDatiLiquidazione.class.getPackage().getName().length() + 1) : Fase2AltriDatiLiquidazione.class.getName()));
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
    IDVariant v_CAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPTION = (new IDVariant("Fase 2 - Altri Dati Liquidazione", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(new IDVariant(v_CAPTION));
      VisibilitàMandatoInformatico();
      if (!(VisibilitàEconomica()))
      {
        PAN_PARALIQUMULT.set_ObjRect(Glb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PARALIQUMULT.ObjRect(Glb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
        PAN_PARALIQUMULT.set_ObjRect(Glb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, IDPanel.RT_TOP, Glb.PANEL_FORM, (new IDVariant(PAN_PARALIQUMULT.ObjRect(Glb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, IDPanel.RT_TOP, Glb.PANEL_FORM))).intValue());
      }
      else
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_COD_LIVELLO_5, 0))))
        {
          if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE, 0)))
          {
            IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE, 0, MainFrm.Getfattoreassociatoeconomica(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant("S")), IMDB.Value(IMDBDef5.TBL_VALCAP1, IMDBDef5.FLD_VALCAP1_NOMOGGLIV4CA, 0), new IDVariant(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_COD_LIVELLO_5, 0),IDVariant.INTEGER)));
          }
        }
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_UFFICIO, 0)))
      {
        IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_UFFICIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEQUIDELSOG)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN, 0, IMDB.Value(IMDBDef7.PQRY_QTN4, IMDBDef7.PQSL_QTN4_NUM_QUIETANZA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAFATTOR)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_PARAMFATTORE, 0, IMDB.Value(IMDBDef7.PQRY_FATTORI5, IMDBDef7.PQSL_FATTORI5_FATTORE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTACENTRI)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_PARAMCENTRO, 0, IMDB.Value(IMDBDef7.PQRY_CENTRI2, IMDBDef7.PQSL_CENTRI2_CENTRO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARALIQUMULT_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Liquidazione Multipla On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARALIQUMULT_CODICDIVEBEN)), true) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN, 0, MainFrm.SettaQuietanzaBeneficiario(IMDB.Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, 0), IDL.NullValue(IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG, 0),IDL.Today())));
        }
        else
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "ParametriLiquidazioneMultiplaOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_PARALIQUMULT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Liquidazione Multipla After Find Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "ParametriLiquidazioneMultiplaAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARALIQUMULT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARALIQUMULT);
      // 
      // Parametri Liquidazione Multipla On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_UFFICIO,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_UFFICIO))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_CAUSALE,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_CAUSALE))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_TIPOVINCOLO,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_TIPOVINCOLO))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_DESQUIDIVBEN,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_DESQUIDIVBEN))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_FATTORDESCRI,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_FATTORDESCRI))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_CENTRIDESCRI,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_CENTRIDESCRI))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_SPESE,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_SPESE))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_ALLEGATI,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_ALLEGATI))).stringValue()); 
      PAN_PARALIQUMULT.set_ToolTip(Glb.OBJ_FIELD,PFL_PARALIQUMULT_INFOTESORIER,(new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_INFOTESORIER))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "ParametriLiquidazioneMultiplaOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla On Command Event
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command: E' un numero intero che rappresenta il comando che sta per essere eseguito. Deve essere confrontato con uno dei valori della lista valori PanelCommands. - Input
  // Cancel: Può essere impostato a True per cancellare il comando. - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_PARALIQUMULT_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Liquidazione Multipla On Command Event Body
      // Procedure Body
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "ParametriLiquidazioneMultiplaOnCommandEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARALIQUMULT_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri Liquidazione Multipla On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARALIQUMULT_BENDIVERBENE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARALIQUMULT.FieldText(PFL_PARALIQUMULT_BENDIVERBENE))), IDL.Today(), (new IDVariant("LIQMULTI")), (new IDVariant(0)), (new IDVariant("NO")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "ParametriLiquidazioneMultiplaOnGetSmartLookup", _e);
    }
  }

  // **********************************************************************
  // Scegli Beneficiario
  // **********************************************************************
  public int ScegliBeneficiario ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scegli Beneficiario Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "ScegliBeneficiario", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Quietanza Div Ben
  // **********************************************************************
  public int SceltaQuietanzaDivBen ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Quietanza Div Ben Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESOGGE, 0, new IDVariant(IMDB.Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef1.TBL_PARAM27, IMDBDef1.FLD_PARAM27_ROWNAMESCADE, 0, IDL.Today());
      IMDB.set_Value(IMDBDef5.TBL_PARAMETRI136, IMDBDef5.FLD_PARAMETRI136_PARLOOQUDIBE, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCEQUIDELSOG, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "SceltaQuietanzaDivBen", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Centro
  // **********************************************************************
  public int SceltaCentro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Centro Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI14, IMDBDef1.FLD_PARAMETRI14_ROWNAMDATREG, 0, IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTACENTRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "SceltaCentro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Fattore
  // **********************************************************************
  public int SceltaFattore ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Fattore Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI12, IMDBDef1.FLD_PARAMETRI12_ROWNAMDATREG, 0, IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_D_DATA_REG, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAFATTOR, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "SceltaFattore", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visibilità Economica
  // **********************************************************************
  public boolean VisibilitàEconomica ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visibilità Economica Body
      // Procedure Body
      // 
      if (MainFrm.MODAIMPUSPES.compareTo((new IDVariant("LI")), true)!=0 || IMDB.Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMRILECO, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PARALIQUMULT.SetFlags (Glb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        return (new IDVariant(0)).booleanValue();
      }
      else
      {
        if (MainFrm.GESTIOECONOM.compareTo((new IDVariant(-1)), true)!=0)
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_AL, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          if (MainFrm.GESTIOECONOM.equals((new IDVariant(2)), true))
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          return (new IDVariant(-1)).booleanValue();
        }
        else
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
          return (new IDVariant(0)).booleanValue();
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "VisibilitàEconomica", _e);
      return false;
    }
  }

  // **********************************************************************
  // Visibilità Mandato Informatico
  // **********************************************************************
  public int VisibilitàMandatoInformatico ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_LICENZAMIF = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Visibilità Mandato Informatico Body
      // Procedure Body
      // 
      if (IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
      {
        SPESADAPROPO = (new IDVariant());
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.CODICE as TIPSPEMINCOD ");
        SQL.append("from ");
        SQL.append("  TIPI_SPESA_MINF A ");
        SQL.append("where (A.DEFAULT_S = 'SI') ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          SPESADAPROPO = QV.Get("TIPSPEMINCOD", IDVariant.INTEGER) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_SPESE, 0, new IDVariant(SPESADAPROPO));
      }
      v_LICENZAMIF = (new IDVariant(MainFrm.Licenza(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOISTANZ, 0), (new IDVariant("MIF")))));
      // 
      // Visibilità Mandato Informatico
      // 
      {
        if (MainFrm.LIQMO.equals((new IDVariant("SI")), true))
        {
          if (MainFrm.SPESE_DA_SOGGETTO.equals((new IDVariant("SI")), true))
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIONSPESE.equals((new IDVariant("SI")), true) && IDL.IsNull(MainFrm.SPESE_DA_SOGGETTO))
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIOALLEGA.equals((new IDVariant("SI")), true))
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          if (v_LICENZAMIF.booleanValue())
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
          else
          {
            PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
          }
        }
        if (v_LICENZAMIF.booleanValue() && MainFrm.GESTIOCOMMIS.equals((new IDVariant("SI")), true))
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (v_LICENZAMIF.booleanValue() && MainFrm.GESTINFOTESO.equals((new IDVariant("SI")), true))
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        if (!(v_LICENZAMIF.booleanValue()) && MainFrm.LIQMO.compareTo((new IDVariant("SI")), true)!=0)
        {
          PAN_PARALIQUMULT.SetFlags (Glb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "VisibilitàMandatoInformatico", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Indietro
  // **********************************************************************
  public int Indietro ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Indietro Body
      // Procedure Body
      // 
      MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      MainFrm.Show(MyGlb.FRM_FASE1ESTRLIQ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "Indietro", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Avanti
  // **********************************************************************
  public int Avanti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Avanti Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_DIVERSO_BEN, 0))))
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARALIQUMUL1, IMDBDef14.PQSL_PARALIQUMUL1_NUM_QUIETANZA_DIV_BEN, 0)))
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("Indicare la quietanza del Diverso Beneficiario", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
          return 0;
        }
      }
      MainFrm.UnloadForm(FormIdx,(new IDVariant(-1)).booleanValue()); 
      IMDB.set_Value(IMDBDef5.TBL_PARAMETFASE2, IMDBDef5.FLD_PARAMETFASE2_PARAMORDINAM, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_FAS3FATDALIQ, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("Fase2AltriDatiLiquidazione", "Avanti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Liquidazione Multipla
  // Primary record source for panel data
  // **********************************************************************
  private void FAS2ALTDATLI_PARALIQUMUL1() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARALIQUMUL1_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARALIQUMULT, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARALIQUMULT, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARALIQUMUL1_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARALIQUMUL1_RS, 0, IMDBDef5.TBL_PARALIQUMULT, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 0, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_UFFICIO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 1, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_CAUSALE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 2, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARATIPOVINC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 3, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 4, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCENTRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 5, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 6, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 7, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_DIVERSO_BEN, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 8, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUM_QUIETANZA_DIV_BEN, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 9, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_NUMERO_CONTABILE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 10, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_DATA_CONTABILE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 11, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_SPESE, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 12, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_SCADENZA, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 13, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_ALLEGATI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 14, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_COMMISSIONI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARALIQUMUL1_RS, 15, 0, IMDBDef5.TBL_PARALIQUMULT, IMDBDef5.FLD_PARALIQUMULT_INFO_TESORIERE, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARALIQUMULT, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARALIQUMULT, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARALIQUMULT, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARALIQUMUL1_RS, 0);
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
  private void PAN_PARALIQUMULT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARALIQUMULT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARALIQUMULT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARALIQUMULT, Cancel);
    // Stub
  }

  private void PAN_PARALIQUMULT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARALIQUMULT_SCEGBENELABE)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScegliBeneficiario();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_NUMQUIDIVBEN)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaQuietanzaDivBen();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_FATTORE)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaFattore();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_CENTRO)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCentro();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_AVANTILABEL)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Avanti();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARALIQUMULT_INDIETRLABEL)
    {
      this.IdxPanelActived = this.PAN_PARALIQUMULT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Indietro();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARALIQUMULT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARALIQUMULT_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARALIQUMULT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARALIQUMULT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARALIQUMULT_Init()
  {

    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, "48547294-1F47-4495-AB0F-AB41C47688F3");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, "Diverso Beneficiario");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, MyGlb.PANEL_LIST, 0, -9999, 412, 16, 0, 0);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, MyGlb.PANEL_FORM, 8, 127, 568, 73, 0, 0);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, 0, 112);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, 1, 13);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, 0, 4);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, 1, 4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_DIVERSBENEFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, "50BCAEE1-F44E-4735-8E35-CF3CB4C905E3");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, "Economica");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, MyGlb.VIS_GROUPSTYLE);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, MyGlb.PANEL_LIST, 0, -9999, 308, 16, 0, 0);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, MyGlb.PANEL_FORM, 8, 207, 568, 97, 0, 0);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, 0, 60);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, 1, 13);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, 0, 4);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, 1, 4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_ECONOMICA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, "D4C4ADFC-63D1-41CF-BFEC-287ECD678C8A");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, "Contabile Tesoreria");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, MyGlb.PANEL_LIST, 0, -9999, 120, 16, 0, 0);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, MyGlb.PANEL_FORM, 8, 313, 172, 119, 0, 0);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, 0, 110);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, 1, 13);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, 0, 4);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, 1, 4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_CONTABTESORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, "0B4B643A-D343-47D3-9688-232BCD8EB8DB");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, "Mand. Informatico");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, MyGlb.PANEL_FORM, 184, 313, 392, 119, 0, 0);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, 0, 104);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, 1, 13);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, 0, 4);
    PAN_PARALIQUMULT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, 1, 4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_GROUP, GRP_PARALIQUMULT_MANDINFORMAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_FIELD, 30);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, "267F4FB8-5143-40C9-8899-8D7824CC3535");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, "Altri Dati Liquidazione");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, MyGlb.VIS_ETICHEGRASSE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, "D43AB92B-0603-4762-8D0F-56009088E90B");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, "Ufficio");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, "338ADE18-0CFC-42A5-8DB1-B38F78F332A9");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, "Causale");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, "A33D34A5-457B-44CC-AC4A-93A6217F86B1");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, "Tipo Vincolo");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, "D915BD59-4974-40E1-9A54-389657D199F2");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, "Beneficiario");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, "Diverso Beneficiario");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, "6E71787B-15A6-4CAA-B301-DB5E36DD75CD");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, "Codice Diverso Ben");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, "B2AA3DE5-FAA5-4C68-B80A-8E604B3C92B2");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, 0, "wsearch1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, "F11FDD32-19FE-4C20-A2AF-4006A4669F95");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, "Quietanza");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, "7F453351-6349-4BDD-AB01-E6F4F3E795BB");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, "NUM QUIETANZA DIV BEN");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, "ED4AE02F-048F-4B6A-837B-2003B4288BFF");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, "Desccrizione Quietanza Div Ben");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, "A1035606-65AB-4D14-B7D0-CEC239DFE8AA");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, "Fattore");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, "50CA6963-DA83-4151-8DD7-1C4697B04FF0");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, "FATTORI DESCRIZIONE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, "7F10553E-F77F-498B-8016-3446F23B64A8");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, "Centro");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, "7DFDD88D-68A4-4D62-9199-7B7E86C6AAF8");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, "CENTRI DESCRIZIONE");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.VIS_VISULOOUPCF4);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, "5CDA2976-B58F-43BE-9667-D6B47131A24B");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, "Competenza Dal");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, "18B409CC-9F65-4AD4-9FAC-B78B7A94F08E");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, "Al");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, "C94E3570-5550-4624-BC6F-BE0AE3E36A51");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, "A7C6F6D7-5A7A-4BF8-8DAE-DE40884A3003");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, "Numero");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, "45FA279A-554B-4BDF-BECE-4A0C4D8DF30F");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, "Numero Contabile");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, "40744F02-6F5B-488D-A60D-C094EFC60D26");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, "Data");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, MyGlb.VIS_VUOTONORMALE);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, "44017F02-F043-46E0-892A-92F09BE4199C");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, "Data Contabile");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, "45B8E1C5-D97C-4C8B-8F24-AC8E8F5069C7");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, "019D1D53-2544-49A0-8FE1-0DAD14A44AAA");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, "Spese");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, "21ADDCBD-74A6-4476-BA27-31EC0EA73809");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, "Scadenza");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, "27B58AE6-6F9D-49A1-A5C4-1E8B43131C3C");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, "Commissioni");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, "C6EEB253-1E87-410B-AAF7-8744CEF77EDB");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, "Allegati");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, "03C47A22-7674-4006-88CC-CE8AA098FEB1");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, "Info Tesoriere");
    PAN_PARALIQUMULT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.VIS_NORMALFIELDS);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, "9A3411DD-F50E-4CFD-9771-0A0C23A9FD42");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, "");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, "A216693C-FBB3-498C-A46C-E744E750B0EC");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, "Avanti");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, 0, "button1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARALIQUMULT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, "7AB2C1D8-68AF-403F-B7B8-E1A0146C89FD");
    PAN_PARALIQUMULT.set_Header(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, "Indietro");
    PAN_PARALIQUMULT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_PARALIQUMULT.SetImage(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, 0, "button1.gif", false);
    PAN_PARALIQUMULT.SetFlags(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARALIQUMULT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, MyGlb.PANEL_LIST, 24, 8, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, MyGlb.PANEL_FORM, 24, 8, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALTDATLIQLAB, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ALTDATLIQLAB, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ALTDATLIQLAB, -1, "", "ALTDATLIQLAB", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_LIST, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_FORM, 60, 52, 492, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_UFFICIO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_UFFICIO, PPQRY_PARALIQUMUL1, "A.UFFICIO", "UFFICIO", 1, 5, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_LIST, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_FORM, 52, 76, 500, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CAUSALE, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CAUSALE, PPQRY_PARALIQUMUL1, "A.CAUSALE", "CAUSALE", 1, 4, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_LIST, "Tipo Vincolo");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, 36, 100, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, 76);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_TIPOVINCOLO, MyGlb.PANEL_FORM, "Tipo Vincolo");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_TIPOVINCOLO, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_TIPOVINCOLO, PPQRY_PARALIQUMUL1, "A.PARATIPOVINC", "PARATIPOVINC", 1, 6, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_LIST, 0, 36, 412, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_LIST, 144);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_FORM, 12, 152, 480, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_FORM, 100);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_BENDIVERBENE, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_BENDIVERBENE, -1, GRP_PARALIQUMULT_DIVERSBENEFI);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_BENDIVERBENE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA", "DIVERSBENEFI", 5, 162, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_LIST, 76);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_LIST, "C. D. B.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_FORM, 496, 152, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_FORM, 64);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CODICDIVEBEN, MyGlb.PANEL_FORM, "Cd. Div. B.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CODICDIVEBEN, -1, GRP_PARALIQUMULT_DIVERSBENEFI);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CODICDIVEBEN, PPQRY_PARALIQUMUL1, "A.DIVERSO_BEN", "DIVERSO_BEN", 2, 15, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, MyGlb.PANEL_LIST, 536, 152, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, MyGlb.PANEL_FORM, 556, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCEGBENELABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SCEGBENELABE, -1, GRP_PARALIQUMULT_DIVERSBENEFI);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SCEGBENELABE, -1, "", "SCEGBENELABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, MyGlb.PANEL_LIST, 16, 140, 64, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, MyGlb.PANEL_FORM, 12, 176, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_QUIDIVBENLAB, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_QUIDIVBENLAB, -1, GRP_PARALIQUMULT_DIVERSBENEFI);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_QUIDIVBENLAB, -1, "", "QUIDIVBENLAB", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 136);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_LIST, "N. Q. D. B.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 116, 176, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 64);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMQUIDIVBEN, MyGlb.PANEL_FORM, "N. Q. D. BN.");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_NUMQUIDIVBEN, -1, GRP_PARALIQUMULT_DIVERSBENEFI);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_NUMQUIDIVBEN, PPQRY_PARALIQUMUL1, "A.NUM_QUIETANZA_DIV_BEN", "NUM_QUIETANZA_DIV_BEN", 1, 2, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_LIST, 100);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_LIST, "Desccrizione Quietanza Div Ben");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_FORM, 168, 176, 384, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_FORM, 100);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DESQUIDIVBEN, MyGlb.PANEL_FORM, "Desc. Q. Div Ben");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DESQUIDIVBEN, -1, GRP_PARALIQUMULT_DIVERSBENEFI);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DESQUIDIVBEN, PPQRY_QUIETADIVBEN, "B.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_LIST, "Fatt.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, 56, 232, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORE, MyGlb.PANEL_FORM, "Fattore");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_FATTORE, -1, GRP_PARALIQUMULT_ECONOMICA);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_FATTORE, PPQRY_PARALIQUMUL1, "A.PARAMFATTORE", "PARAMFATTORE", 5, 16, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_LIST, 124);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_LIST, "FATTORI DESCRIZIONE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_FORM, 260, 232, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_FORM, 124);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_FATTORDESCRI, MyGlb.PANEL_FORM, "FATT. DESCRIZIONE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_FATTORDESCRI, -1, GRP_PARALIQUMULT_ECONOMICA);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_FATTORDESCRI, PPQRY_FATTORI, "A.DESCRIZIONE", "FATTORDESCRI", 5, 200, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_LIST, "Cent.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, 56, 256, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRO, MyGlb.PANEL_FORM, "Centro");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CENTRO, -1, GRP_PARALIQUMULT_ECONOMICA);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CENTRO, PPQRY_PARALIQUMUL1, "A.PARAMCENTRO", "PARAMCENTRO", 5, 16, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_LIST, 116);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_LIST, "CENTRI DESCRIZIONE");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_FORM, 260, 256, 300, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_FORM, 116);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CENTRIDESCRI, MyGlb.PANEL_FORM, "CENT. DESCRIZIONE");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CENTRIDESCRI, -1, GRP_PARALIQUMULT_ECONOMICA);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CENTRIDESCRI, PPQRY_CENTRI, "A.DESCRIZIONE", "CENTRIDESCRI", 5, 200, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_LIST, 60);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_LIST, "Competenza Dal");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_FORM, 12, 280, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_FORM, 100);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMPETENZDAL, MyGlb.PANEL_FORM, "Competenza Dal");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_COMPETENZDAL, -1, GRP_PARALIQUMULT_ECONOMICA);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_COMPETENZDAL, PPQRY_PARALIQUMUL1, "A.PARAMCOMPDAL", "PARAMCOMPDAL", 6, 19, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_LIST, 52);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_FORM, 236, 280, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_AL, -1, GRP_PARALIQUMULT_ECONOMICA);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_AL, PPQRY_PARALIQUMUL1, "A.PARAMCOMPAL", "PARAMCOMPAL", 6, 19, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, MyGlb.PANEL_LIST, 392, 292, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, MyGlb.PANEL_FORM, 560, 284, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ECONOLABELDX, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ECONOLABELDX, -1, GRP_PARALIQUMULT_ECONOMICA);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ECONOLABELDX, -1, "", "ECONOLABELDX", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, MyGlb.PANEL_LIST, 36, 332, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, MyGlb.PANEL_FORM, 12, 360, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMECONTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_NUMECONTLABE, -1, GRP_PARALIQUMULT_CONTABTESORE);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_NUMECONTLABE, -1, "", "NUMECONTLABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_LIST, 0, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_LIST, 112);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_LIST, "Nm. Cnt.");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_FORM, 80, 362, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_FORM, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_NUMEROCONTAB, MyGlb.PANEL_FORM, "Num. Contabile");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_NUMEROCONTAB, -1, GRP_PARALIQUMULT_CONTABTESORE);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_NUMEROCONTAB, PPQRY_PARALIQUMUL1, "A.NUMERO_CONTABILE", "NUMERO_CONTABILE", 5, 10, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, MyGlb.PANEL_LIST, 44, 340, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, MyGlb.PANEL_FORM, 28, 384, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DATACONTLABE, -1, GRP_PARALIQUMULT_CONTABTESORE);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DATACONTLABE, -1, "", "DATACONTLABE", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_LIST, 96);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_LIST, "Data Contabile");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_FORM, 80, 384, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_FORM, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_DATACONTABIL, MyGlb.PANEL_FORM, "Dt. Contabile");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_DATACONTABIL, -1, GRP_PARALIQUMULT_CONTABTESORE);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_DATACONTABIL, PPQRY_PARALIQUMUL1, "A.DATA_CONTABILE", "DATA_CONTABILE", 6, 19, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, MyGlb.PANEL_LIST, 136, 424, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, MyGlb.PANEL_FORM, 164, 338, 12, 90, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_CONTALABESUP, MyGlb.PANEL_FORM, 6);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_CONTALABESUP, -1, GRP_PARALIQUMULT_CONTABTESORE);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_CONTALABESUP, -1, "", "CONTALABESUP", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_LIST, 40);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_LIST, "Spese");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_FORM, 232, 338, 328, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_FORM, 48);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SPESE, MyGlb.PANEL_FORM, "Spese");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SPESE, -1, GRP_PARALIQUMULT_MANDINFORMAT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SPESE, PPQRY_PARALIQUMUL1, "A.SPESE", "SPESE", 1, 1, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_LIST, 64);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_LIST, "Scadenza");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_FORM, 188, 362, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_FORM, 92);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_SCADENZA, MyGlb.PANEL_FORM, "Scadenza");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_SCADENZA, -1, GRP_PARALIQUMULT_MANDINFORMAT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_SCADENZA, PPQRY_PARALIQUMUL1, "A.SCADENZA", "SCADENZA", 6, 19, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_LIST, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_LIST, "Commissioni");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_FORM, 372, 362, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_FORM, 80);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_COMMISSIONI, MyGlb.PANEL_FORM, "Commissioni");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_COMMISSIONI, -1, GRP_PARALIQUMULT_MANDINFORMAT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_COMMISSIONI, PPQRY_PARALIQUMUL1, "A.COMMISSIONI", "COMMISSIONI", 1, 1, 0, -13997);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_COMMISSIONI, (new IDVariant(1)), "Esente", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_COMMISSIONI, (new IDVariant(2)), "A carico Ente", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_COMMISSIONI, (new IDVariant(3)), "A carico Istituto", "", "", -1);
    PAN_PARALIQUMULT.SetValueListItem(PFL_PARALIQUMULT_COMMISSIONI, (new IDVariant()), "(nulla)", "", "", -1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_LIST, 4, 984, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_LIST, 104);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_LIST, "Allegati");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_FORM, 224, 386, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_FORM, 56);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_ALLEGATI, MyGlb.PANEL_FORM, "Allegati");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_ALLEGATI, -1, GRP_PARALIQUMULT_MANDINFORMAT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_ALLEGATI, PPQRY_PARALIQUMUL1, "A.ALLEGATI", "ALLEGATI", 5, 150, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_LIST, 4, 1008, 504, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_LIST, 104);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_LIST, 2);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_LIST, "Info Tesoriere");
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_FORM, 192, 408, 368, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_FORM, 88);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INFOTESORIER, MyGlb.PANEL_FORM, "Info Tesoriere");
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INFOTESORIER, -1, GRP_PARALIQUMULT_MANDINFORMAT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INFOTESORIER, PPQRY_PARALIQUMUL1, "A.INFO_TESORIERE", "INFO_TESORIERE", 5, 200, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, MyGlb.PANEL_LIST, 400, 300, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, MyGlb.PANEL_FORM, 564, 416, 8, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_MADAINFLABDX, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_MADAINFLABDX, -1, GRP_PARALIQUMULT_MANDINFORMAT);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_MADAINFLABDX, -1, "", "MADAINFLABDX", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_LIST, 596, 312, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_FORM, 484, 452, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_AVANTILABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_AVANTILABEL, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_AVANTILABEL, -1, "", "AVANTILABEL", 0, 0, 0, -13997);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, MyGlb.PANEL_LIST, 604, 320, 80, 28, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARALIQUMULT.SetRect(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, MyGlb.PANEL_FORM, 392, 452, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARALIQUMULT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARALIQUMULT.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARALIQUMULT_INDIETRLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARALIQUMULT.SetFieldPage(PFL_PARALIQUMULT_INDIETRLABEL, -1, -1);
    PAN_PARALIQUMULT.SetFieldPanel(PFL_PARALIQUMULT_INDIETRLABEL, -1, "", "INDIETRLABEL", 0, 0, 0, -13997);
  }

  private void PAN_PARALIQUMULT_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARALIQUMULT.SetSize(MyGlb.OBJ_QUERY, 9);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  QTN A, ");
    SQL.append("  T02 B ");
    SQL.append("where (A.CODICE = ~~DIVERSO_BEN~~) ");
    SQL.append("and   (A.NUM_QUIETANZA = ~~NUM_QUIETANZA_DIV_BEN~~) ");
    SQL.append("and   (A.TIPO_QUIETANZA = B.CODICE(+)) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > NVL(~~TBL_PARALIQUMULT.D_DATA_REG~~, TRUNC( SYSDATE ))) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_QUIETADIVBEN, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_QUIETADIVBEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_QUIETADIVBEN, "QTN");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FATTORDESCRI ");
    SQL.append("from ");
    SQL.append("  FATTORI A ");
    SQL.append("where (A.FATTORE = ~~PARAMFATTORE~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR (A.DATA_VALIDITA >= NVL(~~TBL_PARALIQUMULT.D_DATA_REG~~, TRUNC( SYSDATE )))) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_FATTORI, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_FATTORI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_FATTORI, "FATTORI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CENTRIDESCRI ");
    SQL.append("from ");
    SQL.append("  CENTRI A ");
    SQL.append("where (A.CENTRO = ~~TBL_PARALIQUMULT.PARAMCENTRO~~) ");
    SQL.append("and   ((A.DATA_VALIDITA IS NULL) OR (A.DATA_VALIDITA >= NVL(~~TBL_PARALIQUMULT.D_DATA_REG~~, TRUNC( SYSDATE )))) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_CENTRI, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_CENTRI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_CENTRI, "CENTRI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as DIVERSBENEFI, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~DIVERSO_BEN~~) ");
    SQL.append("and   ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARALIQUMULT.SetQueryLKE(PPQRY_BEN, PFL_PARALIQUMULT_CODICDIVEBEN, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.RAGIONE_SOCIALE_ESTESA as DIVERSBENEFI, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where ((TRUNC( SYSDATE ) BETWEEN NVL(A.DAL, TO_DATE('1900-01-01','YYYY-MM-DD')) AND NVL(A.AL, TO_DATE('2999-12-31','YYYY-MM-DD')))) ");
    SQL.append("and   (DECODE(A.D_SCADENZA, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), A.D_SCADENZA) >= TRUNC( SYSDATE )) ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARALIQUMULT.SetQueryHeaderColumn(PPQRY_BEN, "DIVERSBENEFI", "Diverso Beneficiario");
    PAN_PARALIQUMULT.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARALIQUMULT.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARALIQUMULT.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARALIQUMULT.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~UFFICIO~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_T53, 0, SQL, PFL_PARALIQUMULT_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_T53, 1, SQL, PFL_PARALIQUMULT_UFFICIO, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~CAUSALE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_T58, 0, SQL, PFL_PARALIQUMULT_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_T58, 1, SQL, PFL_PARALIQUMULT_CAUSALE, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where (A.CODICE = ~~PARATIPOVINC~~) ");
    SQL.append("and   ((A.SCADENZA IS NULL) OR A.SCADENZA > ~~PQRY_LIQ19.D_DATA_REG~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_VINCOLI, 0, SQL, PFL_PARALIQUMULT_TIPOVINCOLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as VINCOLCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as VINCOLDESCRI ");
    SQL.append("from ");
    SQL.append("  VINCOLI A ");
    SQL.append("where ((A.SCADENZA IS NULL) OR A.SCADENZA > ~~PQRY_LIQ19.D_DATA_REG~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_VINCOLI, 1, SQL, PFL_PARALIQUMULT_TIPOVINCOLO, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_VINCOLI, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("where (A.CODICE = ~~SPESE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_TIPISPESMINF, 0, SQL, PFL_PARALIQUMULT_SPESE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPSPEMINCOD, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as TIPSPEMINDES ");
    SQL.append("from ");
    SQL.append("  TIPI_SPESA_MINF A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARALIQUMULT.SetQuery(PPQRY_TIPISPESMINF, 1, SQL, PFL_PARALIQUMULT_SPESE, "");
    PAN_PARALIQUMULT.SetQueryDB(PPQRY_TIPISPESMINF, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARALIQUMULT.SetIMDB(IMDB, "PQRY_PARALIQUMUL1", true);
    PAN_PARALIQUMULT.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARALIQUMULT.SetQueryIMDB(PPQRY_PARALIQUMUL1, IMDBDef14.PQRY_PARALIQUMUL1_RS, IMDBDef5.TBL_PARALIQUMULT);
    JustLoaded = true;
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_UFFICIO, IMDBDef5.FLD_PARALIQUMULT_UFFICIO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CAUSALE, IMDBDef5.FLD_PARALIQUMULT_CAUSALE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_TIPOVINCOLO, IMDBDef5.FLD_PARALIQUMULT_PARATIPOVINC);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CODICDIVEBEN, IMDBDef5.FLD_PARALIQUMULT_DIVERSO_BEN);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_NUMQUIDIVBEN, IMDBDef5.FLD_PARALIQUMULT_NUM_QUIETANZA_DIV_BEN);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_FATTORE, IMDBDef5.FLD_PARALIQUMULT_PARAMFATTORE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_CENTRO, IMDBDef5.FLD_PARALIQUMULT_PARAMCENTRO);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_COMPETENZDAL, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPDAL);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_AL, IMDBDef5.FLD_PARALIQUMULT_PARAMCOMPAL);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_NUMEROCONTAB, IMDBDef5.FLD_PARALIQUMULT_NUMERO_CONTABILE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_DATACONTABIL, IMDBDef5.FLD_PARALIQUMULT_DATA_CONTABILE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_SPESE, IMDBDef5.FLD_PARALIQUMULT_SPESE);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_SCADENZA, IMDBDef5.FLD_PARALIQUMULT_SCADENZA);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_COMMISSIONI, IMDBDef5.FLD_PARALIQUMULT_COMMISSIONI);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_ALLEGATI, IMDBDef5.FLD_PARALIQUMULT_ALLEGATI);
    PAN_PARALIQUMULT.SetFieldPrimaryIndex(PFL_PARALIQUMULT_INFOTESORIER, IMDBDef5.FLD_PARALIQUMULT_INFO_TESORIERE);
    PAN_PARALIQUMULT.SetMasterTable(0, "PARALIQUMULT");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARALIQUMULT.Status() == 2)
    {
      int oldListQBE = PAN_PARALIQUMULT.iUseListQBE;
      PAN_PARALIQUMULT.iUseListQBE = 0;
      PAN_PARALIQUMULT.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARALIQUMULT.PanelCommand(Glb.PCM_FIND);
      PAN_PARALIQUMULT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
    if (SrcObj == PAN_PARALIQUMULT) PAN_PARALIQUMULT_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
