// **********************************************
// Capitoli Fuori Struttura
// Project : Cfa
// **********************************************

import com.progamma.is.*;
import com.progamma.*;
import com.progamma.idre.*;
import com.progamma.doc.*;

import java.io.*;
import java.util.*;
import java.sql.*;


public final class CapitoliFuoriStruttura extends MyWebForm implements Serializable
{  
  MyWebEntryPoint MainFrm;
  
  // Frame constant definitions
  private static int PFL_CAPFUOSTREFF_ESERCIZIO1 = 0;
  private static int PFL_CAPFUOSTREFF_ES1 = 1;
  private static int PFL_CAPFUOSTREFF_CAPITOLO1 = 2;
  private static int PFL_CAPFUOSTREFF_ARTICOLO1 = 3;
  private static int PFL_CAPFUOSTREFF_CAPFSDESCRI1 = 4;
  private static int PFL_CAPFUOSTREFF_APRICAPITOL2 = 5;
  private static int PFL_CAPFUOSTREFF_STNINICO4 = 6;
  private static int PFL_CAPFUOSTREFF_STNINICO5 = 7;
  private static int PFL_CAPFUOSTREFF_STNINICO6 = 8;
  private static int PFL_CAPFUOSTREFF_PREVISIONE1 = 9;

  private static int PPQRY_BILFS1 = 0;

  private static int PPQRY_CAP = 1;


  IDPanel PAN_CAPFUOSTREFF;
  private static int PFL_CAPFUOSTRSIM_ESERCIZIO = 0;
  private static int PFL_CAPFUOSTRSIM_ES = 1;
  private static int PFL_CAPFUOSTRSIM_CAPITOLO = 2;
  private static int PFL_CAPFUOSTRSIM_ARTICOLO = 3;
  private static int PFL_CAPFUOSTRSIM_CAPFSDESCRIZ = 4;
  private static int PFL_CAPFUOSTRSIM_APRICAPITO11 = 5;
  private static int PFL_CAPFUOSTRSIM_STNINICO1 = 6;
  private static int PFL_CAPFUOSTRSIM_STNINICO2 = 7;
  private static int PFL_CAPFUOSTRSIM_STNINICO3 = 8;
  private static int PFL_CAPFUOSTRSIM_PREVISIONE = 9;

  private static int PPQRY_BILFS = 0;

  private static int PPQRY_CAPFS = 1;


  IDPanel PAN_CAPFUOSTRSIM;

  // Definition of Global Variables

 
  // **********************************************
  // Inizializzatore tabelle IMDB di form
  // **********************************************
  public static void ImdbInit(IMDBObj IMDB)
  {
    Init_TBL_PARAMETRI422(IMDB);
    //
    //
    Init_PQRY_BILFS1(IMDB);
    Init_PQRY_BILFS(IMDB);
  }

