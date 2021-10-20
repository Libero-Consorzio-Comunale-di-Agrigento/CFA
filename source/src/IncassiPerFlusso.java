// **********************************************
// Incassi Per Flusso
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class IncassiPerFlusso extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DATAINCASSO = 0;

  private static int PFL_PARAMETRI_IDFLUSSOBT1 = 0;
  private static int PFL_PARAMETRI_DATADAL = 1;
  private static int PFL_PARAMETRI_DATAAL = 2;

  private static int PPQRY_PARAMETRI615 = 0;


  IDPanel PAN_PARAMETRI;
  private static int GRP_INCASSI_ORDINATIVO = 0;
  private static int GRP_INCASSI_DOCUMENTO = 1;

  private static int PFL_INCASSI_NUMEROORD = 0;
  private static int PFL_INCASSI_ANNOORD = 1;
  private static int PFL_INCASSI_DEBITORE = 2;
  private static int PFL_INCASSI_ORDIMPORTO = 3;
  private static int PFL_INCASSI_INCASSO = 4;
  private static int PFL_INCASSI_DATA = 5;
  private static int PFL_INCASSI_NUMERO = 6;
  private static int PFL_INCASSI_FATNUMERODOC = 7;
  private static int PFL_INCASSI_FATDDATADOC = 8;
  private static int PFL_INCASSI_QUIETANZA = 9;
  private static int PFL_INCASSI_DATAVALUTA = 10;
  private static int PFL_INCASSI_CODICRIFOPER = 11;
  private static int PFL_INCASSI_IMPORTOBOLLO = 12;
  private static int PFL_INCASSI_IMPORTOSPESE = 13;
  private static int PFL_INCASSI_IMPORTCOMMIS = 14;
  private static int PFL_INCASSI_IDFLUSSOBT = 15;
  private static int PFL_INCASSI_SOMMADIINCAS = 16;
  private static int PFL_INCASSI_ANNOPRE = 17;
  private static int PFL_INCASSI_NUMEROPRE = 18;
  private static int PFL_INCASSI_UTENTEINSERI = 19;
  private static int PFL_INCASSI_DATAINSERIME = 20;
  private static int PFL_INCASSI_UTENTULTIAGG = 21;
  private static int PFL_INCASSI_DATAULTIMAGG = 22;
  private static int PFL_INCASSI_PROGRESSIVO = 23;

  private static int PPQRY_INCASSI = 0;

  private static int PPQRY_DEBITORE = 1;
  private static int PPQRY_QUIETANZA = 2;
  private static int PPQRY_DOCUMENTO = 3;
  private static int PPQRY_ORD = 4;


  IDPanel PAN_INCASSI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI616(IMDB);
    //
    //
    Init_PQRY_PARAMETRI615(IMDB);
    Init_PQRY_PARAMETRI615_RS(IMDB);
    Init_PQRY_INCASSI(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI616(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef5.TBL_PARAMETRI616, 3);
    IMDB.set_TblCode(IMDBDef5.TBL_PARAMETRI616, "TBL_PARAMETRI616");
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI616,IMDBDef5.FLD_PARAMETRI616_PARAIDFLUSBT, "PARAIDFLUSBT");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI616,IMDBDef5.FLD_PARAMETRI616_PARAIDFLUSBT,9,500,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI616,IMDBDef5.FLD_PARAMETRI616_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI616,IMDBDef5.FLD_PARAMETRI616_PARAMDATADAL,6,10,0);
    IMDB.set_FldCode(IMDBDef5.TBL_PARAMETRI616,IMDBDef5.FLD_PARAMETRI616_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef5.TBL_PARAMETRI616,IMDBDef5.FLD_PARAMETRI616_PARAMDATAAL,6,10,0);
    IMDB.TblAddNew(IMDBDef5.TBL_PARAMETRI616, 0);
  }

  private static void Init_PQRY_PARAMETRI615(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI615, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI615, "PQRY_PARAMETRI615");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI615,IMDBDef15.PQSL_PARAMETRI615_PARAIDFLUSBT, "PARAIDFLUSBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI615,IMDBDef15.PQSL_PARAMETRI615_PARAIDFLUSBT,9,500,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI615,IMDBDef15.PQSL_PARAMETRI615_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI615,IMDBDef15.PQSL_PARAMETRI615_PARAMDATADAL,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI615,IMDBDef15.PQSL_PARAMETRI615_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI615,IMDBDef15.PQSL_PARAMETRI615_PARAMDATAAL,6,10,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI615, 0);
  }

  private static void Init_PQRY_PARAMETRI615_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PARAMETRI615_RS, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PARAMETRI615_RS, "PQRY_PARAMETRI615_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI615_RS,IMDBDef15.PQSL_PARAMETRI615_PARAIDFLUSBT, "PARAIDFLUSBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI615_RS,IMDBDef15.PQSL_PARAMETRI615_PARAIDFLUSBT,9,500,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI615_RS,IMDBDef15.PQSL_PARAMETRI615_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI615_RS,IMDBDef15.PQSL_PARAMETRI615_PARAMDATADAL,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PARAMETRI615_RS,IMDBDef15.PQSL_PARAMETRI615_PARAMDATAAL, "PARAMDATAAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PARAMETRI615_RS,IMDBDef15.PQSL_PARAMETRI615_PARAMDATAAL,6,10,0);
  }

  private static void Init_PQRY_INCASSI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_INCASSI, 23);
    IMDB.set_TblCode(IMDBDef15.PQRY_INCASSI, "PQRY_INCASSI");
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_ANNO_ORD, "ANNO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_ANNO_ORD,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_NUMERO_ORD, "NUMERO_ORD");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_NUMERO_ORD,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_ANNO_PRE, "ANNO_PRE");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_ANNO_PRE,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_NUMERO_PRE, "NUMERO_PRE");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_NUMERO_PRE,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_INC, "DATA_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_INC,1,7,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_NUMERO_INC, "NUMERO_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_NUMERO_INC,5,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_CCP, "DATA_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_CCP,1,7,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_ESTRATTO_CCP, "DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_ESTRATTO_CCP,1,7,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_D_DATA_INC, "D_DATA_INC");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_D_DATA_INC,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_D_DATA_CCP, "D_DATA_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_D_DATA_CCP,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_D_DATA_ESTRATTO_CCP, "D_DATA_ESTRATTO_CCP");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_D_DATA_ESTRATTO_CCP,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_UTENTE_INSERIMENTO, "UTENTE_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_UTENTE_INSERIMENTO,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_INSERIMENTO, "DATA_INSERIMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_INSERIMENTO,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_UTENTE_ULTIMO_AGG, "UTENTE_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_UTENTE_ULTIMO_AGG,5,8,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_ULTIMO_AGG, "DATA_ULTIMO_AGG");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_DATA_ULTIMO_AGG,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIDFLUSBT, "INCAIDFLUSBT");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIDFLUSBT,5,500,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCADATAVALU, "INCADATAVALU");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCADATAVALU,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCCODRIFOPE, "INCCODRIFOPE");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCCODRIFOPE,5,50,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIMPOBOLL, "INCAIMPOBOLL");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIMPOBOLL,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIMPOSPES, "INCAIMPOSPES");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIMPOSPES,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIMPOCOMM, "INCAIMPOCOMM");
    IMDB.SetFldParams(IMDBDef15.PQRY_INCASSI,IMDBDef15.PQSL_INCASSI_INCAIMPOCOMM,3,14,2);
    IMDB.TblAddNew(IMDBDef15.PQRY_INCASSI, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public IncassiPerFlusso(MyWebEntryPoint w, IMDBObj imdb)
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
  public IncassiPerFlusso()
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
    FormIdx = MyGlb.FRM_INCASPERFLUS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "D034CCC3-3B31-4C4A-A1BE-5B32426A82B9";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1176;
    DesignHeight = 442;
    set_Caption(new IDVariant("Incassi Per Flusso"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1176;
    Frames[1].Height = 416;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.144231;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1176;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Parametri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PARAMETRI = new IDPanel(w, this, 2, "PAN_PARAMETRI");
    Frames[2].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.Lockable = false;
    PAN_PARAMETRI.iLocked = false;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1176-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "30959F6D-6186-441E-A0E3-C7F5C2C86A8B");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 528, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1176;
    Frames[3].Height = 356;
    Frames[3].Caption = "Incassi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 356;
    PAN_INCASSI = new IDPanel(w, this, 3, "PAN_INCASSI");
    Frames[3].Content = PAN_INCASSI;
    PAN_INCASSI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_INCASSI.VS = MainFrm.VisualStyleList;
    PAN_INCASSI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1176-MyGlb.PAN_OFFS_X, 356-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A020EDFB-30A3-4715-ADF9-1474CD3D459F");
    PAN_INCASSI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 12, 1788, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_STRETCH);
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_INCASSI.InitStatus = 2;
    PAN_INCASSI_Init();
    PAN_INCASSI_InitFields();
    PAN_INCASSI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef5.TBL_PARAMETRI616, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        INCASPERFLUS_PARAMETRI615();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
      PAN_INCASSI.UpdatePanel(MainFrm);
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
    return (obj instanceof IncassiPerFlusso);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? IncassiPerFlusso.class.getName() : (Glb.ClassWithPackage(IncassiPerFlusso.class) ? IncassiPerFlusso.class.getName().substring(IncassiPerFlusso.class.getPackage().getName().length() + 1) : IncassiPerFlusso.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_IDFLUSSOBT1)), true) && FieldWasModified.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI615, IMDBDef15.PQSL_PARAMETRI615_PARAIDFLUSBT, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI615, IMDBDef15.PQSL_PARAMETRI615_PARAMDATADAL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PARAMETRI615, IMDBDef15.PQSL_PARAMETRI615_PARAMDATAAL, 0)))
        {
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI615, IMDBDef15.PQSL_PARAMETRI615_PARAMDATADAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
          IMDB.set_Value(IMDBDef15.PQRY_PARAMETRI615, IMDBDef15.PQSL_PARAMETRI615_PARAMDATAAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassiPerFlusso", "ParametriOnUpdatingRow", _e);
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
    IDVariant v_ORDINATIVO = new IDVariant(0,IDVariant.STRING);
    IDVariant v_IMPORTO = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ORDINATIVO = (new IDVariant("Ordinativo ", IDVariant.STRING));
      v_IMPORTO = (new IDVariant("Importo: ", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      CloseOnSelection = (new IDVariant(0)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassiPerFlusso", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_NUOVIINCASSI)), true) && Result.booleanValue())
      {
        PAN_INCASSI.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassiPerFlusso", "EndModalEvent", _e);
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
      UNLOADEVENT_PARAMEDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassiPerFlusso", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI616, IMDBDef5.FLD_PARAMETRI616_PARAIDFLUSBT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI616, IMDBDef5.FLD_PARAMETRI616_PARAMDATADAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef5.TBL_PARAMETRI616, IMDBDef5.FLD_PARAMETRI616_PARAMDATAAL, 0, new IDVariant());
  }

  // **********************************************************************
  // Incassi On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_INCASSI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_INCASSI);
      // 
      // Incassi On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_INCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_INCASSI_DEBITORE,(new IDVariant(PAN_INCASSI.FieldText(PFL_INCASSI_DEBITORE))).stringValue()); 
      PAN_INCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_INCASSI_QUIETANZA,(new IDVariant(PAN_INCASSI.FieldText(PFL_INCASSI_QUIETANZA))).stringValue()); 
      PAN_INCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_INCASSI_FATNUMERODOC,(new IDVariant(PAN_INCASSI.FieldText(PFL_INCASSI_FATNUMERODOC))).stringValue()); 
      PAN_INCASSI.set_ToolTip(Glb.OBJ_FIELD,PFL_INCASSI_IDFLUSSOBT,(new IDVariant(PAN_INCASSI.FieldText(PFL_INCASSI_IDFLUSSOBT))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("IncassiPerFlusso", "IncassiOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void INCASPERFLUS_PARAMETRI615() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PARAMETRI615_RS);
    IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI616, 0);
    Loop1: while (!IMDB.Eof(IMDBDef5.TBL_PARAMETRI616, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PARAMETRI615_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PARAMETRI615_RS, 0, IMDBDef5.TBL_PARAMETRI616, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI615_RS, 0, 0, IMDBDef5.TBL_PARAMETRI616, IMDBDef5.FLD_PARAMETRI616_PARAIDFLUSBT, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI615_RS, 1, 0, IMDBDef5.TBL_PARAMETRI616, IMDBDef5.FLD_PARAMETRI616_PARAMDATADAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PARAMETRI615_RS, 2, 0, IMDBDef5.TBL_PARAMETRI616, IMDBDef5.FLD_PARAMETRI616_PARAMDATAAL, 0);
      IMDB.TblMoveNext(IMDBDef5.TBL_PARAMETRI616, 0);
      if (IMDB.Eof(IMDBDef5.TBL_PARAMETRI616, 0))
      {
        IMDB.TblMoveFirst(IMDBDef5.TBL_PARAMETRI616, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PARAMETRI615_RS, 0);
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
  private void PAN_PARAMETRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMETRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARAMETRI);
    // Stub
  }

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARAMETRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARAMETRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMETRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMETRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_INCASSI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_INCASSI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_INCASSI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_INCASSI, Cancel);
    // Stub
  }

  private void PAN_INCASSI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_INCASSI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_INCASSI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_INCASSI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, "A46210EE-0A5D-45DD-AACF-81878C9B683C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, "Data Incasso");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, MyGlb.PANEL_LIST, 0, -9999, 60, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, MyGlb.PANEL_FORM, 456, 3, 304, 49, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, 0, 74);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAINCASSO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 3);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, "CD62427B-6BF0-4D8C-A6C2-D01EEE3CD555");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, "Id Flusso BT");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, "7EF68B1F-1116-4183-A5B2-5BEDBDBE126C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, "01D31DB4-A986-4E5F-ADAB-236C0D97B564");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_LIST, 0, 36, 408, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_FORM, 8, 28, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_IDFLUSSOBT1, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_IDFLUSSOBT1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_IDFLUSSOBT1, PPQRY_PARAMETRI615, "A.PARAIDFLUSBT", "PARAIDFLUSBT", 9, 500, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, 460, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATADAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATADAL, -1, GRP_PARAMETRI_DATAINCASSO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATADAL, PPQRY_PARAMETRI615, "A.PARAMDATADAL", "PARAMDATADAL", 6, 10, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, 640, 28, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAAL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAAL, -1, GRP_PARAMETRI_DATAINCASSO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAAL, PPQRY_PARAMETRI615, "A.PARAMDATAAL", "PARAMDATAAL", 6, 10, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI615", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Param");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI615, IMDBDef15.PQRY_PARAMETRI615_RS, IMDBDef5.TBL_PARAMETRI616);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_IDFLUSSOBT1, IMDBDef5.FLD_PARAMETRI616_PARAIDFLUSBT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATADAL, IMDBDef5.FLD_PARAMETRI616_PARAMDATADAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAAL, IMDBDef5.FLD_PARAMETRI616_PARAMDATAAL);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI616");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMETRI.Status() == 2)
    {
      int oldListQBE = PAN_PARAMETRI.iUseListQBE;
      PAN_PARAMETRI.iUseListQBE = 0;
      PAN_PARAMETRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMETRI.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMETRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_INCASSI_Init()
  {

    PAN_INCASSI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_INCASSI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, "B4402090-97F9-400D-8D00-BEA294A96825");
    PAN_INCASSI.set_Header(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, "Ordinativo");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, MyGlb.VIS_GROUPSTYLE);
    PAN_INCASSI.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, MyGlb.PANEL_LIST, 0, -9999, 104, 16, 0, 0);
    PAN_INCASSI.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, MyGlb.PANEL_FORM, 0, 363, 136, 73, 0, 0);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, 0, 59);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, 1, 13);
    PAN_INCASSI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, 0, 4);
    PAN_INCASSI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, 1, 4);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_GROUP, GRP_INCASSI_ORDINATIVO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, "47953B36-ABCC-491D-A288-532BA17ACED7");
    PAN_INCASSI.set_Header(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, "Documento");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, MyGlb.VIS_GROUPSTYLE);
    PAN_INCASSI.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, MyGlb.PANEL_LIST, 652, -9999, 176, 16, 0, 0);
    PAN_INCASSI.SetRect(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, MyGlb.PANEL_FORM, 0, 315, 220, 73, 0, 0);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, 0, 65);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, 1, 13);
    PAN_INCASSI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, 0, 4);
    PAN_INCASSI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, 1, 4);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_GROUP, GRP_INCASSI_DOCUMENTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_INCASSI.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, "F2290D33-4F8A-4518-ADE2-B8CF44E0CAC7");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, "Numero");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, "336F1E6D-D56C-43D0-AAB6-DF9D667D98D9");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, "Anno");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, "4E3B483A-DB7A-4FFC-9535-08495A544B88");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, "Debitore");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.VIS_VISULOOUPCF4);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, "07E110F5-875A-44A7-B6DC-2C1B5D344FC7");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, "Importo Ordinativo");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, "091E3745-5172-475F-A218-6417C93E4D9A");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, "Incasso");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, "6F021BA0-820D-4181-9D1E-CD4584AD8B58");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, "Data");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, "9E31CB47-D8CB-4130-B1AA-8038BCCC68E3");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, "Numero");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, "0EDF2248-AEA0-483C-A1D4-A009E251F3A9");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, "Numero");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, "97E4C0F5-D6AE-4391-971A-7C1050F70E15");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, "Data");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, "B1828941-D6C5-46D2-8140-CD80A8C4F238");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, "Quietanza");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, "7A3DC7B5-8ADC-4B27-80DC-ABDC00160906");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, "Data Valuta");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, "397639ED-BEAF-4ED4-ACC9-878E63DAD767");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, "Codice Rif. Operazione");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, "A7273B2B-A485-4C9E-B3B5-8D63373286F4");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, "Importo Bollo");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.VIS_NORFIECF4IMP);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, "E649E076-3315-480C-AF4E-B28514ECC58B");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, "Importo Spese");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.VIS_NORFIECF4IMP);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, "222789BF-81F5-4847-B871-FABD9B6D9886");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, "Importo Commissioni");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.VIS_NORFIECF4IMP);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, "01C3BADF-5932-446C-AF74-2CED247C278D");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, "Id Flusso BT");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.VIS_NORMALFIELDS);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, "8044B9DB-DE18-425B-8A9C-5ABC18DE00AA");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, MyGlb.VIS_CAMPTOTADISA);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_INCASSI.SetSumField(PFL_INCASSI_SOMMADIINCAS, PFL_INCASSI_INCASSO);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, "16156FF1-E653-44A1-865F-3C843AF574BE");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, "ANNO PRE");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.VIS_NONNULLAFIEL);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, 0, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, "83ABAEDB-9EF8-4DBC-98B4-AE3617A7EEBE");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, "NUMERO PRE");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.VIS_NONNULLAFIEL);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, 0, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, "713A8FF4-370E-460C-A69C-87F658814E6E");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, "UTENTE INSERIMENTO");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, "38245048-3C5B-4D0B-8874-DAE1036D0594");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, "DATA INSERIMENTO");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, "16B1A30D-78BF-45C7-9991-9C6EA1646513");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, "UTENTE ULTIMO AGG");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, "1A24FBB5-95CA-42B3-8359-F23F4F406771");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, "DATA ULTIMO AGG");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.VIS_NORMFIELPADR);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_INCASSI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, "38CA8143-374B-4E1C-9CE9-C1F2F0BAB41E");
    PAN_INCASSI.set_Header(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, "PROGRESSIVO");
    PAN_INCASSI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, "");
    PAN_INCASSI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_INCASSI.SetFlags(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
  }

  private void PAN_INCASSI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_LIST, 0, 48, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_LIST, 84);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_LIST, "Numero");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_FORM, 4, 412, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_FORM, 84);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROORD, MyGlb.PANEL_FORM, "Numero");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_NUMEROORD, -1, GRP_INCASSI_ORDINATIVO);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_NUMEROORD, PPQRY_INCASSI, "A.NUMERO_ORD", "NUMERO_ORD", 1, 5, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_LIST, 56, 48, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_LIST, 68);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_LIST, "Anno");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_FORM, 4, 388, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_FORM, 68);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOORD, MyGlb.PANEL_FORM, "Anno");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_ANNOORD, -1, GRP_INCASSI_ORDINATIVO);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_ANNOORD, PPQRY_INCASSI, "A.ANNO_ORD", "ANNO_ORD", 1, 4, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, 104, 48, 164, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, 124);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, 4, 292, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, 124);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DEBITORE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DEBITORE, PPQRY_DEBITORE, "B.RAGIONE_SOCIALE_ESTESA", "BENRAGSOESES", 5, 60, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_LIST, 268, 48, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_LIST, 88);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_LIST, "Importo Ordinativo");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_FORM, 4, 436, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_FORM, 88);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ORDIMPORTO, MyGlb.PANEL_FORM, "Imp. Ordin.");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_ORDIMPORTO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_ORDIMPORTO, PPQRY_ORD, "A.IMPORTO", "ORDIMPORTO", 3, 14, 2, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, 380, 48, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, 56);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_LIST, "Incasso");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, 4, 148, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, 128);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_INCASSO, MyGlb.PANEL_FORM, "Incasso");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_INCASSO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_INCASSO, PPQRY_INCASSI, "A.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, 492, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, 68);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, 4, 244, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, 128);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DATA, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DATA, PPQRY_INCASSI, "A.D_DATA_INC", "D_DATA_INC", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, 572, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, 72);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_LIST, "Numero");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, 4, 172, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, 128);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMERO, MyGlb.PANEL_FORM, "Numero");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_NUMERO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_NUMERO, PPQRY_INCASSI, "A.NUMERO_INC", "NUMERO_INC", 5, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, 652, 48, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_LIST, "Numero");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, 4, 340, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATNUMERODOC, MyGlb.PANEL_FORM, "Numero");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_FATNUMERODOC, -1, GRP_INCASSI_DOCUMENTO);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_FATNUMERODOC, PPQRY_DOCUMENTO, "B.NUMERO_DOC", "FATNUMERODOC", 5, 20, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, 748, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, 92);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_LIST, "Data");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, 4, 364, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, 92);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_FATDDATADOC, MyGlb.PANEL_FORM, "Data");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_FATDDATADOC, -1, GRP_INCASSI_DOCUMENTO);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_FATDDATADOC, PPQRY_DOCUMENTO, "B.D_DATA_DOC", "FATDDATADOC", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, 828, 48, 176, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_LIST, "Quietanza");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, 4, 316, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_QUIETANZA, MyGlb.PANEL_FORM, "Quietanza");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_QUIETANZA, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_QUIETANZA, PPQRY_QUIETANZA, "C.DESCRIZIONE", "QTNT02DESCRI", 5, 40, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_LIST, 1004, 48, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_LIST, 88);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_LIST, "Data Valuta");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_FORM, 4, 484, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_FORM, 88);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAVALUTA, MyGlb.PANEL_FORM, "Data Valuta");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DATAVALUTA, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DATAVALUTA, PPQRY_INCASSI, "A.DATA_VALUTA", "INCADATAVALU", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_LIST, 1084, 48, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_LIST, 144);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_LIST, "Codice Rif. Operazione");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_FORM, 4, 508, 408, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_FORM, 144);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_CODICRIFOPER, MyGlb.PANEL_FORM, "Codice Rif. Operazione");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_CODICRIFOPER, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_CODICRIFOPER, PPQRY_INCASSI, "A.CODICE_RIF_OPERAZIONE", "INCCODRIFOPE", 5, 50, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_LIST, 1284, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_LIST, "Importo Bollo");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_FORM, 4, 532, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOBOLLO, MyGlb.PANEL_FORM, "Importo Bollo");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_IMPORTOBOLLO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_IMPORTOBOLLO, PPQRY_INCASSI, "A.IMPORTO_BOLLO", "INCAIMPOBOLL", 3, 14, 2, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_LIST, 1404, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_LIST, "Importo Spese");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_FORM, 4, 556, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTOSPESE, MyGlb.PANEL_FORM, "Importo Spese");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_IMPORTOSPESE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_IMPORTOSPESE, PPQRY_INCASSI, "A.IMPORTO_SPESE", "INCAIMPOSPES", 3, 14, 2, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_LIST, 1524, 48, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_LIST, 144);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_LIST, "Importo Commissioni");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_FORM, 4, 580, 228, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_FORM, 144);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IMPORTCOMMIS, MyGlb.PANEL_FORM, "Importo Commissioni");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_IMPORTCOMMIS, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_IMPORTCOMMIS, PPQRY_INCASSI, "A.IMPORTO_COMMISSIONI", "INCAIMPOCOMM", 3, 14, 2, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_LIST, 1644, 48, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_LIST, 84);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_LIST, "Id Flusso BT");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_FORM, 4, 460, 348, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_FORM, 84);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_IDFLUSSOBT, MyGlb.PANEL_FORM, "Id Flusso BT");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_IDFLUSSOBT, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_IDFLUSSOBT, PPQRY_INCASSI, "A.ID_FLUSSO_BT", "INCAIDFLUSBT", 5, 500, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, MyGlb.PANEL_LIST, 380, 252, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, MyGlb.PANEL_LIST, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, MyGlb.PANEL_FORM, 164, 304, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, MyGlb.PANEL_FORM, 0);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_SOMMADIINCAS, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_SOMMADIINCAS, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_SOMMADIINCAS, -1, "", "SOMMADIINCAS", 0, 0, 0, -13997);
    PAN_INCASSI.set_Mask(PFL_INCASSI_SOMMADIINCAS, "#,###,###,##0.00");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, 60);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_LIST, "ANNO PRE");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, 4, 388, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, 60);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_ANNOPRE, MyGlb.PANEL_FORM, "ANNO PRE");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_ANNOPRE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_ANNOPRE, PPQRY_INCASSI, "A.ANNO_PRE", "ANNO_PRE", 1, 4, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, 76);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_LIST, "NUMERO PRE");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, 4, 388, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, 76);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_NUMEROPRE, MyGlb.PANEL_FORM, "NUM. PRE");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_NUMEROPRE, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_NUMEROPRE, PPQRY_INCASSI, "A.NUMERO_PRE", "NUMERO_PRE", 1, 5, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, 120);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_LIST, "UTENTE INSERIMENTO");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, 4, 388, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, 120);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTEINSERI, MyGlb.PANEL_FORM, "UTEN. INSERIMENTO");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_UTENTEINSERI, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_UTENTEINSERI, PPQRY_INCASSI, "A.UTENTE_INSERIMENTO", "UTENTE_INSERIMENTO", 5, 8, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, 0, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, 108);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_LIST, "DATA INSERIMENTO");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, 4, 388, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, 108);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAINSERIME, MyGlb.PANEL_FORM, "DT. INSERIMENTO");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DATAINSERIME, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DATAINSERIME, PPQRY_INCASSI, "A.DATA_INSERIMENTO", "DATA_INSERIMENTO", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, 112);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_LIST, "UTENTE ULTIMO AGG");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, 4, 388, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, 112);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_UTENTULTIAGG, MyGlb.PANEL_FORM, "UTEN. ULTIMO AGG");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_UTENTULTIAGG, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_UTENTULTIAGG, PPQRY_INCASSI, "A.UTENTE_ULTIMO_AGG", "UTENTE_ULTIMO_AGG", 5, 8, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_LIST, "DATA ULTIMO AGG");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, 4, 388, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, 100);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_DATAULTIMAGG, MyGlb.PANEL_FORM, "DT. ULTIMO AGG");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_DATAULTIMAGG, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_DATAULTIMAGG, PPQRY_INCASSI, "A.DATA_ULTIMO_AGG", "DATA_ULTIMO_AGG", 6, 10, 0, -13997);
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_INCASSI.SetRect(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 388, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_INCASSI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_INCASSI.SetNumRow(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_INCASSI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_INCASSI_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_INCASSI.SetFieldPage(PFL_INCASSI_PROGRESSIVO, -1, -1);
    PAN_INCASSI.SetFieldPanel(PFL_INCASSI_PROGRESSIVO, PPQRY_INCASSI, "A.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
  }

  private void PAN_INCASSI_InitQueries()
  {
    StringBuffer SQL;

    PAN_INCASSI.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as BENRAGSOESES ");
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  BEN B ");
    SQL.append("where (A.ANNO_PRE = ~~ANNO_PRE~~) ");
    SQL.append("and   (A.NUMERO_PRE = ~~NUMERO_PRE~~) ");
    SQL.append("and   (B.CODICE(+) = A.DEBITORE) ");
    PAN_INCASSI.SetQuery(PPQRY_DEBITORE, 0, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_DEBITORE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(PPQRY_DEBITORE, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  C.DESCRIZIONE as QTNT02DESCRI ");
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  QTN B, ");
    SQL.append("  T02 C ");
    SQL.append("where (A.ANNO_PRE = ~~ANNO_PRE~~) ");
    SQL.append("and   (A.NUMERO_PRE = ~~NUMERO_PRE~~) ");
    SQL.append("and   (B.CODICE(+) = A.DEBITORE) ");
    SQL.append("and   (B.NUM_QUIETANZA(+) = A.NUM_QUIETANZA) ");
    SQL.append("and   (C.CODICE(+) = B.TIPO_QUIETANZA) ");
    PAN_INCASSI.SetQuery(PPQRY_QUIETANZA, 0, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_QUIETANZA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(PPQRY_QUIETANZA, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.NUMERO_DOC as FATNUMERODOC, ");
    SQL.append("  B.D_DATA_DOC as FATDDATADOC ");
    SQL.append("from ");
    SQL.append("  PRE A, ");
    SQL.append("  FAT B ");
    SQL.append("where (A.ANNO_PRE = ~~ANNO_PRE~~) ");
    SQL.append("and   (A.NUMERO_PRE = ~~NUMERO_PRE~~) ");
    SQL.append("and   (B.ANNO_PROG(+) = A.FAT_ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG(+) = A.FAT_NUMERO_PROG) ");
    PAN_INCASSI.SetQuery(PPQRY_DOCUMENTO, 0, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_DOCUMENTO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(PPQRY_DOCUMENTO, "PRE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.IMPORTO as ORDIMPORTO ");
    SQL.append("from ");
    SQL.append("  ORD A ");
    SQL.append("where (A.ANNO_ORD = ~~ANNO_ORD~~) ");
    SQL.append("and   (A.NUMERO_ORD = ~~NUMERO_ORD~~) ");
    PAN_INCASSI.SetQuery(PPQRY_ORD, 0, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_ORD, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(PPQRY_ORD, "ORD");
    PAN_INCASSI.SetIMDB(IMDB, "PQRY_INCASSI", true);
    PAN_INCASSI.set_SetString(MyGlb.MASTER_ROWNAME, "INCASSI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  A.ANNO_ORD as ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD as NUMERO_ORD, ");
    SQL.append("  A.ANNO_PRE as ANNO_PRE, ");
    SQL.append("  A.NUMERO_PRE as NUMERO_PRE, ");
    SQL.append("  A.DATA_INC as DATA_INC, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  A.NUMERO_INC as NUMERO_INC, ");
    SQL.append("  A.DATA_CCP as DATA_CCP, ");
    SQL.append("  A.DATA_ESTRATTO_CCP as DATA_ESTRATTO_CCP, ");
    SQL.append("  A.D_DATA_INC as D_DATA_INC, ");
    SQL.append("  A.D_DATA_CCP as D_DATA_CCP, ");
    SQL.append("  A.D_DATA_ESTRATTO_CCP as D_DATA_ESTRATTO_CCP, ");
    SQL.append("  A.UTENTE_INSERIMENTO as UTENTE_INSERIMENTO, ");
    SQL.append("  A.DATA_INSERIMENTO as DATA_INSERIMENTO, ");
    SQL.append("  A.UTENTE_ULTIMO_AGG as UTENTE_ULTIMO_AGG, ");
    SQL.append("  A.DATA_ULTIMO_AGG as DATA_ULTIMO_AGG, ");
    SQL.append("  A.ID_FLUSSO_BT as INCAIDFLUSBT, ");
    SQL.append("  A.DATA_VALUTA as INCADATAVALU, ");
    SQL.append("  A.CODICE_RIF_OPERAZIONE as INCCODRIFOPE, ");
    SQL.append("  A.IMPORTO_BOLLO as INCAIMPOBOLL, ");
    SQL.append("  A.IMPORTO_SPESE as INCAIMPOSPES, ");
    SQL.append("  A.IMPORTO_COMMISSIONI as INCAIMPOCOMM ");
    PAN_INCASSI.SetQuery(PPQRY_INCASSI, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  INCASSI A ");
    PAN_INCASSI.SetQuery(PPQRY_INCASSI, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (NVL(A.ID_FLUSSO_BT, '-1') = NVL(~~PQRY_PARAMETRI615.PARAIDFLUSBT~~, NVL(A.ID_FLUSSO_BT, '-1'))) ");
    SQL.append("and   ((A.D_DATA_INC BETWEEN DECODE(~~PQRY_PARAMETRI615.PARAMDATADAL~~, to_date(NULL), TO_DATE('1900-01-01','YYYY-MM-DD'), ~~PQRY_PARAMETRI615.PARAMDATADAL~~) AND DECODE(~~PQRY_PARAMETRI615.PARAMDATAAL~~, to_date(NULL), TO_DATE('2999-12-31','YYYY-MM-DD'), ~~PQRY_PARAMETRI615.PARAMDATAAL~~))) ");
    PAN_INCASSI.SetQuery(PPQRY_INCASSI, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INCASSI.SetQuery(PPQRY_INCASSI, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_INCASSI.SetQuery(PPQRY_INCASSI, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.ANNO_ORD, ");
    SQL.append("  A.NUMERO_ORD ");
    PAN_INCASSI.SetQuery(PPQRY_INCASSI, 5, SQL, -1, "");
    PAN_INCASSI.SetQueryDB(PPQRY_INCASSI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_INCASSI.SetMasterTable(0, "INCASSI");
    PAN_INCASSI.AddToSortList(PFL_INCASSI_ANNOORD, true);
    PAN_INCASSI.AddToSortList(PFL_INCASSI_NUMEROORD, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_INCASSI.Status() == 2)
    {
      int oldListQBE = PAN_INCASSI.iUseListQBE;
      PAN_INCASSI.iUseListQBE = 0;
      PAN_INCASSI.PanelCommand(Glb.PCM_SEARCH);
      PAN_INCASSI.PanelCommand(Glb.PCM_FIND);
      PAN_INCASSI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_INCASSI) PAN_INCASSI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
