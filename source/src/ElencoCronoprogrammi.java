// **********************************************
// Elenco Cronoprogrammi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class ElencoCronoprogrammi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PATS_ESERCDIISCRI = 0;
  private static int PFL_PATS_CAPITOLO1 = 1;
  private static int PFL_PATS_ARTICOLO1 = 2;
  private static int PFL_PATS_ETICHSCELCAP = 3;
  private static int PFL_PATS_INFOCAP = 4;
  private static int PFL_PATS_TUTTIICAPITO = 5;

  private static int PPQRY_PATS2 = 0;


  IDPanel PAN_PATS;
  private static int PFL_CRONOPROGRAM_CAPITOLO = 0;
  private static int PFL_CRONOPROGRAM_ARTICOLO = 1;
  private static int PFL_CRONOPROGRAM_DESCRIZIONE = 2;
  private static int PFL_CRONOPROGRAM_PROGUNITORGA = 3;
  private static int PFL_CRONOPROGRAM_DESCRIZIONUO = 4;
  private static int PFL_CRONOPROGRAM_IMPORTO = 5;
  private static int PFL_CRONOPROGRAM_ESERCIISCRIZ = 6;
  private static int PFL_CRONOPROGRAM_ENTRESIGDIFF = 7;
  private static int PFL_CRONOPROGRAM_ESERCIENTRAT = 8;
  private static int PFL_CRONOPROGRAM_OPERA = 9;
  private static int PFL_CRONOPROGRAM_APRICRONO = 10;
  private static int PFL_CRONOPROGRAM_CRONOPROGRID = 11;
  private static int PFL_CRONOPROGRAM_DESCRIPROGET = 12;
  private static int PFL_CRONOPROGRAM_CRONIDNONDEF = 13;
  private static int PFL_CRONOPROGRAM_IMPORTINIZIA = 14;
  private static int PFL_CRONOPROGRAM_IMPORTATTUAL = 15;
  private static int PFL_CRONOPROGRAM_PROGETTOID = 16;
  private static int PFL_CRONOPROGRAM_DEFINITO = 17;

  private static int PPQRY_TESTATCRONO1 = 0;

  private static int PPQRY_OPERE = 1;
  private static int PPQRY_DUAL = 2;

  private static int PPQRY_PROGETTI = 3;


  IDPanel PAN_CRONOPROGRAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PATS6(IMDB);
    //
    //
    Init_PQRY_PATS2(IMDB);
    Init_PQRY_PATS2_RS(IMDB);
    Init_PQRY_TESTATCRONO1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PATS6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PATS6, 5);
    IMDB.set_TblCode(IMDBDef3.TBL_PATS6, "TBL_PATS6");
    IMDB.set_FldCode(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMOGGESDIIS, "NOMOGGESDIIS");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMOGGESDIIS,1,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMOGGTUTICA, "NOMOGGTUTICA");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMOGGTUTICA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMEOGGEMODP, "NOMEOGGEMODP");
    IMDB.SetFldParams(IMDBDef3.TBL_PATS6,IMDBDef3.FLD_PATS6_NOMEOGGEMODP,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PATS6, 0);
  }

  private static void Init_PQRY_PATS2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS2, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS2, "PQRY_PATS2");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMOGGESDIIS, "NOMOGGESDIIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMOGGESDIIS,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMOGGTUTICA, "NOMOGGTUTICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2,IMDBDef11.PQSL_PATS2_NOMOGGTUTICA,5,2,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PATS2, 0);
  }

  private static void Init_PQRY_PATS2_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PATS2_RS, 4);
    IMDB.set_TblCode(IMDBDef11.PQRY_PATS2_RS, "PQRY_PATS2_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMOGGESDIIS, "NOMOGGESDIIS");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMOGGESDIIS,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, "NOMEOGGECAPI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMEOGGECAPI,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, "NOMEOGGEARTI");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMEOGGEARTI,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMOGGTUTICA, "NOMOGGTUTICA");
    IMDB.SetFldParams(IMDBDef11.PQRY_PATS2_RS,IMDBDef11.PQSL_PATS2_NOMOGGTUTICA,5,2,0);
  }

  private static void Init_PQRY_TESTATCRONO1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_TESTATCRONO1, 15);
    IMDB.set_TblCode(IMDBDef11.PQRY_TESTATCRONO1, "PQRY_TESTATCRONO1");
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCROCAP, "RECIMPCROCAP");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCROCAP,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCROART, "RECIMPCROART");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCROART,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECORCAPDESC, "RECORCAPDESC");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECORCAPDESC,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_ESERCIZIO_ISCRIZIONE, "ESERCIZIO_ISCRIZIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_ESERCIZIO_ISCRIZIONE,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_REIMCRPRUNOR, "REIMCRPRUNOR");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_REIMCRPRUNOR,1,8,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID, "CRONOPROGRAMMA_ID");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID_NON_DEF, "CRONOPROGRAMMA_ID_NON_DEF");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID_NON_DEF,3,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_IMPORTO_INIZIALE, "IMPORTO_INIZIALE");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_IMPORTO_INIZIALE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_IMPORTO_ATTUALE, "IMPORTO_ATTUALE");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_IMPORTO_ATTUALE,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_ESERCIZIO_ENTRATA, "ESERCIZIO_ENTRATA");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_ESERCIZIO_ENTRATA,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCROIMP, "RECIMPCROIMP");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCROIMP,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RETECRENESDI, "RETECRENESDI");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RETECRENESDI,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECTESCRODEF, "RECTESCRODEF");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECTESCRODEF,5,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCRPRID, "RECIMPCRPRID");
    IMDB.SetFldParams(IMDBDef11.PQRY_TESTATCRONO1,IMDBDef11.PQSL_TESTATCRONO1_RECIMPCRPRID,5,9,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_TESTATCRONO1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public ElencoCronoprogrammi(MyWebEntryPoint w, IMDBObj imdb)
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
  public ElencoCronoprogrammi()
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
    FormIdx = MyGlb.FRM_ELENCOCRONOP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B97BCC5B-7A66-4E02-8821-EC9FEEB3E724";
    ResModeW = 3;
    ResModeH = 3;
    iVisualFlags = -2049;
    DesignWidth = 1052;
    DesignHeight = 390;
    set_Caption(new IDVariant("Elenco Cronoprogrammi"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1052;
    Frames[1].Height = 364;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.0989011;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1052;
    Frames[2].Height = 36;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pats";
    Frames[2].Parent = this;
    Frames[2].FixedWidth = 1052;
    Frames[2].FixedHeight = 36;
    Frames[2].MinWidth = Frames[2].Width;
    Frames[2].MaxWidth = Frames[2].Width;
    Frames[2].MinHeight = Frames[2].Height;
    Frames[2].MaxHeight = Frames[2].Height;
    PAN_PATS = new IDPanel(w, this, 2, "PAN_PATS");
    Frames[2].Content = PAN_PATS;
    PAN_PATS.Lockable = false;
    PAN_PATS.iLocked = false;
    PAN_PATS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PATS.VS = MainFrm.VisualStyleList;
    PAN_PATS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1052-MyGlb.PAN_OFFS_X, 36-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "1E236FFD-2392-4080-B422-E88C23D09C4C");
    PAN_PATS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 268, 156, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PATS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PATS.InitStatus = 1;
    PAN_PATS_Init();
    PAN_PATS_InitFields();
    PAN_PATS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1052;
    Frames[3].Height = 328;
    Frames[3].Caption = "Cronoprogrammi";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 328;
    PAN_CRONOPROGRAM = new IDPanel(w, this, 3, "PAN_CRONOPROGRAM");
    Frames[3].Content = PAN_CRONOPROGRAM;
    PAN_CRONOPROGRAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CRONOPROGRAM.VS = MainFrm.VisualStyleList;
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1052-MyGlb.PAN_OFFS_X, 328-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "3DC69948-F79A-4B64-B755-7585E7C96F88");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1584, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CRONOPROGRAM.InitStatus = 1;
    PAN_CRONOPROGRAM_Init();
    PAN_CRONOPROGRAM_InitFields();
    PAN_CRONOPROGRAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PATS6, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ELENCOCRONOP_PATS2();
      }
      PAN_PATS.UpdatePanel(MainFrm);
      PAN_CRONOPROGRAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PATS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PATS_CAPITOLO1) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCECAPARSEUO && flRis && IdxPanelActived == PAN_PATS.FrIndex)
    {
      if (IdxFieldActived ==PFL_PATS_ETICHSCELCAP) {
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
    return (obj instanceof ElencoCronoprogrammi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? ElencoCronoprogrammi.class.getName() : (Glb.ClassWithPackage(ElencoCronoprogrammi.class) ? ElencoCronoprogrammi.class.getName().substring(ElencoCronoprogrammi.class.getPackage().getName().length() + 1) : ElencoCronoprogrammi.class.getName()));
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
      LOAD_PATSDELETE();
      IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGESDIIS, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGTUTICA, 0, (new IDVariant("SI")));
      PAN_CRONOPROGRAM.Freezed = (new IDVariant(-1)).booleanValue();
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).compareTo((new IDVariant("CFA")), true)!=0)
      {
        if (MainFrm.ControllaEsefin(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)).compareTo((new IDVariant(3)), true)<0)
        {
          if ((IDL.Today().compareTo(IDL.NullValue(MainFrm.INIZGESTCRON,(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))), true)>=0 && IDL.Today().compareTo(IDL.NullValue(MainFrm.FINEGESTCRON,(new IDVariant("2999/12/31# 00:00:00", IDVariant.DATETIME))), true)<=0))
          {
            IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEMODP, 0, (new IDVariant("SI")));
          }
          else
          {
            IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEMODP, 0, (new IDVariant("NO")));
          }
        }
        else
        {
          IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEMODP, 0, (new IDVariant("SI")));
        }
      }
      else
      {
        IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEMODP, 0, (new IDVariant("SI")));
      }
      PAN_CRONOPROGRAM.TooltipOnEachRow = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "Load", _e);
    }
  }

  // **********************************************************************
  // Pats: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PATSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGESDIIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGTUTICA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEMODP, 0, new IDVariant());
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
      UNLOAD_PATSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pats: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PATSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGESDIIS, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGTUTICA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGECAPI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEARTI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEMODP, 0, new IDVariant());
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
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCCADACAECUJ)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP29, IMDBDef7.PQSL_CAP29_ARTICOLO, 0));
        }
        if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARSEUO)), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_CAPITOLO, 0));
          IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, 0, IMDB.Value(IMDBDef7.PQRY_CAP5, IMDBDef7.PQSL_CAP5_ARTICOLO, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Pats On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PATS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pats On Updating Row Body
      // Corpo Procedura
      // 
      if ((Column.equals((new IDVariant(PFL_PATS_CAPITOLO1)), true) || Column.equals((new IDVariant(PFL_PATS_ARTICOLO1)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP A ");
          SQL.append("where (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = 'S') ");
          SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
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
            S = (new IDVariant("Capitolo inesistente"));
            MainFrm.set_AlertMessage(S); 
            IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, 0, (new IDVariant()));
          }
        }
      }
      if (Column.equals((new IDVariant(PFL_PATS_TUTTIICAPITO)), true) && FieldWasModified.booleanValue())
      {
        if (IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMOGGTUTICA, 0).equals((new IDVariant("SI")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "PatsOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Pats On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PATS_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PATS);
      // 
      // Pats On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMOGGTUTICA, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_INFOCAP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_PATS.SetFlags (Glb.OBJ_FIELD, PFL_PATS_INFOCAP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "PatsOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Cronoprogrammi On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_CRONOPROGRAM.Freezed = (new IDVariant(0)).booleanValue();
        PAN_CRONOPROGRAM_InitQueries();
      }
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_CRONOPROGRAM.Freezed = (new IDVariant(-1)).booleanValue();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "CronoprogrammiOnCommand", _e);
    }
  }

  // **********************************************************************
  // Cronoprogrammi On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CRONOPROGRAM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CRONOPROGRAM);
      // 
      // Cronoprogrammi On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_CRONOPROGRAM.set_ToolTip(Glb.OBJ_FIELD,PFL_CRONOPROGRAM_DESCRIPROGET,(new IDVariant(PAN_CRONOPROGRAM.FieldText(PFL_CRONOPROGRAM_DESCRIPROGET))).stringValue()); 
      PAN_CRONOPROGRAM.set_ToolTip(Glb.OBJ_FIELD,PFL_CRONOPROGRAM_DESCRIZIONE,(new IDVariant(PAN_CRONOPROGRAM.FieldText(PFL_CRONOPROGRAM_DESCRIZIONE))).stringValue()); 
      PAN_CRONOPROGRAM.set_ToolTip(Glb.OBJ_FIELD,PFL_CRONOPROGRAM_DESCRIZIONUO,(new IDVariant(PAN_CRONOPROGRAM.FieldText(PFL_CRONOPROGRAM_DESCRIZIONUO))).stringValue()); 
      PAN_CRONOPROGRAM.set_ToolTip(Glb.OBJ_FIELD,PFL_CRONOPROGRAM_PROGETTOID,(new IDVariant(PAN_CRONOPROGRAM.FieldText(PFL_CRONOPROGRAM_PROGETTOID))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "CronoprogrammiOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Apri Scelta Capitolo
  // **********************************************************************
  public int ApriSceltaCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Capitolo Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI150, IMDBDef1.FLD_PARAMETRI150_ROWNAMEES, 0, (new IDVariant("S")));
      MainFrm.Show(MyGlb.FRM_SCECAPARSEUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "ApriSceltaCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Info Cap
  // **********************************************************************
  public int ApriInfoCap ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Info Cap Body
      // Corpo Procedura
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGECAPI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef11.PQRY_PATS2, IMDBDef11.PQSL_PATS2_NOMEOGGEARTI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARPROUNIORG, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIPROGRU1, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "ApriInfoCap", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Crono
  // **********************************************************************
  public int ApriCrono ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Crono Body
      // Corpo Procedura
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_TESTATCRONO1, IMDBDef11.PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID, 0))))
      {
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI511, IMDBDef3.FLD_PARAMETRI511_NOMEOGGETTIU, 0, ((IMDB.Value(IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEMODP, 0).equals((new IDVariant("NO")), true))?(new IDVariant("INFO")):(new IDVariant("U"))));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI511, IMDBDef3.FLD_PARAMETRI511_CRONOPROGRAMMA_ID, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONO1, IMDBDef11.PQSL_TESTATCRONO1_CRONOPROGRAMMA_ID, 0));
        IMDB.set_Value(IMDBDef3.TBL_PARAMETRI511, IMDBDef3.FLD_PARAMETRI511_NOMEOGGEDEFI, 0, IMDB.Value(IMDBDef11.PQRY_TESTATCRONO1, IMDBDef11.PQSL_TESTATCRONO1_RECTESCRODEF, 0));
        MainFrm.Show(MyGlb.FRM_INSAGGCRONOP, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("ElencoCronoprogrammi", "ApriCrono", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pats
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void ELENCOCRONOP_PATS2() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PATS2_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PATS6, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PATS6, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PATS2_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PATS2_RS, 0, IMDBDef3.TBL_PATS6, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS2_RS, 0, 0, IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGESDIIS, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS2_RS, 1, 0, IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGECAPI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS2_RS, 2, 0, IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMEOGGEARTI, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PATS2_RS, 3, 0, IMDBDef3.TBL_PATS6, IMDBDef3.FLD_PATS6_NOMOGGTUTICA, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PATS6, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PATS6, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PATS6, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PATS2_RS, 0);
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
  private void PAN_PATS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PATS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PATS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PATS, Cancel);
    // Stub
  }

  private void PAN_PATS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PATS_CAPITOLO1)
    {
      this.IdxPanelActived = this.PAN_PATS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PATS_ETICHSCELCAP)
    {
      this.IdxPanelActived = this.PAN_PATS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PATS_INFOCAP)
    {
      this.IdxPanelActived = this.PAN_PATS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoCap();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PATS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PATS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PATS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PATS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CRONOPROGRAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CRONOPROGRAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CRONOPROGRAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CRONOPROGRAM, Cancel);
    // Stub
  }

  private void PAN_CRONOPROGRAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CRONOPROGRAM_APRICRONO)
    {
      this.IdxPanelActived = this.PAN_CRONOPROGRAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriCrono();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CRONOPROGRAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_CRONOPROGRAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CRONOPROGRAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PATS_Init()
  {

    PAN_PATS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PATS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PATS.SetSize(MyGlb.OBJ_FIELD, 6);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, "1838BB86-7C34-491A-91B5-5F819F918238");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, "Esercizio di iscrizione");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.VIS_NORMALFIELDS);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, "59A4054D-2F1C-405C-9416-172F7C1CAE98");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, "Capitolo/Art.");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, "227A1A14-81B5-4F51-AABC-9B1A97E7BE5E");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, "/");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, "88D62451-8542-4235-83D0-B1E0224F7D7B");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PATS.SetImage(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, 0, "wsearch1.gif", false);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, "EBD8FF88-32A1-4AC1-B234-660474325813");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PATS.SetImage(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, 0, "info.gif", false);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PATS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, "646E536E-14D0-4974-8408-75C76DDAA311");
    PAN_PATS.set_Header(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, "Tutti i Capitoli");
    PAN_PATS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, "");
    PAN_PATS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PATS.SetFlags(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PATS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, 132);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_LIST, "Esr. di iscr.");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, 4, 4, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, 144);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ESERCDIISCRI, MyGlb.PANEL_FORM, "Esercizio di iscrizione");
    PAN_PATS.SetFieldPage(PFL_PATS_ESERCDIISCRI, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_ESERCDIISCRI, PPQRY_PATS2, "A.NOMOGGESDIIS", "NOMOGGESDIIS", 1, 4, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_LIST, 56);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo/Art.");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_FORM, 332, 4, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_FORM, 84);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo/Art.");
    PAN_PATS.SetFieldPage(PFL_PATS_CAPITOLO1, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_CAPITOLO1, PPQRY_PATS2, "A.NOMEOGGECAPI", "NOMEOGGECAPI", 3, 16, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_LIST, 52);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_LIST, "/");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_FORM, 568, 4, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_FORM, 16);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_ARTICOLO1, MyGlb.PANEL_FORM, "/");
    PAN_PATS.SetFieldPage(PFL_PATS_ARTICOLO1, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_ARTICOLO1, PPQRY_PATS2, "A.NOMEOGGEARTI", "NOMEOGGEARTI", 1, 2, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_LIST, 340, 36, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_LIST, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_FORM, 616, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_FORM, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_ETICHSCELCAP, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetFieldPage(PFL_PATS_ETICHSCELCAP, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_ETICHSCELCAP, -1, "", "ETICHSCELCAP", 0, 0, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_LIST, 348, 44, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_LIST, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_FORM, 636, 8, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_FORM, 0);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_INFOCAP, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetFieldPage(PFL_PATS_INFOCAP, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_INFOCAP, -1, "", "INFOCAP", 0, 0, 0, -13997);
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_LIST, 88);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_LIST, "Tutti i Capitoli");
    PAN_PATS.SetRect(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_FORM, 208, 4, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PATS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_FORM, 88);
    PAN_PATS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PATS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PATS_TUTTIICAPITO, MyGlb.PANEL_FORM, "Tutti i Capitoli");
    PAN_PATS.SetFieldPage(PFL_PATS_TUTTIICAPITO, -1, -1);
    PAN_PATS.SetFieldPanel(PFL_PATS_TUTTIICAPITO, PPQRY_PATS2, "A.NOMOGGTUTICA", "NOMOGGTUTICA", 5, 2, 0, -13997);
    PAN_PATS.SetValueListItem(PFL_PATS_TUTTIICAPITO, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PATS.SetValueListItem(PFL_PATS_TUTTIICAPITO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PATS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PATS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PATS.SetIMDB(IMDB, "PQRY_PATS2", true);
    PAN_PATS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PATS.SetQueryIMDB(PPQRY_PATS2, IMDBDef11.PQRY_PATS2_RS, IMDBDef3.TBL_PATS6);
    JustLoaded = true;
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_ESERCDIISCRI, IMDBDef3.FLD_PATS6_NOMOGGESDIIS);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_CAPITOLO1, IMDBDef3.FLD_PATS6_NOMEOGGECAPI);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_ARTICOLO1, IMDBDef3.FLD_PATS6_NOMEOGGEARTI);
    PAN_PATS.SetFieldPrimaryIndex(PFL_PATS_TUTTIICAPITO, IMDBDef3.FLD_PATS6_NOMOGGTUTICA);
    PAN_PATS.SetMasterTable(0, "PATS6");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PATS.Status() == 2)
    {
      int oldListQBE = PAN_PATS.iUseListQBE;
      PAN_PATS.iUseListQBE = 0;
      PAN_PATS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PATS.PanelCommand(Glb.PCM_FIND);
      PAN_PATS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CRONOPROGRAM_Init()
  {

    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_FIELD, 18);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, "5C84245D-CC31-4840-93CB-F31197CD59B2");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, "Capitolo");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, "8D0A84BE-8603-4CAC-A1A7-7317EF1B89D6");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, "Art.");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, "A46F79FF-EB86-4157-89F6-48D84E6C9707");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, "Descrizione");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, "24CC5EFA-5D0F-4BAE-9A5B-A2AEF3B11190");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, "PROGR UNITA ORGANIZZATIVA");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.VIS_NORMFIELPADR);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, "3C6130B1-1C7F-401D-902A-CE45F6A92B77");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, "Unità Organizzativa");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, "B4112C22-E423-4EF4-A7F4-FC5356F9C549");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, "Importo Imputazione");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, "D738B6F1-AFED-4D98-86BA-8B03F73804D3");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, "Esercizio Iscrizione");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, "A6DF3572-D220-4F50-B30F-72B494ABC870");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, "Entrata Esig. Diff.");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.VIS_CHECKSTYLE);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, "E24EB283-B406-4C1A-A54C-E3B99F0DDA97");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, "Esercizio Entrata");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "B9F2C26A-77BC-4D98-BD2A-CE0045C3AF4C");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "Opera/Progetto");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, "94D2A4B7-2B20-45C4-8676-8953DFC2285B");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, " ");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, "Apri Cronoprogramma");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.VIS_HYPELINKIMMA);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, "316B984A-00C8-4267-9305-22F6FF166CE2");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, "CRONOPROGRAMMA ID");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, "B3C9A68B-A00D-4253-B9E9-47682F7A1BF5");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, "Descrizione");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.VIS_VISULOOUPCF4);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, "1646B648-DC46-49A5-8E2F-560BA04056D1");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, "CRONOPROGRAMMA ID NON DEF");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.VIS_NORMFIELPADR);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, "A2049AC3-06E4-43BB-84DF-0F6A9FCD724D");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, "Importo Iniziale");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, "309C596F-40E2-44EE-8401-2E1C35CC9271");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, "Importo Attuale");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, "20C41287-6059-4D7E-9608-C49303B91EF5");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, "Obiettivo Operativo");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.VIS_NORMALFIELDS);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_CRONOPROGRAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, "9DCEFB31-7F4E-465F-A922-9ED0C9DBA2A3");
    PAN_CRONOPROGRAM.set_Header(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, "DEFINITO");
    PAN_CRONOPROGRAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, "");
    PAN_CRONOPROGRAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.VIS_NORMFIELPADR);
    PAN_CRONOPROGRAM.SetFlags(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, 0 | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_CRONOPROGRAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_FORM, 4, 364, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_FORM, 64);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_CAPITOLO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_CAPITOLO, PPQRY_TESTATCRONO1, "B.CAPITOLO", "RECIMPCROCAP", 3, 16, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_LIST, 128, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_FORM, 4, 388, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_FORM, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ARTICOLO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ARTICOLO, PPQRY_TESTATCRONO1, "B.ARTICOLO", "RECIMPCROART", 1, 2, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_LIST, 160, 36, 184, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_LIST, 84);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 412, 444, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_FORM, 84);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DESCRIZIONE, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DESCRIZIONE, PPQRY_TESTATCRONO1, "C.DESCRIZIONE", "RECORCAPDESC", 5, 140, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_LIST, 332, 36, 184, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_LIST, 184);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_LIST, "PROGR UNITA ORGANIZZATIVA");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_FORM, 4, 448, 236, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_FORM, 184);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGUNITORGA, MyGlb.PANEL_FORM, "PROGR UNITA ORGANIZZATIVA");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_PROGUNITORGA, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_PROGUNITORGA, PPQRY_TESTATCRONO1, "B.PROGR_UNITA_ORGANIZZATIVA", "REIMCRPRUNOR", 1, 8, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_LIST, 344, 36, 188, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_LIST, 128);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_FORM, 4, 496, 640, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_FORM, 128);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_FORM, 2);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIZIONUO, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DESCRIZIONUO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DESCRIZIONUO, PPQRY_DUAL, "DECODE(~~REIMCRPRUNOR~~, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~REIMCRPRUNOR~~,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(~~REIMCRPRUNOR~~,TRUNC( SYSDATE )))", "DESCRIZIONUO", 5, 99, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, 532, 36, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_LIST, "Importo Imputazione");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, 4, 472, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, 64);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTO, MyGlb.PANEL_FORM, "Imp. Imp.");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_IMPORTO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_IMPORTO, PPQRY_TESTATCRONO1, "B.IMPORTO", "RECIMPCROIMP", 3, 14, 2, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, 656, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, 136);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_LIST, "Esercizio Iscrizione");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, 4, 316, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, 136);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIISCRIZ, MyGlb.PANEL_FORM, "Esercizio Iscrizione");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ESERCIISCRIZ, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ESERCIISCRIZ, PPQRY_TESTATCRONO1, "A.ESERCIZIO_ISCRIZIONE", "ESERCIZIO_ISCRIZIONE", 1, 4, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_LIST, 720, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_LIST, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_LIST, "Entrata Esig. Diff.");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_FORM, 4, 532, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_FORM, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ENTRESIGDIFF, MyGlb.PANEL_FORM, "Entrata Esig. Diff.");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ENTRESIGDIFF, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ENTRESIGDIFF, PPQRY_TESTATCRONO1, "A.ENTRATA_ESIG_DIFF", "RETECRENESDI", 5, 2, 0, -13997);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_ENTRESIGDIFF, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_ENTRESIGDIFF, (new IDVariant()), "Null", "", "", -1);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, 780, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, 124);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_LIST, "Esercizio Entrata");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, 4, 340, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, 124);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_ESERCIENTRAT, MyGlb.PANEL_FORM, "Esercizio Entrata");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_ESERCIENTRAT, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_ESERCIENTRAT, PPQRY_TESTATCRONO1, "A.ESERCIZIO_ENTRATA", "ESERCIZIO_ENTRATA", 1, 4, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 840, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_LIST, "Opera Progetto");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 4, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 68);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_OPERA, MyGlb.PANEL_FORM, "Op. Prog.");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_OPERA, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_OPERA, PPQRY_TESTATCRONO1, "A.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_LIST, 900, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_LIST, 100);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_LIST, " ");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_FORM, 4, 556, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_FORM, 100);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_APRICRONO, MyGlb.PANEL_FORM, " ");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_APRICRONO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_APRICRONO, PPQRY_DUAL, "'A'", "APRICRONO", 5, 1, 0, -13997);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_APRICRONO, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, 0, 36, 140, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, 140);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, 4, 4, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, 140);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONOPROGRID, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_CRONOPROGRID, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_CRONOPROGRID, PPQRY_TESTATCRONO1, "A.CRONOPROGRAMMA_ID", "CRONOPROGRAMMA_ID", 3, 10, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, 924, 36, 216, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, 224);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, 4, 4, 660, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, 224);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, 2);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DESCRIPROGET, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DESCRIPROGET, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DESCRIPROGET, PPQRY_OPERE, "A.DESCRIZIONE", "OPEREDESCRIZ", 5, 200, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, 312, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, 188);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_LIST, "CRONOPROGRAMMA ID NON DEF");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, 4, 52, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, 188);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_CRONIDNONDEF, MyGlb.PANEL_FORM, "CRONOPROGRAMMA ID NON DEF");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_CRONIDNONDEF, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_CRONIDNONDEF, PPQRY_TESTATCRONO1, "A.CRONOPROGRAMMA_ID_NON_DEF", "CRONOPROGRAMMA_ID_NON_DEF", 3, 10, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, 1140, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_LIST, "Importo Iniziale");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, 4, 100, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTINIZIA, MyGlb.PANEL_FORM, "Importo Iniziale");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_IMPORTINIZIA, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_IMPORTINIZIA, PPQRY_TESTATCRONO1, "A.IMPORTO_INIZIALE", "IMPORTO_INIZIALE", 3, 14, 2, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, 1268, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_LIST, "Importo Attuale");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, 4, 124, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, 116);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_IMPORTATTUAL, MyGlb.PANEL_FORM, "Importo Attuale");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_IMPORTATTUAL, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_IMPORTATTUAL, PPQRY_TESTATCRONO1, "A.IMPORTO_ATTUALE", "IMPORTO_ATTUALE", 3, 14, 2, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_LIST, 1396, 36, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_LIST, 84);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_LIST, "Obiettivo Operativo");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_FORM, 4, 580, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_FORM, 84);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_PROGETTOID, MyGlb.PANEL_FORM, "Obiet. Oper.");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_PROGETTOID, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_PROGETTOID, PPQRY_TESTATCRONO1, "B.PROGETTO_ID", "RECIMPCRPRID", 5, 9, 0, -13997);
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, 1372, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, 60);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_LIST, "DEFINITO");
    PAN_CRONOPROGRAM.SetRect(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, 4, 556, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CRONOPROGRAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, 60);
    PAN_CRONOPROGRAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, 1);
    PAN_CRONOPROGRAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CRONOPROGRAM_DEFINITO, MyGlb.PANEL_FORM, "DEFINITO");
    PAN_CRONOPROGRAM.SetFieldPage(PFL_CRONOPROGRAM_DEFINITO, -1, -1);
    PAN_CRONOPROGRAM.SetFieldPanel(PFL_CRONOPROGRAM_DEFINITO, PPQRY_TESTATCRONO1, "A.DEFINITO", "RECTESCRODEF", 5, 2, 0, -13997);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_DEFINITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_CRONOPROGRAM.SetValueListItem(PFL_CRONOPROGRAM_DEFINITO, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_CRONOPROGRAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_CRONOPROGRAM.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as OPEREDESCRIZ ");
    SQL.append("from ");
    SQL.append("  OPERE A ");
    SQL.append("where (A.CODICE = ~~OPERA~~) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_OPERE, 0, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_OPERE, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(PPQRY_OPERE, "OPERE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  DECODE(~~REIMCRPRUNOR~~, to_number(NULL), '', SO4_UTIL.UNITA_GET_CODICE_VALIDO(~~REIMCRPRUNOR~~,TRUNC( SYSDATE )) || ' - ' || SO4_UTIL.UNITA_GET_DESCR_VALIDA(~~REIMCRPRUNOR~~,TRUNC( SYSDATE ))) as DESCRIZIONUO, ");
    SQL.append("  'A' as APRICRONO ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (NOT ((~~CRONOPROGRAMMA_ID~~ IS NULL))) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_DUAL, 0, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_DUAL, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(PPQRY_DUAL, "DUAL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID as PROGEPROGEID, ");
    SQL.append("  A.PROGETTO_ID || ' - ' || A.DESCRIZIONE as DESCPROGETTO ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    SQL.append("where (A.PROGETTO_ID = ~~RECIMPCRPRID~~) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_PROGETTI, 0, SQL, PFL_CRONOPROGRAM_PROGETTOID, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.PROGETTO_ID as PROGEPROGEID, ");
    SQL.append("  A.PROGETTO_ID || ' - ' || A.DESCRIZIONE as DESCPROGETTO ");
    SQL.append("from ");
    SQL.append("  PROGETTI A ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_PROGETTI, 1, SQL, PFL_CRONOPROGRAM_PROGETTOID, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_PROGETTI, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetIMDB(IMDB, "PQRY_TESTATCRONO1", true);
    PAN_CRONOPROGRAM.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.CAPITOLO as RECIMPCROCAP, ");
    SQL.append("  B.ARTICOLO as RECIMPCROART, ");
    SQL.append("  C.DESCRIZIONE as RECORCAPDESC, ");
    SQL.append("  A.ESERCIZIO_ISCRIZIONE as ESERCIZIO_ISCRIZIONE, ");
    SQL.append("  B.PROGR_UNITA_ORGANIZZATIVA as REIMCRPRUNOR, ");
    SQL.append("  A.OPERA as OPERA, ");
    SQL.append("  A.CRONOPROGRAMMA_ID as CRONOPROGRAMMA_ID, ");
    SQL.append("  A.CRONOPROGRAMMA_ID_NON_DEF as CRONOPROGRAMMA_ID_NON_DEF, ");
    SQL.append("  A.IMPORTO_INIZIALE as IMPORTO_INIZIALE, ");
    SQL.append("  A.IMPORTO_ATTUALE as IMPORTO_ATTUALE, ");
    SQL.append("  A.ESERCIZIO_ENTRATA as ESERCIZIO_ENTRATA, ");
    SQL.append("  B.IMPORTO as RECIMPCROIMP, ");
    SQL.append("  A.ENTRATA_ESIG_DIFF as RETECRENESDI, ");
    SQL.append("  A.DEFINITO as RECTESCRODEF, ");
    SQL.append("  B.PROGETTO_ID as RECIMPCRPRID ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  TESTATE_CRONOPROGRAMMI A, ");
    SQL.append("  IMPUTAZIONI_CRONOPROGRAMMI B, ");
    SQL.append("  CAP C ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.ARTICOLO = B.ARTICOLO) ");
    SQL.append("and   (C.CAPITOLO = B.CAPITOLO) ");
    SQL.append("and   (C.E_S = 'S') ");
    SQL.append("and   (C.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (B.CRONOPROGRAMMA_ID = A.CRONOPROGRAMMA_ID) ");
    SQL.append("and   (A.ESERCIZIO_ISCRIZIONE = NVL(~~PQRY_PATS2.NOMOGGESDIIS~~, A.ESERCIZIO_ISCRIZIONE)) ");
    SQL.append("and   (B.CAPITOLO = NVL(~~PQRY_PATS2.NOMEOGGECAPI~~, B.CAPITOLO)) ");
    SQL.append("and   (B.ARTICOLO = NVL(~~PQRY_PATS2.NOMEOGGEARTI~~, B.ARTICOLO)) ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  B.CAPITOLO, ");
    SQL.append("  B.ARTICOLO, ");
    SQL.append("  A.ESERCIZIO_ISCRIZIONE, ");
    SQL.append("  A.OPERA ");
    PAN_CRONOPROGRAM.SetQuery(PPQRY_TESTATCRONO1, 5, SQL, -1, "");
    PAN_CRONOPROGRAM.SetQueryDB(PPQRY_TESTATCRONO1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CRONOPROGRAM.SetMasterTable(0, "TESTATE_CRONOPROGRAMMI");
    PAN_CRONOPROGRAM.AddToSortList(PFL_CRONOPROGRAM_CAPITOLO, true);
    PAN_CRONOPROGRAM.AddToSortList(PFL_CRONOPROGRAM_ARTICOLO, true);
    PAN_CRONOPROGRAM.AddToSortList(PFL_CRONOPROGRAM_ESERCIISCRIZ, true);
    PAN_CRONOPROGRAM.AddToSortList(PFL_CRONOPROGRAM_OPERA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CRONOPROGRAM.Status() == 2)
    {
      int oldListQBE = PAN_CRONOPROGRAM.iUseListQBE;
      PAN_CRONOPROGRAM.iUseListQBE = 0;
      PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_CRONOPROGRAM.PanelCommand(Glb.PCM_FIND);
      PAN_CRONOPROGRAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_ValidateRow(Cancel);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_DynamicProperties();
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PATS) PAN_PATS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_PATS) PAN_PATS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CRONOPROGRAM) PAN_CRONOPROGRAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
