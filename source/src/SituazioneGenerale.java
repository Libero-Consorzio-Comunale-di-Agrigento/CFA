// **********************************************
// Situazione Generale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class SituazioneGenerale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAM_PARTE = 0;

  private static int PFL_PARAM_DETTAGCAPITO = 0;
  private static int PFL_PARAM_DESCRIINTERV = 1;
  private static int PFL_PARAM_DESCRIABBREV = 2;
  private static int PFL_PARAM_SOLTOTPERTIT = 3;
  private static int PFL_PARAM_SOLOCOMPETEN = 4;
  private static int PFL_PARAM_SERVIZOPERAT = 5;
  private static int PFL_PARAM_VOCEPEG = 6;
  private static int PFL_PARAM_CAPITOLO = 7;
  private static int PFL_PARAM_ARTICOLO = 8;
  private static int PFL_PARAM_DATAELABORAZ = 9;
  private static int PFL_PARAM_PARTE = 10;
  private static int PFL_PARAM_TRATTINO = 11;
  private static int PFL_PARAM_BARRA = 12;
  private static int PFL_PARAM_SCELTAPEG = 13;
  private static int PFL_PARAM_INFOPEG = 14;
  private static int PFL_PARAM_ELABORA = 15;
  private static int PFL_PARAM_UNITAORGANIZ = 16;

  private static int PPQRY_PARAM89 = 0;


  IDPanel PAN_PARAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAM82(IMDB);
    //
    //
    Init_PQRY_PARAM89(IMDB);
    Init_PQRY_PARAM89_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAM82(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef4.TBL_PARAM82, 12);
    IMDB.set_TblCode(IMDBDef4.TBL_PARAM82, "TBL_PARAM82");
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDETCAP,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDESINT,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDESABB, "ROWNAMDESABB");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDESABB,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_RONASOTOPETI, "RONASOTOPETI");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_RONASOTOPETI,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMSOLCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMSEROPE,5,1,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMEINTER, "ROWNAMEINTER");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMEINTER,1,8,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMDATELA,6,15,0);
    IMDB.set_FldCode(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef4.TBL_PARAM82,IMDBDef4.FLD_PARAM82_ROWNAMUNIORG,5,1,0);
    IMDB.TblAddNew(IMDBDef4.TBL_PARAM82, 0);
  }

  private static void Init_PQRY_PARAM89(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM89, 12);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM89, "PQRY_PARAM89");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDESINT,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDESABB, "ROWNAMDESABB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDESABB,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_RONASOTOPETI, "RONASOTOPETI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_RONASOTOPETI,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMSOLCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMSEROPE,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMEINTER, "ROWNAMEINTER");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMEINTER,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMDATELA,6,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89,IMDBDef13.PQSL_PARAM89_ROWNAMUNIORG,5,1,0);
    IMDB.TblAddNew(IMDBDef13.PQRY_PARAM89, 0);
  }

  private static void Init_PQRY_PARAM89_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef13.PQRY_PARAM89_RS, 12);
    IMDB.set_TblCode(IMDBDef13.PQRY_PARAM89_RS, "PQRY_PARAM89_RS");
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDESINT,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDESABB, "ROWNAMDESABB");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDESABB,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_RONASOTOPETI, "RONASOTOPETI");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_RONASOTOPETI,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMSOLCOM, "ROWNAMSOLCOM");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMSOLCOM,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMSEROPE, "ROWNAMSEROPE");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMSEROPE,5,1,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMEINTER, "ROWNAMEINTER");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMEINTER,1,8,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, "ROWNAMECAPIT");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT,3,16,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, "ROWNAMEARTIC");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC,1,2,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMDATELA,6,15,0);
    IMDB.set_FldCode(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMUNIORG, "ROWNAMUNIORG");
    IMDB.SetFldParams(IMDBDef13.PQRY_PARAM89_RS,IMDBDef13.PQSL_PARAM89_ROWNAMUNIORG,5,1,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public SituazioneGenerale(MyWebEntryPoint w, IMDBObj imdb)
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
  public SituazioneGenerale()
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
    FormIdx = MyGlb.FRM_SITUAZGENERA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8F72C48D-EBCD-48D9-AFF9-4B2E099E4C3A";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 520;
    DesignHeight = 310;
    set_Caption(new IDVariant("Situazione Generale"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 520;
    Frames[1].Height = 284;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Param";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 284;
    PAN_PARAM = new IDPanel(w, this, 1, "PAN_PARAM");
    Frames[1].Content = PAN_PARAM;
    PAN_PARAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAM.VS = MainFrm.VisualStyleList;
    PAN_PARAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 520-MyGlb.PAN_OFFS_X, 284-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "CB3784A7-4B52-42AF-A048-236AB4005123");
    PAN_PARAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 728, 268, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAM.InitStatus = 2;
    PAN_PARAM_Init();
    PAN_PARAM_InitFields();
    PAN_PARAM_InitQueries();
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
      if (IMDB.TblModified(IMDBDef4.TBL_PARAM82, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        SITUAZGENERA_PARAM89();
      }
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
    if (CallerIdx == MyGlb.FRM_SCECAPARCOUO && flRis && IdxPanelActived == PAN_PARAM.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAM_SCELTAPEG) {
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
    return (obj instanceof SituazioneGenerale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? SituazioneGenerale.class.getName() : (Glb.ClassWithPackage(SituazioneGenerale.class) ? SituazioneGenerale.class.getName().substring(SituazioneGenerale.class.getPackage().getName().length() + 1) : SituazioneGenerale.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Param On Dynamic Properties Event
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
      // Param On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEINTER, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, 0))))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_INFOPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      // 
      // Parte
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, 0).equals((new IDVariant("ES")), true))
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_VOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP, 0).equals((new IDVariant("T")), true))
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_VOCEPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_VOCEPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        }
      }
      // 
      // Dettaglio Capitoli
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP, 0).equals((new IDVariant("T")), true))
      {
        // if (IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, 0).equals((new IDVariant("S")), true))
        // {
          // PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        // }
        // else
        // {
        // }
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        if (IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, 0).compareTo((new IDVariant("E")), true)!=0)
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        else
        {
          PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        }
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "ParamOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Param On Validate Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PARAM_IntValidateRow (IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.IntValidateRow(PAN_PARAM, Cancel);
      // 
      // Param On Validate Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEINTER, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, 0))))
      {
        IDVariant v_COUNT = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  CAP A ");
        SQL.append("where (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_COUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        if (v_COUNT.equals((new IDVariant(0)), true))
        {
          IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
          v_SMS = (new IDVariant("Codifica non presente nel Piano dei Conti !", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_SMS); 
          IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEINTER, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMECAPIT, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEARTIC, 0, (new IDVariant()));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "ParamOnValidateRowEvent", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEPARTE, 0, (new IDVariant("ES")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDETCAP, 0, (new IDVariant("M")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDESINT, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDESABB, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_RONASOTOPETI, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMSOLCOM, 0, (new IDVariant("C")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMSEROPE, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMUNIORG, 0, (new IDVariant("N")));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEINTER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEARTIC, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDATELA, 0, IDL.Today());
      if (IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0).compareTo(IDL.NullValue(MainFrm.ESERCIZIO_INIZIO_WEB,(new IDVariant(2999))), true)>=0)
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_PARAM.SetFlags (Glb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCECAPARCOUO)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOCA, 0));
        IMDB.set_Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, 0, IMDB.Value(IMDBDef7.PQRY_VISTABILAN10, IMDBDef7.PQSL_VISTABILAN10_VIBICABIUOAR, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "EndModalEvent", _e);
    }
  }

  // **********************************************************************
  // Scelta peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Sceltapeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEESERC, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI123, IMDBDef1.FLD_PARAMETRI123_ROWNAMEES, 0, IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, 0));
      MainFrm.Show(MyGlb.FRM_SCECAPARCOUO, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "Sceltapeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info peg
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Infopeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info peg Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEINTER, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, 0))))
      {
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, 0));
        IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMDATADAL, 0, IDL.Today());
        MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "Infopeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param Dettaglio Capitoli Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAM_DETTAGCAPITO_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Param Dettaglio Capitoli Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP, 0).equals((new IDVariant("T")), true))
      {
        IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEINTER, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMECAPIT, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEARTIC, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "ParamDettaglioCapitoliValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Parte Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAM_PARTE_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parte Validate Event Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEINTER, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMECAPIT, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEARTIC, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "ParteValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Elabora
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Elabora ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_NOMEDATAWIND = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMEDATAWIND = (new IDVariant("d_bil_gen_stampa", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEINTER, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMECAPIT, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEARTIC, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMDESINT, 0));
      MainFrm.SetParametroStampa((((PAN_PARAM.bFields(PFL_PARAM_SERVIZOPERAT).IsVisible(PAN_PARAM.AttR) && PAN_PARAM.bFields(PFL_PARAM_SERVIZOPERAT).IsPresent()))?IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMSEROPE, 0):IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMUNIORG, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMDESABB, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMSOLCOM, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_RONASOTOPETI, 0));
      MainFrm.SetParametroStampa(IDL.Add(IDL.ToString(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMDATELA, 0)), (new IDVariant("%20%2000:00:00"))));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef13.PQRY_PARAM89, IMDBDef13.PQSL_PARAM89_ROWNAMDETCAP, 0));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_NOMEDATAWIND);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("SituazioneGenerale", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Param
  // Primary record source for panel data
  // **********************************************************************
  private void SITUAZGENERA_PARAM89() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef13.PQRY_PARAM89_RS);
    IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM82, 0);
    Loop1: while (!IMDB.Eof(IMDBDef4.TBL_PARAM82, 0))
    {
      IMDB.TblAddNew(IMDBDef13.PQRY_PARAM89_RS, 0);
      IMDB.TblLinkRow(IMDBDef13.PQRY_PARAM89_RS, 0, IMDBDef4.TBL_PARAM82, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 0, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 1, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 2, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 3, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDESABB, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 4, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_RONASOTOPETI, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 5, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMSOLCOM, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 6, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMSEROPE, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 7, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEINTER, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 8, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMECAPIT, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 9, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMEARTIC, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 10, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef13.PQRY_PARAM89_RS, 11, 0, IMDBDef4.TBL_PARAM82, IMDBDef4.FLD_PARAM82_ROWNAMUNIORG, 0);
      IMDB.TblMoveNext(IMDBDef4.TBL_PARAM82, 0);
      if (IMDB.Eof(IMDBDef4.TBL_PARAM82, 0))
      {
        IMDB.TblMoveFirst(IMDBDef4.TBL_PARAM82, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef13.PQRY_PARAM89_RS, 0);
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
  private void PAN_PARAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PARAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  private void PAN_PARAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAM_SCELTAPEG)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Sceltapeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_INFOPEG)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Infopeg();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAM_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PARAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_DETTAGCAPITO)
      {
        PFL_PARAM_DETTAGCAPITO_ValidateCell(Cancel);
      }
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAM_PARTE)
      {
        PFL_PARAM_PARTE_ValidateCell(Cancel);
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

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PARAM_Init()
  {

    PAN_PARAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PARAM.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "25D3F704-ABBF-459F-BF03-2DF301E6BAB8");
    PAN_PARAM.set_Header(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PARAM.SetRect(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, MyGlb.PANEL_FORM, 12, 14, 96, 86, 0, 0);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0, 31);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 1, 13);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0, 4);
    PAN_PARAM.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 1, 2);
    PAN_PARAM.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAM.SetSize(MyGlb.OBJ_FIELD, 17);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, "48294525-9C20-4111-8F55-70E8C79ED9AC");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, "E5395C39-1B54-4424-82F8-D3D1E0D4EE28");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, "Descrizione Intervento");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, "96DBACBE-2A5A-4851-BBD3-0BC036D8952F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, "Descrizione Abbreviata");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, "905A3C98-B018-4BE4-92A5-D8D2E826DEF3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, "Solo Totali Per Titolo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, "D7D3819F-D9C1-4C18-A985-A3EF90AB3E80");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, "Solo Competenza");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, "A8E392D8-FD7E-4575-B1F2-769DB1AA3C54");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, "Servizio Operativo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, "339AC1F2-DDF5-4555-8867-03CA050E7A77");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, "Voce P.e.g.");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, "C301F29D-1619-4CE7-BBC3-949D1A6118BE");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, "Capitolo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, "6C4BF396-9BBF-4602-B6E1-9487DA86C1D6");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, "Articolo");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, "03BF2F69-3A07-4D2A-99FC-BD11F4847C6B");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "A4DCEAE1-36EB-43AD-A405-13BBCDD186A0");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "Parte");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, "A60FC3D4-AB5B-49F5-AE80-C9783F74F06F");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, "-");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, "B668F23E-3F14-4FDA-A1AA-A1509860D7BF");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, "/");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, MyGlb.VIS_VUOTONORMALE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, "A280D897-AD99-438E-8421-DD82055507E3");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, 0, "wsearch1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, "5F2B8520-3389-4F7E-A648-6C269158BB71");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, 0, "info.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "2D7A1037-CB50-4A6C-9CF8-5F9C6BBDFC47");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, "Elabora");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAM.SetImage(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0, "button1.gif", false);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "93B73571-9E82-4633-876D-0BC3AE0A70DD");
    PAN_PARAM.set_Header(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "Unità Organizzativa");
    PAN_PARAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, "");
    PAN_PARAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAM.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_PARAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, 120, 24, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, 148);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DETTAGCAPITO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DETTAGCAPITO, PPQRY_PARAM89, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DETTAGCAPITO, (new IDVariant("M")), "M", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DETTAGCAPITO, (new IDVariant("T")), "T", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Int.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_FORM, 120, 48, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_FORM, 148);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESCRIINTERV, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESCRIINTERV, PPQRY_PARAM89, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DESCRIINTERV, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DESCRIINTERV, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_LIST, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_LIST, "Desc. Abbr.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_FORM, 120, 72, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_FORM, 148);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DESCRIABBREV, MyGlb.PANEL_FORM, "Descrizione Abbreviata");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DESCRIABBREV, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DESCRIABBREV, PPQRY_PARAM89, "A.ROWNAMDESABB", "ROWNAMDESABB", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DESCRIABBREV, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_DESCRIABBREV, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_LIST, 108);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_LIST, "S. Tt. P. Tit.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_FORM, 324, 24, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_FORM, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLTOTPERTIT, MyGlb.PANEL_FORM, "Solo Totali Per Titolo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SOLTOTPERTIT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SOLTOTPERTIT, PPQRY_PARAM89, "A.RONASOTOPETI", "RONASOTOPETI", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLTOTPERTIT, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLTOTPERTIT, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_LIST, 92);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_LIST, "Sl. Cmp.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_FORM, 324, 48, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_FORM, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SOLOCOMPETEN, MyGlb.PANEL_FORM, "Solo Competenza");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SOLOCOMPETEN, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SOLOCOMPETEN, PPQRY_PARAM89, "A.ROWNAMSOLCOM", "ROWNAMSOLCOM", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLOCOMPETEN, (new IDVariant("C")), "C", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SOLOCOMPETEN, (new IDVariant("E")), "E", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_LIST, "Serv. Oper.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_FORM, 324, 72, 152, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_FORM, 128);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_SERVIZOPERAT, MyGlb.PANEL_FORM, "Servizio Operativo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_SERVIZOPERAT, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SERVIZOPERAT, PPQRY_PARAM89, "A.ROWNAMSEROPE", "ROWNAMSEROPE", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SERVIZOPERAT, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_SERVIZOPERAT, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_LIST, 60);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_LIST, "Voce P.e.g.");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_FORM, 108, 136, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_FORM, 72);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_VOCEPEG, MyGlb.PANEL_FORM, "Voce P.e.g.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_VOCEPEG, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_VOCEPEG, PPQRY_PARAM89, "A.ROWNAMEINTER", "ROWNAMEINTER", 1, 8, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_LIST, 48);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_FORM, 256, 136, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_FORM, 136);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_CAPITOLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_CAPITOLO, PPQRY_PARAM89, "A.ROWNAMECAPIT", "ROWNAMECAPIT", 3, 16, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_LIST, 44);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_LIST, "Articolo");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_FORM, 324, 136, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_FORM, 136);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_ARTICOLO, MyGlb.PANEL_FORM, "Articolo");
    PAN_PARAM.SetFieldPage(PFL_PARAM_ARTICOLO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ARTICOLO, PPQRY_PARAM89, "A.ROWNAMEARTIC", "ROWNAMEARTIC", 1, 2, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, 68, 168, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, 112);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAM.SetFieldPage(PFL_PARAM_DATAELABORAZ, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_DATAELABORAZ, PPQRY_PARAM89, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 15, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 16, 28, 88, 68, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 36);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, 5);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_PARTE, MyGlb.PANEL_FORM, "Par.");
    PAN_PARAM.SetFieldPage(PFL_PARAM_PARTE, -1, GRP_PARAM_PARTE);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_PARTE, PPQRY_PARAM89, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, MyGlb.PANEL_LIST, 240, 180, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, MyGlb.PANEL_FORM, 236, 136, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_TRATTINO, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_TRATTINO, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_TRATTINO, -1, "", "TRATTINO", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, MyGlb.PANEL_LIST, 248, 188, 12, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, MyGlb.PANEL_FORM, 304, 136, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_BARRA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_BARRA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_BARRA, -1, "", "BARRA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, MyGlb.PANEL_LIST, 344, 136, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, MyGlb.PANEL_FORM, 352, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_SCELTAPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_SCELTAPEG, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_SCELTAPEG, -1, "", "SCELTAPEG", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, MyGlb.PANEL_LIST, 352, 144, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, MyGlb.PANEL_FORM, 368, 140, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_INFOPEG, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_INFOPEG, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_INFOPEG, -1, "", "INFOPEG", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 308, 208, 120, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 396, 212, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetFieldPage(PFL_PARAM_ELABORA, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 0, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 104);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_LIST, "Unità Organizzativa");
    PAN_PARAM.SetRect(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 332, 72, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 120);
    PAN_PARAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAM_UNITAORGANIZ, MyGlb.PANEL_FORM, "Unità Organizzativa");
    PAN_PARAM.SetFieldPage(PFL_PARAM_UNITAORGANIZ, -1, -1);
    PAN_PARAM.SetFieldPanel(PFL_PARAM_UNITAORGANIZ, PPQRY_PARAM89, "A.ROWNAMUNIORG", "ROWNAMUNIORG", 5, 1, 0, -13997);
    PAN_PARAM.SetValueListItem(PFL_PARAM_UNITAORGANIZ, (new IDVariant("U")), "U", "", "", -1);
    PAN_PARAM.SetValueListItem(PFL_PARAM_UNITAORGANIZ, (new IDVariant("N")), "N", "", "", -1);
  }

  private void PAN_PARAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PARAM.SetIMDB(IMDB, "PQRY_PARAM89", true);
    PAN_PARAM.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAM.SetQueryIMDB(PPQRY_PARAM89, IMDBDef13.PQRY_PARAM89_RS, IMDBDef4.TBL_PARAM82);
    JustLoaded = true;
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DETTAGCAPITO, IMDBDef4.FLD_PARAM82_ROWNAMDETCAP);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DESCRIINTERV, IMDBDef4.FLD_PARAM82_ROWNAMDESINT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DESCRIABBREV, IMDBDef4.FLD_PARAM82_ROWNAMDESABB);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SOLTOTPERTIT, IMDBDef4.FLD_PARAM82_RONASOTOPETI);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SOLOCOMPETEN, IMDBDef4.FLD_PARAM82_ROWNAMSOLCOM);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_SERVIZOPERAT, IMDBDef4.FLD_PARAM82_ROWNAMSEROPE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_VOCEPEG, IMDBDef4.FLD_PARAM82_ROWNAMEINTER);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_CAPITOLO, IMDBDef4.FLD_PARAM82_ROWNAMECAPIT);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_ARTICOLO, IMDBDef4.FLD_PARAM82_ROWNAMEARTIC);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_DATAELABORAZ, IMDBDef4.FLD_PARAM82_ROWNAMDATELA);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_PARTE, IMDBDef4.FLD_PARAM82_ROWNAMEPARTE);
    PAN_PARAM.SetFieldPrimaryIndex(PFL_PARAM_UNITAORGANIZ, IMDBDef4.FLD_PARAM82_ROWNAMUNIORG);
    PAN_PARAM.SetMasterTable(0, "PARAM82");
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
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PARAM) PAN_PARAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
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
