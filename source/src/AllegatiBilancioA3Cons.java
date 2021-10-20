// **********************************************
// Allegati Bilancio A3 Cons
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class AllegatiBilancioA3Cons extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_A3RISAMMRIDE_ENTRATA = 0;
  private static int GRP_A3RISAMMRIDE_SPESA = 1;

  private static int PFL_A3RISAMMRIDE_PROGRESSIVO1 = 0;
  private static int PFL_A3RISAMMRIDE_TIPOSTAMPA1 = 1;
  private static int PFL_A3RISAMMRIDE_ESERCIZIO1 = 2;
  private static int PFL_A3RISAMMRIDE_RAGGRUPPAME1 = 3;
  private static int PFL_A3RISAMMRIDE_S = 4;
  private static int PFL_A3RISAMMRIDE_CAPITOENTRAT = 5;
  private static int PFL_A3RISAMMRIDE_ARTICOENTRAT = 6;
  private static int PFL_A3RISAMMRIDE_SCELCAPIENTR = 7;
  private static int PFL_A3RISAMMRIDE_DESCCAPIENTR = 8;
  private static int PFL_A3RISAMMRIDE_CAPITOLSPESA = 9;
  private static int PFL_A3RISAMMRIDE_ARTICOLSPESA = 10;
  private static int PFL_A3RISAMMRIDE_SCELCAPISPES = 11;
  private static int PFL_A3RISAMMRIDE_DESCCAPISPES = 12;
  private static int PFL_A3RISAMMRIDE_E = 13;
  private static int PFL_A3RISAMMRIDE_IMPORTO7 = 14;
  private static int PFL_A3RISAMMRIDE_IMPORTO2 = 15;
  private static int PFL_A3RISAMMRIDE_IMPORTO3 = 16;
  private static int PFL_A3RISAMMRIDE_IMPORTO4 = 17;
  private static int PFL_A3RISAMMRIDE_IMPORTO5 = 18;
  private static int PFL_A3RISAMMRIDE_IMPORTO6 = 19;
  private static int PFL_A3RISAMMRIDE_ETICHETOTALE = 20;
  private static int PFL_A3RISAMMRIDE_TOTALEIMPOR1 = 21;
  private static int PFL_A3RISAMMRIDE_TOTALEIMPOR2 = 22;
  private static int PFL_A3RISAMMRIDE_TOTALEIMPOR3 = 23;
  private static int PFL_A3RISAMMRIDE_TOTALEIMPOR4 = 24;
  private static int PFL_A3RISAMMRIDE_TOTALEIMPOR5 = 25;
  private static int PFL_A3RISAMMRIDE_TOTALEIMPOR6 = 26;

  private static int PPQRY_PARBILALRIA1 = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_A3RISAMMRIDE;
  private static int PFL_TOTAQUOTACCA_PROGRESSIVO = 0;
  private static int PFL_TOTAQUOTACCA_ESERCIZIO = 1;
  private static int PFL_TOTAQUOTACCA_TIPOSTAMPA = 2;
  private static int PFL_TOTAQUOTACCA_RAGGRUPPAMEN = 3;
  private static int PFL_TOTAQUOTACCA_IMPORTO1 = 4;

  private static int PPQRY_PARBILALRIAM = 0;


  IDPanel PAN_TOTAQUOTACCA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI674(IMDB);
    //
    //
    Init_PQRY_PARBILALRIA1(IMDB);
    Init_PQRY_PARBILALRIAM(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI674(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI674, 7);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI674, "TBL_PARAMETRI674");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARAPROGSTAM, "PARAPROGSTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARAPROGSTAM,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARANOMESTAM, "PARANOMESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARANOMESTAM,5,100,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARSTANUDIPA, "PARSTANUDIPA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARSTANUDIPA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARANOTESTAM, "PARANOTESTAM");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARANOTESTAM,5,200,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARAMIDSTAMP, "PARAMIDSTAMP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARAMIDSTAMP,3,10,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARANOMEFILE, "PARANOMEFILE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARANOMEFILE,9,500,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARAMLOOKUP, "PARAMLOOKUP");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI674,IMDBDef3.FLD_PARAMETRI674_PARAMLOOKUP,5,50,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI674, 0);
  }

  private static void Init_PQRY_PARBILALRIA1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARBILALRIA1, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARBILALRIA1, "PQRY_PARBILALRIA1");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_S, "S");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_S,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_SPESA, "CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_SPESA,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_SPESA, "ARTICOLO_SPESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_SPESA,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_SPESA, "DESCR_CAPITOLO_SPESA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_SPESA,5,500,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_E, "E");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_E,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_ENTRATA, "CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_ENTRATA,3,16,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_ENTRATA, "ARTICOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_ENTRATA,1,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_ENTRATA, "DESCR_CAPITOLO_ENTRATA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_ENTRATA,5,500,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_2, "IMPORTO_2");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_3, "IMPORTO_3");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_4, "IMPORTO_4");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_4,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_5, "IMPORTO_5");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIA1,IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_5,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARBILALRIA1, 0);
  }

  private static void Init_PQRY_PARBILALRIAM(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PARBILALRIAM, 5);
    IMDB.set_TblCode(IMDBDef12.PQRY_PARBILALRIAM, "PQRY_PARBILALRIAM");
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_TIPO_STAMPA, "TIPO_STAMPA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_TIPO_STAMPA,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_RAGGRUPPAMENTO, "RAGGRUPPAMENTO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_RAGGRUPPAMENTO,5,20,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_IMPORTO_1, "IMPORTO_1");
    IMDB.SetFldParams(IMDBDef12.PQRY_PARBILALRIAM,IMDBDef12.PQSL_PARBILALRIAM_IMPORTO_1,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_PARBILALRIAM, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public AllegatiBilancioA3Cons(MyWebEntryPoint w, IMDBObj imdb)
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
  public AllegatiBilancioA3Cons()
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
    FormIdx = MyGlb.FRM_ALLEBILA3CON;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "C69B5016-E6D5-4B92-8EC1-9C34C604E5A7";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 796;
    DesignHeight = 442;
    set_Caption(new IDVariant("A3 Ris. Amministrazione - Risorse Destinate"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 796;
    Frames[1].Height = 416;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.836538;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 796;
    Frames[2].Height = 348;
    Frames[2].Caption = "A3 Ris. Amministrazione - Risorse Destinate";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 348;
    PAN_A3RISAMMRIDE = new IDPanel(w, this, 2, "PAN_A3RISAMMRIDE");
    Frames[2].Content = PAN_A3RISAMMRIDE;
    PAN_A3RISAMMRIDE.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_A3RISAMMRIDE.VS = MainFrm.VisualStyleList;
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 348-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "725265AA-BB9C-4B15-BB9A-1C77F478B39E");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1632, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_A3RISAMMRIDE.InitStatus = 2;
    PAN_A3RISAMMRIDE_Init();
    PAN_A3RISAMMRIDE_InitFields();
    PAN_A3RISAMMRIDE_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 796;
    Frames[3].Height = 68;
    Frames[3].FrHidden = true;
    Frames[3].Caption = "Totale Quote Accantonate";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 68;
    PAN_TOTAQUOTACCA = new IDPanel(w, this, 3, "PAN_TOTAQUOTACCA");
    Frames[3].Content = PAN_TOTAQUOTACCA;
    PAN_TOTAQUOTACCA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_TOTAQUOTACCA.VS = MainFrm.VisualStyleList;
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 796-MyGlb.PAN_OFFS_X, 68-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "49D7EE0D-2164-489F-9CDF-6C35D1A3DE45");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 672, 56, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_TOTAQUOTACCA.InitStatus = 2;
    PAN_TOTAQUOTACCA_Init();
    PAN_TOTAQUOTACCA_InitFields();
    PAN_TOTAQUOTACCA_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_STAMPA22+BaseCmdLinIdx)
      {
        Stampa();
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
      PAN_A3RISAMMRIDE.UpdatePanel(MainFrm);
      PAN_TOTAQUOTACCA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A3RISAMMRIDE.FrIndex)
    {
      if (IdxFieldActived ==PFL_A3RISAMMRIDE_SCELCAPIENTR) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_A3RISAMMRIDE.FrIndex)
    {
      if (IdxFieldActived ==PFL_A3RISAMMRIDE_SCELCAPISPES) {
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
    return (obj instanceof AllegatiBilancioA3Cons);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? AllegatiBilancioA3Cons.class.getName() : (Glb.ClassWithPackage(AllegatiBilancioA3Cons.class) ? AllegatiBilancioA3Cons.class.getName().substring(AllegatiBilancioA3Cons.class.getPackage().getName().length() + 1) : AllegatiBilancioA3Cons.class.getName()));
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
      SettaCaptionA3();
      PAN_TOTAQUOTACCA.ClearValueList(PFL_TOTAQUOTACCA_RAGGRUPPAMEN);
      PAN_TOTAQUOTACCA.SetValueListItem(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, (new IDVariant("A3RISAMMCONSTOT1")), ((new IDVariant("A3RISAMMCONSTOT1")).equals((new IDVariant("A2RISAMMCONSM1")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da legge (m/1)") : (new IDVariant("A3RISAMMCONSTOT1")).equals((new IDVariant("A2RISAMMCONSM2")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da trasferimenti (m/2) ") : (new IDVariant("A3RISAMMCONSTOT1")).equals((new IDVariant("A2RISAMMCONSM3")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da finanziamenti (m/3)") : (new IDVariant("A3RISAMMCONSTOT1")).equals((new IDVariant("A2RISAMMCONSM4")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate dall'ente (m/4)") : (new IDVariant("A3RISAMMCONSTOT1")).equals((new IDVariant("A2RISAMMCONSM5")))? new IDVariant("Totale quote accantonate riguardanti le risorse vincolate da altro (m/5)") : (new IDVariant("A3RISAMMCONSTOT1")).equals((new IDVariant("A3RISAMMCONSTOT1")))? new IDVariant("Totale quote accantonate nel risultato di amministrazione riguardanti le risorse destinate agli investimenti (g)") :  new IDVariant()).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "Load", _e);
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

    try
    {
      TransCount = 0;
      // 
      // End Modal Body
      // Corpo Procedura
      // 
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARAMLOOKUP, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_ENTRATA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_ENTRATA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
          IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_SPESA, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "EndModal", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Risorse Destinate On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_A3RISAMMRIDE_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_A3RISAMMRIDE);
      // 
      // A3 Ris. Amministrazione - Risorse Destinate On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_RAGGRUPPAME1,(new IDVariant(PAN_A3RISAMMRIDE.FieldText(PFL_A3RISAMMRIDE_RAGGRUPPAME1))).stringValue()); 
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_DESCCAPIENTR,(new IDVariant(PAN_A3RISAMMRIDE.FieldText(PFL_A3RISAMMRIDE_DESCCAPIENTR))).stringValue()); 
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_DESCCAPISPES,(new IDVariant(PAN_A3RISAMMRIDE.FieldText(PFL_A3RISAMMRIDE_DESCCAPISPES))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "A3Ris.Amministrazione-RisorseDestinateOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Risorse Destinate On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_A3RISAMMRIDE_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A3 Ris. Amministrazione - Risorse Destinate On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_PROGRESSIVO, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_TIPO_STAMPA, 0, (new IDVariant("A3RISAMMCONS")));
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      }
      if ((Column.equals((new IDVariant(PFL_A3RISAMMRIDE_CAPITOENTRAT)), true) || Column.equals((new IDVariant(PFL_A3RISAMMRIDE_ARTICOENTRAT)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_ENTRATA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_ENTRATA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("E")), IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_ENTRATA, 0), IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_ENTRATA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_ENTRATA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_ENTRATA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_ENTRATA, 0, (new IDVariant()));
          }
          else
          {
            IDVariant v_VCAPDESCRIZI = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'E') ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_ENTRATA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_ENTRATA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_ENTRATA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A3RISAMMRIDE_CAPITOLSPESA)), true) || Column.equals((new IDVariant(PFL_A3RISAMMRIDE_ARTICOLSPESA)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_SPESA, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_SPESA, 0))))
        {
          if (MainFrm.ControlloBilancio(new IDVariant(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0),IDVariant.DECIMAL), (new IDVariant("S")), IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_SPESA, 0), IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_SPESA, 0)).equals((new IDVariant(-1)), true))
          {
            IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
            v_SMS = (new IDVariant("Capitolo non presente in bilancio", IDVariant.STRING));
            MainFrm.set_AlertMessage(v_SMS); 
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_SPESA, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_SPESA, 0, (new IDVariant()));
          }
          else
          {
            IDVariant v_VCAPDESCRIZI = new IDVariant(0,IDVariant.STRING);
            SQL = new StringBuffer();
            SQL.append("select ");
            SQL.append("  A.DESCRIZIONE as CAPDESCRIZIO ");
            SQL.append("from ");
            SQL.append("  CAP A ");
            SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.E_S = 'S') ");
            SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_CAPITOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_ARTICOLO_SPESA, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
            QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
            if (!QV.EOF()) QV.MoveNext();
            if (!QV.EOF())
            {
              v_VCAPDESCRIZI = QV.Get("CAPDESCRIZIO", IDVariant.STRING) ;
            }
            QV.Close();
            IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_DESCR_CAPITOLO_SPESA, 0, new IDVariant(v_VCAPDESCRIZI));
          }
        }
      }
      if ((Column.equals((new IDVariant(PFL_A3RISAMMRIDE_IMPORTO7)), true) || Column.equals((new IDVariant(PFL_A3RISAMMRIDE_IMPORTO2)), true) || Column.equals((new IDVariant(PFL_A3RISAMMRIDE_IMPORTO3)), true) || Column.equals((new IDVariant(PFL_A3RISAMMRIDE_IMPORTO4)), true) || Column.equals((new IDVariant(PFL_A3RISAMMRIDE_IMPORTO5)), true)) && FieldWasModified.booleanValue())
      {
        CalcolaTotali();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "A3Ris.Amministrazione-RisorseDestinateOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Risorse Destinate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_A3RISAMMRIDE_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A3 Ris. Amministrazione - Risorse Destinate After Find Body
      // Corpo Procedura
      // 
      CalcolaTotali();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "A3Ris.Amministrazione-RisorseDestinateAfterFind", _e);
    }
  }

  // **********************************************************************
  // A3 Ris. Amministrazione - Risorse Destinate After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_A3RISAMMRIDE_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // A3 Ris. Amministrazione - Risorse Destinate After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_A3RISAMMRIDE.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "A3Ris.Amministrazione-RisorseDestinateAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Totale Quote Accantonate After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Totale Quote Accantonate After Find Body
      // Corpo Procedura
      // 
      if ((new IDVariant(PAN_TOTAQUOTACCA.GetNumRows())).equals((new IDVariant(0)), true))
      {
        try
        {
          SQL = new StringBuffer();
          SQL.append("insert into PARAM_BIL_ALL_RIS_AMM ");
          SQL.append("( ");
          SQL.append("  PROGRESSIVO, ");
          SQL.append("  TIPO_STAMPA, ");
          SQL.append("  ESERCIZIO, ");
          SQL.append("  RAGGRUPPAMENTO ");
          SQL.append(") ");
          SQL.append("values ");
          SQL.append("( ");
          SQL.append("  to_number(NULL), ");
          SQL.append("  'A3RISAMMCONSTOT', ");
          SQL.append("  " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
          SQL.append("  'A3RISAMMCONSTOT1' ");
          SQL.append(") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        catch (Exception e4)
        {
          MainFrm.set_AlertMessage(new IDVariant(e4.getMessage())); 
          return;
        }
        PAN_TOTAQUOTACCA.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "TotaleQuoteAccantonateAfterFind", _e);
    }
  }

  // **********************************************************************
  // Setta Caption A3
  // **********************************************************************
  public int SettaCaptionA3 ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Caption A3 Body
      // Corpo Procedura
      // 
      IDVariant v_CAPTIOIMPOR1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR1 = (new IDVariant("Risorse destinate al 1/1/"));
      IDVariant v_TOOLTIIMPOR1 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR1 = (new IDVariant("Risorse destinate agli investim. al 1/1/"));
      IDVariant v_CAPTIOIMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR2 = (new IDVariant("Entrate destinate accertate nel "));
      IDVariant v_TOOLTIIMPOR2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR2 = (new IDVariant("Entrate destinate agli investimenti accertate nel  "));
      IDVariant v_CAPTIOIMP1 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMP1 = (new IDVariant(" finanziati da ent. accert."));
      IDVariant v_TOOLTIIMP1 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP1 = (new IDVariant(" finanziati da entrate destinate accertate nell'esercizio o da quote destinate del risultato di amministrazione"));
      IDVariant v_CAPTIOIMPORT = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPORT = (new IDVariant("Fondo plur. vinc. al 31/12/"));
      IDVariant v_TOOLTIIMP2 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMP2 = (new IDVariant(" finanziato da entrate destinate accertate nell'esercizio o da quote destinate del risultato di amministrazione"));
      IDVariant v_TOOLTIIMPORT = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPORT = (new IDVariant("Cancellazione di residui attivi costituiti da risorse destinate agli investimenti  o eliminazione della destinazione  su quote del risultato di amministrazione (+) e cancellazione di residui passivi finanziati da risorse destinate agli investimenti (-) (gestione dei residui)"));
      IDVariant v_CAPTIOIMPOR6 = new IDVariant(0,IDVariant.STRING);
      v_CAPTIOIMPOR6 = (new IDVariant("Risorse destinate al 31/12/"));
      IDVariant v_TOOLTIIMPOR6 = new IDVariant(0,IDVariant.STRING);
      v_TOOLTIIMPOR6 = (new IDVariant("Risorse destinate agli investim. al 31/12/"));
      IDVariant v_TOOLT2IMPOR6 = new IDVariant(0,IDVariant.STRING);
      v_TOOLT2IMPOR6 = (new IDVariant("(f)=(a)+(b)-(c)-(d)-(e)"));
      PAN_A3RISAMMRIDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO7, IDL.Add(v_CAPTIOIMPOR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO7,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR1, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), (new IDVariant("(a)"))).stringValue()); 
      PAN_A3RISAMMRIDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO2, IDL.Add(v_CAPTIOIMPOR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO2,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), (new IDVariant("(b)"))).stringValue()); 
      PAN_A3RISAMMRIDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO3, IDL.Add(IDL.Add(IDL.Add((new IDVariant("Impegni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), v_CAPTIOIMP1).stringValue());
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO3,IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Impegni")), (new IDVariant(" "))), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), v_TOOLTIIMP1), (new IDVariant(" "))), (new IDVariant("(c)"))).stringValue()); 
      PAN_A3RISAMMRIDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO4, IDL.Add(v_CAPTIOIMPORT, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO4,IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_CAPTIOIMPORT, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), v_TOOLTIIMP2), (new IDVariant(" "))), (new IDVariant("(d)"))).stringValue()); 
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO5,IDL.Add(IDL.Add(v_TOOLTIIMPORT, (new IDVariant(" "))), (new IDVariant("(e)"))).stringValue()); 
      PAN_A3RISAMMRIDE.set_Header(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO6, IDL.Add(v_CAPTIOIMPOR6, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_A3RISAMMRIDE.set_ToolTip(Glb.OBJ_FIELD,PFL_A3RISAMMRIDE_IMPORTO6,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR6, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), v_TOOLT2IMPOR6).stringValue()); 
      PAN_TOTAQUOTACCA.set_Header(Glb.OBJ_FIELD,PFL_TOTAQUOTACCA_IMPORTO1, IDL.Add(v_CAPTIOIMPOR6, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
      PAN_TOTAQUOTACCA.set_ToolTip(Glb.OBJ_FIELD,PFL_TOTAQUOTACCA_IMPORTO1,IDL.Add(IDL.Add(IDL.Add(v_TOOLTIIMPOR6, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))), (new IDVariant(" "))), v_TOOLT2IMPOR6).stringValue()); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "SettaCaptionA3", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Capitolo Entrata
  // **********************************************************************
  public int SceltaCapitoloEntrata ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Entrata Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARAMLOOKUP, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "SceltaCapitoloEntrata", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Capitolo Spesa
  // **********************************************************************
  public int SceltaCapitoloSpesa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Capitolo Spesa Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMETIPO, 0, (new IDVariant("B")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARAMLOOKUP, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "SceltaCapitoloSpesa", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcola Totali
  // **********************************************************************
  public int CalcolaTotali ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Calcola Totali Body
      // Corpo Procedura
      // 
      PAN_A3RISAMMRIDE.set_FieldText(PFL_A3RISAMMRIDE_TOTALEIMPOR1, IDL.Format(PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO7), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMRIDE.set_FieldText(PFL_A3RISAMMRIDE_TOTALEIMPOR2, IDL.Format(PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO2), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMRIDE.set_FieldText(PFL_A3RISAMMRIDE_TOTALEIMPOR3, IDL.Format(PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO3), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMRIDE.set_FieldText(PFL_A3RISAMMRIDE_TOTALEIMPOR4, IDL.Format(PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO4), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMRIDE.set_FieldText(PFL_A3RISAMMRIDE_TOTALEIMPOR5, IDL.Format(PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO5), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      PAN_A3RISAMMRIDE.set_FieldText(PFL_A3RISAMMRIDE_TOTALEIMPOR6, IDL.Format(IDL.Sub(IDL.Sub(IDL.Sub(IDL.Add(PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO7), PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO2)), PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO3)), PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO4)), PAN_A3RISAMMRIDE.GetFieldSum(PFL_A3RISAMMRIDE_IMPORTO5)), (new IDVariant("###,###,###,##0.00")), MainFrm).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "CalcolaTotali", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Stampa
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Stampa ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Stampa Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_A3RISAMMRIDE.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
        MainFrm.Cf4armDBObject.LANCIOPROCEDURASTAMPECONS(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), MainFrm.PROGRESESSIO, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARAPROGSTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARANOTESTAM, 0));
        if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
        {
          MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          return 0;
        }
        IDVariant v_PAR1 = new IDVariant(0,IDVariant.STRING);
        v_PAR1 = (new IDVariant("SESSIONE"));
        IDVariant v_PAR2 = new IDVariant(0,IDVariant.STRING);
        v_PAR2 = (new IDVariant("ESERCIZIO"));
        MainFrm.SetParametroStampaJasper(v_PAR1, IDL.ToString(MainFrm.PROGRESESSIO));
        MainFrm.SetParametroStampaJasper(v_PAR2, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
        MainFrm.SetParametroStampaJasper((new IDVariant("PAG")), IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARSTANUDIPA, 0));
        MainFrm.SalvaELanciaStampaBil(IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARAMIDSTAMP, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARANOMESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARANOTESTAM, 0), IMDB.Value(IMDBDef3.TBL_PARAMETRI674, IMDBDef3.FLD_PARAMETRI674_PARANOMEFILE, 0), (new IDVariant("pdf")));
        MainFrm.UnloadForm(FormIdx,(new IDVariant(0)).booleanValue()); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("AllegatiBilancioA3Cons", "Stampa", _e);
      return -1;
    }
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
  private void PAN_A3RISAMMRIDE_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_A3RISAMMRIDE, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_A3RISAMMRIDE_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_A3RISAMMRIDE, Cancel);
    // Stub
  }

  private void PAN_A3RISAMMRIDE_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_A3RISAMMRIDE_SCELCAPIENTR)
    {
      this.IdxPanelActived = this.PAN_A3RISAMMRIDE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitoloEntrata();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_A3RISAMMRIDE_SCELCAPISPES)
    {
      this.IdxPanelActived = this.PAN_A3RISAMMRIDE.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaCapitoloSpesa();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_A3RISAMMRIDE_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_A3RISAMMRIDE_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_A3RISAMMRIDE_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_S, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_S, 0, (new IDVariant("S")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_E, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_E, 0, (new IDVariant("E")));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_1, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_2, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_2, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_3, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_3, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_4, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_4, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_5, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIA1, IMDBDef12.PQSL_PARBILALRIA1_IMPORTO_5, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_A3RISAMMRIDE_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_TOTAQUOTACCA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_TOTAQUOTACCA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_TOTAQUOTACCA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_TOTAQUOTACCA);
    // Stub
  }

  private void PAN_TOTAQUOTACCA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_TOTAQUOTACCA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_TOTAQUOTACCA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_PARBILALRIAM, IMDBDef12.PQSL_PARBILALRIAM_IMPORTO_1, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PARBILALRIAM, IMDBDef12.PQSL_PARBILALRIAM_IMPORTO_1, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_TOTAQUOTACCA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_A3RISAMMRIDE_Init()
  {

    PAN_A3RISAMMRIDE.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_A3RISAMMRIDE.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, "035D2E4B-E9FF-4A8E-83CD-4DFE65B0B9D2");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, "Entrata");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, MyGlb.VIS_GROUPSTYLE);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, MyGlb.PANEL_LIST, 0, -9999, 432, 16, 0, 0);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, MyGlb.PANEL_FORM, 0, 75, 604, 361, 0, 0);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, 0, 42);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, 1, 13);
    PAN_A3RISAMMRIDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, 0, 4);
    PAN_A3RISAMMRIDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, 1, 4);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_ENTRATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, "AC313337-372D-47B6-81AE-736D7DD6B4F0");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, "Spesa");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, MyGlb.VIS_GROUPSTYLE);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, MyGlb.PANEL_LIST, 432, -9999, 432, 16, 0, 0);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, MyGlb.PANEL_FORM, 0, 27, 588, 457, 0, 0);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, 0, 34);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, 1, 13);
    PAN_A3RISAMMRIDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, 0, 4);
    PAN_A3RISAMMRIDE.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, 1, 4);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_GROUP, GRP_A3RISAMMRIDE_SPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_A3RISAMMRIDE.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, "B155833D-3867-4607-94A9-1F15D65CA8DE");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, "PROGRESSIVO");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, "00B88B1C-2F37-4C82-9D15-F6B4FC2E7DE2");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, "TIPO STAMPA");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.VIS_NONNULLAFIEL);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, 0, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, "7A3AEFEF-AFFA-4704-BF40-F8AA947A0D07");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, "ESERCIZIO");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.VIS_NONNULLAFIEL);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, 0, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, "D9E9122D-C74B-4E57-A6A2-36704897890D");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, "Fondo Accantonamento");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, 0 | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, "2682D54B-9266-473C-BC77-049453DF029B");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, "S");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, "19CC3D83-CF54-45B1-A13A-074913490C26");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, "Capitolo");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.VIS_NORFIEINTLUN);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, "9D6946CA-D41C-47F1-B63E-F2C72EF3F52F");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, "Art.");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.VIS_NORMALFIELDS);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, "A5E77791-D455-4E76-BF21-78CB9DF050AD");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, " ");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.VIS_HYPELINKIMMA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, "1DD4B57B-2FDA-4C99-9B29-245241411D17");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, "Descrizione");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.VIS_NORMALFIELDS);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, "08F9230D-AE64-4A6D-9B22-F053B9487A4E");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, "Capitolo");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.VIS_NORFIEINTLUN);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, "01DF11AD-3084-4FF3-A3CE-3D9EA746731F");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, "Art.");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, "26AA6A52-56BB-491E-ADD8-327D0C91CF14");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, " ");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.VIS_HYPELINKIMMA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, "94DD7570-E8C9-4263-B393-2B2874C7B0F0");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, "Descrizione");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.VIS_NORMALFIELDS);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, "6F7E0114-7568-4C6A-BCA7-8E375873DEC8");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, "E");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.VIS_NORMFIELPADR);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, "8FC62188-D046-47E8-9EF3-EC331956A89E");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, "IMPORTO 1");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, "2D9AE1D4-D242-4915-9131-8923BC30EA34");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, "IMPORTO 2");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, "132506D1-4376-450D-A059-B1659F262F52");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, "IMPORTO 3");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, "83D05DB5-FA2A-4190-9CD1-6F098B5373E3");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, "IMPORTO 4");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, "Variazione accantonamenti effettuata in sede di rendiconto (con segno +/-) (d)");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, "FAC6182D-206C-4DE8-95D2-B643A95E84D6");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, "Cancellazione di residui attivi ");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, "2A1321FF-0616-462F-9182-307B11D35309");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, "IMPORTO 6");
    PAN_A3RISAMMRIDE.set_ToolTip(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.VIS_NORFIECF4IMP);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, "EA5ABCDB-721E-4638-9AFE-E7150307771E");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, "Totale");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, MyGlb.VIS_VUOTONORMALE);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, "2ACC7DAB-D04A-45F3-9635-7A1B6E6C73D2");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, "F1EAA13E-B116-4DA8-A380-5ADBE0A80F57");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, "D3EDE005-00B1-4F02-8972-ACB231C31F04");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, "D533292D-22E0-4EB7-8566-71F884988A47");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, "420E1F0F-534D-43DE-8960-A89C7FAE779B");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_A3RISAMMRIDE.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, "CA59AC37-0017-4FB3-AC80-74C96F7BFF2B");
    PAN_A3RISAMMRIDE.set_Header(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, "");
    PAN_A3RISAMMRIDE.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, MyGlb.VIS_CAMPTOTADISA);
    PAN_A3RISAMMRIDE.SetFlags(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_A3RISAMMRIDE_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_LIST, 88);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_LIST, "PROG.");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_PROGRESSIVO1, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_PROGRESSIVO1, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_PROGRESSIVO1, PPQRY_PARBILALRIA1, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, 0, 36, 96, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, 88);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_LIST, "TIPO STAMPA");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, 104);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TIPOSTAMPA1, MyGlb.PANEL_FORM, "TIPO STAMPA");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_TIPOSTAMPA1, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_TIPOSTAMPA1, PPQRY_PARBILALRIA1, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_LIST, "ESER.");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_ESERCIZIO1, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_ESERCIZIO1, PPQRY_PARBILALRIA1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, 0, 36, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, 116);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_LIST, "Fondo Accantonamento");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, 228, 28, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, 120);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_RAGGRUPPAME1, MyGlb.PANEL_FORM, "Fon. Accanton.");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_RAGGRUPPAME1, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_RAGGRUPPAME1, PPQRY_PARBILALRIA1, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_LIST, 96, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_LIST, 16);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_LIST, "S");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_FORM, 492, 28, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_FORM, 32);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_S, MyGlb.PANEL_FORM, "S");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_S, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_S, PPQRY_PARBILALRIA1, "A.S", "S", 5, 1, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_FORM, 188, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOENTRAT, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_CAPITOENTRAT, -1, GRP_A3RISAMMRIDE_ENTRATA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_CAPITOENTRAT, PPQRY_PARBILALRIA1, "A.CAPITOLO_ENTRATA", "CAPITOLO_ENTRATA", 3, 16, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_LIST, 112, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_LIST, 120);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_LIST, "Art.");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_FORM, 380, 100, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_FORM, 136);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOENTRAT, MyGlb.PANEL_FORM, "Art.");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_ARTICOENTRAT, -1, GRP_A3RISAMMRIDE_ENTRATA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_ARTICOENTRAT, PPQRY_PARBILALRIA1, "A.ARTICOLO_ENTRATA", "ARTICOLO_ENTRATA", 1, 2, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_LIST, 144, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_LIST, 172);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_LIST, " ");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_FORM, 4, 364, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_FORM, 172);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPIENTR, MyGlb.PANEL_FORM, " ");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_SCELCAPIENTR, -1, GRP_A3RISAMMRIDE_ENTRATA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_SCELCAPIENTR, PPQRY_DUAL, "'A'", "SCELCAPIENTR", 5, 1, 0, -13997);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPIENTR, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_LIST, 168, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_LIST, 160);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_FORM, 4, 388, 596, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_FORM, 160);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_FORM, 2);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPIENTR, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_DESCCAPIENTR, -1, GRP_A3RISAMMRIDE_ENTRATA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_DESCCAPIENTR, PPQRY_PARBILALRIA1, "A.DESCR_CAPITOLO_ENTRATA", "DESCR_CAPITOLO_ENTRATA", 5, 500, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_LIST, 432, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_LIST, "Capitolo");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_FORM, 4, 52, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_CAPITOLSPESA, MyGlb.PANEL_FORM, "Capitolo");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_CAPITOLSPESA, -1, GRP_A3RISAMMRIDE_SPESA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_CAPITOLSPESA, PPQRY_PARBILALRIA1, "A.CAPITOLO_SPESA", "CAPITOLO_SPESA", 3, 16, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_LIST, 544, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_LIST, 104);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_LIST, "Art.");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_FORM, 228, 52, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_FORM, 120);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ARTICOLSPESA, MyGlb.PANEL_FORM, "Art.");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_ARTICOLSPESA, -1, GRP_A3RISAMMRIDE_SPESA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_ARTICOLSPESA, PPQRY_PARBILALRIA1, "A.ARTICOLO_SPESA", "ARTICOLO_SPESA", 1, 2, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_LIST, 576, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_LIST, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_LIST, " ");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_FORM, 4, 304, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_SCELCAPISPES, MyGlb.PANEL_FORM, " ");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_SCELCAPISPES, -1, GRP_A3RISAMMRIDE_SPESA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_SCELCAPISPES, PPQRY_DUAL, "'A'", "SCELCAPISPES", 5, 1, 0, -13997);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_A3RISAMMRIDE.SetValueListItem(PFL_A3RISAMMRIDE_SCELCAPISPES, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_LIST, 600, 36, 264, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_LIST, 144);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_LIST, "Descrizione");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_FORM, 4, 436, 580, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_FORM, 144);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_FORM, 2);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_DESCCAPISPES, MyGlb.PANEL_FORM, "Descrizione");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_DESCCAPISPES, -1, GRP_A3RISAMMRIDE_SPESA);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_DESCCAPISPES, PPQRY_PARBILALRIA1, "A.DESCR_CAPITOLO_SPESA", "DESCR_CAPITOLO_SPESA", 5, 500, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_LIST, 176, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_LIST, 16);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_LIST, "E");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_E, MyGlb.PANEL_FORM, "E");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_E, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_E, PPQRY_PARBILALRIA1, "A.E", "E", 5, 1, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_LIST, 864, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO7, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_IMPORTO7, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_IMPORTO7, PPQRY_PARBILALRIA1, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_LIST, 992, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_LIST, "IMPORTO 2");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_FORM, 4, 172, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO2, MyGlb.PANEL_FORM, "IMPORTO 2");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_IMPORTO2, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_IMPORTO2, PPQRY_PARBILALRIA1, "A.IMPORTO_2", "IMPORTO_2", 3, 14, 2, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_LIST, 1120, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_LIST, "IMPORTO 3");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_FORM, 4, 196, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO3, MyGlb.PANEL_FORM, "IMPORTO 3");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_IMPORTO3, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_IMPORTO3, PPQRY_PARBILALRIA1, "A.IMPORTO_3", "IMPORTO_3", 3, 14, 2, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_LIST, 1248, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_LIST, "IMPORTO 4");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_FORM, 4, 220, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO4, MyGlb.PANEL_FORM, "IMPORTO 4");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_IMPORTO4, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_IMPORTO4, PPQRY_PARBILALRIA1, "A.IMPORTO_4", "IMPORTO_4", 3, 14, 2, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_LIST, 1376, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_LIST, 72);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_LIST, "Cancellazione di residui attivi ");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_FORM, 4, 244, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_FORM, 128);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO5, MyGlb.PANEL_FORM, "Cancell. di res. attivi");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_IMPORTO5, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_IMPORTO5, PPQRY_PARBILALRIA1, "A.IMPORTO_5", "IMPORTO_5", 3, 14, 2, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_LIST, 1504, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_LIST, 80);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_LIST, "IMPORTO 6");
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_FORM, 4, 280, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_FORM, 80);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_IMPORTO6, MyGlb.PANEL_FORM, "IMPORTO 6");
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_IMPORTO6, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_IMPORTO6, PPQRY_DUAL, "~~IMPORTO_1~~ + ~~IMPORTO_2~~ - ~~IMPORTO_3~~ - ~~IMPORTO_4~~ - ~~IMPORTO_5~~", "IMPORTO6", 3, 28, 6, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, MyGlb.PANEL_LIST, 784, 240, 76, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, MyGlb.PANEL_FORM, 568, 252, 76, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_ETICHETOTALE, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_ETICHETOTALE, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_ETICHETOTALE, -1, "", "ETICHETOTALE", 0, 0, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, MyGlb.PANEL_LIST, 864, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, MyGlb.PANEL_FORM, 656, 248, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR1, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_TOTALEIMPOR1, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_TOTALEIMPOR1, -1, "", "TOTALEIMPOR1", 0, 0, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, MyGlb.PANEL_LIST, 992, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, MyGlb.PANEL_FORM, 664, 256, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR2, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_TOTALEIMPOR2, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_TOTALEIMPOR2, -1, "", "TOTALEIMPOR2", 0, 0, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1120, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, MyGlb.PANEL_FORM, 672, 264, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR3, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_TOTALEIMPOR3, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_TOTALEIMPOR3, -1, "", "TOTALEIMPOR3", 0, 0, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1248, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, MyGlb.PANEL_FORM, 680, 272, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR4, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_TOTALEIMPOR4, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_TOTALEIMPOR4, -1, "", "TOTALEIMPOR4", 0, 0, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1376, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR5, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_TOTALEIMPOR5, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_TOTALEIMPOR5, -1, "", "TOTALEIMPOR5", 0, 0, 0, -13997);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, MyGlb.PANEL_LIST, 1504, 240, 128, 20, MyGlb.RESMODE_MOVE, MyGlb.RESMODE_MOVE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, MyGlb.PANEL_LIST, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, MyGlb.PANEL_LIST, 1);
    PAN_A3RISAMMRIDE.SetRect(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, MyGlb.PANEL_FORM, 688, 280, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_A3RISAMMRIDE.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, MyGlb.PANEL_FORM, 0);
    PAN_A3RISAMMRIDE.SetNumRow(MyGlb.OBJ_FIELD, PFL_A3RISAMMRIDE_TOTALEIMPOR6, MyGlb.PANEL_FORM, 1);
    PAN_A3RISAMMRIDE.SetFieldPage(PFL_A3RISAMMRIDE_TOTALEIMPOR6, -1, -1);
    PAN_A3RISAMMRIDE.SetFieldPanel(PFL_A3RISAMMRIDE_TOTALEIMPOR6, -1, "", "TOTALEIMPOR6", 0, 0, 0, -13997);
  }

  private void PAN_A3RISAMMRIDE_InitQueries()
  {
    StringBuffer SQL;

    PAN_A3RISAMMRIDE.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~IMPORTO_1~~ + ~~IMPORTO_2~~ - ~~IMPORTO_3~~ - ~~IMPORTO_4~~ - ~~IMPORTO_5~~ as IMPORTO6, ");
    SQL.append("  'A' as SCELCAPIENTR, ");
    SQL.append("  'A' as SCELCAPISPES ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~ESERCIZIO~~ IS NULL))) ");
    PAN_A3RISAMMRIDE.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_A3RISAMMRIDE.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A3RISAMMRIDE.SetMasterTable(PPQRY_DUAL, "DUAL");
    PAN_A3RISAMMRIDE.SetIMDB(IMDB, "PQRY_PARBILALRIA1", true);
    PAN_A3RISAMMRIDE.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.RAGGRUPPAMENTO as RAGGRUPPAMENTO, ");
    SQL.append("  A.S as S, ");
    SQL.append("  A.CAPITOLO_SPESA as CAPITOLO_SPESA, ");
    SQL.append("  A.ARTICOLO_SPESA as ARTICOLO_SPESA, ");
    SQL.append("  A.DESCR_CAPITOLO_SPESA as DESCR_CAPITOLO_SPESA, ");
    SQL.append("  A.E as E, ");
    SQL.append("  A.CAPITOLO_ENTRATA as CAPITOLO_ENTRATA, ");
    SQL.append("  A.ARTICOLO_ENTRATA as ARTICOLO_ENTRATA, ");
    SQL.append("  A.DESCR_CAPITOLO_ENTRATA as DESCR_CAPITOLO_ENTRATA, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1, ");
    SQL.append("  A.IMPORTO_2 as IMPORTO_2, ");
    SQL.append("  A.IMPORTO_3 as IMPORTO_3, ");
    SQL.append("  A.IMPORTO_4 as IMPORTO_4, ");
    SQL.append("  A.IMPORTO_5 as IMPORTO_5 ");
    PAN_A3RISAMMRIDE.SetQuery(PPQRY_PARBILALRIA1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A ");
    PAN_A3RISAMMRIDE.SetQuery(PPQRY_PARBILALRIA1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A3RISAMMCONS') ");
    PAN_A3RISAMMRIDE.SetQuery(PPQRY_PARBILALRIA1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A3RISAMMRIDE.SetQuery(PPQRY_PARBILALRIA1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_A3RISAMMRIDE.SetQuery(PPQRY_PARBILALRIA1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO_ENTRATA, ");
    SQL.append("  A.ARTICOLO_ENTRATA, ");
    SQL.append("  A.DESCR_CAPITOLO_ENTRATA, ");
    SQL.append("  A.CAPITOLO_SPESA, ");
    SQL.append("  A.ARTICOLO_SPESA, ");
    SQL.append("  A.DESCR_CAPITOLO_SPESA ");
    PAN_A3RISAMMRIDE.SetQuery(PPQRY_PARBILALRIA1, 5, SQL, -1, "");
    PAN_A3RISAMMRIDE.SetQueryDB(PPQRY_PARBILALRIA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_A3RISAMMRIDE.SetMasterTable(0, "PARAM_BIL_ALL_RIS_AMM");
    PAN_A3RISAMMRIDE.AddToSortList(PFL_A3RISAMMRIDE_CAPITOENTRAT, true);
    PAN_A3RISAMMRIDE.AddToSortList(PFL_A3RISAMMRIDE_ARTICOENTRAT, true);
    PAN_A3RISAMMRIDE.AddToSortList(PFL_A3RISAMMRIDE_DESCCAPIENTR, true);
    PAN_A3RISAMMRIDE.AddToSortList(PFL_A3RISAMMRIDE_CAPITOLSPESA, true);
    PAN_A3RISAMMRIDE.AddToSortList(PFL_A3RISAMMRIDE_ARTICOLSPESA, true);
    PAN_A3RISAMMRIDE.AddToSortList(PFL_A3RISAMMRIDE_DESCCAPISPES, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_A3RISAMMRIDE.Status() == 2)
    {
      int oldListQBE = PAN_A3RISAMMRIDE.iUseListQBE;
      PAN_A3RISAMMRIDE.iUseListQBE = 0;
      PAN_A3RISAMMRIDE.PanelCommand(Glb.PCM_SEARCH);
      PAN_A3RISAMMRIDE.PanelCommand(Glb.PCM_FIND);
      PAN_A3RISAMMRIDE.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_TOTAQUOTACCA_Init()
  {

    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "F6BD488A-EDA3-479A-87CF-C3650D5A5D4C");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "PROGRESSIVO");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "C0D9927D-2562-4031-B020-A9955458CDD2");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "ESERCIZIO");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.VIS_NONNULLAFIEL);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, 0, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, "235ED7A9-82A3-49F6-A8C9-9B84FFC9B8B4");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, " ");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, 0, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, "6FCD4E11-146F-474F-83AA-24E5F51276E6");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, " ");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.VIS_NORMALFIELDS);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_TOTAQUOTACCA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, "E85BF92E-88B6-4063-B09B-CE5C89E64864");
    PAN_TOTAQUOTACCA.set_Header(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, "IMPORTO 1");
    PAN_TOTAQUOTACCA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, "");
    PAN_TOTAQUOTACCA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_TOTAQUOTACCA.SetFlags(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_TOTAQUOTACCA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, 88);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_LIST, "PROG.");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 4, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGRESSIVO");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_PROGRESSIVO, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_PROGRESSIVO, PPQRY_PARBILALRIAM, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_ESERCIZIO, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_ESERCIZIO, PPQRY_PARBILALRIAM, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 0, 36, 400, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 88);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_LIST, " ");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 188, 4, 280, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 104);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_TIPOSTAMPA, MyGlb.PANEL_FORM, " ");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_TIPOSTAMPA, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_TIPOSTAMPA, PPQRY_PARBILALRIAM, "A.TIPO_STAMPA", "TIPO_STAMPA", 5, 20, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 0, 36, 544, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 116);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_LIST, " ");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 4, 172, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 116);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_RAGGRUPPAMEN, MyGlb.PANEL_FORM, " ");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, PPQRY_PARBILALRIAM, "A.RAGGRUPPAMENTO", "RAGGRUPPAMENTO", 5, 20, 0, -13997);
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 544, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 72);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_LIST, "IMPORTO 1");
    PAN_TOTAQUOTACCA.SetRect(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 4, 148, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_TOTAQUOTACCA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 128);
    PAN_TOTAQUOTACCA.SetNumRow(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, 1);
    PAN_TOTAQUOTACCA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_TOTAQUOTACCA_IMPORTO1, MyGlb.PANEL_FORM, "IMPORTO 1");
    PAN_TOTAQUOTACCA.SetFieldPage(PFL_TOTAQUOTACCA_IMPORTO1, -1, -1);
    PAN_TOTAQUOTACCA.SetFieldPanel(PFL_TOTAQUOTACCA_IMPORTO1, PPQRY_PARBILALRIAM, "A.IMPORTO_1", "IMPORTO_1", 3, 14, 2, -13997);
  }

  private void PAN_TOTAQUOTACCA_InitQueries()
  {
    StringBuffer SQL;

    PAN_TOTAQUOTACCA.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_TOTAQUOTACCA.SetIMDB(IMDB, "PQRY_PARBILALRIAM", true);
    PAN_TOTAQUOTACCA.set_SetString(MyGlb.MASTER_ROWNAME, "PARAM BIL ALL RIS AMM");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.TIPO_STAMPA as TIPO_STAMPA, ");
    SQL.append("  A.RAGGRUPPAMENTO as RAGGRUPPAMENTO, ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.IMPORTO_1 as IMPORTO_1 ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIAM, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  PARAM_BIL_ALL_RIS_AMM A ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIAM, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.TIPO_STAMPA = 'A3RISAMMCONSTOT') ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIAM, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIAM, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIAM, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.RAGGRUPPAMENTO ");
    PAN_TOTAQUOTACCA.SetQuery(PPQRY_PARBILALRIAM, 5, SQL, -1, "");
    PAN_TOTAQUOTACCA.SetQueryDB(PPQRY_PARBILALRIAM, MainFrm.Cf4armDBObject.DB, 4);
    PAN_TOTAQUOTACCA.SetMasterTable(0, "PARAM_BIL_ALL_RIS_AMM");
    PAN_TOTAQUOTACCA.AddToSortList(PFL_TOTAQUOTACCA_RAGGRUPPAMEN, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_TOTAQUOTACCA.Status() == 2)
    {
      int oldListQBE = PAN_TOTAQUOTACCA.iUseListQBE;
      PAN_TOTAQUOTACCA.iUseListQBE = 0;
      PAN_TOTAQUOTACCA.PanelCommand(Glb.PCM_SEARCH);
      PAN_TOTAQUOTACCA.PanelCommand(Glb.PCM_FIND);
      PAN_TOTAQUOTACCA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_A3RISAMMRIDE) PAN_A3RISAMMRIDE_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_A3RISAMMRIDE) PAN_A3RISAMMRIDE_ValidateRow(Cancel);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_A3RISAMMRIDE) PAN_A3RISAMMRIDE_DynamicProperties();
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_A3RISAMMRIDE) PAN_A3RISAMMRIDE_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_A3RISAMMRIDE) PAN_A3RISAMMRIDE_AfterFind(CmdFind);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
    if (SrcObj == PAN_A3RISAMMRIDE) PAN_A3RISAMMRIDE_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_A3RISAMMRIDE) PAN_A3RISAMMRIDE_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_TOTAQUOTACCA) PAN_TOTAQUOTACCA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
