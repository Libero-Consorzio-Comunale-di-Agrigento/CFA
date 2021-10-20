// **********************************************
// Emissione Ordinativi Incassi
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class EmissioneOrdinativiIncassi extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_EMISSIORDINA_INCASSI = 0;

  private static int PFL_EMISSIORDINA_TIPOREGISTRO = 0;
  private static int PFL_EMISSIORDINA_TIPOBOLLATO = 1;
  private static int PFL_EMISSIORDINA_PERIOINCADAL = 2;
  private static int PFL_EMISSIORDINA_AL = 3;
  private static int PFL_EMISSIORDINA_TIPOREGIBOLL = 4;
  private static int PFL_EMISSIORDINA_ELABORA = 5;
  private static int PFL_EMISSIORDINA_EMAUVPMDSASC = 6;
  private static int PFL_EMISSIORDINA_DATA = 7;
  private static int PFL_EMISSIORDINA_DESCRIZIONE = 8;
  private static int PFL_EMISSIORDINA_CAUSALE = 9;
  private static int PFL_EMISSIORDINA_BOLLO = 10;
  private static int PFL_EMISSIORDINA_UFFICIO = 11;
  private static int PFL_EMISSIORDINA_DESCRDAACCER = 12;

  private static int PPQRY_ORDINDACORR7 = 0;

  private static int PPQRY_T04 = 1;

  private static int PPQRY_T58 = 2;
  private static int PPQRY_T60 = 3;
  private static int PPQRY_T53 = 4;


  IDPanel PAN_EMISSIORDINA;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_EMISSIORDIN2(IMDB);
    //
    //
    Init_PQRY_ORDINDACORR7(IMDB);
    Init_PQRY_ORDINDACORR7_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_EMISSIORDIN2(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef2.TBL_EMISSIORDIN2, 11);
    IMDB.set_TblCode(IMDBDef2.TBL_EMISSIORDIN2, "TBL_EMISSIORDIN2");
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_RNEAVPMDSASC,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINDA, "ROWNAMPEINDA");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINDA,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINAL, "ROWNAMPEINAL");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINAL,6,15,0);
    IMDB.set_FldCode(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMDEDAAC, "ROWNAMDEDAAC");
    IMDB.SetFldParams(IMDBDef2.TBL_EMISSIORDIN2,IMDBDef2.FLD_EMISSIORDIN2_ROWNAMDEDAAC,1,2,0);
    IMDB.TblAddNew(IMDBDef2.TBL_EMISSIORDIN2, 0);
  }

  private static void Init_PQRY_ORDINDACORR7(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ORDINDACORR7, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_ORDINDACORR7, "PQRY_ORDINDACORR7");
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_RNEAVPMDSASC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINDA, "ROWNAMPEINDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINDA,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINAL, "ROWNAMPEINAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMDEDAAC, "ROWNAMDEDAAC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMDEDAAC,1,2,0);
    IMDB.TblAddNew(IMDBDef9.PQRY_ORDINDACORR7, 0);
  }

  private static void Init_PQRY_ORDINDACORR7_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef9.PQRY_ORDINDACORR7_RS, 11);
    IMDB.set_TblCode(IMDBDef9.PQRY_ORDINDACORR7_RS, "PQRY_ORDINDACORR7_RS");
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDATA, "ROWNAMEDATA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDATA,6,14,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDESCR, "ROWNAMEDESCR");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDESCR,5,49,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMECAUSA, "ROWNAMECAUSA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMECAUSA,1,4,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEBOLLO, "ROWNAMEBOLLO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEBOLLO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEUFFIC, "ROWNAMEUFFIC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEUFFIC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_RNEAVPMDSASC, "RNEAVPMDSASC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_RNEAVPMDSASC,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_TIPO_REGISTRO, "TIPO_REGISTRO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_TIPO_REGISTRO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_TIPO_BOLLATO, "TIPO_BOLLATO");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_TIPO_BOLLATO,1,2,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINDA, "ROWNAMPEINDA");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINDA,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINAL, "ROWNAMPEINAL");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINAL,6,15,0);
    IMDB.set_FldCode(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMDEDAAC, "ROWNAMDEDAAC");
    IMDB.SetFldParams(IMDBDef9.PQRY_ORDINDACORR7_RS,IMDBDef9.PQSL_ORDINDACORR7_ROWNAMDEDAAC,1,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public EmissioneOrdinativiIncassi(MyWebEntryPoint w, IMDBObj imdb)
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
  public EmissioneOrdinativiIncassi()
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
    FormIdx = MyGlb.FRM_EMISORDIINCA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "6119147B-0BF2-4B87-ACB6-A82CF1F7BC43";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 580;
    DesignHeight = 362;
    set_Caption(new IDVariant("Emissione Ordinativi Incassi"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 580;
    Frames[1].Height = 336;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Emissione Ordinativi";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 336;
    PAN_EMISSIORDINA = new IDPanel(w, this, 1, "PAN_EMISSIORDINA");
    Frames[1].Content = PAN_EMISSIORDINA;
    PAN_EMISSIORDINA.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_EMISSIORDINA.VS = MainFrm.VisualStyleList;
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 580-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "5BA9D282-3027-40CB-9E8E-6287DA8B1B86");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 1340, 292, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_EMISSIORDINA.InitStatus = 2;
    PAN_EMISSIORDINA_Init();
    PAN_EMISSIORDINA_InitFields();
    PAN_EMISSIORDINA_InitQueries();
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
      if (IMDB.TblModified(IMDBDef2.TBL_EMISSIORDIN2, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        EMISORDIINCA_ORDINDACORR7();
      }
      PAN_EMISSIORDINA.UpdatePanel(MainFrm);
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
    return (obj instanceof EmissioneOrdinativiIncassi);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? EmissioneOrdinativiIncassi.class.getName() : (Glb.ClassWithPackage(EmissioneOrdinativiIncassi.class) ? EmissioneOrdinativiIncassi.class.getName().substring(EmissioneOrdinativiIncassi.class.getPackage().getName().length() + 1) : EmissioneOrdinativiIncassi.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
      if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDESCR, 0)))
      {
        IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
        v_ERR = (new IDVariant("Descrizione Obbligatoria", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_ERR); 
      }
      else
      {
        if ((IDL.Year(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINDA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0) || (IDL.Year(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINAL, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0))
        {
          MainFrm.set_AlertMessage((new IDVariant("Il periodo di incasso non nell'esercizio"))); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_TIPO_REGISTRO, 0)) && IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_TIPO_BOLLATO, 0)))
        {
          MainFrm.set_AlertMessage((new IDVariant("Indicare un registro/bollato"))); 
          return 0;
        }
        if (IDL.IsNull(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDATA, 0)) || IDL.Year(IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDATA, 0)).compareTo(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), true)!=0)
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Data degli ordinativi non indicata o non appartenente all'esercizio del contesto", IDVariant.STRING));
          MainFrm.set_AlertMessage(v_ERR); 
        }
        else
        {
          IDVariant v_NORDDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_NORDA = new IDVariant(0,IDVariant.INTEGER);
          IDVariant v_SVARACC = new IDVariant(0,IDVariant.STRING);
          MainFrm.Cf4armDBObject.set_ErrorMessage((new IDVariant("")).stringValue());
          MainFrm.Cf4armDBObject.ORDEMISSFS4(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_TIPO_REGISTRO, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_TIPO_BOLLATO, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINDA, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMPEINAL, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDATA, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEDESCR, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMDEDAAC, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEBOLLO, 0), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMEUFFIC, 0), ((IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMECAUSA, 0).equals((new IDVariant(-1))))?(new IDVariant()):IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_ROWNAMECAUSA, 0)), IMDB.Value(IMDBDef9.PQRY_ORDINDACORR7, IMDBDef9.PQSL_ORDINDACORR7_RNEAVPMDSASC, 0), v_NORDDA, v_NORDA, v_SVARACC);
          if ((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage())).compareTo((new IDVariant("")), true)!=0)
          {
            MainFrm.set_AlertMessage((new IDVariant(MainFrm.Cf4armDBObject.ErrorMessage()))); 
          }
          else
          {
            IDVariant v_RETMSG = new IDVariant(0,IDVariant.STRING);
            v_RETMSG = IDL.Add((new IDVariant("Elaborazione eseguita")), (new IDVariant("<BR/>")));
            if (v_NORDDA.compareTo(v_NORDA, true)<=0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Emessi ordinativi da ", IDVariant.STRING));
              v_MSG = IDL.Add(IDL.Add(IDL.Add(IDL.Add(IDL.Add(v_MSG, IDL.ToString(v_NORDDA)), (new IDVariant(" "))), (new IDVariant("a"))), (new IDVariant(" "))), IDL.ToString(v_NORDA));
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            else
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Non sono stati emessi Ordinativi", IDVariant.STRING));
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            if (v_SVARACC.compareTo((new IDVariant("")), true)!=0)
            {
              IDVariant v_MSG = new IDVariant(0,IDVariant.STRING);
              v_MSG = (new IDVariant("Emesse Variazioni per mancanza di disponibilità sui seguenti accertamenti  ", IDVariant.STRING));
              v_MSG = IDL.Add(v_MSG, v_SVARACC);
              v_RETMSG = IDL.Add(IDL.Add(v_RETMSG, v_MSG), (new IDVariant("<BR/>")));
            }
            MainFrm.set_AlertMessage(v_RETMSG); 
          }
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiIncassi", "Elabora", _e);
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

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add((new IDVariant("Emissione Ordinativi")), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDATA, 0, IDL.Today());
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMECAUSA, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEBOLLO, 0, (new IDVariant(-1)));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEUFFIC, 0, IDL.NullValue(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOUFFICI, 0),(new IDVariant(-1))));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_RNEAVPMDSASC, 0, (new IDVariant(0)));
      IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMDEDAAC, 0, (new IDVariant(0)));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiIncassi", "LoadEvent", _e);
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
      UNLOADEVENT_EMISORDIDELE();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("EmissioneOrdinativiIncassi", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Emissione Ordinativi: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOADEVENT_EMISORDIDELE() throws SQLException
  {
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDATA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDESCR, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMECAUSA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEBOLLO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEUFFIC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_RNEAVPMDSASC, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_REGISTRO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_BOLLATO, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINDA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINAL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMDEDAAC, 0, new IDVariant());
  }

  // **********************************************************************
  // Ordinativi Da Corrispettivi
  // Primary record source for panel data
  // **********************************************************************
  private void EMISORDIINCA_ORDINDACORR7() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef9.PQRY_ORDINDACORR7_RS);
    IMDB.TblMoveFirst(IMDBDef2.TBL_EMISSIORDIN2, 0);
    Loop1: while (!IMDB.Eof(IMDBDef2.TBL_EMISSIORDIN2, 0))
    {
      IMDB.TblAddNew(IMDBDef9.PQRY_ORDINDACORR7_RS, 0);
      IMDB.TblLinkRow(IMDBDef9.PQRY_ORDINDACORR7_RS, 0, IMDBDef2.TBL_EMISSIORDIN2, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 0, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDATA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 1, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDESCR, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 2, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMECAUSA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 3, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEBOLLO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 4, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEUFFIC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 5, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_RNEAVPMDSASC, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 6, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_REGISTRO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 7, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_TIPO_BOLLATO, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 8, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINDA, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 9, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINAL, 0);
      IMDB.TblLinkField(IMDBDef9.PQRY_ORDINDACORR7_RS, 10, 0, IMDBDef2.TBL_EMISSIORDIN2, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMDEDAAC, 0);
      IMDB.TblMoveNext(IMDBDef2.TBL_EMISSIORDIN2, 0);
      if (IMDB.Eof(IMDBDef2.TBL_EMISSIORDIN2, 0))
      {
        IMDB.TblMoveFirst(IMDBDef2.TBL_EMISSIORDIN2, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef9.PQRY_ORDINDACORR7_RS, 0);
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
  private void PAN_EMISSIORDINA_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_EMISSIORDINA, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_EMISSIORDINA_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_EMISSIORDINA, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_EMISSIORDINA_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_EMISSIORDINA);
    // Stub
  }

  private void PAN_EMISSIORDINA_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_EMISSIORDINA_ELABORA)
    {
      this.IdxPanelActived = this.PAN_EMISSIORDINA.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_EMISSIORDINA_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_EMISSIORDINA_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_EMISSIORDINA_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_EMISSIORDINA_Init()
  {

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, "B752E768-25CB-45D8-A605-55AF0311BB08");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, "Incassi");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, MyGlb.VIS_GROUPSTYLE);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, MyGlb.PANEL_LIST, 0, -9999, 412, 10, 0, 0);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, MyGlb.PANEL_FORM, 16, 18, 524, 62, 0, 0);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 0, 40);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 1, 13);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 0, 2);
    PAN_EMISSIORDINA.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 1, 2);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_GROUP, GRP_EMISSIORDINA_INCASSI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_FIELD, 13);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, "F654D887-7A14-47D3-89F3-07FCF9BEE640");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, "Tipo Registro");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, "5EC0149A-49A5-445F-ADAD-23901BD3EECA");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, "Tipo Bollato");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.VIS_NORMFIELPADR);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, 0 | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, "B75E391D-131B-4D32-A26B-C8DAF9147C40");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, "Periodo Incassi: dal");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, "BC97A056-BA81-42C8-AEB4-C5D386F1F7B6");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, "al");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, "B68121E2-E8C9-42F3-A175-0AA15CDD84C2");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, "Tipo Registro/Bollato");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, "693441B4-2DD8-4420-A8BD-A53E2EF0BE86");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, "Elabora");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_EMISSIORDINA.SetImage(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, 0, "button1.gif", false);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, "63E94281-AC8E-4D1F-A82A-1A2DC90F5227");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenza)");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, "B5F55370-3226-4382-BDB6-E6E0AA0C7EF1");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, "Data");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "9104CEC1-0975-4408-9030-6279E18EEA0B");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "Descrizione");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "F725BDCE-B8A1-435E-BEA5-BB541F1BE3E2");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "Causale");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, "02D4B507-DDF4-4DAD-9FB1-806EDD4D6EEC");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, "Bollo");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "F94F00DD-254A-4332-B8F5-4DAD0001EAF2");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "Ufficio");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, "");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.VIS_NORMALFIELDS);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_EMISSIORDINA.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, "243798CC-7D19-4DEE-BEFB-E93C94E809D6");
    PAN_EMISSIORDINA.set_Header(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, "Descrizione da Accertamento");
    PAN_EMISSIORDINA.set_ToolTip(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, "Descrivi il contenuto del campo");
    PAN_EMISSIORDINA.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.VIS_CHECKSTYLE);
    PAN_EMISSIORDINA.SetFlags(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
  }

  private void PAN_EMISSIORDINA_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, 0, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, 84);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_LIST, "Tipo Registro");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, 104, 16, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, 84);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGISTRO, MyGlb.PANEL_FORM, "Tipo Registro");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOREGISTRO, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOREGISTRO, PPQRY_ORDINDACORR7, "A.TIPO_REGISTRO", "TIPO_REGISTRO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 0, 36, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_LIST, "Tipo Bollato");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 104, 40, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOBOLLATO, MyGlb.PANEL_FORM, "Tipo Bollato");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOBOLLATO, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOBOLLATO, PPQRY_ORDINDACORR7, "A.TIPO_BOLLATO", "TIPO_BOLLATO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, 120);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_LIST, "Periodo Incassi: dal");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, 32, 56, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, 120);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_PERIOINCADAL, MyGlb.PANEL_FORM, "Periodo Incassi: dal");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_PERIOINCADAL, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_PERIOINCADAL, PPQRY_ORDINDACORR7, "A.ROWNAMPEINDA", "ROWNAMPEINDA", 6, 15, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, 0, 36, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, 112);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_LIST, "al");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, 244, 56, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, 20);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_AL, MyGlb.PANEL_FORM, "al");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_AL, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_AL, PPQRY_ORDINDACORR7, "A.ROWNAMPEINAL", "ROWNAMPEINAL", 6, 15, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, 0, 36, 412, 44, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, 100);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_LIST, "Tipo Registro/Bollato");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, 20, 32, 516, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, 132);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_TIPOREGIBOLL, MyGlb.PANEL_FORM, "Tipo Registro/Bollato");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_TIPOREGIBOLL, -1, GRP_EMISSIORDINA_INCASSI);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_TIPOREGIBOLL, PPQRY_T04, "TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE", "DESCRIZIONE", 5, 244, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 400, 480, 92, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 456, 264, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_ELABORA, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, 944, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, 452);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_LIST, "E. A. V. P. M. D. S. A. S. C.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, 216, 208, 320, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, 296);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, 2);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_EMAUVPMDSASC, MyGlb.PANEL_FORM, "Emissione Automatica Variazioni Per Mancata Disponibilità Su Accertamento (Solo Competenza)");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_EMAUVPMDSASC, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_EMAUVPMDSASC, PPQRY_ORDINDACORR7, "A.RNEAVPMDSASC", "RNEAVPMDSASC", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_EMAUVPMDSASC, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_EMAUVPMDSASC, (new IDVariant(0)), "Zero", "", "", -1);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, 248, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, 32);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_LIST, "Data");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, 108, 88, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DATA, MyGlb.PANEL_FORM, "Data");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DATA, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DATA, PPQRY_ORDINDACORR7, "A.ROWNAMEDATA", "ROWNAMEDATA", 6, 14, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 0, 36, 256, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 64);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_LIST, "Descrizione");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 76, 112, 460, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 76);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRIZIONE, MyGlb.PANEL_FORM, "Descrizione");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DESCRIZIONE, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DESCRIZIONE, PPQRY_ORDINDACORR7, "A.ROWNAMEDESCR", "ROWNAMEDESCR", 5, 49, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 352, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 48);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_LIST, "Caus.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 92, 136, 444, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 60);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_CAUSALE, MyGlb.PANEL_FORM, "Causale");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_CAUSALE, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_CAUSALE, PPQRY_ORDINDACORR7, "A.ROWNAMECAUSA", "ROWNAMECAUSA", 1, 4, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, 392, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, 32);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_LIST, "Bollo");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, 108, 160, 428, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, 44);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_BOLLO, MyGlb.PANEL_FORM, "Bollo");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_BOLLO, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_BOLLO, PPQRY_ORDINDACORR7, "A.ROWNAMEBOLLO", "ROWNAMEBOLLO", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 432, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 40);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_LIST, "Uff.");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 100, 184, 436, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 52);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_UFFICIO, MyGlb.PANEL_FORM, "Ufficio");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_UFFICIO, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_UFFICIO, PPQRY_ORDINDACORR7, "A.ROWNAMEUFFIC", "ROWNAMEUFFIC", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_LIST, 0, 36, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_LIST, 176);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_LIST, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_LIST, "Descrizione da Accertamento");
    PAN_EMISSIORDINA.SetRect(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_FORM, 332, 88, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_EMISSIORDINA.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_FORM, 176);
    PAN_EMISSIORDINA.SetNumRow(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_FORM, 1);
    PAN_EMISSIORDINA.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_EMISSIORDINA_DESCRDAACCER, MyGlb.PANEL_FORM, "Descrizione da Accertamento");
    PAN_EMISSIORDINA.SetFieldPage(PFL_EMISSIORDINA_DESCRDAACCER, -1, -1);
    PAN_EMISSIORDINA.SetFieldPanel(PFL_EMISSIORDINA_DESCRDAACCER, PPQRY_ORDINDACORR7, "A.ROWNAMDEDAAC", "ROWNAMDEDAAC", 1, 2, 0, -13997);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_DESCRDAACCER, (new IDVariant(1)), "Uno", "", "", -1);
    PAN_EMISSIORDINA.SetValueListItem(PFL_EMISSIORDINA_DESCRDAACCER, (new IDVariant(0)), "Zero", "", "", -1);
  }

  private void PAN_EMISSIORDINA_InitQueries()
  {
    StringBuffer SQL;

    PAN_EMISSIORDINA.SetSize(MyGlb.OBJ_QUERY, 5);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where (A.TIPO_BOLLATO = ~~TIPO_BOLLATO~~) ");
    SQL.append("and   (A.TIPO_REGISTRO = ~~TIPO_REGISTRO~~) ");
    SQL.append("and   ((A.TIPO_REGISTRO = 3) OR (A.TIPO_REGISTRO = 5)) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T04, 0, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T04, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetMasterTable(PPQRY_T04, "T04");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_T04, PFL_EMISSIORDINA_TIPOREGISTRO, "T04TIPOREGIS");
    PAN_EMISSIORDINA.SetQueryLKE(PPQRY_T04, PFL_EMISSIORDINA_TIPOBOLLATO, "T04TIPOBOLLA");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) as CODICE, ");
    SQL.append("  A.TIPO_REGISTRO as T04TIPOREGIS, ");
    SQL.append("  A.TIPO_BOLLATO as T04TIPOBOLLA, ");
    SQL.append("  TO_CHAR ( A.TIPO_REGISTRO ) || ' - ' || TO_CHAR ( A.TIPO_BOLLATO ) || ' - ' || A.DESCRIZIONE as DESCRIZIONE ");
    SQL.append("from ");
    SQL.append("  T04 A ");
    SQL.append("where ((A.TIPO_REGISTRO = 3) OR (A.TIPO_REGISTRO = 5)) ");
    SQL.append("order by ");
    SQL.append("  A.TIPO_REGISTRO, ");
    SQL.append("  A.TIPO_BOLLATO ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T04, 1, SQL, -1, "");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_T04, "CODICE", "Codice");
    PAN_EMISSIORDINA.SetQueryHeaderColumn(PPQRY_T04, "DESCRIZIONE", "Descrizione");
    PAN_EMISSIORDINA.SetQueryVisibleColumn(PPQRY_T04, "DESCRIZIONE");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMECAUSA~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMECAUSA~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T58, 0, SQL, PFL_EMISSIORDINA_CAUSALE, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T58CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T58DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T58 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T58, 1, SQL, PFL_EMISSIORDINA_CAUSALE, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T58, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEBOLLO~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEBOLLO~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T60, 0, SQL, PFL_EMISSIORDINA_BOLLO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T60CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T60DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T60 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T60, 1, SQL, PFL_EMISSIORDINA_BOLLO, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T60, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEUFFIC~~) ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("where (~~ROWNAMEUFFIC~~ = -1) ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T53, 0, SQL, PFL_EMISSIORDINA_UFFICIO, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as T53CODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as T53DESCRIZIO ");
    SQL.append("from ");
    SQL.append("  T53 A ");
    SQL.append("UNION ALL ");
    SQL.append("select ");
    SQL.append("  -1, ");
    SQL.append("  '(nulla)' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_EMISSIORDINA.SetQuery(PPQRY_T53, 1, SQL, PFL_EMISSIORDINA_UFFICIO, "");
    PAN_EMISSIORDINA.SetQueryDB(PPQRY_T53, MainFrm.Cf4armDBObject.DB, 4);
    PAN_EMISSIORDINA.SetIMDB(IMDB, "PQRY_ORDINDACORR7", true);
    PAN_EMISSIORDINA.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_EMISSIORDINA.SetQueryIMDB(PPQRY_ORDINDACORR7, IMDBDef9.PQRY_ORDINDACORR7_RS, IMDBDef2.TBL_EMISSIORDIN2);
    JustLoaded = true;
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_TIPOREGISTRO, IMDBDef2.FLD_EMISSIORDIN2_TIPO_REGISTRO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_TIPOBOLLATO, IMDBDef2.FLD_EMISSIORDIN2_TIPO_BOLLATO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_PERIOINCADAL, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINDA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_AL, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMPEINAL);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_EMAUVPMDSASC, IMDBDef2.FLD_EMISSIORDIN2_RNEAVPMDSASC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DATA, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDATA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DESCRIZIONE, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEDESCR);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_CAUSALE, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMECAUSA);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_BOLLO, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEBOLLO);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_UFFICIO, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMEUFFIC);
    PAN_EMISSIORDINA.SetFieldPrimaryIndex(PFL_EMISSIORDINA_DESCRDAACCER, IMDBDef2.FLD_EMISSIORDIN2_ROWNAMDEDAAC);
    PAN_EMISSIORDINA.SetMasterTable(0, "EMISSIORDIN2");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_EMISSIORDINA.Status() == 2)
    {
      int oldListQBE = PAN_EMISSIORDINA.iUseListQBE;
      PAN_EMISSIORDINA.iUseListQBE = 0;
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_SEARCH);
      PAN_EMISSIORDINA.PanelCommand(Glb.PCM_FIND);
      PAN_EMISSIORDINA.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_EMISSIORDINA) PAN_EMISSIORDINA_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
