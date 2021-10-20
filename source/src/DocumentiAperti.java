// **********************************************
// Documenti Aperti
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class DocumentiAperti extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PARAMETRI_DOCUMENTI = 0;
  private static int GRP_PARAMETRI_TIPOPROTOCOL = 1;
  private static int GRP_PARAMETRI_NUMEROPROTOC = 2;
  private static int GRP_PARAMETRI_DATAPROTOCOL = 3;
  private static int GRP_PARAMETRI_VUOTO = 4;
  private static int GRP_PARAMETRI_CODICESOGGET = 5;

  private static int PFL_PARAMETRI_UFFICIO = 0;
  private static int PFL_PARAMETRI_CATEGORIA = 1;
  private static int PFL_PARAMETRI_SUDDIPERUFFI = 2;
  private static int PFL_PARAMETRI_DOCUMENTI = 3;
  private static int PFL_PARAMETRI_NEWPANELLAB1 = 4;
  private static int PFL_PARAMETRI_NEWPANELLAB2 = 5;
  private static int PFL_PARAMETRI_TIPOPROTOCOL = 6;
  private static int PFL_PARAMETRI_DAL = 7;
  private static int PFL_PARAMETRI_AL = 8;
  private static int PFL_PARAMETRI_NEWPANELLAB5 = 9;
  private static int PFL_PARAMETRI_NEWPANELLAB6 = 10;
  private static int PFL_PARAMETRI_DAL1 = 11;
  private static int PFL_PARAMETRI_AL1 = 12;
  private static int PFL_PARAMETRI_NEWPANELLAB3 = 13;
  private static int PFL_PARAMETRI_NEWPANELLAB4 = 14;
  private static int PFL_PARAMETRI_TIPOLIQUIDAT = 15;
  private static int PFL_PARAMETRI_NEWPANELLABE = 16;
  private static int PFL_PARAMETRI_NEWPANELABE2 = 17;
  private static int PFL_PARAMETRI_DATAELABORAZ = 18;
  private static int PFL_PARAMETRI_ELABORBUTTON = 19;
  private static int PFL_PARAMETRI_BENDEBITORE = 20;
  private static int PFL_PARAMETRI_BOTTAPRISOGG = 21;
  private static int PFL_PARAMETRI_CODICESOGGET = 22;
  private static int PFL_PARAMETRI_NEWPANELABE9 = 23;

  private static int PPQRY_DOCUMENTI = 0;

  private static int PPQRY_BEN = 1;

  private static int PPQRY_T53 = 2;
  private static int PPQRY_T08 = 3;


  IDPanel PAN_PARAMETRI;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI133(IMDB);
    //
    //
    Init_PQRY_DOCUMENTI(IMDB);
    Init_PQRY_DOCUMENTI_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI133(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_PARAMETRI133, 12);
    IMDB.set_TblCode(IMDBDef2.TBL_PARAMETRI133, "TBL_PARAMETRI133");
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMEDOCUM, "ROWNAMEDOCUM");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMEDOCUM,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRAL, "ROWNAMDAPRAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRAL,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRDA, "ROWNAMDAPRDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRDA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRDA, "ROWNAMNUPRDA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRDA,1,7,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRAL, "ROWNAMNUPRAL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRAL,1,7,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMEUFFIC,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMECATEG,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMSUPEUF, "ROWNAMSUPEUF");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMSUPEUF,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, "ROWNAMETIPOL");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL,1,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMTIPPRO, "ROWNAMTIPPRO");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMTIPPRO,5,50,0);
    IMDB.set_FldCode(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMCODSOG, "ROWNAMCODSOG");
    IMDB.SetFldParams(IMDBDef2.TBL_PARAMETRI133,IMDBDef2.FLD_PARAMETRI133_ROWNAMCODSOG,2,15,0);
    IMDB.TblAddNew(IMDBDef2.TBL_PARAMETRI133, 0);
  }

  private static void Init_PQRY_DOCUMENTI(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_DOCUMENTI, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_DOCUMENTI, "PQRY_DOCUMENTI");
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM, "ROWNAMEDOCUM");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRDA, "ROWNAMDAPRDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRDA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRAL, "ROWNAMDAPRAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRDA, "ROWNAMNUPRDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRDA,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEUFFIC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMECATEG,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMSUPEUF, "ROWNAMSUPEUF");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMSUPEUF,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRAL, "ROWNAMNUPRAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRAL,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMETIPOL, "ROWNAMETIPOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMETIPOL,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMTIPPRO, "ROWNAMTIPPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMTIPPRO,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMCODSOG, "ROWNAMCODSOG");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI,IMDBDef9.PQSL_DOCUMENTI_ROWNAMCODSOG,2,15,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_DOCUMENTI, 0);
  }

  private static void Init_PQRY_DOCUMENTI_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_DOCUMENTI_RS, 12);
    IMDB.set_TblCode(IMDBDef9.PQRY_DOCUMENTI_RS, "PQRY_DOCUMENTI_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM, "ROWNAMEDOCUM");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRDA, "ROWNAMDAPRDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRDA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRAL, "ROWNAMDAPRAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRAL,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRDA, "ROWNAMNUPRDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRDA,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMEUFFIC,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMECATEG, "ROWNAMECATEG");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMECATEG,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMSUPEUF, "ROWNAMSUPEUF");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMSUPEUF,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRAL, "ROWNAMNUPRAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRAL,1,7,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMETIPOL, "ROWNAMETIPOL");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMETIPOL,1,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDATELA, "ROWNAMDATELA");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMDATELA,6,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMTIPPRO, "ROWNAMTIPPRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMTIPPRO,5,50,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMCODSOG, "ROWNAMCODSOG");
    IMDB.SetFldParams(IMDBDef9.PQRY_DOCUMENTI_RS,IMDBDef9.PQSL_DOCUMENTI_ROWNAMCODSOG,2,15,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public DocumentiAperti(MyWebEntryPoint w, IMDBObj imdb)
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
  public DocumentiAperti()
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
    FormIdx = MyGlb.FRM_DOCUMEAPERTI;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "8DB9F626-3DF0-4050-98B9-A90F39F54476";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 784;
    DesignHeight = 530;
    set_Caption(new IDVariant("Documenti Aperti"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 784;
    Frames[1].Height = 504;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Parametri";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 504;
    PAN_PARAMETRI = new IDPanel(w, this, 1, "PAN_PARAMETRI");
    Frames[1].Content = PAN_PARAMETRI;
    PAN_PARAMETRI.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PARAMETRI.VS = MainFrm.VisualStyleList;
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 784-MyGlb.PAN_OFFS_X, 504-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "07617E24-33D6-4AA2-B2AC-708D1062FBED");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2276, 220, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANINSERT | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
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
      if (IMDB.TblModified(IMDBDef2.TBL_PARAMETRI133, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        DOCUMEAPERTI_DOCUMENTI();
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
      if (IdxFieldActived ==PFL_PARAMETRI_BOTTAPRISOGG) {
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
    return (obj instanceof DocumentiAperti);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? DocumentiAperti.class.getName() : (Glb.ClassWithPackage(DocumentiAperti.class) ? DocumentiAperti.class.getName().substring(DocumentiAperti.class.getPackage().getName().length() + 1) : DocumentiAperti.class.getName()));
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
      if (IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM, 0).equals((new IDVariant("S")), true))
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PARAMETRI.SetFlags (Glb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED:0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "ParametriOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Parametri On Get Smart Lookup
  // Evento chiamato per personalizzare la procedura di
  // Smart Lookup a livello di pannello
  // Recordset - Input
  // Level - Input
  // Null Value - Input/Output
  // Skip - Input/Output
  // Cancel - Input/Output
  // Field Index - Input
  // **********************************************************************
  private void PAN_PARAMETRI_OnGetLKE(IDCachedRowSet Recordset, IDVariant Level, IDVariant NullValue, IDVariant Skip, IDVariant Cancel, IDVariant FieldIndex)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Parametri On Get Smart Lookup Body
      // Corpo Procedura
      // 
      if (FieldIndex.equals((new IDVariant(PFL_PARAMETRI_BENDEBITORE)), true))
      {
        if (Level.equals((new IDVariant(4)), true))
        {
          MainFrm.CheckSmartBeneficiario((new IDVariant(PAN_PARAMETRI.FieldText(PFL_PARAMETRI_BENDEBITORE))), IDL.Today(), (new IDVariant("DOC")), (new IDVariant(0)), (new IDVariant("SI")));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "ParametriOnGetSmartLookup", _e);
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
      v_NOMECAPTION = (new IDVariant("Documenti Aperti", IDVariant.STRING));
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(v_NOMECAPTION, MainFrm.ESERCIZIO));
      // 
      // setto valori di default
      // 
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMEDOCUM, 0, (new IDVariant("S")));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0, (new IDVariant(3)));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRDA, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1)), (new IDVariant(1))));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRAL, 0, IDL.ToDate(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(12)), (new IDVariant(31))));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMDATELA, 0, IDL.Today());
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMEUFFIC, 0, ((IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0).equals((new IDVariant())))?(new IDVariant(0)):IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0)));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMECATEG, 0, (new IDVariant("0")));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMTIPPRO, 0, (new IDVariant("I")));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMCODSOG, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRDA, 0, (new IDVariant()));
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRAL, 0, (new IDVariant()));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTASOGGET)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMCODSOG, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI4, IMDBDef7.PQSL_SOGGETTI4_CODICE, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELSOGGOMON)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMCODSOG, 0, IMDB.Value(IMDBDef7.PQRY_SOGGETTI, IMDBDef7.PQSL_SOGGETTI_CODICE, 0));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "EndModal", _e);
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
    IDVariant v_ERR1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_ERR2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_ERR1 = (new IDVariant("Errore. La data inserita non è corretta. Anno inferiore a 1900", IDVariant.STRING));
      v_ERR2 = (new IDVariant("Errore. Data Al inferiore a Data Dal", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IDL.Year(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRDA, 0)).compareTo((new IDVariant(1900)), true)<0 || IDL.Year(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRAL, 0)).compareTo((new IDVariant(1900)), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR1); 
        return 0;
      }
      if (IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRAL, 0).compareTo(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRDA, 0), true)<0)
      {
        MainFrm.set_AlertMessage(v_ERR2); 
        return 0;
      }
      IDVariant S = new IDVariant(0,IDVariant.STRING);
      S = (new IDVariant("Documenti_Aperti"));
      IDVariant v_S1 = new IDVariant(0,IDVariant.STRING);
      v_S1 = (new IDVariant("Documenti_Aperti1"));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DAL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRDA, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_AL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMDAPRAL, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_CATEGORIA")), IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMECATEG, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_UFFICIO")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMEUFFIC, 0)));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SE")), IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM, 0));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_DATA_ELAB")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMDATELA, 0)));
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRDA, 0)))
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NDAL")), IDL.ToString((new IDVariant(0))));
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NDAL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRDA, 0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRAL, 0)))
      {
        IDVariant v_MAXAL = new IDVariant(0,IDVariant.INTEGER);
        v_MAXAL = (new IDVariant(999999999, IDVariant.INTEGER));
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NAL")), IDL.ToString(v_MAXAL));
      }
      else
      {
        MainFrm.SetParametroStampaJasper((new IDVariant("P_NAL")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMNUPRAL, 0)));
      }
      MainFrm.SetParametroStampaJasper((new IDVariant("P_SOGGETTO")), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMCODSOG, 0),(new IDVariant(-1)))));
      MainFrm.SetParametroStampaJasper((new IDVariant("P_TIPO_PROTOCOLLO")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMTIPPRO, 0)));
      // 
      // gestione ndocumenti
      // 
      {
        // 
        // caso in cui il gruppo non è attivo
        // 
        if (IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM, 0).equals((new IDVariant("E")), true))
        {
          MainFrm.SetParametroStampaJasper((new IDVariant("P_DOCUMENTO")), IDL.ToString((new IDVariant(0))));
        }
        else
        {
          // 
          // se il grupo è attivo controllo il radiobox selezionato
          // 
          MainFrm.SetParametroStampaJasper((new IDVariant("P_DOCUMENTO")), IDL.ToString(IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMETIPOL, 0)));
        }
      }
      if (IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMSUPEUF, 0).equals((new IDVariant("SI")), true))
      {
        MainFrm.LanciaStampaJasper(v_S1, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      else
      {
        MainFrm.LanciaStampaJasper(S, (new IDVariant("")), (new IDVariant("")), (new IDVariant("")));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settaradiobox
  // numeroRadioBox:  - Input
  // **********************************************************************
  public int Settaradiobox (IDVariant numeroRadioBox)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settaradiobox Body
      // Procedure Body
      // 
      if (numeroRadioBox.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0, (new IDVariant(1)));
      }
      if (numeroRadioBox.equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0, (new IDVariant(0)));
      }
      if (numeroRadioBox.equals((new IDVariant(3)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0, (new IDVariant(0)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "Settaradiobox", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Settaradioboxpanel
  // numeroRadioBox:  - Input
  // **********************************************************************
  public int Settaradioboxpanel (IDVariant numeroRadioBox)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Settaradioboxpanel Body
      // Procedure Body
      // 
      if (numeroRadioBox.equals((new IDVariant(1)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0, (new IDVariant(1)));
      }
      if (numeroRadioBox.equals((new IDVariant(2)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0, (new IDVariant(0)));
      }
      if (numeroRadioBox.equals((new IDVariant(3)), true))
      {
        IMDB.set_Value(IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0, (new IDVariant(0)));
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "Settaradioboxpanel", _e);
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
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI401, IMDBDef1.FLD_PARAMETRI401_PARAANCHSCAD, 0, (new IDVariant("SI")));
      MainFrm.Show(MyGlb.FRM_SCELTASOGGET, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "ApriScegliSoggetto", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Documenti Validate Event
  // Evento notificato al campo quando sta per essere validato
  // 
  // Cancel: Parametro di output booleano, diventato obsoleto. Per segnalare una condizione di errore sul campo è necessario utilizzare la funzione SetErrorText. - Input/Output
  // **********************************************************************
  private void PFL_PARAMETRI_DOCUMENTI_ValidateCell(IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Documenti Validate Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMEDOCUM, 0).equals((new IDVariant("S")), true))
      {
        IMDB.set_Value(IMDBDef9.PQRY_DOCUMENTI, IMDBDef9.PQSL_DOCUMENTI_ROWNAMETIPOL, 0, (new IDVariant(3)));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("DocumentiAperti", "DocumentiValidateEvent", _e);
    }
  }

  // **********************************************************************
  // Documenti
  // Primary record source for panel data
  // **********************************************************************
  private void DOCUMEAPERTI_DOCUMENTI() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_DOCUMENTI_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI133, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_PARAMETRI133, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_DOCUMENTI_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_DOCUMENTI_RS, 0, IMDBDef2.TBL_PARAMETRI133, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 0, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMEDOCUM, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 1, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRDA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 2, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 3, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRDA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 4, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 5, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMECATEG, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 6, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMSUPEUF, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 7, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 8, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 9, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMDATELA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 10, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMTIPPRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_DOCUMENTI_RS, 11, 0, IMDBDef2.TBL_PARAMETRI133, IMDBDef2.FLD_PARAMETRI133_ROWNAMCODSOG, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_PARAMETRI133, 0);
      if (IMDB.Eof(IMDBDef2.TBL_PARAMETRI133, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_PARAMETRI133, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_DOCUMENTI_RS, 0);
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
    if (ColIndex.intValue() == PFL_PARAMETRI_ELABORBUTTON)
    {
      this.IdxPanelActived = this.PAN_PARAMETRI.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_PARAMETRI_BOTTAPRISOGG)
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
      if (Cancel.isFalse() && ColIndex.intValue() == PFL_PARAMETRI_DOCUMENTI)
      {
        PFL_PARAMETRI_DOCUMENTI_ValidateCell(Cancel);
      }
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
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_GROUP, 6);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, "0F559137-39AC-481C-A94E-02BDCE2E73C5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, "Documenti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, MyGlb.PANEL_LIST, 0, -9999, 208, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, MyGlb.PANEL_FORM, 8, 15, 268, 73, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, 0, 61);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DOCUMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, "D390FB06-0C9D-4A1E-A3B4-FF7D272BAD67");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, "Tipo Protocollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 0, 0, 0, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 8, 91, 500, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, 0, 84);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_TIPOPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, "4B4BD505-4813-4A19-9EF3-02818C1804CB");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, "Numero Protocollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, MyGlb.PANEL_LIST, 624, -9999, 1040, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, MyGlb.PANEL_FORM, 280, 147, 228, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, 0, 104);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_NUMEROPROTOC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, "E92FBD90-EF1D-442A-B559-46AA09DB1EE0");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, "Data Protocollo");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, MyGlb.PANEL_LIST, 208, -9999, 416, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, MyGlb.PANEL_FORM, 8, 147, 268, 53, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, 0, 87);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_DATAPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, "E9EADE4C-05B2-42A3-8D4D-D36D97885335");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, "Vuoto");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, MyGlb.PANEL_LIST, 0, -9999, 256, 0, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, MyGlb.PANEL_FORM, 280, 16, 228, 72, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, 0, 33);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, 0, 1);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, 1, 1);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_VUOTO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, "AFA16B9F-EF63-4B9E-BA50-168E4E4D001D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, "Soggetto");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, MyGlb.VIS_GROUPSTYLE);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, MyGlb.PANEL_LIST, 0, -9999, 100, 16, 0, 0);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, MyGlb.PANEL_FORM, 8, 203, 500, 61, 0, 0);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, 0, 92);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, 1, 13);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, 0, 4);
    PAN_PARAMETRI.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, 1, 4);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_GROUP, GRP_PARAMETRI_CODICESOGGET, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PARAMETRI.SetSize(MyGlb.OBJ_FIELD, 24);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "B1021400-F242-4981-9BCE-C2BA3FA6C7AF");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, "F7C19B8F-535B-4236-AA44-1AE7433C363C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, "Categoria");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, "057B2C97-2682-4FF5-8E0A-2DE208D33771");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, "Suddivisione Per Ufficio");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.VIS_CHECKSTYLE);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, "EA5CC7A6-DAC7-4D79-BEC4-DB3B3F673296");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, "Documenti");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "5351C493-2F7B-4C85-B6DA-AF51E987A153");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, "8AEC4025-28F2-4086-A86E-BC5D83273456");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, "4D36A006-145E-4F51-8AA2-239B858F164D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "C326838D-0CAD-4833-A57E-A3FF17D36232");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "EBEF3903-ECC6-46ED-AC0F-398F46C17A92");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, "64B3845A-C518-4A02-8209-FFB0F81FA79D");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, "A246850D-2F03-476C-87F7-7FEF2CD09552");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "59FBAF03-37D4-4D6E-BE4E-0E62F7FB876C");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "Dal");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "5DC5544A-B2AF-4785-9EDC-769E09607650");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "Al");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, "59222B8A-10CA-4923-9455-C43DAAFB6C7A");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, "776F1660-F85A-4166-8DEB-599E5CE1BB84");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, "34C7960D-39C9-47C5-A3F2-6F09CF3814CE");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, "Tipoliquidati");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "E693506F-0308-4C32-91A3-6237F4C56E19");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "7EE4D8C3-E755-4317-A73E-9EC7B77496C4");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "1B0B6764-561D-4B5E-B7DD-351F2A1D2EB5");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "Data Elaborazione");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "D35907A1-B25B-4538-8281-78224F349820");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, "Elabora");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0, "button1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, "30A0976F-7D7B-431D-BBB6-3E746D4E240E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, "To String (BEN CODICE) + \"-\" + BEN RAGIONE SOCIALE ESTESA");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, "71A6FA3D-11E2-485E-AE75-74A80D2DE17E");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, " ");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, "Apri Soggetto");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, MyGlb.VIS_STATICBUTTON);
    PAN_PARAMETRI.SetImage(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, 0, "wsearch1.gif", false);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, "C8413E0B-DC0E-4844-B2EF-DBC0A1E72349");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, "Codice Soggetto");
    PAN_PARAMETRI.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.VIS_NORMALFIELDS);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, 0 | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_ISOPT, -1);
    PAN_PARAMETRI.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, "C6BEEE71-FC92-4E59-8E59-6B8C0B53F895");
    PAN_PARAMETRI.set_Header(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, "");
    PAN_PARAMETRI.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, MyGlb.VIS_SFONEBORDTRA);
    PAN_PARAMETRI.SetFlags(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PARAMETRI_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 832, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_LIST, "Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 104, 280, 356, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_UFFICIO, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_UFFICIO, PPQRY_DOCUMENTI, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_LIST, 1040, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_LIST, 56);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_LIST, "Categoria");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_FORM, 96, 304, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CATEGORIA, MyGlb.PANEL_FORM, "Categoria");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CATEGORIA, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CATEGORIA, PPQRY_DOCUMENTI, "A.ROWNAMECATEG", "ROWNAMECATEG", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_LIST, 1248, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_LIST, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_LIST, "Suddivisione Per Ufficio");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_FORM, 296, 328, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_FORM, 140);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_SUDDIPERUFFI, MyGlb.PANEL_FORM, "Suddivisione Per Ufficio");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_SUDDIPERUFFI, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_SUDDIPERUFFI, PPQRY_DOCUMENTI, "A.ROWNAMSUPEUF", "ROWNAMSUPEUF", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUDDIPERUFFI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_SUDDIPERUFFI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_LIST, 0, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_LIST, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_LIST, "Documenti");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_FORM, 60, 40, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_FORM, 60);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DOCUMENTI, MyGlb.PANEL_FORM, "Docum.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DOCUMENTI, -1, GRP_PARAMETRI_DOCUMENTI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DOCUMENTI, PPQRY_DOCUMENTI, "A.ROWNAMEDOCUM", "ROWNAMEDOCUM", 5, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DOCUMENTI, (new IDVariant("S")), "di Spesa", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_DOCUMENTI, (new IDVariant("E")), "di Entrata", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 168, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 12, 40, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB1, -1, GRP_PARAMETRI_DOCUMENTI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB1, -1, "", "NEWPANELLAB1", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, MyGlb.PANEL_LIST, 184, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, MyGlb.PANEL_FORM, 260, 72, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB2, -1, GRP_PARAMETRI_DOCUMENTI);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB2, -1, "", "NEWPANELLAB2", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 0, 36, 260, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 92);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_LIST, " ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 12, 116, 492, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 44);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOPROTOCOL, MyGlb.PANEL_FORM, " ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOPROTOCOL, -1, GRP_PARAMETRI_TIPOPROTOCOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOPROTOCOL, PPQRY_DOCUMENTI, "A.ROWNAMTIPPRO", "ROWNAMTIPPRO", 5, 50, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOPROTOCOL, (new IDVariant("I")), "Interno", "Interno", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOPROTOCOL, (new IDVariant("G")), "Generale", "Generale", "", -1);
    PAN_PARAMETRI.set_Alignment(PFL_PARAMETRI_TIPOPROTOCOL, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 624, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 300, 172, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL, -1, GRP_PARAMETRI_NUMEROPROTOC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL, PPQRY_DOCUMENTI, "A.ROWNAMNUPRDA", "ROWNAMNUPRDA", 1, 7, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1456, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 404, 172, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL, -1, GRP_PARAMETRI_NUMEROPROTOC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL, PPQRY_DOCUMENTI, "A.ROWNAMNUPRAL", "ROWNAMNUPRAL", 1, 7, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, MyGlb.PANEL_LIST, 200, 180, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, MyGlb.PANEL_FORM, 284, 184, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB5, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB5, -1, GRP_PARAMETRI_NUMEROPROTOC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB5, -1, "", "NEWPANELLAB5", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, MyGlb.PANEL_LIST, 184, 124, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, MyGlb.PANEL_FORM, 492, 184, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB6, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB6, -1, GRP_PARAMETRI_NUMEROPROTOC);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB6, -1, "", "NEWPANELLAB6", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 208, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_LIST, "Dal");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 16, 172, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 28);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DAL1, MyGlb.PANEL_FORM, "Dal");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DAL1, -1, GRP_PARAMETRI_DATAPROTOCOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DAL1, PPQRY_DOCUMENTI, "A.ROWNAMDAPRDA", "ROWNAMDAPRDA", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 416, 36, 208, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_LIST, "Al");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 140, 172, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 20);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_AL1, MyGlb.PANEL_FORM, "Al");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_AL1, -1, GRP_PARAMETRI_DATAPROTOCOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_AL1, PPQRY_DOCUMENTI, "A.ROWNAMDAPRAL", "ROWNAMDAPRAL", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, MyGlb.PANEL_LIST, 204, 108, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, MyGlb.PANEL_FORM, 12, 172, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB3, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB3, -1, GRP_PARAMETRI_DATAPROTOCOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB3, -1, "", "NEWPANELLAB3", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, MyGlb.PANEL_LIST, 164, 88, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, MyGlb.PANEL_FORM, 260, 184, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLAB4, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLAB4, -1, GRP_PARAMETRI_DATAPROTOCOL);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLAB4, -1, "", "NEWPANELLAB4", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_LIST, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_LIST, "Tipoliquidati");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_FORM, 284, 24, 128, 60, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_FORM, 64);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_FORM, 4);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_TIPOLIQUIDAT, MyGlb.PANEL_FORM, "Tipoliq.");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_TIPOLIQUIDAT, -1, GRP_PARAMETRI_VUOTO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_TIPOLIQUIDAT, PPQRY_DOCUMENTI, "A.ROWNAMETIPOL", "ROWNAMETIPOL", 1, 49, 0, -13997);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOLIQUIDAT, (new IDVariant(1)), "Non Liquidati", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOLIQUIDAT, (new IDVariant(2)), "Liquidati non Pagati", "", "", -1);
    PAN_PARAMETRI.SetValueListItem(PFL_PARAMETRI_TIPOLIQUIDAT, (new IDVariant(3)), "Non Pagati", "", "", -1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 452, 32, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 388, 20, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELLABE, -1, GRP_PARAMETRI_VUOTO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 364, 24, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 492, 64, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE2, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE2, -1, GRP_PARAMETRI_VUOTO);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE2, -1, "", "NEWPANELABE2", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 96);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_LIST, "Data Elaborazione");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 256, 352, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 120);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_DATAELABORAZ, MyGlb.PANEL_FORM, "Data Elaborazione");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_DATAELABORAZ, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_DATAELABORAZ, PPQRY_DOCUMENTI, "A.ROWNAMDATELA", "ROWNAMDATELA", 6, 49, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 288, 296, 84, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 380, 392, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_ELABORBUTTON, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_ELABORBUTTON, -1, -1);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_ELABORBUTTON, -1, "", "ELABORBUTTON", 0, 0, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_LIST, 0, 36, 404, 32, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_LIST, 80);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_LIST, 2);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_LIST, " ");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_FORM, 12, 228, 448, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_FORM, 12);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BENDEBITORE, MyGlb.PANEL_FORM, " ");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BENDEBITORE, -1, GRP_PARAMETRI_CODICESOGGET);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BENDEBITORE, PPQRY_BEN, "TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA", "DEBITORE", 5, 160, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, MyGlb.PANEL_LIST, 396, 232, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, MyGlb.PANEL_FORM, 464, 232, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_BOTTAPRISOGG, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_BOTTAPRISOGG, -1, GRP_PARAMETRI_CODICESOGGET);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_BOTTAPRISOGG, -1, "", "BOTTAPRISOGG", 0, 0, 0, -13997);
    PAN_PARAMETRI.set_ImageResizeMode(PFL_PARAMETRI_BOTTAPRISOGG, 2);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_LIST, 0, 36, 100, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_LIST, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_LIST, "Codice Soggetto");
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_FORM, 404, 292, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_FORM, 100);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PARAMETRI_CODICESOGGET, MyGlb.PANEL_FORM, "Codice Soggetto");
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_CODICESOGGET, -1, GRP_PARAMETRI_CODICESOGGET);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_CODICESOGGET, PPQRY_DOCUMENTI, "A.ROWNAMCODSOG", "ROWNAMCODSOG", 2, 15, 0, -13997);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, MyGlb.PANEL_LIST, 192, 132, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, MyGlb.PANEL_LIST, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, MyGlb.PANEL_LIST, 1);
    PAN_PARAMETRI.SetRect(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, MyGlb.PANEL_FORM, 492, 248, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PARAMETRI.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, MyGlb.PANEL_FORM, 0);
    PAN_PARAMETRI.SetNumRow(MyGlb.OBJ_FIELD, PFL_PARAMETRI_NEWPANELABE9, MyGlb.PANEL_FORM, 1);
    PAN_PARAMETRI.SetFieldPage(PFL_PARAMETRI_NEWPANELABE9, -1, GRP_PARAMETRI_CODICESOGGET);
    PAN_PARAMETRI.SetFieldPanel(PFL_PARAMETRI_NEWPANELABE9, -1, "", "NEWPANELABE9", 0, 0, 0, -13997);
  }

  private void PAN_PARAMETRI_InitQueries()
  {
    StringBuffer SQL;

    PAN_PARAMETRI.SetSize(MyGlb.OBJ_QUERY, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("where (A.CODICE = ~~ROWNAMCODSOG~~) ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 0, SQL, -1, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_BEN, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetMasterTable(PPQRY_BEN, "BEN");
    PAN_PARAMETRI.SetQueryLKE(PPQRY_BEN, PFL_PARAMETRI_CODICESOGGET, "BENCODICE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as BENCODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || '-' || A.RAGIONE_SOCIALE_ESTESA as DEBITORE, ");
    SQL.append("  A.CODICE_FISCALE as CODICE_FISCALE, ");
    SQL.append("  A.PARTITA_IVA as PARTITA_IVA, ");
    SQL.append("  A.D_SCADENZA as D_SCADENZA, ");
    SQL.append("  A.DAL as DAL, ");
    SQL.append("  A.AL as AL ");
    SQL.append("from ");
    SQL.append("  BEN A ");
    SQL.append("order by ");
    SQL.append("  A.CODICE ");
    PAN_PARAMETRI.SetQuery(PPQRY_BEN, 1, SQL, -1, "");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "DEBITORE", "Debitore");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "CODICE_FISCALE", "Codice Fiscale");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "CODICE_FISCALE");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "PARTITA_IVA", "Partita IVA");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "PARTITA_IVA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "D_SCADENZA", "Scadenza");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "D_SCADENZA");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "DAL", "Dal");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "DAL");
    PAN_PARAMETRI.SetQueryHeaderColumn(PPQRY_BEN, "AL", "Al");
    PAN_PARAMETRI.SetQueryVisibleColumn(PPQRY_BEN, "AL");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = 0) ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 0, SQL, PFL_PARAMETRI_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  to_number(NULL), ");
    SQL.append("  '(Tutti)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T53, 1, SQL, PFL_PARAMETRI_UFFICIO, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T08CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T08DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T08 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECATEG~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMECATEG~~ = '0') ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T08, 0, SQL, PFL_PARAMETRI_CATEGORIA, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T08CODICE, ");
    SQL.append("  A.CODICE || ' - ' || A.DESCRIZIONE as T08DESCREXPR ");
    SQL.append("from ");
    SQL.append("  T08 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PARAMETRI.SetQuery(PPQRY_T08, 1, SQL, PFL_PARAMETRI_CATEGORIA, "");
    PAN_PARAMETRI.SetQueryDB(PPQRY_T08, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PARAMETRI.SetIMDB(IMDB, "PQRY_DOCUMENTI", true);
    PAN_PARAMETRI.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PARAMETRI.SetQueryIMDB(PPQRY_DOCUMENTI, IMDBDef9.PQRY_DOCUMENTI_RS, IMDBDef2.TBL_PARAMETRI133);
    JustLoaded = true;
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_UFFICIO, IMDBDef2.FLD_PARAMETRI133_ROWNAMEUFFIC);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CATEGORIA, IMDBDef2.FLD_PARAMETRI133_ROWNAMECATEG);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_SUDDIPERUFFI, IMDBDef2.FLD_PARAMETRI133_ROWNAMSUPEUF);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DOCUMENTI, IMDBDef2.FLD_PARAMETRI133_ROWNAMEDOCUM);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOPROTOCOL, IMDBDef2.FLD_PARAMETRI133_ROWNAMTIPPRO);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL, IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL, IMDBDef2.FLD_PARAMETRI133_ROWNAMNUPRAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DAL1, IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRDA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_AL1, IMDBDef2.FLD_PARAMETRI133_ROWNAMDAPRAL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_TIPOLIQUIDAT, IMDBDef2.FLD_PARAMETRI133_ROWNAMETIPOL);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_DATAELABORAZ, IMDBDef2.FLD_PARAMETRI133_ROWNAMDATELA);
    PAN_PARAMETRI.SetFieldPrimaryIndex(PFL_PARAMETRI_CODICESOGGET, IMDBDef2.FLD_PARAMETRI133_ROWNAMCODSOG);
    PAN_PARAMETRI.SetMasterTable(0, "PARAMETRI133");
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
    if (SrcObj == PAN_PARAMETRI) PAN_PARAMETRI_OnGetLKE(RS, ntry, nullv, bskip, bcancel, fldindex);
  }
  
  public void OnMouseOver(IDPanel SrcObj, IDVariant Field, IDVariant Row)
  {
  }
  
  public void OnFieldListVisibilityChanged(IDPanel SrcObj, IDVariant FieldIndex, IDVariant NewValue, IDVariant Final)
  {
  }
}
