// **********************************************
// Ordinativi Da Imputazioni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiDaImputazioni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAR_DATADOCUMDAL = 0;
  private static int PFL_PAR_AL = 1;
  private static int PFL_PAR_SOLDOCGIACON = 2;
  private static int PFL_PAR_TOTALECONFER = 3;
  private static int PFL_PAR_NEWPANELLABE = 4;

  private static int PPQRY_PAR93 = 0;


  IDPanel PAN_PAR;
  private static int PFL_ORDINDAIMPUT_CONFERMA = 0;
  private static int PFL_ORDINDAIMPUT_IMPORTO = 1;
  private static int PFL_ORDINDAIMPUT_DEBITORE = 2;
  private static int PFL_ORDINDAIMPUT_NUMERODOC = 3;
  private static int PFL_ORDINDAIMPUT_DDATADOC = 4;
  private static int PFL_ORDINDAIMPUT_ANNODOC = 5;
  private static int PFL_ORDINDAIMPUT_DESCRIZIONE = 6;
  private static int PFL_ORDINDAIMPUT_INFODOC = 7;
  private static int PFL_ORDINDAIMPUT_ESERCIZIO = 8;
  private static int PFL_ORDINDAIMPUT_CAPITOLO = 9;
  private static int PFL_ORDINDAIMPUT_ARTICOLO = 10;
  private static int PFL_ORDINDAIMPUT_INFOVOCEPEG = 11;
  private static int PFL_ORDINDAIMPUT_ANNOIMP = 12;
  private static int PFL_ORDINDAIMPUT_NUMEROIMP = 13;
  private static int PFL_ORDINDAIMPUT_ANNOSUBIMP = 14;
  private static int PFL_ORDINDAIMPUT_ANNOPROG = 15;
  private static int PFL_ORDINDAIMPUT_NUMEROPROG = 16;
  private static int PFL_ORDINDAIMPUT_NUMEROACC = 17;
  private static int PFL_ORDINDAIMPUT_ANNOACC = 18;
  private static int PFL_ORDINDAIMPUT_PROGRESSIVO = 19;
  private static int PFL_ORDINDAIMPUT_NUMEROSUBIMP = 20;
  private static int PFL_ORDINDAIMPUT_DOCUMENLABEL = 21;
  private static int PFL_ORDINDAIMPUT_CAPITARTLABE = 22;
  private static int PFL_ORDINDAIMPUT_NEWEXPRESSIO = 23;
  private static int PFL_ORDINDAIMPUT_CONFERMLABEL = 24;
  private static int PFL_ORDINDAIMPUT_INFOACC = 25;
  private static int PFL_ORDINDAIMPUT_ACCERTLABEL1 = 26;

  private static int PPQRY_CFA4 = 0;


  IDPanel PAN_ORDINDAIMPUT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR76(IMDB);
    //
    //
    Init_PQRY_PAR93(IMDB);
    Init_PQRY_PAR93_RS(IMDB);
    Init_PQRY_CFA4(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR76(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR76, 3);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR76, "TBL_PAR76");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR76,IMDBDef6.FLD_PAR76_ROWNAMDADODA, "ROWNAMDADODA");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR76,IMDBDef6.FLD_PAR76_ROWNAMDADODA,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR76,IMDBDef6.FLD_PAR76_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR76,IMDBDef6.FLD_PAR76_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR76,IMDBDef6.FLD_PAR76_RONASODOGICO, "RONASODOGICO");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR76,IMDBDef6.FLD_PAR76_RONASODOGICO,1,1,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR76, 0);
  }

  private static void Init_PQRY_PAR93(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR93, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR93, "PQRY_PAR93");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR93,IMDBDef15.PQSL_PAR93_ROWNAMDADODA, "ROWNAMDADODA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR93,IMDBDef15.PQSL_PAR93_ROWNAMDADODA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR93,IMDBDef15.PQSL_PAR93_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR93,IMDBDef15.PQSL_PAR93_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR93,IMDBDef15.PQSL_PAR93_RONASODOGICO, "RONASODOGICO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR93,IMDBDef15.PQSL_PAR93_RONASODOGICO,1,1,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR93, 0);
  }

  private static void Init_PQRY_PAR93_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR93_RS, 3);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR93_RS, "PQRY_PAR93_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR93_RS,IMDBDef15.PQSL_PAR93_ROWNAMDADODA, "ROWNAMDADODA");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR93_RS,IMDBDef15.PQSL_PAR93_ROWNAMDADODA,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR93_RS,IMDBDef15.PQSL_PAR93_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR93_RS,IMDBDef15.PQSL_PAR93_ROWNAMEAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR93_RS,IMDBDef15.PQSL_PAR93_RONASODOGICO, "RONASODOGICO");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR93_RS,IMDBDef15.PQSL_PAR93_RONASODOGICO,1,1,0);
  }

  private static void Init_PQRY_CFA4(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_CFA4, 23);
    IMDB.set_TblCode(IMDBDef15.PQRY_CFA4, "PQRY_CFA4");
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_IMPORTO,3,14,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_DOC, "NUMERO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_DOC,5,20,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_DOC, "ANNO_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_DOC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_DESCRIZIONE, "DESCRIZIONE");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_DESCRIZIONE,5,40,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_IMP, "ANNO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_IMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_IMP, "NUMERO_IMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_IMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_SUBIMP, "ANNO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_SUBIMP,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORNEWEXPR, "RECORNEWEXPR");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORNEWEXPR,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_PROG, "ANNO_PROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_PROG,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_PROG, "NUMERO_PROG");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_PROG,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_ACC, "ANNO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_ANNO_ACC,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_ACC, "NUMERO_ACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_ACC,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_PROGRESSIVO, "PROGRESSIVO");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_PROGRESSIVO,3,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_D_DATA_DOC, "D_DATA_DOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_D_DATA_DOC,6,10,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_SUBIMP, "NUMERO_SUBIMP");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_NUMERO_SUBIMP,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORDCONFER, "RECORDCONFER");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORDCONFER,1,19,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECINFVOCPEG, "RECINFVOCPEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECINFVOCPEG,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORINFOACC, "RECORINFOACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORINFOACC,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORINFODOC, "RECORINFODOC");
    IMDB.SetFldParams(IMDBDef15.PQRY_CFA4,IMDBDef15.PQSL_CFA4_RECORINFODOC,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_CFA4, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiDaImputazioni(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiDaImputazioni()
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
    FormIdx = MyGlb.FRM_ORDINDAIMPUT;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "DA32971E-DF91-4FB5-A47B-7BEFC8484FCB";
    ResModeW = 2;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 844;
    DesignHeight = 530;
    set_Caption(new IDVariant("Ordinativi Da Imputazioni"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 844;
    Frames[1].Height = 504;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.103175;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 844;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Par";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PAR = new IDPanel(w, this, 2, "PAN_PAR");
    Frames[2].Content = PAN_PAR;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "85389DF1-EA6D-4047-AC75-4656446F5E94");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 304, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 2;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 844;
    Frames[3].Height = 452;
    Frames[3].Caption = "Ordinativi Da Imputazioni";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 452;
    PAN_ORDINDAIMPUT = new IDPanel(w, this, 3, "PAN_ORDINDAIMPUT");
    Frames[3].Content = PAN_ORDINDAIMPUT;
    PAN_ORDINDAIMPUT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_ORDINDAIMPUT.VS = MainFrm.VisualStyleList;
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 844-MyGlb.PAN_OFFS_X, 452-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "2094206C-2ADC-4188-B168-2F397AF5D154");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 908, 296, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_ORDINDAIMPUT.InitStatus = 2;
    PAN_ORDINDAIMPUT_Init();
    PAN_ORDINDAIMPUT_InitFields();
    PAN_ORDINDAIMPUT_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_SALVA29+BaseCmdLinIdx)
      {
        Confirm();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_MENUFUNZAGGI+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_FUNZIOAGGI36+BaseCmdSetIdx, "M" + (MyGlb.CMD_MENUFUNZAGGI+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSIORDIN1+BaseCmdLinIdx)
      {
        ApriEmissioneOrdinativi();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR76, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDINDAIMPUT_PAR93();
      }
      PAN_PAR.UpdatePanel(MainFrm);
      PAN_ORDINDAIMPUT.UpdatePanel(MainFrm);
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
    return (obj instanceof OrdinativiDaImputazioni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiDaImputazioni.class.getName() : (Glb.ClassWithPackage(OrdinativiDaImputazioni.class) ? OrdinativiDaImputazioni.class.getName().substring(OrdinativiDaImputazioni.class.getPackage().getName().length() + 1) : OrdinativiDaImputazioni.class.getName()));
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
    IDVariant v_CAPT = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_CAPT = (new IDVariant("Conferma Documenti Incassati", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef6.TBL_PAR76, IMDBDef6.FLD_PAR76_ROWNAMDADODA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef6.TBL_PAR76, IMDBDef6.FLD_PAR76_ROWNAMEAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef6.TBL_PAR76, IMDBDef6.FLD_PAR76_RONASODOGICO, 0, (new IDVariant(0)));
      set_Caption(IDL.Add(v_CAPT, MainFrm.ESERCIZIO));
      PAN_ORDINDAIMPUT.SetCommandEnabled((new IDVariant(128)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ORDINDAIMPUT.SetCommandEnabled((new IDVariant(256)).intValue(), (new IDVariant(0)).booleanValue()); 
      PAN_ORDINDAIMPUT.SetFieldValidation(PFL_ORDINDAIMPUT_CONFERMA, (new IDVariant(-1)).booleanValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Imputazioni On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_ORDINDAIMPUT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_ORDINDAIMPUT);
      // 
      // Ordinativi Da Imputazioni On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_ORDINDAIMPUT.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDAIMPUT_DEBITORE,(new IDVariant(PAN_ORDINDAIMPUT.FieldText(PFL_ORDINDAIMPUT_DEBITORE))).stringValue()); 
      PAN_ORDINDAIMPUT.set_ToolTip(Glb.OBJ_FIELD,PFL_ORDINDAIMPUT_DESCRIZIONE,(new IDVariant(PAN_ORDINDAIMPUT.FieldText(PFL_ORDINDAIMPUT_DESCRIZIONE))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "OrdinativiDaImputazioniOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Imputazioni After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_ORDINDAIMPUT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Da Imputazioni After Find Event Body
      // Procedure Body
      // 
      CalcoloSomma();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "OrdinativiDaImputazioniAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Imputazioni On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_ORDINDAIMPUT_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_ORDINDAIMPUT, Cancel);
      // 
      // Ordinativi Da Imputazioni On Validate Row Event Body
      // Procedure Body
      // 
      CalcoloSomma();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "OrdinativiDaImputazioniOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Ordinativi Da Imputazioni On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_ORDINDAIMPUT_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Ordinativi Da Imputazioni On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_ORDINDAIMPUT.Status()).equals((new IDVariant(2)), true))
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MENUFUNZAGGI+BaseCmdLinIdx, (new IDVariant(-1)).booleanValue());
      }
      else
      {
        MainFrm.CmdObj.set_CmdVisible(MyGlb.CMD_MENUFUNZAGGI+BaseCmdLinIdx, (new IDVariant(0)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "OrdinativiDaImputazioniOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Par On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
      // 
      // Par On Validate Row Event Body
      // Procedure Body
      // 
      // if (new IDVariant(PAN_ORDINDAIMPUT.Status()).equals((new IDVariant(3)), true))
      // {
        // PAN_ORDINDAIMPUT.PanelCommand(Glb.PCM_REQUERY);
      // }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "ParOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Confirm
  // **********************************************************************
  public int Confirm ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Confirm Body
      // Procedure Body
      // 
      C2 = PAN_ORDINDAIMPUT.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ORDINDAIMPUT.GotoFirst();
      while (!PAN_ORDINDAIMPUT.RSEOF())
      {
        if (C2.Get("RECORDCONFER").equals((new IDVariant(1)), true))
        {
          SQL = new StringBuffer();
          SQL.append("update CFA set ");
          SQL.append("  ANNO_SUBIMP = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + " ");
          SQL.append("where (PROGRESSIVO = " + IDL.CSql(C2.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        else
        {
          SQL = new StringBuffer();
          SQL.append("update CFA set ");
          SQL.append("  ANNO_SUBIMP = to_number(NULL) ");
          SQL.append("where (PROGRESSIVO = " + IDL.CSql(C2.Get("PROGRESSIVO"), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          MainFrm.Cf4armDBObject.DBO().Execute(SQL);
        }
        PAN_ORDINDAIMPUT.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_ORDINDAIMPUT.PanelCommand(Glb.PCM_REQUERY);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "Confirm", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Doc
  // **********************************************************************
  public int InfoDoc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Doc Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_NUMERO_DOC, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_D_DATA_DOC, 0))))
      {
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_ANNO_PROG, 0));
        IMDB.set_Value(IMDBDef2.TBL_FILTRO10, IMDBDef2.FLD_FILTRO10_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_NUMERO_PROG, 0));
        MainFrm.Show(MyGlb.FRM_INFOFATTURA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "InfoDoc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Acc
  // **********************************************************************
  public int InfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Acc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_NUMERO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_ANNO_ACC, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "InfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Calcolo Somma
  // **********************************************************************
  public int CalcoloSomma ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_SOMMA = new IDVariant(0,IDVariant.DECIMAL);
    int CurPos=0;
    IDCachedRowSet C2;

    try
    {
      TransCount = 0;
      // 
      // Calcolo Somma Body
      // Procedure Body
      // 
      v_SOMMA = new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL);
      C2 = PAN_ORDINDAIMPUT.MasterRS();
      if (C2.size()>0) CurPos = C2.getRow(); else CurPos = 0;
      if (!C2.Bof()) PAN_ORDINDAIMPUT.GotoFirst();
      while (!PAN_ORDINDAIMPUT.RSEOF())
      {
        if (C2.Get("RECORDCONFER").equals((new IDVariant(1)), true))
        {
          v_SOMMA = IDL.Add(v_SOMMA, C2.Get("IMPORTO"));
        }
        PAN_ORDINDAIMPUT.GotoNext();
      }
      if (CurPos>0) C2.absolute(CurPos);
      PAN_PAR.set_FieldText(PFL_PAR_NEWPANELLABE, IDL.ToString(v_SOMMA).stringValue());
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "CalcoloSomma", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Voci Bilancio
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ApriInfoVociBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Voci Bilancio Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_CFA4, IMDBDef15.PQSL_CFA4_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Emissione Ordinativi
  // **********************************************************************
  public int ApriEmissioneOrdinativi ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Emissione Ordinativi Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_EMISSIORDINA, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaImputazioni", "ApriEmissioneOrdinativi", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ORDINDAIMPUT_PAR93() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR93_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR76, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR76, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR93_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR93_RS, 0, IMDBDef6.TBL_PAR76, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR93_RS, 0, 0, IMDBDef6.TBL_PAR76, IMDBDef6.FLD_PAR76_ROWNAMDADODA, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR93_RS, 1, 0, IMDBDef6.TBL_PAR76, IMDBDef6.FLD_PAR76_ROWNAMEAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR93_RS, 2, 0, IMDBDef6.TBL_PAR76, IMDBDef6.FLD_PAR76_RONASODOGICO, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR76, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR76, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR76, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR93_RS, 0);
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
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PAR);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
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

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_ORDINDAIMPUT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_ORDINDAIMPUT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_ORDINDAIMPUT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_ORDINDAIMPUT_INFODOC)
    {
      this.IdxPanelActived = this.PAN_ORDINDAIMPUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDoc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDAIMPUT_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_ORDINDAIMPUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDAIMPUT_CONFERMLABEL)
    {
      this.IdxPanelActived = this.PAN_ORDINDAIMPUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Confirm();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_ORDINDAIMPUT_INFOACC)
    {
      this.IdxPanelActived = this.PAN_ORDINDAIMPUT.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_ORDINDAIMPUT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_ORDINDAIMPUT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_ORDINDAIMPUT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 5);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, "45CC310A-2DED-48CC-9639-F35802D8C47B");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, "Data Documenti dal");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_AL, "6E6A60B7-A30B-49D5-BB0D-5C1A912A25DE");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_AL, "Al");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_AL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, "28ACC7CC-1AF3-4D4C-A28F-EA58174E1992");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, "Solo Documenti Già Confermati");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, "92EB9BE6-4B34-4D9B-88B7-2C1EF2A75F51");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, "Totale Confermati");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, "029D271D-D7C6-4983-AE19-B451DE137C8C");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, "0");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.VIS_NORFIECF4IMP);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_LIST, 0, 36, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_LIST, 104);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_LIST, "Data Documenti dal");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_FORM, 0, 4, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_FORM, 120);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_DATADOCUMDAL, MyGlb.PANEL_FORM, "Data Documenti dal");
    PAN_PAR.SetFieldPage(PFL_PAR_DATADOCUMDAL, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_DATADOCUMDAL, PPQRY_PAR93, "A.ROWNAMDADODA", "ROWNAMDADODA", 6, 14, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 152, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 20);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 208, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 20);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PAR.SetFieldPage(PFL_PAR_AL, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_AL, PPQRY_PAR93, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_LIST, 256, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_LIST, 156);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_LIST, "Sl. Doc. Già Cnf.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_FORM, 316, 4, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_FORM, 192);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SOLDOCGIACON, MyGlb.PANEL_FORM, "Solo Documenti Già Confermati");
    PAN_PAR.SetFieldPage(PFL_PAR_SOLDOCGIACON, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SOLDOCGIACON, PPQRY_PAR93, "A.RONASODOGICO", "RONASODOGICO", 1, 1, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_SOLDOCGIACON, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_SOLDOCGIACON, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, MyGlb.PANEL_LIST, 504, 4, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, MyGlb.PANEL_FORM, 572, 4, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_TOTALECONFER, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_TOTALECONFER, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_TOTALECONFER, -1, "", "TOTALECONFER", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 608, 4, 84, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 696, 4, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_NEWPANELLABE, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR93", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR93, IMDBDef15.PQRY_PAR93_RS, IMDBDef6.TBL_PAR76);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_DATADOCUMDAL, IMDBDef6.FLD_PAR76_ROWNAMDADODA);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_AL, IMDBDef6.FLD_PAR76_ROWNAMEAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_SOLDOCGIACON, IMDBDef6.FLD_PAR76_RONASODOGICO);
    PAN_PAR.SetMasterTable(0, "PAR76");
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

  private void PAN_ORDINDAIMPUT_Init()
  {

    PAN_ORDINDAIMPUT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_ORDINDAIMPUT.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_ORDINDAIMPUT.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, "756B200B-A7FC-412B-8A29-6F86303FEF52");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, "Conferma");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.VIS_CHECKSTYLE);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, "261094EC-55B9-4E68-BD61-CA5F3E4026E7");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, "Importo");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, "9E86EA68-AE84-41C8-B610-5BD471A997B6");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, "Debitore");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, "020C2418-36B2-457C-94CF-DB212CF27222");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, "NUMERO DOC");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, "8E5A6DD7-789F-470B-B17C-8F59C7A9576E");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, "D DATA DOC");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, "55A46D7B-FEC0-463E-83E5-9F564901E479");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, "ANNO DOC");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, "6BCB3495-EF6B-400B-B5B7-D33460A31DF1");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, "DESCRIZIONE");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, "56F575B6-28B4-42B7-B5F0-88D805A267D4");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, "Info Doc");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, "Info Documento");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, "FC0C166A-A99D-462F-ADD6-C57B3B71F074");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, "ESERCIZIO");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, 0, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, "337560B3-F0C3-44F1-8119-5E9587EE83D6");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, "CAPITOLO");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, "6DAD956B-5FF7-4778-BB76-330A772D2EFD");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, "ARTICOLO");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, "8EB09B73-4F2C-4AC9-B7FD-7885F1DAC715");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, "Info Voce Peg");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, "If (not (Is Null (CFA CAPITOLO)), Info, \"\")");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, "E7A67D9A-D486-4C2E-8261-791459A1DF00");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, "ANNO IMP");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, "6DD983A8-E7B2-4558-AC3E-8C5AC36559BF");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, "NUMERO IMP");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, "0809786B-BA7A-4FB3-8A60-8D3BDD2B82E9");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, "ANNO SUBIMP");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, "ADE36434-5ADB-452D-81C2-D1D68D3F3D33");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, "ANNO PROG");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, 0, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, "8D6DBA04-0A15-4BDD-8CD4-60A08CFEB767");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, "NUMERO PROG");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, 0, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, "14494D5C-6871-407A-81A7-D8BC66F9D2CD");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, "NUMERO ACC");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, "520F6CD1-664E-4F0F-B6EA-78283409326C");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, "ANNO ACC");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, "28829175-425F-482D-8995-A929BBFF7D52");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, "PROGRESSIVO");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, "BFDBDB60-980F-4D71-8B4B-64F538648971");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, "NUMERO SUBIMP");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, "7E744E21-E6F1-448D-A9C9-1C041569269E");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, "Documento");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, "1ACB12A6-25BD-42D4-B290-AF0E04D62BAD");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, "Capitolo/Art.");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, "D9C8CE6B-B0BD-4674-9605-98E63B4A14B0");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, "New Expression");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, "");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.VIS_NORMFIELPADR);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, "561B7E44-191F-415A-8B8A-EC881358DE9E");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, "Conferma");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, MyGlb.VIS_STATICBUTTON);
    PAN_ORDINDAIMPUT.SetImage(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, 0, "button1.gif", false);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, 0 | MyGlb.FLD_INLIST | MyGlb.FLD_CANACTIVATE, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, "35732112-2471-4164-91C8-FED99010A404");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, "Info Acc");
    PAN_ORDINDAIMPUT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, "Info Accertamento");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_ORDINDAIMPUT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, "0B589D3A-5CFA-4F4C-A333-D73E45D35808");
    PAN_ORDINDAIMPUT.set_Header(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, "Accertamento");
    PAN_ORDINDAIMPUT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, MyGlb.VIS_LABEVISUSTYL);
    PAN_ORDINDAIMPUT.SetFlags(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_ORDINDAIMPUT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_LIST, 56);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_LIST, "Conferma");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_FORM, 4, 412, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_FORM, 56);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMA, MyGlb.PANEL_FORM, "Conf.");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_CONFERMA, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldUnbound(PFL_ORDINDAIMPUT_CONFERMA, true);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_CONFERMA, PPQRY_CFA4, "CASE WHEN NOT ((B.ANNO_SUBIMP IS NULL)) THEN 1 ELSE 0 END", "RECORDCONFER", 1, 19, 0, -13997);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_CONFERMA, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_CONFERMA, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_LIST, 64, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_FORM, 4, 4, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_IMPORTO, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_IMPORTO, PPQRY_CFA4, "B.IMPORTO", "IMPORTO", 3, 14, 2, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_LIST, 144, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_LIST, 100);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_FORM, 4, 28, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_FORM, 100);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_DEBITORE, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_DEBITORE, PPQRY_CFA4, "A.RAGIONE_SOCIALE_ESTESA", "REBERASOESES", 5, 60, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_LIST, 352, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_LIST, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_LIST, "NUMERO DOC");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_FORM, 4, 52, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_FORM, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMERODOC, MyGlb.PANEL_FORM, "NUM. DOC");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_NUMERODOC, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_NUMERODOC, PPQRY_CFA4, "C.NUMERO_DOC", "NUMERO_DOC", 5, 20, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_LIST, 416, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_LIST, 72);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_LIST, "D DATA DOC");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_FORM, 4, 412, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_FORM, 72);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DDATADOC, MyGlb.PANEL_FORM, "D DT. DOC");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_DDATADOC, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_DDATADOC, PPQRY_CFA4, "C.D_DATA_DOC", "D_DATA_DOC", 6, 10, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_LIST, 452, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_LIST, 64);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_LIST, "ANNO DOC");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_FORM, 4, 76, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_FORM, 64);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNODOC, MyGlb.PANEL_FORM, "ANNO DOC");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ANNODOC, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ANNODOC, PPQRY_CFA4, "C.ANNO_DOC", "ANNO_DOC", 1, 4, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_LIST, 480, 36, 144, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_LIST, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_LIST, "DESCRIZIONE");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 100, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DESCRIZIONE, MyGlb.PANEL_FORM, "DESCR.");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_DESCRIZIONE, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_DESCRIZIONE, PPQRY_CFA4, "D.DESCRIZIONE", "DESCRIZIONE", 5, 40, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_LIST, 624, 36, 20, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_LIST, 52);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_LIST, "I. D.");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_FORM, 4, 580, 484, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_FORM, 52);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFODOC, MyGlb.PANEL_FORM, "Info Doc");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_INFODOC, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldUnbound(PFL_ORDINDAIMPUT_INFODOC, true);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_INFODOC, PPQRY_CFA4, "CASE WHEN NOT ((C.NUMERO_DOC IS NULL)) THEN 'I' ELSE NULL END", "RECORINFODOC", 5, 99, 0, -13997);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFODOC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_LIST, 724, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_FORM, 4, 124, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ESERCIZIO, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ESERCIZIO, PPQRY_CFA4, "B.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_LIST, 644, 36, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_FORM, 4, 172, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_CAPITOLO, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_CAPITOLO, PPQRY_CFA4, "B.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_LIST, 740, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_LIST, "A.");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_FORM, 4, 196, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ARTICOLO, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ARTICOLO, PPQRY_CFA4, "B.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_LIST, 764, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_LIST, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_LIST, "I. V. P.");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_FORM, 4, 532, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_FORM, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOVOCEPEG, MyGlb.PANEL_FORM, "Info Voce Peg");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_INFOVOCEPEG, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldUnbound(PFL_ORDINDAIMPUT_INFOVOCEPEG, true);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_INFOVOCEPEG, PPQRY_CFA4, "CASE WHEN NOT ((B.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END", "RECINFVOCPEG", 5, 99, 0, -13997);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOVOCEPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_LIST, 916, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_LIST, 60);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_LIST, "ANNO IMP");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_FORM, 4, 220, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_FORM, 60);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOIMP, MyGlb.PANEL_FORM, "ANN. IMP");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ANNOIMP, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ANNOIMP, PPQRY_CFA4, "B.ANNO_IMP", "ANNO_IMP", 1, 4, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_LIST, 976, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_LIST, 72);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_LIST, "NUMERO IMP");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_FORM, 4, 244, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_FORM, 72);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROIMP, MyGlb.PANEL_FORM, "NUM. IMP");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_NUMEROIMP, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_NUMEROIMP, PPQRY_CFA4, "B.NUMERO_IMP", "NUMERO_IMP", 1, 5, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_LIST, 1048, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_LIST, 80);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_LIST, "ANNO SUBIMP");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_FORM, 4, 268, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_FORM, 80);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOSUBIMP, MyGlb.PANEL_FORM, "ANN. SUBIMP");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ANNOSUBIMP, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ANNOSUBIMP, PPQRY_CFA4, "B.ANNO_SUBIMP", "ANNO_SUBIMP", 1, 4, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_LIST, 1128, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_LIST, 68);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_LIST, "ANNO PROG");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_FORM, 4, 292, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_FORM, 68);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOPROG, MyGlb.PANEL_FORM, "ANN. PROG");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ANNOPROG, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ANNOPROG, PPQRY_CFA4, "B.ANNO_PROG", "ANNO_PROG", 1, 4, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_LIST, 1196, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_LIST, 84);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_LIST, "NUMERO PROG");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_FORM, 4, 316, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_FORM, 84);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROPROG, MyGlb.PANEL_FORM, "NUM. PROG");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_NUMEROPROG, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_NUMEROPROG, PPQRY_CFA4, "B.NUMERO_PROG", "NUMERO_PROG", 1, 5, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_LIST, 788, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_LIST, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_LIST, "NUMERO ACC");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_FORM, 4, 364, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_FORM, 76);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROACC, MyGlb.PANEL_FORM, "NUM. ACC");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_NUMEROACC, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_NUMEROACC, PPQRY_CFA4, "B.NUMERO_ACC", "NUMERO_ACC", 1, 5, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_LIST, 844, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_LIST, 64);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_LIST, "ANNO ACC");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_FORM, 4, 340, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_FORM, 64);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ANNOACC, MyGlb.PANEL_FORM, "ANNO ACC");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ANNOACC, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ANNOACC, PPQRY_CFA4, "B.ANNO_ACC", "ANNO_ACC", 1, 4, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_LIST, 1420, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_LIST, 80);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_LIST, "PROGR.");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_FORM, 4, 388, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_FORM, 80);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_PROGRESSIVO, MyGlb.PANEL_FORM, "PROGR.");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_PROGRESSIVO, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_PROGRESSIVO, PPQRY_CFA4, "B.PROGRESSIVO", "PROGRESSIVO", 3, 10, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 0, 36, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 92);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_LIST, "NUMERO SUBIMP");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 4, 412, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 92);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NUMEROSUBIMP, MyGlb.PANEL_FORM, "NUM. SUBIMP");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_NUMEROSUBIMP, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_NUMEROSUBIMP, PPQRY_CFA4, "B.NUMERO_SUBIMP", "NUMERO_SUBIMP", 1, 5, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, MyGlb.PANEL_LIST, 352, 0, 296, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, MyGlb.PANEL_LIST, 2);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, MyGlb.PANEL_FORM, 344, 4, 376, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_DOCUMENLABEL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_DOCUMENLABEL, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_DOCUMENLABEL, -1, "", "DOCUMENLABEL", 0, 0, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, MyGlb.PANEL_LIST, 642, 0, 144, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, MyGlb.PANEL_LIST, 2);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, MyGlb.PANEL_FORM, 788, 0, 192, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CAPITARTLABE, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_CAPITARTLABE, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_CAPITARTLABE, -1, "", "CAPITARTLABE", 0, 0, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_LIST, 84);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_LIST, "New Expression");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_FORM, 4, 436, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_FORM, 84);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_NEWEXPRESSIO, MyGlb.PANEL_FORM, "New Expres.");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_NEWEXPRESSIO, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldUnbound(PFL_ORDINDAIMPUT_NEWEXPRESSIO, true);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_NEWEXPRESSIO, PPQRY_CFA4, "SIGN(NVL(B.ANNO_SUBIMP, 0))", "RECORNEWEXPR", 1, 19, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, MyGlb.PANEL_LIST, 660, 304, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, MyGlb.PANEL_FORM, 0, 312, 72, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_CONFERMLABEL, MyGlb.PANEL_FORM, 1);
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_CONFERMLABEL, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_CONFERMLABEL, -1, "", "CONFERMLABEL", 0, 0, 0, -13997);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_LIST, 884, 36, 24, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_LIST, 48);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_LIST, "In. Ac.");
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_FORM, 4, 484, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_FORM, 48);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDAIMPUT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_INFOACC, MyGlb.PANEL_FORM, "Info Acc");
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_INFOACC, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldUnbound(PFL_ORDINDAIMPUT_INFOACC, true);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_INFOACC, PPQRY_CFA4, "CASE WHEN NOT ((B.NUMERO_ACC IS NULL)) THEN 'I' ELSE NULL END", "RECORINFOACC", 5, 99, 0, -13997);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_ORDINDAIMPUT.SetValueListItem(PFL_ORDINDAIMPUT_INFOACC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, MyGlb.PANEL_LIST, 786, 0, 124, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, MyGlb.PANEL_LIST, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, MyGlb.PANEL_LIST, 2);
    PAN_ORDINDAIMPUT.SetRect(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, MyGlb.PANEL_FORM, 924, 8, 140, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_ORDINDAIMPUT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, MyGlb.PANEL_FORM, 0);
    PAN_ORDINDAIMPUT.SetNumRow(MyGlb.OBJ_FIELD, PFL_ORDINDAIMPUT_ACCERTLABEL1, MyGlb.PANEL_FORM, 2);
    PAN_ORDINDAIMPUT.SetFieldPage(PFL_ORDINDAIMPUT_ACCERTLABEL1, -1, -1);
    PAN_ORDINDAIMPUT.SetFieldPanel(PFL_ORDINDAIMPUT_ACCERTLABEL1, -1, "", "ACCERTLABEL1", 0, 0, 0, -13997);
  }

  private void PAN_ORDINDAIMPUT_InitQueries()
  {
    StringBuffer SQL;

    PAN_ORDINDAIMPUT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_ORDINDAIMPUT.SetIMDB(IMDB, "PQRY_CFA4", true);
    PAN_ORDINDAIMPUT.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.IMPORTO as IMPORTO, ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
    SQL.append("  C.NUMERO_DOC as NUMERO_DOC, ");
    SQL.append("  C.ANNO_DOC as ANNO_DOC, ");
    SQL.append("  D.DESCRIZIONE as DESCRIZIONE, ");
    SQL.append("  B.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  B.CAPITOLO as CAPITOLO, ");
    SQL.append("  B.ARTICOLO as ARTICOLO, ");
    SQL.append("  B.ANNO_IMP as ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP as NUMERO_IMP, ");
    SQL.append("  B.ANNO_SUBIMP as ANNO_SUBIMP, ");
    SQL.append("  SIGN(NVL(B.ANNO_SUBIMP, 0)) as RECORNEWEXPR, ");
    SQL.append("  B.ANNO_PROG as ANNO_PROG, ");
    SQL.append("  B.NUMERO_PROG as NUMERO_PROG, ");
    SQL.append("  B.ANNO_ACC as ANNO_ACC, ");
    SQL.append("  B.NUMERO_ACC as NUMERO_ACC, ");
    SQL.append("  B.PROGRESSIVO as PROGRESSIVO, ");
    SQL.append("  C.D_DATA_DOC as D_DATA_DOC, ");
    SQL.append("  B.NUMERO_SUBIMP as NUMERO_SUBIMP, ");
    SQL.append("  CASE WHEN NOT ((B.ANNO_SUBIMP IS NULL)) THEN 1 ELSE 0 END as RECORDCONFER, ");
    SQL.append("  CASE WHEN NOT ((B.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END as RECINFVOCPEG, ");
    SQL.append("  CASE WHEN NOT ((B.NUMERO_ACC IS NULL)) THEN 'I' ELSE NULL END as RECORINFOACC, ");
    SQL.append("  CASE WHEN NOT ((C.NUMERO_DOC IS NULL)) THEN 'I' ELSE NULL END as RECORINFODOC ");
    PAN_ORDINDAIMPUT.SetQuery(PPQRY_CFA4, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BEN A, ");
    SQL.append("  CFA B, ");
    SQL.append("  FAT C, ");
    SQL.append("  T03 D ");
    PAN_ORDINDAIMPUT.SetQuery(PPQRY_CFA4, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.CODICE_DOC = D.CODICE(+)) ");
    SQL.append("and   (C.CODICE = A.CODICE(+)) ");
    SQL.append("and   (C.STORNO = D.STORNO(+)) ");
    SQL.append("and   (B.ANNO_PROG = C.ANNO_PROG) ");
    SQL.append("and   (B.NUMERO_PROG = C.NUMERO_PROG) ");
    SQL.append("and   ((~~PQRY_PAR93.ROWNAMDADODA~~ IS NULL) OR C.D_DATA_DOC >= ~~PQRY_PAR93.ROWNAMDADODA~~) ");
    SQL.append("and   ((~~PQRY_PAR93.ROWNAMEAL~~ IS NULL) OR C.D_DATA_DOC <= ~~PQRY_PAR93.ROWNAMEAL~~) ");
    SQL.append("and   ((B.FLAG_LIQUIDATO IS NULL)) ");
    SQL.append("and   (C.CODICE_DOC = 3 OR C.CODICE_DOC = 6 OR C.CODICE_DOC = 8) ");
    SQL.append("and   (C.IMPORTO + NVL(C.VARIAZIONI, 0) <> 0) ");
    SQL.append("and   (~~PQRY_PAR93.RONASODOGICO~~ = 0 OR (NOT ((B.ANNO_SUBIMP IS NULL)) AND ~~PQRY_PAR93.RONASODOGICO~~ = 1)) ");
    SQL.append("and   (B.E_S = 'E') ");
    PAN_ORDINDAIMPUT.SetQuery(PPQRY_CFA4, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINDAIMPUT.SetQuery(PPQRY_CFA4, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_ORDINDAIMPUT.SetQuery(PPQRY_CFA4, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.RAGIONE_SOCIALE_ESTESA, ");
    SQL.append("  C.D_DATA_DOC, ");
    SQL.append("  C.NUMERO_DOC, ");
    SQL.append("  B.ANNO_IMP, ");
    SQL.append("  B.NUMERO_IMP, ");
    SQL.append("  B.ANNO_SUBIMP, ");
    SQL.append("  B.NUMERO_SUBIMP ");
    PAN_ORDINDAIMPUT.SetQuery(PPQRY_CFA4, 5, SQL, -1, "");
    PAN_ORDINDAIMPUT.SetQueryDB(PPQRY_CFA4, MainFrm.Cf4armDBObject.DB, 4);
    PAN_ORDINDAIMPUT.SetMasterTable(0, "CFA");
    PAN_ORDINDAIMPUT.AddToSortList(PFL_ORDINDAIMPUT_DEBITORE, true);
    PAN_ORDINDAIMPUT.AddToSortList(PFL_ORDINDAIMPUT_DDATADOC, true);
    PAN_ORDINDAIMPUT.AddToSortList(PFL_ORDINDAIMPUT_NUMERODOC, true);
    PAN_ORDINDAIMPUT.AddToSortList(PFL_ORDINDAIMPUT_ANNOIMP, true);
    PAN_ORDINDAIMPUT.AddToSortList(PFL_ORDINDAIMPUT_NUMEROIMP, true);
    PAN_ORDINDAIMPUT.AddToSortList(PFL_ORDINDAIMPUT_ANNOSUBIMP, true);
    PAN_ORDINDAIMPUT.AddToSortList(PFL_ORDINDAIMPUT_NUMEROSUBIMP, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_ORDINDAIMPUT.Status() == 2)
    {
      int oldListQBE = PAN_ORDINDAIMPUT.iUseListQBE;
      PAN_ORDINDAIMPUT.iUseListQBE = 0;
      PAN_ORDINDAIMPUT.PanelCommand(Glb.PCM_SEARCH);
      PAN_ORDINDAIMPUT.PanelCommand(Glb.PCM_FIND);
      PAN_ORDINDAIMPUT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_ORDINDAIMPUT) PAN_ORDINDAIMPUT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
    if (SrcObj == PAN_ORDINDAIMPUT) PAN_ORDINDAIMPUT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
    if (SrcObj == PAN_ORDINDAIMPUT) PAN_ORDINDAIMPUT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_ORDINDAIMPUT) PAN_ORDINDAIMPUT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_ORDINDAIMPUT) PAN_ORDINDAIMPUT_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_ORDINDAIMPUT) PAN_ORDINDAIMPUT_AfterFind(CmdFind);
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
    if (SrcObj == PAN_ORDINDAIMPUT) PAN_ORDINDAIMPUT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