  // IMDB DDL Procedures
  private static void Init_TBL_PARAMETRI422(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef3.TBL_PARAMETRI422, 4);
    IMDB.set_TblCode(IMDBDef3.TBL_PARAMETRI422, "TBL_PARAMETRI422");
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, "PARAMPARTE");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARAMPARTE,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARAPANNCHIA, "PARAPANNCHIA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARAPANNCHIA,1,52,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARATIPOBILA, "PARATIPOBILA");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARATIPOBILA,5,1,0);
    IMDB.set_FldCode(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARAMLOCKED, "PARAMLOCKED");
    IMDB.SetFldParams(IMDBDef3.TBL_PARAMETRI422,IMDBDef3.FLD_PARAMETRI422_PARAMLOCKED,5,2,0);
    IMDB.TblAddNew(IMDBDef3.TBL_PARAMETRI422, 0);
  }

  private static void Init_PQRY_BILFS1(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILFS1, 9);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILFS1, "PQRY_BILFS1");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_APRICAPITOL1, "APRICAPITOL1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_APRICAPITOL1,5,0,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_STN_INI_CO_1, "STN_INI_CO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_STN_INI_CO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_STN_INI_CO_2, "STN_INI_CO_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_STN_INI_CO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_STN_INI_CO_3, "STN_INI_CO_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_STN_INI_CO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS1,IMDBDef11.PQSL_BILFS1_PREVISIONE,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILFS1, 0);
  }

  private static void Init_PQRY_BILFS(IMDBObj IMDB)
  {
    IMDB.set_TblNumField(IMDBDef11.PQRY_BILFS, 9);
    IMDB.set_TblCode(IMDBDef11.PQRY_BILFS, "PQRY_BILFS");
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_ESERCIZIO, "ESERCIZIO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_ESERCIZIO,1,4,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_E_S, "E_S");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_E_S,5,1,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_CAPITOLO, "CAPITOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_CAPITOLO,3,16,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_ARTICOLO, "ARTICOLO");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_ARTICOLO,1,2,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_APRICAPITOL1, "APRICAPITOL1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_APRICAPITOL1,5,0,0);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_STN_INI_CO_1, "STN_INI_CO_1");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_STN_INI_CO_1,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_STN_INI_CO_2, "STN_INI_CO_2");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_STN_INI_CO_2,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_STN_INI_CO_3, "STN_INI_CO_3");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_STN_INI_CO_3,3,14,2);
    IMDB.set_FldCode(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_PREVISIONE, "PREVISIONE");
    IMDB.SetFldParams(IMDBDef11.PQRY_BILFS,IMDBDef11.PQSL_BILFS_PREVISIONE,3,14,2);
    IMDB.TblAddNew(IMDBDef11.PQRY_BILFS, 0);
  }



  // **********************************************
  // Costruttore per form multiple
  // **********************************************
  public CapitoliFuoriStruttura(MyWebEntryPoint w, IMDBObj imdb)
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
  public CapitoliFuoriStruttura()
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
    FormIdx = MyGlb.FRM_CAPIFUORSTRU;
    //
    if (flMulti)
      MainFrm.AddMultipleForm(this, flSubForm);
    //
    boolean oldIQ = MainFrm.InitializingQueries;
    MainFrm.InitializingQueries = true;
    //
    RTCGuid = "7F42D126-B6BE-461A-9590-7C0C5317154B";
    ResModeW = 1;
    ResModeH = 1;
    iVisualFlags = -2049;
    DesignWidth = 876;
    DesignHeight = 702;
    set_Caption(new IDVariant("Capitoli Fuori Struttura"));
    //
    Frames = new AFrame[4];
    Frames[1] = new AFrame(1);
    Frames[1].Parent = this;
    Frames[1].Width = 876;
    Frames[1].Height = 676;
    Frames[1].Vertical = true;
    Frames[1].FormFactor = 0.497041;
    Frames[2] = new AFrame(2);
    Frames[2].Parent = this;
    Frames[1].ChildFrame1 = Frames[2];
    Frames[2].Width = 876;
    Frames[2].Height = 336;
    Frames[2].Caption = "Capitoli Fuori Struttura ";
    Frames[2].Parent = this;
    Frames[2].FixedHeight = 336;
    PAN_CAPFUOSTREFF = new IDPanel(w, this, 2, "PAN_CAPFUOSTREFF");
    Frames[2].Content = PAN_CAPFUOSTREFF;
    PAN_CAPFUOSTREFF.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPFUOSTREFF.VS = MainFrm.VisualStyleList;
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 336-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "01068E98-57F7-4196-B382-CB415E780603");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 820, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPFUOSTREFF.InitStatus = 1;
    PAN_CAPFUOSTREFF_Init();
    PAN_CAPFUOSTREFF_InitFields();
    PAN_CAPFUOSTREFF_InitQueries();
    Frames[3] = new AFrame(3);
    Frames[3].Parent = this;
    Frames[1].ChildFrame2 = Frames[3];
    Frames[3].Width = 876;
    Frames[3].Height = 340;
    Frames[3].Caption = "Capitoli Fuori Struttura ";
    Frames[3].Parent = this;
    Frames[3].FixedHeight = 340;
    PAN_CAPFUOSTRSIM = new IDPanel(w, this, 3, "PAN_CAPFUOSTRSIM");
    Frames[3].Content = PAN_CAPFUOSTRSIM;
    PAN_CAPFUOSTRSIM.set_VisualFlag(Glb.PANVISPROP_HILITEROW,true);
    PAN_CAPFUOSTRSIM.VS = MainFrm.VisualStyleList;
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_RECT, 0, 0, 0, 0, 876-MyGlb.PAN_OFFS_X, 340-MyGlb.PAN_OFFS_Y, 0, 0);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_PANEL, 0, "A86F6117-83AC-4A57-9C0E-CAD56D04C11A");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_PANEL, 0, 0, 0, 0, 820, 236, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_STRETCH);
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_PANEL, 0, MyGlb.VIS_DEFAPANESTYL);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_PANEL, 0, 0, 32);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_PANEL, 0, MainFrm.GlbPanelFlags | MyGlb.PAN_SCROLLREC | MyGlb.PAN_HASLIST | MyGlb.PAN_CANDELETE | MyGlb.PAN_CANUPDATE | MyGlb.PAN_CANSELECT | MyGlb.PAN_CANINSERT | MyGlb.OBJ_VISIBLE | MyGlb.OBJ_ENABLED, -1);
    PAN_CAPFUOSTRSIM.InitStatus = 1;
    PAN_CAPFUOSTRSIM_Init();
    PAN_CAPFUOSTRSIM_InitFields();
    PAN_CAPFUOSTRSIM_InitQueries();
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
      PAN_CAPFUOSTREFF.UpdatePanel(MainFrm);
      PAN_CAPFUOSTRSIM.UpdatePanel(MainFrm);
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
    if (CallerIdx == MyGlb.FRM_SCELTCAPITFS && flRis && IdxPanelActived == PAN_CAPFUOSTREFF.FrIndex)
    {
      if (IdxFieldActived ==PFL_CAPFUOSTREFF_APRICAPITOL2) {
      }
    }
    if (CallerIdx == MyGlb.FRM_SCELTCAPITFS && flRis && IdxPanelActived == PAN_CAPFUOSTRSIM.FrIndex)
    {
      if (IdxFieldActived ==PFL_CAPFUOSTRSIM_APRICAPITO11) {
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
    return (obj instanceof CapitoliFuoriStruttura);
  }

  // **********************************************
  // Restituisce il nome della classe
  // **********************************************
  public static String GetClassName(boolean FullName)
  {
    return (FullName ? CapitoliFuoriStruttura.class.getName() : (Glb.ClassWithPackage(CapitoliFuoriStruttura.class) ? CapitoliFuoriStruttura.class.getName().substring(CapitoliFuoriStruttura.class.getPackage().getName().length() + 1) : CapitoliFuoriStruttura.class.getName()));
  }
  

  // **********************************************
  // Procedure Definition
  // **********************************************  
  // **********************************************************************
  // Load
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
      // Load Body
      // Corpo Procedura
      // 
      IDVariant v_STANZIAMENTO = new IDVariant(0,IDVariant.STRING);
      v_STANZIAMENTO = (new IDVariant("Stanziamento "));
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARATIPOBILA, 0).equals((new IDVariant("E")), true))
      {
        PAN_CAPFUOSTREFF.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_CAPFUOSTRSIM.set_Visible((new IDVariant(0)).booleanValue());
        PAN_CAPFUOSTREFF.set_Header(Glb.OBJ_FIELD,PFL_CAPFUOSTREFF_STNINICO4, IDL.Add(v_STANZIAMENTO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_CAPFUOSTREFF.set_Header(Glb.OBJ_FIELD,PFL_CAPFUOSTREFF_STNINICO5, IDL.Add(v_STANZIAMENTO, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_CAPFUOSTREFF.set_Header(Glb.OBJ_FIELD,PFL_CAPFUOSTREFF_STNINICO6, IDL.Add(v_STANZIAMENTO, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_CAPFUOSTREFF.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      }
      else
      {
        PAN_CAPFUOSTREFF.set_Visible((new IDVariant(0)).booleanValue());
        PAN_CAPFUOSTRSIM.set_Visible((new IDVariant(-1)).booleanValue());
        PAN_CAPFUOSTRSIM.set_Header(Glb.OBJ_FIELD,PFL_CAPFUOSTRSIM_STNINICO1, IDL.Add(v_STANZIAMENTO, IDL.ToString(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0))).stringValue());
        PAN_CAPFUOSTRSIM.set_Header(Glb.OBJ_FIELD,PFL_CAPFUOSTRSIM_STNINICO2, IDL.Add(v_STANZIAMENTO, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(1))))).stringValue());
        PAN_CAPFUOSTRSIM.set_Header(Glb.OBJ_FIELD,PFL_CAPFUOSTRSIM_STNINICO3, IDL.Add(v_STANZIAMENTO, IDL.ToString(IDL.Add(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), (new IDVariant(2))))).stringValue());
        PAN_CAPFUOSTRSIM.SetFlags (Glb.OBJ_PANEL, 0, ((new IDVariant(-1)).booleanValue())? Glb.PAN_NEWINSMODE : 0, Glb.PAN_NEWINSMODE); 
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMLOCKED, 0).equals((new IDVariant("SI")), true))
      {
        PAN_CAPFUOSTREFF.set_Locked((new IDVariant(-1)).booleanValue());
        PAN_CAPFUOSTRSIM.set_Locked((new IDVariant(-1)).booleanValue());
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "Load", _e);
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
      if (LookupForm.equals((new IDVariant(MyGlb.FRM_SCELTCAPITFS)), true) && Result.booleanValue())
      {
        if (IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARATIPOBILA, 0).equals((new IDVariant("E")), true))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSESERCIZ, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_E_S, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSES, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSCAPITOL, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSARTICOL, 0));
        }
        else
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_ESERCIZIO, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSESERCIZ, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_E_S, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSES, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_CAPITOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSCAPITOL, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_ARTICOLO, 0, IMDB.Value(IMDBDef7.PQRY_CAPFS, IMDBDef7.PQSL_CAPFS_CAPFSARTICOL, 0));
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "EndModal", _e);
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
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "Unload", _e);
    }
  }

  // **********************************************************************
  // Parametri: Delete
  // Perchè stai eliminando questi dati?
  // **********************************************************************
  private void UNLOAD_PARAMEDELETE() throws SQLException
  {
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAPANNCHIA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARATIPOBILA, 0, new IDVariant());
    IMDB.set_Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMLOCKED, 0, new IDVariant());
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Effettivo On Dynamic Properties
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPFUOSTREFF_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAPFUOSTREFF);
      // 
      // Capitoli Fuori Struttura Effettivo On Dynamic Properties Body
      // Corpo Procedura
      // 
      if (PAN_CAPFUOSTREFF.IsNewRow())
      {
        PAN_CAPFUOSTREFF.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CAPFUOSTREFF.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CAPFUOSTREFF.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CAPFUOSTREFF.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CAPFUOSTREFF.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPFUOSTREFF_CAPFSDESCRI1,(new IDVariant(PAN_CAPFUOSTREFF.FieldText(PFL_CAPFUOSTREFF_CAPFSDESCRI1))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaEffettivoOnDynamicProperties", _e);
    }
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Effettivo On Updating Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CAPFUOSTREFF_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Fuori Struttura Effettivo On Updating Row Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_ESERCIZIO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_E_S, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_E_S, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_APRICAPITOL1, 0, (new IDVariant("A")));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
        }
      }
      if ((Column.equals((new IDVariant(PFL_CAPFUOSTREFF_CAPITOLO1)), true) || Column.equals((new IDVariant(PFL_CAPFUOSTREFF_ARTICOLO1)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_ARTICOLO, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP_FS A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Capitolo non presente"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_CAPITOLO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_BILFS1, IMDBDef11.PQSL_BILFS1_ARTICOLO, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaEffettivoOnUpdatingRow", _e);
    }
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Effettivo On Change Status
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_CAPFUOSTREFF_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Fuori Struttura Effettivo On Change Status Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CAPFUOSTREFF.Status()).equals((new IDVariant(2)), true))
      {
      }
      else
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaEffettivoOnChangeStatus", _e);
    }
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Effettivo After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_CAPFUOSTREFF_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Fuori Struttura Effettivo After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_CAPFUOSTREFF.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaEffettivoAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Simulato On Dynamic Properties 1
  // Consente l'aggiustamento delle proprietà visuali delle
  // singole celle del pannello.
  // **********************************************************************
  private void PAN_CAPFUOSTRSIM_DynamicProperties ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      MainFrm.DynamicProperties(PAN_CAPFUOSTRSIM);
      // 
      // Capitoli Fuori Struttura Simulato On Dynamic Properties 1 Body
      // Corpo Procedura
      // 
      if (PAN_CAPFUOSTRSIM.IsNewRow())
      {
        PAN_CAPFUOSTRSIM.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CAPFUOSTRSIM.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, ((new IDVariant(-1)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      else
      {
        PAN_CAPFUOSTRSIM.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
        PAN_CAPFUOSTRSIM.SetFlags (Glb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, ((new IDVariant(0)).booleanValue())? Glb.OBJ_ENABLED : 0, Glb.OBJ_ENABLED); 
      }
      PAN_CAPFUOSTRSIM.set_ToolTip(Glb.OBJ_FIELD,PFL_CAPFUOSTRSIM_CAPFSDESCRIZ,(new IDVariant(PAN_CAPFUOSTRSIM.FieldText(PFL_CAPFUOSTRSIM_CAPFSDESCRIZ))).stringValue()); 
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaSimulatoOnDynamicProperties1", _e);
    }
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Simulato On Updating Row 1
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // Column - Input
  // Field Modified - Input
  // Field Was Modified - Input
  // Row Was Modified - Input
  // Inserting - Input
  // Cancel - Input/Output
  // **********************************************************************
  private void PAN_CAPFUOSTRSIM_OnUpdatingRow(IDVariant Column, IDVariant FieldModified, IDVariant FieldWasModified, IDVariant RowWasModified, IDVariant Inserting, IDVariant Cancel)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Fuori Struttura Simulato On Updating Row 1 Body
      // Corpo Procedura
      // 
      if (Inserting.booleanValue())
      {
        if (IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_ESERCIZIO, 0)) || IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_E_S, 0)))
        {
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_ESERCIZIO, 0, IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_E_S, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, 0));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_PREVISIONE, 0, (new IDVariant(0, IDVariant.DECIMAL)));
          IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_APRICAPITOL1, 0, (new IDVariant("A")));
        }
      }
      if ((Column.equals((new IDVariant(PFL_CAPFUOSTRSIM_CAPITOLO)), true) || Column.equals((new IDVariant(PFL_CAPFUOSTRSIM_ARTICOLO)), true)) && FieldWasModified.booleanValue())
      {
        if (!(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_CAPITOLO, 0))) && !(IDL.IsNull(IMDB.Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_ARTICOLO, 0))))
        {
          IDVariant v_VCOUNT = new IDVariant(0,IDVariant.INTEGER);
          SQL = new StringBuffer();
          SQL.append("select ");
          SQL.append("  COUNT(*) as COUNT1 ");
          SQL.append("from ");
          SQL.append("  CAP_FS A ");
          SQL.append("where (A.ESERCIZIO = " + IDL.CSql(IMDB.Value(IMDBDef7.TBL_DATISESSIONE, IMDBDef7.FLD_DATISESSIONE_SESSIOESERCI, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.E_S = " + IDL.CSql(IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, 0), IDL.FMT_CHAR, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.CAPITOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_CAPITOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          SQL.append("and   (A.ARTICOLO = " + IDL.CSql(IMDB.Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_ARTICOLO, 0), IDL.FMT_NUM, MainFrm.Cf4armDBObject.DBO()) + ") ");
          QV = MainFrm.Cf4armDBObject.DBO().OpenRS(SQL);
          if (!QV.EOF()) QV.MoveNext();
          if (!QV.EOF())
          {
            v_VCOUNT = QV.Get("COUNT1", IDVariant.INTEGER) ;
          }
          QV.Close();
          if (v_VCOUNT.equals((new IDVariant(0)), true))
          {
            IDVariant v_AVVISO = new IDVariant(0,IDVariant.STRING);
            v_AVVISO = (new IDVariant("Capitolo non presente"));
            MainFrm.set_AlertMessage(v_AVVISO); 
            IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_CAPITOLO, 0, (new IDVariant()));
            IMDB.set_Value(IMDBDef11.PQRY_BILFS, IMDBDef11.PQSL_BILFS_ARTICOLO, 0, (new IDVariant()));
          }
        }
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaSimulatoOnUpdatingRow1", _e);
    }
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Simulato On Change Status 1
  // Evento notificato dal pannello ad ogni cambiamento
  // di stato dello stesso.
  // Old Status - Input
  // **********************************************************************
  private void PAN_CAPFUOSTRSIM_OnChangeStatus(IDVariant OldStatus)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Fuori Struttura Simulato On Change Status 1 Body
      // Corpo Procedura
      // 
      if (new IDVariant(PAN_CAPFUOSTRSIM.Status()).equals((new IDVariant(2)), true))
      {
      }
      else
      {
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaSimulatoOnChangeStatus1", _e);
    }
  }

  // **********************************************************************
  // Capitoli Fuori Struttura Simulato After Commit
  // Evento notificato dal pannello al termine del ciclo
  // di salvataggio dei dati.
  // Rows Updated - Input
  // Rows In Errors - Input
  // **********************************************************************
  private void PAN_CAPFUOSTRSIM_AfterCommit(IDVariant RowsUpdated,IDVariant RowsInErrors)
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Capitoli Fuori Struttura Simulato After Commit Body
      // Corpo Procedura
      // 
      if (RowsInErrors.equals((new IDVariant(0)), true))
      {
        PAN_CAPFUOSTRSIM.PanelCommand(Glb.PCM_REQUERY);
      }
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "CapitoliFuoriStrutturaSimulatoAfterCommit", _e);
    }
  }

  // **********************************************************************
  // Apri Scelta Capitoli FS
  // **********************************************************************
  public int ApriSceltaCapitoliFS ()
  {
    StringBuffer SQL = new StringBuffer();
    int TransCount   = 0;
    int ReturnStatus = 0;
    IDCachedRowSet QV;

    try
    {
      TransCount = 0;
      // 
      // Apri Scelta Capitoli FS Body
      // Corpo Procedura
      // 
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMLOCKED, 0).equals((new IDVariant("SI")), true))
      {
        return 0;
      }
      if (IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARATIPOBILA, 0).equals((new IDVariant("E")), true))
      {
        if (PAN_CAPFUOSTREFF.IsNewRow())
        {
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI427, IMDBDef1.FLD_PARAMETRI427_PARAMPARTE, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, 0));
          MainFrm.Show(MyGlb.FRM_SCELTCAPITFS, (new IDVariant(1)).intValue(), this); 
        }
      }
      else
      {
        if (PAN_CAPFUOSTRSIM.IsNewRow())
        {
          IMDB.set_Value(IMDBDef1.TBL_PARAMETRI427, IMDBDef1.FLD_PARAMETRI427_PARAMPARTE, 0, IMDB.Value(IMDBDef3.TBL_PARAMETRI422, IMDBDef3.FLD_PARAMETRI422_PARAMPARTE, 0));
          MainFrm.Show(MyGlb.FRM_SCELTCAPITFS, (new IDVariant(1)).intValue(), this); 
        }
      }
      return 0;
    }
    catch (Exception _e)
    {
      MainFrm.ErrObj.ProcError ("CapitoliFuoriStruttura", "ApriSceltaCapitoliFS", _e);
      return -1;
    }
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
  private void PAN_CAPFUOSTREFF_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPFUOSTREFF, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPFUOSTREFF_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPFUOSTREFF, Cancel);
    // Stub
  }

  private void PAN_CAPFUOSTREFF_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CAPFUOSTREFF_APRICAPITOL2)
    {
      this.IdxPanelActived = this.PAN_CAPFUOSTREFF.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCapitoliFS();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CAPFUOSTREFF_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CAPFUOSTREFF_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CAPFUOSTREFF_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPFUOSTREFF_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  // **********************************************************************
  // On Database Error
  // Evento notificato dal pannello al verificarsi di un
  // errore di database durante un'operazione di salvataggio
  // dei dati.
  // **********************************************************************
  private void PAN_CAPFUOSTRSIM_OnDBError(IDVariant Cancel, IDVariant Skip, IDVariant ErrorNumber, IDVariant ErrorMessage, IDVariant NativeErrorNumber, IDVariant PanelOperation, com.progamma.doc.IDDocument Doc)
  {
      MainFrm.OnDBError(PAN_CAPFUOSTRSIM, Cancel, Skip, ErrorNumber, ErrorMessage, NativeErrorNumber, PanelOperation, Doc);
    // Stub
  }

  // **********************************************************************
  // On Validate Row
  // Evento notificato dal pannello quando un utente modifica
  // i dati presenti nel pannello
  // **********************************************************************
  private void PAN_CAPFUOSTRSIM_IntValidateRow (IDVariant Cancel)
  {
      MainFrm.IntValidateRow(PAN_CAPFUOSTRSIM, Cancel);
    // Stub
  }

  private void PAN_CAPFUOSTRSIM_CellActivated(IDVariant ColIndex, IDVariant Cancel)
  {
    int i = 0;
    if (ColIndex.intValue() == PFL_CAPFUOSTRSIM_APRICAPITO11)
    {
      this.IdxPanelActived = this.PAN_CAPFUOSTRSIM.FrIndex;
      this.IdxFieldActived = ColIndex.intValue();
      ApriSceltaCapitoliFS();
      Cancel.set(IDVariant.TRUE);
    }
  }

  private void PAN_CAPFUOSTRSIM_ValidateCell(IDVariant ColIndex, IDVariant CellModified, IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    try
    {
      PAN_CAPFUOSTRSIM_OnUpdatingRow(ColIndex, CellModified, FldWasModified, RowWasModified, IsInsert, Cancel);
    }
    catch(Exception e) {}
  }

  private void PAN_CAPFUOSTRSIM_ValidateRow(IDVariant Cancel)
  {
    try
    {
      if (Cancel.isFalse())
      {
        PAN_CAPFUOSTRSIM_IntValidateRow(Cancel);
      }
    } catch ( Exception e) { }
  }

  
  
  // **********************************************
  // Panel (long) initialization
  // **********************************************
  private void PAN_CAPFUOSTREFF_Init()
  {

    PAN_CAPFUOSTREFF.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPFUOSTREFF.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPFUOSTREFF.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, "94719F7B-3BFD-4832-8472-214E1CF12434");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, "ESERCIZIO");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, "9F677C95-1314-4813-ADC5-7B217151FD70");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, "E S");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, "E4359932-1158-4CA9-A87A-04D330A9BE34");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, "Capitolo");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.VIS_NORFIEINTLUN);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, "4CF726BB-3DA3-4BC6-B554-8A29DE85B9E5");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, "Art.");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, "6F67D84B-0520-41C0-9D12-800E9793122A");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, "Descrizione");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, "6D14031F-2CA1-4AFE-A1C1-69E7254E3B2C");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, " ");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, "38359A22-A9ED-4538-B7CA-2D64E87C7F9D");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, "STN INI CO 1");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, "815B917C-3067-41B9-B28E-029BD061AC54");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, "STN INI CO 2");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, "122410EF-791F-4F45-B5B5-C110EA73068A");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, "STN INI CO 3");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CAPFUOSTREFF.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, "92D41237-7D76-4D6D-9821-5D6DC8946397");
    PAN_CAPFUOSTREFF.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, "PREVISIONE");
    PAN_CAPFUOSTREFF.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, "");
    PAN_CAPFUOSTREFF.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.VIS_NONNULLAFIEL);
    PAN_CAPFUOSTREFF.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, 0, -1);
  }

  private void PAN_CAPFUOSTREFF_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_LIST, 68);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ESERCIZIO1, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_ESERCIZIO1, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_ESERCIZIO1, PPQRY_BILFS1, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_LIST, 24);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_LIST, "E S");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ES1, MyGlb.PANEL_FORM, "E S");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_ES1, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_ES1, PPQRY_BILFS1, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_LIST, 64);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_FORM, 4, 52, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPITOLO1, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_CAPITOLO1, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_CAPITOLO1, PPQRY_BILFS1, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_LIST, 120, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_LIST, 68);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_LIST, "Art.");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_ARTICOLO1, MyGlb.PANEL_FORM, "Art.");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_ARTICOLO1, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_ARTICOLO1, PPQRY_BILFS1, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_LIST, 156, 36, 284, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_LIST, 124);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_FORM, 4, 196, 484, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_FORM, 124);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_FORM, 2);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_CAPFSDESCRI1, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_CAPFSDESCRI1, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_CAPFSDESCRI1, PPQRY_CAP, "A.DESCRIZIONE", "CAPFSDESCRFS", 5, 140, 0, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_LIST, 440, 36, 20, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_LIST, " ");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_FORM, 4, 232, 188, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_FORM, 80);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_APRICAPITOL2, MyGlb.PANEL_FORM, " ");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_APRICAPITOL2, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldUnbound(PFL_CAPFUOSTREFF_APRICAPITOL2, true);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_APRICAPITOL2, PPQRY_BILFS1, "NULL", "APRICAPITOL1", 5, 0, 0, -13997);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAPFUOSTREFF.SetValueListItem(PFL_CAPFUOSTREFF_APRICAPITOL2, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_LIST, 460, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_LIST, "STN INI CO 1");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO4, MyGlb.PANEL_FORM, "STN INI CO 1");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_STNINICO4, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_STNINICO4, PPQRY_BILFS1, "A.STN_INI_CO_1", "STN_INI_CO_1", 3, 14, 2, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_LIST, 580, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_LIST, "STN INI CO 2");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO5, MyGlb.PANEL_FORM, "STN INI CO 2");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_STNINICO5, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_STNINICO5, PPQRY_BILFS1, "A.STN_INI_CO_2", "STN_INI_CO_2", 3, 14, 2, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_LIST, 700, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_LIST, "STN INI CO 3");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_STNINICO6, MyGlb.PANEL_FORM, "STN INI CO 3");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_STNINICO6, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_STNINICO6, PPQRY_BILFS1, "A.STN_INI_CO_3", "STN_INI_CO_3", 3, 14, 2, -13997);
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_LIST, 76);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_LIST, "PREVISIONE");
    PAN_CAPFUOSTREFF.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTREFF.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_FORM, 76);
    PAN_CAPFUOSTREFF.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTREFF.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTREFF_PREVISIONE1, MyGlb.PANEL_FORM, "PREVISIONE");
    PAN_CAPFUOSTREFF.SetFieldPage(PFL_CAPFUOSTREFF_PREVISIONE1, -1, -1);
    PAN_CAPFUOSTREFF.SetFieldPanel(PFL_CAPFUOSTREFF_PREVISIONE1, PPQRY_BILFS1, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
  }

  private void PAN_CAPFUOSTREFF_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPFUOSTREFF.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPFSDESCRFS ");
    SQL.append("from ");
    SQL.append("  CAP_FS A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI422.PARAMPARTE~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_CAPFUOSTREFF.SetQuery(PPQRY_CAP, 0, SQL, -1, "");
    PAN_CAPFUOSTREFF.SetQueryDB(PPQRY_CAP, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPFUOSTREFF.SetMasterTable(PPQRY_CAP, "CAP_FS");
    PAN_CAPFUOSTREFF.SetIMDB(IMDB, "PQRY_BILFS1", true);
    PAN_CAPFUOSTREFF.set_SetString(MyGlb.MASTER_ROWNAME, "BIL FS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  NULL as APRICAPITOL1, ");
    SQL.append("  A.STN_INI_CO_1 as STN_INI_CO_1, ");
    SQL.append("  A.STN_INI_CO_2 as STN_INI_CO_2, ");
    SQL.append("  A.STN_INI_CO_3 as STN_INI_CO_3, ");
    SQL.append("  A.PREVISIONE as PREVISIONE ");
    PAN_CAPFUOSTREFF.SetQuery(PPQRY_BILFS1, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BIL_FS A ");
    PAN_CAPFUOSTREFF.SetQuery(PPQRY_BILFS1, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI422.PARAMPARTE~~) ");
    PAN_CAPFUOSTREFF.SetQuery(PPQRY_BILFS1, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPFUOSTREFF.SetQuery(PPQRY_BILFS1, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPFUOSTREFF.SetQuery(PPQRY_BILFS1, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_CAPFUOSTREFF.SetQuery(PPQRY_BILFS1, 5, SQL, -1, "");
    PAN_CAPFUOSTREFF.SetQueryDB(PPQRY_BILFS1, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPFUOSTREFF.SetMasterTable(0, "BIL_FS");
    PAN_CAPFUOSTREFF.AddToSortList(PFL_CAPFUOSTREFF_CAPITOLO1, true);
    PAN_CAPFUOSTREFF.AddToSortList(PFL_CAPFUOSTREFF_ARTICOLO1, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPFUOSTREFF.Status() == 2)
    {
      int oldListQBE = PAN_CAPFUOSTREFF.iUseListQBE;
      PAN_CAPFUOSTREFF.iUseListQBE = 0;
      PAN_CAPFUOSTREFF.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPFUOSTREFF.PanelCommand(Glb.PCM_FIND);
      PAN_CAPFUOSTREFF.iUseListQBE = oldListQBE;
    }
  }

  private void PAN_CAPFUOSTRSIM_Init()
  {

    PAN_CAPFUOSTRSIM.SetSize(MyGlb.OBJ_PAGE, 0);
    PAN_CAPFUOSTRSIM.SetSize(MyGlb.OBJ_GROUP, 0);
    PAN_CAPFUOSTRSIM.SetSize(MyGlb.OBJ_FIELD, 10);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, "BF90C40F-E7DB-4757-8504-1597BDD76209");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, "ESERCIZIO");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, "A921F0B1-B4A4-444B-B4BA-F81BA991B5D8");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, "E S");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.VIS_PRIMAKEYFIEL);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, 0 | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, "55EAADF7-9E4C-4D68-8557-A2D21ED994F8");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, "Capitolo");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.VIS_NORFIEINTLUN);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, "625C5BB9-05E4-47A7-B56D-795EDE676869");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, "Art.");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE | MyGlb.FLD_ISKEY, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, "008BBF91-C8A7-4E40-8B86-3F939D4E708E");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, "Descrizione");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.VIS_NORMALFIELDS);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, "7B1335EC-30A5-4431-AF4F-3FEB147BA848");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, " ");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.VIS_HYPELINKIMMA);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, 0 | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_CANACTIVATE | MyGlb.FLD_ISOPT, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, "774C74BB-ED68-40EA-AA1F-FC237855D422");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, "STN INI CO 1");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, "3A380A0D-AE6A-48B6-8D0C-8156D1199227");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, "STN INI CO 2");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, "F0D466A4-2197-4585-9C04-283FD6FEA407");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, "STN INI CO 3");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.VIS_NORFIECF4IMP);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, 0 | MyGlb.OBJ_ENABLED | MyGlb.OBJ_VISIBLE | MyGlb.FLD_LISTLIST | MyGlb.FLD_INLIST | MyGlb.FLD_INFORM | MyGlb.FLD_ACTIVE, -1);
    PAN_CAPFUOSTRSIM.SetRTCGuid(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, "7F9C9644-9C5A-497A-9C8C-73E9ACBCF380");
    PAN_CAPFUOSTRSIM.set_Header(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, "PREVISIONE");
    PAN_CAPFUOSTRSIM.set_ToolTip(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, "");
    PAN_CAPFUOSTRSIM.set_VisualStyle(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.VIS_NONNULLAFIEL);
    PAN_CAPFUOSTRSIM.SetFlags(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, 0, -1);
  }

  private void PAN_CAPFUOSTRSIM_InitFields()
  {

    StringBuffer SQL = new StringBuffer();
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_LIST, 68);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_LIST, "ESERCIZIO");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_FORM, 4, 4, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ESERCIZIO, MyGlb.PANEL_FORM, "ESERCIZIO");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_ESERCIZIO, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_ESERCIZIO, PPQRY_BILFS, "A.ESERCIZIO", "ESERCIZIO", 1, 4, 0, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_LIST, 80, 36, 40, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_LIST, 24);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_LIST, "E S");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_FORM, 4, 28, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ES, MyGlb.PANEL_FORM, "E S");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_ES, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_ES, PPQRY_BILFS, "A.E_S", "E_S", 5, 1, 0, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_LIST, 0, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_LIST, 64);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_LIST, "Capitolo");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_FORM, 4, 52, 240, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPITOLO, MyGlb.PANEL_FORM, "Capitolo");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_CAPITOLO, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_CAPITOLO, PPQRY_BILFS, "A.CAPITOLO", "CAPITOLO", 3, 16, 0, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_LIST, 120, 36, 36, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_LIST, 68);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_LIST, "Art.");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_FORM, 4, 76, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_ARTICOLO, MyGlb.PANEL_FORM, "Art.");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_ARTICOLO, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_ARTICOLO, PPQRY_BILFS, "A.ARTICOLO", "ARTICOLO", 1, 2, 0, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_LIST, 156, 36, 280, 20, MyGlb.RESMODE_STRETCH, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_LIST, 124);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_LIST, "Descrizione");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_FORM, 4, 196, 484, 32, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_FORM, 124);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_FORM, 2);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, MyGlb.PANEL_FORM, "Descrizione");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_CAPFSDESCRIZ, PPQRY_CAPFS, "A.DESCRIZIONE", "CAPFSDESCRIZ", 5, 140, 0, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_LIST, 436, 36, 24, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_LIST, " ");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_FORM, 4, 232, 124, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_FORM, 80);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_APRICAPITO11, MyGlb.PANEL_FORM, " ");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_APRICAPITO11, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldUnbound(PFL_CAPFUOSTRSIM_APRICAPITO11, true);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_APRICAPITO11, PPQRY_BILFS, "NULL", "APRICAPITOL1", 5, 0, 0, -13997);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("A")), "Apri", "", "wsearch1.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("I")), "Info", "", "info.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("E")), "Delete", "", "wdelete.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("N")), "Nota Vuota", "", "nota bianca.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("P")), "Nota Piena", "", "nota scritta.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("S")), "Note Standard", "", "testo.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("D")), "Dettagli", "", "dettaglio.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant()), "Vuoto", "", "", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("G")), "Incolla", "", "Paste.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("F")), "RiepilogoIVA", "", "info_g.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("T")), "Download", "", "clip_sm.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("ZIP")), "ZIP", "", "zip_file.png", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("CSV")), "CSV", "", "csv.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("PAGOPA")), "PagoPA", "PagoPA", "pagopa.png", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("IMPPARZ")), "ImportoParziale", "", "varimp.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("IMPTOT")), "ImportoTotale", "", "varacc.gif", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("K")), "Note Accr", "", "signed.png", -1);
    PAN_CAPFUOSTRSIM.SetValueListItem(PFL_CAPFUOSTRSIM_APRICAPITO11, (new IDVariant("FCE")), "Fascicolo Contabile", "Fascicolo Contabile", "search_db_16.png", -1);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_LIST, 460, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_LIST, "STN INI CO 1");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_FORM, 4, 100, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO1, MyGlb.PANEL_FORM, "STN INI CO 1");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_STNINICO1, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_STNINICO1, PPQRY_BILFS, "A.STN_INI_CO_1", "STN_INI_CO_1", 3, 14, 2, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_LIST, 580, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_LIST, "STN INI CO 2");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_FORM, 4, 124, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO2, MyGlb.PANEL_FORM, "STN INI CO 2");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_STNINICO2, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_STNINICO2, PPQRY_BILFS, "A.STN_INI_CO_2", "STN_INI_CO_2", 3, 14, 2, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_LIST, 700, 36, 120, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_LIST, 80);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_LIST, "STN INI CO 3");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_FORM, 4, 148, 144, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_FORM, 96);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_STNINICO3, MyGlb.PANEL_FORM, "STN INI CO 3");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_STNINICO3, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_STNINICO3, PPQRY_BILFS, "A.STN_INI_CO_3", "STN_INI_CO_3", 3, 14, 2, -13997);
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_LIST, 0, 36, 80, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_LIST, 76);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_LIST, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_LIST, "PREVISIONE");
    PAN_CAPFUOSTRSIM.SetRect(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_FORM, 4, 196, 160, 20, MyGlb.RESMODE_NONE, MyGlb.RESMODE_NONE);
    PAN_CAPFUOSTRSIM.SetHeaderSize(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_FORM, 76);
    PAN_CAPFUOSTRSIM.SetNumRow(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_FORM, 1);
    PAN_CAPFUOSTRSIM.SetAbbrHeader(MyGlb.OBJ_FIELD, PFL_CAPFUOSTRSIM_PREVISIONE, MyGlb.PANEL_FORM, "PREVISIONE");
    PAN_CAPFUOSTRSIM.SetFieldPage(PFL_CAPFUOSTRSIM_PREVISIONE, -1, -1);
    PAN_CAPFUOSTRSIM.SetFieldPanel(PFL_CAPFUOSTRSIM_PREVISIONE, PPQRY_BILFS, "A.PREVISIONE", "PREVISIONE", 3, 14, 2, -13997);
  }

  private void PAN_CAPFUOSTRSIM_InitQueries()
  {
    StringBuffer SQL;

    PAN_CAPFUOSTRSIM.SetSize(MyGlb.OBJ_QUERY, 2);
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.DESCRIZIONE as CAPFSDESCRIZ ");
    SQL.append("from ");
    SQL.append("  CAP_FS A ");
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI422.PARAMPARTE~~) ");
    SQL.append("and   (A.CAPITOLO = ~~CAPITOLO~~) ");
    SQL.append("and   (A.ARTICOLO = ~~ARTICOLO~~) ");
    PAN_CAPFUOSTRSIM.SetQuery(PPQRY_CAPFS, 0, SQL, -1, "");
    PAN_CAPFUOSTRSIM.SetQueryDB(PPQRY_CAPFS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPFUOSTRSIM.SetMasterTable(PPQRY_CAPFS, "CAP_FS");
    PAN_CAPFUOSTRSIM.SetIMDB(IMDB, "PQRY_BILFS", true);
    PAN_CAPFUOSTRSIM.set_SetString(MyGlb.MASTER_ROWNAME, "BIL FS");
    SQL = new StringBuffer();
    SQL.append("select ");
    SQL.append("  A.ESERCIZIO as ESERCIZIO, ");
    SQL.append("  A.E_S as E_S, ");
    SQL.append("  A.CAPITOLO as CAPITOLO, ");
    SQL.append("  A.ARTICOLO as ARTICOLO, ");
    SQL.append("  NULL as APRICAPITOL1, ");
    SQL.append("  A.STN_INI_CO_1 as STN_INI_CO_1, ");
    SQL.append("  A.STN_INI_CO_2 as STN_INI_CO_2, ");
    SQL.append("  A.STN_INI_CO_3 as STN_INI_CO_3, ");
    SQL.append("  A.PREVISIONE as PREVISIONE ");
    PAN_CAPFUOSTRSIM.SetQuery(PPQRY_BILFS, 0, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("from ");
    SQL.append("  BPR_FS A ");
    PAN_CAPFUOSTRSIM.SetQuery(PPQRY_BILFS, 1, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("where (A.ESERCIZIO = ~~TBL_DATISESSIONE.SESSIOESERCI~~) ");
    SQL.append("and   (A.E_S = ~~TBL_PARAMETRI422.PARAMPARTE~~) ");
    PAN_CAPFUOSTRSIM.SetQuery(PPQRY_BILFS, 2, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPFUOSTRSIM.SetQuery(PPQRY_BILFS, 3, SQL, -1, "");
    SQL = new StringBuffer();
    PAN_CAPFUOSTRSIM.SetQuery(PPQRY_BILFS, 4, SQL, -1, "");
    SQL = new StringBuffer();
    SQL.append("order by ");
    SQL.append("  A.CAPITOLO, ");
    SQL.append("  A.ARTICOLO ");
    PAN_CAPFUOSTRSIM.SetQuery(PPQRY_BILFS, 5, SQL, -1, "");
    PAN_CAPFUOSTRSIM.SetQueryDB(PPQRY_BILFS, MainFrm.Cf4armDBObject.DB, 4);
    PAN_CAPFUOSTRSIM.SetMasterTable(0, "BPR_FS");
    PAN_CAPFUOSTRSIM.AddToSortList(PFL_CAPFUOSTRSIM_CAPITOLO, true);
    PAN_CAPFUOSTRSIM.AddToSortList(PFL_CAPFUOSTRSIM_ARTICOLO, true);
    //
    // Rieseguo la query se il pannello era già in stato DATA
    if (PAN_CAPFUOSTRSIM.Status() == 2)
    {
      int oldListQBE = PAN_CAPFUOSTRSIM.iUseListQBE;
      PAN_CAPFUOSTRSIM.iUseListQBE = 0;
      PAN_CAPFUOSTRSIM.PanelCommand(Glb.PCM_SEARCH);
      PAN_CAPFUOSTRSIM.PanelCommand(Glb.PCM_FIND);
      PAN_CAPFUOSTRSIM.iUseListQBE = oldListQBE;
    }
  }

  
  
  // **********************************************
  // Panel events dispatching
  // **********************************************
  public void ValidateCell(IDPanel SrcObj, IDVariant ColIndex, IDVariant CellModified , IDVariant Cancel, IDVariant FldWasModified, IDVariant RowWasModified, IDVariant IsInsert)
  {
    if (SrcObj == PAN_CAPFUOSTREFF) PAN_CAPFUOSTREFF_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
    if (SrcObj == PAN_CAPFUOSTRSIM) PAN_CAPFUOSTRSIM_ValidateCell(ColIndex, CellModified , Cancel, FldWasModified, RowWasModified, IsInsert);
  }
  
  public void ValidateRow(IDPanel SrcObj, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPFUOSTREFF) PAN_CAPFUOSTREFF_ValidateRow(Cancel);
    if (SrcObj == PAN_CAPFUOSTRSIM) PAN_CAPFUOSTRSIM_ValidateRow(Cancel);
  }
  
  public void DynamicProperties(IDPanel SrcObj)
  {
    if (SrcObj == PAN_CAPFUOSTREFF) PAN_CAPFUOSTREFF_DynamicProperties();
    if (SrcObj == PAN_CAPFUOSTRSIM) PAN_CAPFUOSTRSIM_DynamicProperties();
  }
  
  public void CellActivated(IDPanel SrcObj, IDVariant ColIndex, IDVariant Cancel)
  {
    if (SrcObj == PAN_CAPFUOSTREFF) PAN_CAPFUOSTREFF_CellActivated(ColIndex, Cancel);
    if (SrcObj == PAN_CAPFUOSTRSIM) PAN_CAPFUOSTRSIM_CellActivated(ColIndex, Cancel);
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
    if (SrcObj == PAN_CAPFUOSTREFF) PAN_CAPFUOSTREFF_OnChangeStatus(OldStatus);
    if (SrcObj == PAN_CAPFUOSTRSIM) PAN_CAPFUOSTRSIM_OnChangeStatus(OldStatus);
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
    if (SrcObj == PAN_CAPFUOSTREFF) PAN_CAPFUOSTREFF_AfterCommit(RowUpdated, RowError);
    if (SrcObj == PAN_CAPFUOSTRSIM) PAN_CAPFUOSTRSIM_AfterCommit(RowUpdated, RowError);
  }  

  public void OnDBError(IDPanel SrcObj, IDVariant Cancel, IDVariant Skip, IDVariant ErrNum, IDVariant ErrMsg, IDVariant NativeErrNum, IDVariant PanOp, IDDocument Doc)
  {
    if (SrcObj == PAN_CAPFUOSTREFF) PAN_CAPFUOSTREFF_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
    if (SrcObj == PAN_CAPFUOSTRSIM) PAN_CAPFUOSTRSIM_OnDBError(Cancel, Skip, ErrNum, ErrMsg, NativeErrNum, PanOp, Doc);
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
