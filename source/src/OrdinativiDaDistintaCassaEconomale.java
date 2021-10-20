// **********************************************
// Ordinativi Da Distinta Cassa Economale
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class OrdinativiDaDistintaCassaEconomale extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_PAR_NUMERODISTIN = 0;
  private static int PFL_PAR_SLASHLABEL = 1;
  private static int PFL_PAR_ANNODISTINTA = 2;
  private static int PFL_PAR_PERIODODAL = 3;
  private static int PFL_PAR_AL = 4;
  private static int PFL_PAR_SOLOMOVDAINC = 5;
  private static int PFL_PAR_SCELDISTLABE = 6;

  private static int PPQRY_PAR77 = 0;


  IDPanel PAN_PAR;
  private static int PFL_DISTINVERSAM_DEBITORE = 0;
  private static int PFL_DISTINVERSAM_NUMEROACCERT = 1;
  private static int PFL_DISTINVERSAM_ANNOACCERTAM = 2;
  private static int PFL_DISTINVERSAM_INFOACC = 3;
  private static int PFL_DISTINVERSAM_CAPITOLO = 4;
  private static int PFL_DISTINVERSAM_ARTICOLO = 5;
  private static int PFL_DISTINVERSAM_INFOVOCEPEG = 6;
  private static int PFL_DISTINVERSAM_IMPORTO = 7;
  private static int PFL_DISTINVERSAM_ORDINATIVO = 8;
  private static int PFL_DISTINVERSAM_ACCERTALABEL = 9;
  private static int PFL_DISTINVERSAM_CAPITARTLABE = 10;

  private static int PPQRY_MOVIMCASSGC5 = 0;


  IDPanel PAN_DISTINVERSAM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PAR79(IMDB);
    //
    //
    Init_PQRY_PAR77(IMDB);
    Init_PQRY_PAR77_RS(IMDB);
    Init_PQRY_MOVIMCASSGC5(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PAR79(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef6.TBL_PAR79, 5);
    IMDB.set_TblCode(IMDBDef6.TBL_PAR79, "TBL_PAR79");
    IMDB.set_FldCode(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMNUMDIS,1,6,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMANNDIS, "ROWNAMANNDIS");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_RONASOMODAIN, "RONASOMODAIN");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_RONASOMODAIN,12,2,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMPERDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef6.TBL_PAR79,IMDBDef6.FLD_PAR79_ROWNAMEAL,6,14,0);
    IMDB.TblAddNew(IMDBDef6.TBL_PAR79, 0);
  }

  private static void Init_PQRY_PAR77(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR77, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR77, "PQRY_PAR77");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, "ROWNAMANNDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_RONASOMODAIN, "RONASOMODAIN");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_RONASOMODAIN,12,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMPERDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77,IMDBDef15.PQSL_PAR77_ROWNAMEAL,6,14,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_PAR77, 0);
  }

  private static void Init_PQRY_PAR77_RS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_PAR77_RS, 5);
    IMDB.set_TblCode(IMDBDef15.PQRY_PAR77_RS, "PQRY_PAR77_RS");
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, "ROWNAMNUMDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS,1,6,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, "ROWNAMANNDIS");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMANNDIS,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_RONASOMODAIN, "RONASOMODAIN");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_RONASOMODAIN,12,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMPERDAL, "ROWNAMPERDAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMPERDAL,6,14,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMEAL, "ROWNAMEAL");
    IMDB.SetFldParams(IMDBDef15.PQRY_PAR77_RS,IMDBDef15.PQSL_PAR77_ROWNAMEAL,6,14,0);
  }

  private static void Init_PQRY_MOVIMCASSGC5(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef15.PQRY_MOVIMCASSGC5, 9);
    IMDB.set_TblCode(IMDBDef15.PQRY_MOVIMCASSGC5, "PQRY_MOVIMCASSGC5");
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_REBERASOESES, "REBERASOESES");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_REBERASOESES,5,60,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_NUMERO_ACCERTAMENTO, "NUMERO_ACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_NUMERO_ACCERTAMENTO,1,5,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_ANNO_ACCERTAMENTO, "ANNO_ACCERTAMENTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_ANNO_ACCERTAMENTO,1,4,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_IMPORTO, "IMPORTO");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_IMPORTO,3,15,2);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_RECORDORDINA, "RECORDORDINA");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_RECORDORDINA,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_RECORINFOACC, "RECORINFOACC");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_RECORINFOACC,5,99,0);
    IMDB.set_FldCode(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_RECINFVOCPEG, "RECINFVOCPEG");
    IMDB.SetFldParams(IMDBDef15.PQRY_MOVIMCASSGC5,IMDBDef15.PQSL_MOVIMCASSGC5_RECINFVOCPEG,5,99,0);
    IMDB.TblAddNew(IMDBDef15.PQRY_MOVIMCASSGC5, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public OrdinativiDaDistintaCassaEconomale(MyWebEntryPoint w, IMDBObj imdb)
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
  public OrdinativiDaDistintaCassaEconomale()
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
    FormIdx = MyGlb.FRM_ORDDADISCAEC;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "1D4DCBDF-D3F2-44CA-957A-727654738E0C";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 772;
    DesignHeight = 498;
    set_Caption(new IDVariant("Ordinativi Da Distinta Cassa Economale"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 772;
    Frames[1].Height = 472;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.127119;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 772;
    Frames[2].Height = 60;
    Frames[2].FrHidden = true;
    Frames[2].Caption = "Par";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 60;
    PAN_PAR = new IDPanel(w, this, 2, "PAN_PAR");
    Frames[2].Content = PAN_PAR;
    PAN_PAR.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_PAR.VS = MainFrm.VisualStyleList;
    PAN_PAR.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 60-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "335C9E62-D61D-4814-AEA6-6C1037564A8B");
    PAN_PAR.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 368, 176, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_PAR.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASFORM | MyGlb.PAN_STARTFORM | MyGlb.PAN_CANUPDATE | MyGlb.PAN_AUTOSAVE | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_PAR.InitStatus = 2;
    PAN_PAR_Init();
    PAN_PAR_InitFields();
    PAN_PAR_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 772;
    Frames[3].Height = 412;
    Frames[3].Caption = "Distinte Versamenti";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 412;
    PAN_DISTINVERSAM = new IDPanel(w, this, 3, "PAN_DISTINVERSAM");
    Frames[3].Content = PAN_DISTINVERSAM;
    PAN_DISTINVERSAM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_DISTINVERSAM.VS = MainFrm.VisualStyleList;
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 772-MyGlb.PAN_OFFS_X, 412-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "D6DA819B-4BC3-4642-92A1-BD5C4DF762CD");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 728, 256, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_HASLIST | MyGlb.PAN_CANSELECT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_DISTINVERSAM.InitStatus = 2;
    PAN_DISTINVERSAM_Init();
    PAN_DISTINVERSAM_InitFields();
    PAN_DISTINVERSAM_InitQueries();
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
      if (CmdIdx==MyGlb.CMD_FUNZIOAGG128+BaseCmdLinIdx)
      {
        MainFrm.CmdObj.ShowPopup(MyGlb.CMDS_MENUFUNZAGG1+BaseCmdSetIdx, "M" + (MyGlb.CMD_FUNZIOAGG128+BaseCmdLinIdx), FormIdx, 1);
        break fine;
      }
      if (CmdIdx==MyGlb.CMD_EMISSIORDIN2+BaseCmdLinIdx)
      {
        EmissioneOrdinativiDaDistinta();
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
      if (IMDB.TblModified(IMDBDef6.TBL_PAR79, MyGlb.GlbRefModIdx) || JustLoaded)
      {
        ORDDADISCAEC_PAR77();
      }
      PAN_PAR.UpdatePanel(MainFrm);
      PAN_DISTINVERSAM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCEDISVECAEC && flRis && IdxPanelActived == PAN_PAR.FrIndex)
    {
      if (IdxFieldActived ==PFL_PAR_SCELDISTLABE) {
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
    return (obj instanceof OrdinativiDaDistintaCassaEconomale);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? OrdinativiDaDistintaCassaEconomale.class.getName() : (Glb.ClassWithPackage(OrdinativiDaDistintaCassaEconomale.class) ? OrdinativiDaDistintaCassaEconomale.class.getName().substring(OrdinativiDaDistintaCassaEconomale.class.getPackage().getName().length() + 1) : OrdinativiDaDistintaCassaEconomale.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Controlla Distinta
  // Explain which processing is carried out by this procedure
  // **********************************************************************
  public int ControllaDistinta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;
    IDVariant v_RET = new IDVariant(0,IDVariant.INTEGER);

    try
    {
      TransCount = 0;
      // 
      // Controlla Distinta Body
      // Procedure Body
      // 
      SQL = new StringBuffer();
      SQL.append("select ");
      SQL.append("  CHECK_DISTINTA_PRE(" + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + "," + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") as CDPRNADODDCE ");
      SQL.append("from ");
      SQL.append("  DUAL A ");
      QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
      if (!QV.EOF()) QV.MoveNext();
      if (!QV.EOF())
      {
        v_RET = QV.Get("CDPRNADODDCE", IDVariant.INTEGER) ;
      }
      QV.Close();
      if (v_RET.equals((new IDVariant(0)), true))
      {
        IDVariant v_SMS = new IDVariant(0,IDVariant.STRING);
        v_SMS = (new IDVariant("Distinta completamente incassata", IDVariant.STRING));
        MainFrm.set_AlertMessage(v_SMS); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "ControllaDistinta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Acc
  // **********************************************************************
  public int InfoAcc ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Acc Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_MOVIMCASSGC5, IMDBDef15.PQSL_MOVIMCASSGC5_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_MOVIMCASSGC5, IMDBDef15.PQSL_MOVIMCASSGC5_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMANNOACC, 0, IMDB.Value(IMDBDef15.PQRY_MOVIMCASSGC5, IMDBDef15.PQSL_MOVIMCASSGC5_ANNO_ACCERTAMENTO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMNUMEACC, 0, IMDB.Value(IMDBDef15.PQRY_MOVIMCASSGC5, IMDBDef15.PQSL_MOVIMCASSGC5_NUMERO_ACCERTAMENTO, 0));
      IMDB.set_Value(IMDBDef4.TBL_PARAMETRI82, IMDBDef4.FLD_PARAMETRI82_PARAMES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_INFOACCEFORM, (new IDVariant(-1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "InfoAcc", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Info Voce Peg
  // **********************************************************************
  public int InfoVocePeg ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Info Voce Peg Body
      // Procedure Body
      // 
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMCAPITOL, 0, IMDB.Value(IMDBDef15.PQRY_MOVIMCASSGC5, IMDBDef15.PQSL_MOVIMCASSGC5_CAPITOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMARTICOL, 0, IMDB.Value(IMDBDef15.PQRY_MOVIMCASSGC5, IMDBDef15.PQSL_MOVIMCASSGC5_ARTICOLO, 0));
      IMDB.set_Value(IMDBDef1.TBL_PARAMETRI61, IMDBDef1.FLD_PARAMETRI61_PARAMES, 0, (new IDVariant("E")));
      MainFrm.Show(MyGlb.FRM_INFOSUVOCBIL, (new IDVariant(0)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "InfoVocePeg", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Emissione Ordinativi Da Distinta
  // **********************************************************************
  public int EmissioneOrdinativiDaDistinta ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Emissione Ordinativi Da Distinta Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, 0))))
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR107, IMDBDef6.FLD_PAR107_ROWNAMANNDIS, 0, IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR107, IMDBDef6.FLD_PAR107_ROWNAMNUMDIS, 0, IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, 0));
        MainFrm.Show(MyGlb.FRM_EMISORDDADIS, (new IDVariant(-1)).intValue(), this); 
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "EmissioneOrdinativiDaDistinta", _e);
      return -1;
    }
  }

  // **********************************************************************
  // Scelta Distinta Di Versamento
  // Spiega quale elaborazione viene eseguita da questa
  // procedura
  // **********************************************************************
  public int SceltaDistintaDiVersamento ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Scelta Distinta Di Versamento Body
      // Corpo Procedura
      // 
      if ((MainFrm.GetForm(MyGlb.FRM_SCEDISVECAEC, 0, false)!=null))
      {
        MainFrm.UnloadForm(MyGlb.FRM_SCEDISVECAEC,(new IDVariant(0)).booleanValue()); 
      }
      MainFrm.Show(MyGlb.FRM_SCEDISVECAEC, (new IDVariant(1)).intValue(), this); 
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "SceltaDistintaDiVersamento", _e);
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
      IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMNUMDIS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMANNDIS, 0, (new IDVariant()));
      IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_RONASOMODAIN, 0, (new IDVariant("SI")));
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "LoadEvent", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCEDISVECAEC)), true) && Result.booleanValue())
      {
        IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMNUMDIS, 0, IMDB.Value(IMDBDef15.PQRY_DISTINTE, IMDBDef15.PQSL_DISTINTE_BENDISVENUDI, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMANNDIS, 0, IMDB.Value(IMDBDef15.PQRY_DISTINTE, IMDBDef15.PQSL_DISTINTE_BENDISVEANDI, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMPERDAL, 0, IMDB.Value(IMDBDef15.PQRY_DISTINTE, IMDBDef15.PQSL_DISTINTE_BENDISVEDADA, 0));
        IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMEAL, 0, IMDB.Value(IMDBDef15.PQRY_DISTINTE, IMDBDef15.PQSL_DISTINTE_BENDISVERDAA, 0));
      }
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_EMISORDDADIS)), true))
      {
        PAN_DISTINVERSAM.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "EndModal", _e);
    }
  }

  // **********************************************************************
  // Par On Updating Row Event
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column: E' un numero intero che indica per quale campo della riga l'evento è in fase di esecuzione. Occorre utilizzare la proprietà Me del campo di pannello per effettuare i confronti. - Input
  // Field Modified: E' un valore booleano che indica che il campo è veramente stato modificato, cioè il suo valore è diverso da quello originalmente letto dal database. - Input
  // Field Was Modified: Dalla versione 6.7.2900, questo argomento indica se il campo è stato modificato nell'ultima trasmissione del browser, ed è quindi utilizzabile per sapere quali campi sono stati effettivamente modificati nell'ultimo ciclo di comunicazione con il server. - Input
  // Row Was Modified: Non è consigliabile utilizzare questo argomento perchè è presente solo per compatibilità con vecchie versioni di Instant Developer. - Input
  // Inserting: E' un valore booleano che indica se la riga attuale è in fase di modifica (falso) o di inserimento (vero). - Input
  // Cancel: Non utilizzare questo argomento. Per segnalare una condizione di errore, utilizzare le funzioni SetErrorText del campo di pannello o del pannello stesso. - Input/Output
  // **********************************************************************
  private void PAN_PAR_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Par On Updating Row Event Body
      // Procedure Body
      // 
      if (!(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, 0))))
      {
        IDVariant v_DATADA = new IDVariant(0,IDVariant.DATETIME);
        IDVariant v_DATAA = new IDVariant(0,IDVariant.DATETIME);
        IDVariant v_CONTATORE = new IDVariant(0,IDVariant.INTEGER);
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  COUNT(*) as COUNT1 ");
        SQL.append("from ");
        SQL.append("  DISTINTE_VERSAMENTI A ");
        SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_CONTATORE = QV.Get("COUNT1", IDVariant.INTEGER) ;
        }
        QV.Close();
        SQL = new StringBuffer();
        SQL.append("select ");
        SQL.append("  A.DATA_DA as DISTVERDATDA, ");
        SQL.append("  A.DATA_A as DISTVERSDATA ");
        SQL.append("from ");
        SQL.append("  DISTINTE_VERSAMENTI A ");
        SQL.append("where (A.ANNO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMANNDIS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        SQL.append("and   (A.NUMERO_DISTINTA = " + IDL.CSql(IMDB.Value(IMDBDef15.PQRY_PAR77, IMDBDef15.PQSL_PAR77_ROWNAMNUMDIS, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
        QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
        if (!QV.EOF()) QV.MoveNext();
        if (!QV.EOF())
        {
          v_DATADA = QV.Get("DISTVERDATDA", IDVariant.DATETIME) ;
          v_DATAA = QV.Get("DISTVERSDATA", IDVariant.DATETIME) ;
        }
        QV.Close();
        IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMPERDAL, 0, new IDVariant(v_DATADA));
        IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMEAL, 0, new IDVariant(v_DATAA));
        if (v_CONTATORE.compareTo((new IDVariant(0)), true)>0)
        {
          ControllaDistinta();
        }
        else
        {
          IDVariant v_ERR = new IDVariant(0,IDVariant.STRING);
          v_ERR = (new IDVariant("Distinta non presente", IDVariant.STRING));
          IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMPERDAL, 0, (new IDVariant()));
          IMDB.set_Value(IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMEAL, 0, (new IDVariant()));
          MainFrm.set_AlertMessage(v_ERR); 
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("OrdinativiDaDistintaCassaEconomale", "ParOnUpdatingRowEvent", _e);
    }
  }

  // **********************************************************************
  // Par
  // Primary record source for panel data
  // **********************************************************************
  private void ORDDADISCAEC_PAR77() throws SQLException
  {
    IDVariant[] AggrBuff;
    int[] AggrRowCount;
    int AggrCount=0;
    boolean AggrNewGroup = false;

    IMDB.TblTruncate(IMDBDef15.PQRY_PAR77_RS);
    IMDB.TblMoveFirst(IMDBDef6.TBL_PAR79, 0);
    Loop1: while (!IMDB.Eof(IMDBDef6.TBL_PAR79, 0))
    {
      IMDB.TblAddNew(IMDBDef15.PQRY_PAR77_RS, 0);
      IMDB.TblLinkRow(IMDBDef15.PQRY_PAR77_RS, 0, IMDBDef6.TBL_PAR79, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR77_RS, 0, 0, IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMNUMDIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR77_RS, 1, 0, IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMANNDIS, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR77_RS, 2, 0, IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_RONASOMODAIN, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR77_RS, 3, 0, IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMPERDAL, 0);
      IMDB.TblLinkField(IMDBDef15.PQRY_PAR77_RS, 4, 0, IMDBDef6.TBL_PAR79, IMDBDef6.FLD_PAR79_ROWNAMEAL, 0);
      IMDB.TblMoveNext(IMDBDef6.TBL_PAR79, 0);
      if (IMDB.Eof(IMDBDef6.TBL_PAR79, 0))
      {
        IMDB.TblMoveFirst(IMDBDef6.TBL_PAR79, 0);
      }
      else
      {
        continue Loop1;
      }
      break;
    }
    IMDB.TblMoveFirst(IMDBDef15.PQRY_PAR77_RS, 0);
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
  private void PAN_PAR_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_PAR, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_PAR_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_PAR, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_PAR_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_PAR);
    // Stub
  }

  private void PAN_PAR_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_PAR_SCELDISTLABE)
    {
      this.IdxPanelActived = this.PAN_PAR.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      SceltaDistintaDiVersamento();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_PAR_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_PAR_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_PAR_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_PAR_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_DISTINVERSAM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_DISTINVERSAM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_DISTINVERSAM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_DISTINVERSAM, Cancel);
    // Stub
  }

  // **********************************************************************
  // On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_DISTINVERSAM_DynamicProperties ()
  {
      MainFrm.DynamicProperties(PAN_DISTINVERSAM);
    // Stub
  }

  private void PAN_DISTINVERSAM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_DISTINVERSAM_INFOACC)
    {
      this.IdxPanelActived = this.PAN_DISTINVERSAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoAcc();
      Cancel.set(IDVariant.TRUE);
    }
    if (ColIndex.intValue() == PFL_DISTINVERSAM_INFOVOCEPEG)
    {
      this.IdxPanelActived = this.PAN_DISTINVERSAM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      InfoVocePeg();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_DISTINVERSAM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
    }
    catch(Exception e) {}
  }

  private void PAN_DISTINVERSAM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_DISTINVERSAM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_PAR_Init()
  {

    PAN_PAR.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_PAR.SetSize(MyGlb.OBJ_FIELD, 7);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, "AFBA43BC-A2A0-48DF-B573-64CC6C537F0E");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, "Distinta");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, "45862FA6-96D1-4E73-85EA-326F1818AC8F");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, "/");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, MyGlb.VIS_VUOTONORMALE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, "86183932-B922-4341-9696-31FB63979646");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, "Anno Distinta");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_NOHDRLIST | MyGlb.FLD_NOHDRFORM | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, "ED35FAEB-501E-4A6E-8B5D-B96FF163D242");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, "Periodo Dal");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_AL, "36125078-E603-4B39-B236-107443468127");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_AL, "Al");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_AL, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.VIS_NORMALFIELDS);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_AL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, "DA94E312-DC13-4782-820B-CC8F1E8D748A");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, "Solo Movimenti Da Incassare");
    PAN_PAR.set_ToolTip(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.VIS_CHECKSTYLE);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISOPT, -1);
    PAN_PAR.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, "8CBC8DDB-CCF8-4B5A-9E15-56FDD69BC8E4");
    PAN_PAR.set_Header(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, "");
    PAN_PAR.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, MyGlb.VIS_STATICBUTTON);
    PAN_PAR.SetImage(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, 0, "wsearch1.gif", false);
    PAN_PAR.SetFlags(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE, -1);
  }

  private void PAN_PAR_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_LIST, 0, 36, 72, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_LIST, 44);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_LIST, "Distinta");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_FORM, 20, 20, 156, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_FORM, 52);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_NUMERODISTIN, MyGlb.PANEL_FORM, "Distinta");
    PAN_PAR.SetFieldPage(PFL_PAR_NUMERODISTIN, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_NUMERODISTIN, PPQRY_PAR77, "A.ROWNAMNUMDIS", "ROWNAMNUMDIS", 1, 6, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, MyGlb.PANEL_LIST, 116, 4, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, MyGlb.PANEL_FORM, 176, 20, 16, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SLASHLABEL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_SLASHLABEL, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SLASHLABEL, -1, "", "SLASHLABEL", 0, 0, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_LIST, 72, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_LIST, 72);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_LIST, "Ann. Dist.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_FORM, 192, 20, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_FORM, 160);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_ANNODISTINTA, MyGlb.PANEL_FORM, "Anno Distinta");
    PAN_PAR.SetFieldPage(PFL_PAR_ANNODISTINTA, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_ANNODISTINTA, PPQRY_PAR77, "A.ROWNAMANNDIS", "ROWNAMANNDIS", 1, 4, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_LIST, 160, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_LIST, 64);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_LIST, "Periodo Dal");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_FORM, 272, 20, 148, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_FORM, 72);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_PERIODODAL, MyGlb.PANEL_FORM, "Periodo Dal");
    PAN_PAR.SetFieldPage(PFL_PAR_PERIODODAL, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_PERIODODAL, PPQRY_PAR77, "A.ROWNAMPERDAL", "ROWNAMPERDAL", 6, 14, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 264, 36, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 20);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_LIST, "Al");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 432, 20, 96, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 20);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_AL, MyGlb.PANEL_FORM, "Al");
    PAN_PAR.SetFieldPage(PFL_PAR_AL, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_AL, PPQRY_PAR77, "A.ROWNAMEAL", "ROWNAMEAL", 6, 14, 0, -13997);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_LIST, 112, 36, 48, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_LIST, 148);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_LIST, "S. Mov. D. Inc.");
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_FORM, 544, 20, 200, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_FORM, 176);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_PAR_SOLOMOVDAINC, MyGlb.PANEL_FORM, "Solo Movimenti Da Incassare");
    PAN_PAR.SetFieldPage(PFL_PAR_SOLOMOVDAINC, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SOLOMOVDAINC, PPQRY_PAR77, "A.RONASOMODAIN", "RONASOMODAIN", 12, 2, 0, -13997);
    PAN_PAR.SetValueListItem(PFL_PAR_SOLOMOVDAINC, (new IDVariant("SI")), "SI", "", "", -1);
    PAN_PAR.SetValueListItem(PFL_PAR_SOLOMOVDAINC, (new IDVariant("NO")), "NO", "", "", -1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, MyGlb.PANEL_LIST, 172, 16, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, MyGlb.PANEL_LIST, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, MyGlb.PANEL_LIST, 1);
    PAN_PAR.SetRect(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, MyGlb.PANEL_FORM, 240, 20, 16, 16, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_PAR.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, MyGlb.PANEL_FORM, 0);
    PAN_PAR.SetNumRow(MyGlb.OBJ_FIELD, PFL_PAR_SCELDISTLABE, MyGlb.PANEL_FORM, 1);
    PAN_PAR.SetFieldPage(PFL_PAR_SCELDISTLABE, -1, -1);
    PAN_PAR.SetFieldPanel(PFL_PAR_SCELDISTLABE, -1, "", "SCELDISTLABE", 0, 0, 0, -13997);
    PAN_PAR.set_ImageResizeMode(PFL_PAR_SCELDISTLABE, 2);
  }

  private void PAN_PAR_InitQueries()
  {
    StringBuffer SQL;

    PAN_PAR.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_PAR.SetIMDB(IMDB, "PQRY_PAR77", true);
    PAN_PAR.set_SetString(MyGlb.MASTER_ROWNAME, "Row Name");
    PAN_PAR.SetQueryIMDB(PPQRY_PAR77, IMDBDef15.PQRY_PAR77_RS, IMDBDef6.TBL_PAR79);
    JustLoaded = true;
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_NUMERODISTIN, IMDBDef6.FLD_PAR79_ROWNAMNUMDIS);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_ANNODISTINTA, IMDBDef6.FLD_PAR79_ROWNAMANNDIS);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_PERIODODAL, IMDBDef6.FLD_PAR79_ROWNAMPERDAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_AL, IMDBDef6.FLD_PAR79_ROWNAMEAL);
    PAN_PAR.SetFieldPrimaryIndex(PFL_PAR_SOLOMOVDAINC, IMDBDef6.FLD_PAR79_RONASOMODAIN);
    PAN_PAR.SetMasterTable(0, "PAR79");
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_PAR.Status() == 2)
    {
      int oldListQBE = PAN_PAR.iUseListQBE;
      PAN_PAR.iUseListQBE = 0;
      PAN_PAR.PanelCommand(Glb.PCM_SEARCH);
      PAN_PAR.PanelCommand(Glb.PCM_FIND);
      PAN_PAR.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_DISTINVERSAM_Init()
  {

    PAN_DISTINVERSAM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_DISTINVERSAM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_DISTINVERSAM.SetSize(MyGlb.OBJ_FIELD, 11);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, "758031CF-621C-44B0-98ED-C243153AE271");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, "Debitore");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, "");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, "FB01BC5D-CDB8-4406-9345-7E40EA0E22B1");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, "NUMERO ACCERTAMENTO");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, "");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, "BE65D38A-4D3D-41BF-BB1F-1B85A84E6C04");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, "ANNO ACCERTAMENTO");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, "");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, "309836ED-33FA-490F-BAD2-E9724DAA96B2");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, "Info Acc");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, "If (not (Is Null (MOVIMENTI CASSE GC4 ANNO ACCERTAMENTO)), Info, \"\")");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.VIS_HYPELINKIMMA);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, "F913BE4E-691B-4ED1-8BAF-10398C60123A");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, "CAPITOLO");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, "");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, "93AD7D2A-BC6B-41A5-879C-054D812DD4C6");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, "ARTICOLO");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, "");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, "E5C0F3E7-580F-49A0-A905-090C8EEB3002");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, "Info Voce Peg");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, "If (not (Is Null (MOVIMENTI CASSE GC4 CAPITOLO)), Info, \"\")");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.VIS_HYPELINKIMMA);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, "880B2DF4-8C4E-4299-8FE7-5E15C83E9035");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, "Importo");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, "");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, "97A17DC9-7750-462B-ACAE-D6D64E970261");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, "Ordinativo");
    PAN_DISTINVERSAM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, "String, To String (PRE NUMERO ORD) +c slash +c To String (PRE ANNO ORD))");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.VIS_NORMALFIELDS);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ISOPT, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, "7E96C288-1FEB-4DF8-939B-55BD9EBCCC77");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, "Accertamento");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, MyGlb.VIS_LABEVISUSTYL);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
    PAN_DISTINVERSAM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, "C1609F74-F3B9-4C2D-9858-AED3C6A79E75");
    PAN_DISTINVERSAM.set_Header(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, "Capitolo/Art.");
    PAN_DISTINVERSAM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, MyGlb.VIS_LABEVISUSTYL);
    PAN_DISTINVERSAM.SetFlags(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_INLIST, -1);
  }

  private void PAN_DISTINVERSAM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_LIST, 0, 36, 192, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_LIST, 100);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_LIST, "Debitore");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_FORM, 4, 4, 312, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_FORM, 100);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_FORM, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_DEBITORE, MyGlb.PANEL_FORM, "Debitore");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_DEBITORE, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_DEBITORE, PPQRY_MOVIMCASSGC5, "B.RAGIONE_SOCIALE_ESTESA", "REBERASOESES", 5, 60, 0, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_LIST, 192, 36, 64, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_LIST, 136);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_LIST, "NUM. ACCERT.");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_FORM, 4, 28, 180, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_FORM, 136);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_FORM, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_NUMEROACCERT, MyGlb.PANEL_FORM, "NUM. ACCERTAMENTO");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_NUMEROACCERT, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_NUMEROACCERT, PPQRY_MOVIMCASSGC5, "A.NUMERO_ACCERTAMENTO", "NUMERO_ACCERTAMENTO", 1, 5, 0, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_LIST, 256, 36, 44, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_LIST, 124);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_LIST, "ANN. ACC.");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_FORM, 4, 52, 168, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_FORM, 124);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_FORM, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ANNOACCERTAM, MyGlb.PANEL_FORM, "ANN. ACCERTAMENTO");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_ANNOACCERTAM, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_ANNOACCERTAM, PPQRY_MOVIMCASSGC5, "A.ANNO_ACCERTAMENTO", "ANNO_ACCERTAMENTO", 1, 4, 0, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_LIST, 300, 36, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_LIST, 48);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_LIST, "Inf. Acc");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_FORM, 4, 220, 480, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_FORM, 48);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_FORM, 2);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOACC, MyGlb.PANEL_FORM, "Info Acc");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_INFOACC, -1, -1);
    PAN_DISTINVERSAM.SetFieldUnbound(PFL_DISTINVERSAM_INFOACC, true);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_INFOACC, PPQRY_MOVIMCASSGC5, "CASE WHEN NOT ((A.ANNO_ACCERTAMENTO IS NULL)) THEN 'I' ELSE NULL END", "RECORINFOACC", 5, 99, 0, -13997);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOACC, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_LIST, 328, 36, 116, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_LIST, 60);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_LIST, "CAPITOLO");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_FORM, 4, 100, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_FORM, 60);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITOLO, MyGlb.PANEL_FORM, "CAPIT.");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_CAPITOLO, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_CAPITOLO, PPQRY_MOVIMCASSGC5, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_LIST, 444, 36, 32, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_LIST, 60);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_LIST, "ART.");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_FORM, 4, 124, 104, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_FORM, 60);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ARTICOLO, MyGlb.PANEL_FORM, "ARTIC.");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_ARTICOLO, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_ARTICOLO, PPQRY_MOVIMCASSGC5, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_LIST, 476, 36, 28, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_LIST, 76);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_LIST, "I. V. P.");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_FORM, 4, 268, 508, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_FORM, 76);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_FORM, 2);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_INFOVOCEPEG, MyGlb.PANEL_FORM, "Info Voce Peg");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_INFOVOCEPEG, -1, -1);
    PAN_DISTINVERSAM.SetFieldUnbound(PFL_DISTINVERSAM_INFOVOCEPEG, true);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_INFOVOCEPEG, PPQRY_MOVIMCASSGC5, "CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END", "RECINFVOCPEG", 5, 99, 0, -13997);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_DISTINVERSAM.SetValueListItem(PFL_DISTINVERSAM_INFOVOCEPEG, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_LIST, 504, 36, 84, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_LIST, 56);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_LIST, "Importo");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_FORM, 56);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_FORM, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_IMPORTO, MyGlb.PANEL_FORM, "Importo");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_IMPORTO, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_IMPORTO, PPQRY_MOVIMCASSGC5, "A.IMPORTO", "IMPORTO", 3, 15, 2, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_LIST, 588, 36, 140, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_LIST, 60);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_LIST, 1);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_LIST, "Ordinativo");
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_FORM, 4, 172, 492, 44, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_FORM, 60);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_FORM, 2);
    PAN_DISTINVERSAM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ORDINATIVO, MyGlb.PANEL_FORM, "Ordin.");
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_ORDINATIVO, -1, -1);
    PAN_DISTINVERSAM.SetFieldUnbound(PFL_DISTINVERSAM_ORDINATIVO, true);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_ORDINATIVO, PPQRY_MOVIMCASSGC5, "CASE WHEN (C.ANNO_PRE IS NULL) OR C.ANNO_PRE = 9999 THEN '' ELSE TO_CHAR ( C.NUMERO_ORD ) || '/' || TO_CHAR ( C.ANNO_ORD ) END", "RECORDORDINA", 5, 99, 0, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, MyGlb.PANEL_LIST, 192, 0, 136, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, MyGlb.PANEL_LIST, 0);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, MyGlb.PANEL_LIST, 2);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, MyGlb.PANEL_FORM, 192, 0, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, MyGlb.PANEL_FORM, 0);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_ACCERTALABEL, MyGlb.PANEL_FORM, 2);
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_ACCERTALABEL, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_ACCERTALABEL, -1, "", "ACCERTALABEL", 0, 0, 0, -13997);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, MyGlb.PANEL_LIST, 328, 0, 176, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, MyGlb.PANEL_LIST, 0);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, MyGlb.PANEL_LIST, 2);
    PAN_DISTINVERSAM.SetRect(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, MyGlb.PANEL_FORM, 200, 8, 108, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_DISTINVERSAM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, MyGlb.PANEL_FORM, 0);
    PAN_DISTINVERSAM.SetNumRow(MyGlb.OBJ_FIELD, PFL_DISTINVERSAM_CAPITARTLABE, MyGlb.PANEL_FORM, 2);
    PAN_DISTINVERSAM.SetFieldPage(PFL_DISTINVERSAM_CAPITARTLABE, -1, -1);
    PAN_DISTINVERSAM.SetFieldPanel(PFL_DISTINVERSAM_CAPITARTLABE, -1, "", "CAPITARTLABE", 0, 0, 0, -13997);
  }

  private void PAN_DISTINVERSAM_InitQueries()
  {
    StringBuffer SQL;

    PAN_DISTINVERSAM.SetSize(MyGlb.OBJ_QUERY, 1);
    PAN_DISTINVERSAM.SetIMDB(IMDB, "PQRY_MOVIMCASSGC5", true);
    PAN_DISTINVERSAM.set_SetString(MyGlb.MASTER_ROWNAME, "Record");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA as REBERASOESES, ");
    SQL.append("  A.NUMERO_ACCERTAMENTO as NUMERO_ACCERTAMENTO, ");
    SQL.append("  A.ANNO_ACCERTAMENTO as ANNO_ACCERTAMENTO, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  A.IMPORTO as IMPORTO, ");
    SQL.append("  CASE WHEN (C.ANNO_PRE IS NULL) OR C.ANNO_PRE = 9999 THEN '' ELSE TO_CHAR ( C.NUMERO_ORD ) || '/' || TO_CHAR ( C.ANNO_ORD ) END as RECORDORDINA, ");
    SQL.append("  CASE WHEN NOT ((A.ANNO_ACCERTAMENTO IS NULL)) THEN 'I' ELSE NULL END as RECORINFOACC, ");
    SQL.append("  CASE WHEN NOT ((A.CAPITOLO IS NULL)) THEN 'I' ELSE NULL END as RECINFVOCPEG ");
    PAN_DISTINVERSAM.SetQuery(PPQRY_MOVIMCASSGC5, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  MOVIMENTI_CASSE_GC4 A, ");
    SQL.append("  BEN B, ");
    SQL.append("  PRE C ");
    PAN_DISTINVERSAM.SetQuery(PPQRY_MOVIMCASSGC5, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ANNO_DISTINTA_VI = ~~PQRY_PAR77.ROWNAMANNDIS~~) ");
    SQL.append("and   (A.NUMERO_DISTINTA_VI = ~~PQRY_PAR77.ROWNAMNUMDIS~~) ");
    SQL.append("and   (~~PQRY_PAR77.RONASOMODAIN~~ <> 'SI' OR (~~PQRY_PAR77.RONASOMODAIN~~ = 'SI' AND (A.ANNO_PRE IS NULL))) ");
    SQL.append("and   (A.ANNO_PRE = C.ANNO_PRE(+)) ");
    SQL.append("and   (A.NUMERO_PRE = C.NUMERO_PRE(+)) ");
    SQL.append("and   (B.CODICE = A.PROGR_ECONOMO) ");
    PAN_DISTINVERSAM.SetQuery(PPQRY_MOVIMCASSGC5, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINVERSAM.SetQuery(PPQRY_MOVIMCASSGC5, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_DISTINVERSAM.SetQuery(PPQRY_MOVIMCASSGC5, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO, ");
    SQL.append("  A.ANNO_ACCERTAMENTO, ");
    SQL.append("  A.NUMERO_ACCERTAMENTO, ");
    SQL.append("  B.RAGIONE_SOCIALE_ESTESA ");
    PAN_DISTINVERSAM.SetQuery(PPQRY_MOVIMCASSGC5, 5, SQL, -1, "");
    PAN_DISTINVERSAM.SetQueryDB(PPQRY_MOVIMCASSGC5, MainFrm.Cf4armDBObject.DB, 4);
    PAN_DISTINVERSAM.SetMasterTable(0, "MOVIMENTI_CASSE_GC4");
    PAN_DISTINVERSAM.AddToSortList(PFL_DISTINVERSAM_CAPITOLO, true);
    PAN_DISTINVERSAM.AddToSortList(PFL_DISTINVERSAM_ARTICOLO, true);
    PAN_DISTINVERSAM.AddToSortList(PFL_DISTINVERSAM_ANNOACCERTAM, true);
    PAN_DISTINVERSAM.AddToSortList(PFL_DISTINVERSAM_NUMEROACCERT, true);
    PAN_DISTINVERSAM.AddToSortList(PFL_DISTINVERSAM_DEBITORE, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_DISTINVERSAM.Status() == 2)
    {
      int oldListQBE = PAN_DISTINVERSAM.iUseListQBE;
      PAN_DISTINVERSAM.iUseListQBE = 0;
      PAN_DISTINVERSAM.PanelCommand(Glb.PCM_SEARCH);
      PAN_DISTINVERSAM.PanelCommand(Glb.PCM_FIND);
      PAN_DISTINVERSAM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_DISTINVERSAM) PAN_DISTINVERSAM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_ValidateRow(Cancel);
    if (SrcObj == PAN_DISTINVERSAM) PAN_DISTINVERSAM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_DynamicProperties();
    if (SrcObj == PAN_DISTINVERSAM) PAN_DISTINVERSAM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_PAR) PAN_PAR_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_DISTINVERSAM) PAN_DISTINVERSAM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_PAR) PAN_PAR_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_DISTINVERSAM) PAN_DISTINVERSAM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
