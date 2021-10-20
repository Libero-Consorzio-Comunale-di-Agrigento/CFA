// **********************************************
// Movimenti Senza Imputazione Economica
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class MovimentiSenzaImputazioneEconomica extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PARS_ES1 = 0;
  private static int PFL_PARS_ETICHIMPUTDA = 1;

  private static int PPQRY_PARS64 = 0;


  IDPanel PAN_PARS;
  private static int PFL_VISMOVSENIMP_TIPOMOVIMENT = 0;
  private static int PFL_VISMOVSENIMP_MODALITAIMP = 1;
  private static int PFL_VISMOVSENIMP_ESERCIZIO = 2;
  private static int PFL_VISMOVSENIMP_ES = 3;
  private static int PFL_VISMOVSENIMP_CODICE = 4;
  private static int PFL_VISMOVSENIMP_CODLIVELLO4 = 5;
  private static int PFL_VISMOVSENIMP_CODLIVELLO5 = 6;
  private static int PFL_VISMOVSENIMP_NUMEROIMPACC = 7;
  private static int PFL_VISMOVSENIMP_ANNOIMPACC = 8;
  private static int PFL_VISMOVSENIMP_NUMEROSUBIMP = 9;
  private static int PFL_VISMOVSENIMP_ANNOSUBIMP = 10;
  private static int PFL_VISMOVSENIMP_NUMEROLIQ = 11;
  private static int PFL_VISMOVSENIMP_ANNOLIQ = 12;
  private static int PFL_VISMOVSENIMP_NUMEROMAND = 13;
  private static int PFL_VISMOVSENIMP_ANNOMAND = 14;
  private static int PFL_VISMOVSENIMP_DESCRIZIONE = 15;
  private static int PFL_VISMOVSENIMP_CODBENEFICIA = 16;
  private static int PFL_VISMOVSENIMP_RAGIONSOCIAL = 17;
  private static int PFL_VISMOVSENIMP_CODICEGESTIO = 18;
  private static int PFL_VISMOVSENIMP_DESCCODIGEST = 19;
  private static int PFL_VISMOVSENIMP_IMPORTO = 20;
  private static int PFL_VISMOVSENIMP_DISPONIBILIT = 21;
  private static int PFL_VISMOVSENIMP_IMPECOLIQECO = 22;
  private static int PFL_VISMOVSENIMP_ETICHEORDINA = 23;
  private static int PFL_VISMOVSENIMP_ETICHELIQUID = 24;
  private static int PFL_VISMOVSENIMP_ETICHETTASUB = 25;
  private static int PFL_VISMOVSENIMP_ETICHEIMPACC = 26;

  private static int PPQRY_VISMOVSENIMP = 0;

  private static int PPQRY_IMPECO = 1;


  IDPanel PAN_VISMOVSENIMP;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARS69(IMDB);
    //
    //
    Init_PQRY_PARS64(IMDB);
    Init_PQRY_PARS64_RS(IMDB);
    Init_PQRY_VISMOVSENIMP(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARS69(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARS69, 1);
    IMDB.set_TblCode(IMDBDef3.TBL_PARS69, "TBL_PARS69");
    IMDB.set_FldCode(IMDBDef3.TBL_PARS69,IMDBDef3.FLD_PARS69_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef3.TBL_PARS69,IMDBDef3.FLD_PARS69_NOMEOGGETTES,5,1,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARS69, 0);
  }

  private static void Init_PQRY_PARS64(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS64, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS64, "PQRY_PARS64");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS64,IMDBDef11.PQSL_PARS64_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS64,IMDBDef11.PQSL_PARS64_NOMEOGGETTES,5,1,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_PARS64, 0);
  }

  private static void Init_PQRY_PARS64_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_PARS64_RS, 1);
    IMDB.set_TblCode(IMDBDef11.PQRY_PARS64_RS, "PQRY_PARS64_RS");
    IMDB.set_FldCode(IMDBDef11.PQRY_PARS64_RS,IMDBDef11.PQSL_PARS64_NOMEOGGETTES, "NOMEOGGETTES");
    IMDB.SetFldParams(IMDBDef11.PQRY_PARS64_RS,IMDBDef11.PQSL_PARS64_NOMEOGGETTES,5,1,0);
  }

  private static void Init_PQRY_VISMOVSENIMP(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_VISMOVSENIMP, 22);
    IMDB.set_TblCode(IMDBDef11.PQRY_VISMOVSENIMP, "PQRY_VISMOVSENIMP");
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMTIMO, "VIMOSEIMTIMO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMTIMO,5,20,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMMOIM, "VIMOSEIMMOIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMMOIM,5,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIME1, "VISMOVSEIME1");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIME1,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMES, "VISMOVSEIMES");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMES,12,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMCO, "VISMOVSEIMCO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMCO,5,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOL4, "VIMOSEIMCOL4");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOL4,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOL5, "VIMOSEIMCOL5");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOL5,1,10,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANIM, "VIMOSEIMANIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANIM,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNUIM, "VIMOSEIMNUIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNUIM,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANSU, "VIMOSEIMANSU");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANSU,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNUSU, "VIMOSEIMNUSU");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNUSU,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANLI, "VIMOSEIMANLI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANLI,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNULI, "VIMOSEIMNULI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNULI,1,5,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANMA, "VIMOSEIMANMA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMANMA,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNUMA, "VIMOSEIMNUMA");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMNUMA,1,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMDE, "VISMOVSEIMDE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMDE,5,140,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOBE, "VIMOSEIMCOBE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOBE,2,15,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMRASO, "VIMOSEIMRASO");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMRASO,5,60,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOGE, "VIMOSEIMCOGE");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMCOGE,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMDECG, "VIMOSEIMDECG");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VIMOSEIMDECG,5,200,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMIM, "VISMOVSEIMIM");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMIM,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMDI, "VISMOVSEIMDI");
    IMDB.SetFldParams(IMDBDef11.PQRY_VISMOVSENIMP,IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMDI,2,15,0);
    IMDB.TblAddNew(IMDBDef11.PQRY_VISMOVSENIMP, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public MovimentiSenzaImputazioneEconomica(MyWebEntryPoint w, IMDBObj imdb)
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
  public MovimentiSenzaImputazioneEconomica()
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
    FormIdx = MyGlb.FRM_MOVSENIMPECO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "3FA2E85C-F12C-4FED-8190-B1D86A2B9EC0";
    ResModeW = 2;
    ResModeH = 2;
    iVisualFlags = -2049;
    DesignWidth = 1012;
    DesignHeight = 414;
    set_Caption(new IDVariant("Movimenti senza Imputazione Economica"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1012;
    Frames[1].Height = 388;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.134021;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 1012;
    Frames[2].Height = 52;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Pars";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 52;
    PAN_PARS = new IDPanel(w, this, 2, "PAN_PARS");
    Frames[2].Content = PAN_PARS;
    PAN_PARS.Lockable = false;
    PAN_PARS.iLocked = false;
    PAN_PARS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARS.VS = MainFrm.VisualStyleList;
    PAN_PARS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1012-MyGlb.PAN_OFFS_X, 52-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7C15B8EA-FC0A-430B-A981-6C6EF8B4D6A0");
    PAN_PARS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 64, 156, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARS.InitStatus = 1;
    PAN_PARS_Init();
    PAN_PARS_InitFields();
    PAN_PARS_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 1012;
    Frames[3].Height = 336;
    Frames[3].Caption = "Movimenti senza Imputazione Economica";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 336;
    PAN_VISMOVSENIMP = new IDPanel(w, this, 3, "PAN_VISMOVSENIMP");
    Frames[3].Content = PAN_VISMOVSENIMP;
    PAN_VISMOVSENIMP.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_VISMOVSENIMP.VS = MainFrm.VisualStyleList;
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1012-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "DD87E91C-EF20-4793-850B-C4A8E44B23FB");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2240, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_VISMOVSENIMP.InitStatus = 1;
    PAN_VISMOVSENIMP_Init();
    PAN_VISMOVSENIMP_InitFields();
    PAN_VISMOVSENIMP_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZAGG12+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_CS8+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZAGG12+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_RECECOSUMOAU+BaseCmdLinIdx)
      {
        RecuperoEconomicaSuMovimenti();
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_REREECSUMOMA+BaseCmdLinIdx)
      {
        MainFrm.Show(MyGlb.FRM_RECRETECSUMO, 0, this);
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
      if (IMDB.TblModified(IMDBDef3.TBL_PARS69, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        MOVSENIMPECO_PARS64();
      }
      PAN_PARS.UpdatePanel(MainFrm);
      PAN_VISMOVSENIMP.UpdatePanel(MainFrm);
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
    return (obj instanceof MovimentiSenzaImputazioneEconomica);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? MovimentiSenzaImputazioneEconomica.class.getName() : (Glb.ClassWithPackage(MovimentiSenzaImputazioneEconomica.class) ? MovimentiSenzaImputazioneEconomica.class.getName().substring(MovimentiSenzaImputazioneEconomica.class.getPackage().getName().length() + 1) : MovimentiSenzaImputazioneEconomica.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Pars On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_PARS_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Pars On Updating Row Body
      // Corpo Procedura
      // 
      IDVariant v_TIPOIMPUTAZI = new IDVariant(0,IDVariant.STRING);
      v_TIPOIMPUTAZI = (new IDVariant("Tipo Imputazione "));
      IDVariant v_VT99MODAIMPU = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VT99MODAIMPE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(A.MODALITA_IMPUTAZIONE, 'FA', 'Obbligatoria da Fattura', 'LI', 'Obbligatoria da Liquidazione', NULL, 'Caricamento Piano dei Conti') as DET9MOIMT9MI, ");
      SQL.append("  DECODE(A.MODALITA_IMPUTAZIONE_E, 'FA', 'Obbligatoria da Fattura', 'AC', 'Accertamento', 'LI', 'Obbligatoria da Ordinativo', NULL, 'Caricamento Piano dei Conti') as DET9MOIETMIE ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VT99MODAIMPU = QV.Get("DET9MOIMT9MI", IDVariant.STRING) ;
        v_VT99MODAIMPE = QV.Get("DET9MOIETMIE", IDVariant.STRING) ;
      }
      QV.Close();
      if (Column.equals((new IDVariant(PFL_PARS_ES1)), true) && FieldWasModified.booleanValue())
      {
        PAN_PARS.set_FieldText(PFL_PARS_ETICHIMPUTDA, IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_TIPOIMPUTAZI, (IMDB.Value(IMDBDef11.PQRY_PARS64, IMDBDef11.PQSL_PARS64_NOMEOGGETTES, 0).equals((new IDVariant("E")))? new IDVariant("Entrata") : IMDB.Value(IMDBDef11.PQRY_PARS64, IMDBDef11.PQSL_PARS64_NOMEOGGETTES, 0).equals((new IDVariant("S")))? new IDVariant("Spesa") :  new IDVariant())), (new IDVariant(":"))), (new IDVariant(" "))), ((IMDB.Value(IMDBDef11.PQRY_PARS64, IMDBDef11.PQSL_PARS64_NOMEOGGETTES, 0).equals((new IDVariant("E"))))?v_VT99MODAIMPE:v_VT99MODAIMPU)).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "ParsOnUpdatingRow", _e);
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
      IDVariant v_TIPOIMPUTAZI = new IDVariant(0,IDVariant.STRING);
      v_TIPOIMPUTAZI = (new IDVariant("Tipo Imputazione "));
      LOAD_PARSDELETE();
      IMDB.set_Value(IMDBDef3.TBL_PARS69, IMDBDef3.FLD_PARS69_NOMEOGGETTES, 0, (new IDVariant("S")));
      IDVariant v_VT99MODAIMPU = new IDVariant(0,IDVariant.STRING);
      IDVariant v_VT99MODAIMPE = new IDVariant(0,IDVariant.STRING);
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  DECODE(A.MODALITA_IMPUTAZIONE, 'FA', 'Obbligatoria da Fattura', 'LI', 'Obbligatoria da Liquidazione', NULL, 'Caricamento Piano dei Conti') as DET9MOIMT9MI, ");
      SQL.append("  DECODE(A.MODALITA_IMPUTAZIONE_E, 'FA', 'Obbligatoria da Fattura', 'AC', 'Accertamento', 'LI', 'Obbligatoria da Ordinativo', NULL, 'Caricamento Piano dei Conti') as DET9MOIETMIE ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_VT99MODAIMPU = QV.Get("DET9MOIMT9MI", IDVariant.STRING) ;
        v_VT99MODAIMPE = QV.Get("DET9MOIETMIE", IDVariant.STRING) ;
      }
      QV.Close();
      PAN_PARS.set_FieldText(PFL_PARS_ETICHIMPUTDA, IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_TIPOIMPUTAZI, (new IDVariant("Spesa"))), (new IDVariant(":"))), (new IDVariant(" "))), v_VT99MODAIMPU).stringValue());
      PAN_VISMOVSENIMP.Freezed = (new IDVariant(-1)).booleanValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "Load", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void LOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS69, IMDBDef3.FLD_PARS69_NOMEOGGETTES, 0, new IDVariant());
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
      UNLOAD_PARSDELETE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "Unload", _e);
    }
  }

  // **********************************************************************
  // Pars: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARSDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARS69, IMDBDef3.FLD_PARS69_NOMEOGGETTES, 0, new IDVariant());
  }

  // **********************************************************************
  // VISTA MOV SENZA IMPECO On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_VISMOVSENIMP_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_VISMOVSENIMP);
      // 
      // VISTA MOV SENZA IMPECO On Dynamic Properties Body
      // Corpo Procedura
      // 
      PAN_VISMOVSENIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_VISMOVSENIMP_DESCRIZIONE,(new IDVariant(PAN_VISMOVSENIMP.FieldText(PFL_VISMOVSENIMP_DESCRIZIONE))).stringValue()); 
      PAN_VISMOVSENIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_VISMOVSENIMP_RAGIONSOCIAL,(new IDVariant(PAN_VISMOVSENIMP.FieldText(PFL_VISMOVSENIMP_RAGIONSOCIAL))).stringValue()); 
      PAN_VISMOVSENIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_VISMOVSENIMP_DESCCODIGEST,(new IDVariant(PAN_VISMOVSENIMP.FieldText(PFL_VISMOVSENIMP_DESCCODIGEST))).stringValue()); 
      if (IDL.NullValue((new IDVariant(PAN_VISMOVSENIMP.FieldText(PFL_VISMOVSENIMP_IMPECOLIQECO))),(new IDVariant(""))).compareTo((new IDVariant("")), true)!=0)
      {
        IDVariant S = new IDVariant(0,IDVariant.STRING);
        IDVariant v_STRINGA = new IDVariant(0,IDVariant.STRING);
        v_STRINGA = (new IDVariant("Esiste almeno un"));
        IDVariant v_STRINGA1 = new IDVariant(0,IDVariant.STRING);
        v_STRINGA1 = (new IDVariant("con imputazione economica"));
        IDVariant v_NON = new IDVariant(0,IDVariant.STRING);
        v_NON = (new IDVariant("Non esiste alcun"));
        if ((new IDVariant(PAN_VISMOVSENIMP.FieldText(PFL_VISMOVSENIMP_ES))).equals((new IDVariant("E")), true))
        {
          IDVariant C = new IDVariant(0,IDVariant.STRING);
          C = (new IDVariant(" Dettaglio Ordinativo "));
          S = new IDVariant(C);
        }
        else
        {
          IDVariant C = new IDVariant(0,IDVariant.STRING);
          C = (new IDVariant("a Liquidazione "));
          S = new IDVariant(C);
        }
        if ((new IDVariant(PAN_VISMOVSENIMP.FieldText(PFL_VISMOVSENIMP_IMPECOLIQECO))).equals((new IDVariant("SI")), true))
        {
          PAN_VISMOVSENIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_VISMOVSENIMP_IMPECOLIQECO,IDL.Add(IDL.Add(v_STRINGA, S), v_STRINGA1).stringValue()); 
        }
        else
        {
          PAN_VISMOVSENIMP.set_ToolTip(Glb.OBJ_FIELD,PFL_VISMOVSENIMP_IMPECOLIQECO,IDL.Add(IDL.Add(IDL.Add(v_NON, S), S), v_STRINGA1).stringValue()); 
        }
      }
      PAN_VISMOVSENIMP.set_ObjRect(Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, IDPanel.RT_LEFT, Glb.PANEL_LIST, (new IDVariant(PAN_VISMOVSENIMP.ObjRect(Glb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, IDPanel.RT_LEFT, Glb.PANEL_LIST))).intValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "VISTAMOVSENZAIMPECOOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // VISTA MOV SENZA IMPECO After Find
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command - Input
  // **********************************************************************
  private void PAN_VISMOVSENIMP_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VISTA MOV SENZA IMPECO After Find Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef11.PQRY_VISMOVSENIMP, IMDBDef11.PQSL_VISMOVSENIMP_VISMOVSEIMES, 0).equals((new IDVariant("E")), true))
      {
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.set_FieldText(PFL_VISMOVSENIMP_ETICHEORDINA, (new IDVariant("Ordinativo")).stringValue());
        PAN_VISMOVSENIMP.set_FieldText(PFL_VISMOVSENIMP_ETICHEIMPACC, (new IDVariant("Accertamento")).stringValue());
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.set_FieldText(PFL_VISMOVSENIMP_ETICHEIMPACC, (new IDVariant("Impegno")).stringValue());
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.SetFlags (Glb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_VISMOVSENIMP.set_FieldText(PFL_VISMOVSENIMP_ETICHEORDINA, (new IDVariant("Mandato")).stringValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "VISTAMOVSENZAIMPECOAfterFind", _e);
    }
  }

  // **********************************************************************
  // VISTA MOV SENZA IMPECO On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_VISMOVSENIMP_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VISTA MOV SENZA IMPECO On Change Status Body
      // Corpo Procedura
      // 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "VISTAMOVSENZAIMPECOOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // VISTA MOV SENZA IMPECO On Command
  // Evento notificato dal pannello prima di eseguire un
  // comando di pannello.
  // Command - Input
  // Cancel - Input/Output
  // User Operation - Input
  // **********************************************************************
  private void PAN_VISMOVSENIMP_OnPanelCommand(IDVariant Command,IDVariant Cancel,IDVariant UserOperation)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // VISTA MOV SENZA IMPECO On Command Body
      // Corpo Procedura
      // 
      if (Command.equals((new IDVariant(2)), true))
      {
        PAN_VISMOVSENIMP.Freezed = (new IDVariant(-1)).booleanValue();
      }
      if (Command.equals((new IDVariant(4)), true))
      {
        PAN_VISMOVSENIMP.Freezed = (new IDVariant(0)).booleanValue();
        PAN_VISMOVSENIMP_InitQueries();
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "VISTAMOVSENZAIMPECOOnCommand", _e);
    }
  }

  // **********************************************************************
  // Recupero Economica Su Movimenti
  // **********************************************************************
  public int RecuperoEconomicaSuMovimenti ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Recupero Economica Su Movimenti Body
      // Corpo Procedura
      // 
      MainFrm.Show(MyGlb.FRM_RECECOSUMOAU, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("MovimentiSenzaImputazioneEconomica", "RecuperoEconomicaSuMovimenti", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Pars
  // Recupera i record da mostrare nel pannello
  // **********************************************************************
  private void MOVSENIMPECO_PARS64() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef11.PQRY_PARS64_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PARS69, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PARS69, 0))
    {
      IMDB.TblAddNew(IMDBDef11.PQRY_PARS64_RS, 0);
      IMDB.TblLinkRow(IMDBDef11.PQRY_PARS64_RS, 0, IMDBDef3.TBL_PARS69, 0);
      IMDB.TblLinkField(IMDBDef11.PQRY_PARS64_RS, 0, 0, IMDBDef3.TBL_PARS69, IMDBDef3.FLD_PARS69_NOMEOGGETTES, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PARS69, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PARS69, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PARS69, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef11.PQRY_PARS64_RS, 0);
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
  private void PAN_PARS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PARS);
    // Stub
  }

  private void PAN_PARS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_PARS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PARS_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PARS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_VISMOVSENIMP_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_VISMOVSENIMP, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_VISMOVSENIMP_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_VISMOVSENIMP, Cancel);
    // Stub
  }

  private void PAN_VISMOVSENIMP_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_VISMOVSENIMP_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_VISMOVSENIMP_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_VISMOVSENIMP_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARS_Init()
  {

    PAN_PARS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PARS.SetSize(MyGlb.OBJ_FIELD, 2);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "196A6891-51F0-4960-A632-8861845A6AD8");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "Parte");
    PAN_PARS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARS_ES1, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ES1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, "66561FC5-3BE6-4FAE-B839-A6042902940D");
    PAN_PARS.set_Header(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, "");
    PAN_PARS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, MyGlb.VIS_ETICGRASLEFT);
    PAN_PARS.SetFlags(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 24);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_LIST, "Parte");
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 16, 16, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 40);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARS_ES1, MyGlb.PANEL_FORM, "Parte");
    PAN_PARS.SetFieldPage(PFL_PARS_ES1, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ES1, PPQRY_PARS64, "A.NOMEOGGETTES", "NOMEOGGETTES", 5, 1, 0, -13997);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARS.SetValueListItem(PFL_PARS_ES1, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, MyGlb.PANEL_LIST, 200, 16, 276, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, MyGlb.PANEL_LIST, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, MyGlb.PANEL_LIST, 1);
    PAN_PARS.SetRect(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, MyGlb.PANEL_FORM, 208, 16, 440, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, MyGlb.PANEL_FORM, 0);
    PAN_PARS.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARS_ETICHIMPUTDA, MyGlb.PANEL_FORM, 1);
    PAN_PARS.SetFieldPage(PFL_PARS_ETICHIMPUTDA, -1, -1);
    PAN_PARS.SetFieldPanel(PFL_PARS_ETICHIMPUTDA, -1, "", "ETICHIMPUTDA", 0, 0, 0, -13997);
  }

  private void PAN_PARS_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARS.SetIMDB(IMDB, "PQRY_PARS64", true);
    PAN_PARS.set_SetString(MyGlb.MASTER_ROWNAME, "Nome Oggetto");
    PAN_PARS.SetQueryIMDB(PPQRY_PARS64, IMDBDef11.PQRY_PARS64_RS, IMDBDef3.TBL_PARS69);
    JustLoaded = true;
    PAN_PARS.SetFieldPrimaryIndex(PFL_PARS_ES1, IMDBDef3.FLD_PARS69_NOMEOGGETTES);
    PAN_PARS.SetMasterTable(0, "PARS69");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARS.Status() == 2)
    {
      int oldListQBE = PAN_PARS.iUseListQBE;
      PAN_PARS.iUseListQBE = 0;
      PAN_PARS.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARS.PanelCommand(Glb.PCM_FIND);
      PAN_PARS.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_VISMOVSENIMP_Init()
  {

    PAN_VISMOVSENIMP.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_VISMOVSENIMP.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_VISMOVSENIMP.SetSize(MyGlb.OBJ_FIELD, 27);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, "053A0A58-1D7C-47D7-BC5F-6852F9BF1D70");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, "Tipo Movimento");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, "5815E9C4-9CA0-48D2-8095-54D3678A8647");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, "MODALITA IMP");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.VIS_NORMFIELPADR);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, "A2EF17A5-BC15-4EAA-A520-17545F1DC285");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, "ESERCIZIO");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, "3EABF861-CE4C-4BD2-B993-5572170F5025");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, "E S");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.VIS_NORMFIELPADR);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, "DE9CB4AE-8BAF-48EE-8BD6-9D1925DE69FF");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, "Codice");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, "8EA0C25C-9425-47B9-A8A4-7B9D4620774E");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, "Cod. Livello IV");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.VIS_NORFIEINTLUN);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, "FBEE88E7-C820-4C19-BBDC-25714BF784EE");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, "Cod. Livello V");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.VIS_NORFIEINTLUN);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, "02622A3F-65BC-47A4-92FE-B9BCF14D904D");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, "Numero Imp.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, "C69200CC-52FB-43AD-834B-2DCD17B35DCD");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, "Anno Imp.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, "D772E220-5C0B-417A-8D9C-543973A41074");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, "Numero Subimp.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, "8D0B1C13-00ED-4565-B220-1F28A6ADAA22");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, "Anno Subimp.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, "8DEE878E-6DF9-4C16-BB41-C4C41F85CD0D");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, "Numero Liq.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, "A5FC50A8-F129-44CA-86AF-B4B6B6B00B72");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, "Anno Liq.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, "27EDCA52-EC3F-4DCB-8543-95C6D95529BA");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, "Numero Mand.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, "BE5D2DE3-2192-42A0-9578-1FC90C794FF1");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, "Anno Mand.");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, "3E77DD68-9222-4123-9866-5294CF846357");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, "Descrizione");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, "Descrizione Movimento");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, "6697CFF1-58A9-477E-8D79-5B46D21F3335");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, "Cod. Beneficiario");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, "C9853E74-5BB4-4027-A935-1FC60CD93202");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, "Ragione Sociale");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, "B2610575-27CF-42A5-A821-2BA20CD8038E");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, "Cod. Gestionale");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, "8850F1BC-351C-49AE-8CC6-C8E386749532");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, "Descrizione");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, "Descrizione Codice Gestionale");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.VIS_NORMALFIELDS);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, "78C2708D-8B1B-45FE-B32D-DD060F7672AA");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, "Importo");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, "588BE6DA-78A3-42D8-BFBE-94EA780B7B6D");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, "Disponibilità");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, "33EE979B-CA5B-47C3-9BE5-2D49FDB87789");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, "Liq. Economica");
    PAN_VISMOVSENIMP.set_ToolTip(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, "");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.VIS_VISULOOUPCF4);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, "721F8295-AD73-4575-B4F2-1FF6C2DB4ACC");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, "Ordinativo");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, MyGlb.VIS_LABEVISUSTYL);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, "9CDA3633-CA72-41B3-B56C-8439DBB1E41A");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, "Liquidazione");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, MyGlb.VIS_LABEVISUSTYL);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, "1824DA20-999B-45B1-98A9-16CC12AAD325");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, "SubImpegno");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, MyGlb.VIS_LABEVISUSTYL);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_VISMOVSENIMP.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, "97C5FDA3-D008-41EF-8496-3DD8462E0543");
    PAN_VISMOVSENIMP.set_Header(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, "Impegno");
    PAN_VISMOVSENIMP.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, MyGlb.VIS_LABEVISUSTYL);
    PAN_VISMOVSENIMP.SetFlags(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_VISMOVSENIMP_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_LIST, 0, 36, 116, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_LIST, 36);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_LIST, "Tipo Movimento");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_FORM, 4, 4, 272, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_TIPOMOVIMENT, MyGlb.PANEL_FORM, "Tipo Movimento");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_TIPOMOVIMENT, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_TIPOMOVIMENT, PPQRY_VISMOVSENIMP, "A.TIPO", "VIMOSEIMTIMO", 5, 20, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_LIST, 116, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_LIST, 96);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_LIST, "MOD. IMP");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_FORM, 284, 4, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_FORM, 112);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_MODALITAIMP, MyGlb.PANEL_FORM, "MODALITA IMP");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_MODALITAIMP, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_MODALITAIMP, PPQRY_VISMOVSENIMP, "A.MODALITA_IMP", "VIMOSEIMMOIM", 5, 4, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_LIST, 116, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_LIST, "ESER.");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_FORM, 452, 4, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ESERCIZIO, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ESERCIZIO, PPQRY_VISMOVSENIMP, "A.ESERCIZIO", "VISMOVSEIME1", 1, 4, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_LIST, 116, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_LIST, 24);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_LIST, "E S");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_FORM, 4, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ES, MyGlb.PANEL_FORM, "E S");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ES, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ES, PPQRY_VISMOVSENIMP, "A.E_S", "VISMOVSEIMES", 12, 1, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_LIST, 116, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_LIST, 52);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_LIST, "Codice");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_FORM, 188, 28, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_FORM, 64);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICE, MyGlb.PANEL_FORM, "Codice");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_CODICE, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_CODICE, PPQRY_VISMOVSENIMP, "A.CODICE", "VISMOVSEIMCO", 5, 10, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_LIST, 196, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_LIST, 88);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_LIST, "Cod. Livello IV");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_FORM, 324, 28, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_FORM, 104);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO4, MyGlb.PANEL_FORM, "Cod. Livello IV");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_CODLIVELLO4, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_CODLIVELLO4, PPQRY_VISMOVSENIMP, "A.COD_LIVELLO_4", "VIMOSEIMCOL4", 2, 15, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_LIST, 296, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_LIST, 88);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_LIST, "Cod. Livello V");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_FORM, 4, 52, 224, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODLIVELLO5, MyGlb.PANEL_FORM, "Cod. Livello V");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_CODLIVELLO5, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_CODLIVELLO5, PPQRY_VISMOVSENIMP, "A.COD_LIVELLO_5", "VIMOSEIMCOL5", 1, 10, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_LIST, 396, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_LIST, 104);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_LIST, "Num. Imp");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_FORM, 4, 76, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROIMPACC, MyGlb.PANEL_FORM, "Numero Imp.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_NUMEROIMPACC, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_NUMEROIMPACC, PPQRY_VISMOVSENIMP, "A.NUMERO_IMPACC", "VIMOSEIMNUIM", 1, 5, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_LIST, 436, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_LIST, 88);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_LIST, "Anno Imp.");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_FORM, 236, 52, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_FORM, 104);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOIMPACC, MyGlb.PANEL_FORM, "Anno Imp.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ANNOIMPACC, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ANNOIMPACC, PPQRY_VISMOVSENIMP, "A.ANNO_IMPACC", "VIMOSEIMANIM", 1, 4, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, 492, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, 104);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_LIST, "Num. Sub.");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, 348, 76, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, 120);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROSUBIMP, MyGlb.PANEL_FORM, "Numero Subimp.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_NUMEROSUBIMP, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_NUMEROSUBIMP, PPQRY_VISMOVSENIMP, "A.NUMERO_SUBIMP", "VIMOSEIMNUSU", 1, 5, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, 532, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, 88);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_LIST, "Anno Subimp.");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, 188, 76, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, 104);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOSUBIMP, MyGlb.PANEL_FORM, "Anno Subimp.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ANNOSUBIMP, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ANNOSUBIMP, PPQRY_VISMOVSENIMP, "A.ANNO_SUBIMP", "VIMOSEIMANSU", 1, 4, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_LIST, 588, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_LIST, 80);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_LIST, "Num. Liq");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_FORM, 188, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_FORM, 96);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROLIQ, MyGlb.PANEL_FORM, "Numero Liq.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_NUMEROLIQ, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_NUMEROLIQ, PPQRY_VISMOVSENIMP, "A.NUMERO_LIQ", "VIMOSEIMNULI", 1, 5, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_LIST, 628, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_LIST, 60);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_LIST, "Anno Liq.");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_FORM, 4, 100, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOLIQ, MyGlb.PANEL_FORM, "Anno Liq.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ANNOLIQ, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ANNOLIQ, PPQRY_VISMOVSENIMP, "A.ANNO_LIQ", "VIMOSEIMANLI", 1, 4, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_LIST, 684, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_LIST, 92);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_LIST, "Num. Mand");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_FORM, 4, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_NUMEROMAND, MyGlb.PANEL_FORM, "Numero Mand.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_NUMEROMAND, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_NUMEROMAND, PPQRY_VISMOVSENIMP, "A.NUMERO_MAND", "VIMOSEIMNUMA", 1, 15, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_LIST, 724, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_LIST, 76);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_LIST, "Anno Mand.");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_FORM, 340, 100, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_FORM, 88);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ANNOMAND, MyGlb.PANEL_FORM, "Anno Mand.");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ANNOMAND, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ANNOMAND, PPQRY_VISMOVSENIMP, "A.ANNO_MAND", "VIMOSEIMANMA", 1, 4, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_LIST, 780, 36, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_LIST, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_FORM, 4, 148, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_FORM, 2);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_DESCRIZIONE, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_DESCRIZIONE, PPQRY_VISMOVSENIMP, "A.DESCRIZIONE", "VISMOVSEIMDE", 5, 140, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_LIST, 1116, 36, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_LIST, 112);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_LIST, "Cod Benefic.");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_FORM, 4, 172, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODBENEFICIA, MyGlb.PANEL_FORM, "Cod. Beneficiario");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_CODBENEFICIA, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_CODBENEFICIA, PPQRY_VISMOVSENIMP, "A.COD_BENEFICIARIO", "VIMOSEIMCOBE", 2, 15, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1172, 36, 336, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_LIST, 108);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_LIST, "Ragione Sociale");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_FORM, 4, 196, 456, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_RAGIONSOCIAL, MyGlb.PANEL_FORM, "Ragione Sociale");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_RAGIONSOCIAL, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_RAGIONSOCIAL, PPQRY_VISMOVSENIMP, "A.RAGIONE_SOCIALE", "VIMOSEIMRASO", 5, 60, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_LIST, 1508, 36, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_LIST, 120);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_LIST, "Cod. Gestionale");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_FORM, 4, 220, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_CODICEGESTIO, MyGlb.PANEL_FORM, "Cod. Gestionale");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_CODICEGESTIO, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_CODICEGESTIO, PPQRY_VISMOVSENIMP, "A.CODICE_GESTIONALE", "VIMOSEIMCOGE", 1, 4, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_LIST, 1576, 36, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_LIST, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_LIST, "Descrizione");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_FORM, 4, 244, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_FORM, 2);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DESCCODIGEST, MyGlb.PANEL_FORM, "Descrizione");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_DESCCODIGEST, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_DESCCODIGEST, PPQRY_VISMOVSENIMP, "A.DESCR_CODICE_GESTIONALE", "VIMOSEIMDECG", 5, 200, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_LIST, 1912, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_LIST, 64);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_FORM, 4, 268, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_FORM, 128);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_IMPORTO, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_IMPORTO, PPQRY_VISMOVSENIMP, "A.IMPORTO", "VISMOVSEIMIM", 3, 14, 2, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_LIST, 2040, 36, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_LIST, 96);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_FORM, 188, 124, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_FORM, 112);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_DISPONIBILIT, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_DISPONIBILIT, PPQRY_VISMOVSENIMP, "A.DISPONIBILITA", "VISMOVSEIMDI", 2, 15, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_LIST, 2168, 36, 72, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_LIST, 136);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_LIST, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_LIST, "Liq. Economica");
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_FORM, 4, 292, 644, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_FORM, 136);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_IMPECOLIQECO, MyGlb.PANEL_FORM, "Liq. Economica");
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_IMPECOLIQECO, -1, -1);
    SQL = new StringBuffer();
    SQL.append("CASE WHEN ( ");
  SQL.append("select ");
  SQL.append("  COUNT(*) ");
  SQL.append("from ");
  SQL.append("  IMP_ECO B, ");
  SQL.append("  LIQ C ");
  SQL.append("where (C.ANNO_IMP = ~~VIMOSEIMANIM~~) ");
  SQL.append("and   (C.NUMERO_IMP = ~~VIMOSEIMNUIM~~) ");
  SQL.append("and   (B.ANNO_LIQ = C.ANNO_LIQ) ");
  SQL.append("and   (B.NUMERO_LIQ = C.NUMERO_LIQ) ");
  SQL.append(") > 0 THEN 'SI' ELSE 'NO' END");
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_IMPECOLIQECO, PPQRY_IMPECO, SQL.toString(), "LIQECONOMICA", 5, 99, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, MyGlb.PANEL_LIST, 684, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, MyGlb.PANEL_LIST, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, MyGlb.PANEL_LIST, 2);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, MyGlb.PANEL_FORM, 736, 244, 112, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, MyGlb.PANEL_FORM, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEORDINA, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ETICHEORDINA, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ETICHEORDINA, -1, "", "ETICHEORDINA", 0, 0, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, MyGlb.PANEL_LIST, 588, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, MyGlb.PANEL_LIST, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, MyGlb.PANEL_LIST, 2);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, MyGlb.PANEL_FORM, 744, 252, 112, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, MyGlb.PANEL_FORM, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHELIQUID, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ETICHELIQUID, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ETICHELIQUID, -1, "", "ETICHELIQUID", 0, 0, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, MyGlb.PANEL_LIST, 492, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, MyGlb.PANEL_LIST, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, MyGlb.PANEL_LIST, 2);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, MyGlb.PANEL_FORM, 744, 252, 112, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, MyGlb.PANEL_FORM, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHETTASUB, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ETICHETTASUB, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ETICHETTASUB, -1, "", "ETICHETTASUB", 0, 0, 0, -13997);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, MyGlb.PANEL_LIST, 396, 0, 96, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, MyGlb.PANEL_LIST, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, MyGlb.PANEL_LIST, 2);
    PAN_VISMOVSENIMP.SetRect(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, MyGlb.PANEL_FORM, 752, 260, 112, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_VISMOVSENIMP.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, MyGlb.PANEL_FORM, 0);
    PAN_VISMOVSENIMP.SetNumRow(MyGlb.OBJ_FIELD, PFL_VISMOVSENIMP_ETICHEIMPACC, MyGlb.PANEL_FORM, 1);
    PAN_VISMOVSENIMP.SetFieldPage(PFL_VISMOVSENIMP_ETICHEIMPACC, -1, -1);
    PAN_VISMOVSENIMP.SetFieldPanel(PFL_VISMOVSENIMP_ETICHEIMPACC, -1, "", "ETICHEIMPACC", 0, 0, 0, -13997);
  }

  private void PAN_VISMOVSENIMP_InitQueries()
  {
    StringBuffer SQL;

    PAN_VISMOVSENIMP.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  CASE WHEN ( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  IMP_ECO B, ");
    SQL.append("  LIQ C ");
    SQL.append("where (C.ANNO_IMP = ~~VIMOSEIMANIM~~) ");
    SQL.append("and   (C.NUMERO_IMP = ~~VIMOSEIMNUIM~~) ");
    SQL.append("and   (B.ANNO_LIQ = C.ANNO_LIQ) ");
    SQL.append("and   (B.NUMERO_LIQ = C.NUMERO_LIQ) ");
    SQL.append(") > 0 THEN 'SI' ELSE 'NO' END as LIQECONOMICA ");
    SQL.append("from ");
    SQL.append("  DUAL A ");
    SQL.append("where (~~VIMOSEIMTIMO~~ = 'Impegno') ");
    SQL.append("and   (~~VISMOVSEIMES~~ = 'S') ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  CASE WHEN ( ");
    SQL.append("select ");
    SQL.append("  COUNT(*) ");
    SQL.append("from ");
    SQL.append("  IMP_ECO E, ");
    SQL.append("  PRE F ");
    SQL.append("where (F.ANNO_ACC = ~~VIMOSEIMANIM~~) ");
    SQL.append("and   (F.NUMERO_ACC = ~~VIMOSEIMNUIM~~) ");
    SQL.append("and   (E.ANNO_PRE = F.ANNO_PRE) ");
    SQL.append("and   (E.NUMERO_PRE = F.NUMERO_PRE) ");
    SQL.append(") > 0 THEN 'SI' ELSE 'NO' END ");
    SQL.append("from ");
    SQL.append("  DUAL D ");
    SQL.append("where (~~VIMOSEIMTIMO~~ = 'Accertamento') ");
    SQL.append("and   (~~VISMOVSEIMES~~ = 'E') ");
    PAN_VISMOVSENIMP.SetQuery(PPQRY_IMPECO, 0, SQL, -1, "");
    PAN_VISMOVSENIMP.SetQueryDB(PPQRY_IMPECO, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISMOVSENIMP.SetMasterTable(PPQRY_IMPECO, "DUAL");
    PAN_VISMOVSENIMP.SetIMDB(IMDB, "PQRY_VISMOVSENIMP", true);
    PAN_VISMOVSENIMP.set_SetString(MyGlb.MASTER_ROWNAME, "VISTA MOV SENZA IMPECO");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.TIPO as VIMOSEIMTIMO, ");
    SQL.append("  A.MODALITA_IMP as VIMOSEIMMOIM, ");
    SQL.append("  A.ESERCIZIO as VISMOVSEIME1, ");
    SQL.append("  A.E_S as VISMOVSEIMES, ");
    SQL.append("  A.CODICE as VISMOVSEIMCO, ");
    SQL.append("  A.COD_LIVELLO_4 as VIMOSEIMCOL4, ");
    SQL.append("  A.COD_LIVELLO_5 as VIMOSEIMCOL5, ");
    SQL.append("  A.ANNO_IMPACC as VIMOSEIMANIM, ");
    SQL.append("  A.NUMERO_IMPACC as VIMOSEIMNUIM, ");
    SQL.append("  A.ANNO_SUBIMP as VIMOSEIMANSU, ");
    SQL.append("  A.NUMERO_SUBIMP as VIMOSEIMNUSU, ");
    SQL.append("  A.ANNO_LIQ as VIMOSEIMANLI, ");
    SQL.append("  A.NUMERO_LIQ as VIMOSEIMNULI, ");
    SQL.append("  A.ANNO_MAND as VIMOSEIMANMA, ");
    SQL.append("  A.NUMERO_MAND as VIMOSEIMNUMA, ");
    SQL.append("  A.DESCRIZIONE as VISMOVSEIMDE, ");
    SQL.append("  A.COD_BENEFICIARIO as VIMOSEIMCOBE, ");
    SQL.append("  A.RAGIONE_SOCIALE as VIMOSEIMRASO, ");
    SQL.append("  A.CODICE_GESTIONALE as VIMOSEIMCOGE, ");
    SQL.append("  A.DESCR_CODICE_GESTIONALE as VIMOSEIMDECG, ");
    SQL.append("  A.IMPORTO as VISMOVSEIMIM, ");
    SQL.append("  A.DISPONIBILITA as VISMOVSEIMDI ");
    PAN_VISMOVSENIMP.SetQuery(PPQRY_VISMOVSENIMP, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  VISTA_MOV_SENZA_IMPECO A ");
    PAN_VISMOVSENIMP.SetQuery(PPQRY_VISMOVSENIMP, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.E_S = ~~PQRY_PARS64.NOMEOGGETTES~~) ");
    SQL.append("and   ((A.ESERCIZIO BETWEEN ~~TBL_DATISESSIONE.SESSIOESERCI~~ AND CASE WHEN A.TIPO IN ('Impegno', 'Accertamento') THEN ~~TBL_DATISESSIONE.SESSIOESERCI~~ ELSE 9999 END)) ");
    SQL.append("and   (INSTR(A.MODALITA_IMP, DECODE(A.E_S, 'E', NVL(" + IDL.CSql(MainFrm.MODAIMPUENTR, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'LIFA'), CASE WHEN A.TIPO = 'Impegno' THEN 'T' ELSE NVL(" + IDL.CSql(MainFrm.MODAIMPUSPES, IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ", 'T') END)) > 0) ");
    PAN_VISMOVSENIMP.SetQuery(PPQRY_VISMOVSENIMP, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISMOVSENIMP.SetQuery(PPQRY_VISMOVSENIMP, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_VISMOVSENIMP.SetQuery(PPQRY_VISMOVSENIMP, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.E_S, ");
    SQL.append("  A.TIPO, ");
    SQL.append("  A.ESERCIZIO, ");
    SQL.append("  A.ANNO_IMPACC, ");
    SQL.append("  A.NUMERO_IMPACC, ");
    SQL.append("  A.ANNO_SUBIMP, ");
    SQL.append("  A.NUMERO_SUBIMP, ");
    SQL.append("  A.ANNO_LIQ, ");
    SQL.append("  A.NUMERO_LIQ, ");
    SQL.append("  A.ANNO_MAND, ");
    SQL.append("  A.NUMERO_MAND, ");
    SQL.append("  A.CODICE ");
    PAN_VISMOVSENIMP.SetQuery(PPQRY_VISMOVSENIMP, 5, SQL, -1, "");
    PAN_VISMOVSENIMP.SetQueryDB(PPQRY_VISMOVSENIMP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_VISMOVSENIMP.SetMasterTable(0, "VISTA_MOV_SENZA_IMPECO");
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_ES, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_TIPOMOVIMENT, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_ESERCIZIO, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_ANNOIMPACC, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_NUMEROIMPACC, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_ANNOSUBIMP, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_NUMEROSUBIMP, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_ANNOLIQ, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_NUMEROLIQ, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_ANNOMAND, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_NUMEROMAND, true);
    PAN_VISMOVSENIMP.AddToSortList(PFL_VISMOVSENIMP_CODICE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_VISMOVSENIMP.Status() == 2)
    {
      int oldListQBE = PAN_VISMOVSENIMP.iUseListQBE;
      PAN_VISMOVSENIMP.iUseListQBE = 0;
      PAN_VISMOVSENIMP.PanelCommand(Glb.PCM_SEARCH);
      PAN_VISMOVSENIMP.PanelCommand(Glb.PCM_FIND);
      PAN_VISMOVSENIMP.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_ValidateRow(Cancel);
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_DynamicProperties();
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_OnChangeStatus(OldStatus);
  }
  
  public void OnPanelCommand(IDPanel SrcObj, IDVariant Command, IDVariant Cancel, IDVariant UserOp)
  {
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_OnPanelCommand(Command, Cancel, UserOp);
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
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_PARS) PAN_PARS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_VISMOVSENIMP) PAN_VISMOVSENIMP_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
