// **********************************************
// Finanziamenti Voci Bilancio
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class FinanziamentiVociBilancio extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int GRP_FINANZIAMENT_TOTALE = 0;
  private static int GRP_FINANZIAMENT_PURO = 1;
  private static int GRP_FINANZIAMENT_REISCDAESIGI = 2;
  private static int GRP_FINANZIAMENT_REISCDASTANZ = 3;

  private static int PFL_FINANZIAMENT_CODICEFINANZ = 0;
  private static int PFL_FINANZIAMENT_FINANZIAMENT = 1;
  private static int PFL_FINANZIAMENT_CODICEOPERA = 2;
  private static int PFL_FINANZIAMENT_OPERA = 3;
  private static int PFL_FINANZIAMENT_PREVISINIZIA = 4;
  private static int PFL_FINANZIAMENT_VARIAZIONI = 5;
  private static int PFL_FINANZIAMENT_PREVISATTUAL = 6;
  private static int PFL_FINANZIAMENT_ACCERTIMPEGN = 7;
  private static int PFL_FINANZIAMENT_DISPONIBILIT = 8;
  private static int PFL_FINANZIAMENT_PREVISIOPURO = 9;
  private static int PFL_FINANZIAMENT_VARIAZIOPURO = 10;
  private static int PFL_FINANZIAMENT_PREVATTUPURO = 11;
  private static int PFL_FINANZIAMENT_ACCEIMPEPURO = 12;
  private static int PFL_FINANZIAMENT_DISPONIBPURO = 13;
  private static int PFL_FINANZIAMENT_PREVISIOESIG = 14;
  private static int PFL_FINANZIAMENT_VARIAZIOESIG = 15;
  private static int PFL_FINANZIAMENT_PREVATTUESIG = 16;
  private static int PFL_FINANZIAMENT_ACCEIMPEESIG = 17;
  private static int PFL_FINANZIAMENT_DISPONIBESIG = 18;
  private static int PFL_FINANZIAMENT_PREVISISTANZ = 19;
  private static int PFL_FINANZIAMENT_VARIAZISTANZ = 20;
  private static int PFL_FINANZIAMENT_PREVATTUSTAN = 21;
  private static int PFL_FINANZIAMENT_ACCEIMPESTAN = 22;
  private static int PFL_FINANZIAMENT_DISPONISTANZ = 23;
  private static int PFL_FINANZIAMENT_LABELFINANZI = 24;
  private static int PFL_FINANZIAMENT_LABELOPERA = 25;
  private static int PFL_FINANZIAMENT_LABELTOTALI = 26;
  private static int PFL_FINANZIAMENT_LABTOTPREINI = 27;
  private static int PFL_FINANZIAMENT_LABETOTAVARI = 28;
  private static int PFL_FINANZIAMENT_LABTOTPREATT = 29;
  private static int PFL_FINANZIAMENT_LABTOTACCIMP = 30;
  private static int PFL_FINANZIAMENT_LABETOTADISP = 31;
  private static int PFL_FINANZIAMENT_LABTOTPRINPU = 32;
  private static int PFL_FINANZIAMENT_LABTOTVARPUR = 33;
  private static int PFL_FINANZIAMENT_LABTOTPRATPU = 34;
  private static int PFL_FINANZIAMENT_LABTOTACIMPU = 35;
  private static int PFL_FINANZIAMENT_LABTOTDISPUR = 36;
  private static int PFL_FINANZIAMENT_LABTOTPRINES = 37;
  private static int PFL_FINANZIAMENT_LABTOTVARESI = 38;
  private static int PFL_FINANZIAMENT_LABTOTPRATES = 39;
  private static int PFL_FINANZIAMENT_LABTOTACIMES = 40;
  private static int PFL_FINANZIAMENT_LABTOTDISESI = 41;
  private static int PFL_FINANZIAMENT_LABTOTPRINST = 42;
  private static int PFL_FINANZIAMENT_LABTOTVARSTA = 43;
  private static int PFL_FINANZIAMENT_LABTOTPRATST = 44;
  private static int PFL_FINANZIAMENT_LABTOTACIMST = 45;
  private static int PFL_FINANZIAMENT_LABTOTDISSTA = 46;

  private static int PPQRY_FINANZIAMEN6 = 0;


  IDPanel PAN_FINANZIAMENT;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI63(IMDB);
    //
    //
    Init_PQRY_FINANZIAMEN6(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI63(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef1.TBL_PARAMETRI63, 8);
    IMDB.set_TblCode(IMDBDef1.TBL_PARAMETRI63, "TBL_PARAMETRI63");
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMESERCIZ, "PARAMESERCIZ");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMESERCIZ,1,4,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMES, "PARAMES");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMES,5,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMCAPITOL, "PARAMCAPITOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMCAPITOL,3,16,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMARTICOL, "PARAMARTICOL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMARTICOL,1,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMIMPEGNA, "PARAMIMPEGNA");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMIMPEGNA,5,2,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAGESTECON, "PARAGESTECON");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAGESTECON,1,1,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARPROUNIORG, "PARPROUNIORG");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARPROUNIORG,1,8,0);
    IMDB.set_FldCode(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMDATADAL, "PARAMDATADAL");
    IMDB.SetFldParams(IMDBDef1.TBL_PARAMETRI63,IMDBDef1.FLD_PARAMETRI63_PARAMDATADAL,6,19,0);
    IMDB.TblAddNew(IMDBDef1.TBL_PARAMETRI63, 0);
  }

  private static void Init_PQRY_FINANZIAMEN6(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef8.PQRY_FINANZIAMEN6, 24);
    IMDB.set_TblCode(IMDBDef8.PQRY_FINANZIAMEN6, "PQRY_FINANZIAMEN6");
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINANZFINANZ, "FINANZFINANZ");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINANZFINANZ,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINANZIOPERA, "FINANZIOPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINANZIOPERA,5,200,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINANZIAMENTO, "FINANZIAMENTO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINANZIAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_OPERA, "OPERA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_OPERA,1,5,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_PREVISIONE,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_VARIAZIONI, "VARIAZIONI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_VARIAZIONI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_PREVISIONE_ATT, "PREVISIONE_ATT");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_PREVISIONE_ATT,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_ACC_IMP_COMP, "ACC_IMP_COMP");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_ACC_IMP_COMP,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_DISPONIBILITA, "DISPONIBILITA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_DISPONIBILITA,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAPREVESIG, "FINAPREVESIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAPREVESIG,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAVARIESIG, "FINAVARIESIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAVARIESIG,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINPREATTESI, "FINPREATTESI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINPREATTESI,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINACCIMPESI, "FINACCIMPESI");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINACCIMPESI,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINADISPESIG, "FINADISPESIG");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINADISPESIG,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAPREVSTAN, "FINAPREVSTAN");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAPREVSTAN,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAVARISTAN, "FINAVARISTAN");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAVARISTAN,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINPREATTSTA, "FINPREATTSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINPREATTSTA,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINACCIMPSTA, "FINACCIMPSTA");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINACCIMPSTA,2,15,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINADISPSTAN, "FINADISPSTAN");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINADISPSTAN,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAPREVPURO, "FINAPREVPURO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAPREVPURO,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAVARIPURO, "FINAVARIPURO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINAVARIPURO,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINPREATTPUR, "FINPREATTPUR");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINPREATTPUR,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINACCIMPPUR, "FINACCIMPPUR");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINACCIMPPUR,2,19,0);
    IMDB.set_FldCode(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINADISPPURO, "FINADISPPURO");
    IMDB.SetFldParams(IMDBDef8.PQRY_FINANZIAMEN6,IMDBDef8.PQSL_FINANZIAMEN6_FINADISPPURO,2,19,0);
    IMDB.TblAddNew(IMDBDef8.PQRY_FINANZIAMEN6, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public FinanziamentiVociBilancio(MyWebEntryPoint w, IMDBObj imdb)
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
  public FinanziamentiVociBilancio()
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
    FormIdx = MyGlb.FRM_FINAVOCIBILA;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "B2FDC90E-5F35-445A-A0CC-67DDD0C6F8FE";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 1092;
    DesignHeight = 430;
    set_Caption(new IDVariant("Finanziamenti Voci Bilancio"));
    //
    Frames = new AFrame[2];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 1092;
    Frames[1].Height = 404;
    Frames[1].Caption = "Finanziamenti";
    Frames[1].Parent = this;
    Frames[1].FixedHeight = 404;
    PAN_FINANZIAMENT = new IDPanel(w, this, 1, "PAN_FINANZIAMENT");
    Frames[1].Content = PAN_FINANZIAMENT;
    PAN_FINANZIAMENT.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_FINANZIAMENT.VS = MainFrm.VisualStyleList;
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 1092-MyGlb.PAN_OFFS_X, 404-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "7BB8F853-293B-489E-9EAD-E4302DB48159");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 2560, 236, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_FINANZIAMENT.InitStatus = 2;
    PAN_FINANZIAMENT_Init();
    PAN_FINANZIAMENT_InitFields();
    PAN_FINANZIAMENT_InitQueries();
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
      PAN_FINANZIAMENT.UpdatePanel(MainFrm);
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
    return (obj instanceof FinanziamentiVociBilancio);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? FinanziamentiVociBilancio.class.getName() : (Glb.ClassWithPackage(FinanziamentiVociBilancio.class) ? FinanziamentiVociBilancio.class.getName().substring(FinanziamentiVociBilancio.class.getPackage().getName().length() + 1) : FinanziamentiVociBilancio.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Finanziamenti After Find Event
  // Evento notificato dal pannello dopo aver recuperato
  // i dati della master query
  // Command: Questo argomento è stato introdotto a partire dalla versione 6.8.3060 e rappresenta il comando di pannello che ha causato la notifica dell'evento. Può valere Find, Insert, o Refresh. Vedi anche la lista valori PanelCommands per maggiori informazioni - Input
  // **********************************************************************
  private void PAN_FINANZIAMENT_AfterFind(IDVariant Command)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Finanziamenti After Find Event Body
      // Procedure Body
      // 
      if (IMDB.Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMES, 0).equals((new IDVariant("E")), true))
      {
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCERTIMPEGN, (new IDVariant("Accertato")).stringValue());
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCEIMPEPURO, (new IDVariant("Accertato")).stringValue());
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCEIMPEESIG, (new IDVariant("Accertato")).stringValue());
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCEIMPESTAN, (new IDVariant("Accertato")).stringValue());
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, ((new IDVariant(0)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      else
      {
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCERTIMPEGN, (new IDVariant("Impegnato")).stringValue());
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCEIMPEPURO, (new IDVariant("Impegnato")).stringValue());
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCEIMPEESIG, (new IDVariant("Impegnato")).stringValue());
        PAN_FINANZIAMENT.set_Header(Glb.OBJ_FIELD,PFL_FINANZIAMENT_ACCEIMPESTAN, (new IDVariant("Impegnato")).stringValue());
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
        PAN_FINANZIAMENT.SetFlags (Glb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_VISIBLE : 0, Glb.OBJ_VISIBLE); 
      }
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPREINI, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVISINIZIA)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABETOTAVARI, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_VARIAZIONI)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPREATT, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVISATTUAL)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTACCIMP, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_ACCERTIMPEGN)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABETOTADISP, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_DISPONIBILIT)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPRINPU, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVISIOPURO)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTVARPUR, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_VARIAZIOPURO)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPRATPU, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVATTUPURO)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTACIMPU, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_ACCEIMPEPURO)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTDISPUR, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_DISPONIBPURO)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPRINES, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVISIOESIG)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTVARESI, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_VARIAZIOESIG)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPRATES, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVATTUESIG)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTACIMES, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_ACCEIMPEESIG)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTDISESI, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_DISPONIBESIG)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPRINST, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVISISTANZ)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTVARSTA, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_VARIAZISTANZ)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTPRATST, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_PREVATTUSTAN)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTACIMST, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_ACCEIMPESTAN)).stringValue());
      PAN_FINANZIAMENT.set_FieldText(PFL_FINANZIAMENT_LABTOTDISSTA, IDL.ToString(PAN_FINANZIAMENT.GetFieldSum(PFL_FINANZIAMENT_DISPONISTANZ)).stringValue());
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiVociBilancio", "FinanziamentiAfterFindEvent", _e);
    }
  }

  // **********************************************************************
  // Finanziamenti On Dynamic Properties Event
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_FINANZIAMENT_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_FINANZIAMENT);
      // 
      // Finanziamenti On Dynamic Properties Event Body
      // Procedure Body
      // 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_FINANZIAMENT,IMDB.Value(IMDBDef8.PQRY_FINANZIAMEN6, IMDBDef8.PQSL_FINANZIAMEN6_FINANZFINANZ, 0).stringValue()); 
      PAN_FINANZIAMENT.set_ToolTip(Glb.OBJ_FIELD,PFL_FINANZIAMENT_OPERA,IMDB.Value(IMDBDef8.PQRY_FINANZIAMEN6, IMDBDef8.PQSL_FINANZIAMEN6_FINANZIOPERA, 0).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiVociBilancio", "FinanziamentiOnDynamicPropertiesEvent", _e);
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
      set_Caption(IDL.Add(IDL.Add(IDL.Add(IDL.Add((new IDVariant("Finanziamenti")), (new IDVariant(" - "))), (new IDVariant("Esercizio"))), (new IDVariant(" "))), IDL.ToString(IDL.NullValue(IMDB.Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMESERCIZ, 0),IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0)))));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("FinanziamentiVociBilancio", "LoadEvent", _e);
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
      MainFrm.ErrObj.ProcError ("FinanziamentiVociBilancio", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMESERCIZ, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMES, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMCAPITOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMARTICOL, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMIMPEGNA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAGESTECON, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARPROUNIORG, 0, new IDVariant());
    IMDB.set_Value(IMDBDef1.TBL_PARAMETRI63, IMDBDef1.FLD_PARAMETRI63_PARAMDATADAL, 0, new IDVariant());
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
  private void PAN_FINANZIAMENT_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_FINANZIAMENT, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_FINANZIAMENT_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_FINANZIAMENT, Cancel);
    // Stub
  }

  private void PAN_FINANZIAMENT_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
  }

  private void PAN_FINANZIAMENT_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_FINANZIAMENT_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_FINANZIAMENT_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_FINANZIAMENT_Init()
  {

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_GROUP, 4);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, "A32376DC-EAF6-4A96-AE05-19D6660CDF71");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, "Totale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, MyGlb.PANEL_LIST, 480, -9999, 520, 16, 0, 0);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, MyGlb.PANEL_FORM, 0, 351, 188, 145, 0, 0);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, 0, 36);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, 1, 13);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, 0, 4);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, 1, 4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_TOTALE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, "7B2CF29C-4481-4480-985B-1BAC2E76035D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, "Puro");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, MyGlb.PANEL_LIST, 1000, -9999, 520, 16, 0, 0);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, MyGlb.PANEL_FORM, 0, 759, 276, 145, 0, 0);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, 0, 26);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, 1, 13);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, 0, 4);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, 1, 4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_PURO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, "27D7AF2B-F3F8-468B-AAD8-15ED13CFB8BA");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, "Reiscrizione da Esigibilità");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, MyGlb.PANEL_LIST, 1520, -9999, 520, 16, 0, 0);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, MyGlb.PANEL_FORM, 0, 519, 256, 145, 0, 0);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, 0, 141);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, 1, 13);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, 0, 4);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, 1, 4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDAESIGI, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, "A6CCCF26-8FE7-4922-A6F3-32C32B426EAE");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, "Reiscrizione da Stanziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, MyGlb.VIS_DEFAPANESTYL);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, MyGlb.PANEL_LIST, 2040, -9999, 520, 16, 0, 0);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, MyGlb.PANEL_FORM, 0, 639, 264, 145, 0, 0);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, 0, 167);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, 1, 13);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, 0, 4);
    PAN_FINANZIAMENT.SetHeaderPos(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, 1, 4);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_GROUP, GRP_FINANZIAMENT_REISCDASTANZ, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE, -1);
    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_FIELD, 47);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, "2E70070F-10F3-412A-8B68-AC0AA34BD96A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, "CODICE FINANZIAMENTO");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, "A5E4C08E-6C87-4478-BE4E-E893B771F4F0");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, "Finanziamento");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, "D1E30CAD-6B0F-4782-BBCC-7850C0276866");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, "CODICE OPERA");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, "E49D8BD3-BEB5-433B-847D-717885D6FD0E");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, "Opera");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.VIS_NORMALFIELDS);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISDESCR, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, "8775AC20-C3EF-49B3-84AA-A105616F4D06");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, "Prev. Iniziale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, "DAE836AA-E1AA-45C6-9C50-2B2DE8A809AD");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, "Variazioni");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, "3EEE2991-8C29-4F93-8678-491E9E857C93");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, "Previsione Attuale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, "C17D3351-54FB-432B-B082-A110EF6C89BD");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, "Accertato Impegnato");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, "A78CF392-56B9-4CD0-9A7D-411B7160598D");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, "Disponibilità");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, "A0E87F49-198A-4F67-AF53-72F947DDE3DF");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, "Prev. Iniziale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, "73BC6D72-9381-4D98-A95F-096F40BC9D34");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, "Variazioni");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, "425916CC-E3FB-423F-A3DD-610383C71C2E");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, "Prev. Attuale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, "FD8A6056-491C-40D0-B77D-8C2991B4FEB8");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, "Accertato Impegnato");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, "57F7BD9C-48CD-4295-9702-5EEF374F2E10");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, "Disponibilità");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, "256FD63D-DCB1-4827-AA05-8582B3928980");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, "Prev. Iniziale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, "1F3FC7B4-D094-4DD8-BC93-B612A4C37AAD");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, "Variazioni");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, "7F9C4FD3-58EE-467E-BAA9-DD30FE406FE3");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, "Prev. Attuale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, "46D3D52A-13A1-42B0-A186-025054C20465");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, "Accertato Impegnato");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, "F41A30B9-AEBD-4445-9F8B-EF24B9BB6670");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, "Disponibilità");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, "709292BD-1D23-4D16-9BA7-D350DFD9C1FA");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, "Prev. Iniziale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, "B8F4DEAA-C5FF-4A5B-9CD5-497E74D85674");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, "Variazioni");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, "4960F151-8AC7-4D77-B4A7-17A6E0BE72E5");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, "Prev. Attuale");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, "4E25E6FF-1E2F-4C48-9F89-3CCE63046145");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, "Accertato Impegnato");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, "F865EFC9-B0CE-4158-BA3E-D5D896006B64");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, "Disponibilità");
    PAN_FINANZIAMENT.set_ToolTip(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.VIS_NORFIECF4IMP);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, "90F4E41C-4D88-4031-9B00-885F111EFA96");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, "Finanziamento");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.VIS_LABEVISUSTYL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, "8E8FBD8B-5AE8-48FA-8D8E-8E41DBEA63B6");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, "Opera");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, MyGlb.VIS_LABEVISUSTYL);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, "212D32CF-500F-48E9-B535-0BFE6416AE97");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, "Totali");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, MyGlb.VIS_VUOTONORMALE);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, "3BC621F6-5A41-41F8-A7D9-84B730244CEE");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, "E8F3076A-0EE2-4134-B7F9-A53ADBC1629C");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, "EA6E13A9-B087-488B-81E3-030732B1E004");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, "C4271549-1117-47D9-9962-6DD69C812A28");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, "934EC5A7-237D-491B-A123-CA8D0B6F26E1");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, "42A022F9-4CD3-4582-B2E0-BF7EE1531DD2");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, "A8B246F8-43EE-4C6A-B93D-637A97369402");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, "67216FCC-F7E3-4839-805C-AC1B6CAE7926");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, "FAA96A2C-C2DB-417F-A3AF-CA1F5EB10183");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, "BBFBE1DD-4C4F-4494-8CC7-F5CA9736755A");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, "C1C5D36E-1B83-4EBD-A506-2F9CC6858684");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, "9E34A05E-B6E2-4F45-B46D-EEF210C8F6D8");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, "720592F6-2ABE-43DB-A8CA-E89278A9F007");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, "E711B5A2-150F-4BEC-8534-2B791EFC2342");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, "85FB509B-4648-4085-AF49-29F45F92B700");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, "66422043-A09F-475C-8FA1-FC8ACBE1987B");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, "911F578D-6C5B-43F9-85D4-1603E2D0572B");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, "A7319865-223B-4DF3-9277-F09CB5393BAD");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, "FC4B2B29-BEEA-4F28-8DEA-BEC175CA6451");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_FINANZIAMENT.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, "2A5AEF0D-632A-4FCC-B7CD-F1ECB8E8E888");
    PAN_FINANZIAMENT.set_Header(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, "");
    PAN_FINANZIAMENT.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, MyGlb.VIS_CAMPTOTADISA);
    PAN_FINANZIAMENT.SetFlags(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_FINANZIAMENT_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_LIST, 0, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_LIST, "COD. FINAN.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_FORM, 4, 496, 136, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_FORM, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEFINANZ, MyGlb.PANEL_FORM, "COD. FINANZ.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CODICEFINANZ, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CODICEFINANZ, PPQRY_FINANZIAMEN6, "C.FINANZIAMENTO", "FINANZIAMENTO", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, 48, 36, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_MOVE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, 128);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_LIST, "Finanziamento");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, 4, 28, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, 128);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_FINANZIAMENT, MyGlb.PANEL_FORM, "Finanziamento");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_FINANZIAMENT, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_FINANZIAMENT, PPQRY_FINANZIAMEN6, "A.DESCRIZIONE", "FINANZFINANZ", 5, 200, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_LIST, 240, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_LIST, 44);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_LIST, "CODICE OPERA");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_FORM, 4, 520, 88, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_FORM, 44);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_CODICEOPERA, MyGlb.PANEL_FORM, "CD. O.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_CODICEOPERA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_CODICEOPERA, PPQRY_FINANZIAMEN6, "C.OPERA", "OPERA", 1, 5, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_LIST, 288, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_LIST, 76);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_LIST, "Opera");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_FORM, 4, 292, 528, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_FORM, 76);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_OPERA, MyGlb.PANEL_FORM, "Opera");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_OPERA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_OPERA, PPQRY_FINANZIAMEN6, "B.DESCRIZIONE", "FINANZIOPERA", 5, 200, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_LIST, 480, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_LIST, "Prev. Iniziale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_FORM, 4, 376, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISINIZIA, MyGlb.PANEL_FORM, "Prv. Iniz.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVISINIZIA, -1, GRP_FINANZIAMENT_TOTALE);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVISINIZIA, PPQRY_FINANZIAMEN6, "C.PREVISIONE", "PREVISIONE", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_LIST, 584, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_LIST, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_LIST, "Variazioni");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_FORM, 4, 400, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_FORM, 68);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIONI, MyGlb.PANEL_FORM, "Variazioni");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_VARIAZIONI, -1, GRP_FINANZIAMENT_TOTALE);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_VARIAZIONI, PPQRY_FINANZIAMEN6, "C.VARIAZIONI", "VARIAZIONI", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_LIST, 688, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_LIST, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_LIST, "Previs. Attuale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_FORM, 4, 448, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_FORM, 92);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISATTUAL, MyGlb.PANEL_FORM, "Previs. Attuale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVISATTUAL, -1, GRP_FINANZIAMENT_TOTALE);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVISATTUAL, PPQRY_FINANZIAMEN6, "C.PREVISIONE_ATT", "PREVISIONE_ATT", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_LIST, 792, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_LIST, 84);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_LIST, "Accer. Impeg.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_FORM, 4, 472, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_FORM, 84);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCERTIMPEGN, MyGlb.PANEL_FORM, "Accer. Impeg.");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ACCERTIMPEGN, -1, GRP_FINANZIAMENT_TOTALE);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ACCERTIMPEGN, PPQRY_FINANZIAMEN6, "C.ACC_IMP_COMP", "ACC_IMP_COMP", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_LIST, 896, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_LIST, 84);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_FORM, 4, 424, 172, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_FORM, 84);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBILIT, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DISPONIBILIT, -1, GRP_FINANZIAMENT_TOTALE);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DISPONIBILIT, PPQRY_FINANZIAMEN6, "C.DISPONIBILITA", "DISPONIBILITA", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_LIST, 1000, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_LIST, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_LIST, "Prev. Iniziale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_FORM, 4, 784, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_FORM, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOPURO, MyGlb.PANEL_FORM, "Prev. Iniziale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVISIOPURO, -1, GRP_FINANZIAMENT_PURO);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_PREVISIOPURO, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVISIOPURO, PPQRY_FINANZIAMEN6, "C.PREVISIONE - C.PREVISIONE_STANZ - C.PREVISIONE_ESIG", "FINAPREVPURO", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_LIST, 1104, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_LIST, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_LIST, "Variazioni");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_FORM, 4, 808, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_FORM, 96);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOPURO, MyGlb.PANEL_FORM, "Variazioni");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_VARIAZIOPURO, -1, GRP_FINANZIAMENT_PURO);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_VARIAZIOPURO, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_VARIAZIOPURO, PPQRY_FINANZIAMEN6, "C.VARIAZIONI - C.VARIAZIONI_STANZ - C.VARIAZIONI_ESIG", "FINAVARIPURO", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_LIST, 1208, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_LIST, 144);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_LIST, "Prev. Attuale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_FORM, 4, 832, 252, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_FORM, 144);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUPURO, MyGlb.PANEL_FORM, "Prev. Attuale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVATTUPURO, -1, GRP_FINANZIAMENT_PURO);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_PREVATTUPURO, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVATTUPURO, PPQRY_FINANZIAMEN6, "C.PREVISIONE_ATT - C.PREVISIONE_STANZ - C.PREVISIONE_ESIG - C.VARIAZIONI_STANZ - C.VARIAZIONI_ESIG", "FINPREATTPUR", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_LIST, 1312, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_LIST, 160);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_LIST, "Accer. Impeg.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_FORM, 4, 856, 268, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_FORM, 160);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEPURO, MyGlb.PANEL_FORM, "Accertato Impegnato");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ACCEIMPEPURO, -1, GRP_FINANZIAMENT_PURO);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_ACCEIMPEPURO, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ACCEIMPEPURO, PPQRY_FINANZIAMEN6, "C.ACC_IMP_COMP - C.ACC_IMP_COMP_STANZ - C.ACC_IMP_COMP_ESIG", "FINACCIMPPUR", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_LIST, 1416, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_LIST, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_FORM, 4, 880, 216, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_FORM, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBPURO, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DISPONIBPURO, -1, GRP_FINANZIAMENT_PURO);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_DISPONIBPURO, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DISPONIBPURO, PPQRY_FINANZIAMEN6, "C.PREVISIONE_ATT - C.PREVISIONE_STANZ - C.PREVISIONE_ESIG - C.VARIAZIONI_STANZ - C.VARIAZIONI_ESIG - (C.ACC_IMP_COMP - C.ACC_IMP_COMP_STANZ - C.ACC_IMP_COMP_ESIG)", "FINADISPPURO", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_LIST, 1520, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_LIST, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_LIST, "Prev. Iniziale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_FORM, 4, 544, 192, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_FORM, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISIOESIG, MyGlb.PANEL_FORM, "Prev. Iniziale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVISIOESIG, -1, GRP_FINANZIAMENT_REISCDAESIGI);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVISIOESIG, PPQRY_FINANZIAMEN6, "C.PREVISIONE_ESIG", "FINAPREVESIG", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_LIST, 1624, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_LIST, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_LIST, "Variazioni");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_FORM, 4, 568, 196, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_FORM, 108);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZIOESIG, MyGlb.PANEL_FORM, "Variazioni");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_VARIAZIOESIG, -1, GRP_FINANZIAMENT_REISCDAESIGI);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_VARIAZIOESIG, PPQRY_FINANZIAMEN6, "C.VARIAZIONI_ESIG", "FINAVARIESIG", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_LIST, 1728, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_LIST, 140);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_LIST, "Prev. Attuale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_FORM, 4, 592, 248, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_FORM, 140);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUESIG, MyGlb.PANEL_FORM, "Prev. Attuale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVATTUESIG, -1, GRP_FINANZIAMENT_REISCDAESIGI);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_PREVATTUESIG, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVATTUESIG, PPQRY_FINANZIAMEN6, "C.PREVISIONE_ESIG + C.VARIAZIONI_ESIG", "FINPREATTESI", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_LIST, 1832, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_LIST, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_LIST, "Accer. Impeg.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_FORM, 4, 616, 208, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_FORM, 120);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPEESIG, MyGlb.PANEL_FORM, "Accer. Impegnato");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ACCEIMPEESIG, -1, GRP_FINANZIAMENT_REISCDAESIGI);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ACCEIMPEESIG, PPQRY_FINANZIAMEN6, "C.ACC_IMP_COMP_ESIG", "FINACCIMPESI", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_LIST, 1936, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_LIST, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_FORM, 4, 640, 212, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_FORM, 104);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONIBESIG, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DISPONIBESIG, -1, GRP_FINANZIAMENT_REISCDAESIGI);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_DISPONIBESIG, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DISPONIBESIG, PPQRY_FINANZIAMEN6, "C.PREVISIONE_ESIG + C.VARIAZIONI_ESIG - C.ACC_IMP_COMP_ESIG", "FINADISPESIG", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_LIST, 2040, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_LIST, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_LIST, "Prev. Iniziale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_FORM, 4, 664, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_FORM, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVISISTANZ, MyGlb.PANEL_FORM, "Prev. Iniziale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVISISTANZ, -1, GRP_FINANZIAMENT_REISCDASTANZ);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVISISTANZ, PPQRY_FINANZIAMEN6, "C.PREVISIONE_STANZ", "FINAPREVSTAN", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_LIST, 2144, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_LIST, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_LIST, "Variazioni");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_FORM, 4, 688, 204, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_FORM, 116);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_VARIAZISTANZ, MyGlb.PANEL_FORM, "Variazioni");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_VARIAZISTANZ, -1, GRP_FINANZIAMENT_REISCDASTANZ);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_VARIAZISTANZ, PPQRY_FINANZIAMEN6, "C.VARIAZIONI_STANZ", "FINAVARISTAN", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_LIST, 2248, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_LIST, 148);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_LIST, "Prev. Attuale");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_FORM, 4, 712, 256, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_FORM, 148);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_PREVATTUSTAN, MyGlb.PANEL_FORM, "Prev. Attuale");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_PREVATTUSTAN, -1, GRP_FINANZIAMENT_REISCDASTANZ);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_PREVATTUSTAN, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_PREVATTUSTAN, PPQRY_FINANZIAMEN6, "C.PREVISIONE_STANZ + C.VARIAZIONI_STANZ", "FINPREATTSTA", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_LIST, 2352, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_LIST, 132);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_LIST, "Accer. Impeg.");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_FORM, 4, 736, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_FORM, 132);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_ACCEIMPESTAN, MyGlb.PANEL_FORM, "Accertato Impegnato");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_ACCEIMPESTAN, -1, GRP_FINANZIAMENT_REISCDASTANZ);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_ACCEIMPESTAN, PPQRY_FINANZIAMEN6, "C.ACC_IMP_COMP_STANZ", "FINACCIMPSTA", 2, 15, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_LIST, 2456, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_LIST, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_LIST, "Disponibilità");
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_FORM, 4, 760, 220, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_FORM, 112);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_DISPONISTANZ, MyGlb.PANEL_FORM, "Disponibilità");
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_DISPONISTANZ, -1, GRP_FINANZIAMENT_REISCDASTANZ);
    PAN_FINANZIAMENT.SetFieldUnbound(PFL_FINANZIAMENT_DISPONISTANZ, true);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_DISPONISTANZ, PPQRY_FINANZIAMEN6, "C.PREVISIONE_STANZ + C.VARIAZIONI_STANZ - C.ACC_IMP_COMP_STANZ", "FINADISPSTAN", 2, 19, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 0, 0, 240, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 0, 0, 352, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELFINANZI, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABELFINANZI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABELFINANZI, -1, "", "LABELFINANZI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, MyGlb.PANEL_LIST, 240, 0, 240, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, MyGlb.PANEL_LIST, 2);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, MyGlb.PANEL_FORM, 8, 8, 352, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELOPERA, MyGlb.PANEL_FORM, 2);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABELOPERA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABELOPERA, -1, "", "LABELOPERA", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, MyGlb.PANEL_LIST, 432, 248, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, MyGlb.PANEL_FORM, 588, 248, 76, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABELTOTALI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABELTOTALI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABELTOTALI, -1, "", "LABELTOTALI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, MyGlb.PANEL_LIST, 480, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, MyGlb.PANEL_FORM, 672, 248, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREINI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPREINI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPREINI, -1, "", "LABTOTPREINI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, MyGlb.PANEL_LIST, 584, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, MyGlb.PANEL_FORM, 680, 256, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTAVARI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABETOTAVARI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABETOTAVARI, -1, "", "LABETOTAVARI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, MyGlb.PANEL_LIST, 688, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, MyGlb.PANEL_FORM, 688, 264, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPREATT, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPREATT, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPREATT, -1, "", "LABTOTPREATT", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, MyGlb.PANEL_LIST, 792, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, MyGlb.PANEL_FORM, 696, 272, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACCIMP, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTACCIMP, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTACCIMP, -1, "", "LABTOTACCIMP", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, MyGlb.PANEL_LIST, 896, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, MyGlb.PANEL_FORM, 704, 280, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABETOTADISP, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABETOTADISP, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABETOTADISP, -1, "", "LABETOTADISP", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, MyGlb.PANEL_LIST, 1000, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, MyGlb.PANEL_FORM, 712, 288, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINPU, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPRINPU, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPRINPU, -1, "", "LABTOTPRINPU", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, MyGlb.PANEL_LIST, 1104, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, MyGlb.PANEL_FORM, 720, 296, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARPUR, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTVARPUR, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTVARPUR, -1, "", "LABTOTVARPUR", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, MyGlb.PANEL_LIST, 1208, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, MyGlb.PANEL_FORM, 728, 304, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATPU, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPRATPU, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPRATPU, -1, "", "LABTOTPRATPU", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, MyGlb.PANEL_LIST, 1312, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, MyGlb.PANEL_FORM, 736, 312, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMPU, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTACIMPU, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTACIMPU, -1, "", "LABTOTACIMPU", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, MyGlb.PANEL_LIST, 1416, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, MyGlb.PANEL_FORM, 744, 320, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISPUR, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTDISPUR, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTDISPUR, -1, "", "LABTOTDISPUR", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, MyGlb.PANEL_LIST, 1520, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, MyGlb.PANEL_FORM, 752, 328, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINES, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPRINES, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPRINES, -1, "", "LABTOTPRINES", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, MyGlb.PANEL_LIST, 1624, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, MyGlb.PANEL_FORM, 760, 336, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARESI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTVARESI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTVARESI, -1, "", "LABTOTVARESI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, MyGlb.PANEL_LIST, 1728, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, MyGlb.PANEL_FORM, 768, 344, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATES, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPRATES, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPRATES, -1, "", "LABTOTPRATES", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, MyGlb.PANEL_LIST, 1832, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, MyGlb.PANEL_FORM, 776, 352, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMES, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTACIMES, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTACIMES, -1, "", "LABTOTACIMES", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, MyGlb.PANEL_LIST, 1936, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, MyGlb.PANEL_FORM, 784, 360, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISESI, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTDISESI, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTDISESI, -1, "", "LABTOTDISESI", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, MyGlb.PANEL_LIST, 2040, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, MyGlb.PANEL_FORM, 792, 368, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRINST, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPRINST, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPRINST, -1, "", "LABTOTPRINST", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, MyGlb.PANEL_LIST, 2144, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, MyGlb.PANEL_FORM, 800, 376, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTVARSTA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTVARSTA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTVARSTA, -1, "", "LABTOTVARSTA", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, MyGlb.PANEL_LIST, 2248, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, MyGlb.PANEL_FORM, 808, 384, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTPRATST, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTPRATST, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTPRATST, -1, "", "LABTOTPRATST", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, MyGlb.PANEL_LIST, 2352, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, MyGlb.PANEL_FORM, 816, 392, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTACIMST, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTACIMST, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTACIMST, -1, "", "LABTOTACIMST", 0, 0, 0, -13997);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, MyGlb.PANEL_LIST, 2456, 248, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, MyGlb.PANEL_LIST, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, MyGlb.PANEL_LIST, 1);
    PAN_FINANZIAMENT.SetRect(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, MyGlb.PANEL_FORM, 824, 400, 112, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_FINANZIAMENT.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, MyGlb.PANEL_FORM, 0);
    PAN_FINANZIAMENT.SetNumRow(MyGlb.OBJ_FIELD, PFL_FINANZIAMENT_LABTOTDISSTA, MyGlb.PANEL_FORM, 1);
    PAN_FINANZIAMENT.SetFieldPage(PFL_FINANZIAMENT_LABTOTDISSTA, -1, -1);
    PAN_FINANZIAMENT.SetFieldPanel(PFL_FINANZIAMENT_LABTOTDISSTA, -1, "", "LABTOTDISSTA", 0, 0, 0, -13997);
  }

  private void PAN_FINANZIAMENT_InitQueries()
  {
    StringBuffer SQL;

    PAN_FINANZIAMENT.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_FINANZIAMENT.SetIMDB(IMDB, "PQRY_FINANZIAMEN6", true);
    PAN_FINANZIAMENT.set_SetString(MyGlb.MASTER_ROWNAME, "FINANZIAMENTI");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as FINANZFINANZ, ");
    SQL.append("  B.DESCRIZIONE as FINANZIOPERA, ");
    SQL.append("  C.FINANZIAMENTO as FINANZIAMENTO, ");
    SQL.append("  C.OPERA as OPERA, ");
    SQL.append("  C.PREVISIONE as PREVISIONE, ");
    SQL.append("  C.VARIAZIONI as VARIAZIONI, ");
    SQL.append("  C.PREVISIONE_ATT as PREVISIONE_ATT, ");
    SQL.append("  C.ACC_IMP_COMP as ACC_IMP_COMP, ");
    SQL.append("  C.DISPONIBILITA as DISPONIBILITA, ");
    SQL.append("  C.PREVISIONE_ESIG as FINAPREVESIG, ");
    SQL.append("  C.VARIAZIONI_ESIG as FINAVARIESIG, ");
    SQL.append("  C.PREVISIONE_ESIG + C.VARIAZIONI_ESIG as FINPREATTESI, ");
    SQL.append("  C.ACC_IMP_COMP_ESIG as FINACCIMPESI, ");
    SQL.append("  C.PREVISIONE_ESIG + C.VARIAZIONI_ESIG - C.ACC_IMP_COMP_ESIG as FINADISPESIG, ");
    SQL.append("  C.PREVISIONE_STANZ as FINAPREVSTAN, ");
    SQL.append("  C.VARIAZIONI_STANZ as FINAVARISTAN, ");
    SQL.append("  C.PREVISIONE_STANZ + C.VARIAZIONI_STANZ as FINPREATTSTA, ");
    SQL.append("  C.ACC_IMP_COMP_STANZ as FINACCIMPSTA, ");
    SQL.append("  C.PREVISIONE_STANZ + C.VARIAZIONI_STANZ - C.ACC_IMP_COMP_STANZ as FINADISPSTAN, ");
    SQL.append("  C.PREVISIONE - C.PREVISIONE_STANZ - C.PREVISIONE_ESIG as FINAPREVPURO, ");
    SQL.append("  C.VARIAZIONI - C.VARIAZIONI_STANZ - C.VARIAZIONI_ESIG as FINAVARIPURO, ");
    SQL.append("  C.PREVISIONE_ATT - C.PREVISIONE_STANZ - C.PREVISIONE_ESIG - C.VARIAZIONI_STANZ - C.VARIAZIONI_ESIG as FINPREATTPUR, ");
    SQL.append("  C.ACC_IMP_COMP - C.ACC_IMP_COMP_STANZ - C.ACC_IMP_COMP_ESIG as FINACCIMPPUR, ");
    SQL.append("  C.PREVISIONE_ATT - C.PREVISIONE_STANZ - C.PREVISIONE_ESIG - C.VARIAZIONI_STANZ - C.VARIAZIONI_ESIG - (C.ACC_IMP_COMP - C.ACC_IMP_COMP_STANZ - C.ACC_IMP_COMP_ESIG) as FINADISPPURO ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMEN6, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  FINANZIAMENTI A, ");
    SQL.append("  OPERE B, ");
    SQL.append("  VISTA_TOT_FIN_OPE_CAP C ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMEN6, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (C.FINANZIAMENTO = A.CODICE) ");
    SQL.append("and   (C.OPERA = B.CODICE) ");
    SQL.append("and   (C.CAPITOLO = ~~TBL_PARAMETRI63.PARAMCAPITOL~~) ");
    SQL.append("and   (C.ARTICOLO = ~~TBL_PARAMETRI63.PARAMARTICOL~~) ");
    SQL.append("and   (C.E_S = ~~TBL_PARAMETRI63.PARAMES~~) ");
    SQL.append("and   (C.ESERCIZIO = NVL(~~TBL_PARAMETRI63.PARAMESERCIZ~~, ~~TBL_DATISESSIONE.SESSIOESERCI~~)) ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMEN6, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMEN6, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMEN6, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  C.FINANZIAMENTO, ");
    SQL.append("  C.OPERA ");
    PAN_FINANZIAMENT.SetQuery(PPQRY_FINANZIAMEN6, 5, SQL, -1, "");
    PAN_FINANZIAMENT.SetQueryDB(PPQRY_FINANZIAMEN6, MainFrm.Cf4armDBObject.DB, 4);
    PAN_FINANZIAMENT.SetMasterTable(0, "FINANZIAMENTI");
    PAN_FINANZIAMENT.AddToSortList(PFL_FINANZIAMENT_CODICEFINANZ, true);
    PAN_FINANZIAMENT.AddToSortList(PFL_FINANZIAMENT_CODICEOPERA, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_FINANZIAMENT.Status() == 2)
    {
      int oldListQBE = PAN_FINANZIAMENT.iUseListQBE;
      PAN_FINANZIAMENT.iUseListQBE = 0;
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_SEARCH);
      PAN_FINANZIAMENT.PanelCommand(Glb.PCM_FIND);
      PAN_FINANZIAMENT.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_AfterFind(CmdFind);
  }    

  public void BeforeCommit(IDPanel SrcObj, IDVariant Cancel)
  {
  }
  
  public void AfterCommit(IDPanel SrcObj, IDVariant RowUpdated, IDVariant RowError)
  {
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_FINANZIAMENT) PAN_FINANZIAMENT_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
