// **********************************************
// Situazione Liquidazioni Per Impegno
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneLiquidazioniPerImpegno extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMESTAMPA_CAPITOLO = 0;

  private static int PFL_PARAMESTAMPA_ESERCIZIO = 0;
  private static int PFL_PARAMESTAMPA_TIPOUTENZA = 1;
  private static int PFL_PARAMESTAMPA_ELABORBUTTON = 2;
  private static int PFL_PARAMESTAMPA_DATAELABORAZ = 3;
  private static int PFL_PARAMESTAMPA_RESIDUICOMPE = 4;
  private static int PFL_PARAMESTAMPA_SOLOEMESSE = 5;
  private static int PFL_PARAMESTAMPA_CODICEUTENZA = 6;
  private static int PFL_PARAMESTAMPA_CAPITOLO = 7;
  private static int PFL_PARAMESTAMPA_ARTICOLO = 8;
  private static int PFL_PARAMESTAMPA_NEWPANELLABE = 9;
  private static int PFL_PARAMESTAMPA_NEWPANELABE1 = 10;
  private static int PFL_PARAMESTAMPA_SLASHLABEL = 11;
  private static int PFL_PARAMESTAMPA_APRINFVOCPEG = 12;
  private static int PFL_PARAMESTAMPA_PULAPRVOCPEG = 13;
  private static int PFL_PARAMESTAMPA_IMPEGNO = 14;
  private static int PFL_PARAMESTAMPA_NUMEROIMPEGN = 15;
  private static int PFL_PARAMESTAMPA_SLASHIMPEGNO = 16;
  private static int PFL_PARAMESTAMPA_SCELTAIMPEGN = 17;
  private static int PFL_PARAMESTAMPA_INFOIMPEGNO = 18;

  private static int PPQRY_PARAMESTAM15 = 0;

  private static int PPQRY_TIPIUTENZA1 = 1;


  IDPanel PAN_PARAMESTAMPA;

  // Definition of Global Variables
  private IDVariant TIPOUTENDEFA = new IDVariant(0,IDVariant.STRING);
  private IDVariant CAPITOLO = new IDVariant(0,IDVariant.DECIMAL);
  private IDVariant ARTICOLO = new IDVariant(0,IDVariant.INTEGER);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMESTAM16(IMDB);
    Init_TBL_BENEFICIAR19(IMDB);
    //
    //
    Init_PQRY_PARAMESTAM15(IMDB);
    Init_PQRY_PARAMESTAM15_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMESTAM16(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMESTAM16, 15);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMESTAM16, "TBL_PARAMESTAM16");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMENUME1, "ROWNAMENUME1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMENUME1,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMANNDEL, "ROWNAMANNDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMANNDEL,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMSEDDEL, "ROWNAMSEDDEL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMSEDDEL,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMECODIC,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMRECOEN,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMESOLOE, "ROWNAMESOLOE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMESOLOE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMESESSI, "ROWNAMESESSI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMESESSI,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEANNOI, "ROWNAMEANNOI");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMEANNOI,1,5,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMESTAM16,IMDBDef2.FLD_PARAMESTAM16_ROWNAMENUMER,1,5,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMESTAM16, 0);
  }

  private static void Init_TBL_BENEFICIAR19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_BENEFICIAR19, 2);
    IMDB.set_TblCode(IMDBDef2.TBL_BENEFICIAR19, "TBL_BENEFICIAR19");
    IMDB.set_FldCode(IMDBDef2.TBL_BENEFICIAR19,IMDBDef2.FLD_BENEFICIAR19_ROWNAMRAGSOC, "ROWNAMRAGSOC");
    IMDB.SetFldParams(IMDBDef2.TBL_BENEFICIAR19,IMDBDef2.FLD_BENEFICIAR19_ROWNAMRAGSOC,5,60,0);
    IMDB.set_FldCode(IMDBDef2.TBL_BENEFICIAR19,IMDBDef2.FLD_BENEFICIAR19_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef2.TBL_BENEFICIAR19,IMDBDef2.FLD_BENEFICIAR19_ROWNAMECODIC,1,8,0);
    IMDB.TblAddNew(IMDBDef2.TBL_BENEFICIAR19, 0);
  }

  private static void Init_PQRY_PARAMESTAM15(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAM15, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAM15, "PQRY_PARAMESTAM15");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECODIC,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMRECOEN,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMESOLOE, "ROWNAMESOLOE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMESOLOE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, "ROWNAMEANNOI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER,1,5,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAM15, 0);
  }

  private static void Init_PQRY_PARAMESTAM15_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMESTAM15_RS, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMESTAM15_RS, "PQRY_PARAMESTAM15_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEESERC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECODIC, "ROWNAMECODIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECODIC,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMRECOEN, "ROWNAMRECOEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMRECOEN,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMESOLOE, "ROWNAMESOLOE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMESOLOE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, "ROWNAMEANNOI");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI,1,5,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER, "ROWNAMENUMER");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMESTAM15_RS,IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER,1,5,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneLiquidazioniPerImpegno(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneLiquidazioniPerImpegno()
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
    FormIdx = MyGlb.FRM_SITLIQPERIMP;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7E9B71BD-800E-4FC1-BE85-3A166A4C1CE5";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 340;
    DesignHeight = 262;
    set_Caption(new IDVariant("Situazione Liquidazioni Per Impegno"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 340;
    Frames[1].Height = 236;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri Stampa";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 236;
    PAN_PARAMESTAMPA = new IDPanel(w, this, 1, "PAN_PARAMESTAMPA");
    Frames[1].Content = PAN_PARAMESTAMPA;
    PAN_PARAMESTAMPA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMESTAMPA.VS = MainFrm.VisualStyleList;
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 340-MyGlb.PAN_OFFS_X, 236-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "8D0C7B5B-5DC1-4BF8-B725-76847F708615");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1440, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMESTAMPA.InitStatus = 1;
    PAN_PARAMESTAMPA_Init();
    PAN_PARAMESTAMPA_InitFields();
    PAN_PARAMESTAMPA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMESTAM16, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITLIQPERIMP_PARAMESTAM15();
      }
      PAN_PARAMESTAMPA.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_PARAMESTAMPA.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMESTAMPA_PULAPRVOCPEG) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTAIMPEGN && flRis && IdxPanelActived == PAN_PARAMESTAMPA.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMESTAMPA_SCELTAIMPEGN) {
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
    return (obj instanceof SituazioneLiquidazioniPerImpegno);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneLiquidazioniPerImpegno.class.getName() : (Glb.ClassWithPackage(SituazioneLiquidazioniPerImpegno.class) ? SituazioneLiquidazioniPerImpegno.class.getName().substring(SituazioneLiquidazioniPerImpegno.class.getPackage().getName().length() + 1) : SituazioneLiquidazioniPerImpegno.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.UnloadForm(MyGlb.FRM_INFOSUVOCBIL,(new IDVariant(-1)).booleanValue()); 
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "ApriInfoVociBilancio", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PARAMESTAMPA_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PARAMESTAMPA);
      // 
      // Parametri Stampa On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC, 0))))
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER, 0))))
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAMESTAMPA.SetFlags (Glb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "ParametriStampaOnDynamicPropertiesEvent", _e);
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
      v_NOMECAPTION = (new IDVariant("Situazione Liquidazioni Per Impegno", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMDATELA, 0, IDL.Today());
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINTIPUTECOD ");
      SQL.append("from ");
      SQL.append("  TIPI_UTENZA A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        TIPOUTENDEFA = QV.Get("MINTIPUTECOD", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMTIPUTE, 0, new IDVariant(TIPOUTENDEFA));
      IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMRECOEN, 0, (new IDVariant("T")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "LoadEvent", _e);
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
      SQL = new StringBuffer();
      SQL.append("delete from WRK_SIT_UTENZE ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "UnloadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTAIMPEGN)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEANNOI, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ANNO_IMP, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMENUMER, 0, IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_NUMERO_IMP, 0));
        CAPITOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_CAPITOLO, 0);
        ARTICOLO = IMDB.Value(IMDBDef7.PQRY_ESEIMP3, IMDBDef7.PQSL_ESEIMP3_ARTICOLO, 0);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "EndModalEvent", _e);
    }
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
      SQL = new StringBuffer();
      SQL.append("delete from WRK_SIT_UTENZE ");
      MainFrm.Cf4armDBObject.DBO().Execute(SQL);
      // 
      // controllo preliminare sui campi
      // 
      {
        IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
        v_MSG = (new IDVariant("Estrazione di Competenza non corretta per un Impegno di residuo", IDVariant.STRING));
        if (IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0 && IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMRECOEN, 0).equals((new IDVariant("C")), true) && !(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, 0))))
        {
          MainFrm.set_AlertMessage(v_MSG); 
          return 0;
        }
      }
      MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
      MainFrm.Cf4armDBObject.WORKSITUTENZEIMP(IDL.ToString(MainFrm.PROGRESESSIO), IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMTIPUTE, 0), IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, 0),(new IDVariant(-1))), IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER, 0),(new IDVariant(-1))), IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMECAPIT, 0),(new IDVariant(-1))), IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEARTIC, 0),(new IDVariant(-1))), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMRECOEN, 0), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMESOLOE, 0), IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMDATELA, 0));
      if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
      {
        MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Sit_Liq_CodUte"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_PROGRESSIVO_SESSIONE")), IDL.ToString(MainFrm.PROGRESESSIO));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMDATELA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO")), (new IDVariant("I")));
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setta Riferimento Bilancio
  // **********************************************************************
  public int SettaRiferimentoBilancio ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Setta Riferimento Bilancio Body
      // Procedure Body
      // 
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "SettaRiferimentoBilancio", _e);
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
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "SelezioneCapitolo", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Impegno RIM
  // **********************************************************************
  public int SceltaImpegnoRIM ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Impegno RIM Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMPROUNI, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI400, IMDBDef1.FLD_PARAMETRI400_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      MainFrm.Show(MyGlb.FRM_SCELTAIMPEGN, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "SceltaImpegnoRIM", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Impegno
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int InfoImpegno ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Impegno Body
      // Procedure Body
      // 
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, 0)) && IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER, 0)))
      {
        return 0;
      }
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMANNIMP, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMNUMIMP, 0, IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMENUMER, 0));
      if (IMDB.Value(IMDBDef9.PQRY_PARAMESTAM15, IMDBDef9.PQSL_PARAMESTAM15_ROWNAMEANNOI, 0).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)<0)
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("R")));
      }
      else
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAMETRI62, IMDBDef4.FLD_PARAMETRI62_ROWNAMIMPRES, 0, (new IDVariant("INFO")));
      }
      MainFrm.Show(MyGlb.FRM_INFORMIMPEGN, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneLiquidazioniPerImpegno", "InfoImpegno", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri Stampa
  // Primary record source for panel data
  // **********************************************************************
  private void SITLIQPERIMP_PARAMESTAM15() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMESTAM15_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAM16, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMESTAM16, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMESTAM15_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMESTAM15_RS, 0, IMDBDef2.TBL_PARAMESTAM16, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 0, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 1, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMTIPUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 2, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEDESCT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 3, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 4, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMECODIC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 5, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMRECOEN, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 6, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMESOLOE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 7, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 8, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 9, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEANNOI, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMESTAM15_RS, 10, 0, IMDBDef2.TBL_PARAMESTAM16, IMDBDef2.FLD_PARAMESTAM16_ROWNAMENUMER, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMESTAM16, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMESTAM16, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMESTAM16, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMESTAM15_RS, 0);
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
  private void PAN_PARAMESTAMPA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAMESTAMPA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PARAMESTAMPA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PARAMESTAMPA, Cancel);
    // Stub
  }

  private void PAN_PARAMESTAMPA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_APRINFVOCPEG)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriInfoVociBilancio();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_PULAPRVOCPEG)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SelezioneCapitolo();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_SCELTAIMPEGN)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaImpegnoRIM();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMESTAMPA_INFOIMPEGNO)
    {
      this.IdxPanelActived = this.PAN_PARAMESTAMPA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoImpegno();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAMESTAMPA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_PARAMESTAMPA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PARAMESTAMPA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAMESTAMPA_Init()
  {

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, "024C0B4B-7A92-4701-A963-BB0A514580BB");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, "Capitolo");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, 0, -9999, 48, 16, 0, 0);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, 16, 39, 312, 53, 0, 0);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, 0, 46);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, 1, 13);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, 0, 4);
    PAN_PARAMESTAMPA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, 1, 4);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMESTAMPA_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "78B5349C-0D26-48F0-A40F-17EA2D630DA8");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "Esercizio");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "CD19E3D6-A545-42F2-9A21-D421EACACD8F");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "Tipo Utenza");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "D328A958-337D-49B7-AB3D-E1F2C1C56C46");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, "Elabora");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "4571847A-21AA-4CE2-AFA1-274333A59283");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, "B16148C6-CEB6-4FB7-805A-035440D8B4D7");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, "Residuicompetenzaentrambi");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.VIS_OPTIONBUTTON);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, "9D9FFC97-E5B9-4056-AF3E-501B2FB70BE0");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, "Solo Emesse");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "BEBAB7E3-493B-4594-9D40-19CE0EF9A547");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "Codiceutenza");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.VIS_NORMFIELPADR);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, "5FC8AB8D-974D-4A79-A583-5BE2761FD458");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, "Capitolo");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, "0F99E1D7-6E31-4029-973F-B016061141CD");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, "Articolo");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, "560460BC-10DD-4254-8105-193D28BD2CCD");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, "09A4403A-CB9C-4151-A3C5-196F3A06E869");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, "1D9B7842-8EC3-4288-AE40-6F82084EC16E");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, "/");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, "FFD3EDBD-7572-4DA5-9FD7-5EE27089F784");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, 0, "info.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, "A798C560-B7DF-45F8-A751-594F8E0AF32B");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, 0, "wsearch.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, "C1D0A937-3FA8-4B30-B4E8-F56C009FB525");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, "Impegno");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, "5BFDB78A-2B2A-4FF8-A13F-75796476B84A");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, "Numeroimpegno");
    PAN_PARAMESTAMPA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, "322A8FB5-19D1-4376-82B3-5A31DA636FE3");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, "/");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, "2DFCAF6A-31DA-4ED6-9640-A533D2DC3F35");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, 0, "wsearch.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMESTAMPA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, "13A4AB7B-0FC7-4532-A84D-D430D8D688B1");
    PAN_PARAMESTAMPA.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, "");
    PAN_PARAMESTAMPA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMESTAMPA.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, 0, "info.gif", false);
    PAN_PARAMESTAMPA.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMESTAMPA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 52);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_LIST, "Esercizio");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 296, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 80);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ESERCIZIO, MyGlb.PANEL_FORM, "Esercizio");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ESERCIZIO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ESERCIZIO, PPQRY_PARAMESTAM15, "A.ROWNAMEESERC", "ROWNAMEESERC", 1, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 64);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_LIST, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 16, 12, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_TIPOUTENZA, MyGlb.PANEL_FORM, "Tipo Utenza");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_TIPOUTENZA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_TIPOUTENZA, PPQRY_PARAMESTAM15, "A.ROWNAMTIPUTE", "ROWNAMTIPUTE", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 100, 168, 60, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 244, 192, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ELABORBUTTON, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 132, 124, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_DATAELABORAZ, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_DATAELABORAZ, PPQRY_PARAMESTAM15, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_LIST, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_LIST, "Residuicompetenzaentrambi");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_FORM, 20, 96, 308, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_FORM, 144);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_RESIDUICOMPE, MyGlb.PANEL_FORM, "Residuicompet.");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_RESIDUICOMPE, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_RESIDUICOMPE, PPQRY_PARAMESTAM15, "A.ROWNAMRECOEN", "ROWNAMRECOEN", 5, 1, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_RESIDUICOMPE, (new IDVariant("R")), "Residui", "", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_RESIDUICOMPE, (new IDVariant("C")), "Competenza", "", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_RESIDUICOMPE, (new IDVariant("T")), "Entrambi", "", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, 64);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_LIST, "Solo Emesse");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, 20, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, 80);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SOLOEMESSE, MyGlb.PANEL_FORM, "Solo Emesse");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_SOLOEMESSE, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_SOLOEMESSE, PPQRY_PARAMESTAM15, "A.ROWNAMESOLOE", "ROWNAMESOLOE", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_SOLOEMESSE, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMESTAMPA.SetValueListItem(PFL_PARAMESTAMPA_SOLOEMESSE, (new IDVariant()), "Null", "", "", -1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_LIST, "Codiceutenza");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 4, 264, 336, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CODICEUTENZA, MyGlb.PANEL_FORM, "Codiceut.");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_CODICEUTENZA, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_CODICEUTENZA, PPQRY_PARAMESTAM15, "A.ROWNAMECODIC", "ROWNAMECODIC", 5, 49, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_LIST, "Capit.");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, 60, 64, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, 48);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_CAPITOLO, MyGlb.PANEL_FORM, "Capit.");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_CAPITOLO, -1, GRP_PARAMESTAMPA_CAPITOLO);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_CAPITOLO, PPQRY_PARAMESTAM15, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_LIST, "Artic.");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_FORM, 224, 64, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_FORM, 44);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_ARTICOLO, MyGlb.PANEL_FORM, "Artic.");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_ARTICOLO, -1, GRP_PARAMESTAMPA_CAPITOLO);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_ARTICOLO, PPQRY_PARAMESTAM15, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 112, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 20, 68, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_NEWPANELLABE, -1, GRP_PARAMESTAMPA_CAPITOLO);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, MyGlb.PANEL_LIST, 128, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, MyGlb.PANEL_FORM, 308, 76, 16, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_NEWPANELABE1, -1, GRP_PARAMESTAMPA_CAPITOLO);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, MyGlb.PANEL_LIST, 76, 88, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, MyGlb.PANEL_FORM, 208, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_SLASHLABEL, -1, GRP_PARAMESTAMPA_CAPITOLO);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_SLASHLABEL, -1, "", "SLASHLABEL", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, MyGlb.PANEL_LIST, 256, 64, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, MyGlb.PANEL_FORM, 268, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_APRINFVOCPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_APRINFVOCPEG, -1, GRP_PARAMESTAMPA_CAPITOLO);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_APRINFVOCPEG, -1, "", "APRINFVOCPEG", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, MyGlb.PANEL_LIST, 264, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, MyGlb.PANEL_FORM, 252, 68, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_PULAPRVOCPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_PULAPRVOCPEG, -1, GRP_PARAMESTAMPA_CAPITOLO);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_PULAPRVOCPEG, -1, "", "PULAPRVOCPEG", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_LIST, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_LIST, "Impegno");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_FORM, 4, 148, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_FORM, 76);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_IMPEGNO, MyGlb.PANEL_FORM, "Impegno");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_IMPEGNO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_IMPEGNO, PPQRY_PARAMESTAM15, "A.ROWNAMEANNOI", "ROWNAMEANNOI", 1, 5, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_LIST, 0, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_LIST, 88);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_LIST, "Numeroim.");
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_FORM, 148, 148, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_FORM, 88);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_NUMEROIMPEGN, MyGlb.PANEL_FORM, "Numeroim.");
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_NUMEROIMPEGN, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_NUMEROIMPEGN, PPQRY_PARAMESTAM15, "A.ROWNAMENUMER", "ROWNAMENUMER", 1, 5, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, MyGlb.PANEL_LIST, 84, 96, 12, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, MyGlb.PANEL_FORM, 128, 148, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SLASHIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_SLASHIMPEGNO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_SLASHIMPEGNO, -1, "", "SLASHIMPEGNO", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, MyGlb.PANEL_LIST, 272, 80, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, MyGlb.PANEL_FORM, 192, 152, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_SCELTAIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_SCELTAIMPEGN, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_SCELTAIMPEGN, -1, "", "SCELTAIMPEGN", 0, 0, 0, -13997);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, MyGlb.PANEL_LIST, 264, 72, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, MyGlb.PANEL_LIST, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMESTAMPA.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, MyGlb.PANEL_FORM, 212, 152, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMESTAMPA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, MyGlb.PANEL_FORM, 0);
    PAN_PARAMESTAMPA.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMESTAMPA_INFOIMPEGNO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMESTAMPA.SetFieldPage(PFL_PARAMESTAMPA_INFOIMPEGNO, -1, -1);
    PAN_PARAMESTAMPA.SetFieldPanel(PFL_PARAMESTAMPA_INFOIMPEGNO, -1, "", "INFOIMPEGNO", 0, 0, 0, -13997);
  }

  private void PAN_PARAMESTAMPA_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMESTAMPA.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPUTE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA1, 0, SQL, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMESTAMPA.SetQuery(PPQRY_TIPIUTENZA1, 1, SQL, PFL_PARAMESTAMPA_TIPOUTENZA, "");
    PAN_PARAMESTAMPA.SetQueryDB(PPQRY_TIPIUTENZA1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMESTAMPA.SetIMDB(IMDB, "PQRY_PARAMESTAM15", true);
    PAN_PARAMESTAMPA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMESTAMPA.SetQueryIMDB(PPQRY_PARAMESTAM15, IMDBDef9.PQRY_PARAMESTAM15_RS, IMDBDef2.TBL_PARAMESTAM16);
    JustLoaded = true;
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_ESERCIZIO, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEESERC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_TIPOUTENZA, IMDBDef2.FLD_PARAMESTAM16_ROWNAMTIPUTE);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_DATAELABORAZ, IMDBDef2.FLD_PARAMESTAM16_ROWNAMDATELA);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_RESIDUICOMPE, IMDBDef2.FLD_PARAMESTAM16_ROWNAMRECOEN);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_SOLOEMESSE, IMDBDef2.FLD_PARAMESTAM16_ROWNAMESOLOE);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_CODICEUTENZA, IMDBDef2.FLD_PARAMESTAM16_ROWNAMECODIC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_CAPITOLO, IMDBDef2.FLD_PARAMESTAM16_ROWNAMECAPIT);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_ARTICOLO, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEARTIC);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_IMPEGNO, IMDBDef2.FLD_PARAMESTAM16_ROWNAMEANNOI);
    PAN_PARAMESTAMPA.SetFieldPrimaryIndex(PFL_PARAMESTAMPA_NUMEROIMPEGN, IMDBDef2.FLD_PARAMESTAM16_ROWNAMENUMER);
    PAN_PARAMESTAMPA.SetMasterTable(0, "PARAMESTAM16");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PARAMESTAMPA.Status() == 2)
    {
      int oldListQBE = PAN_PARAMESTAMPA.iUseListQBE;
      PAN_PARAMESTAMPA.iUseListQBE = 0;
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_SEARCH);
      PAN_PARAMESTAMPA.PanelCommand(Glb.PCM_FIND);
      PAN_PARAMESTAMPA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PARAMESTAMPA) PAN_PARAMESTAMPA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
