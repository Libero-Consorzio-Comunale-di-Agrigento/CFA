// **********************************************
// Quadro Generale Riassuntivo
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class QuadroGeneraleRiassuntivo extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_QUADGENERIAS_AVDIAMNEDASC = 0;
  private static int GRP_QUADGENERIAS_MUTPERDEFUBI = 1;
  private static int GRP_QUADGENERIAS_QUOTONEDIURB = 2;

  private static int PFL_QUADGENERIAS_ESERCIZIO = 0;
  private static int PFL_QUADGENERIAS_PREVINIZ1 = 1;
  private static int PFL_QUADGENERIAS_PREVDEF1 = 2;
  private static int PFL_QUADGENERIAS_NEWPANELLABE = 3;
  private static int PFL_QUADGENERIAS_PREVINIZ2 = 4;
  private static int PFL_QUADGENERIAS_PREVDEF2 = 5;
  private static int PFL_QUADGENERIAS_ACCERTAMENT1 = 6;
  private static int PFL_QUADGENERIAS_RISCOSSIONI1 = 7;
  private static int PFL_QUADGENERIAS_RESATTIVI1 = 8;
  private static int PFL_QUADGENERIAS_RESCONSERVA1 = 9;
  private static int PFL_QUADGENERIAS_RISCOSSUIRE1 = 10;
  private static int PFL_QUADGENERIAS_PREVINIZ = 11;
  private static int PFL_QUADGENERIAS_PREVDEF = 12;
  private static int PFL_QUADGENERIAS_ACCERTAMENTI = 13;
  private static int PFL_QUADGENERIAS_RISCOSSIONI = 14;
  private static int PFL_QUADGENERIAS_RESATTIVI = 15;
  private static int PFL_QUADGENERIAS_RESCONSERVAT = 16;
  private static int PFL_QUADGENERIAS_RISCOSSUIRES = 17;
  private static int PFL_QUADGENERIAS_ELABORA = 18;

  private static int PPQRY_WRKQGRS1 = 0;


  IDPanel PAN_QUADGENERIAS;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI200(IMDB);
    //
    //
    Init_PQRY_WRKQGRS1(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI200(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI200, 6);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI200, "TBL_PARAMETRI200");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIADA, "ROWNAMEPIADA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIADA,3,28,6);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDADA, "ROWNAMEPDADA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDADA,3,28,6);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIDDA, "ROWNAMEPIDDA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIDDA,3,28,6);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDDDA, "ROWNAMEPDDDA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDDDA,3,28,6);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMECFDC, "ROWNAMECFDC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMECFDC,3,28,6);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMERFDC, "ROWNAMERFDC");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI200,IMDBDef3.FLD_PARAMETRI200_ROWNAMERFDC,3,28,6);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI200, 0);
  }

  private static void Init_PQRY_WRKQGRS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef12.PQRY_WRKQGRS1, 17);
    IMDB.set_TblCode(IMDBDef12.PQRY_WRKQGRS1, "PQRY_WRKQGRS1");
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_AVA_COR_INI, "AVA_COR_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_AVA_COR_INI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_AVA_COR_DEF, "AVA_COR_DEF");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_AVA_COR_DEF,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_INI, "MUTUI_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_INI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_DEF, "MUTUI_DEF");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_DEF,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_ACC, "MUTUI_ACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_ACC,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_RIS, "MUTUI_RIS");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_RIS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_CO, "MUTUI_RES_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_CON, "MUTUI_CON");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_CON,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_RE, "MUTUI_RES_RE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_RE,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_INI, "ONERI_INI");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_INI,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_DEF, "ONERI_DEF");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_DEF,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_ACC, "ONERI_ACC");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_ACC,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_RIS, "ONERI_RIS");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_RIS,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_CO, "ONERI_RES_CO");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_CO,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_CON, "ONERI_CON");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_CON,3,14,2);
    IMDB.set_FldCode(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_RE, "ONERI_RES_RE");
    IMDB.SetFldParams(IMDBDef12.PQRY_WRKQGRS1,IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_RE,3,14,2);
    IMDB.TblAddNew(IMDBDef12.PQRY_WRKQGRS1, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public QuadroGeneraleRiassuntivo(MyWebEntryPoint w, IMDBObj imdb)
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
  public QuadroGeneraleRiassuntivo()
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
    FormIdx = MyGlb.FRM_QUADGENERIAS;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "5D4AB95F-40EC-4F26-9F6B-414028C3E476";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 728;
    DesignHeight = 326;
    set_Caption(new IDVariant("Quadro Generale Riassuntivo"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 728;
    Frames[1].Height = 300;
    Frames[1].FrHidden = true;
    Frames[1].Caption = "Quadro Generale Riassuntivo";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 300;
    PAN_QUADGENERIAS = new IDPanel(w, this, 1, "PAN_QUADGENERIAS");
    Frames[1].Content = PAN_QUADGENERIAS;
    PAN_QUADGENERIAS.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_QUADGENERIAS.VS = MainFrm.VisualStyleList;
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 728-MyGlb.PAN_OFFS_X, 300-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "551928ED-CD51-4C91-A7C0-A19E0E17E900");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 320, 288, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_QUADGENERIAS.InitStatus = 2;
    PAN_QUADGENERIAS_Init();
    PAN_QUADGENERIAS_InitFields();
    PAN_QUADGENERIAS_InitQueries();
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
      PAN_QUADGENERIAS.UpdatePanel(MainFrm);
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
    return (obj instanceof QuadroGeneraleRiassuntivo);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? QuadroGeneraleRiassuntivo.class.getName() : (Glb.ClassWithPackage(QuadroGeneraleRiassuntivo.class) ? QuadroGeneraleRiassuntivo.class.getName().substring(QuadroGeneraleRiassuntivo.class.getPackage().getName().length() + 1) : QuadroGeneraleRiassuntivo.class.getName()));
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
    IDVariant v_DATAWINDOW = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      v_DATAWINDOW = (new IDVariant("d_bil_cc_genriass_stampa", IDVariant.STRING));
      // 
      // Elabora Body
      // Procedure Body
      // 
      if (new IDVariant(PAN_QUADGENERIAS.Status()).equals((new IDVariant(3)), true))
      {
        PAN_QUADGENERIAS.PanelCommand(Glb.PCM_UPDATE);
      }
      MainFrm.SetParametroStampa(IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIADA, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDADA, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIDDA, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDDDA, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMECFDC, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMERFDC, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_INI, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_DEF, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_INI, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_DEF, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_ACC, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RIS, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_CON, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_RE, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_INI, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_DEF, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_ACC, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RIS, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_CON, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_RE, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_CO, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.SetParametroStampa(IDL.Replace(IDL.ToString(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_CO, 0)), (new IDVariant(".")), (new IDVariant(","))));
      MainFrm.LanciaStampa(IMDB.Value(IMDBDef7.TBL_DATISTAMSI4P, IMDBDef7.FLD_DATISTAMSI4P_PARAPERCAPPL, 0), v_DATAWINDOW);
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivo", "Elabora", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Setaltriparametri
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int Setaltriparametri ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_PIADA = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PDADA = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PIDDA = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_PDDDA = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_CFDC = new IDVariant(0,IDVariant.DECIMAL);
    IDVariant v_RFDC = new IDVariant(0,IDVariant.DECIMAL);

    try
    {
      TransCount = 0;
      // 
      // Setaltriparametri Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  SUM(A.STN_INI_CO * DECODE(A.E_S, 'E', 1, 0) * DECODE(A.CAPITOLO, 9999999999999999, 1, 0)) as SBSICIEBESE1, ");
      SQL.append("  SUM((A.STN_INI_CO + A.VARIAZIONI_CO) * DECODE(A.E_S, 'E', 1, 0) * DECODE(A.CAPITOLO, 9999999999999999, 1, 0)) as SBSICBVCIEB1, ");
      SQL.append("  SUM(A.STN_INI_CO * DECODE(A.E_S, 'S', 1, 0) * DECODE(A.CAPITOLO, 9999999999999999, 1, 0)) as SBSICIEBESS1, ");
      SQL.append("  SUM((A.STN_INI_CO + A.VARIAZIONI_CO) * DECODE(A.E_S, 'S', 1, 0) * DECODE(A.CAPITOLO, 9999999999999999, 1, 0)) as SBSICBVCIEB2, ");
      SQL.append("  SUM((A.STN_INI_CO + A.VARIAZIONI_CO) * DECODE(A.E_S, 'E', 1, 0) * DECODE(A.CAPITOLO, 9999999999999998.0, 1, 0)) as SBSICBVCIEBE, ");
      SQL.append("  DECODE(MAX(( ");
      SQL.append("select ");
      SQL.append("  NVL(SUM(B.ORDINATIVI), 0) ");
      SQL.append("from ");
      SQL.append("  ESEACC B ");
      SQL.append("where (B.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (B.CAPITOLO = 9999999999999998.0) ");
      SQL.append(")), 0, SUM((A.STN_INI_CO + A.VARIAZIONI_CO) * DECODE(A.E_S, 'E', 1, 0) * DECODE(A.CAPITOLO, 9999999999999998.0, 1, 0)), MAX(( ");
      SQL.append("select ");
      SQL.append("  NVL(SUM(C.ORDINATIVI), 0) ");
      SQL.append("from ");
      SQL.append("  ESEACC C ");
      SQL.append("where (C.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (C.CAPITOLO = 9999999999999998.0) ");
      SQL.append("))) as IEMM0SBSICBV ");
      SQL.append("from ");
      SQL.append("  BIL A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      SQL.append("and   (A.CAPITOLO = 9999999999999999 OR A.CAPITOLO = 9999999999999998.0) ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_PIADA = QV.Get("SBSICIEBESE1", IDVariant.DECIMAL) ;
        v_PDADA = QV.Get("SBSICBVCIEB1", IDVariant.DECIMAL) ;
        v_PIDDA = QV.Get("SBSICIEBESS1", IDVariant.DECIMAL) ;
        v_PDDDA = QV.Get("SBSICBVCIEB2", IDVariant.DECIMAL) ;
        v_CFDC = QV.Get("SBSICBVCIEBE", IDVariant.DECIMAL) ;
        v_RFDC = QV.Get("IEMM0SBSICBV", IDVariant.DECIMAL) ;
      }
      QV.Close();
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIADA, 0, new IDVariant(v_PIADA));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDADA, 0, new IDVariant(v_PDADA));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPIDDA, 0, new IDVariant(v_PIDDA));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMEPDDDA, 0, new IDVariant(v_PDDDA));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMECFDC, 0, new IDVariant(v_CFDC));
      IMDB.set_Value(IMDBDef3.TBL_PARAMETRI200, IMDBDef3.FLD_PARAMETRI200_ROWNAMERFDC, 0, new IDVariant(v_RFDC));
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivo", "Setaltriparametri", _e);
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
    IDVariant v_TIPOENTE = new IDVariant(0,IDVariant.STRING);

    try
    {
      TransCount = 0;
      MainFrm.IntFormLoad(this);
      // 
      // Load Event Body
      // Procedure Body
      // 
      set_Caption(IDL.Add(Caption(), MainFrm.ESERCIZIO));
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  A.TIPO_ENTE as T99TIPOENTE ");
      SQL.append("from ");
      SQL.append("  T99 A ");
      SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_TIPOENTE = QV.Get("T99TIPOENTE", IDVariant.STRING) ;
      }
      QV.Close();
      if (v_TIPOENTE.compareTo((new IDVariant("C")), true)!=0)
      {
        PAN_QUADGENERIAS.SetFlags (Glb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE:0, Glb.OBJ_VISIBLE); 
      }
      Setaltriparametri();
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivo", "LoadEvent", _e);
    }
  }

  // **********************************************************************
  // Quadro Generale Riassuntivo After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_QUADGENERIAS_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Quadro Generale Riassuntivo After Find Event Body
      // Procedure Body
      // 
      if ((new IDVariant(PAN_QUADGENERIAS.GetNumRows())).equals((new IDVariant(0)), true))
      {
        PAN_QUADGENERIAS.PanelCommand(Glb.PCM_INSERT);
        if (PAN_QUADGENERIAS.IsNewRow())
        {
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_INI, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_DEF, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_INI, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_DEF, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_ACC, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RIS, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_CO, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_CON, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_RE, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_INI, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_DEF, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_ACC, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RIS, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_CO, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_CON, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_RE, 0, new IDVariant(IDL.ToFloat((new IDVariant(0))),IDVariant.DECIMAL));
          IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          PAN_QUADGENERIAS.UpdatePanel(MainFrm);
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivo", "QuadroGeneraleRiassuntivoAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Quadro Generale Riassuntivo On Database Error Event
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // Cancel: Se impostato a False continua ad aggiornare i record, altrimenti interrompe l'aggiornamento. - Input/Output
  // Skip: Se impostato a True non mostra la schermata di errore standard di Instant Developer. - Input/Output
  // Error Number: Numero identificativo dell'errore: in Java è l'errore nativo del database mentre in C# è l'errore ADO. - Input
  // Error Message: Messaggio di errore ritornato dal database. - Input
  // Panel Operation: E' un numero intero che identifica il tipo di operazione che ha causato l'errore. Vedi anche la lista valori PanelOperation. - Input
  // Doc: (dalla versione 6.9) E' il documento che non è stato salvato se l'evento viene lanciato da un pannello document oriented. E' pari a Null Object negli altri casi. - Input
  // Native Error Number: (dalla versione 8.0.3560) Codice di errore restituito dal database. Nel caso di applicazioni Java coincide con il parametro Error Number ma nel caso di applicazioni C# rappresenta il codice di errore nativo come ricevuto dal database e non filtrato dal driver .NET. - Input
  // **********************************************************************
  private void PAN_QUADGENERIAS_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.OnDBError(PAN_QUADGENERIAS, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
      // 
      // Quadro Generale Riassuntivo On Database Error Event Body
      // Procedure Body
      // 
      Cancel.set((new IDVariant(-1)));
      Skip.set((new IDVariant(-1)));
      MainFrm.set_AlertMessage(ErrorMessage); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("QuadroGeneraleRiassuntivo", "QuadroGeneraleRiassuntivoOnDatabaseErrorEvent", _e);
    }
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
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_QUADGENERIAS_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_QUADGENERIAS, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_QUADGENERIAS_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_QUADGENERIAS);
    // Stub
  }

  private void PAN_QUADGENERIAS_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_QUADGENERIAS_ELABORA)
    {
      this.IdxPanelActived = this.PAN_QUADGENERIAS.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      Elabora();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_QUADGENERIAS_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_QUADGENERIAS_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_INI, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_INI, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_DEF, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_AVA_COR_DEF, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_INI, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_INI, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_DEF, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_DEF, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_ACC, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_ACC, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RIS, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RIS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_CO, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_CO, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_CON, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_CON, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_RE, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_MUTUI_RES_RE, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_INI, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_INI, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_DEF, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_DEF, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_ACC, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_ACC, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RIS, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RIS, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_CO, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_CO, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_CON, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_CON, 0, (new IDVariant(0)));
      }
      if (IDL.IsNull(IMDB.Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_RE, 0)))
      {
        IMDB.set_Value(IMDBDef12.PQRY_WRKQGRS1, IMDBDef12.PQSL_WRKQGRS1_ONERI_RES_RE, 0, (new IDVariant(0)));
      }
      if (Cancel.isFalse())
      {
        PAN_QUADGENERIAS_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_QUADGENERIAS_Init()
  {

    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_GROUP, 3);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, "F7FA5D76-8043-4776-9313-055B91209CBF");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, "Avanzo di Amm.ne destinato a Spese Correnti");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, MyGlb.VIS_GROUPSTYLE);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, MyGlb.PANEL_LIST, 0, -9999, 80, 16, 0, 0);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, MyGlb.PANEL_FORM, 4, 7, 352, 49, 0, 0);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, 0, 258);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, 1, 13);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, 0, 4);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, 1, 4);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_AVDIAMNEDASC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, "4C319345-F954-43BF-9E94-15C0212EF1D0");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, "Mutui per Debiti fuori Bilancio");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, MyGlb.VIS_GROUPSTYLE);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, MyGlb.PANEL_LIST, 0, -9999, 16, 16, 0, 0);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, MyGlb.PANEL_FORM, 4, 63, 704, 73, 0, 0);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, 0, 165);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, 1, 13);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, 0, 4);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, 1, 4);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_MUTPERDEFUBI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, "2764B5EF-EFA6-47B4-BA91-6377E7C2B0B4");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, "Quote Oneri di Urbanizzazione");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, MyGlb.VIS_GROUPSTYLE);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, MyGlb.PANEL_LIST, 0, -9999, 16, 16, 0, 0);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, MyGlb.PANEL_FORM, 4, 143, 704, 73, 0, 0);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, 0, 169);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, 1, 13);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, 0, 4);
    PAN_QUADGENERIAS.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, 1, 4);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_GROUP, GRP_QUADGENERIAS_QUOTONEDIURB, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_FIELD, 19);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "272E90A7-BB0F-42B5-8683-07F5678C8A06");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "ESERCIZIO");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, "B5724FC5-67DA-4A4C-8AB7-24BF03C82B32");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, "Prev. Iniz.");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, "659C248A-EB9F-4A68-9B93-E6F69EC3E049");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, "Prev. Def.");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, "0C97FD0E-8CE3-41DE-A3DD-9CAF94D00C17");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, MyGlb.VIS_SFONEBORDTRA);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, "7C86D095-890F-4130-A41A-A7353652925B");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, "Prev. Iniz.");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, "C19329C1-53E5-4305-98E1-4AFCEC737902");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, "Prev.Def.");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, "B8BBE190-F72C-4C9F-A735-9E2444F2F3A1");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, "Accertamenti");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, "99759DF4-ECFC-4A30-95A3-6CF96EA8E8C6");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, "Riscossioni");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, "42B2C5F9-4E0A-4D52-90EB-6589FC84848E");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, "Res. Attivi");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, "F859C255-62AB-4AB7-9A52-14EBCD17D5B3");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, "Res. Conservati");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, "F5170021-7CBD-4EF9-89F0-969914FA3E8E");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, "Riscos. sui Res.");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, "45D8BF9B-DD26-44F3-AACD-AD5F85A5159C");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, "Prev.Iniz");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, "21776366-2A52-49DF-A4D5-89A832DDD183");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, "Prev.Def.");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, "9409E304-5D77-4D35-AF38-A4463A26126D");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, "Accertamenti");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, "95546781-8F5B-4151-AE7E-3DBD5EFB95B7");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, "Riscossioni");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, "4FBBE689-8466-46C7-AAED-9D92E13374D2");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, "Res. Attivi");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, "EF82ADEA-5541-452A-A896-FCF73F2F4FBD");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, "Res. Conservati");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, "A4EB1ED7-A231-4D8A-8D03-725F9EC1D176");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, "Riscos. sui Res.");
    PAN_QUADGENERIAS.set_ToolTip(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, "");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.VIS_NORFIECF4IMP);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_VERTHDRLIST | MyGlb.FLD_VERTHDRFORM | MyGlb.FLD_ISOPT, -1);
    PAN_QUADGENERIAS.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, "77229E0F-CBDE-4B67-86A5-97C1689C0186");
    PAN_QUADGENERIAS.set_Header(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, "Elabora");
    PAN_QUADGENERIAS.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.VIS_STATICBUTTON);
    PAN_QUADGENERIAS.SetImage(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, 0, "button1.gif", false);
    PAN_QUADGENERIAS.SetFlags(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_QUADGENERIAS_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, 64);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_LIST, "ESERC.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 108, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, 64);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ESERCIZIO, MyGlb.PANEL_FORM, "ESERC.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ESERCIZIO, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ESERCIZIO, PPQRY_WRKQGRS1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_LIST, 72);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_LIST, "Prev. Iniz.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_FORM, 20, 32, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_FORM, 72);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ1, MyGlb.PANEL_FORM, "Prev. Iniz.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_PREVINIZ1, -1, GRP_QUADGENERIAS_AVDIAMNEDASC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_PREVINIZ1, PPQRY_WRKQGRS1, "A.AVA_COR_INI", "AVA_COR_INI", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_LIST, 76);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_LIST, "Prev. Def.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_FORM, 188, 32, 164, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_FORM, 80);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF1, MyGlb.PANEL_FORM, "Prev. Def.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_PREVDEF1, -1, GRP_QUADGENERIAS_AVDIAMNEDASC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_PREVDEF1, PPQRY_WRKQGRS1, "A.AVA_COR_DEF", "AVA_COR_DEF", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, MyGlb.PANEL_LIST, 4, 16, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, MyGlb.PANEL_FORM, 8, 36, 12, 12, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_NEWPANELLABE, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_NEWPANELLABE, -1, GRP_QUADGENERIAS_AVDIAMNEDASC);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_NEWPANELLABE, -1, "", "NEWPANELLABE", 0, 0, 0, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_LIST, 0, 36, 16, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_LIST, "P. I.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_FORM, 8, 88, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ2, MyGlb.PANEL_FORM, "Prev. Iniz.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_PREVINIZ2, -1, GRP_QUADGENERIAS_MUTPERDEFUBI);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_PREVINIZ2, PPQRY_WRKQGRS1, "A.MUTUI_INI", "MUTUI_INI", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_LIST, 0, 36, 12, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_LIST, "P. D.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_FORM, 108, 88, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF2, MyGlb.PANEL_FORM, "Prev.Def.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_PREVDEF2, -1, GRP_QUADGENERIAS_MUTPERDEFUBI);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_PREVDEF2, PPQRY_WRKQGRS1, "A.MUTUI_DEF", "MUTUI_DEF", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_LIST, 0, 36, 12, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_LIST, "A.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_FORM, 208, 88, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENT1, MyGlb.PANEL_FORM, "Accertamenti");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ACCERTAMENT1, -1, GRP_QUADGENERIAS_MUTPERDEFUBI);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ACCERTAMENT1, PPQRY_WRKQGRS1, "A.MUTUI_ACC", "MUTUI_ACC", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_LIST, 0, 36, 16, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_LIST, "R.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_FORM, 308, 88, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI1, MyGlb.PANEL_FORM, "Riscossioni");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RISCOSSIONI1, -1, GRP_QUADGENERIAS_MUTPERDEFUBI);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RISCOSSIONI1, PPQRY_WRKQGRS1, "A.MUTUI_RIS", "MUTUI_RIS", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_LIST, "R. A.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_FORM, 408, 88, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI1, MyGlb.PANEL_FORM, "Res. Attivi");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RESATTIVI1, -1, GRP_QUADGENERIAS_MUTPERDEFUBI);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RESATTIVI1, PPQRY_WRKQGRS1, "A.MUTUI_RES_CO", "MUTUI_RES_CO", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_LIST, "R. C.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_FORM, 508, 88, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVA1, MyGlb.PANEL_FORM, "Res. Conservati");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RESCONSERVA1, -1, GRP_QUADGENERIAS_MUTPERDEFUBI);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RESCONSERVA1, PPQRY_WRKQGRS1, "A.MUTUI_CON", "MUTUI_CON", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_LIST, "R. s. R.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_FORM, 608, 88, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRE1, MyGlb.PANEL_FORM, "Riscos. sui Res.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RISCOSSUIRE1, -1, GRP_QUADGENERIAS_MUTPERDEFUBI);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RISCOSSUIRE1, PPQRY_WRKQGRS1, "A.MUTUI_RES_RE", "MUTUI_RES_RE", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_LIST, 0, 36, 16, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_LIST, "P. I.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_FORM, 8, 168, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVINIZ, MyGlb.PANEL_FORM, "Prev.Iniz");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_PREVINIZ, -1, GRP_QUADGENERIAS_QUOTONEDIURB);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_PREVINIZ, PPQRY_WRKQGRS1, "A.ONERI_INI", "ONERI_INI", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_LIST, 0, 36, 12, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_LIST, "P. D.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_FORM, 108, 168, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_PREVDEF, MyGlb.PANEL_FORM, "Prev.Def.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_PREVDEF, -1, GRP_QUADGENERIAS_QUOTONEDIURB);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_PREVDEF, PPQRY_WRKQGRS1, "A.ONERI_DEF", "ONERI_DEF", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_LIST, 0, 36, 12, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_LIST, "A.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_FORM, 208, 168, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ACCERTAMENTI, MyGlb.PANEL_FORM, "Accertamenti");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ACCERTAMENTI, -1, GRP_QUADGENERIAS_QUOTONEDIURB);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ACCERTAMENTI, PPQRY_WRKQGRS1, "A.ONERI_ACC", "ONERI_ACC", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_LIST, 0, 36, 16, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_LIST, "R.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_FORM, 308, 168, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSIONI, MyGlb.PANEL_FORM, "Riscossioni");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RISCOSSIONI, -1, GRP_QUADGENERIAS_QUOTONEDIURB);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RISCOSSIONI, PPQRY_WRKQGRS1, "A.ONERI_RIS", "ONERI_RIS", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_LIST, "R. A.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_FORM, 408, 168, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESATTIVI, MyGlb.PANEL_FORM, "Res. Attivi");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RESATTIVI, -1, GRP_QUADGENERIAS_QUOTONEDIURB);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RESATTIVI, PPQRY_WRKQGRS1, "A.ONERI_RES_CO", "ONERI_RES_CO", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_LIST, "R. C.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_FORM, 508, 168, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RESCONSERVAT, MyGlb.PANEL_FORM, "Res. Conservati");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RESCONSERVAT, -1, GRP_QUADGENERIAS_QUOTONEDIURB);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RESCONSERVAT, PPQRY_WRKQGRS1, "A.ONERI_CON", "ONERI_CON", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_LIST, 0, 36, 8, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_LIST, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_LIST, "R. s. R.");
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_FORM, 608, 168, 96, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_FORM, 20);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_RISCOSSUIRES, MyGlb.PANEL_FORM, "Riscos. sui Res.");
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_RISCOSSUIRES, -1, GRP_QUADGENERIAS_QUOTONEDIURB);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_RISCOSSUIRES, PPQRY_WRKQGRS1, "A.ONERI_RES_RE", "ONERI_RES_RE", 3, 14, 2, -13997);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_LIST, 488, 240, 96, 24, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_LIST, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_LIST, 1);
    PAN_QUADGENERIAS.SetRect(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_FORM, 624, 240, 80, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_QUADGENERIAS.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_FORM, 0);
    PAN_QUADGENERIAS.SetNumRow(MyGlb.OBJ_FIELD, PFL_QUADGENERIAS_ELABORA, MyGlb.PANEL_FORM, 1);
    PAN_QUADGENERIAS.SetFieldPage(PFL_QUADGENERIAS_ELABORA, -1, -1);
    PAN_QUADGENERIAS.SetFieldPanel(PFL_QUADGENERIAS_ELABORA, -1, "", "ELABORA", 0, 0, 0, -13997);
  }

  private void PAN_QUADGENERIAS_InitQueries()
  {
    StringBuffer SQL;

    PAN_QUADGENERIAS.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_QUADGENERIAS.SetIMDB(IMDB, "PQRY_WRKQGRS1", true);
    PAN_QUADGENERIAS.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.AVA_COR_INI as AVA_COR_INI, ");
    SQL.append("  A.AVA_COR_DEF as AVA_COR_DEF, ");
    SQL.append("  A.MUTUI_INI as MUTUI_INI, ");
    SQL.append("  A.MUTUI_DEF as MUTUI_DEF, ");
    SQL.append("  A.MUTUI_ACC as MUTUI_ACC, ");
    SQL.append("  A.MUTUI_RIS as MUTUI_RIS, ");
    SQL.append("  A.MUTUI_RES_CO as MUTUI_RES_CO, ");
    SQL.append("  A.MUTUI_CON as MUTUI_CON, ");
    SQL.append("  A.MUTUI_RES_RE as MUTUI_RES_RE, ");
    SQL.append("  A.ONERI_INI as ONERI_INI, ");
    SQL.append("  A.ONERI_DEF as ONERI_DEF, ");
    SQL.append("  A.ONERI_ACC as ONERI_ACC, ");
    SQL.append("  A.ONERI_RIS as ONERI_RIS, ");
    SQL.append("  A.ONERI_RES_CO as ONERI_RES_CO, ");
    SQL.append("  A.ONERI_CON as ONERI_CON, ");
    SQL.append("  A.ONERI_RES_RE as ONERI_RES_RE ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_WRKQGRS1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  WRK_QGRS A ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_WRKQGRS1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    PAN_QUADGENERIAS.SetQuery(PPQRY_WRKQGRS1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_WRKQGRS1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_WRKQGRS1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_QUADGENERIAS.SetQuery(PPQRY_WRKQGRS1, 5, SQL, -1, "");
    PAN_QUADGENERIAS.SetQueryDB(PPQRY_WRKQGRS1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_QUADGENERIAS.SetMasterTable(0, "WRK_QGRS");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_QUADGENERIAS.Status() == 2)
    {
      int oldListQBE = PAN_QUADGENERIAS.iUseListQBE;
      PAN_QUADGENERIAS.iUseListQBE = 0;
      PAN_QUADGENERIAS.PanelCommand(Glb.PCM_SEARCH);
      PAN_QUADGENERIAS.PanelCommand(Glb.PCM_FIND);
      PAN_QUADGENERIAS.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_QUADGENERIAS) PAN_QUADGENERIAS_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
