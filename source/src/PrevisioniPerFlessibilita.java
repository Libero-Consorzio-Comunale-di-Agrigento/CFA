// **********************************************
// Previsioni Per Flessibilita
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class PrevisioniPerFlessibilita extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_PREVIPERFLES_PARTE = 0;

  private static int PFL_PREVIPERFLES_DAFLESSIBILI = 0;
  private static int PFL_PREVIPERFLES_AFLESSIBILIT = 1;
  private static int PFL_PREVIPERFLES_DABILANSIMUL = 2;
  private static int PFL_PREVIPERFLES_RIEPDELLFLES = 3;
  private static int PFL_PREVIPERFLES_DETTAGCAPITO = 4;
  private static int PFL_PREVIPERFLES_VARIAZIONI = 5;
  private static int PFL_PREVIPERFLES_DESCRIINTERV = 6;
  private static int PFL_PREVIPERFLES_PREVANNINCOR = 7;
  private static int PFL_PREVIPERFLES_TOTALPERTITO = 8;
  private static int PFL_PREVIPERFLES_ELABORA = 9;
  private static int PFL_PREVIPERFLES_PARTE = 10;
  private static int PFL_PREVIPERFLES_NEWPANELABE1 = 11;

  private static int PPQRY_PAR19 = 0;

  private static int PPQRY_FLESSIBILIT1 = 1;
  private static int PPQRY_FLESSIBILITA = 2;


  IDPanel PAN_PREVIPERFLES;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR22(IMDB);
    //
    //
    Init_PQRY_PAR19(IMDB);
    Init_PQRY_PAR19_RS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR22(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PAR22, 10);
    IMDB.set_TblCode(IMDBDef3.TBL_PAR22, "TBL_PAR22");
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEDAFLE, "ROWNAMEDAFLE");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEDAFLE,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEAFLES, "ROWNAMEAFLES");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEAFLES,5,4,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_RONAPRANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMRIDEFL, "ROWNAMRIDEFL");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMRIDEFL,5,2,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef3.TBL_PAR22,IMDBDef3.FLD_PAR22_ROWNAMTOPETI,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PAR22, 0);
  }

  private static void Init_PQRY_PAR19(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR19, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR19, "PQRY_PAR19");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEDAFLE, "ROWNAMEDAFLE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEDAFLE,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEAFLES, "ROWNAMEAFLES");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEAFLES,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_RONAPRANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMRIDEFL, "ROWNAMRIDEFL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMRIDEFL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19,IMDBDef12.PQSL_PAR19_ROWNAMTOPETI,5,2,0);
    IMDB.TblAddNew(IMDBDef12.PQRY_PAR19, 0);
  }

  private static void Init_PQRY_PAR19_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_PAR19_RS, 10);
    IMDB.set_TblCode(IMDBDef12.PQRY_PAR19_RS, "PQRY_PAR19_RS");
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEPARTE, "ROWNAMEPARTE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEDAFLE, "ROWNAMEDAFLE");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEDAFLE,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEAFLES, "ROWNAMEAFLES");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEAFLES,5,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMDABISI, "ROWNAMDABISI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMDABISI,5,1,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMDETCAP, "ROWNAMDETCAP");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMDETCAP,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEVARIA, "ROWNAMEVARIA");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMEVARIA,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_RONAPRANINCO, "RONAPRANINCO");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_RONAPRANINCO,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMDESINT, "ROWNAMDESINT");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMDESINT,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMRIDEFL, "ROWNAMRIDEFL");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMRIDEFL,5,2,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMTOPETI, "ROWNAMTOPETI");
    IMDB.SetFldParams(IMDBDef12.PQRY_PAR19_RS,IMDBDef12.PQSL_PAR19_ROWNAMTOPETI,5,2,0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public PrevisioniPerFlessibilita(MyWebEntryPoint w, IMDBObj imdb)
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
  public PrevisioniPerFlessibilita()
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
    FormIdx = MyGlb.FRM_PREVIPERFLES;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "9CEC9328-4946-4938-880A-98458A145364";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 392;
    DesignHeight = 314;
    set_Caption(new IDVariant("Previsioni Per Flessibilita"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 392;
    Frames[1].Height = 288;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Previsioni Per Flessibilità";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 288;
    PAN_PREVIPERFLES = new IDPanel(w, this, 1, "PAN_PREVIPERFLES");
    Frames[1].Content = PAN_PREVIPERFLES;
    PAN_PREVIPERFLES.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PREVIPERFLES.VS = MainFrm.VisualStyleList;
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 392-MyGlb.PAN_OFFS_X, 288-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7C786618-DE36-47F5-B369-0520E89160A5");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 480, 244, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PREVIPERFLES.InitStatus = 2;
    PAN_PREVIPERFLES_Init();
    PAN_PREVIPERFLES_InitFields();
    PAN_PREVIPERFLES_InitQueries();
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
      if (IMDB.TblModified(IMDBDef3.TBL_PAR22, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        PREVIPERFLES_PAR19();
      }
      PAN_PREVIPERFLES.UpdatePanel(MainFrm);
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
    return (obj instanceof PrevisioniPerFlessibilita);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? PrevisioniPerFlessibilita.class.getName() : (Glb.ClassWithPackage(PrevisioniPerFlessibilita.class) ? PrevisioniPerFlessibilita.class.getName().substring(PrevisioniPerFlessibilita.class.getPackage().getName().length() + 1) : PrevisioniPerFlessibilita.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
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
    IDVariant v_DW = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW1 = new IDVariant(0,IDVariant.STRING);
    IDVariant v_DW2 = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DW1 = (new IDVariant("d_bil_prev_flessibilita", IDVariant.STRING));
      v_DW2 = (new IDVariant("d_bil_prev_flessibilita_riep", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMRIDEFL, 0).equals((new IDVariant("NO")), true))
      {
        v_DW = new IDVariant(v_DW1);
      }
      else
      {
        v_DW = new IDVariant(v_DW2);
      }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMDABISI, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMEVARIA, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_RONAPRANINCO, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMDETCAP, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMEDAFLE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMEAFLES, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMDESINT, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMEPARTE, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMRIDEFL, 0));
      MainFrm.SetParametroStampa(IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMTOPETI, 0));
      MainFrm.SetParametroStampa((new IDVariant("E")));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerFlessibilita", "Elabora", _e);
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
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEPARTE, 0, (new IDVariant("S")));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEDAFLE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEAFLES, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMDABISI, 0, (new IDVariant("E")));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMDETCAP, 0, (new IDVariant("SI")));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEVARIA, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_RONAPRANINCO, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMDESINT, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMRIDEFL, 0, (new IDVariant("NO")));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMTOPETI, 0, (new IDVariant("SI")));
      AutoSaveType = (new IDVariant("NONE")).stringValue();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerFlessibilita", "LoadEvent", _e);
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
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEDAFLE, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEAFLES, 0, (new IDVariant()));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerFlessibilita", "UnloadEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Flessibilità On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PREVIPERFLES_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_PREVIPERFLES);
      // 
      // Previsioni Per Flessibilità On Dynamic Properties Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMEPARTE, 0).compareTo((new IDVariant("E")), true)!=0 && IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        PAN_PREVIPERFLES.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERFLES.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      if (IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMDETCAP, 0).equals((new IDVariant("NO")), true))
      {
        PAN_PREVIPERFLES.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_PREVIPERFLES.SetFlags (Glb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerFlessibilita", "PrevisioniPerFlessibilitàOnDynamicPropertiesEvent", _e);
    }
  }

  // **********************************************************************
  // Previsioni Per Flessibilità On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PREVIPERFLES_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Previsioni Per Flessibilità On Updating Row Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMDETCAP, 0).equals((new IDVariant("SI")), true))
      {
        IMDB.set_Value(IMDBDef12.PQRY_PAR19, IMDBDef12.PQSL_PAR19_ROWNAMRIDEFL, 0, (new IDVariant("NO")));
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("PrevisioniPerFlessibilita", "PrevisioniPerFlessibilitàOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void PREVIPERFLES_PAR19() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef12.PQRY_PAR19_RS);
    IMDB.TblMoveFirst(IMDBDef3.TBL_PAR22, 0);
    Loop1: while (!IMDB.Eof(IMDBDef3.TBL_PAR22, 0))
    {
      IMDB.TblAddNew(IMDBDef12.PQRY_PAR19_RS, 0);
      IMDB.TblLinkRow(IMDBDef12.PQRY_PAR19_RS, 0, IMDBDef3.TBL_PAR22, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 0, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEPARTE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 1, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEDAFLE, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 2, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEAFLES, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 3, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMDABISI, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 4, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMDETCAP, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 5, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMEVARIA, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 6, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_RONAPRANINCO, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 7, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMDESINT, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 8, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMRIDEFL, 0);
      IMDB.TblLinkField(IMDBDef12.PQRY_PAR19_RS, 9, 0, IMDBDef3.TBL_PAR22, IMDBDef3.FLD_PAR22_ROWNAMTOPETI, 0);
      IMDB.TblMoveNext(IMDBDef3.TBL_PAR22, 0);
      if (IMDB.Eof(IMDBDef3.TBL_PAR22, 0))
      {
        IMDB.TblMoveFirst(IMDBDef3.TBL_PAR22, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef12.PQRY_PAR19_RS, 0);
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
  private void PAN_PREVIPERFLES_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PREVIPERFLES, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PREVIPERFLES_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PREVIPERFLES, Cancel);
    // Stub
  }

  private void PAN_PREVIPERFLES_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PREVIPERFLES_ELABORA)
    {
      this.IdxPanelActived = this.PAN_PREVIPERFLES.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PREVIPERFLES_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PREVIPERFLES_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PREVIPERFLES_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PREVIPERFLES_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PREVIPERFLES_Init()
  {

    PAN_PREVIPERFLES.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PREVIPERFLES.SetSize(MyGlb.OBJ_GROUP, 1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, "7AED4642-B337-4D2B-B7FC-4AC5E6E6C98A");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, "Parte");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, MyGlb.VIS_GROUPSTYLE);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, MyGlb.PANEL_LIST, 0, -9999, 72, 16, 0, 0);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, MyGlb.PANEL_FORM, 8, 7, 364, 49, 0, 0);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, 0, 31);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, 1, 13);
    PAN_PREVIPERFLES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, 0, 4);
    PAN_PREVIPERFLES.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, 1, 4);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_GROUP, GRP_PREVIPERFLES_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_PREVIPERFLES.SetSize(MyGlb.OBJ_FIELD, 12);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, "AD5E70F9-C6C7-445F-8F56-579F5016A2CB");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, "Da Flessibilità");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, "E41D5A3E-3794-4FB4-BBE5-7571D4BD6052");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, "A Flessibilità");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.VIS_NORMALFIELDS);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_AUTOLOOKUP | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, "B702B6AF-F5E8-4BD8-8B3B-42523B506923");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, "Da Bilancio Simulato");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, "61FB0BD6-20A0-421E-822B-2E9205D08B83");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, "Riepilogo delle Flessibilità");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, "9842B300-14D4-4B58-B30C-434557FDDC35");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, "Dettaglio Capitoli");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, "CD55BCDF-79E3-4277-949A-B2FFCC16BFBE");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, "Variazioni");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, "446D0B92-F626-4C86-8116-BBE094798272");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, "Descrizione Intervento");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, "5333C1A8-27E8-40F5-A336-CFAE4FDAB605");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, "Previsione Anno In Corso");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, "C1754792-CD3E-4BBA-970C-6B9C632B7024");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, "Totali Per Titolo");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.VIS_CHECKSTYLE);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, "7578C0EB-DDA0-4CB4-B178-F08E0FB395B0");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, "Elabora");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_PREVIPERFLES.SetImage(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, 0, "button1.gif", false);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, "7A27C6C7-146D-4B10-8B92-4622D26B8C1D");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, "Parte");
    PAN_PREVIPERFLES.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.VIS_OPTBUTSENBOR);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PREVIPERFLES.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, "E37E9A4E-9B38-4C26-BA72-0344DCA937EC");
    PAN_PREVIPERFLES.set_Header(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, "");
    PAN_PREVIPERFLES.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, MyGlb.VIS_SFONEBORDTRA);
    PAN_PREVIPERFLES.SetFlags(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
  }

  private void PAN_PREVIPERFLES_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_LIST, 72, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_LIST, 72);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_LIST, "Da Fless.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_FORM, 8, 64, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_FORM, 88);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DAFLESSIBILI, MyGlb.PANEL_FORM, "Da Flessibilità");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_DAFLESSIBILI, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_DAFLESSIBILI, PPQRY_PAR19, "A.ROWNAMEDAFLE", "ROWNAMEDAFLE", 5, 4, 0, -13997);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_LIST, 112, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_LIST, 68);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_LIST, "A Fless.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_FORM, 8, 88, 364, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_FORM, 88);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_AFLESSIBILIT, MyGlb.PANEL_FORM, "A Flessibilità");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_AFLESSIBILIT, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_AFLESSIBILIT, PPQRY_PAR19, "A.ROWNAMEAFLES", "ROWNAMEAFLES", 5, 4, 0, -13997);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_LIST, 152, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_LIST, 104);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_LIST, "Da Bil. Simul.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_FORM, 20, 116, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_FORM, 124);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DABILANSIMUL, MyGlb.PANEL_FORM, "Da Bilancio Simulato");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_DABILANSIMUL, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_DABILANSIMUL, PPQRY_PAR19, "A.ROWNAMDABISI", "ROWNAMDABISI", 5, 1, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_DABILANSIMUL, (new IDVariant("S")), "S", "", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_DABILANSIMUL, (new IDVariant("E")), "E", "", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_LIST, 400, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_LIST, 128);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_LIST, "Rp. dl. Fls.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_FORM, 196, 116, 176, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_FORM, 152);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_RIEPDELLFLES, MyGlb.PANEL_FORM, "Riepilogo delle Flessibilità");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_RIEPDELLFLES, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_RIEPDELLFLES, PPQRY_PAR19, "A.ROWNAMRIDEFL", "ROWNAMRIDEFL", 5, 2, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_RIEPDELLFLES, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_RIEPDELLFLES, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_LIST, 192, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_LIST, 92);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_LIST, "Dett. Capit.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_FORM, 32, 140, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_FORM, 112);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DETTAGCAPITO, MyGlb.PANEL_FORM, "Dettaglio Capitoli");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_DETTAGCAPITO, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_DETTAGCAPITO, PPQRY_PAR19, "A.ROWNAMDETCAP", "ROWNAMDETCAP", 5, 2, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_DETTAGCAPITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_DETTAGCAPITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_LIST, 232, 36, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_LIST, 56);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_FORM, 268, 140, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_FORM, 80);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_VARIAZIONI, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_VARIAZIONI, PPQRY_PAR19, "A.ROWNAMEVARIA", "ROWNAMEVARIA", 5, 2, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_VARIAZIONI, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_VARIAZIONI, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_LIST, 360, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_LIST, 120);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_LIST, "Desc. Int.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_FORM, 4, 164, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_FORM, 140);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_DESCRIINTERV, MyGlb.PANEL_FORM, "Descrizione Intervento");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_DESCRIINTERV, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_DESCRIINTERV, PPQRY_PAR19, "A.ROWNAMDESINT", "ROWNAMDESINT", 5, 2, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_DESCRIINTERV, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_DESCRIINTERV, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_LIST, 320, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_LIST, 132);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_LIST, "Pr. A. I. C.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_FORM, 192, 164, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_FORM, 156);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PREVANNINCOR, MyGlb.PANEL_FORM, "Previsione Anno In Corso");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_PREVANNINCOR, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_PREVANNINCOR, PPQRY_PAR19, "A.RONAPRANINCO", "RONAPRANINCO", 5, 2, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_PREVANNINCOR, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_PREVANNINCOR, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_LIST, 440, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_LIST, 84);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_LIST, "Tot. P. Tit.");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_FORM, 40, 188, 128, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_FORM, 104);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_TOTALPERTITO, MyGlb.PANEL_FORM, "Totali Per Titolo");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_TOTALPERTITO, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_TOTALPERTITO, PPQRY_PAR19, "A.ROWNAMTOPETI", "ROWNAMTOPETI", 5, 2, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_TOTALPERTITO, (new IDVariant("SI")), "SI", "Type the value and explain what it means.", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_TOTALPERTITO, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, MyGlb.PANEL_LIST, 276, 212, 80, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, MyGlb.PANEL_FORM, 292, 232, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_ELABORA, -1, -1);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_LIST, 36);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_LIST, "Parte");
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_FORM, 80, 32, 288, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_FORM, 144);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_PARTE, MyGlb.PANEL_FORM, "Parte");
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_PARTE, -1, GRP_PREVIPERFLES_PARTE);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_PARTE, PPQRY_PAR19, "A.ROWNAMEPARTE", "ROWNAMEPARTE", 5, 1, 0, -13997);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_PARTE, (new IDVariant("E")), "Entrata", "Parte Entrata", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_PARTE, (new IDVariant("S")), "Spesa", "Parte Spesa", "", -1);
    PAN_PREVIPERFLES.SetValueListItem(PFL_PREVIPERFLES_PARTE, (new IDVariant("ES")), "Entrambe", "Entrambe le Parti", "", -1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, MyGlb.PANEL_LIST, 196, 28, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, MyGlb.PANEL_LIST, 0);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, MyGlb.PANEL_LIST, 1);
    PAN_PREVIPERFLES.SetRect(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, MyGlb.PANEL_FORM, 12, 32, 12, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PREVIPERFLES.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, MyGlb.PANEL_FORM, 0);
    PAN_PREVIPERFLES.SetNumRow(MyGlb.OBJ_FIELD, PFL_PREVIPERFLES_NEWPANELABE1, MyGlb.PANEL_FORM, 1);
    PAN_PREVIPERFLES.SetFieldPage(PFL_PREVIPERFLES_NEWPANELABE1, -1, GRP_PREVIPERFLES_PARTE);
    PAN_PREVIPERFLES.SetFieldPanel(PFL_PREVIPERFLES_NEWPANELABE1, -1, "", "NEWPANELABE1", 0, 0, 0, -13997);
  }

  private void PAN_PREVIPERFLES_InitQueries()
  {
    StringBuffer SQL;

    PAN_PREVIPERFLES.SetSize(MyGlb.OBJ_QUERY, 3);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FLESSICODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FLESSNEWEXPR ");
    SQL.append("from ");
    SQL.append("  FLESSIBILITA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEDAFLE~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERFLES.SetQuery(PPQRY_FLESSIBILIT1, 0, SQL, PFL_PREVIPERFLES_DAFLESSIBILI, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FLESSICODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FLESSNEWEXPR ");
    SQL.append("from ");
    SQL.append("  FLESSIBILITA A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERFLES.SetQuery(PPQRY_FLESSIBILIT1, 1, SQL, PFL_PREVIPERFLES_DAFLESSIBILI, "");
    PAN_PREVIPERFLES.SetQueryDB(PPQRY_FLESSIBILIT1, MainFrm.Cf4armDBObject.DB, 4);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FLESSICODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FLESSNEWEXPR ");
    SQL.append("from ");
    SQL.append("  FLESSIBILITA A ");
    SQL.append("where (A.CODICE = ~~ROWNAMEAFLES~~) ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERFLES.SetQuery(PPQRY_FLESSIBILITA, 0, SQL, PFL_PREVIPERFLES_AFLESSIBILIT, "");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.CODICE as FLESSICODICE, ");
    SQL.append("  TO_CHAR ( A.CODICE ) || ' - ' || A.DESCRIZIONE as FLESSNEWEXPR ");
    SQL.append("from ");
    SQL.append("  FLESSIBILITA A ");
    SQL.append("UNION ");
    SQL.append("select ");
    SQL.append("  NULL, ");
    SQL.append("  'Tutte' ");
    SQL.append("from ");
    SQL.append("  DUAL B ");
    SQL.append("order by 1 ");
    PAN_PREVIPERFLES.SetQuery(PPQRY_FLESSIBILITA, 1, SQL, PFL_PREVIPERFLES_AFLESSIBILIT, "");
    PAN_PREVIPERFLES.SetQueryDB(PPQRY_FLESSIBILITA, MainFrm.Cf4armDBObject.DB, 4);
    PAN_PREVIPERFLES.SetIMDB(IMDB, "PQRY_PAR19", true);
    PAN_PREVIPERFLES.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PREVIPERFLES.SetQueryIMDB(PPQRY_PAR19, IMDBDef12.PQRY_PAR19_RS, IMDBDef3.TBL_PAR22);
    JustLoaded = true;
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_DAFLESSIBILI, IMDBDef3.FLD_PAR22_ROWNAMEDAFLE);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_AFLESSIBILIT, IMDBDef3.FLD_PAR22_ROWNAMEAFLES);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_DABILANSIMUL, IMDBDef3.FLD_PAR22_ROWNAMDABISI);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_RIEPDELLFLES, IMDBDef3.FLD_PAR22_ROWNAMRIDEFL);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_DETTAGCAPITO, IMDBDef3.FLD_PAR22_ROWNAMDETCAP);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_VARIAZIONI, IMDBDef3.FLD_PAR22_ROWNAMEVARIA);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_DESCRIINTERV, IMDBDef3.FLD_PAR22_ROWNAMDESINT);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_PREVANNINCOR, IMDBDef3.FLD_PAR22_RONAPRANINCO);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_TOTALPERTITO, IMDBDef3.FLD_PAR22_ROWNAMTOPETI);
    PAN_PREVIPERFLES.SetFieldPrimaryIndex(PFL_PREVIPERFLES_PARTE, IMDBDef3.FLD_PAR22_ROWNAMEPARTE);
    PAN_PREVIPERFLES.SetMasterTable(0, "PAR22");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PREVIPERFLES.Status() == 2)
    {
      int oldListQBE = PAN_PREVIPERFLES.iUseListQBE;
      PAN_PREVIPERFLES.iUseListQBE = 0;
      PAN_PREVIPERFLES.PanelCommand(Glb.PCM_SEARCH);
      PAN_PREVIPERFLES.PanelCommand(Glb.PCM_FIND);
      PAN_PREVIPERFLES.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PREVIPERFLES) PAN_PREVIPERFLES_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERFLES) PAN_PREVIPERFLES_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PREVIPERFLES) PAN_PREVIPERFLES_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PREVIPERFLES) PAN_PREVIPERFLES_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PREVIPERFLES) PAN_PREVIPERFLES_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
