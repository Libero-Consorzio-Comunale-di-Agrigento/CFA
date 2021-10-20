// **********************************************
// Elenco File Inviati
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoFileInviati extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_FILTRI_ESERCIZIO1 = 0;
  private static int PFL_FILTRI_ENTRATASPESA = 1;
  private static int PFL_FILTRI_PERIODO1 = 2;
  private static int PFL_FILTRI_FILEELIMINAT = 3;

  private static int PPQRY_FILTRI30 = 0;

  private static int PPQRY_DUAL1 = 1;


  IDPanel PAN_FILTRI;
  private static int PFL_ELENFILEINVI_IDCFATFILXML = 0;
  private static int PFL_ELENFILEINVI_PERIODO = 1;
  private static int PFL_ELENFILEINVI_NOMEFILEXML = 2;
  private static int PFL_ELENFILEINVI_SCARIFILEXML = 3;
  private static int PFL_ELENFILEINVI_FILEXML = 4;
  private static int PFL_ELENFILEINVI_NOMEFILEZIP = 5;
  private static int PFL_ELENFILEINVI_FILEANNULLI = 6;
  private static int PFL_ELENFILEINVI_SCARIFILEZIP = 7;
  private static int PFL_ELENFILEINVI_ELIMINATO = 8;
  private static int PFL_ELENFILEINVI_STATOFILEXML = 9;
  private static int PFL_ELENFILEINVI_IDFILE = 10;
  private static int PFL_ELENFILEINVI_VISUALIESITO = 11;
  private static int PFL_ELENFILEINVI_DICHIARANTE = 12;
  private static int PFL_ELENFILEINVI_DESCRIZIONE = 13;
  private static int PFL_ELENFILEINVI_VISUALDESCRI = 14;
  private static int PFL_ELENFILEINVI_DATACREAZION = 15;
  private static int PFL_ELENFILEINVI_UTENTECREAZI = 16;
  private static int PFL_ELENFILEINVI_ES = 17;
  private static int PFL_ELENFILEINVI_DATARIF = 18;
  private static int PFL_ELENFILEINVI_ESERCIZIO = 19;

  private static int PPQRY_CFATFILEXML = 0;

  private static int PPQRY_DUAL = 1;


  IDPanel PAN_ELENFILEINVI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_FILTRI31(IMDB);
    //
    //
    Init_PQRY_FILTRI30(IMDB);
    Init_PQRY_FILTRI30_RS(IMDB);
    Init_PQRY_CFATFILEXML(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_FILTRI31(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_FILTRI31, 4);
    IMDB.set_TblCode(IMDBDef2.TBL_FILTRI31, "TBL_FILTRI31");
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMOGGFILELI, "NOMOGGFILELI");
    IMDB.SetFldParams(IMDBDef2.TBL_FILTRI31,IMDBDef2.FLD_FILTRI31_NOMOGGFILELI,5,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_FILTRI31, 0);
  }

  private static void Init_PQRY_FILTRI30(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRI30, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRI30, "PQRY_FILTRI30");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMOGGFILELI, "NOMOGGFILELI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30,IMDBDef10.PQSL_FILTRI30_NOMOGGFILELI,5,2,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_FILTRI30, 0);
  }

  private static void Init_PQRY_FILTRI30_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_FILTRI30_RS, 4);
    IMDB.set_TblCode(IMDBDef10.PQRY_FILTRI30_RS, "PQRY_FILTRI30_RS");
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, "NOMEOGGEESER");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMOGGENTSPE, "NOMOGGENTSPE");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMOGGENTSPE,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMEOGGEPERI, "NOMEOGGEPERI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMEOGGEPERI,1,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMOGGFILELI, "NOMOGGFILELI");
    IMDB.SetFldParams(IMDBDef10.PQRY_FILTRI30_RS,IMDBDef10.PQSL_FILTRI30_NOMOGGFILELI,5,2,0);
  }

  private static void Init_PQRY_CFATFILEXML(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef10.PQRY_CFATFILEXML, 20);
    IMDB.set_TblCode(IMDBDef10.PQRY_CFATFILEXML, "PQRY_CFATFILEXML");
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML, "ID_CFAT_FILE_XML");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML,3,10,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_PERIODO, "PERIODO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_PERIODO,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_XML, "NOME_FILE_XML");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_XML,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_SCARIFILEXML, "SCARIFILEXML");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_SCARIFILEXML,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_FILE_XML, "FILE_XML");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_FILE_XML,9,999999999,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_ZIP, "NOME_FILE_ZIP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_ZIP,5,300,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_SCARIFILEZIP, "SCARIFILEZIP");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_SCARIFILEZIP,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_ELIMINATO, "ELIMINATO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_ELIMINATO,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECORDDICHIA, "RECORDDICHIA");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECORDDICHIA,5,117,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_FILE_ANNULLI, "FILE_ANNULLI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_FILE_ANNULLI,5,2,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_ID_FILE, "ID_FILE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_ID_FILE,5,18,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_VISUALIESITO, "VISUALIESITO");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_VISUALIESITO,5,99,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_DATA_CREAZIONE, "DATA_CREAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_DATA_CREAZIONE,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_UTENTE_CREAZIONE, "UTENTE_CREAZIONE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_UTENTE_CREAZIONE,5,8,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_STATO_FILE_XML, "STATO_FILE_XML");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_STATO_FILE_XML,5,30,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECCFAFIXME1, "RECCFAFIXME1");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECCFAFIXME1,5,1,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECFFIXMDARI, "RECFFIXMDARI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECFFIXMDARI,6,19,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECCFAFIXMES, "RECCFAFIXMES");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECCFAFIXMES,1,4,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECCFAFIXMDE, "RECCFAFIXMDE");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_RECCFAFIXMDE,5,2000,0);
    IMDB.set_FldCode(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_VISUALDESCRI, "VISUALDESCRI");
    IMDB.SetFldParams(IMDBDef10.PQRY_CFATFILEXML,IMDBDef10.PQSL_CFATFILEXML_VISUALDESCRI,5,99,0);
    IMDB.TblAddNew(IMDBDef10.PQRY_CFATFILEXML, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoFileInviati(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoFileInviati()
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
    FormIdx = MyGlb.FRM_ELENFILEINVI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "646B0E90-F65B-48DE-9C9E-D1474CAFCA87";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1268;
    DesignHeight = 406;
    set_Caption(new IDVariant("Elenco File Inviati"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1268;
    Frames[1].Height = 380;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.105263;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1268;
    Frames[2].Height = 40;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Filtri";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 40;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_FILTRI = new IDPanel(w, this, 2, "PAN_FILTRI");
    Frames[2].Content = PAN_FILTRI;
    PAN_FILTRI.Lockable = false;
    PAN_FILTRI.iLocked = false;
    PAN_FILTRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FILTRI.VS = MainFrm.VisualStyleList;
    PAN_FILTRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1268-MyGlb.PAN_OFFS_X, 40-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D39FED47-F011-4562-BFA4-539C4172129C");
    PAN_FILTRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 344, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FILTRI.InitStatus = 1;
    PAN_FILTRI_Init();
    PAN_FILTRI_InitFields();
    PAN_FILTRI_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1268;
    Frames[3].Height = 340;
    Frames[3].Caption = "Elenco File Inviati";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 340;
    PAN_ELENFILEINVI = new IDPanel(w, this, 3, "PAN_ELENFILEINVI");
    Frames[3].Content = PAN_ELENFILEINVI;
    PAN_ELENFILEINVI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ELENFILEINVI.VS = MainFrm.VisualStyleList;
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1268-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DB96834A-60E6-412C-994B-5B93C0040B4D");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1692, 256, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ELENFILEINVI.InitStatus = 2;
    PAN_ELENFILEINVI_Init();
    PAN_ELENFILEINVI_InitFields();
    PAN_ELENFILEINVI_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_DETTFATTINVI+BaseCmdLinIdx)
      {
        DettaglioFattureInviate();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELIMINA2+BaseCmdLinIdx)
      {
        Elimina();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_FUNZAGG24+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_POPUPFUNZAG2+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG24+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_NUOVOINVIO+BaseCmdLinIdx)
      {
        NuovoInvio();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_CREAFILEZIP+BaseCmdLinIdx)
      {
        CreaFileZIP();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELEFILZIPINV+BaseCmdLinIdx)
      {
        ElencoFileZIPInviati();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_IMPOFILEESIT+BaseCmdLinIdx)
      {
        ImportaFileEsito();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_ELENCOFATTUR+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_ELEFATCOMFAT, 0, this);
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
      if (IMDB.TblModified(IMDBDef2.TBL_FILTRI31, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENFILEINVI_FILTRI30();
      }
      PAN_FILTRI.UpdatePanel(MainFrm);
      PAN_ELENFILEINVI.UpdatePanel(MainFrm);
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
    return (obj instanceof ElencoFileInviati);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoFileInviati.class.getName() : (Glb.ClassWithPackage(ElencoFileInviati.class) ? ElencoFileInviati.class.getName().substring(ElencoFileInviati.class.getPackage().getName().length() + 1) : ElencoFileInviati.class.getName()));
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
      // 
      // parametri filtri iniziali
      // 
      LOAD_FILTRIDELETE();
      IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0, IDL.Year(IDL.Today()));
      IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMOGGENTSPE, 0, (new IDVariant("S")));
      IDVariant v_VDATAPERIOGG = null;
      v_VDATAPERIOGG = (new IDVariant());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  COMUNICAZIONE_FATTURE.GET_TRIMESTER_FROM_DATA_RIF(TRUNC( SYSDATE )," + IDL.CSql(MainFrm.PERINVCOMFAT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PERINVCOFAES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as CFGTFDRTCPIC ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VDATAPERIOGG = QV.Get("CFGTFDRTCPIC", IDVariant.INTEGER) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI, 0, new IDVariant(v_VDATAPERIOGG));
      creaAggiornaListaPeriodi();
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_FILTRI.SetFlags (Glb.OBJ_FIELD, PFL_FILTRI_PERIODO1, ((new IDVariant(0)).booleanValue())? Glb.FLD_ISOPT : 0, Glb.FLD_ISOPT); 
      PAN_ELENFILEINVI.set_EnableMultipleSel((new IDVariant(-1)).booleanValue());
      // PAN_ELENFILEINVI.set_ShowMultipleSel((new IDVariant(-1)).booleanValue());
      PAN_ELENFILEINVI.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "Load", _e);
    }
  }

  // **********************************************************************
  // Filtri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_FILTRIDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMOGGENTSPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMOGGFILELI, 0, new IDVariant());
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
      UNLOAD_FILTRIDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "Unload", _e);
    }
  }

  // **********************************************************************
  // Filtri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_FILTRIDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMOGGENTSPE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMOGGFILELI, 0, new IDVariant());
  }

  // **********************************************************************
  // crea Aggiorna Lista Periodi
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int creaAggiornaListaPeriodi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // crea Aggiorna Lista Periodi Body
      // Corpo Procedura
      // 
      PAN_FILTRI.ClearValueList(PFL_FILTRI_PERIODO1);
      if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)).equals((new IDVariant(2017)), true))
      {
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Dal 01/01/2017 Al 30/06/2017"));
        IDVariant v_S2 = new IDVariant(0,IDVariant.STRING);
        v_S2 = (new IDVariant("Dal 01/07/2017 Al 31/12/2017"));
        PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(1)), v_S1.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(2)), v_S2.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
      }
      else if (IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)).equals((new IDVariant(2018)), true))
      {
        if (MainFrm.PERINVCOMFAT.equals((new IDVariant("SEMESTRALE")), true))
        {
          IDVariant v_TS1 = null;
          v_TS1 = (new IDVariant("Dal 01/01/|1 Al 30/06/|1"));
          IDVariant v_TS2 = null;
          v_TS2 = (new IDVariant("Dal 01/07/|1 Al 31/12/|1"));
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(1)), IDL.FormatMessage(v_TS1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(2)), IDL.FormatMessage(v_TS2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          IDVariant v_T1 = new IDVariant(0,IDVariant.STRING);
          v_T1 = (new IDVariant("Dal 01/01/|1 Al 31/03/|1"));
          IDVariant v_T2 = new IDVariant(0,IDVariant.STRING);
          v_T2 = (new IDVariant("Dal 01/04/|1 Al 30/06/|1"));
          IDVariant v_T3 = new IDVariant(0,IDVariant.STRING);
          v_T3 = (new IDVariant("Dal 01/07/|1 Al 30/09/|1"));
          IDVariant v_T4 = new IDVariant(0,IDVariant.STRING);
          v_T4 = (new IDVariant("Dal 01/10/|1 Al 31/12/|1"));
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(1)), IDL.FormatMessage(v_T1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(2)), IDL.FormatMessage(v_T2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(3)), IDL.FormatMessage(v_T3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(4)), IDL.FormatMessage(v_T4, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
      else
      {
        // 
        // Esterometro dal 2019
        // 
        if (MainFrm.PERINVCOFAES.equals((new IDVariant("SEMESTRALE")), true))
        {
          IDVariant v_TS1 = null;
          v_TS1 = (new IDVariant("Dal 01/01/|1 Al 30/06/|1"));
          IDVariant v_TS2 = null;
          v_TS2 = (new IDVariant("Dal 01/07/|1 Al 31/12/|1"));
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(1)), IDL.FormatMessage(v_TS1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(2)), IDL.FormatMessage(v_TS2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else if (MainFrm.PERINVCOFAES.equals((new IDVariant("TRIMESTRALE")), true))
        {
          IDVariant v_T1 = new IDVariant(0,IDVariant.STRING);
          v_T1 = (new IDVariant("Dal 01/01/|1 Al 31/03/|1"));
          IDVariant v_T2 = new IDVariant(0,IDVariant.STRING);
          v_T2 = (new IDVariant("Dal 01/04/|1 Al 30/06/|1"));
          IDVariant v_T3 = new IDVariant(0,IDVariant.STRING);
          v_T3 = (new IDVariant("Dal 01/07/|1 Al 30/09/|1"));
          IDVariant v_T4 = new IDVariant(0,IDVariant.STRING);
          v_T4 = (new IDVariant("Dal 01/10/|1 Al 31/12/|1"));
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(1)), IDL.FormatMessage(v_T1, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(2)), IDL.FormatMessage(v_T2, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(3)), IDL.FormatMessage(v_T3, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(4)), IDL.FormatMessage(v_T4, IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0)))).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
        else
        {
          // 
          // MENSILE
          // 
          IDVariant v_TES1 = null;
          v_TES1 = IDL.Add((new IDVariant("Gennaio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES2 = null;
          v_TES2 = IDL.Add((new IDVariant("Febbraio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES3 = null;
          v_TES3 = IDL.Add((new IDVariant("Marzo ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES4 = null;
          v_TES4 = IDL.Add((new IDVariant("Aprile ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES5 = null;
          v_TES5 = IDL.Add((new IDVariant("Maggio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES6 = null;
          v_TES6 = IDL.Add((new IDVariant("Giugno ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES7 = null;
          v_TES7 = IDL.Add((new IDVariant("Luglio ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES8 = null;
          v_TES8 = IDL.Add((new IDVariant("Agosto ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES9 = null;
          v_TES9 = IDL.Add((new IDVariant("Settembre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES10 = null;
          v_TES10 = IDL.Add((new IDVariant("Ottobre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES11 = null;
          v_TES11 = IDL.Add((new IDVariant("Novembre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          IDVariant v_TES12 = null;
          v_TES12 = IDL.Add((new IDVariant("Dicembre ")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0),IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0))));
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(1)), v_TES1.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(2)), v_TES2.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(3)), v_TES3.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(4)), v_TES4.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(5)), v_TES5.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(6)), v_TES6.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(7)), v_TES7.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(8)), v_TES8.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(9)), v_TES9.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(10)), v_TES10.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(11)), v_TES11.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
          PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(12)), v_TES12.stringValue(), (new IDVariant("")).stringValue(), (new IDVariant("")).stringValue(), (new IDVariant(-1)).intValue()); 
        }
      }
      UpdateScreen();
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "creaAggiornaListaPeriodi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scarica File XML
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScaricaFileXML ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scarica File XML Body
      // Corpo Procedura
      // 
      IDVariant v_NOMEFILE = new IDVariant(0,IDVariant.STRING);
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_XML, 0)))
      {
        return 0;
      }
      IDVariant v_FD = null;
      v_FD = MainFrm.VBFile.FreeFile();
      v_NOMEFILE = IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_XML, 0);
      MainFrm.VBFile.OpenForOutput(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("/"))), (new IDVariant("temp"))), (new IDVariant("/"))), v_NOMEFILE), v_FD, false); 
      MainFrm.VBFile.WriteLine(v_FD, IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_FILE_XML, 0)); 
      MainFrm.VBFile.Close(v_FD); 
      MainFrm.AddTempFile(IDL.Add(IDL.Add((new IDVariant(MainFrm.RealPath)), (new IDVariant("temp/"))), v_NOMEFILE).stringValue()); 
      MainFrm.set_RedirectTo(IDL.Add((new IDVariant("temp/")), v_NOMEFILE));
      MainFrm.set_RedirectNewWindow((new IDVariant(-1)).booleanValue());
      MainFrm.set_RedirectFeatures((new IDVariant("save"))); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "ScaricaFileXML", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scarica File ZIP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ScaricaFileZIP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scarica File ZIP Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_ZIP, 0)))
      {
        return 0;
      }
      MainFrm.BlobindecompObject.DownloadBlobNativo(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_ZIP, 0));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "ScaricaFileZIP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizza Esito
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisualizzaEsito ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Esito Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_FILE, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_PARSVISESITO, IMDBDef2.FLD_PARSVISESITO_ID_FILE, 0, IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_FILE, 0));
      MainFrm.Show(MyGlb.FRM_VISUALIESITO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "VisualizzaEsito", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elimina
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int Elimina ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elimina Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML, 0)))
      {
        return 0;
      }
      if (IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ELIMINATO, 0).equals((new IDVariant("SI")), true))
      {
        IDVariant v_SERR = null;
        v_SERR = (new IDVariant("Non è possibile eliminare File già eliminati"));
        MainFrm.set_AlertMessage(v_SERR); 
        return 0;
      }
      IDVariant v_STATOAMMESSO = new IDVariant(0,IDVariant.STRING);
      v_STATOAMMESSO = (new IDVariant("File XML creato"));
      if (IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_STATO_FILE_XML, 0).compareTo(v_STATOAMMESSO, true)!=0)
      {
        IDVariant v_SERR = new IDVariant(0,IDVariant.STRING);
        v_SERR = (new IDVariant("E' possibile eliminare il File XML solo se il suo stato è: "));
        MainFrm.set_AlertMessage(IDL.Add(v_SERR, v_STATOAMMESSO)); 
        return 0;
      }
      IDVariant S = null;
      S = (new IDVariant("ATTENZIONE. Se il file XML è stato già inviato all'Agenzia delle Entrate è sconsigliata la cancellazione.<br/>Proseguire?"));
      if (MainFrm.MessageConfirm(S))
      {
        if (IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_FILE_ANNULLI, 0).equals((new IDVariant("SI")), true))
        {
          SQL = new StringBuffer();
          SQL.append("delete from CFAT_FILE_XML ");
          SQL.append("where (ID_CFAT_FILE_XML = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("update CFAT_FILE_XML set ");
          SQL.append("  ELIMINATO = 'SI' ");
          SQL.append("where (ID_CFAT_FILE_XML = " + IDL.CSql(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        PAN_ELENFILEINVI.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "Elimina", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Nuovo Invio
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int NuovoInvio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Nuovo Invio Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_FILTRO19, IMDBDef2.FLD_FILTRO19_ROWNAMEESERC, 0, IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO19, IMDBDef2.FLD_FILTRO19_ROWNAMEPARTE, 0, IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMOGGENTSPE, 0));
      IMDB.set_Value(IMDBDef2.TBL_FILTRO19, IMDBDef2.FLD_FILTRO19_ROWNAMEPERIO, 0, IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEPERI, 0));
      MainFrm.Show(MyGlb.FRM_ELENFATDAINV, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "NuovoInvio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Dettaglio Fatture Inviate
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int DettaglioFattureInviate ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Dettaglio Fatture Inviate Body
      // Corpo Procedura
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML, 0)))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Selezionare File valido"));
        MainFrm.set_AlertMessage(v_SMS); 
        return 0;
      }
      IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEIDFI, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML, 0),IDVariant.INTEGER));
      IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEESER, 0, IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEESER, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMOGGENTSPE, 0, IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMOGGENTSPE, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOME_FILE_XML, 0, IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_NOME_FILE_XML, 0));
      IMDB.set_Value(IMDBDef2.TBL_PARDETFATINV, IMDBDef2.FLD_PARDETFATINV_NOMEOGGEPERI, 0, IMDB.Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEPERI, 0));
      MainFrm.Show(MyGlb.FRM_DETTFATTINVI, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "DettaglioFattureInviate", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Crea File ZIP
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int CreaFileZIP ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C4;

    try
    {
      TransCount = 0;
      // 
      // Crea File ZIP Body
      // Corpo Procedura
      // 
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Selezionare uno o più File di Fatture da Inviare o solo file di Annulli"));
      if (!(PAN_ELENFILEINVI.ShowMultipleSel()))
      {
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      IDVariant I = null;
      I = (new IDVariant(1));
      IDVariant N = new IDVariant(0,IDVariant.INTEGER);
      MainFrm.Cf4armDBObject.BeginTrans();
      SQL = new StringBuffer();
      SQL.append("delete from CFAT_WRK_FATTURE ");
      SQL.append("where (DATA_CREAZIONE < TRUNC( SYSDATE ) - 30) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      SQL = new StringBuffer();
      SQL.append("delete from CFAT_WRK_FATTURE ");
      SQL.append("where (SESSIONE = TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " )) ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      IDVariant v_ESSELECTED = new IDVariant(0,IDVariant.STRING);
      IDVariant v_ANNULLSELECT = new IDVariant(0,IDVariant.STRING);
      C4 = PAN_ELENFILEINVI.MasterRS();
      if (C4.size()>0) CurPos = C4.getRow(); else CurPos = 0;
      if (!C4.Bof()) PAN_ELENFILEINVI.GotoFirst();
      while (!PAN_ELENFILEINVI.RSEOF())
      {
        if (PAN_ELENFILEINVI.IsRowSelected(I.intValue()))
        {
          N = IDL.Add(N, (new IDVariant(1)));
          IDVariant v_STATOAMMESSO = new IDVariant(0,IDVariant.STRING);
          v_STATOAMMESSO = (new IDVariant("File XML creato"));
          IDVariant v_STATOAMMESS1 = new IDVariant(0,IDVariant.STRING);
          v_STATOAMMESS1 = (new IDVariant("Creato File Annullo"));
          if (C4.Get("STATO_FILE_XML").compareTo(v_STATOAMMESSO, true)!=0 && C4.Get("STATO_FILE_XML").compareTo(v_STATOAMMESS1, true)!=0)
          {
            IDVariant v_SERR = null;
            v_SERR = (new IDVariant("Possono essere selezionate solo le righe in stato File XML Creato"));
            MainFrm.set_AlertMessage(v_SERR); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          if (C4.Get("ELIMINATO").equals((new IDVariant("SI")), true))
          {
            IDVariant v_SERR = new IDVariant(0,IDVariant.STRING);
            v_SERR = (new IDVariant("Non è possibile selezionare righe Eliminate"));
            MainFrm.set_AlertMessage(v_SERR); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
          if (N.equals((new IDVariant(1)), true))
          {
            v_ESSELECTED = new IDVariant(C4.Get("RECCFAFIXME1"));
            v_ANNULLSELECT = IDL.NullValue(C4.Get("FILE_ANNULLI"),(new IDVariant("NO")));
          }
          else
          {
            if (C4.Get("RECCFAFIXME1").compareTo(v_ESSELECTED, true)!=0 || IDL.NullValue(C4.Get("FILE_ANNULLI"),(new IDVariant("NO"))).compareTo(v_ANNULLSELECT, true)!=0)
            {
              IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
              v_S1 = (new IDVariant("Selezionare solo File di Fatture da Inviare o solo file di Annulli"));
              MainFrm.set_AlertMessage(v_S1); 
              MainFrm.Cf4armDBObject.RollbackTrans();
              return 0;
            }
          }
          try
          {
            SQL = new StringBuffer();
            SQL.append("insert into CFAT_WRK_FATTURE ");
            SQL.append("( ");
            SQL.append("  SESSIONE, ");
            SQL.append("  PROGRESSIVO, ");
            SQL.append("  E_S, ");
            SQL.append("  ESERCIZIO, ");
            SQL.append("  DATA_RIF, ");
            SQL.append("  ANNO_PROG, ");
            SQL.append("  NUMERO_PROG, ");
            SQL.append("  ID_CFAT_FILE_XML, ");
            SQL.append("  DATA_CREAZIONE ");
            SQL.append(") ");
            SQL.append("values ");
            SQL.append("( ");
            SQL.append("  TO_CHAR ( " + IDL.CSql(MainFrm.PROGRESESSIO, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ), ");
            SQL.append("  " + IDL.CSql(N, IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C4.Get("RECCFAFIXME1"), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C4.Get("RECCFAFIXMES"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  " + IDL.CSql(C4.Get("RECFFIXMDARI"), IDL.FMT_DAT3, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  1, ");
            SQL.append("  1, ");
            SQL.append("  " + IDL.CSql(C4.Get("ID_CFAT_FILE_XML"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ", ");
            SQL.append("  TRUNC( SYSDATE ) ");
            SQL.append(") ");
            MainFrm.Cf4armDBObject.DBO().Execute(SQL);
          }
          catch (Exception e15)
          {
            MainFrm.set_AlertMessage(new IDVariant(e15.getMessage())); 
            MainFrm.Cf4armDBObject.RollbackTrans();
            return 0;
          }
        }
        I = IDL.Add(I, (new IDVariant(1)));
        PAN_ELENFILEINVI.GotoNext();
      }
      if (CurPos>0) C4.absolute(CurPos);
      MainFrm.Cf4armDBObject.CommitTrans();
      if (N.equals((new IDVariant(0)), true))
      {
        MainFrm.set_AlertMessage(S); 
        return 0;
      }
      // 
      // TUTTO OK. LAncio la procedure
      // 
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.COMUNICAZIONEFATTURECREAFILEZIP(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSUSERNAME, 0));
      if (IDL.NullValue((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
      }
      else
      {
        MainFrm.set_AlertMessage((new IDVariant("Elaborazione Eseguita"))); 
        PAN_ELENFILEINVI.PanelCommand(Glb.PCM_REQUERY);
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "CreaFileZIP", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Importa File Esito
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ImportaFileEsito ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Importa File Esito Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI598, IMDBDef2.FLD_PARAMETRI598_PARAMFASE, 0, (new IDVariant("CFAT_ESITO")));
      MainFrm.Show(MyGlb.FRM_IMPOFILEESIT, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "ImportaFileEsito", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Elenco File ZIP Inviati
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int ElencoFileZIPInviati ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco File ZIP Inviati Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARELEFILZIP, IMDBDef2.FLD_PARELEFILZIP_NOMEOGGEPERI, 0, IMDB.Value(IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI, 0));
      MainFrm.Show(MyGlb.FRM_ELEFILZIPINV, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "ElencoFileZIPInviati", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Visualizza Descrizione
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int VisualizzaDescrizione ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Visualizza Descrizione Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef2.TBL_PARSCFXML, IMDBDef2.FLD_PARSCFXML_NOMEOGGEIDCF, 0, new IDVariant(IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ID_CFAT_FILE_XML, 0),IDVariant.INTEGER));
      MainFrm.Show(MyGlb.FRM_VISUALDESCRI, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "VisualizzaDescrizione", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Filtri On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_FILTRI_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Filtri On Updating Row Body
      // Corpo Procedura
      // 
      if (Column.equals((new IDVariant(PFL_FILTRI_ESERCIZIO1)), true) && FieldWasModified.booleanValue())
      {
        IMDB.set_Value(IMDBDef10.PQRY_FILTRI30, IMDBDef10.PQSL_FILTRI30_NOMEOGGEPERI, 0, (new IDVariant()));
        creaAggiornaListaPeriodi();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "FiltriOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Elenco File Inviati On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ELENFILEINVI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ELENFILEINVI);
      // 
      // Elenco File Inviati On Dynamic Properties Body
      // Corpo Procedura
      // 
      // 
      // tootltips
      // 
      {
        PAN_ELENFILEINVI.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENFILEINVI_DICHIARANTE,(new IDVariant(PAN_ELENFILEINVI.FieldText(PFL_ELENFILEINVI_DICHIARANTE))).stringValue()); 
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        S = (new IDVariant("Scarica il file XML"));
        PAN_ELENFILEINVI.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENFILEINVI_SCARIFILEXML,S.stringValue()); 
        IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
        v_S1 = (new IDVariant("Scarica il file ZIP"));
        PAN_ELENFILEINVI.set_ToolTip(Glb.OBJ_FIELD,PFL_ELENFILEINVI_SCARIFILEZIP,v_S1.stringValue()); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "ElencoFileInviatiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Elenco File Inviati On Change Row
  // Evento notificato dal pannello quando i dati presenti
  // nella riga attiva del pannello cambiano
  // **********************************************************************
  private void PAN_ELENFILEINVI_OnChangeRow()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elenco File Inviati On Change Row Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_ELIMINATO, 0).equals((new IDVariant("SI")), true) || IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_FILE_ANNULLI, 0).equals((new IDVariant("SI")), true))
      {
        if (IMDB.Value(IMDBDef10.PQRY_CFATFILEXML, IMDBDef10.PQSL_CFATFILEXML_FILE_ANNULLI, 0).equals((new IDVariant("SI")), true))
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DETTFATTINVI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINA2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        }
        else
        {
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DETTFATTINVI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
          MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINA2+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
        }
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_ELIMINA2+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_DETTFATTINVI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoFileInviati", "ElencoFileInviatiOnChangeRow", _e);
    }
  }

  // **********************************************************************
  // Filtri
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELENFILEINVI_FILTRI30() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef10.PQRY_FILTRI30_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRI31, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_FILTRI31, 0))
    {
      IMDB.TblAddNew(IMDBDef10.PQRY_FILTRI30_RS, 0);
      IMDB.TblLinkRow(IMDBDef10.PQRY_FILTRI30_RS, 0, IMDBDef2.TBL_FILTRI31, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRI30_RS, 0, 0, IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRI30_RS, 1, 0, IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMOGGENTSPE, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRI30_RS, 2, 0, IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI, 0);
      IMDB.TblLinkField(IMDBDef10.PQRY_FILTRI30_RS, 3, 0, IMDBDef2.TBL_FILTRI31, IMDBDef2.FLD_FILTRI31_NOMOGGFILELI, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_FILTRI31, 0);
      if (IMDB.Eof(IMDBDef2.TBL_FILTRI31, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_FILTRI31, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef10.PQRY_FILTRI30_RS, 0);
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
  private void PAN_FILTRI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FILTRI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FILTRI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FILTRI, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FILTRI_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_FILTRI);
    // Stub
  }

  private void PAN_FILTRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FILTRI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_FILTRI_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_FILTRI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FILTRI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ELENFILEINVI_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ELENFILEINVI, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_ELENFILEINVI_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_ELENFILEINVI, Cancel);
    // Stub
  }

  private void PAN_ELENFILEINVI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ELENFILEINVI_SCARIFILEXML)
    {
      this.IdxPanelActived = this.PAN_ELENFILEINVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScaricaFileXML();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENFILEINVI_SCARIFILEZIP)
    {
      this.IdxPanelActived = this.PAN_ELENFILEINVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ScaricaFileZIP();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENFILEINVI_VISUALIESITO)
    {
      this.IdxPanelActived = this.PAN_ELENFILEINVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VisualizzaEsito();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ELENFILEINVI_VISUALDESCRI)
    {
      this.IdxPanelActived = this.PAN_ELENFILEINVI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      VisualizzaDescrizione();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ELENFILEINVI_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ELENFILEINVI_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ELENFILEINVI_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FILTRI_Init()
  {

    PAN_FILTRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FILTRI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_FILTRI.SetSize(MyGlb.OBJ_FIELD, 4);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, "AC61B13C-53CC-4F0D-95C6-CD0E963B7E1C");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, "Esercizio");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, "DC2F07E9-33FB-4FFA-A968-3E3AE6743D2C");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, "Entrata/Spesa");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, "Entrata/Spesa");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.VIS_OPTIONBUTTON);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, "4085738C-E3C0-41EB-B229-DA6A39757AAF");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, "Periodo");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.VIS_NORMALFIELDS);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_FILTRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, "A2249F64-DF18-45BD-B6A9-5ABE348F47B6");
    PAN_FILTRI.set_Header(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, "File Eliminati");
    PAN_FILTRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, "");
    PAN_FILTRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.VIS_CHECKSTYLE);
    PAN_FILTRI.SetFlags(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_FILTRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_LIST, 60);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_LIST, "Esercizio");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_FORM, 8, 8, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_FORM, 64);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ESERCIZIO1, MyGlb.PANEL_FORM, "Esercizio");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_ESERCIZIO1, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_ESERCIZIO1, PPQRY_FILTRI30, "A.NOMEOGGEESER", "NOMEOGGEESER", 1, 4, 0, -13997);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, 88);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_LIST, "Entrata/Spesa");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, 132, 8, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, 104);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_ENTRATASPESA, MyGlb.PANEL_FORM, "Entrata/Spesa");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_ENTRATASPESA, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_ENTRATASPESA, PPQRY_FILTRI30, "A.NOMOGGENTSPE", "NOMOGGENTSPE", 5, 1, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ENTRATASPESA, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_ENTRATASPESA, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_LIST, 52);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_LIST, "Periodo");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_FORM, 260, 8, 232, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_FORM, 56);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_PERIODO1, MyGlb.PANEL_FORM, "Periodo");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_PERIODO1, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_PERIODO1, PPQRY_FILTRI30, "A.NOMEOGGEPERI", "NOMEOGGEPERI", 1, 1, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(1)), "Dal 01/01/2XXX Al 31/03/2XXX", "", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(2)), "Dal 01/04/2XXX Al 30/06/2XXX", "", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(3)), "Dal 01/07/2XXX Al 30/09/2XXX", "", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_PERIODO1, (new IDVariant(4)), "Dal 01/10/2XXX Al 31/12/2XXX", "", "", -1);
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_LIST, 80);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_LIST, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_LIST, "File Eliminati");
    PAN_FILTRI.SetRect(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_FORM, 508, 8, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FILTRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_FORM, 80);
    PAN_FILTRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_FORM, 1);
    PAN_FILTRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FILTRI_FILEELIMINAT, MyGlb.PANEL_FORM, "File Eliminati");
    PAN_FILTRI.SetFieldPage(PFL_FILTRI_FILEELIMINAT, -1, -1);
    PAN_FILTRI.SetFieldPanel(PFL_FILTRI_FILEELIMINAT, PPQRY_FILTRI30, "A.NOMOGGFILELI", "NOMOGGFILELI", 5, 2, 0, -13997);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_FILEELIMINAT, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_FILTRI.SetValueListItem(PFL_FILTRI_FILEELIMINAT, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_FILTRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_FILTRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as DUALESEFESER, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) as ESERCIZIO ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where (A.ESERCIZIO = ~~NOMEOGGEESER~~) ");
    SQL.append("and   ((A.ESERCIZIO BETWEEN 2017 AND TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')))) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_FILTRI.SetQuery(PPQRY_DUAL1, 0, SQL, PFL_FILTRI_ESERCIZIO1, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as DUALESEFESER, ");
    SQL.append("  TO_CHAR ( A.ESERCIZIO ) as ESERCIZIO ");
    SQL.append("from ");
    SQL.append("  ESEFIN A ");
    SQL.append("where ((A.ESERCIZIO BETWEEN 2017 AND TO_NUMBER(TO_CHAR(TRUNC( SYSDATE ), 'yyyy')))) ");
    SQL.append("order by ");
    SQL.append("  A.ESERCIZIO ");
    PAN_FILTRI.SetQuery(PPQRY_DUAL1, 1, SQL, PFL_FILTRI_ESERCIZIO1, "");
    PAN_FILTRI.SetQueryDB(PPQRY_DUAL1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FILTRI.SetIMDB(IMDB, "PQRY_FILTRI30", true);
    PAN_FILTRI.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_FILTRI.SetQueryIMDB(PPQRY_FILTRI30, IMDBDef10.PQRY_FILTRI30_RS, IMDBDef2.TBL_FILTRI31);
    JustLoaded = true;
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_ESERCIZIO1, IMDBDef2.FLD_FILTRI31_NOMEOGGEESER);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_ENTRATASPESA, IMDBDef2.FLD_FILTRI31_NOMOGGENTSPE);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_PERIODO1, IMDBDef2.FLD_FILTRI31_NOMEOGGEPERI);
    PAN_FILTRI.SetFieldPrimaryIndex(PFL_FILTRI_FILEELIMINAT, IMDBDef2.FLD_FILTRI31_NOMOGGFILELI);
    PAN_FILTRI.SetMasterTable(0, "FILTRI31");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FILTRI.Status() == 2)
    {
      int oldListQBE = PAN_FILTRI.iUseListQBE;
      PAN_FILTRI.iUseListQBE = 0;
      PAN_FILTRI.PanelCommand(Glb.PCM_SEARCH);
      PAN_FILTRI.PanelCommand(Glb.PCM_FIND);
      PAN_FILTRI.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_ELENFILEINVI_Init()
  {

    PAN_ELENFILEINVI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ELENFILEINVI.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ELENFILEINVI.SetSize(MyGlb.OBJ_FIELD, 20);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, "C38A4411-DC52-44FB-BC5F-E2C70E547FA0");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, "ID CFAT FILE XML");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, "B41E8CA2-7143-4AF7-86AD-6D62FAABDE94");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, "Periodo");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, "137DE86B-F92D-4A76-A07C-8E42121206FF");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, "Nome File XML");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, "159C70E7-C0CA-42A5-ABD3-2AFBF3B9A1B8");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, " ");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, "Scarica File XML");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, "D4726500-9F50-4FE4-B2C3-D136C3A40044");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, "FILE XML");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.VIS_NORMFIELPADR);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, "A3AF8402-4FA2-4331-8A7F-28F9B47271DF");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, "Nome File Zip");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, "98FF7648-5AAE-4E31-B997-11EC57C55973");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, "File di Annullo");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, "13B59F17-A657-4738-9CAD-811CC4FE8883");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, " ");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, "Scarica File ZIP");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, "B2B7F548-59D8-4ACF-9A75-BE21B3FCAD14");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, "Eliminato");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.VIS_CHECKSTYLE);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, "294A4EFD-5D75-4C41-BEAF-AE1714495292");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, "Stato File XML");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, "B5717CA5-3845-46C5-A93F-0C0C02F97071");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, "idFile");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, "850402AD-52C0-4B20-A659-01A1020ADCA4");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, " ");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, " ");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, "5B1A0115-57CF-421D-9A3F-DBFBAE3367D7");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, "Dichiarante");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, "2E01F906-557A-4B37-AE67-B03D38F3ED83");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, "Descrizione");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, "934AD13D-71E0-4689-9CE7-3F963E6425B4");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, " ");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, " ");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.VIS_HYPELINKIMMA);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, "823A2968-D36A-42E7-BF25-3C1A8830CDD6");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, "Data Creazione");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, "586773F9-D739-4619-B773-9F7F5A57CAD8");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, "Utente Creazione");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, "FF87F141-53C0-4A75-B563-D1B2D09C779E");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, "E S");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.VIS_OPTIONBUTTON);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, 0, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, "8E45E11F-D67E-4D5A-8200-EF4A2D71FAC3");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, "Data Rif.");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, 0, -1);
    PAN_ELENFILEINVI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, "306D1AD7-5BC2-4023-A326-D5FAB704B45E");
    PAN_ELENFILEINVI.set_Header(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, "Esercizio");
    PAN_ELENFILEINVI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, "");
    PAN_ELENFILEINVI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ELENFILEINVI.SetFlags(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, 0, -1);
  }

  private void PAN_ELENFILEINVI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_LIST, 104);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_LIST, "ID CFAT FILE XML");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_FORM, 4, 4, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_FORM, 104);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDCFATFILXML, MyGlb.PANEL_FORM, "ID CFAT FILE XML");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_IDCFATFILXML, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_IDCFATFILXML, PPQRY_CFATFILEXML, "A.ID_CFAT_FILE_XML", "ID_CFAT_FILE_XML", 3, 10, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_LIST, 52);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_LIST, "Periodo");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_FORM, 4, 28, 560, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_FORM, 52);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_PERIODO, MyGlb.PANEL_FORM, "Periodo");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_PERIODO, -1, -1);
    PAN_ELENFILEINVI.SetFieldUnbound(PFL_ELENFILEINVI_PERIODO, true);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_PERIODO, PPQRY_CFATFILEXML, "COMUNICAZIONE_FATTURE.GET_DESCR_PERIODO_D_DATA(A.DATA_RIF,A.ESERCIZIO," + IDL.CSql(MainFrm.PERINVCOMFAT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PERINVCOFAES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ")", "PERIODO", 5, 99, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_LIST, 140, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_LIST, 92);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_LIST, "Nome File XML");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_FORM, 4, 52, 528, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_FORM, 92);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_FORM, 2);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEXML, MyGlb.PANEL_FORM, "Nome File XML");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_NOMEFILEXML, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_NOMEFILEXML, PPQRY_CFATFILEXML, "A.NOME_FILE_XML", "NOME_FILE_XML", 5, 300, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_LIST, 348, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_LIST, 100);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_LIST, " ");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_FORM, 4, 4, 608, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_FORM, 100);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEXML, MyGlb.PANEL_FORM, " ");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_SCARIFILEXML, -1, -1);
    PAN_ELENFILEINVI.SetFieldUnbound(PFL_ELENFILEINVI_SCARIFILEXML, true);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_SCARIFILEXML, PPQRY_CFATFILEXML, "CASE WHEN NOT ((A.NOME_FILE_XML IS NULL)) THEN 'XML' ELSE NULL END", "SCARIFILEXML", 5, 99, 0, -13997);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEXML, (new IDVariant()), "Da Elaborare", "Da Elaborare", "", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEXML, (new IDVariant("FE")), "Fattura Elettronica", "Fattura Elettronica", "at_grey1.png", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEXML, (new IDVariant("XML")), "Creato File XML", "Creato File XML", "xml_icon.png", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEXML, (new IDVariant("ZIP")), "Creato File ZIP", "Creato File ZIP", "zip_file.png", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEXML, (new IDVariant("Verde")), "Validata", "Validata", "smileverde.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEXML, (new IDVariant("Giallo")), "Validata con Segnalazione", "Validata con Segnalazione", "smile_question.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEXML, (new IDVariant("Rosso")), "Scartata", "Scartata", "pallinoRosso.gif", -1);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_LIST, 424, 36, 432, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_LIST, 60);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_LIST, 2);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_LIST, "FILE XML");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_FORM, 4, 100, 496, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_FORM, 60);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_FORM, 2);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEXML, MyGlb.PANEL_FORM, "FILE XML");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_FILEXML, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_FILEXML, PPQRY_CFATFILEXML, "A.FILE_XML", "FILE_XML", 9, 999999999, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_LIST, 368, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_LIST, 88);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_LIST, "Nome File Zip");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_FORM, 4, 100, 524, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_FORM, 88);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_FORM, 2);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_NOMEFILEZIP, MyGlb.PANEL_FORM, "Nome File Zip");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_NOMEFILEZIP, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_NOMEFILEZIP, PPQRY_CFATFILEXML, "A.NOME_FILE_ZIP", "NOME_FILE_ZIP", 5, 300, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_LIST, 576, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_LIST, 84);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_LIST, "File di Annullo");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_FORM, 4, 220, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_FORM, 84);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_FILEANNULLI, MyGlb.PANEL_FORM, "File di Annullo");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_FILEANNULLI, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_FILEANNULLI, PPQRY_CFATFILEXML, "A.FILE_ANNULLI", "FILE_ANNULLI", 5, 2, 0, -13997);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_FILEANNULLI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_FILEANNULLI, (new IDVariant()), "Null", "", "", -1);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_LIST, 628, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_LIST, 96);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_LIST, " ");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_FORM, 4, 148, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_FORM, 96);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_SCARIFILEZIP, MyGlb.PANEL_FORM, " ");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_SCARIFILEZIP, -1, -1);
    PAN_ELENFILEINVI.SetFieldUnbound(PFL_ELENFILEINVI_SCARIFILEZIP, true);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_SCARIFILEZIP, PPQRY_CFATFILEXML, "CASE WHEN NOT ((A.NOME_FILE_ZIP IS NULL)) THEN 'ZIP' ELSE NULL END", "SCARIFILEZIP", 5, 99, 0, -13997);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_SCARIFILEZIP, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_LIST, 648, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_LIST, 72);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_LIST, "Eliminato");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_FORM, 4, 172, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_FORM, 72);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ELIMINATO, MyGlb.PANEL_FORM, "Eliminato");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_ELIMINATO, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_ELIMINATO, PPQRY_CFATFILEXML, "A.ELIMINATO", "ELIMINATO", 5, 2, 0, -13997);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_ELIMINATO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_ELIMINATO, (new IDVariant()), "Null", "", "", -1);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_LIST, 708, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_LIST, 100);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_LIST, "Stato File XML");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_FORM, 4, 340, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_FORM, 100);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_STATOFILEXML, MyGlb.PANEL_FORM, "Stato File XML");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_STATOFILEXML, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_STATOFILEXML, PPQRY_CFATFILEXML, "A.STATO_FILE_XML", "STATO_FILE_XML", 5, 30, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_LIST, 808, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_LIST, 48);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_LIST, "idFile");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_FORM, 4, 244, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_FORM, 48);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_IDFILE, MyGlb.PANEL_FORM, "idFile");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_IDFILE, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_IDFILE, PPQRY_CFATFILEXML, "A.ID_FILE", "ID_FILE", 5, 18, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_LIST, 924, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_LIST, 96);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_LIST, " ");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_FORM, 4, 268, 604, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_FORM, 96);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALIESITO, MyGlb.PANEL_FORM, " ");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_VISUALIESITO, -1, -1);
    PAN_ELENFILEINVI.SetFieldUnbound(PFL_ELENFILEINVI_VISUALIESITO, true);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_VISUALIESITO, PPQRY_CFATFILEXML, "CASE WHEN NOT ((A.ID_FILE IS NULL)) THEN 'I' ELSE NULL END", "VISUALIESITO", 5, 99, 0, -13997);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_VISUALIESITO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_VISUALIESITO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_VISUALIESITO, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_LIST, 944, 36, 160, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_LIST, 76);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_LIST, "Dichiarante");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_FORM, 4, 196, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_FORM, 76);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DICHIARANTE, MyGlb.PANEL_FORM, "Dichiarante");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_DICHIARANTE, -1, -1);
    PAN_ELENFILEINVI.SetFieldUnbound(PFL_ELENFILEINVI_DICHIARANTE, true);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_DICHIARANTE, PPQRY_CFATFILEXML, "A.CODICE_FISCALE_DIC || '  ' || DECODE(A.CODICE_CARICA_DIC, 1, '1 - Rappresentante legale, negoziale o di fatto, socio amministratore', 2, '2 - Rappresentante di minore, inabilitato o interdetto, ovvero curatore eredità giacente, amministratore dell''eredità', 3, '3 - Curatore fallimentare', 4, '4 - Commissario liquidatore', 5, '5 - Commissario giudiziale', 6, '6 - Rappresentante fiscale di soggetto non residente', 7, '7 - Erede', 8, '8 - Liquidatore - liquidazione volontaria', 9, '9 - Soggetto tenuto a presentare dichiarazione in caso di operazioni straordinarie', 11, '11 - Soggetto esercente l''attività tutoria del minore o interdetto in relazione alla funzione istituzionale rivestita', 12, '12 - Liquidatore - liquidazione volontaria di ditta individuale periodo ante messa in liquidazione', 13, '13 - Amministratore di condominio', 14, '14 - Soggetto che sottoscrive la dichiarazione per conto di una pubblica amministrazione', 15, '15 - Commissario liquidatore di una pubblica amministrazione')", "RECORDDICHIA", 5, 117, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_LIST, 1104, 36, 432, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 364, 520, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_DESCRIZIONE, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_DESCRIZIONE, PPQRY_CFATFILEXML, "A.DESCRIZIONE", "RECCFAFIXMDE", 5, 2000, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_LIST, 1536, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_LIST, 132);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_LIST, " ");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_FORM, 4, 412, 640, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_FORM, 132);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_VISUALDESCRI, MyGlb.PANEL_FORM, " ");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_VISUALDESCRI, -1, -1);
    PAN_ELENFILEINVI.SetFieldUnbound(PFL_ELENFILEINVI_VISUALDESCRI, true);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_VISUALDESCRI, PPQRY_CFATFILEXML, "CASE WHEN NOT ((A.DESCRIZIONE IS NULL)) THEN 'I' ELSE NULL END", "VISUALDESCRI", 5, 99, 0, -13997);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_VISUALDESCRI, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_VISUALDESCRI, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_VISUALDESCRI, (new IDVariant("E")), "Elimina", "", "wdelete.gif", -1);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_LIST, 1560, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_LIST, 104);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_LIST, "Data Creazione");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_FORM, 4, 292, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_FORM, 104);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATACREAZION, MyGlb.PANEL_FORM, "Data Creazione");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_DATACREAZION, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_DATACREAZION, PPQRY_CFATFILEXML, "A.DATA_CREAZIONE", "DATA_CREAZIONE", 6, 19, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_LIST, 1628, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_LIST, 116);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_LIST, "Utente Creazione");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_FORM, 4, 316, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_FORM, 116);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_UTENTECREAZI, MyGlb.PANEL_FORM, "Utente Creazione");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_UTENTECREAZI, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_UTENTECREAZI, PPQRY_CFATFILEXML, "A.UTENTE_CREAZIONE", "UTENTE_CREAZIONE", 5, 8, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_LIST, 1596, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_LIST, 24);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_LIST, "E S");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_FORM, 4, 364, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_FORM, 24);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ES, MyGlb.PANEL_FORM, "E S");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_ES, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_ES, PPQRY_CFATFILEXML, "A.E_S", "RECCFAFIXME1", 5, 1, 0, -13997);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_ES, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_ELENFILEINVI.SetValueListItem(PFL_ELENFILEINVI_ES, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_LIST, 1596, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_LIST, 64);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_LIST, "Data Rif.");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_FORM, 4, 388, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_FORM, 64);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_DATARIF, MyGlb.PANEL_FORM, "Data Rif.");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_DATARIF, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_DATARIF, PPQRY_CFATFILEXML, "A.DATA_RIF", "RECFFIXMDARI", 6, 19, 0, -13997);
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_LIST, 1596, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_ELENFILEINVI.SetRect(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 364, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ELENFILEINVI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_FORM, 68);
    PAN_ELENFILEINVI.SetNumRow(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ELENFILEINVI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ELENFILEINVI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_ELENFILEINVI.SetFieldPage(PFL_ELENFILEINVI_ESERCIZIO, -1, -1);
    PAN_ELENFILEINVI.SetFieldPanel(PFL_ELENFILEINVI_ESERCIZIO, PPQRY_CFATFILEXML, "A.ESERCIZIO", "RECCFAFIXMES", 1, 4, 0, -13997);
  }

  private void PAN_ELENFILEINVI_InitQueries()
  {
    StringBuffer SQL;

    PAN_ELENFILEINVI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_CREAZIONE~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_CREAZIONE~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~UTENTE_CREAZIONE~~ IS NULL))) ");
    PAN_ELENFILEINVI.SetQuery(PPQRY_DUAL, 0, SQL, PFL_ELENFILEINVI_UTENTECREAZI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  ~~UTENTE_CREAZIONE~~ as NUOVAESPRES1, ");
    SQL.append("  A_GET_AD4_NOMINATIVO(~~UTENTE_CREAZIONE~~) as NUOVAESPRESS ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    PAN_ELENFILEINVI.SetQuery(PPQRY_DUAL, 1, SQL, PFL_ELENFILEINVI_UTENTECREAZI, "");
    PAN_ELENFILEINVI.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENFILEINVI.SetIMDB(IMDB, "PQRY_CFATFILEXML", true);
    PAN_ELENFILEINVI.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ID_CFAT_FILE_XML as ID_CFAT_FILE_XML, ");
    SQL.append("  COMUNICAZIONE_FATTURE.GET_DESCR_PERIODO_D_DATA(A.DATA_RIF,A.ESERCIZIO," + IDL.CSql(MainFrm.PERINVCOMFAT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PERINVCOFAES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") as PERIODO, ");
    SQL.append("  A.NOME_FILE_XML as NOME_FILE_XML, ");
    SQL.append("  CASE WHEN NOT ((A.NOME_FILE_XML IS NULL)) THEN 'XML' ELSE NULL END as SCARIFILEXML, ");
    SQL.append("  A.FILE_XML as FILE_XML, ");
    SQL.append("  A.NOME_FILE_ZIP as NOME_FILE_ZIP, ");
    SQL.append("  CASE WHEN NOT ((A.NOME_FILE_ZIP IS NULL)) THEN 'ZIP' ELSE NULL END as SCARIFILEZIP, ");
    SQL.append("  A.ELIMINATO as ELIMINATO, ");
    SQL.append("  A.CODICE_FISCALE_DIC || '  ' || DECODE(A.CODICE_CARICA_DIC, 1, '1 - Rappresentante legale, negoziale o di fatto, socio amministratore', 2, '2 - Rappresentante di minore, inabilitato o interdetto, ovvero curatore eredità giacente, amministratore dell''eredità', 3, '3 - Curatore fallimentare', 4, '4 - Commissario liquidatore', 5, '5 - Commissario giudiziale', 6, '6 - Rappresentante fiscale di soggetto non residente', 7, '7 - Erede', 8, '8 - Liquidatore - liquidazione volontaria', 9, '9 - Soggetto tenuto a presentare dichiarazione in caso di operazioni straordinarie', 11, '11 - Soggetto esercente l''attività tutoria del minore o interdetto in relazione alla funzione istituzionale rivestita', 12, '12 - Liquidatore - liquidazione volontaria di ditta individuale periodo ante messa in liquidazione', 13, '13 - Amministratore di condominio', 14, '14 - Soggetto che sottoscrive la dichiarazione per conto di una pubblica amministrazione', 15, '15 - Commissario liquidatore di una pubblica amministrazione') as RECORDDICHIA, ");
    SQL.append("  A.FILE_ANNULLI as FILE_ANNULLI, ");
    SQL.append("  A.ID_FILE as ID_FILE, ");
    SQL.append("  CASE WHEN NOT ((A.ID_FILE IS NULL)) THEN 'I' ELSE NULL END as VISUALIESITO, ");
    SQL.append("  A.DATA_CREAZIONE as DATA_CREAZIONE, ");
    SQL.append("  A.UTENTE_CREAZIONE as UTENTE_CREAZIONE, ");
    SQL.append("  A.STATO_FILE_XML as STATO_FILE_XML, ");
    SQL.append("  A.E_S as RECCFAFIXME1, ");
    SQL.append("  A.DATA_RIF as RECFFIXMDARI, ");
    SQL.append("  A.ESERCIZIO as RECCFAFIXMES, ");
    SQL.append("  A.DESCRIZIONE as RECCFAFIXMDE, ");
    SQL.append("  CASE WHEN NOT ((A.DESCRIZIONE IS NULL)) THEN 'I' ELSE NULL END as VISUALDESCRI ");
    PAN_ELENFILEINVI.SetQuery(PPQRY_CFATFILEXML, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  CFAT_FILE_XML A ");
    PAN_ELENFILEINVI.SetQuery(PPQRY_CFATFILEXML, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~PQRY_FILTRI30.NOMOGGENTSPE~~) ");
    SQL.append("and   (A.ESERCIZIO = ~~PQRY_FILTRI30.NOMEOGGEESER~~) ");
    SQL.append("and   ((~~PQRY_FILTRI30.NOMEOGGEPERI~~ IS NULL) OR COMUNICAZIONE_FATTURE.GET_TRIMESTER_FROM_DATA_RIF(A.DATA_RIF," + IDL.CSql(MainFrm.PERINVCOMFAT, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(MainFrm.PERINVCOFAES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") = ~~PQRY_FILTRI30.NOMEOGGEPERI~~) ");
    SQL.append("and   ((A.ELIMINATO IS NULL) OR (A.ELIMINATO = ~~PQRY_FILTRI30.NOMOGGFILELI~~ AND A.ELIMINATO = 'SI')) ");
    PAN_ELENFILEINVI.SetQuery(PPQRY_CFATFILEXML, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENFILEINVI.SetQuery(PPQRY_CFATFILEXML, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ELENFILEINVI.SetQuery(PPQRY_CFATFILEXML, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by 2, 13 ");
    PAN_ELENFILEINVI.SetQuery(PPQRY_CFATFILEXML, 5, SQL, -1, "");
    PAN_ELENFILEINVI.SetQueryDB(PPQRY_CFATFILEXML, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ELENFILEINVI.SetMasterTable(0, "CFAT_FILE_XML");
    PAN_ELENFILEINVI.AddToSortList(PFL_ELENFILEINVI_PERIODO, true);
    PAN_ELENFILEINVI.AddToSortList(PFL_ELENFILEINVI_DATACREAZION, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ELENFILEINVI.Status() == 2)
    {
      int oldListQBE = PAN_ELENFILEINVI.iUseListQBE;
      PAN_ELENFILEINVI.iUseListQBE = 0;
      PAN_ELENFILEINVI.PanelCommand(Glb.PCM_SEARCH);
      PAN_ELENFILEINVI.PanelCommand(Glb.PCM_FIND);
      PAN_ELENFILEINVI.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ELENFILEINVI) PAN_ELENFILEINVI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_ValidateRow(Cancel);
    if (SrcObj == PAN_ELENFILEINVI) PAN_ELENFILEINVI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_DynamicProperties();
    if (SrcObj == PAN_ELENFILEINVI) PAN_ELENFILEINVI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ELENFILEINVI) PAN_ELENFILEINVI_CellActivated(ColIndex, Cancel);
  }
  
  public void OnChangePage(IDPanel SrcObj, IDVariant NewPage, IDVariant Cancel)
  {
  }
  
  public void OnChangeLayout(IDPanel SrcObj, IDVariant NewLayout, IDVariant Cancel)
  {
  }
  
  public void OnChangeRow(IDPanel SrcObj)
  {
    if (SrcObj == PAN_ELENFILEINVI) PAN_ELENFILEINVI_OnChangeRow();
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
    if (SrcObj == PAN_FILTRI) PAN_FILTRI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_ELENFILEINVI) PAN_ELENFILEINVI_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
