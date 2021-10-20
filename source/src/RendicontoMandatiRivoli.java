// **********************************************
// Rendiconto Mandati Rivoli
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class RendicontoMandatiRivoli extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_NUMEROMANDAT = 0;
  private static int GRP_PARAMETRI_DATAMANDATO = 1;

  private static int PFL_PARAMETRI_TIPOUTENZA = 0;
  private static int PFL_PARAMETRI_SOLOTOTAMENS = 1;
  private static int PFL_PARAMETRI_DAL = 2;
  private static int PFL_PARAMETRI_AL = 3;
  private static int PFL_PARAMETRI_NEWPANELLABE = 4;
  private static int PFL_PARAMETRI_DA = 5;
  private static int PFL_PARAMETRI_A = 6;
  private static int PFL_PARAMETRI_NEWPANELABE3 = 7;
  private static int PFL_PARAMETRI_TASTOELABORA = 8;
  private static int PFL_PARAMETRI_CODICEUTENZA = 9;
  private static int PFL_PARAMETRI_NUMEROUTENTE = 10;
  private static int PFL_PARAMETRI_CODICEBENEFI = 11;
  private static int PFL_PARAMETRI_BENEFICIARI1 = 12;
  private static int PFL_PARAMETRI_SCEGBENFBUT1 = 13;

  private static int PPQRY_PARAMETRI195 = 0;

  private static int PPQRY_TIPIUTENZA = 1;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables
  private IDVariant TIPOUTENZA = new IDVariant(0,IDVariant.STRING);

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI138(IMDB);
    //
    //
    Init_PQRY_PARAMETRI195(IMDB);
    Init_PQRY_PARAMETRI195_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI138(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI138, 13);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI138, "TBL_PARAMETRI138");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEESERC,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAD, "ROWNAMEDATAD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAD,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMM1, "ROWNAMENUMM1");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMM1,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMMA, "ROWNAMENUMMA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMMA,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMESOLOT, "ROWNAMESOLOT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMESOLOT,5,1,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMCODUTE, "ROWNAMCODUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMCODUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMNUMUTE, "ROWNAMNUMUTE");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMNUMUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMCODBEN,2,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEBENEF, "ROWNAMEBENEF");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMEBENEF,5,60,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMBENOLD, "ROWNAMBENOLD");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI138,IMDBDef2.FLD_PARAMETRI138_ROWNAMBENOLD,5,60,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI138, 0);
  }

  private static void Init_PQRY_PARAMETRI195(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI195, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI195, "PQRY_PARAMETRI195");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEESERC,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAD, "ROWNAMEDATAD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAD,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMM1, "ROWNAMENUMM1");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMM1,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMMA, "ROWNAMENUMMA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMMA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMESOLOT, "ROWNAMESOLOT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMESOLOT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODUTE, "ROWNAMCODUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMNUMUTE, "ROWNAMNUMUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMNUMUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, "ROWNAMEBENEF");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF,5,60,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI195, 0);
  }

  private static void Init_PQRY_PARAMETRI195_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_PARAMETRI195_RS, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_PARAMETRI195_RS, "PQRY_PARAMETRI195_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEESERC, "ROWNAMEESERC");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEESERC,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMTIPUTE, "ROWNAMTIPUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMTIPUTE,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAD, "ROWNAMEDATAD");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAD,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAA, "ROWNAMEDATAA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMM1, "ROWNAMENUMM1");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMM1,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMMA, "ROWNAMENUMMA");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMMA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMESOLOT, "ROWNAMESOLOT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMESOLOT,5,1,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDESCT, "ROWNAMEDESCT");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDESCT,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODUTE, "ROWNAMCODUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMNUMUTE, "ROWNAMNUMUTE");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMNUMUTE,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, "ROWNAMCODBEN");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN,2,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, "ROWNAMEBENEF");
    IMDB.SetFldParams(IMDBDef9.PQRY_PARAMETRI195_RS,IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF,5,60,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public RendicontoMandatiRivoli(MyWebEntryPoint w, IMDBObj imdb)
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
  public RendicontoMandatiRivoli()
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
    FormIdx = MyGlb.FRM_RENDMANDRIVO;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "FB7774D8-D28F-432D-9BE2-FE707B0ECE51";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 512;
    DesignHeight = 250;
    set_Caption(new IDVariant("Rendiconto Mandati Rivoli"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 512;
    Frames[1].Height = 224;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 224;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 512-MyGlb.PAN_OFFS_X, 224-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A83E5F74-5CEE-4F8F-A88E-EDA2D4DF6E61");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1760, 220, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PARAMETRI.InitStatus = 2;
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI138, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        RENDMANDRIVO_PARAMETRI195();
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
    if (CallerIdx == MyGlb.FRM_SCELTASOGGET && flRis && IdxPanelActived == PAN_PARAMETRI.FrIndex)
    {
      if (IdxFieldActived ==PFL_PARAMETRI_SCEGBENFBUT1) {
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
    return (obj instanceof RendicontoMandatiRivoli);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? RendicontoMandatiRivoli.class.getName() : (Glb.ClassWithPackage(RendicontoMandatiRivoli.class) ? RendicontoMandatiRivoli.class.getName().substring(RendicontoMandatiRivoli.class.getPackage().getName().length() + 1) : RendicontoMandatiRivoli.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      PAN_PARAMETRI.set_ToolTip(Glb.OBJ_FIELD,PFL_PARAMETRI_BENEFICIARI1,(new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_BENEFICIARI1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoMandatiRivoli", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

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
      SelettoreBeneficiario v_SELETTBENEFI = new SelettoreBeneficiario(MainFrm,IMDB);
      if (Column.equals((new IDVariant(PFL_PARAMETRI_BENEFICIARI1)), true))
      {
        if (IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0).compareTo(IMDB.Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMBENOLD, 0), true)!=0)
        {
          if (!(IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0))))
          {
            IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0, IDL.Upper(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0)));
            v_SELETTBENEFI.AzzeraValori();
            v_SELETTBENEFI.SetParam(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0), (new IDVariant("DOC")), (new IDVariant(0)), IDL.Today());
            if (!(IDL.IsNull(v_SELETTBENEFI.GetTrovato())))
            {
              if (v_SELETTBENEFI.GetTrovato().equals((new IDVariant("SI")), true))
              {
                IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, 0, v_SELETTBENEFI.GetBeneficiario());
                IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0, v_SELETTBENEFI.GetRagioneSociale());
              }
              else
              {
                IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, 0, (new IDVariant()));
                IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0, (new IDVariant()));
              }
            }
            else
            {
              return;
            }
          }
          else
          {
            IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, 0, (new IDVariant()));
          }
          IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMBENOLD, 0, IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoMandatiRivoli", "ParametriOnUpdatingRow", _e);
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
      v_NOMECAPTION = (new IDVariant("Rendiconto Mandati", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      LOADEVENT_PARADELEROWS();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAD, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMESOLOT, 0, (new IDVariant("N")));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  MIN(A.CODICE) as MINTIPUTECOD ");
      SQL.append("from ");
      SQL.append("  TIPI_UTENZA A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        TIPOUTENZA = QV.Get("MINTIPUTECOD", IDVariant.STRING) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMTIPUTE, 0, new IDVariant(TIPOUTENZA));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoMandatiRivoli", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete rows
  // Why are you deleting these data?
  // **********************************************************************
  private void LOADEVENT_PARADELEROWS() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEESERC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMTIPUTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAD, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMM1, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMMA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMESOLOT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDESCT, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMCODUTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMNUMUTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMCODBEN, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEBENEF, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMBENOLD, 0, new IDVariant());
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
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMBENOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_RAGIONE_SOCIALE_ESTESA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
        IMDB.set_Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEBENEF, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMBENOLD, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_RAGIONE_SOCIALE_ESTESA, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoMandatiRivoli", "EndModalEvent", _e);
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
    IDVariant v_NOMEDATAWIND = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR3 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_NOMEDATAWIND = (new IDVariant("d_rendiconto_mandati_stampa_riv", IDVariant.STRING));
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      v_ERR3 = (new IDVariant("Errore. Numero Al inferiore a Numero Dal", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAD, 0)).compareTo((new IDVariant(1900)), true)<0 || IDL.Year(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAA, 0)).compareTo((new IDVariant(1900)), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      if (IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAA, 0).compareTo(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAD, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR2); 
        return 0;
      }
      if (IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMMA, 0).compareTo(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMM1, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR3); 
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Rendiconto_Mandati_RIV"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_ESERCIZIO")), IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPOUTENZA")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMTIPUTE, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATADA")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAD, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATAA")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMEDATAA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_NUMMANDDAL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMM1, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_NUMMANDAL")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMENUMMA, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_BEN")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODBEN, 0),(new IDVariant(0)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SOLOTOTALIMESE")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMESOLOT, 0)));
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODUTE, 0)))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_COD_UT")), IDL.ToString((new IDVariant(-1))));
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_COD_UT")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMCODUTE, 0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMNUMUTE, 0)))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NUM_UT")), IDL.ToString((new IDVariant(-1))));
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NUM_UT")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMNUMUTE, 0)));
      }
      // 
      // setto descrizione tipo utenza
      // 
      {
        IDVariant v_DESCRIZIONE = new IDVariant(0,IDVariant.STRING);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DESCRIZIONE as TIPIUTENDESC ");
        SQL.append("from ");
        SQL.append("  TIPI_UTENZA A ");
        SQL.append("where (A.CODICE = TO_CHAR ( " + IDL.CSql(IMDB.Value(IMDBDef9.PQRY_PARAMETRI195, IMDBDef9.PQSL_PARAMETRI195_ROWNAMTIPUTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + " )) ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DESCRIZIONE = QV.Get("TIPIUTENDESC", IDVariant.STRING) ;
        }
        QV.Close();
        MainFrm.SetParametroStampaJasper((new IDVariant("P_DESCTIPOUTE")), v_DESCRIZIONE);
      }
      MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoMandatiRivoli", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Apri Scegli Soggetto
  // **********************************************************************
  public int ApriScegliSoggetto ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scegli Soggetto Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARADATASCAD, 0, IDL.Today());
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("NO")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("RendicontoMandatiRivoli", "ApriScegliSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Parametri
  // Primary record source for panel data
  // **********************************************************************
  private void RENDMANDRIVO_PARAMETRI195() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_PARAMETRI195_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI138, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI138, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_PARAMETRI195_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_PARAMETRI195_RS, 0, IMDBDef2.TBL_PARAMETRI138, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 0, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEESERC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 1, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMTIPUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 2, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAD, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 3, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 4, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMM1, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 5, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMMA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 6, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMESOLOT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 7, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDESCT, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 8, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMCODUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 9, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMNUMUTE, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 10, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMCODBEN, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_PARAMETRI195_RS, 11, 0, IMDBDef2.TBL_PARAMETRI138, IMDBDef2.FLD_PARAMETRI138_ROWNAMEBENEF, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI138, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI138, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI138, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_PARAMETRI195_RS, 0);
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

  private void PAN_PARAMETRI_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PARAMETRI_TASTOELABORA)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_SCEGBENFBUT1)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriScegliSoggetto();
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 2);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, "6C6EEF2D-619B-4158-86CF-6FC6B35F3F27");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, "Numero Mandato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, MyGlb.PANEL_LIST, 832, -9999, 416, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, MyGlb.PANEL_FORM, 8, 43, 228, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 0, 97);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROMANDAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "E543FDBD-F19A-410E-B5D6-F5739BC6AC1B");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "Data Mandato");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.PANEL_LIST, 416, -9999, 416, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, MyGlb.PANEL_FORM, 240, 43, 236, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0, 80);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAMANDATO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 14);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, "333D2854-C9AF-4B2E-B994-0DE9695BD027");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, "Tipo Utenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, "6243F50C-5ED4-4534-9160-B68AE3D4206A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, "Solo Totali Mensili");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "8EC0DFEC-CA6B-40D3-BC55-4C198A80E799");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "B27C7654-E8E3-4337-A93A-FFF584C7F46C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "E1EF7BD1-0EDC-4052-9AB1-E12CCB5E2EF8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "5CA4C5FC-A035-4301-97A8-F6BF3D3E4DED");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "Da");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "2F5C5DF2-7DF4-4FC4-9E1E-C9D99039C872");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "A");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, "2D201F2F-A59A-43CC-8159-550DC3A7CED9");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, "DDD50572-0C09-42EC-A703-8B57B6380BF0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, "5C9143B2-557D-45C5-83D2-82A22575C8C8");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, "Codice Utenza");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, "094DD2B2-7B8E-45DC-A4BD-3388E36F892F");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, "Numero Utente");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "6F783A16-CBED-4D7E-BC14-8C9A17F913EB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "Codice Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, "6115C471-8C3A-44DD-8A66-55F6878497B4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, "Beneficiario");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, "44368AC5-A744-4FC8-B653-92845A36EE68");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_LIST, 68);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_LIST, "Tipo Utenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_FORM, 160, 16, 316, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOUTENZA, MyGlb.PANEL_FORM, "Tipo Utenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOUTENZA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOUTENZA, PPQRY_PARAMETRI195, "A.ROWNAMTIPUTE", "ROWNAMTIPUTE", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_LIST, 1456, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_LIST, "Solo Totali Mensili");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_FORM, 8, 16, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_FORM, 112);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SOLOTOTAMENS, MyGlb.PANEL_FORM, "Solo Totali Mensili");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SOLOTOTAMENS, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SOLOTOTAMENS, PPQRY_PARAMETRI195, "A.ROWNAMESOLOT", "ROWNAMESOLOT", 5, 1, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOTOTAMENS, (new IDVariant("S")), "S", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SOLOTOTAMENS, (new IDVariant("N")), "N", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 832, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 12, 68, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_NUMEROMANDAT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_PARAMETRI195, "A.ROWNAMENUMM1", "ROWNAMENUMM1", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1040, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 128, 68, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_NUMEROMANDAT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_PARAMETRI195, "A.ROWNAMENUMMA", "ROWNAMENUMMA", 1, 4, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 140, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 220, 80, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_NUMEROMANDAT);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 416, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_LIST, "Da");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 244, 68, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 32);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DA, MyGlb.PANEL_FORM, "Da");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DA, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DA, PPQRY_PARAMETRI195, "A.ROWNAMEDATAD", "ROWNAMEDATAD", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 624, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_LIST, "A");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 368, 68, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_A, MyGlb.PANEL_FORM, "A");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_A, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_A, PPQRY_PARAMETRI195, "A.ROWNAMEDATAA", "ROWNAMEDATAA", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 416, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 460, 80, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE3, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE3, -1, GRP_PARAMETRI_DATAMANDATO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE3, -1, "", "NEWPANELABE3", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, MyGlb.PANEL_LIST, 168, 196, 68, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, MyGlb.PANEL_FORM, 392, 168, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TASTOELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TASTOELABORA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TASTOELABORA, -1, "", "TASTOELABORA", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_LIST, "Codice Utenza");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_FORM, 8, 132, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_FORM, 88);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEUTENZA, MyGlb.PANEL_FORM, "Codice Utenza");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICEUTENZA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICEUTENZA, PPQRY_PARAMETRI195, "A.ROWNAMCODUTE", "ROWNAMCODUTE", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_LIST, "Numero Utente");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_FORM, 216, 132, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_FORM, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NUMEROUTENTE, MyGlb.PANEL_FORM, "Numero Utente");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NUMEROUTENTE, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NUMEROUTENTE, PPQRY_PARAMETRI195, "A.ROWNAMNUMUTE", "ROWNAMNUMUTE", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 0, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_LIST, "Cod. Ben.");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 400, 104, 56, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICEBENEFI, MyGlb.PANEL_FORM, "C. B.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICEBENEFI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICEBENEFI, PPQRY_PARAMETRI195, "A.ROWNAMCODBEN", "ROWNAMCODBEN", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, 0, 36, 308, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, 84);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_LIST, "Beneficiario");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, 8, 104, 388, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, 76);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENEFICIARI1, MyGlb.PANEL_FORM, "Beneficiario");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENEFICIARI1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENEFICIARI1, PPQRY_PARAMETRI195, "A.ROWNAMEBENEF", "ROWNAMEBENEF", 5, 60, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, MyGlb.PANEL_LIST, 312, 4, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, MyGlb.PANEL_FORM, 460, 108, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SCEGBENFBUT1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SCEGBENFBUT1, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SCEGBENFBUT1, -1, "", "SCEGBENFBUT1", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMTIPUTE~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPIUTENZA, 0, SQL, PFL_PARAMETRI_TIPOUTENZA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as TIPIUTENCODI, ");
    SQL.append("  A.DESCRIZIONE as TIPIUTENDESC ");
    SQL.append("from ");
    SQL.append("  TIPI_UTENZA A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_TIPIUTENZA, 1, SQL, PFL_PARAMETRI_TIPOUTENZA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_TIPIUTENZA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_PARAMETRI195", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_PARAMETRI195, IMDBDef9.PQRY_PARAMETRI195_RS, IMDBDef2.TBL_PARAMETRI138);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOUTENZA, IMDBDef2.FLD_PARAMETRI138_ROWNAMTIPUTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SOLOTOTAMENS, IMDBDef2.FLD_PARAMETRI138_ROWNAMESOLOT);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMM1);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef2.FLD_PARAMETRI138_ROWNAMENUMMA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DA, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAD);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_A, IMDBDef2.FLD_PARAMETRI138_ROWNAMEDATAA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICEUTENZA, IMDBDef2.FLD_PARAMETRI138_ROWNAMCODUTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_NUMEROUTENTE, IMDBDef2.FLD_PARAMETRI138_ROWNAMNUMUTE);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICEBENEFI, IMDBDef2.FLD_PARAMETRI138_ROWNAMCODBEN);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_BENEFICIARI1, IMDBDef2.FLD_PARAMETRI138_ROWNAMEBENEF);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI138");
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
