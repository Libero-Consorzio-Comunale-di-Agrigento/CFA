// **********************************************
// Variazioni Subimpegni
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class VariazioniSubimpegni extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_PERIODO = 0;

  private static int PFL_PARAMETRI_ESERCIZIO = 0;
  private static int PFL_PARAMETRI_DAL = 1;
  private static int PFL_PARAMETRI_AL = 2;
  private static int PFL_PARAMETRI_NEWPANELLABE = 3;
  private static int PFL_PARAMETRI_ELABORBUTTON = 4;
  private static int PFL_PARAMETRI_SOLOSUBDICOM = 5;
  private static int PFL_PARAMETRI_TOTPERCODBIL = 6;
  private static int PFL_PARAMETRI_PROPOSTA = 7;
  private static int PFL_PARAMETRI_TRATTINODEL1 = 8;
  private static int PFL_PARAMETRI_NUMEROPROP = 9;
  private static int PFL_PARAMETRI_SLASHDEL1 = 10;
  private static int PFL_PARAMETRI_ANNOPROP = 11;
  private static int PFL_PARAMETRI_APRIPROPOSTA = 12;
  private static int PFL_PARAMETRI_INFOPROPOSTA = 13;
  private static int PFL_PARAMETRI_DELIBERA = 14;
  private static int PFL_PARAMETRI_NUMERODELIBE = 15;
  private static int PFL_PARAMETRI_ANNODELIBERA = 16;
  private static int PFL_PARAMETRI_TIPOVARIAZIO = 17;
  private static int PFL_PARAMETRI_TRATTINODEL = 18;
  private static int PFL_PARAMETRI_SLASHDEL = 19;
  private static int PFL_PARAMETRI_APRIDELIBERA = 20;
  private static int PFL_PARAMETRI_INFODELIBERA = 21;
  private static int PFL_PARAMETRI_TOTVARIMP = 22;

  private static int PPQRY_PARAMESTAM19 = 0;

  private static int PPQRY_T55 = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI545(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM19(IMDB);
    Init_PQRY_PARAMESTAM19_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI545(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAMETRI545, 16);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAMETRI545, "TBL_PARAMETRI545");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMSEDDEL,5,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDE1, "ROWNAMNUMDE1");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDE1,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDE1, "ROWNAMANNDE1");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDE1,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEPROPO,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEDELIB,5,255,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMPERDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEPERAL, "ROWNAMEPERAL");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMEPERAL,6,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMRESCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_RONATOPECOBI, "RONATOPECOBI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_RONATOPECOBI,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMTOVAIM, "ROWNAMTOVAIM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAMETRI545,IMDBDef4.FLD_PARAMETRI545_ROWNAMTOVAIM,5,2,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAMETRI545, 0);
  }

  private static void Init_PQRY_PARAMESTAM19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM19, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM19, "PQRY_PARAMESTAM19");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMRESCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMPERDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPERAL, "ROWNAMEPERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPERAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_RONATOPECOBI, "RONATOPECOBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_RONATOPECOBI,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTOVAIM, "ROWNAMTOVAIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTOVAIM,5,2,0);
    IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM19, 0);
  }

  private static void Init_PQRY_PARAMESTAM19_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef14.PQRY_PARAMESTAM19_RS, 13);
    IMDB.set_TblCode(IMDBDef14.PQRY_PARAMESTAM19_RS, "PQRY_PARAMESTAM19_RS");
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTIPVAR, "ROWNAMTIPVAR");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTIPVAR,1,2,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, "ROWNAMEDELIB");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, "ROWNAMNUMDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL,1,6,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMRESCOM, "ROWNAMRESCOM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMRESCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMPERDAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPERAL, "ROWNAMEPERAL");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPERAL,6,15,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, "ROWNAMEPROPO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO,5,255,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, "ROWNAMANNPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, "ROWNAMNUMPRO");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO,1,4,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_RONATOPECOBI, "RONATOPECOBI");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_RONATOPECOBI,5,1,0);
    IMDB.set_FldCode(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTOVAIM, "ROWNAMTOVAIM");
    IMDB.SetFldParams(IMDBDef14.PQRY_PARAMESTAM19_RS,IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTOVAIM,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public VariazioniSubimpegni(MyWebEntryPoint w, IMDBObj imdb)
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
  public VariazioniSubimpegni()
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
    FormIdx = MyGlb.FRM_VARIAZSUBIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "CAAFBD5B-6A5B-4140-9860-876F4B03EC38";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 368;
    DesignHeight = 350;
    set_Caption(new IDVariant("Variazioni Subimpegni"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 368;
    Frames[1].Height = 324;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 324;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 368-MyGlb.PAN_OFFS_X, 324-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "B3761A7E-98F5-483A-92B3-7BBFBBBA1A7E");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1200, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 1;
    PAN_PARAMETRI_Init();
    PAN_PARAMETRI_InitFields();
    PAN_PARAMETRI_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAMETRI545, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        VARIAZSUBIMP_PARAMESTAM19();
      }
      PAN_PARAMETRI.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTAPROPOS && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRIPROPOSTA) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTADELIBE && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_APRIDELIBERA) {
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
    return (obj instanceof VariazioniSubimpegni);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? VariazioniSubimpegni.class.getName() : (Glb.ClassWithPackage(VariazioniSubimpegni.class) ? VariazioniSubimpegni.class.getName().substring(VariazioniSubimpegni.class.getPackage().getName().length() + 1) : VariazioniSubimpegni.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Parametri On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAMETRI_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAMETRI, Cancel);
      // 
      // Parametri On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0))))
      {
        IDVariant v_SEDEDEL = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMERODEL = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNODEL = new IDVariant(0,IDVariant.INTEGER);
        v_SEDEDEL = IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0));
        v_NUMERODEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0);
        v_ANNODEL = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0);
        MainFrm.ControlloDelibereNonDaInserire(v_SEDEDEL, v_ANNODEL, v_NUMERODEL);
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0, new IDVariant(v_SEDEDEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0, new IDVariant(v_NUMERODEL));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0, new IDVariant(v_ANNODEL));
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0))))
      {
        IDVariant v_UNITAPROP = new IDVariant(0,IDVariant.STRING);
        IDVariant v_NUMEROPROP = new IDVariant(0,IDVariant.INTEGER);
        IDVariant v_ANNOPROP = new IDVariant(0,IDVariant.INTEGER);
        v_UNITAPROP = IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0));
        v_NUMEROPROP = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0);
        v_ANNOPROP = IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0);
        MainFrm.ControlloProposte(v_UNITAPROP, v_ANNOPROP, v_NUMEROPROP);
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0, new IDVariant(v_UNITAPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0, new IDVariant(v_NUMEROPROP));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0, new IDVariant(v_ANNOPROP));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "ParametriOnValidateRowEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMETRI_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMETRI);
      // 
      // Parametri On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0))))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0))) && MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
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
      // Parametri On Updating Row Event Body
      // Procedure Body
      // 
      if (Column.equals((new IDVariant(PFL_PARAMETRI_DELIBERA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0)));
        }
      }
      if (Column.equals((new IDVariant(PFL_PARAMETRI_PROPOSTA)), true))
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0))))
        {
          IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0, IDL.Upper(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0)));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "ParametriOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Apri Rendiconto Fatture
  // **********************************************************************
  public int ApriRendicontoFatture ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Rendiconto Fatture Body
      // Procedure Body
      // 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "ApriRendicontoFatture", _e);
      return -1;
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
    IDVariant v_NOMECAPTION = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMECAPTION = (new IDVariant("Variazione Impegni", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      LOADEVENT_PARAMEDELETE();
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMPERDAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPERAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMRESCOM, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMTIPVAR, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_RONATOPECOBI, 0, (new IDVariant("NO")));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
      if (MainFrm.GESTIODELIBE.booleanValue())
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDE1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDE1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPROPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMTIPVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEDELIB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMPERDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPERAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMRESCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_RONATOPECOBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMTOVAIM, 0, new IDVariant());
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTADELIBE)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_SEDE_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_NUMERO_DEL, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0, IMDB.Value(IMDBDef7.PQRY_DEL1, IMDBDef7.PQSL_DEL1_ANNO_DEL, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAPROPOS)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_UNITA_PROPONENTE, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_NUMERO, 0));
        IMDB.set_Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0, IMDB.Value(IMDBDef7.PQRY_PROPOSTE1, IMDBDef7.PQSL_PROPOSTE1_ANNO, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "EndModalEvent", _e);
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
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMSEDDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDE1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDE1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPROPO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMPRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMTIPVAR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEDELIB, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDEL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMPERDAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPERAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMRESCOM, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_RONATOPECOBI, 0, new IDVariant());
    IMDB.set_Value(IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMTOVAIM, 0, new IDVariant());
  }

  // **********************************************************************
  // Elabora
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMPERDAL, 0).compareTo(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPERAL, 0), true)>0 || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMPERDAL, 0)) || IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPERAL, 0)))
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Invalidazione date di ricerca: possibile incoerenza nei dati di ricerca per data", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_MSG); 
        return 0;
      }
      if ((!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0)))) || (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0))))
      {
        if ((!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0)))) || (IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0))))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("ANNO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("DATA_DAL")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMPERDAL, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("DATA_AL")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPERAL, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("COMP")), IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMRESCOM, 0));
          MainFrm.SetParametroStampaJasper((new IDVariant("TIPO_VAR")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTIPVAR, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("SEDE_DEL")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("NUM_DEL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_DEL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("UNI_PRO")), IDL.ToString(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0)));
          MainFrm.SetParametroStampaJasper((new IDVariant("NUM_PRO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("ANNO_PRO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0),(new IDVariant(-1)))));
          MainFrm.SetParametroStampaJasper((new IDVariant("TOT_COD_BIL")), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_RONATOPECOBI, 0),(new IDVariant("NO"))));
          MainFrm.SetParametroStampaJasper((new IDVariant("TOT_VAR_IMP")), IDL.NullValue(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMTOVAIM, 0),(new IDVariant("NO"))));
          MainFrm.LanciaStampaJasper((new IDVariant("Variazioni_Subimpegni")), (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
        }
        else
        {
          IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
          v_AVVISO = (new IDVariant("I dati della proposta sono incompleti", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_AVVISO); 
        }
      }
      else
      {
        IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
        v_AVVISO = (new IDVariant("I dati della delibera sono incompleti ", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_AVVISO); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Capitolo
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneCapitolo ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Capitolo Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, (new IDVariant("S")));
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOMODULO, 0).equals((new IDVariant("CFA")), true))
      {
      }
      else
      {
      }
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "SelezioneCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Delibere Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTADELIBE, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "SelezioneDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Delibere
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoDelibere ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Delibere Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMESEDE, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEDELIB, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNDEL, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI437, IMDBDef1.FLD_PARAMETRI437_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMDEL, 0));
        MainFrm.Show(MyGlb.FRM_INFODELIBERA, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "InfoDelibere", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Selezione Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int SelezioneProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Selezione Proposte Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCELTAPROPOS, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "SelezioneProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Proposte
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoProposte ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Proposte Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEUNITA, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMEPROPO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMENUMER, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMNUMPRO, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI7, IMDBDef1.FLD_PARAMETRI7_ROWNAMEANNO, 0, IMDB.Value(IMDBDef14.PQRY_PARAMESTAM19, IMDBDef14.PQSL_PARAMESTAM19_ROWNAMANNPRO, 0));
        MainFrm.Show(MyGlb.FRM_INFORMPROPOS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("VariazioniSubimpegni", "InfoProposte", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void VARIAZSUBIMP_PARAMESTAM19() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef14.PQRY_PARAMESTAM19_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI545, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAMETRI545, 0))
    {
      IMDB.TblAddNew(IMDBDef14.PQRY_PARAMESTAM19_RS, 0);
      IMDB.TblLinkRow(IMDBDef14.PQRY_PARAMESTAM19_RS, 0, IMDBDef4.TBL_PARAMETRI545, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 0, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 1, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMTIPVAR, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 2, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEDELIB, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 3, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 4, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDEL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 5, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMRESCOM, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 6, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMPERDAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 7, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPERAL, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 8, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPROPO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 9, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNPRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 10, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMPRO, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 11, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_RONATOPECOBI, 0);
      IMDB.TblLinkField(IMDBDef14.PQRY_PARAMESTAM19_RS, 12, 0, IMDBDef4.TBL_PARAMETRI545, IMDBDef4.FLD_PARAMETRI545_ROWNAMTOVAIM, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAMETRI545, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAMETRI545, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAMETRI545, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef14.PQRY_PARAMESTAM19_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFOPROPOSTA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoProposte();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_APRIDELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneDelibere();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_INFODELIBERA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoDelibere();
      Cancel.set(IDVariant.TRUE);
    }
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMETRI_Init()
  {

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "516C8BF1-C981-4528-895B-A48105CFD362");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "Periodo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_LIST, 0, -9999, 84, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, MyGlb.PANEL_FORM, 24, 11, 312, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 43);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_PERIODO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 23);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "3C13DD0A-4C4B-4610-8A97-2C2FD7618203");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "Esercizio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "D2AD0215-2D84-4EC7-A890-9269A3CA9372");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "93A03D25-E946-4F2F-94A8-D736E517E9E8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "6A99EE88-1A07-461C-AB03-6B3964BAD18A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "6AB85818-1B77-437E-AF71-6E8AD88291F1");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, "2E430902-B2AC-4824-925E-7208CC2D54BF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, "Solo SubImpegni Di Competenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, "36BB150C-3889-42F3-B0B4-679EB6A22865");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, "Totali per Missione/Programma/Titolo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "8D50EBFA-64D8-4771-9A46-DA36E8E4F81B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "Proposta");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, "851DF832-5618-4BE6-9F8E-156AE2C17DB8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "FEAB5B99-001C-48C4-B21F-D2DEFC11BC35");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "Numero Prop");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, "39EAF7C4-01C4-44AE-8FBC-87AC537F6891");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "D20057EE-23DA-4449-91B2-B9FA6EB143FA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "Anno Prop");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, "ED2EF744-96EB-4964-ABA7-99CCE9B9C58C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, "FC31FB42-014D-4CA3-BF35-80E72136149B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "6D8E03F3-B9E3-4D34-A366-87CF3C348795");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "8D2DECCA-C297-410D-B225-C23ABAB8A950");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "Numero Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "433CBE62-96A9-42CA-B19C-51C050074FA2");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "Anno Delibera");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "C85C76EB-2184-4193-B001-EBE9C3FCE5B8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "Tipo Variazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, "50DB4EC5-9E26-4FED-8A38-95FDA22CDBCA");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, "-");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, "8A32140F-FA5B-4ADD-B49B-36D40111E77D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, "/");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, "4CD713BB-BA31-4834-86A5-65D490ABC91D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "2319A4B5-B094-4178-9843-76343BA6066F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.VIS_IMAGEBUTTONS);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0, "info.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, "7509DCA8-094E-4AF3-833C-5D9CF2D17FF7");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, "Tot. Var. SubImpegno");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ESERCIZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ESERCIZIO, PPQRY_PARAMESTAM19, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28, 36, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMESTAM19, "A.ROWNAMPERDAL", "ROWNAMPERDAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 200, 36, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMESTAM19, "A.ROWNAMEPERAL", "ROWNAMEPERAL", 6, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 240, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 320, 48, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_PERIODO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 252, 252, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_LIST, 0, 36, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_LIST, 144);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_LIST, "Solo SubImpegni Di Competenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_FORM, 132, 72, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_FORM, 200);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOSUBDICOM, MyGlb.PANEL_FORM, "Solo SubImpegni Di Competenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOSUBDICOM, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOSUBDICOM, PPQRY_PARAMESTAM19, "A.ROWNAMRESCOM", "ROWNAMRESCOM", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOSUBDICOM, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOSUBDICOM, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOSUBDICOM, (new IDVariant("T")), "Entrambi", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_LIST, 104);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_LIST, "Tot. per Miss. Progr. Titolo");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_FORM, 72, 96, 264, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_FORM, 240);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTPERCODBIL, MyGlb.PANEL_FORM, "Totali per Missione/Programma/Titolo");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTPERCODBIL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTPERCODBIL, PPQRY_PARAMESTAM19, "A.RONATOPECOBI", "RONATOPECOBI", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERCODBIL, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTPERCODBIL, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 0, 36, 52, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 52);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_LIST, "Prop.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 40, 154, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_PROPOSTA, MyGlb.PANEL_FORM, "Proposta");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_PROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_PROPOSTA, PPQRY_PARAMESTAM19, "A.ROWNAMEPROPO", "ROWNAMEPROPO", 5, 255, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, MyGlb.PANEL_FORM, 148, 154, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINODEL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINODEL1, -1, "", "TRATTINODEL1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_LIST, "Numero Prop");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 164, 154, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 72);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROPROP, MyGlb.PANEL_FORM, "Num. Prop");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROPROP, PPQRY_PARAMESTAM19, "A.ROWNAMNUMPRO", "ROWNAMNUMPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, MyGlb.PANEL_LIST, 124, 44, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, MyGlb.PANEL_FORM, 212, 154, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASHDEL1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASHDEL1, -1, "", "SLASHDEL1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 0, 36, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_LIST, "Anno Prop");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 228, 154, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNOPROP, MyGlb.PANEL_FORM, "Ann. Prop");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNOPROP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNOPROP, PPQRY_PARAMESTAM19, "A.ROWNAMANNPRO", "ROWNAMANNPRO", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_LIST, 240, 32, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_FORM, 272, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIPROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIPROPOSTA, -1, "", "APRIPROPOSTA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_FORM, 288, 156, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFOPROPOSTA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFOPROPOSTA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFOPROPOSTA, -1, "", "INFOPROPOSTA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 48);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_LIST, "Delib.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 44, 184, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DELIBERA, MyGlb.PANEL_FORM, "Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DELIBERA, PPQRY_PARAMESTAM19, "A.ROWNAMEDELIB", "ROWNAMEDELIB", 5, 255, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_LIST, "Numero Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 164, 184, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMERODELIBE, MyGlb.PANEL_FORM, "Num. Delibera");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMERODELIBE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMERODELIBE, PPQRY_PARAMESTAM19, "A.ROWNAMNUMDEL", "ROWNAMNUMDEL", 1, 6, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_LIST, "Anno Delibera");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 228, 184, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ANNODELIBERA, MyGlb.PANEL_FORM, "Ann. Delib.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ANNODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ANNODELIBERA, PPQRY_PARAMESTAM19, "A.ROWNAMANNDEL", "ROWNAMANNDEL", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_LIST, "Tipo Variazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, -4, 212, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOVARIAZIO, MyGlb.PANEL_FORM, "Tipo Variazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOVARIAZIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOVARIAZIO, PPQRY_PARAMESTAM19, "A.ROWNAMTIPVAR", "ROWNAMTIPVAR", 1, 2, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, MyGlb.PANEL_LIST, 108, 28, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, MyGlb.PANEL_FORM, 148, 184, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TRATTINODEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TRATTINODEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TRATTINODEL, -1, "", "TRATTINODEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, MyGlb.PANEL_LIST, 116, 36, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, MyGlb.PANEL_FORM, 212, 184, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SLASHDEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SLASHDEL, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SLASHDEL, -1, "", "SLASHDEL", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 232, 24, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 272, 186, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_APRIDELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_APRIDELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_APRIDELIBERA, -1, "", "APRIDELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 224, 16, 20, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 288, 186, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_INFODELIBERA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_INFODELIBERA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_INFODELIBERA, -1, "", "INFODELIBERA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_LIST, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_LIST, "Tot Var SubImp.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_FORM, 200, 120, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TOTVARIMP, MyGlb.PANEL_FORM, "Tot Var SubImp.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TOTVARIMP, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TOTVARIMP, PPQRY_PARAMESTAM19, "A.ROWNAMTOVAIM", "ROWNAMTOVAIM", 5, 2, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTVARIMP, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TOTVARIMP, (new IDVariant()), "Null", "", "", -1);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPVAR~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T55, 0, SQL, PFL_PARAMETRI_TIPOVARIAZIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T55CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T55DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T55 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T55, 1, SQL, PFL_PARAMETRI_TIPOVARIAZIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T55, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMESTAM19", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMESTAM19, IMDBDef14.PQRY_PARAMESTAM19_RS, IMDBDef4.TBL_PARAMETRI545);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ESERCIZIO, IMDBDef4.FLD_PARAMETRI545_ROWNAMEESERC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef4.FLD_PARAMETRI545_ROWNAMPERDAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPERAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOSUBDICOM, IMDBDef4.FLD_PARAMETRI545_ROWNAMRESCOM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOTPERCODBIL, IMDBDef4.FLD_PARAMETRI545_RONATOPECOBI);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_PROPOSTA, IMDBDef4.FLD_PARAMETRI545_ROWNAMEPROPO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROPROP, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNOPROP, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DELIBERA, IMDBDef4.FLD_PARAMETRI545_ROWNAMEDELIB);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMERODELIBE, IMDBDef4.FLD_PARAMETRI545_ROWNAMNUMDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_ANNODELIBERA, IMDBDef4.FLD_PARAMETRI545_ROWNAMANNDEL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOVARIAZIO, IMDBDef4.FLD_PARAMETRI545_ROWNAMTIPVAR);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TOTVARIMP, IMDBDef4.FLD_PARAMETRI545_ROWNAMTOVAIM);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI545");
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

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_CellActivated(ColIndex, Cancel);
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
